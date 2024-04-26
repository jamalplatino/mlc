package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.AndroidTextInputServicePlugin;
import androidx.compose.ui.text.input.PlatformTextInputAdapter;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.ui.text.input.TextInputForTests;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000È\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019*\u0002\u0001\b\u0001\u0018\u0000 \u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0003\u0003B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010í\u0001\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u00012\b\u0010ï\u0001\u001a\u00030 \u0001J\u0019\u0010\u001a\u001a\u00020+2\u000f\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030ò\u00010ñ\u0001H\u0016J\t\u0010ó\u0001\u001a\u00020RH\u0002J\u0013\u0010ô\u0001\u001a\u00020+H@ø\u0001\u0000¢\u0006\u0003\u0010õ\u0001J!\u0010ö\u0001\u001a\u00020k2\u0007\u0010÷\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ù\u0001J!\u0010ú\u0001\u001a\u00020k2\u0007\u0010û\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bü\u0001\u0010ù\u0001J\u0012\u0010ý\u0001\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u000201H\u0016J\u0012\u0010ÿ\u0001\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u000201H\u0016J\u0012\u0010\u0002\u001a\u00020+2\u0007\u0010\u0002\u001a\u00020\u0001H\u0002J\u001f\u0010\u0002\u001a\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010\u00022\u0007\u0010\u0002\u001a\u000201H\u0002J.\u0010\u0002\u001a\u00020;2\u0014\u0010\u0002\u001a\u000f\u0012\u0005\u0012\u00030\u0002\u0012\u0004\u0012\u00020+0)2\r\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020+0>H\u0016J\u0013\u0010\u0002\u001a\u00020+2\b\u0010\u0002\u001a\u00030\u0002H\u0014J\u0013\u0010\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0016J\u0013\u0010\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0016J\u0013\u0010\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0002H\u0016J\u0013\u0010\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0016J\u001b\u0010\u0002\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u00012\b\u0010\u0002\u001a\u00030\u0002J\u001f\u0010\u0002\u001a\u0005\u0018\u00010Ñ\u00012\u0007\u0010\u0002\u001a\u0002012\b\u0010\u0002\u001a\u00030Ñ\u0001H\u0002J\u0013\u0010\u0002\u001a\u0005\u0018\u00010Ñ\u00012\u0007\u0010\u0002\u001a\u000201J\u0013\u0010\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J%\u0010\u0002\u001a\u0005\u0018\u00010\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0002\u0010\u0002J\u0013\u0010\u0002\u001a\u00020+2\b\u0010 \u0002\u001a\u00030¡\u0002H\u0016J&\u0010¢\u0002\u001a\u00030£\u00022\b\u0010\u0002\u001a\u00030\u0001H\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¤\u0002\u0010¥\u0002J\u0013\u0010¦\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0002J\u001d\u0010§\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u00012\b\u0010¨\u0002\u001a\u00030\u0001H\u0002J\t\u0010©\u0002\u001a\u00020+H\u0016J\u0013\u0010ª\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0002J\u0013\u0010¬\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0002J\u0013\u0010­\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0002J\u0013\u0010®\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0002J\u0013\u0010¯\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0002J\u0013\u0010°\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0001H\u0002J!\u0010±\u0002\u001a\u00020k2\u0007\u0010û\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b²\u0002\u0010ù\u0001J,\u0010³\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\b\u0010´\u0002\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bµ\u0002\u0010¶\u0002J\u0012\u0010³\u0002\u001a\u00020+2\u0007\u0010·\u0002\u001a\u00020RH\u0016J\t\u0010¸\u0002\u001a\u00020+H\u0016J!\u0010¹\u0002\u001a\u00020+2\u0007\u0010º\u0002\u001a\u00020;2\u0007\u0010»\u0002\u001a\u00020RH\u0000¢\u0006\u0003\b¼\u0002J\u0013\u0010½\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0016J\t\u0010¾\u0002\u001a\u00020+H\u0014J\t\u0010¿\u0002\u001a\u00020RH\u0016J\u0012\u0010À\u0002\u001a\u00020+2\u0007\u0010Á\u0002\u001a\u00020*H\u0014J\u0016\u0010Â\u0002\u001a\u0005\u0018\u00010Ã\u00022\b\u0010Ä\u0002\u001a\u00030Å\u0002H\u0016J\u0013\u0010Æ\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0016J\t\u0010Ç\u0002\u001a\u00020+H\u0014J\u0013\u0010È\u0002\u001a\u00020+2\b\u0010\u0002\u001a\u00030\u0002H\u0014J\t\u0010É\u0002\u001a\u00020+H\u0016J'\u0010Ê\u0002\u001a\u00020+2\u0007\u0010Ë\u0002\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u0002012\n\u0010Ì\u0002\u001a\u0005\u0018\u00010¡\u0002H\u0014J6\u0010Í\u0002\u001a\u00020+2\u0007\u0010Î\u0002\u001a\u00020R2\u0007\u0010Ï\u0002\u001a\u0002012\u0007\u0010Ð\u0002\u001a\u0002012\u0007\u0010Ñ\u0002\u001a\u0002012\u0007\u0010Ò\u0002\u001a\u000201H\u0014J\u0013\u0010Ó\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J\u001b\u0010Ô\u0002\u001a\u00020+2\u0007\u0010Õ\u0002\u001a\u0002012\u0007\u0010Ö\u0002\u001a\u000201H\u0014J\u001e\u0010×\u0002\u001a\u00020+2\n\u0010Ø\u0002\u001a\u0005\u0018\u00010Ù\u00022\u0007\u0010Ú\u0002\u001a\u000201H\u0016J%\u0010Û\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\u0007\u0010Ü\u0002\u001a\u00020R2\u0007\u0010Ý\u0002\u001a\u00020RH\u0016J%\u0010Þ\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\u0007\u0010Ü\u0002\u001a\u00020R2\u0007\u0010Ý\u0002\u001a\u00020RH\u0016J\u0013\u0010ß\u0002\u001a\u00020+2\b\u0010à\u0002\u001a\u00030á\u0002H\u0016J\u0011\u0010â\u0002\u001a\u00020+2\u0006\u0010v\u001a\u000201H\u0016J\t\u0010ã\u0002\u001a\u00020+H\u0016J\u0012\u0010ä\u0002\u001a\u00020+2\u0007\u0010å\u0002\u001a\u00020RH\u0016J\t\u0010æ\u0002\u001a\u00020+H\u0002J\u0013\u0010æ\u0002\u001a\u00020+2\b\u0010\u0002\u001a\u00030\u0001H\u0002J\t\u0010ç\u0002\u001a\u00020+H\u0002J\u0018\u0010è\u0002\u001a\u00020R2\u0007\u0010º\u0002\u001a\u00020;H\u0000¢\u0006\u0003\bé\u0002J\u0018\u0010ê\u0002\u001a\u00020+2\r\u0010ë\u0002\u001a\b\u0012\u0004\u0012\u00020+0>H\u0016J\u0013\u0010ì\u0002\u001a\u00020+2\b\u0010ë\u0002\u001a\u00030í\u0002H\u0016J\u0011\u0010î\u0002\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u0001J\u0007\u0010ï\u0002\u001a\u00020+J\u0013\u0010ð\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J\u0017\u0010ñ\u0002\u001a\u00020+2\f\b\u0002\u0010ò\u0002\u001a\u0005\u0018\u00010 \u0001H\u0002J!\u0010ó\u0002\u001a\u00020k2\u0007\u0010ô\u0002\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0002\u0010ù\u0001J\"\u0010ö\u0002\u001a\u00020R2\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b÷\u0002\u0010ø\u0002J&\u0010ù\u0002\u001a\u00030£\u00022\b\u0010\u0002\u001a\u00030\u0001H\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bú\u0002\u0010¥\u0002J0\u0010û\u0002\u001a\u00020+2\b\u0010\u0002\u001a\u00030\u00012\u0007\u0010ü\u0002\u001a\u0002012\u0007\u0010ý\u0002\u001a\u00020m2\t\b\u0002\u0010þ\u0002\u001a\u00020RH\u0002J\u001d\u0010ÿ\u0002\u001a\u00020+2\u0014\u0010\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020+0)J\t\u0010\u0003\u001a\u00020RH\u0016J\t\u0010\u0003\u001a\u00020+H\u0002J\u000e\u0010\u0003\u001a\u00020R*\u00030 \u0001H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u000e¢\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0002032\u0006\u00102\u001a\u000203@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0010\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010>0=X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020@X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR+\u0010D\u001a\u00020C2\u0006\u00102\u001a\u00020C8V@RX\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010K\u001a\u00020L8\u0016X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010U\u001a\u00020VX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR\u0014\u0010X\u001a\u00020YX\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020R8VX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u000e\u0010_\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020a8VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u000e\u0010d\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\u00020R8VX\u0004¢\u0006\u0006\u001a\u0004\be\u0010^R\u000e\u0010f\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020hX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u0019\u0010j\u001a\u00020kX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR$\u0010l\u001a\u00020m8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bn\u0010N\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010s\u001a\b\u0012\u0004\u0012\u00020;0tX\u0004¢\u0006\u0002\n\u0000R+\u0010v\u001a\u00020u2\u0006\u00102\u001a\u00020u8V@RX\u0002¢\u0006\u0012\n\u0004\b{\u0010J\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u000e\u0010|\u001a\u00020}X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0001\u001a\u00020m8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010pR\u0018\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u001e\u0010\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020+\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020mX\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020+0>X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0005\n\u0003\u0010\u0001R\u0018\u0010\u0001\u001a\u00030 \u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010£\u0001\u001a\u00030¤\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001R\u000f\u0010§\u0001\u001a\u00020hX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010¨\u0001\u001a\u00030©\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010ª\u0001\u001a\u00030«\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010¬\u0001\u001a\u00030­\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010¯\u0001R\u0010\u0010°\u0001\u001a\u00030±\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010²\u0001\u001a\u00030³\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R%\u0010¶\u0001\u001a\u00020RX\u000e¢\u0006\u0018\n\u0000\u0012\u0005\b·\u0001\u0010N\u001a\u0005\b¸\u0001\u0010^\"\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010»\u0001\u001a\u00030¼\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010¾\u0001R\u000f\u0010¿\u0001\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010À\u0001\u001a\u0005\u0018\u00010Á\u00018VX\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ä\u0001\u001a\u00030Å\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010È\u0001\u001a\u00030É\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0010\u0010Ì\u0001\u001a\u00030Í\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Î\u0001\u001a\u00030Ï\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Ð\u0001\u001a\u00030Ñ\u00018VX\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ô\u0001\u001a\u00030Õ\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0012\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Ú\u0001\u001a\u00030Û\u0001X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010Ü\u0001R7\u0010Ý\u0001\u001a\u0005\u0018\u00010\u00012\t\u00102\u001a\u0005\u0018\u00010\u00018F@BX\u0002¢\u0006\u0017\n\u0005\bâ\u0001\u0010J\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u000f\u0010ã\u0001\u001a\u00020RX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010ä\u0001\u001a\u00030å\u00018VX\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010è\u0001\u001a\u00020kX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR\u001c\u0010é\u0001\u001a\u00030Û\u0001X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010Ü\u0001R\u001b\u0010ê\u0001\u001a\u000201*\u00020*8BX\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "accessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "currentFontWeightAdjustment", "", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "endApplyChangesListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "Landroidx/compose/runtime/MutableState;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "keyboardModifiersRequireUpdate", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "platformTextInputPluginRegistry", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "resendMotionEventOnLayout", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rotaryInputModifier", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "superclassInitComplete", "textInputForTests", "Landroidx/compose/ui/text/input/TextInputForTests;", "getTextInputForTests", "()Landroidx/compose/ui/text/input/TextInputForTests;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "viewTreeOwners", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "viewTreeOwners$delegate", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "convertMeasureSpec", "Lkotlin/Pair;", "measureSpec", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "invalidateParentLayer", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", "event", "dispatchHoverEvent", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "motionEvent", "drawAndroidView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "forceMeasureTheSubtree", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleRotaryEvent", "hasChangedDevices", "lastEvent", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "localToScreen", "localToScreen-MK-Hz9U", "measureAndLayout", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "measureAndLayoutForTest", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttach", "onAttachedToWindow", "onCheckIsTextEditor", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDetach", "onDetachedFromWindow", "onDraw", "onEndApplyChanges", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "onLayout", "changed", "l", "t", "r", "b", "onLayoutChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onProvideAutofillVirtualStructure", "structure", "Landroid/view/ViewStructure;", "flags", "onRequestMeasure", "affectsLookahead", "forceRequest", "onRequestRelayout", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onSemanticsChange", "onWindowFocusChanged", "hasWindowFocus", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "registerOnEndApplyChangesListener", "listener", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "removeAndroidView", "requestClearInvalidObservations", "requestOnPositionedCallback", "scheduleMeasureAndLayout", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "updatePositionCacheAndDispatch", "childSizeCanAffectParentSize", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;
    /* access modifiers changed from: private */
    public static Method getBooleanMethod;
    /* access modifiers changed from: private */
    public static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final InputModeManagerImpl _inputModeManager;
    private final WindowInfoImpl _windowInfo;
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    private int currentFontWeightAdjustment;
    private Density density;
    /* access modifiers changed from: private */
    public PointerIcon desiredPointerIcon;
    private final List<OwnedLayer> dirtyLayers;
    private final MutableVector<Function0<Unit>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition = Offset.Companion.m2587getUnspecifiedF1C5BW0();
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;
    private final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistry;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    /* access modifiers changed from: private */
    public MotionEvent previousMotionEvent;
    /* access modifiers changed from: private */
    public long relayoutTime;
    private final Function0<Unit> resendMotionEventOnLayout;
    /* access modifiers changed from: private */
    public final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final Modifier rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final SemanticsModifierCore semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope = new LayoutNodeDrawScope((CanvasDrawScope) null, 1, (DefaultConstructorMarker) null);
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete = true;
    private final TextInputService textInputService;
    private final TextToolbar textToolbar;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final MutableState viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    private final boolean autofillSupported() {
        return true;
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public Density getDensity() {
        return this.density;
    }

    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }

    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public LayoutNode getRoot() {
        return this.root;
    }

    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public void onAttach(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        CalculateMatrixToWindow calculateMatrixToWindow;
        Intrinsics.checkNotNullParameter(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(false, false, AndroidComposeView$semanticsModifier$1.INSTANCE, (Function1) null, 8, (DefaultConstructorMarker) null);
        this.semanticsModifier = semanticsModifierCore;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        this._windowInfo = new WindowInfoImpl();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AndroidComposeView$keyInputModifier$1(this));
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(Modifier.Companion, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(Modifier.Companion.then(semanticsModifierCore).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration2, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration2);
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.m3048constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
        this.windowToViewMatrix = Matrix.m3048constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
        this.lastMatrixRecalculationAnimationTime = -1;
        this.windowPosition = Offset.Companion.m2586getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.globalLayoutListener = new AndroidComposeView$$ExternalSyntheticLambda0(this);
        this.scrollChangedListener = new AndroidComposeView$$ExternalSyntheticLambda1(this);
        this.touchModeChangeListener = new AndroidComposeView$$ExternalSyntheticLambda2(this);
        this.platformTextInputPluginRegistry = new PlatformTextInputPluginRegistryImpl(new AndroidComposeView$platformTextInputPluginRegistry$1(this));
        this.textInputService = ((AndroidTextInputServicePlugin.Adapter) getPlatformTextInputPluginRegistry().getOrCreateAdapter(AndroidTextInputServicePlugin.INSTANCE).getAdapter()).getService();
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), (SnapshotMutationPolicy) null, 2, (Object) null);
        View view = this;
        this.hapticFeedBack = new PlatformHapticFeedback(view);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m3577getTouchaOaMEAU() : InputMode.Companion.m3576getKeyboardaOaMEAU(), new AndroidComposeView$_inputModeManager$1(this), (DefaultConstructorMarker) null);
        Owner owner = this;
        this.modifierLocalManager = new ModifierLocalManager(owner);
        this.textToolbar = new AndroidTextToolbar(view);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new Function0[16], 0);
        this.resendMotionEventRunnable = new AndroidComposeView$resendMotionEventRunnable$1(this);
        this.sendHoverExitEvent = new AndroidComposeView$$ExternalSyntheticLambda3(this);
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        if (Build.VERSION.SDK_INT >= 29) {
            calculateMatrixToWindow = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindow = new CalculateMatrixToWindowApi21();
        }
        this.matrixToWindow = calculateMatrixToWindow;
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(view, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(view, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(owner);
        if (Build.VERSION.SDK_INT >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(view);
        }
        this.pointerIconService = new AndroidComposeView$pointerIconService$1(this);
    }

    public View getView() {
        return this;
    }

    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    public Autofill getAutofill() {
        return this._autofill;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public static final void globalLayoutListener$lambda$1(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* access modifiers changed from: private */
    public static final void scrollChangedListener$lambda$2(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView androidComposeView, boolean z) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView._inputModeManager.m3582setInputModeiuPiT84(z ? InputMode.Companion.m3577getTouchaOaMEAU() : InputMode.Companion.m3576getKeyboardaOaMEAU());
    }

    public TextInputForTests getTextInputForTests() {
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.getInputForTests();
        }
        return null;
    }

    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    /* access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m4853sendMotionEvent8iAsVTc(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    public void getFocusedRect(Rect rect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rect, "rect");
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = MathKt.roundToInt(focusRect.getLeft());
            rect.top = MathKt.roundToInt(focusRect.getTop());
            rect.right = MathKt.roundToInt(focusRect.getRight());
            rect.bottom = MathKt.roundToInt(focusRect.getBottom());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d(FocusTag, "Owner FocusChanged(" + z + ')');
        if (z) {
            getFocusOwner().takeFocus();
        } else {
            getFocusOwner().releaseFocus();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        boolean access$getIsShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (access$getIsShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            setShowLayoutBounds(access$getIsShowingLayoutBounds);
            invalidateDescendants();
        }
    }

    /* renamed from: sendKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m4860sendKeyEventZmokQxo(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return getFocusOwner().m2515dispatchKeyEventZmokQxo(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this._windowInfo.m4952setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4387constructorimpl(keyEvent.getMetaState()));
        return m4860sendKeyEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m4165constructorimpl(keyEvent));
    }

    public void onDetach(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                Function0 function0 = (Function0) this.endApplyChangesListeners.getContent()[i];
                this.endApplyChangesListeners.set(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    public void registerOnEndApplyChangesListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "listener");
        if (!this.endApplyChangesListeners.contains(function0)) {
            this.endApplyChangesListeners.add(function0);
        }
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(androidViewHolder, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        View view = androidViewHolder;
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AndroidComposeView$addAndroidView$1(layoutNode, this, this));
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        Intrinsics.checkNotNullParameter(androidViewHolder, "view");
        registerOnEndApplyChangesListener(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        Intrinsics.checkNotNullParameter(androidViewHolder, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                    layoutNode = layoutNode.getParent$ui_release();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.getParent$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean childSizeCanAffectParentSize(androidx.compose.ui.node.LayoutNode r2) {
        /*
            r1 = this;
            boolean r0 = r1.wasMeasuredWithMultipleConstraints
            if (r0 != 0) goto L_0x0013
            androidx.compose.ui.node.LayoutNode r2 = r2.getParent$ui_release()
            if (r2 == 0) goto L_0x0011
            boolean r2 = r2.getHasFixedInnerContentConstraints$ui_release()
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.childSizeCanAffectParentSize(androidx.compose.ui.node.LayoutNode):boolean");
    }

    public void forceMeasureTheSubtree(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode);
    }

    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2)) {
                scheduleMeasureAndLayout(layoutNode);
            }
        } else if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z2)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
    }

    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, (Object) null);
    }

    private final Pair<Integer, Integer> convertMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return TuplesKt.to(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return TuplesKt.to(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return TuplesKt.to(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int r2 = IntOffset.m5736component1impl(j);
        int r0 = IntOffset.m5737component2impl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (!(r2 == i && r0 == iArr[1])) {
            this.globalPosition = IntOffsetKt.IntOffset(i, iArr[1]);
            if (!(r2 == Integer.MAX_VALUE || r0 == Integer.MAX_VALUE)) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public OwnedLayer createLayer(Function1<? super androidx.compose.ui.graphics.Canvas, Unit> function1, Function0<Unit> function0) {
        DrawChildContainer drawChildContainer;
        Intrinsics.checkNotNullParameter(function1, "drawBlock");
        Intrinsics.checkNotNullParameter(function0, "invalidateParentLayer");
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(function1, function0);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, function1, function0);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            if (!ViewLayer.Companion.getHasRetrievedMethod()) {
                ViewLayer.Companion.updateDisplayList(new View(getContext()));
            }
            if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                drawChildContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                drawChildContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, function1, function0);
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        Intrinsics.checkNotNullParameter(ownedLayer, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        return true;
    }

    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    public void onLayoutChange(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        Intrinsics.checkNotNullParameter(onLayoutCompletedListener, "listener");
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: getFocusDirection-P8AzH3I  reason: not valid java name */
    public FocusDirection m4856getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long r0 = KeyEvent_androidKt.m4181getKeyZmokQxo(keyEvent);
        if (Key.m3586equalsimpl0(r0, Key.Companion.m4109getTabEK5gGoQ())) {
            return FocusDirection.m2493boximpl(KeyEvent_androidKt.m4187isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m2511getPreviousdhqQ8s() : FocusDirection.Companion.m2509getNextdhqQ8s());
        } else if (Key.m3586equalsimpl0(r0, Key.Companion.m3950getDirectionRightEK5gGoQ())) {
            return FocusDirection.m2493boximpl(FocusDirection.Companion.m2512getRightdhqQ8s());
        } else {
            if (Key.m3586equalsimpl0(r0, Key.Companion.m3949getDirectionLeftEK5gGoQ())) {
                return FocusDirection.m2493boximpl(FocusDirection.Companion.m2508getLeftdhqQ8s());
            }
            if (Key.m3586equalsimpl0(r0, Key.Companion.m3951getDirectionUpEK5gGoQ())) {
                return FocusDirection.m2493boximpl(FocusDirection.Companion.m2513getUpdhqQ8s());
            }
            if (Key.m3586equalsimpl0(r0, Key.Companion.m3946getDirectionDownEK5gGoQ())) {
                return FocusDirection.m2493boximpl(FocusDirection.Companion.m2504getDowndhqQ8s());
            }
            if (Key.m3586equalsimpl0(r0, Key.Companion.m3945getDirectionCenterEK5gGoQ()) || Key.m3586equalsimpl0(r0, Key.Companion.m3959getEnterEK5gGoQ()) || Key.m3586equalsimpl0(r0, Key.Companion.m4051getNumPadEnterEK5gGoQ())) {
                return FocusDirection.m2493boximpl(FocusDirection.Companion.m2505getEnterdhqQ8s());
            }
            if (!Key.m3586equalsimpl0(r0, Key.Companion.m3888getBackEK5gGoQ()) && !Key.m3586equalsimpl0(r0, Key.Companion.m3962getEscapeEK5gGoQ())) {
                return null;
            }
            return FocusDirection.m2493boximpl(FocusDirection.Companion.m2506getExitdhqQ8s());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, (Object) null);
        this.isDrawingContent = true;
        CanvasHolder canvasHolder2 = this.canvasHolder;
        Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
        canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder2.getAndroidCanvas());
        canvasHolder2.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z) {
        Intrinsics.checkNotNullParameter(ownedLayer, "layer");
        if (!z) {
            if (!this.isDrawingContent) {
                this.dirtyLayers.remove(ownedLayer);
                List<OwnedLayer> list = this.postponedDirtyLayers;
                if (list != null) {
                    list.remove(ownedLayer);
                }
            }
        } else if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
        } else {
            List<OwnedLayer> list2 = this.postponedDirtyLayers;
            if (list2 == null) {
                list2 = new ArrayList<>();
                this.postponedDirtyLayers = list2;
            }
            list2.add(ownedLayer);
        }
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = function1;
        }
    }

    public final Object boundsUpdatesEventLoop(Continuation<? super Unit> continuation) {
        Object boundsUpdatesEventLoop = this.accessibilityDelegate.boundsUpdatesEventLoop(continuation);
        return boundsUpdatesEventLoop == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? boundsUpdatesEventLoop : Unit.INSTANCE;
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, (Object) null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                invalidateLayers((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        View view = this;
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(view);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(view);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(lifecycleOwner2 == null || savedStateRegistryOwner == null || (lifecycleOwner2 == viewTreeOwners.getLifecycleOwner() && savedStateRegistryOwner == viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (savedStateRegistryOwner != null) {
                if (!(viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null)) {
                    lifecycle.removeObserver(this);
                }
                lifecycleOwner2.getLifecycle().addObserver(this);
                ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
                setViewTreeOwners(viewTreeOwners2);
                Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
                if (function1 != null) {
                    function1.invoke(viewTreeOwners2);
                }
                this.onViewTreeOwnersAvailable = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        this._inputModeManager.m3582setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m3577getTouchaOaMEAU() : InputMode.Companion.m3576getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null)) {
            lifecycle.removeObserver(this);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AndroidAutofill androidAutofill;
        if (autofillSupported() && viewStructure != null && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(sparseArray, "values");
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return handleRotaryEvent(motionEvent);
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return ProcessResult.m4412getDispatchedToAPointerInputModifierimpl(m4852handleMotionEvent8iAsVTc(motionEvent));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int r4 = m4852handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m4411getAnyMovementConsumedimpl(r4)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m4412getDispatchedToAPointerInputModifierimpl(r4);
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration2, getContext()) * f, f * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration2, getContext()), motionEvent.getEventTime()));
    }

    /* renamed from: handleMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m4852handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.previousMotionEvent;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                if (isDevicePressEvent(motionEvent2)) {
                    this.pointerInputEventProcessor.processCancel();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z = false;
            }
            if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
            int r15 = m4853sendMotionEvent8iAsVTc(motionEvent);
            Trace.endSection();
            AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this, this.desiredPointerIcon);
            this.forceUseMatrixCache = false;
            return r15;
        } catch (Throwable th) {
            this.forceUseMatrixCache = false;
            throw th;
        }
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: sendMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m4853sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m4952setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4387constructorimpl(motionEvent.getMetaState()));
        }
        PositionCalculator positionCalculator = this;
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, positionCalculator);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            ListIterator<PointerInputEventData> listIterator = pointers.listIterator(pointers.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    pointerInputEventData = null;
                    break;
                }
                pointerInputEventData = listIterator.previous();
                if (pointerInputEventData.getDown()) {
                    break;
                }
            }
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m4338getPositionF1C5BW0();
            }
            int r0 = this.pointerInputEventProcessor.m4343processBIzXfog(convertToPointerInputEvent$ui_release, positionCalculator, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || ProcessResult.m4412getDispatchedToAPointerInputModifierimpl(r0)) {
                return r0;
            }
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return r0;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    /* access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        long j2;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (!(i3 == 9 || i3 == 10)) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i4 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i6 = 0; i6 < pointerCount; i6++) {
                pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
            }
            int i7 = 0;
            while (i7 < pointerCount) {
                int i8 = ((i4 < 0 || i7 < i4) ? 0 : 1) + i7;
                motionEvent2.getPointerProperties(i8, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                motionEvent2.getPointerCoords(i8, pointerCoords);
                long r11 = m4857localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = Offset.m2572getXimpl(r11);
                pointerCoords.y = Offset.m2573getYimpl(r11);
                i7++;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j2 = j;
            } else {
                j2 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j2, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i2, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            MotionEventAdapter motionEventAdapter2 = this.motionEventAdapter;
            Intrinsics.checkNotNullExpressionValue(obtain, NotificationCompat.CATEGORY_EVENT);
            PositionCalculator positionCalculator = this;
            PointerInputEvent convertToPointerInputEvent$ui_release = motionEventAdapter2.convertToPointerInputEvent$ui_release(obtain, positionCalculator);
            Intrinsics.checkNotNull(convertToPointerInputEvent$ui_release);
            this.pointerInputEventProcessor.m4343processBIzXfog(convertToPointerInputEvent$ui_release, positionCalculator, true);
            obtain.recycle();
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.accessibilityDelegate.m4864canScroll0AR0LA0$ui_release(false, i, this.lastDownPointerPosition);
    }

    public boolean canScrollVertically(int i) {
        return this.accessibilityDelegate.m4864canScroll0AR0LA0$ui_release(true, i, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* renamed from: localToScreen-MK-Hz9U  reason: not valid java name */
    public long m4857localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long r4 = Matrix.m3054mapMKHz9U(this.viewToWindowMatrix, j);
        return OffsetKt.Offset(Offset.m2572getXimpl(r4) + Offset.m2572getXimpl(this.windowPosition), Offset.m2573getYimpl(r4) + Offset.m2573getYimpl(this.windowPosition));
    }

    /* renamed from: screenToLocal-MK-Hz9U  reason: not valid java name */
    public long m4859screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m3054mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m2572getXimpl(j) - Offset.m2572getXimpl(this.windowPosition), Offset.m2573getYimpl(j) - Offset.m2573getYimpl(this.windowPosition)));
    }

    private final void recalculateWindowPosition() {
        if (!this.forceUseMatrixCache) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
                this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
                recalculateWindowViewTransforms();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.tmpPositionArray);
                int[] iArr = this.tmpPositionArray;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.tmpPositionArray;
                this.windowPosition = OffsetKt.Offset(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long r0 = Matrix.m3054mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m2572getXimpl(r0), motionEvent.getRawY() - Offset.m2573getYimpl(r0));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.m4869calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m4895invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    public boolean onCheckIsTextEditor() {
        return getPlatformTextInputPluginRegistry().getFocusedAdapter() != null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.createInputConnection(editorInfo);
        }
        return null;
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    public long m4854calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m3054mapMKHz9U(this.windowToViewMatrix, j);
    }

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    public long m4855calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m3054mapMKHz9U(this.viewToWindowMatrix, j);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            LayoutDirection access$layoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(i);
            setLayoutDirection(access$layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(access$layoutDirectionFromInt);
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN) && motionEvent.getToolType(0) == 1) {
            return this.accessibilityDelegate.dispatchHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m4412getDispatchedToAPointerInputModifierimpl(m4852handleMotionEvent8iAsVTc(motionEvent));
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    return Float.isInfinite(rawY) || Float.isNaN(rawY);
                }
            }
        }
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), (Object) Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
            View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, childAt);
            if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                return findViewByAccessibilityIdRootedAtCurrentView;
            }
        }
        return null;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (r0 = r0.getLifecycleOwner()).getLifecycle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLifecycleInResumedState() {
        /*
            r2 = this;
            androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners r0 = r2.getViewTreeOwners()
            if (r0 == 0) goto L_0x0017
            androidx.lifecycle.LifecycleOwner r0 = r0.getLifecycleOwner()
            if (r0 == 0) goto L_0x0017
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0017
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r0 != r1) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.isLifecycleInResumedState():boolean");
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "FocusTag", "", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeView.android.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class access$getSystemPropertiesClass$cp = AndroidComposeView.systemPropertiesClass;
                    if (access$getSystemPropertiesClass$cp != null) {
                        method = access$getSystemPropertiesClass$cp.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.getBooleanMethod = method;
                }
                Method access$getGetBooleanMethod$cp = AndroidComposeView.getBooleanMethod;
                if (access$getGetBooleanMethod$cp != null) {
                    obj = access$getGetBooleanMethod$cp.invoke((Object) null, new Object[]{"debug.layout", false});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeView.android.kt */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public ViewTreeOwners(LifecycleOwner lifecycleOwner2, SavedStateRegistryOwner savedStateRegistryOwner2) {
            Intrinsics.checkNotNullParameter(lifecycleOwner2, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner2, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner2;
            this.savedStateRegistryOwner = savedStateRegistryOwner2;
        }
    }

    private final void setViewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    public void measureAndLayout(boolean z) {
        Function0<Unit> function0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                function0 = this.resendMotionEventOnLayout;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            function0 = null;
        }
        if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        Trace.endSection();
    }

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    public void m4858measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m4723measureAndLayout0kLqBqw(layoutNode, j);
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, (Object) null);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        if (androidx.compose.ui.unit.Constraints.m5563equalsimpl0(r0.m5576unboximpl(), r3) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r0)
            boolean r0 = r2.isAttachedToWindow()     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0012
            androidx.compose.ui.node.LayoutNode r0 = r2.getRoot()     // Catch:{ all -> 0x00ac }
            r2.invalidateLayoutNodeMeasurement(r0)     // Catch:{ all -> 0x00ac }
        L_0x0012:
            kotlin.Pair r3 = r2.convertMeasureSpec(r3)     // Catch:{ all -> 0x00ac }
            java.lang.Object r0 = r3.component1()     // Catch:{ all -> 0x00ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x00ac }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.component2()     // Catch:{ all -> 0x00ac }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ all -> 0x00ac }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00ac }
            kotlin.Pair r4 = r2.convertMeasureSpec(r4)     // Catch:{ all -> 0x00ac }
            java.lang.Object r1 = r4.component1()     // Catch:{ all -> 0x00ac }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x00ac }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00ac }
            java.lang.Object r4 = r4.component2()     // Catch:{ all -> 0x00ac }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x00ac }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00ac }
            long r3 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r0, r3, r1, r4)     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.unit.Constraints r0 = r2.onMeasureConstraints     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0054
            androidx.compose.ui.unit.Constraints r0 = androidx.compose.ui.unit.Constraints.m5558boximpl(r3)     // Catch:{ all -> 0x00ac }
            r2.onMeasureConstraints = r0     // Catch:{ all -> 0x00ac }
            r0 = 0
            r2.wasMeasuredWithMultipleConstraints = r0     // Catch:{ all -> 0x00ac }
            goto L_0x0064
        L_0x0054:
            if (r0 != 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            long r0 = r0.m5576unboximpl()     // Catch:{ all -> 0x00ac }
            boolean r0 = androidx.compose.ui.unit.Constraints.m5563equalsimpl0(r0, r3)     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0064
        L_0x0061:
            r0 = 1
            r2.wasMeasuredWithMultipleConstraints = r0     // Catch:{ all -> 0x00ac }
        L_0x0064:
            androidx.compose.ui.node.MeasureAndLayoutDelegate r0 = r2.measureAndLayoutDelegate     // Catch:{ all -> 0x00ac }
            r0.m4724updateRootConstraintsBRTryo0(r3)     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.node.MeasureAndLayoutDelegate r3 = r2.measureAndLayoutDelegate     // Catch:{ all -> 0x00ac }
            r3.measureOnly()     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.node.LayoutNode r3 = r2.getRoot()     // Catch:{ all -> 0x00ac }
            int r3 = r3.getWidth()     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.node.LayoutNode r4 = r2.getRoot()     // Catch:{ all -> 0x00ac }
            int r4 = r4.getHeight()     // Catch:{ all -> 0x00ac }
            r2.setMeasuredDimension(r3, r4)     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.platform.AndroidViewsHandler r3 = r2._androidViewsHandler     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x00a6
            androidx.compose.ui.platform.AndroidViewsHandler r3 = r2.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.node.LayoutNode r4 = r2.getRoot()     // Catch:{ all -> 0x00ac }
            int r4 = r4.getWidth()     // Catch:{ all -> 0x00ac }
            r0 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)     // Catch:{ all -> 0x00ac }
            androidx.compose.ui.node.LayoutNode r1 = r2.getRoot()     // Catch:{ all -> 0x00ac }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x00ac }
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch:{ all -> 0x00ac }
            r3.measure(r4, r0)     // Catch:{ all -> 0x00ac }
        L_0x00a6:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00ac }
            android.os.Trace.endSection()
            return
        L_0x00ac:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }
}

package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Ù\u00012\u00020\u0001:\u000eÖ\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010]\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010cH\u0002J\u0011\u0010d\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010eJ-\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\t2\u0006\u0010i\u001a\u00020jH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ;\u0010f\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0m2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\t2\u0006\u0010i\u001a\u00020jH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\b\u0010p\u001a\u00020\u001bH\u0002J\u0010\u0010q\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\tH\u0002J\u001d\u0010r\u001a\u00020s2\u0006\u0010^\u001a\u00020\t2\u0006\u0010t\u001a\u00020\tH\u0001¢\u0006\u0002\buJ\u0012\u0010v\u001a\u0004\u0018\u00010`2\u0006\u0010^\u001a\u00020\tH\u0002J=\u0010w\u001a\u00020s2\u0006\u0010^\u001a\u00020\t2\b\u0010x\u001a\u0004\u0018\u00010\t2\b\u0010y\u001a\u0004\u0018\u00010\t2\b\u0010z\u001a\u0004\u0018\u00010\t2\b\u0010{\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010|J\u000e\u0010}\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020J\u0013\u0010\u0001\u001a\u00020?2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J!\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\tH\u0002J#\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0001¢\u0006\u0003\b\u0001J\u0011\u0010\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\tH\u0002J\u0013\u0010\u0001\u001a\u00020\u000b2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0012\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020UH\u0002J\u0018\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020UH\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u0001J$\u0010\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\t2\b\u0010b\u001a\u0004\u0018\u00010cH\u0002J$\u0010\u0001\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020\t2\u0007\u0010_\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0007J!\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\t2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020O0'H\u0002J\u0011\u0010 \u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\tH\u0002J&\u0010¡\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00010¢\u0001j\n\u0012\u0005\u0012\u00030\u0001`£\u00012\u0007\u0010¤\u0001\u001a\u00020\u000bH\u0002J\u0012\u0010¥\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J\u0011\u0010¦\u0001\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020sH\u0002J?\u0010§\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\t2\u0006\u0010t\u001a\u00020\t2\u000b\b\u0002\u0010¨\u0001\u001a\u0004\u0018\u00010\t2\u0011\b\u0002\u0010©\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010'H\u0002¢\u0006\u0003\u0010ª\u0001J&\u0010«\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\t2\u0007\u0010¨\u0001\u001a\u00020\t2\t\u0010­\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010®\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\tH\u0002J\u0012\u0010¯\u0001\u001a\u00020\u001b2\u0007\u0010°\u0001\u001a\u00020OH\u0002J$\u0010±\u0001\u001a\u00020\u001b2\u0013\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001eH\u0001¢\u0006\u0003\b³\u0001J\u001c\u0010´\u0001\u001a\u00020\u001b2\b\u0010µ\u0001\u001a\u00030\u00012\u0007\u0010¶\u0001\u001a\u00020FH\u0002J!\u0010·\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020U2\r\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\t0AH\u0002J.\u0010¹\u0001\u001a\u00020\u000b2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010º\u0001\u001a\u00020\t2\u0007\u0010»\u0001\u001a\u00020\t2\u0007\u0010¼\u0001\u001a\u00020\u000bH\u0002J\u001c\u0010½\u0001\u001a\u00020\u001b2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010_\u001a\u00030\u0001H\u0002J\u001c\u0010¾\u0001\u001a\u00020\u001b2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010_\u001a\u00030\u0001H\u0002J\t\u0010¿\u0001\u001a\u00020\u001bH\u0002JG\u0010À\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010$2\u0007\u0010¤\u0001\u001a\u00020\u000b2\u000e\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010$2\u001c\b\u0002\u0010Â\u0001\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010$0EH\u0002J)\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010$2\u0007\u0010¤\u0001\u001a\u00020\u000b2\u000e\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010$H\u0002J\"\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u00012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010È\u0001\u001a\u00030É\u0001H\u0002J.\u0010Ê\u0001\u001a\u00020\u000b2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010Ë\u0001\u001a\u00020\u000b2\u0007\u0010Ì\u0001\u001a\u00020\u000bH\u0002J3\u0010Í\u0001\u001a\u0005\u0018\u0001HÎ\u0001\"\t\b\u0000\u0010Î\u0001*\u00020\u00182\t\u0010{\u001a\u0005\u0018\u0001HÎ\u00012\t\b\u0001\u0010Ï\u0001\u001a\u00020\tH\u0002¢\u0006\u0003\u0010Ð\u0001J\u0011\u0010Ñ\u0001\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020\tH\u0002J\t\u0010Ò\u0001\u001a\u00020\u001bH\u0002J\u0011\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u0001*\u00030Õ\u0001H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00118\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R2\u0010#\u001a&\u0012\f\u0012\n &*\u0004\u0018\u00010%0% &*\u0012\u0012\f\u0012\n &*\u0004\u0018\u00010%0%\u0018\u00010'0$X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u00020)8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00105\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`7X\u000e¢\u0006\u0002\n\u0000R*\u00108\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`7X\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\u000b8@X\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\rR \u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u001e0\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0AX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R0\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020F0E8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0013\u001a\u0004\bH\u0010!\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020FX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010L\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010MR\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020O0$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u001b0SX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020U0AX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u00020W8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010\u0013\u001a\u0004\bY\u0010ZR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Ý\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "accessibilityCursorPosition", "", "accessibilityForceEnabledForTesting", "", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "()V", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "checkingForSemanticsChanges", "currentSemanticsNodes", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "currentSemanticsNodesInvalidated", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "idToBeforeMap", "isEnabled", "isEnabled$ui_release$annotations", "isEnabled$ui_release", "isTouchExplorationEnabled", "labelToActionId", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "paneDisplayed", "Landroidx/collection/ArraySet;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "previousSemanticsNodes", "", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "getPreviousSemanticsNodes$ui_release$annotations", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "(Ljava/util/Map;)V", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scrollObservationScopes", "Landroidx/compose/ui/platform/ScrollObservationScope;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendScrollEventIfNeededLambda", "Lkotlin/Function1;", "subtreeChangedLayoutNodes", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScroll", "vertical", "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "Landroid/view/accessibility/AccessibilityEvent;", "eventType", "createEvent$ui_release", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", "event", "Landroid/view/MotionEvent;", "getAccessibilityNodeProvider", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAccessibilitySelectionStart", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "semanticComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "layoutIsRtl", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendScrollEventIfNeeded", "scrollObservationScope", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "sendSemanticsStructureChangeEvents", "newNode", "oldNode", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setText", "setTraversalValues", "sortByGeometryGroupings", "parentListToSort", "containerChildrenMapping", "subtreeSortedByGeometryGrouping", "listToSort", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", "T", "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "getTextForTextField", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Api24Impl", "Api28Impl", "Api29Impl", "Companion", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    private final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    /* access modifiers changed from: private */
    public final Handler handler;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private HashMap<Integer, Integer> idToAfterMap;
    private HashMap<Integer, Integer> idToBeforeMap;
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet<Integer> paneDisplayed;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final List<ScrollObservationScope> scrollObservationScopes;
    /* access modifiers changed from: private */
    public final Runnable semanticsChangeChecker;
    private final Function1<ScrollObservationScope, Unit> sendScrollEventIfNeededLambda;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final AndroidComposeView view;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.focusedVirtualViewId == i;
    }

    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final AccessibilityManager getAccessibilityManager$ui_release() {
        return this.accessibilityManager;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view2) {
        Intrinsics.checkNotNullParameter(view2, "host");
        return this.nodeProvider;
    }

    public final AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener$ui_release() {
        return this.enabledStateListener;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener$ui_release() {
        return this.touchExplorationStateListener;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setPreviousSemanticsNodes$ui_release(Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "view");
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager2;
        this.enabledStateListener = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0(this);
        this.touchExplorationStateListener = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1(this);
        this.enabledServices = accessibilityManager2.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat<>();
        this.labelToActionId = new SparseArrayCompat<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>();
        this.boundsUpdateChannel = ChannelKt.Channel$default(-1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new ArraySet<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.getAccessibilityManager$ui_release().addAccessibilityStateChangeListener(this.this$0.getEnabledStateListener$ui_release());
                this.this$0.getAccessibilityManager$ui_release().addTouchExplorationStateChangeListener(this.this$0.getTouchExplorationStateListener$ui_release());
            }

            public void onViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.handler.removeCallbacks(this.this$0.semanticsChangeChecker);
                this.this$0.getAccessibilityManager$ui_release().removeAccessibilityStateChangeListener(this.this$0.getEnabledStateListener$ui_release());
                this.this$0.getAccessibilityManager$ui_release().removeTouchExplorationStateChangeListener(this.this$0.getTouchExplorationStateListener$ui_release());
            }
        });
        this.semanticsChangeChecker = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2(this);
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1(this);
    }

    /* access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> list;
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            list = CollectionsKt.emptyList();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = list;
    }

    /* access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.enabledServices;
            Intrinsics.checkNotNullExpressionValue(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isTouchExplorationEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(semanticsNode, "node");
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }
    }

    private final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            setTraversalValues();
        }
        return this.currentSemanticsNodes;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class SemanticsNodeCopy {
        private final Set<Integer> children = new LinkedHashSet();
        private final SemanticsNode semanticsNode;
        private final SemanticsConfiguration unmergedConfig;

        public final Set<Integer> getChildren() {
            return this.children;
        }

        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public SemanticsNodeCopy(SemanticsNode semanticsNode2, Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
            Intrinsics.checkNotNullParameter(semanticsNode2, "semanticsNode");
            Intrinsics.checkNotNullParameter(map, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode2;
            this.unmergedConfig = semanticsNode2.getUnmergedConfig$ui_release();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode3 = replacedChildren$ui_release.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode3.getId()));
                }
            }
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* renamed from: canScroll-0AR0LA0$ui_release  reason: not valid java name */
    public final boolean m4864canScroll0AR0LA0$ui_release(boolean z, int i, long j) {
        return m4865canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes().values(), z, i, j);
    }

    /* renamed from: canScroll-moWRBKg$ui_release  reason: not valid java name */
    public final boolean m4865canScrollmoWRBKg$ui_release(Collection<SemanticsNodeWithAdjustedBounds> collection, boolean z, int i, long j) {
        SemanticsPropertyKey semanticsPropertyKey;
        ScrollAxisRange scrollAxisRange;
        Intrinsics.checkNotNullParameter(collection, "currentSemanticsNodes");
        if (Offset.m2569equalsimpl0(j, Offset.Companion.m2587getUnspecifiedF1C5BW0()) || !Offset.m2575isValidimpl(j)) {
            return false;
        }
        if (z) {
            semanticsPropertyKey = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!z) {
            semanticsPropertyKey = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Iterable<SemanticsNodeWithAdjustedBounds> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : iterable) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m2598containsk4lQ0M(j) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), semanticsPropertyKey)) != null) {
                int i2 = scrollAxisRange.getReverseScrolling() ? -i : i;
                if ((i != 0 || !scrollAxisRange.getReverseScrolling()) && i2 >= 0) {
                    if (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue()) {
                    }
                } else if (scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.getLifecycleOwner()).getLifecycle();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo createNodeInfo(int r11) {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r10.view
            androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.LifecycleOwner r0 = r0.getLifecycleOwner()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            java.lang.String r2 = "obtain()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Map r2 = r10.getCurrentSemanticsNodes()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            if (r2 != 0) goto L_0x003a
            return r1
        L_0x003a:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.getSemanticsNode()
            r4 = -1
            if (r11 != r4) goto L_0x0054
            androidx.compose.ui.platform.AndroidComposeView r4 = r10.view
            android.view.View r4 = (android.view.View) r4
            android.view.ViewParent r4 = androidx.core.view.ViewCompat.getParentForAccessibility(r4)
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0050
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0050:
            r0.setParent(r1)
            goto L_0x007e
        L_0x0054:
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.getParent()
            if (r1 == 0) goto L_0x00e5
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.getParent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.getId()
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.view
            androidx.compose.ui.semantics.SemanticsOwner r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.getUnmergedRootSemanticsNode()
            int r5 = r5.getId()
            if (r1 != r5) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r4 = r1
        L_0x0077:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.view
            android.view.View r1 = (android.view.View) r1
            r0.setParent(r1, r4)
        L_0x007e:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.view
            android.view.View r1 = (android.view.View) r1
            r0.setSource(r1, r11)
            android.graphics.Rect r1 = r2.getAdjustedBounds()
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.view
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            long r4 = androidx.compose.ui.geometry.OffsetKt.Offset(r4, r5)
            long r4 = r2.m4857localToScreenMKHz9U(r4)
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.view
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            long r6 = androidx.compose.ui.geometry.OffsetKt.Offset(r6, r1)
            long r1 = r2.m4857localToScreenMKHz9U(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r4)
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            float r4 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = androidx.compose.ui.geometry.Offset.m2572getXimpl(r1)
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r5 = (float) r8
            int r5 = (int) r5
            float r1 = androidx.compose.ui.geometry.Offset.m2573getYimpl(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r6.<init>(r7, r4, r5, r1)
            r0.setBoundsInScreen(r6)
            r10.populateAccessibilityNodeInfoProperties(r11, r0, r3)
            android.view.accessibility.AccessibilityNodeInfo r11 = r0.unwrap()
            return r11
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "semanticsNode "
            r1.<init>(r2)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.String r1 = " has null parent"
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.createNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z) {
        Comparator compareBy = ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$2.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$4.INSTANCE});
        if (z) {
            compareBy = ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$2.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$3.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$4.INSTANCE});
        }
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2<>(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(compareBy, LayoutNode.Companion.getZComparator$ui_release()));
    }

    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, List list, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, list, map);
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean z, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map) {
        List arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = list.get(i);
                if (i == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.INSTANCE}));
        List<SemanticsNode> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            CollectionsKt.sortWith((List) pair.getSecond(), semanticComparator(z));
            List list2 = (List) pair.getSecond();
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) list2.get(i3);
                List list3 = map.get(Integer.valueOf(semanticsNode2.getId()));
                if (list3 == null) {
                    list3 = CollectionsKt.mutableListOf(semanticsNode2);
                }
                arrayList2.addAll(list3);
            }
        }
        return arrayList2;
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(List<Pair<Rect, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> rangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                Rect rect = (Rect) list.get(i).getFirst();
                if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(rect.getTop(), rect.getBottom()), rangeUntil)) {
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                } else {
                    list.set(i, new Pair(rect.intersect(new Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), list.get(i).getSecond()));
                    ((List) list.get(i).getSecond()).add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z, List<SemanticsNode> list) {
        Map linkedHashMap = new LinkedHashMap();
        List arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(arrayList, linkedHashMap, this, z, list.get(i));
        }
        return sortByGeometryGroupings(z, arrayList, linkedHashMap);
    }

    private static final void subtreeSortedByGeometryGrouping$depthFirstSearch(List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, SemanticsNode semanticsNode) {
        list.add(semanticsNode);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.getSemanticsNodeIsStructurallySignificant(semanticsNode)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.subtreeSortedByGeometryGrouping(z, CollectionsKt.toMutableList(semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(list, map, androidComposeViewAccessibilityDelegateCompat, z, children.get(i));
        }
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), CollectionsKt.toMutableList(semanticsNode.getChildren()));
        int lastIndex = CollectionsKt.getLastIndex(subtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
                int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
                this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
                this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
                if (i != lastIndex) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void populateAccessibilityNodeInfoProperties(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        Map map;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        float f;
        int i2;
        CharSequence charSequence;
        String str;
        int i3 = i;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        SemanticsNode semanticsNode2 = semanticsNode;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat2, "info");
        Intrinsics.checkNotNullParameter(semanticsNode2, "semanticsNode");
        int i4 = 0;
        boolean z = !semanticsNode.isFake$ui_release() && semanticsNode.getReplacedChildren$ui_release().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1.INSTANCE) == null;
        accessibilityNodeInfoCompat2.setClassName(ClassName);
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            int r9 = role.m4969unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                if (Role.m4966equalsimpl0(role.m4969unboximpl(), Role.Companion.m4976getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat2.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else {
                    if (Role.m4966equalsimpl0(role.m4969unboximpl(), Role.Companion.m4975getSwitcho7Vup1c())) {
                        accessibilityNodeInfoCompat2.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        if (Role.m4966equalsimpl0(r9, Role.Companion.m4970getButtono7Vup1c())) {
                            str = "android.widget.Button";
                        } else if (Role.m4966equalsimpl0(r9, Role.Companion.m4971getCheckboxo7Vup1c())) {
                            str = "android.widget.CheckBox";
                        } else if (Role.m4966equalsimpl0(r9, Role.Companion.m4974getRadioButtono7Vup1c())) {
                            str = "android.widget.RadioButton";
                        } else if (Role.m4966equalsimpl0(r9, Role.Companion.m4973getImageo7Vup1c())) {
                            str = "android.widget.ImageView";
                        } else {
                            str = Role.m4966equalsimpl0(r9, Role.Companion.m4972getDropdownListo7Vup1c()) ? "android.widget.Spinner" : null;
                        }
                        if (!Role.m4966equalsimpl0(role.m4969unboximpl(), Role.Companion.m4973getImageo7Vup1c()) || z || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                            accessibilityNodeInfoCompat2.setClassName(str);
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
            accessibilityNodeInfoCompat2.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getText())) {
            accessibilityNodeInfoCompat2.setClassName(TextClassName);
        }
        accessibilityNodeInfoCompat2.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfoCompat2.setImportantForAccessibility(true);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release.get(i5);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode3.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    accessibilityNodeInfoCompat2.addChild(androidViewHolder);
                } else {
                    accessibilityNodeInfoCompat2.addChild(this.view, semanticsNode3.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == i3) {
            accessibilityNodeInfoCompat2.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat2.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode2, accessibilityNodeInfoCompat2);
        setContentInvalid(semanticsNode2, accessibilityNodeInfoCompat2);
        accessibilityNodeInfoCompat2.setStateDescription((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getStateDescription()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        int i6 = 2;
        if (toggleableState != null) {
            accessibilityNodeInfoCompat2.setCheckable(true);
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 == 1) {
                accessibilityNodeInfoCompat2.setChecked(true);
                int r92 = Role.Companion.m4975getSwitcho7Vup1c();
                if (role != null && Role.m4966equalsimpl0(role.m4969unboximpl(), r92) && accessibilityNodeInfoCompat.getStateDescription() == null) {
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(R.string.on));
                }
            } else if (i7 == 2) {
                accessibilityNodeInfoCompat2.setChecked(false);
                int r93 = Role.Companion.m4975getSwitcho7Vup1c();
                if (role != null && Role.m4966equalsimpl0(role.m4969unboximpl(), r93) && accessibilityNodeInfoCompat.getStateDescription() == null) {
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(R.string.off));
                }
            } else if (i7 == 3 && accessibilityNodeInfoCompat.getStateDescription() == null) {
                accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(R.string.indeterminate));
            }
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int r11 = Role.Companion.m4976getTabo7Vup1c();
            if (role != null && Role.m4966equalsimpl0(role.m4969unboximpl(), r11)) {
                accessibilityNodeInfoCompat2.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat2.setCheckable(true);
                accessibilityNodeInfoCompat2.setChecked(booleanValue);
                if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                    if (booleanValue) {
                        charSequence = this.view.getContext().getResources().getString(R.string.selected);
                    } else {
                        charSequence = this.view.getContext().getResources().getString(R.string.not_selected);
                    }
                    accessibilityNodeInfoCompat2.setStateDescription(charSequence);
                }
            }
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
            accessibilityNodeInfoCompat2.setContentDescription(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
        if (str2 != null) {
            SemanticsNode semanticsNode4 = semanticsNode2;
            while (true) {
                if (semanticsNode4 == null) {
                    break;
                } else if (!semanticsNode4.getUnmergedConfig$ui_release().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                    semanticsNode4 = semanticsNode4.getParent();
                } else if (((Boolean) semanticsNode4.getUnmergedConfig$ui_release().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue()) {
                    accessibilityNodeInfoCompat2.setViewIdResourceName(str2);
                }
            }
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            accessibilityNodeInfoCompat2.setHeading(true);
            Unit unit7 = Unit.INSTANCE;
            Unit unit8 = Unit.INSTANCE;
        }
        accessibilityNodeInfoCompat2.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode));
        accessibilityNodeInfoCompat2.setEditable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode));
        accessibilityNodeInfoCompat2.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode));
        accessibilityNodeInfoCompat2.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getFocused()));
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat2.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat2.addAction(2);
            } else {
                accessibilityNodeInfoCompat2.addAction(1);
            }
        }
        accessibilityNodeInfoCompat2.setVisibleToUser(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int r7 = liveRegionMode.m4960unboximpl();
            if (LiveRegionMode.m4957equalsimpl0(r7, LiveRegionMode.Companion.m4962getPolite0phEisY()) || !LiveRegionMode.m4957equalsimpl0(r7, LiveRegionMode.Companion.m4961getAssertive0phEisY())) {
                i6 = 1;
            }
            accessibilityNodeInfoCompat2.setLiveRegion(i6);
            Unit unit9 = Unit.INSTANCE;
            Unit unit10 = Unit.INSTANCE;
        }
        accessibilityNodeInfoCompat2.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected()), (Object) true);
            accessibilityNodeInfoCompat2.setClickable(!areEqual);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) && !areEqual) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit11 = Unit.INSTANCE;
            Unit unit12 = Unit.INSTANCE;
        }
        accessibilityNodeInfoCompat2.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat2.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit13 = Unit.INSTANCE;
            Unit unit14 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit15 = Unit.INSTANCE;
            Unit unit16 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit17 = Unit.INSTANCE;
                Unit unit18 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction5.getLabel()));
                Unit unit19 = Unit.INSTANCE;
                Unit unit20 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction6 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction6.getLabel()));
                }
                Unit unit21 = Unit.INSTANCE;
                Unit unit22 = Unit.INSTANCE;
            }
        }
        CharSequence iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode2);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfoCompat2.setTextSelection(getAccessibilitySelectionStart(semanticsNode2), getAccessibilitySelectionEnd(semanticsNode2));
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetSelection());
            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction7 != null ? accessibilityAction7.getLabel() : null));
            accessibilityNodeInfoCompat2.addAction(256);
            accessibilityNodeInfoCompat2.addAction(512);
            accessibilityNodeInfoCompat2.setMovementGranularities(11);
            Collection collection = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
            if ((collection == null || collection.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode)) {
                accessibilityNodeInfoCompat2.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 20);
            }
        }
        List arrayList = new ArrayList();
        CharSequence text = accessibilityNodeInfoCompat.getText();
        if (!(text == null || text.length() == 0 || !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()))) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag())) {
            arrayList.add(ExtraDataTestTagKey);
        }
        if (!arrayList.isEmpty()) {
            AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
            AccessibilityNodeInfo unwrap = accessibilityNodeInfoCompat.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap, "info.unwrap()");
            accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(unwrap, arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat2.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat2.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
                if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    if (range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f) {
                        f = 0.0f;
                    } else {
                        f = (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    }
                    float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        i2 = 0;
                    } else {
                        i2 = 100;
                        if (coerceIn != 1.0f) {
                            i2 = RangesKt.coerceIn(MathKt.roundToInt(coerceIn * ((float) 100)), 1, 99);
                        }
                    }
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(R.string.template_percent, new Object[]{Integer.valueOf(i2)}));
                }
            } else if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(R.string.in_progress));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfoKt.setCollectionInfo(semanticsNode2, accessibilityNodeInfoCompat2);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode2, accessibilityNodeInfoCompat2);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
        if (!(scrollAxisRange == null || accessibilityAction8 == null)) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat2.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat2.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (!(scrollAxisRange2 == null || accessibilityAction8 == null)) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat2.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction9 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction9.getLabel()));
                Unit unit23 = Unit.INSTANCE;
                Unit unit24 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction10.getLabel()));
                Unit unit25 = Unit.INSTANCE;
                Unit unit26 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction11.getLabel()));
                Unit unit27 = Unit.INSTANCE;
                Unit unit28 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 < iArr.length) {
                    SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
                    Map linkedHashMap = new LinkedHashMap();
                    if (this.labelToActionId.containsKey(i3)) {
                        Map map2 = this.labelToActionId.get(i3);
                        List<Integer> mutableList = ArraysKt.toMutableList(iArr);
                        List arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        while (i4 < size3) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i4);
                            Intrinsics.checkNotNull(map2);
                            if (map2.containsKey(customAccessibilityAction.getLabel())) {
                                Integer num = (Integer) map2.get(customAccessibilityAction.getLabel());
                                Intrinsics.checkNotNull(num);
                                map = map2;
                                sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                                linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                                mutableList.remove(num);
                                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                            } else {
                                map = map2;
                                arrayList2.add(customAccessibilityAction);
                            }
                            i4++;
                            SemanticsNode semanticsNode5 = semanticsNode;
                            map2 = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i8);
                            int intValue = mutableList.get(i8).intValue();
                            sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i9);
                            int i10 = AccessibilityActionsResourceIds[i9];
                            sparseArrayCompat.put(i10, customAccessibilityAction3.getLabel());
                            linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i10));
                            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i10, customAccessibilityAction3.getLabel()));
                        }
                    }
                    this.actionIdToLabel.put(i3, sparseArrayCompat);
                    this.labelToActionId.put(i3, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        accessibilityNodeInfoCompat2.setScreenReaderFocusable(semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (z && (accessibilityNodeInfoCompat.getContentDescription() != null || accessibilityNodeInfoCompat.getText() != null || accessibilityNodeInfoCompat.getHintText() != null || accessibilityNodeInfoCompat.getStateDescription() != null || accessibilityNodeInfoCompat.isCheckable())));
        if (this.idToBeforeMap.get(Integer.valueOf(i)) != null) {
            Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfoCompat2.setTraversalBefore(this.view, num2.intValue());
                Unit unit29 = Unit.INSTANCE;
                Unit unit30 = Unit.INSTANCE;
            }
            AccessibilityNodeInfo unwrap2 = accessibilityNodeInfoCompat.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap2, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i3, unwrap2, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL, (Bundle) null);
        }
        if (this.idToAfterMap.get(Integer.valueOf(i)) != null) {
            Integer num3 = this.idToAfterMap.get(Integer.valueOf(i));
            if (num3 != null) {
                accessibilityNodeInfoCompat2.setTraversalAfter(this.view, num3.intValue());
                Unit unit31 = Unit.INSTANCE;
                Unit unit32 = Unit.INSTANCE;
            }
            AccessibilityNodeInfo unwrap3 = accessibilityNodeInfoCompat.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap3, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i3, unwrap3, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL, (Bundle) null);
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver) : null, ParcelSafeTextLength);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (!(list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null)) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver);
        }
        accessibilityNodeInfoCompat.setText(spannableString2 != null ? spannableString2 : (SpannableString) trimToSize(spannableString, ParcelSafeTextLength));
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.focusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.focusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, i2);
        if (num != null) {
            createEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        return sendEvent(createEvent$ui_release);
    }

    /* access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        return this.view.getParent().requestSendAccessibilityEvent(this.view, accessibilityEvent);
    }

    public final AccessibilityEvent createEvent$ui_release(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null) {
            obtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode()));
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, 8192);
        if (num != null) {
            createEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent$ui_release.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent$ui_release.getText().add(charSequence);
        }
        return createEvent$ui_release;
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performActionHelper(int r13, int r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.util.Map r0 = r12.getCurrentSemanticsNodes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r0 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r0
            r1 = 0
            if (r0 == 0) goto L_0x05fb
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getSemanticsNode()
            if (r0 != 0) goto L_0x0019
            goto L_0x05fb
        L_0x0019:
            r2 = 64
            if (r14 == r2) goto L_0x05f6
            r2 = 128(0x80, float:1.794E-43)
            if (r14 == r2) goto L_0x05f1
            r2 = 256(0x100, float:3.59E-43)
            r3 = 1
            if (r14 == r2) goto L_0x05da
            r4 = 512(0x200, float:7.175E-43)
            if (r14 == r4) goto L_0x05da
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r14 == r2) goto L_0x05b5
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r14 == r2) goto L_0x0589
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(r0)
            if (r2 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r14 == r3) goto L_0x0564
            r2 = 2
            r4 = 0
            if (r14 == r2) goto L_0x053f
            switch(r14) {
                case 16: goto L_0x050c;
                case 32: goto L_0x04e7;
                case 4096: goto L_0x034f;
                case 8192: goto L_0x034f;
                case 32768: goto L_0x032a;
                case 65536: goto L_0x0305;
                case 262144: goto L_0x02e0;
                case 524288: goto L_0x02bb;
                case 1048576: goto L_0x0296;
                case 2097152: goto L_0x025a;
                case 16908342: goto L_0x0164;
                case 16908349: goto L_0x012c;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r14) {
                case 16908344: goto L_0x034f;
                case 16908345: goto L_0x034f;
                case 16908346: goto L_0x034f;
                case 16908347: goto L_0x034f;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r14) {
                case 16908358: goto L_0x0107;
                case 16908359: goto L_0x00e2;
                case 16908360: goto L_0x00bd;
                case 16908361: goto L_0x0098;
                default: goto L_0x0048;
            }
        L_0x0048:
            androidx.collection.SparseArrayCompat<androidx.collection.SparseArrayCompat<java.lang.CharSequence>> r15 = r12.actionIdToLabel
            java.lang.Object r13 = r15.get(r13)
            androidx.collection.SparseArrayCompat r13 = (androidx.collection.SparseArrayCompat) r13
            if (r13 == 0) goto L_0x0097
            java.lang.Object r13 = r13.get(r14)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 != 0) goto L_0x005b
            goto L_0x0097
        L_0x005b:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getCustomActions()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x006e
            return r1
        L_0x006e:
            int r15 = r14.size()
            r0 = r1
        L_0x0073:
            if (r0 >= r15) goto L_0x0097
            java.lang.Object r2 = r14.get(r0)
            androidx.compose.ui.semantics.CustomAccessibilityAction r2 = (androidx.compose.ui.semantics.CustomAccessibilityAction) r2
            java.lang.String r3 = r2.getLabel()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r13)
            if (r3 == 0) goto L_0x0094
            kotlin.jvm.functions.Function0 r13 = r2.getAction()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0094:
            int r0 = r0 + 1
            goto L_0x0073
        L_0x0097:
            return r1
        L_0x0098:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageRight()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x00bc
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x00bc
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00bc:
            return r1
        L_0x00bd:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageLeft()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x00e1
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00e1:
            return r1
        L_0x00e2:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageDown()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0106
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0106:
            return r1
        L_0x0107:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageUp()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x012b
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x012b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x012b:
            return r1
        L_0x012c:
            if (r15 == 0) goto L_0x0163
            java.lang.String r13 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r14 = r15.containsKey(r13)
            if (r14 != 0) goto L_0x0137
            goto L_0x0163
        L_0x0137:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getSetProgress()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r0)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.ui.semantics.AccessibilityAction) r14
            if (r14 == 0) goto L_0x0163
            kotlin.Function r14 = r14.getAction()
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            if (r14 == 0) goto L_0x0163
            float r13 = r15.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0163:
            return r1
        L_0x0164:
            androidx.compose.ui.semantics.SemanticsNode r13 = r0.getParent()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r13.getConfig()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getScrollBy()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.ui.semantics.AccessibilityAction) r14
            goto L_0x017e
        L_0x017d:
            r14 = r4
        L_0x017e:
            if (r13 == 0) goto L_0x019c
            if (r14 == 0) goto L_0x0183
            goto L_0x019c
        L_0x0183:
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.getParent()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r13.getConfig()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getScrollBy()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.ui.semantics.AccessibilityAction) r14
            goto L_0x017e
        L_0x019c:
            if (r13 != 0) goto L_0x019f
            return r1
        L_0x019f:
            androidx.compose.ui.layout.LayoutInfo r15 = r13.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r15 = r15.getCoordinates()
            androidx.compose.ui.geometry.Rect r15 = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(r15)
            androidx.compose.ui.layout.LayoutInfo r2 = r13.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getCoordinates()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getParentLayoutCoordinates()
            if (r2 == 0) goto L_0x01be
            long r4 = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(r2)
            goto L_0x01c4
        L_0x01be:
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r2.m2588getZeroF1C5BW0()
        L_0x01c4:
            androidx.compose.ui.geometry.Rect r15 = r15.m2609translatek4lQ0M(r4)
            long r4 = r0.m4978getPositionInRootF1C5BW0()
            long r6 = r0.m4980getSizeYbymL2g()
            long r6 = androidx.compose.ui.unit.IntSizeKt.m5796toSizeozmzZPI(r6)
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.geometry.RectKt.m2612Recttz77jQw(r4, r6)
            androidx.compose.ui.semantics.SemanticsConfiguration r4 = r13.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getHorizontalScrollAxisRange()
            java.lang.Object r4 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r4, r5)
            androidx.compose.ui.semantics.ScrollAxisRange r4 = (androidx.compose.ui.semantics.ScrollAxisRange) r4
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r13.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getVerticalScrollAxisRange()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r5)
            androidx.compose.ui.semantics.ScrollAxisRange r13 = (androidx.compose.ui.semantics.ScrollAxisRange) r13
            float r5 = r2.getLeft()
            float r6 = r15.getLeft()
            float r5 = r5 - r6
            float r6 = r2.getRight()
            float r7 = r15.getRight()
            float r6 = r6 - r7
            float r5 = performActionHelper$scrollDelta(r5, r6)
            if (r4 == 0) goto L_0x0217
            boolean r4 = r4.getReverseScrolling()
            if (r4 != r3) goto L_0x0217
            float r5 = -r5
        L_0x0217:
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(r0)
            if (r0 == 0) goto L_0x021e
            float r5 = -r5
        L_0x021e:
            float r0 = r2.getTop()
            float r4 = r15.getTop()
            float r0 = r0 - r4
            float r2 = r2.getBottom()
            float r15 = r15.getBottom()
            float r2 = r2 - r15
            float r15 = performActionHelper$scrollDelta(r0, r2)
            if (r13 == 0) goto L_0x023d
            boolean r13 = r13.getReverseScrolling()
            if (r13 != r3) goto L_0x023d
            float r15 = -r15
        L_0x023d:
            if (r14 == 0) goto L_0x0259
            kotlin.Function r13 = r14.getAction()
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            if (r13 == 0) goto L_0x0259
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0259:
            return r1
        L_0x025a:
            if (r15 == 0) goto L_0x0262
            java.lang.String r13 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r15.getString(r13)
        L_0x0262:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getSetText()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0295
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            if (r13 == 0) goto L_0x0295
            androidx.compose.ui.text.AnnotatedString r14 = new androidx.compose.ui.text.AnnotatedString
            if (r4 != 0) goto L_0x0282
            java.lang.String r4 = ""
        L_0x0282:
            r6 = r4
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0295:
            return r1
        L_0x0296:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getDismiss()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x02ba
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x02ba
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02ba:
            return r1
        L_0x02bb:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCollapse()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x02df
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x02df
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02df:
            return r1
        L_0x02e0:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getExpand()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0304
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x0304
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0304:
            return r1
        L_0x0305:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCutText()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0329
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x0329
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0329:
            return r1
        L_0x032a:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPasteText()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x034e
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x034e
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x034e:
            return r1
        L_0x034f:
            r13 = 4096(0x1000, float:5.74E-42)
            if (r14 != r13) goto L_0x0355
            r13 = r3
            goto L_0x0356
        L_0x0355:
            r13 = r1
        L_0x0356:
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r14 != r15) goto L_0x035c
            r15 = r3
            goto L_0x035d
        L_0x035c:
            r15 = r1
        L_0x035d:
            r2 = 16908345(0x1020039, float:2.387739E-38)
            if (r14 != r2) goto L_0x0364
            r2 = r3
            goto L_0x0365
        L_0x0364:
            r2 = r1
        L_0x0365:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r14 != r4) goto L_0x036c
            r4 = r3
            goto L_0x036d
        L_0x036c:
            r4 = r1
        L_0x036d:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r14 != r5) goto L_0x0374
            r5 = r3
            goto L_0x0375
        L_0x0374:
            r5 = r1
        L_0x0375:
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r14 != r6) goto L_0x037c
            r14 = r3
            goto L_0x037d
        L_0x037c:
            r14 = r1
        L_0x037d:
            if (r2 != 0) goto L_0x0388
            if (r4 != 0) goto L_0x0388
            if (r13 != 0) goto L_0x0388
            if (r15 == 0) goto L_0x0386
            goto L_0x0388
        L_0x0386:
            r6 = r1
            goto L_0x0389
        L_0x0388:
            r6 = r3
        L_0x0389:
            if (r5 != 0) goto L_0x0394
            if (r14 != 0) goto L_0x0394
            if (r13 != 0) goto L_0x0394
            if (r15 == 0) goto L_0x0392
            goto L_0x0394
        L_0x0392:
            r14 = r1
            goto L_0x0395
        L_0x0394:
            r14 = r3
        L_0x0395:
            if (r13 != 0) goto L_0x0399
            if (r15 == 0) goto L_0x042e
        L_0x0399:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getProgressBarRangeInfo()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r7)
            androidx.compose.ui.semantics.ProgressBarRangeInfo r13 = (androidx.compose.ui.semantics.ProgressBarRangeInfo) r13
            androidx.compose.ui.semantics.SemanticsConfiguration r7 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r8 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r8.getSetProgress()
            java.lang.Object r7 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r7, r8)
            androidx.compose.ui.semantics.AccessibilityAction r7 = (androidx.compose.ui.semantics.AccessibilityAction) r7
            if (r13 == 0) goto L_0x042e
            if (r7 == 0) goto L_0x042e
            kotlin.ranges.ClosedFloatingPointRange r14 = r13.getRange()
            java.lang.Comparable r14 = r14.getEndInclusive()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r0 = r13.getRange()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r14 = kotlin.ranges.RangesKt.coerceAtLeast((float) r14, (float) r0)
            kotlin.ranges.ClosedFloatingPointRange r0 = r13.getRange()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r2 = r13.getRange()
            java.lang.Comparable r2 = r2.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = kotlin.ranges.RangesKt.coerceAtMost((float) r0, (float) r2)
            int r2 = r13.getSteps()
            if (r2 <= 0) goto L_0x040a
            float r14 = r14 - r0
            int r0 = r13.getSteps()
            int r0 = r0 + r3
            goto L_0x040d
        L_0x040a:
            float r14 = r14 - r0
            r0 = 20
        L_0x040d:
            float r0 = (float) r0
            float r14 = r14 / r0
            if (r15 == 0) goto L_0x0412
            float r14 = -r14
        L_0x0412:
            kotlin.Function r15 = r7.getAction()
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            if (r15 == 0) goto L_0x042d
            float r13 = r13.getCurrent()
            float r13 = r13 + r14
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x042d:
            return r1
        L_0x042e:
            androidx.compose.ui.layout.LayoutInfo r13 = r0.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r13 = r13.getCoordinates()
            androidx.compose.ui.geometry.Rect r13 = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(r13)
            long r7 = r13.m2605getSizeNHjbRc()
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.getScrollBy()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r3)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 != 0) goto L_0x0451
            return r1
        L_0x0451:
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r9 = r9.getHorizontalScrollAxisRange()
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r9)
            androidx.compose.ui.semantics.ScrollAxisRange r3 = (androidx.compose.ui.semantics.ScrollAxisRange) r3
            r9 = 0
            if (r3 == 0) goto L_0x04a2
            if (r6 == 0) goto L_0x04a2
            float r6 = androidx.compose.ui.geometry.Size.m2641getWidthimpl(r7)
            if (r2 != 0) goto L_0x046e
            if (r15 == 0) goto L_0x046f
        L_0x046e:
            float r6 = -r6
        L_0x046f:
            boolean r10 = r3.getReverseScrolling()
            if (r10 == 0) goto L_0x0476
            float r6 = -r6
        L_0x0476:
            boolean r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(r0)
            if (r10 == 0) goto L_0x0481
            if (r2 != 0) goto L_0x0480
            if (r4 == 0) goto L_0x0481
        L_0x0480:
            float r6 = -r6
        L_0x0481:
            boolean r2 = performActionHelper$canScroll(r3, r6)
            if (r2 == 0) goto L_0x04a2
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            if (r13 == 0) goto L_0x04a1
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04a1:
            return r1
        L_0x04a2:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getVerticalScrollAxisRange()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r0, r2)
            androidx.compose.ui.semantics.ScrollAxisRange r0 = (androidx.compose.ui.semantics.ScrollAxisRange) r0
            if (r0 == 0) goto L_0x04e6
            if (r14 == 0) goto L_0x04e6
            float r14 = androidx.compose.ui.geometry.Size.m2638getHeightimpl(r7)
            if (r5 != 0) goto L_0x04be
            if (r15 == 0) goto L_0x04bf
        L_0x04be:
            float r14 = -r14
        L_0x04bf:
            boolean r15 = r0.getReverseScrolling()
            if (r15 == 0) goto L_0x04c6
            float r14 = -r14
        L_0x04c6:
            boolean r15 = performActionHelper$canScroll(r0, r14)
            if (r15 == 0) goto L_0x04e6
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            if (r13 == 0) goto L_0x04e6
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r13.invoke(r15, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04e6:
            return r1
        L_0x04e7:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getOnLongClick()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x050b
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x050b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x050b:
            return r1
        L_0x050c:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getOnClick()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.ui.semantics.AccessibilityAction) r14
            if (r14 == 0) goto L_0x052d
            kotlin.Function r14 = r14.getAction()
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            if (r14 == 0) goto L_0x052d
            java.lang.Object r14 = r14.invoke()
            r4 = r14
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x052d:
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r12
            r6 = r13
            sendEventForVirtualView$default(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x053e
            boolean r1 = r4.booleanValue()
        L_0x053e:
            return r1
        L_0x053f:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r14 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getFocused()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0563
            androidx.compose.ui.platform.AndroidComposeView r13 = r12.view
            androidx.compose.ui.focus.FocusOwner r13 = r13.getFocusOwner()
            androidx.compose.ui.focus.FocusManager r13 = (androidx.compose.ui.focus.FocusManager) r13
            androidx.compose.ui.focus.FocusManager.clearFocus$default(r13, r1, r3, r4)
            r1 = r3
        L_0x0563:
            return r1
        L_0x0564:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getRequestFocus()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0588
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x0588
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0588:
            return r1
        L_0x0589:
            r13 = -1
            if (r15 == 0) goto L_0x0593
            java.lang.String r14 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r14 = r15.getInt(r14, r13)
            goto L_0x0594
        L_0x0593:
            r14 = r13
        L_0x0594:
            if (r15 == 0) goto L_0x059c
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r13 = r15.getInt(r2, r13)
        L_0x059c:
            boolean r13 = r12.setAccessibilitySelection(r0, r14, r13, r1)
            if (r13 == 0) goto L_0x05b4
            int r14 = r0.getId()
            int r1 = r12.semanticsNodeIdToAccessibilityVirtualNodeId(r14)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L_0x05b4:
            return r13
        L_0x05b5:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCopyText()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x05d9
            kotlin.Function r13 = r13.getAction()
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            if (r13 == 0) goto L_0x05d9
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x05d9:
            return r1
        L_0x05da:
            if (r15 == 0) goto L_0x05f0
            java.lang.String r13 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r13 = r15.getInt(r13)
            java.lang.String r4 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r15 = r15.getBoolean(r4)
            if (r14 != r2) goto L_0x05eb
            r1 = r3
        L_0x05eb:
            boolean r13 = r12.traverseAtGranularity(r0, r13, r1, r15)
            return r13
        L_0x05f0:
            return r1
        L_0x05f1:
            boolean r13 = r12.clearAccessibilityFocus(r13)
            return r13
        L_0x05f6:
            boolean r13 = r12.requestAccessibilityFocus(r13)
            return r13
        L_0x05fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        String str2;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
            if (Intrinsics.areEqual((Object) str, (Object) this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
                Integer num = this.idToBeforeMap.get(Integer.valueOf(i));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (Intrinsics.areEqual((Object) str, (Object) this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
                Integer num2 = this.idToAfterMap.get(Integer.valueOf(i));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && Intrinsics.areEqual((Object) str, (Object) "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i3 > 0 && i2 >= 0) {
                    if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                        List arrayList = new ArrayList();
                        Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
                        if (Intrinsics.areEqual((Object) function1 != null ? (Boolean) function1.invoke(arrayList) : null, (Object) true)) {
                            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                            List arrayList2 = new ArrayList();
                            for (int i4 = 0; i4 < i3; i4++) {
                                int i5 = i2 + i4;
                                if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                                    arrayList2.add((Object) null);
                                } else {
                                    arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                                }
                            }
                            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e(LogTag, "Invalid arguments for accessibility character locations");
            } else if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag()) && bundle != null && Intrinsics.areEqual((Object) str, (Object) ExtraDataTestTagKey) && (str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag())) != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            }
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        Rect r6 = rect.m2609translatek4lQ0M(semanticsNode.m4978getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        Rect intersect = r6.overlaps(boundsInRoot) ? r6.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        long r0 = this.view.m4857localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
        long r5 = this.view.m4857localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
        return new RectF(Offset.m2572getXimpl(r0), Offset.m2573getYimpl(r0), Offset.m2572getXimpl(r5), Offset.m2573getYimpl(r5));
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
            if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
                return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
    }

    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        LayoutNode requireLayoutNode;
        SemanticsModifierNode semanticsModifierNode = null;
        Owner.measureAndLayout$default(this.view, false, 1, (Object) null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m4653hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(f, f2), hitTestResult, false, false, 12, (Object) null);
        SemanticsModifierNode semanticsModifierNode2 = (SemanticsModifierNode) CollectionsKt.lastOrNull(hitTestResult);
        if (!(semanticsModifierNode2 == null || (requireLayoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode2)) == null)) {
            semanticsModifierNode = SemanticsNodeKt.getOuterSemantics(requireLayoutNode);
        }
        if (semanticsModifierNode != null && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(new SemanticsNode(semanticsModifierNode, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null))) {
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode2) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode2.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 != i) {
            this.hoveredVirtualViewId = i;
            sendEventForVirtualView$default(this, i, 128, (Integer) null, (List) null, 12, (Object) null);
            sendEventForVirtualView$default(this, i2, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t == null || t.length() == 0 || t.length() <= i) {
            return t;
        } else {
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            T subSequence = t.subSequence(0, i);
            Intrinsics.checkNotNull(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
    }

    /* access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$38(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, (Object) null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() && !this.checkingForSemanticsChanges) {
            this.checkingForSemanticsChanges = true;
            this.handler.post(this.semanticsChangeChecker);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ all -> 0x0052 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object boundsUpdatesEventLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.ArraySet r5 = (androidx.collection.ArraySet) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            r11 = r5
            goto L_0x0064
        L_0x003a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0042:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.ArraySet r5 = (androidx.collection.ArraySet) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x0052 }
            goto L_0x0076
        L_0x0052:
            r11 = move-exception
            goto L_0x00d1
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.collection.ArraySet r11 = new androidx.collection.ArraySet     // Catch:{ all -> 0x00cf }
            r11.<init>()     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r2 = r10.boundsUpdateChannel     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch:{ all -> 0x00cf }
            r6 = r10
        L_0x0064:
            r0.L$0 = r6     // Catch:{ all -> 0x0052 }
            r0.L$1 = r11     // Catch:{ all -> 0x0052 }
            r0.L$2 = r2     // Catch:{ all -> 0x0052 }
            r0.label = r4     // Catch:{ all -> 0x0052 }
            java.lang.Object r5 = r2.hasNext(r0)     // Catch:{ all -> 0x0052 }
            if (r5 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x0076:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0052 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0052 }
            if (r11 == 0) goto L_0x00c7
            r2.next()     // Catch:{ all -> 0x0052 }
            boolean r11 = r6.isEnabled$ui_release()     // Catch:{ all -> 0x0052 }
            if (r11 == 0) goto L_0x00b1
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0052 }
            int r11 = r11.size()     // Catch:{ all -> 0x0052 }
            r7 = 0
        L_0x008e:
            if (r7 >= r11) goto L_0x00a1
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r8 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0052 }
            java.lang.Object r8 = r8.valueAt(r7)     // Catch:{ all -> 0x0052 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch:{ all -> 0x0052 }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.ui.node.LayoutNode) r8     // Catch:{ all -> 0x0052 }
            r6.sendSubtreeChangeAccessibilityEvents(r8, r5)     // Catch:{ all -> 0x0052 }
            int r7 = r7 + 1
            goto L_0x008e
        L_0x00a1:
            r5.clear()     // Catch:{ all -> 0x0052 }
            boolean r11 = r6.checkingForSemanticsChanges     // Catch:{ all -> 0x0052 }
            if (r11 != 0) goto L_0x00b1
            r6.checkingForSemanticsChanges = r4     // Catch:{ all -> 0x0052 }
            android.os.Handler r11 = r6.handler     // Catch:{ all -> 0x0052 }
            java.lang.Runnable r7 = r6.semanticsChangeChecker     // Catch:{ all -> 0x0052 }
            r11.post(r7)     // Catch:{ all -> 0x0052 }
        L_0x00b1:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0052 }
            r11.clear()     // Catch:{ all -> 0x0052 }
            r0.L$0 = r6     // Catch:{ all -> 0x0052 }
            r0.L$1 = r5     // Catch:{ all -> 0x0052 }
            r0.L$2 = r2     // Catch:{ all -> 0x0052 }
            r0.label = r3     // Catch:{ all -> 0x0052 }
            r7 = 100
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r7, r0)     // Catch:{ all -> 0x0052 }
            if (r11 != r1) goto L_0x0038
            return r1
        L_0x00c7:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes
            r11.clear()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00cf:
            r11 = move-exception
            r6 = r10
        L_0x00d1:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r0 = r6.subtreeChangedLayoutNodes
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.m7552trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet<Integer> arraySet) {
        LayoutNode access$findClosestParentNode;
        SemanticsModifierNode outerSemantics;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsModifierNode outerSemantics2 = SemanticsNodeKt.getOuterSemantics(layoutNode);
            if (outerSemantics2 == null) {
                LayoutNode access$findClosestParentNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1.INSTANCE);
                outerSemantics2 = access$findClosestParentNode2 != null ? SemanticsNodeKt.getOuterSemantics(access$findClosestParentNode2) : null;
                if (outerSemantics2 == null) {
                    return;
                }
            }
            if (!(SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics2).isMergingSemanticsOfDescendants() || (access$findClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE)) == null || (outerSemantics = SemanticsNodeKt.getOuterSemantics(access$findClosestParentNode)) == null)) {
                outerSemantics2 = outerSemantics;
            }
            int semanticsId = DelegatableNodeKt.requireLayoutNode(outerSemantics2).getSemanticsId();
            if (arraySet.add(Integer.valueOf(semanticsId))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    private final void checkForSemanticsChanges() {
        sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            r6 = this;
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            androidx.collection.ArraySet<java.lang.Integer> r1 = r6.paneDisplayed
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map r3 = r6.getCurrentSemanticsNodes()
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
            r4 = 0
            if (r3 == 0) goto L_0x0029
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
            goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            if (r3 == 0) goto L_0x0032
            boolean r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(r3)
            if (r3 != 0) goto L_0x000b
        L_0x0032:
            r0.add(r2)
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r3 = r2.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r5 = r6.previousSemanticsNodes
            java.lang.Object r2 = r5.get(r2)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy) r2
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getUnmergedConfig()
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.getPaneTitle()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r4)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x005b:
            r2 = 32
            r6.sendPaneChangeEvents(r3, r2, r4)
            goto L_0x000b
        L_0x0061:
            androidx.collection.ArraySet<java.lang.Integer> r1 = r6.paneDisplayed
            r1.removeAll(r0)
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r0 = r6.previousSemanticsNodes
            r0.clear()
            java.util.Map r0 = r6.getCurrentSemanticsNodes()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(r2)
            if (r2 == 0) goto L_0x00c8
            androidx.collection.ArraySet<java.lang.Integer> r2 = r6.paneDisplayed
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.add(r3)
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.getPaneTitle()
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 16
            r6.sendPaneChangeEvents(r2, r4, r3)
        L_0x00c8:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r2 = r6.previousSemanticsNodes
            java.lang.Object r3 = r1.getKey()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r4 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r1
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.getSemanticsNode()
            java.util.Map r5 = r6.getCurrentSemanticsNodes()
            r4.<init>(r1, r5)
            r2.put(r3, r4)
            goto L_0x0077
        L_0x00e5:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.view
            androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
            java.util.Map r2 = r6.getCurrentSemanticsNodes()
            r0.<init>(r1, r2)
            r6.previousSemanticsRoot = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    public final void sendSemanticsPropertyChangeEvents$ui_release(Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        String text;
        AccessibilityEvent accessibilityEvent;
        Map<Integer, SemanticsNodeWithAdjustedBounds> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue2));
            if (semanticsNodeCopy != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = map2.get(Integer.valueOf(intValue2));
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                Intrinsics.checkNotNull(semanticsNode);
                Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it = semanticsNode.getUnmergedConfig$ui_release().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (((Intrinsics.areEqual(next.getKey(), (Object) SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(next.getKey(), (Object) SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) && registerScrollingId(intValue2, arrayList)) || !Intrinsics.areEqual(next.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), (SemanticsPropertyKey) next.getKey()))) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
                        if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getPaneTitle())) {
                            Object value = next.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) value;
                            if (semanticsNodeCopy.hasPaneTitle()) {
                                sendPaneChangeEvents(intValue2, 8, str);
                            }
                        } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getStateDescription()) || Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getToggleableState())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 64, (List) null, 8, (Object) null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 0, (List) null, 8, (Object) null);
                        } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 64, (List) null, 8, (Object) null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 0, (List) null, 8, (Object) null);
                        } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getSelected())) {
                            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getRole());
                            int r1 = Role.Companion.m4976getTabo7Vup1c();
                            if (role == null || !Role.m4966equalsimpl0(role.m4969unboximpl(), r1)) {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 64, (List) null, 8, (Object) null);
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 0, (List) null, 8, (Object) null);
                            } else if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true)) {
                                AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 4);
                                SemanticsNode semanticsNode2 = new SemanticsNode(semanticsNode.getOuterSemanticsNode$ui_release(), true, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
                                List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                                String fastJoinToString$default = list != null ? TempListUtilsKt.fastJoinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null;
                                List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), SemanticsProperties.INSTANCE.getText());
                                String fastJoinToString$default2 = list2 != null ? TempListUtilsKt.fastJoinToString$default(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null;
                                if (fastJoinToString$default != null) {
                                    createEvent$ui_release.setContentDescription(fastJoinToString$default);
                                }
                                if (fastJoinToString$default2 != null) {
                                    createEvent$ui_release.getText().add(fastJoinToString$default2);
                                }
                                sendEvent(createEvent$ui_release);
                            } else {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 0, (List) null, 8, (Object) null);
                            }
                        } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getContentDescription())) {
                            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue2);
                            Object value2 = next.getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) value2);
                        } else {
                            String str2 = "";
                            if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getEditableText())) {
                                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
                                    AnnotatedString textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                    CharSequence charSequence = textForTextField != null ? textForTextField : str2;
                                    AnnotatedString textForTextField2 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                    CharSequence charSequence2 = textForTextField2 != null ? textForTextField2 : str2;
                                    CharSequence trimToSize = trimToSize(charSequence2, ParcelSafeTextLength);
                                    int length = charSequence.length();
                                    int length2 = charSequence2.length();
                                    int coerceAtMost = RangesKt.coerceAtMost(length, length2);
                                    int i = 0;
                                    while (i < coerceAtMost && charSequence.charAt(i) == charSequence2.charAt(i)) {
                                        i++;
                                        Map<Integer, SemanticsNodeWithAdjustedBounds> map3 = map;
                                    }
                                    int i2 = 0;
                                    while (i2 < coerceAtMost - i) {
                                        int i3 = coerceAtMost;
                                        if (charSequence.charAt((length - 1) - i2) != charSequence2.charAt((length2 - 1) - i2)) {
                                            break;
                                        }
                                        i2++;
                                        coerceAtMost = i3;
                                    }
                                    int i4 = (length - i2) - i;
                                    int i5 = (length2 - i2) - i;
                                    boolean z2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                    boolean z3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                    if (z2 || z3) {
                                        accessibilityEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 0, (Integer) null, Integer.valueOf(length2), trimToSize);
                                    } else {
                                        accessibilityEvent = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 16);
                                        accessibilityEvent.setFromIndex(i);
                                        accessibilityEvent.setRemovedCount(i4);
                                        accessibilityEvent.setAddedCount(i5);
                                        accessibilityEvent.setBeforeText(charSequence);
                                        accessibilityEvent.getText().add(trimToSize);
                                    }
                                    accessibilityEvent.setClassName(TextFieldClassName);
                                    sendEvent(accessibilityEvent);
                                    if (z2 || z3) {
                                        long r0 = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5135unboximpl();
                                        accessibilityEvent.setFromIndex(TextRange.m5131getStartimpl(r0));
                                        accessibilityEvent.setToIndex(TextRange.m5126getEndimpl(r0));
                                        sendEvent(accessibilityEvent);
                                    }
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 2, (List) null, 8, (Object) null);
                                }
                            } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                if (!(textForTextField3 == null || (text = textForTextField3.getText()) == null)) {
                                    str2 = text;
                                }
                                long r02 = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5135unboximpl();
                                sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), Integer.valueOf(TextRange.m5131getStartimpl(r02)), Integer.valueOf(TextRange.m5126getEndimpl(r02)), Integer.valueOf(str2.length()), trimToSize(str2, ParcelSafeTextLength)));
                                sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                            } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                                ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, intValue2);
                                Intrinsics.checkNotNull(findById);
                                findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                sendScrollEventIfNeeded(findById);
                            } else if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsProperties.INSTANCE.getFocused())) {
                                Object value3 = next.getValue();
                                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) value3).booleanValue()) {
                                    sendEvent(createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                }
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, 0, (List) null, 8, (Object) null);
                            } else {
                                if (Intrinsics.areEqual((Object) semanticsPropertyKey, (Object) SemanticsActions.INSTANCE.getCustomActions())) {
                                    List list3 = (List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                                    List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                                    if (list4 != null) {
                                        Set linkedHashSet = new LinkedHashSet();
                                        int size = list3.size();
                                        for (int i6 = 0; i6 < size; i6++) {
                                            linkedHashSet.add(((CustomAccessibilityAction) list3.get(i6)).getLabel());
                                        }
                                        Set linkedHashSet2 = new LinkedHashSet();
                                        int size2 = list4.size();
                                        for (int i7 = 0; i7 < size2; i7++) {
                                            linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i7)).getLabel());
                                        }
                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                            z = false;
                                        }
                                    } else if (!list3.isEmpty()) {
                                        Map<Integer, SemanticsNodeWithAdjustedBounds> map4 = map;
                                        z = true;
                                    }
                                } else if (next.getValue() instanceof AccessibilityAction) {
                                    Object value4 = next.getValue();
                                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    z = !AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), (SemanticsPropertyKey) next.getKey()));
                                }
                                z = true;
                            }
                        }
                    }
                    Map<Integer, SemanticsNodeWithAdjustedBounds> map5 = map;
                }
                if (!z) {
                    z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy);
                }
                if (z) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue2), 2048, 0, (List) null, 8, (Object) null);
                }
                map2 = map;
            }
        }
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i, this.scrollObservationScopes, (Float) null, (Float) null, (ScrollAxisRange) null, (ScrollAxisRange) null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(scrollObservationScope, this));
        }
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent$ui_release.setContentChangeTypes(i2);
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        sendEvent(createEvent$ui_release);
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        Set linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        for (Integer intValue : semanticsNodeCopy.getChildren()) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy2);
                sendSemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i2;
        int i3;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        CharSequence charSequence = iterableTextForAccessibility;
        if (charSequence == null || charSequence.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (following == null) {
            return false;
        }
        int i4 = following[0];
        int i5 = following[1];
        if (!z2 || !isAccessibilitySelectionExtendable(semanticsNode)) {
            i3 = z ? i5 : i4;
            i2 = i3;
        } else {
            i3 = getAccessibilitySelectionStart(semanticsNode);
            if (i3 == -1) {
                i3 = z ? i4 : i5;
            }
            i2 = z ? i5 : i4;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? 256 : 512, i, i4, i5, SystemClock.uptimeMillis());
        SemanticsNode semanticsNode2 = semanticsNode;
        setAccessibilitySelection(semanticsNode, i3, i2, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent2 = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent2 != null) {
            if (i == pendingTextTraversedEvent2.getNode().getId()) {
                if (SystemClock.uptimeMillis() - pendingTextTraversedEvent2.getTraverseTime() <= 1000) {
                    AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent2.getNode().getId()), 131072);
                    createEvent$ui_release.setFromIndex(pendingTextTraversedEvent2.getFromIndex());
                    createEvent$ui_release.setToIndex(pendingTextTraversedEvent2.getToIndex());
                    createEvent$ui_release.setAction(pendingTextTraversedEvent2.getAction());
                    createEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent2.getGranularity());
                    createEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent2.getNode()));
                    sendEvent(createEvent$ui_release);
                }
            } else {
                return;
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        boolean z2 = false;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
                i = -1;
            }
            this.accessibilityCursorPosition = i;
            CharSequence charSequence = iterableTextForAccessibility;
            if (charSequence.length() > 0) {
                z2 = true;
            }
            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
            Integer num = null;
            Integer valueOf = z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null;
            Integer valueOf2 = z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null;
            if (z2) {
                num = Integer.valueOf(iterableTextForAccessibility.length());
            }
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId, valueOf, valueOf2, num, charSequence));
            sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
            return true;
        }
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        return (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m5131getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5135unboximpl());
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        return (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m5126getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5135unboximpl());
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        return !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        AccessibilityIterators.AbstractTextSegmentIterator abstractTextSegmentIterator;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        CharSequence charSequence = iterableTextForAccessibility;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            abstractTextSegmentIterator = companion.getInstance(locale);
            abstractTextSegmentIterator.initialize(iterableTextForAccessibility);
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    abstractTextSegmentIterator = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                    abstractTextSegmentIterator.initialize(iterableTextForAccessibility);
                } else if (i != 16) {
                    return null;
                }
            }
            if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                return null;
            }
            List arrayList = new ArrayList();
            Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
            if (!Intrinsics.areEqual((Object) function1 != null ? (Boolean) function1.invoke(arrayList) : null, (Object) true)) {
                return null;
            }
            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
            if (i == 4) {
                abstractTextSegmentIterator = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) abstractTextSegmentIterator).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                AccessibilityIterators.AbstractTextSegmentIterator instance = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) instance).initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                abstractTextSegmentIterator = instance;
            }
        } else {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            abstractTextSegmentIterator = companion2.getInstance(locale2);
            abstractTextSegmentIterator.initialize(iterableTextForAccessibility);
        }
        return abstractTextSegmentIterator;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "info");
            Intrinsics.checkNotNullParameter(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, str, bundle);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "setScrollEventDelta", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @JvmStatic
        public static final void setScrollEventDelta(AccessibilityEvent accessibilityEvent, int i, int i2) {
            Intrinsics.checkNotNullParameter(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.getLabel()));
                }
            }
        }
    }
}

package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bB\b\u0000\u0018\u0000 Ú\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bÚ\u0002Û\u0002Ü\u0002Ý\u0002B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010Ù\u0001\u001a\u00030©\u00012\b\u0010³\u0001\u001a\u00030¨\u0001H\u0000¢\u0006\u0003\bÚ\u0001J\u0010\u0010Û\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÜ\u0001J\u0010\u0010Ý\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÞ\u0001J\u0010\u0010ß\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bà\u0001J\n\u0010á\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010â\u0001\u001a\u00030ã\u00012\b\b\u0002\u00106\u001a\u00020\u000bH\u0002J\u0010\u0010ä\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bå\u0001J\u0010\u0010æ\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bç\u0001J\u001a\u0010è\u0001\u001a\u00030©\u00012\b\u0010é\u0001\u001a\u00030ê\u0001H\u0000¢\u0006\u0003\bë\u0001J%\u0010ì\u0001\u001a\u00030©\u00012\u0015\u0010í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030©\u00010§\u0001H\bø\u0001\u0000J+\u0010î\u0001\u001a\u00030©\u00012\u001b\u0010í\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030©\u00010ï\u0001H\bø\u0001\u0000J#\u0010ð\u0001\u001a\u00030©\u00012\u0016\u0010í\u0001\u001a\u0011\u0012\u0005\u0012\u00030ñ\u0001\u0012\u0005\u0012\u00030©\u00010§\u0001H\bJ\"\u0010ò\u0001\u001a\u00030©\u00012\u0015\u0010í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0005\u0012\u00030©\u00010§\u0001H\bJ\n\u0010ó\u0001\u001a\u00030©\u0001H\u0016J\u0013\u0010ô\u0001\u001a\f\u0018\u00010õ\u0001j\u0005\u0018\u0001`ö\u0001H\u0017J\u0010\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\"H\u0016JJ\u0010ù\u0001\u001a\u00030©\u00012\b\u0010ú\u0001\u001a\u00030û\u00012\u000f\u0010ü\u0001\u001a\n\u0012\u0005\u0012\u00030þ\u00010ý\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0002\u0010\u0002JJ\u0010\u0002\u001a\u00030©\u00012\b\u0010ú\u0001\u001a\u00030û\u00012\u000f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020ý\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0002\u0010\u0002J$\u0010A\u001a\u00030©\u00012\u000f\u0010í\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010\u0002H\bø\u0001\u0000¢\u0006\u0003\b\u0002J\"\u0010\u0002\u001a\u00030©\u00012\u0007\u0010\u0002\u001a\u00020\u000b2\u0007\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0002J\n\u0010\u0002\u001a\u00030©\u0001H\u0002J\n\u0010\u0002\u001a\u00030©\u0001H\u0002J\u0010\u0010\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0002J\u0010\u0010\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0002J\u0010\u0010\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0002J\u0010\u0010\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0002J\u0013\u0010\u0002\u001a\u00030©\u00012\t\b\u0002\u0010\u0002\u001a\u00020\tJ\n\u0010\u0002\u001a\u00030©\u0001H\u0002J#\u0010\u0002\u001a\u00020\t2\f\b\u0002\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\b\u0002J\u0010\u0010\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0002J\u0010\u0010 \u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¡\u0002J\u0010\u0010¢\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b£\u0002J\u0010\u0010¤\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¥\u0002J\u0010\u0010¦\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b§\u0002J\n\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\n\u0010©\u0002\u001a\u00030©\u0001H\u0002J+\u0010ª\u0002\u001a\u00030©\u00012\u0007\u0010«\u0002\u001a\u00020\u000b2\u0007\u0010¬\u0002\u001a\u00020\u000b2\u0007\u0010­\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\b®\u0002J\u0013\u0010¯\u0002\u001a\u00030©\u00012\u0007\u0010°\u0002\u001a\u00020\u0000H\u0002J\n\u0010±\u0002\u001a\u00030©\u0001H\u0016J\n\u0010²\u0002\u001a\u00030©\u0001H\u0002J\n\u0010³\u0002\u001a\u00030©\u0001H\u0016J\u0010\u0010´\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bµ\u0002J\n\u0010¶\u0002\u001a\u00030©\u0001H\u0016J\n\u0010·\u0002\u001a\u00030©\u0001H\u0016J\u0010\u0010¸\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¹\u0002J\"\u0010º\u0002\u001a\u00030©\u00012\u0007\u0010»\u0002\u001a\u00020\u000b2\u0007\u0010¼\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\b½\u0002J\n\u0010¾\u0002\u001a\u00030©\u0001H\u0002J#\u0010¿\u0002\u001a\u00020\t2\f\b\u0002\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\bÀ\u0002J\u0010\u0010Á\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÂ\u0002J\"\u0010Ã\u0002\u001a\u00030©\u00012\u0007\u0010\u0002\u001a\u00020\u000b2\u0007\u0010­\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÄ\u0002J\u0010\u0010Å\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÆ\u0002J\u001b\u0010Ç\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÉ\u0002J\u001b\u0010Ê\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bË\u0002J\u001b\u0010Ì\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÍ\u0002J\u001b\u0010Î\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÏ\u0002J\u0019\u0010Ð\u0002\u001a\u00030©\u00012\u0007\u0010Ñ\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\bÒ\u0002J\n\u0010Ó\u0002\u001a\u00030©\u0001H\u0002J\u0010\u0010Ô\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÕ\u0002J\t\u0010Ö\u0002\u001a\u00020\tH\u0002J\n\u0010×\u0002\u001a\u00030ã\u0001H\u0016J\u0010\u0010Ø\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÙ\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8@X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8@X\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\"8@X\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R$\u00101\u001a\u0002002\u0006\u0010/\u001a\u000200@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00000\"8@X\u0004¢\u0006\u0006\u001a\u0004\b<\u0010%R\u0014\u0010=\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001aR\u0014\u0010?\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u000e\u0010A\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00158@X\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u00158BX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u001a\u0010G\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010 R\"\u0010J\u001a\n\u0018\u00010Kj\u0004\u0018\u0001`LX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020RX\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u001aR$\u0010\\\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010 R\u001e\u0010_\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u001aR\u0013\u0010`\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020dX\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR$\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020g@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u001aR\u0014\u0010o\u001a\u00020p8@X\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u001aR\u0014\u0010u\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u001aR\u001a\u0010w\u001a\b\u0018\u00010xR\u00020d8BX\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010{\u001a\u00020|8@X\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R/\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u001a\u0005\u0018\u00010\u0001@BX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u00070\u0001R\u00020d8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\t8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u001aR+\u0010\u0001\u001a\u00030\u00012\u0007\u0010/\u001a\u00030\u0001@VX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020VX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010X\"\u0005\b\u0001\u0010ZR\u001d\u0010\u0001\u001a\u00020VX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010X\"\u0005\b\u0001\u0010ZR+\u0010\u0001\u001a\u00030\u00012\u0007\u0010/\u001a\u00030\u0001@VX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\tX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001a\"\u0005\b \u0001\u0010 R\u000f\u0010¡\u0001\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010¢\u0001\u001a\u00030£\u0001X\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R0\u0010¦\u0001\u001a\u0013\u0012\u0005\u0012\u00030¨\u0001\u0012\u0005\u0012\u00030©\u0001\u0018\u00010§\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010­\u0001R0\u0010®\u0001\u001a\u0013\u0012\u0005\u0012\u00030¨\u0001\u0012\u0005\u0012\u00030©\u0001\u0018\u00010§\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0001\u0010«\u0001\"\u0006\b°\u0001\u0010­\u0001R\u0016\u0010±\u0001\u001a\u00020\u00158@X\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010DR'\u0010³\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010^\u001a\u0005\u0018\u00010¨\u0001@BX\u000e¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u0004\u0018\u00010\u00008@X\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R \u0010¼\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b@BX\u000e¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u00108R\u000f\u0010¾\u0001\u001a\u00020VX\u000e¢\u0006\u0002\n\u0000R \u0010¿\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b@BX\u000e¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u00108R\u000f\u0010Á\u0001\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u00108R\"\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u000f\u0010É\u0001\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R \u0010Ê\u0001\u001a\u00030Ë\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R\u000f\u0010Ð\u0001\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Ñ\u0001\u001a\u00020\u000b8VX\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u00108R\u0010\u0010Ó\u0001\u001a\u00030Ô\u0001X\u000e¢\u0006\u0002\n\u0000R#\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010\u001d\u001a\u0005\b×\u0001\u0010\u0010R\u000f\u0010Ø\u0001\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000\u0002\u0012\n\u0005\b20\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Þ\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", "children", "getChildren$ui_release", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "deactivated", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "foldedChildren", "getFoldedChildren$ui_release", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isLookaheadRoot", "setLookaheadRoot", "<set-?>", "isPlaced", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isValidOwnerScope", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "newScope", "Landroidx/compose/ui/layout/LookaheadScope;", "mLookaheadScope", "getMLookaheadScope$ui_release", "()Landroidx/compose/ui/layout/LookaheadScope;", "setMLookaheadScope", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "setMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "setMeasuredByParentInLookahead$ui_release", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nextChildPlaceOrder", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "getSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "zIndex", "", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "attach", "attach$ui_release", "checkChildrenPlaceOrderForUpdates", "checkChildrenPlaceOrderForUpdates$ui_release", "clearPlaceOrder", "clearPlaceOrder$ui_release", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachChild", "block", "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinatorIncludingInner", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsEntities", "Landroidx/compose/ui/node/SemanticsModifierNode;", "hitTestSemantics-M_7yMNQ$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", "index", "instance", "insertAt$ui_release", "invalidateFocusOnAttach", "invalidateFocusOnDetach", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "move", "from", "to", "count", "move$ui_release", "onChildRemoved", "child", "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onNodePlaced", "onNodePlaced$ui_release", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "shouldInvalidateParentLayer", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LayoutNode.kt */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Function0<LayoutNode> Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final ViewConfiguration DummyViewConfiguration = new LayoutNode$Companion$DummyViewConfiguration$1();
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new LayoutNode$Companion$ErrorMeasurePolicy$1();
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public static final Comparator<LayoutNode> ZComparator = new LayoutNode$$ExternalSyntheticLambda0();
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private boolean deactivated;
    private Density density;
    private int depth;
    /* access modifiers changed from: private */
    public boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private final IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isLookaheadRoot;
    private boolean isPlaced;
    private final boolean isVirtual;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LookaheadScope mLookaheadScope;
    private MeasurePolicy measurePolicy;
    private UsageByParent measuredByParent;
    private UsageByParent measuredByParentInLookahead;
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;
    private final NodeChain nodes;
    private Function1<? super Owner, Unit> onAttach;
    private Function1<? super Owner, Unit> onDetach;
    private Owner owner;
    private int placeOrder;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private final int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutNode.kt */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutNode.kt */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutNode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final LookaheadScope getMLookaheadScope$ui_release() {
        return this.mLookaheadScope;
    }

    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        return this.measuredByParentInLookahead;
    }

    public Modifier getModifier() {
        return this.modifier;
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final int getPreviousPlaceOrder$ui_release() {
        return this.previousPlaceOrder;
    }

    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public boolean isAttached() {
        return this.owner != null;
    }

    public final boolean isLookaheadRoot() {
        return this.isLookaheadRoot;
    }

    public boolean isPlaced() {
        return this.isPlaced;
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    public final void setMeasuredByParent$ui_release(UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    public final void setMeasuredByParentInLookahead$ui_release(UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParentInLookahead = usageByParent;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public void setViewConfiguration(ViewConfiguration viewConfiguration2) {
        Intrinsics.checkNotNullParameter(viewConfiguration2, "<set-?>");
        this.viewConfiguration = viewConfiguration2;
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.measuredByParent = UsageByParent.NotUsed;
        this.measuredByParentInLookahead = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        this.previousIntrinsicsUsageByParent = UsageByParent.NotUsed;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.Companion;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierCore.Companion.generateSemanticsId() : i);
    }

    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.isPlaced());
        }
        return null;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate().getChildMeasurables$ui_release();
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        return lookaheadPassDelegate.getChildMeasurables$ui_release();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (this.isVirtual && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.unfoldedVirtualChildrenListDirty = true;
        }
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public final void forEachChild(Function1<? super LayoutNode, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                function1.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(Function2<? super Integer, ? super LayoutNode, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                function2.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode == null || !layoutNode.isVirtual) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.getParent$ui_release();
        }
        return null;
    }

    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    private final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    private final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [androidx.compose.ui.node.NodeCoordinator] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void insertAt$ui_release(int r7, androidx.compose.ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8._foldedParent
            java.lang.String r1 = " Other tree: "
            java.lang.String r2 = "Cannot insert "
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x00c6
            androidx.compose.ui.node.Owner r0 = r8.owner
            if (r0 != 0) goto L_0x0095
            r8._foldedParent = r6
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r0 = r6._foldedChildren
            r0.add(r7, r8)
            r6.onZSortedChildrenInvalidated$ui_release()
            boolean r7 = r8.isVirtual
            if (r7 == 0) goto L_0x003a
            boolean r7 = r6.isVirtual
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x002e
            int r7 = r6.virtualChildrenCount
            int r7 = r7 + r5
            r6.virtualChildrenCount = r7
            goto L_0x003a
        L_0x002e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x003a:
            r6.invalidateUnfoldedVirtualChildren()
            androidx.compose.ui.node.NodeCoordinator r7 = r8.getOuterCoordinator$ui_release()
            boolean r0 = r6.isVirtual
            if (r0 == 0) goto L_0x004e
            androidx.compose.ui.node.LayoutNode r0 = r6._foldedParent
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.node.NodeCoordinator r4 = r0.getInnerCoordinator$ui_release()
            goto L_0x0052
        L_0x004e:
            androidx.compose.ui.node.NodeCoordinator r4 = r6.getInnerCoordinator$ui_release()
        L_0x0052:
            r7.setWrappedBy$ui_release(r4)
            boolean r7 = r8.isVirtual
            if (r7 == 0) goto L_0x007b
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r7 = r8._foldedChildren
            androidx.compose.runtime.collection.MutableVector r7 = r7.getVector()
            int r0 = r7.getSize()
            if (r0 <= 0) goto L_0x007b
            java.lang.Object[] r7 = r7.getContent()
        L_0x0069:
            r1 = r7[r3]
            androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
            androidx.compose.ui.node.NodeCoordinator r1 = r1.getOuterCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getInnerCoordinator$ui_release()
            r1.setWrappedBy$ui_release(r2)
            int r3 = r3 + r5
            if (r3 < r0) goto L_0x0069
        L_0x007b:
            androidx.compose.ui.node.Owner r7 = r6.owner
            if (r7 == 0) goto L_0x0082
            r8.attach$ui_release(r7)
        L_0x0082:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r8.layoutDelegate
            int r7 = r7.getChildrenAccessingCoordinatesDuringPlacement()
            if (r7 <= 0) goto L_0x0094
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.layoutDelegate
            int r8 = r7.getChildrenAccessingCoordinatesDuringPlacement()
            int r8 = r8 + r5
            r7.setChildrenAccessingCoordinatesDuringPlacement(r8)
        L_0x0094:
            return
        L_0x0095:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r3, r5, r4)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r8 = debugTreeToString$default(r8, r3, r5, r4)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x00c6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r3, r5, r4)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            androidx.compose.ui.node.LayoutNode r8 = r8._foldedParent
            if (r8 == 0) goto L_0x00e9
            java.lang.String r4 = debugTreeToString$default(r8, r3, r5, r4)
        L_0x00e9:
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.insertAt$ui_release(int, androidx.compose.ui.node.LayoutNode):void");
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    onChildRemoved(this._foldedChildren.removeAt(i3));
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved(this._foldedChildren.get(size));
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release((NodeCoordinator) null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).getOuterCoordinator$ui_release().setWrappedBy$ui_release((NodeCoordinator) null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void move$ui_release(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                this._foldedChildren.add(i > i2 ? i2 + i4 : (i2 + i3) - 2, this._foldedChildren.removeAt(i > i2 ? i + i4 : i));
            }
            onZSortedChildrenInvalidated$ui_release();
            invalidateUnfoldedVirtualChildren();
            invalidateMeasurements$ui_release();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.LookaheadScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attach$ui_release(androidx.compose.ui.node.Owner r7) {
        /*
            r6 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.compose.ui.node.Owner r0 = r6.owner
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00f2
            androidx.compose.ui.node.LayoutNode r0 = r6._foldedParent
            if (r0 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0016
            androidx.compose.ui.node.Owner r0 = r0.owner
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r0 == 0) goto L_0x001e
            goto L_0x006b
        L_0x001e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Attaching to a different owner("
            r0.<init>(r4)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = ") than the parent's owner("
            java.lang.StringBuilder r7 = r7.append(r0)
            androidx.compose.ui.node.LayoutNode r0 = r6.getParent$ui_release()
            if (r0 == 0) goto L_0x0038
            androidx.compose.ui.node.Owner r0 = r0.owner
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = "). This tree: "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r1, r2, r3)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = " Parent tree: "
            java.lang.StringBuilder r7 = r7.append(r0)
            androidx.compose.ui.node.LayoutNode r0 = r6._foldedParent
            if (r0 == 0) goto L_0x0059
            java.lang.String r3 = debugTreeToString$default(r0, r1, r2, r3)
        L_0x0059:
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x006b:
            androidx.compose.ui.node.LayoutNode r0 = r6.getParent$ui_release()
            if (r0 != 0) goto L_0x0073
            r6.isPlaced = r2
        L_0x0073:
            r6.owner = r7
            if (r0 == 0) goto L_0x007a
            int r4 = r0.depth
            goto L_0x007b
        L_0x007a:
            r4 = -1
        L_0x007b:
            int r4 = r4 + r2
            r6.depth = r4
            androidx.compose.ui.node.SemanticsModifierNode r4 = androidx.compose.ui.semantics.SemanticsNodeKt.getOuterSemantics(r6)
            if (r4 == 0) goto L_0x0087
            r7.onSemanticsChange()
        L_0x0087:
            r7.onAttach(r6)
            if (r0 == 0) goto L_0x0093
            androidx.compose.ui.layout.LookaheadScope r4 = r0.mLookaheadScope
            if (r4 != 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r3 = r4
            goto L_0x009c
        L_0x0093:
            boolean r4 = r6.isLookaheadRoot
            if (r4 == 0) goto L_0x009c
            androidx.compose.ui.layout.LookaheadScope r3 = new androidx.compose.ui.layout.LookaheadScope
            r3.<init>(r6)
        L_0x009c:
            r6.setMLookaheadScope(r3)
            androidx.compose.ui.node.NodeChain r3 = r6.nodes
            r3.attach(r1)
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r3 = r6._foldedChildren
            androidx.compose.runtime.collection.MutableVector r3 = r3.getVector()
            int r4 = r3.getSize()
            if (r4 <= 0) goto L_0x00be
            java.lang.Object[] r3 = r3.getContent()
        L_0x00b4:
            r5 = r3[r1]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            r5.attach$ui_release(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x00b4
        L_0x00be:
            r6.invalidateMeasurements$ui_release()
            if (r0 == 0) goto L_0x00c6
            r0.invalidateMeasurements$ui_release()
        L_0x00c6:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getOuterCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.getInnerCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r1 = r1.getWrapped$ui_release()
        L_0x00d2:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e2
            r0.onLayoutNodeAttach()
            androidx.compose.ui.node.NodeCoordinator r0 = r0.getWrapped$ui_release()
            goto L_0x00d2
        L_0x00e2:
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.Owner, kotlin.Unit> r0 = r6.onAttach
            if (r0 == 0) goto L_0x00e9
            r0.invoke(r7)
        L_0x00e9:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.layoutDelegate
            r7.updateParentData()
            r6.invalidateFocusOnAttach()
            return
        L_0x00f2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot attach "
            r7.<init>(r0)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r1, r2, r3)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void detach$ui_release() {
        Owner owner2 = this.owner;
        String str = null;
        if (owner2 == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                str = debugTreeToString$default(parent$ui_release, 0, 1, (Object) null);
            }
            throw new IllegalStateException(sb.append(str).toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            this.measuredByParent = UsageByParent.NotUsed;
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner2);
        }
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner2.onSemanticsChange();
        }
        this.nodes.detach$ui_release();
        owner2.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            Object[] content = vector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).detach$ui_release();
                i++;
            } while (i < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, (String) null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long r0 = getInnerCoordinator$ui_release().m4750getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m5568getHasFixedWidthimpl(r0) && Constraints.m5567getHasFixedHeightimpl(r0);
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i3 = 0;
            do {
                sb.append(((LayoutNode) content[i3]).debugTreeToString(i + 1));
                i3++;
            } while (i3 < size);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "tree.toString()");
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutNode.kt */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            this.error = str;
        }

        public Void minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    public void setMeasurePolicy(MeasurePolicy measurePolicy2) {
        Intrinsics.checkNotNullParameter(measurePolicy2, "value");
        if (!Intrinsics.areEqual((Object) this.measurePolicy, (Object) measurePolicy2)) {
            this.measurePolicy = measurePolicy2;
            this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
            invalidateMeasurements$ui_release();
        }
    }

    public void setDensity(Density density2) {
        Intrinsics.checkNotNullParameter(density2, "value");
        if (!Intrinsics.areEqual((Object) this.density, (Object) density2)) {
            this.density = density2;
            onDensityOrLayoutDirectionChanged();
        }
    }

    private final void setMLookaheadScope(LookaheadScope lookaheadScope) {
        if (!Intrinsics.areEqual((Object) lookaheadScope, (Object) this.mLookaheadScope)) {
            this.mLookaheadScope = lookaheadScope;
            this.layoutDelegate.onLookaheadScopeChanged$ui_release(lookaheadScope);
            NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            while (!Intrinsics.areEqual((Object) outerCoordinator$ui_release, (Object) wrapped$ui_release) && outerCoordinator$ui_release != null) {
                outerCoordinator$ui_release.updateLookaheadScope$ui_release(lookaheadScope);
                outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
            }
        }
    }

    public void setLayoutDirection(LayoutDirection layoutDirection2) {
        Intrinsics.checkNotNullParameter(layoutDirection2, "value");
        if (this.layoutDirection != layoutDirection2) {
            this.layoutDirection = layoutDirection2;
            onDensityOrLayoutDirectionChanged();
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) {
            return false;
        }
        return true;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final void setLookaheadRoot(boolean z) {
        if (z != this.isLookaheadRoot) {
            if (!z) {
                setMLookaheadScope((LookaheadScope) null);
            } else {
                setMLookaheadScope(new LookaheadScope(this));
            }
            this.isLookaheadRoot = z;
        }
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual((Object) innerCoordinator$ui_release, (Object) wrappedBy$ui_release)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy$ui_release() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public void setModifier(Modifier modifier2) {
        Intrinsics.checkNotNullParameter(modifier2, "value");
        if (!this.isVirtual || getModifier() == Modifier.Companion) {
            this.modifier = modifier2;
            this.nodes.updateFrom$ui_release(modifier2);
            NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            while (!Intrinsics.areEqual((Object) outerCoordinator$ui_release, (Object) wrapped$ui_release) && outerCoordinator$ui_release != null) {
                outerCoordinator$ui_release.updateLookaheadScope$ui_release(this.mLookaheadScope);
                outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
            }
            this.layoutDelegate.updateParentData();
            return;
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    public final void place$ui_release(int i, int i2) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = getMeasurePassDelegate();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int measuredWidth = measurePassDelegate.getMeasuredWidth();
        LayoutDirection layoutDirection2 = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        LookaheadCapablePlaceable innerCoordinator$ui_release = parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null;
        LayoutCoordinates access$get_coordinates$cp = Placeable.PlacementScope._coordinates;
        int access$getParentWidth = Placeable.PlacementScope.Companion.getParentWidth();
        LayoutDirection access$getParentLayoutDirection = Placeable.PlacementScope.Companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.Companion companion2 = Placeable.PlacementScope.Companion;
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.Companion companion3 = Placeable.PlacementScope.Companion;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection2;
        boolean access$configureForPlacingForAlignment = companion.configureForPlacingForAlignment(innerCoordinator$ui_release);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate, i, i2, 0.0f, 4, (Object) null);
        if (innerCoordinator$ui_release != null) {
            innerCoordinator$ui_release.setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
        }
        Placeable.PlacementScope.Companion companion4 = Placeable.PlacementScope.Companion;
        Placeable.PlacementScope.parentWidth = access$getParentWidth;
        Placeable.PlacementScope.Companion companion5 = Placeable.PlacementScope.Companion;
        Placeable.PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
        Placeable.PlacementScope._coordinates = access$get_coordinates$cp;
        Placeable.PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
    }

    /* JADX INFO: finally extract failed */
    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            getMeasurePassDelegate().replace();
            this.relayoutWithoutParentInProgress = false;
        } catch (Throwable th) {
            this.relayoutWithoutParentInProgress = false;
            throw th;
        }
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        lookaheadPassDelegate.replace();
    }

    public final void draw$ui_release(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default  reason: not valid java name */
    public static /* synthetic */ void m4652hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m4656hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z2);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release  reason: not valid java name */
    public final void m4656hitTestM_7yMNQ$ui_release(long j, HitTestResult<PointerInputModifierNode> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m4757hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), getOuterCoordinator$ui_release().m4749fromParentPositionMKHz9U(j), hitTestResult, z, z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release$default  reason: not valid java name */
    public static /* synthetic */ void m4653hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        layoutNode.m4657hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release  reason: not valid java name */
    public final void m4657hitTestSemanticsM_7yMNQ$ui_release(long j, HitTestResult<SemanticsModifierNode> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m4757hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), getOuterCoordinator$ui_release().m4749fromParentPositionMKHz9U(j), hitTestResult, true, z2);
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex2 = getInnerCoordinator$ui_release().getZIndex();
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            zIndex2 += layoutModifierNodeCoordinator.getZIndex();
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        if (zIndex2 != this.zIndex) {
            this.zIndex = zIndex2;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!isPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutState.LayingOut) {
            if (this.placeOrder == Integer.MAX_VALUE) {
                int i = parent$ui_release.nextChildPlaceOrder;
                this.placeOrder = i;
                parent$ui_release.nextChildPlaceOrder = i + 1;
            } else {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
        }
        this.layoutDelegate.getAlignmentLinesOwner$ui_release().layoutChildren();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean isPlaced2 = isPlaced();
        this.isPlaced = true;
        if (!isPlaced2) {
            if (getMeasurePending$ui_release()) {
                requestRemeasure$ui_release(true);
            } else if (getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release(true);
            }
        }
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!Intrinsics.areEqual((Object) outerCoordinator$ui_release, (Object) wrapped$ui_release) && outerCoordinator$ui_release != null) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                outerCoordinator$ui_release.invalidateLayer();
            }
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                }
                i++;
            } while (i < size);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "it");
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
        } else if (layoutNode.getMeasurePending$ui_release()) {
            layoutNode.requestRemeasure$ui_release(true);
        } else if (layoutNode.getLayoutPending$ui_release()) {
            layoutNode.requestRelayout$ui_release(true);
        } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            layoutNode.requestLookaheadRemeasure$ui_release(true);
        } else if (layoutNode.getLookaheadLayoutPending$ui_release()) {
            layoutNode.requestLookaheadRelayout$ui_release(true);
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (isPlaced()) {
            int i = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    ((LayoutNode) content[i]).markSubtreeAsNotPlaced();
                    i++;
                } while (i < size);
            }
        }
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRemeasure$ui_release(z);
    }

    public final void requestRemeasure$ui_release(boolean z) {
        Owner owner2;
        if (!this.ignoreRemeasureRequests && !this.isVirtual && (owner2 = this.owner) != null) {
            Owner.onRequestMeasure$default(owner2, this, false, z, 2, (Object) null);
            getMeasurePassDelegate().invalidateIntrinsicsParent(z);
        }
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z) {
        if (this.mLookaheadScope != null) {
            Owner owner2 = this.owner;
            if (owner2 != null && !this.ignoreRemeasureRequests && !this.isVirtual) {
                owner2.onRequestMeasure(this, true, z);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegate);
                lookaheadPassDelegate.invalidateIntrinsicsParent(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.mLookaheadScope != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, 1, (Object) null);
        } else {
            requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        }
    }

    public final void ignoreRemeasureRequests$ui_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        this.ignoreRemeasureRequests = true;
        function0.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public final void requestRelayout$ui_release(boolean z) {
        Owner owner2;
        if (!this.isVirtual && (owner2 = this.owner) != null) {
            Owner.onRequestRelayout$default(owner2, this, false, z, 2, (Object) null);
        }
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public final void requestLookaheadRelayout$ui_release(boolean z) {
        Owner owner2;
        if (!this.isVirtual && (owner2 = this.owner) != null) {
            owner2.onRequestRelayout(this, true, z);
        }
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() == LayoutState.Idle && !getLayoutPending$ui_release() && !getMeasurePending$ui_release() && isPlaced()) {
            NodeChain nodeChain = this.nodes;
            int r2 = NodeKind.m4780constructorimpl(256);
            if ((nodeChain.getAggregateChildKindSet() & r2) != 0) {
                Modifier.Node head$ui_release = nodeChain.getHead$ui_release();
                while (head$ui_release != null) {
                    if ((head$ui_release.getKindSet$ui_release() & r2) != 0 && (head$ui_release instanceof GlobalPositionAwareModifierNode)) {
                        GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) head$ui_release;
                        globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m4622requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m4780constructorimpl(256)));
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & r2) != 0) {
                        head$ui_release = head$ui_release.getChild$ui_release();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default  reason: not valid java name */
    public static /* synthetic */ boolean m4654lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4703getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m4658lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release  reason: not valid java name */
    public final boolean m4658lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null || this.mLookaheadScope == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        return lookaheadPassDelegate.m4707remeasureBRTryo0(constraints.m5576unboximpl());
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default  reason: not valid java name */
    public static /* synthetic */ boolean m4655remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4702getLastConstraintsDWUhwKw();
        }
        return layoutNode.m4659remeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release  reason: not valid java name */
    public final boolean m4659remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate().m4712remeasureBRTryo0(constraints.m5576unboximpl());
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    public final void invalidateSubtree(boolean z) {
        OwnedLayer layer;
        if (z) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        }
        requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        NodeChain nodeChain = this.nodes;
        int r3 = NodeKind.m4780constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & r3) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if (!((head$ui_release.getKindSet$ui_release() & r3) == 0 || !(head$ui_release instanceof LayoutModifierNode) || (layer = DelegatableNodeKt.m4622requireCoordinator64DMado((LayoutModifierNode) head$ui_release, NodeKind.m4780constructorimpl(2)).getLayer()) == null)) {
                    layer.invalidate();
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & r3) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).invalidateSubtree(false);
                i++;
            } while (i < size);
        }
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public void forceRemeasure() {
        requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        Constraints r3 = this.layoutDelegate.m4702getLastConstraintsDWUhwKw();
        if (r3 != null) {
            Owner owner2 = this.owner;
            if (owner2 != null) {
                owner2.m4833measureAndLayout0kLqBqw(this, r3.m5576unboximpl());
                return;
            }
            return;
        }
        Owner owner3 = this.owner;
        if (owner3 != null) {
            Owner.measureAndLayout$default(owner3, false, 1, (Object) null);
        }
    }

    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int r1 = NodeKind.m4780constructorimpl(128);
        boolean r2 = NodeKindKt.m4788getIncludeSelfInTraversalH91voCI(r1);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (r2 || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = innerCoordinator$ui_release.headNode(r2);
            while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r1) != 0) {
                if ((access$headNode.getKindSet$ui_release() & r1) != 0 && (access$headNode instanceof LayoutAwareModifierNode)) {
                    ((LayoutAwareModifierNode) access$headNode).onPlaced(getInnerCoordinator$ui_release());
                }
                if (access$headNode != tail) {
                    access$headNode = access$headNode.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    private final void forEachCoordinator(Function1<? super LayoutModifierNodeCoordinator, Unit> function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            function1.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    private final void forEachCoordinatorIncludingInner(Function1<? super NodeCoordinator, Unit> function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!Intrinsics.areEqual((Object) outerCoordinator$ui_release, (Object) wrapped$ui_release) && outerCoordinator$ui_release != null) {
            function1.invoke(outerCoordinator$ui_release);
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public void onReuse() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        if (this.deactivated) {
            this.deactivated = false;
        } else {
            resetModifierState();
        }
    }

    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.deactivated = true;
        resetModifierState();
    }

    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!Intrinsics.areEqual((Object) outerCoordinator$ui_release, (Object) wrapped$ui_release) && outerCoordinator$ui_release != null) {
            outerCoordinator$ui_release.onRelease();
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutNode.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    /* access modifiers changed from: private */
    public static final int ZComparator$lambda$41(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f = layoutNode.zIndex;
        float f2 = layoutNode2.zIndex;
        if (f == f2) {
            return Intrinsics.compare(layoutNode.placeOrder, layoutNode2.placeOrder);
        }
        return Float.compare(f, f2);
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    public final void clearPlaceOrder$ui_release() {
        int i = 0;
        this.nextChildPlaceOrder = 0;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                layoutNode.previousPlaceOrder = layoutNode.placeOrder;
                layoutNode.placeOrder = Integer.MAX_VALUE;
                if (layoutNode.measuredByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.measuredByParent = UsageByParent.NotUsed;
                }
                i++;
            } while (i < size);
        }
    }

    public final void checkChildrenPlaceOrderForUpdates$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.previousPlaceOrder != layoutNode.placeOrder) {
                    onZSortedChildrenInvalidated$ui_release();
                    invalidateLayer$ui_release();
                    if (layoutNode.placeOrder == Integer.MAX_VALUE) {
                        layoutNode.markSubtreeAsNotPlaced();
                    }
                }
                i++;
            } while (i < size);
        }
    }

    private final void invalidateFocusOnAttach() {
        if (this.nodes.has$ui_release(NodeKind.m4780constructorimpl(1024) | NodeKind.m4780constructorimpl(2048) | NodeKind.m4780constructorimpl(4096))) {
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                boolean z = true;
                boolean z2 = ((NodeKind.m4780constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) | ((NodeKind.m4780constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0);
                if ((NodeKind.m4780constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) == 0) {
                    z = false;
                }
                if (z2 || z) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        if (this.nodes.m4730hasH91voCI$ui_release(NodeKind.m4780constructorimpl(1024))) {
            for (Modifier.Node tail$ui_release = this.nodes.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((NodeKind.m4780constructorimpl(1024) & tail$ui_release.getKindSet$ui_release()) != 0 && (tail$ui_release instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) tail$ui_release;
                    if (focusTargetModifierNode.getFocusState().isFocused()) {
                        LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                        focusTargetModifierNode.scheduleInvalidationForFocusEvents$ui_release();
                    }
                }
            }
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m4730hasH91voCI$ui_release(NodeKind.m4780constructorimpl(4)) && !this.nodes.m4730hasH91voCI$ui_release(NodeKind.m4780constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((NodeKind.m4780constructorimpl(2) & head$ui_release.getKindSet$ui_release()) != 0 && (head$ui_release instanceof LayoutModifierNode) && DelegatableNodeKt.m4622requireCoordinator64DMado(head$ui_release, NodeKind.m4780constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m4780constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                return true;
            }
        }
        return true;
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }
}

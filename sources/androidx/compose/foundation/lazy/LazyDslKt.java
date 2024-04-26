package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u0010.\u001a\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u00104\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u00105\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u00106\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\bø\u0001\u0000¢\u0006\u0002\u00107\u0002\u0007\n\u0005\b20\u0001¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyDsl.kt */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        Function1 function13 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int size = list.size();
        if (function1 != null) {
            function13 = new LazyDslKt$items$2(function1, list);
        }
        lazyListScope.items(size, function13, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        Function1 function12 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        Function1 function13 = LazyDslKt$items$1.INSTANCE;
        int size = list.size();
        if (function1 != null) {
            function12 = new LazyDslKt$items$2(function1, list);
        }
        lazyListScope.items(size, function12, new LazyDslKt$items$3(function13, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = LazyDslKt$itemsIndexed$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int size = list.size();
        if (function2 != null) {
            function1 = new LazyDslKt$itemsIndexed$2(function2, list);
        }
        lazyListScope.items(size, function1, new LazyDslKt$itemsIndexed$3(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        lazyListScope.items(list.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, list) : null, new LazyDslKt$itemsIndexed$3(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int size = list.size();
        if (function2 != null) {
            function1 = new LazyDslKt$itemsIndexed$2(function2, list);
        }
        lazyListScope.items(size, function1, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        Function1 function13 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int length = objArr.length;
        if (function1 != null) {
            function13 = new LazyDslKt$items$6(function1, objArr);
        }
        lazyListScope.items(length, function13, new LazyDslKt$items$7(function12, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, objArr)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        lazyListScope.items(tArr.length, function1 != null ? new LazyDslKt$items$6(function1, tArr) : null, new LazyDslKt$items$7(function12, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        Function1 function12 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        Function1 function13 = LazyDslKt$items$5.INSTANCE;
        int length = objArr.length;
        if (function1 != null) {
            function12 = new LazyDslKt$items$6(function1, objArr);
        }
        lazyListScope.items(length, function12, new LazyDslKt$items$7(function13, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = LazyDslKt$itemsIndexed$5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int length = objArr.length;
        if (function2 != null) {
            function1 = new LazyDslKt$itemsIndexed$6(function2, objArr);
        }
        lazyListScope.items(length, function1, new LazyDslKt$itemsIndexed$7(function22, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        lazyListScope.items(tArr.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, tArr) : null, new LazyDslKt$itemsIndexed$7(function22, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int length = objArr.length;
        if (function2 != null) {
            function1 = new LazyDslKt$itemsIndexed$6(function2, objArr);
        }
        lazyListScope.items(length, function1, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyRow(androidx.compose.ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.ui.Alignment.Vertical r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r13 = r34
            r12 = r36
            r11 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r1 = r35
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LazyRow)P(4,6,1,5,3,8,2,7)291@14018L23,297@14369L15,301@14471L389:LazyDsl.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r2 = r12 | 6
            r3 = r2
            r2 = r26
            goto L_0x0038
        L_0x0024:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x0035
            r2 = r26
            boolean r3 = r10.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0032
            r3 = 4
            goto L_0x0033
        L_0x0032:
            r3 = 2
        L_0x0033:
            r3 = r3 | r12
            goto L_0x0038
        L_0x0035:
            r2 = r26
            r3 = r12
        L_0x0038:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r11 & 2
            if (r4 != 0) goto L_0x004b
            r4 = r27
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004b:
            r4 = r27
        L_0x004d:
            r5 = 16
        L_0x004f:
            r3 = r3 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r27
        L_0x0053:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x005a
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r28
            boolean r7 = r10.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r28
        L_0x006f:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0089
            r8 = r29
            boolean r9 = r10.changed((boolean) r8)
            if (r9 == 0) goto L_0x0085
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r9
            goto L_0x008b
        L_0x0089:
            r8 = r29
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r12
            if (r9 != 0) goto L_0x00a6
            r9 = r11 & 16
            if (r9 != 0) goto L_0x00a0
            r9 = r30
            boolean r14 = r10.changed((java.lang.Object) r9)
            if (r14 == 0) goto L_0x00a2
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a0:
            r9 = r30
        L_0x00a2:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r3 = r3 | r14
            goto L_0x00a8
        L_0x00a6:
            r9 = r30
        L_0x00a8:
            r14 = r11 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00b5
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r31
            goto L_0x00c8
        L_0x00b5:
            r16 = r12 & r15
            r15 = r31
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r10.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00c4
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r3 = r3 | r16
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00e2
            r17 = r11 & 64
            r0 = r32
            if (r17 != 0) goto L_0x00dd
            boolean r18 = r10.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x00dd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r3 = r3 | r18
            goto L_0x00e4
        L_0x00e2:
            r0 = r32
        L_0x00e4:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ef
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r2 = r33
            goto L_0x0104
        L_0x00ef:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r2 = r33
            if (r18 != 0) goto L_0x0104
            boolean r18 = r10.changed((boolean) r2)
            if (r18 == 0) goto L_0x0100
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r3 = r3 | r18
        L_0x0104:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x010c
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010a:
            r3 = r3 | r2
            goto L_0x011d
        L_0x010c:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x011d
            boolean r2 = r10.changedInstance(r13)
            if (r2 == 0) goto L_0x011a
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x011a:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010a
        L_0x011d:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r3
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x0140
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L_0x012d
            goto L_0x0140
        L_0x012d:
            r10.skipToGroupEnd()
            r1 = r26
            r2 = r27
            r7 = r32
            r3 = r6
            r4 = r8
            r5 = r9
            r17 = r10
            r6 = r15
            r8 = r33
            goto L_0x025b
        L_0x0140:
            r10.startDefaults()
            r2 = r12 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x017a
            boolean r2 = r10.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0154
            goto L_0x017a
        L_0x0154:
            r10.skipToGroupEnd()
            r0 = r11 & 2
            if (r0 == 0) goto L_0x015d
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x015d:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0163
            r3 = r3 & r18
        L_0x0163:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0168
            r3 = r3 & r4
        L_0x0168:
            r18 = r26
            r19 = r27
            r24 = r32
            r25 = r33
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r15
            goto L_0x01ea
        L_0x017a:
            if (r1 == 0) goto L_0x0181
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x0183
        L_0x0181:
            r1 = r26
        L_0x0183:
            r2 = r11 & 2
            r4 = 0
            if (r2 == 0) goto L_0x0190
            r2 = 3
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r4, r4, r10, r4, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0192
        L_0x0190:
            r2 = r27
        L_0x0192:
            if (r5 == 0) goto L_0x019e
            float r5 = (float) r4
            float r5 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r5)
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r5)
            goto L_0x019f
        L_0x019e:
            r5 = r6
        L_0x019f:
            if (r7 == 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r4 = r8
        L_0x01a3:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x01b7
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r4 != 0) goto L_0x01b0
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r6.getStart()
            goto L_0x01b4
        L_0x01b0:
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r6.getEnd()
        L_0x01b4:
            r3 = r3 & r18
            goto L_0x01b8
        L_0x01b7:
            r6 = r9
        L_0x01b8:
            if (r14 == 0) goto L_0x01c1
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r7 = r7.getTop()
            goto L_0x01c2
        L_0x01c1:
            r7 = r15
        L_0x01c2:
            r8 = r11 & 64
            if (r8 == 0) goto L_0x01d2
            androidx.compose.foundation.gestures.ScrollableDefaults r8 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r9 = 6
            androidx.compose.foundation.gestures.FlingBehavior r8 = r8.flingBehavior(r10, r9)
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r9
            goto L_0x01d4
        L_0x01d2:
            r8 = r32
        L_0x01d4:
            if (r0 == 0) goto L_0x01da
            r0 = 1
            r25 = r0
            goto L_0x01dc
        L_0x01da:
            r25 = r33
        L_0x01dc:
            r18 = r1
            r19 = r2
            r21 = r4
            r20 = r5
            r22 = r6
            r23 = r7
            r24 = r8
        L_0x01ea:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fd
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)"
            r2 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x01fd:
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r14 = r0 | r1
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 >> 18
            r1 = r1 & 896(0x380, float:1.256E-42)
            r15 = r0 | r1
            r16 = 896(0x380, float:1.256E-42)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r24
            r6 = r25
            r17 = r10
            r10 = r23
            r11 = r22
            r12 = r34
            r13 = r17
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024b:
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
        L_0x025b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r17.endRestartGroup()
            if (r12 != 0) goto L_0x0262
            goto L_0x0273
        L_0x0262:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            r0 = r13
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r13 = r35
            r12 = r37
            r9 = r38
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r1 = r36
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LazyColumn)P(4,6,1,5,8,3,2,7)347@16950L23,353@17304L15,357@17406L388:LazyDsl.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0024
            r2 = r12 | 6
            r3 = r2
            r2 = r27
            goto L_0x0038
        L_0x0024:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x0035
            r2 = r27
            boolean r3 = r8.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0032
            r3 = 4
            goto L_0x0033
        L_0x0032:
            r3 = 2
        L_0x0033:
            r3 = r3 | r12
            goto L_0x0038
        L_0x0035:
            r2 = r27
            r3 = r12
        L_0x0038:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r9 & 2
            if (r4 != 0) goto L_0x004b
            r4 = r28
            boolean r5 = r8.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = 16
        L_0x004f:
            r3 = r3 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r28
        L_0x0053:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x005a
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r29
            boolean r7 = r8.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r29
        L_0x006f:
            r7 = r9 & 8
            if (r7 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r10 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0089
            r10 = r30
            boolean r11 = r8.changed((boolean) r10)
            if (r11 == 0) goto L_0x0085
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r11
            goto L_0x008b
        L_0x0089:
            r10 = r30
        L_0x008b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00a6
            r11 = r9 & 16
            if (r11 != 0) goto L_0x00a0
            r11 = r31
            boolean r14 = r8.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00a2
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a0:
            r11 = r31
        L_0x00a2:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r3 = r3 | r14
            goto L_0x00a8
        L_0x00a6:
            r11 = r31
        L_0x00a8:
            r14 = r9 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00b5
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r32
            goto L_0x00c8
        L_0x00b5:
            r16 = r12 & r15
            r15 = r32
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r8.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00c4
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r3 = r3 | r16
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00e2
            r17 = r9 & 64
            r0 = r33
            if (r17 != 0) goto L_0x00dd
            boolean r18 = r8.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x00dd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r3 = r3 | r18
            goto L_0x00e4
        L_0x00e2:
            r0 = r33
        L_0x00e4:
            r0 = r9 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ef
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r2 = r34
            goto L_0x0104
        L_0x00ef:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r2 = r34
            if (r18 != 0) goto L_0x0104
            boolean r18 = r8.changed((boolean) r2)
            if (r18 == 0) goto L_0x0100
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r3 = r3 | r18
        L_0x0104:
            r2 = r9 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010e
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010c:
            r3 = r3 | r2
            goto L_0x011e
        L_0x010e:
            r2 = r12 & r18
            if (r2 != 0) goto L_0x011e
            boolean r2 = r8.changedInstance(r13)
            if (r2 == 0) goto L_0x011b
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x011b:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010c
        L_0x011e:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r3
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x0141
            boolean r2 = r8.getSkipping()
            if (r2 != 0) goto L_0x012e
            goto L_0x0141
        L_0x012e:
            r8.skipToGroupEnd()
            r1 = r27
            r2 = r28
            r7 = r33
            r3 = r6
            r17 = r8
            r4 = r10
            r5 = r11
            r6 = r15
            r8 = r34
            goto L_0x025c
        L_0x0141:
            r8.startDefaults()
            r2 = r12 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x017b
            boolean r2 = r8.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0155
            goto L_0x017b
        L_0x0155:
            r8.skipToGroupEnd()
            r0 = r9 & 2
            if (r0 == 0) goto L_0x015e
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x015e:
            r0 = r9 & 16
            if (r0 == 0) goto L_0x0164
            r3 = r3 & r19
        L_0x0164:
            r0 = r9 & 64
            if (r0 == 0) goto L_0x0169
            r3 = r3 & r4
        L_0x0169:
            r19 = r27
            r20 = r28
            r25 = r33
            r26 = r34
            r21 = r6
            r22 = r10
            r23 = r11
            r24 = r15
            goto L_0x01eb
        L_0x017b:
            if (r1 == 0) goto L_0x0182
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x0184
        L_0x0182:
            r1 = r27
        L_0x0184:
            r2 = r9 & 2
            r4 = 0
            if (r2 == 0) goto L_0x0191
            r2 = 3
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r4, r4, r8, r4, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0193
        L_0x0191:
            r2 = r28
        L_0x0193:
            if (r5 == 0) goto L_0x019f
            float r5 = (float) r4
            float r5 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r5)
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r5)
            goto L_0x01a0
        L_0x019f:
            r5 = r6
        L_0x01a0:
            if (r7 == 0) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            r4 = r10
        L_0x01a4:
            r6 = r9 & 16
            if (r6 == 0) goto L_0x01b8
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r4 != 0) goto L_0x01b1
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getTop()
            goto L_0x01b5
        L_0x01b1:
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getBottom()
        L_0x01b5:
            r3 = r3 & r19
            goto L_0x01b9
        L_0x01b8:
            r6 = r11
        L_0x01b9:
            if (r14 == 0) goto L_0x01c2
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r7 = r7.getStart()
            goto L_0x01c3
        L_0x01c2:
            r7 = r15
        L_0x01c3:
            r10 = r9 & 64
            if (r10 == 0) goto L_0x01d3
            androidx.compose.foundation.gestures.ScrollableDefaults r10 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r11 = 6
            androidx.compose.foundation.gestures.FlingBehavior r10 = r10.flingBehavior(r8, r11)
            r11 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r11
            goto L_0x01d5
        L_0x01d3:
            r10 = r33
        L_0x01d5:
            if (r0 == 0) goto L_0x01db
            r0 = 1
            r26 = r0
            goto L_0x01dd
        L_0x01db:
            r26 = r34
        L_0x01dd:
            r19 = r1
            r20 = r2
            r22 = r4
            r21 = r5
            r23 = r6
            r24 = r7
            r25 = r10
        L_0x01eb:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fe
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)"
            r2 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x01fe:
            r4 = 1
            r7 = 0
            r10 = 0
            r11 = 0
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r3 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r0 = r0 | r1
            int r1 = r3 << 9
            r1 = r1 & r18
            r0 = r0 | r1
            int r1 = r3 << 15
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r14 = r0 | r1
            int r0 = r3 >> 18
            r15 = r0 & 896(0x380, float:1.256E-42)
            r16 = 3200(0xc80, float:4.484E-42)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r25
            r6 = r26
            r17 = r8
            r8 = r24
            r9 = r23
            r12 = r35
            r13 = r17
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024c:
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
        L_0x025c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r17.endRestartGroup()
            if (r12 != 0) goto L_0x0263
            goto L_0x0274
        L_0x0263:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            r0 = r13
            r9 = r35
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r12 = r34
            r13 = r36
            r14 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LazyColumn)P(4,6,1,5,7,3,2)375@17968L23,381@18322L15,384@18385L350:LazyDsl.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0024
            r2 = r13 | 6
            r3 = r2
            r2 = r27
            goto L_0x0038
        L_0x0024:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0035
            r2 = r27
            boolean r3 = r15.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0032
            r3 = 4
            goto L_0x0033
        L_0x0032:
            r3 = 2
        L_0x0033:
            r3 = r3 | r13
            goto L_0x0038
        L_0x0035:
            r2 = r27
            r3 = r13
        L_0x0038:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r14 & 2
            if (r4 != 0) goto L_0x004b
            r4 = r28
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = 16
        L_0x004f:
            r3 = r3 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r28
        L_0x0053:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x005a
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r29
            boolean r7 = r15.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r29
        L_0x006f:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0089
            r8 = r30
            boolean r9 = r15.changed((boolean) r8)
            if (r9 == 0) goto L_0x0085
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r9
            goto L_0x008b
        L_0x0089:
            r8 = r30
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00a7
            r10 = r14 & 16
            if (r10 != 0) goto L_0x00a1
            r10 = r31
            boolean r11 = r15.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x00a3
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r10 = r31
        L_0x00a3:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r3 = r3 | r11
            goto L_0x00a9
        L_0x00a7:
            r10 = r31
        L_0x00a9:
            r11 = r14 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00b6
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r9 = r32
            goto L_0x00c9
        L_0x00b6:
            r17 = r13 & r16
            r9 = r32
            if (r17 != 0) goto L_0x00c9
            boolean r17 = r15.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x00c5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r3 = r3 | r17
        L_0x00c9:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00e3
            r18 = r14 & 64
            r0 = r33
            if (r18 != 0) goto L_0x00de
            boolean r19 = r15.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x00de
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r3 = r3 | r19
            goto L_0x00e5
        L_0x00e3:
            r0 = r33
        L_0x00e5:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ee
            r3 = r3 | r19
            goto L_0x00ff
        L_0x00ee:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r15.changedInstance(r12)
            if (r0 == 0) goto L_0x00fc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r3 = r3 | r0
        L_0x00ff:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x011d
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            r15.skipToGroupEnd()
            r1 = r27
            r7 = r33
            r2 = r4
            r3 = r6
            r4 = r8
            r6 = r9
            r5 = r10
            goto L_0x0214
        L_0x011d:
            r15.startDefaults()
            r0 = r13 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = 3
            if (r0 == 0) goto L_0x0156
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x012f
            goto L_0x0156
        L_0x012f:
            r15.skipToGroupEnd()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0138
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0138:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x013e
            r3 = r3 & r20
        L_0x013e:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0146
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0146:
            r20 = r27
            r26 = r33
            r21 = r4
        L_0x014c:
            r22 = r6
            r23 = r8
            r25 = r9
            r24 = r10
            goto L_0x01b5
        L_0x0156:
            if (r1 == 0) goto L_0x015d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x015f
        L_0x015d:
            r0 = r27
        L_0x015f:
            r1 = r14 & 2
            r27 = r0
            r0 = 0
            if (r1 == 0) goto L_0x016d
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r0, r15, r0, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x016e
        L_0x016d:
            r1 = r4
        L_0x016e:
            if (r5 == 0) goto L_0x017a
            float r4 = (float) r0
            float r4 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r4)
            r6 = r4
        L_0x017a:
            if (r7 == 0) goto L_0x017d
            r8 = r0
        L_0x017d:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0191
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r8 != 0) goto L_0x018a
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.getTop()
            goto L_0x018e
        L_0x018a:
            androidx.compose.foundation.layout.Arrangement$Vertical r0 = r0.getBottom()
        L_0x018e:
            r3 = r3 & r20
            r10 = r0
        L_0x0191:
            if (r11 == 0) goto L_0x019a
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getStart()
            r9 = r0
        L_0x019a:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01ae
            androidx.compose.foundation.gestures.ScrollableDefaults r0 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r4 = 6
            androidx.compose.foundation.gestures.FlingBehavior r0 = r0.flingBehavior(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r20 = r27
            r26 = r0
            goto L_0x01b2
        L_0x01ae:
            r20 = r27
            r26 = r33
        L_0x01b2:
            r21 = r1
            goto L_0x014c
        L_0x01b5:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c8
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)"
            r4 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x01c8:
            r7 = 1
            r0 = r3 & 14
            r0 = r0 | r19
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = r3 & r16
            r0 = r0 | r1
            r1 = r3 & r17
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r3 << 3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r34
            r9 = r15
            LazyColumn(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0206
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0206:
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
        L_0x0214:
            androidx.compose.runtime.ScopeUpdateScope r11 = r15.endRestartGroup()
            if (r11 != 0) goto L_0x021b
            goto L_0x022c
        L_0x021b:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
            r0 = r15
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r11.updateScope(r15)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011d  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Horizontal r31, androidx.compose.ui.Alignment.Vertical r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r12 = r34
            r13 = r36
            r14 = r37
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 407929823(0x185083df, float:2.6949948E-24)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LazyRow)P(4,6,1,5,3,7,2)401@18906L23,407@19257L15,410@19320L347:LazyDsl.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0024
            r2 = r13 | 6
            r3 = r2
            r2 = r27
            goto L_0x0038
        L_0x0024:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0035
            r2 = r27
            boolean r3 = r15.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0032
            r3 = 4
            goto L_0x0033
        L_0x0032:
            r3 = 2
        L_0x0033:
            r3 = r3 | r13
            goto L_0x0038
        L_0x0035:
            r2 = r27
            r3 = r13
        L_0x0038:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r14 & 2
            if (r4 != 0) goto L_0x004b
            r4 = r28
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004b:
            r4 = r28
        L_0x004d:
            r5 = 16
        L_0x004f:
            r3 = r3 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r28
        L_0x0053:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x005a
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r29
            boolean r7 = r15.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r29
        L_0x006f:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0089
            r8 = r30
            boolean r9 = r15.changed((boolean) r8)
            if (r9 == 0) goto L_0x0085
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r9
            goto L_0x008b
        L_0x0089:
            r8 = r30
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00a7
            r10 = r14 & 16
            if (r10 != 0) goto L_0x00a1
            r10 = r31
            boolean r11 = r15.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x00a3
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r10 = r31
        L_0x00a3:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r3 = r3 | r11
            goto L_0x00a9
        L_0x00a7:
            r10 = r31
        L_0x00a9:
            r11 = r14 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00b6
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r9 = r32
            goto L_0x00c9
        L_0x00b6:
            r17 = r13 & r16
            r9 = r32
            if (r17 != 0) goto L_0x00c9
            boolean r17 = r15.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x00c5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r3 = r3 | r17
        L_0x00c9:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00e3
            r18 = r14 & 64
            r0 = r33
            if (r18 != 0) goto L_0x00de
            boolean r19 = r15.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x00de
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r3 = r3 | r19
            goto L_0x00e5
        L_0x00e3:
            r0 = r33
        L_0x00e5:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ee
            r3 = r3 | r19
            goto L_0x00ff
        L_0x00ee:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r15.changedInstance(r12)
            if (r0 == 0) goto L_0x00fc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r3 = r3 | r0
        L_0x00ff:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x011d
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            r15.skipToGroupEnd()
            r1 = r27
            r7 = r33
            r2 = r4
            r3 = r6
            r4 = r8
            r6 = r9
            r5 = r10
            goto L_0x0214
        L_0x011d:
            r15.startDefaults()
            r0 = r13 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = 3
            if (r0 == 0) goto L_0x0156
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x012f
            goto L_0x0156
        L_0x012f:
            r15.skipToGroupEnd()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0138
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0138:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x013e
            r3 = r3 & r20
        L_0x013e:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0146
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0146:
            r20 = r27
            r26 = r33
            r21 = r4
        L_0x014c:
            r22 = r6
            r23 = r8
            r25 = r9
            r24 = r10
            goto L_0x01b5
        L_0x0156:
            if (r1 == 0) goto L_0x015d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x015f
        L_0x015d:
            r0 = r27
        L_0x015f:
            r1 = r14 & 2
            r27 = r0
            r0 = 0
            if (r1 == 0) goto L_0x016d
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r0, r15, r0, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x016e
        L_0x016d:
            r1 = r4
        L_0x016e:
            if (r5 == 0) goto L_0x017a
            float r4 = (float) r0
            float r4 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r4)
            r6 = r4
        L_0x017a:
            if (r7 == 0) goto L_0x017d
            r8 = r0
        L_0x017d:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0191
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            if (r8 != 0) goto L_0x018a
            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = r0.getStart()
            goto L_0x018e
        L_0x018a:
            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = r0.getEnd()
        L_0x018e:
            r3 = r3 & r20
            r10 = r0
        L_0x0191:
            if (r11 == 0) goto L_0x019a
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r0 = r0.getTop()
            r9 = r0
        L_0x019a:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01ae
            androidx.compose.foundation.gestures.ScrollableDefaults r0 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r4 = 6
            androidx.compose.foundation.gestures.FlingBehavior r0 = r0.flingBehavior(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r20 = r27
            r26 = r0
            goto L_0x01b2
        L_0x01ae:
            r20 = r27
            r26 = r33
        L_0x01b2:
            r21 = r1
            goto L_0x014c
        L_0x01b5:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c8
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)"
            r4 = 407929823(0x185083df, float:2.6949948E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x01c8:
            r7 = 1
            r0 = r3 & 14
            r0 = r0 | r19
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = r3 & r16
            r0 = r0 | r1
            r1 = r3 & r17
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r3 << 3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r34
            r9 = r15
            LazyRow(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0206
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0206:
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
        L_0x0214:
            androidx.compose.runtime.ScopeUpdateScope r11 = r15.endRestartGroup()
            if (r11 != 0) goto L_0x021b
            goto L_0x022c
        L_0x021b:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            r0 = r15
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r11.updateScope(r15)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        lazyListScope.items(list.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        lazyListScope.items(tArr.length, function1 != null ? new LazyDslKt$items$6(function1, tArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, tArr)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        lazyListScope.items(tArr.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, tArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, tArr)));
    }
}

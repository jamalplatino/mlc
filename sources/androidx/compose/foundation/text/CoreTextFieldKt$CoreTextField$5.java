package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Modifier $cursorModifier;
    final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $drawModifier;
    final /* synthetic */ Modifier $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Modifier $onPositionedModifier;
    final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5(Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i, TextFieldState textFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.$decorationBox = function3;
        this.$$dirty1 = i;
        this.$state = textFieldState;
        this.$textStyle = textStyle;
        this.$minLines = i2;
        this.$maxLines = i3;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = function1;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = i;
        ComposerKt.sourceInformation(composer, "C564@25020L4485:CoreTextField.kt#423gt5");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374338080, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:563)");
            }
            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3 = this.$decorationBox;
            final TextFieldState textFieldState = this.$state;
            final TextStyle textStyle = this.$textStyle;
            final int i3 = this.$minLines;
            final int i4 = this.$maxLines;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
            final TextFieldValue textFieldValue = this.$value;
            final VisualTransformation visualTransformation = this.$visualTransformation;
            final Modifier modifier = this.$cursorModifier;
            final Modifier modifier2 = this.$drawModifier;
            final Modifier modifier3 = this.$onPositionedModifier;
            final Modifier modifier4 = this.$magnifierModifier;
            final BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            final boolean z = this.$showHandleAndMagnifier;
            final boolean z2 = this.$readOnly;
            final Function1<TextLayoutResult, Unit> function1 = this.$onTextLayout;
            final OffsetMapping offsetMapping = this.$offsetMapping;
            final Density density = this.$density;
            AnonymousClass1 r3 = new Function2<Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C589@26124L3371:CoreTextField.kt#423gt5");
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)");
                        }
                        Modifier bringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(HeightInLinesModifierKt.heightInLines(SizeKt.m551heightInVpY3zN4$default(Modifier.Companion, textFieldState.m957getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, (Object) null), textStyle, i3, i4), textFieldScrollerPosition, textFieldValue, visualTransformation, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(textFieldState)).then(modifier).then(modifier2), textStyle).then(modifier3).then(modifier4), bringIntoViewRequester);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                        final TextFieldState textFieldState = textFieldState;
                        final boolean z = z;
                        final boolean z2 = z2;
                        final Function1<TextLayoutResult, Unit> function1 = function1;
                        final TextFieldValue textFieldValue = textFieldValue;
                        final OffsetMapping offsetMapping = offsetMapping;
                        final Density density = density;
                        final int i2 = i4;
                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester, ComposableLambdaKt.composableLambda(composer, -363167407, true, new Function2<Composer, Integer, Unit>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                ComposerKt.sourceInformation(composer, "C590@26178L2699,643@28895L327,655@29423L40:CoreTextField.kt#423gt5");
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-363167407, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)");
                                    }
                                    final TextFieldState textFieldState = textFieldState;
                                    final Function1<TextLayoutResult, Unit> function1 = function1;
                                    final TextFieldValue textFieldValue = textFieldValue;
                                    final OffsetMapping offsetMapping = offsetMapping;
                                    final Density density = density;
                                    final int i2 = i2;
                                    MeasurePolicy r12 = new MeasurePolicy() {
                                        /* renamed from: measure-3p2s80s  reason: not valid java name */
                                        public MeasureResult m871measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                            Snapshot makeCurrent;
                                            Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
                                            Intrinsics.checkNotNullParameter(list, "measurables");
                                            Snapshot.Companion companion = Snapshot.Companion;
                                            TextFieldState textFieldState = textFieldState;
                                            Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                                            try {
                                                makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                createNonObservableSnapshot.dispose();
                                                Triple<Integer, Integer, TextLayoutResult> r10 = TextFieldDelegate.Companion.m942layout_EkL_Y$foundation_release(textFieldState.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                int intValue = r10.component1().intValue();
                                                int intValue2 = r10.component2().intValue();
                                                TextLayoutResult component3 = r10.component3();
                                                if (!Intrinsics.areEqual((Object) value, (Object) component3)) {
                                                    textFieldState.setLayoutResult(new TextLayoutResultProxy(component3));
                                                    function1.invoke(component3);
                                                    CoreTextFieldKt.notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
                                                }
                                                textFieldState.m958setMinHeightForSingleLineField0680j_4(density.m5604toDpu2uoSUM(i2 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.INSTANCE);
                                            } catch (Throwable th) {
                                                createNonObservableSnapshot.dispose();
                                                throw th;
                                            }
                                        }

                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
                                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                            Intrinsics.checkNotNullParameter(list, "measurables");
                                            textFieldState.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                            return textFieldState.getTextDelegate().getMaxIntrinsicWidth();
                                        }
                                    };
                                    composer.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
                                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    Density density2 = (Density) consume;
                                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer r3 = Updater.m2444constructorimpl(composer);
                                    Updater.m2451setimpl(r3, r12, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m2451setimpl(r3, density2, ComposeUiNode.Companion.getSetDensity());
                                    Updater.m2451setimpl(r3, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                    Updater.m2451setimpl(r3, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                    boolean z = false;
                                    materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer, 0);
                                    composer.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer, 1017243015, "C:CoreTextField.kt#423gt5");
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    composer.endReplaceableGroup();
                                    composer.endNode();
                                    composer.endReplaceableGroup();
                                    TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                    if (textFieldState.getHandleState() == HandleState.Selection && textFieldState.getLayoutCoordinates() != null) {
                                        LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                                        Intrinsics.checkNotNull(layoutCoordinates);
                                        if (layoutCoordinates.isAttached() && z) {
                                            z = true;
                                        }
                                    }
                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, 8);
                                    if (textFieldState.getHandleState() == HandleState.Cursor && !z2 && z) {
                                        CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer, 8);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }), composer, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            };
            Composer composer2 = composer;
            function3.invoke(ComposableLambdaKt.composableLambda(composer2, 2032502107, true, r3), composer2, Integer.valueOf(((this.$$dirty1 >> 12) & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

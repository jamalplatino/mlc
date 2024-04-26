package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$WeekDays$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ArrayList<Pair<String, String>> $dayNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$WeekDays$1(ArrayList<Pair<String, String>> arrayList) {
        super(2);
        this.$dayNames = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1367@56264L10,1368@56338L1151:DatePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445541615, i, -1, "androidx.compose.material3.WeekDays.<anonymous> (DatePicker.kt:1365)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont());
            final ArrayList<Pair<String, String>> arrayList = this.$dayNames;
            TextKt.ProvideTextStyle(fromToken, ComposableLambdaKt.composableLambda(composer, 2133710592, true, new Function2<Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    Composer composer2 = composer;
                    int i2 = i;
                    ComposerKt.sourceInformation(composer2, "C1369@56388L1091:DatePicker.kt#uh7d8r");
                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2133710592, i2, -1, "androidx.compose.material3.WeekDays.<anonymous>.<anonymous> (DatePicker.kt:1368)");
                        }
                        Alignment alignment = null;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m548defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, DatePickerKt.getRecommendedSizeForAccessibility(), 1, (Object) null), 0.0f, 1, (Object) null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        ArrayList<Pair<String, String>> arrayList = arrayList;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), centerVertically, composer2, 54);
                        int i3 = -1323940314;
                        composer2.startReplaceableGroup(-1323940314);
                        String str = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
                        ComposerKt.sourceInformation(composer2, str);
                        int i4 = 2023513938;
                        String str2 = "C:CompositionLocal.kt#9igjgp";
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str2);
                        Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Density density = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str2);
                        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str2);
                        Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        composer.disableReusing();
                        Composer r6 = Updater.m2444constructorimpl(composer);
                        Updater.m2451setimpl(r6, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2451setimpl(r6, density, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2451setimpl(r6, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2451setimpl(r6, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer.enableReusing();
                        boolean z = false;
                        materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
                        int i5 = 2058660585;
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 178836230, "C:DatePicker.kt#uh7d8r");
                        composer2.startReplaceableGroup(784203502);
                        ComposerKt.sourceInformation(composer2, "*1381@56891L33,1379@56792L655");
                        for (Pair pair : arrayList) {
                            Modifier modifier = Modifier.Companion;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean changed = composer2.changed((Object) pair);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new DatePickerKt$WeekDays$1$1$1$1$1$1(pair);
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceableGroup();
                            Modifier r1 = SizeKt.m565sizeVpY3zN4(SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue), DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility());
                            Alignment center = Alignment.Companion.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, z, composer2, 6);
                            composer2.startReplaceableGroup(i3);
                            ComposerKt.sourceInformation(composer2, str);
                            ComposerKt.sourceInformationMarkerStart(composer2, i4, str2);
                            Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Density density2 = (Density) consume4;
                            ComposerKt.sourceInformationMarkerStart(composer2, i4, str2);
                            Object consume5 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                            ComposerKt.sourceInformationMarkerStart(composer2, i4, str2);
                            Object consume6 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r1);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            composer.disableReusing();
                            Composer r62 = Updater.m2444constructorimpl(composer);
                            Updater.m2451setimpl(r62, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2451setimpl(r62, density2, ComposeUiNode.Companion.getSetDensity());
                            Updater.m2451setimpl(r62, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                            Updater.m2451setimpl(r62, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                            composer.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, Integer.valueOf(z ? 1 : 0));
                            composer2.startReplaceableGroup(i5);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScope boxScope = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -540917601, "C1387@57224L201:DatePicker.kt#uh7d8r");
                            TextKt.m1727Text4IGK_g((String) pair.getSecond(), SizeKt.wrapContentSize$default(Modifier.Companion, alignment, z, 3, alignment), 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m5499boximpl(TextAlign.Companion.m5506getCentere0LSkKk()), 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 48, 0, 130556);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer2 = composer;
                            i5 = i5;
                            z = z;
                            str2 = str2;
                            i4 = 2023513938;
                            str = str;
                            i3 = i3;
                            alignment = alignment;
                        }
                        composer.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

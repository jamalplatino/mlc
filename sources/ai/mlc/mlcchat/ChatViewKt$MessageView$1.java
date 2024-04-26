package ai.mlc.mlcchat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$MessageView$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MessageData $messageData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$MessageView$1(MessageData messageData) {
        super(2);
        this.$messageData = messageData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-451816481, i2, -1, "ai.mlc.mlcchat.MessageView.<anonymous> (ChatView.kt:137)");
            }
            if (this.$messageData.getRole() == MessageRole.Bot) {
                composer2.startReplaceableGroup(-255108526);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                MessageData messageData = this.$messageData;
                composer2.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, Alignment.Companion.getTop(), composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
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
                Composer r7 = Updater.m2444constructorimpl(composer);
                Updater.m2451setimpl(r7, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r7, density, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r7, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r7, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScope rowScope = RowScopeInstance.INSTANCE;
                String text = messageData.getText();
                int r13 = TextAlign.Companion.m5509getLefte0LSkKk();
                float f = (float) 5;
                TextKt.m1727Text4IGK_g(text, SizeKt.m570widthInVpY3zN4$default(PaddingKt.m493padding3ABfNKs(BackgroundKt.m181backgroundbw27NRU(SizeKt.wrapContentWidth$default(Modifier.Companion, (Alignment.Horizontal) null, false, 3, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1205getSecondaryContainer0d7_KjU(), RoundedCornerShapeKt.m851RoundedCornerShape0680j_4(Dp.m5626constructorimpl(f))), Dp.m5626constructorimpl(f)), 0.0f, Dp.m5626constructorimpl((float) 300), 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1194getOnSecondaryContainer0d7_KjU(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m5499boximpl(r13), 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 130552);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                Composer composer3 = composer;
                composer3.startReplaceableGroup(-255107766);
                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                MessageData messageData2 = this.$messageData;
                composer3.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = composer3.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(fillMaxWidth$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer r72 = Updater.m2444constructorimpl(composer);
                Updater.m2451setimpl(r72, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r72, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r72, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r72, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer3, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                String text2 = messageData2.getText();
                int r132 = TextAlign.Companion.m5510getRighte0LSkKk();
                float f2 = (float) 5;
                TextKt.m1727Text4IGK_g(text2, SizeKt.m570widthInVpY3zN4$default(PaddingKt.m493padding3ABfNKs(BackgroundKt.m181backgroundbw27NRU(SizeKt.wrapContentWidth$default(Modifier.Companion, (Alignment.Horizontal) null, false, 3, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).m1202getPrimaryContainer0d7_KjU(), RoundedCornerShapeKt.m851RoundedCornerShape0680j_4(Dp.m5626constructorimpl(f2))), Dp.m5626constructorimpl(f2)), 0.0f, Dp.m5626constructorimpl((float) 300), 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).m1192getOnPrimaryContainer0d7_KjU(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m5499boximpl(r132), 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 130552);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

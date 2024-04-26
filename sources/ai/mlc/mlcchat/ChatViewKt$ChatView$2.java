package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
final class ChatViewKt$ChatView$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AppViewModel.ChatState $chatState;
    final /* synthetic */ NavController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatViewKt$ChatView$2(AppViewModel.ChatState chatState, NavController navController) {
        super(2);
        this.$chatState = chatState;
        this.$navController = navController;
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
                ComposerKt.traceEventStart(58179934, i2, -1, "ai.mlc.mlcchat.ChatView.<anonymous> (ChatView.kt:56)");
            }
            TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.m1854topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1201getPrimary0d7_KjU(), 0, 0, 0, 0, composer, TopAppBarDefaults.$stable << 15, 30);
            final AppViewModel.ChatState chatState = this.$chatState;
            final AppViewModel.ChatState chatState2 = this.$chatState;
            final NavController navController = this.$navController;
            final AppViewModel.ChatState chatState3 = this.$chatState;
            AppBarKt.TopAppBar(ComposableLambdaKt.composableLambda(composer2, -199322342, true, new Function2<Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-199322342, i2, -1, "ai.mlc.mlcchat.ChatView.<anonymous>.<anonymous> (ChatView.kt:58)");
                        }
                        TextKt.m1727Text4IGK_g("MLCChat: " + ((String) StringsKt.split$default((CharSequence) chatState.getModelName().getValue(), new String[]{"-"}, false, 0, 6, (Object) null).get(0)), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1191getOnPrimary0d7_KjU(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), (Modifier) null, ComposableLambdaKt.composableLambda(composer2, 218566360, true, new Function2<Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(218566360, i, -1, "ai.mlc.mlcchat.ChatView.<anonymous>.<anonymous> (ChatView.kt:65)");
                        }
                        final NavController navController = navController;
                        IconButtonKt.IconButton(new Function0<Unit>() {
                            public final void invoke() {
                                navController.popBackStack();
                            }
                        }, (Modifier) null, chatState2.interruptable(), (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatViewKt.INSTANCE.m4getLambda1$app_release(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), ComposableLambdaKt.composableLambda(composer2, 531276559, true, new Function3<RowScope, Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope rowScope, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(rowScope, "$this$TopAppBar");
                    if ((i & 81) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(531276559, i, -1, "ai.mlc.mlcchat.ChatView.<anonymous>.<anonymous> (ChatView.kt:77)");
                        }
                        final AppViewModel.ChatState chatState = chatState3;
                        IconButtonKt.IconButton(new Function0<Unit>() {
                            public final void invoke() {
                                chatState.requestResetChat();
                            }
                        }, (Modifier) null, chatState3.interruptable(), (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatViewKt.INSTANCE.m5getLambda2$app_release(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), (WindowInsets) null, topAppBarColors, (TopAppBarScrollBehavior) null, composer, 3462, 82);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}

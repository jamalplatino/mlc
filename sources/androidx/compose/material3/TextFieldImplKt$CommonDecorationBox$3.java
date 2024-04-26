package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextStyle $bodyLarge;
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material3.TextFieldType[] r0 = androidx.compose.material3.TextFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function28, boolean z3, PaddingValues paddingValues, int i2, boolean z4, TextStyle textStyle, TextStyle textStyle2, Function2<? super Composer, ? super Integer, Unit> function29) {
        super(7);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i;
        this.$prefix = function23;
        this.$suffix = function24;
        this.$leadingIcon = function25;
        this.$trailingIcon = function26;
        this.$supportingText = function27;
        this.$type = textFieldType;
        this.$innerTextField = function28;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodyLarge = textStyle;
        this.$bodySmall = textStyle2;
        this.$container = function29;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m1717invokeeopBjH0(((Number) obj).floatValue(), ((Color) obj2).m2831unboximpl(), ((Color) obj3).m2831unboximpl(), ((Number) obj4).floatValue(), ((Number) obj5).floatValue(), (Composer) obj6, ((Number) obj7).intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-eopBjH0  reason: not valid java name */
    public final void m1717invokeeopBjH0(float f, long j, long j2, float f2, float f3, Composer composer, int i) {
        int i2;
        Function2 function2;
        boolean z;
        Function3 function3;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        Composer composer2 = composer;
        int i3 = i;
        ComposerKt.sourceInformation(composer2, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)146@6118L48,160@6710L48,177@7510L30,178@7596L43,180@7679L53,187@7980L54,195@8299L56:TextFieldImpl.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (composer2.changed(f4) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        long j3 = j;
        if ((i3 & 112) == 0) {
            i2 |= composer2.changed(j3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= composer2.changed(j2) ? 256 : 128;
        } else {
            long j4 = j2;
        }
        if ((i3 & 7168) == 0) {
            i2 |= composer2.changed(f5) ? 2048 : 1024;
        }
        if ((i3 & 57344) == 0) {
            i2 |= composer2.changed(f6) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((374491 & i4) != 74898 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1290853831, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:113)");
            }
            Function2<Composer, Integer, Unit> function22 = this.$label;
            if (function22 != null) {
                TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 textFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 = r1;
                z = true;
                TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 textFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$12 = new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f, j2, function22, i4, this.$shouldOverrideTextStyleColor, j);
                function2 = ComposableLambdaKt.composableLambda(composer2, -382297919, true, textFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1);
            } else {
                z = true;
                function2 = null;
            }
            if (this.$placeholder == null || this.$transformedText.length() != 0 || f5 <= 0.0f) {
                function3 = null;
            } else {
                TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 textFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 = r1;
                TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 textFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$12 = new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f2, this.$colors, this.$enabled, this.$isError, this.$interactionSource, this.$$dirty1, this.$placeholder, this.$$dirty);
                function3 = ComposableLambdaKt.composableLambda(composer2, -524658155, z, textFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1);
            }
            TextFieldColors textFieldColors = this.$colors;
            boolean z2 = this.$enabled;
            boolean z3 = this.$isError;
            InteractionSource interactionSource = this.$interactionSource;
            int i5 = this.$$dirty1;
            Function2 composableLambda = (this.$prefix == null || f6 <= 0.0f) ? null : ComposableLambdaKt.composableLambda(composer2, 1824482619, z, new TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(f3, textFieldColors.prefixColor$material3_release(z2, z3, interactionSource, composer, ((i5 >> 6) & 14) | ((i5 >> 6) & 112) | ((i5 >> 6) & 896) | ((i5 >> 9) & 7168)).getValue().m2831unboximpl(), this.$bodyLarge, this.$prefix, this.$$dirty));
            TextFieldColors textFieldColors2 = this.$colors;
            boolean z4 = this.$enabled;
            boolean z5 = this.$isError;
            InteractionSource interactionSource2 = this.$interactionSource;
            int i6 = this.$$dirty1;
            Function2 composableLambda2 = (this.$suffix == null || f6 <= 0.0f) ? null : ComposableLambdaKt.composableLambda(composer2, 907456412, z, new TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(f3, textFieldColors2.suffixColor$material3_release(z4, z5, interactionSource2, composer, ((i6 >> 6) & 14) | ((i6 >> 6) & 112) | ((i6 >> 6) & 896) | ((i6 >> 9) & 7168)).getValue().m2831unboximpl(), this.$bodyLarge, this.$suffix, this.$$dirty));
            String r1 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1607getDefaultErrorMessageadMyvUU(), composer2, 6);
            Modifier modifier = Modifier.Companion;
            Boolean valueOf = Boolean.valueOf(this.$isError);
            boolean z6 = this.$isError;
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer2.changed((Object) valueOf) | composer2.changed((Object) r1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z6, r1);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, z ? 1 : 0, (Object) null);
            TextFieldColors textFieldColors3 = this.$colors;
            boolean z7 = this.$enabled;
            boolean z8 = this.$isError;
            InteractionSource interactionSource3 = this.$interactionSource;
            int i7 = this.$$dirty1;
            long r2 = textFieldColors3.leadingIconColor$material3_release(z7, z8, interactionSource3, composer, ((i7 >> 6) & 14) | ((i7 >> 6) & 112) | ((i7 >> 6) & 896) | ((i7 >> 9) & 7168)).getValue().m2831unboximpl();
            Function2<Composer, Integer, Unit> function23 = this.$leadingIcon;
            Function2 composableLambda3 = function23 != null ? ComposableLambdaKt.composableLambda(composer2, 90769583, z, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(r2, function23)) : null;
            TextFieldColors textFieldColors4 = this.$colors;
            boolean z9 = this.$enabled;
            boolean z10 = this.$isError;
            InteractionSource interactionSource4 = this.$interactionSource;
            int i8 = this.$$dirty1;
            long r22 = textFieldColors4.trailingIconColor$material3_release(z9, z10, interactionSource4, composer, ((i8 >> 9) & 7168) | ((i8 >> 6) & 14) | ((i8 >> 6) & 112) | ((i8 >> 6) & 896)).getValue().m2831unboximpl();
            Function2<Composer, Integer, Unit> function24 = this.$trailingIcon;
            Function2 composableLambda4 = function24 != null ? ComposableLambdaKt.composableLambda(composer2, 2077796155, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(r22, function24)) : null;
            TextFieldColors textFieldColors5 = this.$colors;
            boolean z11 = this.$enabled;
            boolean z12 = this.$isError;
            InteractionSource interactionSource5 = this.$interactionSource;
            int i9 = this.$$dirty1;
            int i10 = i4;
            long r23 = textFieldColors5.supportingTextColor$material3_release(z11, z12, interactionSource5, composer, ((i9 >> 9) & 7168) | ((i9 >> 6) & 14) | ((i9 >> 6) & 112) | ((i9 >> 6) & 896)).getValue().m2831unboximpl();
            Function2<Composer, Integer, Unit> function25 = this.$supportingText;
            Function2 composableLambda5 = function25 != null ? ComposableLambdaKt.composableLambda(composer2, -1531019900, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(r23, this.$bodySmall, function25)) : null;
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
            if (i11 == 1) {
                Composer composer3 = composer2;
                composer3.startReplaceableGroup(404043011);
                ComposerKt.sourceInformation(composer3, "211@8928L680");
                Function2<Composer, Integer, Unit> function26 = this.$innerTextField;
                boolean z13 = this.$singleLine;
                PaddingValues paddingValues = this.$contentPadding;
                int i12 = this.$$dirty1;
                TextFieldKt.TextFieldLayout(semantics$default, function26, function2, function3, composableLambda3, composableLambda4, composableLambda, composableLambda2, z13, f, ComposableLambdaKt.composableLambda(composer2, -2124779163, true, new TextFieldImplKt$CommonDecorationBox$3$containerWithId$1(this.$container, this.$$dirty1)), composableLambda5, paddingValues, composer, ((this.$$dirty >> 3) & 112) | ((i12 << 21) & 234881024) | ((i10 << 27) & 1879048192), ((i12 >> 9) & 896) | 6);
                composer.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i11 != 2) {
                composer2.startReplaceableGroup(404045731);
                composer.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            } else {
                composer2.startReplaceableGroup(404044017);
                ComposerKt.sourceInformation(composer2, "229@9730L38,252@10751L420,241@10197L1154");
                composer2.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2629boximpl(Size.Companion.m2650getZeroNHjbRc()), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                Function2 composableLambda6 = ComposableLambdaKt.composableLambda(composer2, 1902535592, true, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(mutableState, this.$contentPadding, this.$container, this.$$dirty1));
                Function2<Composer, Integer, Unit> function27 = this.$innerTextField;
                boolean z14 = this.$singleLine;
                Float valueOf2 = Float.valueOf(f);
                composer2.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = composer2.changed((Object) valueOf2) | composer2.changed((Object) mutableState);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new TextFieldImplKt$CommonDecorationBox$3$1$1(f4, mutableState);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                PaddingValues paddingValues2 = this.$contentPadding;
                boolean z15 = z14;
                int i13 = this.$$dirty1;
                Composer composer4 = composer2;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function27, function3, function2, composableLambda3, composableLambda4, composableLambda, composableLambda2, z15, f, (Function1) rememberedValue3, composableLambda6, composableLambda5, paddingValues2, composer, ((this.$$dirty >> 3) & 112) | ((i13 << 21) & 234881024) | ((i10 << 27) & 1879048192), ((i13 >> 6) & 7168) | 48);
                composer.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
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

package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b|\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bð\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010 Jµ\u0002\u0010|\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\t\u0010\u001a\u00030\u0001H\u0016R4\u0010\u0010\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R4\u0010\u0019\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R4\u0010\u001b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R4\u0010\u0018\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R4\u0010\u0007\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R4\u0010\u0017\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u0010'\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R4\u0010\u0011\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b9\u0010'\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R4\u0010\u001a\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010'\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R4\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R4\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bB\u0010'\u001a\u0004\b@\u0010#\"\u0004\bA\u0010%R4\u0010\u0006\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bE\u0010'\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R4\u0010\t\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bH\u0010'\u001a\u0004\bF\u0010#\"\u0004\bG\u0010%R4\u0010\u000b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bK\u0010'\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%R4\u0010\u0013\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bN\u0010'\u001a\u0004\bL\u0010#\"\u0004\bM\u0010%R4\u0010\u0015\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bQ\u0010'\u001a\u0004\bO\u0010#\"\u0004\bP\u0010%R4\u0010\r\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bT\u0010'\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R4\u0010\u000f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bW\u0010'\u001a\u0004\bU\u0010#\"\u0004\bV\u0010%R4\u0010\u001d\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bZ\u0010'\u001a\u0004\bX\u0010#\"\u0004\bY\u0010%R4\u0010\u001e\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b]\u0010'\u001a\u0004\b[\u0010#\"\u0004\b\\\u0010%R4\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b`\u0010'\u001a\u0004\b^\u0010#\"\u0004\b_\u0010%R4\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bc\u0010'\u001a\u0004\ba\u0010#\"\u0004\bb\u0010%R4\u0010\u001f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bf\u0010'\u001a\u0004\bd\u0010#\"\u0004\be\u0010%R4\u0010\b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bi\u0010'\u001a\u0004\bg\u0010#\"\u0004\bh\u0010%R4\u0010\n\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bl\u0010'\u001a\u0004\bj\u0010#\"\u0004\bk\u0010%R4\u0010\u0012\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bo\u0010'\u001a\u0004\bm\u0010#\"\u0004\bn\u0010%R4\u0010\u0016\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\br\u0010'\u001a\u0004\bp\u0010#\"\u0004\bq\u0010%R4\u0010\u0014\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bu\u0010'\u001a\u0004\bs\u0010#\"\u0004\bt\u0010%R4\u0010\f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bx\u0010'\u001a\u0004\bv\u0010#\"\u0004\bw\u0010%R4\u0010\u000e\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b{\u0010'\u001a\u0004\by\u0010#\"\u0004\bz\u0010%\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material3_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material3_release", "error$delegate", "getErrorContainer-0d7_KjU", "setErrorContainer-8_81llA$material3_release", "errorContainer$delegate", "getInverseOnSurface-0d7_KjU", "setInverseOnSurface-8_81llA$material3_release", "inverseOnSurface$delegate", "getInversePrimary-0d7_KjU", "setInversePrimary-8_81llA$material3_release", "inversePrimary$delegate", "getInverseSurface-0d7_KjU", "setInverseSurface-8_81llA$material3_release", "inverseSurface$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material3_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material3_release", "onError$delegate", "getOnErrorContainer-0d7_KjU", "setOnErrorContainer-8_81llA$material3_release", "onErrorContainer$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material3_release", "onPrimary$delegate", "getOnPrimaryContainer-0d7_KjU", "setOnPrimaryContainer-8_81llA$material3_release", "onPrimaryContainer$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material3_release", "onSecondary$delegate", "getOnSecondaryContainer-0d7_KjU", "setOnSecondaryContainer-8_81llA$material3_release", "onSecondaryContainer$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material3_release", "onSurface$delegate", "getOnSurfaceVariant-0d7_KjU", "setOnSurfaceVariant-8_81llA$material3_release", "onSurfaceVariant$delegate", "getOnTertiary-0d7_KjU", "setOnTertiary-8_81llA$material3_release", "onTertiary$delegate", "getOnTertiaryContainer-0d7_KjU", "setOnTertiaryContainer-8_81llA$material3_release", "onTertiaryContainer$delegate", "getOutline-0d7_KjU", "setOutline-8_81llA$material3_release", "outline$delegate", "getOutlineVariant-0d7_KjU", "setOutlineVariant-8_81llA$material3_release", "outlineVariant$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material3_release", "primary$delegate", "getPrimaryContainer-0d7_KjU", "setPrimaryContainer-8_81llA$material3_release", "primaryContainer$delegate", "getScrim-0d7_KjU", "setScrim-8_81llA$material3_release", "scrim$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material3_release", "secondary$delegate", "getSecondaryContainer-0d7_KjU", "setSecondaryContainer-8_81llA$material3_release", "secondaryContainer$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material3_release", "surface$delegate", "getSurfaceTint-0d7_KjU", "setSurfaceTint-8_81llA$material3_release", "surfaceTint$delegate", "getSurfaceVariant-0d7_KjU", "setSurfaceVariant-8_81llA$material3_release", "surfaceVariant$delegate", "getTertiary-0d7_KjU", "setTertiary-8_81llA$material3_release", "tertiary$delegate", "getTertiaryContainer-0d7_KjU", "setTertiaryContainer-8_81llA$material3_release", "tertiaryContainer$delegate", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ColorScheme.kt */
public final class ColorScheme {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState errorContainer$delegate;
    private final MutableState inverseOnSurface$delegate;
    private final MutableState inversePrimary$delegate;
    private final MutableState inverseSurface$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onErrorContainer$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onPrimaryContainer$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSecondaryContainer$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState onSurfaceVariant$delegate;
    private final MutableState onTertiary$delegate;
    private final MutableState onTertiaryContainer$delegate;
    private final MutableState outline$delegate;
    private final MutableState outlineVariant$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryContainer$delegate;
    private final MutableState scrim$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryContainer$delegate;
    private final MutableState surface$delegate;
    private final MutableState surfaceTint$delegate;
    private final MutableState surfaceVariant$delegate;
    private final MutableState tertiary$delegate;
    private final MutableState tertiaryContainer$delegate;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.inversePrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceTint$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseOnSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.errorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.onErrorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.outline$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.outlineVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.scrim$delegate = SnapshotStateKt.mutableStateOf(Color.m2811boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m1201getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1230setPrimary8_81llA$material3_release(long j) {
        this.primary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m1191getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1220setOnPrimary8_81llA$material3_release(long j) {
        this.onPrimary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1202getPrimaryContainer0d7_KjU() {
        return ((Color) this.primaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1231setPrimaryContainer8_81llA$material3_release(long j) {
        this.primaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1192getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.onPrimaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1221setOnPrimaryContainer8_81llA$material3_release(long j) {
        this.onPrimaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m1186getInversePrimary0d7_KjU() {
        return ((Color) this.inversePrimary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setInversePrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1215setInversePrimary8_81llA$material3_release(long j) {
        this.inversePrimary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m1204getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m1233setSecondary8_81llA$material3_release(long j) {
        this.secondary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m1193getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m1222setOnSecondary8_81llA$material3_release(long j) {
        this.onSecondary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1205getSecondaryContainer0d7_KjU() {
        return ((Color) this.secondaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1234setSecondaryContainer8_81llA$material3_release(long j) {
        this.secondaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1194getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.onSecondaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1223setOnSecondaryContainer8_81llA$material3_release(long j) {
        this.onSecondaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m1209getTertiary0d7_KjU() {
        return ((Color) this.tertiary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m1238setTertiary8_81llA$material3_release(long j) {
        this.tertiary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m1197getOnTertiary0d7_KjU() {
        return ((Color) this.onTertiary$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m1226setOnTertiary8_81llA$material3_release(long j) {
        this.onTertiary$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1210getTertiaryContainer0d7_KjU() {
        return ((Color) this.tertiaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1239setTertiaryContainer8_81llA$material3_release(long j) {
        this.tertiaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1198getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.onTertiaryContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1227setOnTertiaryContainer8_81llA$material3_release(long j) {
        this.onTertiaryContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m1182getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m1211setBackground8_81llA$material3_release(long j) {
        this.background$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m1188getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m1217setOnBackground8_81llA$material3_release(long j) {
        this.onBackground$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m1206getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1235setSurface8_81llA$material3_release(long j) {
        this.surface$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1195getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1224setOnSurface8_81llA$material3_release(long j) {
        this.onSurface$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m1208getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1237setSurfaceVariant8_81llA$material3_release(long j) {
        this.surfaceVariant$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m1196getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.onSurfaceVariant$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1225setOnSurfaceVariant8_81llA$material3_release(long j) {
        this.onSurfaceVariant$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m1207getSurfaceTint0d7_KjU() {
        return ((Color) this.surfaceTint$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setSurfaceTint-8_81llA$material3_release  reason: not valid java name */
    public final void m1236setSurfaceTint8_81llA$material3_release(long j) {
        this.surfaceTint$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m1187getInverseSurface0d7_KjU() {
        return ((Color) this.inverseSurface$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setInverseSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1216setInverseSurface8_81llA$material3_release(long j) {
        this.inverseSurface$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1185getInverseOnSurface0d7_KjU() {
        return ((Color) this.inverseOnSurface$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setInverseOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1214setInverseOnSurface8_81llA$material3_release(long j) {
        this.inverseOnSurface$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m1183getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setError-8_81llA$material3_release  reason: not valid java name */
    public final void m1212setError8_81llA$material3_release(long j) {
        this.error$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m1189getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnError-8_81llA$material3_release  reason: not valid java name */
    public final void m1218setOnError8_81llA$material3_release(long j) {
        this.onError$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m1184getErrorContainer0d7_KjU() {
        return ((Color) this.errorContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1213setErrorContainer8_81llA$material3_release(long j) {
        this.errorContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m1190getOnErrorContainer0d7_KjU() {
        return ((Color) this.onErrorContainer$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOnErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1219setOnErrorContainer8_81llA$material3_release(long j) {
        this.onErrorContainer$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m1199getOutline0d7_KjU() {
        return ((Color) this.outline$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOutline-8_81llA$material3_release  reason: not valid java name */
    public final void m1228setOutline8_81llA$material3_release(long j) {
        this.outline$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m1200getOutlineVariant0d7_KjU() {
        return ((Color) this.outlineVariant$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setOutlineVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1229setOutlineVariant8_81llA$material3_release(long j) {
        this.outlineVariant$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m1203getScrim0d7_KjU() {
        return ((Color) this.scrim$delegate.getValue()).m2831unboximpl();
    }

    /* renamed from: setScrim-8_81llA$material3_release  reason: not valid java name */
    public final void m1232setScrim8_81llA$material3_release(long j) {
        this.scrim$delegate.setValue(Color.m2811boximpl(j));
    }

    /* renamed from: copy-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m1180copyG1PFcw$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long j30;
        int i2 = i;
        long r1 = (i2 & 1) != 0 ? colorScheme.m1201getPrimary0d7_KjU() : j;
        long r3 = (i2 & 2) != 0 ? colorScheme.m1191getOnPrimary0d7_KjU() : j2;
        long r5 = (i2 & 4) != 0 ? colorScheme.m1202getPrimaryContainer0d7_KjU() : j3;
        long r7 = (i2 & 8) != 0 ? colorScheme.m1192getOnPrimaryContainer0d7_KjU() : j4;
        long r9 = (i2 & 16) != 0 ? colorScheme.m1186getInversePrimary0d7_KjU() : j5;
        long r11 = (i2 & 32) != 0 ? colorScheme.m1204getSecondary0d7_KjU() : j6;
        long r13 = (i2 & 64) != 0 ? colorScheme.m1193getOnSecondary0d7_KjU() : j7;
        long r60 = (i2 & 128) != 0 ? colorScheme.m1205getSecondaryContainer0d7_KjU() : j8;
        long r62 = (i2 & 256) != 0 ? colorScheme.m1194getOnSecondaryContainer0d7_KjU() : j9;
        long r64 = (i2 & 512) != 0 ? colorScheme.m1209getTertiary0d7_KjU() : j10;
        long r66 = (i2 & 1024) != 0 ? colorScheme.m1197getOnTertiary0d7_KjU() : j11;
        long r68 = (i2 & 2048) != 0 ? colorScheme.m1210getTertiaryContainer0d7_KjU() : j12;
        long r70 = (i2 & 4096) != 0 ? colorScheme.m1198getOnTertiaryContainer0d7_KjU() : j13;
        long r72 = (i2 & 8192) != 0 ? colorScheme.m1182getBackground0d7_KjU() : j14;
        long r15 = (i2 & 16384) != 0 ? colorScheme.m1188getOnBackground0d7_KjU() : j15;
        long r17 = (i2 & 32768) != 0 ? colorScheme.m1206getSurface0d7_KjU() : j16;
        long r19 = (i2 & 65536) != 0 ? colorScheme.m1195getOnSurface0d7_KjU() : j17;
        long r21 = (i2 & 131072) != 0 ? colorScheme.m1208getSurfaceVariant0d7_KjU() : j18;
        long r23 = (i2 & 262144) != 0 ? colorScheme.m1196getOnSurfaceVariant0d7_KjU() : j19;
        long r25 = (i2 & 524288) != 0 ? colorScheme.m1207getSurfaceTint0d7_KjU() : j20;
        long r27 = (i2 & 1048576) != 0 ? colorScheme.m1187getInverseSurface0d7_KjU() : j21;
        long r29 = (i2 & 2097152) != 0 ? colorScheme.m1185getInverseOnSurface0d7_KjU() : j22;
        long r31 = (i2 & 4194304) != 0 ? colorScheme.m1183getError0d7_KjU() : j23;
        long r33 = (i2 & 8388608) != 0 ? colorScheme.m1189getOnError0d7_KjU() : j24;
        long r35 = (i2 & 16777216) != 0 ? colorScheme.m1184getErrorContainer0d7_KjU() : j25;
        long r37 = (i2 & 33554432) != 0 ? colorScheme.m1190getOnErrorContainer0d7_KjU() : j26;
        long r39 = (i2 & 67108864) != 0 ? colorScheme.m1199getOutline0d7_KjU() : j27;
        long r41 = (i2 & 134217728) != 0 ? colorScheme.m1200getOutlineVariant0d7_KjU() : j28;
        if ((i2 & 268435456) != 0) {
            j30 = colorScheme.m1203getScrim0d7_KjU();
        } else {
            j30 = j29;
        }
        return colorScheme.m1181copyG1PFcw(r1, r3, r5, r7, r9, r11, r13, r60, r62, r64, r66, r68, r70, r72, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, j30);
    }

    /* renamed from: copy-G1PFc-w  reason: not valid java name */
    public final ColorScheme m1181copyG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        sb.append(Color.m2829toStringimpl(m1201getPrimary0d7_KjU())).append("onPrimary=").append(Color.m2829toStringimpl(m1191getOnPrimary0d7_KjU())).append("primaryContainer=").append(Color.m2829toStringimpl(m1202getPrimaryContainer0d7_KjU())).append("onPrimaryContainer=").append(Color.m2829toStringimpl(m1192getOnPrimaryContainer0d7_KjU())).append("inversePrimary=").append(Color.m2829toStringimpl(m1186getInversePrimary0d7_KjU())).append("secondary=").append(Color.m2829toStringimpl(m1204getSecondary0d7_KjU())).append("onSecondary=").append(Color.m2829toStringimpl(m1193getOnSecondary0d7_KjU())).append("secondaryContainer=").append(Color.m2829toStringimpl(m1205getSecondaryContainer0d7_KjU())).append("onSecondaryContainer=").append(Color.m2829toStringimpl(m1194getOnSecondaryContainer0d7_KjU())).append("tertiary=").append(Color.m2829toStringimpl(m1209getTertiary0d7_KjU())).append("onTertiary=").append(Color.m2829toStringimpl(m1197getOnTertiary0d7_KjU())).append("tertiaryContainer=");
        sb.append(Color.m2829toStringimpl(m1210getTertiaryContainer0d7_KjU())).append("onTertiaryContainer=").append(Color.m2829toStringimpl(m1198getOnTertiaryContainer0d7_KjU())).append("background=").append(Color.m2829toStringimpl(m1182getBackground0d7_KjU())).append("onBackground=").append(Color.m2829toStringimpl(m1188getOnBackground0d7_KjU())).append("surface=").append(Color.m2829toStringimpl(m1206getSurface0d7_KjU())).append("onSurface=").append(Color.m2829toStringimpl(m1195getOnSurface0d7_KjU())).append("surfaceVariant=").append(Color.m2829toStringimpl(m1208getSurfaceVariant0d7_KjU())).append("onSurfaceVariant=").append(Color.m2829toStringimpl(m1196getOnSurfaceVariant0d7_KjU())).append("surfaceTint=").append(Color.m2829toStringimpl(m1207getSurfaceTint0d7_KjU())).append("inverseSurface=").append(Color.m2829toStringimpl(m1187getInverseSurface0d7_KjU())).append("inverseOnSurface=").append(Color.m2829toStringimpl(m1185getInverseOnSurface0d7_KjU())).append("error=").append(Color.m2829toStringimpl(m1183getError0d7_KjU()));
        sb.append("onError=").append(Color.m2829toStringimpl(m1189getOnError0d7_KjU())).append("errorContainer=").append(Color.m2829toStringimpl(m1184getErrorContainer0d7_KjU())).append("onErrorContainer=").append(Color.m2829toStringimpl(m1190getOnErrorContainer0d7_KjU())).append("outline=").append(Color.m2829toStringimpl(m1199getOutline0d7_KjU())).append("outlineVariant=").append(Color.m2829toStringimpl(m1200getOutlineVariant0d7_KjU())).append("scrim=").append(Color.m2829toStringimpl(m1203getScrim0d7_KjU())).append(')');
        return sb.toString();
    }
}

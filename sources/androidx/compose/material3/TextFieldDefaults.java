package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010'J¦\u0002\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;J7\u0010<\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010'JS\u0010=\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0002\u0010B\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010CJî\u0001\u0010B\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010DJ¦\u0002\u0010E\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;Jø\u0001\u0010E\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010FJÃ\u0003\u0010%\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\b\b\u0002\u0010L\u001a\u00020H2\b\b\u0002\u0010M\u001a\u00020H2\b\b\u0002\u0010N\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ;\u0010v\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J;\u0010}\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010|J\u0003\u0010\u001a\u00020&2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J¶\u0003\u0010\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J?\u0010\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010|J?\u0010\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010|J\u0003\u0010\u0001\u001a\u00020&2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J³\u0003\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\t\b\u0002\u0010\u0001\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J?\u0010\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010|J?\u0010\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010|JT\u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\t\b\u0002\u0010\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0001\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "OutlinedBorderContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldColors", "textColor", "containerColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "placeholderColor", "outlinedTextFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldColors", "textFieldColors-eS1Emto", "textFieldColors-M37tBTI", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldDefaults.kt */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5626constructorimpl((float) 56);
    private static final float MinWidth = Dp.m5626constructorimpl((float) 280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m1688getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m1689getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1699getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m1700getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1701getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1702getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1703getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m1704getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1941327459);
        ComposerKt.sourceInformation(composer, "C57@2544L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:57)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ea, code lost:
        if ((r27 & 16) != 0) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ContainerBox(boolean r20, boolean r21, androidx.compose.foundation.interaction.InteractionSource r22, androidx.compose.material3.TextFieldColors r23, androidx.compose.ui.graphics.Shape r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r19 = this;
            r10 = r22
            r11 = r23
            r12 = r26
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 918564008(0x36c02ca8, float:5.7272446E-6)
            r1 = r25
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ContainerBox)P(1,3,2)100@4155L5,104@4239L51,102@4178L203:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r12 | 6
            r14 = r20
            goto L_0x003b
        L_0x0029:
            r1 = r12 & 14
            r14 = r20
            if (r1 != 0) goto L_0x003a
            boolean r1 = r13.changed((boolean) r14)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r12
            goto L_0x003b
        L_0x003a:
            r1 = r12
        L_0x003b:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            r15 = r21
            goto L_0x0056
        L_0x0044:
            r2 = r12 & 112(0x70, float:1.57E-43)
            r15 = r21
            if (r2 != 0) goto L_0x0056
            boolean r2 = r13.changed((boolean) r15)
            if (r2 == 0) goto L_0x0053
            r2 = 32
            goto L_0x0055
        L_0x0053:
            r2 = 16
        L_0x0055:
            r1 = r1 | r2
        L_0x0056:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x005d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006d
            boolean r2 = r13.changed((java.lang.Object) r10)
            if (r2 == 0) goto L_0x006a
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r2
        L_0x006d:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x0074
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0084
            boolean r2 = r13.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x009f
            r2 = r27 & 16
            if (r2 != 0) goto L_0x0099
            r2 = r24
            boolean r3 = r13.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x009b
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r2 = r24
        L_0x009b:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r3
            goto L_0x00a1
        L_0x009f:
            r2 = r24
        L_0x00a1:
            r3 = r27 & 32
            if (r3 == 0) goto L_0x00ab
            r3 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r3
            r9 = r19
            goto L_0x00be
        L_0x00ab:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r12
            r9 = r19
            if (r3 != 0) goto L_0x00be
            boolean r3 = r13.changed((java.lang.Object) r9)
            if (r3 == 0) goto L_0x00bb
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r3
        L_0x00be:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r1
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r4) goto L_0x00d4
            boolean r3 = r13.getSkipping()
            if (r3 != 0) goto L_0x00ce
            goto L_0x00d4
        L_0x00ce:
            r13.skipToGroupEnd()
            r6 = r2
            goto L_0x015f
        L_0x00d4:
            r13.startDefaults()
            r3 = r12 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r13.getDefaultsInvalid()
            if (r3 == 0) goto L_0x00e5
            goto L_0x00ed
        L_0x00e5:
            r13.skipToGroupEnd()
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f9
            goto L_0x00f8
        L_0x00ed:
            r3 = r27 & 16
            if (r3 == 0) goto L_0x00f9
            androidx.compose.material3.TextFieldDefaults r2 = INSTANCE
            r3 = 6
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r13, r3)
        L_0x00f8:
            r1 = r1 & r4
        L_0x00f9:
            r8 = r2
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x010a
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:95)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x010a:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            r6 = r0
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r23
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r13
            androidx.compose.runtime.State r0 = r0.containerColor$material3_release(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.BackgroundKt.m181backgroundbw27NRU(r6, r0, r8)
            r6 = 0
            r7 = 0
            r16 = 48
            r17 = 0
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r18 = r8
            r8 = r16
            r9 = r17
            androidx.compose.ui.Modifier r0 = m1690indicatorLinegv0btCI$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r13, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x015d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x015d:
            r6 = r18
        L_0x015f:
            androidx.compose.runtime.ScopeUpdateScope r9 = r13.endRestartGroup()
            if (r9 != 0) goto L_0x0166
            goto L_0x017f
        L_0x0166:
            androidx.compose.material3.TextFieldDefaults$ContainerBox$1 r13 = new androidx.compose.material3.TextFieldDefaults$ContainerBox$1
            r0 = r13
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r9.updateScope(r13)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: indicatorLine-gv0btCI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m1690indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        return textFieldDefaults.m1705indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, (i & 16) != 0 ? FocusedIndicatorThickness : f, (i & 32) != 0 ? UnfocusedIndicatorThickness : f2);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1686contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m1697contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1697contentPaddingWithLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m489PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1687contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1698contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1698contentPaddingWithoutLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m489PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1692supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m5626constructorimpl((float) 0);
        }
        return textFieldDefaults.m1709supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release  reason: not valid java name */
    public final PaddingValues m1709supportingTextPaddinga9UjIt4$material3_release(float f, float f2, float f3, float f4) {
        return PaddingKt.m489PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: colors-0hiis_0  reason: not valid java name */
    public final TextFieldColors m1696colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i8 = i6;
        int i9 = i7;
        composer2.startReplaceableGroup(1513344955);
        ComposerKt.sourceInformation(composer2, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)247@12192L9,248@12272L9,249@12359L9,251@12510L9,252@12597L9,253@12686L9,254@12774L9,255@12859L9,256@12932L9,257@13020L9,258@13103L7,259@13199L9,260@13294L9,261@13396L9,263@13572L9,264@13668L9,265@13761L9,266@13861L9,268@14031L9,269@14129L9,270@14224L9,271@14326L9,273@14499L9,274@14583L9,275@14664L9,276@14752L9,278@14904L9,279@15000L9,280@15098L9,281@15192L9,283@15356L9,284@15454L9,285@15549L9,286@15651L9,288@15822L9,289@15908L9,290@15996L9,291@16083L9,293@16237L9,294@16323L9,295@16411L9,296@16498L9,298@16652L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i8 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer2, 6) : j;
        long color2 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j2;
        long r13 = (i8 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer2, 6) : j4;
        long color4 = (i8 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j5;
        long color5 = (i8 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j6;
        long color6 = (i8 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j7;
        long color7 = (i8 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j8;
        long color8 = (i8 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j9;
        long color9 = (i8 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j10;
        if ((i8 & 1024) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color10 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer2, 6) : j11;
        long color11 = (i8 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6) : j12;
        long r34 = (i8 & 8192) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long color12 = (i8 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer2, 6) : j14;
        long color13 = (32768 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j15;
        long color14 = (65536 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j16;
        long r42 = (131072 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long color15 = (262144 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j18;
        long color16 = (524288 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j19;
        long color17 = (1048576 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j20;
        long r50 = (2097152 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long color18 = (4194304 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j22;
        long color19 = (8388608 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j23;
        long color20 = (16777216 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j24;
        long r58 = (33554432 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        long color21 = (67108864 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j26;
        long color22 = (134217728 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j27;
        long color23 = (268435456 & i8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j28;
        long r66 = (536870912 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long color24 = (i8 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j30;
        long color25 = (i9 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j31;
        long color26 = (i9 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j32;
        long r74 = (i9 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long color27 = (i9 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j34;
        long color28 = (i9 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j35;
        long color29 = (i9 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j36;
        long r82 = (i9 & 64) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long color30 = (i9 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j38;
        long color31 = (i9 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j39;
        long color32 = (i9 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j40;
        long r90 = (i9 & 1024) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j41;
        long color33 = (i9 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:246)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, r13, color3, color4, color5, color6, color7, color8, color9, textSelectionColors2, color10, color11, r34, color12, color13, color14, r42, color15, color16, color17, r50, color18, color19, color20, r58, color21, color22, color23, r66, color24, color25, color26, r74, color27, color28, color29, r82, color30, color31, color32, r90, color33, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01db, code lost:
        if (r8.changed((java.lang.Object) r133) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DecorationBox(java.lang.String r119, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r120, boolean r121, boolean r122, androidx.compose.ui.text.input.VisualTransformation r123, androidx.compose.foundation.interaction.InteractionSource r124, boolean r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, androidx.compose.ui.graphics.Shape r133, androidx.compose.material3.TextFieldColors r134, androidx.compose.foundation.layout.PaddingValues r135, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r136, androidx.compose.runtime.Composer r137, int r138, int r139, int r140) {
        /*
            r118 = this;
            r15 = r119
            r14 = r120
            r13 = r123
            r12 = r124
            r11 = r138
            r10 = r139
            r9 = r140
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 289640444(0x11438ffc, float:1.5427156E-28)
            r1 = r137
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(DecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)425@24643L5,426@24684L8,437@25039L707:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x003b
            r0 = r11 | 6
            goto L_0x004b
        L_0x003b:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x004a
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0047
            r0 = 4
            goto L_0x0048
        L_0x0047:
            r0 = 2
        L_0x0048:
            r0 = r0 | r11
            goto L_0x004b
        L_0x004a:
            r0 = r11
        L_0x004b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 48
            goto L_0x0062
        L_0x0052:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x005f
            r3 = 32
            goto L_0x0061
        L_0x005f:
            r3 = 16
        L_0x0061:
            r0 = r0 | r3
        L_0x0062:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0069
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x007d
        L_0x0069:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r121
            boolean r16 = r8.changed((boolean) r3)
            if (r16 == 0) goto L_0x0078
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r16 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r0 = r0 | r16
            goto L_0x007f
        L_0x007d:
            r3 = r121
        L_0x007f:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x008a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008a:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x009e
            r1 = r122
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0099
            r16 = r17
            goto L_0x009b
        L_0x0099:
            r16 = r18
        L_0x009b:
            r0 = r0 | r16
            goto L_0x00a0
        L_0x009e:
            r1 = r122
        L_0x00a0:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00ac
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bd
        L_0x00ac:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00b9
            r16 = r19
            goto L_0x00bb
        L_0x00b9:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00bb:
            r0 = r0 | r16
        L_0x00bd:
            r16 = r9 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            r112 = 65536(0x10000, float:9.18355E-41)
            if (r16 == 0) goto L_0x00ca
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c7:
            r0 = r0 | r16
            goto L_0x00da
        L_0x00ca:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00da
            boolean r16 = r8.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00d7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00d7:
            r16 = r112
            goto L_0x00c7
        L_0x00da:
            r16 = r9 & 64
            r113 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e7
            r20 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r20
            r2 = r125
            goto L_0x00fa
        L_0x00e7:
            r20 = r11 & r113
            r2 = r125
            if (r20 != 0) goto L_0x00fa
            boolean r21 = r8.changed((boolean) r2)
            if (r21 == 0) goto L_0x00f6
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f8
        L_0x00f6:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00f8:
            r0 = r0 | r21
        L_0x00fa:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r114 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0107
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r22
            r5 = r126
            goto L_0x011a
        L_0x0107:
            r22 = r11 & r114
            r5 = r126
            if (r22 != 0) goto L_0x011a
            boolean r23 = r8.changedInstance(r5)
            if (r23 == 0) goto L_0x0116
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0118
        L_0x0116:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0118:
            r0 = r0 | r23
        L_0x011a:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0125
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r24
            r7 = r127
            goto L_0x013a
        L_0x0125:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r11 & r24
            r7 = r127
            if (r24 != 0) goto L_0x013a
            boolean r25 = r8.changedInstance(r7)
            if (r25 == 0) goto L_0x0136
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0138
        L_0x0136:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0138:
            r0 = r0 | r25
        L_0x013a:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0145
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r25
            r2 = r128
            goto L_0x015a
        L_0x0145:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r11 & r25
            r2 = r128
            if (r25 != 0) goto L_0x015a
            boolean r25 = r8.changedInstance(r2)
            if (r25 == 0) goto L_0x0156
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0158
        L_0x0156:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0158:
            r0 = r0 | r25
        L_0x015a:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0163
            r20 = r10 | 6
            r3 = r129
            goto L_0x0179
        L_0x0163:
            r25 = r10 & 14
            r3 = r129
            if (r25 != 0) goto L_0x0177
            boolean r25 = r8.changedInstance(r3)
            if (r25 == 0) goto L_0x0172
            r20 = 4
            goto L_0x0174
        L_0x0172:
            r20 = 2
        L_0x0174:
            r20 = r10 | r20
            goto L_0x0179
        L_0x0177:
            r20 = r10
        L_0x0179:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0180
            r20 = r20 | 48
            goto L_0x0193
        L_0x0180:
            r25 = r10 & 112(0x70, float:1.57E-43)
            r5 = r130
            if (r25 != 0) goto L_0x0193
            boolean r25 = r8.changedInstance(r5)
            if (r25 == 0) goto L_0x018f
            r21 = 32
            goto L_0x0191
        L_0x018f:
            r21 = 16
        L_0x0191:
            r20 = r20 | r21
        L_0x0193:
            r5 = r20
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x019c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01b0
        L_0x019c:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01b0
            r12 = r131
            boolean r20 = r8.changedInstance(r12)
            if (r20 == 0) goto L_0x01ab
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x01ad
        L_0x01ab:
            r23 = 128(0x80, float:1.794E-43)
        L_0x01ad:
            r5 = r5 | r23
            goto L_0x01b2
        L_0x01b0:
            r12 = r131
        L_0x01b2:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b9
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cb
        L_0x01b9:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01cb
            r13 = r132
            boolean r20 = r8.changedInstance(r13)
            if (r20 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r17 = r18
        L_0x01c8:
            r5 = r5 | r17
            goto L_0x01cd
        L_0x01cb:
            r13 = r132
        L_0x01cd:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01e5
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01de
            r13 = r133
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01de:
            r13 = r133
        L_0x01e0:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01e2:
            r5 = r5 | r19
            goto L_0x01e7
        L_0x01e5:
            r13 = r133
        L_0x01e7:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x0202
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r134
            if (r17 != 0) goto L_0x01fd
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01fd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01ff
        L_0x01fd:
            r17 = r112
        L_0x01ff:
            r5 = r5 | r17
            goto L_0x0204
        L_0x0202:
            r13 = r134
        L_0x0204:
            r17 = r10 & r113
            if (r17 != 0) goto L_0x021c
            r17 = r9 & r112
            r13 = r135
            if (r17 != 0) goto L_0x0217
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x0217
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0219
        L_0x0217:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0219:
            r5 = r5 | r17
            goto L_0x021e
        L_0x021c:
            r13 = r135
        L_0x021e:
            r17 = 131072(0x20000, float:1.83671E-40)
            r115 = r9 & r17
            if (r115 == 0) goto L_0x022b
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r13 = r136
            goto L_0x023e
        L_0x022b:
            r17 = r10 & r114
            r13 = r136
            if (r17 != 0) goto L_0x023e
            boolean r17 = r8.changedInstance(r13)
            if (r17 == 0) goto L_0x023a
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023c
        L_0x023a:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x023c:
            r5 = r5 | r17
        L_0x023e:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x024b
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r17
            r15 = r118
            goto L_0x0260
        L_0x024b:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            r15 = r118
            if (r17 != 0) goto L_0x0260
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x025c
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x025e
        L_0x025c:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x025e:
            r5 = r5 | r17
        L_0x0260:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0299
            r10 = 191739611(0xb6db6db, float:4.5782105E-32)
            r10 = r10 & r5
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 != r13) goto L_0x0299
            boolean r10 = r8.getSkipping()
            if (r10 != 0) goto L_0x027a
            goto L_0x0299
        L_0x027a:
            r8.skipToGroupEnd()
            r9 = r126
            r10 = r127
            r11 = r128
            r12 = r129
            r13 = r130
            r14 = r131
            r15 = r132
            r16 = r133
            r17 = r134
            r18 = r135
            r19 = r136
            r33 = r8
            r8 = r125
            goto L_0x04ea
        L_0x0299:
            r8.startDefaults()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02de
            boolean r10 = r8.getDefaultsInvalid()
            if (r10 == 0) goto L_0x02a7
            goto L_0x02de
        L_0x02a7:
            r8.skipToGroupEnd()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02b2
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x02b2:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02bc
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x02bc:
            r1 = r9 & r112
            if (r1 == 0) goto L_0x02c4
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x02c4:
            r22 = r125
            r23 = r126
            r24 = r127
            r116 = r128
            r25 = r129
            r26 = r130
            r27 = r131
            r28 = r132
            r29 = r133
            r30 = r134
            r31 = r135
            r32 = r136
            goto L_0x0441
        L_0x02de:
            if (r16 == 0) goto L_0x02e2
            r10 = 0
            goto L_0x02e4
        L_0x02e2:
            r10 = r125
        L_0x02e4:
            r16 = 0
            if (r4 == 0) goto L_0x02eb
            r4 = r16
            goto L_0x02ed
        L_0x02eb:
            r4 = r126
        L_0x02ed:
            if (r6 == 0) goto L_0x02f2
            r6 = r16
            goto L_0x02f4
        L_0x02f2:
            r6 = r127
        L_0x02f4:
            if (r1 == 0) goto L_0x02f9
            r1 = r16
            goto L_0x02fb
        L_0x02f9:
            r1 = r128
        L_0x02fb:
            if (r2 == 0) goto L_0x0300
            r2 = r16
            goto L_0x0302
        L_0x0300:
            r2 = r129
        L_0x0302:
            if (r3 == 0) goto L_0x0307
            r3 = r16
            goto L_0x0309
        L_0x0307:
            r3 = r130
        L_0x0309:
            if (r7 == 0) goto L_0x030e
            r7 = r16
            goto L_0x0310
        L_0x030e:
            r7 = r131
        L_0x0310:
            if (r12 == 0) goto L_0x0315
            r12 = r16
            goto L_0x0317
        L_0x0315:
            r12 = r132
        L_0x0317:
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0329
            androidx.compose.material3.TextFieldDefaults r13 = INSTANCE
            r116 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r13 = r13.getShape(r8, r1)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
            goto L_0x032d
        L_0x0329:
            r116 = r1
            r13 = r133
        L_0x032d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x03aa
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            int r1 = r5 >> 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r107 = r1
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r118
            r102 = r8
            androidx.compose.material3.TextFieldColors r1 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r16
            goto L_0x03ac
        L_0x03aa:
            r1 = r134
        L_0x03ac:
            r16 = r9 & r112
            if (r16 == 0) goto L_0x03f5
            if (r4 != 0) goto L_0x03d1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r16
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.PaddingValues r16 = m1687contentPaddingWithoutLabela9UjIt4$default(r125, r126, r127, r128, r129, r130, r131)
            goto L_0x03ef
        L_0x03d1:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r16
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.PaddingValues r16 = m1686contentPaddingWithLabela9UjIt4$default(r125, r126, r127, r128, r129, r130, r131)
        L_0x03ef:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x03f7
        L_0x03f5:
            r16 = r135
        L_0x03f7:
            if (r115 == 0) goto L_0x0425
            r17 = r2
            androidx.compose.material3.TextFieldDefaults$DecorationBox$1 r2 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$1
            r125 = r2
            r126 = r121
            r127 = r10
            r128 = r124
            r129 = r1
            r130 = r13
            r131 = r0
            r132 = r5
            r125.<init>(r126, r127, r128, r129, r130, r131, r132)
            r125 = r1
            r1 = -435523791(0xffffffffe60a6f31, float:-1.6343442E23)
            r126 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r1, r3, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r30 = r125
            r26 = r126
            r32 = r1
            goto L_0x0431
        L_0x0425:
            r125 = r1
            r17 = r2
            r126 = r3
            r30 = r125
            r26 = r126
            r32 = r136
        L_0x0431:
            r23 = r4
            r24 = r6
            r27 = r7
            r22 = r10
            r28 = r12
            r29 = r13
            r31 = r16
            r25 = r17
        L_0x0441:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0453
            r1 = 289640444(0x11438ffc, float:1.5427156E-28)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:410)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r5, r2)
        L_0x0453:
            androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Filled
            r2 = r0
            r0 = r1
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r4 = 6
            r3 = r3 | r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 >> 3
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r4
            int r4 = r2 >> 9
            r6 = r4 & r110
            r1 = r1 | r6
            r6 = r4 & r111
            r1 = r1 | r6
            r6 = r4 & r113
            r1 = r1 | r6
            int r6 = r5 << 21
            r7 = r6 & r114
            r1 = r1 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r6
            r1 = r1 | r7
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r7
            r19 = r1 | r6
            int r1 = r5 >> 9
            r1 = r1 & 14
            int r6 = r2 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r1 = r1 | r6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r3 & r110
            r1 = r1 | r2
            int r2 = r5 >> 3
            r2 = r2 & r111
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & r113
            r1 = r1 | r2
            r2 = r5 & r114
            r20 = r1 | r2
            r21 = 0
            r1 = r119
            r2 = r120
            r3 = r123
            r4 = r23
            r5 = r24
            r6 = r116
            r7 = r25
            r33 = r8
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r122
            r12 = r121
            r13 = r22
            r14 = r124
            r15 = r31
            r16 = r30
            r17 = r32
            r18 = r33
            androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04d2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04d2:
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r11 = r116
        L_0x04ea:
            androidx.compose.runtime.ScopeUpdateScope r7 = r33.endRestartGroup()
            if (r7 != 0) goto L_0x04f1
            goto L_0x0517
        L_0x04f1:
            androidx.compose.material3.TextFieldDefaults$DecorationBox$2 r23 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$2
            r0 = r23
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r6 = r123
            r117 = r7
            r7 = r124
            r20 = r138
            r21 = r139
            r22 = r140
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r23
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r117
            r1.updateScope(r0)
        L_0x0517:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        ComposerKt.sourceInformation(composer, "C465@26096L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:465)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        ComposerKt.sourceInformation(composer, "C472@26334L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:472)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00eb, code lost:
        if ((r25 & 16) != 0) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0133  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @kotlin.ReplaceWith(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FilledContainerBox(boolean r18, boolean r19, androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.material3.TextFieldColors r21, androidx.compose.ui.graphics.Shape r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r17 = this;
            r9 = r20
            r10 = r21
            r11 = r24
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1358797526(0xffffffffaf02652a, float:-1.1859372E-10)
            r1 = r23
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(FilledContainerBox)P(1,3,2)508@27835L5,509@27850L168:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r11 | 6
            r13 = r18
            goto L_0x003b
        L_0x0029:
            r1 = r11 & 14
            r13 = r18
            if (r1 != 0) goto L_0x003a
            boolean r1 = r12.changed((boolean) r13)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r11
            goto L_0x003b
        L_0x003a:
            r1 = r11
        L_0x003b:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            r14 = r19
            goto L_0x0056
        L_0x0044:
            r2 = r11 & 112(0x70, float:1.57E-43)
            r14 = r19
            if (r2 != 0) goto L_0x0056
            boolean r2 = r12.changed((boolean) r14)
            if (r2 == 0) goto L_0x0053
            r2 = 32
            goto L_0x0055
        L_0x0053:
            r2 = 16
        L_0x0055:
            r1 = r1 | r2
        L_0x0056:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x005d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006d
            boolean r2 = r12.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x006a
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r2
        L_0x006d:
            r2 = r25 & 8
            if (r2 == 0) goto L_0x0074
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0084
            boolean r2 = r12.changed((java.lang.Object) r10)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r11 & r2
            if (r3 != 0) goto L_0x00a0
            r3 = r25 & 16
            if (r3 != 0) goto L_0x009a
            r3 = r22
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x009c
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r3 = r22
        L_0x009c:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r4
            goto L_0x00a2
        L_0x00a0:
            r3 = r22
        L_0x00a2:
            r4 = r25 & 32
            r5 = 458752(0x70000, float:6.42848E-40)
            if (r4 == 0) goto L_0x00ae
            r4 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r4
            r15 = r17
            goto L_0x00c0
        L_0x00ae:
            r4 = r11 & r5
            r15 = r17
            if (r4 != 0) goto L_0x00c0
            boolean r4 = r12.changed((java.lang.Object) r15)
            if (r4 == 0) goto L_0x00bd
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r4
        L_0x00c0:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r1
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r6) goto L_0x00d5
            boolean r4 = r12.getSkipping()
            if (r4 != 0) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            r12.skipToGroupEnd()
            r6 = r3
            goto L_0x0138
        L_0x00d5:
            r12.startDefaults()
            r4 = r11 & 1
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00ee
            boolean r4 = r12.getDefaultsInvalid()
            if (r4 == 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            r12.skipToGroupEnd()
            r4 = r25 & 16
            if (r4 == 0) goto L_0x00fa
            goto L_0x00f9
        L_0x00ee:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x00fa
            androidx.compose.material3.TextFieldDefaults r3 = INSTANCE
            r4 = 6
            androidx.compose.ui.graphics.Shape r3 = r3.getShape(r12, r4)
        L_0x00f9:
            r1 = r1 & r6
        L_0x00fa:
            r16 = r3
            r12.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x010c
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:503)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L_0x010c:
            r0 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r5
            r7 = r0 | r1
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r16
            r6 = r12
            r0.ContainerBox(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0136
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0136:
            r6 = r16
        L_0x0138:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x013f
            goto L_0x015b
        L_0x013f:
            androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1 r16 = new androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r12.updateScope(r0)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0188  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @kotlin.ReplaceWith(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1695OutlinedBorderContainerBoxnbWgWpA(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r20 = this;
            r11 = r23
            r12 = r24
            r13 = r29
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1998946250(0xffffffff88da8036, float:-1.315054E-33)
            r1 = r28
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(OutlinedBorderContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)538@28994L9,541@29216L286:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            r15 = r21
            goto L_0x003b
        L_0x0029:
            r1 = r13 & 14
            r15 = r21
            if (r1 != 0) goto L_0x003a
            boolean r1 = r14.changed((boolean) r15)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r13
            goto L_0x003b
        L_0x003a:
            r1 = r13
        L_0x003b:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            r10 = r22
            goto L_0x0056
        L_0x0044:
            r2 = r13 & 112(0x70, float:1.57E-43)
            r10 = r22
            if (r2 != 0) goto L_0x0056
            boolean r2 = r14.changed((boolean) r10)
            if (r2 == 0) goto L_0x0053
            r2 = 32
            goto L_0x0055
        L_0x0053:
            r2 = 16
        L_0x0055:
            r1 = r1 | r2
        L_0x0056:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x005d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006d
            boolean r2 = r14.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x006a
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r2
        L_0x006d:
            r2 = r30 & 8
            if (r2 == 0) goto L_0x0074
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0084
            boolean r2 = r14.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r13 & r2
            if (r3 != 0) goto L_0x00a0
            r3 = r30 & 16
            if (r3 != 0) goto L_0x009a
            r3 = r25
            boolean r4 = r14.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x009c
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r3 = r25
        L_0x009c:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r4
            goto L_0x00a2
        L_0x00a0:
            r3 = r25
        L_0x00a2:
            r4 = r30 & 32
            r5 = 458752(0x70000, float:6.42848E-40)
            if (r4 == 0) goto L_0x00ac
            r6 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r6
            goto L_0x00bf
        L_0x00ac:
            r6 = r13 & r5
            if (r6 != 0) goto L_0x00bf
            r6 = r26
            boolean r7 = r14.changed((float) r6)
            if (r7 == 0) goto L_0x00bb
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r7
            goto L_0x00c1
        L_0x00bf:
            r6 = r26
        L_0x00c1:
            r7 = r30 & 64
            r8 = 3670016(0x380000, float:5.142788E-39)
            if (r7 == 0) goto L_0x00cb
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r9
            goto L_0x00df
        L_0x00cb:
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00df
            r9 = r27
            boolean r16 = r14.changed((float) r9)
            if (r16 == 0) goto L_0x00da
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r16
            goto L_0x00e1
        L_0x00df:
            r9 = r27
        L_0x00e1:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r1 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r5) goto L_0x00fa
            boolean r5 = r14.getSkipping()
            if (r5 != 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            r14.skipToGroupEnd()
            r7 = r6
            r8 = r9
            r6 = r3
            goto L_0x0191
        L_0x00fa:
            r14.startDefaults()
            r5 = r13 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x011a
            boolean r5 = r14.getDefaultsInvalid()
            if (r5 == 0) goto L_0x010b
            goto L_0x011a
        L_0x010b:
            r14.skipToGroupEnd()
            r4 = r30 & 16
            if (r4 == 0) goto L_0x0113
            r1 = r1 & r8
        L_0x0113:
            r17 = r3
            r18 = r6
            r19 = r9
            goto L_0x0141
        L_0x011a:
            r5 = r30 & 16
            if (r5 == 0) goto L_0x012a
            androidx.compose.material3.tokens.OutlinedTextFieldTokens r3 = androidx.compose.material3.tokens.OutlinedTextFieldTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getContainerShape()
            r5 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r14, r5)
            r1 = r1 & r8
        L_0x012a:
            if (r4 == 0) goto L_0x0133
            androidx.compose.material3.OutlinedTextFieldDefaults r4 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            float r4 = r4.m1476getFocusedBorderThicknessD9Ej5fM()
            r6 = r4
        L_0x0133:
            if (r7 == 0) goto L_0x0113
            androidx.compose.material3.OutlinedTextFieldDefaults r4 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            float r4 = r4.m1479getUnfocusedBorderThicknessD9Ej5fM()
            r17 = r3
            r19 = r4
            r18 = r6
        L_0x0141:
            r14.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0151
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:533)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L_0x0151:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r1 & 14
            r3 = r3 | r4
            r4 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r2 = r2 & r1
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r9 = r2 | r1
            r16 = 0
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r14
            r10 = r16
            r0.m1473ContainerBoxnbWgWpA(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x018b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x018b:
            r6 = r17
            r7 = r18
            r8 = r19
        L_0x0191:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x0198
            goto L_0x01b4
        L_0x0198:
            androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1 r16 = new androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
            r0 = r16
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r14.updateScope(r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m1695OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1693textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m1712textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1712textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m1697contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1694textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1713textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1713textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m1698contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1691outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1708outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1708outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return OutlinedTextFieldDefaults.INSTANCE.m1475contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    /* renamed from: textFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m1710textFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        long j41;
        int i8;
        long j42;
        int i9;
        long j43;
        int i10;
        long j44;
        int i11;
        long j45;
        int i12;
        long j46;
        int i13;
        long j47;
        int i14;
        long j48;
        int i15;
        Composer composer2 = composer;
        int i16 = i;
        int i17 = i2;
        int i18 = i6;
        int i19 = i7;
        composer2.startReplaceableGroup(568209592);
        ComposerKt.sourceInformation(composer2, "C(textFieldColors)P(29:c#ui.graphics.Color,39:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,31,22:c#ui.graphics.Color,32:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,30:c#ui.graphics.Color,40:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,27:c#ui.graphics.Color,37:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)671@35322L9,672@35402L9,673@35489L9,675@35640L9,676@35720L9,677@35805L9,678@35878L9,679@35966L9,680@36049L7,681@36145L9,682@36240L9,683@36342L9,685@36518L9,686@36614L9,687@36707L9,688@36807L9,690@36977L9,691@37075L9,692@37170L9,693@37272L9,695@37445L9,696@37529L9,697@37610L9,698@37698L9,700@37850L9,701@37946L9,702@38044L9,703@38138L9,705@38302L9,706@38400L9,707@38495L9,708@38597L9,710@38768L9,711@38854L9,712@38942L9,713@39029L9,715@39183L9,716@39269L9,717@39357L9,718@39444L9,720@39598L9,721@39634L2308:TextFieldDefaults.kt#uh7d8r");
        long color = (i18 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer2, 6) : j;
        long color2 = (i18 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j2;
        long r11 = (i18 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i18 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer2, 6) : j4;
        long color4 = (i18 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j5;
        long color5 = (i18 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j6;
        long color6 = (i18 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j7;
        long color7 = (i18 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j8;
        if ((i18 & 256) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        if ((i18 & 512) != 0) {
            i8 = 6;
            j41 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer2, 6);
        } else {
            i8 = 6;
            j41 = j9;
        }
        long color8 = (i18 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer2, i8) : j10;
        long r31 = (i18 & 2048) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer2, i8), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if ((i18 & 4096) != 0) {
            i9 = 6;
            j42 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer2, 6);
        } else {
            i9 = 6;
            j42 = j12;
        }
        long color9 = (i18 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, i9) : j13;
        long color10 = (i18 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, i9) : j14;
        long r39 = (32768 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, i9), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        if ((65536 & i18) != 0) {
            i10 = 6;
            j43 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6);
        } else {
            i10 = 6;
            j43 = j16;
        }
        long color11 = (131072 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, i10) : j17;
        long color12 = (262144 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, i10) : j18;
        long r47 = (524288 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, i10), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        if ((1048576 & i18) != 0) {
            i11 = 6;
            j44 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6);
        } else {
            i11 = 6;
            j44 = j20;
        }
        long color13 = (2097152 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, i11) : j21;
        long color14 = (4194304 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer2, i11) : j22;
        long r55 = (8388608 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, i11), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if ((16777216 & i18) != 0) {
            i12 = 6;
            j45 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6);
        } else {
            i12 = 6;
            j45 = j24;
        }
        long color15 = (33554432 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, i12) : j25;
        long color16 = (67108864 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, i12) : j26;
        long r63 = (134217728 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, i12), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        if ((268435456 & i18) != 0) {
            i13 = 6;
            j46 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6);
        } else {
            i13 = 6;
            j46 = j28;
        }
        long color17 = (536870912 & i18) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, i13) : j29;
        long color18 = (i18 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer2, i13) : j30;
        long r71 = (i19 & 1) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, i13), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        if ((i19 & 2) != 0) {
            i14 = 6;
            j47 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6);
        } else {
            i14 = 6;
            j47 = j32;
        }
        long color19 = (i19 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14) : j33;
        long color20 = (i19 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14) : j34;
        long r79 = (i19 & 16) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        if ((i19 & 32) != 0) {
            i15 = 6;
            j48 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6);
        } else {
            i15 = 6;
            j48 = j36;
        }
        long color21 = (i19 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15) : j37;
        long color22 = (i19 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15) : j38;
        long r94 = (i19 & 256) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j39;
        long color23 = (i19 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i16, i17, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:670)");
        }
        int i20 = i16 << 6;
        int i21 = (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i16 << 3) & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i16 >> 24;
        int i23 = i17 << 6;
        int i24 = (i22 & 112) | (i22 & 14) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i17 >> 24;
        int i26 = i3 << 6;
        int i27 = (i25 & 112) | (i25 & 14) | (i26 & 896) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i3 >> 24;
        int i29 = i4 << 6;
        int i30 = (i28 & 112) | (i28 & 14) | (i29 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192);
        int i31 = i4 >> 24;
        int i32 = i5 << 6;
        TextFieldColors r0 = m1696colors0hiis_0(color, color2, r11, color3, color4, color4, color4, color5, color6, color7, textSelectionColors2, j41, color8, r31, j42, color9, color10, r39, j43, color11, color12, r47, j44, color13, color14, r55, j45, color15, color16, r63, j46, color17, color18, r71, j47, color19, color20, r79, j48, color21, color22, r94, color23, composer, i21, i24, i27, i30, (i31 & 112) | (i31 & 14) | (i32 & 896) | (i32 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m1706outlinedTextFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        long j41;
        int i8;
        long j42;
        int i9;
        long j43;
        int i10;
        long j44;
        int i11;
        long j45;
        int i12;
        long j46;
        int i13;
        long j47;
        int i14;
        long j48;
        int i15;
        Composer composer2 = composer;
        int i16 = i;
        int i17 = i2;
        int i18 = i6;
        int i19 = i7;
        composer2.startReplaceableGroup(618732090);
        ComposerKt.sourceInformation(composer2, "C(outlinedTextFieldColors)P(29:c#ui.graphics.Color,39:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,1:c#ui.graphics.Color,13:c#ui.graphics.Color,31,22:c#ui.graphics.Color,32:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,30:c#ui.graphics.Color,40:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,27:c#ui.graphics.Color,37:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)821@45523L9,822@45605L9,823@45694L9,825@45849L9,828@46031L9,829@46121L9,830@46204L7,831@46291L9,832@46377L9,833@46470L9,835@46631L9,836@46729L9,837@46824L9,838@46926L9,840@47100L9,841@47200L9,842@47297L9,844@47414L9,845@47578L9,846@47664L9,847@47747L9,848@47837L9,850@47993L9,851@48091L9,852@48191L9,853@48287L9,855@48455L9,856@48555L9,857@48652L9,859@48769L9,860@48931L9,861@49019L9,862@49109L9,863@49198L9,865@49356L9,866@49444L9,867@49534L9,868@49623L9,870@49781L9,871@49843L2284:TextFieldDefaults.kt#uh7d8r");
        long color = (i18 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer2, 6) : j;
        long color2 = (i18 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j2;
        long r11 = (i18 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i18 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer2, 6) : j4;
        long r16 = (i18 & 16) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j5;
        long r18 = (i18 & 32) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j6;
        long color4 = (i18 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j7;
        long color5 = (i18 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j8;
        if ((i18 & 256) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        if ((i18 & 512) != 0) {
            i8 = 6;
            j41 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer2, 6);
        } else {
            i8 = 6;
            j41 = j9;
        }
        long color6 = (i18 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer2, i8) : j10;
        long r31 = (i18 & 2048) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer2, i8), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if ((i18 & 4096) != 0) {
            i9 = 6;
            j42 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer2, 6);
        } else {
            i9 = 6;
            j42 = j12;
        }
        long color7 = (i18 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, i9) : j13;
        long color8 = (i18 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, i9) : j14;
        long r39 = (32768 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, i9), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        if ((65536 & i18) != 0) {
            i10 = 6;
            j43 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6);
        } else {
            i10 = 6;
            j43 = j16;
        }
        long color9 = (131072 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, i10) : j17;
        long color10 = (262144 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, i10) : j18;
        long r47 = (524288 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, i10), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        if ((1048576 & i18) != 0) {
            i11 = 6;
            j44 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6);
        } else {
            i11 = 6;
            j44 = j20;
        }
        long color11 = (2097152 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, i11) : j21;
        long color12 = (4194304 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer2, i11) : j22;
        long r55 = (8388608 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, i11), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if ((16777216 & i18) != 0) {
            i12 = 6;
            j45 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6);
        } else {
            i12 = 6;
            j45 = j24;
        }
        long color13 = (33554432 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, i12) : j25;
        long color14 = (67108864 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, i12) : j26;
        long r63 = (134217728 & i18) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, i12), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j27;
        if ((268435456 & i18) != 0) {
            i13 = 6;
            j46 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6);
        } else {
            i13 = 6;
            j46 = j28;
        }
        long color15 = (536870912 & i18) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, i13) : j29;
        long color16 = (i18 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer2, i13) : j30;
        long r71 = (i19 & 1) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, i13), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j31;
        if ((i19 & 2) != 0) {
            i14 = 6;
            j47 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6);
        } else {
            i14 = 6;
            j47 = j32;
        }
        long color17 = (i19 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14) : j33;
        long color18 = (i19 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14) : j34;
        long r79 = (i19 & 16) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, i14), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j35;
        if ((i19 & 32) != 0) {
            i15 = 6;
            j48 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6);
        } else {
            i15 = 6;
            j48 = j36;
        }
        long color19 = (i19 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15) : j37;
        long color20 = (i19 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15) : j38;
        long r94 = (i19 & 256) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, i15), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j39;
        long color21 = (i19 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i16, i17, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:820)");
        }
        int i20 = i16 << 6;
        int i21 = (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i16 << 3) & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i16 >> 24;
        int i23 = i17 << 6;
        int i24 = (i22 & 112) | (i22 & 14) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i17 >> 24;
        int i26 = i3 << 6;
        int i27 = (i25 & 112) | (i25 & 14) | (i26 & 896) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i3 >> 24;
        int i29 = i4 << 6;
        int i30 = (i28 & 112) | (i28 & 14) | (i29 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192);
        int i31 = i4 >> 24;
        TextFieldColors r0 = OutlinedTextFieldDefaults.INSTANCE.m1474colors0hiis_0(color, color2, r11, color3, r16, r16, r16, r18, color4, color5, textSelectionColors2, j41, color6, r31, j42, color7, color8, r39, j43, color9, color10, r47, j44, color11, color12, r55, j45, color13, color14, r63, j46, color15, color16, r71, j47, color17, color18, r79, j48, color19, color20, r94, color21, composer, i21, i24, i27, i30, (i31 & 112) | (i31 & 14) | 3072 | ((i5 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01db, code lost:
        if (r8.changed((java.lang.Object) r133) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0145  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @kotlin.ReplaceWith(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void TextFieldDecorationBox(java.lang.String r119, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r120, boolean r121, boolean r122, androidx.compose.ui.text.input.VisualTransformation r123, androidx.compose.foundation.interaction.InteractionSource r124, boolean r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, androidx.compose.ui.graphics.Shape r133, androidx.compose.material3.TextFieldColors r134, androidx.compose.foundation.layout.PaddingValues r135, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r136, androidx.compose.runtime.Composer r137, int r138, int r139, int r140) {
        /*
            r118 = this;
            r15 = r119
            r14 = r120
            r13 = r123
            r12 = r124
            r11 = r138
            r10 = r139
            r9 = r140
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1042273141(0xffffffffc1e02c8b, float:-28.02175)
            r1 = r137
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextFieldDecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)958@54020L5,959@54061L8,969@54408L612:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x003b
            r0 = r11 | 6
            goto L_0x004b
        L_0x003b:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x004a
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0047
            r0 = 4
            goto L_0x0048
        L_0x0047:
            r0 = 2
        L_0x0048:
            r0 = r0 | r11
            goto L_0x004b
        L_0x004a:
            r0 = r11
        L_0x004b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 48
            goto L_0x0062
        L_0x0052:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x005f
            r3 = 32
            goto L_0x0061
        L_0x005f:
            r3 = 16
        L_0x0061:
            r0 = r0 | r3
        L_0x0062:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0069
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x007d
        L_0x0069:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r121
            boolean r16 = r8.changed((boolean) r3)
            if (r16 == 0) goto L_0x0078
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r16 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r0 = r0 | r16
            goto L_0x007f
        L_0x007d:
            r3 = r121
        L_0x007f:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x008a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008a:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x009e
            r1 = r122
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0099
            r16 = r17
            goto L_0x009b
        L_0x0099:
            r16 = r18
        L_0x009b:
            r0 = r0 | r16
            goto L_0x00a0
        L_0x009e:
            r1 = r122
        L_0x00a0:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00ac
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bd
        L_0x00ac:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00b9
            r16 = r19
            goto L_0x00bb
        L_0x00b9:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00bb:
            r0 = r0 | r16
        L_0x00bd:
            r16 = r9 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            r112 = 65536(0x10000, float:9.18355E-41)
            if (r16 == 0) goto L_0x00ca
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c7:
            r0 = r0 | r16
            goto L_0x00da
        L_0x00ca:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00da
            boolean r16 = r8.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00d7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00d7:
            r16 = r112
            goto L_0x00c7
        L_0x00da:
            r16 = r9 & 64
            r113 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e7
            r20 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r20
            r2 = r125
            goto L_0x00fa
        L_0x00e7:
            r20 = r11 & r113
            r2 = r125
            if (r20 != 0) goto L_0x00fa
            boolean r21 = r8.changed((boolean) r2)
            if (r21 == 0) goto L_0x00f6
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f8
        L_0x00f6:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00f8:
            r0 = r0 | r21
        L_0x00fa:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r114 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0107
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r22
            r5 = r126
            goto L_0x011a
        L_0x0107:
            r22 = r11 & r114
            r5 = r126
            if (r22 != 0) goto L_0x011a
            boolean r23 = r8.changedInstance(r5)
            if (r23 == 0) goto L_0x0116
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0118
        L_0x0116:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0118:
            r0 = r0 | r23
        L_0x011a:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r115 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x0127
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r24
            r7 = r127
            goto L_0x013a
        L_0x0127:
            r24 = r11 & r115
            r7 = r127
            if (r24 != 0) goto L_0x013a
            boolean r25 = r8.changedInstance(r7)
            if (r25 == 0) goto L_0x0136
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0138
        L_0x0136:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0138:
            r0 = r0 | r25
        L_0x013a:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0145
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r25
            r2 = r128
            goto L_0x015a
        L_0x0145:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r11 & r25
            r2 = r128
            if (r25 != 0) goto L_0x015a
            boolean r25 = r8.changedInstance(r2)
            if (r25 == 0) goto L_0x0156
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0158
        L_0x0156:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0158:
            r0 = r0 | r25
        L_0x015a:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0163
            r20 = r10 | 6
            r3 = r129
            goto L_0x0179
        L_0x0163:
            r25 = r10 & 14
            r3 = r129
            if (r25 != 0) goto L_0x0177
            boolean r25 = r8.changedInstance(r3)
            if (r25 == 0) goto L_0x0172
            r20 = 4
            goto L_0x0174
        L_0x0172:
            r20 = 2
        L_0x0174:
            r20 = r10 | r20
            goto L_0x0179
        L_0x0177:
            r20 = r10
        L_0x0179:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0180
            r20 = r20 | 48
            goto L_0x0193
        L_0x0180:
            r25 = r10 & 112(0x70, float:1.57E-43)
            r5 = r130
            if (r25 != 0) goto L_0x0193
            boolean r25 = r8.changedInstance(r5)
            if (r25 == 0) goto L_0x018f
            r21 = 32
            goto L_0x0191
        L_0x018f:
            r21 = 16
        L_0x0191:
            r20 = r20 | r21
        L_0x0193:
            r5 = r20
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x019c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01b0
        L_0x019c:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01b0
            r12 = r131
            boolean r20 = r8.changedInstance(r12)
            if (r20 == 0) goto L_0x01ab
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x01ad
        L_0x01ab:
            r23 = 128(0x80, float:1.794E-43)
        L_0x01ad:
            r5 = r5 | r23
            goto L_0x01b2
        L_0x01b0:
            r12 = r131
        L_0x01b2:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b9
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cb
        L_0x01b9:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01cb
            r13 = r132
            boolean r20 = r8.changedInstance(r13)
            if (r20 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r17 = r18
        L_0x01c8:
            r5 = r5 | r17
            goto L_0x01cd
        L_0x01cb:
            r13 = r132
        L_0x01cd:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01e5
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01de
            r13 = r133
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01de:
            r13 = r133
        L_0x01e0:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01e2:
            r5 = r5 | r19
            goto L_0x01e7
        L_0x01e5:
            r13 = r133
        L_0x01e7:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x0202
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r134
            if (r17 != 0) goto L_0x01fd
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01fd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01ff
        L_0x01fd:
            r17 = r112
        L_0x01ff:
            r5 = r5 | r17
            goto L_0x0204
        L_0x0202:
            r13 = r134
        L_0x0204:
            r17 = r10 & r113
            if (r17 != 0) goto L_0x021c
            r17 = r9 & r112
            r13 = r135
            if (r17 != 0) goto L_0x0217
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x0217
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0219
        L_0x0217:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0219:
            r5 = r5 | r17
            goto L_0x021e
        L_0x021c:
            r13 = r135
        L_0x021e:
            r17 = 131072(0x20000, float:1.83671E-40)
            r116 = r9 & r17
            if (r116 == 0) goto L_0x022b
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r13 = r136
            goto L_0x023e
        L_0x022b:
            r17 = r10 & r114
            r13 = r136
            if (r17 != 0) goto L_0x023e
            boolean r17 = r8.changedInstance(r13)
            if (r17 == 0) goto L_0x023a
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023c
        L_0x023a:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x023c:
            r5 = r5 | r17
        L_0x023e:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x024b
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r17
            r15 = r118
            goto L_0x025e
        L_0x024b:
            r17 = r10 & r115
            r15 = r118
            if (r17 != 0) goto L_0x025e
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x025a
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x025c
        L_0x025a:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x025c:
            r5 = r5 | r17
        L_0x025e:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0297
            r10 = 191739611(0xb6db6db, float:4.5782105E-32)
            r10 = r10 & r5
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 != r13) goto L_0x0297
            boolean r10 = r8.getSkipping()
            if (r10 != 0) goto L_0x0278
            goto L_0x0297
        L_0x0278:
            r8.skipToGroupEnd()
            r9 = r126
            r10 = r127
            r11 = r128
            r12 = r129
            r13 = r130
            r14 = r131
            r15 = r132
            r16 = r133
            r17 = r134
            r18 = r135
            r19 = r136
            r35 = r8
            r8 = r125
            goto L_0x04d6
        L_0x0297:
            r8.startDefaults()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02dc
            boolean r10 = r8.getDefaultsInvalid()
            if (r10 == 0) goto L_0x02a5
            goto L_0x02dc
        L_0x02a5:
            r8.skipToGroupEnd()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02b0
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x02b0:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02ba
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x02ba:
            r1 = r9 & r112
            if (r1 == 0) goto L_0x02c2
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x02c2:
            r23 = r125
            r24 = r126
            r25 = r127
            r26 = r128
            r27 = r129
            r28 = r130
            r29 = r131
            r30 = r132
            r31 = r133
            r32 = r134
            r33 = r135
            r34 = r136
            goto L_0x043a
        L_0x02dc:
            if (r16 == 0) goto L_0x02e0
            r10 = 0
            goto L_0x02e2
        L_0x02e0:
            r10 = r125
        L_0x02e2:
            r13 = 0
            if (r4 == 0) goto L_0x02e7
            r4 = r13
            goto L_0x02e9
        L_0x02e7:
            r4 = r126
        L_0x02e9:
            if (r6 == 0) goto L_0x02ed
            r6 = r13
            goto L_0x02ef
        L_0x02ed:
            r6 = r127
        L_0x02ef:
            if (r1 == 0) goto L_0x02f3
            r1 = r13
            goto L_0x02f5
        L_0x02f3:
            r1 = r128
        L_0x02f5:
            if (r2 == 0) goto L_0x02f9
            r2 = r13
            goto L_0x02fb
        L_0x02f9:
            r2 = r129
        L_0x02fb:
            if (r3 == 0) goto L_0x02ff
            r3 = r13
            goto L_0x0301
        L_0x02ff:
            r3 = r130
        L_0x0301:
            if (r7 == 0) goto L_0x0305
            r7 = r13
            goto L_0x0307
        L_0x0305:
            r7 = r131
        L_0x0307:
            if (r12 == 0) goto L_0x030a
            goto L_0x030c
        L_0x030a:
            r13 = r132
        L_0x030c:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x031e
            androidx.compose.material3.TextFieldDefaults r12 = INSTANCE
            r137 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r1 = r12.getShape(r8, r1)
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r12
            goto L_0x0322
        L_0x031e:
            r137 = r1
            r1 = r133
        L_0x0322:
            r12 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 & r9
            if (r12 == 0) goto L_0x039f
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            int r12 = r5 >> 15
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r107 = r12
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r118
            r102 = r8
            androidx.compose.material3.TextFieldColors r12 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r16
            goto L_0x03a1
        L_0x039f:
            r12 = r134
        L_0x03a1:
            r16 = r9 & r112
            if (r16 == 0) goto L_0x03ea
            if (r4 != 0) goto L_0x03c6
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r16
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.PaddingValues r16 = m1687contentPaddingWithoutLabela9UjIt4$default(r125, r126, r127, r128, r129, r130, r131)
            goto L_0x03e4
        L_0x03c6:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r125 = r118
            r126 = r16
            r127 = r17
            r128 = r18
            r129 = r19
            r130 = r20
            r131 = r21
            androidx.compose.foundation.layout.PaddingValues r16 = m1686contentPaddingWithLabela9UjIt4$default(r125, r126, r127, r128, r129, r130, r131)
        L_0x03e4:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x03ec
        L_0x03ea:
            r16 = r135
        L_0x03ec:
            if (r116 == 0) goto L_0x041c
            r17 = r2
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1 r2 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1
            r125 = r2
            r126 = r121
            r127 = r10
            r128 = r124
            r129 = r12
            r130 = r1
            r131 = r0
            r132 = r5
            r125.<init>(r126, r127, r128, r129, r130, r131, r132)
            r125 = r1
            r1 = 2023266550(0x789898f6, float:2.476036E34)
            r126 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r1, r3, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r31 = r125
            r28 = r126
            r26 = r137
            r34 = r1
            goto L_0x042a
        L_0x041c:
            r125 = r1
            r17 = r2
            r126 = r3
            r31 = r125
            r28 = r126
            r34 = r136
            r26 = r137
        L_0x042a:
            r24 = r4
            r25 = r6
            r29 = r7
            r23 = r10
            r32 = r12
            r30 = r13
            r33 = r16
            r27 = r17
        L_0x043a:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x044c
            r1 = -1042273141(0xffffffffc1e02c8b, float:-28.02175)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:943)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r5, r2)
        L_0x044c:
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r2 = r0 & r115
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r20 = r1 | r0
            r0 = r5 & 14
            r1 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = r5 & r110
            r0 = r0 | r1
            r1 = r5 & r111
            r0 = r0 | r1
            r1 = r5 & r113
            r0 = r0 | r1
            r1 = r5 & r114
            r0 = r0 | r1
            r1 = r5 & r115
            r21 = r0 | r1
            r22 = 0
            r0 = r118
            r1 = r119
            r2 = r120
            r3 = r121
            r4 = r122
            r5 = r123
            r6 = r124
            r7 = r23
            r35 = r8
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r18 = r34
            r19 = r35
            r0.DecorationBox(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04be
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04be:
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r34
        L_0x04d6:
            androidx.compose.runtime.ScopeUpdateScope r7 = r35.endRestartGroup()
            if (r7 != 0) goto L_0x04dd
            goto L_0x0503
        L_0x04dd:
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2 r23 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2
            r0 = r23
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r6 = r123
            r117 = r7
            r7 = r124
            r20 = r138
            r21 = r139
            r22 = r140
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r23
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r117
            r1.updateScope(r0)
        L_0x0503:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0149  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @kotlin.ReplaceWith(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void OutlinedTextFieldDecorationBox(java.lang.String r117, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r118, boolean r119, boolean r120, androidx.compose.ui.text.input.VisualTransformation r121, androidx.compose.foundation.interaction.InteractionSource r122, boolean r123, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r124, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, androidx.compose.material3.TextFieldColors r131, androidx.compose.foundation.layout.PaddingValues r132, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r133, androidx.compose.runtime.Composer r134, int r135, int r136, int r137) {
        /*
            r116 = this;
            r15 = r117
            r14 = r118
            r13 = r121
            r12 = r122
            r11 = r135
            r10 = r136
            r9 = r137
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -789275592(0xffffffffd0f49c38, float:-3.28310292E10)
            r1 = r134
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(OutlinedTextFieldDecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)1031@56982L8,1036@57262L589:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x003b
            r1 = r11 | 6
            goto L_0x004b
        L_0x003b:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x004a
            boolean r1 = r8.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x0047:
            r1 = 2
        L_0x0048:
            r1 = r1 | r11
            goto L_0x004b
        L_0x004a:
            r1 = r11
        L_0x004b:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 48
            goto L_0x0062
        L_0x0052:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0062
            boolean r4 = r8.changedInstance(r14)
            if (r4 == 0) goto L_0x005f
            r4 = 32
            goto L_0x0061
        L_0x005f:
            r4 = 16
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r9 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006b:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x007f
            r4 = r119
            boolean r17 = r8.changed((boolean) r4)
            if (r17 == 0) goto L_0x007a
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x007c
        L_0x007a:
            r17 = r16
        L_0x007c:
            r1 = r1 | r17
            goto L_0x0081
        L_0x007f:
            r4 = r119
        L_0x0081:
            r17 = r9 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x008c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a0
        L_0x008c:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a0
            r2 = r120
            boolean r17 = r8.changed((boolean) r2)
            if (r17 == 0) goto L_0x009b
            r17 = r18
            goto L_0x009d
        L_0x009b:
            r17 = r19
        L_0x009d:
            r1 = r1 | r17
            goto L_0x00a2
        L_0x00a0:
            r2 = r120
        L_0x00a2:
            r17 = r9 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r17 == 0) goto L_0x00b0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c1
        L_0x00b0:
            r17 = r11 & r110
            if (r17 != 0) goto L_0x00c1
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x00bd
            r17 = r21
            goto L_0x00bf
        L_0x00bd:
            r17 = r20
        L_0x00bf:
            r1 = r1 | r17
        L_0x00c1:
            r17 = r9 & 32
            r22 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00ce
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00cb:
            r1 = r1 | r17
            goto L_0x00de
        L_0x00ce:
            r17 = r11 & r111
            if (r17 != 0) goto L_0x00de
            boolean r17 = r8.changed((java.lang.Object) r12)
            if (r17 == 0) goto L_0x00db
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cb
        L_0x00db:
            r17 = r22
            goto L_0x00cb
        L_0x00de:
            r17 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00eb
            r23 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r23
            r3 = r123
            goto L_0x00fe
        L_0x00eb:
            r23 = r11 & r112
            r3 = r123
            if (r23 != 0) goto L_0x00fe
            boolean r24 = r8.changed((boolean) r3)
            if (r24 == 0) goto L_0x00fa
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00fc
        L_0x00fa:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00fc:
            r1 = r1 | r24
        L_0x00fe:
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0109
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r25
            r6 = r124
            goto L_0x011e
        L_0x0109:
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            r25 = r11 & r25
            r6 = r124
            if (r25 != 0) goto L_0x011e
            boolean r26 = r8.changedInstance(r6)
            if (r26 == 0) goto L_0x011a
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x011c
        L_0x011a:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x011c:
            r1 = r1 | r26
        L_0x011e:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0129
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r27
            r0 = r125
            goto L_0x013e
        L_0x0129:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r11 & r27
            r0 = r125
            if (r27 != 0) goto L_0x013e
            boolean r27 = r8.changedInstance(r0)
            if (r27 == 0) goto L_0x013a
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x013c
        L_0x013a:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x013c:
            r1 = r1 | r27
        L_0x013e:
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0149
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            r2 = r126
            goto L_0x015e
        L_0x0149:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r11 & r27
            r2 = r126
            if (r27 != 0) goto L_0x015e
            boolean r27 = r8.changedInstance(r2)
            if (r27 == 0) goto L_0x015a
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015c
        L_0x015a:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015c:
            r1 = r1 | r27
        L_0x015e:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0167
            r23 = r10 | 6
            r3 = r127
            goto L_0x017d
        L_0x0167:
            r27 = r10 & 14
            r3 = r127
            if (r27 != 0) goto L_0x017b
            boolean r27 = r8.changedInstance(r3)
            if (r27 == 0) goto L_0x0176
            r23 = 4
            goto L_0x0178
        L_0x0176:
            r23 = 2
        L_0x0178:
            r23 = r10 | r23
            goto L_0x017d
        L_0x017b:
            r23 = r10
        L_0x017d:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0184
            r23 = r23 | 48
            goto L_0x0197
        L_0x0184:
            r27 = r10 & 112(0x70, float:1.57E-43)
            r4 = r128
            if (r27 != 0) goto L_0x0197
            boolean r27 = r8.changedInstance(r4)
            if (r27 == 0) goto L_0x0193
            r24 = 32
            goto L_0x0195
        L_0x0193:
            r24 = 16
        L_0x0195:
            r23 = r23 | r24
        L_0x0197:
            r4 = r23
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a0
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x01b4
        L_0x01a0:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01b4
            r12 = r129
            boolean r23 = r8.changedInstance(r12)
            if (r23 == 0) goto L_0x01af
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01b1
        L_0x01af:
            r26 = r16
        L_0x01b1:
            r4 = r4 | r26
            goto L_0x01b6
        L_0x01b4:
            r12 = r129
        L_0x01b6:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01bd
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cf
        L_0x01bd:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01cf
            r13 = r130
            boolean r16 = r8.changedInstance(r13)
            if (r16 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r18 = r19
        L_0x01cc:
            r4 = r4 | r18
            goto L_0x01d1
        L_0x01cf:
            r13 = r130
        L_0x01d1:
            r16 = r10 & r110
            if (r16 != 0) goto L_0x01e9
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01e4
            r13 = r131
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x01e6
            r20 = r21
            goto L_0x01e6
        L_0x01e4:
            r13 = r131
        L_0x01e6:
            r4 = r4 | r20
            goto L_0x01eb
        L_0x01e9:
            r13 = r131
        L_0x01eb:
            r16 = r10 & r111
            r113 = 32768(0x8000, float:4.5918E-41)
            if (r16 != 0) goto L_0x0206
            r16 = r9 & r113
            r13 = r132
            if (r16 != 0) goto L_0x0201
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x0201
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0203
        L_0x0201:
            r16 = r22
        L_0x0203:
            r4 = r4 | r16
            goto L_0x0208
        L_0x0206:
            r13 = r132
        L_0x0208:
            r114 = r9 & r22
            if (r114 == 0) goto L_0x0213
            r16 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r16
            r10 = r133
            goto L_0x0226
        L_0x0213:
            r16 = r10 & r112
            r10 = r133
            if (r16 != 0) goto L_0x0226
            boolean r16 = r8.changedInstance(r10)
            if (r16 == 0) goto L_0x0222
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0224
        L_0x0222:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x0224:
            r4 = r4 | r16
        L_0x0226:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r1 & r16
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x025d
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r4
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r13) goto L_0x025d
            boolean r10 = r8.getSkipping()
            if (r10 != 0) goto L_0x0240
            goto L_0x025d
        L_0x0240:
            r8.skipToGroupEnd()
            r9 = r124
            r10 = r125
            r11 = r126
            r12 = r127
            r13 = r128
            r14 = r129
            r15 = r130
            r16 = r131
            r17 = r132
            r18 = r133
            r33 = r8
            r8 = r123
            goto L_0x044a
        L_0x025d:
            r8.startDefaults()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x0296
            boolean r10 = r8.getDefaultsInvalid()
            if (r10 == 0) goto L_0x026b
            goto L_0x0296
        L_0x026b:
            r8.skipToGroupEnd()
            r0 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0276
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r0
        L_0x0276:
            r0 = r9 & r113
            if (r0 == 0) goto L_0x027e
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x027e:
            r22 = r123
            r23 = r124
            r24 = r125
            r25 = r126
            r26 = r127
            r27 = r128
            r28 = r129
            r29 = r130
            r30 = r131
            r31 = r132
            r32 = r133
            goto L_0x03b3
        L_0x0296:
            if (r17 == 0) goto L_0x029a
            r10 = 0
            goto L_0x029c
        L_0x029a:
            r10 = r123
        L_0x029c:
            r13 = 0
            if (r5 == 0) goto L_0x02a1
            r5 = r13
            goto L_0x02a3
        L_0x02a1:
            r5 = r124
        L_0x02a3:
            if (r7 == 0) goto L_0x02a7
            r7 = r13
            goto L_0x02a9
        L_0x02a7:
            r7 = r125
        L_0x02a9:
            if (r0 == 0) goto L_0x02ad
            r0 = r13
            goto L_0x02af
        L_0x02ad:
            r0 = r126
        L_0x02af:
            if (r2 == 0) goto L_0x02b3
            r2 = r13
            goto L_0x02b5
        L_0x02b3:
            r2 = r127
        L_0x02b5:
            if (r3 == 0) goto L_0x02b9
            r3 = r13
            goto L_0x02bb
        L_0x02b9:
            r3 = r128
        L_0x02bb:
            if (r6 == 0) goto L_0x02bf
            r6 = r13
            goto L_0x02c1
        L_0x02bf:
            r6 = r129
        L_0x02c1:
            if (r12 == 0) goto L_0x02c4
            goto L_0x02c6
        L_0x02c4:
            r13 = r130
        L_0x02c6:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x033d
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.TextFieldColors r12 = r16.m1474colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r16
            goto L_0x033f
        L_0x033d:
            r12 = r131
        L_0x033f:
            r16 = r9 & r113
            if (r16 == 0) goto L_0x0369
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            r123 = r16
            r124 = r17
            r125 = r18
            r126 = r19
            r127 = r20
            r128 = r21
            r129 = r22
            androidx.compose.foundation.layout.PaddingValues r16 = androidx.compose.material3.OutlinedTextFieldDefaults.m1472contentPaddinga9UjIt4$default(r123, r124, r125, r126, r127, r128, r129)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r17
            goto L_0x036b
        L_0x0369:
            r16 = r132
        L_0x036b:
            r134 = r0
            if (r114 == 0) goto L_0x0399
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r0 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r123 = r0
            r124 = r119
            r125 = r10
            r126 = r122
            r127 = r12
            r128 = r1
            r129 = r4
            r123.<init>(r124, r125, r126, r127, r128, r129)
            r123 = r2
            r2 = -1153197597(0xffffffffbb4399e3, float:-0.0029846362)
            r124 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r2, r3, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r26 = r123
            r27 = r124
            r25 = r134
            r32 = r0
            goto L_0x03a5
        L_0x0399:
            r123 = r2
            r124 = r3
            r26 = r123
            r27 = r124
            r32 = r133
            r25 = r134
        L_0x03a5:
            r23 = r5
            r28 = r6
            r24 = r7
            r22 = r10
            r30 = r12
            r29 = r13
            r31 = r16
        L_0x03b3:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03c5
            java.lang.String r0 = "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1016)"
            r2 = -789275592(0xffffffffd0f49c38, float:-3.28310292E10)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r4, r0)
        L_0x03c5:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r2 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = r1 & r110
            r2 = r2 | r3
            r3 = r1 & r111
            r2 = r2 | r3
            r3 = r1 & r112
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r19 = r2 | r1
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r4 & 14
            r1 = r1 | r2
            r2 = r4 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r4 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r4 & r110
            r1 = r1 | r2
            r2 = r4 & r111
            r1 = r1 | r2
            r2 = r4 & r112
            r20 = r1 | r2
            r21 = 0
            r1 = r117
            r2 = r118
            r3 = r119
            r4 = r120
            r5 = r121
            r6 = r122
            r7 = r22
            r33 = r8
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r18 = r33
            r0.DecorationBox(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0434
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0434:
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
        L_0x044a:
            androidx.compose.runtime.ScopeUpdateScope r7 = r33.endRestartGroup()
            if (r7 != 0) goto L_0x0451
            goto L_0x0477
        L_0x0451:
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r22 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            r0 = r22
            r1 = r116
            r2 = r117
            r3 = r118
            r4 = r119
            r5 = r120
            r6 = r121
            r115 = r7
            r7 = r122
            r19 = r135
            r20 = r136
            r21 = r137
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r22
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r115
            r1.updateScope(r0)
        L_0x0477:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1711textFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        composer2.startReplaceableGroup(-595874869);
        ComposerKt.sourceInformation(composer2, "C(textFieldColors)P(28:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,27,19:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,10:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,26:c#ui.graphics.Color,5:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,7:c#ui.graphics.Color,16:c#ui.graphics.Color)1060@58072L9,1061@58159L9,1063@58309L9,1064@58382L9,1065@58470L9,1066@58553L7,1067@58649L9,1068@58744L9,1069@58846L9,1071@59022L9,1072@59118L9,1073@59211L9,1074@59311L9,1076@59481L9,1077@59579L9,1078@59674L9,1079@59776L9,1081@59949L9,1082@60033L9,1083@60114L9,1084@60202L9,1086@60354L9,1087@60443L9,1088@60537L9,1090@60705L9,1091@60800L9,1092@60902L9,1094@61073L9,1095@61159L9,1096@61247L9,1097@61334L9,1099@61488L9,1100@61574L9,1101@61662L9,1102@61749L9,1104@61903L9,1105@61939L2261:TextFieldDefaults.kt#uh7d8r");
        long color = (i9 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j;
        long r9 = (i9 & 2) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long color2 = (i9 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer2, 6) : j3;
        long color3 = (i9 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j4;
        long color4 = (i9 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j5;
        if ((i9 & 32) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color5 = (i9 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer2, 6) : j6;
        long color6 = (i9 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6) : j7;
        long r27 = (i9 & 256) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color7 = (i9 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer2, 6) : j9;
        long color8 = (i9 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j10;
        long color9 = (i9 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j11;
        long r35 = (i9 & 4096) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color10 = (i9 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j13;
        long color11 = (i9 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j14;
        long color12 = (32768 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j15;
        long r43 = (65536 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color13 = (131072 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j17;
        long color14 = (262144 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j18;
        long color15 = (524288 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j19;
        long r51 = (1048576 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long color16 = (2097152 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j21;
        long color17 = (4194304 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j22;
        long r58 = (8388608 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long color18 = (16777216 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j24;
        long color19 = (33554432 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j25;
        long r66 = (67108864 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long color20 = (134217728 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j27;
        long color21 = (268435456 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j28;
        long color22 = (536870912 & i9) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j29;
        long r74 = (i9 & BasicMeasure.EXACTLY) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j30;
        long color23 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j31;
        long color24 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j32;
        long color25 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j33;
        long r82 = (i6 & 8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j34;
        long color26 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i7, i8, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1059)");
        }
        int i10 = i7 << 3;
        int i11 = (i7 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i7 << 9;
        int i13 = i11 | (i12 & 7168) | ((i7 << 6) & 57344) | (i12 & 458752) | ((i7 << 12) & 3670016);
        int i14 = i7 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 >> 15;
        int i17 = i8 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i8 >> 15;
        int i20 = i3 << 15;
        int i21 = (i19 & 57344) | (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
        int i22 = i3 << 18;
        int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = i3 >> 9;
        int i25 = ((i3 >> 6) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016);
        int i26 = i4 << 21;
        int i27 = i25 | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i4 >> 9;
        TextFieldColors r0 = m1696colors0hiis_0(color, color, r9, color, color2, color2, color2, color2, color3, color4, textSelectionColors2, color5, color6, r27, color7, color8, color9, r35, color10, color11, color12, r43, color13, color14, color15, r51, color16, color17, color17, r58, color17, color18, color19, r66, color20, color21, color22, r74, color23, color24, color25, r82, color26, composer, i15, i18, i23, i27, (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1707outlinedTextFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        composer2.startReplaceableGroup(1767818445);
        ComposerKt.sourceInformation(composer2, "C(outlinedTextFieldColors)P(28:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,27,19:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,10:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,26:c#ui.graphics.Color,5:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,7:c#ui.graphics.Color,16:c#ui.graphics.Color)1155@64431L9,1156@64520L9,1159@64718L9,1160@64808L9,1161@64891L7,1162@64978L9,1163@65064L9,1164@65157L9,1166@65318L9,1167@65416L9,1168@65511L9,1169@65613L9,1171@65787L9,1172@65887L9,1173@65984L9,1175@66101L9,1176@66265L9,1177@66351L9,1178@66434L9,1179@66524L9,1181@66680L9,1182@66771L9,1183@66867L9,1185@67039L9,1186@67136L9,1188@67253L9,1189@67415L9,1190@67503L9,1191@67593L9,1192@67682L9,1194@67840L9,1195@67928L9,1196@68018L9,1197@68107L9,1199@68265L9,1200@68327L2237:TextFieldDefaults.kt#uh7d8r");
        long color = (i9 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j;
        long r9 = (i9 & 2) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long r16 = (i9 & 4) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j3;
        long color2 = (i9 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j4;
        long color3 = (i9 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j5;
        if ((i9 & 32) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color4 = (i9 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer2, 6) : j6;
        long color5 = (i9 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer2, 6) : j7;
        long r27 = (i9 & 256) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color6 = (i9 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer2, 6) : j9;
        long color7 = (i9 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j10;
        long color8 = (i9 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j11;
        long r35 = (i9 & 4096) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color9 = (i9 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j13;
        long color10 = (i9 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j14;
        long color11 = (32768 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j15;
        long r43 = (65536 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color12 = (131072 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j17;
        long color13 = (262144 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j18;
        long color14 = (524288 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j19;
        long r51 = (1048576 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long color15 = (2097152 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j21;
        long color16 = (4194304 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j22;
        long r58 = (8388608 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        long color17 = (16777216 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j24;
        long color18 = (33554432 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j25;
        long r66 = (67108864 & i9) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j26;
        long color19 = (134217728 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j27;
        long color20 = (268435456 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j28;
        long color21 = (536870912 & i9) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j29;
        long r74 = (i9 & BasicMeasure.EXACTLY) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j30;
        long color22 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j31;
        long color23 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j32;
        long color24 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j33;
        long r82 = (i6 & 8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j34;
        long color25 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i7, i8, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1154)");
        }
        int i10 = i7 << 3;
        int i11 = (i7 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i7 << 9;
        int i13 = i11 | (i12 & 7168) | ((i7 << 6) & 57344) | (i12 & 458752) | ((i7 << 12) & 3670016);
        int i14 = i7 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 >> 15;
        int i17 = i8 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i8 >> 15;
        int i20 = i3 << 15;
        int i21 = (i19 & 57344) | (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
        int i22 = i3 << 18;
        int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = i3 >> 9;
        int i25 = ((i3 >> 6) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016);
        int i26 = i4 << 21;
        int i27 = i25 | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
        int i28 = i4 >> 9;
        TextFieldColors r0 = OutlinedTextFieldDefaults.INSTANCE.m1474colors0hiis_0(color, color, r9, color, r16, r16, r16, r16, color2, color3, textSelectionColors2, color4, color5, r27, color6, color7, color8, r35, color9, color10, color11, r43, color12, color13, color14, r51, color15, color16, color16, r58, color16, color17, color18, r66, color19, color20, color21, r74, color22, color23, color24, r82, color25, composer, i15, i18, i23, i27, (i28 & 14) | 3072 | (i28 & 112) | (i28 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01c1, code lost:
        if (r6.changed((java.lang.Object) r131) != false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01db, code lost:
        if (r6.changed((java.lang.Object) r132) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void TextFieldDecorationBox(java.lang.String r118, kotlin.jvm.functions.Function2 r119, boolean r120, boolean r121, androidx.compose.ui.text.input.VisualTransformation r122, androidx.compose.foundation.interaction.InteractionSource r123, boolean r124, kotlin.jvm.functions.Function2 r125, kotlin.jvm.functions.Function2 r126, kotlin.jvm.functions.Function2 r127, kotlin.jvm.functions.Function2 r128, kotlin.jvm.functions.Function2 r129, androidx.compose.ui.graphics.Shape r130, androidx.compose.material3.TextFieldColors r131, androidx.compose.foundation.layout.PaddingValues r132, kotlin.jvm.functions.Function2 r133, androidx.compose.runtime.Composer r134, int r135, int r136, int r137) {
        /*
            r117 = this;
            r15 = r118
            r14 = r119
            r11 = r122
            r10 = r123
            r9 = r135
            r8 = r136
            r7 = r137
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            r1 = r134
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextFieldDecorationBox)P(14,4,3,11,15,5,6,7,9,8,13,12,10!1,2)1262@71315L5,1263@71356L8,1274@71711L684:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            r0 = r7 & 1
            if (r0 == 0) goto L_0x003b
            r0 = r9 | 6
            goto L_0x004b
        L_0x003b:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x004a
            boolean r0 = r6.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0047
            r0 = 4
            goto L_0x0048
        L_0x0047:
            r0 = 2
        L_0x0048:
            r0 = r0 | r9
            goto L_0x004b
        L_0x004a:
            r0 = r9
        L_0x004b:
            r3 = r7 & 2
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 48
            goto L_0x0062
        L_0x0052:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r6.changedInstance(r14)
            if (r3 == 0) goto L_0x005f
            r3 = 32
            goto L_0x0061
        L_0x005f:
            r3 = 16
        L_0x0061:
            r0 = r0 | r3
        L_0x0062:
            r3 = r7 & 4
            if (r3 == 0) goto L_0x0069
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x007d
        L_0x0069:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r120
            boolean r16 = r6.changed((boolean) r3)
            if (r16 == 0) goto L_0x0078
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r16 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r0 = r0 | r16
            goto L_0x007f
        L_0x007d:
            r3 = r120
        L_0x007f:
            r16 = r7 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x008a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008a:
            r1 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x009e
            r1 = r121
            boolean r16 = r6.changed((boolean) r1)
            if (r16 == 0) goto L_0x0099
            r16 = r17
            goto L_0x009b
        L_0x0099:
            r16 = r18
        L_0x009b:
            r0 = r0 | r16
            goto L_0x00a0
        L_0x009e:
            r1 = r121
        L_0x00a0:
            r16 = r7 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x00ae
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bf
        L_0x00ae:
            r16 = r9 & r110
            if (r16 != 0) goto L_0x00bf
            boolean r16 = r6.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00bb
            r16 = r19
            goto L_0x00bd
        L_0x00bb:
            r16 = r20
        L_0x00bd:
            r0 = r0 | r16
        L_0x00bf:
            r16 = r7 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00cc
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c9:
            r0 = r0 | r16
            goto L_0x00dc
        L_0x00cc:
            r16 = r9 & r111
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r6.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00d9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00d9:
            r16 = r21
            goto L_0x00c9
        L_0x00dc:
            r16 = r7 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e9
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r2 = r124
            goto L_0x00fc
        L_0x00e9:
            r22 = r9 & r112
            r2 = r124
            if (r22 != 0) goto L_0x00fc
            boolean r23 = r6.changed((boolean) r2)
            if (r23 == 0) goto L_0x00f8
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00fa
        L_0x00f8:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00fa:
            r0 = r0 | r23
        L_0x00fc:
            r4 = r7 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0109
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r24
            r5 = r125
            goto L_0x011c
        L_0x0109:
            r24 = r9 & r113
            r5 = r125
            if (r24 != 0) goto L_0x011c
            boolean r25 = r6.changedInstance(r5)
            if (r25 == 0) goto L_0x0118
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x011a
        L_0x0118:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x011a:
            r0 = r0 | r25
        L_0x011c:
            r12 = r7 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0127
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r13 = r126
            goto L_0x013c
        L_0x0127:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r9 & r26
            r13 = r126
            if (r26 != 0) goto L_0x013c
            boolean r27 = r6.changedInstance(r13)
            if (r27 == 0) goto L_0x0138
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x013a
        L_0x0138:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x013a:
            r0 = r0 | r27
        L_0x013c:
            r1 = r7 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0147
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r27
            r2 = r127
            goto L_0x015c
        L_0x0147:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r9 & r27
            r2 = r127
            if (r27 != 0) goto L_0x015c
            boolean r27 = r6.changedInstance(r2)
            if (r27 == 0) goto L_0x0158
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015a
        L_0x0158:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015a:
            r0 = r0 | r27
        L_0x015c:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0165
            r22 = r8 | 6
            r3 = r128
            goto L_0x017b
        L_0x0165:
            r27 = r8 & 14
            r3 = r128
            if (r27 != 0) goto L_0x0179
            boolean r27 = r6.changedInstance(r3)
            if (r27 == 0) goto L_0x0174
            r22 = 4
            goto L_0x0176
        L_0x0174:
            r22 = 2
        L_0x0176:
            r22 = r8 | r22
            goto L_0x017b
        L_0x0179:
            r22 = r8
        L_0x017b:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0184
            r22 = r22 | 48
            r5 = r129
            goto L_0x0197
        L_0x0184:
            r27 = r8 & 112(0x70, float:1.57E-43)
            r5 = r129
            if (r27 != 0) goto L_0x0197
            boolean r27 = r6.changedInstance(r5)
            if (r27 == 0) goto L_0x0193
            r23 = 32
            goto L_0x0195
        L_0x0193:
            r23 = 16
        L_0x0195:
            r22 = r22 | r23
        L_0x0197:
            r5 = r8 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x01b1
            r5 = r7 & 4096(0x1000, float:5.74E-42)
            if (r5 != 0) goto L_0x01aa
            r5 = r130
            boolean r23 = r6.changed((java.lang.Object) r5)
            if (r23 == 0) goto L_0x01ac
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x01ae
        L_0x01aa:
            r5 = r130
        L_0x01ac:
            r25 = 128(0x80, float:1.794E-43)
        L_0x01ae:
            r22 = r22 | r25
            goto L_0x01b3
        L_0x01b1:
            r5 = r130
        L_0x01b3:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01cb
            r5 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x01c4
            r5 = r131
            boolean r23 = r6.changed((java.lang.Object) r5)
            if (r23 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c4:
            r5 = r131
        L_0x01c6:
            r17 = r18
        L_0x01c8:
            r22 = r22 | r17
            goto L_0x01cd
        L_0x01cb:
            r5 = r131
        L_0x01cd:
            r17 = r8 & r110
            if (r17 != 0) goto L_0x01e5
            r5 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x01de
            r5 = r132
            boolean r17 = r6.changed((java.lang.Object) r5)
            if (r17 == 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01de:
            r5 = r132
        L_0x01e0:
            r19 = r20
        L_0x01e2:
            r22 = r22 | r19
            goto L_0x01e7
        L_0x01e5:
            r5 = r132
        L_0x01e7:
            r17 = 32768(0x8000, float:4.5918E-41)
            r114 = r7 & r17
            if (r114 == 0) goto L_0x01f5
            r17 = 196608(0x30000, float:2.75506E-40)
            r22 = r22 | r17
            r5 = r133
            goto L_0x0208
        L_0x01f5:
            r17 = r8 & r111
            r5 = r133
            if (r17 != 0) goto L_0x0208
            boolean r17 = r6.changedInstance(r5)
            if (r17 == 0) goto L_0x0204
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0206
        L_0x0204:
            r17 = r21
        L_0x0206:
            r22 = r22 | r17
        L_0x0208:
            r17 = r7 & r21
            if (r17 == 0) goto L_0x0213
            r17 = 1572864(0x180000, float:2.204052E-39)
            r22 = r22 | r17
            r13 = r117
            goto L_0x0226
        L_0x0213:
            r17 = r8 & r112
            r13 = r117
            if (r17 != 0) goto L_0x0226
            boolean r17 = r6.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x0222
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0224
        L_0x0222:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0224:
            r22 = r22 | r17
        L_0x0226:
            r5 = r22
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r0 & r17
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r10) goto L_0x025d
            r8 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r8 & r5
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r10) goto L_0x025d
            boolean r8 = r6.getSkipping()
            if (r8 != 0) goto L_0x0242
            goto L_0x025d
        L_0x0242:
            r6.skipToGroupEnd()
            r8 = r124
            r9 = r125
            r10 = r126
            r11 = r127
            r12 = r128
            r13 = r129
            r14 = r130
            r15 = r131
            r16 = r132
            r17 = r133
            r32 = r6
            goto L_0x047c
        L_0x025d:
            r6.startDefaults()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x0298
            boolean r8 = r6.getDefaultsInvalid()
            if (r8 == 0) goto L_0x026b
            goto L_0x0298
        L_0x026b:
            r6.skipToGroupEnd()
            r1 = r7 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0274
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0274:
            r1 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x027a
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x027a:
            r1 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0282
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x0282:
            r23 = r124
            r24 = r125
            r25 = r126
            r115 = r127
            r26 = r128
            r27 = r129
            r28 = r130
            r29 = r131
            r30 = r132
            r31 = r133
            goto L_0x03e4
        L_0x0298:
            if (r16 == 0) goto L_0x029c
            r8 = 0
            goto L_0x029e
        L_0x029c:
            r8 = r124
        L_0x029e:
            r16 = 0
            if (r4 == 0) goto L_0x02a5
            r4 = r16
            goto L_0x02a7
        L_0x02a5:
            r4 = r125
        L_0x02a7:
            if (r12 == 0) goto L_0x02ac
            r12 = r16
            goto L_0x02ae
        L_0x02ac:
            r12 = r126
        L_0x02ae:
            if (r1 == 0) goto L_0x02b3
            r1 = r16
            goto L_0x02b5
        L_0x02b3:
            r1 = r127
        L_0x02b5:
            if (r2 == 0) goto L_0x02ba
            r2 = r16
            goto L_0x02bc
        L_0x02ba:
            r2 = r128
        L_0x02bc:
            if (r3 == 0) goto L_0x02c1
            r3 = r16
            goto L_0x02c3
        L_0x02c1:
            r3 = r129
        L_0x02c3:
            r10 = r7 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x02d3
            androidx.compose.material3.TextFieldDefaults r10 = INSTANCE
            r115 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r10 = r10.getShape(r6, r1)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02d7
        L_0x02d3:
            r115 = r1
            r10 = r130
        L_0x02d7:
            r1 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x034f
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            int r1 = r5 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r107 = r1
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r117
            r102 = r6
            androidx.compose.material3.TextFieldColors r1 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0351
        L_0x034f:
            r1 = r131
        L_0x0351:
            r16 = r2
            r2 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x039a
            if (r4 != 0) goto L_0x0377
            r2 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r124 = r117
            r125 = r2
            r126 = r17
            r127 = r18
            r128 = r19
            r129 = r20
            r130 = r21
            androidx.compose.foundation.layout.PaddingValues r2 = m1687contentPaddingWithoutLabela9UjIt4$default(r124, r125, r126, r127, r128, r129, r130)
            goto L_0x0394
        L_0x0377:
            r2 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r124 = r117
            r125 = r2
            r126 = r17
            r127 = r18
            r128 = r19
            r129 = r20
            r130 = r21
            androidx.compose.foundation.layout.PaddingValues r2 = m1686contentPaddingWithLabela9UjIt4$default(r124, r125, r126, r127, r128, r129, r130)
        L_0x0394:
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r17
            goto L_0x039c
        L_0x039a:
            r2 = r132
        L_0x039c:
            if (r114 == 0) goto L_0x03cc
            r132 = r2
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$3 r2 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$3
            r124 = r2
            r125 = r120
            r126 = r8
            r127 = r123
            r128 = r1
            r129 = r10
            r130 = r0
            r131 = r5
            r124.<init>(r125, r126, r127, r128, r129, r130, r131)
            r124 = r1
            r1 = -1171460386(0xffffffffba2ceede, float:-6.596873E-4)
            r125 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r6, r1, r3, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r29 = r124
            r27 = r125
            r30 = r132
            r31 = r1
            goto L_0x03da
        L_0x03cc:
            r124 = r1
            r132 = r2
            r125 = r3
            r29 = r124
            r27 = r125
            r30 = r132
            r31 = r133
        L_0x03da:
            r24 = r4
            r23 = r8
            r28 = r10
            r25 = r12
            r26 = r16
        L_0x03e4:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x03f6
            r1 = -1224712461(0xffffffffb7005ef3, float:-7.651502E-6)
            java.lang.String r2 = "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:1249)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r5, r2)
        L_0x03f6:
            r12 = 0
            r1 = 0
            r13 = r1
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r20 = r1 | r0
            r0 = r5 & 14
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r1 = 6
            int r1 = r5 << 6
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r110
            r0 = r0 | r2
            r2 = r1 & r111
            r0 = r0 | r2
            r2 = r1 & r112
            r0 = r0 | r2
            r2 = r1 & r113
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r21 = r0 | r1
            r22 = 0
            r0 = r117
            r1 = r118
            r2 = r119
            r3 = r120
            r4 = r121
            r5 = r122
            r32 = r6
            r6 = r123
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r115
            r11 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r0.DecorationBox(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0468
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0468:
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r11 = r115
        L_0x047c:
            androidx.compose.runtime.ScopeUpdateScope r7 = r32.endRestartGroup()
            if (r7 != 0) goto L_0x0483
            goto L_0x04a9
        L_0x0483:
            androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$4 r21 = new androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$4
            r0 = r21
            r1 = r117
            r2 = r118
            r3 = r119
            r4 = r120
            r5 = r121
            r6 = r122
            r116 = r7
            r7 = r123
            r18 = r135
            r19 = r136
            r20 = r137
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r21
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r116
            r1.updateScope(r0)
        L_0x04a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01bf, code lost:
        if (r6.changed((java.lang.Object) r128) != false) goto L_0x01c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(java.lang.String r115, kotlin.jvm.functions.Function2 r116, boolean r117, boolean r118, androidx.compose.ui.text.input.VisualTransformation r119, androidx.compose.foundation.interaction.InteractionSource r120, boolean r121, kotlin.jvm.functions.Function2 r122, kotlin.jvm.functions.Function2 r123, kotlin.jvm.functions.Function2 r124, kotlin.jvm.functions.Function2 r125, kotlin.jvm.functions.Function2 r126, androidx.compose.material3.TextFieldColors r127, androidx.compose.foundation.layout.PaddingValues r128, kotlin.jvm.functions.Function2 r129, androidx.compose.runtime.Composer r130, int r131, int r132, int r133) {
        /*
            r114 = this;
            r15 = r115
            r14 = r116
            r11 = r119
            r10 = r120
            r9 = r131
            r8 = r132
            r7 = r133
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 508645792(0x1e5151a0, float:1.10812475E-20)
            r1 = r130
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(OutlinedTextFieldDecorationBox)P(13,4,3,10,14,5,6,7,9,8,12,11!1,2)1312@73179L8,1318@73467L656:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x003b
            r1 = r9 | 6
            goto L_0x004b
        L_0x003b:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x004a
            boolean r1 = r6.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x0047:
            r1 = 2
        L_0x0048:
            r1 = r1 | r9
            goto L_0x004b
        L_0x004a:
            r1 = r9
        L_0x004b:
            r4 = r7 & 2
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 48
            goto L_0x0062
        L_0x0052:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0062
            boolean r4 = r6.changedInstance(r14)
            if (r4 == 0) goto L_0x005f
            r4 = 32
            goto L_0x0061
        L_0x005f:
            r4 = 16
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r7 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006b:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x007f
            r4 = r117
            boolean r17 = r6.changed((boolean) r4)
            if (r17 == 0) goto L_0x007a
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x007c
        L_0x007a:
            r17 = r16
        L_0x007c:
            r1 = r1 | r17
            goto L_0x0081
        L_0x007f:
            r4 = r117
        L_0x0081:
            r17 = r7 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x008c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a0
        L_0x008c:
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a0
            r2 = r118
            boolean r17 = r6.changed((boolean) r2)
            if (r17 == 0) goto L_0x009b
            r17 = r18
            goto L_0x009d
        L_0x009b:
            r17 = r19
        L_0x009d:
            r1 = r1 | r17
            goto L_0x00a2
        L_0x00a0:
            r2 = r118
        L_0x00a2:
            r17 = r7 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r17 == 0) goto L_0x00b0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c1
        L_0x00b0:
            r17 = r9 & r110
            if (r17 != 0) goto L_0x00c1
            boolean r17 = r6.changed((java.lang.Object) r11)
            if (r17 == 0) goto L_0x00bd
            r17 = r20
            goto L_0x00bf
        L_0x00bd:
            r17 = r21
        L_0x00bf:
            r1 = r1 | r17
        L_0x00c1:
            r17 = r7 & 32
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00cc
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00c9:
            r1 = r1 | r17
            goto L_0x00dc
        L_0x00cc:
            r17 = r9 & r111
            if (r17 != 0) goto L_0x00dc
            boolean r17 = r6.changed((java.lang.Object) r10)
            if (r17 == 0) goto L_0x00d9
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00d9:
            r17 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c9
        L_0x00dc:
            r17 = r7 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00e9
            r22 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r22
            r3 = r121
            goto L_0x00fc
        L_0x00e9:
            r22 = r9 & r112
            r3 = r121
            if (r22 != 0) goto L_0x00fc
            boolean r23 = r6.changed((boolean) r3)
            if (r23 == 0) goto L_0x00f8
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00fa
        L_0x00f8:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00fa:
            r1 = r1 | r23
        L_0x00fc:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0107
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r24
            r12 = r122
            goto L_0x011c
        L_0x0107:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r9 & r24
            r12 = r122
            if (r24 != 0) goto L_0x011c
            boolean r25 = r6.changedInstance(r12)
            if (r25 == 0) goto L_0x0118
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x011a
        L_0x0118:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x011a:
            r1 = r1 | r25
        L_0x011c:
            r13 = r7 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0127
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r26
            r0 = r123
            goto L_0x013c
        L_0x0127:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r9 & r26
            r0 = r123
            if (r26 != 0) goto L_0x013c
            boolean r26 = r6.changedInstance(r0)
            if (r26 == 0) goto L_0x0138
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x013a
        L_0x0138:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x013a:
            r1 = r1 | r26
        L_0x013c:
            r0 = r7 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0147
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r26
            r2 = r124
            goto L_0x015c
        L_0x0147:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r9 & r26
            r2 = r124
            if (r26 != 0) goto L_0x015c
            boolean r26 = r6.changedInstance(r2)
            if (r26 == 0) goto L_0x0158
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015a
        L_0x0158:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015a:
            r1 = r1 | r26
        L_0x015c:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0165
            r22 = r8 | 6
            r3 = r125
            goto L_0x017b
        L_0x0165:
            r26 = r8 & 14
            r3 = r125
            if (r26 != 0) goto L_0x0179
            boolean r26 = r6.changedInstance(r3)
            if (r26 == 0) goto L_0x0174
            r22 = 4
            goto L_0x0176
        L_0x0174:
            r22 = 2
        L_0x0176:
            r22 = r8 | r22
            goto L_0x017b
        L_0x0179:
            r22 = r8
        L_0x017b:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0184
            r22 = r22 | 48
            r4 = r126
            goto L_0x0197
        L_0x0184:
            r26 = r8 & 112(0x70, float:1.57E-43)
            r4 = r126
            if (r26 != 0) goto L_0x0197
            boolean r26 = r6.changedInstance(r4)
            if (r26 == 0) goto L_0x0193
            r23 = 32
            goto L_0x0195
        L_0x0193:
            r23 = 16
        L_0x0195:
            r22 = r22 | r23
        L_0x0197:
            r4 = r8 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x01af
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x01aa
            r4 = r127
            boolean r23 = r6.changed((java.lang.Object) r4)
            if (r23 == 0) goto L_0x01ac
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x01ac
        L_0x01aa:
            r4 = r127
        L_0x01ac:
            r22 = r22 | r16
            goto L_0x01b1
        L_0x01af:
            r4 = r127
        L_0x01b1:
            r4 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x01c9
            r4 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x01c2
            r4 = r128
            boolean r16 = r6.changed((java.lang.Object) r4)
            if (r16 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c2:
            r4 = r128
        L_0x01c4:
            r18 = r19
        L_0x01c6:
            r22 = r22 | r18
            goto L_0x01cb
        L_0x01c9:
            r4 = r128
        L_0x01cb:
            r4 = r22
            r10 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01d6
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r8 = r129
            goto L_0x01e7
        L_0x01d6:
            r16 = r8 & r110
            r8 = r129
            if (r16 != 0) goto L_0x01e7
            boolean r16 = r6.changedInstance(r8)
            if (r16 == 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r20 = r21
        L_0x01e5:
            r4 = r4 | r20
        L_0x01e7:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r16
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r11) goto L_0x0218
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r4
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r11) goto L_0x0218
            boolean r8 = r6.getSkipping()
            if (r8 != 0) goto L_0x0200
            goto L_0x0218
        L_0x0200:
            r6.skipToGroupEnd()
            r8 = r121
            r10 = r123
            r11 = r124
            r13 = r126
            r14 = r127
            r15 = r128
            r16 = r129
            r31 = r6
            r9 = r12
            r12 = r125
            goto L_0x03d7
        L_0x0218:
            r6.startDefaults()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x0249
            boolean r8 = r6.getDefaultsInvalid()
            if (r8 == 0) goto L_0x0226
            goto L_0x0249
        L_0x0226:
            r6.skipToGroupEnd()
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x022f
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x022f:
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0235
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0235:
            r22 = r121
            r24 = r123
            r25 = r124
            r26 = r125
            r27 = r126
            r28 = r127
            r29 = r128
            r30 = r129
            r23 = r12
            goto L_0x0349
        L_0x0249:
            if (r17 == 0) goto L_0x024d
            r8 = 0
            goto L_0x024f
        L_0x024d:
            r8 = r121
        L_0x024f:
            r11 = 0
            if (r5 == 0) goto L_0x0253
            r12 = r11
        L_0x0253:
            if (r13 == 0) goto L_0x0257
            r5 = r11
            goto L_0x0259
        L_0x0257:
            r5 = r123
        L_0x0259:
            if (r0 == 0) goto L_0x025d
            r0 = r11
            goto L_0x025f
        L_0x025d:
            r0 = r124
        L_0x025f:
            if (r2 == 0) goto L_0x0263
            r2 = r11
            goto L_0x0265
        L_0x0263:
            r2 = r125
        L_0x0265:
            if (r3 == 0) goto L_0x0268
            goto L_0x026a
        L_0x0268:
            r11 = r126
        L_0x026a:
            r3 = r7 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x02de
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r6
            androidx.compose.material3.TextFieldColors r3 = r16.m1474colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02e0
        L_0x02de:
            r3 = r127
        L_0x02e0:
            r13 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x0307
            androidx.compose.material3.OutlinedTextFieldDefaults r13 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r121 = r13
            r122 = r16
            r123 = r17
            r124 = r18
            r125 = r19
            r126 = r20
            r127 = r21
            androidx.compose.foundation.layout.PaddingValues r13 = androidx.compose.material3.OutlinedTextFieldDefaults.m1472contentPaddinga9UjIt4$default(r121, r122, r123, r124, r125, r126, r127)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0309
        L_0x0307:
            r13 = r128
        L_0x0309:
            if (r10 == 0) goto L_0x0333
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$3 r10 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$3
            r121 = r10
            r122 = r117
            r123 = r8
            r124 = r120
            r125 = r3
            r126 = r1
            r127 = r4
            r121.<init>(r122, r123, r124, r125, r126, r127)
            r121 = r0
            r0 = 144282315(0x89992cb, float:9.242863E-34)
            r122 = r2
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r6, r0, r2, r10)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r25 = r121
            r26 = r122
            r30 = r0
            goto L_0x033d
        L_0x0333:
            r121 = r0
            r122 = r2
            r25 = r121
            r26 = r122
            r30 = r129
        L_0x033d:
            r28 = r3
            r24 = r5
            r22 = r8
            r27 = r11
            r23 = r12
            r29 = r13
        L_0x0349:
            r6.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x035b
            java.lang.String r0 = "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1299)"
            r2 = 508645792(0x1e5151a0, float:1.10812475E-20)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r4, r0)
        L_0x035b:
            androidx.compose.material3.OutlinedTextFieldDefaults r0 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r12 = 0
            r13 = 0
            r2 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = r1 & r110
            r2 = r2 | r3
            r3 = r1 & r111
            r2 = r2 | r3
            r3 = r1 & r112
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r19 = r2 | r1
            r1 = 12583344(0xc001b0, float:1.763302E-38)
            r2 = r4 & 14
            r1 = r1 | r2
            int r2 = r4 << 6
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r3 = r2 & r110
            r1 = r1 | r3
            r3 = r2 & r111
            r1 = r1 | r3
            r2 = r2 & r112
            r20 = r1 | r2
            r21 = 0
            r1 = r115
            r2 = r116
            r3 = r117
            r4 = r118
            r5 = r119
            r31 = r6
            r6 = r120
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r0.DecorationBox(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03c5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03c5:
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
        L_0x03d7:
            androidx.compose.runtime.ScopeUpdateScope r7 = r31.endRestartGroup()
            if (r7 != 0) goto L_0x03de
            goto L_0x0404
        L_0x03de:
            androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$4 r20 = new androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$4
            r0 = r20
            r1 = r114
            r2 = r115
            r3 = r116
            r4 = r117
            r5 = r118
            r6 = r119
            r113 = r7
            r7 = r120
            r17 = r131
            r18 = r132
            r19 = r133
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r113
            r1.updateScope(r0)
        L_0x0404:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m1705indicatorLinegv0btCI(Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2) {
        Modifier modifier2 = modifier;
        Intrinsics.checkNotNullParameter(modifier, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(textFieldColors, "colors");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z2, interactionSource, textFieldColors, f, f2) : InspectableValueKt.getNoInspectorInfo(), new TextFieldDefaults$indicatorLine$2(z, z2, interactionSource, textFieldColors, f, f2));
    }

    static {
        float r0 = Dp.m5626constructorimpl((float) 1);
        UnfocusedIndicatorThickness = r0;
        float r1 = Dp.m5626constructorimpl((float) 2);
        FocusedIndicatorThickness = r1;
        UnfocusedBorderThickness = r0;
        FocusedBorderThickness = r1;
    }
}

package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0001\u00020\u0003ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* compiled from: TextAlign.kt */
public final class TextAlign {
    /* access modifiers changed from: private */
    public static final int Center = m5500constructorimpl(3);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int End = m5500constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Justify = m5500constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Left = m5500constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Right = m5500constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Start = m5500constructorimpl(5);
    private final int value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextAlign m5499boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m5500constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m5501equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m5505unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m5502equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m5503hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m5501equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5503hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m5505unboximpl() {
        return this.value;
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    public String toString() {
        return m5504toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m5504toStringimpl(int i) {
        if (m5502equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m5502equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m5502equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m5502equalsimpl0(i, Justify)) {
            return "Justify";
        }
        if (m5502equalsimpl0(i, Start)) {
            return "Start";
        }
        return m5502equalsimpl0(i, End) ? "End" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013ø\u0001\u0000R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "()V", "Center", "Landroidx/compose/ui/text/style/TextAlign;", "getCenter-e0LSkKk", "()I", "I", "End", "getEnd-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Left", "getLeft-e0LSkKk", "Right", "getRight-e0LSkKk", "Start", "getStart-e0LSkKk", "values", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TextAlign.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLeft-e0LSkKk  reason: not valid java name */
        public final int m5509getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk  reason: not valid java name */
        public final int m5510getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getCenter-e0LSkKk  reason: not valid java name */
        public final int m5506getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getJustify-e0LSkKk  reason: not valid java name */
        public final int m5508getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getStart-e0LSkKk  reason: not valid java name */
        public final int m5511getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getEnd-e0LSkKk  reason: not valid java name */
        public final int m5507getEnde0LSkKk() {
            return TextAlign.End;
        }

        public final List<TextAlign> values() {
            return CollectionsKt.listOf(TextAlign.m5499boximpl(m5509getLefte0LSkKk()), TextAlign.m5499boximpl(m5510getRighte0LSkKk()), TextAlign.m5499boximpl(m5506getCentere0LSkKk()), TextAlign.m5499boximpl(m5508getJustifye0LSkKk()), TextAlign.m5499boximpl(m5511getStarte0LSkKk()), TextAlign.m5499boximpl(m5507getEnde0LSkKk()));
        }
    }
}

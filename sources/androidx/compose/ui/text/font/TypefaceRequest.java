package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0018\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\u0019\u0010\u001a\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resourceLoaderCacheKey", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontStyle-_-LCdwA", "()I", "I", "getFontSynthesis-GVVA2EU", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "component1", "component2", "component3", "component3-_-LCdwA", "component4", "component4-GVVA2EU", "component5", "copy", "copy-e1PVR60", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;)Landroidx/compose/ui/text/font/TypefaceRequest;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequest {
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily2, fontWeight2, i, i2, obj);
    }

    /* renamed from: copy-e1PVR60$default  reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m5267copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily2 = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight2 = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight3 = fontWeight2;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m5270copye1PVR60(fontFamily2, fontWeight3, i4, i5, obj);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA  reason: not valid java name */
    public final int m5268component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU  reason: not valid java name */
    public final int m5269component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60  reason: not valid java name */
    public final TypefaceRequest m5270copye1PVR60(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(fontWeight2, "fontWeight");
        return new TypefaceRequest(fontFamily2, fontWeight2, i, i2, obj, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.areEqual((Object) this.fontFamily, (Object) typefaceRequest.fontFamily) && Intrinsics.areEqual((Object) this.fontWeight, (Object) typefaceRequest.fontWeight) && FontStyle.m5220equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m5229equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
    public final int m5271getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m5272getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily2 = this.fontFamily;
        int i = 0;
        int hashCode = (((((((fontFamily2 == null ? 0 : fontFamily2.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m5221hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m5230hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + FontStyle.m5222toStringimpl(this.fontStyle) + ", fontSynthesis=" + FontSynthesis.m5233toStringimpl(this.fontSynthesis) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj) {
        this.fontFamily = fontFamily2;
        this.fontWeight = fontWeight2;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }
}

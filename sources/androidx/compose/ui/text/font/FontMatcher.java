package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000fJ7\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\b¢\u0006\u0002\b\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontMatcher.kt */
public final class FontMatcher {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3, int i, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        int i2 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i2)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    } else if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i2++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (Intrinsics.areEqual((Object) ((Font) obj2).getWeight(), (Object) fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    } else if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = list.get(i2);
            if (Intrinsics.areEqual((Object) ((Font) obj).getWeight(), (Object) fontWeight4)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m5214matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m5215matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m5215matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontListFontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m5216matchFontRetOiIg((List<? extends Font>) fontListFontFamily.getFonts(), fontWeight, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.List<? extends androidx.compose.ui.text.font.Font>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List<? extends androidx.compose.ui.text.font.Font>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.compose.ui.text.font.Font> m5216matchFontRetOiIg(java.util.List<? extends androidx.compose.ui.text.font.Font> r9, androidx.compose.ui.text.font.FontWeight r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "fontList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "fontWeight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r2 = 0
            r3 = r2
        L_0x0019:
            if (r3 >= r1) goto L_0x003f
            java.lang.Object r4 = r9.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            androidx.compose.ui.text.font.FontWeight r6 = r5.getWeight()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)
            if (r6 == 0) goto L_0x003c
            int r5 = r5.m5192getStyle_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m5220equalsimpl0(r5, r11)
            if (r5 == 0) goto L_0x003c
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            r5.add(r4)
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x003f:
            java.util.List r0 = (java.util.List) r0
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x004d
            return r0
        L_0x004d:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r3 = r2
        L_0x005b:
            if (r3 >= r1) goto L_0x0077
            java.lang.Object r4 = r9.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            int r5 = r5.m5192getStyle_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m5220equalsimpl0(r5, r11)
            if (r5 == 0) goto L_0x0074
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            r5.add(r4)
        L_0x0074:
            int r3 = r3 + 1
            goto L_0x005b
        L_0x0077:
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r9 = r0
        L_0x0083:
            java.util.List r9 = (java.util.List) r9
            androidx.compose.ui.text.font.FontWeight$Companion r11 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r11 = r11.getW400()
            int r11 = r10.compareTo((androidx.compose.ui.text.font.FontWeight) r11)
            r0 = 0
            if (r11 >= 0) goto L_0x00f8
            int r11 = r9.size()
            r1 = r0
            r3 = r2
        L_0x0098:
            if (r3 >= r11) goto L_0x00c8
            java.lang.Object r4 = r9.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            androidx.compose.ui.text.font.FontWeight r4 = r4.getWeight()
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r5 >= 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b2
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r0)
            if (r5 <= 0) goto L_0x00c3
        L_0x00b2:
            r0 = r4
            goto L_0x00c3
        L_0x00b4:
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r5 <= 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00c2
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r1)
            if (r5 >= 0) goto L_0x00c3
        L_0x00c2:
            r1 = r4
        L_0x00c3:
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00c6:
            r0 = r4
            r1 = r0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cb
            r0 = r1
        L_0x00cb:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.size()
            r10.<init>(r11)
            int r11 = r9.size()
        L_0x00d8:
            if (r2 >= r11) goto L_0x00f4
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.compose.ui.text.font.Font r3 = (androidx.compose.ui.text.font.Font) r3
            androidx.compose.ui.text.font.FontWeight r3 = r3.getWeight()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x00f1
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
        L_0x00f1:
            int r2 = r2 + 1
            goto L_0x00d8
        L_0x00f4:
            java.util.List r10 = (java.util.List) r10
            goto L_0x025f
        L_0x00f8:
            androidx.compose.ui.text.font.FontWeight$Companion r11 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r11 = r11.getW500()
            int r11 = r10.compareTo((androidx.compose.ui.text.font.FontWeight) r11)
            if (r11 <= 0) goto L_0x016b
            int r11 = r9.size()
            r1 = r0
            r3 = r2
        L_0x010a:
            if (r3 >= r11) goto L_0x013a
            java.lang.Object r4 = r9.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            androidx.compose.ui.text.font.FontWeight r4 = r4.getWeight()
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r5 >= 0) goto L_0x0126
            if (r0 == 0) goto L_0x0124
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r0)
            if (r5 <= 0) goto L_0x0135
        L_0x0124:
            r0 = r4
            goto L_0x0135
        L_0x0126:
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r5 <= 0) goto L_0x0138
            if (r1 == 0) goto L_0x0134
            int r5 = r4.compareTo((androidx.compose.ui.text.font.FontWeight) r1)
            if (r5 >= 0) goto L_0x0135
        L_0x0134:
            r1 = r4
        L_0x0135:
            int r3 = r3 + 1
            goto L_0x010a
        L_0x0138:
            r0 = r4
            r1 = r0
        L_0x013a:
            if (r1 != 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r0 = r1
        L_0x013e:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.size()
            r10.<init>(r11)
            int r11 = r9.size()
        L_0x014b:
            if (r2 >= r11) goto L_0x0167
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.compose.ui.text.font.Font r3 = (androidx.compose.ui.text.font.Font) r3
            androidx.compose.ui.text.font.FontWeight r3 = r3.getWeight()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x0164
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
        L_0x0164:
            int r2 = r2 + 1
            goto L_0x014b
        L_0x0167:
            java.util.List r10 = (java.util.List) r10
            goto L_0x025f
        L_0x016b:
            androidx.compose.ui.text.font.FontWeight$Companion r11 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r11 = r11.getW500()
            int r1 = r9.size()
            r4 = r0
            r5 = r4
            r3 = r2
        L_0x0178:
            if (r3 >= r1) goto L_0x01b0
            java.lang.Object r6 = r9.get(r3)
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            androidx.compose.ui.text.font.FontWeight r6 = r6.getWeight()
            if (r11 == 0) goto L_0x018c
            int r7 = r6.compareTo((androidx.compose.ui.text.font.FontWeight) r11)
            if (r7 > 0) goto L_0x01ab
        L_0x018c:
            int r7 = r6.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r7 >= 0) goto L_0x019c
            if (r4 == 0) goto L_0x019a
            int r7 = r6.compareTo((androidx.compose.ui.text.font.FontWeight) r4)
            if (r7 <= 0) goto L_0x01ab
        L_0x019a:
            r4 = r6
            goto L_0x01ab
        L_0x019c:
            int r7 = r6.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r7 <= 0) goto L_0x01ae
            if (r5 == 0) goto L_0x01aa
            int r7 = r6.compareTo((androidx.compose.ui.text.font.FontWeight) r5)
            if (r7 >= 0) goto L_0x01ab
        L_0x01aa:
            r5 = r6
        L_0x01ab:
            int r3 = r3 + 1
            goto L_0x0178
        L_0x01ae:
            r4 = r6
            r5 = r4
        L_0x01b0:
            if (r5 != 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r4 = r5
        L_0x01b4:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r9.size()
            r11.<init>(r1)
            int r1 = r9.size()
            r3 = r2
        L_0x01c2:
            if (r3 >= r1) goto L_0x01de
            java.lang.Object r5 = r9.get(r3)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            androidx.compose.ui.text.font.FontWeight r6 = r6.getWeight()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r4)
            if (r6 == 0) goto L_0x01db
            r6 = r11
            java.util.Collection r6 = (java.util.Collection) r6
            r6.add(r5)
        L_0x01db:
            int r3 = r3 + 1
            goto L_0x01c2
        L_0x01de:
            java.util.List r11 = (java.util.List) r11
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x025c
            androidx.compose.ui.text.font.FontWeight$Companion r11 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r11 = r11.getW500()
            int r1 = r9.size()
            r3 = r0
            r4 = r2
        L_0x01f4:
            if (r4 >= r1) goto L_0x022c
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            androidx.compose.ui.text.font.FontWeight r5 = r5.getWeight()
            if (r11 == 0) goto L_0x0208
            int r6 = r5.compareTo((androidx.compose.ui.text.font.FontWeight) r11)
            if (r6 < 0) goto L_0x0227
        L_0x0208:
            int r6 = r5.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r6 >= 0) goto L_0x0218
            if (r0 == 0) goto L_0x0216
            int r6 = r5.compareTo((androidx.compose.ui.text.font.FontWeight) r0)
            if (r6 <= 0) goto L_0x0227
        L_0x0216:
            r0 = r5
            goto L_0x0227
        L_0x0218:
            int r6 = r5.compareTo((androidx.compose.ui.text.font.FontWeight) r10)
            if (r6 <= 0) goto L_0x022a
            if (r3 == 0) goto L_0x0226
            int r6 = r5.compareTo((androidx.compose.ui.text.font.FontWeight) r3)
            if (r6 >= 0) goto L_0x0227
        L_0x0226:
            r3 = r5
        L_0x0227:
            int r4 = r4 + 1
            goto L_0x01f4
        L_0x022a:
            r0 = r5
            r3 = r0
        L_0x022c:
            if (r3 != 0) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            r0 = r3
        L_0x0230:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.size()
            r10.<init>(r11)
            int r11 = r9.size()
        L_0x023d:
            if (r2 >= r11) goto L_0x0259
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.compose.ui.text.font.Font r3 = (androidx.compose.ui.text.font.Font) r3
            androidx.compose.ui.text.font.FontWeight r3 = r3.getWeight()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x0256
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
        L_0x0256:
            int r2 = r2 + 1
            goto L_0x023d
        L_0x0259:
            r11 = r10
            java.util.List r11 = (java.util.List) r11
        L_0x025c:
            r10 = r11
            java.util.List r10 = (java.util.List) r10
        L_0x025f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontMatcher.m5216matchFontRetOiIg(java.util.List, androidx.compose.ui.text.font.FontWeight, int):java.util.List");
    }
}

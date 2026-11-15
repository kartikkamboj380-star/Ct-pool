package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: renamed from: com.facebook.react.uimanager.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0895v extends V {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final b f12731y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f12732z;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.v$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12733a;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            f12733a = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12733a[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12733a[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12733a[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.v$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f12734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.facebook.yoga.w f12735b;

        private b() {
        }

        void a(Dynamic dynamic) {
            float fC;
            com.facebook.yoga.w wVar;
            if (dynamic.isNull()) {
                wVar = com.facebook.yoga.w.UNDEFINED;
            } else if (dynamic.getType() == ReadableType.String) {
                String strAsString = dynamic.asString();
                if (strAsString.equals("auto")) {
                    wVar = com.facebook.yoga.w.AUTO;
                } else if (strAsString.endsWith("%")) {
                    this.f12735b = com.facebook.yoga.w.PERCENT;
                    fC = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    this.f12734a = fC;
                    return;
                } else {
                    P0.a.G("ReactNative", "Unknown value: " + strAsString);
                    wVar = com.facebook.yoga.w.UNDEFINED;
                }
            } else {
                if (dynamic.getType() == ReadableType.Number) {
                    this.f12735b = com.facebook.yoga.w.POINT;
                    fC = G.c(dynamic.asDouble());
                    this.f12734a = fC;
                    return;
                }
                wVar = com.facebook.yoga.w.UNDEFINED;
            }
            this.f12735b = wVar;
            this.f12734a = Float.NaN;
        }
    }

    private int w1(int i7) {
        if (!com.facebook.react.modules.i18nmanager.a.f().d(G())) {
            return i7;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 != 2) {
            return i7;
        }
        return 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @InterfaceC2218a(name = "alignContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAlignContent(String str) {
        com.facebook.yoga.a aVar;
        if (u()) {
            return;
        }
        if (str != null) {
            switch (str) {
                case "stretch":
                    aVar = com.facebook.yoga.a.STRETCH;
                    break;
                case "baseline":
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case "center":
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case "flex-start":
                    break;
                case "auto":
                    aVar = com.facebook.yoga.a.AUTO;
                    break;
                case "space-between":
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case "flex-end":
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case "space-around":
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                case "space-evenly":
                    aVar = com.facebook.yoga.a.SPACE_EVENLY;
                    break;
                default:
                    P0.a.G("ReactNative", "invalid value for alignContent: " + str);
                    aVar = com.facebook.yoga.a.FLEX_START;
                    break;
            }
        } else {
            aVar = com.facebook.yoga.a.FLEX_START;
        }
        D0(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @InterfaceC2218a(name = "alignItems")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAlignItems(String str) {
        com.facebook.yoga.a aVar;
        if (u()) {
            return;
        }
        if (str != null) {
            switch (str) {
                case "stretch":
                    break;
                case "baseline":
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case "center":
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case "flex-start":
                    aVar = com.facebook.yoga.a.FLEX_START;
                    break;
                case "auto":
                    aVar = com.facebook.yoga.a.AUTO;
                    break;
                case "space-between":
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case "flex-end":
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case "space-around":
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                default:
                    P0.a.G("ReactNative", "invalid value for alignItems: " + str);
                    aVar = com.facebook.yoga.a.STRETCH;
                    break;
            }
        } else {
            aVar = com.facebook.yoga.a.STRETCH;
        }
        E0(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @InterfaceC2218a(name = "alignSelf")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAlignSelf(String str) {
        com.facebook.yoga.a aVar;
        if (u()) {
            return;
        }
        if (str != null) {
            switch (str) {
                case "stretch":
                    aVar = com.facebook.yoga.a.STRETCH;
                    break;
                case "baseline":
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case "center":
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case "flex-start":
                    aVar = com.facebook.yoga.a.FLEX_START;
                    break;
                case "auto":
                    break;
                case "space-between":
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case "flex-end":
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case "space-around":
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                default:
                    P0.a.G("ReactNative", "invalid value for alignSelf: " + str);
                    aVar = com.facebook.yoga.a.AUTO;
                    break;
            }
        } else {
            aVar = com.facebook.yoga.a.AUTO;
        }
        F0(aVar);
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f7) {
        h1(f7);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i7, float f7) {
        if (u()) {
            return;
        }
        H0(w1(K0.f12437b[i7]), G.d(f7));
    }

    @InterfaceC2218a(name = "collapsable")
    public void setCollapsable(boolean z6) {
        this.f12732z = z6;
    }

    @InterfaceC2218a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z6) {
    }

    @InterfaceC2218a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            I0(this.f12731y.f12734a);
        } else if (i7 == 4) {
            J0(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "display")
    public void setDisplay(String str) {
        com.facebook.yoga.i iVar;
        if (u()) {
            return;
        }
        if (str == null) {
            L0(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("flex")) {
            iVar = com.facebook.yoga.i.FLEX;
        } else if (str.equals("none")) {
            iVar = com.facebook.yoga.i.NONE;
        } else {
            P0.a.G("ReactNative", "invalid value for display: " + str);
            iVar = com.facebook.yoga.i.FLEX;
        }
        L0(iVar);
    }

    @Override // com.facebook.react.uimanager.V
    @InterfaceC2218a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f7) {
        if (u()) {
            return;
        }
        super.setFlex(f7);
    }

    @InterfaceC2218a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            M0(this.f12731y.f12734a);
        } else if (i7 == 3) {
            N0();
        } else if (i7 == 4) {
            O0(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC2218a(name = "flexDirection")
    public void setFlexDirection(String str) {
        com.facebook.yoga.l lVar;
        if (u()) {
            return;
        }
        if (str == null) {
            P0(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                lVar = com.facebook.yoga.l.ROW_REVERSE;
                break;
            case "column":
                lVar = com.facebook.yoga.l.COLUMN;
                break;
            case "row":
                lVar = com.facebook.yoga.l.ROW;
                break;
            case "column-reverse":
                lVar = com.facebook.yoga.l.COLUMN_REVERSE;
                break;
            default:
                P0.a.G("ReactNative", "invalid value for flexDirection: " + str);
                lVar = com.facebook.yoga.l.COLUMN;
                break;
        }
        P0(lVar);
    }

    @Override // com.facebook.react.uimanager.V
    @InterfaceC2218a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f7) {
        if (u()) {
            return;
        }
        super.setFlexGrow(f7);
    }

    @Override // com.facebook.react.uimanager.V
    @InterfaceC2218a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f7) {
        if (u()) {
            return;
        }
        super.setFlexShrink(f7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC2218a(name = "flexWrap")
    public void setFlexWrap(String str) {
        com.facebook.yoga.x xVar;
        if (u()) {
            return;
        }
        if (str == null) {
            Q0(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                xVar = com.facebook.yoga.x.NO_WRAP;
                break;
            case "wrap-reverse":
                xVar = com.facebook.yoga.x.WRAP_REVERSE;
                break;
            case "wrap":
                xVar = com.facebook.yoga.x.WRAP;
                break;
            default:
                P0.a.G("ReactNative", "invalid value for flexWrap: " + str);
                xVar = com.facebook.yoga.x.NO_WRAP;
                break;
        }
        Q0(xVar);
    }

    @InterfaceC2218a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            R0(this.f12731y.f12734a);
        } else if (i7 == 4) {
            S0(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            g(this.f12731y.f12734a);
        } else if (i7 == 3) {
            i1();
        } else if (i7 == 4) {
            j1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i7, Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i7, Dynamic dynamic) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC2218a(name = "justifyContent")
    public void setJustifyContent(String str) {
        com.facebook.yoga.n nVar;
        if (u()) {
            return;
        }
        if (str == null) {
            T0(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                nVar = com.facebook.yoga.n.CENTER;
                break;
            case "flex-start":
                nVar = com.facebook.yoga.n.FLEX_START;
                break;
            case "space-between":
                nVar = com.facebook.yoga.n.SPACE_BETWEEN;
                break;
            case "flex-end":
                nVar = com.facebook.yoga.n.FLEX_END;
                break;
            case "space-around":
                nVar = com.facebook.yoga.n.SPACE_AROUND;
                break;
            case "space-evenly":
                nVar = com.facebook.yoga.n.SPACE_EVENLY;
                break;
            default:
                P0.a.G("ReactNative", "invalid value for justifyContent: " + str);
                nVar = com.facebook.yoga.n.FLEX_START;
                break;
        }
        T0(nVar);
    }

    @InterfaceC2218a(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @InterfaceC2219b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i7, Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i7, Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i7, Dynamic dynamic) {
        if (u()) {
            return;
        }
        int iW1 = w1(K0.f12438c[i7]);
        this.f12731y.a(dynamic);
        int i8 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i8 == 1 || i8 == 2) {
            V0(iW1, this.f12731y.f12734a);
        } else if (i8 == 3) {
            W0(iW1);
        } else if (i8 == 4) {
            X0(iW1, this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            k1(this.f12731y.f12734a);
        } else if (i7 == 4) {
            l1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            m1(this.f12731y.f12734a);
        } else if (i7 == 4) {
            n1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            o1(this.f12731y.f12734a);
        } else if (i7 == 4) {
            p1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            q1(this.f12731y.f12734a);
        } else if (i7 == 4) {
            r1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC2218a(name = "overflow")
    public void setOverflow(String str) {
        com.facebook.yoga.u uVar;
        if (u()) {
            return;
        }
        if (str == null) {
            Z0(com.facebook.yoga.u.VISIBLE);
            return;
        }
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    b7 = 0;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    b7 = 1;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    b7 = 2;
                }
                break;
        }
        switch (b7) {
            case 0:
                uVar = com.facebook.yoga.u.HIDDEN;
                break;
            case 1:
                uVar = com.facebook.yoga.u.SCROLL;
                break;
            default:
                P0.a.G("ReactNative", "invalid value for overflow: " + str);
            case 2:
                uVar = com.facebook.yoga.u.VISIBLE;
                break;
        }
        Z0(uVar);
    }

    @InterfaceC2219b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i7, Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i7, Dynamic dynamic) {
    }

    @InterfaceC2219b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i7, Dynamic dynamic) {
        if (u()) {
            return;
        }
        int iW1 = w1(K0.f12438c[i7]);
        this.f12731y.a(dynamic);
        int i8 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i8 == 1 || i8 == 2) {
            a1(iW1, this.f12731y.f12734a);
        } else if (i8 == 4) {
            b1(iW1, this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "position")
    public void setPosition(String str) {
        com.facebook.yoga.v vVar;
        if (u()) {
            return;
        }
        if (str == null) {
            e1(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            vVar = com.facebook.yoga.v.RELATIVE;
        } else if (str.equals("absolute")) {
            vVar = com.facebook.yoga.v.ABSOLUTE;
        } else {
            P0.a.G("ReactNative", "invalid value for position: " + str);
            vVar = com.facebook.yoga.v.RELATIVE;
        }
        e1(vVar);
    }

    @InterfaceC2219b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i7, Dynamic dynamic) {
        if (u()) {
            return;
        }
        int iW1 = w1(new int[]{4, 5, 0, 2, 1, 3}[i7]);
        this.f12731y.a(dynamic);
        int i8 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i8 == 1 || i8 == 2) {
            c1(iW1, this.f12731y.f12734a);
        } else if (i8 == 4) {
            d1(iW1, this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @InterfaceC2218a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            f1(this.f12731y.f12734a);
        } else if (i7 == 4) {
            g1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.V
    @InterfaceC2218a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z6) {
        super.setShouldNotifyOnLayout(z6);
    }

    @InterfaceC2218a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z6) {
    }

    @InterfaceC2218a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z6) {
    }

    @InterfaceC2218a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z6) {
    }

    @InterfaceC2218a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (u()) {
            return;
        }
        this.f12731y.a(dynamic);
        int i7 = a.f12733a[this.f12731y.f12735b.ordinal()];
        if (i7 == 1 || i7 == 2) {
            B(this.f12731y.f12734a);
        } else if (i7 == 3) {
            s1();
        } else if (i7 == 4) {
            t1(this.f12731y.f12734a);
        }
        dynamic.recycle();
    }
}

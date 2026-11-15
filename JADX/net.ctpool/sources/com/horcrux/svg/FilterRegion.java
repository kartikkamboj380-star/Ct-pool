package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    public Rect getCropRect(VirtualView virtualView, EnumC1576o enumC1576o, RectF rectF) {
        if (enumC1576o == EnumC1576o.USER_SPACE_ON_USE) {
            double dRelativeOn = virtualView.relativeOn(this.mX, virtualView.getSvgView().getCanvasWidth());
            double dRelativeOn2 = virtualView.relativeOn(this.mY, virtualView.getSvgView().getCanvasHeight());
            return new Rect((int) dRelativeOn, (int) dRelativeOn2, (int) (dRelativeOn + virtualView.relativeOn(this.mW, virtualView.getSvgView().getCanvasWidth())), (int) (dRelativeOn2 + virtualView.relativeOn(this.mH, virtualView.getSvgView().getCanvasHeight())));
        }
        double dRelativeOnFraction = virtualView.relativeOnFraction(this.mX, rectF.width());
        double dRelativeOnFraction2 = virtualView.relativeOnFraction(this.mY, rectF.height());
        double dRelativeOnFraction3 = virtualView.relativeOnFraction(this.mW, rectF.width());
        double dRelativeOnFraction4 = virtualView.relativeOnFraction(this.mH, rectF.height());
        float f7 = rectF.left;
        float f8 = rectF.top;
        return new Rect((int) (((double) f7) + dRelativeOnFraction), (int) (((double) f8) + dRelativeOnFraction2), (int) (((double) f7) + dRelativeOnFraction + dRelativeOnFraction3), (int) (((double) f8) + dRelativeOnFraction2 + dRelativeOnFraction4));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.b(dynamic);
    }
}

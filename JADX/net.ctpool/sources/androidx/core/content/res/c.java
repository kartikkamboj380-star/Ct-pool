package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC2076a;
import u.AbstractC2079d;
import w.AbstractC2173a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7080a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f7080a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i7;
        int attributeCount;
        int i8;
        Resources resources2 = resources;
        int i9 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i10 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i9 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayG = g(resources2, theme, attributeSet, AbstractC2079d.f22390b);
                int resourceId = typedArrayG.getResourceId(AbstractC2079d.f22391c, -1);
                if (resourceId == -1 || e(resources2, resourceId)) {
                    color = typedArrayG.getColor(AbstractC2079d.f22391c, -65281);
                    float f7 = 1.0f;
                    if (typedArrayG.hasValue(AbstractC2079d.f22392d)) {
                        if (typedArrayG.hasValue(AbstractC2079d.f22394f)) {
                            i7 = AbstractC2079d.f22394f;
                        }
                        float f8 = typedArrayG.getFloat((Build.VERSION.SDK_INT < 31 || !typedArrayG.hasValue(AbstractC2079d.f22393e)) ? AbstractC2079d.f22395g : AbstractC2079d.f22393e, -1.0f);
                        typedArrayG.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i11 = 0;
                        for (i8 = 0; i8 < attributeCount; i8++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC2076a.f22337a && attributeNameResource != AbstractC2076a.f22338b) {
                                int i12 = i11 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i11] = attributeNameResource;
                                i11 = i12;
                            }
                        }
                        int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i11);
                        iArrA = e.a(iArrA, i10, f(color, f7, f8));
                        iArr = (int[][]) e.b(iArr, i10, iArrTrimStateSet);
                        i10++;
                    } else {
                        i7 = AbstractC2079d.f22392d;
                    }
                    f7 = typedArrayG.getFloat(i7, 1.0f);
                    if (Build.VERSION.SDK_INT < 31) {
                        float f82 = typedArrayG.getFloat((Build.VERSION.SDK_INT < 31 || !typedArrayG.hasValue(AbstractC2079d.f22393e)) ? AbstractC2079d.f22395g : AbstractC2079d.f22393e, -1.0f);
                        typedArrayG.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr22 = new int[attributeCount];
                        int i112 = 0;
                        while (i8 < attributeCount) {
                        }
                        int[] iArrTrimStateSet2 = StateSet.trimStateSet(iArr22, i112);
                        iArrA = e.a(iArrA, i10, f(color, f7, f82));
                        iArr = (int[][]) e.b(iArr, i10, iArrTrimStateSet2);
                        i10++;
                    }
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayG.getColor(AbstractC2079d.f22391c, -65281);
                    }
                    float f72 = 1.0f;
                    if (typedArrayG.hasValue(AbstractC2079d.f22392d)) {
                    }
                    f72 = typedArrayG.getFloat(i7, 1.0f);
                }
            }
            i9 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i10];
        int[][] iArr4 = new int[i10][];
        System.arraycopy(iArrA, 0, iArr3, 0, i10);
        System.arraycopy(iArr, 0, iArr4, 0, i10);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean e(Resources resources, int i7) {
        TypedValue typedValueC = c();
        resources.getValue(i7, typedValueC, true);
        int i8 = typedValueC.type;
        return i8 >= 28 && i8 <= 31;
    }

    private static int f(int i7, float f7, float f8) {
        boolean z6 = f8 >= 0.0f && f8 <= 100.0f;
        if (f7 == 1.0f && !z6) {
            return i7;
        }
        int iB = AbstractC2173a.b((int) ((Color.alpha(i7) * f7) + 0.5f), 0, 255);
        if (z6) {
            a aVarC = a.c(i7);
            i7 = a.m(aVarC.j(), aVarC.i(), f8);
        }
        return (i7 & 16777215) | (iB << 24);
    }

    private static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

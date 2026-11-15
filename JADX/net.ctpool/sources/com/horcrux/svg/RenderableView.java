package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.C1587z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w2.InterfaceC2186c;

/* JADX INFO: loaded from: classes.dex */
public abstract class RenderableView extends VirtualView implements InterfaceC2186c {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17816a;

        static {
            int[] iArr = new int[H.values().length];
            f17816a = iArr;
            try {
                iArr[H.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17816a[H.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17816a[H.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f7, ReadableArray readableArray) {
        int iIntValue;
        ReadableArray readableArray2;
        RenderableView renderableView;
        int i7 = readableArray.getInt(0);
        if (i7 != 0) {
            if (i7 == 1) {
                C1562a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
                if (definedBrush != null) {
                    definedBrush.i(paint, this.mBox, this.mScale, f7);
                    return;
                }
                return;
            }
            if (i7 != 2) {
                if (i7 == 3) {
                    RenderableView renderableView2 = contextElement;
                    if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                        return;
                    }
                } else if (i7 != 4 || (renderableView = contextElement) == null || (readableArray2 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f7, readableArray2);
                return;
            }
            iIntValue = getSvgView().mTintColor;
        } else {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f7) * 255.0d : f7 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            }
            iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
        }
        paint.setColor((Math.round((iIntValue >>> 24) * f7) << 24) | (iIntValue & 16777215));
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        float f8 = f7 * this.mOpacity;
        boolean z6 = ((VirtualView) this).mPath == null;
        if (z6) {
            Path path = getPath(canvas, paint);
            ((VirtualView) this).mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z7 = this.vectorEffect == 1;
        Path path2 = ((VirtualView) this).mPath;
        if (z7) {
            path2 = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z6 || path2 != ((VirtualView) this).mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f8)) {
            if (z6) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f8)) {
            if (z6) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f8);
    }

    @Override // com.facebook.react.views.view.i, w2.InterfaceC2186c
    public Rect getHitSlopRect() {
        if (((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.H.f12291o) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    abstract Path getPath(Canvas canvas, Paint paint);

    Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.H.f12290n) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            ((VirtualView) this).mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                String str = attributeList.get(i7);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f7) {
        C1587z c1587z = this.mMask != null ? (C1587z) getSvgView().getDefinedMask(this.mMask) : null;
        C1577p c1577p = this.mFilter != null ? (C1577p) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (c1587z == null && c1577p == null) {
            draw(canvas, paint, f7);
            return;
        }
        if (c1577p != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f7);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof C1583v) && clientRect == null) {
                return;
            }
            Bitmap bitmapQ = c1577p.q(bitmapCreateBitmap, currentBitmap, clientRect);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapQ, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        } else {
            canvas.saveLayer(null, paint);
            draw(canvas, paint, f7);
        }
        if (c1587z != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(null, paint3);
            if (c1587z.B() == C1587z.a.LUMINANCE) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            float fRelativeOnWidth = (float) relativeOnWidth(c1587z.f18138r);
            float fRelativeOnHeight = (float) relativeOnHeight(c1587z.f18139s);
            float fRelativeOnWidth2 = ((float) relativeOnWidth(c1587z.f18140t)) + fRelativeOnWidth;
            float fRelativeOnHeight2 = ((float) relativeOnHeight(c1587z.f18141u)) + fRelativeOnHeight;
            canvas.clipRect(fRelativeOnWidth, fRelativeOnHeight, fRelativeOnWidth2, fRelativeOnHeight2);
            c1587z.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(fRelativeOnWidth, fRelativeOnHeight, fRelativeOnWidth2, fRelativeOnHeight2);
            c1587z.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    void renderMarkers(Canvas canvas, Paint paint, float f7) {
        C1586y c1586y = (C1586y) getSvgView().getDefinedMarker(this.mMarkerStart);
        C1586y c1586y2 = (C1586y) getSvgView().getDefinedMarker(this.mMarkerMid);
        C1586y c1586y3 = (C1586y) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<A> arrayList = this.elements;
        if (arrayList != null) {
            if (c1586y == null && c1586y2 == null && c1586y3 == null) {
                return;
            }
            contextElement = this;
            ArrayList<G> arrayListH = G.h(arrayList);
            SVGLength sVGLength = this.strokeWidth;
            float fRelativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            for (G g7 : arrayListH) {
                int i7 = a.f17816a[g7.f17782a.ordinal()];
                C1586y c1586y4 = i7 != 1 ? i7 != 2 ? i7 != 3 ? null : c1586y3 : c1586y2 : c1586y;
                if (c1586y4 != null) {
                    c1586y4.B(canvas, paint, f7, g7, fRelativeOnOther);
                    this.mMarkerPath.addPath(c1586y4.getPath(canvas, paint), c1586y4.f18128D);
                }
            }
            contextElement = null;
        }
    }

    void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    public void setFill(Dynamic dynamic) {
        ReadableArray readableArrayAsArray;
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            readableArrayAsArray = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else {
            if (!type.equals(ReadableType.Array)) {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double d7 = Double.parseDouble(matcher.group());
                    int i8 = i7 + 1;
                    if (i7 < 3) {
                        d7 /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(d7);
                    i7 = i8;
                }
                this.fill = javaOnlyArray;
                invalidate();
            }
            readableArrayAsArray = dynamic.asArray();
        }
        this.fill = readableArrayAsArray;
        invalidate();
    }

    public void setFillOpacity(float f7) {
        this.fillOpacity = f7;
        invalidate();
    }

    public void setFillRule(int i7) {
        if (i7 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i7 != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i7 + " unrecognized");
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i7) {
        super.setId(i7);
        VirtualViewManager.setRenderableView(i7, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i7 = 0; i7 < readableArray.size(); i7++) {
                this.mPropList.add(readableArray.getString(i7));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        ReadableArray readableArrayAsArray;
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            readableArrayAsArray = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else {
            if (!type.equals(ReadableType.Array)) {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double d7 = Double.parseDouble(matcher.group());
                    int i8 = i7 + 1;
                    if (i7 < 3) {
                        d7 /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(d7);
                    i7 = i8;
                }
                this.stroke = javaOnlyArray;
                invalidate();
            }
            readableArrayAsArray = dynamic.asArray();
        }
        this.stroke = readableArrayAsArray;
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList arrayListA = SVGLength.a(dynamic);
        if (arrayListA != null) {
            this.strokeDasharray = (SVGLength[]) arrayListA.toArray(new SVGLength[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f7) {
        this.strokeDashoffset = f7 * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i7) {
        Paint.Cap cap;
        if (i7 == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i7 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinecap " + i7 + " unrecognized");
            }
            cap = Paint.Cap.SQUARE;
        }
        this.strokeLinecap = cap;
        invalidate();
    }

    public void setStrokeLinejoin(int i7) {
        Paint.Join join;
        if (i7 == 0) {
            join = Paint.Join.MITER;
        } else if (i7 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i7 + " unrecognized");
            }
            join = Paint.Join.BEVEL;
        }
        this.strokeLinejoin = join;
        invalidate();
    }

    public void setStrokeMiterlimit(float f7) {
        this.strokeMiterlimit = f7;
        invalidate();
    }

    public void setStrokeOpacity(float f7) {
        this.strokeOpacity = f7;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new SVGLength(1.0d) : SVGLength.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i7) {
        this.vectorEffect = i7;
        invalidate();
    }

    boolean setupFillPaint(Paint paint, float f7) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f7, this.fill);
        return true;
    }

    boolean setupStrokePaint(Paint paint, float f7) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f7, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = (float) relativeOnOther(this.strokeDasharray[i7]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        JavaOnlyArray javaOnlyArrayOf;
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (!type.equals(ReadableType.Number)) {
                if (type.equals(ReadableType.Map)) {
                    javaOnlyArrayOf = JavaOnlyArray.of(0, readableMap.getMap("payload"));
                }
                invalidate();
            }
            javaOnlyArrayOf = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
        } else {
            javaOnlyArrayOf = i7 == 1 ? JavaOnlyArray.of(1, readableMap.getString("brushRef")) : JavaOnlyArray.of(Integer.valueOf(i7));
        }
        this.fill = javaOnlyArrayOf;
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        JavaOnlyArray javaOnlyArrayOf;
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (!type.equals(ReadableType.Number)) {
                if (type.equals(ReadableType.Map)) {
                    javaOnlyArrayOf = JavaOnlyArray.of(0, readableMap.getMap("payload"));
                }
                invalidate();
            }
            javaOnlyArrayOf = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
        } else {
            javaOnlyArrayOf = i7 == 1 ? JavaOnlyArray.of(1, readableMap.getString("brushRef")) : JavaOnlyArray.of(Integer.valueOf(i7));
        }
        this.stroke = javaOnlyArrayOf;
        invalidate();
    }
}

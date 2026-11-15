package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f6397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6398b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6399c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray f6400d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray f6401e = new SparseArray();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f6403b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f6405d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f6404c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f6765q4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == g.f6771r4) {
                    this.f6402a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6402a);
                } else if (index == g.f6777s4) {
                    this.f6404c = typedArrayObtainStyledAttributes.getResourceId(index, this.f6404c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6404c);
                    context.getResources().getResourceName(this.f6404c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6405d = dVar;
                        dVar.f(context, this.f6404c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f6403b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f6406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f6407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f6408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f6409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f6411f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f6406a = Float.NaN;
            this.f6407b = Float.NaN;
            this.f6408c = Float.NaN;
            this.f6409d = Float.NaN;
            this.f6410e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f6590M4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == g.f6596N4) {
                    this.f6410e = typedArrayObtainStyledAttributes.getResourceId(index, this.f6410e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6410e);
                    context.getResources().getResourceName(this.f6410e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6411f = dVar;
                        dVar.f(context, this.f6410e);
                    }
                } else if (index == g.f6602O4) {
                    this.f6409d = typedArrayObtainStyledAttributes.getDimension(index, this.f6409d);
                } else if (index == g.f6608P4) {
                    this.f6407b = typedArrayObtainStyledAttributes.getDimension(index, this.f6407b);
                } else if (index == g.f6614Q4) {
                    this.f6408c = typedArrayObtainStyledAttributes.getDimension(index, this.f6408c);
                } else if (index == g.f6620R4) {
                    this.f6406a = typedArrayObtainStyledAttributes.getDimension(index, this.f6406a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i7) {
        this.f6397a = constraintLayout;
        a(context, i7);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context, int i7) {
        byte b7;
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b7 = name.equals("ConstraintSet") ? (byte) 4 : (byte) -1;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b7 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b7 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b7 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b7 = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b7 != 0 && b7 != 1) {
                        if (b7 == 2) {
                            aVar = new a(context, xml);
                            this.f6400d.put(aVar.f6402a, aVar);
                        } else if (b7 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b7 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if ("id".equals(xmlPullParser.getAttributeName(i7))) {
                String attributeValue = xmlPullParser.getAttributeValue(i7);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f6401e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }
}

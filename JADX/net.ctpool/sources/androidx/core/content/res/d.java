package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC2079d;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static class a {
        static int a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0137d[] f7081a;

        public c(C0137d[] c0137dArr) {
            this.f7081a = c0137dArr;
        }

        public C0137d[] a() {
            return this.f7081a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.d$d, reason: collision with other inner class name */
    public static final class C0137d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f7084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f7085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7087f;

        public C0137d(String str, int i7, boolean z6, String str2, int i8, int i9) {
            this.f7082a = str;
            this.f7083b = i7;
            this.f7084c = z6;
            this.f7085d = str2;
            this.f7086e = i8;
            this.f7087f = i9;
        }

        public String a() {
            return this.f7082a;
        }

        public int b() {
            return this.f7087f;
        }

        public int c() {
            return this.f7086e;
        }

        public String d() {
            return this.f7085d;
        }

        public int e() {
            return this.f7083b;
        }

        public boolean f() {
            return this.f7084c;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f7088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f7091d;

        public e(androidx.core.provider.e eVar, int i7, int i8, String str) {
            this.f7088a = eVar;
            this.f7090c = i7;
            this.f7089b = i8;
            this.f7091d = str;
        }

        public int a() {
            return this.f7090c;
        }

        public androidx.core.provider.e b() {
            return this.f7088a;
        }

        public String c() {
            return this.f7091d;
        }

        public int d() {
            return this.f7089b;
        }
    }

    private static int a(TypedArray typedArray, int i7) {
        return a.a(typedArray, i7);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < typedArrayObtainTypedArray.length(); i8++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2079d.f22396h);
        String string = typedArrayObtainAttributes.getString(AbstractC2079d.f22397i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC2079d.f22401m);
        String string3 = typedArrayObtainAttributes.getString(AbstractC2079d.f22402n);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC2079d.f22398j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC2079d.f22399k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC2079d.f22400l, 500);
        String string4 = typedArrayObtainAttributes.getString(AbstractC2079d.f22403o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0137d[]) arrayList.toArray(new C0137d[0]));
    }

    private static C0137d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2079d.f22404p);
        int i7 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC2079d.f22413y) ? AbstractC2079d.f22413y : AbstractC2079d.f22406r, 400);
        boolean z6 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC2079d.f22411w) ? AbstractC2079d.f22411w : AbstractC2079d.f22407s, 0);
        int i8 = typedArrayObtainAttributes.hasValue(AbstractC2079d.f22414z) ? AbstractC2079d.f22414z : AbstractC2079d.f22408t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(AbstractC2079d.f22412x) ? AbstractC2079d.f22412x : AbstractC2079d.f22409u);
        int i9 = typedArrayObtainAttributes.getInt(i8, 0);
        int i10 = typedArrayObtainAttributes.hasValue(AbstractC2079d.f22410v) ? AbstractC2079d.f22410v : AbstractC2079d.f22405q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i10, 0);
        String string2 = typedArrayObtainAttributes.getString(i10);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0137d(string2, i7, z6, string, i9, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

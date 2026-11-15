package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.AbstractC0874f0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f12534g = "n";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final androidx.core.util.e f12535h = new androidx.core.util.e(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f12538c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f12539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f12540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.b f12541f;

    class a implements d.b {
        a() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i7, String str) {
            if (!str.equals(n.this.f12537b)) {
                return false;
            }
            if (!o.f(str)) {
                return n.this.getViewTag() == i7;
            }
            Iterator it = n.this.f12540e.e().iterator();
            while (it.hasNext()) {
                if (((AbstractC0874f0.b) it.next()).b() == i7) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f12547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f12548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f12549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f12550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Set f12551i;

        public b(int i7, int i8, int i9, int i10, Map map, Map map2, Map map3, Map map4, Set set) {
            this.f12543a = i7;
            this.f12544b = i8;
            this.f12545c = i9;
            this.f12546d = i10;
            this.f12547e = map;
            this.f12548f = map2;
            this.f12549g = map3;
            this.f12550h = map4;
            this.f12551i = new HashSet(set);
        }

        public int b() {
            return this.f12544b;
        }

        public final Map c() {
            return this.f12549g;
        }

        public final Map d() {
            return this.f12548f;
        }

        public final List e() {
            return (List) this.f12548f.get(Integer.valueOf(this.f12544b));
        }

        public Set f() {
            return this.f12551i;
        }

        public int g() {
            return this.f12545c;
        }

        public final Map h() {
            return this.f12547e;
        }

        public int i() {
            return this.f12543a;
        }

        public final Map j() {
            return this.f12550h;
        }

        public int k() {
            return this.f12546d;
        }

        public boolean l(int i7) {
            return this.f12551i.contains(Integer.valueOf(i7));
        }
    }

    private n() {
    }

    private void c(WritableMap writableMap, int i7) {
        writableMap.putBoolean("ctrlKey", (i7 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i7 & 1) != 0);
        writableMap.putBoolean("altKey", (i7 & 2) != 0);
        writableMap.putBoolean("metaKey", (i7 & 65536) != 0);
    }

    private List d() {
        int actionIndex;
        actionIndex = this.f12536a.getActionIndex();
        String str = this.f12537b;
        str.hashCode();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(e(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                return f();
            default:
                return null;
        }
    }

    private WritableMap e(int i7) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int pointerId = this.f12536a.getPointerId(i7);
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String strE = o.e(this.f12536a.getToolType(i7));
        writableMapCreateMap.putString("pointerType", strE);
        writableMapCreateMap.putBoolean("isPrimary", !h() && (this.f12540e.l(pointerId) || pointerId == this.f12540e.f12543a));
        float[] fArr = (float[]) this.f12540e.c().get(Integer.valueOf(pointerId));
        double dB = G.b(fArr[0]);
        double dB2 = G.b(fArr[1]);
        writableMapCreateMap.putDouble("clientX", dB);
        writableMapCreateMap.putDouble("clientY", dB2);
        float[] fArr2 = (float[]) this.f12540e.j().get(Integer.valueOf(pointerId));
        double dB3 = G.b(fArr2[0]);
        double dB4 = G.b(fArr2[1]);
        writableMapCreateMap.putDouble("screenX", dB3);
        writableMapCreateMap.putDouble("screenY", dB4);
        writableMapCreateMap.putDouble("x", dB);
        writableMapCreateMap.putDouble("y", dB2);
        writableMapCreateMap.putDouble("pageX", dB);
        writableMapCreateMap.putDouble("pageY", dB2);
        float[] fArr3 = (float[]) this.f12540e.h().get(Integer.valueOf(pointerId));
        writableMapCreateMap.putDouble("offsetX", G.b(fArr3[0]));
        writableMapCreateMap.putDouble("offsetY", G.b(fArr3[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt("detail", 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        double dB5 = (strE.equals("mouse") || h()) ? 1.0d : G.b(this.f12536a.getTouchMajor(i7));
        writableMapCreateMap.putDouble("width", dB5);
        writableMapCreateMap.putDouble("height", dB5);
        int buttonState = this.f12536a.getButtonState();
        writableMapCreateMap.putInt("button", o.a(strE, this.f12540e.g(), buttonState));
        writableMapCreateMap.putInt("buttons", o.b(this.f12537b, strE, buttonState));
        writableMapCreateMap.putDouble("pressure", h() ? 0.0d : o.d(writableMapCreateMap.getInt("buttons"), this.f12537b));
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        c(writableMapCreateMap, this.f12536a.getMetaState());
        return writableMapCreateMap;
    }

    private List f() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.f12536a.getPointerCount(); i7++) {
            arrayList.add(e(i7));
        }
        return arrayList;
    }

    private void g(String str, int i7, b bVar, MotionEvent motionEvent, short s6) {
        super.init(bVar.k(), i7, motionEvent.getEventTime());
        this.f12537b = str;
        this.f12536a = MotionEvent.obtain(motionEvent);
        this.f12538c = s6;
        this.f12540e = bVar;
    }

    private boolean h() {
        return this.f12537b.equals("topClick");
    }

    public static n i(String str, int i7, b bVar, MotionEvent motionEvent) {
        n nVar = (n) f12535h.b();
        if (nVar == null) {
            nVar = new n();
        }
        nVar.g(str, i7, bVar, (MotionEvent) O1.a.c(motionEvent), (short) 0);
        return nVar;
    }

    public static n j(String str, int i7, b bVar, MotionEvent motionEvent, short s6) {
        n nVar = (n) f12535h.b();
        if (nVar == null) {
            nVar = new n();
        }
        nVar.g(str, i7, bVar, (MotionEvent) O1.a.c(motionEvent), s6);
        return nVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.f12536a == null) {
            ReactSoftExceptionLogger.logSoftException(f12534g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f12539d == null) {
            this.f12539d = d();
        }
        List list = this.f12539d;
        if (list == null) {
            return;
        }
        boolean z6 = list.size() > 1;
        for (WritableMap writableMapCopy : this.f12539d) {
            if (z6) {
                writableMapCopy = writableMapCopy.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.f12537b, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (this.f12536a == null) {
            ReactSoftExceptionLogger.logSoftException(f12534g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f12539d == null) {
            this.f12539d = d();
        }
        List list = this.f12539d;
        if (list == null) {
            return;
        }
        boolean z6 = list.size() > 1;
        for (WritableMap writableMapCopy : this.f12539d) {
            if (z6) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.f12537b;
            short s6 = this.f12538c;
            rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, s6 != -1, s6, writableMap, o.c(str));
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f12538c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public d.b getEventAnimationDriverMatchSpec() {
        if (this.f12541f == null) {
            this.f12541f = new a();
        }
        return this.f12541f;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f12537b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f12539d = null;
        MotionEvent motionEvent = this.f12536a;
        this.f12536a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f12535h.a(this);
        } catch (IllegalStateException e7) {
            ReactSoftExceptionLogger.logSoftException(f12534g, e7);
        }
    }
}

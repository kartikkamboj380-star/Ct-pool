package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.AbstractC0874f0;
import com.facebook.react.uimanager.events.n;
import com.facebook.react.uimanager.events.o;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.react.uimanager.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0893t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f12715j = {0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f12716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f12717b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f12724i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f12719d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12720e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12721f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12722g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12723h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f12718c = new HashMap();

    public C0893t(ViewGroup viewGroup) {
        this.f12724i = viewGroup;
    }

    private MotionEvent a(View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f12724i.getLocationOnScreen(new int[2]);
        motionEventObtain.setLocation(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
        return motionEventObtain;
    }

    private n.b b(int i7, MotionEvent motionEvent) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            float[] fArr = new float[2];
            float[] fArr2 = {motionEvent.getX(i8), motionEvent.getY(i8)};
            List listB = AbstractC0874f0.b(fArr2[0], fArr2[1], this.f12724i, fArr);
            int pointerId = motionEvent.getPointerId(i8);
            map.put(Integer.valueOf(pointerId), fArr);
            map2.put(Integer.valueOf(pointerId), listB);
            map3.put(Integer.valueOf(pointerId), fArr2);
            map4.put(Integer.valueOf(pointerId), e(fArr2));
        }
        return new n.b(this.f12721f, i7, this.f12723h, AbstractC0884k0.f(this.f12724i), map, map2, map3, map4, this.f12719d);
    }

    private void c(View view, n.b bVar, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        O1.a.b(this.f12720e == -1, "Expected to not have already sent a cancel for this gesture");
        List list = (List) bVar.d().get(Integer.valueOf(bVar.b()));
        if (list.isEmpty() || view == null) {
            return;
        }
        if (m(list, o.b.CANCEL, o.b.CANCEL_CAPTURE)) {
            int iB = ((AbstractC0874f0.b) list.get(0)).b();
            int[] iArrH = h(view);
            ((com.facebook.react.uimanager.events.e) O1.a.c(eVar)).c(com.facebook.react.uimanager.events.n.i("topPointerCancel", iB, n(bVar, iArrH[0], iArrH[1]), motionEvent));
        }
        l();
        this.f12721f = -1;
    }

    private static void d(String str, n.b bVar, MotionEvent motionEvent, List list, com.facebook.react.uimanager.events.e eVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eVar.c(com.facebook.react.uimanager.events.n.i(str, ((AbstractC0874f0.b) it.next()).b(), bVar, motionEvent));
        }
    }

    private float[] e(float[] fArr) {
        this.f12724i.getLocationOnScreen(f12715j);
        return new float[]{fArr[0] + r1[0], fArr[1] + r1[1]};
    }

    private static List f(List list, o.b bVar, o.b bVar2, boolean z6) {
        ArrayList arrayList = new ArrayList(list);
        if (z6) {
            return arrayList;
        }
        boolean z7 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View viewA = ((AbstractC0874f0.b) list.get(size)).a();
            if (!z7 && !com.facebook.react.uimanager.events.o.h(viewA, bVar2) && !com.facebook.react.uimanager.events.o.h(viewA, bVar)) {
                arrayList.remove(size);
            } else if (!z7 && com.facebook.react.uimanager.events.o.h(viewA, bVar2)) {
                z7 = true;
            }
        }
        return arrayList;
    }

    private static List g(List list, List list2) {
        if (!list.isEmpty() && !list2.isEmpty()) {
            HashSet hashSet = new HashSet(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC0874f0.b bVar = (AbstractC0874f0.b) it.next();
                if (hashSet.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private int[] h(View view) {
        Rect rect = new Rect(0, 0, 1, 1);
        this.f12724i.offsetDescendantRectToMyCoords(view, rect);
        return new int[]{rect.top, rect.left};
    }

    private short i() {
        return (short) (65535 & this.f12722g);
    }

    private void j(int i7, n.b bVar, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        int iB = bVar.b();
        List arrayList = i7 != -1 ? (List) bVar.d().get(Integer.valueOf(iB)) : new ArrayList();
        Map map = this.f12716a;
        List arrayList2 = (map == null || !map.containsKey(Integer.valueOf(iB))) ? new ArrayList() : (List) this.f12716a.get(Integer.valueOf(iB));
        int i8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (i8 < Math.min(arrayList.size(), arrayList2.size()) && ((AbstractC0874f0.b) arrayList.get((arrayList.size() - 1) - i8)).equals(arrayList2.get((arrayList2.size() - 1) - i8))) {
            View viewA = ((AbstractC0874f0.b) arrayList.get((arrayList.size() - 1) - i8)).a();
            if (!z6 && com.facebook.react.uimanager.events.o.h(viewA, o.b.ENTER_CAPTURE)) {
                z6 = true;
            }
            if (!z7 && com.facebook.react.uimanager.events.o.h(viewA, o.b.LEAVE_CAPTURE)) {
                z7 = true;
            }
            i8++;
        }
        if (i8 < Math.max(arrayList.size(), arrayList2.size())) {
            l();
            if (arrayList2.size() > 0) {
                int iB2 = ((AbstractC0874f0.b) arrayList2.get(0)).b();
                if (m(arrayList2, o.b.OUT, o.b.OUT_CAPTURE)) {
                    eVar.c(com.facebook.react.uimanager.events.n.i("topPointerOut", iB2, bVar, motionEvent));
                }
                List listF = f(arrayList2.subList(0, arrayList2.size() - i8), o.b.LEAVE, o.b.LEAVE_CAPTURE, z7);
                if (listF.size() > 0) {
                    d("topPointerLeave", bVar, motionEvent, listF, eVar);
                }
            }
            if (m(arrayList, o.b.OVER, o.b.OVER_CAPTURE)) {
                eVar.c(com.facebook.react.uimanager.events.n.i("topPointerOver", i7, bVar, motionEvent));
            }
            List listF2 = f(arrayList.subList(0, arrayList.size() - i8), o.b.ENTER, o.b.ENTER_CAPTURE, z6);
            if (listF2.size() > 0) {
                Collections.reverse(listF2);
                d("topPointerEnter", bVar, motionEvent, listF2, eVar);
            }
        }
        HashMap map2 = new HashMap(bVar.d());
        if (i7 == -1) {
            map2.remove(Integer.valueOf(iB));
        }
        this.f12716a = map2;
    }

    private void l() {
        this.f12722g = (this.f12722g + 1) % Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private static boolean m(List list, o.b bVar, o.b bVar2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0874f0.b bVar3 = (AbstractC0874f0.b) it.next();
            if (com.facebook.react.uimanager.events.o.h(bVar3.a(), bVar) || com.facebook.react.uimanager.events.o.h(bVar3.a(), bVar2)) {
                return true;
            }
        }
        return false;
    }

    private n.b n(n.b bVar, float f7, float f8) {
        HashMap map = new HashMap(bVar.h());
        HashMap map2 = new HashMap(bVar.c());
        HashMap map3 = new HashMap(bVar.j());
        float[] fArr = {f7, f8};
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).setValue(fArr);
        }
        float[] fArr2 = {0.0f, 0.0f};
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).setValue(fArr2);
        }
        float[] fArrE = e(fArr);
        Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).setValue(fArrE);
        }
        return new n.b(bVar.i(), bVar.b(), bVar.g(), bVar.k(), map, new HashMap(bVar.d()), map2, map3, new HashSet(bVar.f()));
    }

    private void q(int i7, n.b bVar, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        List list = (List) bVar.d().get(Integer.valueOf(bVar.b()));
        l();
        if (!this.f12719d.contains(Integer.valueOf(bVar.b()))) {
            if (m(list, o.b.OVER, o.b.OVER_CAPTURE)) {
                eVar.c(com.facebook.react.uimanager.events.n.i("topPointerOver", i7, bVar, motionEvent));
            }
            List listF = f(list, o.b.ENTER, o.b.ENTER_CAPTURE, false);
            Collections.reverse(listF);
            d("topPointerEnter", bVar, motionEvent, listF, eVar);
        }
        if (m(list, o.b.CLICK, o.b.CLICK_CAPTURE)) {
            this.f12718c.put(Integer.valueOf(bVar.b()), new ArrayList(list));
        }
        if (m(list, o.b.DOWN, o.b.DOWN_CAPTURE)) {
            eVar.c(com.facebook.react.uimanager.events.n.i("topPointerDown", i7, bVar, motionEvent));
        }
    }

    private void r(int i7, n.b bVar, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        if (m((List) bVar.d().get(Integer.valueOf(bVar.b())), o.b.MOVE, o.b.MOVE_CAPTURE)) {
            eVar.c(com.facebook.react.uimanager.events.n.j("topPointerMove", i7, bVar, motionEvent, i()));
        }
    }

    private void s(int i7, n.b bVar, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        int iB = bVar.b();
        List list = (List) bVar.d().get(Integer.valueOf(iB));
        if (m(list, o.b.UP, o.b.UP_CAPTURE)) {
            eVar.c(com.facebook.react.uimanager.events.n.i("topPointerUp", i7, bVar, motionEvent));
        }
        if (!this.f12719d.contains(Integer.valueOf(iB))) {
            if (m(list, o.b.OUT, o.b.OUT_CAPTURE)) {
                eVar.c(com.facebook.react.uimanager.events.n.i("topPointerOut", i7, bVar, motionEvent));
            }
            d("topPointerLeave", bVar, motionEvent, f(list, o.b.LEAVE, o.b.LEAVE_CAPTURE, false), eVar);
        }
        List list2 = (List) this.f12718c.remove(Integer.valueOf(iB));
        if (list2 != null && m(list, o.b.CLICK, o.b.CLICK_CAPTURE)) {
            List listG = g(list2, list);
            if (!listG.isEmpty()) {
                eVar.c(com.facebook.react.uimanager.events.n.i("topClick", ((AbstractC0874f0.b) listG.get(0)).b(), bVar, motionEvent));
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f12721f = -1;
        }
        this.f12719d.remove(Integer.valueOf(iB));
    }

    private static boolean t(float[] fArr, float[] fArr2) {
        return Math.abs(fArr2[0] - fArr[0]) > 0.1f || Math.abs(fArr2[1] - fArr[1]) > 0.1f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar, boolean z6) {
        int iB;
        View viewA;
        if (this.f12720e != -1) {
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (actionMasked == 0) {
            this.f12721f = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            this.f12719d.add(Integer.valueOf(pointerId));
        }
        n.b bVarB = b(pointerId, motionEvent);
        boolean z7 = z6 && motionEvent.getActionMasked() == 10;
        if (z7) {
            Map map = this.f12716a;
            List list = map != null ? (List) map.get(Integer.valueOf(bVarB.b())) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            AbstractC0874f0.b bVar = (AbstractC0874f0.b) list.get(list.size() - 1);
            iB = bVar.b();
            viewA = bVar.a();
            bVarB.d().put(Integer.valueOf(pointerId), new ArrayList());
        } else {
            List list2 = (List) bVarB.d().get(Integer.valueOf(pointerId));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            AbstractC0874f0.b bVar2 = (AbstractC0874f0.b) list2.get(0);
            iB = bVar2.b();
            viewA = bVar2.a();
        }
        j(iB, bVarB, motionEvent, eVar);
        switch (actionMasked) {
            case 0:
            case 5:
                q(iB, bVarB, motionEvent, eVar);
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
            case 1:
            case 6:
                l();
                s(iB, bVarB, motionEvent, eVar);
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
            case 2:
                r(iB, bVarB, motionEvent, eVar);
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
            case 3:
                c(viewA, bVarB, motionEvent, eVar);
                j(-1, bVarB, motionEvent, eVar);
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
            case 4:
            case 8:
            default:
                P0.a.G("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + iB);
                break;
            case 7:
                float[] fArr = (float[]) bVarB.c().get(Integer.valueOf(pointerId));
                Map map2 = this.f12717b;
                if (!t(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{0.0f, 0.0f} : (float[]) this.f12717b.get(Integer.valueOf(pointerId)))) {
                }
                r(iB, bVarB, motionEvent, eVar);
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                break;
            case 10:
                if (z7) {
                }
                this.f12717b = new HashMap(bVarB.c());
                this.f12723h = motionEvent.getButtonState();
                this.f12719d.retainAll(this.f12717b.keySet());
                break;
        }
    }

    public void o() {
        this.f12720e = -1;
    }

    public void p(View view, MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        if (this.f12720e != -1 || view == null) {
            return;
        }
        MotionEvent motionEventA = a(view, motionEvent);
        motionEventA.setAction(3);
        k(motionEventA, eVar, false);
        this.f12720e = view.getId();
    }
}

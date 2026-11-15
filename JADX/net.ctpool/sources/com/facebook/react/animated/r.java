package com.facebook.react.animated;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.C0892s;
import java.util.HashMap;
import java.util.Map;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
class r extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11342e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f11343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f11344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JavaOnlyMap f11345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private UIManager f11346i;

    r(ReadableMap readableMap, p pVar) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f11344g = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f11344g.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f11345h = new JavaOnlyMap();
        this.f11343f = pVar;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropsAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("] connectedViewTag: ");
        sb.append(this.f11342e);
        sb.append(" mPropNodeMapping: ");
        Map map = this.f11344g;
        sb.append(map != null ? map.toString() : "null");
        sb.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.f11345h;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    public void i(int i7, UIManager uIManager) {
        if (this.f11342e == -1) {
            this.f11342e = i7;
            this.f11346i = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f11274d + " is already attached to a view: " + this.f11342e);
    }

    public void j(int i7) {
        int i8 = this.f11342e;
        if (i8 == i7 || i8 == -1) {
            this.f11342e = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i7 + " but is connected to view " + this.f11342e);
    }

    public View k() {
        try {
            return this.f11346i.resolveView(this.f11342e);
        } catch (C0892s unused) {
            return null;
        }
    }

    public void l() {
        int i7 = this.f11342e;
        if (i7 == -1 || C2239a.a(i7) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.f11345h.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.f11345h.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        this.f11346i.synchronouslyUpdateViewOnUIThread(this.f11342e, this.f11345h);
    }

    public final void m() {
        if (this.f11342e == -1) {
            return;
        }
        for (Map.Entry entry : this.f11344g.entrySet()) {
            AbstractC0793b abstractC0793bL = this.f11343f.l(((Integer) entry.getValue()).intValue());
            if (abstractC0793bL == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (abstractC0793bL instanceof u) {
                ((u) abstractC0793bL).i(this.f11345h);
            } else if (abstractC0793bL instanceof B) {
                B b7 = (B) abstractC0793bL;
                Object objK = b7.k();
                if (objK instanceof Integer) {
                    this.f11345h.putInt((String) entry.getKey(), ((Integer) objK).intValue());
                } else if (objK instanceof String) {
                    this.f11345h.putString((String) entry.getKey(), (String) objK);
                } else {
                    this.f11345h.putDouble((String) entry.getKey(), b7.l());
                }
            } else if (abstractC0793bL instanceof f) {
                this.f11345h.putInt((String) entry.getKey(), ((f) abstractC0793bL).i());
            } else {
                if (!(abstractC0793bL instanceof q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC0793bL.getClass());
                }
                ((q) abstractC0793bL).i((String) entry.getKey(), this.f11345h);
            }
        }
        this.f11346i.synchronouslyUpdateViewOnUIThread(this.f11342e, this.f11345h);
    }
}

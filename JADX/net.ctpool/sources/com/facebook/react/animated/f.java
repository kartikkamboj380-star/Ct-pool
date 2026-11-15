package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f extends AbstractC0793b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactApplicationContext f11280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ReadableMap f11285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11286l;

    public f(ReadableMap readableMap, p pVar, ReactApplicationContext reactApplicationContext) {
        this.f11279e = pVar;
        this.f11280f = reactApplicationContext;
        a(readableMap);
    }

    private Context j() {
        Activity currentActivity = this.f11280f.getCurrentActivity();
        return currentActivity != null ? currentActivity : k(this);
    }

    private static Context k(AbstractC0793b abstractC0793b) {
        List list = abstractC0793b.f11271a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                AbstractC0793b abstractC0793b2 = (AbstractC0793b) it.next();
                if (!(abstractC0793b2 instanceof r)) {
                    return k(abstractC0793b2);
                }
                View viewK = ((r) abstractC0793b2).k();
                if (viewK != null) {
                    return viewK.getContext();
                }
                return null;
            }
        }
        return null;
    }

    private void l() {
        Context contextJ;
        if (this.f11285k == null || this.f11286l || (contextJ = j()) == null) {
            return;
        }
        int iIntValue = ColorPropConverter.getColor(this.f11285k, contextJ).intValue();
        B b7 = (B) this.f11279e.l(this.f11281g);
        B b8 = (B) this.f11279e.l(this.f11282h);
        B b9 = (B) this.f11279e.l(this.f11283i);
        B b10 = (B) this.f11279e.l(this.f11284j);
        b7.f11169e = Color.red(iIntValue);
        b8.f11169e = Color.green(iIntValue);
        b9.f11169e = Color.blue(iIntValue);
        b10.f11169e = ((double) Color.alpha(iIntValue)) / 255.0d;
        this.f11286l = true;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f11281g = readableMap.getInt("r");
        this.f11282h = readableMap.getInt("g");
        this.f11283i = readableMap.getInt("b");
        this.f11284j = readableMap.getInt("a");
        this.f11285k = readableMap.getMap("nativeColor");
        this.f11286l = false;
        l();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "ColorAnimatedNode[" + this.f11274d + "]: r: " + this.f11281g + " g: " + this.f11282h + " b: " + this.f11283i + " a: " + this.f11284j;
    }

    public int i() {
        l();
        return com.facebook.react.views.view.d.b(((B) this.f11279e.l(this.f11281g)).l(), ((B) this.f11279e.l(this.f11282h)).l(), ((B) this.f11279e.l(this.f11283i)).l(), ((B) this.f11279e.l(this.f11284j)).l());
    }
}

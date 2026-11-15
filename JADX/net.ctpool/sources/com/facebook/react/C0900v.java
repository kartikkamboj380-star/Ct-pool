package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.react.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0900v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f12758c = S1.f.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, "right").b(20, "down").b(21, "left").b(165, LogEvent.LEVEL_INFO).b(82, "menu").a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12759a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X f12760b;

    C0900v(X x6) {
        this.f12760b = x6;
    }

    private void b(String str, int i7) {
        c(str, i7, -1);
    }

    private void c(String str, int i7, int i8) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i8);
        if (i7 != -1) {
            writableNativeMap.putInt("tag", i7);
        }
        this.f12760b.r("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i7 = this.f12759a;
        if (i7 != -1) {
            b("blur", i7);
        }
        this.f12759a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map map = f12758c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c((String) map.get(Integer.valueOf(keyCode)), this.f12759a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f12759a == view.getId()) {
            return;
        }
        int i7 = this.f12759a;
        if (i7 != -1) {
            b("blur", i7);
        }
        this.f12759a = view.getId();
        b("focus", view.getId());
    }
}

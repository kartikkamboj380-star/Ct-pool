package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.react.animated.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0793b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f11271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11272b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11273c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f11274d = -1;

    AbstractC0793b() {
    }

    public final void b(AbstractC0793b abstractC0793b) {
        if (this.f11271a == null) {
            this.f11271a = new ArrayList(1);
        }
        ((List) O1.a.c(this.f11271a)).add(abstractC0793b);
        abstractC0793b.c(this);
    }

    public void c(AbstractC0793b abstractC0793b) {
    }

    public void d(AbstractC0793b abstractC0793b) {
    }

    public abstract String e();

    public String f() {
        String str;
        List list = this.f11271a;
        String str2 = "";
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            Iterator it = this.f11271a.iterator();
            str = "";
            while (it.hasNext()) {
                str = str + " " + ((AbstractC0793b) it.next()).f11274d;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        if (str.length() > 0) {
            str2 = " children: " + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void g(AbstractC0793b abstractC0793b) {
        if (this.f11271a == null) {
            return;
        }
        abstractC0793b.d(this);
        this.f11271a.remove(abstractC0793b);
    }

    public void h() {
    }
}

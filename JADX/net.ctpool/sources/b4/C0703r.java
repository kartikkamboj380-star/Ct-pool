package b4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: b4.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0703r extends s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f9717m;

    public C0703r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f9717m = list;
    }
}

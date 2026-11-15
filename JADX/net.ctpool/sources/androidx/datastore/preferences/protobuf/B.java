package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class B implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Iterator f7519m;

    public B(Iterator it) {
        this.f7519m = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f7519m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7519m.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f7519m.remove();
    }
}

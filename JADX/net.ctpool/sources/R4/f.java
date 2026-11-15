package R4;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public e c() {
        if (i()) {
            return (e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i f() {
        if (m()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public k h() {
        if (n()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean i() {
        return this instanceof e;
    }

    public boolean k() {
        return this instanceof h;
    }

    public boolean m() {
        return this instanceof i;
    }

    public boolean n() {
        return this instanceof k;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Y4.c cVar = new Y4.c(stringWriter);
            cVar.B0(true);
            T4.m.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}

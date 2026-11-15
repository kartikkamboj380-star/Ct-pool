package A0;

import A0.f;
import android.webkit.JavascriptInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44d = "function parseForm(form){\n\n    var values = '';\n    for(var i=0 ; i< form.elements.length; i++){\n        values +=\n            form.elements[i].name +\n            '=' +\n            form.elements[i].value +\n            '|'\n    }\n    FormInterceptorInterface.processFormData(values);\n}\n\n\nfor(var i=0 ; i< document.forms.length ; i++){\n    parseForm(document.forms[i]);\n}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f46b;

    public static final class a {
        private a() {
        }

        public final String a() {
            return b.f44d;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(String str, l lVar) {
        k.f(str, "expectedState");
        k.f(lVar, "callback");
        this.f45a = str;
        this.f46b = lVar;
    }

    @JavascriptInterface
    public final void processFormData(String str) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        l lVar;
        Object bVar;
        k.f(str, "formData");
        List listQ0 = F5.g.q0(str, new String[]{"|"}, false, 0, 6, null);
        Iterator it = listQ0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (F5.g.B((String) next, "id_token", false, 2, null)) {
                    break;
                }
            }
        }
        String str2 = (String) next;
        Iterator it2 = listQ0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (F5.g.B((String) next2, "code", false, 2, null)) {
                    break;
                }
            }
        }
        String str3 = (String) next2;
        Iterator it3 = listQ0.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (F5.g.B((String) next3, "state", false, 2, null)) {
                    break;
                }
            }
        }
        String str4 = (String) next3;
        Iterator it4 = listQ0.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it4.next();
                if (F5.g.B((String) next4, "user", false, 2, null)) {
                    break;
                }
            }
        }
        String str5 = (String) next4;
        if (str4 == null || (str3 == null && str2 == null && str5 == null)) {
            lVar = this.f46b;
            bVar = f.a.f49a;
        } else {
            String strZ0 = F5.g.z0(str4, "=", null, 2, null);
            String strZ02 = str3 != null ? F5.g.z0(str3, "=", null, 2, null) : null;
            String strZ03 = str2 != null ? F5.g.z0(str2, "=", null, 2, null) : null;
            String strZ04 = str5 != null ? F5.g.z0(str5, "=", null, 2, null) : null;
            if (k.b(strZ0, this.f45a)) {
                lVar = this.f46b;
                if (strZ02 == null) {
                    strZ02 = "";
                }
                if (strZ03 == null) {
                    strZ03 = "";
                }
                if (strZ04 == null) {
                    strZ04 = "";
                }
                bVar = new f.c(strZ02, strZ03, strZ0, strZ04);
            } else {
                lVar = this.f46b;
                bVar = new f.b(new IllegalArgumentException("state does not match"));
            }
        }
        lVar.i(bVar);
    }
}

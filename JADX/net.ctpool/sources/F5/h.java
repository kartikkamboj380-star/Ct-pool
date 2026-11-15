package F5;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static void a(Appendable appendable, Object obj, v5.l lVar) throws IOException {
        CharSequence charSequenceValueOf;
        w5.k.f(appendable, "<this>");
        if (lVar == null) {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = lVar.i(obj);
        charSequenceValueOf = (CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }
}

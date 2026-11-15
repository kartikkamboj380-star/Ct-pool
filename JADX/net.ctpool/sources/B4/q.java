package B4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f769a;

    public q(Context context, String str) {
        this.f769a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j7 = this.f769a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f769a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f769a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f769a.edit().putStringSet(key, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j7) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j7).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f769a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f769a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f769a.edit().remove(strE) : this.f769a.edit().putStringSet(strE, hashSet)).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f769a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f769a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f769a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f769a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i7++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i7);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f769a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(r.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean f(long j7, long j8) {
        return d(j7).equals(d(j8));
    }

    synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f769a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    synchronized boolean i(long j7) {
        return j("fire-global", j7);
    }

    synchronized boolean j(String str, long j7) {
        if (!this.f769a.contains(str)) {
            this.f769a.edit().putLong(str, j7).commit();
            return true;
        }
        if (f(this.f769a.getLong(str, -1L), j7)) {
            return false;
        }
        this.f769a.edit().putLong(str, j7).commit();
        return true;
    }

    synchronized void k(long j7, String str) {
        String strD = d(j7);
        if (this.f769a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            m(str, strD);
            return;
        }
        long j8 = this.f769a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            a();
            j8 = this.f769a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f769a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f769a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", strD).commit();
    }

    synchronized void l(long j7) {
        this.f769a.edit().putLong("fire-global", j7).commit();
    }
}

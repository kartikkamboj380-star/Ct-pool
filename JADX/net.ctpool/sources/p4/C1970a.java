package p4;

import e4.C1629g;
import h4.AbstractC1721j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import n4.C1928g;
import org.json.JSONObject;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1970a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f21614a;

    public C1970a(C1928g c1928g) {
        this.f21614a = c1928g.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f21614a;
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C1629g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(AbstractC1721j.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        C1629g.f().e("Failed to fetch cached settings", e);
                        AbstractC1721j.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C1629g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC1721j.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1721j.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC1721j.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j7, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        C1629g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j7);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e7) {
                e = e7;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                AbstractC1721j.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e8) {
                e = e8;
                fileWriter2 = fileWriter;
                C1629g.f().e("Failed to cache settings", e);
                AbstractC1721j.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC1721j.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}

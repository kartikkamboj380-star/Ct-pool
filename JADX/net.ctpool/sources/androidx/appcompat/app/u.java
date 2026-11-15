package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.f;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
abstract class u {

    static class a implements Executor {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Object f5213m = new Object();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Queue f5214n = new ArrayDeque();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final Executor f5215o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Runnable f5216p;

        a(Executor executor) {
            this.f5215o = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f5213m) {
                try {
                    Runnable runnable = (Runnable) this.f5214n.poll();
                    this.f5216p = runnable;
                    if (runnable != null) {
                        this.f5215o.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f5213m) {
                try {
                    this.f5214n.add(new Runnable() { // from class: androidx.appcompat.app.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5211m.b(runnable);
                        }
                    });
                    if (this.f5216p == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e7);
                if (fileOutputStreamOpenFileOutput != null) {
                }
            }
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused2) {
                }
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String b(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                    }
                }
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + attributeValue);
                }
                return attributeValue;
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (f.m().f()) {
                    String strB = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        f.b.b(systemService, f.a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}

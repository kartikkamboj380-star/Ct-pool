package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f11654a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f11655b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    public static X1.j[] a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        X1.j[] jVarArr = new X1.j[stackTrace.length];
        for (int i7 = 0; i7 < stackTrace.length; i7++) {
            jVarArr[i7] = new a(stackTrace[i7].getClassName(), stackTrace[i7].getFileName(), stackTrace[i7].getMethodName(), stackTrace[i7].getLineNumber(), -1);
        }
        return jVarArr;
    }

    public static X1.j[] b(ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        X1.j[] jVarArr = new X1.j[size];
        for (int i7 = 0; i7 < size; i7++) {
            ReadableType type = readableArray.getType(i7);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i7);
                String string = map.getString("methodName");
                jVarArr[i7] = new a(map.getString("file"), string, (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber"), (!map.hasKey("column") || map.isNull("column")) ? -1 : map.getInt("column"), map.hasKey("collapse") && !map.isNull("collapse") && map.getBoolean("collapse"));
            } else if (type == ReadableType.String) {
                jVarArr[i7] = new a((String) null, readableArray.getString(i7), -1, -1);
            }
        }
        return jVarArr;
    }

    public static JavaOnlyMap c(ReactJsExceptionHandler.ParsedError parsedError) {
        List<ReactJsExceptionHandler.ParsedError.StackFrame> frames = parsedError.getFrames();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ParsedError.StackFrame stackFrame : frames) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble("column", stackFrame.getColumnNumber());
            javaOnlyMap.putDouble("lineNumber", stackFrame.getLineNumber());
            javaOnlyMap.putString("file", stackFrame.getFileName());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", parsedError.getMessage());
        javaOnlyMap2.putArray("stack", JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", parsedError.getExceptionId());
        javaOnlyMap2.putBoolean("isFatal", parsedError.isFatal());
        return javaOnlyMap2;
    }

    public static String d(X1.j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.getFileName());
        int iA = jVar.a();
        if (iA > 0) {
            sb.append(":");
            sb.append(iA);
            int iE = jVar.e();
            if (iE > 0) {
                sb.append(":");
                sb.append(iE);
            }
        }
        return sb.toString();
    }

    public static class a implements X1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f11660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f11661f;

        private a(String str, String str2, int i7, int i8) {
            this(str, str2, i7, i8, false);
        }

        @Override // X1.j
        public int a() {
            return this.f11658c;
        }

        @Override // X1.j
        public String b() {
            return this.f11656a;
        }

        @Override // X1.j
        public String c() {
            return this.f11657b;
        }

        @Override // X1.j
        public boolean d() {
            return this.f11661f;
        }

        @Override // X1.j
        public int e() {
            return this.f11659d;
        }

        @Override // X1.j
        public String getFileName() {
            return this.f11660e;
        }

        private a(String str, String str2, int i7, int i8, boolean z6) {
            this.f11656a = str;
            this.f11657b = str2;
            this.f11658c = i7;
            this.f11659d = i8;
            this.f11660e = str != null ? new File(str).getName() : "";
            this.f11661f = z6;
        }

        private a(String str, String str2, String str3, int i7, int i8) {
            this.f11656a = str;
            this.f11660e = str2;
            this.f11657b = str3;
            this.f11658c = i7;
            this.f11659d = i8;
            this.f11661f = false;
        }
    }
}

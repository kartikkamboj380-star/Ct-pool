package l4;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C1827a;
import k4.F;
import w4.InterfaceC2196a;
import y4.C2248d;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2196a f21117a = new C2248d().j(C1827a.f20576a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Object a(JsonReader jsonReader);
    }

    private static F.e.d.f A(JsonReader jsonReader) throws IOException {
        F.e.d.f.a aVarA = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: l4.f
                    @Override // l4.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e.d.a.b.AbstractC0284d B(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0284d.AbstractC0285a abstractC0285aA = F.e.d.a.b.AbstractC0284d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0285aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0285aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0285aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0285aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0286e C(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0286e.AbstractC0287a abstractC0287aA = F.e.d.a.b.AbstractC0286e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0287aA.b(n(jsonReader, new C1858i()));
                    break;
                case "name":
                    abstractC0287aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0287aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0287aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.d.b D(JsonReader jsonReader) throws IOException {
        F.d.b.a aVarA = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.d E(JsonReader jsonReader) throws IOException {
        F.d.a aVarA = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: l4.e
                    @Override // l4.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e.AbstractC0293e F(JsonReader jsonReader) throws IOException {
        F.e.AbstractC0293e.a aVarA = F.e.AbstractC0293e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        F.e.d.a.c.AbstractC0290a abstractC0290aA = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC0290aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0290aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0290aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0290aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0290aA.a();
    }

    private static F H(JsonReader jsonReader) throws IOException {
        F.b bVarB = F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    private static F.e.d.AbstractC0292e.b I(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0292e.b.a aVarA = F.e.d.AbstractC0292e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e J(JsonReader jsonReader) throws IOException {
        F.e.b bVarA = F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: l4.d
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static F.e.f K(JsonReader jsonReader) throws IOException {
        F.e.f.a aVarA = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e.a l(JsonReader jsonReader) throws IOException {
        F.e.a.AbstractC0278a abstractC0278aA = F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0278aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0278aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0278aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0278aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0278aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0278aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0278aA.a();
    }

    private static F.a m(JsonReader jsonReader) throws IOException {
        F.a.b bVarA = F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: l4.a
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static List n(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.a.AbstractC0276a o(JsonReader jsonReader) throws IOException {
        F.a.AbstractC0276a.AbstractC0277a abstractC0277aA = F.a.AbstractC0276a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC0277aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0277aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0277aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0277aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.c p(JsonReader jsonReader) throws IOException {
        F.c.a aVarA = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e.c q(JsonReader jsonReader) throws IOException {
        F.e.c.a aVarA = F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d r(JsonReader jsonReader) throws IOException {
        F.e.d.b bVarA = F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static F.e.d.a s(JsonReader jsonReader) throws IOException {
        F.e.d.a.AbstractC0279a abstractC0279aA = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0279aA.b(n(jsonReader, new a() { // from class: l4.c
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0279aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0279aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0279aA.g(n(jsonReader, new a() { // from class: l4.b
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0279aA.e(n(jsonReader, new a() { // from class: l4.b
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0279aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0279aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0279aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0280a t(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0280a.AbstractC0281a abstractC0281aA = F.e.d.a.b.AbstractC0280a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC0281aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0281aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0281aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0281aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0281aA.a();
    }

    private static F.e.d.c u(JsonReader jsonReader) throws IOException {
        F.e.d.c.a aVarA = F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0282b abstractC0282bA = F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0282bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0282bA.f(n(jsonReader, new a() { // from class: l4.g
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0282bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0282bA.c(n(jsonReader, new a() { // from class: l4.h
                        @Override // l4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0282bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0282bA.a();
    }

    private static F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.c.AbstractC0283a abstractC0283aA = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0283aA.c(n(jsonReader, new C1858i()));
                    break;
                case "reason":
                    abstractC0283aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0283aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0283aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0283aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0283aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0286e.AbstractC0288b x(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a abstractC0289aA = F.e.d.a.b.AbstractC0286e.AbstractC0288b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0289aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0289aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0289aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0289aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0289aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0289aA.a();
    }

    private static F.e.d.AbstractC0291d y(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0291d.a aVarA = F.e.d.AbstractC0291d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.AbstractC0292e z(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0292e.a aVarA = F.e.d.AbstractC0292e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F fH = H(jsonReader);
                jsonReader.close();
                return fH;
            } finally {
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    public String M(F f7) {
        return f21117a.b(f7);
    }

    public F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } finally {
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    public String k(F.e.d dVar) {
        return f21117a.b(dVar);
    }
}

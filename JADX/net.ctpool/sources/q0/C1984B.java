package q0;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l0.C1844b;
import l0.EnumC1843a;
import t5.AbstractC2070a;

/* JADX INFO: renamed from: q0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1984B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1984B f21753a = new C1984B();

    /* JADX INFO: renamed from: q0.B$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f21755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f21756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f21757d;

        static {
            int[] iArr = new int[l0.s.values().length];
            try {
                iArr[l0.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l0.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l0.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l0.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21754a = iArr;
            int[] iArr2 = new int[EnumC1843a.values().length];
            try {
                iArr2[EnumC1843a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1843a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f21755b = iArr2;
            int[] iArr3 = new int[l0.j.values().length];
            try {
                iArr3[l0.j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[l0.j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[l0.j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[l0.j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[l0.j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f21756c = iArr3;
            int[] iArr4 = new int[l0.m.values().length];
            try {
                iArr4[l0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[l0.m.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f21757d = iArr4;
        }
    }

    private C1984B() {
    }

    public static final int a(EnumC1843a enumC1843a) {
        w5.k.f(enumC1843a, "backoffPolicy");
        int i7 = a.f21755b[enumC1843a.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new i5.k();
    }

    public static final Set b(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        w5.k.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            try {
                int i7 = objectInputStream.readInt();
                for (int i8 = 0; i8 < i7; i8++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z6 = objectInputStream.readBoolean();
                    w5.k.e(uri, "uri");
                    linkedHashSet.add(new C1844b.C0298b(uri, z6));
                }
                i5.u uVar = i5.u.f19985a;
                AbstractC2070a.a(objectInputStream, null);
                i5.u uVar2 = i5.u.f19985a;
                AbstractC2070a.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final EnumC1843a c(int i7) {
        if (i7 == 0) {
            return EnumC1843a.EXPONENTIAL;
        }
        if (i7 == 1) {
            return EnumC1843a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to BackoffPolicy");
    }

    public static final l0.j d(int i7) {
        if (i7 == 0) {
            return l0.j.NOT_REQUIRED;
        }
        if (i7 == 1) {
            return l0.j.CONNECTED;
        }
        if (i7 == 2) {
            return l0.j.UNMETERED;
        }
        if (i7 == 3) {
            return l0.j.NOT_ROAMING;
        }
        if (i7 == 4) {
            return l0.j.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i7 == 5) {
            return l0.j.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to NetworkType");
    }

    public static final l0.m e(int i7) {
        if (i7 == 0) {
            return l0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i7 == 1) {
            return l0.m.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to OutOfQuotaPolicy");
    }

    public static final l0.s f(int i7) {
        if (i7 == 0) {
            return l0.s.ENQUEUED;
        }
        if (i7 == 1) {
            return l0.s.RUNNING;
        }
        if (i7 == 2) {
            return l0.s.SUCCEEDED;
        }
        if (i7 == 3) {
            return l0.s.FAILED;
        }
        if (i7 == 4) {
            return l0.s.BLOCKED;
        }
        if (i7 == 5) {
            return l0.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to State");
    }

    public static final int g(l0.j jVar) {
        w5.k.f(jVar, "networkType");
        int i7 = a.f21756c[jVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        int i8 = 2;
        if (i7 == 2) {
            return 1;
        }
        if (i7 != 3) {
            i8 = 4;
            if (i7 == 4) {
                return 3;
            }
            if (i7 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && jVar == l0.j.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + jVar + " to int");
            }
        }
        return i8;
    }

    public static final int h(l0.m mVar) {
        w5.k.f(mVar, "policy");
        int i7 = a.f21757d[mVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new i5.k();
    }

    public static final byte[] i(Set set) throws IOException {
        w5.k.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C1844b.C0298b c0298b = (C1844b.C0298b) it.next();
                    objectOutputStream.writeUTF(c0298b.a().toString());
                    objectOutputStream.writeBoolean(c0298b.b());
                }
                i5.u uVar = i5.u.f19985a;
                AbstractC2070a.a(objectOutputStream, null);
                AbstractC2070a.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                w5.k.e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(l0.s sVar) {
        w5.k.f(sVar, "state");
        switch (a.f21754a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new i5.k();
        }
    }
}

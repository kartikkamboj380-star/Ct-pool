package i6;

import j5.AbstractC1797b;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1797b implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f20041p = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i[] f20042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f20043o;

    public static final class a {
        private a() {
        }

        private final void a(long j7, f fVar, int i7, List list, int i8, int i9, List list2) {
            int i10;
            int i11;
            int i12;
            int i13;
            f fVar2;
            int i14 = i7;
            if (!(i8 < i9)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i15 = i8; i15 < i9; i15++) {
                if (!(((i) list.get(i15)).C() >= i14)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            i iVar = (i) list.get(i8);
            i iVar2 = (i) list.get(i9 - 1);
            int i16 = -1;
            if (i14 == iVar.C()) {
                int iIntValue = ((Number) list2.get(i8)).intValue();
                int i17 = i8 + 1;
                i iVar3 = (i) list.get(i17);
                i10 = i17;
                i11 = iIntValue;
                iVar = iVar3;
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (iVar.m(i14) == iVar2.m(i14)) {
                int iMin = Math.min(iVar.C(), iVar2.C());
                int i18 = 0;
                for (int i19 = i14; i19 < iMin && iVar.m(i19) == iVar2.m(i19); i19++) {
                    i18++;
                }
                long jC = j7 + c(fVar) + ((long) 2) + ((long) i18) + 1;
                fVar.G(-i18);
                fVar.G(i11);
                int i20 = i14 + i18;
                while (i14 < i20) {
                    fVar.G(iVar.m(i14) & 255);
                    i14++;
                }
                if (i10 + 1 == i9) {
                    if (!(i20 == ((i) list.get(i10)).C())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar.G(((Number) list2.get(i10)).intValue());
                    return;
                } else {
                    f fVar3 = new f();
                    fVar.G(((int) (c(fVar3) + jC)) * (-1));
                    a(jC, fVar3, i20, list, i10, i9, list2);
                    fVar.x(fVar3);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i10 + 1; i22 < i9; i22++) {
                if (((i) list.get(i22 - 1)).m(i14) != ((i) list.get(i22)).m(i14)) {
                    i21++;
                }
            }
            long jC2 = j7 + c(fVar) + ((long) 2) + ((long) (i21 * 2));
            fVar.G(i21);
            fVar.G(i11);
            for (int i23 = i10; i23 < i9; i23++) {
                byte bM = ((i) list.get(i23)).m(i14);
                if (i23 == i10 || bM != ((i) list.get(i23 - 1)).m(i14)) {
                    fVar.G(bM & 255);
                }
            }
            f fVar4 = new f();
            while (i10 < i9) {
                byte bM2 = ((i) list.get(i10)).m(i14);
                int i24 = i10 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= i9) {
                        i12 = i9;
                        break;
                    } else {
                        if (bM2 != ((i) list.get(i25)).m(i14)) {
                            i12 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i12 && i14 + 1 == ((i) list.get(i10)).C()) {
                    fVar.G(((Number) list2.get(i10)).intValue());
                    i13 = i12;
                    fVar2 = fVar4;
                } else {
                    fVar.G(((int) (jC2 + c(fVar4))) * i16);
                    i13 = i12;
                    fVar2 = fVar4;
                    a(jC2, fVar4, i14 + 1, list, i10, i12, list2);
                }
                fVar4 = fVar2;
                i10 = i13;
                i16 = -1;
            }
            fVar.x(fVar4);
        }

        static /* synthetic */ void b(a aVar, long j7, f fVar, int i7, List list, int i8, int i9, List list2, int i10, Object obj) {
            aVar.a((i10 & 1) != 0 ? 0L : j7, fVar, (i10 & 4) != 0 ? 0 : i7, list, (i10 & 16) != 0 ? 0 : i8, (i10 & 32) != 0 ? list.size() : i9, list2);
        }

        private final long c(f fVar) {
            return fVar.m1() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final t d(i... iVarArr) {
            w5.k.f(iVarArr, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i7 = 0;
            if (iVarArr.length == 0) {
                return new t(new i[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listG = AbstractC1803h.G(iVarArr);
            AbstractC1809n.r(listG);
            ArrayList arrayList = new ArrayList(iVarArr.length);
            for (i iVar : iVarArr) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            List listM = AbstractC1809n.m((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = iVarArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                listM.set(AbstractC1809n.h(listG, iVarArr[i8], 0, 0, 6, null), Integer.valueOf(i9));
                i8++;
                i9++;
            }
            if (!(((i) listG.get(0)).C() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i10 = 0;
            while (i10 < listG.size()) {
                i iVar2 = (i) listG.get(i10);
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < listG.size()) {
                    i iVar3 = (i) listG.get(i12);
                    if (!iVar3.D(iVar2)) {
                        break;
                    }
                    if (!(iVar3.C() != iVar2.C())) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                    }
                    if (((Number) listM.get(i12)).intValue() > ((Number) listM.get(i10)).intValue()) {
                        listG.remove(i12);
                        listM.remove(i12);
                    } else {
                        i12++;
                    }
                }
                i10 = i11;
            }
            f fVar = new f();
            b(this, 0L, fVar, 0, listG, 0, 0, listM, 53, null);
            int[] iArr = new int[(int) c(fVar)];
            while (!fVar.O()) {
                iArr[i7] = fVar.F();
                i7++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(iVarArr, iVarArr.length);
            w5.k.e(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new t((i[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private t(i[] iVarArr, int[] iArr) {
        this.f20042n = iVarArr;
        this.f20043o = iArr;
    }

    @Override // j5.AbstractC1796a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return h((i) obj);
        }
        return false;
    }

    @Override // j5.AbstractC1796a
    public int f() {
        return this.f20042n.length;
    }

    public /* bridge */ boolean h(i iVar) {
        return super.contains(iVar);
    }

    @Override // j5.AbstractC1797b, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i get(int i7) {
        return this.f20042n[i7];
    }

    @Override // j5.AbstractC1797b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return n((i) obj);
        }
        return -1;
    }

    public final i[] k() {
        return this.f20042n;
    }

    @Override // j5.AbstractC1797b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return o((i) obj);
        }
        return -1;
    }

    public final int[] m() {
        return this.f20043o;
    }

    public /* bridge */ int n(i iVar) {
        return super.indexOf(iVar);
    }

    public /* bridge */ int o(i iVar) {
        return super.lastIndexOf(iVar);
    }

    public /* synthetic */ t(i[] iVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVarArr, iArr);
    }
}

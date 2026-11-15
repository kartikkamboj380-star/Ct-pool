package u5;

import w5.InterfaceC2200d;
import w5.k;

/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2147a {
    public static final Class a(D5.b bVar) {
        k.f(bVar, "<this>");
        Class clsB = ((InterfaceC2200d) bVar).b();
        k.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(D5.b bVar) {
        k.f(bVar, "<this>");
        Class clsB = ((InterfaceC2200d) bVar).b();
        if (!clsB.isPrimitive()) {
            k.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsB = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsB = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsB = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsB = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsB = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsB = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsB = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsB = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsB = Short.class;
                }
                break;
        }
        k.d(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }
}

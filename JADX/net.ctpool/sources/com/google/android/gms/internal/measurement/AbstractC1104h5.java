package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1104h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f14603a;

    static {
        char[] cArr = new char[80];
        f14603a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC1095g5 interfaceC1095g5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(interfaceC1095g5, sb, 0);
        return sb.toString();
    }

    private static void b(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f14603a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(InterfaceC1095g5 interfaceC1095g5, StringBuilder sb, int i7) {
        int i8;
        int i9;
        boolean zBooleanValue;
        Object obj;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC1095g5.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i8 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i9 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                Method method4 = (Method) entry.getValue();
                                Method method5 = (Method) map.get("has" + strSubstring);
                                if (method4 != null) {
                                    Object objR = AbstractC1260z4.r(method4, interfaceC1095g5, new Object[0]);
                                    if (method5 == null) {
                                        zBooleanValue = true;
                                        if (objR instanceof Boolean) {
                                            zEquals = !((Boolean) objR).booleanValue();
                                        } else if (objR instanceof Integer) {
                                            if (((Integer) objR).intValue() == 0) {
                                            }
                                        } else if (objR instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objR).floatValue()) == 0) {
                                            }
                                        } else if (!(objR instanceof Double)) {
                                            if (objR instanceof String) {
                                                obj = "";
                                            } else if (objR instanceof R3) {
                                                obj = R3.f14328n;
                                            } else if (!(objR instanceof InterfaceC1095g5) ? !(objR instanceof Enum) || ((Enum) objR).ordinal() != 0 : objR != ((InterfaceC1095g5) objR).b()) {
                                            }
                                            zEquals = objR.equals(obj);
                                        } else if (Double.doubleToRawLongBits(((Double) objR).doubleValue()) == 0) {
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((Boolean) AbstractC1260z4.r(method5, interfaceC1095g5, new Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        d(sb, i7, strSubstring, objR);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i9 = 3;
                    d(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), AbstractC1260z4.r(method, interfaceC1095g5, new Object[0]));
                }
                i8 = i9;
            } else {
                d(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), AbstractC1260z4.r(method2, interfaceC1095g5, new Object[0]));
                i8 = 3;
            }
        }
        K5 k52 = ((AbstractC1260z4) interfaceC1095g5).zzb;
        if (k52 != null) {
            k52.h(sb, i7);
        }
    }

    static void d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(H5.a(R3.m((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof R3) {
            sb.append(": \"");
            sb.append(H5.a((R3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1260z4) {
            sb.append(" {");
            c((AbstractC1260z4) obj, sb, i7 + 2);
            sb.append("\n");
            b(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i7 + 2;
        d(sb, i9, "key", entry.getKey());
        d(sb, i9, "value", entry.getValue());
        sb.append("\n");
        b(i7, sb);
        sb.append("}");
    }
}

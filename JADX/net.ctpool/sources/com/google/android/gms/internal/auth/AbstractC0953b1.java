package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0953b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f13880a;

    static {
        char[] cArr = new char[80];
        f13880a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(Z0 z02, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(z02, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i7, sb);
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
            sb.append(AbstractC0992o1.a(new C0988n0(((String) obj).getBytes(G0.f13795b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0997q0) {
            sb.append(": \"");
            sb.append(AbstractC0992o1.a((AbstractC0997q0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0) {
            sb.append(" {");
            d((C0) obj, sb, i7 + 2);
            sb.append("\n");
            c(i7, sb);
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
        b(sb, i9, "key", entry.getKey());
        b(sb, i9, "value", entry.getValue());
        sb.append("\n");
        c(i7, sb);
        sb.append("}");
    }

    private static void c(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f13880a, 0, i8);
            i7 -= i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(Z0 z02, StringBuilder sb, int i7) {
        int i8;
        Object obj;
        Method method;
        String strSubstring;
        Object objG;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = z02.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
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
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring2 = ((String) entry.getKey()).substring(i8);
            if (strSubstring2.endsWith("List") && !strSubstring2.endsWith("OrBuilderList") && !strSubstring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                strSubstring = strSubstring2.substring(0, strSubstring2.length() - 4);
                objG = C0.g(method2, z02, new Object[0]);
            } else if (!strSubstring2.endsWith("Map") || strSubstring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(strSubstring2)) && (!strSubstring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) map.get("has".concat(strSubstring2));
                    if (method4 != null) {
                        Object objG2 = C0.g(method4, z02, new Object[0]);
                        if (method5 == null) {
                            if (objG2 instanceof Boolean) {
                                if (((Boolean) objG2).booleanValue()) {
                                    b(sb, i7, strSubstring2, objG2);
                                }
                            } else if (objG2 instanceof Integer) {
                                if (((Integer) objG2).intValue() != 0) {
                                }
                            } else if (objG2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objG2).floatValue()) != 0) {
                                }
                            } else if (!(objG2 instanceof Double)) {
                                if (objG2 instanceof String) {
                                    obj = "";
                                } else if (objG2 instanceof AbstractC0997q0) {
                                    obj = AbstractC0997q0.f14021n;
                                } else if (objG2 instanceof Z0) {
                                    if (objG2 != ((Z0) objG2).b()) {
                                    }
                                } else if (!(objG2 instanceof Enum) || ((Enum) objG2).ordinal() != 0) {
                                }
                                if (!objG2.equals(obj)) {
                                }
                            } else if (Double.doubleToRawLongBits(((Double) objG2).doubleValue()) != 0) {
                            }
                        } else if (((Boolean) C0.g(method5, z02, new Object[0])).booleanValue()) {
                        }
                    }
                }
                i8 = 3;
            } else {
                strSubstring = strSubstring2.substring(0, strSubstring2.length() - 3);
                objG = C0.g(method, z02, new Object[0]);
            }
            b(sb, i7, strSubstring, objG);
            i8 = 3;
        }
        C1003s1 c1003s1 = ((C0) z02).zzc;
        if (c1003s1 != null) {
            c1003s1.g(sb, i7);
        }
    }
}

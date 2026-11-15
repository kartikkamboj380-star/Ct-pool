package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
abstract class Q {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof AbstractC0612g)) {
                return obj instanceof O ? obj == ((O) obj).a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC0612g.f7582n;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb, int i7, String str, Object obj) {
        String strA;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            strA = j0.c((String) obj);
        } else {
            if (!(obj instanceof AbstractC0612g)) {
                if (obj instanceof AbstractC0627w) {
                    sb.append(" {");
                    d((AbstractC0627w) obj, sb, i7 + 2);
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb.append(": ");
                        sb.append(obj.toString());
                        return;
                    }
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i10 = i7 + 2;
                    c(sb, i10, "key", entry.getKey());
                    c(sb, i10, "value", entry.getValue());
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            strA = j0.a((AbstractC0612g) obj);
        }
        sb.append(strA);
        sb.append('\"');
    }

    private static void d(O o6, StringBuilder sb, int i7) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : o6.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i7, a(str2), AbstractC0627w.u(method2, o6, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i7, a(str3), AbstractC0627w.u(method3, o6, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get" + strReplaceFirst);
                Method method5 = (Method) map.get("has" + strReplaceFirst);
                if (method4 != null) {
                    Object objU = AbstractC0627w.u(method4, o6, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) AbstractC0627w.u(method5, o6, new Object[0])).booleanValue();
                    } else if (b(objU)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        c(sb, i7, a(str4), objU);
                    }
                }
            }
        }
        m0 m0Var = ((AbstractC0627w) o6).unknownFields;
        if (m0Var != null) {
            m0Var.m(sb, i7);
        }
    }

    static String e(O o6, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(o6, sb, 0);
        return sb.toString();
    }
}

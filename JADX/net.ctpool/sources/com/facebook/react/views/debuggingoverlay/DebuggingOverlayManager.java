package com.facebook.react.views.debuggingoverlay;

import H2.b;
import H2.c;
import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.SimpleViewManager;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = DebuggingOverlayManager.REACT_CLASS)
public final class DebuggingOverlayManager extends SimpleViewManager<b> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "DebuggingOverlay";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(C0872e0 c0872e0) {
        k.f(c0872e0, "context");
        return new b(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void receiveCommand(b bVar, String str, ReadableArray readableArray) throws Exception {
        String str2;
        boolean z6;
        String str3;
        String str4;
        int i7;
        String str5;
        ReadableArray readableArray2;
        String str6;
        String str7;
        float f7;
        float f8;
        k.f(bVar, "view");
        k.f(str, "commandId");
        int iHashCode = str.hashCode();
        String str8 = REACT_CLASS;
        if (iHashCode != -1942063165) {
            String str9 = "width";
            String str10 = "y";
            String str11 = "x";
            if (iHashCode == 1326903961) {
                String str12 = "x";
                if (str.equals("highlightTraceUpdates")) {
                    if (readableArray == null) {
                        return;
                    }
                    boolean z7 = false;
                    ReadableArray array = readableArray.getArray(0);
                    ArrayList arrayList = new ArrayList();
                    int size = array.size();
                    int i8 = 0;
                    boolean z8 = true;
                    while (true) {
                        if (i8 >= size) {
                            z6 = z8;
                            break;
                        }
                        ReadableMap map = array.getMap(i8);
                        ReadableMap map2 = map.getMap("rectangle");
                        if (map2 == null) {
                            ReactSoftExceptionLogger.logSoftException(str8, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                            z6 = z7;
                            break;
                        }
                        int i9 = map.getInt("id");
                        int i10 = map.getInt("color");
                        ArrayList arrayList2 = arrayList;
                        String str13 = str12;
                        try {
                            float f9 = (float) map2.getDouble(str13);
                            str12 = str13;
                            try {
                                float f10 = (float) map2.getDouble("y");
                                str3 = str8;
                                try {
                                    str4 = str9;
                                    i7 = size;
                                    try {
                                        arrayList = arrayList2;
                                    } catch (Exception e7) {
                                        e = e7;
                                        arrayList = arrayList2;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    arrayList = arrayList2;
                                    str4 = str9;
                                    i7 = size;
                                    if (!(e instanceof NoSuchKeyException) ? true : e instanceof UnexpectedNativeTypeException) {
                                        throw e;
                                    }
                                    str5 = str3;
                                    ReactSoftExceptionLogger.logSoftException(str5, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                                    z8 = false;
                                    i8++;
                                    str9 = str4;
                                    size = i7;
                                    str8 = str5;
                                    z7 = false;
                                }
                                try {
                                    arrayList.add(new c(i9, new RectF(G.d(f9), G.d(f10), G.d((float) (((double) f9) + map2.getDouble(str9))), G.d((float) (((double) f10) + map2.getDouble("height")))), i10));
                                    str5 = str3;
                                } catch (Exception e9) {
                                    e = e9;
                                    if (!(e instanceof NoSuchKeyException) ? true : e instanceof UnexpectedNativeTypeException) {
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                arrayList = arrayList2;
                                str3 = str8;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            arrayList = arrayList2;
                            str3 = str8;
                            str4 = str9;
                            i7 = size;
                            str12 = str13;
                        }
                        i8++;
                        str9 = str4;
                        size = i7;
                        str8 = str5;
                        z7 = false;
                    }
                    if (z6) {
                        bVar.setTraceUpdates(arrayList);
                        return;
                    }
                    return;
                }
            } else if (iHashCode == 1385348555 && str.equals("highlightElements")) {
                if (readableArray == null) {
                    return;
                }
                ReadableArray array2 = readableArray.getArray(0);
                ArrayList arrayList3 = new ArrayList();
                int size2 = array2.size();
                int i11 = 0;
                boolean z9 = true;
                while (i11 < size2) {
                    ReadableMap map3 = array2.getMap(i11);
                    try {
                        f7 = (float) map3.getDouble(str11);
                        f8 = (float) map3.getDouble(str10);
                        str6 = str10;
                        str7 = str11;
                        try {
                            readableArray2 = array2;
                        } catch (Exception e12) {
                            e = e12;
                            readableArray2 = array2;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        readableArray2 = array2;
                        str6 = str10;
                        str7 = str11;
                    }
                    try {
                        arrayList3.add(new RectF(G.d(f7), G.d(f8), G.d((float) (((double) f7) + map3.getDouble("width"))), G.d((float) (((double) f8) + map3.getDouble("height")))));
                    } catch (Exception e14) {
                        e = e14;
                        if (!(e instanceof NoSuchKeyException ? true : e instanceof UnexpectedNativeTypeException)) {
                            throw e;
                        }
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                        z9 = false;
                    }
                    i11++;
                    array2 = readableArray2;
                    str10 = str6;
                    str11 = str7;
                }
                if (z9) {
                    bVar.setHighlightedElementsRectangles(arrayList3);
                    return;
                }
                return;
            }
            str2 = REACT_CLASS;
        } else {
            str2 = REACT_CLASS;
            if (str.equals("clearElementsHighlights")) {
                bVar.b();
                return;
            }
        }
        ReactSoftExceptionLogger.logSoftException(str2, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}

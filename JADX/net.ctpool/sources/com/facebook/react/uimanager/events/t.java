package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12590a;

        static {
            int[] iArr = new int[s.values().length];
            f12590a = iArr;
            try {
                iArr[s.f12583o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12590a[s.f12584p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12590a[s.f12585q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12590a[s.f12586r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] a(q qVar) {
        MotionEvent motionEventC = qVar.c();
        WritableMap[] writableMapArr = new WritableMap[motionEventC.getPointerCount()];
        float x6 = motionEventC.getX() - qVar.e();
        float y6 = motionEventC.getY() - qVar.f();
        for (int i7 = 0; i7 < motionEventC.getPointerCount(); i7++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("pageX", G.b(motionEventC.getX(i7)));
            writableMapCreateMap.putDouble("pageY", G.b(motionEventC.getY(i7)));
            float x7 = motionEventC.getX(i7) - x6;
            float y7 = motionEventC.getY(i7) - y6;
            writableMapCreateMap.putDouble("locationX", G.b(x7));
            writableMapCreateMap.putDouble("locationY", G.b(y7));
            writableMapCreateMap.putInt("targetSurface", qVar.getSurfaceId());
            writableMapCreateMap.putInt("target", qVar.getViewTag());
            writableMapCreateMap.putDouble("timestamp", qVar.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEventC.getPointerId(i7));
            writableMapArr[i7] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private static WritableArray b(boolean z6, WritableMap... writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z6) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    static void c(RCTModernEventEmitter rCTModernEventEmitter, q qVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        P2.a.c(0L, "TouchesHelper.sentTouchEventModern(" + qVar.getEventName() + ")");
        try {
            s sVarD = qVar.d();
            MotionEvent motionEventC = qVar.c();
            if (motionEventC == null) {
                ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
                return;
            }
            WritableMap[] writableMapArrA = a(qVar);
            int i7 = a.f12590a[sVarD.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    int actionIndex = motionEventC.getActionIndex();
                    WritableMap writableMap = writableMapArrA[actionIndex];
                    writableMapArrA[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap};
                } else if (i7 == 3) {
                    writableMapArr2 = new WritableMap[writableMapArrA.length];
                    for (int i8 = 0; i8 < writableMapArrA.length; i8++) {
                        writableMapArr2[i8] = writableMapArrA[i8].copy();
                    }
                } else if (i7 != 4) {
                    writableMapArr = writableMapArrA;
                    writableMapArrA = null;
                } else {
                    writableMapArr = new WritableMap[0];
                }
                writableMapArrA = writableMapArr2;
                writableMapArr = writableMapArrA;
            } else {
                writableMapArr = writableMapArrA;
                writableMapArrA = new WritableMap[]{writableMapArrA[motionEventC.getActionIndex()].copy()};
            }
            if (writableMapArrA != null) {
                for (WritableMap writableMap2 : writableMapArrA) {
                    WritableMap writableMapCopy = writableMap2.copy();
                    WritableArray writableArrayB = b(true, writableMapArrA);
                    WritableArray writableArrayB2 = b(true, writableMapArr);
                    writableMapCopy.putArray("changedTouches", writableArrayB);
                    writableMapCopy.putArray("touches", writableArrayB2);
                    rCTModernEventEmitter.receiveEvent(qVar.getSurfaceId(), qVar.getViewTag(), qVar.getEventName(), qVar.canCoalesce(), 0, writableMapCopy, qVar.getEventCategory());
                }
            }
        } finally {
            P2.a.g(0L);
        }
    }

    static void d(RCTEventEmitter rCTEventEmitter, q qVar) {
        s sVarD = qVar.d();
        WritableArray writableArrayB = b(false, a(qVar));
        MotionEvent motionEventC = qVar.c();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (sVarD == s.f12585q || sVarD == s.f12586r) {
            for (int i7 = 0; i7 < motionEventC.getPointerCount(); i7++) {
                writableArrayCreateArray.pushInt(i7);
            }
        } else {
            if (sVarD != s.f12583o && sVarD != s.f12584p) {
                throw new RuntimeException("Unknown touch type: " + sVarD);
            }
            writableArrayCreateArray.pushInt(motionEventC.getActionIndex());
        }
        rCTEventEmitter.receiveTouches(s.h(sVarD), writableArrayB, writableArrayCreateArray);
    }
}

package com.facebook.react.bridge;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class ReactMarker {
    private static Queue<ReactMarkerRecord> sNativeReactMarkerQueue = new ConcurrentLinkedQueue();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7);

        default void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7, int i8) {
            logFabricMarker(reactMarkerConstants, str, i7, j7);
        }
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7);
    }

    private static class ReactMarkerRecord {
        private final String mMarkerName;
        private final long mMarkerTime;

        public ReactMarkerRecord(String str, long j7) {
            this.mMarkerName = str;
            this.mMarkerTime = j7;
        }

        public String getMarkerName() {
            return this.mMarkerName;
        }

        public long getMarkerTime() {
            return this.mMarkerTime;
        }
    }

    @R1.a
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    @R1.a
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    @R1.a
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @R1.a
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @R1.a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7) {
        logFabricMarker(reactMarkerConstants, str, i7, SystemClock.uptimeMillis(), 0);
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @R1.a
    private static native void nativeLogMarker(String str, long j7);

    @R1.a
    private static void notifyNativeMarker(ReactMarkerConstants reactMarkerConstants, Long l7) {
        if (!reactMarkerConstants.hasMatchingNameMarker()) {
            return;
        }
        if (l7 == null) {
            l7 = Long.valueOf(SystemClock.uptimeMillis());
        }
        if (!ReactBridge.isInitialized()) {
            sNativeReactMarkerQueue.add(new ReactMarkerRecord(reactMarkerConstants.name(), l7.longValue()));
            return;
        }
        nativeLogMarker(reactMarkerConstants.name(), l7.longValue());
        while (true) {
            ReactMarkerRecord reactMarkerRecordPoll = sNativeReactMarkerQueue.poll();
            if (reactMarkerRecordPoll == null) {
                return;
            } else {
                nativeLogMarker(reactMarkerRecordPoll.getMarkerName(), reactMarkerRecordPoll.getMarkerTime());
            }
        }
    }

    @R1.a
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @R1.a
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @R1.a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i7, j7, 0);
        }
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i7) {
        logMarker(reactMarkerConstants, (String) null, i7);
    }

    @R1.a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7, int i8) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i7, j7, i8);
        }
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, long j7) {
        logMarker(reactMarkerConstants, null, 0, Long.valueOf(j7));
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7) {
        logMarker(reactMarkerConstants, str, i7, null);
    }

    @R1.a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, Long l7) {
        logFabricMarker(reactMarkerConstants, str, i7);
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(reactMarkerConstants, str, i7);
        }
        notifyNativeMarker(reactMarkerConstants, l7);
    }

    @R1.a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @R1.a
    public static void logMarker(String str, int i7) {
        logMarker(str, (String) null, i7);
    }

    @R1.a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @R1.a
    public static void logMarker(String str, String str2, int i7) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i7);
    }
}

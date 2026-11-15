package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class Inspector {
    private final HybridData mHybridData;

    @R1.a
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @R1.a
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @R1.a
        private Page(int i7, String str, String str2) {
            this.mId = i7;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + "'}";
        }
    }

    @R1.a
    public interface RemoteConnection {
        @R1.a
        void onDisconnect();

        @R1.a
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i7, RemoteConnection remoteConnection) {
        try {
            LocalConnection localConnectionConnectNative = instance().connectNative(i7, remoteConnection);
            if (localConnectionConnectNative != null) {
                return localConnectionConnectNative;
            }
            throw new IllegalStateException("Can't open failed connection");
        } catch (UnsatisfiedLinkError e7) {
            P0.a.k("ReactNative", "Inspector doesn't work in open source yet", e7);
            throw new RuntimeException(e7);
        }
    }

    private native LocalConnection connectNative(int i7, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e7) {
            P0.a.k("ReactNative", "Inspector doesn't work in open source yet", e7);
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}

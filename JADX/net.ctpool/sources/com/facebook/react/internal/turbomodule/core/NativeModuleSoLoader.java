package com.facebook.react.internal.turbomodule.core;

import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class NativeModuleSoLoader {
    public static final Companion Companion = new Companion(null);
    private static boolean isSoLibraryLoaded;

    public static final class Companion {
        private Companion() {
        }

        public final synchronized void maybeLoadSoLibrary() {
            if (!NativeModuleSoLoader.isSoLibraryLoaded) {
                SoLoader.t("turbomodulejsijni");
                NativeModuleSoLoader.isSoLibraryLoaded = true;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final synchronized void maybeLoadSoLibrary() {
        Companion.maybeLoadSoLibrary();
    }
}

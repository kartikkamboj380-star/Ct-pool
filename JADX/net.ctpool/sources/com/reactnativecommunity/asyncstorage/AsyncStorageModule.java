package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import i2.InterfaceC1741a;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = AsyncStorageModule.NAME)
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final l executor;
    private k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f18174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f18173a = callback;
            this.f18174b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f18173a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i7 = 0; i7 < this.f18174b.size(); i7 += 999) {
                int iMin = Math.min(this.f18174b.size() - i7, 999);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.g().query("catalystLocalStorage", strArr, com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f18174b, i7, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f18174b.size()) {
                            for (int i8 = i7; i8 < i7 + iMin; i8++) {
                                hashSet.add(this.f18174b.getString(i8));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e7) {
                        P0.a.H("ReactNative", e7.getMessage(), e7);
                        this.f18173a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            this.f18173a.invoke(null, writableArrayCreateArray);
        }
    }

    class b extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f18177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f18176a = callback;
            this.f18177b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f18176a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.g().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().beginTransaction();
                    for (int i7 = 0; i7 < this.f18177b.size(); i7++) {
                        if (this.f18177b.getArray(i7).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e7) {
                                P0.a.H("ReactNative", e7.getMessage(), e7);
                                if (writableMapD == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f18177b.getArray(i7).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e8) {
                                P0.a.H("ReactNative", e8.getMessage(), e8);
                                if (writableMapC == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e8.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f18177b.getArray(i7).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e9) {
                                P0.a.H("ReactNative", e9.getMessage(), e9);
                                if (writableMapD2 == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e9.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, this.f18177b.getArray(i7).getString(0));
                        sQLiteStatementCompileStatement.bindString(2, this.f18177b.getArray(i7).getString(1));
                        sQLiteStatementCompileStatement.execute();
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                    } catch (Exception e10) {
                        P0.a.H("ReactNative", e10.getMessage(), e10);
                        com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                P0.a.H("ReactNative", e11.getMessage(), e11);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                } catch (Exception e12) {
                    P0.a.H("ReactNative", e12.getMessage(), e12);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                    }
                    Callback callback = this.f18176a;
                    if (writableMapB == null) {
                    }
                }
                writableMapB = writableMapB2;
            }
            Callback callback2 = this.f18176a;
            if (writableMapB == null) {
                callback2.invoke(writableMapB);
            } else {
                callback2.invoke(new Object[0]);
            }
        }
    }

    class c extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f18180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f18179a = callback;
            this.f18180b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f18179a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().beginTransaction();
                    for (int i7 = 0; i7 < this.f18180b.size(); i7 += 999) {
                        int iMin = Math.min(this.f18180b.size() - i7, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.g().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f18180b, i7, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                    } catch (Exception e7) {
                        P0.a.H("ReactNative", e7.getMessage(), e7);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                    }
                } catch (Exception e8) {
                    P0.a.H("ReactNative", e8.getMessage(), e8);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e8.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                    } catch (Exception e9) {
                        P0.a.H("ReactNative", e9.getMessage(), e9);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e9.getMessage());
                        }
                        Callback callback = this.f18179a;
                        if (writableMapB == null) {
                        }
                    }
                    writableMapB = writableMapB2;
                }
                Callback callback2 = this.f18179a;
                if (writableMapB == null) {
                    callback2.invoke(writableMapB);
                } else {
                    callback2.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                } catch (Exception e10) {
                    P0.a.H("ReactNative", e10.getMessage(), e10);
                    com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                }
                throw th;
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f18183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f18182a = callback;
            this.f18183b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str = null;
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f18182a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().beginTransaction();
                    for (int i7 = 0; i7 < this.f18183b.size(); i7++) {
                        if (this.f18183b.getArray(i7).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e7) {
                                P0.a.H("ReactNative", e7.getMessage(), e7);
                                if (writableMapD == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f18183b.getArray(i7).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e8) {
                                P0.a.H("ReactNative", e8.getMessage(), e8);
                                if (writableMapC == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e8.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f18183b.getArray(i7).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e9) {
                                P0.a.H("ReactNative", e9.getMessage(), e9);
                                if (writableMapD2 == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e9.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.g(), this.f18183b.getArray(i7).getString(0), this.f18183b.getArray(i7).getString(1))) {
                            WritableMap writableMapA = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                                return;
                            } catch (Exception e10) {
                                P0.a.H("ReactNative", e10.getMessage(), e10);
                                if (writableMapA == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().setTransactionSuccessful();
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                    } catch (Exception e11) {
                        P0.a.H("ReactNative", e11.getMessage(), e11);
                        com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                    }
                }
            } catch (Exception e12) {
                P0.a.H("ReactNative", e12.getMessage(), e12);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.g().endTransaction();
                } catch (Exception e13) {
                    P0.a.H("ReactNative", e13.getMessage(), e13);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                    }
                    Callback callback = this.f18182a;
                    if (writableMapB == null) {
                    }
                }
                writableMapB = writableMapB2;
            }
            Callback callback2 = this.f18182a;
            if (writableMapB == null) {
                callback2.invoke(writableMapB);
            } else {
                callback2.invoke(new Object[0]);
            }
        }
    }

    class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f18185a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.f()) {
                this.f18185a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f18185a.invoke(new Object[0]);
            } catch (Exception e7) {
                P0.a.H("ReactNative", e7.getMessage(), e7);
                this.f18185a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f18187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f18187a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f18187a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.g().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f18187a.invoke(null, writableArrayCreateArray);
                } catch (Exception e7) {
                    P0.a.H("ReactNative", e7.getMessage(), e7);
                    this.f18187a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.f();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.b();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.d();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        h.g(reactApplicationContext);
        this.executor = new l(executor);
        this.mReactDatabaseSupplier = k.j(reactApplicationContext);
    }
}

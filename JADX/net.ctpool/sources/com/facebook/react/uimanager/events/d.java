package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static int sUniqueID;
    private b mEventAnimationDriverMatchSpec;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    class a implements b {
        a() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i7, String str) {
            return i7 == d.this.getViewTag() && str.equals(d.this.getEventName());
        }
    }

    public interface b {
        boolean a(int i7, String str);
    }

    protected d() {
        int i7 = sUniqueID;
        sUniqueID = i7 + 1;
        this.mUniqueID = i7;
    }

    public boolean canCoalesce() {
        return true;
    }

    public d coalesce(d dVar) {
        return getTimestampMs() >= dVar.getTimestampMs() ? this : dVar;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (getSurfaceId() != -1) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    protected boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public b getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new a();
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    protected int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    @Deprecated
    protected void init(int i7) {
        init(-1, i7);
    }

    boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    protected d(int i7) {
        int i8 = sUniqueID;
        sUniqueID = i8 + 1;
        this.mUniqueID = i8;
        init(i7);
    }

    protected void init(int i7, int i8) {
        init(i7, i8, S1.k.c());
    }

    protected d(int i7, int i8) {
        int i9 = sUniqueID;
        sUniqueID = i9 + 1;
        this.mUniqueID = i9;
        init(i7, i8);
    }

    protected void init(int i7, int i8, long j7) {
        this.mSurfaceId = i7;
        this.mViewTag = i8;
        this.mTimestampMs = j7;
        this.mInitialized = true;
    }
}

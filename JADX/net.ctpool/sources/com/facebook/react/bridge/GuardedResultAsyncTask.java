package com.facebook.react.bridge;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final JSExceptionHandler mExceptionHandler;

    protected GuardedResultAsyncTask(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }

    protected abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e7) {
            this.mExceptionHandler.handleException(e7);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);

    protected GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e7) {
            this.mExceptionHandler.handleException(e7);
            throw e7;
        }
    }
}

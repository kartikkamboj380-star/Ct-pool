package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f14118b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f14119c = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JobScheduler f14120a;

    private A0(JobScheduler jobScheduler) {
        this.f14120a = jobScheduler;
    }

    private static int a() {
        Method method = f14119c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e7) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e7);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i7, String str2) {
        Method method = f14118b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f14120a, jobInfo, str, Integer.valueOf(i7), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e7) {
                Log.e(str2, "error calling scheduleAsPackage", e7);
            }
        }
        return this.f14120a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) U3.h.i((JobScheduler) context.getSystemService("jobscheduler"));
        return (f14118b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new A0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    private static Method e() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}

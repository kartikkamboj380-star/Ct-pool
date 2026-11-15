package app.notifee.core.model;

import S5.m;
import S5.o;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.core.app.AbstractC0559k;
import androidx.core.app.W;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.b;
import app.notifee.core.Logger;
import app.notifee.core.model.NotificationAndroidStyleModel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationAndroidStyleModel {
    private static final String TAG = "NotificationAndroidStyle";
    private Bundle mNotificationAndroidStyleBundle;

    private NotificationAndroidStyleModel(Bundle bundle) {
        this.mNotificationAndroidStyleBundle = bundle;
    }

    public static NotificationAndroidStyleModel fromBundle(Bundle bundle) {
        return new NotificationAndroidStyleModel(bundle);
    }

    private AbstractC2272l getBigPictureStyleTask(Executor executor) {
        return AbstractC2275o.d(executor, new Callable() { // from class: w0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22584a.lambda$getBigPictureStyleTask$1();
            }
        });
    }

    private AbstractC0559k.c getBigTextStyle() {
        AbstractC0559k.c cVar = new AbstractC0559k.c();
        if (this.mNotificationAndroidStyleBundle.containsKey("text")) {
            cVar = cVar.h(b.a(this.mNotificationAndroidStyleBundle.getString("text"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            cVar = cVar.i(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        return this.mNotificationAndroidStyleBundle.containsKey("summary") ? cVar.j(b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0)) : cVar;
    }

    private AbstractC0559k.f getInboxStyle() {
        AbstractC0559k.f fVar = new AbstractC0559k.f();
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            fVar = fVar.i(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("summary")) {
            fVar = fVar.j(b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0));
        }
        ArrayList<String> stringArrayList = this.mNotificationAndroidStyleBundle.getStringArrayList("lines");
        int i7 = 0;
        while (true) {
            Objects.requireNonNull(stringArrayList);
            if (i7 >= stringArrayList.size()) {
                return fVar;
            }
            fVar = fVar.h(b.a(stringArrayList.get(i7), 0));
            i7++;
        }
    }

    private AbstractC2272l getMessagingStyleTask(final Executor executor) {
        return AbstractC2275o.d(executor, new Callable() { // from class: w0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22586a.lambda$getMessagingStyleTask$2(executor);
            }
        });
    }

    private static AbstractC2272l getPerson(Executor executor, final Bundle bundle) {
        return AbstractC2275o.d(executor, new Callable() { // from class: w0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationAndroidStyleModel.lambda$getPerson$0(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0559k.h lambda$getBigPictureStyleTask$1() {
        String string;
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        Bitmap bitmap;
        AbstractC0559k.b bVar = new AbstractC0559k.b();
        Bitmap bitmap2 = null;
        if (this.mNotificationAndroidStyleBundle.containsKey("picture")) {
            String string2 = this.mNotificationAndroidStyleBundle.getString("picture");
            Objects.requireNonNull(string2);
            try {
                bitmap = (Bitmap) AbstractC2275o.b(o.c(string2), 10L, TimeUnit.SECONDS);
            } catch (TimeoutException e7) {
                e = e7;
                sb2 = new StringBuilder();
                str2 = "Timeout occurred whilst trying to retrieve a big picture style image: ";
                sb2.append(str2);
                sb2.append(string2);
                Logger.e(TAG, sb2.toString(), e);
                bitmap = null;
            } catch (Exception e8) {
                e = e8;
                sb2 = new StringBuilder();
                str2 = "An error occurred whilst trying to retrieve a big picture style image: ";
                sb2.append(str2);
                sb2.append(string2);
                Logger.e(TAG, sb2.toString(), e);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.i(bitmap);
            }
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("largeIcon")) {
            string = this.mNotificationAndroidStyleBundle.getString("largeIcon");
            if (string == null) {
                bVar.h(null);
            }
        } else {
            string = null;
        }
        if (string != null) {
            try {
                bitmap2 = (Bitmap) AbstractC2275o.b(o.c(string), 10L, TimeUnit.SECONDS);
            } catch (TimeoutException e9) {
                e = e9;
                sb = new StringBuilder();
                str = "Timeout occurred whilst trying to retrieve a big picture style large icon: ";
                sb.append(str);
                sb.append(string);
                Logger.e(TAG, sb.toString(), e);
            } catch (Exception e10) {
                e = e10;
                sb = new StringBuilder();
                str = "An error occurred whilst trying to retrieve a big picture style large icon: ";
                sb.append(str);
                sb.append(string);
                Logger.e(TAG, sb.toString(), e);
            }
            if (bitmap2 != null) {
                bVar.h(bitmap2);
            }
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            bVar = bVar.j(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        return this.mNotificationAndroidStyleBundle.containsKey("summary") ? bVar.k(b.a(this.mNotificationAndroidStyleBundle.getString("summary"), 0)) : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0559k.h lambda$getMessagingStyleTask$2(Executor executor) {
        W w6;
        Bundle bundle = this.mNotificationAndroidStyleBundle.getBundle("person");
        Objects.requireNonNull(bundle);
        AbstractC0559k.g gVar = new AbstractC0559k.g((W) AbstractC2275o.b(getPerson(executor, bundle), 20L, TimeUnit.SECONDS));
        if (this.mNotificationAndroidStyleBundle.containsKey("title")) {
            gVar = gVar.k(b.a(this.mNotificationAndroidStyleBundle.getString("title"), 0));
        }
        if (this.mNotificationAndroidStyleBundle.containsKey("group")) {
            gVar = gVar.l(this.mNotificationAndroidStyleBundle.getBoolean("group"));
        }
        ArrayList parcelableArrayList = this.mNotificationAndroidStyleBundle.getParcelableArrayList("messages");
        int i7 = 0;
        while (true) {
            Objects.requireNonNull(parcelableArrayList);
            if (i7 >= parcelableArrayList.size()) {
                return gVar;
            }
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i7);
            long jD = m.d(bundle2.get("timestamp"));
            if (bundle2.containsKey("person")) {
                Bundle bundle3 = bundle2.getBundle("person");
                Objects.requireNonNull(bundle3);
                w6 = (W) AbstractC2275o.b(getPerson(executor, bundle3), 20L, TimeUnit.SECONDS);
            } else {
                w6 = null;
            }
            gVar = gVar.i(b.a(bundle2.getString("text"), 0), jD, w6);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W lambda$getPerson$0(Bundle bundle) {
        StringBuilder sb;
        String str;
        Bitmap bitmap;
        W.b bVar = new W.b();
        bVar.f(bundle.getString("name"));
        if (bundle.containsKey("id")) {
            bVar.e(bundle.getString("id"));
        }
        if (bundle.containsKey("bot")) {
            bVar.b(bundle.getBoolean("bot"));
        }
        if (bundle.containsKey("important")) {
            bVar.d(bundle.getBoolean("important"));
        }
        if (bundle.containsKey("icon")) {
            String string = bundle.getString("icon");
            Objects.requireNonNull(string);
            try {
                bitmap = (Bitmap) AbstractC2275o.b(o.c(string), 10L, TimeUnit.SECONDS);
            } catch (TimeoutException e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Timeout occurred whilst trying to retrieve a person icon: ";
                sb.append(str);
                sb.append(string);
                Logger.e(TAG, sb.toString(), e);
                bitmap = null;
            } catch (Exception e8) {
                e = e8;
                sb = new StringBuilder();
                str = "An error occurred whilst trying to retrieve a person icon: ";
                sb.append(str);
                sb.append(string);
                Logger.e(TAG, sb.toString(), e);
                bitmap = null;
            }
            if (bitmap != null) {
                bVar.c(IconCompat.c(bitmap));
            }
        }
        if (bundle.containsKey("uri")) {
            bVar.g(bundle.getString("uri"));
        }
        return bVar.a();
    }

    public AbstractC2272l getStyleTask(Executor executor) {
        Object bigTextStyle;
        int iA = m.a(this.mNotificationAndroidStyleBundle.get("type"));
        if (iA == 0) {
            return getBigPictureStyleTask(executor);
        }
        if (iA == 1) {
            bigTextStyle = getBigTextStyle();
        } else {
            if (iA != 2) {
                if (iA != 3) {
                    return null;
                }
                return getMessagingStyleTask(executor);
            }
            bigTextStyle = getInboxStyle();
        }
        return AbstractC2275o.f(bigTextStyle);
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidStyleBundle.clone();
    }
}

.class public Lapp/notifee/core/ReceiverService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final m:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lapp/notifee/core/ReceiverService;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 4

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lapp/notifee/core/ReceiverService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p0, 0x0

    :goto_0
    array-length v2, p1

    if-ge p0, v2, :cond_1

    aget-object v2, p1, p0

    array-length v3, p2

    add-int/lit8 v3, v3, -0x1

    if-gt p0, v3, :cond_0

    aget-object v3, p2, p0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lapp/notifee/core/ReceiverService;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    const/high16 p1, 0xa000000

    invoke-static {v0, p0, v1, p1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LS5/g;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-static {p2}, LS5/i;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "ReceiverService"

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p1, "Failed to get launch activity"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, v2, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    if-eq p4, p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, p4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const-string p2, "mainComponent"

    .line 33
    .line 34
    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p4, p1, LS5/g;->a:Lapp/notifee/core/model/NotificationModel;

    .line 42
    .line 43
    invoke-virtual {p4}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    const/high16 v2, 0xa000000

    .line 52
    .line 53
    invoke-static {p2, p4, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :try_start_0
    invoke-virtual {p2}, Landroid/app/PendingIntent;->send()V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, LS5/f;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    if-eqz p3, :cond_3

    .line 64
    .line 65
    new-instance p2, LS5/j;

    .line 66
    .line 67
    invoke-direct {p2, p3}, LS5/j;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, LS5/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p2

    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string p4, "Failed to send PendingIntent from launchPendingIntentActivity for notification "

    .line 81
    .line 82
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object p1, p1, LS5/g;->a:Lapp/notifee/core/model/NotificationModel;

    .line 86
    .line 87
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {v0, p1, p2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, "notification"

    const-string v3, "pressAction"

    const/4 v4, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "app.notifee.core.ReceiverService.PRESS_INTENT"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v4, v1

    goto :goto_0

    :sswitch_1
    const-string v5, "app.notifee.core.ReceiverService.DELETE_INTENT"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move v4, p2

    goto :goto_0

    :sswitch_2
    const-string v5, "app.notifee.core.ReceiverService.ACTION_PRESS_INTENT"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v4, p3

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_4

    goto/16 :goto_2

    :cond_4
    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    invoke-direct {v0, p3}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_5

    invoke-static {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    move-result-object p1

    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {p3, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    new-instance v2, Lapp/notifee/core/event/NotificationEvent;

    invoke-direct {v2, p2, v0, p3}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    invoke-static {v2}, LS5/f;->a(Ljava/lang/Object;)V

    if-nez p1, :cond_6

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    move-result-object v2

    if-nez p2, :cond_7

    if-eqz v2, :cond_d

    :cond_7
    new-instance v3, LS5/g;

    invoke-direct {v3, v0, p3}, LS5/g;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    move-result p1

    invoke-virtual {p0, v3, p2, v2, p1}, Lapp/notifee/core/ReceiverService;->b(LS5/g;Ljava/lang/String;Ljava/lang/String;I)V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_8

    goto/16 :goto_2

    :cond_8
    new-instance p2, Lapp/notifee/core/model/NotificationModel;

    invoke-direct {p2, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    invoke-direct {p1, p3, p2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;)V

    invoke-static {p1}, LS5/f;->a(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p3

    if-eqz p2, :cond_d

    if-nez p3, :cond_9

    goto/16 :goto_2

    :cond_9
    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    invoke-direct {v0, p2}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    move-result-object p2

    invoke-static {p3}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    move-result-object p3

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {p1}, Landroidx/core/app/Y;->j(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_a

    const-string v3, "app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "input"

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    invoke-direct {p1, v1, v0, v2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    invoke-static {p1}, LS5/f;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    move-result-object p1

    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationAndroidModel;->getAutoCancel()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    move-result-object p1

    invoke-virtual {p2}, Lapp/notifee/core/model/NotificationAndroidModel;->getTag()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {p1, p2, v3}, Landroidx/core/app/T;->c(Ljava/lang/String;I)V

    :cond_b
    invoke-virtual {p3}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    move-result-object p2

    if-nez p1, :cond_c

    if-eqz p2, :cond_d

    :cond_c
    new-instance v3, LS5/g;

    invoke-direct {v3, v0, v2}, LS5/g;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    invoke-virtual {p3}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    move-result p3

    invoke-virtual {p0, v3, p1, p2, p3}, Lapp/notifee/core/ReceiverService;->b(LS5/g;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object p1, LS5/e;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-ge p1, p2, :cond_d

    sget-object p1, LS5/e;->a:Landroid/content/Context;

    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_d
    :goto_2
    return v1

    :sswitch_data_0
    .sparse-switch
        -0x7a2bfceb -> :sswitch_2
        -0x79412bdc -> :sswitch_1
        -0x74e48cbc -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public Lapp/notifee/core/BlockStateBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/concurrent/futures/c$a;IZLandroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lu0/c;

    invoke-direct {v0, p0}, Lu0/c;-><init>(Landroidx/concurrent/futures/c$a;)V

    new-instance p0, Lapp/notifee/core/event/BlockStateEvent;

    invoke-direct {p0, p1, p3, p2, v0}, Lapp/notifee/core/event/BlockStateEvent;-><init>(ILandroid/os/Bundle;ZLapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-static {p0}, LS5/f;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Landroidx/concurrent/futures/c$a;LS5/m$a;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string p1, "BlockState"

    .line 4
    .line 5
    const-string p3, "Failed getting channel or channel group bundle, received error: "

    .line 6
    .line 7
    invoke-static {p1, p3, p2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p1, p3}, LS5/m$a;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
.end method

.method public static synthetic c(Landroidx/concurrent/futures/c$a;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 1

    .line 1
    const-string p2, "BlockState"

    if-eqz p1, :cond_0

    const-string v0, "background work failed with error: "

    invoke-static {p2, v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const-string p1, "background work completed successfully"

    invoke-static {p2, p1}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static d(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V
    .locals 5

    .line 1
    const-string v0, "starting background work"

    const-string v1, "BlockState"

    invoke-static {v1, v0}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "blocked"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroidx/work/b;->i(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "type"

    const/4 v3, 0x4

    invoke-virtual {p0, v2, v3}, Landroidx/work/b;->k(Ljava/lang/String;I)I

    move-result v2

    new-instance v4, Lu0/a;

    invoke-direct {v4, p1, v2, v0}, Lu0/a;-><init>(Landroidx/concurrent/futures/c$a;IZ)V

    if-ne v2, v3, :cond_0

    const/4 p0, 0x0

    invoke-interface {v4, p0}, LS5/m$a;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lu0/b;

    invoke-direct {v0, p1, v4}, Lu0/b;-><init>(Landroidx/concurrent/futures/c$a;LS5/m$a;)V

    const-string v3, "channelOrGroupId"

    invoke-virtual {p0, v3}, Landroidx/work/b;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x5

    if-ne v2, v3, :cond_1

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Lapp/notifee/core/Notifee;->getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Lapp/notifee/core/Notifee;->getChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    goto :goto_0

    :cond_2
    const-string p0, "unknown block state work type"

    invoke-static {v1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const/4 v0, 0x0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    if-nez v2, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LS5/e;->a(Landroid/content/Context;)V

    :cond_2
    new-instance p1, Landroidx/work/b$a;

    invoke-direct {p1}, Landroidx/work/b$a;-><init>()V

    const-string v2, "workType"

    const-string v3, "app.notifee.core.BlockStateBroadcastReceiver.WORKER"

    invoke-virtual {p1, v2, v3}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    const-string v2, "."

    const-string v3, "channelOrGroupId"

    const-string v4, "type"

    const-string v5, "BlockState"

    const/4 v6, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v7, "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_1
    const-string v7, "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_2
    const-string v7, "android.app.action.APP_BLOCK_STATE_CHANGED"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_0

    :cond_5
    move v6, v0

    :goto_0
    packed-switch v6, :pswitch_data_0

    const-string p1, "unknown intent action received, ignoring."

    invoke-static {v5, p1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const/4 v6, 0x5

    invoke-virtual {p1, v4, v6}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    const-string v4, "android.app.extra.NOTIFICATION_CHANNEL_ID"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :pswitch_1
    const/4 v6, 0x6

    invoke-virtual {p1, v4, v6}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    const-string v4, "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :pswitch_2
    const/4 v2, 0x4

    invoke-virtual {p1, v4, v2}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    :goto_2
    const-string v2, "android.app.extra.BLOCKED_STATE"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    const-string v0, "blocked"

    invoke-virtual {p1, v0, p2}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    new-instance p2, Ll0/k$a;

    const-class v0, Lapp/notifee/core/Worker;

    invoke-direct {p2, v0}, Ll0/k$a;-><init>(Ljava/lang/Class;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {p2, v2, v3, v0}, Ll0/u$a;->j(JLjava/util/concurrent/TimeUnit;)Ll0/u$a;

    move-result-object p2

    check-cast p2, Ll0/k$a;

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll0/u$a;->k(Landroidx/work/b;)Ll0/u$a;

    move-result-object p1

    check-cast p1, Ll0/k$a;

    :try_start_0
    sget-object p2, LS5/e;->a:Landroid/content/Context;

    invoke-static {p2}, Ll0/t;->h(Landroid/content/Context;)Ll0/t;

    move-result-object p2

    sget-object v0, Ll0/d;->m:Ll0/d;

    invoke-virtual {p1}, Ll0/u$a;->b()Ll0/u;

    move-result-object p1

    check-cast p1, Ll0/k;

    invoke-virtual {p2, v1, v0, p1}, Ll0/t;->g(Ljava/lang/String;Ll0/d;Ll0/k;)Ll0/l;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    const-string p2, "Error while calling WorkManager.getInstance"

    invoke-static {v5, p2, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    sget-object p1, LS5/e;->a:Landroid/content/Context;

    if-nez p1, :cond_6

    const-string p1, "Application Context is null"

    invoke-static {v5, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "scheduled new background work with id "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lapp/notifee/core/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1af192ca -> :sswitch_2
        0x3012ffd0 -> :sswitch_1
        0x45daf6b0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

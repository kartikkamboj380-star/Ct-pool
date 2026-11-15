.class public Lapp/notifee/core/Notifee;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lapp/notifee/core/KeepForSdk;
.end annotation


# static fields
.field public static final REQUEST_CODE_NOTIFICATION_PERMISSION:I = 0x2b67
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation
.end field

.field public static b:Lapp/notifee/core/Notifee; = null

.field public static c:Z = false


# instance fields
.field public a:Lapp/notifee/core/interfaces/MethodCallResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Intent;)V
    .locals 1

    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic b(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic c(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic d(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic e(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic f(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic g(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static getInstance()Lapp/notifee/core/Notifee;
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    sget-boolean v0, Lapp/notifee/core/Notifee;->c:Z

    if-nez v0, :cond_0

    const-string v0, "API"

    const-string v1, "getInstance() accessed before event listener is initialized"

    invoke-static {v0, v1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lapp/notifee/core/Notifee;

    invoke-direct {v0}, Lapp/notifee/core/Notifee;-><init>()V

    sput-object v0, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    :cond_0
    sget-object v0, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    return-object v0
.end method

.method public static synthetic h(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "API"

    .line 17
    .line 18
    const-string v3, "createTriggerNotification"

    .line 19
    .line 20
    invoke-static {v2, v3, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public static synthetic i(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "API"

    .line 17
    .line 18
    const-string v3, "displayNotification"

    .line 19
    .line 20
    invoke-static {v2, v3, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public static initialize(Lapp/notifee/core/interfaces/EventListener;)V
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    const-class v0, Lapp/notifee/core/Notifee;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lapp/notifee/core/Notifee;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    sget-object v1, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    if-nez v1, :cond_1

    new-instance v1, Lapp/notifee/core/Notifee;

    invoke-direct {v1}, Lapp/notifee/core/Notifee;-><init>()V

    sput-object v1, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    :cond_1
    if-eqz p0, :cond_2

    invoke-static {p0}, Lapp/notifee/core/EventSubscriber;->register(Lapp/notifee/core/interfaces/EventListener;)V

    :cond_2
    const/4 p0, 0x1

    sput-boolean p0, Lapp/notifee/core/Notifee;->c:Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic j(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic k(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic l(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic m(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic n(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic o(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public static synthetic p(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-interface {p0, v1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method


# virtual methods
.method public cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/R0;->k(I)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/i;

    invoke-direct {v0, p2}, Lu0/i;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public cancelAllNotificationsWithIds(ILjava/util/List;Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lu0/R0;->l(ILjava/util/List;Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance p2, Lu0/k;

    invoke-direct {p2, p4}, Lu0/k;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, p2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public createChannel(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LS5/c;

    invoke-direct {v0, p1}, LS5/c;-><init>(Landroid/os/Bundle;)V

    invoke-static {v0}, Lu0/p0;->e(LS5/c;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/r;

    invoke-direct {v0, p2}, Lu0/r;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public createChannelGroup(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LS5/b;

    invoke-direct {v0, p1}, LS5/b;-><init>(Landroid/os/Bundle;)V

    invoke-static {v0}, Lu0/p0;->d(LS5/b;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/u;

    invoke-direct {v0, p2}, Lu0/u;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public createChannelGroups(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    new-instance v2, LS5/b;

    invoke-direct {v2, v1}, LS5/b;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lu0/p0;->g(Ljava/util/List;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/t;

    invoke-direct {v0, p2}, Lu0/t;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public createChannels(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    new-instance v2, LS5/c;

    invoke-direct {v2, v1}, LS5/c;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lu0/p0;->l(Ljava/util/List;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/v;

    invoke-direct {v0, p2}, Lu0/v;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public createTriggerNotification(Landroid/os/Bundle;Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    invoke-direct {v0, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    invoke-static {v0, p2}, Lu0/R0;->o(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance p2, Lu0/m;

    invoke-direct {p2, p3}, Lu0/m;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, p2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public deleteChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/core/app/T;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public deleteChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/core/app/T;->h(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public displayNotification(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    invoke-direct {v0, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lu0/R0;->x(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/q;

    invoke-direct {v0, p2}, Lu0/q;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/p0;->f(Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/o;

    invoke-direct {v0, p2}, Lu0/o;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/p0;->k(Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/g;

    invoke-direct {v0, p2}, Lu0/g;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getChannelGroups(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {}, Lu0/p0;->c()Lz3/l;

    move-result-object v0

    new-instance v1, Lu0/h;

    invoke-direct {v1, p1}, Lu0/h;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getChannels(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {}, Lu0/p0;->j()Lz3/l;

    move-result-object v0

    new-instance v1, Lu0/p;

    invoke-direct {v1, p1}, Lu0/p;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getDisplayedNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {}, Lu0/R0;->j()Lz3/l;

    move-result-object v0

    new-instance v1, Lu0/n;

    invoke-direct {v1, p1}, Lu0/n;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public getInitialNotification(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 4
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LS5/f;->b:LS5/f;

    iget-object v0, v0, LS5/f;->a:Ll6/c;

    const-class v1, LS5/g;

    invoke-virtual {v0, v1}, Ll6/c;->q(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS5/g;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const/4 v2, 0x0

    const-string v3, "notification"

    if-eqz v0, :cond_0

    iget-object p1, v0, LS5/g;->b:Landroid/os/Bundle;

    invoke-virtual {v1, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object p1, v0, LS5/g;->a:Lapp/notifee/core/model/NotificationModel;

    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {p2, v2, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {p2, v2, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "API"

    const-string v1, "getInitialNotification"

    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    invoke-interface {p2, v2, v2}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public getMainComponent(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    sget-object v0, LS5/f;->b:LS5/f;

    iget-object v0, v0, LS5/f;->a:Ll6/c;

    const-class v1, LS5/j;

    invoke-virtual {v0, v1}, Ll6/c;->q(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS5/j;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, v0, LS5/j;->a:Ljava/lang/String;

    return-object p1
.end method

.method public getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 6
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/T;->a()Z

    move-result v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const/4 v2, 0x0

    const-string v3, "authorizationStatus"

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v0, v3, :cond_1

    invoke-static {}, LS5/a;->a()Landroid/app/AlarmManager;

    move-result-object v0

    invoke-static {v0}, Lu0/f;->a(Landroid/app/AlarmManager;)Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v5, "alarm"

    if-eqz v0, :cond_2

    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    const-string v0, "android"

    invoke-virtual {v1, v0, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public getPowerManagerInfo(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 6
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    invoke-static {v0}, LS5/n;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, LS5/i;->b(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "manufacturer"

    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "model"

    invoke-virtual {v4, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "version"

    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "activity"

    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0, v4}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public getTriggerNotificationIds(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/R0;->r(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getTriggerNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/R0;->y(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public isBatteryOptimizationEnabled(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public isChannelBlocked(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/p0;->o(Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/s;

    invoke-direct {v0, p2}, Lu0/s;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public isChannelCreated(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lu0/p0;->r(Ljava/lang/String;)Lz3/l;

    move-result-object p1

    new-instance v0, Lu0/l;

    invoke-direct {v0, p2}, Lu0/l;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 0
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    const/16 p2, 0x2b67

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lapp/notifee/core/Notifee;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lapp/notifee/core/Notifee;->getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public openAlarmPermissionSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 4
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, LS5/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-static {p1, v0}, LS5/i;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "AlarmUtils"

    const-string v1, "An error occurred whilst trying to open alarm permission settings"

    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    const/4 p1, 0x0

    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public openBatteryOptimizationSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "PowerManagerUtils"

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    if-eqz p1, :cond_1

    sget-object v2, LS5/e;->a:Landroid/content/Context;

    invoke-static {v2, v1}, LS5/i;->d(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string p1, "battery optimization settings is not available on device"

    invoke-static {v0, p1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, LS5/i;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    const-string v1, "An error occurred whilst trying to open battery optimization settings"

    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    const/4 p1, 0x0

    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public openNotificationSettings(Ljava/lang/String;Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_2

    new-instance v0, Landroid/content/Intent;

    if-eqz p1, :cond_1

    const-string v2, "android.settings.CHANNEL_NOTIFICATION_SETTINGS"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.provider.extra.CHANNEL_ID"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const-string p1, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "android.provider.extra.APP_PACKAGE"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string p1, "android.settings.APPLICATION_SETTINGS"

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_1
    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    new-instance p1, Lu0/j;

    invoke-direct {p1, v0}, Lu0/j;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_2
    invoke-interface {p3, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_3
    const-string p1, "openNotificationSettings"

    const-string p2, "attempted to start activity but no current activity or context was available."

    invoke-static {p1, p2}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method

.method public openPowerManagerSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-class v0, LS5/n;

    monitor-enter v0

    :try_start_0
    sget-object v1, LS5/n;->a:Landroid/content/Intent;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    sget-object v0, LS5/e;->a:Landroid/content/Context;

    invoke-static {v0}, LS5/n;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    const/high16 v0, 0x10000000

    :try_start_1
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-static {p1, v1}, LS5/i;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to start activity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LS5/i;->b(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PowerManagerUtils"

    invoke-static {v1, v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    const-string p1, "PowerManagerUtils"

    const-string v0, "Unable to find an activity to open the device\'s power manager"

    invoke-static {p1, v0}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public setRequestPermissionCallback(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lapp/notifee/core/Notifee;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    return-void
.end method

.method public stopForegroundService(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation build Lapp/notifee/core/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lapp/notifee/core/ForegroundService;->m:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    sget-object v1, LS5/e;->a:Landroid/content/Context;

    const-class v2, Lapp/notifee/core/ForegroundService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "app.notifee.core.ForegroundService.STOP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :try_start_0
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ForegroundService"

    const-string v2, "Unable to stop foreground service"

    invoke-static {v1, v2, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    :goto_0
    const/4 v0, 0x0

    invoke-interface {p1, v0, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

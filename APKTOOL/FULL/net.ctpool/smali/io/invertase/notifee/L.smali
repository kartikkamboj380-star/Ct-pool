.class abstract Lio/invertase/notifee/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/invertase/notifee/L$c;
    }
.end annotation


# static fields
.field private static final a:Landroid/util/SparseArray;

.field private static final b:Lh2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lio/invertase/notifee/L;->a:Landroid/util/SparseArray;

    new-instance v0, Lio/invertase/notifee/L$a;

    invoke-direct {v0}, Lio/invertase/notifee/L$a;-><init>()V

    sput-object v0, Lio/invertase/notifee/L;->b:Lh2/d;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lio/invertase/notifee/L;->j(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V

    return-void
.end method

.method public static synthetic b(Lh2/c;Lio/invertase/notifee/L$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/notifee/L;->i(Lh2/c;Lio/invertase/notifee/L$c;)V

    return-void
.end method

.method static bridge synthetic c()Landroid/util/SparseArray;
    .locals 1

    .line 1
    sget-object v0, Lio/invertase/notifee/L;->a:Landroid/util/SparseArray;

    return-object v0
.end method

.method static d()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lio/invertase/notifee/L;->a:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/invertase/notifee/L$c;

    invoke-interface {v2}, Lio/invertase/notifee/L$c;->call()V

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static e()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    invoke-static {}, Lapp/notifee/core/EventSubscriber;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/w;

    invoke-interface {v0}, Lcom/facebook/react/w;->a()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    return-object v0
.end method

.method static f()V
    .locals 4

    .line 1
    invoke-static {}, Lapp/notifee/core/EventSubscriber;->getContext()Landroid/content/Context;

    move-result-object v0

    :try_start_0
    const-string v1, "statusbar"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "android.app.StatusBarManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "collapsePanels"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "HIDE_NOTIF_DRAWER"

    const-string v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private static g(Lio/invertase/notifee/L$c;)V
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/EventSubscriber;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/w;

    invoke-interface {v0}, Lcom/facebook/react/w;->a()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/L$b;

    invoke-direct {v1, v0, p0}, Lio/invertase/notifee/L$b;-><init>(Lcom/facebook/react/H;Lio/invertase/notifee/L$c;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->q(Lcom/facebook/react/z;)V

    invoke-virtual {v0}, Lcom/facebook/react/H;->J()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/H;->x()V

    :cond_0
    return-void
.end method

.method static h()Z
    .locals 2

    .line 1
    invoke-static {}, Landroidx/lifecycle/t;->i()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/l;->getLifecycle()Landroidx/lifecycle/h;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$c;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/h$c;->q:Landroidx/lifecycle/h$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h$c;->e(Landroidx/lifecycle/h$c;)Z

    move-result v0

    return v0
.end method

.method private static synthetic i(Lh2/c;Lio/invertase/notifee/L$c;)V
    .locals 2

    .line 1
    sget-object v0, Lio/invertase/notifee/L;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lio/invertase/notifee/L;->b:Lh2/d;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lh2/c;->j(Lh2/d;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lio/invertase/notifee/L$c;->call()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method private static synthetic j(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V
    .locals 8

    .line 1
    invoke-static {}, Lio/invertase/notifee/L;->e()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object v0

    new-instance v7, Lh2/a;

    const/4 v6, 0x1

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lh2/a;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V

    sget-object p0, Lio/invertase/notifee/L;->a:Landroid/util/SparseArray;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lio/invertase/notifee/L;->b:Lh2/d;

    invoke-virtual {v0, p1}, Lh2/c;->d(Lh2/d;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v7}, Lh2/c;->n(Lh2/a;)I

    move-result p1

    new-instance p2, Lio/invertase/notifee/K;

    invoke-direct {p2, v0, p4}, Lio/invertase/notifee/K;-><init>(Lh2/c;Lio/invertase/notifee/L$c;)V

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method static k(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    :goto_0
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method static n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method static o(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method static p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lio/invertase/notifee/L;->e()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveCatalystInstance()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    invoke-interface {v0, p0, p1}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :goto_1
    const-string p1, "SEND_EVENT"

    const-string v0, ""

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method

.method static q(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V
    .locals 7

    .line 1
    new-instance v6, Lio/invertase/notifee/J;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lio/invertase/notifee/J;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V

    invoke-static {}, Lio/invertase/notifee/L;->e()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {v6}, Lio/invertase/notifee/L;->g(Lio/invertase/notifee/L$c;)V

    goto :goto_0

    :cond_0
    invoke-interface {v6}, Lio/invertase/notifee/L$c;->call()V

    :goto_0
    return-void
.end method

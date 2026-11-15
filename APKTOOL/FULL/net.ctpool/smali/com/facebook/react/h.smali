.class public abstract Lcom/facebook/react/h;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lh2/d;


# static fields
.field private static n:Landroid/os/PowerManager$WakeLock;


# instance fields
.field private final m:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/h;->m:Ljava/util/Set;

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/react/h;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/h;->m:Ljava/util/Set;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/h;Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/h;->h(Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/h;->n:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/PowerManager;

    invoke-static {p0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/PowerManager;

    const-class v0, Lcom/facebook/react/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p0

    sput-object p0, Lcom/facebook/react/h;->n:Landroid/os/PowerManager$WakeLock;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    sget-object p0, Lcom/facebook/react/h;->n:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {p0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_1
    return-void
.end method

.method private h(Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Lh2/c;->d(Lh2/d;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/h$b;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/h$b;-><init>(Lcom/facebook/react/h;Lh2/c;Lh2/a;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/h;->m:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/facebook/react/h;->m:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method protected f()Lcom/facebook/react/L;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/w;

    invoke-interface {v0}, Lcom/facebook/react/w;->a()Lcom/facebook/react/L;

    move-result-object v0

    return-object v0
.end method

.method protected abstract g(Landroid/content/Intent;)Lh2/a;
.end method

.method protected i(Lh2/a;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/facebook/react/h;->e(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/h;->f()Lcom/facebook/react/L;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lcom/facebook/react/h$a;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/react/h$a;-><init>(Lcom/facebook/react/h;Lh2/a;Lcom/facebook/react/H;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->q(Lcom/facebook/react/z;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/facebook/react/H;->x()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/h;->h(Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-virtual {p0}, Lcom/facebook/react/h;->f()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/h;->f()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/H;->C()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lh2/c;->j(Lh2/d;)V

    :cond_0
    sget-object v0, Lcom/facebook/react/h;->n:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_1
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/react/h;->g(Landroid/content/Intent;)Lh2/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/react/h;->i(Lh2/a;)V

    const/4 p1, 0x3

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

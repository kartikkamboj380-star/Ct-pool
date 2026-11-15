.class final LQ3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:LQ3/A;


# direct methods
.method synthetic constructor <init>(LQ3/A;LQ3/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/z;->a:LQ3/A;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/z;->a:LQ3/A;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/A;->f(LQ3/A;)LQ3/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LQ3/z;->a:LQ3/A;

    .line 17
    .line 18
    new-instance v0, LQ3/w;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2}, LQ3/w;-><init>(LQ3/z;Landroid/os/IBinder;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LQ3/A;->c()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/z;->a:LQ3/A;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/A;->f(LQ3/A;)LQ3/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LQ3/z;->a:LQ3/A;

    .line 17
    .line 18
    new-instance v0, LQ3/x;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LQ3/x;-><init>(LQ3/z;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LQ3/A;->c()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

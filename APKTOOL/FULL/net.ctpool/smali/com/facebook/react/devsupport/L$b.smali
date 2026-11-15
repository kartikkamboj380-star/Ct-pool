.class Lcom/facebook/react/devsupport/L$b;
.super LT5/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:LT5/z;

.field private c:LT5/H;

.field private final d:Landroid/os/Handler;

.field private e:Z

.field private f:Z

.field final synthetic g:Lcom/facebook/react/devsupport/L;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b;->g:Lcom/facebook/react/devsupport/L;

    invoke-direct {p0}, LT5/I;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/devsupport/L$b;->a:Ljava/lang/String;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b;->d:Landroid/os/Handler;

    return-void
.end method

.method static bridge synthetic g(Lcom/facebook/react/devsupport/L$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    return p0
.end method

.method private h(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error occurred, shutting down websocket connection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InspectorPackagerConnection"

    invoke-static {v0, p1, p2}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/L$b;->g:Lcom/facebook/react/devsupport/L;

    invoke-virtual {p1}, Lcom/facebook/react/devsupport/L;->e()V

    invoke-direct {p0}, Lcom/facebook/react/devsupport/L$b;->j()V

    return-void
.end method

.method private j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v1, "End of session"

    const/16 v2, 0x3e8

    invoke-interface {v0, v2, v1}, LT5/H;->f(ILjava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    :cond_0
    return-void
.end method

.method private l()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/L$b;->f:Z

    if-nez v0, :cond_0

    const-string v0, "InspectorPackagerConnection"

    const-string v1, "Couldn\'t connect to packager, will silently retry"

    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/L$b;->f:Z

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b;->d:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/react/devsupport/L$b$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/L$b$a;-><init>(Lcom/facebook/react/devsupport/L$b;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t reconnect closed client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(LT5/H;ILjava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/facebook/react/devsupport/L$b;->g:Lcom/facebook/react/devsupport/L;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/L;->e()V

    .line 7
    .line 8
    .line 9
    iget-boolean p1, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/facebook/react/devsupport/L$b;->l()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public c(LT5/H;Ljava/lang/Throwable;LT5/D;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string p1, "Websocket exception"

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/L$b;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean p1, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/devsupport/L$b;->l()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public e(LT5/H;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/L$b;->g:Lcom/facebook/react/devsupport/L;

    .line 2
    .line 3
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/facebook/react/devsupport/L;->i(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    new-instance p2, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p2
.end method

.method public f(LT5/H;LT5/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    .line 2
    .line 3
    return-void
.end method

.method public i()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v1, "End of session"

    const/16 v2, 0x3e8

    invoke-interface {v0, v2, v1}, LT5/H;->f(ILjava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    :cond_0
    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/L$b;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b;->b:LT5/z;

    if-nez v0, :cond_0

    new-instance v0, LT5/z$a;

    invoke-direct {v0}, LT5/z$a;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, LT5/z$a;->e(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, LT5/z$a;->N(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, LT5/z$a;->M(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/z$a;->b()LT5/z;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/devsupport/L$b;->b:LT5/z;

    :cond_0
    new-instance v0, LT5/B$a;

    invoke-direct {v0}, LT5/B$a;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/devsupport/L$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/L$b;->b:LT5/z;

    invoke-virtual {v1, v0, p0}, LT5/z;->C(LT5/B;LT5/I;)LT5/H;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t connect closed client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/L$b$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/L$b$b;-><init>(Lcom/facebook/react/devsupport/L$b;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/L$b;->c:LT5/H;

    const/4 v1, 0x1

    new-array v1, v1, [LT5/H;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

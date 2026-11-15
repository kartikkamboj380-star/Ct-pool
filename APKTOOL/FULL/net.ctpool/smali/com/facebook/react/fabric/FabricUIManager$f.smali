.class Lcom/facebook/react/fabric/FabricUIManager$f;
.super Lcom/facebook/react/fabric/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/fabric/FabricUIManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private volatile b:Z

.field final synthetic c:Lcom/facebook/react/fabric/FabricUIManager;


# direct methods
.method private constructor <init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-direct {p0, p2}, Lcom/facebook/react/fabric/i;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/fabric/f;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/fabric/FabricUIManager$f;-><init>(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->c(Lcom/facebook/react/fabric/FabricUIManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->e(Lcom/facebook/react/fabric/FabricUIManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->b(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->b(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/fabric/a;->driveCxxAnimations()V

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->g(Lcom/facebook/react/fabric/FabricUIManager;)La2/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La2/b;->f(J)V

    iget-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {p1}, Lcom/facebook/react/fabric/FabricUIManager;->g(Lcom/facebook/react/fabric/FabricUIManager;)La2/b;

    move-result-object p1

    invoke-virtual {p1}, La2/b;->p()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object p1

    sget-object p2, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->d(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/FabricUIManager$f;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    iget-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {p1}, Lcom/facebook/react/fabric/FabricUIManager;->j(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    sget-object p2, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    const-string v0, "Exception thrown when executing UIFrameGuarded"

    invoke-static {p2, v0, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/facebook/react/fabric/FabricUIManager$f;->b()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object p2

    sget-object v0, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->c:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v1}, Lcom/facebook/react/fabric/FabricUIManager;->d(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/FabricUIManager$f;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    throw p1

    :cond_2
    :goto_1
    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    const-string p2, "Not flushing pending UI operations because of previously thrown Exception"

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/fabric/FabricUIManager$f;->b:Z

    return-void
.end method

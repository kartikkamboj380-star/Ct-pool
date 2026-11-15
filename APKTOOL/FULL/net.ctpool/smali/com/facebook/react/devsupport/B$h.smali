.class Lcom/facebook/react/devsupport/B$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/g$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/devsupport/B$h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B$h;->k()V

    return-void
.end method

.method public static synthetic h(Lcom/facebook/react/devsupport/B$h;Lt2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/B$h;->j(Lt2/h;)V

    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/devsupport/B$h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/B$h;->l()V

    return-void
.end method

.method private synthetic j(Lt2/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/B;->f0(Lcom/facebook/react/devsupport/B;Lt2/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/B;->C()V

    return-void
.end method

.method private synthetic l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    invoke-interface {v0}, LX1/e;->q()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/B;->e0(Lcom/facebook/react/devsupport/B;Z)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/E;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/E;-><init>(Lcom/facebook/react/devsupport/B$h;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(Lt2/h;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/C;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/C;-><init>(Lcom/facebook/react/devsupport/B$h;Lt2/h;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->b0(Lcom/facebook/react/devsupport/B;)Lcom/facebook/react/devsupport/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->n()V

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/D;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/D;-><init>(Lcom/facebook/react/devsupport/B$h;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/B;->e0(Lcom/facebook/react/devsupport/B;Z)V

    return-void
.end method

.method public f()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$h;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Z(Lcom/facebook/react/devsupport/B;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

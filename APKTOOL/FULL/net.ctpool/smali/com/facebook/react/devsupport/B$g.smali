.class Lcom/facebook/react/devsupport/B$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->L0(Ljava/lang/String;LX1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/a$c;

.field final synthetic b:LX1/a;

.field final synthetic c:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;Lcom/facebook/react/devsupport/a$c;LX1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/B$g;->a:Lcom/facebook/react/devsupport/a$c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/B$g;->b:LX1/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/B;->r0()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    invoke-interface {v0}, LX1/b;->a()V

    :cond_0
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->DOWNLOAD_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v1, p0, Lcom/facebook/react/devsupport/B$g;->a:Lcom/facebook/react/devsupport/a$c;

    invoke-virtual {v1}, Lcom/facebook/react/devsupport/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->b:LX1/a;

    invoke-interface {v0}, LX1/a;->a()V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/B;->r0()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    invoke-interface {v0, p1}, LX1/b;->c(Ljava/lang/Exception;)V

    :cond_0
    const-string v0, "ReactNative"

    const-string v1, "Unable to download JS bundle"

    invoke-static {v0, v1, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/B;->g0(Lcom/facebook/react/devsupport/B;Ljava/lang/Exception;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->b:LX1/a;

    invoke-interface {v0, p1}, LX1/a;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->a0(Lcom/facebook/react/devsupport/B;)LX1/c;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LX1/c;->b(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$g;->c:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->Y(Lcom/facebook/react/devsupport/B;)LX1/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LX1/b;->d(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

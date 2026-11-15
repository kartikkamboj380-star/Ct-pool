.class Lcom/facebook/react/runtime/ReactHostImpl$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactHostImpl;->s1()Lu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/react/devsupport/B;

.field final synthetic c:Lu2/g;

.field final synthetic d:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/devsupport/B;Lu2/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->d:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->b:Lcom/facebook/react/devsupport/B;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->c:Lu2/g;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->d:Lcom/facebook/react/runtime/ReactHostImpl;

    const-string v1, "loadJSBundleFromMetro()"

    const-string v2, "Creating BundleLoader"

    invoke-static {v0, v1, v2}, Lcom/facebook/react/runtime/ReactHostImpl;->W(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->b:Lcom/facebook/react/devsupport/B;

    invoke-virtual {v1}, Lcom/facebook/react/devsupport/B;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/JSBundleLoader;->createCachedBundleFromNetworkLoader(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->c:Lu2/g;

    invoke-virtual {v1, v0}, Lu2/g;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$c;->c:Lu2/g;

    invoke-virtual {v0, p1}, Lu2/g;->c(Ljava/lang/Exception;)V

    return-void
.end method

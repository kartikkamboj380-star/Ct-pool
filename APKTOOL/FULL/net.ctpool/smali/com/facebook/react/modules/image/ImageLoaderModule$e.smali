.class public final Lcom/facebook/react/modules/image/ImageLoaderModule$e;
.super Lcom/facebook/react/bridge/GuardedAsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/image/ImageLoaderModule;->queryCache(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/modules/image/ImageLoaderModule;

.field final synthetic b:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic c:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/image/ImageLoaderModule;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a:Lcom/facebook/react/modules/image/ImageLoaderModule;

    iput-object p2, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->b:Lcom/facebook/react/bridge/ReadableArray;

    iput-object p3, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->c:Lcom/facebook/react/bridge/Promise;

    invoke-direct {p0, p4}, Lcom/facebook/react/bridge/GuardedAsyncTask;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)V
    .locals 6

    .line 1
    const-string v0, "params"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "createMap(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a:Lcom/facebook/react/modules/image/ImageLoaderModule;

    invoke-static {v0}, Lcom/facebook/react/modules/image/ImageLoaderModule;->access$getImagePipeline(Lcom/facebook/react/modules/image/ImageLoaderModule;)Ly1/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    iget-object v3, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v0, v4}, Ly1/k;->q(Landroid/net/Uri;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v4, "memory"

    :goto_1
    invoke-interface {p1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-virtual {v0, v4}, Ly1/k;->s(Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "disk"

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->c:Lcom/facebook/react/bridge/Promise;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic doInBackgroundGuarded([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a([Ljava/lang/Void;)V

    return-void
.end method

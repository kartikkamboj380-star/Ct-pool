.class Lcom/facebook/react/devsupport/g$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/g;->A(Ljava/lang/String;Lcom/facebook/react/devsupport/g$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/g$h;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/facebook/react/devsupport/g;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/g;Lcom/facebook/react/devsupport/g$h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/g$a;->c:Lcom/facebook/react/devsupport/g;

    iput-object p2, p0, Lcom/facebook/react/devsupport/g$a;->a:Lcom/facebook/react/devsupport/g$h;

    iput-object p3, p0, Lcom/facebook/react/devsupport/g$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Lcom/facebook/react/devsupport/g$a$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$a$a;-><init>(Lcom/facebook/react/devsupport/g$a;)V

    const-string v1, "reload"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/facebook/react/devsupport/g$a$b;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$a$b;-><init>(Lcom/facebook/react/devsupport/g$a;)V

    const-string v1, "devMenu"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/facebook/react/devsupport/g$a$c;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$a$c;-><init>(Lcom/facebook/react/devsupport/g$a;)V

    const-string v1, "captureHeap"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/devsupport/g$a;->a:Lcom/facebook/react/devsupport/g$h;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/g$h;->f()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    new-instance v0, Lt2/a;

    invoke-direct {v0}, Lt2/a;-><init>()V

    invoke-virtual {v0}, Lt2/a;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    new-instance v0, Lcom/facebook/react/devsupport/g$a$d;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$a$d;-><init>(Lcom/facebook/react/devsupport/g$a;)V

    iget-object v1, p0, Lcom/facebook/react/devsupport/g$a;->c:Lcom/facebook/react/devsupport/g;

    new-instance v2, Lt2/b;

    iget-object v3, p0, Lcom/facebook/react/devsupport/g$a;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/react/devsupport/g$a;->c:Lcom/facebook/react/devsupport/g;

    invoke-static {v4}, Lcom/facebook/react/devsupport/g;->d(Lcom/facebook/react/devsupport/g;)Lt2/d;

    move-result-object v4

    invoke-direct {v2, v3, v4, p1, v0}, Lt2/b;-><init>(Ljava/lang/String;Lt2/d;Ljava/util/Map;Lt2/e$b;)V

    invoke-static {v1, v2}, Lcom/facebook/react/devsupport/g;->f(Lcom/facebook/react/devsupport/g;Lt2/b;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/g$a;->c:Lcom/facebook/react/devsupport/g;

    invoke-static {p1}, Lcom/facebook/react/devsupport/g;->c(Lcom/facebook/react/devsupport/g;)Lt2/b;

    move-result-object p1

    invoke-virtual {p1}, Lt2/b;->f()V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/g$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

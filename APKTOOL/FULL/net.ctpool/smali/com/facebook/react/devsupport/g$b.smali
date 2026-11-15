.class Lcom/facebook/react/devsupport/g$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/g;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/g;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/g$b;->a:Lcom/facebook/react/devsupport/g;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/g$b;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {p1}, Lcom/facebook/react/devsupport/g;->c(Lcom/facebook/react/devsupport/g;)Lt2/b;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/g$b;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {p1}, Lcom/facebook/react/devsupport/g;->c(Lcom/facebook/react/devsupport/g;)Lt2/b;

    move-result-object p1

    invoke-virtual {p1}, Lt2/b;->e()V

    iget-object p1, p0, Lcom/facebook/react/devsupport/g$b;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/g;->f(Lcom/facebook/react/devsupport/g;Lt2/b;)V

    :cond_0
    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/g$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

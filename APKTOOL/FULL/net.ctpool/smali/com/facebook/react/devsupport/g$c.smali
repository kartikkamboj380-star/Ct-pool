.class Lcom/facebook/react/devsupport/g$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/g;->z()V
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

    iput-object p1, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    new-instance v0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {v1}, Lcom/facebook/react/devsupport/g;->g(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {v2}, Lcom/facebook/react/devsupport/g;->b(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/g;->e(Lcom/facebook/react/devsupport/g;Lcom/facebook/react/devsupport/K;)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    new-instance v0, Lcom/facebook/react/devsupport/L;

    invoke-static {p1}, Lcom/facebook/react/devsupport/g;->g(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {v2}, Lcom/facebook/react/devsupport/g;->b(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/devsupport/L;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/facebook/react/devsupport/g$c;->a:Lcom/facebook/react/devsupport/g;

    invoke-static {p1}, Lcom/facebook/react/devsupport/g;->a(Lcom/facebook/react/devsupport/g;)Lcom/facebook/react/devsupport/K;

    move-result-object p1

    invoke-interface {p1}, Lcom/facebook/react/devsupport/K;->connect()V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/g$c;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

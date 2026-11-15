.class public final synthetic Lcom/facebook/react/devsupport/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B$h;

.field public final synthetic n:Lt2/h;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B$h;Lt2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/C;->m:Lcom/facebook/react/devsupport/B$h;

    iput-object p2, p0, Lcom/facebook/react/devsupport/C;->n:Lt2/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/C;->m:Lcom/facebook/react/devsupport/B$h;

    iget-object v1, p0, Lcom/facebook/react/devsupport/C;->n:Lt2/h;

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/B$h;->h(Lcom/facebook/react/devsupport/B$h;Lt2/h;)V

    return-void
.end method

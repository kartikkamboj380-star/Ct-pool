.class public final Lcom/facebook/react/devsupport/Z;
.super Lcom/facebook/react/devsupport/f0;
.source "SourceFile"


# instance fields
.field private final b:Lcom/facebook/react/devsupport/g;

.field private final c:Ln2/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Lcom/facebook/react/devsupport/f0;-><init>()V

    new-instance v0, Lcom/facebook/react/devsupport/f;

    new-instance v1, Lcom/facebook/react/devsupport/Z$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/Z$a;-><init>(Lcom/facebook/react/devsupport/Z;)V

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/devsupport/f;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/f$b;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/Z;->c:Ln2/a;

    new-instance v1, Lcom/facebook/react/devsupport/g;

    invoke-interface {v0}, Ln2/a;->j()Lt2/d;

    move-result-object v2

    invoke-direct {v1, v0, p1, v2}, Lcom/facebook/react/devsupport/g;-><init>(Ln2/a;Landroid/content/Context;Lt2/d;)V

    iput-object v1, p0, Lcom/facebook/react/devsupport/Z;->b:Lcom/facebook/react/devsupport/g;

    return-void
.end method


# virtual methods
.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Z;->b:Lcom/facebook/react/devsupport/g;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->h()V

    return-void
.end method

.method public w()Ln2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Z;->c:Ln2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Z;->b:Lcom/facebook/react/devsupport/g;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/g;->z()V

    return-void
.end method

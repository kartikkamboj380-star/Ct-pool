.class public final synthetic Lcom/swmansion/rnscreens/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Z

.field public final synthetic n:Landroidx/core/view/v0;


# direct methods
.method public synthetic constructor <init>(ZLandroidx/core/view/v0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/z;->m:Z

    iput-object p2, p0, Lcom/swmansion/rnscreens/z;->n:Landroidx/core/view/v0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/z;->m:Z

    iget-object v1, p0, Lcom/swmansion/rnscreens/z;->n:Landroidx/core/view/v0;

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/C;->b(ZLandroidx/core/view/v0;)V

    return-void
.end method

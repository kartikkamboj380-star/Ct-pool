.class public Lcom/facebook/yoga/t;
.super Lcom/facebook/yoga/YogaNodeJNIBase;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/facebook/yoga/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/yoga/YogaNodeJNIBase;-><init>(Lcom/facebook/yoga/c;)V

    return-void
.end method


# virtual methods
.method protected finalize()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/yoga/t;->t0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public t0()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->q:J

    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeFinalizeJNI(J)V

    :cond_0
    return-void
.end method

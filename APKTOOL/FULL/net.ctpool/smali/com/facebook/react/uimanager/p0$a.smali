.class Lcom/facebook/react/uimanager/p0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/p0;->z(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic n:Ljava/util/ArrayList;

.field final synthetic o:Ljava/util/ArrayDeque;

.field final synthetic p:Ljava/util/ArrayList;

.field final synthetic q:J

.field final synthetic r:J

.field final synthetic s:J

.field final synthetic t:J

.field final synthetic u:Lcom/facebook/react/uimanager/p0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/p0;ILjava/util/ArrayList;Ljava/util/ArrayDeque;Ljava/util/ArrayList;JJJJ)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    iput p2, p0, Lcom/facebook/react/uimanager/p0$a;->m:I

    iput-object p3, p0, Lcom/facebook/react/uimanager/p0$a;->n:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/facebook/react/uimanager/p0$a;->o:Ljava/util/ArrayDeque;

    iput-object p5, p0, Lcom/facebook/react/uimanager/p0$a;->p:Ljava/util/ArrayList;

    iput-wide p6, p0, Lcom/facebook/react/uimanager/p0$a;->q:J

    iput-wide p8, p0, Lcom/facebook/react/uimanager/p0$a;->r:J

    iput-wide p10, p0, Lcom/facebook/react/uimanager/p0$a;->s:J

    iput-wide p12, p0, Lcom/facebook/react/uimanager/p0$a;->t:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    move-object/from16 v1, p0

    const-string v0, "DispatchUI"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    const-string v4, "BatchId"

    iget v5, v1, Lcom/facebook/react/uimanager/p0$a;->m:I

    invoke-virtual {v0, v4, v5}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/react/uimanager/p0$g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v7}, Lcom/facebook/react/uimanager/p0$g;->c()V
    :try_end_1
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v7, v0

    :try_start_2
    invoke-static {}, Lcom/facebook/react/uimanager/p0;->x()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0, v7}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v8, v0

    invoke-interface {v7}, Lcom/facebook/react/uimanager/p0$g;->a()I

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v7}, Lcom/facebook/react/uimanager/p0$g;->b()V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->l(Lcom/facebook/react/uimanager/p0;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/react/uimanager/p0;->x()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    invoke-direct {v7, v8}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->o:Ljava/util/ArrayDeque;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/uimanager/p0$r;

    invoke-interface {v6}, Lcom/facebook/react/uimanager/p0$r;->f()V

    goto :goto_2

    :cond_2
    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/uimanager/p0$r;

    invoke-interface {v6}, Lcom/facebook/react/uimanager/p0$r;->f()V

    goto :goto_3

    :cond_3
    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->b(Lcom/facebook/react/uimanager/p0;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->i(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v6

    cmp-long v0, v6, v2

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    iget-wide v6, v1, Lcom/facebook/react/uimanager/p0$a;->q:J

    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/p0;->q(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/p0;->p(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    iget-wide v6, v1, Lcom/facebook/react/uimanager/p0$a;->r:J

    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/p0;->s(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    iget-wide v6, v1, Lcom/facebook/react/uimanager/p0$a;->s:J

    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/p0;->r(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/p0;->u(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->h(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/p0;->t(Lcom/facebook/react/uimanager/p0;J)V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    iget-wide v4, v1, Lcom/facebook/react/uimanager/p0$a;->t:J

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/p0;->v(Lcom/facebook/react/uimanager/p0;J)V

    const-string v8, "delayBeforeDispatchViewUpdates"

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->i(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    const-wide/32 v12, 0xf4240

    mul-long v10, v4, v12

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LP2/a;->b(JLjava/lang/String;IJ)V

    const-string v16, "delayBeforeDispatchViewUpdates"

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->j(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    mul-long v18, v4, v12

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, LP2/a;->f(JLjava/lang/String;IJ)V

    const-string v6, "delayBeforeBatchRunStart"

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->j(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    mul-long v8, v4, v12

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, LP2/a;->b(JLjava/lang/String;IJ)V

    const-string v16, "delayBeforeBatchRunStart"

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->k(Lcom/facebook/react/uimanager/p0;)J

    move-result-wide v4

    mul-long v18, v4, v12

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, LP2/a;->f(JLjava/lang/String;IJ)V

    :cond_4
    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/C;->f()V

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->m(Lcom/facebook/react/uimanager/p0;)Lz2/a;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->m(Lcom/facebook/react/uimanager/p0;)Lz2/a;

    move-result-object v0

    invoke-interface {v0}, Lz2/a;->b()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    invoke-static {v2, v3}, LP2/a;->g(J)V

    return-void

    :goto_4
    :try_start_3
    iget-object v4, v1, Lcom/facebook/react/uimanager/p0$a;->u:Lcom/facebook/react/uimanager/p0;

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/p0;->n(Lcom/facebook/react/uimanager/p0;Z)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_5
    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw v0
.end method

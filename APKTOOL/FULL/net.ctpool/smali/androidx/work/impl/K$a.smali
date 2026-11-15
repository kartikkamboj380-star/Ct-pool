.class Landroidx/work/impl/K$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/K;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:LX3/d;

.field final synthetic n:Landroidx/work/impl/K;


# direct methods
.method constructor <init>(Landroidx/work/impl/K;LX3/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/K$a;->n:Landroidx/work/impl/K;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/K$a;->m:LX3/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroidx/work/impl/K$a;->n:Landroidx/work/impl/K;

    iget-object v0, v0, Landroidx/work/impl/K;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/K$a;->m:LX3/d;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/K;->E:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Starting work for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/K$a;->n:Landroidx/work/impl/K;

    iget-object v3, v3, Landroidx/work/impl/K;->q:Lq0/u;

    iget-object v3, v3, Lq0/u;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/K$a;->n:Landroidx/work/impl/K;

    iget-object v1, v0, Landroidx/work/impl/K;->C:Landroidx/work/impl/utils/futures/c;

    iget-object v0, v0, Landroidx/work/impl/K;->r:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->m()LX3/d;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->r(LX3/d;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/work/impl/K$a;->n:Landroidx/work/impl/K;

    iget-object v1, v1, Landroidx/work/impl/K;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

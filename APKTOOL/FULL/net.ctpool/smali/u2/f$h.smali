.class Lu2/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f;->f(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lu2/a;

.field final synthetic n:Lu2/f;

.field final synthetic o:Lu2/g;


# direct methods
.method constructor <init>(Lu2/a;Lu2/f;Lu2/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/f$h;->m:Lu2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lu2/f$h;->n:Lu2/f;

    .line 4
    .line 5
    iput-object p3, p0, Lu2/f$h;->o:Lu2/g;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lu2/f$h;->m:Lu2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lu2/f$h;->n:Lu2/f;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lu2/a;->a(Lu2/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu2/f;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lu2/f$h;->o:Lu2/g;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Lu2/g;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lu2/f$h$a;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lu2/f$h$a;-><init>(Lu2/f$h;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lu2/f;->h(Lu2/a;)Lu2/f;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_0
    iget-object v1, p0, Lu2/f$h;->o:Lu2/g;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_1
    iget-object v0, p0, Lu2/f$h;->o:Lu2/g;

    .line 38
    .line 39
    invoke-virtual {v0}, Lu2/g;->b()V

    .line 40
    .line 41
    .line 42
    :goto_1
    return-void
.end method

.class Lu2/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f;->g(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
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
    iput-object p1, p0, Lu2/f$g;->m:Lu2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lu2/f$g;->n:Lu2/f;

    .line 4
    .line 5
    iput-object p3, p0, Lu2/f$g;->o:Lu2/g;

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
    iget-object v0, p0, Lu2/f$g;->m:Lu2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lu2/f$g;->n:Lu2/f;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lu2/a;->a(Lu2/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lu2/f$g;->o:Lu2/g;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lu2/g;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    iget-object v1, p0, Lu2/f$g;->o:Lu2/g;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_1
    iget-object v0, p0, Lu2/f$g;->o:Lu2/g;

    .line 23
    .line 24
    invoke-virtual {v0}, Lu2/g;->b()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

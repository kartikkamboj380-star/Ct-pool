.class Lu2/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f;->v(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu2/a;

.field final synthetic b:Lu2/f;


# direct methods
.method constructor <init>(Lu2/f;Lu2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/f$f;->b:Lu2/f;

    .line 2
    .line 3
    iput-object p2, p0, Lu2/f$f;->a:Lu2/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu2/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu2/f$f;->b(Lu2/f;)Lu2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu2/f;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lu2/f;->n()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lu2/f;->l(Ljava/lang/Exception;)Lu2/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lu2/f;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lu2/f;->e()Lu2/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    iget-object v0, p0, Lu2/f$f;->a:Lu2/a;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lu2/f;->j(Lu2/a;)Lu2/f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

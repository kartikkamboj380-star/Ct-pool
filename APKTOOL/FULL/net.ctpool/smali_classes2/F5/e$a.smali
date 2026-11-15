.class public final LF5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lx5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF5/e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private m:I

.field private n:I

.field private o:I

.field private p:LC5/c;

.field private q:I

.field final synthetic r:LF5/e;


# direct methods
.method constructor <init>(LF5/e;)V
    .locals 2

    .line 1
    iput-object p1, p0, LF5/e$a;->r:LF5/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, LF5/e$a;->m:I

    .line 8
    .line 9
    invoke-static {p1}, LF5/e;->e(LF5/e;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, LF5/e;->c(LF5/e;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1, p1}, LC5/g;->h(III)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, LF5/e$a;->n:I

    .line 27
    .line 28
    iput p1, p0, LF5/e$a;->o:I

    .line 29
    .line 30
    return-void
.end method

.method private final d()V
    .locals 6

    .line 1
    iget v0, p0, LF5/e$a;->o:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, LF5/e$a;->m:I

    const/4 v0, 0x0

    iput-object v0, p0, LF5/e$a;->p:LC5/c;

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v0}, LF5/e;->d(LF5/e;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, LF5/e$a;->q:I

    add-int/2addr v0, v3

    iput v0, p0, LF5/e$a;->q:I

    iget-object v4, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v4}, LF5/e;->d(LF5/e;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, LF5/e$a;->o:I

    iget-object v4, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v4}, LF5/e;->c(LF5/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, LC5/c;

    iget v1, p0, LF5/e$a;->n:I

    iget-object v4, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v4}, LF5/e;->c(LF5/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LF5/q;->L(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LC5/c;-><init>(II)V

    :goto_0
    iput-object v0, p0, LF5/e$a;->p:LC5/c;

    :goto_1
    iput v2, p0, LF5/e$a;->o:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v0}, LF5/e;->b(LF5/e;)Lv5/p;

    move-result-object v0

    iget-object v4, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v4}, LF5/e;->c(LF5/e;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, LF5/e$a;->o:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lv5/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li5/l;

    if-nez v0, :cond_4

    new-instance v0, LC5/c;

    iget v1, p0, LF5/e$a;->n:I

    iget-object v4, p0, LF5/e$a;->r:LF5/e;

    invoke-static {v4}, LF5/e;->c(LF5/e;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LF5/q;->L(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LC5/c;-><init>(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Li5/l;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Li5/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, LF5/e$a;->n:I

    invoke-static {v4, v2}, LC5/g;->l(II)LC5/c;

    move-result-object v4

    iput-object v4, p0, LF5/e$a;->p:LC5/c;

    add-int/2addr v2, v0

    iput v2, p0, LF5/e$a;->n:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    goto :goto_1

    :goto_2
    iput v3, p0, LF5/e$a;->m:I

    :goto_3
    return-void
.end method


# virtual methods
.method public e()LC5/c;
    .locals 3

    .line 1
    iget v0, p0, LF5/e$a;->m:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, LF5/e$a;->d()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, LF5/e$a;->m:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LF5/e$a;->p:LC5/c;

    .line 14
    .line 15
    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, LF5/e$a;->p:LC5/c;

    .line 22
    .line 23
    iput v1, p0, LF5/e$a;->m:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LF5/e$a;->m:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, LF5/e$a;->d()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, LF5/e$a;->m:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 v1, 0x0

    .line 16
    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/e$a;->e()LC5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

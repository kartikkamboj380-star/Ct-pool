.class public final LZ5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/v$a;


# instance fields
.field private a:I

.field private final b:LY5/e;

.field private final c:Ljava/util/List;

.field private final d:I

.field private final e:LY5/c;

.field private final f:LT5/B;

.field private final g:I

.field private final h:I

.field private final i:I


# direct methods
.method public constructor <init>(LY5/e;Ljava/util/List;ILY5/c;LT5/B;III)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "interceptors"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "request"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LZ5/g;->b:LY5/e;

    .line 20
    .line 21
    iput-object p2, p0, LZ5/g;->c:Ljava/util/List;

    .line 22
    .line 23
    iput p3, p0, LZ5/g;->d:I

    .line 24
    .line 25
    iput-object p4, p0, LZ5/g;->e:LY5/c;

    .line 26
    .line 27
    iput-object p5, p0, LZ5/g;->f:LT5/B;

    .line 28
    .line 29
    iput p6, p0, LZ5/g;->g:I

    .line 30
    .line 31
    iput p7, p0, LZ5/g;->h:I

    .line 32
    .line 33
    iput p8, p0, LZ5/g;->i:I

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic c(LZ5/g;ILY5/c;LT5/B;IIIILjava/lang/Object;)LZ5/g;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 1
    iget p1, p0, LZ5/g;->d:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, LZ5/g;->e:LY5/c;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LZ5/g;->f:LT5/B;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, LZ5/g;->g:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, LZ5/g;->h:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, LZ5/g;->i:I

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move-object p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, LZ5/g;->b(ILY5/c;LT5/B;III)LZ5/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LT5/B;)LT5/D;
    .locals 14

    .line 1
    const-string v0, "request"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LZ5/g;->d:I

    iget-object v1, p0, LZ5/g;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_c

    iget v0, p0, LZ5/g;->a:I

    add-int/2addr v0, v3

    iput v0, p0, LZ5/g;->a:I

    iget-object v0, p0, LZ5/g;->e:LY5/c;

    const-string v1, " must call proceed() exactly once"

    const-string v4, "network interceptor "

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LY5/c;->j()LY5/d;

    move-result-object v0

    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    move-result-object v5

    invoke-virtual {v0, v5}, LY5/d;->g(LT5/u;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, LZ5/g;->a:I

    if-ne v0, v3, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LZ5/g;->c:Ljava/util/List;

    iget v2, p0, LZ5/g;->d:I

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT5/v;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LZ5/g;->c:Ljava/util/List;

    iget v1, p0, LZ5/g;->d:I

    sub-int/2addr v1, v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT5/v;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " must retain the same host and port"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    iget v0, p0, LZ5/g;->d:I

    add-int/lit8 v6, v0, 0x1

    const/16 v12, 0x3a

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v5, p0

    move-object v8, p1

    invoke-static/range {v5 .. v13}, LZ5/g;->c(LZ5/g;ILY5/c;LT5/B;IIIILjava/lang/Object;)LZ5/g;

    move-result-object p1

    iget-object v0, p0, LZ5/g;->c:Ljava/util/List;

    iget v5, p0, LZ5/g;->d:I

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT5/v;

    invoke-interface {v0, p1}, LT5/v;->a(LT5/v$a;)LT5/D;

    move-result-object v5

    const-string v6, "interceptor "

    if-eqz v5, :cond_b

    iget-object v7, p0, LZ5/g;->e:LY5/c;

    if-eqz v7, :cond_8

    iget v7, p0, LZ5/g;->d:I

    add-int/2addr v7, v3

    iget-object v8, p0, LZ5/g;->c:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_6

    iget p1, p1, LZ5/g;->a:I

    if-ne p1, v3, :cond_5

    goto :goto_3

    :cond_5
    move p1, v2

    goto :goto_4

    :cond_6
    :goto_3
    move p1, v3

    :goto_4
    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    invoke-virtual {v5}, LT5/D;->a()LT5/E;

    move-result-object p1

    if-eqz p1, :cond_9

    move v2, v3

    :cond_9
    if-eqz v2, :cond_a

    return-object v5

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned a response with no body"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(ILY5/c;LT5/B;III)LZ5/g;
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    const-string v1, "request"

    .line 3
    .line 4
    move-object v7, p3

    .line 5
    invoke-static {p3, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LZ5/g;

    .line 9
    .line 10
    iget-object v3, v0, LZ5/g;->b:LY5/e;

    .line 11
    .line 12
    iget-object v4, v0, LZ5/g;->c:Ljava/util/List;

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    move v5, p1

    .line 16
    move-object v6, p2

    .line 17
    move v8, p4

    .line 18
    move/from16 v9, p5

    .line 19
    .line 20
    move/from16 v10, p6

    .line 21
    .line 22
    invoke-direct/range {v2 .. v10}, LZ5/g;-><init>(LY5/e;Ljava/util/List;ILY5/c;LT5/B;III)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public call()LT5/e;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/g;->b:LY5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LY5/e;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/g;->b:LY5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, LZ5/g;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()LY5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/g;->e:LY5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, LZ5/g;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()LT5/B;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/g;->f:LT5/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, LZ5/g;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, LZ5/g;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public o()LT5/B;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/g;->f:LT5/B;

    .line 2
    .line 3
    return-object v0
.end method

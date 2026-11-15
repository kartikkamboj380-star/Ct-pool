.class public final Lb6/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field public c:I

.field public d:[Lb6/c;

.field private e:I

.field public f:I

.field public g:I

.field public h:I

.field private final i:Z

.field private final j:Li6/f;


# direct methods
.method public constructor <init>(IZLi6/f;)V
    .locals 1

    .line 1
    const-string v0, "out"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb6/d$b;->h:I

    iput-boolean p2, p0, Lb6/d$b;->i:Z

    iput-object p3, p0, Lb6/d$b;->j:Li6/f;

    const p2, 0x7fffffff

    iput p2, p0, Lb6/d$b;->a:I

    iput p1, p0, Lb6/d$b;->c:I

    const/16 p1, 0x8

    new-array p1, p1, [Lb6/c;

    iput-object p1, p0, Lb6/d$b;->d:[Lb6/c;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lb6/d$b;->e:I

    return-void
.end method

.method public synthetic constructor <init>(IZLi6/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x1000

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lb6/d$b;-><init>(IZLi6/f;)V

    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    iget v0, p0, Lb6/d$b;->c:I

    .line 2
    .line 3
    iget v1, p0, Lb6/d$b;->g:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lb6/d$b;->b()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sub-int/2addr v1, v0

    .line 14
    invoke-direct {p0, v1}, Lb6/d$b;->c(I)I

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method private final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb6/d$b;->d:[Lb6/c;

    .line 2
    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static/range {v0 .. v5}, Lj5/h;->l([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb6/d$b;->d:[Lb6/c;

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    iput v0, p0, Lb6/d$b;->e:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lb6/d$b;->f:I

    .line 20
    .line 21
    iput v0, p0, Lb6/d$b;->g:I

    .line 22
    .line 23
    return-void
.end method

.method private final c(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lb6/d$b;->d:[Lb6/c;

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    iget v2, p0, Lb6/d$b;->e:I

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lb6/d$b;->d:[Lb6/c;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget v2, v2, Lb6/c;->a:I

    .line 23
    .line 24
    sub-int/2addr p1, v2

    .line 25
    iget v2, p0, Lb6/d$b;->g:I

    .line 26
    .line 27
    iget-object v3, p0, Lb6/d$b;->d:[Lb6/c;

    .line 28
    .line 29
    aget-object v3, v3, v1

    .line 30
    .line 31
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget v3, v3, Lb6/c;->a:I

    .line 35
    .line 36
    sub-int/2addr v2, v3

    .line 37
    iput v2, p0, Lb6/d$b;->g:I

    .line 38
    .line 39
    iget v2, p0, Lb6/d$b;->f:I

    .line 40
    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    iput v2, p0, Lb6/d$b;->f:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    add-int/lit8 v1, v1, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p0, Lb6/d$b;->d:[Lb6/c;

    .line 51
    .line 52
    add-int/lit8 v1, v2, 0x1

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    add-int/2addr v2, v0

    .line 57
    iget v3, p0, Lb6/d$b;->f:I

    .line 58
    .line 59
    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lb6/d$b;->d:[Lb6/c;

    .line 63
    .line 64
    iget v1, p0, Lb6/d$b;->e:I

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    add-int/2addr v1, v0

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-static {p1, v2, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget p1, p0, Lb6/d$b;->e:I

    .line 76
    .line 77
    add-int/2addr p1, v0

    .line 78
    iput p1, p0, Lb6/d$b;->e:I

    .line 79
    .line 80
    :cond_1
    return v0
.end method

.method private final d(Lb6/c;)V
    .locals 6

    .line 1
    iget v0, p1, Lb6/c;->a:I

    .line 2
    .line 3
    iget v1, p0, Lb6/d$b;->c:I

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lb6/d$b;->b()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v2, p0, Lb6/d$b;->g:I

    .line 12
    .line 13
    add-int/2addr v2, v0

    .line 14
    sub-int/2addr v2, v1

    .line 15
    invoke-direct {p0, v2}, Lb6/d$b;->c(I)I

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lb6/d$b;->f:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    iget-object v2, p0, Lb6/d$b;->d:[Lb6/c;

    .line 23
    .line 24
    array-length v3, v2

    .line 25
    if-le v1, v3, :cond_1

    .line 26
    .line 27
    array-length v1, v2

    .line 28
    mul-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    new-array v1, v1, [Lb6/c;

    .line 31
    .line 32
    array-length v3, v2

    .line 33
    array-length v4, v2

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-static {v2, v5, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lb6/d$b;->d:[Lb6/c;

    .line 39
    .line 40
    array-length v2, v2

    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    iput v2, p0, Lb6/d$b;->e:I

    .line 44
    .line 45
    iput-object v1, p0, Lb6/d$b;->d:[Lb6/c;

    .line 46
    .line 47
    :cond_1
    iget v1, p0, Lb6/d$b;->e:I

    .line 48
    .line 49
    add-int/lit8 v2, v1, -0x1

    .line 50
    .line 51
    iput v2, p0, Lb6/d$b;->e:I

    .line 52
    .line 53
    iget-object v2, p0, Lb6/d$b;->d:[Lb6/c;

    .line 54
    .line 55
    aput-object p1, v2, v1

    .line 56
    .line 57
    iget p1, p0, Lb6/d$b;->f:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput p1, p0, Lb6/d$b;->f:I

    .line 62
    .line 63
    iget p1, p0, Lb6/d$b;->g:I

    .line 64
    .line 65
    add-int/2addr p1, v0

    .line 66
    iput p1, p0, Lb6/d$b;->g:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final e(I)V
    .locals 1

    .line 1
    iput p1, p0, Lb6/d$b;->h:I

    .line 2
    .line 3
    const/16 v0, 0x4000

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v0, p0, Lb6/d$b;->c:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-ge p1, v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lb6/d$b;->a:I

    .line 17
    .line 18
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lb6/d$b;->a:I

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lb6/d$b;->b:Z

    .line 26
    .line 27
    iput p1, p0, Lb6/d$b;->c:I

    .line 28
    .line 29
    invoke-direct {p0}, Lb6/d$b;->a()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final f(Li6/i;)V
    .locals 4

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lb6/d$b;->i:Z

    .line 7
    .line 8
    const/16 v1, 0x7f

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lb6/k;->d:Lb6/k;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lb6/k;->d(Li6/i;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p1}, Li6/i;->C()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_0

    .line 23
    .line 24
    new-instance v2, Li6/f;

    .line 25
    .line 26
    invoke-direct {v2}, Li6/f;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v2}, Lb6/k;->c(Li6/i;Li6/g;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Li6/f;->f1()Li6/i;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Li6/i;->C()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v2, 0x80

    .line 41
    .line 42
    :goto_0
    invoke-virtual {p0, v0, v1, v2}, Lb6/d$b;->h(III)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lb6/d$b;->j:Li6/f;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Li6/f;->q1(Li6/i;)Li6/f;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-virtual {p1}, Li6/i;->C()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v2, 0x0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    return-void
.end method

.method public final g(Ljava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "headerBlock"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lb6/d$b;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Lb6/d$b;->a:I

    iget v2, p0, Lb6/d$b;->c:I

    const/16 v3, 0x20

    const/16 v4, 0x1f

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0, v4, v3}, Lb6/d$b;->h(III)V

    :cond_0
    iput-boolean v1, p0, Lb6/d$b;->b:Z

    const v0, 0x7fffffff

    iput v0, p0, Lb6/d$b;->a:I

    iget v0, p0, Lb6/d$b;->c:I

    invoke-virtual {p0, v0, v4, v3}, Lb6/d$b;->h(III)V

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_c

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb6/c;

    iget-object v4, v3, Lb6/c;->b:Li6/i;

    invoke-virtual {v4}, Li6/i;->E()Li6/i;

    move-result-object v4

    iget-object v5, v3, Lb6/c;->c:Li6/i;

    sget-object v6, Lb6/d;->c:Lb6/d;

    invoke-virtual {v6}, Lb6/d;->b()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    const/4 v8, -0x1

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/lit8 v9, v7, 0x1

    const/4 v10, 0x2

    if-le v10, v9, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x7

    if-lt v10, v9, :cond_4

    invoke-virtual {v6}, Lb6/d;->c()[Lb6/c;

    move-result-object v10

    aget-object v10, v10, v7

    iget-object v10, v10, Lb6/c;->c:Li6/i;

    invoke-static {v10, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    move v6, v9

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lb6/d;->c()[Lb6/c;

    move-result-object v6

    aget-object v6, v6, v9

    iget-object v6, v6, Lb6/c;->c:Li6/i;

    invoke-static {v6, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v7, v7, 0x2

    move v6, v9

    move v9, v7

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v9

    move v9, v8

    goto :goto_2

    :cond_5
    move v6, v8

    move v9, v6

    :goto_2
    if-ne v9, v8, :cond_8

    iget v7, p0, Lb6/d$b;->e:I

    add-int/lit8 v7, v7, 0x1

    iget-object v10, p0, Lb6/d$b;->d:[Lb6/c;

    array-length v10, v10

    :goto_3
    if-ge v7, v10, :cond_8

    iget-object v11, p0, Lb6/d$b;->d:[Lb6/c;

    aget-object v11, v11, v7

    invoke-static {v11}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v11, v11, Lb6/c;->b:Li6/i;

    invoke-static {v11, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    iget-object v11, p0, Lb6/d$b;->d:[Lb6/c;

    aget-object v11, v11, v7

    invoke-static {v11}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v11, v11, Lb6/c;->c:Li6/i;

    invoke-static {v11, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget v9, p0, Lb6/d$b;->e:I

    sub-int/2addr v7, v9

    sget-object v9, Lb6/d;->c:Lb6/d;

    invoke-virtual {v9}, Lb6/d;->c()[Lb6/c;

    move-result-object v9

    array-length v9, v9

    add-int/2addr v9, v7

    goto :goto_4

    :cond_6
    if-ne v6, v8, :cond_7

    iget v6, p0, Lb6/d$b;->e:I

    sub-int v6, v7, v6

    sget-object v11, Lb6/d;->c:Lb6/d;

    invoke-virtual {v11}, Lb6/d;->c()[Lb6/c;

    move-result-object v11

    array-length v11, v11

    add-int/2addr v6, v11

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    if-eq v9, v8, :cond_9

    const/16 v3, 0x7f

    const/16 v4, 0x80

    invoke-virtual {p0, v9, v3, v4}, Lb6/d$b;->h(III)V

    goto :goto_6

    :cond_9
    const/16 v7, 0x40

    if-ne v6, v8, :cond_a

    iget-object v6, p0, Lb6/d$b;->j:Li6/f;

    invoke-virtual {v6, v7}, Li6/f;->t1(I)Li6/f;

    invoke-virtual {p0, v4}, Lb6/d$b;->f(Li6/i;)V

    :goto_5
    invoke-virtual {p0, v5}, Lb6/d$b;->f(Li6/i;)V

    invoke-direct {p0, v3}, Lb6/d$b;->d(Lb6/c;)V

    goto :goto_6

    :cond_a
    sget-object v8, Lb6/c;->d:Li6/i;

    invoke-virtual {v4, v8}, Li6/i;->D(Li6/i;)Z

    move-result v8

    if-eqz v8, :cond_b

    sget-object v8, Lb6/c;->i:Li6/i;

    invoke-static {v8, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_b

    const/16 v3, 0xf

    invoke-virtual {p0, v6, v3, v1}, Lb6/d$b;->h(III)V

    invoke-virtual {p0, v5}, Lb6/d$b;->f(Li6/i;)V

    goto :goto_6

    :cond_b
    const/16 v4, 0x3f

    invoke-virtual {p0, v6, v4, v7}, Lb6/d$b;->h(III)V

    goto :goto_5

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public final h(III)V
    .locals 1

    .line 1
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lb6/d$b;->j:Li6/f;

    .line 4
    .line 5
    or-int/2addr p1, p3

    .line 6
    :goto_0
    invoke-virtual {p2, p1}, Li6/f;->t1(I)Li6/f;

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lb6/d$b;->j:Li6/f;

    .line 11
    .line 12
    or-int/2addr p3, p2

    .line 13
    invoke-virtual {v0, p3}, Li6/f;->t1(I)Li6/f;

    .line 14
    .line 15
    .line 16
    sub-int/2addr p1, p2

    .line 17
    :goto_1
    const/16 p2, 0x80

    .line 18
    .line 19
    if-lt p1, p2, :cond_1

    .line 20
    .line 21
    and-int/lit8 p3, p1, 0x7f

    .line 22
    .line 23
    iget-object v0, p0, Lb6/d$b;->j:Li6/f;

    .line 24
    .line 25
    or-int/2addr p2, p3

    .line 26
    invoke-virtual {v0, p2}, Li6/f;->t1(I)Li6/f;

    .line 27
    .line 28
    .line 29
    ushr-int/lit8 p1, p1, 0x7

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object p2, p0, Lb6/d$b;->j:Li6/f;

    .line 33
    .line 34
    goto :goto_0
.end method

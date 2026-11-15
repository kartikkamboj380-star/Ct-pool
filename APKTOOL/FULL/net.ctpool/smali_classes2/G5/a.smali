.class public final LG5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG5/a$a;
    }
.end annotation


# static fields
.field public static final n:LG5/a$a;

.field private static final o:J

.field private static final p:J

.field private static final q:J


# instance fields
.field private final m:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LG5/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LG5/a;->n:LG5/a$a;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-static {v0, v1}, LG5/a;->l(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, LG5/a;->o:J

    .line 16
    .line 17
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, LG5/c;->b(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    sput-wide v0, LG5/a;->p:J

    .line 27
    .line 28
    const-wide v0, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, LG5/c;->b(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sput-wide v0, LG5/a;->q:J

    .line 38
    .line 39
    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LG5/a;->m:J

    .line 5
    .line 6
    return-void
.end method

.method public static final A(J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG5/a;->D(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    xor-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    return p0
.end method

.method private static final B(J)Z
    .locals 0

    .line 1
    long-to-int p0, p0

    .line 2
    const/4 p1, 0x1

    .line 3
    and-int/2addr p0, p1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method

.method private static final C(J)Z
    .locals 0

    .line 1
    long-to-int p0, p0

    .line 2
    const/4 p1, 0x1

    .line 3
    and-int/2addr p0, p1

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method

.method public static final D(J)Z
    .locals 2

    .line 1
    sget-wide v0, LG5/a;->p:J

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-wide v0, LG5/a;->q:J

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    return p0
.end method

.method public static final E(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p0, v0

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    :goto_0
    return p0
.end method

.method public static final F(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p0, v0

    .line 4
    .line 5
    if-lez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    :goto_0
    return p0
.end method

.method public static final G(JLG5/d;)J
    .locals 2

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-wide v0, LG5/a;->p:J

    .line 7
    .line 8
    cmp-long v0, p0, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide p0, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-wide v0, LG5/a;->q:J

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-wide/high16 p0, -0x8000000000000000L

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p0, p1}, LG5/a;->y(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {p0, p1}, LG5/a;->x(J)LG5/d;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v0, v1, p0, p2}, LG5/e;->a(JLG5/d;LG5/d;)J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    :goto_0
    return-wide p0
.end method

.method public static H(J)Ljava/lang/String;
    .locals 14

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    .line 1
    const-string p0, "0s"

    goto/16 :goto_9

    :cond_0
    sget-wide v2, LG5/a;->p:J

    cmp-long v2, p0, v2

    if-nez v2, :cond_1

    const-string p0, "Infinity"

    goto/16 :goto_9

    :cond_1
    sget-wide v2, LG5/a;->q:J

    cmp-long v2, p0, v2

    if-nez v2, :cond_2

    const-string p0, "-Infinity"

    goto/16 :goto_9

    :cond_2
    invoke-static {p0, p1}, LG5/a;->E(J)Z

    move-result v2

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v2, :cond_3

    const/16 v3, 0x2d

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-static {p0, p1}, LG5/a;->n(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LG5/a;->p(J)J

    move-result-wide v5

    invoke-static {v3, v4}, LG5/a;->o(J)I

    move-result v7

    invoke-static {v3, v4}, LG5/a;->u(J)I

    move-result v8

    invoke-static {v3, v4}, LG5/a;->w(J)I

    move-result v9

    invoke-static {v3, v4}, LG5/a;->v(J)I

    move-result v10

    cmp-long v0, v5, v0

    const/4 v1, 0x0

    const/4 v12, 0x1

    if-eqz v0, :cond_4

    move v0, v12

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    if-eqz v7, :cond_5

    move v3, v12

    goto :goto_1

    :cond_5
    move v3, v1

    :goto_1
    if-eqz v8, :cond_6

    move v4, v12

    goto :goto_2

    :cond_6
    move v4, v1

    :goto_2
    if-nez v9, :cond_8

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    move v13, v1

    goto :goto_4

    :cond_8
    :goto_3
    move v13, v12

    :goto_4
    if-eqz v0, :cond_9

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v12

    :cond_9
    const/16 v5, 0x20

    if-nez v3, :cond_a

    if-eqz v0, :cond_c

    if-nez v4, :cond_a

    if-eqz v13, :cond_c

    :cond_a
    add-int/lit8 v6, v1, 0x1

    if-lez v1, :cond_b

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_b
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x68

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v6

    :cond_c
    if-nez v4, :cond_d

    if-eqz v13, :cond_f

    if-nez v3, :cond_d

    if-eqz v0, :cond_f

    :cond_d
    add-int/lit8 v6, v1, 0x1

    if-lez v1, :cond_e

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_e
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x6d

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v6

    :cond_f
    if-eqz v13, :cond_15

    add-int/lit8 v13, v1, 0x1

    if-lez v1, :cond_10

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_10
    if-nez v9, :cond_14

    if-nez v0, :cond_14

    if-nez v3, :cond_14

    if-eqz v4, :cond_11

    goto :goto_7

    :cond_11
    const v0, 0xf4240

    if-lt v10, v0, :cond_12

    div-int v6, v10, v0

    rem-int v7, v10, v0

    const-string v9, "ms"

    const/4 v10, 0x0

    const/4 v8, 0x6

    :goto_5
    move-wide v3, p0

    move-object v5, v11

    :goto_6
    invoke-static/range {v3 .. v10}, LG5/a;->e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V

    goto :goto_8

    :cond_12
    const/16 v0, 0x3e8

    if-lt v10, v0, :cond_13

    div-int/lit16 v6, v10, 0x3e8

    rem-int/lit16 v7, v10, 0x3e8

    const-string v9, "us"

    const/4 v10, 0x0

    const/4 v8, 0x3

    goto :goto_5

    :cond_13
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "ns"

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_14
    :goto_7
    const-string v0, "s"

    const/4 v1, 0x0

    const/16 v8, 0x9

    move-wide v3, p0

    move-object v5, v11

    move v6, v9

    move v7, v10

    move-object v9, v0

    move v10, v1

    goto :goto_6

    :goto_8
    move v1, v13

    :cond_15
    if-eqz v2, :cond_16

    if-le v1, v12, :cond_16

    const/16 p0, 0x28

    invoke-virtual {v11, v12, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    move-result-object p0

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_16
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_9
    return-object p0
.end method

.method public static final I(J)J
    .locals 2

    .line 1
    invoke-static {p0, p1}, LG5/a;->y(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    neg-long v0, v0

    .line 6
    long-to-int p0, p0

    .line 7
    and-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    invoke-static {v0, v1, p0}, LG5/c;->a(JI)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method private static final e(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_4

    .line 5
    .line 6
    const/16 p0, 0x2e

    .line 7
    .line 8
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 p1, 0x30

    .line 16
    .line 17
    invoke-static {p0, p5, p1}, LF5/g;->b0(Ljava/lang/String;IC)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/4 p4, -0x1

    .line 26
    add-int/2addr p3, p4

    .line 27
    if-ltz p3, :cond_2

    .line 28
    .line 29
    :goto_0
    add-int/lit8 p5, p3, -0x1

    .line 30
    .line 31
    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eq v0, p1, :cond_0

    .line 36
    .line 37
    move p4, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    if-gez p5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p3, p5

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    add-int/lit8 p1, p4, 0x1

    .line 45
    .line 46
    const-string p3, "append(...)"

    .line 47
    .line 48
    const/4 p5, 0x0

    .line 49
    const/4 v0, 0x3

    .line 50
    if-nez p7, :cond_3

    .line 51
    .line 52
    if-ge p1, v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p2, p0, p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_2
    invoke-static {p2, p3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    add-int/2addr p4, v0

    .line 62
    div-int/2addr p4, v0

    .line 63
    mul-int/2addr p4, v0

    .line 64
    invoke-virtual {p2, p0, p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_3
    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static final synthetic h(J)LG5/a;
    .locals 1

    .line 1
    new-instance v0, LG5/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LG5/a;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static k(JJ)I
    .locals 4

    .line 1
    xor-long v0, p0, p2

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-ltz v2, :cond_2

    .line 8
    .line 9
    long-to-int v0, v0

    .line 10
    and-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    long-to-int v0, p0

    .line 16
    and-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    long-to-int p2, p2

    .line 19
    and-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    sub-int/2addr v0, p2

    .line 22
    invoke-static {p0, p1}, LG5/a;->E(J)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    neg-int v0, v0

    .line 29
    :cond_1
    return v0

    .line 30
    :cond_2
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lw5/k;->h(JJ)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static l(J)J
    .locals 5

    .line 1
    invoke-static {}, LG5/b;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1}, LG5/a;->C(J)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LC5/f;

    const-wide v1, -0x3ffffffffffa14bfL    # -2.0000000001722644

    const-wide v3, 0x3ffffffffffa14bfL    # 1.9999999999138678

    invoke-direct {v0, v1, v2, v3, v4}, LC5/f;-><init>(JJ)V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LC5/f;->k(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ns is out of nanoseconds range"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance v0, LC5/f;

    const-wide v1, -0x3fffffffffffffffL    # -2.0000000000000004

    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-direct {v0, v1, v2, v3, v4}, LC5/f;-><init>(JJ)V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LC5/f;->k(J)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LC5/f;

    const-wide v1, -0x431bde82d7aL

    const-wide v3, 0x431bde82d7aL

    invoke-direct {v0, v1, v2, v3, v4}, LC5/f;-><init>(JJ)V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LC5/f;->k(J)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms is denormalized"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, LG5/a;->y(J)J

    move-result-wide p0

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms is out of milliseconds range"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    :goto_0
    return-wide p0
.end method

.method public static m(JLjava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p2, LG5/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p2, LG5/a;

    .line 8
    .line 9
    invoke-virtual {p2}, LG5/a;->J()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long p0, p0, v2

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static final n(J)J
    .locals 1

    .line 1
    invoke-static {p0, p1}, LG5/a;->E(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, LG5/a;->I(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    :cond_0
    return-wide p0
.end method

.method public static final o(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, LG5/a;->D(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0, p1}, LG5/a;->q(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    rem-long/2addr p0, v0

    .line 17
    long-to-int p0, p0

    .line 18
    :goto_0
    return p0
.end method

.method public static final p(J)J
    .locals 1

    .line 1
    sget-object v0, LG5/d;->t:LG5/d;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LG5/a;->G(JLG5/d;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static final q(J)J
    .locals 1

    .line 1
    sget-object v0, LG5/d;->s:LG5/d;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LG5/a;->G(JLG5/d;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static final r(J)J
    .locals 1

    .line 1
    invoke-static {p0, p1}, LG5/a;->B(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, LG5/a;->A(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, LG5/a;->y(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, LG5/d;->p:LG5/d;

    .line 19
    .line 20
    invoke-static {p0, p1, v0}, LG5/a;->G(JLG5/d;)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    :goto_0
    return-wide p0
.end method

.method public static final s(J)J
    .locals 1

    .line 1
    sget-object v0, LG5/d;->r:LG5/d;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LG5/a;->G(JLG5/d;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static final t(J)J
    .locals 1

    .line 1
    sget-object v0, LG5/d;->q:LG5/d;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LG5/a;->G(JLG5/d;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static final u(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, LG5/a;->D(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0, p1}, LG5/a;->s(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const/16 v0, 0x3c

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    rem-long/2addr p0, v0

    .line 17
    long-to-int p0, p0

    .line 18
    :goto_0
    return p0
.end method

.method public static final v(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, LG5/a;->D(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-static {p0, p1}, LG5/a;->B(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p0, p1}, LG5/a;->y(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x3e8

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    rem-long/2addr p0, v0

    .line 23
    invoke-static {p0, p1}, LG5/c;->c(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    :goto_0
    long-to-int p0, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const v0, 0x3b9aca00

    .line 30
    .line 31
    .line 32
    int-to-long v0, v0

    .line 33
    rem-long/2addr p0, v0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    return p0
.end method

.method public static final w(J)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, LG5/a;->D(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0, p1}, LG5/a;->t(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const/16 v0, 0x3c

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    rem-long/2addr p0, v0

    .line 17
    long-to-int p0, p0

    .line 18
    :goto_0
    return p0
.end method

.method private static final x(J)LG5/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG5/a;->C(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, LG5/d;->n:LG5/d;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, LG5/d;->p:LG5/d;

    .line 11
    .line 12
    :goto_0
    return-object p0
.end method

.method private static final y(J)J
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    shr-long/2addr p0, v0

    .line 3
    return-wide p0
.end method

.method public static z(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final synthetic J()J
    .locals 2

    .line 1
    iget-wide v0, p0, LG5/a;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, LG5/a;

    .line 2
    .line 3
    invoke-virtual {p1}, LG5/a;->J()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, LG5/a;->j(J)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, LG5/a;->m:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1}, LG5/a;->m(JLjava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, LG5/a;->m:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LG5/a;->z(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, LG5/a;->m:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, LG5/a;->k(JJ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, LG5/a;->m:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LG5/a;->H(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

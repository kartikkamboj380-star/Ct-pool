.class public final Ls1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ls1/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ls1/a$a;[BI)Ls1/c;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->i([BI)Ls1/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->j([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->k([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic d(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->l([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic e(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->m([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic f(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->n([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->o([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic h(Ls1/a$a;[BI)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/a$a;->p([BI)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final i([BI)Ls1/c;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, p2}, LX0/b;->h([BII)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    invoke-static {p1, v0}, LX0/b;->g([BI)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object p1, Ls1/b;->g:Ls1/c;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-static {p1, v0}, LX0/b;->f([BI)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    sget-object p1, Ls1/b;->h:Ls1/c;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-static {p1, v0, p2}, LX0/b;->c([BII)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_4

    .line 31
    .line 32
    invoke-static {p1, v0}, LX0/b;->b([BI)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    sget-object p1, Ls1/b;->k:Ls1/c;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    invoke-static {p1, v0}, LX0/b;->d([BI)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    sget-object p1, Ls1/b;->j:Ls1/c;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    sget-object p1, Ls1/b;->i:Ls1/c;

    .line 51
    .line 52
    :goto_0
    return-object p1

    .line 53
    :cond_4
    sget-object p1, Ls1/c;->d:Ls1/c;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "Check failed."

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method private final j([BI)Z
    .locals 1

    .line 1
    invoke-static {}, Ls1/a;->c()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-ge p2, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ls1/a;->c()[B

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    return p1
.end method

.method private final k([BI)Z
    .locals 1

    .line 1
    invoke-static {}, Ls1/a;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt p2, v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Ls1/a;->d()[B

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ls1/a;->f()[B

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1
.end method

.method private final l([BI)Z
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ge p2, v0, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    invoke-static {}, Ls1/a;->g()[B

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    invoke-static {}, Ls1/a;->h()[B

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v1, 0x1

    .line 27
    :cond_2
    return v1
.end method

.method private final m([BI)Z
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 p2, 0x3

    .line 8
    aget-byte p2, p1, p2

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    if-ge p2, v0, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    invoke-static {}, Ls1/a;->i()[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-static {p1, p2, v2}, Ls1/e;->b([B[BI)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    invoke-static {}, Ls1/a;->j()[[B

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    array-length v2, p2

    .line 32
    move v3, v1

    .line 33
    :goto_0
    if-ge v3, v2, :cond_4

    .line 34
    .line 35
    aget-object v4, p2, v3

    .line 36
    .line 37
    invoke-static {p1, v4, v0}, Ls1/e;->b([B[BI)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    :goto_1
    return v1
.end method

.method private final n([BI)Z
    .locals 1

    .line 1
    invoke-static {}, Ls1/a;->k()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-ge p2, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ls1/a;->k()[B

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    return p1
.end method

.method private final o([BI)Z
    .locals 1

    .line 1
    invoke-static {}, Ls1/a;->l()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-lt p2, v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ls1/a;->l()[B

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    return p1
.end method

.method private final p([BI)Z
    .locals 1

    .line 1
    invoke-static {}, Ls1/a;->m()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-lt p2, v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ls1/a;->m()[B

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p1, p2}, Ls1/e;->c([B[B)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    return p1
.end method

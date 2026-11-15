.class public final Lcom/facebook/react/modules/debug/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/debug/c;
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
    invoke-direct {p0}, Lcom/facebook/react/modules/debug/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/modules/debug/c$a;LS1/d;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/modules/debug/c$a;->d(LS1/d;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)J
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/modules/debug/c$a;->e(LS1/d;JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic c(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)Z
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/modules/debug/c$a;->f(LS1/d;JJ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final d(LS1/d;J)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LS1/d;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v2}, LS1/d;->d(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    cmp-long v4, v4, p2

    .line 15
    .line 16
    if-gez v4, :cond_0

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-lez v3, :cond_3

    .line 24
    .line 25
    sub-int/2addr v0, v3

    .line 26
    :goto_1
    if-ge v1, v0, :cond_2

    .line 27
    .line 28
    add-int p2, v1, v3

    .line 29
    .line 30
    invoke-virtual {p1, p2}, LS1/d;->d(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide p2

    .line 34
    invoke-virtual {p1, v1, p2, p3}, LS1/d;->f(IJ)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p1, v3}, LS1/d;->c(I)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void
.end method

.method private final e(LS1/d;JJ)J
    .locals 7

    .line 1
    invoke-virtual {p1}, LS1/d;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1, v3}, LS1/d;->d(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    cmp-long v6, p2, v4

    .line 15
    .line 16
    if-gtz v6, :cond_0

    .line 17
    .line 18
    cmp-long v6, v4, p4

    .line 19
    .line 20
    if-gez v6, :cond_0

    .line 21
    .line 22
    move-wide v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    cmp-long v4, v4, p4

    .line 25
    .line 26
    if-ltz v4, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_2
    return-wide v1
.end method

.method private final f(LS1/d;JJ)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, LS1/d;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v2}, LS1/d;->d(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmp-long v5, p2, v3

    .line 14
    .line 15
    if-gtz v5, :cond_0

    .line 16
    .line 17
    cmp-long v3, v3, p4

    .line 18
    .line 19
    if-gez v3, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v1
.end method

.class Lcom/horcrux/svg/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/util/ArrayList;

.field private static e:I

.field private static f:Lcom/horcrux/svg/E;

.field private static g:Lcom/horcrux/svg/E;

.field private static h:Lcom/horcrux/svg/E;

.field private static i:Lcom/horcrux/svg/E;

.field private static j:Z


# instance fields
.field a:Lcom/horcrux/svg/H;

.field b:Lcom/horcrux/svg/E;

.field c:D


# direct methods
.method private constructor <init>(Lcom/horcrux/svg/H;Lcom/horcrux/svg/E;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/G;->a:Lcom/horcrux/svg/H;

    iput-object p2, p0, Lcom/horcrux/svg/G;->b:Lcom/horcrux/svg/E;

    iput-wide p3, p0, Lcom/horcrux/svg/G;->c:D

    return-void
.end method

.method private static a(DD)D
    .locals 4

    .line 1
    sub-double v0, p0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const-wide v0, 0x4076800000000000L    # 360.0

    add-double/2addr p0, v0

    :cond_0
    add-double/2addr p0, p2

    const-wide/high16 p2, 0x4000000000000000L    # 2.0

    div-double/2addr p0, p2

    return-wide p0
.end method

.method private static b(Lcom/horcrux/svg/K;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)V
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    invoke-static {p3, p2}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    iget-object p1, p0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    invoke-static {p1}, Lcom/horcrux/svg/G;->i(Lcom/horcrux/svg/E;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    iput-object p1, p0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    invoke-static {p1}, Lcom/horcrux/svg/G;->i(Lcom/horcrux/svg/E;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    iput-object p1, p0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    :cond_1
    :goto_0
    return-void
.end method

.method private static c(Lcom/horcrux/svg/H;)D
    .locals 5

    .line 1
    sget-object v0, Lcom/horcrux/svg/G;->h:Lcom/horcrux/svg/E;

    invoke-static {v0}, Lcom/horcrux/svg/G;->f(Lcom/horcrux/svg/E;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/horcrux/svg/G;->j(D)D

    move-result-wide v0

    sget-object v2, Lcom/horcrux/svg/G;->i:Lcom/horcrux/svg/E;

    invoke-static {v2}, Lcom/horcrux/svg/G;->f(Lcom/horcrux/svg/E;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/horcrux/svg/G;->j(D)D

    move-result-wide v2

    sget-object v4, Lcom/horcrux/svg/G$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v4, p0

    const/4 v4, 0x1

    if-eq p0, v4, :cond_2

    const/4 v4, 0x2

    if-eq p0, v4, :cond_1

    const/4 v2, 0x3

    if-eq p0, v2, :cond_0

    const-wide/16 v0, 0x0

    :cond_0
    return-wide v0

    :cond_1
    invoke-static {v0, v1, v2, v3}, Lcom/horcrux/svg/G;->a(DD)D

    move-result-wide v0

    return-wide v0

    :cond_2
    sget-boolean p0, Lcom/horcrux/svg/G;->j:Z

    if-eqz p0, :cond_3

    const-wide v0, 0x4066800000000000L    # 180.0

    add-double/2addr v2, v0

    :cond_3
    return-wide v2
.end method

.method private static d(Lcom/horcrux/svg/A;)Lcom/horcrux/svg/K;
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/K;

    invoke-direct {v0}, Lcom/horcrux/svg/K;-><init>()V

    iget-object v1, p0, Lcom/horcrux/svg/A;->b:[Lcom/horcrux/svg/E;

    sget-object v2, Lcom/horcrux/svg/G$a;->b:[I

    iget-object p0, p0, Lcom/horcrux/svg/A;->a:Lcom/horcrux/svg/f;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq p0, v4, :cond_3

    if-eq p0, v2, :cond_2

    const/4 v2, 0x3

    if-eq p0, v2, :cond_1

    const/4 v2, 0x4

    if-eq p0, v2, :cond_1

    const/4 v1, 0x5

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object p0, Lcom/horcrux/svg/G;->g:Lcom/horcrux/svg/E;

    :goto_0
    iput-object p0, v0, Lcom/horcrux/svg/K;->c:Lcom/horcrux/svg/E;

    sget-object v1, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    invoke-static {p0, v1}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p0

    iput-object p0, v0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    iget-object p0, v0, Lcom/horcrux/svg/K;->c:Lcom/horcrux/svg/E;

    sget-object v1, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    invoke-static {p0, v1}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p0

    iput-object p0, v0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    goto :goto_1

    :cond_1
    aget-object p0, v1, v3

    goto :goto_0

    :cond_2
    aget-object p0, v1, v4

    iput-object p0, v0, Lcom/horcrux/svg/K;->c:Lcom/horcrux/svg/E;

    sget-object v2, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    aget-object v1, v1, v3

    invoke-static {v0, v2, v1, p0}, Lcom/horcrux/svg/G;->b(Lcom/horcrux/svg/K;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)V

    goto :goto_1

    :cond_3
    aget-object p0, v1, v2

    iput-object p0, v0, Lcom/horcrux/svg/K;->c:Lcom/horcrux/svg/E;

    aget-object p0, v1, v3

    sget-object v5, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    invoke-static {p0, v5}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p0

    iput-object p0, v0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    aget-object p0, v1, v2

    aget-object v5, v1, v4

    invoke-static {p0, v5}, Lcom/horcrux/svg/G;->k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;

    move-result-object p0

    iput-object p0, v0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    iget-object p0, v0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    invoke-static {p0}, Lcom/horcrux/svg/G;->i(Lcom/horcrux/svg/E;)Z

    move-result p0

    if-eqz p0, :cond_4

    aget-object p0, v1, v3

    aget-object v3, v1, v4

    aget-object v1, v1, v2

    invoke-static {v0, p0, v3, v1}, Lcom/horcrux/svg/G;->b(Lcom/horcrux/svg/K;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)V

    goto :goto_1

    :cond_4
    iget-object p0, v0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    invoke-static {p0}, Lcom/horcrux/svg/G;->i(Lcom/horcrux/svg/E;)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    aget-object v2, v1, v3

    aget-object v1, v1, v4

    invoke-static {v0, p0, v2, v1}, Lcom/horcrux/svg/G;->b(Lcom/horcrux/svg/K;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)V

    :cond_5
    :goto_1
    return-object v0
.end method

.method private static e()V
    .locals 6

    .line 1
    sget-object v0, Lcom/horcrux/svg/H;->o:Lcom/horcrux/svg/H;

    invoke-static {v0}, Lcom/horcrux/svg/G;->c(Lcom/horcrux/svg/H;)D

    move-result-wide v1

    sget-object v3, Lcom/horcrux/svg/G;->d:Ljava/util/ArrayList;

    new-instance v4, Lcom/horcrux/svg/G;

    sget-object v5, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    invoke-direct {v4, v0, v5, v1, v2}, Lcom/horcrux/svg/G;-><init>(Lcom/horcrux/svg/H;Lcom/horcrux/svg/E;D)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static f(Lcom/horcrux/svg/E;)D
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/E;->b:D

    iget-wide v2, p0, Lcom/horcrux/svg/E;->a:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method private static g(Lcom/horcrux/svg/A;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/horcrux/svg/G;->d(Lcom/horcrux/svg/A;)Lcom/horcrux/svg/K;

    move-result-object v0

    iget-object v1, v0, Lcom/horcrux/svg/K;->a:Lcom/horcrux/svg/E;

    sput-object v1, Lcom/horcrux/svg/G;->i:Lcom/horcrux/svg/E;

    sget v1, Lcom/horcrux/svg/G;->e:I

    const/4 v2, 0x1

    if-lez v1, :cond_1

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/horcrux/svg/H;->m:Lcom/horcrux/svg/H;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/horcrux/svg/H;->n:Lcom/horcrux/svg/H;

    :goto_0
    invoke-static {v1}, Lcom/horcrux/svg/G;->c(Lcom/horcrux/svg/H;)D

    move-result-wide v3

    sget-object v5, Lcom/horcrux/svg/G;->d:Ljava/util/ArrayList;

    new-instance v6, Lcom/horcrux/svg/G;

    sget-object v7, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    invoke-direct {v6, v1, v7, v3, v4}, Lcom/horcrux/svg/G;-><init>(Lcom/horcrux/svg/H;Lcom/horcrux/svg/E;D)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, v0, Lcom/horcrux/svg/K;->b:Lcom/horcrux/svg/E;

    sput-object v1, Lcom/horcrux/svg/G;->h:Lcom/horcrux/svg/E;

    iget-object v0, v0, Lcom/horcrux/svg/K;->c:Lcom/horcrux/svg/E;

    sput-object v0, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    iget-object v0, p0, Lcom/horcrux/svg/A;->a:Lcom/horcrux/svg/f;

    sget-object v1, Lcom/horcrux/svg/f;->o:Lcom/horcrux/svg/f;

    if-ne v0, v1, :cond_2

    iget-object p0, p0, Lcom/horcrux/svg/A;->b:[Lcom/horcrux/svg/E;

    const/4 v0, 0x0

    aget-object p0, p0, v0

    :goto_1
    sput-object p0, Lcom/horcrux/svg/G;->g:Lcom/horcrux/svg/E;

    goto :goto_2

    :cond_2
    sget-object p0, Lcom/horcrux/svg/f;->q:Lcom/horcrux/svg/f;

    if-ne v0, p0, :cond_3

    new-instance p0, Lcom/horcrux/svg/E;

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1, v0, v1}, Lcom/horcrux/svg/E;-><init>(DD)V

    goto :goto_1

    :cond_3
    :goto_2
    sget p0, Lcom/horcrux/svg/G;->e:I

    add-int/2addr p0, v2

    sput p0, Lcom/horcrux/svg/G;->e:I

    return-void
.end method

.method static h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/horcrux/svg/G;->d:Ljava/util/ArrayList;

    const/4 v0, 0x0

    sput v0, Lcom/horcrux/svg/G;->e:I

    new-instance v0, Lcom/horcrux/svg/E;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/E;-><init>(DD)V

    sput-object v0, Lcom/horcrux/svg/G;->f:Lcom/horcrux/svg/E;

    new-instance v0, Lcom/horcrux/svg/E;

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/E;-><init>(DD)V

    sput-object v0, Lcom/horcrux/svg/G;->g:Lcom/horcrux/svg/E;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/horcrux/svg/A;

    invoke-static {v0}, Lcom/horcrux/svg/G;->g(Lcom/horcrux/svg/A;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/horcrux/svg/G;->e()V

    sget-object p0, Lcom/horcrux/svg/G;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method private static i(Lcom/horcrux/svg/E;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/E;->a:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/horcrux/svg/E;->b:D

    cmpl-double p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static j(D)D
    .locals 2

    .line 1
    const-wide v0, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method private static k(Lcom/horcrux/svg/E;Lcom/horcrux/svg/E;)Lcom/horcrux/svg/E;
    .locals 5

    .line 1
    new-instance v0, Lcom/horcrux/svg/E;

    iget-wide v1, p1, Lcom/horcrux/svg/E;->a:D

    iget-wide v3, p0, Lcom/horcrux/svg/E;->a:D

    sub-double/2addr v1, v3

    iget-wide v3, p1, Lcom/horcrux/svg/E;->b:D

    iget-wide p0, p0, Lcom/horcrux/svg/E;->b:D

    sub-double/2addr v3, p0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/horcrux/svg/E;-><init>(DD)V

    return-object v0
.end method

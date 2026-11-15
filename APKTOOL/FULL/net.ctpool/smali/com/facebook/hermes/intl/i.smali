.class public Lcom/facebook/hermes/intl/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/hermes/intl/i$b;
    }
.end annotation


# instance fields
.field private a:Landroid/icu/text/DateFormat;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/hermes/intl/i;->a:Landroid/icu/text/DateFormat;

    return-void
.end method

.method private static i(Lq1/b;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$k;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/b$b;->q:Lcom/facebook/hermes/intl/b$b;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, Lcom/facebook/hermes/intl/i;->m(Lcom/facebook/hermes/intl/b$k;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-interface {p0}, Lq1/b;->h()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/icu/util/ULocale;

    .line 14
    .line 15
    invoke-static {p1, p0}, Landroid/icu/text/DateFormat;->getTimeInstance(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    check-cast p0, Landroid/icu/text/SimpleDateFormat;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/icu/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object v0, Lcom/facebook/hermes/intl/b$k;->q:Lcom/facebook/hermes/intl/b$k;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/facebook/hermes/intl/i;->l(Lcom/facebook/hermes/intl/b$b;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p2, v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Lq1/b;->h()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/icu/util/ULocale;

    .line 39
    .line 40
    invoke-static {p1, p0}, Landroid/icu/text/DateFormat;->getDateInstance(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {p2}, Lcom/facebook/hermes/intl/i;->m(Lcom/facebook/hermes/intl/b$k;)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-interface {p0}, Lq1/b;->h()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroid/icu/util/ULocale;

    .line 54
    .line 55
    invoke-static {p1, p2, p0}, Landroid/icu/text/DateFormat;->getDateTimeInstance(IILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    goto :goto_0
.end method

.method private static j(Lq1/b;Lcom/facebook/hermes/intl/b$m;Lcom/facebook/hermes/intl/b$d;Lcom/facebook/hermes/intl/b$n;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$f;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$j;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$k;Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    move-object/from16 v0, p10

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    const/4 v3, 0x3

    .line 1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/facebook/hermes/intl/b$b;->q:Lcom/facebook/hermes/intl/b$b;

    if-ne v1, v5, :cond_0

    sget-object v5, Lcom/facebook/hermes/intl/b$k;->q:Lcom/facebook/hermes/intl/b$k;

    if-eq v2, v5, :cond_1

    :cond_0
    move-object v5, p0

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/hermes/intl/b$m;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/facebook/hermes/intl/b$d;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/facebook/hermes/intl/b$n;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Lcom/facebook/hermes/intl/b$i;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Lcom/facebook/hermes/intl/b$c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/facebook/hermes/intl/b$g;->m:Lcom/facebook/hermes/intl/b$g;

    if-eq v0, v1, :cond_3

    sget-object v1, Lcom/facebook/hermes/intl/b$g;->n:Lcom/facebook/hermes/intl/b$g;

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p6}, Lcom/facebook/hermes/intl/b$f;->j()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p6}, Lcom/facebook/hermes/intl/b$f;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p7}, Lcom/facebook/hermes/intl/b$h;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p8 .. p8}, Lcom/facebook/hermes/intl/b$j;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p9 .. p9}, Lcom/facebook/hermes/intl/b$l;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_8

    :goto_3
    invoke-static {p0, v1, v2}, Lcom/facebook/hermes/intl/i;->i(Lq1/b;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Lq1/b;->b()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "hc"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x6b

    const/16 v7, 0x68

    if-eqz v5, :cond_7

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "h11"

    if-eq v1, v2, :cond_6

    const-string v2, "h12"

    if-ne v1, v2, :cond_4

    goto :goto_4

    :cond_4
    const-string v2, "h23"

    if-eq v1, v2, :cond_5

    const-string v2, "h24"

    if-ne v1, v2, :cond_7

    :cond_5
    new-array v1, v3, [C

    fill-array-data v1, :array_0

    invoke-static {v4, v1, v6}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    goto :goto_5

    :cond_6
    :goto_4
    new-array v1, v3, [C

    fill-array-data v1, :array_1

    invoke-static {v4, v1, v7}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    :cond_7
    :goto_5
    sget-object v1, Lcom/facebook/hermes/intl/b$g;->m:Lcom/facebook/hermes/intl/b$g;

    if-eq v0, v1, :cond_a

    sget-object v1, Lcom/facebook/hermes/intl/b$g;->n:Lcom/facebook/hermes/intl/b$g;

    if-ne v0, v1, :cond_8

    goto :goto_6

    :cond_8
    sget-object v1, Lcom/facebook/hermes/intl/b$g;->o:Lcom/facebook/hermes/intl/b$g;

    if-eq v0, v1, :cond_9

    sget-object v1, Lcom/facebook/hermes/intl/b$g;->p:Lcom/facebook/hermes/intl/b$g;

    if-ne v0, v1, :cond_b

    :cond_9
    new-array v0, v3, [C

    fill-array-data v0, :array_2

    invoke-static {v4, v0, v6}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    goto :goto_7

    :cond_a
    :goto_6
    new-array v0, v3, [C

    fill-array-data v0, :array_3

    invoke-static {v4, v0, v7}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    :cond_b
    :goto_7
    invoke-static/range {p13 .. p13}, Lq1/d;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static/range {p13 .. p13}, Lq1/d;->j(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static/range {p13 .. p13}, Lq1/d;->e(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-array v0, v3, [C

    fill-array-data v0, :array_4

    invoke-static {v4, v0, v7}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    goto :goto_8

    :cond_c
    new-array v0, v3, [C

    fill-array-data v0, :array_5

    invoke-static {v4, v0, v6}, Lcom/facebook/hermes/intl/i;->k(Ljava/lang/StringBuilder;[CC)V

    :cond_d
    :goto_8
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 2
        0x68s
        0x48s
        0x4bs
    .end array-data

    nop

    :array_1
    .array-data 2
        0x48s
        0x4bs
        0x6bs
    .end array-data

    nop

    :array_2
    .array-data 2
        0x68s
        0x48s
        0x4bs
    .end array-data

    nop

    :array_3
    .array-data 2
        0x48s
        0x4bs
        0x6bs
    .end array-data

    nop

    :array_4
    .array-data 2
        0x48s
        0x4bs
        0x6bs
    .end array-data

    nop

    :array_5
    .array-data 2
        0x68s
        0x48s
        0x4bs
    .end array-data
.end method

.method private static k(Ljava/lang/StringBuilder;[CC)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    array-length v2, p1

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-char v4, p1, v3

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_0

    invoke-virtual {p0, v1, p2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static l(Lcom/facebook/hermes/intl/b$b;)I
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/i$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    new-instance v0, Lq1/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid DateStyle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/b$b;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v2

    :cond_2
    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method static m(Lcom/facebook/hermes/intl/b$k;)I
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/i$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    new-instance v0, Lq1/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid DateStyle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/hermes/intl/b$k;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v2

    :cond_2
    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(D)Ljava/text/AttributedCharacterIterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/i;->a:Landroid/icu/text/DateFormat;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1

    return-object p1
.end method

.method public b(D)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/i;->a:Landroid/icu/text/DateFormat;

    new-instance v1, Ljava/util/Date;

    double-to-long p1, p1

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Lq1/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    invoke-static {p1}, Landroid/icu/text/NumberingSystem;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberingSystem;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/icu/text/NumberingSystem;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public d(Lq1/b;)Lcom/facebook/hermes/intl/b$g;
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Landroid/icu/text/DateFormat;->getTimeInstance(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/icu/text/SimpleDateFormat;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/icu/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/facebook/hermes/intl/i$b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/16 v0, 0x68

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object p1, Lcom/facebook/hermes/intl/b$g;->n:Lcom/facebook/hermes/intl/b$g;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v0, 0x4b

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    sget-object p1, Lcom/facebook/hermes/intl/b$g;->m:Lcom/facebook/hermes/intl/b$g;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/16 v0, 0x48

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    sget-object p1, Lcom/facebook/hermes/intl/b$g;->o:Lcom/facebook/hermes/intl/b$g;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, Lcom/facebook/hermes/intl/b$g;->p:Lcom/facebook/hermes/intl/b$g;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    sget-object p1, Lcom/facebook/hermes/intl/b$g;->p:Lcom/facebook/hermes/intl/b$g;

    .line 71
    .line 72
    :goto_0
    return-object p1
.end method

.method public e(Lq1/b;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-static {v0, p1}, Landroid/icu/text/DateFormat;->getDateInstance(ILandroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/icu/text/DateFormat;->getCalendar()Landroid/icu/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/icu/util/Calendar;->getType()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lq1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public f(Lq1/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/hermes/intl/b$e;Lcom/facebook/hermes/intl/b$m;Lcom/facebook/hermes/intl/b$d;Lcom/facebook/hermes/intl/b$n;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$f;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$j;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$g;Ljava/lang/Object;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$k;Ljava/lang/Object;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 1
    const-string v2, "Invalid numbering system: "

    move-object/from16 v3, p1

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    move-object/from16 v16, p18

    invoke-static/range {v3 .. v16}, Lcom/facebook/hermes/intl/i;->j(Lq1/b;Lcom/facebook/hermes/intl/b$m;Lcom/facebook/hermes/intl/b$d;Lcom/facebook/hermes/intl/b$n;Lcom/facebook/hermes/intl/b$i;Lcom/facebook/hermes/intl/b$c;Lcom/facebook/hermes/intl/b$f;Lcom/facebook/hermes/intl/b$h;Lcom/facebook/hermes/intl/b$j;Lcom/facebook/hermes/intl/b$l;Lcom/facebook/hermes/intl/b$g;Lcom/facebook/hermes/intl/b$b;Lcom/facebook/hermes/intl/b$k;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {p2 .. p2}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface/range {p1 .. p1}, Lq1/b;->e()Lq1/b;

    move-result-object v5

    const-string v6, "ca"

    invoke-interface {v5, v6, v4}, Lq1/b;->g(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-interface {v5}, Lq1/b;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/icu/util/ULocale;

    invoke-static {v4}, Landroid/icu/util/Calendar;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/util/Calendar;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    :try_start_0
    invoke-static/range {p3 .. p3}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/icu/text/NumberingSystem;->getInstanceByName(Ljava/lang/String;)Landroid/icu/text/NumberingSystem;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {p3 .. p3}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "nu"

    move-object/from16 v5, p1

    invoke-interface {v5, v1, v2}, Lq1/b;->g(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_1
    new-instance v3, Lq1/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_0
    new-instance v3, Lq1/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_2
    move-object/from16 v5, p1

    :goto_1
    invoke-interface/range {p1 .. p1}, Lq1/b;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/icu/util/ULocale;

    if-eqz v4, :cond_3

    invoke-static {v4, v3, v1}, Landroid/icu/text/DateFormat;->getPatternInstance(Landroid/icu/util/Calendar;Ljava/lang/String;Landroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    move-result-object v1

    :goto_2
    iput-object v1, v0, Lcom/facebook/hermes/intl/i;->a:Landroid/icu/text/DateFormat;

    goto :goto_3

    :cond_3
    invoke-static {v3, v1}, Landroid/icu/text/DateFormat;->getPatternInstance(Ljava/lang/String;Landroid/icu/util/ULocale;)Landroid/icu/text/DateFormat;

    move-result-object v1

    goto :goto_2

    :goto_3
    invoke-static/range {p15 .. p15}, Lq1/d;->n(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static/range {p15 .. p15}, Lq1/d;->j(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static/range {p15 .. p15}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/icu/util/TimeZone;->getTimeZone(Ljava/lang/String;)Landroid/icu/util/TimeZone;

    move-result-object v1

    iget-object v2, v0, Lcom/facebook/hermes/intl/i;->a:Landroid/icu/text/DateFormat;

    invoke-virtual {v2, v1}, Landroid/icu/text/DateFormat;->setTimeZone(Landroid/icu/util/TimeZone;)V

    :cond_4
    return-void
.end method

.method public g(Ljava/text/AttributedCharacterIterator$Attribute;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/icu/text/DateFormat$Field;->DAY_OF_WEEK:Landroid/icu/text/DateFormat$Field;

    if-ne p1, v0, :cond_0

    const-string p1, "weekday"

    return-object p1

    :cond_0
    sget-object v0, Landroid/icu/text/DateFormat$Field;->ERA:Landroid/icu/text/DateFormat$Field;

    if-ne p1, v0, :cond_1

    const-string p1, "era"

    return-object p1

    :cond_1
    sget-object v0, Landroid/icu/text/DateFormat$Field;->YEAR:Landroid/icu/text/DateFormat$Field;

    if-ne p1, v0, :cond_2

    :try_start_0
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    const-string p1, "year"
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "yearName"

    return-object p1

    :cond_2
    sget-object p2, Landroid/icu/text/DateFormat$Field;->MONTH:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_3

    const-string p1, "month"

    return-object p1

    :cond_3
    sget-object p2, Landroid/icu/text/DateFormat$Field;->DAY_OF_MONTH:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_4

    const-string p1, "day"

    return-object p1

    :cond_4
    sget-object p2, Landroid/icu/text/DateFormat$Field;->HOUR0:Landroid/icu/text/DateFormat$Field;

    const-string v0, "hour"

    if-ne p1, p2, :cond_5

    return-object v0

    :cond_5
    sget-object p2, Landroid/icu/text/DateFormat$Field;->HOUR1:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_6

    return-object v0

    :cond_6
    sget-object p2, Landroid/icu/text/DateFormat$Field;->HOUR_OF_DAY0:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_7

    return-object v0

    :cond_7
    sget-object p2, Landroid/icu/text/DateFormat$Field;->HOUR_OF_DAY1:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_8

    return-object v0

    :cond_8
    sget-object p2, Landroid/icu/text/DateFormat$Field;->MINUTE:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_9

    const-string p1, "minute"

    return-object p1

    :cond_9
    sget-object p2, Landroid/icu/text/DateFormat$Field;->SECOND:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_a

    const-string p1, "second"

    return-object p1

    :cond_a
    sget-object p2, Landroid/icu/text/DateFormat$Field;->TIME_ZONE:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_b

    const-string p1, "timeZoneName"

    return-object p1

    :cond_b
    sget-object p2, Landroid/icu/text/DateFormat$Field;->AM_PM:Landroid/icu/text/DateFormat$Field;

    if-ne p1, p2, :cond_c

    const-string p1, "dayPeriod"

    return-object p1

    :cond_c
    invoke-virtual {p1}, Ljava/text/AttributedCharacterIterator$Attribute;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.icu.text.DateFormat$Field(related year)"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    const-string p1, "relatedYear"

    return-object p1

    :cond_d
    const-string p1, "literal"

    return-object p1
.end method

.method public h(Lq1/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/icu/util/ULocale;

    .line 6
    .line 7
    invoke-static {p1}, Landroid/icu/util/Calendar;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/icu/util/Calendar;->getTimeZone()Landroid/icu/util/TimeZone;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/icu/util/TimeZone;->getID()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

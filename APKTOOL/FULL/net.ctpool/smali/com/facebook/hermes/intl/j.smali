.class public Lcom/facebook/hermes/intl/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/c;


# instance fields
.field private a:Ljava/text/Format;

.field private b:Landroid/icu/text/NumberFormat;

.field private c:Lq1/g;

.field private d:Lcom/facebook/hermes/intl/c$h;

.field private e:Landroid/icu/util/MeasureUnit;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static n(Ljava/lang/String;)I
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Landroid/icu/util/Currency;->getInstance(Ljava/lang/String;)Landroid/icu/util/Currency;

    move-result-object p0

    invoke-virtual {p0}, Landroid/icu/util/Currency;->getDefaultFractionDigits()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    new-instance p0, Lq1/e;

    const-string v0, "Invalid currency code !"

    invoke-direct {p0, v0}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private o(Landroid/icu/text/NumberFormat;Lq1/b;Lcom/facebook/hermes/intl/c$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/facebook/hermes/intl/j;->a:Ljava/text/Format;

    .line 4
    .line 5
    check-cast p2, Lq1/g;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/hermes/intl/j;->c:Lq1/g;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/facebook/hermes/intl/j;->d:Lcom/facebook/hermes/intl/c$h;

    .line 10
    .line 11
    const/4 p2, 0x4

    .line 12
    invoke-virtual {p1, p2}, Landroid/icu/text/NumberFormat;->setRoundingMode(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static p(Ljava/lang/String;)Landroid/icu/util/MeasureUnit;
    .locals 5

    .line 1
    invoke-static {}, Landroid/icu/util/MeasureUnit;->getAvailable()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/icu/util/MeasureUnit;

    invoke-virtual {v1}, Landroid/icu/util/MeasureUnit;->getSubtype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/icu/util/MeasureUnit;->getSubtype()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/icu/util/MeasureUnit;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    return-object v1

    :cond_2
    new-instance v0, Lq1/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown unit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(D)Ljava/text/AttributedCharacterIterator;
    .locals 5

    .line 1
    const-string v0, "en"

    :try_start_0
    iget-object v1, p0, Lcom/facebook/hermes/intl/j;->a:Ljava/text/Format;

    instance-of v2, v1, Landroid/icu/text/MeasureFormat;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/hermes/intl/j;->e:Landroid/icu/util/MeasureUnit;

    if-eqz v2, :cond_0

    new-instance v2, Landroid/icu/util/Measure;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/hermes/intl/j;->e:Landroid/icu/util/MeasureUnit;

    invoke-direct {v2, v3, v4}, Landroid/icu/util/Measure;-><init>(Ljava/lang/Number;Landroid/icu/util/MeasureUnit;)V

    :goto_0
    invoke-virtual {v1, v2}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    return-object p1

    :catch_0
    invoke-static {v0}, Landroid/icu/util/ULocale;->forLanguageTag(Ljava/lang/String;)Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Landroid/icu/text/NumberFormat;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberFormat;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1

    return-object p1

    :catch_1
    :try_start_1
    invoke-static {}, Landroid/icu/util/ULocale;->getDefault()Landroid/icu/util/ULocale;

    move-result-object v1

    invoke-static {v1}, Landroid/icu/text/NumberFormat;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberFormat;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1
.end method

.method public b(D)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->a:Ljava/text/Format;

    instance-of v1, v0, Landroid/icu/text/MeasureFormat;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/hermes/intl/j;->e:Landroid/icu/util/MeasureUnit;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/icu/util/Measure;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/hermes/intl/j;->e:Landroid/icu/util/MeasureUnit;

    invoke-direct {v1, v2, v3}, Landroid/icu/util/Measure;-><init>(Ljava/lang/Number;Landroid/icu/util/MeasureUnit;)V

    :goto_0
    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    return-object p1

    :catch_0
    :try_start_1
    invoke-static {}, Landroid/icu/util/ULocale;->getDefault()Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Landroid/icu/text/NumberFormat;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberFormat;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/icu/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    const-string v0, "en"

    invoke-static {v0}, Landroid/icu/util/ULocale;->forLanguageTag(Ljava/lang/String;)Landroid/icu/util/ULocale;

    move-result-object v0

    invoke-static {v0}, Landroid/icu/text/NumberFormat;->getInstance(Landroid/icu/util/ULocale;)Landroid/icu/text/NumberFormat;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/icu/text/NumberFormat;->format(D)Ljava/lang/String;

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

.method public bridge synthetic d(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/hermes/intl/j;->w(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/j;->u(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/hermes/intl/j;->q(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/hermes/intl/j;->v(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/text/AttributedCharacterIterator$Attribute;D)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Landroid/icu/text/NumberFormat$Field;->SIGN:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, v0, :cond_1

    const-wide/16 v0, 0x0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-ltz p1, :cond_0

    const-string p1, "plusSign"

    return-object p1

    :cond_0
    const-string p1, "minusSign"

    return-object p1

    :cond_1
    sget-object v0, Landroid/icu/text/NumberFormat$Field;->INTEGER:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, v0, :cond_4

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "nan"

    return-object p1

    :cond_2
    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "infinity"

    return-object p1

    :cond_3
    const-string p1, "integer"

    return-object p1

    :cond_4
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->FRACTION:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_5

    const-string p1, "fraction"

    return-object p1

    :cond_5
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->EXPONENT:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_6

    const-string p1, "exponentInteger"

    return-object p1

    :cond_6
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->EXPONENT_SIGN:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_7

    const-string p1, "exponentMinusSign"

    return-object p1

    :cond_7
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->EXPONENT_SYMBOL:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_8

    const-string p1, "exponentSeparator"

    return-object p1

    :cond_8
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->DECIMAL_SEPARATOR:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_9

    const-string p1, "decimal"

    return-object p1

    :cond_9
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->GROUPING_SEPARATOR:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_a

    const-string p1, "group"

    return-object p1

    :cond_a
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->PERCENT:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_b

    const-string p1, "percentSign"

    return-object p1

    :cond_b
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->PERMILLE:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_c

    const-string p1, "permilleSign"

    return-object p1

    :cond_c
    sget-object p2, Landroid/icu/text/NumberFormat$Field;->CURRENCY:Landroid/icu/text/NumberFormat$Field;

    if-ne p1, p2, :cond_d

    const-string p1, "currency"

    return-object p1

    :cond_d
    invoke-virtual {p1}, Ljava/text/AttributedCharacterIterator$Attribute;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.icu.text.NumberFormat$Field(compact)"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const-string p1, "compact"

    return-object p1

    :cond_e
    const-string p1, "literal"

    return-object p1
.end method

.method public bridge synthetic i(I)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/j;->t(I)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Z)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/j;->s(Z)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/hermes/intl/j;->r(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lq1/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/c;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/facebook/hermes/intl/j;->m(Lq1/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public m(Lq1/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/j;
    .locals 2

    .line 1
    const-string v0, "Invalid numbering system: "

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-static {p2}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Landroid/icu/text/NumberingSystem;->getInstanceByName(Ljava/lang/String;)Landroid/icu/text/NumberingSystem;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lq1/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const-string p2, "nu"

    .line 32
    .line 33
    invoke-interface {p1, p2, v0}, Lq1/b;->g(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Lq1/e;

    .line 38
    .line 39
    new-instance p3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Lq1/e;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :catch_0
    new-instance p1, Lq1/e;

    .line 59
    .line 60
    new-instance p3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-direct {p1, p2}, Lq1/e;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_1
    :goto_0
    sget-object p2, Lcom/facebook/hermes/intl/c$e;->p:Lcom/facebook/hermes/intl/c$e;

    .line 80
    .line 81
    if-ne p5, p2, :cond_5

    .line 82
    .line 83
    sget-object p2, Lcom/facebook/hermes/intl/c$h;->m:Lcom/facebook/hermes/intl/c$h;

    .line 84
    .line 85
    if-eq p3, p2, :cond_2

    .line 86
    .line 87
    sget-object p2, Lcom/facebook/hermes/intl/c$h;->p:Lcom/facebook/hermes/intl/c$h;

    .line 88
    .line 89
    if-ne p3, p2, :cond_5

    .line 90
    .line 91
    :cond_2
    sget-object p2, Lcom/facebook/hermes/intl/c$b;->m:Lcom/facebook/hermes/intl/c$b;

    .line 92
    .line 93
    if-ne p6, p2, :cond_3

    .line 94
    .line 95
    sget-object p2, Landroid/icu/text/CompactDecimalFormat$CompactStyle;->SHORT:Landroid/icu/text/CompactDecimalFormat$CompactStyle;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    sget-object p2, Landroid/icu/text/CompactDecimalFormat$CompactStyle;->LONG:Landroid/icu/text/CompactDecimalFormat$CompactStyle;

    .line 99
    .line 100
    :goto_1
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    check-cast p4, Landroid/icu/util/ULocale;

    .line 105
    .line 106
    invoke-static {p4, p2}, Landroid/icu/text/CompactDecimalFormat;->getInstance(Landroid/icu/util/ULocale;Landroid/icu/text/CompactDecimalFormat$CompactStyle;)Landroid/icu/text/CompactDecimalFormat;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :cond_4
    :goto_2
    invoke-direct {p0, p2, p1, p3}, Lcom/facebook/hermes/intl/j;->o(Landroid/icu/text/NumberFormat;Lq1/b;Lcom/facebook/hermes/intl/c$h;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    invoke-virtual {p3, p5, p4}, Lcom/facebook/hermes/intl/c$h;->h(Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$d;)I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    invoke-interface {p1}, Lq1/b;->h()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    check-cast p4, Landroid/icu/util/ULocale;

    .line 123
    .line 124
    invoke-static {p4, p2}, Landroid/icu/text/NumberFormat;->getInstance(Landroid/icu/util/ULocale;I)Landroid/icu/text/NumberFormat;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    sget-object p4, Lcom/facebook/hermes/intl/c$e;->o:Lcom/facebook/hermes/intl/c$e;

    .line 129
    .line 130
    if-ne p5, p4, :cond_4

    .line 131
    .line 132
    const/4 p4, 0x3

    .line 133
    invoke-virtual {p2, p4}, Landroid/icu/text/NumberFormat;->setMaximumIntegerDigits(I)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_3
    return-object p0
.end method

.method public q(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->d:Lcom/facebook/hermes/intl/c$h;

    sget-object v1, Lcom/facebook/hermes/intl/c$h;->o:Lcom/facebook/hermes/intl/c$h;

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Landroid/icu/util/Currency;->getInstance(Ljava/lang/String;)Landroid/icu/util/Currency;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-virtual {v1, v0}, Landroid/icu/text/NumberFormat;->setCurrency(Landroid/icu/util/Currency;)V

    sget-object v1, Lcom/facebook/hermes/intl/c$c;->o:Lcom/facebook/hermes/intl/c$c;

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/j;->c:Lq1/g;

    invoke-virtual {p1}, Lq1/g;->m()Landroid/icu/util/ULocale;

    move-result-object p1

    invoke-virtual {p2}, Lcom/facebook/hermes/intl/c$c;->h()I

    move-result p2

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Landroid/icu/util/Currency;->getName(Landroid/icu/util/ULocale;I[Z)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    instance-of v0, p2, Landroid/icu/text/DecimalFormat;

    if-eqz v0, :cond_1

    check-cast p2, Landroid/icu/text/DecimalFormat;

    invoke-virtual {p2}, Landroid/icu/text/DecimalFormat;->getDecimalFormatSymbols()Landroid/icu/text/DecimalFormatSymbols;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/icu/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/icu/text/DecimalFormat;->setDecimalFormatSymbols(Landroid/icu/text/DecimalFormatSymbols;)V

    :cond_1
    return-object p0
.end method

.method public r(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$f;->n:Lcom/facebook/hermes/intl/c$f;

    if-ne p1, v0, :cond_2

    if-ltz p2, :cond_0

    iget-object p1, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-virtual {p1, p2}, Landroid/icu/text/NumberFormat;->setMinimumFractionDigits(I)V

    :cond_0
    if-ltz p3, :cond_1

    iget-object p1, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-virtual {p1, p3}, Landroid/icu/text/NumberFormat;->setMaximumFractionDigits(I)V

    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    instance-of p2, p1, Landroid/icu/text/DecimalFormat;

    if-eqz p2, :cond_2

    check-cast p1, Landroid/icu/text/DecimalFormat;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/icu/text/DecimalFormat;->setSignificantDigitsUsed(Z)V

    :cond_2
    return-object p0
.end method

.method public s(Z)Lcom/facebook/hermes/intl/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-virtual {v0, p1}, Landroid/icu/text/NumberFormat;->setGroupingUsed(Z)V

    return-object p0
.end method

.method public t(I)Lcom/facebook/hermes/intl/j;
    .locals 1

    .line 1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-virtual {v0, p1}, Landroid/icu/text/NumberFormat;->setMinimumIntegerDigits(I)V

    :cond_0
    return-object p0
.end method

.method public u(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/j;
    .locals 6

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    instance-of v3, v2, Landroid/icu/text/DecimalFormat;

    if-eqz v3, :cond_3

    check-cast v2, Landroid/icu/text/DecimalFormat;

    invoke-virtual {v2}, Landroid/icu/text/DecimalFormat;->getDecimalFormatSymbols()Landroid/icu/text/DecimalFormatSymbols;

    move-result-object v3

    sget-object v4, Lcom/facebook/hermes/intl/j$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v4, p1

    if-eq p1, v1, :cond_2

    const/4 v4, 0x2

    if-eq p1, v4, :cond_0

    const/4 v4, 0x3

    if-eq p1, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/icu/text/DecimalFormat;->getNegativePrefix()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/String;

    invoke-virtual {v3}, Landroid/icu/text/DecimalFormatSymbols;->getPlusSign()C

    move-result v4

    new-array v5, v1, [C

    aput-char v4, v5, v0

    invoke-direct {p1, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setPositivePrefix(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v2}, Landroid/icu/text/DecimalFormat;->getNegativeSuffix()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/String;

    invoke-virtual {v3}, Landroid/icu/text/DecimalFormatSymbols;->getPlusSign()C

    move-result v3

    new-array v1, v1, [C

    aput-char v3, v1, v0

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setPositiveSuffix(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, ""

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setPositivePrefix(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setPositiveSuffix(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setNegativePrefix(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/icu/text/DecimalFormat;->setNegativeSuffix(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object p0
.end method

.method public v(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    instance-of v1, v0, Landroid/icu/text/DecimalFormat;

    if-eqz v1, :cond_3

    sget-object v1, Lcom/facebook/hermes/intl/c$f;->m:Lcom/facebook/hermes/intl/c$f;

    if-ne p1, v1, :cond_3

    check-cast v0, Landroid/icu/text/DecimalFormat;

    if-ltz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/icu/text/DecimalFormat;->setMinimumSignificantDigits(I)V

    :cond_0
    if-ltz p3, :cond_2

    invoke-virtual {v0}, Landroid/icu/text/DecimalFormat;->getMinimumSignificantDigits()I

    move-result p1

    if-lt p3, p1, :cond_1

    invoke-virtual {v0, p3}, Landroid/icu/text/DecimalFormat;->setMaximumSignificantDigits(I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lq1/e;

    const-string p2, "maximumSignificantDigits should be at least equal to minimumSignificantDigits"

    invoke-direct {p1, p2}, Lq1/e;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/icu/text/DecimalFormat;->setSignificantDigitsUsed(Z)V

    :cond_3
    return-object p0
.end method

.method public w(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->d:Lcom/facebook/hermes/intl/c$h;

    sget-object v1, Lcom/facebook/hermes/intl/c$h;->p:Lcom/facebook/hermes/intl/c$h;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lcom/facebook/hermes/intl/j;->p(Ljava/lang/String;)Landroid/icu/util/MeasureUnit;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/j;->e:Landroid/icu/util/MeasureUnit;

    iget-object p1, p0, Lcom/facebook/hermes/intl/j;->c:Lq1/g;

    invoke-virtual {p1}, Lq1/g;->m()Landroid/icu/util/ULocale;

    move-result-object p1

    invoke-virtual {p2}, Lcom/facebook/hermes/intl/c$i;->h()Landroid/icu/text/MeasureFormat$FormatWidth;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/hermes/intl/j;->b:Landroid/icu/text/NumberFormat;

    invoke-static {p1, p2, v0}, Landroid/icu/text/MeasureFormat;->getInstance(Landroid/icu/util/ULocale;Landroid/icu/text/MeasureFormat$FormatWidth;Landroid/icu/text/NumberFormat;)Landroid/icu/text/MeasureFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/hermes/intl/j;->a:Ljava/text/Format;

    :cond_0
    return-object p0
.end method

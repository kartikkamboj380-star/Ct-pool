.class Lcom/facebook/react/views/text/frescosupport/a;
.super LL2/a;
.source "SourceFile"


# instance fields
.field private A:Landroid/net/Uri;

.field private B:Lcom/facebook/react/bridge/ReadableMap;

.field private final C:Lg1/b;

.field private final D:Ljava/lang/Object;

.field private E:F

.field private F:Ljava/lang/String;

.field private G:F

.field private H:I


# direct methods
.method public constructor <init>(Lg1/b;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LL2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->E:F

    .line 7
    .line 8
    iput v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->G:F

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->H:I

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->C:Lg1/b;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/facebook/react/views/text/frescosupport/a;->D:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method private static B1(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "-"

    const-string v1, "_"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    new-instance p1, Landroid/net/Uri$Builder;

    invoke-direct {p1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v0, "res"

    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A1()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->B:Lcom/facebook/react/bridge/ReadableMap;

    return-object v0
.end method

.method public C1()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->A:Landroid/net/Uri;

    return-object v0
.end method

.method public setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "headers"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->B:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    move-result-wide v0

    double-to-float p1, v0

    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->G:F

    goto :goto_1

    :cond_0
    const-string p1, "ReactNative"

    const-string v0, "Inline images must not have percentage based height"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setResizeMode(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "resizeMode"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->F:Ljava/lang/String;

    return-void
.end method

.method public setSource(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "src"
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    const-string v1, "uri"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_3

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v2, :cond_2

    goto :goto_2

    :catch_0
    :cond_2
    move-object v0, v1

    :catch_1
    :goto_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/react/views/text/frescosupport/a;->B1(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :cond_3
    iget-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->A:Landroid/net/Uri;

    if-eq v0, p1, :cond_4

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_4
    iput-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->A:Landroid/net/Uri;

    return-void
.end method

.method public setTintColor(I)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "tintColor"
    .end annotation

    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->H:I

    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    move-result-wide v0

    double-to-float p1, v0

    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->E:F

    goto :goto_1

    :cond_0
    const-string p1, "ReactNative"

    const-string v0, "Inline images must not have percentage based width"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    goto :goto_0

    :goto_1
    return-void
.end method

.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public x1()LM2/n;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->E:F

    .line 10
    .line 11
    float-to-double v0, v0

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    double-to-int v4, v0

    .line 17
    iget v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->G:F

    .line 18
    .line 19
    float-to-double v0, v0

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    double-to-int v3, v0

    .line 25
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/b;

    .line 26
    .line 27
    iget v5, p0, Lcom/facebook/react/views/text/frescosupport/a;->H:I

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->C1()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->A1()Lcom/facebook/react/bridge/ReadableMap;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->z1()Lg1/b;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->y1()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-object v10, p0, Lcom/facebook/react/views/text/frescosupport/a;->F:Ljava/lang/String;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    invoke-direct/range {v1 .. v10}, Lcom/facebook/react/views/text/frescosupport/b;-><init>(Landroid/content/res/Resources;IIILandroid/net/Uri;Lcom/facebook/react/bridge/ReadableMap;Lg1/b;Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public y1()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public z1()Lg1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->C:Lg1/b;

    .line 2
    .line 3
    return-object v0
.end method

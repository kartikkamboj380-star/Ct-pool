.class Lcom/facebook/react/animated/f;
.super Lcom/facebook/react/animated/b;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/animated/d;


# instance fields
.field private final e:Lcom/facebook/react/animated/p;

.field private final f:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Lcom/facebook/react/bridge/ReadableMap;

.field private l:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iput-object p3, p0, Lcom/facebook/react/animated/f;->f:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/f;->a(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method private j()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/f;->f:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/facebook/react/animated/f;->k(Lcom/facebook/react/animated/b;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method private static k(Lcom/facebook/react/animated/b;)Landroid/content/Context;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/facebook/react/animated/b;->a:Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/animated/b;

    instance-of v1, p0, Lcom/facebook/react/animated/r;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/facebook/react/animated/r;

    invoke-virtual {p0}, Lcom/facebook/react/animated/r;->k()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    invoke-static {p0}, Lcom/facebook/react/animated/f;->k(Lcom/facebook/react/animated/b;)Landroid/content/Context;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method private l()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/f;->k:Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/react/animated/f;->l:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/animated/f;->j()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/animated/f;->k:Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v2, p0, Lcom/facebook/react/animated/f;->g:I

    invoke-virtual {v1, v2}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/B;

    iget-object v2, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v3, p0, Lcom/facebook/react/animated/f;->h:I

    invoke-virtual {v2, v3}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/B;

    iget-object v3, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v4, p0, Lcom/facebook/react/animated/f;->i:I

    invoke-virtual {v3, v4}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/animated/B;

    iget-object v4, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v5, p0, Lcom/facebook/react/animated/f;->j:I

    invoke-virtual {v4, v5}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/animated/B;

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v5

    int-to-double v5, v5

    iput-wide v5, v1, Lcom/facebook/react/animated/B;->e:D

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    int-to-double v5, v1

    iput-wide v5, v2, Lcom/facebook/react/animated/B;->e:D

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    int-to-double v1, v1

    iput-wide v1, v3, Lcom/facebook/react/animated/B;->e:D

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x406fe00000000000L    # 255.0

    div-double/2addr v0, v2

    iput-wide v0, v4, Lcom/facebook/react/animated/B;->e:D

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/animated/f;->l:Z

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    const-string v0, "r"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/react/animated/f;->g:I

    const-string v0, "g"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/react/animated/f;->h:I

    const-string v0, "b"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/react/animated/f;->i:I

    const-string v0, "a"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/react/animated/f;->j:I

    const-string v0, "nativeColor"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/animated/f;->k:Lcom/facebook/react/bridge/ReadableMap;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/animated/f;->l:Z

    invoke-direct {p0}, Lcom/facebook/react/animated/f;->l()V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColorAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: r: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/f;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " g: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/f;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " b: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/f;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " a: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/f;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()I
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/f;->l()V

    iget-object v0, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v1, p0, Lcom/facebook/react/animated/f;->g:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/animated/B;

    iget-object v1, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v2, p0, Lcom/facebook/react/animated/f;->h:I

    invoke-virtual {v1, v2}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/animated/B;

    iget-object v2, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v3, p0, Lcom/facebook/react/animated/f;->i:I

    invoke-virtual {v2, v3}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/B;

    iget-object v3, p0, Lcom/facebook/react/animated/f;->e:Lcom/facebook/react/animated/p;

    iget v4, p0, Lcom/facebook/react/animated/f;->j:I

    invoke-virtual {v3, v4}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v4

    invoke-virtual {v1}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v6

    invoke-virtual {v2}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v8

    invoke-virtual {v3}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v10

    invoke-static/range {v4 .. v11}, Lcom/facebook/react/views/view/d;->b(DDDD)I

    move-result v0

    return v0
.end method

.class Lcom/facebook/react/views/text/frescosupport/b;
.super LM2/n;
.source "SourceFile"


# instance fields
.field private n:Landroid/graphics/drawable/Drawable;

.field private final o:Lg1/b;

.field private final p:Ln1/b;

.field private final q:Ljava/lang/Object;

.field private r:I

.field private s:I

.field private t:Landroid/net/Uri;

.field private u:I

.field private v:Lcom/facebook/react/bridge/ReadableMap;

.field private w:Ljava/lang/String;

.field private x:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;IIILandroid/net/Uri;Lcom/facebook/react/bridge/ReadableMap;Lg1/b;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LM2/n;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ln1/b;

    .line 5
    .line 6
    invoke-static {p1}, Lk1/b;->t(Landroid/content/res/Resources;)Lk1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lk1/b;->a()Lk1/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ln1/b;-><init>(Lm1/b;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/facebook/react/views/text/frescosupport/b;->o:Lg1/b;

    .line 20
    .line 21
    iput-object p8, p0, Lcom/facebook/react/views/text/frescosupport/b;->q:Ljava/lang/Object;

    .line 22
    .line 23
    iput p4, p0, Lcom/facebook/react/views/text/frescosupport/b;->s:I

    .line 24
    .line 25
    if-eqz p5, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 29
    .line 30
    :goto_0
    iput-object p5, p0, Lcom/facebook/react/views/text/frescosupport/b;->t:Landroid/net/Uri;

    .line 31
    .line 32
    iput-object p6, p0, Lcom/facebook/react/views/text/frescosupport/b;->v:Lcom/facebook/react/bridge/ReadableMap;

    .line 33
    .line 34
    int-to-float p1, p3

    .line 35
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/b;->u:I

    .line 41
    .line 42
    int-to-float p1, p2

    .line 43
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    float-to-int p1, p1

    .line 48
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/b;->r:I

    .line 49
    .line 50
    iput-object p9, p0, Lcom/facebook/react/views/text/frescosupport/b;->w:Ljava/lang/String;

    .line 51
    .line 52
    return-void
.end method

.method private i(Ljava/lang/String;)Lj1/p$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/image/d;->c(Ljava/lang/String;)Lj1/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->r:I

    return v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {v0}, Ln1/b;->k()V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {v0}, Ln1/b;->l()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->t:Landroid/net/Uri;

    invoke-static {p2}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    move-result-object p2

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->v:Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {p2, p3}, Lp2/a;->z(LJ1/c;Lcom/facebook/react/bridge/ReadableMap;)Lp2/a;

    move-result-object p2

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {p3}, Ln1/b;->h()Lm1/b;

    move-result-object p3

    check-cast p3, Lk1/a;

    iget-object p4, p0, Lcom/facebook/react/views/text/frescosupport/b;->w:Ljava/lang/String;

    invoke-direct {p0, p4}, Lcom/facebook/react/views/text/frescosupport/b;->i(Ljava/lang/String;)Lj1/p$b;

    move-result-object p4

    invoke-virtual {p3, p4}, Lk1/a;->v(Lj1/p$b;)V

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->o:Lg1/b;

    invoke-virtual {p3}, Lg1/b;->x()Lg1/b;

    move-result-object p3

    iget-object p4, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {p4}, Ln1/b;->g()Lm1/a;

    move-result-object p4

    invoke-virtual {p3, p4}, Lg1/b;->D(Lm1/a;)Lg1/b;

    move-result-object p3

    iget-object p4, p0, Lcom/facebook/react/views/text/frescosupport/b;->q:Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lg1/b;->z(Ljava/lang/Object;)Lg1/b;

    move-result-object p3

    invoke-virtual {p3, p2}, Lg1/b;->B(Ljava/lang/Object;)Lg1/b;

    move-result-object p2

    invoke-virtual {p2}, Lg1/b;->a()Lg1/a;

    move-result-object p2

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {p3, p2}, Ln1/b;->p(Lm1/a;)V

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->o:Lg1/b;

    invoke-virtual {p2}, Lg1/b;->x()Lg1/b;

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {p2}, Ln1/b;->i()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    iget p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->u:I

    iget p4, p0, Lcom/facebook/react/views/text/frescosupport/b;->r:I

    const/4 p6, 0x0

    invoke-virtual {p2, p6, p6, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->s:I

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    sget-object p4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p3, p2, p4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->x:Landroid/widget/TextView;

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p9}, Landroid/graphics/Paint;->descent()F

    move-result p2

    invoke-virtual {p9}, Landroid/graphics/Paint;->ascent()F

    move-result p3

    sub-float/2addr p2, p3

    float-to-int p2, p2

    invoke-virtual {p9}, Landroid/graphics/Paint;->descent()F

    move-result p3

    float-to-int p3, p3

    add-int/2addr p7, p3

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p7, p2

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p2

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    iget-object p3, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p3

    iget p3, p3, Landroid/graphics/Rect;->top:I

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    sub-int/2addr p7, p2

    int-to-float p2, p7

    invoke-virtual {p1, p5, p2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p2, p0, Lcom/facebook/react/views/text/frescosupport/b;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {v0}, Ln1/b;->k()V

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/b;->p:Ln1/b;

    invoke-virtual {v0}, Ln1/b;->l()V

    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/facebook/react/views/text/frescosupport/b;->r:I

    neg-int p1, p1

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    const/4 p2, 0x0

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :cond_0
    iget p1, p0, Lcom/facebook/react/views/text/frescosupport/b;->u:I

    return p1
.end method

.method public h(Landroid/widget/TextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/b;->x:Landroid/widget/TextView;

    return-void
.end method

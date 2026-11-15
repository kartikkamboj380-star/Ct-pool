.class public Lcom/facebook/react/views/text/h;
.super Lcom/facebook/react/views/text/c;
.source "SourceFile"


# static fields
.field private static final f0:Landroid/text/TextPaint;


# instance fields
.field private b0:Landroid/text/Spannable;

.field private c0:Z

.field private final d0:Lcom/facebook/yoga/o;

.field private final e0:Lcom/facebook/yoga/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    sput-object v0, Lcom/facebook/react/views/text/h;->f0:Landroid/text/TextPaint;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/c;-><init>(Lcom/facebook/react/views/text/n;)V

    new-instance p1, Lcom/facebook/react/views/text/h$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/text/h$a;-><init>(Lcom/facebook/react/views/text/h;)V

    iput-object p1, p0, Lcom/facebook/react/views/text/h;->d0:Lcom/facebook/yoga/o;

    new-instance p1, Lcom/facebook/react/views/text/h$b;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/text/h$b;-><init>(Lcom/facebook/react/views/text/h;)V

    iput-object p1, p0, Lcom/facebook/react/views/text/h;->e0:Lcom/facebook/yoga/b;

    invoke-direct {p0}, Lcom/facebook/react/views/text/h;->E1()V

    return-void
.end method

.method static bridge synthetic A1(Lcom/facebook/react/views/text/h;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/text/h;->c0:Z

    return p0
.end method

.method static bridge synthetic B1(Lcom/facebook/react/views/text/h;Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/text/h;->F1(Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic C1()Landroid/text/TextPaint;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/h;->f0:Landroid/text/TextPaint;

    return-object v0
.end method

.method private D1()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/c;->I:I

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->h0()Lcom/facebook/yoga/h;

    move-result-object v1

    sget-object v2, Lcom/facebook/yoga/h;->p:Lcom/facebook/yoga/h;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x3

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    if-ne v0, v1, :cond_1

    move v0, v2

    :cond_1
    :goto_0
    return v0
.end method

.method private E1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/text/h;->d0:Lcom/facebook/yoga/o;

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->Y0(Lcom/facebook/yoga/o;)V

    iget-object v0, p0, Lcom/facebook/react/views/text/h;->e0:Lcom/facebook/yoga/b;

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->G0(Lcom/facebook/yoga/b;)V

    :cond_0
    return-void
.end method

.method private F1(Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;
    .locals 11

    .line 1
    sget-object v1, Lcom/facebook/react/views/text/h;->f0:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-static {p1, v1}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-static {p1, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_0
    sget-object v2, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq p3, v2, :cond_2

    cmpg-float p3, p2, v3

    if-gez p3, :cond_1

    goto :goto_1

    :cond_1
    move p3, v5

    goto :goto_2

    :cond_2
    :goto_1
    move p3, v4

    :goto_2
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-direct {p0}, Lcom/facebook/react/views/text/h;->D1()I

    move-result v7

    if-eq v7, v4, :cond_5

    const/4 v8, 0x3

    if-eq v7, v8, :cond_3

    const/4 v8, 0x5

    if-eq v7, v8, :cond_4

    :cond_3
    :goto_3
    move-object v7, v2

    goto :goto_4

    :cond_4
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_3

    :cond_5
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_3

    :goto_4
    const/16 v2, 0x1c

    const/high16 v8, 0x3f800000    # 1.0f

    if-nez v6, :cond_9

    if-nez p3, :cond_6

    invoke-static {v0}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v9

    if-nez v9, :cond_9

    cmpg-float v9, v0, p2

    if-gtz v9, :cond_9

    :cond_6
    float-to-double p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p2

    double-to-int p2, p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    invoke-static {p1, v5, p3, v1, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v3, v8}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget-boolean p2, p0, Lcom/facebook/react/views/text/c;->S:Z

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget p2, p0, Lcom/facebook/react/views/text/c;->J:I

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget p2, p0, Lcom/facebook/react/views/text/c;->K:I

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_7

    iget p3, p0, Lcom/facebook/react/views/text/c;->L:I

    invoke-static {p1, p3}, Lcom/facebook/react/views/text/f;->a(Landroid/text/StaticLayout$Builder;I)Landroid/text/StaticLayout$Builder;

    :cond_7
    if-lt p2, v2, :cond_8

    :goto_5
    invoke-static {p1, v4}, Lcom/facebook/react/views/text/g;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    :cond_8
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    goto :goto_6

    :cond_9
    if-eqz v6, :cond_b

    if-nez p3, :cond_a

    iget p3, v6, Landroid/text/BoringLayout$Metrics;->width:I

    int-to-float p3, p3

    cmpg-float p3, p3, p2

    if-gtz p3, :cond_b

    :cond_a
    iget p2, v6, Landroid/text/BoringLayout$Metrics;->width:I

    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v5, 0x0

    iget-boolean p2, p0, Lcom/facebook/react/views/text/c;->S:Z

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p1

    move-object v3, v7

    move v7, p2

    invoke-static/range {v0 .. v7}, Landroid/text/BoringLayout;->make(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)Landroid/text/BoringLayout;

    move-result-object p1

    goto :goto_6

    :cond_b
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-le p3, v0, :cond_c

    float-to-double v9, p2

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-float p2, v9

    :cond_c
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    float-to-int p2, p2

    invoke-static {p1, v5, v0, v1, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, v3, v8}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget-boolean p2, p0, Lcom/facebook/react/views/text/c;->S:Z

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget p2, p0, Lcom/facebook/react/views/text/c;->J:I

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    iget p2, p0, Lcom/facebook/react/views/text/c;->K:I

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    if-lt p3, v2, :cond_8

    goto :goto_5

    :goto_6
    return-object p1
.end method

.method static bridge synthetic z1(Lcom/facebook/react/views/text/h;)Landroid/text/Spannable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/text/h;->b0:Landroid/text/Spannable;

    return-object p0
.end method


# virtual methods
.method public A0(Lcom/facebook/react/uimanager/p0;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->A0(Lcom/facebook/react/uimanager/p0;)V

    iget-object v1, p0, Lcom/facebook/react/views/text/h;->b0:Landroid/text/Spannable;

    if-eqz v1, :cond_0

    new-instance v11, Lcom/facebook/react/views/text/i;

    iget-boolean v3, p0, Lcom/facebook/react/views/text/c;->Z:Z

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v5

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v6

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v7

    invoke-direct {p0}, Lcom/facebook/react/views/text/h;->D1()I

    move-result v8

    iget v9, p0, Lcom/facebook/react/views/text/c;->J:I

    iget v10, p0, Lcom/facebook/react/views/text/c;->L:I

    const/4 v2, -0x1

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZFFFFIII)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->r()I

    move-result v0

    invoke-virtual {p1, v0, v11}, Lcom/facebook/react/uimanager/p0;->O(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public W(Lcom/facebook/react/uimanager/D;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p0, v0, v1, p1}, Lcom/facebook/react/views/text/c;->y1(Lcom/facebook/react/views/text/c;Ljava/lang/String;ZLcom/facebook/react/uimanager/D;)Landroid/text/Spannable;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/text/h;->b0:Landroid/text/Spannable;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/h;->y0()V

    return-void
.end method

.method public o()Ljava/lang/Iterable;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/c;->a0:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/text/h;->b0:Landroid/text/Spannable;

    const-string v1, "Spannable element has not been prepared in onBeforeLayout"

    invoke-static {v0, v1}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/o;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/o;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    iget-object v5, p0, Lcom/facebook/react/views/text/c;->a0:Ljava/util/Map;

    invoke-virtual {v4}, LM2/o;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/uimanager/U;

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->t()V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public p0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public setShouldNotifyOnTextLayout(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onTextLayout"
    .end annotation

    iput-boolean p1, p0, Lcom/facebook/react/views/text/h;->c0:Z

    return-void
.end method

.method public v0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public y0()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    invoke-super {p0}, Lcom/facebook/react/uimanager/V;->i()V

    return-void
.end method

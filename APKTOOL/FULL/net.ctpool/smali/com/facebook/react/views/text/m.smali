.class public Lcom/facebook/react/views/text/m;
.super Landroidx/appcompat/widget/D;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/M;


# static fields
.field private static final G:Landroid/view/ViewGroup$LayoutParams;


# instance fields
.field private A:I

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Lcom/facebook/react/views/view/g;

.field private F:Landroid/text/Spannable;

.field private t:Z

.field private u:I

.field private v:Landroid/text/TextUtils$TruncateAt;

.field private w:Z

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/facebook/react/views/text/m;->G:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/D;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/facebook/react/views/text/m;->s()V

    return-void
.end method

.method private getReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/widget/e0;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/appcompat/widget/e0;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    return-object v0
.end method

.method private r()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/m;->x:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iget v1, p0, Lcom/facebook/react/views/text/m;->x:F

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/D;->setTextSize(IF)V

    :cond_0
    iget v0, p0, Lcom/facebook/react/views/text/m;->z:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/facebook/react/views/text/m;->z:F

    invoke-super {p0, v0}, Landroid/widget/TextView;->setLetterSpacing(F)V

    :cond_1
    return-void
.end method

.method private s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/views/view/g;->a()V

    :cond_0
    new-instance v0, Lcom/facebook/react/views/view/g;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/view/g;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    const v0, 0x7fffffff

    iput v0, p0, Lcom/facebook/react/views/text/m;->u:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->w:Z

    iput v0, p0, Lcom/facebook/react/views/text/m;->A:I

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->B:Z

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->C:Z

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->D:Z

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    iput-object v0, p0, Lcom/facebook/react/views/text/m;->v:Landroid/text/TextUtils$TruncateAt;

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lcom/facebook/react/views/text/m;->x:F

    iput v0, p0, Lcom/facebook/react/views/text/m;->y:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/views/text/m;->z:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/text/m;->F:Landroid/text/Spannable;

    return-void
.end method

.method private static t(IIIIII)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const/16 v1, 0x8

    const-string v2, "index"

    const-string v3, "visibility"

    if-ne p0, v1, :cond_0

    const-string p0, "gone"

    :goto_0
    invoke-interface {v0, v3, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    if-nez p0, :cond_1

    const-string p0, "visible"

    invoke-interface {v0, v3, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    int-to-float p0, p2

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p0

    float-to-double p0, p0

    const-string p2, "left"

    invoke-interface {v0, p2, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    int-to-float p0, p3

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p0

    float-to-double p0, p0

    const-string p2, "top"

    invoke-interface {v0, p2, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    int-to-float p0, p4

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p0

    float-to-double p0, p0

    const-string p2, "right"

    invoke-interface {v0, p2, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    int-to-float p0, p5

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p0

    float-to-double p0, p0

    const-string p2, "bottom"

    invoke-interface {v0, p2, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_1

    :cond_1
    const-string p0, "unknown"

    goto :goto_0

    :goto_1
    return-object v0
.end method


# virtual methods
.method protected dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-static {p0}, Landroidx/core/view/H;->N(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Landroidx/core/view/H;->l(Landroid/view/View;)Landroidx/core/view/a;

    move-result-object v0

    instance-of v1, v0, LA/a;

    if-eqz v1, :cond_2

    check-cast v0, LA/a;

    invoke-virtual {v0, p1}, LA/a;->v(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method getGravityHorizontal()I
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    const v1, 0x800007

    and-int/2addr v0, v1

    return v0
.end method

.method public getSpanned()Landroid/text/Spannable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/m;->F:Landroid/text/Spannable;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->C:Z

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setTextIsSelectable(Z)V

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->c()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->d()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/text/m;->getSpanned()Landroid/text/Spannable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->D:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->D:Z

    invoke-virtual {p0}, Lcom/facebook/react/views/text/m;->getSpanned()Landroid/text/Spannable;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v2, v0

    sget-object v5, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v4, v0

    iget v0, p0, Lcom/facebook/react/views/text/m;->y:F

    float-to-double v6, v0

    iget v8, p0, Lcom/facebook/react/views/text/m;->u:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v9

    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v10

    invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I

    move-result v11

    sget-object v12, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    move-object v3, v5

    invoke-static/range {v1 .. v12}, Lcom/facebook/react/views/text/s;->a(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;DIZIILandroid/text/Layout$Alignment;)V

    invoke-virtual {p0}, Lcom/facebook/react/views/text/m;->getSpanned()Landroid/text/Spannable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->d(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onFinishTemporaryDetach()V

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->e()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 23

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Spanned;

    if-eqz v2, :cond_14

    invoke-static {v1}, Ly2/a;->a(I)I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    goto/16 :goto_13

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/text/m;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v2

    const-class v3, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {v2, v3}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-static {v2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    check-cast v3, Landroid/text/Spanned;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const-class v6, LM2/o;

    const/4 v7, 0x0

    invoke-interface {v3, v7, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LM2/o;

    iget-boolean v6, v0, Lcom/facebook/react/views/text/m;->B:Z

    if-eqz v6, :cond_2

    new-instance v6, Ljava/util/ArrayList;

    array-length v8, v5

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    sub-int v8, p4, p2

    sub-int v9, p5, p3

    array-length v10, v5

    move v11, v7

    :goto_1
    if-ge v11, v10, :cond_12

    aget-object v12, v5, v11

    invoke-virtual {v12}, LM2/o;->b()I

    move-result v13

    invoke-virtual {v2, v13}, Lcom/facebook/react/uimanager/UIManagerModule;->resolveView(I)Landroid/view/View;

    move-result-object v13

    invoke-interface {v3, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v15

    invoke-virtual {v4, v15}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v14

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v16

    if-lez v16, :cond_4

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineStart(I)I

    move-result v16

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v17

    add-int v7, v16, v17

    if-ge v15, v7, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move/from16 v21, v1

    move-object/from16 v22, v3

    move-object/from16 v20, v5

    move/from16 p5, v10

    const/16 v1, 0x8

    goto/16 :goto_10

    :cond_4
    :goto_3
    iget v7, v0, Lcom/facebook/react/views/text/m;->u:I

    if-ge v14, v7, :cond_3

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v7

    if-lt v15, v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v12}, LM2/o;->c()I

    move-result v7

    invoke-virtual {v12}, LM2/o;->a()I

    move-result v12

    move-object/from16 v20, v5

    invoke-virtual {v4, v15}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v5

    move/from16 p5, v10

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v10

    move/from16 v21, v1

    const/4 v1, -0x1

    const/16 v16, 0x1

    if-ne v10, v1, :cond_6

    move/from16 v1, v16

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    if-ne v15, v10, :cond_a

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-lez v10, :cond_7

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-interface {v3, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    move-object/from16 v22, v3

    const/16 v3, 0xa

    if-ne v10, v3, :cond_8

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineMax(I)F

    move-result v3

    goto :goto_5

    :cond_7
    move-object/from16 v22, v3

    :cond_8
    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v3

    :goto_5
    if-eqz v1, :cond_9

    float-to-int v1, v3

    sub-int v1, v8, v1

    goto :goto_a

    :cond_9
    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    float-to-int v1, v1

    goto :goto_9

    :cond_a
    move-object/from16 v22, v3

    if-ne v1, v5, :cond_b

    invoke-virtual {v4, v15}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v3

    :goto_6
    float-to-int v3, v3

    goto :goto_7

    :cond_b
    invoke-virtual {v4, v15}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result v3

    goto :goto_6

    :goto_7
    if-eqz v1, :cond_c

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v1, v3

    sub-int v1, v8, v1

    goto :goto_8

    :cond_c
    move v1, v3

    :goto_8
    if-eqz v5, :cond_d

    :goto_9
    sub-int/2addr v1, v7

    :cond_d
    :goto_a
    if-eqz v5, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v3

    :goto_b
    add-int/2addr v1, v3

    goto :goto_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v3

    goto :goto_b

    :goto_c
    add-int v3, p2, v1

    invoke-virtual/range {p0 .. p0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v5

    invoke-virtual {v4, v14}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result v10

    add-int/2addr v5, v10

    sub-int/2addr v5, v12

    add-int v10, p3, v5

    if-le v8, v1, :cond_10

    if-gt v9, v5, :cond_f

    goto :goto_d

    :cond_f
    const/4 v14, 0x0

    goto :goto_e

    :cond_10
    :goto_d
    const/16 v14, 0x8

    :goto_e
    add-int v1, v3, v7

    add-int v5, v10, v12

    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v13, v3, v10, v1, v5}, Landroid/view/View;->layout(IIII)V

    iget-boolean v7, v0, Lcom/facebook/react/views/text/m;->B:Z

    if-eqz v7, :cond_11

    move/from16 v16, v3

    move/from16 v17, v10

    move/from16 v18, v1

    move/from16 v19, v5

    :goto_f
    invoke-static/range {v14 .. v19}, Lcom/facebook/react/views/text/m;->t(IIIIII)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :goto_10
    invoke-virtual {v13, v1}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v1, v0, Lcom/facebook/react/views/text/m;->B:Z

    if-eqz v1, :cond_11

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v14, 0x8

    const/16 v16, -0x1

    const/16 v17, -0x1

    goto :goto_f

    :cond_11
    :goto_11
    add-int/lit8 v11, v11, 0x1

    move/from16 v10, p5

    move-object/from16 v5, v20

    move/from16 v1, v21

    move-object/from16 v3, v22

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_12
    move/from16 v21, v1

    iget-boolean v1, v0, Lcom/facebook/react/views/text/m;->B:Z

    if-eqz v1, :cond_14

    new-instance v1, Lcom/facebook/react/views/text/m$a;

    invoke-direct {v1, v0}, Lcom/facebook/react/views/text/m$a;-><init>(Lcom/facebook/react/views/text/m;)V

    invoke-static {v6, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v1

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/bridge/WritableMap;

    invoke-interface {v1, v4}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_12

    :cond_13
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    const-string v4, "inlineViews"

    invoke-interface {v3, v4, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    if-eqz v2, :cond_14

    const-string v1, "topInlineViewLayout"

    move/from16 v4, v21

    invoke-virtual {v2, v4, v1, v3}, Lcom/facebook/react/uimanager/UIManagerModule;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    :cond_14
    :goto_13
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onStartTemporaryDetach()V

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->f()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public reactTagForTouch(FF)I
    .locals 6

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {v2, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p2

    invoke-virtual {v2, p2}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v2, p2}, Landroid/text/Layout;->getLineRight(I)F

    move-result v4

    float-to-int v4, v4

    instance-of v5, v0, Landroid/text/Spanned;

    if-eqz v5, :cond_2

    if-lt p1, v3, :cond_2

    if-gt p1, v4, :cond_2

    move-object v3, v0

    check-cast v3, Landroid/text/Spanned;

    int-to-float p1, p1

    :try_start_0
    invoke-virtual {v2, p2, p1}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const-class p2, LM2/j;

    invoke-interface {v3, p1, p1, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [LM2/j;

    if-eqz p2, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    array-length v4, p2

    if-ge v2, v4, :cond_2

    aget-object v4, p2, v2

    invoke-interface {v3, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    aget-object v5, p2, v2

    invoke-interface {v3, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-lt v5, p1, :cond_1

    sub-int/2addr v5, v4

    if-gt v5, v0, :cond_1

    aget-object v0, p2, v2

    invoke-virtual {v0}, LM2/j;->a()I

    move-result v0

    move v1, v0

    move v0, v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Crash in HorizontalMeasurementProvider: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v1
.end method

.method public setAdjustFontSizeToFit(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->w:Z

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->e(I)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->g(F)V

    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public setBreakStrategy(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setBreakStrategy(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setEllipsizeLocation(Landroid/text/TextUtils$TruncateAt;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/text/m;->v:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public setFontSize(F)V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->w:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->f(F)F

    move-result p1

    :goto_0
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p1, v0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    goto :goto_0

    :goto_1
    iput p1, p0, Lcom/facebook/react/views/text/m;->x:F

    invoke-direct {p0}, Lcom/facebook/react/views/text/m;->r()V

    return-void
.end method

.method setGravityHorizontal(I)V
    .locals 2

    if-nez p1, :cond_0

    const p1, 0x800003

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    const v1, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method setGravityVertical(I)V
    .locals 1

    if-nez p1, :cond_0

    const/16 p1, 0x30

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method public setHyphenationFrequency(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setIncludeFontPadding(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setLetterSpacing(F)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/text/m;->x:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/facebook/react/views/text/m;->z:F

    invoke-direct {p0}, Lcom/facebook/react/views/text/m;->r()V

    return-void
.end method

.method public setLinkifyMask(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/text/m;->A:I

    return-void
.end method

.method public setMinimumFontSize(F)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/text/m;->y:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setNotifyOnInlineViewLayout(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->B:Z

    return-void
.end method

.method public setNumberOfLines(I)V
    .locals 0

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/m;->u:I

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public setSpanned(Landroid/text/Spannable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/text/m;->F:Landroid/text/Spannable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->D:Z

    return-void
.end method

.method public setText(Lcom/facebook/react/views/text/i;)V
    .locals 6

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/text/m;->G:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/views/text/m;->A:I

    if-lez v1, :cond_1

    invoke-static {v0, v1}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->f()F

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->h()F

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->g()F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->e()F

    move-result v3

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v5, v0, v4

    if-eqz v5, :cond_2

    cmpl-float v5, v1, v4

    if-eqz v5, :cond_2

    cmpl-float v5, v2, v4

    if-eqz v5, :cond_2

    cmpl-float v4, v3, v4

    if-eqz v4, :cond_2

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v0, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v1, v4

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v2, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_2
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->j()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/text/m;->getGravityHorizontal()I

    move-result v1

    if-eq v0, v1, :cond_3

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setGravityHorizontal(I)V

    :cond_3
    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->k()I

    move-result v1

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setBreakStrategy(I)V

    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_5

    invoke-static {p0}, Lcom/facebook/react/views/text/l;->a(Lcom/facebook/react/views/text/m;)I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->d()I

    move-result v1

    if-eq v0, v1, :cond_5

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->d()I

    move-result p1

    invoke-static {p0, p1}, Lcom/facebook/react/views/text/j;->a(Lcom/facebook/react/views/text/m;I)V

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTextIsSelectable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/m;->C:Z

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    return-void
.end method

.method u()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/m;->s()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setBreakStrategy(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getDefaultMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {p0, v0}, Lcom/facebook/react/views/text/j;->a(Lcom/facebook/react/views/text/m;I)V

    :cond_0
    sget-object v3, Lcom/facebook/react/views/text/m;->G:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v3, 0x0

    invoke-super {p0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/facebook/react/views/text/m;->r()V

    const v3, 0x800033

    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setGravity(I)V

    iget v3, p0, Lcom/facebook/react/views/text/m;->u:I

    invoke-virtual {p0, v3}, Lcom/facebook/react/views/text/m;->setNumberOfLines(I)V

    iget-boolean v3, p0, Lcom/facebook/react/views/text/m;->w:Z

    invoke-virtual {p0, v3}, Lcom/facebook/react/views/text/m;->setAdjustFontSizeToFit(Z)V

    iget v3, p0, Lcom/facebook/react/views/text/m;->A:I

    invoke-virtual {p0, v3}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    iget-boolean v3, p0, Lcom/facebook/react/views/text/m;->C:Z

    invoke-virtual {p0, v3}, Lcom/facebook/react/views/text/m;->setTextIsSelectable(Z)V

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Lcom/facebook/react/views/text/m;->setIncludeFontPadding(Z)V

    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    iget-object v4, p0, Lcom/facebook/react/views/text/m;->v:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p0, v4}, Lcom/facebook/react/views/text/m;->setEllipsizeLocation(Landroid/text/TextUtils$TruncateAt;)V

    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    if-lt v1, v2, :cond_1

    const/16 v1, 0x10

    invoke-static {p0, v1}, Lcom/facebook/react/views/text/k;->a(Lcom/facebook/react/views/text/m;I)V

    :cond_1
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/m;->setHyphenationFrequency(I)V

    invoke-virtual {p0}, Lcom/facebook/react/views/text/m;->y()V

    return-void
.end method

.method public v(IFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/views/view/g;->f(IFF)V

    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->t:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/D;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    return p1
.end method

.method public w(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->h(FI)V

    return-void
.end method

.method public x(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->E:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->j(IF)V

    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/m;->u:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/facebook/react/views/text/m;->w:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/text/m;->v:Landroid/text/TextUtils$TruncateAt;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    return-void
.end method

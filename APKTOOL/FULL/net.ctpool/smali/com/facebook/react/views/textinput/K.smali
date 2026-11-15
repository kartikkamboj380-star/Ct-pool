.class public Lcom/facebook/react/views/textinput/K;
.super Lcom/facebook/react/views/text/c;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/yoga/o;


# instance fields
.field private b0:I

.field private c0:Landroid/widget/EditText;

.field private d0:Lcom/facebook/react/views/textinput/r;

.field private e0:Ljava/lang/String;

.field private f0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/K;-><init>(Lcom/facebook/react/views/text/n;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/c;-><init>(Lcom/facebook/react/views/text/n;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/textinput/K;->b0:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->e0:Ljava/lang/String;

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->f0:Ljava/lang/String;

    const/4 p1, 0x1

    iput p1, p0, Lcom/facebook/react/views/text/c;->J:I

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/K;->C1()V

    return-void
.end method

.method private C1()V
    .locals 0

    .line 1
    invoke-virtual {p0, p0}, Lcom/facebook/react/uimanager/V;->Y0(Lcom/facebook/yoga/o;)V

    return-void
.end method


# virtual methods
.method public A(Lcom/facebook/react/uimanager/e0;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->A(Lcom/facebook/react/uimanager/e0;)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/K;->z1()Landroid/widget/EditText;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/V;->K0(IF)V

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/V;->K0(IF)V

    invoke-static {p1}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/V;->K0(IF)V

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/uimanager/V;->K0(IF)V

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->c0:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    iget-object p1, p0, Lcom/facebook/react/views/textinput/K;->c0:Landroid/widget/EditText;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public A0(Lcom/facebook/react/uimanager/p0;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->A0(Lcom/facebook/react/uimanager/p0;)V

    iget v0, p0, Lcom/facebook/react/views/textinput/K;->b0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/facebook/react/views/text/i;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/K;->B1()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, p0, v1, v3, v2}, Lcom/facebook/react/views/text/c;->y1(Lcom/facebook/react/views/text/c;Ljava/lang/String;ZLcom/facebook/react/uimanager/D;)Landroid/text/Spannable;

    move-result-object v1

    iget v4, p0, Lcom/facebook/react/views/textinput/K;->b0:I

    iget-boolean v5, p0, Lcom/facebook/react/views/text/c;->Z:Z

    invoke-virtual {p0, v3}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v6

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v7

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v8

    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Lcom/facebook/react/uimanager/V;->l0(I)F

    move-result v9

    iget v10, p0, Lcom/facebook/react/views/text/c;->I:I

    iget v11, p0, Lcom/facebook/react/views/text/c;->J:I

    iget v12, p0, Lcom/facebook/react/views/text/c;->L:I

    move-object v2, v0

    move-object v3, v1

    invoke-direct/range {v2 .. v12}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZFFFFIII)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->r()I

    move-result v1

    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/uimanager/p0;->O(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public A1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/K;->f0:Ljava/lang/String;

    return-object v0
.end method

.method public B1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/K;->e0:Ljava/lang/String;

    return-object v0
.end method

.method public F(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/textinput/r;

    invoke-static {v0}, LO1/a;->a(Z)V

    check-cast p1, Lcom/facebook/react/views/textinput/r;

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->d0:Lcom/facebook/react/views/textinput/r;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->i()V

    return-void
.end method

.method public V(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/textinput/K;->c0:Landroid/widget/EditText;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iget-object v0, p0, Lcom/facebook/react/views/textinput/K;->d0:Lcom/facebook/react/views/textinput/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/r;->a(Landroid/widget/EditText;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v0, p0, Lcom/facebook/react/views/text/c;->H:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLines(I)V

    :cond_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v0

    iget v1, p0, Lcom/facebook/react/views/text/c;->J:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setBreakStrategy(I)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/K;->A1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-static {p2, p3}, Lcom/facebook/react/views/view/e;->a(FLcom/facebook/yoga/p;)I

    move-result p2

    invoke-static {p4, p5}, Lcom/facebook/react/views/view/e;->a(FLcom/facebook/yoga/p;)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-static {p2, p1}, Lcom/facebook/yoga/q;->b(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public a1(IF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/V;->a1(IF)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setMostRecentEventCount(I)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "mostRecentEventCount"
    .end annotation

    iput p1, p0, Lcom/facebook/react/views/textinput/K;->b0:I

    return-void
.end method

.method public setPlaceholder(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "placeholder"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->f0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "text"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/textinput/K;->e0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setTextBreakStrategy(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-string v1, "simple"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "highQuality"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/c;->J:I

    goto :goto_2

    :cond_1
    const-string v1, "balanced"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid textBreakStrategy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ReactNative"

    invoke-static {v1, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    iput v0, p0, Lcom/facebook/react/views/text/c;->J:I

    :goto_2
    return-void
.end method

.method public v0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public w0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method protected z1()Landroid/widget/EditText;
    .locals 3

    .line 1
    new-instance v0, Landroidx/appcompat/view/d;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    sget v2, Lcom/facebook/react/r;->f:I

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

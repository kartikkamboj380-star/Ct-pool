.class public Lcom/facebook/react/uimanager/I;
.super LA/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/I$d;,
        Lcom/facebook/react/uimanager/I$e;,
        Lcom/facebook/react/uimanager/I$f;
    }
.end annotation


# static fields
.field private static v:I = 0x3f000000

.field private static final w:I = 0x2

.field public static final x:Ljava/util/HashMap;


# instance fields
.field private final q:Landroid/view/View;

.field private final r:Lcom/facebook/react/uimanager/I$d;

.field private s:Landroid/os/Handler;

.field private final t:Ljava/util/HashMap;

.field u:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/I;->x:Ljava/util/HashMap;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->i:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "activate"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->j:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "longpress"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->q:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "increment"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->r:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "decrement"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->w:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "expand"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/core/view/accessibility/C$a;->x:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "collapse"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;ZI)V
    .locals 1

    invoke-direct {p0, p1}, LA/a;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/I;->t:Ljava/util/HashMap;

    new-instance v0, Lcom/facebook/react/uimanager/I$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/I$a;-><init>(Lcom/facebook/react/uimanager/I;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/I;->s:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    invoke-static {p1, p3}, Landroidx/core/view/H;->z0(Landroid/view/View;I)V

    sget p2, Lcom/facebook/react/n;->f:I

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/I$d;

    iput-object p1, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    return-void
.end method

.method public static W(Landroid/view/View;)Landroidx/core/view/accessibility/C;
    .locals 2

    .line 1
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Landroidx/core/view/accessibility/C;->T()Landroidx/core/view/accessibility/C;

    move-result-object v1

    :try_start_0
    invoke-static {p0, v1}, Landroidx/core/view/H;->c0(Landroid/view/View;Landroidx/core/view/accessibility/C;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/core/view/accessibility/C;->X()V

    :cond_1
    return-object v0
.end method

.method private X(Lcom/facebook/react/uimanager/I$d$a;)Landroid/graphics/Rect;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    new-instance p1, Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :cond_0
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance p1, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-direct {p1, v2, v2, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :cond_1
    iget v3, p1, Lcom/facebook/react/uimanager/I$d$a;->b:I

    int-to-double v3, v3

    iget v5, p1, Lcom/facebook/react/uimanager/I$d$a;->c:I

    int-to-double v5, v5

    double-to-int v7, v3

    invoke-virtual {v1, v7}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v8

    invoke-virtual {v1, v8}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v9

    int-to-double v9, v9

    cmpl-double v3, v3, v9

    if-lez v3, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v1, v7}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v4

    float-to-double v9, v4

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iget v7, p1, Lcom/facebook/react/uimanager/I$d$a;->b:I

    iget v11, p1, Lcom/facebook/react/uimanager/I$d$a;->c:I

    const-class v12, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0, v7, v11, v12}, Lcom/facebook/react/uimanager/I;->Y(IILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/text/style/AbsoluteSizeSpan;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v7

    int-to-float v7, v7

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v7

    :goto_0
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p1, Lcom/facebook/react/uimanager/I$d$a;->a:Ljava/lang/String;

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-double v11, p1

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int p1, v11

    double-to-int v4, v5

    invoke-virtual {v1, v4}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v4

    if-eq v8, v4, :cond_4

    const/4 v2, 0x1

    :cond_4
    invoke-virtual {v1, v8, v3}, Landroid/text/Layout;->getLineBounds(ILandroid/graphics/Rect;)I

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v4

    add-int/2addr v1, v4

    iget v4, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v4, v1

    iput v4, v3, Landroid/graphics/Rect;->top:I

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v1

    iput v4, v3, Landroid/graphics/Rect;->bottom:I

    iget v1, v3, Landroid/graphics/Rect;->left:I

    int-to-double v4, v1

    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v1

    int-to-double v6, v1

    add-double/2addr v9, v6

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-double v0, v0

    sub-double/2addr v9, v0

    add-double/2addr v4, v9

    double-to-int v0, v4

    iput v0, v3, Landroid/graphics/Rect;->left:I

    if-eqz v2, :cond_5

    new-instance p1, Landroid/graphics/Rect;

    iget v0, v3, Landroid/graphics/Rect;->left:I

    iget v1, v3, Landroid/graphics/Rect;->top:I

    iget v2, v3, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :cond_5
    new-instance v0, Landroid/graphics/Rect;

    iget v1, v3, Landroid/graphics/Rect;->left:I

    iget v2, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v0, v1, v2, p1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static Z(Landroid/view/View;Landroidx/core/view/accessibility/C;)Ljava/lang/CharSequence;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/facebook/react/uimanager/I;->W(Landroid/view/View;)Landroidx/core/view/accessibility/C;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/view/accessibility/C;->V(Landroidx/core/view/accessibility/C;)Landroidx/core/view/accessibility/C;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->s()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->A()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    xor-int/lit8 v3, v3, 0x1

    instance-of v5, p0, Landroid/widget/EditText;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    if-eqz v5, :cond_2

    if-nez v3, :cond_3

    :cond_2
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->X()V

    return-object v6

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    :try_start_1
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->X()V

    return-object v6

    :cond_4
    :try_start_2
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_1
    if-ge v4, v2, :cond_6

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {}, Landroidx/core/view/accessibility/C;->T()Landroidx/core/view/accessibility/C;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/core/view/H;->c0(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    invoke-static {v5, v3}, Lcom/facebook/react/uimanager/I;->g0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v5, v3}, Lcom/facebook/react/uimanager/I;->e0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-static {v3, v0}, Lcom/facebook/react/uimanager/I;->Z(Landroid/view/View;Landroidx/core/view/accessibility/C;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v5}, Landroidx/core/view/accessibility/C;->X()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lcom/facebook/react/uimanager/I;->h0(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->X()V

    return-object p0

    :cond_7
    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->X()V

    return-object v0

    :goto_2
    invoke-virtual {p1}, Landroidx/core/view/accessibility/C;->X()V

    throw p0
.end method

.method public static a0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    instance-of p0, p1, Landroid/view/ViewGroup;

    if-nez p0, :cond_0

    goto :goto_3

    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    move v1, v0

    :goto_0
    if-ge v1, p0, :cond_6

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Landroidx/core/view/accessibility/C;->T()Landroidx/core/view/accessibility/C;

    move-result-object v3

    :try_start_0
    invoke-static {v2, v3}, Landroidx/core/view/H;->c0(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    invoke-virtual {v3}, Landroidx/core/view/accessibility/C;->S()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v3}, Landroidx/core/view/accessibility/C;->X()V

    goto :goto_2

    :cond_3
    :try_start_1
    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/I;->e0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/I;->g0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    invoke-virtual {v3}, Landroidx/core/view/accessibility/C;->X()V

    const/4 p0, 0x1

    return p0

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroidx/core/view/accessibility/C;->X()V

    :cond_5
    throw p0

    :cond_6
    :goto_3
    return v0
.end method

.method private static b0(Landroidx/core/view/accessibility/C;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->z()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->G()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/facebook/react/uimanager/I;->d0(Landroidx/core/view/accessibility/C;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c0(Landroidx/core/view/accessibility/C;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->r()Landroidx/core/view/accessibility/C$b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->A()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->s()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->u()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d0(Landroidx/core/view/accessibility/C;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->x()Landroidx/core/view/accessibility/C$d;

    move-result-object p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C$d;->b()F

    move-result v1

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C$d;->c()F

    move-result v2

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C$d;->a()F

    move-result p0

    sub-float v3, v1, v2

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_2

    cmpl-float v2, p0, v2

    if-ltz v2, :cond_2

    cmpg-float p0, p0, v1

    if-gtz p0, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static e0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->S()Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->O()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lcom/facebook/react/uimanager/I;->f0(Landroidx/core/view/accessibility/C;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public static f0(Landroidx/core/view/accessibility/C;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->I()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->M()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->K()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->i()Ljava/util/List;

    move-result-object p0

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    move v0, v2

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v2
.end method

.method public static g0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/view/H;->z(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->o()I

    move-result v1

    if-gtz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/facebook/react/uimanager/I;->c0(Landroidx/core/view/accessibility/C;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/facebook/react/uimanager/I;->b0(Landroidx/core/view/accessibility/C;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/core/view/accessibility/C;->G()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/I;->a0(Landroidx/core/view/accessibility/C;Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method private static h0(Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget v1, Lcom/facebook/react/uimanager/I;->w:I

    sub-int v1, v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i0(Landroid/view/View;ZI)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/I;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/I;-><init>(Landroid/view/View;ZI)V

    invoke-static {p0, v0}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method

.method private j0(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->s:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->s:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->s:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->s:Landroid/os/Handler;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public static k0(Landroid/view/View;ZI)V
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/core/view/H;->N(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lcom/facebook/react/n;->g:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->h:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->a:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->q:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->f:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lcom/facebook/react/n;->x:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/I;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/I;-><init>(Landroid/view/View;ZI)V

    invoke-static {p0, v0}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    :cond_1
    return-void
.end method

.method public static l0(Landroidx/core/view/accessibility/C;Lcom/facebook/react/uimanager/I$e;Landroid/content/Context;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    sget-object p1, Lcom/facebook/react/uimanager/I$e;->m:Lcom/facebook/react/uimanager/I$e;

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->l(Lcom/facebook/react/uimanager/I$e;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/core/view/accessibility/C;->g0(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/facebook/react/uimanager/I$e;->q:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget p1, Lcom/facebook/react/q;->v:I

    :goto_0
    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/core/view/accessibility/C;->z0(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_1
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->s:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget p1, Lcom/facebook/react/q;->t:I

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->t:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    sget p1, Lcom/facebook/react/q;->u:I

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/core/view/accessibility/C;->z0(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p0, v1}, Landroidx/core/view/accessibility/C;->h0(Z)V

    goto/16 :goto_2

    :cond_3
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->n:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->p:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v1}, Landroidx/core/view/accessibility/C;->h0(Z)V

    invoke-virtual {p0, v1}, Landroidx/core/view/accessibility/C;->e0(Z)V

    goto/16 :goto_2

    :cond_5
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->x:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget p1, Lcom/facebook/react/q;->H:I

    goto :goto_0

    :cond_6
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->y:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0, v1}, Landroidx/core/view/accessibility/C;->p0(Z)V

    goto/16 :goto_2

    :cond_7
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->z:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget p1, Lcom/facebook/react/q;->a:I

    goto :goto_0

    :cond_8
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->B:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget p1, Lcom/facebook/react/q;->s:I

    goto :goto_0

    :cond_9
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->C:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget p1, Lcom/facebook/react/q;->w:I

    goto :goto_0

    :cond_a
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->D:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget p1, Lcom/facebook/react/q;->x:I

    goto/16 :goto_0

    :cond_b
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->E:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget p1, Lcom/facebook/react/q;->y:I

    goto/16 :goto_0

    :cond_c
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->F:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget p1, Lcom/facebook/react/q;->z:I

    goto/16 :goto_0

    :cond_d
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->H:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget p1, Lcom/facebook/react/q;->A:I

    goto/16 :goto_0

    :cond_e
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->I:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget p1, Lcom/facebook/react/q;->C:I

    goto/16 :goto_0

    :cond_f
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->J:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget p1, Lcom/facebook/react/q;->D:I

    goto/16 :goto_0

    :cond_10
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->L:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    sget p1, Lcom/facebook/react/q;->B:I

    goto/16 :goto_0

    :cond_11
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->M:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    sget p1, Lcom/facebook/react/q;->I:I

    goto/16 :goto_0

    :cond_12
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->N:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    sget p1, Lcom/facebook/react/q;->J:I

    goto/16 :goto_0

    :cond_13
    sget-object v0, Lcom/facebook/react/uimanager/I$e;->Y:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    sget p1, Lcom/facebook/react/q;->K:I

    goto/16 :goto_0

    :cond_14
    :goto_2
    return-void
.end method

.method private static m0(Landroidx/core/view/accessibility/C;Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v1

    const-string v2, "selected"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v2

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Boolean:Lcom/facebook/react/bridge/ReadableType;

    if-ne v2, v3, :cond_1

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->asBoolean()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/core/view/accessibility/C;->C0(Z)V

    goto :goto_0

    :cond_1
    const-string v2, "disabled"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v2

    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->Boolean:Lcom/facebook/react/bridge/ReadableType;

    if-ne v2, v4, :cond_2

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->asBoolean()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-virtual {p0, v0}, Landroidx/core/view/accessibility/C;->l0(Z)V

    goto :goto_0

    :cond_2
    const-string v2, "checked"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Boolean:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v2, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->asBoolean()Z

    move-result v0

    invoke-virtual {p0, v3}, Landroidx/core/view/accessibility/C;->e0(Z)V

    invoke-virtual {p0, v0}, Landroidx/core/view/accessibility/C;->f0(Z)V

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method protected B(FF)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/I$d;->c()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    instance-of v2, v0, Landroid/widget/TextView;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Spanned;

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr p1, v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr p2, v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr p1, v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr p2, v3

    float-to-int p2, p2

    invoke-virtual {v2, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p2

    invoke-virtual {v2, p2, p1}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p1

    const-class p2, Landroid/text/style/ClickableSpan;

    invoke-virtual {p0, p1, p1, p2}, Lcom/facebook/react/uimanager/I;->Y(IILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/style/ClickableSpan;

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    check-cast p2, Landroid/text/Spanned;

    invoke-interface {p2, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    invoke-interface {p2, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    invoke-virtual {p2, v0, p1}, Lcom/facebook/react/uimanager/I$d;->b(II)Lcom/facebook/react/uimanager/I$d$a;

    move-result-object p1

    if-eqz p1, :cond_4

    iget v1, p1, Lcom/facebook/react/uimanager/I$d$a;->d:I

    :cond_4
    :goto_0
    return v1
.end method

.method protected C(Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/I$d;->c()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected J(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method protected N(ILandroidx/core/view/accessibility/C;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    const-string v1, ""

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/C;->k0(Ljava/lang/CharSequence;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->c0(Landroid/graphics/Rect;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/I$d;->a(I)Lcom/facebook/react/uimanager/I$d$a;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/C;->k0(Ljava/lang/CharSequence;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->c0(Landroid/graphics/Rect;)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/I;->X(Lcom/facebook/react/uimanager/I$d$a;)Landroid/graphics/Rect;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/C;->k0(Ljava/lang/CharSequence;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v3, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->c0(Landroid/graphics/Rect;)V

    return-void

    :cond_2
    iget-object p1, p1, Lcom/facebook/react/uimanager/I$d$a;->a:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->k0(Ljava/lang/CharSequence;)V

    const/16 p1, 0x10

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->a(I)V

    invoke-virtual {p2, v0}, Landroidx/core/view/accessibility/C;->c0(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/facebook/react/q;->v:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->z0(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/facebook/react/uimanager/I$e;->n:Lcom/facebook/react/uimanager/I$e;

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->l(Lcom/facebook/react/uimanager/I$e;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->g0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected Y(IILjava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    array-length p2, p1

    if-lez p2, :cond_1

    const/4 p2, 0x0

    aget-object v2, p1, p2

    :cond_1
    :goto_0
    return-object v2
.end method

.method public b(Landroid/view/View;)Landroidx/core/view/accessibility/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->r:Lcom/facebook/react/uimanager/I$d;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LA/a;->b(Landroid/view/View;)Landroidx/core/view/accessibility/D;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, LA/a;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    sget v0, Lcom/facebook/react/n;->j:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz p1, :cond_0

    const-string v0, "min"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "now"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "max"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v1

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v2

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v2, v3, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v2

    if-ne v2, v3, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v2

    if-ne v2, v3, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v0

    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v1

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result p1

    if-le p1, v0, :cond_0

    if-lt v1, v0, :cond_0

    if-lt p1, v1, :cond_0

    sub-int/2addr p1, v0

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityRecord;->setCurrentItemIndex(I)V

    :cond_0
    return-void
.end method

.method public g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V
    .locals 13

    .line 1
    invoke-super {p0, p1, p2}, LA/a;->g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    sget v0, Lcom/facebook/react/n;->i:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    sget v0, Lcom/facebook/react/n;->i:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x80000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x40000

    :goto_0
    invoke-virtual {p2, v0}, Landroidx/core/view/accessibility/C;->a(I)V

    :cond_1
    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->k(Landroid/view/View;)Lcom/facebook/react/uimanager/I$e;

    move-result-object v0

    sget v1, Lcom/facebook/react/n;->d:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {p2, v0, v2}, Lcom/facebook/react/uimanager/I;->l0(Landroidx/core/view/accessibility/C;Lcom/facebook/react/uimanager/I$e;Landroid/content/Context;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p2, v1}, Landroidx/core/view/accessibility/C;->I0(Ljava/lang/CharSequence;)V

    :cond_3
    sget v1, Lcom/facebook/react/n;->n:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, LD2/a;->a(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/react/uimanager/I;->u:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {p2, v2}, Landroidx/core/view/accessibility/C;->s0(Landroid/view/View;)V

    :cond_4
    sget v2, Lcom/facebook/react/n;->h:I

    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {p2, v2, v3}, Lcom/facebook/react/uimanager/I;->m0(Landroidx/core/view/accessibility/C;Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V

    :cond_5
    sget v3, Lcom/facebook/react/n;->a:I

    invoke-virtual {p1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/bridge/ReadableArray;

    sget v4, Lcom/facebook/react/n;->c:I

    invoke-virtual {p1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v4, :cond_6

    const-string v5, "rowIndex"

    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "columnIndex"

    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v6

    const-string v7, "rowSpan"

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v7

    const-string v8, "columnSpan"

    invoke-interface {v4, v8}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v9, "heading"

    invoke-interface {v4, v9}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v5, v7, v6, v8, v4}, Landroidx/core/view/accessibility/C$c;->a(IIIIZ)Landroidx/core/view/accessibility/C$c;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroidx/core/view/accessibility/C;->j0(Ljava/lang/Object;)V

    :cond_6
    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_a

    move v6, v5

    :goto_1
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v7

    if-ge v6, v7, :cond_a

    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v7

    const-string v8, "name"

    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_9

    sget v9, Lcom/facebook/react/uimanager/I;->v:I

    const-string v10, "label"

    invoke-interface {v7, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v7, v10}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_7
    const/4 v10, 0x0

    :goto_2
    sget-object v11, Lcom/facebook/react/uimanager/I;->x:Ljava/util/HashMap;

    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_3

    :cond_8
    sget v11, Lcom/facebook/react/uimanager/I;->v:I

    add-int/2addr v11, v4

    sput v11, Lcom/facebook/react/uimanager/I;->v:I

    :goto_3
    iget-object v11, p0, Lcom/facebook/react/uimanager/I;->t:Ljava/util/HashMap;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Landroidx/core/view/accessibility/C$a;

    invoke-direct {v7, v9, v10}, Landroidx/core/view/accessibility/C$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p2, v7}, Landroidx/core/view/accessibility/C;->b(Landroidx/core/view/accessibility/C$a;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown accessibility action."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    sget v6, Lcom/facebook/react/n;->j:I

    invoke-virtual {p1, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v6, :cond_b

    const-string v7, "min"

    invoke-interface {v6, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    const-string v8, "now"

    invoke-interface {v6, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_b

    const-string v9, "max"

    invoke-interface {v6, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v6, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v7

    invoke-interface {v6, v8}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v8

    invoke-interface {v6, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    move-result-object v6

    if-eqz v7, :cond_b

    invoke-interface {v7}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v9, v10, :cond_b

    if-eqz v8, :cond_b

    invoke-interface {v8}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    if-ne v9, v10, :cond_b

    if-eqz v6, :cond_b

    invoke-interface {v6}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    if-ne v9, v10, :cond_b

    invoke-interface {v7}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v7

    invoke-interface {v8}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v8

    invoke-interface {v6}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v6

    if-le v6, v7, :cond_b

    if-lt v8, v7, :cond_b

    if-lt v6, v8, :cond_b

    int-to-float v7, v7

    int-to-float v6, v6

    int-to-float v8, v8

    invoke-static {v5, v7, v6, v8}, Landroidx/core/view/accessibility/C$d;->d(IFFF)Landroidx/core/view/accessibility/C$d;

    move-result-object v6

    invoke-virtual {p2, v6}, Landroidx/core/view/accessibility/C;->y0(Landroidx/core/view/accessibility/C$d;)V

    :cond_b
    sget v6, Lcom/facebook/react/n;->q:I

    invoke-virtual {p1, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_c

    invoke-virtual {p2, v6}, Landroidx/core/view/accessibility/C;->K0(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {p2}, Landroidx/core/view/accessibility/C;->s()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    invoke-virtual {p2}, Landroidx/core/view/accessibility/C;->A()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v6, :cond_d

    if-eqz v7, :cond_d

    move v6, v4

    goto :goto_4

    :cond_d
    move v6, v5

    :goto_4
    if-nez v3, :cond_f

    if-nez v2, :cond_f

    if-nez v1, :cond_f

    if-eqz v0, :cond_e

    goto :goto_5

    :cond_e
    move v4, v5

    :cond_f
    :goto_5
    if-eqz v6, :cond_10

    if-eqz v4, :cond_10

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/I;->Z(Landroid/view/View;Landroidx/core/view/accessibility/C;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->k0(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public j(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    const/high16 v0, 0x80000

    if-ne p2, v0, :cond_0

    sget v0, Lcom/facebook/react/n;->i:I

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    const/high16 v0, 0x40000

    if-ne p2, v0, :cond_1

    sget v0, Lcom/facebook/react/n;->i:I

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I;->t:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/I;->t:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "actionName"

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v3

    invoke-static {v2}, Ly2/a;->a(I)I

    move-result v4

    invoke-static {v1, v4}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lcom/facebook/react/bridge/UIManager;->getEventDispatcher()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/events/e;

    new-instance v4, Lcom/facebook/react/uimanager/I$b;

    invoke-direct {v4, p0, v3, v2, v0}, Lcom/facebook/react/uimanager/I$b;-><init>(Lcom/facebook/react/uimanager/I;IILcom/facebook/react/bridge/WritableMap;)V

    invoke-interface {v1, v4}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "Cannot get RCTEventEmitter, no CatalystInstance"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string v1, "ReactAccessibilityDelegate"

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    sget v0, Lcom/facebook/react/n;->g:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/I$e;

    sget v1, Lcom/facebook/react/n;->j:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/ReadableMap;

    sget-object v2, Lcom/facebook/react/uimanager/I$e;->w:Lcom/facebook/react/uimanager/I$e;

    if-ne v0, v2, :cond_6

    sget-object v0, Landroidx/core/view/accessibility/C$a;->q:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v0}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v0

    if-eq p2, v0, :cond_4

    sget-object v0, Landroidx/core/view/accessibility/C$a;->r:Landroidx/core/view/accessibility/C$a;

    invoke-virtual {v0}, Landroidx/core/view/accessibility/C$a;->b()I

    move-result v0

    if-ne p2, v0, :cond_6

    :cond_4
    if-eqz v1, :cond_5

    const-string v0, "text"

    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/I;->j0(Landroid/view/View;)V

    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/a;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_6
    const/4 p1, 0x1

    return p1

    :cond_7
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/a;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

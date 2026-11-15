.class public Lcom/facebook/react/devsupport/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/c;


# static fields
.field private static d:Z = true


# instance fields
.field private final a:Lcom/facebook/react/devsupport/a0;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/PopupWindow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/devsupport/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/d;->a:Lcom/facebook/react/devsupport/a0;

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/devsupport/d;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/d;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/devsupport/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/d;->g()V

    return-void
.end method

.method static bridge synthetic f(Lcom/facebook/react/devsupport/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/d;->h(Ljava/lang/String;)V

    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    iput-object v0, p0, Lcom/facebook/react/devsupport/d;->b:Landroid/widget/TextView;

    :cond_0
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/d;->a:Lcom/facebook/react/devsupport/a0;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->j()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "ReactNative"

    if-nez v0, :cond_1

    const-string p1, "Unable to display loading message because react activity isn\'t available"

    invoke-static {v1, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_0
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v2, v2, Landroid/graphics/Rect;->top:I

    const-string v3, "layout_inflater"

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/LayoutInflater;

    sget v4, Lcom/facebook/react/p;->a:I

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/facebook/react/devsupport/d;->b:Landroid/widget/TextView;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/widget/PopupWindow;

    iget-object v4, p0, Lcom/facebook/react/devsupport/d;->b:Landroid/widget/TextView;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v4, v5, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v3, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v3, p0, Lcom/facebook/react/devsupport/d;->c:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0, v4, v4, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to display loading message because react activity isn\'t active, message: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/devsupport/d;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/d$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/d$a;-><init>(Lcom/facebook/react/devsupport/d;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/devsupport/d;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/d$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/devsupport/d$b;-><init>(Lcom/facebook/react/devsupport/d;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/devsupport/d;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/d$c;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/d$c;-><init>(Lcom/facebook/react/devsupport/d;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.class Lcom/facebook/react/views/drawer/a$a;
.super Landroidx/core/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/drawer/a;-><init>(Lcom/facebook/react/bridge/ReactContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/facebook/react/views/drawer/a;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/drawer/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/drawer/a$a;->d:Lcom/facebook/react/views/drawer/a;

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    sget v0, Lcom/facebook/react/n;->g:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/I$e;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->l(Lcom/facebook/react/uimanager/I$e;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->k(Landroid/view/View;)Lcom/facebook/react/uimanager/I$e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->l(Lcom/facebook/react/uimanager/I$e;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->g0(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

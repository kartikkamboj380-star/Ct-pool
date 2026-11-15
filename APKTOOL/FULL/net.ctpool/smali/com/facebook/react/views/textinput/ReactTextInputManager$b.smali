.class Lcom/facebook/react/views/textinput/ReactTextInputManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/views/textinput/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/views/textinput/j;

.field private final b:Lcom/facebook/react/uimanager/events/e;

.field private final c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->d:I

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->e:I

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->b:Lcom/facebook/react/uimanager/events/e;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->b:Lcom/facebook/react/uimanager/events/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    :cond_1
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->d:I

    if-ne v0, v2, :cond_2

    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->e:I

    if-eq v1, v2, :cond_3

    :cond_2
    iput v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->e:I

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->d:I

    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v3, Lcom/facebook/react/views/textinput/b;

    iget v4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->c:I

    iget-object v5, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    int-to-float v0, v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v0

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    invoke-direct {v3, v4, v5, v0, v1}, Lcom/facebook/react/views/textinput/b;-><init>(IIFF)V

    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_3
    return-void
.end method

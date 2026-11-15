.class Lcom/facebook/react/views/textinput/l;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# instance fields
.field private a:Lcom/facebook/react/views/textinput/j;

.field private b:Lcom/facebook/react/uimanager/events/e;

.field private c:Z

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/l;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/views/textinput/l;->b:Lcom/facebook/react/uimanager/events/e;

    iput-object p3, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Enter"

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/l;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v1, Lcom/facebook/react/views/textinput/q;

    iget-object v2, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v1, v2, p1}, Lcom/facebook/react/views/textinput/q;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/l;->c:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/l;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/l;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/l;->c:Z

    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    move-result v0

    return v0
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 3

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-gt v1, v2, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Backspace"

    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/l;->b(Ljava/lang/String;)V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public deleteSurroundingText(II)Z
    .locals 1

    const-string v0, "Backspace"

    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/l;->a(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method

.method public endBatchEdit()Z
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/l;->c:Z

    iget-object v0, p0, Lcom/facebook/react/views/textinput/l;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/l;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/textinput/l;->d:Ljava/lang/String;

    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    move-result v0

    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    const/16 v1, 0x3a

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    const/16 v1, 0x2f

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x43

    if-ne v1, v2, :cond_1

    const-string v0, "Backspace"

    :goto_1
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/l;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x42

    if-ne v1, v2, :cond_2

    const-string v0, "Enter"

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getNumber()C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_2
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v1

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p2}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-ne p2, v0, :cond_1

    move v2, v3

    :cond_1
    if-lt p2, v0, :cond_4

    if-gtz p2, :cond_2

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/textinput/l;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    sub-int/2addr p2, v3

    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_4
    :goto_1
    const-string p2, "Backspace"

    :goto_2
    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/l;->b(Ljava/lang/String;)V

    return p1
.end method

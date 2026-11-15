.class final Lcom/facebook/react/views/textinput/ReactTextInputManager$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field private final m:Lcom/facebook/react/views/textinput/j;

.field private final n:Lcom/facebook/react/uimanager/events/e;

.field private final o:I

.field private p:Ljava/lang/String;

.field final synthetic q:Lcom/facebook/react/views/textinput/ReactTextInputManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->q:Lcom/facebook/react/views/textinput/ReactTextInputManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->n:Lcom/facebook/react/uimanager/events/e;

    iput-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->p:Ljava/lang/String;

    invoke-static {p2}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->o:I

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->p:Ljava/lang/String;

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    iget-boolean v0, v0, Lcom/facebook/react/views/textinput/j;->W:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p4, :cond_1

    if-nez p3, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->p:Ljava/lang/String;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    add-int v1, p2, p4

    invoke-virtual {v0, p2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->p:Ljava/lang/String;

    add-int v2, p2, p3

    invoke-virtual {v1, p2, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    if-ne p4, p3, :cond_2

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    iget-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p2}, Lcom/facebook/react/views/textinput/j;->getStateWrapper()Lcom/facebook/react/uimanager/d0;

    move-result-object p2

    if-eqz p2, :cond_3

    new-instance p3, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p3}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    iget-object p4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p4}, Lcom/facebook/react/views/textinput/j;->y()I

    move-result p4

    const-string v0, "mostRecentEventCount"

    invoke-interface {p3, v0, p4}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    iget-object p4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p4}, Landroid/view/View;->getId()I

    move-result p4

    const-string v0, "opaqueCacheId"

    invoke-interface {p3, v0, p4}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-interface {p2, p3}, Lcom/facebook/react/uimanager/d0;->a(Lcom/facebook/react/bridge/WritableMap;)V

    :cond_3
    iget-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->n:Lcom/facebook/react/uimanager/events/e;

    new-instance p3, Lcom/facebook/react/views/textinput/m;

    iget p4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->o:I

    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;->m:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v1}, Lcom/facebook/react/views/textinput/j;->y()I

    move-result v1

    invoke-direct {p3, p4, v0, p1, v1}, Lcom/facebook/react/views/textinput/m;-><init>(IILjava/lang/String;I)V

    invoke-interface {p2, p3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

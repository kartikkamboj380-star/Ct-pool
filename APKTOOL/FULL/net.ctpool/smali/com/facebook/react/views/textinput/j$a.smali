.class Lcom/facebook/react/views/textinput/j$a;
.super Lcom/facebook/react/uimanager/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/textinput/j;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic y:Lcom/facebook/react/views/textinput/j;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/textinput/j;Landroid/view/View;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j$a;->y:Lcom/facebook/react/views/textinput/j;

    invoke-direct {p0, p2, p3, p4}, Lcom/facebook/react/uimanager/I;-><init>(Landroid/view/View;ZI)V

    return-void
.end method


# virtual methods
.method public j(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    const/16 v0, 0x10

    if-ne p2, v0, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j$a;->y:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p1}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p2, p0, Lcom/facebook/react/views/textinput/j$a;->y:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/textinput/j$a;->y:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/views/textinput/j;->o(Lcom/facebook/react/views/textinput/j;)Z

    move-result p1

    return p1

    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/I;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

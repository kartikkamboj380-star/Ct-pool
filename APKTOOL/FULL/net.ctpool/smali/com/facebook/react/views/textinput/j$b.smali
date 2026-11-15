.class Lcom/facebook/react/views/textinput/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionMode$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/textinput/j;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/views/textinput/j;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j$b;->a:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/views/textinput/j;->l(Lcom/facebook/react/views/textinput/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const p1, 0x1020031

    invoke-interface {p2, p1}, Landroid/view/Menu;->removeItem(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 0

    return-void
.end method

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

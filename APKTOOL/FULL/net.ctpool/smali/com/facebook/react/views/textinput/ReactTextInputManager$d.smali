.class Lcom/facebook/react/views/textinput/ReactTextInputManager$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/views/textinput/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
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

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->a:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->b:Lcom/facebook/react/uimanager/events/e;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->c:I

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->d:I

    if-ne p2, v0, :cond_0

    iget p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->e:I

    if-eq p2, p1, :cond_1

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v1, Lcom/facebook/react/views/textinput/J;

    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->c:I

    iget-object v3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v1, v2, v3, v0, p1}, Lcom/facebook/react/views/textinput/J;-><init>(IIII)V

    invoke-interface {p2, v1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->d:I

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;->e:I

    :cond_1
    return-void
.end method

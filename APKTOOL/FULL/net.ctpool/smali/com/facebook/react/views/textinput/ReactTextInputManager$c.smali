.class Lcom/facebook/react/views/textinput/ReactTextInputManager$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/views/textinput/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
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

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->a:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->b:Lcom/facebook/react/uimanager/events/e;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->c:I

    return-void
.end method


# virtual methods
.method public a(IIII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    iget v3, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->d:I

    if-ne v3, v1, :cond_0

    iget v3, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->e:I

    if-eq v3, v2, :cond_1

    :cond_0
    iget v4, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->c:I

    iget-object v3, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    sget-object v6, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    int-to-float v7, v1

    int-to-float v8, v2

    iget-object v3, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v13

    iget-object v3, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->a:Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v14

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v15}, Lcom/facebook/react/views/scroll/g;->d(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)Lcom/facebook/react/views/scroll/g;

    move-result-object v3

    iget-object v4, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->b:Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v4, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    iput v1, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->d:I

    iput v2, v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;->e:I

    :cond_1
    return-void
.end method

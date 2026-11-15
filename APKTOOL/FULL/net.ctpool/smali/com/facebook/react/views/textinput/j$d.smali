.class Lcom/facebook/react/views/textinput/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/views/textinput/j;


# direct methods
.method private constructor <init>(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/views/textinput/k;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j$d;-><init>(Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    iget-boolean v1, v0, Lcom/facebook/react/views/textinput/j;->u:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    invoke-interface {v1, p1}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    iget-boolean v1, v0, Lcom/facebook/react/views/textinput/j;->u:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    invoke-interface {v1, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    iget-boolean v1, v0, Lcom/facebook/react/views/textinput/j;->u:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-static {v0}, Lcom/facebook/react/views/textinput/j;->m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    invoke-interface {v1, p1, p2, p3, p4}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/views/textinput/j;->p(Lcom/facebook/react/views/textinput/j;)V

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j$d;->m:Lcom/facebook/react/views/textinput/j;

    invoke-static {p1}, Lcom/facebook/react/views/textinput/j;->n(Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method

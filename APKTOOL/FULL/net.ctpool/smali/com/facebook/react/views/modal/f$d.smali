.class public final Lcom/facebook/react/views/modal/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/modal/f;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/views/modal/f;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/modal/f;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$d;->m:Lcom/facebook/react/views/modal/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    const/16 v0, 0x6f

    if-eq p2, v0, :cond_0

    iget-object p1, p0, Lcom/facebook/react/views/modal/f$d;->m:Lcom/facebook/react/views/modal/f;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/modal/f$d;->m:Lcom/facebook/react/views/modal/f;

    invoke-virtual {p2}, Lcom/facebook/react/views/modal/f;->getOnRequestCloseListener()Lcom/facebook/react/views/modal/f$c;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lcom/facebook/react/views/modal/f$c;->a(Landroid/content/DialogInterface;)V

    return v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "onRequestClose callback must be set if back key is expected to close the modal"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

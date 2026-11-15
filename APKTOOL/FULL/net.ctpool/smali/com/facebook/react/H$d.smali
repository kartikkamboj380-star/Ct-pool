.class Lcom/facebook/react/H$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H;->e0(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/view/View;

.field final synthetic n:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/H$d;->n:Lcom/facebook/react/H;

    iput-object p2, p0, Lcom/facebook/react/H$d;->m:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/facebook/react/H$d;->m:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lcom/facebook/react/H$d;->n:Lcom/facebook/react/H;

    invoke-static {p1}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LX1/e;->s(Z)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

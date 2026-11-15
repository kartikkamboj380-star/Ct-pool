.class public final Lcom/facebook/react/devsupport/M;
.super Landroid/app/Dialog;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/facebook/react/r;->a:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

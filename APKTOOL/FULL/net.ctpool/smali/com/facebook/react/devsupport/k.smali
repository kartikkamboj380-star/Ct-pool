.class public final synthetic Lcom/facebook/react/devsupport/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/k;->m:Lcom/facebook/react/devsupport/B;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/k;->m:Lcom/facebook/react/devsupport/B;

    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/B;->W(Lcom/facebook/react/devsupport/B;Landroid/content/DialogInterface;)V

    return-void
.end method

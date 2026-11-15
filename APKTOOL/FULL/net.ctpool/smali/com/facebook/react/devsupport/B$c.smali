.class Lcom/facebook/react/devsupport/B$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/widget/EditText;

.field final synthetic n:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$c;->n:Lcom/facebook/react/devsupport/B;

    iput-object p2, p0, Lcom/facebook/react/devsupport/B$c;->m:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/devsupport/B$c;->m:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/react/devsupport/B$c;->n:Lcom/facebook/react/devsupport/B;

    invoke-static {p2}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object p2

    invoke-interface {p2}, Ln2/a;->j()Lt2/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lt2/d;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/B$c;->n:Lcom/facebook/react/devsupport/B;

    invoke-interface {p1}, LX1/e;->q()V

    return-void
.end method

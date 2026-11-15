.class public final synthetic Lcom/facebook/react/devsupport/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;

.field public final synthetic n:[LX1/d;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;[LX1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/j;->m:Lcom/facebook/react/devsupport/B;

    iput-object p2, p0, Lcom/facebook/react/devsupport/j;->n:[LX1/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/j;->m:Lcom/facebook/react/devsupport/B;

    iget-object v1, p0, Lcom/facebook/react/devsupport/j;->n:[LX1/d;

    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/devsupport/B;->Q(Lcom/facebook/react/devsupport/B;[LX1/d;Landroid/content/DialogInterface;I)V

    return-void
.end method

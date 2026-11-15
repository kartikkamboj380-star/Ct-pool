.class Lcom/facebook/react/u$a;
.super Lcom/facebook/react/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/u;->q(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lcom/facebook/react/u;


# direct methods
.method constructor <init>(Lcom/facebook/react/u;Landroid/app/Activity;Lcom/facebook/react/L;Ljava/lang/String;Landroid/os/Bundle;Z)V
    .locals 6

    iput-object p1, p0, Lcom/facebook/react/u$a;->j:Lcom/facebook/react/u;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/x;-><init>(Landroid/app/Activity;Lcom/facebook/react/L;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method


# virtual methods
.method protected a()Lcom/facebook/react/X;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u$a;->j:Lcom/facebook/react/u;

    invoke-virtual {v0}, Lcom/facebook/react/u;->c()Lcom/facebook/react/X;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/facebook/react/x;->a()Lcom/facebook/react/X;

    move-result-object v0

    :cond_0
    return-object v0
.end method

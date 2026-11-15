.class Lcom/facebook/react/devsupport/b0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/b0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/devsupport/b0;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/b0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/b0$d;->m:Lcom/facebook/react/devsupport/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/devsupport/b0$d;->m:Lcom/facebook/react/devsupport/b0;

    invoke-static {p1}, Lcom/facebook/react/devsupport/b0;->a(Lcom/facebook/react/devsupport/b0;)LX1/e;

    move-result-object p1

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX1/e;

    invoke-interface {p1}, LX1/e;->o()V

    return-void
.end method

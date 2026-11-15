.class Lcom/facebook/react/devsupport/B$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$d;->a:Lcom/facebook/react/devsupport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$d;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/B$d;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v1}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object v1

    invoke-interface {v1}, Ln2/a;->a()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ln2/a;->c(Z)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$d;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->d0(Lcom/facebook/react/devsupport/B;)Lcom/facebook/react/devsupport/a0;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/devsupport/a0;->h()V

    return-void
.end method

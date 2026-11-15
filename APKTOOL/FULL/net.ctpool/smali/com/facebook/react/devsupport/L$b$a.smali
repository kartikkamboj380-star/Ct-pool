.class Lcom/facebook/react/devsupport/L$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/L$b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/devsupport/L$b;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/L$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/L$b$a;->m:Lcom/facebook/react/devsupport/L$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b$a;->m:Lcom/facebook/react/devsupport/L$b;

    invoke-static {v0}, Lcom/facebook/react/devsupport/L$b;->g(Lcom/facebook/react/devsupport/L$b;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/L$b$a;->m:Lcom/facebook/react/devsupport/L$b;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/L$b;->k()V

    :cond_0
    return-void
.end method

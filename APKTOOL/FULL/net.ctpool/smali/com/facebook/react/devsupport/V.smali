.class public final synthetic Lcom/facebook/react/devsupport/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/Y;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:LX1/e$a;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;LX1/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/V;->m:Lcom/facebook/react/devsupport/Y;

    iput-object p2, p0, Lcom/facebook/react/devsupport/V;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/devsupport/V;->o:LX1/e$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/V;->m:Lcom/facebook/react/devsupport/Y;

    iget-object v1, p0, Lcom/facebook/react/devsupport/V;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/devsupport/V;->o:LX1/e$a;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/devsupport/Y;->a(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;LX1/e$a;)V

    return-void
.end method

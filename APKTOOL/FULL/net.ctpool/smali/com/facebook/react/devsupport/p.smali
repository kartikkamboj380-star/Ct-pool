.class public final synthetic Lcom/facebook/react/devsupport/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;

.field public final synthetic n:LX1/g;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/p;->m:Lcom/facebook/react/devsupport/B;

    iput-object p2, p0, Lcom/facebook/react/devsupport/p;->n:LX1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/p;->m:Lcom/facebook/react/devsupport/B;

    iget-object v1, p0, Lcom/facebook/react/devsupport/p;->n:LX1/g;

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/B;->J(Lcom/facebook/react/devsupport/B;LX1/g;)V

    return-void
.end method

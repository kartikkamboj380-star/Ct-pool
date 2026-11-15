.class public final synthetic Lcom/facebook/react/devsupport/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/s;->m:Lcom/facebook/react/devsupport/B;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/s;->m:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->N(Lcom/facebook/react/devsupport/B;)V

    return-void
.end method

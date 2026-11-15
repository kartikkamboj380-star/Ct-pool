.class public final synthetic Lcom/facebook/react/devsupport/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B$h;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B$h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/D;->m:Lcom/facebook/react/devsupport/B$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/D;->m:Lcom/facebook/react/devsupport/B$h;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B$h;->i(Lcom/facebook/react/devsupport/B$h;)V

    return-void
.end method

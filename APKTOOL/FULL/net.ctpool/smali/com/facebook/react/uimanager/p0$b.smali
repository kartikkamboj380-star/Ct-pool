.class Lcom/facebook/react/uimanager/p0$b;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/p0;->z(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/uimanager/p0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$b;->m:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$b;->m:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->w(Lcom/facebook/react/uimanager/p0;)V

    return-void
.end method

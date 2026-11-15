.class public final Lcom/facebook/react/views/modal/f$b$a;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/modal/f$b;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/views/modal/f$b;

.field final synthetic n:I


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/modal/f$b;I)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/react/views/modal/f$b$a;->m:Lcom/facebook/react/views/modal/f$b;

    iput p3, p0, Lcom/facebook/react/views/modal/f$b$a;->n:I

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b$a;->m:Lcom/facebook/react/views/modal/f$b;

    invoke-static {v0}, Lcom/facebook/react/views/modal/f$b;->q(Lcom/facebook/react/views/modal/f$b;)Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/facebook/react/views/modal/f$b$a;->n:I

    iget-object v2, p0, Lcom/facebook/react/views/modal/f$b$a;->m:Lcom/facebook/react/views/modal/f$b;

    invoke-static {v2}, Lcom/facebook/react/views/modal/f$b;->s(Lcom/facebook/react/views/modal/f$b;)I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/views/modal/f$b$a;->m:Lcom/facebook/react/views/modal/f$b;

    invoke-static {v3}, Lcom/facebook/react/views/modal/f$b;->r(Lcom/facebook/react/views/modal/f$b;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/UIManagerModule;->updateNodeSize(III)V

    :cond_0
    return-void
.end method

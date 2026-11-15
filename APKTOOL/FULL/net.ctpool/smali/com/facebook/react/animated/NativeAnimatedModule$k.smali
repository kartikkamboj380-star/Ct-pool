.class Lcom/facebook/react/animated/NativeAnimatedModule$k;
.super Lcom/facebook/react/uimanager/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$k;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/p;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method protected a(J)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$k;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->d(Lcom/facebook/react/animated/NativeAnimatedModule;Z)V

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$k;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-virtual {v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/animated/p;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/animated/p;->t(J)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$k;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->c(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/modules/core/a;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Le2/a;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/facebook/react/animated/p;->o()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$k;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->f(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    return-void

    :goto_2
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

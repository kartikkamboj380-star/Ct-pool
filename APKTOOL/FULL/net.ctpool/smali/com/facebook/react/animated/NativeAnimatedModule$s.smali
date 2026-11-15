.class Lcom/facebook/react/animated/NativeAnimatedModule$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$s;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput-wide p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$s;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/uimanager/C;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$s;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->a(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/animated/NativeAnimatedModule$A;

    move-result-object p1

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$s;->a:J

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$s;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/p;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->c(JLcom/facebook/react/animated/p;)V

    return-void
.end method

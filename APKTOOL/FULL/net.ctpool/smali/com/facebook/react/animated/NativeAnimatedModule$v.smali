.class Lcom/facebook/react/animated/NativeAnimatedModule$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/animated/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->startListeningToAnimatedNodeValue(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$v;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(D)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "tag"

    iget v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$v;->a:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "value"

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$v;->b:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$000(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "onAnimatedValueUpdate"

    invoke-virtual {p1, p2, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

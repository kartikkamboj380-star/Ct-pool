.class Lcom/facebook/react/animated/NativeAnimatedModule$u;
.super Lcom/facebook/react/animated/NativeAnimatedModule$B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->updateAnimatedNodeConfig(DLcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic e:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$u;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$u;->c:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$u;->d:Lcom/facebook/react/bridge/ReadableMap;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/animated/p;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$u;->c:I

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$u;->d:Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/p;->B(ILcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

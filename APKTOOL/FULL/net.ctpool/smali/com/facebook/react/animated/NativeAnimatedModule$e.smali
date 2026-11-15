.class Lcom/facebook/react/animated/NativeAnimatedModule$e;
.super Lcom/facebook/react/animated/NativeAnimatedModule$B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->startAnimatingNode(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic f:Lcom/facebook/react/bridge/Callback;

.field final synthetic g:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->g:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->c:I

    iput p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->d:I

    iput-object p4, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->e:Lcom/facebook/react/bridge/ReadableMap;

    iput-object p5, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->f:Lcom/facebook/react/bridge/Callback;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/animated/p;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->c:I

    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->d:I

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->e:Lcom/facebook/react/bridge/ReadableMap;

    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$e;->f:Lcom/facebook/react/bridge/Callback;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/facebook/react/animated/p;->w(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.class Lcom/facebook/react/animated/NativeAnimatedModule$w;
.super Lcom/facebook/react/animated/NativeAnimatedModule$B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->startListeningToAnimatedNodeValue(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/facebook/react/animated/c;

.field final synthetic e:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/animated/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$w;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$w;->c:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$w;->d:Lcom/facebook/react/animated/c;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/animated/p;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$w;->c:I

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$w;->d:Lcom/facebook/react/animated/c;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/p;->x(ILcom/facebook/react/animated/c;)V

    return-void
.end method

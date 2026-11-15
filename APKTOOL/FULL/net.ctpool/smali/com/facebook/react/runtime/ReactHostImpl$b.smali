.class Lcom/facebook/react/runtime/ReactHostImpl$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactHostImpl;->w0()Lu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final a:Lcom/facebook/react/runtime/ReactInstance;

.field final b:Lcom/facebook/react/bridge/ReactContext;

.field final c:Z

.field final synthetic d:Lcom/facebook/react/runtime/ReactInstance;

.field final synthetic e:Lcom/facebook/react/runtime/c;

.field final synthetic f:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/runtime/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->f:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->d:Lcom/facebook/react/runtime/ReactInstance;

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->e:Lcom/facebook/react/runtime/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->a:Lcom/facebook/react/runtime/ReactInstance;

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->b:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {p1}, Lcom/facebook/react/runtime/ReactHostImpl;->V(Lcom/facebook/react/runtime/ReactHostImpl;)Lu2/f;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$b;->c:Z

    return-void
.end method

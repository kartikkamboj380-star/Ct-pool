.class public final synthetic Lcom/facebook/react/runtime/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/T;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/T;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/runtime/T;->c:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/T;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget-object v1, p0, Lcom/facebook/react/runtime/T;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/runtime/T;->c:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/runtime/ReactHostImpl;->Q(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;

    move-result-object v0

    return-object v0
.end method

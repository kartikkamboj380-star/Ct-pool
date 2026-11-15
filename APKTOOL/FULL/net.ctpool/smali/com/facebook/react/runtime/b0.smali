.class public final synthetic Lcom/facebook/react/runtime/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/runtime/ReactInstance$c;

.field public final synthetic n:Lcom/facebook/react/bridge/JavaOnlyMap;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactInstance$c;Lcom/facebook/react/bridge/JavaOnlyMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/b0;->m:Lcom/facebook/react/runtime/ReactInstance$c;

    iput-object p2, p0, Lcom/facebook/react/runtime/b0;->n:Lcom/facebook/react/bridge/JavaOnlyMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/b0;->m:Lcom/facebook/react/runtime/ReactInstance$c;

    iget-object v1, p0, Lcom/facebook/react/runtime/b0;->n:Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-static {v0, v1}, Lcom/facebook/react/runtime/ReactInstance$c;->a(Lcom/facebook/react/runtime/ReactInstance$c;Lcom/facebook/react/bridge/JavaOnlyMap;)V

    return-void
.end method

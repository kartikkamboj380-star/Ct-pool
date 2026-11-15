.class public final synthetic Lcom/facebook/react/runtime/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/facebook/react/runtime/ReactHostImpl$d;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/V;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/V;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/runtime/V;->c:Lcom/facebook/react/runtime/ReactHostImpl$d;

    return-void
.end method


# virtual methods
.method public final a(Lu2/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/V;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget-object v1, p0, Lcom/facebook/react/runtime/V;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/runtime/V;->c:Lcom/facebook/react/runtime/ReactHostImpl$d;

    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->k(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

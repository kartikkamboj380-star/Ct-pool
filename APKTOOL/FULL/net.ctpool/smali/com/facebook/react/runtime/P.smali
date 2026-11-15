.class public final synthetic Lcom/facebook/react/runtime/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/g;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:Lu2/g;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/P;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/P;->b:Lu2/g;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/P;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget-object v1, p0, Lcom/facebook/react/runtime/P;->b:Lu2/g;

    invoke-static {v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->v(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/g;Z)V

    return-void
.end method

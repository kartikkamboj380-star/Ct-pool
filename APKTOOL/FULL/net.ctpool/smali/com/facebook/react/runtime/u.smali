.class public final synthetic Lcom/facebook/react/runtime/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/u;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput p2, p0, Lcom/facebook/react/runtime/u;->b:I

    iput p3, p0, Lcom/facebook/react/runtime/u;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lu2/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/u;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget v1, p0, Lcom/facebook/react/runtime/u;->b:I

    iget v2, p0, Lcom/facebook/react/runtime/u;->c:I

    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->G(Lcom/facebook/react/runtime/ReactHostImpl;IILu2/f;)Lu2/f;

    move-result-object p1

    return-object p1
.end method

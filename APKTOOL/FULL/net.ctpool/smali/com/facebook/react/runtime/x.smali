.class public final synthetic Lcom/facebook/react/runtime/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/x;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    return-void
.end method


# virtual methods
.method public final a(Lu2/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/x;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-static {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->J(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Lu2/f;

    move-result-object p1

    return-object p1
.end method

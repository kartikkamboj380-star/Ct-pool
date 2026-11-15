.class public final synthetic Lcom/facebook/react/runtime/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/b;


# instance fields
.field public final synthetic m:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/h;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/h;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-static {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->l(Lcom/facebook/react/runtime/ReactHostImpl;)V

    return-void
.end method

.class public final synthetic Lcom/facebook/react/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/H;

.field public final synthetic n:Lcom/facebook/react/H$f;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H;Lcom/facebook/react/H$f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/A;->m:Lcom/facebook/react/H;

    iput-object p2, p0, Lcom/facebook/react/A;->n:Lcom/facebook/react/H$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/A;->m:Lcom/facebook/react/H;

    iget-object v1, p0, Lcom/facebook/react/A;->n:Lcom/facebook/react/H$f;

    invoke-static {v0, v1}, Lcom/facebook/react/H;->c(Lcom/facebook/react/H;Lcom/facebook/react/H$f;)V

    return-void
.end method

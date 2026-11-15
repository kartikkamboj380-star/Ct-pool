.class public final synthetic Lcom/facebook/react/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/H;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/C;->m:Lcom/facebook/react/H;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/C;->m:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->b(Lcom/facebook/react/H;)V

    return-void
.end method

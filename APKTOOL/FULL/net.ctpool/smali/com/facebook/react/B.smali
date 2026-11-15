.class public final synthetic Lcom/facebook/react/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Lcom/facebook/react/uimanager/S;


# direct methods
.method public synthetic constructor <init>(ILcom/facebook/react/uimanager/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/B;->m:I

    iput-object p2, p0, Lcom/facebook/react/B;->n:Lcom/facebook/react/uimanager/S;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/B;->m:I

    iget-object v1, p0, Lcom/facebook/react/B;->n:Lcom/facebook/react/uimanager/S;

    invoke-static {v0, v1}, Lcom/facebook/react/H;->e(ILcom/facebook/react/uimanager/S;)V

    return-void
.end method

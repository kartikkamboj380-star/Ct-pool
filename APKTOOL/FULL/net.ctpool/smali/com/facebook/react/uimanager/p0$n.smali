.class final Lcom/facebook/react/uimanager/p0$n;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "n"
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$n;->c:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$n;->c:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/C;->u(I)V

    return-void
.end method

.class final Lcom/facebook/react/uimanager/p0$u;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "u"
.end annotation


# instance fields
.field private final c:Ljava/lang/Object;

.field final synthetic d:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;ILjava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$u;->d:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput-object p3, p0, Lcom/facebook/react/uimanager/p0$u;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$u;->d:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget-object v2, p0, Lcom/facebook/react/uimanager/p0$u;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/C;->D(ILjava/lang/Object;)V

    return-void
.end method

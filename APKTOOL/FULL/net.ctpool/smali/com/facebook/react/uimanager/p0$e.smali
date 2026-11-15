.class final Lcom/facebook/react/uimanager/p0$e;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field private final c:Lcom/facebook/react/uimanager/e0;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/react/uimanager/W;

.field final synthetic f:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/e0;ILjava/lang/String;Lcom/facebook/react/uimanager/W;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$e;->f:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p3}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput-object p2, p0, Lcom/facebook/react/uimanager/p0$e;->c:Lcom/facebook/react/uimanager/e0;

    iput-object p4, p0, Lcom/facebook/react/uimanager/p0$e;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/react/uimanager/p0$e;->e:Lcom/facebook/react/uimanager/W;

    const-string p1, "createView"

    iget p2, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    const-wide/16 p3, 0x0

    invoke-static {p3, p4, p1, p2}, LP2/a;->j(JLjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 5

    .line 1
    const-string v0, "createView"

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, LP2/a;->d(JLjava/lang/String;I)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$e;->f:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/p0$e;->c:Lcom/facebook/react/uimanager/e0;

    iget v2, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget-object v3, p0, Lcom/facebook/react/uimanager/p0$e;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/react/uimanager/p0$e;->e:Lcom/facebook/react/uimanager/W;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/react/uimanager/C;->j(Lcom/facebook/react/uimanager/e0;ILjava/lang/String;Lcom/facebook/react/uimanager/W;)V

    return-void
.end method

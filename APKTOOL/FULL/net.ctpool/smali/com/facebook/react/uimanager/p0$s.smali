.class final Lcom/facebook/react/uimanager/p0$s;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "s"
.end annotation


# instance fields
.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field final synthetic h:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;IIIIII)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$s;->h:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p3}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput p2, p0, Lcom/facebook/react/uimanager/p0$s;->c:I

    iput p4, p0, Lcom/facebook/react/uimanager/p0$s;->d:I

    iput p5, p0, Lcom/facebook/react/uimanager/p0$s;->e:I

    iput p6, p0, Lcom/facebook/react/uimanager/p0$s;->f:I

    iput p7, p0, Lcom/facebook/react/uimanager/p0$s;->g:I

    const-string p1, "updateLayout"

    iget p2, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    const-wide/16 p3, 0x0

    invoke-static {p3, p4, p1, p2}, LP2/a;->j(JLjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 8

    .line 1
    const-string v0, "updateLayout"

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, LP2/a;->d(JLjava/lang/String;I)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$s;->h:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v1

    iget v2, p0, Lcom/facebook/react/uimanager/p0$s;->c:I

    iget v3, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget v4, p0, Lcom/facebook/react/uimanager/p0$s;->d:I

    iget v5, p0, Lcom/facebook/react/uimanager/p0$s;->e:I

    iget v6, p0, Lcom/facebook/react/uimanager/p0$s;->f:I

    iget v7, p0, Lcom/facebook/react/uimanager/p0$s;->g:I

    invoke-virtual/range {v1 .. v7}, Lcom/facebook/react/uimanager/C;->A(IIIIII)V

    return-void
.end method

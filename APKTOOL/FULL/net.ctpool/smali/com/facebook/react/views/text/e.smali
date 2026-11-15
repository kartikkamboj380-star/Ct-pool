.class public Lcom/facebook/react/views/text/e;
.super Lcom/facebook/react/uimanager/V;
.source "SourceFile"


# instance fields
.field private y:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/V;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/text/e;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public setText(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "text"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/text/e;->y:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->N()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [text: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/views/text/e;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public w1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/e;->y:Ljava/lang/String;

    return-object v0
.end method

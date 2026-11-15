.class Lcom/facebook/react/fabric/FabricUIManager$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/fabric/FabricUIManager;->setJSResponder(IIIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Lcom/facebook/react/fabric/FabricUIManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/FabricUIManager;IIIZ)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->e:Lcom/facebook/react/fabric/FabricUIManager;

    iput p2, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->a:I

    iput p3, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->b:I

    iput p4, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->c:I

    iput-boolean p5, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(La2/c;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, La2/c;->e(I)La2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->b:I

    .line 10
    .line 11
    iget v1, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->c:I

    .line 12
    .line 13
    iget-boolean v2, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->d:Z

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2}, La2/f;->L(IIZ)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "setJSResponder skipped, surface no longer available ["

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->a:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, "]"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/fabric/FabricUIManager$d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "SET_JS_RESPONDER [%d] [surface:%d]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class final Lcom/facebook/react/fabric/mounting/mountitems/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Fabric.SendAccessibilityEvent"

    iput-object v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->a:Ljava/lang/String;

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->b:I

    iput p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->c:I

    iput p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->d:I

    return-void
.end method


# virtual methods
.method public execute(La2/c;)V
    .locals 3

    .line 1
    :try_start_0
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->b:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->c:I

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->d:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1, v2}, La2/c;->o(III)V
    :try_end_0
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    const-string v0, "Fabric.SendAccessibilityEvent"

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendAccessibilityEventMountItem ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/h;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

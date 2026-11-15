.class public final Lcom/facebook/react/fabric/mounting/mountitems/d;
.super Lcom/facebook/react/fabric/mounting/mountitems/b;
.source "SourceFile"


# instance fields
.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method public constructor <init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    const-string v0, "commandId"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/fabric/mounting/mountitems/b;-><init>()V

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->b:I

    iput p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->c:I

    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->e:Lcom/facebook/react/bridge/ReadableArray;

    return-void
.end method


# virtual methods
.method public execute(La2/c;)V
    .locals 4

    .line 1
    const-string v0, "mountingManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->b:I

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->c:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->e:Lcom/facebook/react/bridge/ReadableArray;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, v2, v3}, La2/c;->n(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->c:I

    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/d;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DispatchStringCommandMountItem ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

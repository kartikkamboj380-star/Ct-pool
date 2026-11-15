.class final Lcom/facebook/react/fabric/mounting/mountitems/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Lcom/facebook/react/bridge/ReadableMap;

.field private final e:Lcom/facebook/react/uimanager/d0;

.field private final f:Lcom/facebook/react/fabric/events/EventEmitterWrapper;

.field private final g:Z


# direct methods
.method constructor <init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lcom/facebook/react/fabric/mounting/mountitems/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->a:Ljava/lang/String;

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->b:I

    iput-object p4, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->d:Lcom/facebook/react/bridge/ReadableMap;

    iput-object p5, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->e:Lcom/facebook/react/uimanager/d0;

    iput-object p6, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->f:Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    iput p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->c:I

    iput-boolean p7, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->g:Z

    return-void
.end method


# virtual methods
.method public execute(La2/c;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->b:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, La2/c;->e(I)La2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/facebook/react/fabric/FabricUIManager;->TAG:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Skipping View PreAllocation; no SurfaceMountingManager found for ["

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->b:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "]"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v2, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget v3, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->c:I

    .line 42
    .line 43
    iget-object v4, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 44
    .line 45
    iget-object v5, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->e:Lcom/facebook/react/uimanager/d0;

    .line 46
    .line 47
    iget-object v6, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->f:Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    .line 48
    .line 49
    iget-boolean v7, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->g:Z

    .line 50
    .line 51
    invoke-virtual/range {v1 .. v7}, La2/f;->D(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PreAllocateViewMountItem ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] - component: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " surfaceId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " isLayoutable: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/g;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

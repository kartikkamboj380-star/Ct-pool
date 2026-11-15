.class Lcom/facebook/react/animated/w;
.super Lcom/facebook/react/animated/b;
.source "SourceFile"


# instance fields
.field private final e:Lcom/facebook/react/animated/p;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Lcom/facebook/react/bridge/JavaOnlyMap;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/animated/w;->e:Lcom/facebook/react/animated/p;

    const-string p2, "animationId"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/facebook/react/animated/w;->f:I

    const-string p2, "toValue"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/facebook/react/animated/w;->g:I

    const-string p2, "value"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/facebook/react/animated/w;->h:I

    const-string p2, "animationConfig"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/react/bridge/JavaOnlyMap;->deepClone(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/animated/w;->i:Lcom/facebook/react/bridge/JavaOnlyMap;

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TrackingAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: animationID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/w;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " toValueNode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/w;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " valueNode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/w;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " animationConfig: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/animated/w;->i:Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/w;->e:Lcom/facebook/react/animated/p;

    iget v1, p0, Lcom/facebook/react/animated/w;->g:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/animated/w;->i:Lcom/facebook/react/bridge/JavaOnlyMap;

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v2

    const-string v0, "toValue"

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/facebook/react/animated/w;->e:Lcom/facebook/react/animated/p;

    iget v1, p0, Lcom/facebook/react/animated/w;->f:I

    iget v2, p0, Lcom/facebook/react/animated/w;->h:I

    iget-object v3, p0, Lcom/facebook/react/animated/w;->i:Lcom/facebook/react/bridge/JavaOnlyMap;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/react/animated/p;->w(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

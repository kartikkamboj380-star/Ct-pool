.class Lcom/facebook/react/animated/h;
.super Lcom/facebook/react/animated/B;
.source "SourceFile"


# instance fields
.field private final h:Lcom/facebook/react/animated/p;

.field private final i:I

.field private final j:D

.field private final k:D

.field private l:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V
    .locals 2

    invoke-direct {p0}, Lcom/facebook/react/animated/B;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/animated/h;->h:Lcom/facebook/react/animated/p;

    const-string p2, "input"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/facebook/react/animated/h;->i:I

    const-string p2, "min"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/h;->j:D

    const-string p2, "max"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/facebook/react/animated/h;->k:D

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/facebook/react/animated/h;->l:D

    iput-wide p1, p0, Lcom/facebook/react/animated/B;->e:D

    return-void
.end method

.method private o()D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/h;->h:Lcom/facebook/react/animated/p;

    iget v1, p0, Lcom/facebook/react/animated/h;->i:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;

    const-string v1, "Illegal node ID set as an input for Animated.DiffClamp node"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DiffClampAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: InputNodeTag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/h;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " min: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/h;->j:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " max: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/h;->k:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " lastValue: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/h;->l:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " super: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/facebook/react/animated/B;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/h;->o()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/react/animated/h;->l:D

    sub-double v2, v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/h;->l:D

    iget-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    add-double/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/react/animated/h;->j:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/react/animated/h;->k:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    return-void
.end method

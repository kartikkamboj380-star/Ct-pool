.class public final Lcom/facebook/react/animated/l;
.super Lcom/facebook/react/animated/B;
.source "SourceFile"


# instance fields
.field private final h:Lcom/facebook/react/animated/p;

.field private final i:I

.field private final j:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAnimatedNodesManager"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/animated/B;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/animated/l;->h:Lcom/facebook/react/animated/p;

    const-string p2, "input"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/facebook/react/animated/l;->i:I

    const-string p2, "modulus"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/facebook/react/animated/l;->j:D

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcom/facebook/react/animated/b;->d:I

    iget v1, p0, Lcom/facebook/react/animated/l;->i:I

    iget-wide v2, p0, Lcom/facebook/react/animated/l;->j:D

    invoke-super {p0}, Lcom/facebook/react/animated/B;->e()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NativeAnimatedNodesManager["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] inputNode: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " modulus: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " super: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/l;->h:Lcom/facebook/react/animated/p;

    iget v1, p0, Lcom/facebook/react/animated/l;->i:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/animated/B;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/facebook/react/animated/B;

    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/react/animated/l;->j:D

    rem-double/2addr v0, v2

    add-double/2addr v0, v2

    rem-double/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;

    const-string v1, "Illegal node ID set as an input for Animated.modulus node"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

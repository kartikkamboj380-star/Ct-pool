.class Lcom/facebook/react/animated/B;
.super Lcom/facebook/react/animated/b;
.source "SourceFile"


# instance fields
.field e:D

.field f:D

.field private g:Lcom/facebook/react/animated/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    const-string v0, "value"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    const-string v0, "offset"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ValueAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/B;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/B;->f:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    iget-wide v2, p0, Lcom/facebook/react/animated/B;->e:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    return-void
.end method

.method public j()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    iget-wide v2, p0, Lcom/facebook/react/animated/B;->f:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()D
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    iget-wide v2, p0, Lcom/facebook/react/animated/B;->e:D

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/animated/b;->h()V

    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/B;->f:D

    iget-wide v2, p0, Lcom/facebook/react/animated/B;->e:D

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public m()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/B;->g:Lcom/facebook/react/animated/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/animated/c;->a(D)V

    return-void
.end method

.method public n(Lcom/facebook/react/animated/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/B;->g:Lcom/facebook/react/animated/c;

    return-void
.end method

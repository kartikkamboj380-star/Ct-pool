.class Lcom/facebook/react/animated/j;
.super Lcom/facebook/react/animated/e;
.source "SourceFile"


# instance fields
.field private e:J

.field private f:[D

.field private g:D

.field private h:D

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/animated/e;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/animated/j;->k:I

    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/j;->a(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 7

    .line 1
    const-string v0, "frames"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/j;->f:[D

    if-eqz v2, :cond_0

    array-length v2, v2

    if-eq v2, v1, :cond_1

    :cond_0
    new-array v2, v1, [D

    iput-object v2, p0, Lcom/facebook/react/animated/j;->f:[D

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    iget-object v4, p0, Lcom/facebook/react/animated/j;->f:[D

    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v5

    aput-wide v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-string v0, "toValue"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v5, :cond_3

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    :cond_3
    iput-wide v3, p0, Lcom/facebook/react/animated/j;->g:D

    const-string v0, "iterations"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v4, :cond_4

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    :cond_4
    move p1, v3

    :goto_1
    iput p1, p0, Lcom/facebook/react/animated/j;->i:I

    goto :goto_2

    :cond_5
    iput v3, p0, Lcom/facebook/react/animated/j;->i:I

    :goto_2
    iput v3, p0, Lcom/facebook/react/animated/j;->j:I

    iget p1, p0, Lcom/facebook/react/animated/j;->i:I

    if-nez p1, :cond_6

    move v2, v3

    :cond_6
    iput-boolean v2, p0, Lcom/facebook/react/animated/e;->a:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/react/animated/j;->e:J

    return-void
.end method

.method public b(J)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/j;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-gez v0, :cond_0

    iput-wide p1, p0, Lcom/facebook/react/animated/j;->e:J

    iget v0, p0, Lcom/facebook/react/animated/j;->j:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iget-wide v2, v0, Lcom/facebook/react/animated/B;->e:D

    iput-wide v2, p0, Lcom/facebook/react/animated/j;->h:D

    :cond_0
    iget-wide v2, p0, Lcom/facebook/react/animated/j;->e:J

    sub-long v2, p1, v2

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x4030aaaaaaaaaaabL    # 16.666666666666668

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v0, v2

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calculated frame index should never be lower than 0. Called with frameTimeNanos "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " and mStartFrameTimeNanos "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide p1, p0, Lcom/facebook/react/animated/j;->e:J

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget p2, p0, Lcom/facebook/react/animated/j;->k:I

    const/16 v0, 0x64

    if-ge p2, v0, :cond_1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lcom/facebook/react/animated/j;->k:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/facebook/react/animated/j;->k:I

    :cond_1
    return-void

    :cond_2
    iget-boolean p1, p0, Lcom/facebook/react/animated/e;->a:Z

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/facebook/react/animated/j;->f:[D

    array-length p2, p1

    sub-int/2addr p2, v1

    if-lt v0, p2, :cond_6

    iget-wide p1, p0, Lcom/facebook/react/animated/j;->g:D

    iget v0, p0, Lcom/facebook/react/animated/j;->i:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_5

    iget v2, p0, Lcom/facebook/react/animated/j;->j:I

    if-ge v2, v0, :cond_4

    goto :goto_0

    :cond_4
    iput-boolean v1, p0, Lcom/facebook/react/animated/e;->a:Z

    goto :goto_1

    :cond_5
    :goto_0
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/facebook/react/animated/j;->e:J

    iget v0, p0, Lcom/facebook/react/animated/j;->j:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/react/animated/j;->j:I

    goto :goto_1

    :cond_6
    iget-wide v1, p0, Lcom/facebook/react/animated/j;->h:D

    aget-wide v3, p1, v0

    iget-wide p1, p0, Lcom/facebook/react/animated/j;->g:D

    sub-double/2addr p1, v1

    mul-double/2addr v3, p1

    add-double p1, v1, v3

    :goto_1
    iget-object v0, p0, Lcom/facebook/react/animated/e;->b:Lcom/facebook/react/animated/B;

    iput-wide p1, v0, Lcom/facebook/react/animated/B;->e:D

    return-void
.end method

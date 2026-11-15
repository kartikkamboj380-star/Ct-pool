.class public Lcom/facebook/react/fabric/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/fabric/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/Map;


# direct methods
.method private constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/fabric/b$b;->b:Ljava/util/Map;

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/facebook/react/fabric/b$b;->a:J

    return-void
.end method

.method synthetic constructor <init>(ILcom/facebook/react/fabric/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/b$b;-><init>(I)V

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/fabric/b$b;Lcom/facebook/react/bridge/ReactMarkerConstants;Lcom/facebook/react/fabric/b$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/fabric/b$b;->b(Lcom/facebook/react/bridge/ReactMarkerConstants;Lcom/facebook/react/fabric/b$c;)V

    return-void
.end method

.method private b(Lcom/facebook/react/bridge/ReactMarkerConstants;Lcom/facebook/react/fabric/b$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/b$b;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/b$b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/fabric/b$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/react/fabric/b$c;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method


# virtual methods
.method public c()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->d()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->g()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->i()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public g()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/fabric/b$b;->a:J

    return-wide v0
.end method

.method public i()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->k()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->l()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public k()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public l()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public m()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public n()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public o()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->p()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->q()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public p()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public q()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-direct {p0, v0}, Lcom/facebook/react/fabric/b$b;->r(Lcom/facebook/react/bridge/ReactMarkerConstants;)J

    move-result-wide v0

    return-wide v0
.end method

.method public s()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->m()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/react/fabric/b$b;->n()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FabricCommitPoint{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "mCommitNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/fabric/b$b;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/fabric/b$b;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

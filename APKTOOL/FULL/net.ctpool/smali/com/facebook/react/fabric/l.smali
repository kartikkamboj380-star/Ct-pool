.class Lcom/facebook/react/fabric/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Queue;

.field private final b:Ljava/util/Queue;

.field private c:D

.field private d:I

.field private e:J


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/PriorityQueue;

    new-instance v1, Lcom/facebook/react/fabric/j;

    invoke-direct {v1}, Lcom/facebook/react/fabric/j;-><init>()V

    invoke-static {v1}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    const/16 v2, 0xb

    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/PriorityQueue;

    new-instance v1, Lcom/facebook/react/fabric/k;

    invoke-direct {v1}, Lcom/facebook/react/fabric/k;-><init>()V

    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v0, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/fabric/l;->c:D

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/fabric/l;->d:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/react/fabric/l;->e:J

    return-void
.end method

.method public static synthetic a(Ljava/lang/Long;Ljava/lang/Long;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/fabric/l;->h(Ljava/lang/Long;Ljava/lang/Long;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Long;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/facebook/react/fabric/l;->g(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static synthetic g(Ljava/lang/Long;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private static synthetic h(Ljava/lang/Long;Ljava/lang/Long;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compare(JJ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public c(J)V
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    iget-object v1, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    :goto_0
    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    iget-object v1, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, Lcom/facebook/react/fabric/l;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/facebook/react/fabric/l;->d:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    long-to-double v0, p1

    iput-wide v0, p0, Lcom/facebook/react/fabric/l;->c:D

    goto :goto_2

    :cond_2
    iget-wide v2, p0, Lcom/facebook/react/fabric/l;->c:D

    div-int v0, v1, v0

    int-to-double v4, v0

    div-double/2addr v2, v4

    int-to-long v0, v1

    div-long v0, p1, v0

    long-to-double v0, v0

    add-double/2addr v2, v0

    iput-wide v2, p0, Lcom/facebook/react/fabric/l;->c:D

    :goto_2
    iget-wide v0, p0, Lcom/facebook/react/fabric/l;->e:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_3

    goto :goto_3

    :cond_3
    move-wide p1, v0

    :goto_3
    iput-wide p1, p0, Lcom/facebook/react/fabric/l;->e:J

    return-void
.end method

.method public d()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/fabric/l;->c:D

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/fabric/l;->e:J

    return-wide v0
.end method

.method public f()D
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/fabric/l;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/react/fabric/l;->b:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    :goto_0
    long-to-double v0, v0

    return-wide v0
.end method

.class Lcom/facebook/react/animated/NativeAnimatedModule$A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "A"
.end annotation


# instance fields
.field private final a:Ljava/util/Queue;

.field private b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

.field final synthetic c:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method private constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->c:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a:Ljava/util/Queue;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$A;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    return-void
.end method

.method private b(J)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->b()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    :cond_2
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/animated/NativeAnimatedModule$B;

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->b()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-lez v3, :cond_4

    iput-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    :goto_1
    return-object v0

    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method a(Lcom/facebook/react/animated/NativeAnimatedModule$B;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method c(JLcom/facebook/react/animated/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b(J)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/animated/NativeAnimatedModule$B;

    invoke-virtual {p2, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$B;->a(Lcom/facebook/react/animated/p;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$A;->b:Lcom/facebook/react/animated/NativeAnimatedModule$B;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

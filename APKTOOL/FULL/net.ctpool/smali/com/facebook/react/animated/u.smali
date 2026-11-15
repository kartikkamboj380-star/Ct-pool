.class Lcom/facebook/react/animated/u;
.super Lcom/facebook/react/animated/b;
.source "SourceFile"


# instance fields
.field private final e:Lcom/facebook/react/animated/p;

.field private final f:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V
    .locals 4

    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    const-string v0, "style"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/facebook/react/animated/u;->f:Ljava/util/Map;

    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/animated/u;->f:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/facebook/react/animated/u;->e:Lcom/facebook/react/animated/p;

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StyleAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] mPropMapping: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/animated/u;->f:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "null"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(Lcom/facebook/react/bridge/JavaOnlyMap;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/u;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lcom/facebook/react/animated/u;->e:Lcom/facebook/react/animated/p;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v2

    if-eqz v2, :cond_6

    instance-of v3, v2, Lcom/facebook/react/animated/y;

    if-eqz v3, :cond_0

    check-cast v2, Lcom/facebook/react/animated/y;

    invoke-virtual {v2, p1}, Lcom/facebook/react/animated/y;->i(Lcom/facebook/react/bridge/JavaOnlyMap;)V

    goto :goto_0

    :cond_0
    instance-of v3, v2, Lcom/facebook/react/animated/B;

    if-eqz v3, :cond_3

    check-cast v2, Lcom/facebook/react/animated/B;

    invoke-virtual {v2}, Lcom/facebook/react/animated/B;->k()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_1
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    instance-of v4, v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v1, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_3
    instance-of v3, v2, Lcom/facebook/react/animated/f;

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v2, Lcom/facebook/react/animated/f;

    invoke-virtual {v2}, Lcom/facebook/react/animated/f;->i()I

    move-result v2

    goto :goto_1

    :cond_4
    instance-of v3, v2, Lcom/facebook/react/animated/q;

    if-eqz v3, :cond_5

    check-cast v2, Lcom/facebook/react/animated/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1, p1}, Lcom/facebook/react/animated/q;->i(Ljava/lang/String;Lcom/facebook/react/bridge/JavaOnlyMap;)V

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type of node used in property node "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Mapped style node does not exist"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void
.end method

.class Lcom/facebook/react/animated/q;
.super Lcom/facebook/react/animated/b;
.source "SourceFile"


# instance fields
.field private final e:Lcom/facebook/react/animated/p;

.field private final f:Lcom/facebook/react/bridge/JavaOnlyMap;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/animated/b;-><init>()V

    invoke-static {p1}, Lcom/facebook/react/bridge/JavaOnlyMap;->deepClone(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/animated/q;->f:Lcom/facebook/react/bridge/JavaOnlyMap;

    iput-object p2, p0, Lcom/facebook/react/animated/q;->e:Lcom/facebook/react/animated/p;

    return-void
.end method

.method private j(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JavaOnlyArray;

    invoke-direct {v0}, Lcom/facebook/react/bridge/JavaOnlyArray;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_7

    sget-object v2, Lcom/facebook/react/animated/q$a;->a:[I

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/react/animated/q;->j(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    const-string v3, "nodeTag"

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v4

    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v4, v5, :cond_5

    iget-object v4, p0, Lcom/facebook/react/animated/q;->e:Lcom/facebook/react/animated/p;

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v4, v2}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v2

    if-eqz v2, :cond_4

    instance-of v3, v2, Lcom/facebook/react/animated/B;

    if-eqz v3, :cond_3

    check-cast v2, Lcom/facebook/react/animated/B;

    invoke-virtual {v2}, Lcom/facebook/react/animated/B;->k()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_1
    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushInt(I)V

    goto :goto_3

    :cond_1
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushString(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v2

    goto :goto_2

    :cond_3
    instance-of v3, v2, Lcom/facebook/react/animated/f;

    if-eqz v3, :cond_6

    check-cast v2, Lcom/facebook/react/animated/f;

    invoke-virtual {v2}, Lcom/facebook/react/animated/f;->i()I

    move-result v2

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Mapped value node does not exist"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/react/animated/q;->k(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_3

    :pswitch_2
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushString(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_3
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v2

    :goto_2
    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushDouble(D)V

    goto :goto_3

    :pswitch_4
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushBoolean(Z)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushNull()V

    :cond_6
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_7
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private k(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/react/animated/q$a;->a:[I

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/facebook/react/animated/q;->j(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_0

    :pswitch_1
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    if-eqz v3, :cond_6

    const-string v4, "nodeTag"

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v5

    sget-object v6, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v5, v6, :cond_6

    iget-object v5, p0, Lcom/facebook/react/animated/q;->e:Lcom/facebook/react/animated/p;

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v5, v3}, Lcom/facebook/react/animated/p;->l(I)Lcom/facebook/react/animated/b;

    move-result-object v3

    if-eqz v3, :cond_5

    instance-of v4, v3, Lcom/facebook/react/animated/B;

    if-eqz v4, :cond_4

    check-cast v3, Lcom/facebook/react/animated/B;

    invoke-virtual {v3}, Lcom/facebook/react/animated/B;->k()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_1
    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_3

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v3

    :goto_2
    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_4
    instance-of v4, v3, Lcom/facebook/react/animated/f;

    if-eqz v4, :cond_1

    check-cast v3, Lcom/facebook/react/animated/f;

    invoke-virtual {v3}, Lcom/facebook/react/animated/f;->i()I

    move-result v3

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Mapped value node does not exist"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-direct {p0, v3}, Lcom/facebook/react/animated/q;->k(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    goto :goto_2

    :pswitch_4
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putBoolean(Ljava/lang/String;Z)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putNull(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ObjectAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: mConfig: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/animated/q;->f:Lcom/facebook/react/bridge/JavaOnlyMap;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/react/bridge/JavaOnlyMap;->toString()Ljava/lang/String;

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

.method public i(Ljava/lang/String;Lcom/facebook/react/bridge/JavaOnlyMap;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/q;->f:Lcom/facebook/react/bridge/JavaOnlyMap;

    const-string v1, "value"

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/JavaOnlyMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/q;->f:Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/JavaOnlyMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/animated/q;->k(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/facebook/react/bridge/JavaOnlyMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Array:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/facebook/react/animated/q;->f:Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/JavaOnlyMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/animated/q;->j(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/JavaOnlyArray;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid value type for ObjectAnimatedNode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

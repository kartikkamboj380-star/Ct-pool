.class Lcom/facebook/react/animated/NativeAnimatedModule$p;
.super Lcom/facebook/react/animated/NativeAnimatedModule$B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->queueAndExecuteBatchedOperations(Lcom/facebook/react/bridge/ReadableArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic e:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->c:I

    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$B;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/animated/p;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$100(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->c:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v2, v0, 0x1

    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-static {v1}, Lcom/facebook/react/animated/NativeAnimatedModule$z;->h(I)Lcom/facebook/react/animated/NativeAnimatedModule$z;

    move-result-object v1

    sget-object v3, Lcom/facebook/react/animated/NativeAnimatedModule$q;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Batch animation execution op: unknown op code"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v4, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x4

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/p;->c(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->d(II)V

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {v2, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->e(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v4, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x4

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/p;->r(ILjava/lang/String;I)V

    goto :goto_0

    :pswitch_3
    invoke-static {}, Le2/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->f(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v4, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v5, v0, 0x3

    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    iget-object v4, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x4

    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    invoke-virtual {p1, v1, v2, v4, v3}, Lcom/facebook/react/animated/p;->w(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    goto/16 :goto_0

    :pswitch_4
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->e:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->e(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->g(II)V

    goto/16 :goto_0

    :pswitch_5
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/p;->v(ID)V

    goto/16 :goto_0

    :pswitch_6
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->h(II)V

    goto/16 :goto_0

    :pswitch_7
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->e(II)V

    goto/16 :goto_0

    :pswitch_8
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->B(ILcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :pswitch_9
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v3, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x3

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->f(ILcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_0

    :pswitch_a
    add-int/lit8 v0, v0, 0x2

    goto/16 :goto_0

    :pswitch_b
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->i(I)V

    goto/16 :goto_0

    :pswitch_c
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->s(I)V

    goto/16 :goto_0

    :pswitch_d
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->j(I)V

    goto/16 :goto_0

    :pswitch_e
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->k(I)V

    goto/16 :goto_0

    :pswitch_f
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->y(I)V

    goto/16 :goto_0

    :pswitch_10
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/p;->A(I)V

    goto/16 :goto_0

    :pswitch_11
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    new-instance v2, Lcom/facebook/react/animated/NativeAnimatedModule$p$a;

    invoke-direct {v2, p0, v1}, Lcom/facebook/react/animated/NativeAnimatedModule$p$a;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule$p;I)V

    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/p;->x(ILcom/facebook/react/animated/c;)V

    goto/16 :goto_0

    :pswitch_12
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$p;->d:Lcom/facebook/react/bridge/ReadableArray;

    add-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1, v3}, Lcom/facebook/react/animated/p;->m(ILcom/facebook/react/bridge/Callback;)V

    goto/16 :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

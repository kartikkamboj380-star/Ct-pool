.class final Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/a;


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field static final g:Ljava/lang/String; = "IntBufferBatchMountItem"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:[I

.field private final d:[Ljava/lang/Object;

.field private final e:I

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(I[I[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    iput p4, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->b:I

    iput-object p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    array-length p1, p2

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->e:I

    array-length p1, p3

    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->f:I

    return-void
.end method

.method private static b(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "CREATE"

    return-object p0

    :cond_0
    const/4 v0, 0x4

    if-ne p0, v0, :cond_1

    const-string p0, "DELETE"

    return-object p0

    :cond_1
    const/16 v0, 0x8

    if-ne p0, v0, :cond_2

    const-string p0, "INSERT"

    return-object p0

    :cond_2
    const/16 v0, 0x10

    if-ne p0, v0, :cond_3

    const-string p0, "REMOVE"

    return-object p0

    :cond_3
    const/16 v0, 0x800

    if-ne p0, v0, :cond_4

    const-string p0, "REMOVE_DELETE_TREE"

    return-object p0

    :cond_4
    const/16 v0, 0x20

    if-ne p0, v0, :cond_5

    const-string p0, "UPDATE_PROPS"

    return-object p0

    :cond_5
    const/16 v0, 0x40

    if-ne p0, v0, :cond_6

    const-string p0, "UPDATE_STATE"

    return-object p0

    :cond_6
    const/16 v0, 0x80

    if-ne p0, v0, :cond_7

    const-string p0, "UPDATE_LAYOUT"

    return-object p0

    :cond_7
    const/16 v0, 0x200

    if-ne p0, v0, :cond_8

    const-string p0, "UPDATE_PADDING"

    return-object p0

    :cond_8
    const/16 v0, 0x400

    if-ne p0, v0, :cond_9

    const-string p0, "UPDATE_OVERFLOW_INSET"

    return-object p0

    :cond_9
    const/16 v0, 0x100

    if-ne p0, v0, :cond_a

    const-string p0, "UPDATE_EVENT_EMITTER"

    return-object p0

    :cond_a
    const-string p0, "UNKNOWN"

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public execute(La2/c;)V
    .locals 21

    move-object/from16 v0, p0

    .line 1
    iget v1, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, La2/c;->e(I)La2/f;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d]."

    invoke-static {v1, v3, v2}, LP0/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v1}, La2/f;->y()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    iget v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Skipping batch of MountItems; was stopped [%d]."

    invoke-static {v1, v3, v2}, LP0/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-boolean v2, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    if-eqz v2, :cond_2

    sget-object v2, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    iget v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Executing IntBufferBatchMountItem on surface [%d]"

    invoke-static {v2, v4, v3}, LP0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    const/4 v11, 0x0

    move v2, v11

    move v3, v2

    :goto_0
    iget v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->e:I

    if-ge v2, v4, :cond_12

    iget-object v4, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v5, v2, 0x1

    aget v6, v4, v2

    and-int/lit8 v12, v6, -0x2

    const/4 v13, 0x1

    and-int/2addr v6, v13

    if-eqz v6, :cond_3

    add-int/lit8 v2, v2, 0x2

    aget v4, v4, v5

    move v5, v2

    move v14, v4

    goto :goto_1

    :cond_3
    move v14, v13

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IntBufferBatchMountItem::mountInstructions::"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v9, 0x0

    invoke-static {v9, v10, v2}, LP2/a;->c(JLjava/lang/String;)V

    move v15, v3

    move v2, v5

    move v8, v11

    :goto_2
    if-ge v8, v14, :cond_11

    const/4 v3, 0x2

    if-ne v12, v3, :cond_5

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v4, v15, 0x1

    aget-object v3, v3, v15

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/facebook/react/fabric/mounting/mountitems/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v6, v2, 0x1

    aget v7, v5, v2

    iget-object v9, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v10, v15, 0x2

    aget-object v4, v9, v4

    move-object/from16 v18, v4

    check-cast v18, Lcom/facebook/react/bridge/ReadableMap;

    add-int/lit8 v4, v15, 0x3

    aget-object v10, v9, v10

    check-cast v10, Lcom/facebook/react/uimanager/d0;

    add-int/lit8 v15, v15, 0x4

    aget-object v4, v9, v4

    move-object v9, v4

    check-cast v9, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    add-int/lit8 v19, v2, 0x2

    aget v2, v5, v6

    if-ne v2, v13, :cond_4

    move/from16 v20, v13

    goto :goto_3

    :cond_4
    move/from16 v20, v11

    :goto_3
    move-object v2, v1

    move v4, v7

    move-object/from16 v5, v18

    move-object v6, v10

    move-object v7, v9

    move/from16 v18, v8

    move/from16 v8, v20

    invoke-virtual/range {v2 .. v8}, La2/f;->k(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V

    move/from16 v2, v19

    :goto_4
    const-wide/16 v16, 0x0

    goto/16 :goto_8

    :cond_5
    move/from16 v18, v8

    const/4 v3, 0x4

    if-ne v12, v3, :cond_6

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v2, v3, v2

    invoke-virtual {v1, v2}, La2/f;->m(I)V

    move v2, v4

    goto :goto_4

    :cond_6
    const/16 v3, 0x8

    if-ne v12, v3, :cond_7

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v2, v2, 0x3

    aget v3, v3, v6

    invoke-virtual {v1, v4, v5, v3}, La2/f;->i(III)V

    goto :goto_4

    :cond_7
    const/16 v3, 0x10

    if-ne v12, v3, :cond_8

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v2, v2, 0x3

    aget v3, v3, v6

    invoke-virtual {v1, v5, v4, v3}, La2/f;->I(III)V

    goto :goto_4

    :cond_8
    const/16 v3, 0x800

    if-ne v12, v3, :cond_9

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v2, v2, 0x3

    aget v3, v3, v6

    invoke-virtual {v1, v5, v4, v3}, La2/f;->H(III)V

    goto :goto_4

    :cond_9
    const/16 v3, 0x20

    if-ne v12, v3, :cond_a

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v2, v3, v2

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v5, v15, 0x1

    aget-object v3, v3, v15

    check-cast v3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {v1, v2, v3}, La2/f;->R(ILcom/facebook/react/bridge/ReadableMap;)V

    :goto_5
    move v2, v4

    move v15, v5

    goto :goto_4

    :cond_a
    const/16 v3, 0x40

    if-ne v12, v3, :cond_b

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v2, v3, v2

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v5, v15, 0x1

    aget-object v3, v3, v15

    check-cast v3, Lcom/facebook/react/uimanager/d0;

    invoke-virtual {v1, v2, v3}, La2/f;->S(ILcom/facebook/react/uimanager/d0;)V

    goto :goto_5

    :cond_b
    const/16 v3, 0x80

    if-ne v12, v3, :cond_d

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v7, v2, 0x3

    aget v6, v3, v6

    add-int/lit8 v8, v2, 0x4

    aget v7, v3, v7

    add-int/lit8 v9, v2, 0x5

    aget v8, v3, v8

    add-int/lit8 v10, v2, 0x6

    aget v9, v3, v9

    add-int/lit8 v19, v2, 0x7

    aget v10, v3, v10

    invoke-static {}, Le2/a;->d()Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v20, v2, 0x8

    aget v19, v3, v19

    move-object v2, v1

    move v3, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    const-wide/16 v16, 0x0

    move v9, v10

    move/from16 v10, v19

    invoke-virtual/range {v2 .. v10}, La2/f;->O(IIIIIIII)V

    move/from16 v19, v20

    goto :goto_6

    :cond_c
    const-wide/16 v16, 0x0

    const/16 v20, 0x0

    move-object v2, v1

    move v3, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move/from16 v10, v20

    invoke-virtual/range {v2 .. v10}, La2/f;->O(IIIIIIII)V

    :goto_6
    move/from16 v2, v19

    goto/16 :goto_8

    :cond_d
    const-wide/16 v16, 0x0

    const/16 v3, 0x200

    if-ne v12, v3, :cond_e

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v7, v2, 0x3

    aget v6, v3, v6

    add-int/lit8 v8, v2, 0x4

    aget v7, v3, v7

    add-int/lit8 v9, v2, 0x5

    aget v8, v3, v8

    move-object v2, v1

    move v3, v5

    move v5, v6

    move v6, v7

    move v7, v8

    invoke-virtual/range {v2 .. v7}, La2/f;->Q(IIIII)V

    :goto_7
    move v2, v9

    goto :goto_8

    :cond_e
    const/16 v3, 0x400

    if-ne v12, v3, :cond_f

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    aget v4, v3, v4

    add-int/lit8 v7, v2, 0x3

    aget v6, v3, v6

    add-int/lit8 v8, v2, 0x4

    aget v7, v3, v7

    add-int/lit8 v9, v2, 0x5

    aget v8, v3, v8

    move-object v2, v1

    move v3, v5

    move v5, v6

    move v6, v7

    move v7, v8

    invoke-virtual/range {v2 .. v7}, La2/f;->P(IIIII)V

    goto :goto_7

    :cond_f
    const/16 v3, 0x100

    if-ne v12, v3, :cond_10

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v4, v2, 0x1

    aget v2, v3, v2

    iget-object v3, v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v5, v15, 0x1

    aget-object v3, v3, v15

    check-cast v3, Lcom/facebook/react/fabric/events/EventEmitterWrapper;

    invoke-virtual {v1, v2, v3}, La2/f;->N(ILcom/facebook/react/fabric/events/EventEmitterWrapper;)V

    move v2, v4

    move v15, v5

    :goto_8
    add-int/lit8 v8, v18, 0x1

    move-wide/from16 v9, v16

    goto/16 :goto_2

    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid type argument to IntBufferBatchMountItem: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " at index: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    move-wide/from16 v16, v9

    invoke-static/range {v16 .. v17}, LP2/a;->g(J)V

    move v3, v15

    goto/16 :goto_0

    :cond_12
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v1, p0

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IntBufferBatchMountItem [surface:%d]:\n"

    iget v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v2

    move v4, v3

    :cond_0
    iget v5, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->e:I

    if-ge v3, v5, :cond_d

    iget-object v5, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v6, v3, 0x1

    aget v7, v5, v3

    and-int/lit8 v8, v7, -0x2

    const/4 v9, 0x1

    and-int/2addr v7, v9

    if-eqz v7, :cond_1

    add-int/lit8 v3, v3, 0x2

    aget v9, v5, v6

    move v6, v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    :goto_0
    move v5, v2

    move v3, v6

    :goto_1
    if-ge v5, v9, :cond_0

    const/4 v6, 0x2

    if-ne v8, v6, :cond_2

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    aget-object v6, v6, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lcom/facebook/react/fabric/mounting/mountitems/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v4, v4, 0x4

    const-string v7, "CREATE [%d] - layoutable:%d - %s\n"

    iget-object v10, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v11, v3, 0x1

    aget v10, v10, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x2

    aget v11, v12, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v10, v11, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_2
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_2
    const/4 v6, 0x4

    if-ne v8, v6, :cond_3

    const-string v6, "DELETE [%d]\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v3, v7, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v10

    goto/16 :goto_5

    :cond_3
    const/16 v6, 0x8

    if-ne v8, v6, :cond_4

    const-string v6, "INSERT [%d]->[%d] @%d\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v7, v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v11, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x3

    aget v11, v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v7, v10, v11}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    if-ne v8, v6, :cond_5

    const-string v6, "REMOVE [%d]->[%d] @%d\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v7, v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v11, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x3

    aget v11, v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v7, v10, v11}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_5
    const/16 v6, 0x800

    if-ne v8, v6, :cond_6

    const-string v6, "REMOVE+DELETE TREE [%d]->[%d] @%d\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v7, v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v11, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x3

    aget v11, v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v7, v10, v11}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_6
    const/16 v6, 0x20

    const-string v7, "<hidden>"

    if-ne v8, v6, :cond_7

    :try_start_1
    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v10, v4, 0x1

    aget-object v4, v6, v4

    const-string v4, "UPDATE PROPS [%d]: %s\n"

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v11, v3, 0x1

    aget v3, v6, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v4, v10

    move v3, v11

    goto/16 :goto_5

    :cond_7
    const/16 v6, 0x40

    if-ne v8, v6, :cond_8

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    add-int/lit8 v10, v4, 0x1

    aget-object v4, v6, v4

    check-cast v4, Lcom/facebook/react/uimanager/d0;

    const-string v4, "UPDATE STATE [%d]: %s\n"

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v11, v3, 0x1

    aget v3, v6, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_8
    const/16 v6, 0x80

    if-ne v8, v6, :cond_9

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v7, v3, 0x1

    aget v10, v6, v3

    add-int/lit8 v11, v3, 0x2

    aget v6, v6, v7

    const-string v7, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d\n"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x3

    aget v6, v6, v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v11, v3, 0x4

    aget v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x5

    aget v6, v6, v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v11, v3, 0x6

    aget v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    iget-object v6, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x7

    aget v6, v6, v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    filled-new-array/range {v12 .. v18}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_2

    :cond_9
    const/16 v6, 0x200

    if-ne v8, v6, :cond_a

    const-string v6, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v7, v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v11, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v13, v3, 0x3

    aget v11, v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v14, v3, 0x4

    aget v12, v12, v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x5

    aget v13, v13, v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v7, v10, v11, v12, v13}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_2

    :cond_a
    const/16 v6, 0x400

    if-ne v8, v6, :cond_b

    const-string v6, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v7, v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v12, v3, 0x2

    aget v10, v11, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v13, v3, 0x3

    aget v11, v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iget-object v12, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v14, v3, 0x4

    aget v12, v12, v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v13, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v3, v3, 0x5

    aget v13, v13, v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v7, v10, v11, v12, v13}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_2

    :cond_b
    const/16 v6, 0x100

    if-ne v8, v6, :cond_c

    add-int/lit8 v4, v4, 0x1

    const-string v6, "UPDATE EVENTEMITTER [%d]\n"

    iget-object v7, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    add-int/lit8 v10, v3, 0x1

    aget v3, v7, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_3

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_c
    sget-object v4, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "String so far: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid type argument to IntBufferBatchMountItem: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " at index: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_6
    sget-object v3, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    const-string v4, "Caught exception trying to print"

    invoke-static {v3, v4, v0}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move v3, v2

    :goto_7
    iget v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->e:I

    if-ge v3, v4, :cond_e

    iget-object v4, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->c:[I

    aget v4, v4, v3

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_e
    sget-object v3, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :goto_8
    iget v0, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->f:I

    if-ge v2, v0, :cond_10

    sget-object v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->g:Ljava/lang/String;

    iget-object v3, v1, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;->d:[Ljava/lang/Object;

    aget-object v3, v3, v2

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    :cond_f
    const-string v3, "null"

    :goto_9
    invoke-static {v0, v3}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_10
    const-string v0, ""

    return-object v0
.end method

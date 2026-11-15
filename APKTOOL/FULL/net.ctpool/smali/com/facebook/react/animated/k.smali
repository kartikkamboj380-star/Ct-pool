.class Lcom/facebook/react/animated/k;
.super Lcom/facebook/react/animated/B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/k$b;
    }
.end annotation


# static fields
.field private static final p:Ljava/util/regex/Pattern;


# instance fields
.field private final h:[D

.field private final i:Ljava/lang/Object;

.field private final j:Lcom/facebook/react/animated/k$b;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private n:Lcom/facebook/react/animated/B;

.field private o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/animated/k;->p:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    invoke-direct {p0}, Lcom/facebook/react/animated/B;-><init>()V

    const-string v0, "inputRange"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/animated/k;->p(Lcom/facebook/react/bridge/ReadableArray;)[D

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/k;->h:[D

    const-string v0, "outputRange"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    const-string v1, "outputType"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "color"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Lcom/facebook/react/animated/k$b;->n:Lcom/facebook/react/animated/k$b;

    iput-object v1, p0, Lcom/facebook/react/animated/k;->j:Lcom/facebook/react/animated/k$b;

    invoke-static {v0}, Lcom/facebook/react/animated/k;->q(Lcom/facebook/react/bridge/ReadableArray;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    :goto_0
    iput-object v2, p0, Lcom/facebook/react/animated/k;->k:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v3, v4, :cond_1

    sget-object v2, Lcom/facebook/react/animated/k$b;->o:Lcom/facebook/react/animated/k$b;

    iput-object v2, p0, Lcom/facebook/react/animated/k;->j:Lcom/facebook/react/animated/k$b;

    invoke-static {v0}, Lcom/facebook/react/animated/k;->r(Lcom/facebook/react/bridge/ReadableArray;)[[D

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/k;->k:Ljava/lang/String;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/facebook/react/animated/k$b;->m:Lcom/facebook/react/animated/k$b;

    iput-object v1, p0, Lcom/facebook/react/animated/k;->j:Lcom/facebook/react/animated/k$b;

    invoke-static {v0}, Lcom/facebook/react/animated/k;->p(Lcom/facebook/react/bridge/ReadableArray;)[D

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    goto :goto_0

    :goto_1
    const-string v0, "extrapolateLeft"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/animated/k;->l:Ljava/lang/String;

    const-string v0, "extrapolateRight"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/animated/k;->m:Ljava/lang/String;

    return-void
.end method

.method private static o(D[D)I
    .locals 4

    .line 1
    const/4 v0, 0x1

    move v1, v0

    :goto_0
    array-length v2, p2

    sub-int/2addr v2, v0

    if-ge v1, v2, :cond_1

    aget-wide v2, p2, v1

    cmpl-double v2, v2, p0

    if-ltz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr v1, v0

    return v1
.end method

.method private static p(Lcom/facebook/react/bridge/ReadableArray;)[D
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    new-array v1, v0, [D

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static q(Lcom/facebook/react/bridge/ReadableArray;)[I
    .locals 4

    .line 1
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static r(Lcom/facebook/react/bridge/ReadableArray;)[[D
    .locals 11

    .line 1
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    new-array v1, v0, [[D

    sget-object v2, Lcom/facebook/react/animated/k;->p:Ljava/util/regex/Pattern;

    const/4 v3, 0x0

    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-array v5, v2, [D

    move v6, v3

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    aput-wide v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    aput-object v5, v1, v3

    const/4 v4, 0x1

    :goto_2
    if-ge v4, v0, :cond_3

    new-array v5, v2, [D

    sget-object v6, Lcom/facebook/react/animated/k;->p:Ljava/util/regex/Pattern;

    invoke-interface {p0, v4}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    move v7, v3

    :goto_3
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-eqz v8, :cond_2

    if-ge v7, v2, :cond_2

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    aput-wide v9, v5, v7

    move v7, v8

    goto :goto_3

    :cond_2
    aput-object v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    return-object v1
.end method

.method private static s(DDDDDLjava/lang/String;Ljava/lang/String;)D
    .locals 13

    .line 1
    move-object/from16 v0, p10

    move-object/from16 v1, p11

    const/4 v2, 0x2

    const-string v3, "clamp"

    const/4 v4, 0x1

    const-string v5, "identity"

    const/4 v6, 0x0

    const-string v7, "extend"

    const/4 v8, -0x1

    cmpg-double v9, p0, p2

    const-string v10, "Invalid extrapolation type "

    if-gez v9, :cond_3

    invoke-virtual/range {p10 .. p10}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p10 .. p10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    :goto_0
    move v11, v8

    goto :goto_1

    :sswitch_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto :goto_0

    :cond_0
    move v11, v2

    goto :goto_1

    :sswitch_1
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_0

    :cond_1
    move v11, v4

    goto :goto_1

    :sswitch_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    move v11, v6

    :goto_1
    packed-switch v11, :pswitch_data_0

    new-instance v1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "for left extrapolation"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    move-wide v11, p2

    goto :goto_2

    :pswitch_1
    return-wide p0

    :cond_3
    :pswitch_2
    move-wide v11, p0

    :goto_2
    cmpl-double v0, v11, p4

    if-lez v0, :cond_7

    invoke-virtual/range {p11 .. p11}, Ljava/lang/String;->hashCode()I

    invoke-virtual/range {p11 .. p11}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    :goto_3
    move v2, v8

    goto :goto_4

    :sswitch_3
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :sswitch_4
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move v2, v4

    goto :goto_4

    :sswitch_5
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move v2, v6

    :cond_6
    :goto_4
    packed-switch v2, :pswitch_data_1

    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "for right extrapolation"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    move-wide/from16 v11, p4

    goto :goto_5

    :pswitch_4
    return-wide v11

    :cond_7
    :goto_5
    :pswitch_5
    cmpl-double v0, p6, p8

    if-nez v0, :cond_8

    return-wide p6

    :cond_8
    cmpl-double v0, p2, p4

    if-nez v0, :cond_a

    if-gtz v9, :cond_9

    return-wide p6

    :cond_9
    return-wide p8

    :cond_a
    sub-double v0, p8, p6

    sub-double/2addr v11, p2

    mul-double/2addr v0, v11

    sub-double v2, p4, p2

    div-double/2addr v0, v2

    add-double v0, p6, v0

    return-wide v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4cd540e6 -> :sswitch_2
        -0x8178f42 -> :sswitch_1
        0x5a5a8bb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x4cd540e6 -> :sswitch_5
        -0x8178f42 -> :sswitch_4
        0x5a5a8bb -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method static t(D[D[DLjava/lang/String;Ljava/lang/String;)D
    .locals 13

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/animated/k;->o(D[D)I

    move-result v0

    aget-wide v3, p2, v0

    add-int/lit8 v1, v0, 0x1

    aget-wide v5, p2, v1

    aget-wide v7, p3, v0

    aget-wide v9, p3, v1

    move-wide v1, p0

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    invoke-static/range {v1 .. v12}, Lcom/facebook/react/animated/k;->s(DDDDDLjava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method static u(D[D[I)I
    .locals 7

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/animated/k;->o(D[D)I

    move-result v0

    aget v1, p3, v0

    add-int/lit8 v2, v0, 0x1

    aget p3, p3, v2

    if-ne v1, p3, :cond_0

    return v1

    :cond_0
    aget-wide v3, p2, v0

    aget-wide v5, p2, v2

    cmpl-double p2, v3, v5

    if-nez p2, :cond_2

    cmpg-double p0, p0, v3

    if-gtz p0, :cond_1

    return v1

    :cond_1
    return p3

    :cond_2
    sub-double/2addr p0, v3

    sub-double/2addr v5, v3

    div-double/2addr p0, v5

    double-to-float p0, p0

    invoke-static {v1, p3, p0}, Landroidx/core/graphics/a;->c(IIF)I

    move-result p0

    return p0
.end method

.method static v(Ljava/lang/String;D[D[[DLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    .line 1
    invoke-static/range {p1 .. p3}, Lcom/facebook/react/animated/k;->o(D[D)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    sget-object v2, Lcom/facebook/react/animated/k;->p:Ljava/util/regex/Pattern;

    move-object/from16 v3, p0

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_1

    aget-object v4, p4, v0

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-wide v8, p3, v0

    add-int/lit8 v5, v0, 0x1

    aget-wide v10, p3, v5

    aget-wide v12, v4, v3

    aget-object v4, p4, v5

    aget-wide v14, v4, v3

    move-wide/from16 v6, p1

    move-object/from16 v16, p5

    move-object/from16 v17, p6

    invoke-static/range {v6 .. v17}, Lcom/facebook/react/animated/k;->s(DDDDDLjava/lang/String;Ljava/lang/String;)D

    move-result-wide v4

    double-to-int v6, v4

    int-to-double v7, v6

    cmpl-double v7, v7, v4

    if-eqz v7, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v2, v1, v4}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Lcom/facebook/react/animated/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/k;->n:Lcom/facebook/react/animated/B;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/facebook/react/animated/B;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/react/animated/B;

    iput-object p1, p0, Lcom/facebook/react/animated/k;->n:Lcom/facebook/react/animated/B;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parent is of an invalid type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Parent already attached"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lcom/facebook/react/animated/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/k;->n:Lcom/facebook/react/animated/B;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/animated/k;->n:Lcom/facebook/react/animated/B;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid parent node provided"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InterpolationAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] super: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/facebook/react/animated/B;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/k;->n:Lcom/facebook/react/animated/B;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/animated/B;->l()D

    move-result-wide v2

    sget-object v0, Lcom/facebook/react/animated/k$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/animated/k;->j:Lcom/facebook/react/animated/k$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/animated/k;->k:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/react/animated/k;->h:[D

    iget-object v0, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, [[D

    iget-object v6, p0, Lcom/facebook/react/animated/k;->l:Ljava/lang/String;

    iget-object v7, p0, Lcom/facebook/react/animated/k;->m:Ljava/lang/String;

    invoke-static/range {v1 .. v7}, Lcom/facebook/react/animated/k;->v(Ljava/lang/String;D[D[[DLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/facebook/react/animated/k;->o:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/animated/k;->h:[D

    iget-object v1, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v2, v3, v0, v1}, Lcom/facebook/react/animated/k;->u(D[D[I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/animated/k;->h:[D

    iget-object v1, p0, Lcom/facebook/react/animated/k;->i:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, [D

    iget-object v5, p0, Lcom/facebook/react/animated/k;->l:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/react/animated/k;->m:Ljava/lang/String;

    move-wide v1, v2

    move-object v3, v0

    invoke-static/range {v1 .. v6}, Lcom/facebook/react/animated/k;->t(D[D[DLjava/lang/String;Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/B;->e:D

    :goto_1
    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/k;->o:Ljava/lang/Object;

    return-object v0
.end method

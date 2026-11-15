.class public final Lh6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lh6/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT5/t;)Lh6/e;
    .locals 20

    move-object/from16 v0, p1

    .line 1
    const-string v1, "responseHeaders"

    invoke-static {v0, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LT5/t;->size()I

    move-result v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v4, v1, :cond_13

    invoke-virtual {v0, v4}, LT5/t;->h(I)Ljava/lang/String;

    move-result-object v5

    const-string v12, "Sec-WebSocket-Extensions"

    const/4 v13, 0x1

    invoke-static {v5, v12, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-virtual {v0, v4}, LT5/t;->m(I)Ljava/lang/String;

    move-result-object v5

    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v12, v14, :cond_12

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v15, 0x2c

    const/16 v17, 0x0

    move-object v14, v5

    move/from16 v16, v12

    invoke-static/range {v14 .. v19}, LU5/c;->o(Ljava/lang/String;CIIILjava/lang/Object;)I

    move-result v14

    const/16 v15, 0x3b

    invoke-static {v5, v15, v12, v14}, LU5/c;->m(Ljava/lang/String;CII)I

    move-result v2

    invoke-static {v5, v12, v2}, LU5/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v12

    add-int/2addr v2, v13

    const-string v3, "permessage-deflate"

    invoke-static {v12, v3, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_11

    if-eqz v6, :cond_1

    move v11, v13

    :cond_1
    :goto_2
    if-ge v2, v14, :cond_10

    invoke-static {v5, v15, v2, v14}, LU5/c;->m(Ljava/lang/String;CII)I

    move-result v3

    const/16 v6, 0x3d

    invoke-static {v5, v6, v2, v3}, LU5/c;->m(Ljava/lang/String;CII)I

    move-result v6

    invoke-static {v5, v2, v6}, LU5/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    if-ge v6, v3, :cond_2

    add-int/lit8 v6, v6, 0x1

    invoke-static {v5, v6, v3}, LU5/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v6

    const-string v12, "\""

    invoke-static {v6, v12}, LF5/g;->j0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    :goto_3
    add-int/lit8 v3, v3, 0x1

    const-string v12, "client_max_window_bits"

    invoke-static {v2, v12, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_6

    if-eqz v7, :cond_3

    move v11, v13

    :cond_3
    if-eqz v6, :cond_4

    invoke-static {v6}, LF5/g;->i(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    move-object v7, v2

    if-nez v2, :cond_f

    :cond_5
    :goto_5
    move v11, v13

    goto :goto_7

    :cond_6
    const-string v12, "client_no_context_takeover"

    invoke-static {v2, v12, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_9

    if-eqz v8, :cond_7

    move v11, v13

    :cond_7
    if-eqz v6, :cond_8

    move v11, v13

    :cond_8
    move v8, v13

    goto :goto_7

    :cond_9
    const-string v12, "server_max_window_bits"

    invoke-static {v2, v12, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_c

    if-eqz v9, :cond_a

    move v11, v13

    :cond_a
    if-eqz v6, :cond_b

    invoke-static {v6}, LF5/g;->i(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    move-object v9, v2

    if-nez v2, :cond_f

    goto :goto_5

    :cond_c
    const-string v12, "server_no_context_takeover"

    invoke-static {v2, v12, v13}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5

    if-eqz v10, :cond_d

    move v11, v13

    :cond_d
    if-eqz v6, :cond_e

    move v11, v13

    :cond_e
    move v10, v13

    :cond_f
    :goto_7
    move v2, v3

    goto :goto_2

    :cond_10
    move v12, v2

    move v6, v13

    goto/16 :goto_1

    :cond_11
    move v12, v2

    move v11, v13

    goto/16 :goto_1

    :cond_12
    :goto_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_13
    new-instance v0, Lh6/e;

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, Lh6/e;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    return-object v0
.end method

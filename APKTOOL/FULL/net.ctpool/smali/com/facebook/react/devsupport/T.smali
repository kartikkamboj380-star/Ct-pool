.class Lcom/facebook/react/devsupport/T;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/T$a;
    }
.end annotation


# instance fields
.field private final a:Li6/h;

.field private final b:Ljava/lang/String;

.field private c:J


# direct methods
.method public constructor <init>(Li6/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/T;->a:Li6/h;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/T;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method private a(Li6/f;ZLcom/facebook/react/devsupport/T$a;)V
    .locals 5

    .line 1
    const-string v0, "\r\n\r\n"

    .line 2
    .line 3
    invoke-static {v0}, Li6/i;->l(Ljava/lang/String;)Li6/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Li6/f;->J(Li6/i;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, -0x1

    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p3, v0, p1, p2}, Lcom/facebook/react/devsupport/T$a;->a(Ljava/util/Map;Li6/f;Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v3, Li6/f;

    .line 23
    .line 24
    invoke-direct {v3}, Li6/f;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v4, Li6/f;

    .line 28
    .line 29
    invoke-direct {v4}, Li6/f;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3, v1, v2}, Li6/f;->L0(Li6/f;J)J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Li6/i;->C()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    invoke-virtual {p1, v0, v1}, Li6/f;->y0(J)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v4}, Li6/f;->d1(Li6/A;)J

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v3}, Lcom/facebook/react/devsupport/T;->c(Li6/f;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p3, p1, v4, p2}, Lcom/facebook/react/devsupport/T$a;->a(Ljava/util/Map;Li6/f;Z)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
.end method

.method private b(Ljava/util/Map;JZLcom/facebook/react/devsupport/T$a;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_3

    if-nez p5, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/react/devsupport/T;->c:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x10

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    if-eqz p4, :cond_3

    :cond_1
    iput-wide v0, p0, Lcom/facebook/react/devsupport/T;->c:J

    const-string p4, "Content-Length"

    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    move-wide v6, v0

    goto :goto_1

    :cond_2
    const-wide/16 v0, 0x0

    goto :goto_0

    :goto_1
    move-object v2, p5

    move-object v3, p1

    move-wide v4, p2

    invoke-interface/range {v2 .. v7}, Lcom/facebook/react/devsupport/T$a;->b(Ljava/util/Map;JJ)V

    :cond_3
    :goto_2
    return-void
.end method

.method private c(Li6/f;)Ljava/util/Map;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li6/f;->J0()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "\r\n"

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    array-length v1, p1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v1, :cond_1

    .line 20
    .line 21
    aget-object v4, p1, v3

    .line 22
    .line 23
    const-string v5, ":"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, -0x1

    .line 30
    if-ne v5, v6, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-object v0
.end method


# virtual methods
.method public d(Lcom/facebook/react/devsupport/T$a;)Z
    .locals 24

    .line 1
    move-object/from16 v6, p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\r\n--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v6, Lcom/facebook/react/devsupport/T;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li6/i;->l(Ljava/lang/String;)Li6/i;

    move-result-object v7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v6, Lcom/facebook/react/devsupport/T;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li6/i;->l(Ljava/lang/String;)Li6/i;

    move-result-object v8

    const-string v0, "\r\n\r\n"

    invoke-static {v0}, Li6/i;->l(Ljava/lang/String;)Li6/i;

    move-result-object v9

    new-instance v10, Li6/f;

    invoke-direct {v10}, Li6/f;-><init>()V

    const-wide/16 v11, 0x0

    move-wide v0, v11

    move-wide v4, v0

    move-wide v15, v4

    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v8}, Li6/i;->C()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v10, v7, v2, v3}, Li6/f;->U(Li6/i;J)J

    move-result-wide v0

    const-wide/16 v17, -0x1

    cmp-long v19, v0, v17

    const/16 v20, 0x1

    const/16 v21, 0x0

    if-nez v19, :cond_0

    invoke-virtual {v10, v8, v2, v3}, Li6/f;->U(Li6/i;J)J

    move-result-wide v0

    move/from16 v13, v20

    goto :goto_1

    :cond_0
    move/from16 v13, v21

    :goto_1
    cmp-long v17, v0, v17

    if-nez v17, :cond_4

    invoke-virtual {v10}, Li6/f;->m1()J

    move-result-wide v17

    if-nez v14, :cond_2

    invoke-virtual {v10, v9, v2, v3}, Li6/f;->U(Li6/i;J)J

    move-result-wide v0

    cmp-long v13, v0, v11

    if-ltz v13, :cond_1

    iget-object v13, v6, Lcom/facebook/react/devsupport/T;->a:Li6/h;

    invoke-interface {v13, v10, v0, v1}, Li6/C;->L0(Li6/f;J)J

    new-instance v13, Li6/f;

    invoke-direct {v13}, Li6/f;-><init>()V

    sub-long v14, v0, v2

    move-object v0, v10

    move-object v1, v13

    move-wide/from16 v22, v4

    move-wide v4, v14

    invoke-virtual/range {v0 .. v5}, Li6/f;->g(Li6/f;JJ)Li6/f;

    invoke-virtual {v13}, Li6/f;->m1()J

    move-result-wide v0

    invoke-virtual {v9}, Li6/i;->C()I

    move-result v2

    int-to-long v2, v2

    add-long v15, v0, v2

    invoke-direct {v6, v13}, Lcom/facebook/react/devsupport/T;->c(Li6/f;)Ljava/util/Map;

    move-result-object v14

    goto :goto_2

    :cond_1
    move-wide/from16 v22, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v22, v4

    invoke-virtual {v10}, Li6/f;->m1()J

    move-result-wide v0

    sub-long v2, v0, v15

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/T;->b(Ljava/util/Map;JZLcom/facebook/react/devsupport/T$a;)V

    :goto_2
    iget-object v0, v6, Lcom/facebook/react/devsupport/T;->a:Li6/h;

    const/16 v1, 0x1000

    int-to-long v1, v1

    invoke-interface {v0, v10, v1, v2}, Li6/C;->L0(Li6/f;J)J

    move-result-wide v0

    cmp-long v0, v0, v11

    if-gtz v0, :cond_3

    return v21

    :cond_3
    move-wide/from16 v0, v17

    move-wide/from16 v4, v22

    goto :goto_0

    :cond_4
    move-wide v2, v4

    sub-long v4, v0, v2

    cmp-long v17, v2, v11

    if-lez v17, :cond_5

    new-instance v1, Li6/f;

    invoke-direct {v1}, Li6/f;-><init>()V

    invoke-virtual {v10, v2, v3}, Li6/f;->y0(J)V

    invoke-virtual {v10, v1, v4, v5}, Li6/f;->L0(Li6/f;J)J

    invoke-virtual {v1}, Li6/f;->m1()J

    move-result-wide v2

    sub-long/2addr v2, v15

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object v15, v1

    move-object v1, v14

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/T;->b(Ljava/util/Map;JZLcom/facebook/react/devsupport/T$a;)V

    move-object/from16 v2, p1

    invoke-direct {v6, v15, v13, v2}, Lcom/facebook/react/devsupport/T;->a(Li6/f;ZLcom/facebook/react/devsupport/T$a;)V

    move-wide v15, v11

    const/4 v14, 0x0

    goto :goto_3

    :cond_5
    move-object/from16 v2, p1

    invoke-virtual {v10, v0, v1}, Li6/f;->y0(J)V

    :goto_3
    if-eqz v13, :cond_6

    return v20

    :cond_6
    invoke-virtual {v7}, Li6/i;->C()I

    move-result v0

    int-to-long v4, v0

    move-wide v0, v4

    goto/16 :goto_0
.end method

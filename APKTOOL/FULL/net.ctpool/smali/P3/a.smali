.class public LP3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/Integer;

.field private final f:I

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:Landroid/app/PendingIntent;

.field private final l:Landroid/app/PendingIntent;

.field private final m:Landroid/app/PendingIntent;

.field private final n:Landroid/app/PendingIntent;

.field private final o:Ljava/util/Map;

.field private p:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)V
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, LP3/a;->p:Z

    .line 7
    .line 8
    move-object v1, p1

    .line 9
    iput-object v1, v0, LP3/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    move v1, p2

    .line 12
    iput v1, v0, LP3/a;->b:I

    .line 13
    .line 14
    move v1, p3

    .line 15
    iput v1, v0, LP3/a;->c:I

    .line 16
    .line 17
    move v1, p4

    .line 18
    iput v1, v0, LP3/a;->d:I

    .line 19
    .line 20
    move-object v1, p5

    .line 21
    iput-object v1, v0, LP3/a;->e:Ljava/lang/Integer;

    .line 22
    .line 23
    move v1, p6

    .line 24
    iput v1, v0, LP3/a;->f:I

    .line 25
    .line 26
    move-wide v1, p7

    .line 27
    iput-wide v1, v0, LP3/a;->g:J

    .line 28
    .line 29
    move-wide v1, p9

    .line 30
    iput-wide v1, v0, LP3/a;->h:J

    .line 31
    .line 32
    move-wide v1, p11

    .line 33
    iput-wide v1, v0, LP3/a;->i:J

    .line 34
    .line 35
    move-wide/from16 v1, p13

    .line 36
    .line 37
    iput-wide v1, v0, LP3/a;->j:J

    .line 38
    .line 39
    move-object/from16 v1, p15

    .line 40
    .line 41
    iput-object v1, v0, LP3/a;->k:Landroid/app/PendingIntent;

    .line 42
    .line 43
    move-object/from16 v1, p16

    .line 44
    .line 45
    iput-object v1, v0, LP3/a;->l:Landroid/app/PendingIntent;

    .line 46
    .line 47
    move-object/from16 v1, p17

    .line 48
    .line 49
    iput-object v1, v0, LP3/a;->m:Landroid/app/PendingIntent;

    .line 50
    .line 51
    move-object/from16 v1, p18

    .line 52
    .line 53
    iput-object v1, v0, LP3/a;->n:Landroid/app/PendingIntent;

    .line 54
    .line 55
    move-object/from16 v1, p19

    .line 56
    .line 57
    iput-object v1, v0, LP3/a;->o:Ljava/util/Map;

    .line 58
    .line 59
    return-void
.end method

.method public static d(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)LP3/a;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v6, p5

    .line 12
    .line 13
    move-wide/from16 v7, p6

    .line 14
    .line 15
    move-wide/from16 v9, p8

    .line 16
    .line 17
    move-wide/from16 v11, p10

    .line 18
    .line 19
    move-wide/from16 v13, p12

    .line 20
    .line 21
    move-object/from16 v15, p14

    .line 22
    .line 23
    move-object/from16 v16, p15

    .line 24
    .line 25
    move-object/from16 v17, p16

    .line 26
    .line 27
    move-object/from16 v18, p17

    .line 28
    .line 29
    move-object/from16 v19, p18

    .line 30
    .line 31
    new-instance v20, LP3/a;

    .line 32
    .line 33
    move-object/from16 v0, v20

    .line 34
    .line 35
    invoke-direct/range {v0 .. v19}, LP3/a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    return-object v20
.end method

.method private final g(LP3/d;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, LP3/d;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, LP3/a;->i:J

    .line 8
    .line 9
    iget-wide v2, p0, LP3/a;->j:J

    .line 10
    .line 11
    cmp-long p1, v0, v2

    .line 12
    .line 13
    if-gtz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method


# virtual methods
.method public a(LP3/d;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP3/a;->c(LP3/d;)Landroid/app/PendingIntent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LP3/a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method final c(LP3/d;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    invoke-virtual {p1}, LP3/d;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, LP3/a;->l:Landroid/app/PendingIntent;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-direct {p0, p1}, LP3/a;->g(LP3/d;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, LP3/a;->n:Landroid/app/PendingIntent;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    return-object v1

    .line 23
    :cond_2
    invoke-virtual {p1}, LP3/d;->b()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ne v0, v2, :cond_4

    .line 29
    .line 30
    iget-object v0, p0, LP3/a;->k:Landroid/app/PendingIntent;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_3
    invoke-direct {p0, p1}, LP3/a;->g(LP3/d;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, LP3/a;->m:Landroid/app/PendingIntent;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_4
    return-object v1
.end method

.method final e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LP3/a;->p:Z

    .line 3
    .line 4
    return-void
.end method

.method final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP3/a;->p:Z

    .line 2
    .line 3
    return v0
.end method

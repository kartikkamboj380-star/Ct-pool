.class public final Li6/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public m:Li6/f;

.field public n:Z

.field private o:Li6/x;

.field public p:J

.field public q:[B

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Li6/f$a;->p:J

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Li6/f$a;->r:I

    .line 10
    .line 11
    iput v0, p0, Li6/f$a;->s:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    iget-wide v0, p0, Li6/f$a;->p:J

    .line 2
    .line 3
    iget-object v2, p0, Li6/f$a;->m:Li6/f;

    .line 4
    .line 5
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-wide v0, p0, Li6/f$a;->p:J

    .line 22
    .line 23
    const-wide/16 v2, -0x1

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p0, v0, v1}, Li6/f$a;->d(J)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    iget v2, p0, Li6/f$a;->s:I

    .line 37
    .line 38
    iget v3, p0, Li6/f$a;->r:I

    .line 39
    .line 40
    sub-int/2addr v2, v3

    .line 41
    int-to-long v2, v2

    .line 42
    add-long/2addr v0, v2

    .line 43
    goto :goto_1

    .line 44
    :goto_2
    return v0

    .line 45
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v1, "no more bytes"

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public final b(J)J
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 1
    iget-object v3, v0, Li6/f$a;->m:Li6/f;

    if-eqz v3, :cond_8

    iget-boolean v4, v0, Li6/f$a;->n:Z

    if-eqz v4, :cond_7

    invoke-virtual {v3}, Li6/f;->m1()J

    move-result-wide v4

    cmp-long v6, v1, v4

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    if-gtz v6, :cond_4

    cmp-long v6, v1, v9

    if-ltz v6, :cond_0

    move v7, v8

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_3

    sub-long v6, v4, v1

    :goto_1
    cmp-long v8, v6, v9

    if-lez v8, :cond_2

    iget-object v8, v3, Li6/f;->m:Li6/x;

    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v8, v8, Li6/x;->g:Li6/x;

    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v11, v8, Li6/x;->c:I

    iget v12, v8, Li6/x;->b:I

    sub-int v12, v11, v12

    int-to-long v12, v12

    cmp-long v14, v12, v6

    if-gtz v14, :cond_1

    invoke-virtual {v8}, Li6/x;->b()Li6/x;

    move-result-object v11

    iput-object v11, v3, Li6/f;->m:Li6/x;

    invoke-static {v8}, Li6/y;->b(Li6/x;)V

    sub-long/2addr v6, v12

    goto :goto_1

    :cond_1
    long-to-int v6, v6

    sub-int/2addr v11, v6

    iput v11, v8, Li6/x;->c:I

    :cond_2
    const/4 v6, 0x0

    iput-object v6, v0, Li6/f$a;->o:Li6/x;

    iput-wide v1, v0, Li6/f$a;->p:J

    iput-object v6, v0, Li6/f$a;->q:[B

    const/4 v6, -0x1

    iput v6, v0, Li6/f$a;->r:I

    iput v6, v0, Li6/f$a;->s:I

    goto :goto_3

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "newSize < 0: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    if-lez v6, :cond_6

    sub-long v11, v1, v4

    move v6, v8

    :goto_2
    cmp-long v13, v11, v9

    if-lez v13, :cond_6

    invoke-virtual {v3, v8}, Li6/f;->p1(I)Li6/x;

    move-result-object v13

    iget v14, v13, Li6/x;->c:I

    rsub-int v14, v14, 0x2000

    int-to-long v14, v14

    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    long-to-int v14, v14

    iget v15, v13, Li6/x;->c:I

    add-int/2addr v15, v14

    iput v15, v13, Li6/x;->c:I

    int-to-long v7, v14

    sub-long/2addr v11, v7

    if-eqz v6, :cond_5

    iput-object v13, v0, Li6/f$a;->o:Li6/x;

    iput-wide v4, v0, Li6/f$a;->p:J

    iget-object v6, v13, Li6/x;->a:[B

    iput-object v6, v0, Li6/f$a;->q:[B

    sub-int v6, v15, v14

    iput v6, v0, Li6/f$a;->r:I

    iput v15, v0, Li6/f$a;->s:I

    const/4 v6, 0x0

    :cond_5
    const/4 v8, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    invoke-virtual {v3, v1, v2}, Li6/f;->l1(J)V

    return-wide v4

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "resizeBuffer() only permitted for read/write buffers"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "not attached to a buffer"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Li6/f$a;->m:Li6/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Li6/f$a;->m:Li6/f;

    .line 12
    .line 13
    iput-object v0, p0, Li6/f$a;->o:Li6/x;

    .line 14
    .line 15
    const-wide/16 v1, -0x1

    .line 16
    .line 17
    iput-wide v1, p0, Li6/f$a;->p:J

    .line 18
    .line 19
    iput-object v0, p0, Li6/f$a;->q:[B

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    iput v0, p0, Li6/f$a;->r:I

    .line 23
    .line 24
    iput v0, p0, Li6/f$a;->s:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "not attached to a buffer"

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final d(J)I
    .locals 11

    .line 1
    iget-object v0, p0, Li6/f$a;->m:Li6/f;

    if-eqz v0, :cond_a

    const/4 v1, -0x1

    int-to-long v2, v1

    cmp-long v2, p1, v2

    if-ltz v2, :cond_9

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v2

    cmp-long v2, p1, v2

    if-gtz v2, :cond_9

    const-wide/16 v2, -0x1

    cmp-long v2, p1, v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v2

    cmp-long v2, p1, v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v1

    iget-object v3, v0, Li6/f;->m:Li6/x;

    iget-object v4, p0, Li6/f$a;->o:Li6/x;

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_2

    iget-wide v7, p0, Li6/f$a;->p:J

    iget v9, p0, Li6/f$a;->r:I

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v4, v4, Li6/x;->b:I

    sub-int/2addr v9, v4

    int-to-long v9, v9

    sub-long/2addr v7, v9

    cmp-long v4, v7, p1

    if-lez v4, :cond_1

    iget-object v1, p0, Li6/f$a;->o:Li6/x;

    move-object v4, v3

    move-object v3, v1

    move-wide v1, v7

    goto :goto_0

    :cond_1
    iget-object v4, p0, Li6/f$a;->o:Li6/x;

    move-wide v5, v7

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    sub-long v7, v1, p1

    sub-long v9, p1, v5

    cmp-long v7, v7, v9

    if-lez v7, :cond_3

    :goto_1
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v1, v4, Li6/x;->c:I

    iget v2, v4, Li6/x;->b:I

    sub-int v3, v1, v2

    int-to-long v7, v3

    add-long/2addr v7, v5

    cmp-long v3, p1, v7

    if-ltz v3, :cond_5

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr v5, v1

    iget-object v4, v4, Li6/x;->f:Li6/x;

    goto :goto_1

    :cond_3
    :goto_2
    cmp-long v4, v1, p1

    if-lez v4, :cond_4

    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v3, v3, Li6/x;->g:Li6/x;

    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v4, v3, Li6/x;->c:I

    iget v5, v3, Li6/x;->b:I

    sub-int/2addr v4, v5

    int-to-long v4, v4

    sub-long/2addr v1, v4

    goto :goto_2

    :cond_4
    move-wide v5, v1

    move-object v4, v3

    :cond_5
    iget-boolean v1, p0, Li6/f$a;->n:Z

    if-eqz v1, :cond_7

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-boolean v1, v4, Li6/x;->d:Z

    if-eqz v1, :cond_7

    invoke-virtual {v4}, Li6/x;->f()Li6/x;

    move-result-object v1

    iget-object v2, v0, Li6/f;->m:Li6/x;

    if-ne v2, v4, :cond_6

    iput-object v1, v0, Li6/f;->m:Li6/x;

    :cond_6
    invoke-virtual {v4, v1}, Li6/x;->c(Li6/x;)Li6/x;

    move-result-object v4

    iget-object v0, v4, Li6/x;->g:Li6/x;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    :cond_7
    iput-object v4, p0, Li6/f$a;->o:Li6/x;

    iput-wide p1, p0, Li6/f$a;->p:J

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v0, v4, Li6/x;->a:[B

    iput-object v0, p0, Li6/f$a;->q:[B

    iget v0, v4, Li6/x;->b:I

    sub-long/2addr p1, v5

    long-to-int p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Li6/f$a;->r:I

    iget p1, v4, Li6/x;->c:I

    iput p1, p0, Li6/f$a;->s:I

    sub-int/2addr p1, v0

    return p1

    :cond_8
    :goto_3
    const/4 v0, 0x0

    iput-object v0, p0, Li6/f$a;->o:Li6/x;

    iput-wide p1, p0, Li6/f$a;->p:J

    iput-object v0, p0, Li6/f$a;->q:[B

    iput v1, p0, Li6/f$a;->r:I

    iput v1, p0, Li6/f$a;->s:I

    return v1

    :cond_9
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    sget-object v2, Lw5/y;->a:Lw5/y;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "offset=%s > size=%s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "not attached to a buffer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

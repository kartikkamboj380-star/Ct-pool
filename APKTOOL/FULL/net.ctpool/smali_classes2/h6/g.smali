.class public final Lh6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/g$a;
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:Z

.field private m:Z

.field private n:I

.field private o:J

.field private p:Z

.field private q:Z

.field private r:Z

.field private final s:Li6/f;

.field private final t:Li6/f;

.field private u:Lh6/c;

.field private final v:[B

.field private final w:Li6/f$a;

.field private final x:Z

.field private final y:Li6/h;

.field private final z:Lh6/g$a;


# direct methods
.method public constructor <init>(ZLi6/h;Lh6/g$a;ZZ)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "frameCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lh6/g;->x:Z

    .line 15
    .line 16
    iput-object p2, p0, Lh6/g;->y:Li6/h;

    .line 17
    .line 18
    iput-object p3, p0, Lh6/g;->z:Lh6/g$a;

    .line 19
    .line 20
    iput-boolean p4, p0, Lh6/g;->A:Z

    .line 21
    .line 22
    iput-boolean p5, p0, Lh6/g;->B:Z

    .line 23
    .line 24
    new-instance p2, Li6/f;

    .line 25
    .line 26
    invoke-direct {p2}, Li6/f;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lh6/g;->s:Li6/f;

    .line 30
    .line 31
    new-instance p2, Li6/f;

    .line 32
    .line 33
    invoke-direct {p2}, Li6/f;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lh6/g;->t:Li6/f;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    move-object p3, p2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p3, 0x4

    .line 44
    new-array p3, p3, [B

    .line 45
    .line 46
    :goto_0
    iput-object p3, p0, Lh6/g;->v:[B

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p2, Li6/f$a;

    .line 52
    .line 53
    invoke-direct {p2}, Li6/f$a;-><init>()V

    .line 54
    .line 55
    .line 56
    :goto_1
    iput-object p2, p0, Lh6/g;->w:Li6/f$a;

    .line 57
    .line 58
    return-void
.end method

.method private final b()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lh6/g;->o:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v4, p0, Lh6/g;->y:Li6/h;

    iget-object v5, p0, Lh6/g;->s:Li6/f;

    invoke-interface {v4, v5, v0, v1}, Li6/h;->m0(Li6/f;J)V

    iget-boolean v0, p0, Lh6/g;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh6/g;->s:Li6/f;

    iget-object v1, p0, Lh6/g;->w:Li6/f$a;

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Li6/f;->R0(Li6/f$a;)Li6/f$a;

    iget-object v0, p0, Lh6/g;->w:Li6/f$a;

    invoke-virtual {v0, v2, v3}, Li6/f$a;->d(J)I

    sget-object v0, Lh6/f;->a:Lh6/f;

    iget-object v1, p0, Lh6/g;->w:Li6/f$a;

    iget-object v4, p0, Lh6/g;->v:[B

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v4}, Lh6/f;->b(Li6/f$a;[B)V

    iget-object v0, p0, Lh6/g;->w:Li6/f$a;

    invoke-virtual {v0}, Li6/f$a;->close()V

    :cond_0
    iget v0, p0, Lh6/g;->n:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown control opcode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lh6/g;->n:I

    invoke-static {v2}, LU5/c;->N(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lh6/g;->z:Lh6/g$a;

    iget-object v1, p0, Lh6/g;->s:Li6/f;

    invoke-virtual {v1}, Li6/f;->f1()Li6/i;

    move-result-object v1

    invoke-interface {v0, v1}, Lh6/g$a;->g(Li6/i;)V

    goto :goto_1

    :pswitch_1
    iget-object v0, p0, Lh6/g;->z:Lh6/g$a;

    iget-object v1, p0, Lh6/g;->s:Li6/f;

    invoke-virtual {v1}, Li6/f;->f1()Li6/i;

    move-result-object v1

    invoke-interface {v0, v1}, Lh6/g$a;->d(Li6/i;)V

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lh6/g;->s:Li6/f;

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v4, 0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_3

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh6/g;->s:Li6/f;

    invoke-virtual {v0}, Li6/f;->O0()S

    move-result v0

    iget-object v1, p0, Lh6/g;->s:Li6/f;

    invoke-virtual {v1}, Li6/f;->J0()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lh6/f;->a:Lh6/f;

    invoke-virtual {v2, v0}, Lh6/f;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v0, 0x3ed

    const-string v1, ""

    :goto_0
    iget-object v2, p0, Lh6/g;->z:Lh6/g$a;

    invoke-interface {v2, v0, v1}, Lh6/g$a;->h(ILjava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh6/g;->m:Z

    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed close payload length of 1."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final d()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lh6/g;->m:Z

    if-nez v0, :cond_14

    iget-object v0, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v0}, Li6/C;->i()Li6/D;

    move-result-object v0

    invoke-virtual {v0}, Li6/D;->h()J

    move-result-wide v0

    iget-object v2, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v2}, Li6/C;->i()Li6/D;

    move-result-object v2

    invoke-virtual {v2}, Li6/D;->b()Li6/D;

    :try_start_0
    iget-object v2, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v2}, Li6/h;->q0()B

    move-result v2

    const/16 v3, 0xff

    invoke-static {v2, v3}, LU5/c;->b(BI)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v4}, Li6/C;->i()Li6/D;

    move-result-object v4

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v0, v1, v5}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    and-int/lit8 v0, v2, 0xf

    iput v0, p0, Lh6/g;->n:I

    and-int/lit16 v1, v2, 0x80

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iput-boolean v1, p0, Lh6/g;->p:Z

    and-int/lit8 v6, v2, 0x8

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    iput-boolean v6, p0, Lh6/g;->q:Z

    if-eqz v6, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frames must be final."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    and-int/lit8 v1, v2, 0x40

    if-eqz v1, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    const-string v6, "Unexpected rsv1 flag"

    if-eq v0, v5, :cond_6

    const/4 v7, 0x2

    if-eq v0, v7, :cond_6

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz v1, :cond_8

    iget-boolean v0, p0, Lh6/g;->A:Z

    if-eqz v0, :cond_7

    move v0, v5

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move v0, v4

    :goto_4
    iput-boolean v0, p0, Lh6/g;->r:Z

    :goto_5
    and-int/lit8 v0, v2, 0x20

    if-nez v0, :cond_13

    and-int/lit8 v0, v2, 0x10

    if-nez v0, :cond_12

    iget-object v0, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v0}, Li6/h;->q0()B

    move-result v0

    invoke-static {v0, v3}, LU5/c;->b(BI)I

    move-result v0

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_9

    move v4, v5

    :cond_9
    iget-boolean v1, p0, Lh6/g;->x:Z

    if-ne v4, v1, :cond_b

    new-instance v0, Ljava/net/ProtocolException;

    iget-boolean v1, p0, Lh6/g;->x:Z

    if-eqz v1, :cond_a

    const-string v1, "Server-sent frames must not be masked."

    goto :goto_6

    :cond_a
    const-string v1, "Client-sent frames must be masked."

    :goto_6
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    const/16 v1, 0x7f

    and-int/2addr v0, v1

    int-to-long v2, v0

    iput-wide v2, p0, Lh6/g;->o:J

    const/16 v0, 0x7e

    int-to-long v5, v0

    cmp-long v0, v2, v5

    if-nez v0, :cond_c

    iget-object v0, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v0}, Li6/h;->O0()S

    move-result v0

    const v1, 0xffff

    invoke-static {v0, v1}, LU5/c;->c(SI)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lh6/g;->o:J

    goto :goto_7

    :cond_c
    int-to-long v0, v1

    cmp-long v0, v2, v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v0}, Li6/h;->K()J

    move-result-wide v0

    iput-wide v0, p0, Lh6/g;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Frame length 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lh6/g;->o:J

    invoke-static {v2, v3}, LU5/c;->O(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > 0x7FFFFFFFFFFFFFFF"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_7
    iget-boolean v0, p0, Lh6/g;->q:Z

    if-eqz v0, :cond_10

    iget-wide v0, p0, Lh6/g;->o:J

    const-wide/16 v2, 0x7d

    cmp-long v0, v0, v2

    if-gtz v0, :cond_f

    goto :goto_8

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frame must be less than 125B."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_8
    if-eqz v4, :cond_11

    iget-object v0, p0, Lh6/g;->y:Li6/h;

    iget-object v1, p0, Lh6/g;->v:[B

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Li6/h;->u0([B)V

    :cond_11
    return-void

    :cond_12
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv3 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv2 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lh6/g;->y:Li6/h;

    invoke-interface {v3}, Li6/C;->i()Li6/D;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    throw v2

    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final e()V
    .locals 5

    .line 1
    :goto_0
    iget-boolean v0, p0, Lh6/g;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-wide v0, p0, Lh6/g;->o:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lh6/g;->y:Li6/h;

    .line 14
    .line 15
    iget-object v3, p0, Lh6/g;->t:Li6/f;

    .line 16
    .line 17
    invoke-interface {v2, v3, v0, v1}, Li6/h;->m0(Li6/f;J)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lh6/g;->x:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lh6/g;->t:Li6/f;

    .line 25
    .line 26
    iget-object v1, p0, Lh6/g;->w:Li6/f$a;

    .line 27
    .line 28
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Li6/f;->R0(Li6/f$a;)Li6/f$a;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lh6/g;->w:Li6/f$a;

    .line 35
    .line 36
    iget-object v1, p0, Lh6/g;->t:Li6/f;

    .line 37
    .line 38
    invoke-virtual {v1}, Li6/f;->m1()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    iget-wide v3, p0, Lh6/g;->o:J

    .line 43
    .line 44
    sub-long/2addr v1, v3

    .line 45
    invoke-virtual {v0, v1, v2}, Li6/f$a;->d(J)I

    .line 46
    .line 47
    .line 48
    sget-object v0, Lh6/f;->a:Lh6/f;

    .line 49
    .line 50
    iget-object v1, p0, Lh6/g;->w:Li6/f$a;

    .line 51
    .line 52
    iget-object v2, p0, Lh6/g;->v:[B

    .line 53
    .line 54
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Lh6/f;->b(Li6/f$a;[B)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lh6/g;->w:Li6/f$a;

    .line 61
    .line 62
    invoke-virtual {v0}, Li6/f$a;->close()V

    .line 63
    .line 64
    .line 65
    :cond_0
    iget-boolean v0, p0, Lh6/g;->p:Z

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-direct {p0}, Lh6/g;->g()V

    .line 71
    .line 72
    .line 73
    iget v0, p0, Lh6/g;->n:I

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v2, "Expected continuation opcode. Got: "

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v2, p0, Lh6/g;->n:I

    .line 91
    .line 92
    invoke-static {v2}, LU5/c;->N(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 108
    .line 109
    const-string v1, "closed"

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method private final f()V
    .locals 4

    .line 1
    iget v0, p0, Lh6/g;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Ljava/net/ProtocolException;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Unknown opcode: "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, LU5/c;->N(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    :goto_0
    invoke-direct {p0}, Lh6/g;->e()V

    .line 38
    .line 39
    .line 40
    iget-boolean v2, p0, Lh6/g;->r:Z

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    iget-object v2, p0, Lh6/g;->u:Lh6/c;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance v2, Lh6/c;

    .line 50
    .line 51
    iget-boolean v3, p0, Lh6/g;->B:Z

    .line 52
    .line 53
    invoke-direct {v2, v3}, Lh6/c;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lh6/g;->u:Lh6/c;

    .line 57
    .line 58
    :goto_1
    iget-object v3, p0, Lh6/g;->t:Li6/f;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Lh6/c;->a(Li6/f;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    if-ne v0, v1, :cond_4

    .line 64
    .line 65
    iget-object v0, p0, Lh6/g;->z:Lh6/g$a;

    .line 66
    .line 67
    iget-object v1, p0, Lh6/g;->t:Li6/f;

    .line 68
    .line 69
    invoke-virtual {v1}, Li6/f;->J0()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Lh6/g$a;->e(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iget-object v0, p0, Lh6/g;->z:Lh6/g$a;

    .line 78
    .line 79
    iget-object v1, p0, Lh6/g;->t:Li6/f;

    .line 80
    .line 81
    invoke-virtual {v1}, Li6/f;->f1()Li6/i;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v0, v1}, Lh6/g$a;->a(Li6/i;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-void
.end method

.method private final g()V
    .locals 1

    .line 1
    :goto_0
    iget-boolean v0, p0, Lh6/g;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lh6/g;->d()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lh6/g;->q:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-direct {p0}, Lh6/g;->b()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh6/g;->d()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lh6/g;->q:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lh6/g;->b()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Lh6/g;->f()V

    .line 13
    .line 14
    .line 15
    :goto_0
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/g;->u:Lh6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh6/c;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.class public final Lh6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final m:Li6/f;

.field private final n:Ljava/util/zip/Deflater;

.field private final o:Li6/j;

.field private final p:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lh6/a;->p:Z

    .line 5
    .line 6
    new-instance p1, Li6/f;

    .line 7
    .line 8
    invoke-direct {p1}, Li6/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lh6/a;->m:Li6/f;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Deflater;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lh6/a;->n:Ljava/util/zip/Deflater;

    .line 21
    .line 22
    new-instance v1, Li6/j;

    .line 23
    .line 24
    invoke-direct {v1, p1, v0}, Li6/j;-><init>(Li6/A;Ljava/util/zip/Deflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lh6/a;->o:Li6/j;

    .line 28
    .line 29
    return-void
.end method

.method private final b(Li6/f;Li6/i;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Li6/i;->C()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    int-to-long v2, v2

    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-virtual {p1, v0, v1, p2}, Li6/f;->j0(JLi6/i;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method


# virtual methods
.method public final a(Li6/f;)V
    .locals 5

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/a;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-boolean v0, p0, Lh6/a;->p:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lh6/a;->n:Ljava/util/zip/Deflater;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->reset()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lh6/a;->o:Li6/j;

    .line 35
    .line 36
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {v0, p1, v3, v4}, Li6/j;->w0(Li6/f;J)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lh6/a;->o:Li6/j;

    .line 44
    .line 45
    invoke-virtual {v0}, Li6/j;->flush()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lh6/a;->m:Li6/f;

    .line 49
    .line 50
    invoke-static {}, Lh6/b;->a()Li6/i;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {p0, v0, v3}, Lh6/a;->b(Li6/f;Li6/i;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Lh6/a;->m:Li6/f;

    .line 61
    .line 62
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    const/4 v3, 0x4

    .line 67
    int-to-long v3, v3

    .line 68
    sub-long/2addr v0, v3

    .line 69
    iget-object v3, p0, Lh6/a;->m:Li6/f;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static {v3, v4, v2, v4}, Li6/f;->b1(Li6/f;Li6/f$a;ILjava/lang/Object;)Li6/f$a;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :try_start_0
    invoke-virtual {v2, v0, v1}, Li6/f$a;->b(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v4}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    invoke-static {v2, p1}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_2
    iget-object v0, p0, Lh6/a;->m:Li6/f;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Li6/f;->t1(I)Li6/f;

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, Lh6/a;->m:Li6/f;

    .line 96
    .line 97
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    invoke-virtual {p1, v0, v1, v2}, Li6/f;->w0(Li6/f;J)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    const-string v0, "Failed requirement."

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/a;->o:Li6/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/j;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

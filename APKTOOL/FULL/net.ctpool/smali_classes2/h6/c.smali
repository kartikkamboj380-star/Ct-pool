.class public final Lh6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final m:Li6/f;

.field private final n:Ljava/util/zip/Inflater;

.field private final o:Li6/o;

.field private final p:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lh6/c;->p:Z

    .line 5
    .line 6
    new-instance p1, Li6/f;

    .line 7
    .line 8
    invoke-direct {p1}, Li6/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lh6/c;->m:Li6/f;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Inflater;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lh6/c;->n:Ljava/util/zip/Inflater;

    .line 20
    .line 21
    new-instance v1, Li6/o;

    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Li6/o;-><init>(Li6/C;Ljava/util/zip/Inflater;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lh6/c;->o:Li6/o;

    .line 27
    .line 28
    return-void
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
    iget-object v0, p0, Lh6/c;->m:Li6/f;

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
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-boolean v0, p0, Lh6/c;->p:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lh6/c;->n:Ljava/util/zip/Inflater;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lh6/c;->m:Li6/f;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Li6/f;->x(Li6/C;)J

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lh6/c;->m:Li6/f;

    .line 38
    .line 39
    const v1, 0xffff

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Li6/f;->w1(I)Li6/f;

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lh6/c;->n:Ljava/util/zip/Inflater;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    iget-object v2, p0, Lh6/c;->m:Li6/f;

    .line 52
    .line 53
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    add-long/2addr v0, v2

    .line 58
    :cond_2
    iget-object v2, p0, Lh6/c;->o:Li6/o;

    .line 59
    .line 60
    const-wide v3, 0x7fffffffffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1, v3, v4}, Li6/o;->a(Li6/f;J)J

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lh6/c;->n:Ljava/util/zip/Inflater;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    cmp-long v2, v2, v0

    .line 75
    .line 76
    if-ltz v2, :cond_2

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Failed requirement."

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/c;->o:Li6/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/o;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

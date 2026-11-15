.class public Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG1/w;
.implements Ljava/io/Closeable;


# annotations
.annotation build LO0/d;
.end annotation


# instance fields
.field private final m:J

.field private final n:I

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "imagepipeline"

    invoke-static {v0}, LN2/a;->d(Ljava/lang/String;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, LO0/l;->b(Ljava/lang/Boolean;)V

    iput p1, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    invoke-static {p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeAllocate(I)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o:Z

    return-void
.end method

.method private a(ILG1/w;II)V
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->isClosed()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    invoke-static {v0}, LO0/l;->i(Z)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, LG1/w;->isClosed()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    xor-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    invoke-static {v0}, LO0/l;->i(Z)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, LG1/w;->n()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v1, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    .line 28
    .line 29
    invoke-static {p1, v0, p3, p4, v1}, LG1/x;->b(IIIII)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, LG1/w;->J()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    int-to-long p2, p3

    .line 37
    add-long/2addr v0, p2

    .line 38
    iget-wide p2, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    .line 39
    .line 40
    int-to-long v2, p1

    .line 41
    add-long/2addr p2, v2

    .line 42
    invoke-static {v0, v1, p2, p3, p4}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeMemcpy(JJI)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string p2, "Cannot copy two incompatible MemoryChunks"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method private static native nativeAllocate(I)J
    .annotation build LO0/d;
    .end annotation
.end method

.method private static native nativeCopyFromByteArray(J[BII)V
    .annotation build LO0/d;
    .end annotation
.end method

.method private static native nativeCopyToByteArray(J[BII)V
    .annotation build LO0/d;
    .end annotation
.end method

.method private static native nativeFree(J)V
    .annotation build LO0/d;
    .end annotation
.end method

.method private static native nativeMemcpy(JJI)V
    .annotation build LO0/d;
    .end annotation
.end method

.method private static native nativeReadByte(J)B
    .annotation build LO0/d;
    .end annotation
.end method


# virtual methods
.method public B()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public J()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    return-wide v0
.end method

.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o:Z

    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeFree(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method protected finalize()V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finalize: Chunk "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " still active. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeMemoryChunk"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public declared-synchronized isClosed()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k(I)B
    .locals 4

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-static {v0}, LO0/l;->i(Z)V

    if-ltz p1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    if-ge p1, v0, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeReadByte(J)B

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized m(I[BII)I
    .locals 4

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->isClosed()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LO0/l;->i(Z)V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    invoke-static {p1, p4, v0}, LG1/x;->a(III)I

    move-result p4

    array-length v0, p2

    iget v1, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    invoke-static {p1, v0, p3, p4, v1}, LG1/x;->b(IIIII)V

    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-static {v0, v1, p2, p3, p4}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeCopyToByteArray(J[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    return v0
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    return-wide v0
.end method

.method public w(ILG1/w;II)V
    .locals 4

    .line 1
    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, LG1/w;->o()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "NativeMemoryChunk"

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Copying from NativeMemoryChunk "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, " to NativeMemoryChunk "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, " which share the same address "

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-wide v2, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    .line 61
    .line 62
    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-interface {p2}, LG1/w;->o()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->o()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    cmp-long v0, v0, v2

    .line 90
    .line 91
    if-gez v0, :cond_1

    .line 92
    .line 93
    monitor-enter p2

    .line 94
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :try_start_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->a(ILG1/w;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    goto :goto_0

    .line 103
    :catchall_1
    move-exception p1

    .line 104
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 105
    :try_start_4
    throw p1

    .line 106
    :goto_0
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    throw p1

    .line 108
    :cond_1
    monitor-enter p0

    .line 109
    :try_start_5
    monitor-enter p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 110
    :try_start_6
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->a(ILG1/w;II)V

    .line 111
    .line 112
    .line 113
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 114
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 115
    return-void

    .line 116
    :catchall_2
    move-exception p1

    .line 117
    goto :goto_1

    .line 118
    :catchall_3
    move-exception p1

    .line 119
    :try_start_8
    monitor-exit p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 120
    :try_start_9
    throw p1

    .line 121
    :goto_1
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 122
    throw p1
.end method

.method public declared-synchronized z(I[BII)I
    .locals 4

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->isClosed()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LO0/l;->i(Z)V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    invoke-static {p1, p4, v0}, LG1/x;->a(III)I

    move-result p4

    array-length v0, p2

    iget v1, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->n:I

    invoke-static {p1, v0, p3, p4, v1}, LG1/x;->b(IIIII)V

    iget-wide v0, p0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->m:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-static {v0, v1, p2, p3, p4}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;->nativeCopyFromByteArray(J[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

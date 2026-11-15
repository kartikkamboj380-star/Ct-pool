.class public LJ5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/d;


# static fields
.field private static final e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _closeCause:Ljava/lang/Object;

.field private final b:I

.field private volatile bufferEnd:J

.field private volatile bufferEndSegment:Ljava/lang/Object;

.field public final c:Lv5/l;

.field private volatile closeHandler:Ljava/lang/Object;

.field private volatile completedExpandBuffersAndPauseFlag:J

.field private final d:Lv5/q;

.field private volatile receiveSegment:Ljava/lang/Object;

.field private volatile receivers:J

.field private volatile sendSegment:Ljava/lang/Object;

.field private volatile sendersAndCloseStatus:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "sendersAndCloseStatus"

    .line 2
    .line 3
    const-class v1, LJ5/b;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    const-string v0, "receivers"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "bufferEnd"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LJ5/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-string v0, "completedExpandBuffersAndPauseFlag"

    .line 28
    .line 29
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    const-string v0, "sendSegment"

    .line 36
    .line 37
    const-class v2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, LJ5/b;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    const-string v0, "receiveSegment"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 52
    .line 53
    const-string v0, "bufferEndSegment"

    .line 54
    .line 55
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    const-string v0, "_closeCause"

    .line 62
    .line 63
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, LJ5/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    const-string v0, "closeHandler"

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LJ5/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(ILv5/l;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LJ5/b;->b:I

    .line 5
    .line 6
    iput-object p2, p0, LJ5/b;->c:Lv5/l;

    .line 7
    .line 8
    if-ltz p1, :cond_2

    .line 9
    .line 10
    invoke-static {p1}, LJ5/c;->s(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, LJ5/b;->bufferEnd:J

    .line 15
    .line 16
    invoke-direct {p0}, LJ5/b;->C()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LJ5/b;->completedExpandBuffersAndPauseFlag:J

    .line 21
    .line 22
    new-instance p1, LJ5/h;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v7, 0x3

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    move-object v6, p0

    .line 30
    invoke-direct/range {v2 .. v7}, LJ5/h;-><init>(JLJ5/h;LJ5/b;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LJ5/b;->sendSegment:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, p0, LJ5/b;->receiveSegment:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {p0}, LJ5/b;->T()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-static {}, LJ5/c;->m()LJ5/h;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 48
    .line 49
    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iput-object p1, p0, LJ5/b;->bufferEndSegment:Ljava/lang/Object;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    new-instance p1, LJ5/b$a;

    .line 57
    .line 58
    invoke-direct {p1, p0}, LJ5/b$a;-><init>(LJ5/b;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    :goto_0
    iput-object p1, p0, LJ5/b;->d:Lv5/q;

    .line 64
    .line 65
    invoke-static {}, LJ5/c;->l()LM5/F;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, LJ5/b;->_closeCause:Ljava/lang/Object;

    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v0, "Invalid channel capacity: "

    .line 78
    .line 79
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p1, ", should be >=0"

    .line 86
    .line 87
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p2
.end method

.method private final A(JLJ5/h;)LJ5/h;
    .locals 9

    .line 1
    sget-object v0, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-static {}, LJ5/c;->x()LD5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lv5/p;

    .line 8
    .line 9
    :goto_0
    invoke-static {p3, p1, p2, v1}, LM5/d;->c(LM5/C;JLv5/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_4

    .line 18
    .line 19
    invoke-static {v2}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, LM5/C;

    .line 28
    .line 29
    iget-wide v5, v4, LM5/C;->o:J

    .line 30
    .line 31
    iget-wide v7, v3, LM5/C;->o:J

    .line 32
    .line 33
    cmp-long v5, v5, v7

    .line 34
    .line 35
    if-ltz v5, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-virtual {v3}, LM5/C;->q()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    invoke-virtual {v4}, LM5/C;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {v4}, LM5/e;->k()V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-virtual {v3}, LM5/C;->m()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-virtual {v3}, LM5/e;->k()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_2
    invoke-static {v2}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-direct {p0}, LJ5/b;->w()V

    .line 79
    .line 80
    .line 81
    iget-wide p1, p3, LM5/C;->o:J

    .line 82
    .line 83
    sget v0, LJ5/c;->b:I

    .line 84
    .line 85
    int-to-long v2, v0

    .line 86
    mul-long/2addr p1, v2

    .line 87
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    cmp-long p1, p1, v2

    .line 92
    .line 93
    if-gez p1, :cond_a

    .line 94
    .line 95
    :goto_3
    invoke-virtual {p3}, LM5/e;->b()V

    .line 96
    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_5
    invoke-static {v2}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    check-cast p3, LJ5/h;

    .line 104
    .line 105
    invoke-direct {p0}, LJ5/b;->T()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    invoke-direct {p0}, LJ5/b;->C()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    sget v0, LJ5/c;->b:I

    .line 116
    .line 117
    int-to-long v4, v0

    .line 118
    div-long/2addr v2, v4

    .line 119
    cmp-long v0, p1, v2

    .line 120
    .line 121
    if-gtz v0, :cond_8

    .line 122
    .line 123
    sget-object v0, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 124
    .line 125
    :cond_6
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, LM5/C;

    .line 130
    .line 131
    iget-wide v3, v2, LM5/C;->o:J

    .line 132
    .line 133
    iget-wide v5, p3, LM5/C;->o:J

    .line 134
    .line 135
    cmp-long v3, v3, v5

    .line 136
    .line 137
    if-gez v3, :cond_8

    .line 138
    .line 139
    invoke-virtual {p3}, LM5/C;->q()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_8

    .line 144
    .line 145
    invoke-static {v0, p0, v2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_7

    .line 150
    .line 151
    invoke-virtual {v2}, LM5/C;->m()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    invoke-virtual {v2}, LM5/e;->k()V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    invoke-virtual {p3}, LM5/C;->m()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    invoke-virtual {p3}, LM5/e;->k()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    :goto_5
    iget-wide v2, p3, LM5/C;->o:J

    .line 172
    .line 173
    cmp-long p1, v2, p1

    .line 174
    .line 175
    if-lez p1, :cond_9

    .line 176
    .line 177
    sget p1, LJ5/c;->b:I

    .line 178
    .line 179
    int-to-long v4, p1

    .line 180
    mul-long/2addr v2, v4

    .line 181
    invoke-direct {p0, v2, v3}, LJ5/b;->u0(J)V

    .line 182
    .line 183
    .line 184
    iget-wide v2, p3, LM5/C;->o:J

    .line 185
    .line 186
    int-to-long p1, p1

    .line 187
    mul-long/2addr v2, p1

    .line 188
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 189
    .line 190
    .line 191
    move-result-wide p1

    .line 192
    cmp-long p1, v2, p1

    .line 193
    .line 194
    if-gez p1, :cond_a

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_9
    move-object v1, p3

    .line 198
    :cond_a
    :goto_6
    return-object v1
.end method

.method private final B(JLJ5/h;)LJ5/h;
    .locals 9

    .line 1
    sget-object v0, LJ5/b;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-static {}, LJ5/c;->x()LD5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lv5/p;

    .line 8
    .line 9
    :goto_0
    invoke-static {p3, p1, p2, v1}, LM5/d;->c(LM5/C;JLv5/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_4

    .line 18
    .line 19
    invoke-static {v2}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, LM5/C;

    .line 28
    .line 29
    iget-wide v5, v4, LM5/C;->o:J

    .line 30
    .line 31
    iget-wide v7, v3, LM5/C;->o:J

    .line 32
    .line 33
    cmp-long v5, v5, v7

    .line 34
    .line 35
    if-ltz v5, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-virtual {v3}, LM5/C;->q()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    invoke-virtual {v4}, LM5/C;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {v4}, LM5/e;->k()V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-virtual {v3}, LM5/C;->m()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-virtual {v3}, LM5/e;->k()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_2
    invoke-static {v2}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-direct {p0}, LJ5/b;->w()V

    .line 79
    .line 80
    .line 81
    iget-wide p1, p3, LM5/C;->o:J

    .line 82
    .line 83
    sget v0, LJ5/c;->b:I

    .line 84
    .line 85
    int-to-long v2, v0

    .line 86
    mul-long/2addr p1, v2

    .line 87
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    cmp-long p1, p1, v2

    .line 92
    .line 93
    if-gez p1, :cond_7

    .line 94
    .line 95
    :goto_3
    invoke-virtual {p3}, LM5/e;->b()V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-static {v2}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    check-cast p3, LJ5/h;

    .line 104
    .line 105
    iget-wide v2, p3, LM5/C;->o:J

    .line 106
    .line 107
    cmp-long p1, v2, p1

    .line 108
    .line 109
    if-lez p1, :cond_6

    .line 110
    .line 111
    sget p1, LJ5/c;->b:I

    .line 112
    .line 113
    int-to-long v4, p1

    .line 114
    mul-long/2addr v2, v4

    .line 115
    invoke-direct {p0, v2, v3}, LJ5/b;->v0(J)V

    .line 116
    .line 117
    .line 118
    iget-wide v2, p3, LM5/C;->o:J

    .line 119
    .line 120
    int-to-long p1, p1

    .line 121
    mul-long/2addr v2, p1

    .line 122
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    cmp-long p1, v2, p1

    .line 127
    .line 128
    if-gez p1, :cond_7

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move-object v1, p3

    .line 132
    :cond_7
    :goto_4
    return-object v1
.end method

.method private final C()J
    .locals 2

    .line 1
    sget-object v0, LJ5/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method private final E()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ5/b;->D()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LJ5/i;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, LJ5/i;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method private final J(J)V
    .locals 4

    .line 1
    sget-object v0, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 8
    .line 9
    and-long/2addr p1, v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long p1, p1, v2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    :goto_0
    sget-object p1, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    and-long/2addr p1, v0

    .line 23
    cmp-long p1, p1, v2

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method static synthetic K(LJ5/b;JILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const-wide/16 p1, 0x1

    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, LJ5/b;->J(J)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final L()V
    .locals 3

    .line 1
    sget-object v0, LJ5/b;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-static {}, LJ5/c;->d()LM5/F;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-static {}, LJ5/c;->e()LM5/F;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    const/4 v0, 0x1

    .line 28
    invoke-static {v1, v0}, Lw5/z;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lv5/l;

    .line 33
    .line 34
    check-cast v1, Lv5/l;

    .line 35
    .line 36
    invoke-virtual {p0}, LJ5/b;->D()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final M(LJ5/h;IJ)Z
    .locals 4

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-ne v0, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object p1, LJ5/c;->d:LM5/F;

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    if-ne v0, p1, :cond_2

    .line 19
    .line 20
    return p2

    .line 21
    :cond_2
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-ne v0, p1, :cond_3

    .line 26
    .line 27
    return v1

    .line 28
    :cond_3
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-ne v0, p1, :cond_4

    .line 33
    .line 34
    return v1

    .line 35
    :cond_4
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne v0, p1, :cond_5

    .line 40
    .line 41
    return v1

    .line 42
    :cond_5
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne v0, p1, :cond_6

    .line 47
    .line 48
    return v1

    .line 49
    :cond_6
    invoke-static {}, LJ5/c;->o()LM5/F;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne v0, p1, :cond_7

    .line 54
    .line 55
    return p2

    .line 56
    :cond_7
    invoke-static {}, LJ5/c;->p()LM5/F;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne v0, p1, :cond_8

    .line 61
    .line 62
    return v1

    .line 63
    :cond_8
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    cmp-long p1, p3, v2

    .line 68
    .line 69
    if-nez p1, :cond_9

    .line 70
    .line 71
    move v1, p2

    .line 72
    :cond_9
    return v1

    .line 73
    :cond_a
    :goto_0
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, p2, v0, v2}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    invoke-direct {p0}, LJ5/b;->y()V

    .line 84
    .line 85
    .line 86
    return v1
.end method

.method private final N(JZ)Z
    .locals 6

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    const-wide v4, 0xfffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eq v0, v3, :cond_2

    .line 19
    .line 20
    const/4 p3, 0x3

    .line 21
    if-ne v0, p3, :cond_1

    .line 22
    .line 23
    and-long/2addr p1, v4

    .line 24
    invoke-direct {p0, p1, p2}, LJ5/b;->u(J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string p2, "unexpected close status: "

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p2

    .line 56
    :cond_2
    and-long/2addr p1, v4

    .line 57
    invoke-direct {p0, p1, p2}, LJ5/b;->v(J)LJ5/h;

    .line 58
    .line 59
    .line 60
    if-eqz p3, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0}, LJ5/b;->I()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    :goto_1
    return v1
.end method

.method private final P(J)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, LJ5/b;->N(JZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method private final R(J)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, LJ5/b;->N(JZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method private final T()Z
    .locals 4

    .line 1
    invoke-direct {p0}, LJ5/b;->C()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    const-wide v2, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 24
    :goto_1
    return v0
.end method

.method private final U(LJ5/h;)J
    .locals 7

    .line 1
    :cond_0
    sget v0, LJ5/c;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    :goto_0
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    if-ge v3, v0, :cond_5

    .line 9
    .line 10
    iget-wide v3, p1, LM5/C;->o:J

    .line 11
    .line 12
    sget v5, LJ5/c;->b:I

    .line 13
    .line 14
    int-to-long v5, v5

    .line 15
    mul-long/2addr v3, v5

    .line 16
    int-to-long v5, v0

    .line 17
    add-long/2addr v3, v5

    .line 18
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long v5, v3, v5

    .line 23
    .line 24
    if-gez v5, :cond_1

    .line 25
    .line 26
    return-wide v1

    .line 27
    :cond_1
    invoke-virtual {p1, v0}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-ne v1, v2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    sget-object v2, LJ5/c;->d:LM5/F;

    .line 41
    .line 42
    if-ne v1, v2, :cond_4

    .line 43
    .line 44
    return-wide v3

    .line 45
    :cond_3
    :goto_1
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v0, v1, v2}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1}, LM5/C;->p()V

    .line 56
    .line 57
    .line 58
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_5
    invoke-virtual {p1}, LM5/e;->g()LM5/e;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, LJ5/h;

    .line 66
    .line 67
    if-nez p1, :cond_0

    .line 68
    .line 69
    return-wide v1
.end method

.method private final V()V
    .locals 7

    .line 1
    sget-object v6, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const/16 v0, 0x3c

    .line 8
    .line 9
    shr-long v0, v2, v0

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-wide v0, 0xfffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v0, v2

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-static {v0, v1, v4}, LJ5/c;->b(JI)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-object v0, v6

    .line 26
    move-object v1, p0

    .line 27
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method private final W()V
    .locals 7

    .line 1
    sget-object v6, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const-wide v0, 0xfffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v2

    .line 13
    const/4 v4, 0x3

    .line 14
    invoke-static {v0, v1, v4}, LJ5/c;->b(JI)J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    move-object v0, v6

    .line 19
    move-object v1, p0

    .line 20
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-void
.end method

.method private final X()V
    .locals 7

    .line 1
    sget-object v6, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const/16 v0, 0x3c

    .line 8
    .line 9
    shr-long v0, v2, v0

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    const-wide v4, 0xfffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    and-long v0, v2, v4

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    :goto_0
    invoke-static {v0, v1, v4}, LJ5/c;->b(JI)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    move-wide v4, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    and-long v0, v2, v4

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    move-object v0, v6

    .line 37
    move-object v1, p0

    .line 38
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    return-void
.end method

.method private final Y(JLJ5/h;)V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p3, LM5/C;->o:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-gez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p3}, LM5/e;->e()LM5/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LJ5/h;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move-object p3, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    invoke-virtual {p3}, LM5/C;->h()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p3}, LM5/e;->e()LM5/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LJ5/h;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object p3, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_2
    sget-object p1, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    :cond_4
    :goto_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, LM5/C;

    .line 42
    .line 43
    iget-wide v0, p2, LM5/C;->o:J

    .line 44
    .line 45
    iget-wide v2, p3, LM5/C;->o:J

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-ltz v0, :cond_5

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_5
    invoke-virtual {p3}, LM5/C;->q()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_6
    invoke-static {p1, p0, p2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_8

    .line 64
    .line 65
    invoke-virtual {p2}, LM5/C;->m()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    invoke-virtual {p2}, LM5/e;->k()V

    .line 72
    .line 73
    .line 74
    :cond_7
    :goto_4
    return-void

    .line 75
    :cond_8
    invoke-virtual {p3}, LM5/C;->m()Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p3}, LM5/e;->k()V

    .line 82
    .line 83
    .line 84
    goto :goto_3
.end method

.method private final a0(LH5/l;)V
    .locals 1

    .line 1
    sget-object v0, Li5/m;->m:Li5/m$a;

    .line 2
    .line 3
    invoke-direct {p0}, LJ5/b;->E()Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0}, Lm5/d;->h(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final d0(LH5/P0;LJ5/h;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ5/b;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2, p3}, LH5/P0;->b(LM5/C;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic e(LJ5/b;JLJ5/h;)LJ5/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ5/b;->A(JLJ5/h;)LJ5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e0(LH5/P0;LJ5/h;I)V
    .locals 1

    .line 1
    sget v0, LJ5/c;->b:I

    .line 2
    .line 3
    add-int/2addr p3, v0

    .line 4
    invoke-interface {p1, p2, p3}, LH5/P0;->b(LM5/C;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic f(LJ5/b;JLJ5/h;)LJ5/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ5/b;->B(JLJ5/h;)LJ5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f0(LJ5/b;Lm5/d;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, LJ5/b;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LJ5/h;

    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p0}, LJ5/b;->O()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_6

    .line 16
    .line 17
    invoke-static {}, LJ5/b;->h()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    sget v1, LJ5/c;->b:I

    .line 26
    .line 27
    int-to-long v2, v1

    .line 28
    div-long v2, v8, v2

    .line 29
    .line 30
    int-to-long v4, v1

    .line 31
    rem-long v4, v8, v4

    .line 32
    .line 33
    long-to-int v1, v4

    .line 34
    iget-wide v4, v0, LM5/C;->o:J

    .line 35
    .line 36
    cmp-long v4, v4, v2

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-static {p0, v2, v3, v0}, LJ5/b;->e(LJ5/b;JLJ5/h;)LJ5/h;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v0, v2

    .line 48
    :cond_2
    const/4 v7, 0x0

    .line 49
    move-object v2, p0

    .line 50
    move-object v3, v0

    .line 51
    move v4, v1

    .line 52
    move-wide v5, v8

    .line 53
    invoke-static/range {v2 .. v7}, LJ5/b;->o(LJ5/b;LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {}, LJ5/c;->q()LM5/F;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eq v2, v3, :cond_5

    .line 62
    .line 63
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-ne v2, v3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    cmp-long v1, v8, v1

    .line 74
    .line 75
    if-gez v1, :cond_0

    .line 76
    .line 77
    invoke-virtual {v0}, LM5/e;->b()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-static {}, LJ5/c;->r()LM5/F;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-ne v2, v3, :cond_4

    .line 86
    .line 87
    move-object v2, p0

    .line 88
    move-object v3, v0

    .line 89
    move v4, v1

    .line 90
    move-wide v5, v8

    .line 91
    move-object v7, p1

    .line 92
    invoke-direct/range {v2 .. v7}, LJ5/b;->g0(LJ5/h;IJLm5/d;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_4
    invoke-virtual {v0}, LM5/e;->b()V

    .line 98
    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string p1, "unexpected"

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_6
    invoke-direct {p0}, LJ5/b;->E()Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, LM5/E;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    throw p0
.end method

.method public static final synthetic g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final g0(LJ5/h;IJLm5/d;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p5}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LH5/o;->b(Lm5/d;)LH5/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move v3, p2

    .line 12
    move-wide v4, p3

    .line 13
    move-object v6, v0

    .line 14
    :try_start_0
    invoke-static/range {v1 .. v6}, LJ5/b;->o(LJ5/b;LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {}, LJ5/c;->q()LM5/F;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    invoke-static {p0, v0, p1, p2}, LJ5/b;->m(LJ5/b;LH5/P0;LJ5/h;I)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const/4 v7, 0x0

    .line 37
    if-ne v1, p2, :cond_b

    .line 38
    .line 39
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    cmp-long p2, p3, v1

    .line 44
    .line 45
    if-gez p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, LM5/e;->b()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-static {}, LJ5/b;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, LJ5/h;

    .line 59
    .line 60
    :cond_2
    :goto_0
    invoke-virtual {p0}, LJ5/b;->O()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    invoke-static {p0, v0}, LJ5/b;->l(LJ5/b;LH5/l;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_3
    invoke-static {}, LJ5/b;->h()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 76
    .line 77
    .line 78
    move-result-wide p2

    .line 79
    sget p4, LJ5/c;->b:I

    .line 80
    .line 81
    int-to-long v1, p4

    .line 82
    div-long v1, p2, v1

    .line 83
    .line 84
    int-to-long v3, p4

    .line 85
    rem-long v3, p2, v3

    .line 86
    .line 87
    long-to-int p4, v3

    .line 88
    iget-wide v3, p1, LM5/C;->o:J

    .line 89
    .line 90
    cmp-long v3, v3, v1

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-static {p0, v1, v2, p1}, LJ5/b;->e(LJ5/b;JLJ5/h;)LJ5/h;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    move-object p1, v1

    .line 102
    :cond_5
    move-object v1, p0

    .line 103
    move-object v2, p1

    .line 104
    move v3, p4

    .line 105
    move-wide v4, p2

    .line 106
    move-object v6, v0

    .line 107
    invoke-static/range {v1 .. v6}, LJ5/b;->o(LJ5/b;LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {}, LJ5/c;->q()LM5/F;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-ne v1, v2, :cond_7

    .line 116
    .line 117
    instance-of p2, v0, LH5/P0;

    .line 118
    .line 119
    if-eqz p2, :cond_6

    .line 120
    .line 121
    move-object v7, v0

    .line 122
    :cond_6
    if-eqz v7, :cond_c

    .line 123
    .line 124
    invoke-static {p0, v7, p1, p4}, LJ5/b;->m(LJ5/b;LH5/P0;LJ5/h;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    if-ne v1, p4, :cond_8

    .line 133
    .line 134
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    cmp-long p2, p2, v1

    .line 139
    .line 140
    if-gez p2, :cond_2

    .line 141
    .line 142
    invoke-virtual {p1}, LM5/e;->b()V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_8
    invoke-static {}, LJ5/c;->r()LM5/F;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    if-eq v1, p2, :cond_a

    .line 151
    .line 152
    invoke-virtual {p1}, LM5/e;->b()V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, LJ5/b;->c:Lv5/l;

    .line 156
    .line 157
    if-eqz p1, :cond_9

    .line 158
    .line 159
    invoke-virtual {v0}, LH5/m;->a()Lm5/g;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {p1, v1, p2}, LM5/x;->a(Lv5/l;Ljava/lang/Object;Lm5/g;)Lv5/l;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :cond_9
    :goto_1
    invoke-virtual {v0, v1, v7}, LH5/m;->c(Ljava/lang/Object;Lv5/l;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string p2, "unexpected"

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_b
    invoke-virtual {p1}, LM5/e;->b()V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, LJ5/b;->c:Lv5/l;

    .line 187
    .line 188
    if-eqz p1, :cond_9

    .line 189
    .line 190
    invoke-virtual {v0}, LH5/m;->a()Lm5/g;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-static {p1, v1, p2}, LM5/x;->a(Lv5/l;Ljava/lang/Object;Lm5/g;)Lv5/l;

    .line 195
    .line 196
    .line 197
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    goto :goto_1

    .line 199
    :cond_c
    :goto_2
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    if-ne p1, p2, :cond_d

    .line 208
    .line 209
    invoke-static {p5}, Lo5/h;->c(Lm5/d;)V

    .line 210
    .line 211
    .line 212
    :cond_d
    return-object p1

    .line 213
    :goto_3
    invoke-virtual {v0}, LH5/m;->L()V

    .line 214
    .line 215
    .line 216
    throw p1
.end method

.method public static final synthetic h()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final h0(LJ5/h;)V
    .locals 11

    .line 1
    iget-object v0, p0, LJ5/b;->c:Lv5/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LM5/l;->b(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/lang/Object;

    move-result-object v3

    :cond_0
    sget v4, LJ5/c;->b:I

    sub-int/2addr v4, v2

    :goto_0
    const/4 v5, -0x1

    if-ge v5, v4, :cond_b

    iget-wide v6, p1, LM5/C;->o:J

    sget v8, LJ5/c;->b:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    int-to-long v8, v4

    add-long/2addr v6, v8

    :cond_1
    invoke-virtual {p1, v4}, LJ5/h;->w(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {}, LJ5/c;->f()LM5/F;

    move-result-object v9

    if-eq v8, v9, :cond_c

    sget-object v9, LJ5/c;->d:LM5/F;

    if-ne v8, v9, :cond_3

    invoke-virtual {p0}, LJ5/b;->F()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    invoke-static {}, LJ5/c;->y()LM5/F;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, LJ5/h;->v(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LM5/x;->c(Lv5/l;Ljava/lang/Object;LM5/O;)LM5/O;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-virtual {p1, v4}, LJ5/h;->s(I)V

    :goto_2
    invoke-virtual {p1}, LM5/C;->p()V

    goto :goto_6

    :cond_3
    invoke-static {}, LJ5/c;->k()LM5/F;

    move-result-object v9

    if-eq v8, v9, :cond_a

    if-nez v8, :cond_4

    goto :goto_5

    :cond_4
    instance-of v9, v8, LH5/P0;

    if-nez v9, :cond_7

    instance-of v9, v8, LJ5/n;

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {}, LJ5/c;->o()LM5/F;

    move-result-object v9

    if-eq v8, v9, :cond_c

    invoke-static {}, LJ5/c;->p()LM5/F;

    move-result-object v9

    if-ne v8, v9, :cond_6

    goto :goto_7

    :cond_6
    invoke-static {}, LJ5/c;->o()LM5/F;

    move-result-object v9

    if-eq v8, v9, :cond_1

    goto :goto_6

    :cond_7
    :goto_3
    invoke-virtual {p0}, LJ5/b;->F()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    instance-of v9, v8, LJ5/n;

    if-eqz v9, :cond_8

    move-object v9, v8

    check-cast v9, LJ5/n;

    iget-object v9, v9, LJ5/n;->a:LH5/P0;

    goto :goto_4

    :cond_8
    move-object v9, v8

    check-cast v9, LH5/P0;

    :goto_4
    invoke-static {}, LJ5/c;->y()LM5/F;

    move-result-object v10

    invoke-virtual {p1, v4, v8, v10}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_9

    invoke-virtual {p1, v4}, LJ5/h;->v(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LM5/x;->c(Lv5/l;Ljava/lang/Object;LM5/O;)LM5/O;

    move-result-object v1

    :cond_9
    invoke-static {v3, v9}, LM5/l;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :cond_a
    :goto_5
    invoke-static {}, LJ5/c;->y()LM5/F;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :goto_6
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, LM5/e;->g()LM5/e;

    move-result-object p1

    check-cast p1, LJ5/h;

    if-nez p1, :cond_0

    :cond_c
    :goto_7
    if-eqz v3, :cond_e

    instance-of p1, v3, Ljava/util/ArrayList;

    if-nez p1, :cond_d

    check-cast v3, LH5/P0;

    invoke-direct {p0, v3}, LJ5/b;->j0(LH5/P0;)V

    goto :goto_9

    :cond_d
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"

    invoke-static {v3, p1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_8
    if-ge v5, p1, :cond_e

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH5/P0;

    invoke-direct {p0, v0}, LJ5/b;->j0(LH5/P0;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_8

    :cond_e
    :goto_9
    if-nez v1, :cond_f

    return-void

    :cond_f
    throw v1
.end method

.method public static final synthetic i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final i0(LH5/P0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, LJ5/b;->k0(LH5/P0;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static final synthetic j()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final j0(LH5/P0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LJ5/b;->k0(LH5/P0;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static final synthetic k(LJ5/b;J)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LJ5/b;->R(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final k0(LH5/P0;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, LH5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lm5/d;

    .line 6
    .line 7
    sget-object v0, Li5/m;->m:Li5/m$a;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LJ5/b;->E()Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, LJ5/b;->G()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-static {p2}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {p1, p2}, Lm5/d;->h(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "Unexpected waiter: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p2
.end method

.method public static final synthetic l(LJ5/b;LH5/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJ5/b;->a0(LH5/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final l0(J)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, LJ5/b;->R(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const-wide v0, 0xfffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr p1, v0

    .line 15
    invoke-direct {p0, p1, p2}, LJ5/b;->q(J)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    xor-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    return p1
.end method

.method public static final synthetic m(LJ5/b;LH5/P0;LJ5/h;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ5/b;->d0(LH5/P0;LJ5/h;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final m0(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LH5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, LH5/l;

    .line 11
    .line 12
    iget-object v0, p0, LJ5/b;->c:Lv5/l;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lm5/d;->a()Lm5/g;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, p2, v1}, LM5/x;->a(Lv5/l;Ljava/lang/Object;Lm5/g;)Lv5/l;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-static {p1, p2, v0}, LJ5/c;->t(LH5/l;Ljava/lang/Object;Lv5/l;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, "Unexpected receiver type: "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p2
.end method

.method public static final synthetic n(LJ5/b;LH5/P0;LJ5/h;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ5/b;->e0(LH5/P0;LJ5/h;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final n0(Ljava/lang/Object;LJ5/h;I)Z
    .locals 1

    .line 1
    instance-of p2, p1, LH5/l;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    .line 6
    .line 7
    invoke-static {p1, p2}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, LH5/l;

    .line 11
    .line 12
    sget-object p2, Li5/u;->a:Li5/u;

    .line 13
    .line 14
    const/4 p3, 0x2

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, p2, v0, p3, v0}, LJ5/c;->B(LH5/l;Ljava/lang/Object;Lv5/l;ILjava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    new-instance p3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v0, "Unexpected waiter: "

    .line 29
    .line 30
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2
.end method

.method public static final synthetic o(LJ5/b;LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LJ5/b;->q0(LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final o0(LJ5/h;IJ)Z
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LH5/P0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    sget-object v1, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    cmp-long v1, p3, v1

    .line 16
    .line 17
    if-ltz v1, :cond_1

    .line 18
    .line 19
    invoke-static {}, LJ5/c;->o()LM5/F;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0, v0, p1, p2}, LJ5/b;->n0(Ljava/lang/Object;LJ5/h;I)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    sget-object p3, LJ5/c;->d:LM5/F;

    .line 36
    .line 37
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 p3, 0x0

    .line 50
    invoke-virtual {p1, p2, p3}, LJ5/h;->x(IZ)V

    .line 51
    .line 52
    .line 53
    move p1, p3

    .line 54
    :goto_0
    return p1

    .line 55
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LJ5/b;->p0(LJ5/h;IJ)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
.end method

.method public static final synthetic p(LJ5/b;LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LJ5/b;->s0(LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final p0(LJ5/h;IJ)Z
    .locals 6

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LH5/P0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    sget-object v1, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v1, p3, v4

    .line 18
    .line 19
    if-gez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, LJ5/n;

    .line 22
    .line 23
    move-object v2, v0

    .line 24
    check-cast v2, LH5/P0;

    .line 25
    .line 26
    invoke-direct {v1, v2}, LJ5/n;-><init>(LH5/P0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    return v3

    .line 36
    :cond_1
    invoke-static {}, LJ5/c;->o()LM5/F;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-direct {p0, v0, p1, p2}, LJ5/b;->n0(Ljava/lang/Object;LJ5/h;I)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    sget-object p3, LJ5/c;->d:LM5/F;

    .line 53
    .line 54
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2, v2}, LJ5/h;->x(IZ)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return v2

    .line 70
    :cond_3
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-ne v0, v1, :cond_4

    .line 75
    .line 76
    return v2

    .line 77
    :cond_4
    if-nez v0, :cond_5

    .line 78
    .line 79
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    return v3

    .line 90
    :cond_5
    sget-object v1, LJ5/c;->d:LM5/F;

    .line 91
    .line 92
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    return v3

    .line 95
    :cond_6
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eq v0, v1, :cond_a

    .line 100
    .line 101
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-eq v0, v1, :cond_a

    .line 106
    .line 107
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v0, v1, :cond_7

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-ne v0, v1, :cond_8

    .line 119
    .line 120
    return v3

    .line 121
    :cond_8
    invoke-static {}, LJ5/c;->p()LM5/F;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-ne v0, v1, :cond_9

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    new-instance p2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string p3, "Unexpected cell state: "

    .line 136
    .line 137
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_a
    :goto_2
    return v3
.end method

.method private final q(J)Z
    .locals 4

    .line 1
    invoke-direct {p0}, LJ5/b;->C()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget v2, p0, LJ5/b;->b:I

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    add-long/2addr v0, v2

    .line 17
    cmp-long p1, p1, v0

    .line 18
    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    :goto_1
    return p1
.end method

.method private final q0(LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v1, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide v3, 0xfffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr v1, v3

    .line 19
    cmp-long v1, p3, v1

    .line 20
    .line 21
    if-ltz v1, :cond_2

    .line 22
    .line 23
    if-nez p5, :cond_0

    .line 24
    .line 25
    invoke-static {}, LJ5/c;->r()LM5/F;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {p1, p2, v0, p5}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-direct {p0}, LJ5/b;->y()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, LJ5/c;->q()LM5/F;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_1
    sget-object v1, LJ5/c;->d:LM5/F;

    .line 45
    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-direct {p0}, LJ5/b;->y()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, LJ5/h;->y(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_2
    invoke-direct/range {p0 .. p5}, LJ5/b;->r0(LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method private final r(LJ5/h;J)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1, v0}, LM5/l;->b(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    const/4 v2, -0x1

    .line 8
    if-eqz p1, :cond_6

    .line 9
    .line 10
    sget v3, LJ5/c;->b:I

    .line 11
    .line 12
    sub-int/2addr v3, v1

    .line 13
    :goto_1
    if-ge v2, v3, :cond_5

    .line 14
    .line 15
    iget-wide v4, p1, LM5/C;->o:J

    .line 16
    .line 17
    sget v6, LJ5/c;->b:I

    .line 18
    .line 19
    int-to-long v6, v6

    .line 20
    mul-long/2addr v4, v6

    .line 21
    int-to-long v6, v3

    .line 22
    add-long/2addr v4, v6

    .line 23
    cmp-long v4, v4, p2

    .line 24
    .line 25
    if-ltz v4, :cond_6

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1, v3}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-ne v4, v5, :cond_1

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_1
    instance-of v5, v4, LJ5/n;

    .line 41
    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p1, v3, v4, v5}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    check-cast v4, LJ5/n;

    .line 55
    .line 56
    iget-object v4, v4, LJ5/n;->a:LH5/P0;

    .line 57
    .line 58
    :goto_2
    invoke-static {v0, v4}, LM5/l;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v3, v1}, LJ5/h;->x(IZ)V

    .line 63
    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_2
    instance-of v5, v4, LH5/P0;

    .line 67
    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {p1, v3, v4, v5}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    :goto_3
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {p1, v3, v4, v5}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_0

    .line 90
    .line 91
    invoke-virtual {p1}, LM5/C;->p()V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_4
    add-int/lit8 v3, v3, -0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {p1}, LM5/e;->g()LM5/e;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, LJ5/h;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    if-eqz v0, :cond_8

    .line 105
    .line 106
    instance-of p1, v0, Ljava/util/ArrayList;

    .line 107
    .line 108
    if-nez p1, :cond_7

    .line 109
    .line 110
    check-cast v0, LH5/P0;

    .line 111
    .line 112
    invoke-direct {p0, v0}, LJ5/b;->i0(LH5/P0;)V

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_7
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"

    .line 117
    .line 118
    invoke-static {v0, p1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    check-cast v0, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    sub-int/2addr p1, v1

    .line 128
    :goto_5
    if-ge v2, p1, :cond_8

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, LH5/P0;

    .line 135
    .line 136
    invoke-direct {p0, p2}, LJ5/b;->i0(LH5/P0;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 p1, p1, -0x1

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_8
    :goto_6
    return-void
.end method

.method private final r0(LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_1
    sget-object v1, LJ5/c;->d:LM5/F;

    .line 16
    .line 17
    if-ne v0, v1, :cond_2

    .line 18
    .line 19
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-direct {p0}, LJ5/b;->y()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, LJ5/h;->y(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_2
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_3

    .line 42
    .line 43
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-ne v0, v1, :cond_4

    .line 53
    .line 54
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_4
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-ne v0, v1, :cond_5

    .line 64
    .line 65
    invoke-direct {p0}, LJ5/b;->y()V

    .line 66
    .line 67
    .line 68
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_5
    invoke-static {}, LJ5/c;->o()LM5/F;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eq v0, v1, :cond_0

    .line 78
    .line 79
    invoke-static {}, LJ5/c;->p()LM5/F;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    instance-of p3, v0, LJ5/n;

    .line 90
    .line 91
    if-eqz p3, :cond_6

    .line 92
    .line 93
    check-cast v0, LJ5/n;

    .line 94
    .line 95
    iget-object v0, v0, LJ5/n;->a:LH5/P0;

    .line 96
    .line 97
    :cond_6
    invoke-direct {p0, v0, p1, p2}, LJ5/b;->n0(Ljava/lang/Object;LJ5/h;I)Z

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    if-eqz p4, :cond_7

    .line 102
    .line 103
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, LJ5/b;->y()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2}, LJ5/h;->y(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_0

    .line 118
    :cond_7
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    invoke-virtual {p1, p2, p4}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    const/4 p4, 0x0

    .line 126
    invoke-virtual {p1, p2, p4}, LJ5/h;->x(IZ)V

    .line 127
    .line 128
    .line 129
    if-eqz p3, :cond_8

    .line 130
    .line 131
    invoke-direct {p0}, LJ5/b;->y()V

    .line 132
    .line 133
    .line 134
    :cond_8
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_0
    return-object p1

    .line 139
    :cond_9
    :goto_1
    sget-object v1, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 140
    .line 141
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v1

    .line 145
    const-wide v3, 0xfffffffffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    and-long/2addr v1, v3

    .line 151
    cmp-long v1, p3, v1

    .line 152
    .line 153
    if-gez v1, :cond_a

    .line 154
    .line 155
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_0

    .line 164
    .line 165
    invoke-direct {p0}, LJ5/b;->y()V

    .line 166
    .line 167
    .line 168
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :cond_a
    if-nez p5, :cond_b

    .line 174
    .line 175
    invoke-static {}, LJ5/c;->r()LM5/F;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_b
    invoke-virtual {p1, p2, v0, p5}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_0

    .line 185
    .line 186
    invoke-direct {p0}, LJ5/b;->y()V

    .line 187
    .line 188
    .line 189
    invoke-static {}, LJ5/c;->q()LM5/F;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1
.end method

.method private final s()LJ5/h;
    .locals 6

    .line 1
    sget-object v0, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LJ5/b;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LJ5/h;

    .line 14
    .line 15
    iget-wide v2, v1, LM5/C;->o:J

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, LJ5/h;

    .line 19
    .line 20
    iget-wide v4, v4, LM5/C;->o:J

    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-lez v2, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    sget-object v1, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LJ5/h;

    .line 34
    .line 35
    iget-wide v2, v1, LM5/C;->o:J

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, LJ5/h;

    .line 39
    .line 40
    iget-wide v4, v4, LM5/C;->o:J

    .line 41
    .line 42
    cmp-long v2, v2, v4

    .line 43
    .line 44
    if-lez v2, :cond_1

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_1
    check-cast v0, LM5/e;

    .line 48
    .line 49
    invoke-static {v0}, LM5/d;->b(LM5/e;)LM5/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, LJ5/h;

    .line 54
    .line 55
    return-object v0
.end method

.method private final s0(LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 3

    .line 1
    invoke-virtual {p1, p2, p3}, LJ5/h;->B(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    invoke-direct/range {p0 .. p7}, LJ5/b;->t0(LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    invoke-direct {p0, p4, p5}, LJ5/b;->q(J)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, LJ5/c;->d:LM5/F;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v2, v0}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_6

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    if-nez p6, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x3

    .line 37
    return p1

    .line 38
    :cond_2
    invoke-virtual {p1, p2, v2, p6}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    return p1

    .line 46
    :cond_3
    instance-of v2, v0, LH5/P0;

    .line 47
    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    invoke-virtual {p1, p2}, LJ5/h;->s(I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0, p3}, LJ5/b;->m0(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_4

    .line 58
    .line 59
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LJ5/b;->b0()V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p1, p2, p3}, LJ5/h;->t(ILjava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    if-eq p3, p4, :cond_5

    .line 84
    .line 85
    invoke-virtual {p1, p2, v1}, LJ5/h;->x(IZ)V

    .line 86
    .line 87
    .line 88
    :cond_5
    const/4 p1, 0x5

    .line 89
    :goto_0
    return p1

    .line 90
    :cond_6
    invoke-direct/range {p0 .. p7}, LJ5/b;->t0(LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1
.end method

.method private final t0(LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, LJ5/h;->w(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    invoke-direct {p0, p4, p5}, LJ5/b;->q(J)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-nez p7, :cond_1

    .line 18
    .line 19
    sget-object v0, LJ5/c;->d:LM5/F;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v4, v0}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return v3

    .line 28
    :cond_1
    if-eqz p7, :cond_2

    .line 29
    .line 30
    invoke-static {}, LJ5/c;->j()LM5/F;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, p2, v4, v0}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, p2, v2}, LJ5/h;->x(IZ)V

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    if-nez p6, :cond_3

    .line 45
    .line 46
    const/4 p1, 0x3

    .line 47
    return p1

    .line 48
    :cond_3
    invoke-virtual {p1, p2, v4, p6}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const/4 p1, 0x2

    .line 55
    return p1

    .line 56
    :cond_4
    invoke-static {}, LJ5/c;->k()LM5/F;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-ne v0, v4, :cond_5

    .line 61
    .line 62
    sget-object v1, LJ5/c;->d:LM5/F;

    .line 63
    .line 64
    invoke-virtual {p1, p2, v0, v1}, LJ5/h;->r(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    return v3

    .line 71
    :cond_5
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    const/4 p5, 0x5

    .line 76
    if-ne v0, p4, :cond_6

    .line 77
    .line 78
    invoke-virtual {p1, p2}, LJ5/h;->s(I)V

    .line 79
    .line 80
    .line 81
    return p5

    .line 82
    :cond_6
    invoke-static {}, LJ5/c;->n()LM5/F;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    if-ne v0, p4, :cond_7

    .line 87
    .line 88
    invoke-virtual {p1, p2}, LJ5/h;->s(I)V

    .line 89
    .line 90
    .line 91
    return p5

    .line 92
    :cond_7
    invoke-static {}, LJ5/c;->y()LM5/F;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    invoke-virtual {p1, p2}, LJ5/h;->s(I)V

    .line 97
    .line 98
    .line 99
    if-ne v0, p4, :cond_8

    .line 100
    .line 101
    invoke-direct {p0}, LJ5/b;->w()V

    .line 102
    .line 103
    .line 104
    return v1

    .line 105
    :cond_8
    instance-of p4, v0, LJ5/n;

    .line 106
    .line 107
    if-eqz p4, :cond_9

    .line 108
    .line 109
    check-cast v0, LJ5/n;

    .line 110
    .line 111
    iget-object v0, v0, LJ5/n;->a:LH5/P0;

    .line 112
    .line 113
    :cond_9
    invoke-direct {p0, v0, p3}, LJ5/b;->m0(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-eqz p3, :cond_a

    .line 118
    .line 119
    invoke-static {}, LJ5/c;->f()LM5/F;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-virtual {p1, p2, p3}, LJ5/h;->A(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, LJ5/b;->b0()V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_a
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    invoke-virtual {p1, p2, p3}, LJ5/h;->t(ILjava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    invoke-static {}, LJ5/c;->i()LM5/F;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    if-eq p3, p4, :cond_b

    .line 143
    .line 144
    invoke-virtual {p1, p2, v3}, LJ5/h;->x(IZ)V

    .line 145
    .line 146
    .line 147
    :cond_b
    move v2, p5

    .line 148
    :goto_0
    return v2
.end method

.method private final u(J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LJ5/b;->v(J)LJ5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, LJ5/b;->h0(LJ5/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final u0(J)V
    .locals 7

    .line 1
    sget-object v0, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    cmp-long v1, v3, p1

    .line 8
    .line 9
    if-ltz v1, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    sget-object v1, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-wide v5, p1

    .line 16
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-void
.end method

.method private final v(J)LJ5/h;
    .locals 5

    .line 1
    invoke-direct {p0}, LJ5/b;->s()LJ5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LJ5/b;->S()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, LJ5/b;->U(LJ5/h;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const-wide/16 v3, -0x1

    .line 16
    .line 17
    cmp-long v3, v1, v3

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, LJ5/b;->x(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0, v0, p1, p2}, LJ5/b;->r(LJ5/h;J)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method private final v0(J)V
    .locals 7

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide v1, 0xfffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v3

    .line 13
    cmp-long v5, v1, p1

    .line 14
    .line 15
    if-ltz v5, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const/16 v5, 0x3c

    .line 19
    .line 20
    shr-long v5, v3, v5

    .line 21
    .line 22
    long-to-int v5, v5

    .line 23
    invoke-static {v1, v2, v5}, LJ5/c;->b(JI)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    sget-object v1, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    return-void
.end method

.method private final w()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ5/b;->Q()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final y()V
    .locals 14

    .line 1
    invoke-direct {p0}, LJ5/b;->T()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LJ5/h;

    .line 15
    .line 16
    :cond_1
    :goto_0
    sget-object v1, LJ5/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v7

    .line 22
    sget v9, LJ5/c;->b:I

    .line 23
    .line 24
    int-to-long v1, v9

    .line 25
    div-long v2, v7, v1

    .line 26
    .line 27
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    cmp-long v1, v4, v7

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x1

    .line 35
    const-wide/16 v12, 0x0

    .line 36
    .line 37
    iget-wide v4, v0, LM5/C;->o:J

    .line 38
    .line 39
    if-gtz v1, :cond_3

    .line 40
    .line 41
    cmp-long v1, v4, v2

    .line 42
    .line 43
    if-gez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, LM5/e;->e()LM5/e;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-direct {p0, v2, v3, v0}, LJ5/b;->Y(JLJ5/h;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p0, v12, v13, v11, v10}, LJ5/b;->K(LJ5/b;JILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    cmp-long v1, v4, v2

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    move-object v1, p0

    .line 63
    move-object v4, v0

    .line 64
    move-wide v5, v7

    .line 65
    invoke-direct/range {v1 .. v6}, LJ5/b;->z(JLJ5/h;J)LJ5/h;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-nez v1, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    move-object v0, v1

    .line 73
    :cond_5
    int-to-long v1, v9

    .line 74
    rem-long v1, v7, v1

    .line 75
    .line 76
    long-to-int v1, v1

    .line 77
    invoke-direct {p0, v0, v1, v7, v8}, LJ5/b;->o0(LJ5/h;IJ)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {p0, v12, v13, v11, v10}, LJ5/b;->K(LJ5/b;JILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    return-void
.end method

.method private final z(JLJ5/h;J)LJ5/h;
    .locals 15

    .line 1
    move-object v6, p0

    .line 2
    move-wide/from16 v0, p1

    .line 3
    .line 4
    sget-object v2, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 5
    .line 6
    invoke-static {}, LJ5/c;->x()LD5/d;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    check-cast v3, Lv5/p;

    .line 11
    .line 12
    move-object/from16 v4, p3

    .line 13
    .line 14
    :goto_0
    invoke-static {v4, v0, v1, v3}, LM5/d;->c(LM5/C;JLv5/p;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-static {v5}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-nez v7, :cond_4

    .line 23
    .line 24
    invoke-static {v5}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    :cond_0
    :goto_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, LM5/C;

    .line 33
    .line 34
    iget-wide v9, v8, LM5/C;->o:J

    .line 35
    .line 36
    iget-wide v11, v7, LM5/C;->o:J

    .line 37
    .line 38
    cmp-long v9, v9, v11

    .line 39
    .line 40
    if-ltz v9, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v7}, LM5/C;->q()Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-nez v9, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {v2, p0, v8, v7}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_3

    .line 55
    .line 56
    invoke-virtual {v8}, LM5/C;->m()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-virtual {v8}, LM5/e;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {v7}, LM5/C;->m()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_0

    .line 71
    .line 72
    invoke-virtual {v7}, LM5/e;->k()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    :goto_2
    invoke-static {v5}, LM5/D;->c(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/4 v7, 0x1

    .line 81
    const-wide/16 v8, 0x0

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-direct {p0}, LJ5/b;->w()V

    .line 87
    .line 88
    .line 89
    invoke-direct/range {p0 .. p3}, LJ5/b;->Y(JLJ5/h;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    invoke-static {p0, v8, v9, v7, v10}, LJ5/b;->K(LJ5/b;JILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    invoke-static {v5}, LM5/D;->b(Ljava/lang/Object;)LM5/C;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    move-object v11, v2

    .line 101
    check-cast v11, LJ5/h;

    .line 102
    .line 103
    iget-wide v2, v11, LM5/C;->o:J

    .line 104
    .line 105
    cmp-long v0, v2, v0

    .line 106
    .line 107
    if-lez v0, :cond_7

    .line 108
    .line 109
    sget-object v0, LJ5/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 110
    .line 111
    const-wide/16 v4, 0x1

    .line 112
    .line 113
    add-long v4, p4, v4

    .line 114
    .line 115
    sget v12, LJ5/c;->b:I

    .line 116
    .line 117
    int-to-long v13, v12

    .line 118
    mul-long/2addr v13, v2

    .line 119
    move-object v1, p0

    .line 120
    move-wide v2, v4

    .line 121
    move-wide v4, v13

    .line 122
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    iget-wide v0, v11, LM5/C;->o:J

    .line 129
    .line 130
    int-to-long v2, v12

    .line 131
    mul-long/2addr v0, v2

    .line 132
    sub-long v0, v0, p4

    .line 133
    .line 134
    invoke-direct {p0, v0, v1}, LJ5/b;->J(J)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    move-object v10, v11

    .line 139
    :goto_3
    return-object v10
.end method


# virtual methods
.method protected final D()Ljava/lang/Throwable;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    return-object v0
.end method

.method public final F()J
    .locals 2

    .line 1
    sget-object v0, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method protected final G()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ5/b;->D()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LJ5/j;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, LJ5/j;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final H()J
    .locals 4

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0xfffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v2

    .line 13
    return-wide v0
.end method

.method public final I()Z
    .locals 10

    .line 1
    :cond_0
    :goto_0
    sget-object v0, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LJ5/h;

    .line 8
    .line 9
    invoke-virtual {p0}, LJ5/b;->F()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    return v3

    .line 23
    :cond_1
    sget v2, LJ5/c;->b:I

    .line 24
    .line 25
    int-to-long v6, v2

    .line 26
    div-long v6, v4, v6

    .line 27
    .line 28
    iget-wide v8, v1, LM5/C;->o:J

    .line 29
    .line 30
    cmp-long v8, v8, v6

    .line 31
    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    invoke-direct {p0, v6, v7, v1}, LJ5/b;->A(JLJ5/h;)LJ5/h;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, LJ5/h;

    .line 45
    .line 46
    iget-wide v0, v0, LM5/C;->o:J

    .line 47
    .line 48
    cmp-long v0, v0, v6

    .line 49
    .line 50
    if-gez v0, :cond_0

    .line 51
    .line 52
    return v3

    .line 53
    :cond_2
    invoke-virtual {v1}, LM5/e;->b()V

    .line 54
    .line 55
    .line 56
    int-to-long v2, v2

    .line 57
    rem-long v2, v4, v2

    .line 58
    .line 59
    long-to-int v0, v2

    .line 60
    invoke-direct {p0, v1, v0, v4, v5}, LJ5/b;->M(LJ5/h;IJ)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    return v0

    .line 68
    :cond_3
    sget-object v2, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 69
    .line 70
    const-wide/16 v0, 0x1

    .line 71
    .line 72
    add-long v6, v4, v0

    .line 73
    .line 74
    move-object v3, p0

    .line 75
    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0
.end method

.method public O()Z
    .locals 2

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-direct {p0, v0, v1}, LJ5/b;->P(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public Q()Z
    .locals 2

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-direct {p0, v0, v1}, LJ5/b;->R(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method protected S()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected Z()V
    .locals 0

    .line 1
    return-void
.end method

.method public a()Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    sget-object v2, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, LJ5/b;->P(J)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v0, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {p0}, LJ5/b;->D()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ5/f$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    sget-object v0, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {v0}, LJ5/f$b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, LJ5/c;->i()LM5/F;

    move-result-object v0

    invoke-static {}, LJ5/b;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ5/h;

    :goto_0
    invoke-virtual {p0}, LJ5/b;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {p0}, LJ5/b;->D()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ5/f$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-static {}, LJ5/b;->h()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v7

    sget v2, LJ5/c;->b:I

    int-to-long v3, v2

    div-long v3, v7, v3

    int-to-long v5, v2

    rem-long v5, v7, v5

    long-to-int v9, v5

    iget-wide v5, v1, LM5/C;->o:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    invoke-static {p0, v3, v4, v1}, LJ5/b;->e(LJ5/b;JLJ5/h;)LJ5/h;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v10, v2

    goto :goto_1

    :cond_4
    move-object v10, v1

    :goto_1
    move-object v1, p0

    move-object v2, v10

    move v3, v9

    move-wide v4, v7

    move-object v6, v0

    invoke-static/range {v1 .. v6}, LJ5/b;->o(LJ5/b;LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LJ5/c;->q()LM5/F;

    move-result-object v2

    if-ne v1, v2, :cond_7

    instance-of v1, v0, LH5/P0;

    if-eqz v1, :cond_5

    check-cast v0, LH5/P0;

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_6

    invoke-static {p0, v0, v10, v9}, LJ5/b;->m(LJ5/b;LH5/P0;LJ5/h;I)V

    :cond_6
    invoke-virtual {p0, v7, v8}, LJ5/b;->w0(J)V

    invoke-virtual {v10}, LM5/C;->p()V

    sget-object v0, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {v0}, LJ5/f$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-static {}, LJ5/c;->h()LM5/F;

    move-result-object v2

    if-ne v1, v2, :cond_9

    invoke-virtual {p0}, LJ5/b;->H()J

    move-result-wide v1

    cmp-long v1, v7, v1

    if-gez v1, :cond_8

    invoke-virtual {v10}, LM5/e;->b()V

    :cond_8
    move-object v1, v10

    goto :goto_0

    :cond_9
    invoke-static {}, LJ5/c;->r()LM5/F;

    move-result-object v0

    if-eq v1, v0, :cond_a

    invoke-virtual {v10}, LM5/e;->b()V

    sget-object v0, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {v0, v1}, LJ5/f$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LJ5/b;->t(Ljava/lang/Throwable;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method protected b0()V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJ5/b;->f0(LJ5/b;Lm5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected c0()V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LJ5/b;->l0(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {p1}, LJ5/f$b;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LJ5/c;->j()LM5/F;

    move-result-object v8

    invoke-static {}, LJ5/b;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ5/h;

    :cond_1
    :goto_0
    invoke-static {}, LJ5/b;->j()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v9, v1, v3

    invoke-static {p0, v1, v2}, LJ5/b;->k(LJ5/b;J)Z

    move-result v11

    sget v1, LJ5/c;->b:I

    int-to-long v2, v1

    div-long v2, v9, v2

    int-to-long v4, v1

    rem-long v4, v9, v4

    long-to-int v12, v4

    iget-wide v4, v0, LM5/C;->o:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_4

    invoke-static {p0, v2, v3, v0}, LJ5/b;->f(LJ5/b;JLJ5/h;)LJ5/h;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz v11, :cond_1

    :cond_2
    :goto_1
    sget-object p1, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {p0}, LJ5/b;->G()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ5/f$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_6

    :cond_3
    move-object v13, v1

    goto :goto_2

    :cond_4
    move-object v13, v0

    :goto_2
    move-object v0, p0

    move-object v1, v13

    move v2, v12

    move-object v3, p1

    move-wide v4, v9

    move-object v6, v8

    move v7, v11

    invoke-static/range {v0 .. v7}, LJ5/b;->p(LJ5/b;LJ5/h;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_d

    const/4 v1, 0x1

    if-eq v0, v1, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    const/4 v1, 0x5

    if-eq v0, v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, LM5/e;->b()V

    :goto_3
    move-object v0, v13

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, LJ5/b;->F()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-gez p1, :cond_2

    invoke-virtual {v13}, LM5/e;->b()V

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-eqz v11, :cond_9

    invoke-virtual {v13}, LM5/C;->p()V

    goto :goto_1

    :cond_9
    instance-of p1, v8, LH5/P0;

    if-eqz p1, :cond_a

    check-cast v8, LH5/P0;

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_b

    invoke-static {p0, v8, v13, v12}, LJ5/b;->n(LJ5/b;LH5/P0;LJ5/h;I)V

    :cond_b
    invoke-virtual {v13}, LM5/C;->p()V

    sget-object p1, LJ5/f;->a:LJ5/f$b;

    invoke-virtual {p1}, LJ5/f$b;->b()Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_c
    :goto_5
    sget-object p1, LJ5/f;->a:LJ5/f$b;

    sget-object v0, Li5/u;->a:Li5/u;

    invoke-virtual {p1, v0}, LJ5/f$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_d
    invoke-virtual {v13}, LM5/e;->b()V

    goto :goto_5

    :goto_6
    return-object p1
.end method

.method protected t(Ljava/lang/Throwable;Z)Z
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, LJ5/b;->V()V

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object v0, LJ5/b;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-static {}, LJ5/c;->l()LM5/F;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, LJ5/b;->W()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-direct {p0}, LJ5/b;->X()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-direct {p0}, LJ5/b;->w()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LJ5/b;->Z()V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-direct {p0}, LJ5/b;->L()V

    .line 34
    .line 35
    .line 36
    :cond_2
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, LJ5/b;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v4, 0x3c

    shr-long/2addr v2, v4

    long-to-int v2, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "cancelled,"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "closed,"

    goto :goto_0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "capacity="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v0, LJ5/b;->b:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x2c

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "data=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v2, v3, [LJ5/h;

    sget-object v3, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v2, v6

    sget-object v3, LJ5/b;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x1

    aput-object v3, v2, v7

    sget-object v3, LJ5/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v2}, Lj5/n;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, LJ5/h;

    invoke-static {}, LJ5/c;->m()LJ5/h;

    move-result-object v9

    if-eq v8, v9, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v3

    check-cast v4, LJ5/h;

    iget-wide v8, v4, LM5/C;->o:J

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, LJ5/h;

    iget-wide v10, v10, LM5/C;->o:J

    cmp-long v12, v8, v10

    if-lez v12, :cond_6

    move-object v3, v4

    move-wide v8, v10

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_5

    :goto_3
    check-cast v3, LJ5/h;

    invoke-virtual/range {p0 .. p0}, LJ5/b;->F()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, LJ5/b;->H()J

    move-result-wide v12

    :goto_4
    sget v2, LJ5/c;->b:I

    move v4, v6

    :goto_5
    if-ge v4, v2, :cond_16

    iget-wide v8, v3, LM5/C;->o:J

    sget v14, LJ5/c;->b:I

    int-to-long v14, v14

    mul-long/2addr v8, v14

    int-to-long v14, v4

    add-long/2addr v8, v14

    cmp-long v14, v8, v12

    if-ltz v14, :cond_7

    cmp-long v15, v8, v10

    if-gez v15, :cond_17

    :cond_7
    invoke-virtual {v3, v4}, LJ5/h;->w(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v4}, LJ5/h;->v(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v15, LH5/l;

    if-eqz v7, :cond_a

    cmp-long v7, v8, v10

    if-gez v7, :cond_8

    if-ltz v14, :cond_8

    const-string v7, "receive"

    goto/16 :goto_d

    :cond_8
    if-gez v14, :cond_9

    if-ltz v7, :cond_9

    const-string v7, "send"

    goto/16 :goto_d

    :cond_9
    const-string v7, "cont"

    goto/16 :goto_d

    :cond_a
    instance-of v7, v15, LJ5/n;

    if-eqz v7, :cond_b

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EB("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x29

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_d

    :cond_b
    invoke-static {}, LJ5/c;->p()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, 0x1

    goto :goto_6

    :cond_c
    invoke-static {}, LJ5/c;->o()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_6
    if-eqz v7, :cond_d

    const-string v7, "resuming_sender"

    goto :goto_d

    :cond_d
    if-nez v15, :cond_e

    const/4 v7, 0x1

    goto :goto_7

    :cond_e
    invoke-static {}, LJ5/c;->k()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_7
    if-eqz v7, :cond_f

    const/4 v7, 0x1

    goto :goto_8

    :cond_f
    invoke-static {}, LJ5/c;->f()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_8
    if-eqz v7, :cond_10

    const/4 v7, 0x1

    goto :goto_9

    :cond_10
    invoke-static {}, LJ5/c;->n()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_9
    if-eqz v7, :cond_11

    const/4 v7, 0x1

    goto :goto_a

    :cond_11
    invoke-static {}, LJ5/c;->i()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_a
    if-eqz v7, :cond_12

    const/4 v7, 0x1

    goto :goto_b

    :cond_12
    invoke-static {}, LJ5/c;->j()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_b
    if-eqz v7, :cond_13

    const/4 v7, 0x1

    goto :goto_c

    :cond_13
    invoke-static {}, LJ5/c;->y()LM5/F;

    move-result-object v7

    invoke-static {v15, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_c
    if-nez v7, :cond_15

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_d
    if-eqz v6, :cond_14

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v9, 0x28

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "),"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_e
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_14
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_e

    :cond_15
    :goto_f
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_5

    :cond_16
    invoke-virtual {v3}, LM5/e;->e()LM5/e;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LJ5/h;

    if-nez v3, :cond_19

    :cond_17
    invoke-static {v1}, LF5/g;->E0(Ljava/lang/CharSequence;)C

    move-result v2

    if-ne v2, v5, :cond_18

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "this.deleteCharAt(index)"

    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_18
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_19
    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_4

    :cond_1a
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method

.method public final w0(J)V
    .locals 13

    .line 1
    invoke-direct {p0}, LJ5/b;->T()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, LJ5/b;->C()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    cmp-long v0, v0, p1

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, LJ5/c;->g()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v0, 0x0

    .line 21
    move p2, v0

    .line 22
    :goto_0
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-ge p2, p1, :cond_2

    .line 28
    .line 29
    invoke-direct {p0}, LJ5/b;->C()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    sget-object v5, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    and-long/2addr v1, v5

    .line 40
    cmp-long v1, v3, v1

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-direct {p0}, LJ5/b;->C()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    cmp-long v1, v3, v1

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    sget-object v9, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    and-long p1, v5, v1

    .line 63
    .line 64
    const/4 v10, 0x1

    .line 65
    invoke-static {p1, p2, v10}, LJ5/c;->a(JZ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    move-object v3, v9

    .line 70
    move-object v4, p0

    .line 71
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    :cond_4
    :goto_1
    invoke-direct {p0}, LJ5/b;->C()J

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    sget-object v9, LJ5/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 82
    .line 83
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    and-long v3, v5, v1

    .line 88
    .line 89
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 90
    .line 91
    and-long/2addr v7, v5

    .line 92
    const-wide/16 v11, 0x0

    .line 93
    .line 94
    cmp-long v7, v7, v11

    .line 95
    .line 96
    if-eqz v7, :cond_5

    .line 97
    .line 98
    move v7, v10

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    move v7, v0

    .line 101
    :goto_2
    cmp-long v8, p1, v3

    .line 102
    .line 103
    if-nez v8, :cond_7

    .line 104
    .line 105
    invoke-direct {p0}, LJ5/b;->C()J

    .line 106
    .line 107
    .line 108
    move-result-wide v11

    .line 109
    cmp-long p1, p1, v11

    .line 110
    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    :cond_6
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v5

    .line 117
    and-long p1, v5, v1

    .line 118
    .line 119
    invoke-static {p1, p2, v0}, LJ5/c;->a(JZ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    move-object v3, v9

    .line 124
    move-object v4, p0

    .line 125
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    return-void

    .line 132
    :cond_7
    if-nez v7, :cond_4

    .line 133
    .line 134
    invoke-static {v3, v4, v10}, LJ5/c;->a(JZ)J

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    move-object v3, v9

    .line 139
    move-object v4, p0

    .line 140
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1
.end method

.method protected final x(J)V
    .locals 10

    .line 1
    sget-object v0, LJ5/b;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LJ5/h;

    .line 8
    .line 9
    :cond_0
    :goto_0
    sget-object v1, LJ5/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v8

    .line 15
    iget v2, p0, LJ5/b;->b:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    add-long/2addr v2, v8

    .line 19
    invoke-direct {p0}, LJ5/b;->C()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v2, p1, v2

    .line 28
    .line 29
    if-gez v2, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    add-long v5, v8, v2

    .line 35
    .line 36
    move-object v2, p0

    .line 37
    move-wide v3, v8

    .line 38
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    sget v1, LJ5/c;->b:I

    .line 45
    .line 46
    int-to-long v2, v1

    .line 47
    div-long v2, v8, v2

    .line 48
    .line 49
    int-to-long v4, v1

    .line 50
    rem-long v4, v8, v4

    .line 51
    .line 52
    long-to-int v4, v4

    .line 53
    iget-wide v5, v0, LM5/C;->o:J

    .line 54
    .line 55
    cmp-long v1, v5, v2

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-direct {p0, v2, v3, v0}, LJ5/b;->A(JLJ5/h;)LJ5/h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v0, v1

    .line 67
    :cond_3
    const/4 v7, 0x0

    .line 68
    move-object v2, p0

    .line 69
    move-object v3, v0

    .line 70
    move-wide v5, v8

    .line 71
    invoke-direct/range {v2 .. v7}, LJ5/b;->q0(LJ5/h;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {}, LJ5/c;->h()LM5/F;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, LJ5/b;->H()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    cmp-long v1, v8, v1

    .line 86
    .line 87
    if-gez v1, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, LM5/e;->b()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {v0}, LM5/e;->b()V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, LJ5/b;->c:Lv5/l;

    .line 97
    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    const/4 v3, 0x2

    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-static {v2, v1, v4, v3, v4}, LM5/x;->d(Lv5/l;Ljava/lang/Object;LM5/O;ILjava/lang/Object;)LM5/O;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    throw v1
.end method

.class public abstract LJ5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LJ5/h;

.field public static final b:I

.field private static final c:I

.field public static final d:LM5/F;

.field private static final e:LM5/F;

.field private static final f:LM5/F;

.field private static final g:LM5/F;

.field private static final h:LM5/F;

.field private static final i:LM5/F;

.field private static final j:LM5/F;

.field private static final k:LM5/F;

.field private static final l:LM5/F;

.field private static final m:LM5/F;

.field private static final n:LM5/F;

.field private static final o:LM5/F;

.field private static final p:LM5/F;

.field private static final q:LM5/F;

.field private static final r:LM5/F;

.field private static final s:LM5/F;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v6, LJ5/h;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LJ5/h;-><init>(JLJ5/h;LJ5/b;I)V

    sput-object v6, LJ5/c;->a:LJ5/h;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-string v7, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LM5/G;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LJ5/c;->b:I

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LM5/G;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LJ5/c;->c:I

    new-instance v0, LM5/F;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->d:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->e:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->f:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->g:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->h:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->i:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->j:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->k:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->l:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->m:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->n:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->o:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->p:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->q:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->r:LM5/F;

    new-instance v0, LM5/F;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, LM5/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LJ5/c;->s:LM5/F;

    return-void
.end method

.method private static final A(LH5/l;Ljava/lang/Object;Lv5/l;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0, p2}, LH5/l;->q(Ljava/lang/Object;Ljava/lang/Object;Lv5/l;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, LH5/l;->r(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    return p0
.end method

.method static synthetic B(LH5/l;Ljava/lang/Object;Lv5/l;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, LJ5/c;->A(LH5/l;Ljava/lang/Object;Lv5/l;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final synthetic a(JZ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/c;->u(JZ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/c;->v(JI)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic c(JLJ5/h;)LJ5/h;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/c;->w(JLJ5/h;)LJ5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->q:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->r:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->i:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g()I
    .locals 1

    .line 1
    sget v0, LJ5/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic h()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->o:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->k:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->j:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic k()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->e:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic l()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->s:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic m()LJ5/h;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->a:LJ5/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic n()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->h:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic o()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->g:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic p()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->f:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic q()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->m:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic r()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->n:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic s(I)J
    .locals 2

    .line 1
    invoke-static {p0}, LJ5/c;->z(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic t(LH5/l;Ljava/lang/Object;Lv5/l;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LJ5/c;->A(LH5/l;Ljava/lang/Object;Lv5/l;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final u(JZ)J
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    add-long/2addr v0, p0

    .line 9
    return-wide v0
.end method

.method private static final v(JI)J
    .locals 2

    .line 1
    int-to-long v0, p2

    .line 2
    const/16 p2, 0x3c

    .line 3
    .line 4
    shl-long/2addr v0, p2

    .line 5
    add-long/2addr v0, p0

    .line 6
    return-wide v0
.end method

.method private static final w(JLJ5/h;)LJ5/h;
    .locals 7

    .line 1
    new-instance v6, LJ5/h;

    .line 2
    .line 3
    invoke-virtual {p2}, LJ5/h;->u()LJ5/b;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v0, v6

    .line 9
    move-wide v1, p0

    .line 10
    move-object v3, p2

    .line 11
    invoke-direct/range {v0 .. v5}, LJ5/h;-><init>(JLJ5/h;LJ5/b;I)V

    .line 12
    .line 13
    .line 14
    return-object v6
.end method

.method public static final x()LD5/d;
    .locals 1

    .line 1
    sget-object v0, LJ5/c$a;->v:LJ5/c$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final y()LM5/F;
    .locals 1

    .line 1
    sget-object v0, LJ5/c;->l:LM5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final z(I)J
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const v0, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    int-to-long v0, p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    :goto_0
    return-wide v0
.end method

.class public Li6/d;
.super Li6/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li6/d$b;,
        Li6/d$a;
    }
.end annotation


# static fields
.field private static final i:J

.field private static final j:J

.field private static k:Li6/d;

.field public static final l:Li6/d$a;


# instance fields
.field private f:Z

.field private g:Li6/d;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li6/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li6/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li6/d;->l:Li6/d$a;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0x3c

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Li6/d;->i:J

    .line 18
    .line 19
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    sput-wide v0, Li6/d;->j:J

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li6/D;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic i()Li6/d;
    .locals 1

    .line 1
    sget-object v0, Li6/d;->k:Li6/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()J
    .locals 2

    .line 1
    sget-wide v0, Li6/d;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic k()J
    .locals 2

    .line 1
    sget-wide v0, Li6/d;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic l(Li6/d;)Li6/d;
    .locals 0

    .line 1
    iget-object p0, p0, Li6/d;->g:Li6/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Li6/d;J)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li6/d;->u(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic o(Li6/d;)V
    .locals 0

    .line 1
    sput-object p0, Li6/d;->k:Li6/d;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p(Li6/d;Li6/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li6/d;->g:Li6/d;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic q(Li6/d;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Li6/d;->h:J

    .line 2
    .line 3
    return-void
.end method

.method private final u(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Li6/d;->h:J

    .line 2
    .line 3
    sub-long/2addr v0, p1

    .line 4
    return-wide v0
.end method


# virtual methods
.method public final m(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/d;->t(Ljava/io/IOException;)Ljava/io/IOException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final r()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Li6/d;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Li6/D;->h()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {p0}, Li6/D;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iput-boolean v1, p0, Li6/d;->f:Z

    .line 25
    .line 26
    sget-object v1, Li6/d;->l:Li6/d$a;

    .line 27
    .line 28
    invoke-static {v1, p0, v2, v3, v0}, Li6/d$a;->b(Li6/d$a;Li6/d;JZ)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "Unbalanced enter/exit"

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method public final s()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Li6/d;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iput-boolean v1, p0, Li6/d;->f:Z

    .line 8
    .line 9
    sget-object v0, Li6/d;->l:Li6/d$a;

    .line 10
    .line 11
    invoke-static {v0, p0}, Li6/d$a;->a(Li6/d$a;Li6/d;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method protected t(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 2
    .line 3
    const-string v1, "timeout"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final v(Li6/A;)Li6/A;
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li6/d$c;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Li6/d$c;-><init>(Li6/d;Li6/A;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final w(Li6/C;)Li6/C;
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li6/d$d;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Li6/d$d;-><init>(Li6/d;Li6/C;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method protected x()V
    .locals 0

    .line 1
    return-void
.end method

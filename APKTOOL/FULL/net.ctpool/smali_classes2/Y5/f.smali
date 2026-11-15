.class public final LY5/f;
.super Lb6/f$d;
.source "SourceFile"

# interfaces
.implements LT5/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY5/f$a;
    }
.end annotation


# static fields
.field public static final t:LY5/f$a;


# instance fields
.field private c:Ljava/net/Socket;

.field private d:Ljava/net/Socket;

.field private e:LT5/s;

.field private f:LT5/A;

.field private g:Lb6/f;

.field private h:Li6/h;

.field private i:Li6/g;

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private final p:Ljava/util/List;

.field private q:J

.field private final r:LY5/h;

.field private final s:LT5/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY5/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY5/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY5/f;->t:LY5/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LY5/h;LT5/F;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "route"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lb6/f$d;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LY5/f;->r:LY5/h;

    .line 15
    .line 16
    iput-object p2, p0, LY5/f;->s:LT5/F;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput p1, p0, LY5/f;->o:I

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LY5/f;->p:Ljava/util/List;

    .line 27
    .line 28
    const-wide p1, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide p1, p0, LY5/f;->q:J

    .line 34
    .line 35
    return-void
.end method

.method private final B(Ljava/util/List;)Z
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/Collection;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LT5/F;

    .line 33
    .line 34
    invoke-virtual {v0}, LT5/F;->b()Ljava/net/Proxy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, LY5/f;->s:LT5/F;

    .line 47
    .line 48
    invoke-virtual {v2}, LT5/F;->b()Ljava/net/Proxy;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-ne v2, v3, :cond_1

    .line 57
    .line 58
    iget-object v2, p0, LY5/f;->s:LT5/F;

    .line 59
    .line 60
    invoke-virtual {v2}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    :cond_2
    :goto_0
    return v1
.end method

.method private final F(I)V
    .locals 7

    .line 1
    iget-object v0, p0, LY5/f;->d:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LY5/f;->h:Li6/h;

    .line 7
    .line 8
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LY5/f;->i:Li6/g;

    .line 12
    .line 13
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lb6/f$b;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    sget-object v6, LX5/e;->h:LX5/e;

    .line 24
    .line 25
    invoke-direct {v4, v5, v6}, Lb6/f$b;-><init>(ZLX5/e;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, p0, LY5/f;->s:LT5/F;

    .line 29
    .line 30
    invoke-virtual {v5}, LT5/F;->a()LT5/a;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, LT5/a;->l()LT5/u;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, LT5/u;->h()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v4, v0, v5, v1, v2}, Lb6/f$b;->m(Ljava/net/Socket;Ljava/lang/String;Li6/h;Li6/g;)Lb6/f$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p0}, Lb6/f$b;->k(Lb6/f$d;)Lb6/f$b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Lb6/f$b;->l(I)Lb6/f$b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lb6/f$b;->a()Lb6/f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, LY5/f;->g:Lb6/f;

    .line 59
    .line 60
    sget-object v0, Lb6/f;->P:Lb6/f$c;

    .line 61
    .line 62
    invoke-virtual {v0}, Lb6/f$c;->a()Lb6/m;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lb6/m;->d()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, p0, LY5/f;->o:I

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    const/4 v1, 0x3

    .line 74
    invoke-static {p1, v3, v0, v1, v0}, Lb6/f;->y1(Lb6/f;ZLX5/e;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private final G(LT5/u;)Z
    .locals 4

    .line 1
    sget-boolean v0, LU5/c;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "Thread "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "Thread.currentThread()"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, " MUST hold lock on "

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_1
    :goto_0
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 57
    .line 58
    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1}, LT5/u;->l()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0}, LT5/u;->l()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x0

    .line 75
    if-eq v1, v2, :cond_2

    .line 76
    .line 77
    return v3

    .line 78
    :cond_2
    invoke-virtual {p1}, LT5/u;->h()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v1, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x1

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    return v1

    .line 94
    :cond_3
    iget-boolean v0, p0, LY5/f;->k:Z

    .line 95
    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    iget-object v0, p0, LY5/f;->e:LT5/s;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, p1, v0}, LY5/f;->e(LT5/u;LT5/s;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    move v3, v1

    .line 112
    :cond_4
    return v3
.end method

.method public static final synthetic c(LY5/f;)LT5/s;
    .locals 0

    .line 1
    iget-object p0, p0, LY5/f;->e:LT5/s;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e(LT5/u;LT5/s;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, LT5/s;->d()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Lg6/d;->a:Lg6/d;

    .line 18
    .line 19
    invoke-virtual {p1}, LT5/u;->h()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    check-cast p2, Ljava/security/cert/X509Certificate;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lg6/d;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    move v1, v2

    .line 47
    :goto_0
    return v1
.end method

.method private final h(IILT5/e;LT5/r;)V
    .locals 4

    .line 1
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/F;->b()Ljava/net/Proxy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LY5/f;->s:LT5/F;

    .line 8
    .line 9
    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v3, LY5/g;->a:[I

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-eq v2, v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    if-eq v2, v3, :cond_1

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/net/Socket;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v1}, LT5/a;->j()Ljavax/net/SocketFactory;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iput-object v1, p0, LY5/f;->c:Ljava/net/Socket;

    .line 52
    .line 53
    iget-object v2, p0, LY5/f;->s:LT5/F;

    .line 54
    .line 55
    invoke-virtual {v2}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p4, p3, v2, v0}, LT5/r;->j(LT5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 63
    .line 64
    .line 65
    :try_start_0
    sget-object p2, Ld6/j;->c:Ld6/j$a;

    .line 66
    .line 67
    invoke-virtual {p2}, Ld6/j$a;->g()Ld6/j;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget-object p3, p0, LY5/f;->s:LT5/F;

    .line 72
    .line 73
    invoke-virtual {p3}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p2, v1, p3, p1}, Ld6/j;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 78
    .line 79
    .line 80
    :try_start_1
    invoke-static {v1}, Li6/q;->m(Ljava/net/Socket;)Li6/C;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Li6/q;->d(Li6/C;)Li6/h;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, LY5/f;->h:Li6/h;

    .line 89
    .line 90
    invoke-static {v1}, Li6/q;->i(Ljava/net/Socket;)Li6/A;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, Li6/q;->c(Li6/A;)Li6/g;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, LY5/f;->i:Li6/g;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catch_0
    move-exception p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const-string p3, "throw with null exception"

    .line 107
    .line 108
    invoke-static {p2, p3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_2

    .line 113
    .line 114
    :goto_2
    return-void

    .line 115
    :cond_2
    new-instance p2, Ljava/io/IOException;

    .line 116
    .line 117
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw p2

    .line 121
    :catch_1
    move-exception p1

    .line 122
    new-instance p2, Ljava/net/ConnectException;

    .line 123
    .line 124
    new-instance p3, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string p4, "Failed to connect to "

    .line 130
    .line 131
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget-object p4, p0, LY5/f;->s:LT5/F;

    .line 135
    .line 136
    invoke-virtual {p4}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 137
    .line 138
    .line 139
    move-result-object p4

    .line 140
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 151
    .line 152
    .line 153
    throw p2
.end method

.method private final i(LY5/b;)V
    .locals 10

    .line 1
    iget-object v0, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    move-result-object v0

    invoke-virtual {v0}, LT5/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LY5/f;->c:Ljava/net/Socket;

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v4

    invoke-virtual {v4}, LT5/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v5

    invoke-virtual {v5}, LT5/u;->l()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, LY5/b;->a(Ljavax/net/ssl/SSLSocket;)LT5/l;

    move-result-object p1

    invoke-virtual {p1}, LT5/l;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v3}, Ld6/j$a;->g()Ld6/j;

    move-result-object v3

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v4

    invoke-virtual {v4}, LT5/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LT5/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Ld6/j;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    sget-object v4, LT5/s;->e:LT5/s$a;

    const-string v5, "sslSocketSession"

    invoke-static {v3, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, LT5/s$a;->b(Ljavax/net/ssl/SSLSession;)LT5/s;

    move-result-object v4

    invoke-virtual {v0}, LT5/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-static {v5}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v7

    invoke-virtual {v7}, LT5/u;->h()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v4}, LT5/s;->d()Ljava/util/List;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v3, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\n              |Hostname "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v0

    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n              |    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, LT5/g;->d:LT5/g$b;

    invoke-virtual {v0, p1}, LT5/g$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    const-string v5, "cert.subjectDN"

    invoke-static {v0, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lg6/d;->a:Lg6/d;

    invoke-virtual {v0, p1}, Lg6/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v6, v2}, LF5/g;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_2
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hostname "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v0

    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v0}, LT5/a;->a()LT5/g;

    move-result-object v3

    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    new-instance v5, LT5/s;

    invoke-virtual {v4}, LT5/s;->e()LT5/G;

    move-result-object v6

    invoke-virtual {v4}, LT5/s;->a()LT5/i;

    move-result-object v7

    invoke-virtual {v4}, LT5/s;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, LY5/f$b;

    invoke-direct {v9, v3, v4, v0}, LY5/f$b;-><init>(LT5/g;LT5/s;LT5/a;)V

    invoke-direct {v5, v6, v7, v8, v9}, LT5/s;-><init>(LT5/G;LT5/i;Ljava/util/List;Lv5/a;)V

    iput-object v5, p0, LY5/f;->e:LT5/s;

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v0

    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v4, LY5/f$c;

    invoke-direct {v4, p0}, LY5/f$c;-><init>(LY5/f;)V

    invoke-virtual {v3, v0, v4}, LT5/g;->b(Ljava/lang/String;Lv5/a;)V

    invoke-virtual {p1}, LT5/l;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {p1}, Ld6/j$a;->g()Ld6/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Ld6/j;->h(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_4
    iput-object v1, p0, LY5/f;->d:Ljava/net/Socket;

    invoke-static {v1}, Li6/q;->m(Ljava/net/Socket;)Li6/C;

    move-result-object p1

    invoke-static {p1}, Li6/q;->d(Li6/C;)Li6/h;

    move-result-object p1

    iput-object p1, p0, LY5/f;->h:Li6/h;

    invoke-static {v1}, Li6/q;->i(Ljava/net/Socket;)Li6/A;

    move-result-object p1

    invoke-static {p1}, Li6/q;->c(Li6/A;)Li6/g;

    move-result-object p1

    iput-object p1, p0, LY5/f;->i:Li6/g;

    if-eqz v2, :cond_5

    sget-object p1, LT5/A;->u:LT5/A$a;

    invoke-virtual {p1, v2}, LT5/A$a;->a(Ljava/lang/String;)LT5/A;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object p1, LT5/A;->o:LT5/A;

    :goto_1
    iput-object p1, p0, LY5/f;->f:LT5/A;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {p1}, Ld6/j$a;->g()Ld6/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Ld6/j;->b(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_6
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v2, :cond_7

    sget-object v0, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v0}, Ld6/j$a;->g()Ld6/j;

    move-result-object v0

    invoke-virtual {v0, v2}, Ld6/j;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_7
    if-eqz v2, :cond_8

    invoke-static {v2}, LU5/c;->k(Ljava/net/Socket;)V

    :cond_8
    throw p1
.end method

.method private final j(IIILT5/e;LT5/r;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LY5/f;->l()LT5/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LT5/B;->l()LT5/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const/16 v3, 0x15

    .line 11
    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p4, p5}, LY5/f;->h(IILT5/e;LT5/r;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p2, p3, v0, v1}, LY5/f;->k(IILT5/B;LT5/u;)LT5/B;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, LY5/f;->c:Ljava/net/Socket;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-static {v3}, LU5/c;->k(Ljava/net/Socket;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    iput-object v3, p0, LY5/f;->c:Ljava/net/Socket;

    .line 32
    .line 33
    iput-object v3, p0, LY5/f;->i:Li6/g;

    .line 34
    .line 35
    iput-object v3, p0, LY5/f;->h:Li6/h;

    .line 36
    .line 37
    iget-object v4, p0, LY5/f;->s:LT5/F;

    .line 38
    .line 39
    invoke-virtual {v4}, LT5/F;->d()Ljava/net/InetSocketAddress;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, p0, LY5/f;->s:LT5/F;

    .line 44
    .line 45
    invoke-virtual {v5}, LT5/F;->b()Ljava/net/Proxy;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {p5, p4, v4, v5, v3}, LT5/r;->h(LT5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LT5/A;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void
.end method

.method private final k(IILT5/B;LT5/u;)LT5/B;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "CONNECT "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p4, v1}, LU5/c;->P(LT5/u;Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p4, " HTTP/1.1"

    .line 20
    .line 21
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    :goto_0
    iget-object v0, p0, LY5/f;->h:Li6/h;

    .line 29
    .line 30
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, LY5/f;->i:Li6/g;

    .line 34
    .line 35
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, La6/b;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, v4, p0, v0, v2}, La6/b;-><init>(LT5/z;LY5/f;Li6/h;Li6/g;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Li6/C;->i()Li6/D;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    int-to-long v6, p1

    .line 49
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    invoke-virtual {v5, v6, v7, v8}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Li6/A;->i()Li6/D;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    int-to-long v6, p2

    .line 59
    invoke-virtual {v5, v6, v7, v8}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3}, LT5/B;->e()LT5/t;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v3, v5, p4}, La6/b;->A(LT5/t;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, La6/b;->a()V

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual {v3, v5}, La6/b;->d(Z)LT5/D$a;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p3}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-virtual {p3}, LT5/D$a;->c()LT5/D;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    invoke-virtual {v3, p3}, La6/b;->z(LT5/D;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3}, LT5/D;->f()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/16 v5, 0xc8

    .line 96
    .line 97
    if-eq v3, v5, :cond_3

    .line 98
    .line 99
    const/16 v0, 0x197

    .line 100
    .line 101
    if-ne v3, v0, :cond_2

    .line 102
    .line 103
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 104
    .line 105
    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, LT5/a;->h()LT5/b;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v2, p0, LY5/f;->s:LT5/F;

    .line 114
    .line 115
    invoke-interface {v0, v2, p3}, LT5/b;->a(LT5/F;LT5/D;)LT5/B;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_1

    .line 120
    .line 121
    const-string v2, "Connection"

    .line 122
    .line 123
    const/4 v3, 0x2

    .line 124
    invoke-static {p3, v2, v4, v3, v4}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    const-string v2, "close"

    .line 129
    .line 130
    invoke-static {v2, p3, v1}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    if-eqz p3, :cond_0

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_0
    move-object p3, v0

    .line 138
    goto :goto_0

    .line 139
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 140
    .line 141
    const-string p2, "Failed to authenticate with proxy"

    .line 142
    .line 143
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 148
    .line 149
    new-instance p2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string p4, "Unexpected response code for CONNECT: "

    .line 155
    .line 156
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, LT5/D;->f()I

    .line 160
    .line 161
    .line 162
    move-result p3

    .line 163
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_3
    invoke-interface {v0}, Li6/h;->h()Li6/f;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Li6/f;->O()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_4

    .line 183
    .line 184
    invoke-interface {v2}, Li6/g;->h()Li6/f;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Li6/f;->O()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_4

    .line 193
    .line 194
    return-object v4

    .line 195
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 196
    .line 197
    const-string p2, "TLS tunnel buffered too many bytes!"

    .line 198
    .line 199
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1
.end method

.method private final l()LT5/B;
    .locals 4

    .line 1
    new-instance v0, LT5/B$a;

    invoke-direct {v0}, LT5/B$a;-><init>()V

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    move-result-object v1

    invoke-virtual {v1}, LT5/a;->l()LT5/u;

    move-result-object v1

    invoke-virtual {v0, v1}, LT5/B$a;->l(LT5/u;)LT5/B$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LT5/B$a;->g(Ljava/lang/String;LT5/C;)LT5/B$a;

    move-result-object v0

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    move-result-object v1

    invoke-virtual {v1}, LT5/a;->l()LT5/u;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, LU5/c;->P(LT5/u;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "okhttp/4.9.2"

    invoke-virtual {v0, v1, v2}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    move-result-object v0

    new-instance v1, LT5/D$a;

    invoke-direct {v1}, LT5/D$a;-><init>()V

    invoke-virtual {v1, v0}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    move-result-object v1

    sget-object v2, LT5/A;->o:LT5/A;

    invoke-virtual {v1, v2}, LT5/D$a;->p(LT5/A;)LT5/D$a;

    move-result-object v1

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, LT5/D$a;->g(I)LT5/D$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, LT5/D$a;->m(Ljava/lang/String;)LT5/D$a;

    move-result-object v1

    sget-object v2, LU5/c;->c:LT5/E;

    invoke-virtual {v1, v2}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, LT5/D$a;->s(J)LT5/D$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, LT5/D$a;->q(J)LT5/D$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, LT5/D$a;->j(Ljava/lang/String;Ljava/lang/String;)LT5/D$a;

    move-result-object v1

    invoke-virtual {v1}, LT5/D$a;->c()LT5/D;

    move-result-object v1

    iget-object v2, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v2}, LT5/F;->a()LT5/a;

    move-result-object v2

    invoke-virtual {v2}, LT5/a;->h()LT5/b;

    move-result-object v2

    iget-object v3, p0, LY5/f;->s:LT5/F;

    invoke-interface {v2, v3, v1}, LT5/b;->a(LT5/F;LT5/D;)LT5/B;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method private final m(LY5/b;ILT5/e;LT5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LT5/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, LY5/f;->s:LT5/F;

    .line 14
    .line 15
    invoke-virtual {p1}, LT5/F;->a()LT5/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, LT5/a;->f()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p3, LT5/A;->r:LT5/A;

    .line 24
    .line 25
    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, LY5/f;->c:Ljava/net/Socket;

    .line 32
    .line 33
    iput-object p1, p0, LY5/f;->d:Ljava/net/Socket;

    .line 34
    .line 35
    iput-object p3, p0, LY5/f;->f:LT5/A;

    .line 36
    .line 37
    invoke-direct {p0, p2}, LY5/f;->F(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object p1, p0, LY5/f;->c:Ljava/net/Socket;

    .line 42
    .line 43
    iput-object p1, p0, LY5/f;->d:Ljava/net/Socket;

    .line 44
    .line 45
    sget-object p1, LT5/A;->o:LT5/A;

    .line 46
    .line 47
    iput-object p1, p0, LY5/f;->f:LT5/A;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p4, p3}, LT5/r;->C(LT5/e;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1}, LY5/f;->i(LY5/b;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LY5/f;->e:LT5/s;

    .line 57
    .line 58
    invoke-virtual {p4, p3, p1}, LT5/r;->B(LT5/e;LT5/s;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, LY5/f;->f:LT5/A;

    .line 62
    .line 63
    sget-object p3, LT5/A;->q:LT5/A;

    .line 64
    .line 65
    if-ne p1, p3, :cond_2

    .line 66
    .line 67
    invoke-direct {p0, p2}, LY5/f;->F(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method


# virtual methods
.method public A()LT5/F;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LY5/f;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LY5/f;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public E()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->d:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final declared-synchronized H(LY5/e;Ljava/io/IOException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "call"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, Lb6/n;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    move-object v0, p2

    .line 13
    check-cast v0, Lb6/n;

    .line 14
    .line 15
    iget-object v0, v0, Lb6/n;->m:Lb6/b;

    .line 16
    .line 17
    sget-object v2, Lb6/b;->u:Lb6/b;

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    iget p1, p0, LY5/f;->n:I

    .line 22
    .line 23
    add-int/2addr p1, v1

    .line 24
    iput p1, p0, LY5/f;->n:I

    .line 25
    .line 26
    if-le p1, v1, :cond_5

    .line 27
    .line 28
    iput-boolean v1, p0, LY5/f;->j:Z

    .line 29
    .line 30
    iget p1, p0, LY5/f;->l:I

    .line 31
    .line 32
    :goto_0
    add-int/2addr p1, v1

    .line 33
    iput p1, p0, LY5/f;->l:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    check-cast p2, Lb6/n;

    .line 39
    .line 40
    iget-object p2, p2, Lb6/n;->m:Lb6/b;

    .line 41
    .line 42
    sget-object v0, Lb6/b;->v:Lb6/b;

    .line 43
    .line 44
    if-ne p2, v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, LY5/e;->n0()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iput-boolean v1, p0, LY5/f;->j:Z

    .line 54
    .line 55
    iget p1, p0, LY5/f;->l:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p0}, LY5/f;->v()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    instance-of v0, p2, Lb6/a;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    :cond_3
    iput-boolean v1, p0, LY5/f;->j:Z

    .line 69
    .line 70
    iget v0, p0, LY5/f;->m:I

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, LY5/e;->k()LT5/z;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 81
    .line 82
    invoke-virtual {p0, p1, v0, p2}, LY5/f;->g(LT5/z;LT5/F;Ljava/io/IOException;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget p1, p0, LY5/f;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    :goto_1
    monitor-exit p0

    .line 89
    return-void

    .line 90
    :goto_2
    monitor-exit p0

    .line 91
    throw p1
.end method

.method public declared-synchronized a(Lb6/f;Lb6/m;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "connection"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "settings"

    .line 8
    .line 9
    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lb6/m;->d()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, LY5/f;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit p0

    .line 22
    throw p1
.end method

.method public b(Lb6/i;)V
    .locals 2

    .line 1
    const-string v0, "stream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb6/b;->u:Lb6/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Lb6/i;->d(Lb6/b;Ljava/io/IOException;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->c:Ljava/net/Socket;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, LU5/c;->k(Ljava/net/Socket;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f(IIIIZLT5/e;LT5/r;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 1
    const-string v0, "call"

    invoke-static {v8, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, LY5/f;->f:LT5/A;

    const/4 v10, 0x1

    if-nez v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_d

    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    move-result-object v0

    invoke-virtual {v0}, LT5/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v11, LY5/b;

    invoke-direct {v11, v0}, LY5/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    move-result-object v1

    invoke-virtual {v1}, LT5/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, LT5/l;->j:LT5/l;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    move-result-object v0

    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    move-result-object v0

    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v1}, Ld6/j$a;->g()Ld6/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Ld6/j;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, LY5/j;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, LY5/j;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_2
    new-instance v0, LY5/j;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LY5/j;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_3
    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    move-result-object v0

    invoke-virtual {v0}, LT5/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, LT5/A;->r:LT5/A;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_1
    const/4 v12, 0x0

    move-object v13, v12

    :goto_2
    :try_start_0
    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v6}, LY5/f;->j(IIILT5/e;LT5/r;)V

    iget-object v0, v7, LY5/f;->c:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_4

    goto :goto_6

    :cond_4
    move/from16 v14, p1

    move/from16 v15, p2

    :goto_3
    move/from16 v6, p4

    goto :goto_5

    :catch_0
    move-exception v0

    move/from16 v14, p1

    move/from16 v15, p2

    :goto_4
    move/from16 v6, p4

    goto :goto_8

    :cond_5
    move/from16 v14, p1

    move/from16 v15, p2

    :try_start_1
    invoke-direct {v7, v14, v15, v8, v9}, LY5/f;->h(IILT5/e;LT5/r;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :goto_5
    :try_start_2
    invoke-direct {v7, v11, v6, v8, v9}, LY5/f;->m(LY5/b;ILT5/e;LT5/r;)V

    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, LY5/f;->f:LT5/A;

    invoke-virtual {v9, v8, v0, v1, v2}, LT5/r;->h(LT5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LT5/A;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_6
    iget-object v0, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v0}, LT5/F;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v7, LY5/f;->c:Ljava/net/Socket;

    if-eqz v0, :cond_6

    goto :goto_7

    :cond_6
    new-instance v0, LY5/j;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LY5/j;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_7
    :goto_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, LY5/f;->q:J

    return-void

    :catch_1
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v0

    goto :goto_4

    :goto_8
    iget-object v1, v7, LY5/f;->d:Ljava/net/Socket;

    if-eqz v1, :cond_8

    invoke-static {v1}, LU5/c;->k(Ljava/net/Socket;)V

    :cond_8
    iget-object v1, v7, LY5/f;->c:Ljava/net/Socket;

    if-eqz v1, :cond_9

    invoke-static {v1}, LU5/c;->k(Ljava/net/Socket;)V

    :cond_9
    iput-object v12, v7, LY5/f;->d:Ljava/net/Socket;

    iput-object v12, v7, LY5/f;->c:Ljava/net/Socket;

    iput-object v12, v7, LY5/f;->h:Li6/h;

    iput-object v12, v7, LY5/f;->i:Li6/g;

    iput-object v12, v7, LY5/f;->e:LT5/s;

    iput-object v12, v7, LY5/f;->f:LT5/A;

    iput-object v12, v7, LY5/f;->g:Lb6/f;

    iput v10, v7, LY5/f;->o:I

    iget-object v1, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, LT5/r;->i(LT5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LT5/A;Ljava/io/IOException;)V

    if-nez v13, :cond_a

    new-instance v13, LY5/j;

    invoke-direct {v13, v0}, LY5/j;-><init>(Ljava/io/IOException;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v13, v0}, LY5/j;->a(Ljava/io/IOException;)V

    :goto_9
    if-eqz p5, :cond_b

    invoke-virtual {v11, v0}, LY5/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_2

    :cond_b
    throw v13

    :cond_c
    new-instance v0, LY5/j;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LY5/j;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(LT5/z;LT5/F;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failedRoute"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "failure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, LT5/F;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, LT5/F;->a()LT5/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LT5/a;->i()Ljava/net/ProxySelector;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0}, LT5/a;->l()LT5/u;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LT5/u;->q()Ljava/net/URI;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p2}, LT5/F;->b()Ljava/net/Proxy;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v0, v2, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {p1}, LT5/z;->v()LY5/i;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, p2}, LY5/i;->b(LT5/F;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final n()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY5/f;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY5/f;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget v0, p0, LY5/f;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public r()LT5/s;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->e:LT5/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized s()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, LY5/f;->m:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, LY5/f;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
.end method

.method public final t(LT5/a;Ljava/util/List;)Z
    .locals 3

    .line 1
    const-string v0, "address"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, LU5/c;->h:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v0, "Thread "

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "Thread.currentThread()"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, " MUST hold lock on "

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_0
    iget-object v0, p0, LY5/f;->p:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget v1, p0, LY5/f;->o:I

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    if-ge v0, v1, :cond_9

    .line 71
    .line 72
    iget-boolean v0, p0, LY5/f;->j:Z

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-object v0, p0, LY5/f;->s:LT5/F;

    .line 78
    .line 79
    invoke-virtual {v0}, LT5/F;->a()LT5/a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, LT5/a;->d(LT5/a;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    return v2

    .line 90
    :cond_3
    invoke-virtual {p1}, LT5/a;->l()LT5/u;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, LT5/u;->h()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p0}, LY5/f;->A()LT5/F;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, LT5/a;->l()LT5/u;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, LT5/u;->h()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v1, 0x1

    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    return v1

    .line 122
    :cond_4
    iget-object v0, p0, LY5/f;->g:Lb6/f;

    .line 123
    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    return v2

    .line 127
    :cond_5
    if-eqz p2, :cond_9

    .line 128
    .line 129
    invoke-direct {p0, p2}, LY5/f;->B(Ljava/util/List;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_6

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    invoke-virtual {p1}, LT5/a;->e()Ljavax/net/ssl/HostnameVerifier;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    sget-object v0, Lg6/d;->a:Lg6/d;

    .line 141
    .line 142
    if-eq p2, v0, :cond_7

    .line 143
    .line 144
    return v2

    .line 145
    :cond_7
    invoke-virtual {p1}, LT5/a;->l()LT5/u;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-direct {p0, p2}, LY5/f;->G(LT5/u;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_8

    .line 154
    .line 155
    return v2

    .line 156
    :cond_8
    :try_start_0
    invoke-virtual {p1}, LT5/a;->a()LT5/g;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, LT5/a;->l()LT5/u;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, LT5/u;->h()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0}, LY5/f;->r()LT5/s;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, LT5/s;->d()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {p2, p1, v0}, LT5/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    return v1

    .line 186
    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    move-result-object v1

    invoke-virtual {v1}, LT5/a;->l()LT5/u;

    move-result-object v1

    invoke-virtual {v1}, LT5/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->a()LT5/a;

    move-result-object v1

    invoke-virtual {v1}, LT5/a;->l()LT5/u;

    move-result-object v1

    invoke-virtual {v1}, LT5/u;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, " proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->s:LT5/F;

    invoke-virtual {v1}, LT5/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->e:LT5/s;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LT5/s;->a()LT5/i;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/f;->f:LT5/A;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Z)Z
    .locals 7

    .line 1
    sget-boolean v0, LU5/c;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "Thread "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "Thread.currentThread()"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, " MUST NOT hold lock on "

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iget-object v2, p0, LY5/f;->c:Ljava/net/Socket;

    .line 61
    .line 62
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, LY5/f;->d:Ljava/net/Socket;

    .line 66
    .line 67
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, LY5/f;->h:Li6/h;

    .line 71
    .line 72
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_5

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    iget-object v2, p0, LY5/f;->g:Lb6/f;

    .line 101
    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    invoke-virtual {v2, v0, v1}, Lb6/f;->k1(J)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    return p1

    .line 109
    :cond_3
    monitor-enter p0

    .line 110
    :try_start_0
    iget-wide v5, p0, LY5/f;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    sub-long/2addr v0, v5

    .line 113
    monitor-exit p0

    .line 114
    const-wide v5, 0x2540be400L

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    cmp-long v0, v0, v5

    .line 120
    .line 121
    if-ltz v0, :cond_4

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    invoke-static {v3, v4}, LU5/c;->D(Ljava/net/Socket;Li6/h;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    return p1

    .line 130
    :cond_4
    const/4 p1, 0x1

    .line 131
    return p1

    .line 132
    :catchall_0
    move-exception p1

    .line 133
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 136
    return p1
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY5/f;->g:Lb6/f;

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
    return v0
.end method

.method public final w(LT5/z;LZ5/g;)LZ5/d;
    .locals 6

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "chain"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LY5/f;->d:Ljava/net/Socket;

    .line 12
    .line 13
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LY5/f;->h:Li6/h;

    .line 17
    .line 18
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, LY5/f;->i:Li6/g;

    .line 22
    .line 23
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, LY5/f;->g:Lb6/f;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance v0, Lb6/g;

    .line 31
    .line 32
    invoke-direct {v0, p1, p0, p2, v3}, Lb6/g;-><init>(LT5/z;LY5/f;LZ5/g;Lb6/f;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p2}, LZ5/g;->j()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Li6/C;->i()Li6/D;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2}, LZ5/g;->g()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    int-to-long v3, v3

    .line 52
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    invoke-virtual {v0, v3, v4, v5}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Li6/A;->i()Li6/D;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p2}, LZ5/g;->i()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    int-to-long v3, p2

    .line 66
    invoke-virtual {v0, v3, v4, v5}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 67
    .line 68
    .line 69
    new-instance v0, La6/b;

    .line 70
    .line 71
    invoke-direct {v0, p1, p0, v1, v2}, La6/b;-><init>(LT5/z;LY5/f;Li6/h;Li6/g;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-object v0
.end method

.method public final x(LY5/c;)Lh6/d$d;
    .locals 8

    .line 1
    const-string v0, "exchange"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY5/f;->d:Ljava/net/Socket;

    .line 7
    .line 8
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v6, p0, LY5/f;->h:Li6/h;

    .line 12
    .line 13
    invoke-static {v6}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v7, p0, LY5/f;->i:Li6/g;

    .line 17
    .line 18
    invoke-static {v7}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, LY5/f;->z()V

    .line 26
    .line 27
    .line 28
    new-instance v0, LY5/f$d;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    move-object v1, v0

    .line 32
    move-object v2, p1

    .line 33
    move-object v3, v6

    .line 34
    move-object v4, v7

    .line 35
    invoke-direct/range {v1 .. v7}, LY5/f$d;-><init>(LY5/c;Li6/h;Li6/g;ZLi6/h;Li6/g;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final declared-synchronized y()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, LY5/f;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0

    .line 9
    throw v0
.end method

.method public final declared-synchronized z()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, LY5/f;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0

    .line 9
    throw v0
.end method

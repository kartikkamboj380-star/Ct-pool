.class final LT5/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT5/c$c$a;
    }
.end annotation


# static fields
.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field public static final m:LT5/c$c$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LT5/t;

.field private final c:Ljava/lang/String;

.field private final d:LT5/A;

.field private final e:I

.field private final f:Ljava/lang/String;

.field private final g:LT5/t;

.field private final h:LT5/s;

.field private final i:J

.field private final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LT5/c$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT5/c$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT5/c$c;->m:LT5/c$c$a;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ld6/j;->c:Ld6/j$a;

    .line 15
    .line 16
    invoke-virtual {v1}, Ld6/j$a;->g()Ld6/j;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ld6/j;->g()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "-Sent-Millis"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, LT5/c$c;->k:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ld6/j$a;->g()Ld6/j;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ld6/j;->g()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "-Received-Millis"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, LT5/c$c;->l:Ljava/lang/String;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(LT5/D;)V
    .locals 2

    .line 1
    const-string v0, "response"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    move-result-object v0

    invoke-virtual {v0}, LT5/B;->l()LT5/u;

    move-result-object v0

    invoke-virtual {v0}, LT5/u;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->a:Ljava/lang/String;

    sget-object v0, LT5/c;->s:LT5/c$b;

    invoke-virtual {v0, p1}, LT5/c$b;->f(LT5/D;)LT5/t;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->b:LT5/t;

    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    move-result-object v0

    invoke-virtual {v0}, LT5/B;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->c:Ljava/lang/String;

    invoke-virtual {p1}, LT5/D;->a0()LT5/A;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->d:LT5/A;

    invoke-virtual {p1}, LT5/D;->f()I

    move-result v0

    iput v0, p0, LT5/c$c;->e:I

    invoke-virtual {p1}, LT5/D;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->f:Ljava/lang/String;

    invoke-virtual {p1}, LT5/D;->w()LT5/t;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->g:LT5/t;

    invoke-virtual {p1}, LT5/D;->j()LT5/s;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->h:LT5/s;

    invoke-virtual {p1}, LT5/D;->n0()J

    move-result-wide v0

    iput-wide v0, p0, LT5/c$c;->i:J

    invoke-virtual {p1}, LT5/D;->h0()J

    move-result-wide v0

    iput-wide v0, p0, LT5/c$c;->j:J

    return-void
.end method

.method public constructor <init>(Li6/C;)V
    .locals 8

    .line 2
    const-string v0, "rawSource"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {p1}, Li6/q;->d(Li6/C;)Li6/h;

    move-result-object v0

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LT5/c$c;->a:Ljava/lang/String;

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LT5/c$c;->c:Ljava/lang/String;

    new-instance v1, LT5/t$a;

    invoke-direct {v1}, LT5/t$a;-><init>()V

    sget-object v2, LT5/c;->s:LT5/c$b;

    invoke-virtual {v2, v0}, LT5/c$b;->c(Li6/h;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, LT5/t$a;->b(Ljava/lang/String;)LT5/t$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v1}, LT5/t$a;->e()LT5/t;

    move-result-object v1

    iput-object v1, p0, LT5/c$c;->b:LT5/t;

    sget-object v1, LZ5/k;->d:LZ5/k$a;

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LZ5/k$a;->a(Ljava/lang/String;)LZ5/k;

    move-result-object v1

    iget-object v2, v1, LZ5/k;->a:LT5/A;

    iput-object v2, p0, LT5/c$c;->d:LT5/A;

    iget v2, v1, LZ5/k;->b:I

    iput v2, p0, LT5/c$c;->e:I

    iget-object v1, v1, LZ5/k;->c:Ljava/lang/String;

    iput-object v1, p0, LT5/c$c;->f:Ljava/lang/String;

    new-instance v1, LT5/t$a;

    invoke-direct {v1}, LT5/t$a;-><init>()V

    sget-object v2, LT5/c;->s:LT5/c$b;

    invoke-virtual {v2, v0}, LT5/c$b;->c(Li6/h;)I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, LT5/t$a;->b(Ljava/lang/String;)LT5/t$a;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    sget-object v2, LT5/c$c;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, LT5/t$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, LT5/c$c;->l:Ljava/lang/String;

    invoke-virtual {v1, v4}, LT5/t$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2}, LT5/t$a;->h(Ljava/lang/String;)LT5/t$a;

    invoke-virtual {v1, v4}, LT5/t$a;->h(Ljava/lang/String;)LT5/t$a;

    const-wide/16 v6, 0x0

    if-eqz v3, :cond_2

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    move-wide v2, v6

    :goto_2
    iput-wide v2, p0, LT5/c$c;->i:J

    if-eqz v5, :cond_3

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    :cond_3
    iput-wide v6, p0, LT5/c$c;->j:J

    invoke-virtual {v1}, LT5/t$a;->e()LT5/t;

    move-result-object v1

    iput-object v1, p0, LT5/c$c;->g:LT5/t;

    invoke-direct {p0}, LT5/c$c;->a()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-gtz v2, :cond_5

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LT5/i;->s1:LT5/i$b;

    invoke-virtual {v2, v1}, LT5/i$b;->b(Ljava/lang/String;)LT5/i;

    move-result-object v1

    invoke-direct {p0, v0}, LT5/c$c;->c(Li6/h;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v0}, LT5/c$c;->c(Li6/h;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0}, Li6/h;->O()Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, LT5/G;->t:LT5/G$a;

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, LT5/G$a;->a(Ljava/lang/String;)LT5/G;

    move-result-object v0

    goto :goto_3

    :cond_4
    sget-object v0, LT5/G;->r:LT5/G;

    :goto_3
    sget-object v4, LT5/s;->e:LT5/s$a;

    invoke-virtual {v4, v0, v1, v2, v3}, LT5/s$a;->a(LT5/G;LT5/i;Ljava/util/List;Ljava/util/List;)LT5/s;

    move-result-object v0

    iput-object v0, p0, LT5/c$c;->h:LT5/s;

    goto :goto_4

    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, LT5/c$c;->h:LT5/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    invoke-interface {p1}, Li6/C;->close()V

    return-void

    :goto_5
    invoke-interface {p1}, Li6/C;->close()V

    throw v0
.end method

.method private final a()Z
    .locals 5

    .line 1
    iget-object v0, p0, LT5/c$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "https://"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-static {v0, v3, v4, v1, v2}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method private final c(Li6/h;)Ljava/util/List;
    .locals 7

    .line 1
    sget-object v0, LT5/c;->s:LT5/c$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LT5/c$b;->c(Li6/h;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 16
    .line 17
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    if-ge v3, v0, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Li6/h;->C0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, Li6/f;

    .line 34
    .line 35
    invoke-direct {v5}, Li6/f;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v6, Li6/i;->q:Li6/i$a;

    .line 39
    .line 40
    invoke-virtual {v6, v4}, Li6/i$a;->a(Ljava/lang/String;)Li6/i;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v4}, Li6/f;->q1(Li6/i;)Li6/f;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Li6/f;->e1()Ljava/io/InputStream;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v2

    .line 67
    :goto_1
    new-instance v0, Ljava/io/IOException;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method private final e(Li6/g;Ljava/util/List;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-interface {p1, v0, v1}, Li6/g;->X0(J)Li6/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-interface {v0, v1}, Li6/g;->P(I)Li6/g;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/security/cert/Certificate;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    sget-object v4, Li6/i;->q:Li6/i$a;

    .line 33
    .line 34
    const-string v3, "bytes"

    .line 35
    .line 36
    invoke-static {v5, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-static/range {v4 .. v9}, Li6/i$a;->g(Li6/i$a;[BIIILjava/lang/Object;)Li6/i;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Li6/i;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {p1, v3}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3, v1}, Li6/g;->P(I)Li6/g;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    return-void

    .line 64
    :goto_1
    new-instance p2, Ljava/io/IOException;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2
.end method


# virtual methods
.method public final b(LT5/B;LT5/D;)Z
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LT5/c$c;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, LT5/u;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, LT5/c$c;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1}, LT5/B;->h()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    sget-object v0, LT5/c;->s:LT5/c$b;

    .line 40
    .line 41
    iget-object v1, p0, LT5/c$c;->b:LT5/t;

    .line 42
    .line 43
    invoke-virtual {v0, p2, v1, p1}, LT5/c$b;->g(LT5/D;LT5/t;LT5/B;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    :goto_0
    return p1
.end method

.method public final d(LW5/d$d;)LT5/D;
    .locals 5

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT5/c$c;->g:LT5/t;

    .line 7
    .line 8
    const-string v1, "Content-Type"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LT5/t;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LT5/c$c;->g:LT5/t;

    .line 15
    .line 16
    const-string v2, "Content-Length"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, LT5/t;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, LT5/B$a;

    .line 23
    .line 24
    invoke-direct {v2}, LT5/B$a;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, LT5/c$c;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, LT5/c$c;->c:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-virtual {v2, v3, v4}, LT5/B$a;->g(Ljava/lang/String;LT5/C;)LT5/B$a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, LT5/c$c;->b:LT5/t;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, LT5/B$a;->f(LT5/t;)LT5/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, LT5/B$a;->b()LT5/B;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, LT5/D$a;

    .line 51
    .line 52
    invoke-direct {v3}, LT5/D$a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v3, p0, LT5/c$c;->d:LT5/A;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, LT5/D$a;->p(LT5/A;)LT5/D$a;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget v3, p0, LT5/c$c;->e:I

    .line 66
    .line 67
    invoke-virtual {v2, v3}, LT5/D$a;->g(I)LT5/D$a;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, p0, LT5/c$c;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, LT5/D$a;->m(Ljava/lang/String;)LT5/D$a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v3, p0, LT5/c$c;->g:LT5/t;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, LT5/D$a;->k(LT5/t;)LT5/D$a;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, LT5/c$a;

    .line 84
    .line 85
    invoke-direct {v3, p1, v0, v1}, LT5/c$a;-><init>(LW5/d$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p0, LT5/c$c;->h:LT5/s;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, LT5/D$a;->i(LT5/s;)LT5/D$a;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-wide v0, p0, LT5/c$c;->i:J

    .line 99
    .line 100
    invoke-virtual {p1, v0, v1}, LT5/D$a;->s(J)LT5/D$a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-wide v0, p0, LT5/c$c;->j:J

    .line 105
    .line 106
    invoke-virtual {p1, v0, v1}, LT5/D$a;->q(J)LT5/D$a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method public final f(LW5/d$b;)V
    .locals 7

    .line 1
    const-string v0, "editor"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LW5/d$b;->f(I)Li6/A;

    move-result-object p1

    invoke-static {p1}, Li6/q;->c(Li6/A;)Li6/g;

    move-result-object p1

    :try_start_0
    iget-object v1, p0, LT5/c$c;->a:Ljava/lang/String;

    invoke-interface {p1, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LT5/c$c;->c:Ljava/lang/String;

    invoke-interface {p1, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LT5/c$c;->b:LT5/t;

    invoke-virtual {v1}, LT5/t;->size()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {p1, v3, v4}, Li6/g;->X0(J)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LT5/c$c;->b:LT5/t;

    invoke-virtual {v1}, LT5/t;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v0

    :goto_0
    const-string v4, ": "

    if-ge v3, v1, :cond_0

    :try_start_1
    iget-object v5, p0, LT5/c$c;->b:LT5/t;

    invoke-virtual {v5, v3}, LT5/t;->h(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v5

    invoke-interface {v5, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v4

    iget-object v5, p0, LT5/c$c;->b:LT5/t;

    invoke-virtual {v5, v3}, LT5/t;->m(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v4

    invoke-interface {v4, v2}, Li6/g;->P(I)Li6/g;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v1, LZ5/k;

    iget-object v3, p0, LT5/c$c;->d:LT5/A;

    iget v5, p0, LT5/c$c;->e:I

    iget-object v6, p0, LT5/c$c;->f:Ljava/lang/String;

    invoke-direct {v1, v3, v5, v6}, LZ5/k;-><init>(LT5/A;ILjava/lang/String;)V

    invoke-virtual {v1}, LZ5/k;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LT5/c$c;->g:LT5/t;

    invoke-virtual {v1}, LT5/t;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    int-to-long v5, v1

    invoke-interface {p1, v5, v6}, Li6/g;->X0(J)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LT5/c$c;->g:LT5/t;

    invoke-virtual {v1}, LT5/t;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_1

    iget-object v3, p0, LT5/c$c;->g:LT5/t;

    invoke-virtual {v3, v0}, LT5/t;->h(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v3

    invoke-interface {v3, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v3

    iget-object v5, p0, LT5/c$c;->g:LT5/t;

    invoke-virtual {v5, v0}, LT5/t;->m(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v3

    invoke-interface {v3, v2}, Li6/g;->P(I)Li6/g;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, LT5/c$c;->k:Ljava/lang/String;

    invoke-interface {p1, v0}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    iget-wide v5, p0, LT5/c$c;->i:J

    invoke-interface {v0, v5, v6}, Li6/g;->X0(J)Li6/g;

    move-result-object v0

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    sget-object v0, LT5/c$c;->l:Ljava/lang/String;

    invoke-interface {p1, v0}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    iget-wide v3, p0, LT5/c$c;->j:J

    invoke-interface {v0, v3, v4}, Li6/g;->X0(J)Li6/g;

    move-result-object v0

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    invoke-direct {p0}, LT5/c$c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Li6/g;->P(I)Li6/g;

    iget-object v0, p0, LT5/c$c;->h:LT5/s;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT5/s;->a()LT5/i;

    move-result-object v0

    invoke-virtual {v0}, LT5/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    iget-object v0, p0, LT5/c$c;->h:LT5/s;

    invoke-virtual {v0}, LT5/s;->d()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LT5/c$c;->e(Li6/g;Ljava/util/List;)V

    iget-object v0, p0, LT5/c$c;->h:LT5/s;

    invoke-virtual {v0}, LT5/s;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LT5/c$c;->e(Li6/g;Ljava/util/List;)V

    iget-object v0, p0, LT5/c$c;->h:LT5/s;

    invoke-virtual {v0}, LT5/s;->e()LT5/G;

    move-result-object v0

    invoke-virtual {v0}, LT5/G;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v0

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    :cond_2
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

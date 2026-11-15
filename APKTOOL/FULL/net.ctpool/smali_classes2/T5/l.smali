.class public final LT5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT5/l$a;,
        LT5/l$b;
    }
.end annotation


# static fields
.field private static final e:[LT5/i;

.field private static final f:[LT5/i;

.field public static final g:LT5/l;

.field public static final h:LT5/l;

.field public static final i:LT5/l;

.field public static final j:LT5/l;

.field public static final k:LT5/l$b;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    new-instance v0, LT5/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT5/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT5/l;->k:LT5/l$b;

    sget-object v0, LT5/i;->n1:LT5/i;

    sget-object v1, LT5/i;->o1:LT5/i;

    sget-object v11, LT5/i;->p1:LT5/i;

    sget-object v12, LT5/i;->Z0:LT5/i;

    sget-object v13, LT5/i;->d1:LT5/i;

    sget-object v14, LT5/i;->a1:LT5/i;

    sget-object v15, LT5/i;->e1:LT5/i;

    sget-object v16, LT5/i;->k1:LT5/i;

    sget-object v17, LT5/i;->j1:LT5/i;

    move-object v2, v0

    move-object v3, v1

    move-object v4, v11

    move-object v5, v12

    move-object v6, v13

    move-object v7, v14

    move-object v8, v15

    move-object/from16 v9, v16

    move-object/from16 v10, v17

    filled-new-array/range {v2 .. v10}, [LT5/i;

    move-result-object v10

    sput-object v10, LT5/l;->e:[LT5/i;

    sget-object v18, LT5/i;->K0:LT5/i;

    sget-object v19, LT5/i;->L0:LT5/i;

    sget-object v20, LT5/i;->i0:LT5/i;

    sget-object v21, LT5/i;->j0:LT5/i;

    sget-object v22, LT5/i;->G:LT5/i;

    sget-object v23, LT5/i;->K:LT5/i;

    sget-object v24, LT5/i;->k:LT5/i;

    move-object v0, v10

    move-object/from16 v10, v17

    move-object/from16 v11, v18

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    move-object/from16 v16, v23

    move-object/from16 v17, v24

    filled-new-array/range {v2 .. v17}, [LT5/i;

    move-result-object v1

    sput-object v1, LT5/l;->f:[LT5/i;

    new-instance v2, LT5/l$a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, LT5/l$a;-><init>(Z)V

    array-length v4, v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT5/i;

    invoke-virtual {v2, v0}, LT5/l$a;->b([LT5/i;)LT5/l$a;

    move-result-object v0

    sget-object v2, LT5/G;->n:LT5/G;

    sget-object v4, LT5/G;->o:LT5/G;

    filled-new-array {v2, v4}, [LT5/G;

    move-result-object v5

    invoke-virtual {v0, v5}, LT5/l$a;->e([LT5/G;)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LT5/l$a;->d(Z)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/l$a;->a()LT5/l;

    move-result-object v0

    sput-object v0, LT5/l;->g:LT5/l;

    new-instance v0, LT5/l$a;

    invoke-direct {v0, v3}, LT5/l$a;-><init>(Z)V

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LT5/i;

    invoke-virtual {v0, v5}, LT5/l$a;->b([LT5/i;)LT5/l$a;

    move-result-object v0

    filled-new-array {v2, v4}, [LT5/G;

    move-result-object v5

    invoke-virtual {v0, v5}, LT5/l$a;->e([LT5/G;)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LT5/l$a;->d(Z)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/l$a;->a()LT5/l;

    move-result-object v0

    sput-object v0, LT5/l;->h:LT5/l;

    new-instance v0, LT5/l$a;

    invoke-direct {v0, v3}, LT5/l$a;-><init>(Z)V

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LT5/i;

    invoke-virtual {v0, v1}, LT5/l$a;->b([LT5/i;)LT5/l$a;

    move-result-object v0

    sget-object v1, LT5/G;->p:LT5/G;

    sget-object v5, LT5/G;->q:LT5/G;

    filled-new-array {v2, v4, v1, v5}, [LT5/G;

    move-result-object v1

    invoke-virtual {v0, v1}, LT5/l$a;->e([LT5/G;)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LT5/l$a;->d(Z)LT5/l$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/l$a;->a()LT5/l;

    move-result-object v0

    sput-object v0, LT5/l;->i:LT5/l;

    new-instance v0, LT5/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT5/l$a;-><init>(Z)V

    invoke-virtual {v0}, LT5/l$a;->a()LT5/l;

    move-result-object v0

    sput-object v0, LT5/l;->j:LT5/l;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LT5/l;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, LT5/l;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LT5/l;->c:[Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LT5/l;->d:[Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a(LT5/l;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LT5/l;->c:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LT5/l;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LT5/l;->d:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private final g(Ljavax/net/ssl/SSLSocket;Z)LT5/l;
    .locals 4

    .line 1
    iget-object v0, p0, LT5/l;->c:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "sslSocket.enabledCipherSuites"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LT5/l;->c:[Ljava/lang/String;

    .line 15
    .line 16
    sget-object v2, LT5/i;->s1:LT5/i$b;

    .line 17
    .line 18
    invoke-virtual {v2}, LT5/i$b;->c()Ljava/util/Comparator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v1, v2}, LU5/c;->B([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    iget-object v1, p0, LT5/l;->d:[Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "sslSocket.enabledProtocols"

    .line 40
    .line 41
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LT5/l;->d:[Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {}, Ll5/a;->b()Ljava/util/Comparator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v1, v2, v3}, LU5/c;->B([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v2, "supportedCipherSuites"

    .line 64
    .line 65
    invoke-static {p1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object v2, LT5/i;->s1:LT5/i$b;

    .line 69
    .line 70
    invoke-virtual {v2}, LT5/i$b;->c()Ljava/util/Comparator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "TLS_FALLBACK_SCSV"

    .line 75
    .line 76
    invoke-static {p1, v3, v2}, LU5/c;->u([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const-string v3, "cipherSuitesIntersection"

    .line 81
    .line 82
    if-eqz p2, :cond_2

    .line 83
    .line 84
    const/4 p2, -0x1

    .line 85
    if-eq v2, p2, :cond_2

    .line 86
    .line 87
    invoke-static {v0, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    aget-object p1, p1, v2

    .line 91
    .line 92
    const-string p2, "supportedCipherSuites[indexOfFallbackScsv]"

    .line 93
    .line 94
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p1}, LU5/c;->l([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_2
    new-instance p1, LT5/l$a;

    .line 102
    .line 103
    invoke-direct {p1, p0}, LT5/l$a;-><init>(LT5/l;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    array-length p2, v0

    .line 110
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, [Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p1, p2}, LT5/l$a;->c([Ljava/lang/String;)LT5/l$a;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string p2, "tlsVersionsIntersection"

    .line 121
    .line 122
    invoke-static {v1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    array-length p2, v1

    .line 126
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, [Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p1, p2}, LT5/l$a;->f([Ljava/lang/String;)LT5/l$a;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, LT5/l$a;->a()LT5/l;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method


# virtual methods
.method public final c(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    .line 1
    const-string v0, "sslSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LT5/l;->g(Ljavax/net/ssl/SSLSocket;Z)LT5/l;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, LT5/l;->i()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p2, LT5/l;->d:[Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p2}, LT5/l;->d()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p2, p2, LT5/l;->c:[Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, LT5/l;->c:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    array-length v2, v0

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_0

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    sget-object v5, LT5/i;->s1:LT5/i$b;

    .line 18
    .line 19
    invoke-virtual {v5, v4}, LT5/i$b;->b(Ljava/lang/String;)LT5/i;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v1}, Lj5/n;->b0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_1
    return-object v0
.end method

.method public final e(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    .line 1
    const-string v0, "socket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LT5/l;->a:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v0, p0, LT5/l;->d:[Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {}, Ll5/a;->b()Ljava/util/Comparator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v0, v2, v3}, LU5/c;->r([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    iget-object v0, p0, LT5/l;->c:[Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object v2, LT5/i;->s1:LT5/i$b;

    .line 40
    .line 41
    invoke-virtual {v2}, LT5/i$b;->c()Ljava/util/Comparator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v0, p1, v2}, LU5/c;->r([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    return v1

    .line 52
    :cond_2
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, LT5/l;

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
    const/4 v0, 0x1

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    iget-boolean v2, p0, LT5/l;->a:Z

    .line 12
    .line 13
    check-cast p1, LT5/l;

    .line 14
    .line 15
    iget-boolean v3, p1, LT5/l;->a:Z

    .line 16
    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    if-eqz v2, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, LT5/l;->c:[Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, LT5/l;->c:[Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, LT5/l;->d:[Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, LT5/l;->d:[Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-boolean v2, p0, LT5/l;->b:Z

    .line 45
    .line 46
    iget-boolean p1, p1, LT5/l;->b:Z

    .line 47
    .line 48
    if-eq v2, p1, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT5/l;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT5/l;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, LT5/l;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LT5/l;->c:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    const/16 v2, 0x20f

    .line 17
    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/lit8 v2, v2, 0x1f

    .line 20
    .line 21
    iget-object v0, p0, LT5/l;->d:[Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :cond_1
    add-int/2addr v2, v1

    .line 30
    mul-int/lit8 v2, v2, 0x1f

    .line 31
    .line 32
    iget-boolean v0, p0, LT5/l;->b:Z

    .line 33
    .line 34
    xor-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    add-int/2addr v2, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/16 v2, 0x11

    .line 39
    .line 40
    :goto_1
    return v2
.end method

.method public final i()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, LT5/l;->d:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    array-length v2, v0

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_0

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    sget-object v5, LT5/G;->t:LT5/G$a;

    .line 18
    .line 19
    invoke-virtual {v5, v4}, LT5/G$a;->a(Ljava/lang/String;)LT5/G;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v1}, Lj5/n;->b0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, LT5/l;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ConnectionSpec()"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "ConnectionSpec("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "cipherSuites="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LT5/l;->d()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "[all enabled]"

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "tlsVersions="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LT5/l;->i()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, "supportsTlsExtensions="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, LT5/l;->b:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x29

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0
.end method

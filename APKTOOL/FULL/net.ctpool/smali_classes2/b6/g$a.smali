.class public final Lb6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lb6/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT5/B;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "request"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LT5/B;->e()LT5/t;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, LT5/t;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Lb6/c;

    sget-object v3, Lb6/c;->f:Li6/i;

    invoke-virtual {p1}, LT5/B;->h()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lb6/c;-><init>(Li6/i;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lb6/c;

    sget-object v3, Lb6/c;->g:Li6/i;

    sget-object v4, LZ5/i;->a:LZ5/i;

    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    move-result-object v5

    invoke-virtual {v4, v5}, LZ5/i;->c(LT5/u;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lb6/c;-><init>(Li6/i;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    invoke-virtual {p1, v2}, LT5/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lb6/c;

    sget-object v4, Lb6/c;->i:Li6/i;

    invoke-direct {v3, v4, v2}, Lb6/c;-><init>(Li6/i;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Lb6/c;

    sget-object v3, Lb6/c;->h:Li6/i;

    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    move-result-object p1

    invoke-virtual {p1}, LT5/u;->p()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lb6/c;-><init>(Li6/i;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, LT5/t;->size()I

    move-result p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_4

    invoke-virtual {v0, v2}, LT5/t;->h(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Locale.US"

    invoke-static {v4, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_3

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lb6/g;->i()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "te"

    invoke-static {v3, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v2}, LT5/t;->m(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "trailers"

    invoke-static {v4, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance v4, Lb6/c;

    invoke-virtual {v0, v2}, LT5/t;->m(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lb6/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v1
.end method

.method public final b(LT5/t;LT5/A;)LT5/D$a;
    .locals 7

    .line 1
    const-string v0, "headerBlock"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LT5/t$a;

    .line 12
    .line 13
    invoke-direct {v0}, LT5/t$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LT5/t;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1, v3}, LT5/t;->h(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p1, v3}, LT5/t;->m(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, ":status"

    .line 33
    .line 34
    invoke-static {v4, v6}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    sget-object v2, LZ5/k;->d:LZ5/k$a;

    .line 41
    .line 42
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v6, "HTTP/1.1 "

    .line 48
    .line 49
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v2, v4}, LZ5/k$a;->a(Ljava/lang/String;)LZ5/k;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-static {}, Lb6/g;->j()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v4, v5}, LT5/t$a;->c(Ljava/lang/String;Ljava/lang/String;)LT5/t$a;

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    if-eqz v2, :cond_3

    .line 81
    .line 82
    new-instance p1, LT5/D$a;

    .line 83
    .line 84
    invoke-direct {p1}, LT5/D$a;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, LT5/D$a;->p(LT5/A;)LT5/D$a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget p2, v2, LZ5/k;->b:I

    .line 92
    .line 93
    invoke-virtual {p1, p2}, LT5/D$a;->g(I)LT5/D$a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p2, v2, LZ5/k;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, LT5/D$a;->m(Ljava/lang/String;)LT5/D$a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0}, LT5/t$a;->e()LT5/t;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2}, LT5/D$a;->k(LT5/t;)LT5/D$a;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    .line 113
    .line 114
    const-string p2, "Expected \':status\' header not present"

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method

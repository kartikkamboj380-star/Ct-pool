.class public final LT5/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/n;


# instance fields
.field private final c:Ljava/net/CookieHandler;


# direct methods
.method public constructor <init>(Ljava/net/CookieHandler;)V
    .locals 1

    .line 1
    const-string v0, "cookieHandler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LT5/w;->c:Ljava/net/CookieHandler;

    .line 10
    .line 11
    return-void
.end method

.method private final e(LT5/u;Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_3

    .line 13
    .line 14
    const-string v4, ";,"

    .line 15
    .line 16
    invoke-static {p2, v4, v3, v1}, LU5/c;->n(Ljava/lang/String;Ljava/lang/String;II)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v5, 0x3d

    .line 21
    .line 22
    invoke-static {p2, v5, v3, v4}, LU5/c;->m(Ljava/lang/String;CII)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-static {p2, v3, v5}, LU5/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v6, "$"

    .line 31
    .line 32
    const/4 v7, 0x2

    .line 33
    const/4 v8, 0x0

    .line 34
    invoke-static {v3, v6, v2, v7, v8}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    :goto_1
    add-int/lit8 v3, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-ge v5, v4, :cond_1

    .line 44
    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    invoke-static {p2, v5, v4}, LU5/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string v5, ""

    .line 53
    .line 54
    :goto_2
    const-string v6, "\""

    .line 55
    .line 56
    invoke-static {v5, v6, v2, v7, v8}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    invoke-static {v5, v6, v2, v7, v8}, LF5/g;->o(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    const/4 v7, 0x1

    .line 73
    sub-int/2addr v6, v7

    .line 74
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    const-string v6, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 79
    .line 80
    invoke-static {v5, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    new-instance v6, LT5/m$a;

    .line 84
    .line 85
    invoke-direct {v6}, LT5/m$a;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v3}, LT5/m$a;->d(Ljava/lang/String;)LT5/m$a;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3, v5}, LT5/m$a;->e(Ljava/lang/String;)LT5/m$a;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {p1}, LT5/u;->h()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v3, v5}, LT5/m$a;->b(Ljava/lang/String;)LT5/m$a;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, LT5/m$a;->a()LT5/m;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    return-object v0
.end method


# virtual methods
.method public a(LT5/u;Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cookies"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LT5/m;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-static {v1, v2}, LU5/b;->a(LT5/m;Z)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p2, "Set-Cookie"

    .line 42
    .line 43
    invoke-static {p2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lj5/F;->e(Li5/l;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :try_start_0
    iget-object v0, p0, LT5/w;->c:Ljava/net/CookieHandler;

    .line 52
    .line 53
    invoke-virtual {p1}, LT5/u;->q()Ljava/net/URI;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1, p2}, Ljava/net/CookieHandler;->put(Ljava/net/URI;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p2

    .line 62
    sget-object v0, Ld6/j;->c:Ld6/j$a;

    .line 63
    .line 64
    invoke-virtual {v0}, Ld6/j$a;->g()Ld6/j;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "Saving cookies failed for "

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v2, "/..."

    .line 79
    .line 80
    invoke-virtual {p1, v2}, LT5/u;->o(Ljava/lang/String;)LT5/u;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/4 v1, 0x5

    .line 95
    invoke-virtual {v0, p1, v1, p2}, Ld6/j;->k(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    return-void
.end method

.method public d(LT5/u;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "url"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LT5/w;->c:Ljava/net/CookieHandler;

    invoke-virtual {p1}, LT5/u;->q()Ljava/net/URI;

    move-result-object v1

    invoke-static {}, Lj5/F;->g()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/CookieHandler;->get(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "cookieHeaders"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const-string v4, "Cookie"

    const/4 v5, 0x1

    invoke-static {v4, v3, v5}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "Cookie2"

    invoke-static {v4, v3, v5}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    const-string v3, "value"

    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    const-string v4, "header"

    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v3}, LT5/w;->e(LT5/u;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "Collections.unmodifiableList(cookies)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object p1

    :goto_1
    return-object p1

    :catch_0
    move-exception v0

    sget-object v1, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v1}, Ld6/j$a;->g()Ld6/j;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Loading cookies failed for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/..."

    invoke-virtual {p1, v3}, LT5/u;->o(Ljava/lang/String;)LT5/u;

    move-result-object p1

    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x5

    invoke-virtual {v1, p1, v2, v0}, Ld6/j;->k(Ljava/lang/String;ILjava/lang/Throwable;)V

    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

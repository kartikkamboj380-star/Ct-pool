.class public abstract LI0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LI0/d;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    instance-of v0, p0, LI0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LI0/f;

    .line 6
    .line 7
    invoke-virtual {p0}, LI0/f;->d()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, LI0/d;

    .line 17
    .line 18
    invoke-static {p0}, LI0/e;->c(LI0/d;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p0}, LI0/e;->c(LI0/d;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p0

    .line 30
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static b(LI0/d;)Ljava/util/List;
    .locals 3

    .line 1
    :try_start_0
    instance-of v0, p0, LI0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LI0/f;

    .line 6
    .line 7
    invoke-virtual {p0}, LI0/f;->d()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge v1, v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, LI0/d;

    .line 32
    .line 33
    invoke-static {v2}, LI0/e;->c(LI0/d;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, LI0/d;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-interface {p0}, LI0/d;->c()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-static {p0}, LI0/e;->c(LI0/d;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_1
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    :cond_2
    return-object v0

    .line 70
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method private static c(LI0/d;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p0}, LI0/d;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "UTF-8"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, LW0/c;->a([B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

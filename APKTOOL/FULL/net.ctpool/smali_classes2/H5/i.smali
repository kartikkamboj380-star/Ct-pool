.class abstract synthetic LH5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH5/I;Lm5/g;LH5/K;Lv5/p;)LH5/P;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LH5/E;->d(LH5/I;Lm5/g;)Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LH5/K;->j()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LH5/z0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LH5/z0;-><init>(Lm5/g;Lv5/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LH5/Q;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LH5/Q;-><init>(Lm5/g;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LH5/a;->L0(LH5/K;Ljava/lang/Object;Lv5/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lm5/h;->m:Lm5/h;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LH5/K;->m:LH5/K;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LH5/g;->a(LH5/I;Lm5/g;LH5/K;Lv5/p;)LH5/P;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final c(LH5/I;Lm5/g;LH5/K;Lv5/p;)LH5/q0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LH5/E;->d(LH5/I;Lm5/g;)Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LH5/K;->j()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LH5/A0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LH5/A0;-><init>(Lm5/g;Lv5/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LH5/H0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LH5/H0;-><init>(Lm5/g;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LH5/a;->L0(LH5/K;Ljava/lang/Object;Lv5/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic d(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/q0;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lm5/h;->m:Lm5/h;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LH5/K;->m:LH5/K;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LH5/g;->c(LH5/I;Lm5/g;LH5/K;Lv5/p;)LH5/q0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(Lm5/g;Lv5/p;Lm5/d;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p2}, Lm5/d;->a()Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, LH5/E;->e(Lm5/g;Lm5/g;)Lm5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, LH5/u0;->e(Lm5/g;)V

    .line 10
    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, LM5/B;

    .line 15
    .line 16
    invoke-direct {v0, p0, p2}, LM5/B;-><init>(Lm5/g;Lm5/d;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v0, p1}, LN5/b;->b(LM5/B;Ljava/lang/Object;Lv5/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, Lm5/e;->l:Lm5/e$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, LH5/N0;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, LH5/N0;-><init>(Lm5/g;Lm5/d;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, LH5/a;->a()Lm5/g;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p0, v1}, LM5/J;->c(Lm5/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :try_start_0
    invoke-static {v0, v0, p1}, LN5/b;->b(LM5/B;Ljava/lang/Object;Lv5/p;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0, v1}, LM5/J;->a(Lm5/g;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-static {p0, v1}, LM5/J;->a(Lm5/g;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_1
    new-instance v0, LH5/T;

    .line 69
    .line 70
    invoke-direct {v0, p0, p2}, LH5/T;-><init>(Lm5/g;Lm5/d;)V

    .line 71
    .line 72
    .line 73
    const/4 v6, 0x4

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    move-object v2, p1

    .line 77
    move-object v3, v0

    .line 78
    move-object v4, v0

    .line 79
    invoke-static/range {v2 .. v7}, LN5/a;->d(Lv5/p;Ljava/lang/Object;Lm5/d;Lv5/l;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, LH5/T;->N0()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p0, p1, :cond_2

    .line 91
    .line 92
    invoke-static {p2}, Lo5/h;->c(Lm5/d;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    return-object p0
.end method

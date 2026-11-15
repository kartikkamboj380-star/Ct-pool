.class public interface abstract Lb4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public b(Ljava/lang/Class;)LD4/b;
    .locals 0

    .line 1
    invoke-static {p1}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lb4/d;->f(Lb4/E;)LD4/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public abstract c(Lb4/E;)LD4/b;
.end method

.method public d(Lb4/E;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lb4/d;->c(Lb4/E;)LD4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LD4/b;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/util/Set;

    .line 10
    .line 11
    return-object p1
.end method

.method public e(Lb4/E;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lb4/d;->f(Lb4/E;)LD4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, LD4/b;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public abstract f(Lb4/E;)LD4/b;
.end method

.method public g(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p1}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lb4/d;->d(Lb4/E;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public abstract h(Lb4/E;)LD4/a;
.end method

.method public i(Ljava/lang/Class;)LD4/a;
    .locals 0

    .line 1
    invoke-static {p1}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lb4/d;->h(Lb4/E;)LD4/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

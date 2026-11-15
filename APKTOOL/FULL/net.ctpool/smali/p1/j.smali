.class public abstract Lp1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;LO0/e;)Landroid/net/Uri;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p3, p0}, LO0/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/net/Uri;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    array-length p0, p2

    .line 15
    if-lez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    aget-object p0, p2, p0

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-interface {p3, p0}, LO0/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Landroid/net/Uri;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-interface {p3, p1}, LO0/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroid/net/Uri;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

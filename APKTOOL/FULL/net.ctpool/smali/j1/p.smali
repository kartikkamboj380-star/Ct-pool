.class public abstract Lj1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/p$b;,
        Lj1/p$l;,
        Lj1/p$j;,
        Lj1/p$m;,
        Lj1/p$d;,
        Lj1/p$e;,
        Lj1/p$c;,
        Lj1/p$h;,
        Lj1/p$g;,
        Lj1/p$f;,
        Lj1/p$i;,
        Lj1/p$k;,
        Lj1/p$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/graphics/drawable/Drawable;)Lj1/o;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Lj1/o;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Lj1/o;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Lj1/c;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Lj1/c;

    .line 17
    .line 18
    invoke-interface {p0}, Lj1/c;->s()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lj1/p;->a(Landroid/graphics/drawable/Drawable;)Lj1/o;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    instance-of v1, p0, Lj1/a;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    check-cast p0, Lj1/a;

    .line 32
    .line 33
    invoke-virtual {p0}, Lj1/a;->d()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lj1/a;->b(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lj1/p;->a(Landroid/graphics/drawable/Drawable;)Lj1/o;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v0
.end method

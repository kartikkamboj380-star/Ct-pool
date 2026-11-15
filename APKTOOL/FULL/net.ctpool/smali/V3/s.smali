.class public LV3/s;
.super LV3/q;
.source "SourceFile"

# interfaces
.implements LV3/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV3/s$a;
    }
.end annotation


# instance fields
.field private final transient o:LV3/r;


# direct methods
.method constructor <init>(LV3/p;ILjava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LV3/q;-><init>(LV3/p;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, LV3/s;->c(Ljava/util/Comparator;)LV3/r;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LV3/s;->o:LV3/r;

    .line 9
    .line 10
    return-void
.end method

.method private static c(Ljava/util/Comparator;)LV3/r;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LV3/r;->s()LV3/r;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, LV3/t;->E(Ljava/util/Comparator;)LV3/L;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    return-object p0
.end method

.method static d(Ljava/util/Collection;Ljava/util/Comparator;)LV3/s;
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, LV3/s;->e()LV3/s;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, LV3/p$a;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, LV3/p$a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 v1, 0x0

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/util/Collection;

    .line 47
    .line 48
    invoke-static {p1, v2}, LV3/s;->f(Ljava/util/Comparator;Ljava/util/Collection;)LV3/r;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v3, v2}, LV3/p$a;->e(Ljava/lang/Object;Ljava/lang/Object;)LV3/p$a;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/2addr v1, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance p0, LV3/s;

    .line 68
    .line 69
    invoke-virtual {v0}, LV3/p$a;->b()LV3/p;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p0, v0, v1, p1}, LV3/s;-><init>(LV3/p;ILjava/util/Comparator;)V

    .line 74
    .line 75
    .line 76
    return-object p0
.end method

.method public static e()LV3/s;
    .locals 1

    .line 1
    sget-object v0, LV3/l;->p:LV3/l;

    .line 2
    .line 3
    return-object v0
.end method

.method private static f(Ljava/util/Comparator;Ljava/util/Collection;)LV3/r;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LV3/r;->p(Ljava/util/Collection;)LV3/r;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0, p1}, LV3/t;->A(Ljava/util/Comparator;Ljava/util/Collection;)LV3/t;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    return-object p0
.end method

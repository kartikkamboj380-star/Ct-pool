.class public final Lk5/h;
.super Lj5/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lx5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk5/h$a;
    }
.end annotation


# static fields
.field private static final n:Lk5/h$a;

.field private static final o:Lk5/h;


# instance fields
.field private final m:Lk5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk5/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk5/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk5/h;->n:Lk5/h$a;

    .line 8
    .line 9
    new-instance v0, Lk5/h;

    .line 10
    .line 11
    sget-object v1, Lk5/d;->z:Lk5/d$a;

    .line 12
    .line 13
    invoke-virtual {v1}, Lk5/d$a;->e()Lk5/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Lk5/h;-><init>(Lk5/d;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lk5/h;->o:Lk5/h;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lk5/d;

    invoke-direct {v0}, Lk5/d;-><init>()V

    invoke-direct {p0, v0}, Lk5/h;-><init>(Lk5/d;)V

    return-void
.end method

.method public constructor <init>(Lk5/d;)V
    .locals 1

    .line 2
    const-string v0, "backing"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj5/e;-><init>()V

    iput-object p1, p0, Lk5/h;->m:Lk5/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk5/d;->j(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/d;->m()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/d;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk5/d;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/d;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/d;->l()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/e;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lk5/h;->o:Lk5/h;

    .line 15
    .line 16
    :goto_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/d;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/d;->D()Lk5/d$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk5/d;->L(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/d;->m()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/h;->m:Lk5/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/d;->m()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

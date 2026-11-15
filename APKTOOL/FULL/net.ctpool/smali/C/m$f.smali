.class final LC/m$f;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m;-><init>(Lv5/a;LC/k;Ljava/util/List;LC/b;LH5/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LC/m;


# direct methods
.method constructor <init>(LC/m;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/m$f;->s:LC/m;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lo5/k;-><init>(ILm5/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lm5/d;)Lm5/d;
    .locals 2

    .line 1
    new-instance v0, LC/m$f;

    .line 2
    .line 3
    iget-object v1, p0, LC/m$f;->s:LC/m;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LC/m$f;-><init>(LC/m;Lm5/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LC/m$f;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/m$b;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LC/m$f;->v(LC/m$b;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LC/m$f;->q:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LC/m$f;->r:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LC/m$b;

    .line 34
    .line 35
    instance-of v1, p1, LC/m$b$a;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-object v1, p0, LC/m$f;->s:LC/m;

    .line 40
    .line 41
    check-cast p1, LC/m$b$a;

    .line 42
    .line 43
    iput v3, p0, LC/m$f;->q:I

    .line 44
    .line 45
    invoke-static {v1, p1, p0}, LC/m;->h(LC/m;LC/m$b$a;Lm5/d;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_4

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    instance-of v1, p1, LC/m$b$b;

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    iget-object v1, p0, LC/m$f;->s:LC/m;

    .line 57
    .line 58
    check-cast p1, LC/m$b$b;

    .line 59
    .line 60
    iput v2, p0, LC/m$f;->q:I

    .line 61
    .line 62
    invoke-static {v1, p1, p0}, LC/m;->i(LC/m;LC/m$b$b;Lm5/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_4
    :goto_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 70
    .line 71
    return-object p1
.end method

.method public final v(LC/m$b;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LC/m$f;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LC/m$f;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LC/m$f;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

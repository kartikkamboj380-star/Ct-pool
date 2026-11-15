.class final LC/m$g;
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

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LC/m;


# direct methods
.method constructor <init>(LC/m;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/m$g;->s:LC/m;

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
    new-instance v0, LC/m$g;

    .line 2
    .line 3
    iget-object v1, p0, LC/m$g;->s:LC/m;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LC/m$g;-><init>(LC/m;Lm5/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LC/m$g;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK5/c;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LC/m$g;->v(LK5/c;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LC/m$g;->q:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 13
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
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LC/m$g;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LK5/c;

    .line 30
    .line 31
    iget-object v1, p0, LC/m$g;->s:LC/m;

    .line 32
    .line 33
    invoke-static {v1}, LC/m;->e(LC/m;)LK5/k;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, LK5/k;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LC/n;

    .line 42
    .line 43
    instance-of v3, v1, LC/c;

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    iget-object v3, p0, LC/m$g;->s:LC/m;

    .line 48
    .line 49
    invoke-static {v3}, LC/m;->d(LC/m;)LC/l;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, LC/m$b$a;

    .line 54
    .line 55
    invoke-direct {v4, v1}, LC/m$b$a;-><init>(LC/n;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, LC/l;->e(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    iget-object v3, p0, LC/m$g;->s:LC/m;

    .line 62
    .line 63
    invoke-static {v3}, LC/m;->e(LC/m;)LK5/k;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v4, LC/m$g$a;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, v1, v5}, LC/m$g$a;-><init>(LC/n;Lm5/d;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v4}, LK5/d;->c(LK5/b;Lv5/p;)LK5/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v3, LC/m$g$b;

    .line 78
    .line 79
    invoke-direct {v3, v1}, LC/m$g$b;-><init>(LK5/b;)V

    .line 80
    .line 81
    .line 82
    iput v2, p0, LC/m$g;->q:I

    .line 83
    .line 84
    invoke-static {p1, v3, p0}, LK5/d;->d(LK5/c;LK5/b;Lm5/d;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_3

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_3
    :goto_0
    sget-object p1, Li5/u;->a:Li5/u;

    .line 92
    .line 93
    return-object p1
.end method

.method public final v(LK5/c;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LC/m$g;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LC/m$g;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LC/m$g;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

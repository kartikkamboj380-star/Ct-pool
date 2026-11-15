.class final LP4/c$e;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP4/c;->d(Lm5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm5/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, Lo5/k;-><init>(ILm5/d;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lm5/d;)Lm5/d;
    .locals 1

    .line 1
    new-instance v0, LP4/c$e;

    .line 2
    .line 3
    invoke-direct {v0, p2}, LP4/c$e;-><init>(Lm5/d;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, LP4/c$e;->r:Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP4/c$e;->v(Ljava/lang/String;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LP4/c$e;->q:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LP4/c$e;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "Error failing to fetch the remote configs: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "SessionConfigFetcher"

    .line 33
    .line 34
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    sget-object p1, Li5/u;->a:Li5/u;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
.end method

.method public final v(Ljava/lang/String;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP4/c$e;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP4/c$e;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LP4/c$e;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

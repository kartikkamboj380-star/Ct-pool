.class final LC/e$a$c$a;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/e$a$c;->s(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I


# direct methods
.method constructor <init>(LC/d;Lm5/d;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Lo5/k;-><init>(ILm5/d;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm5/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LC/e$a$c$a;->w(Lm5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LC/e$a$c$a;->q:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Li5/u;->a:Li5/u;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput v1, p0, LC/e$a$c$a;->q:I

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public final v(Lm5/d;)Lm5/d;
    .locals 2

    .line 1
    new-instance v0, LC/e$a$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, LC/e$a$c$a;-><init>(LC/d;Lm5/d;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final w(Lm5/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LC/e$a$c$a;->v(Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LC/e$a$c$a;

    .line 6
    .line 7
    sget-object v0, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LC/e$a$c$a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

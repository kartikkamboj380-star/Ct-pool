.class final LN4/x$g;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/x;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LN4/x;

.field final synthetic s:Ljava/lang/String;


# direct methods
.method constructor <init>(LN4/x;Ljava/lang/String;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/x$g;->r:LN4/x;

    .line 2
    .line 3
    iput-object p2, p0, LN4/x$g;->s:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lo5/k;-><init>(ILm5/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lm5/d;)Lm5/d;
    .locals 2

    .line 1
    new-instance p1, LN4/x$g;

    .line 2
    .line 3
    iget-object v0, p0, LN4/x$g;->r:LN4/x;

    .line 4
    .line 5
    iget-object v1, p0, LN4/x$g;->s:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LN4/x$g;-><init>(LN4/x;Ljava/lang/String;Lm5/d;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LH5/I;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LN4/x$g;->v(LH5/I;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN4/x$g;->q:I

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
    :try_start_0
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_1
    invoke-static {}, LN4/x;->c()LN4/x$c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, LN4/x$g;->r:LN4/x;

    .line 34
    .line 35
    invoke-static {v1}, LN4/x;->d(LN4/x;)Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {p1, v1}, LN4/x$c;->a(LN4/x$c;Landroid/content/Context;)LC/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v1, LN4/x$g$a;

    .line 44
    .line 45
    iget-object v3, p0, LN4/x$g;->s:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v1, v3, v4}, LN4/x$g$a;-><init>(Ljava/lang/String;Lm5/d;)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, LN4/x$g;->q:I

    .line 52
    .line 53
    invoke-static {p1, v1, p0}, LF/g;->a(LC/f;Lv5/p;Lm5/d;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    if-ne p1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "Failed to update session Id: "

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "FirebaseSessionsRepo"

    .line 78
    .line 79
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 83
    .line 84
    return-object p1
.end method

.method public final v(LH5/I;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN4/x$g;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LN4/x$g;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LN4/x$g;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.class public final LC/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LH5/I;

.field private final b:Lv5/p;

.field private final c:LJ5/d;

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(LH5/I;Lv5/l;Lv5/p;Lv5/p;)V
    .locals 2

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onComplete"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onUndeliveredElement"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "consumeMessage"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LC/l;->a:LH5/I;

    .line 25
    .line 26
    iput-object p4, p0, LC/l;->b:Lv5/p;

    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    const/4 v0, 0x6

    .line 30
    const v1, 0x7fffffff

    .line 31
    .line 32
    .line 33
    invoke-static {v1, p4, p4, v0, p4}, LJ5/e;->b(ILJ5/a;Lv5/l;ILjava/lang/Object;)LJ5/d;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    iput-object p4, p0, LC/l;->c:LJ5/d;

    .line 38
    .line 39
    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p4, p0, LC/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    invoke-interface {p1}, LH5/I;->i()Lm5/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object p4, LH5/q0;->b:LH5/q0$b;

    .line 52
    .line 53
    invoke-interface {p1, p4}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, LH5/q0;

    .line 58
    .line 59
    if-nez p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance p4, LC/l$a;

    .line 63
    .line 64
    invoke-direct {p4, p2, p0, p3}, LC/l$a;-><init>(Lv5/l;LC/l;Lv5/p;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p4}, LH5/q0;->D0(Lv5/l;)LH5/X;

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void
.end method

.method public static final synthetic a(LC/l;)Lv5/p;
    .locals 0

    .line 1
    iget-object p0, p0, LC/l;->b:Lv5/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LC/l;)LJ5/d;
    .locals 0

    .line 1
    iget-object p0, p0, LC/l;->c:LJ5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LC/l;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, LC/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LC/l;)LH5/I;
    .locals 0

    .line 1
    iget-object p0, p0, LC/l;->a:LH5/I;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LC/l;->c:LJ5/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LJ5/m;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, LJ5/f$a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, LJ5/f;->c(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, LJ5/j;

    .line 18
    .line 19
    const-string v0, "Channel was closed normally"

    .line 20
    .line 21
    invoke-direct {p1, v0}, LJ5/j;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LJ5/f;->f(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, LC/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, LC/l;->a:LH5/I;

    .line 40
    .line 41
    new-instance v3, LC/l$b;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-direct {v3, p0, p1}, LC/l$b;-><init>(LC/l;Lm5/d;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-static/range {v0 .. v5}, LH5/g;->d(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/q0;

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void

    .line 55
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "Check failed."

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method

.class public final LN4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/sessions/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/x$c;,
        LN4/x$d;
    }
.end annotation


# static fields
.field private static final f:LN4/x$c;

.field private static final g:Lz5/a;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lm5/g;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;

.field private final e:LK5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LN4/x$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN4/x$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN4/x;->f:LN4/x$c;

    .line 8
    .line 9
    sget-object v0, LN4/w;->a:LN4/w;

    .line 10
    .line 11
    invoke-virtual {v0}, LN4/w;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, LD/b;

    .line 16
    .line 17
    sget-object v0, LN4/x$b;->m:LN4/x$b;

    .line 18
    .line 19
    invoke-direct {v2, v0}, LD/b;-><init>(Lv5/l;)V

    .line 20
    .line 21
    .line 22
    const/16 v5, 0xc

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, LE/a;->b(Ljava/lang/String;LD/b;Lv5/l;LH5/I;ILjava/lang/Object;)Lz5/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LN4/x;->g:Lz5/a;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm5/g;)V
    .locals 8

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundDispatcher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LN4/x;->b:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, LN4/x;->c:Lm5/g;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LN4/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    sget-object v0, LN4/x;->f:LN4/x$c;

    .line 26
    .line 27
    invoke-static {v0, p1}, LN4/x$c;->a(LN4/x$c;Landroid/content/Context;)LC/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, LC/f;->getData()LK5/b;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, LN4/x$e;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, v1}, LN4/x$e;-><init>(Lm5/d;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0}, LK5/d;->a(LK5/b;Lv5/q;)LK5/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, LN4/x$f;

    .line 46
    .line 47
    invoke-direct {v0, p1, p0}, LN4/x$f;-><init>(LK5/b;LN4/x;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, LN4/x;->e:LK5/b;

    .line 51
    .line 52
    invoke-static {p2}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v5, LN4/x$a;

    .line 57
    .line 58
    invoke-direct {v5, p0, v1}, LN4/x$a;-><init>(LN4/x;Lm5/d;)V

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x3

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static/range {v2 .. v7}, LH5/g;->d(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/q0;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static final synthetic c()LN4/x$c;
    .locals 1

    .line 1
    sget-object v0, LN4/x;->f:LN4/x$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(LN4/x;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LN4/x;->b:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LN4/x;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, LN4/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f()Lz5/a;
    .locals 1

    .line 1
    sget-object v0, LN4/x;->g:Lz5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g(LN4/x;)LK5/b;
    .locals 0

    .line 1
    iget-object p0, p0, LN4/x;->e:LK5/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(LN4/x;LF/d;)LN4/l;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN4/x;->i(LF/d;)LN4/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i(LF/d;)LN4/l;
    .locals 2

    .line 1
    new-instance v0, LN4/l;

    .line 2
    .line 3
    sget-object v1, LN4/x$d;->a:LN4/x$d;

    .line 4
    .line 5
    invoke-virtual {v1}, LN4/x$d;->a()LF/d$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1, v1}, LF/d;->b(LF/d$a;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LN4/l;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN4/l;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LN4/l;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "sessionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/x;->c:Lm5/g;

    .line 7
    .line 8
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v4, LN4/x$g;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {v4, p0, p1, v0}, LN4/x$g;-><init>(LN4/x;Ljava/lang/String;Lm5/d;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x3

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, LH5/g;->d(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/q0;

    .line 23
    .line 24
    .line 25
    return-void
.end method

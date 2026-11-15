.class public Ly1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/h;


# instance fields
.field private a:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/c;->a:Ly1/d;

    .line 5
    .line 6
    return-void
.end method

.method public static b(LJ0/g;LJ0/i;)LJ0/j;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, Ly1/c;->c(LJ0/g;LJ0/i;Ljava/util/concurrent/Executor;)LJ0/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(LJ0/g;LJ0/i;Ljava/util/concurrent/Executor;)LJ0/j;
    .locals 10

    .line 1
    new-instance v7, LJ0/j$c;

    .line 2
    .line 3
    invoke-virtual {p0}, LJ0/g;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p0}, LJ0/g;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-virtual {p0}, LJ0/g;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    move-object v0, v7

    .line 16
    invoke-direct/range {v0 .. v6}, LJ0/j$c;-><init>(JJJ)V

    .line 17
    .line 18
    .line 19
    new-instance v9, LJ0/j;

    .line 20
    .line 21
    invoke-virtual {p0}, LJ0/g;->h()LJ0/m;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0}, LJ0/g;->e()LI0/c;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0}, LJ0/g;->d()LI0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {p0}, LJ0/g;->g()LL0/b;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {p0}, LJ0/g;->i()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    move-object v0, v9

    .line 42
    move-object v1, p1

    .line 43
    move-object v3, v7

    .line 44
    move-object v7, p2

    .line 45
    invoke-direct/range {v0 .. v8}, LJ0/j;-><init>(LJ0/i;LJ0/m;LJ0/j$c;LI0/c;LI0/a;LL0/b;Ljava/util/concurrent/Executor;Z)V

    .line 46
    .line 47
    .line 48
    return-object v9
.end method


# virtual methods
.method public a(LJ0/g;)LJ0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/c;->a:Ly1/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly1/d;->a(LJ0/g;)LJ0/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Ly1/c;->b(LJ0/g;LJ0/i;)LJ0/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

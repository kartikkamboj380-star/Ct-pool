.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb4/d;)LE4/e;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lb4/d;)LE4/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb4/d;)LE4/e;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/firebase/installations/c;

    .line 2
    .line 3
    const-class v1, LY3/f;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LY3/f;

    .line 10
    .line 11
    const-class v2, LB4/i;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Lb4/d;->b(Ljava/lang/Class;)LD4/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, La4/a;

    .line 18
    .line 19
    const-class v4, Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    invoke-static {v3, v4}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {p0, v3}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    const-class v4, La4/b;

    .line 32
    .line 33
    const-class v5, Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    invoke-static {v4, v5}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {p0, v4}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-static {p0}, Lc4/j;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/c;-><init>(LY3/f;LD4/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb4/c;",
            ">;"
        }
    .end annotation

    const-class v0, LE4/e;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v1, "fire-installations"

    invoke-virtual {v0, v1}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    const-class v2, LY3/f;

    invoke-static {v2}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, LB4/i;

    invoke-static {v2}, Lb4/q;->j(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, La4/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v2

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, La4/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v2

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v2, LE4/f;

    invoke-direct {v2}, LE4/f;-><init>()V

    invoke-virtual {v0, v2}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    invoke-static {}, LB4/h;->a()Lb4/c;

    move-result-object v2

    const-string v3, "18.0.0"

    invoke-static {v1, v3}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v1

    filled-new-array {v0, v2, v1}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

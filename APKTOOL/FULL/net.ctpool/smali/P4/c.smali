.class public final LP4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP4/c$a;
    }
.end annotation


# static fields
.field private static final g:LP4/c$a;


# instance fields
.field private final a:Lm5/g;

.field private final b:LE4/e;

.field private final c:LN4/b;

.field private final d:LP4/a;

.field private final e:Lkotlin/Lazy;

.field private final f:LQ5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP4/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LP4/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP4/c;->g:LP4/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lm5/g;LE4/e;LN4/b;LP4/a;LC/f;)V
    .locals 1

    .line 1
    const-string v0, "backgroundDispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "firebaseInstallationsApi"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appInfo"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "configsFetcher"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "dataStore"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LP4/c;->a:Lm5/g;

    .line 30
    .line 31
    iput-object p2, p0, LP4/c;->b:LE4/e;

    .line 32
    .line 33
    iput-object p3, p0, LP4/c;->c:LN4/b;

    .line 34
    .line 35
    iput-object p4, p0, LP4/c;->d:LP4/a;

    .line 36
    .line 37
    new-instance p1, LP4/c$b;

    .line 38
    .line 39
    invoke-direct {p1, p5}, LP4/c$b;-><init>(LC/f;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, LP4/c;->e:Lkotlin/Lazy;

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    const/4 p2, 0x0

    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-static {p3, p1, p2}, LQ5/c;->b(ZILjava/lang/Object;)LQ5/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, LP4/c;->f:LQ5/a;

    .line 56
    .line 57
    return-void
.end method

.method public static final synthetic e(LP4/c;)LP4/g;
    .locals 0

    .line 1
    invoke-direct {p0}, LP4/c;->f()LP4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f()LP4/g;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/c;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LP4/g;

    .line 8
    .line 9
    return-object v0
.end method

.method private final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, LF5/f;

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LF5/f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, LF5/f;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-direct {p0}, LP4/c;->f()LP4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP4/g;->g()Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public b()LG5/a;
    .locals 2

    .line 1
    invoke-direct {p0}, LP4/c;->f()LP4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP4/g;->e()Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, LG5/a;->n:LG5/a$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, LG5/d;->q:LG5/d;

    .line 18
    .line 19
    invoke-static {v0, v1}, LG5/c;->h(ILG5/d;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, LG5/a;->h(J)LG5/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    return-object v0
.end method

.method public c()Ljava/lang/Double;
    .locals 1

    .line 1
    invoke-direct {p0}, LP4/c;->f()LP4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP4/g;->f()Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public d(Lm5/d;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, LP4/c$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LP4/c$c;

    iget v1, v0, LP4/c$c;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LP4/c$c;->t:I

    goto :goto_0

    :cond_0
    new-instance v0, LP4/c$c;

    invoke-direct {v0, p0, p1}, LP4/c$c;-><init>(LP4/c;Lm5/d;)V

    :goto_0
    iget-object p1, v0, LP4/c$c;->r:Ljava/lang/Object;

    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LP4/c$c;->t:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const-string v5, "SessionConfigFetcher"

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LP4/c$c;->p:Ljava/lang/Object;

    check-cast v0, LQ5/a;

    :try_start_0
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LP4/c$c;->q:Ljava/lang/Object;

    check-cast v2, LQ5/a;

    iget-object v4, v0, LP4/c$c;->p:Ljava/lang/Object;

    check-cast v4, LP4/c;

    :try_start_1
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, LP4/c$c;->q:Ljava/lang/Object;

    check-cast v2, LQ5/a;

    iget-object v4, v0, LP4/c$c;->p:Ljava/lang/Object;

    check-cast v4, LP4/c;

    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LP4/c;->f:LQ5/a;

    invoke-interface {p1}, LQ5/a;->b()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, LP4/c;->f()LP4/g;

    move-result-object p1

    invoke-virtual {p1}, LP4/g;->d()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1

    :cond_5
    iget-object p1, p0, LP4/c;->f:LQ5/a;

    iput-object p0, v0, LP4/c$c;->p:Ljava/lang/Object;

    iput-object p1, v0, LP4/c$c;->q:Ljava/lang/Object;

    iput v4, v0, LP4/c$c;->t:I

    invoke-interface {p1, v7, v0}, LQ5/a;->a(Ljava/lang/Object;Lm5/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v4, p0

    :goto_1
    :try_start_2
    invoke-direct {v4}, LP4/c;->f()LP4/g;

    move-result-object v2

    invoke-virtual {v2}, LP4/g;->d()Z

    move-result v2

    if-nez v2, :cond_7

    const-string v0, "Remote settings cache not expired. Using cached values."

    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-interface {p1, v7}, LQ5/a;->c(Ljava/lang/Object;)V

    return-object v0

    :catchall_2
    move-exception v0

    move-object v12, v0

    move-object v0, p1

    move-object p1, v12

    goto/16 :goto_4

    :cond_7
    :try_start_3
    sget-object v2, LN4/s;->c:LN4/s$a;

    iget-object v8, v4, LP4/c;->b:LE4/e;

    iput-object v4, v0, LP4/c$c;->p:Ljava/lang/Object;

    iput-object p1, v0, LP4/c$c;->q:Ljava/lang/Object;

    iput v6, v0, LP4/c$c;->t:I

    invoke-virtual {v2, v8, v0}, LN4/s$a;->a(LE4/e;Lm5/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v12, v2

    move-object v2, p1

    move-object p1, v12

    :goto_2
    :try_start_4
    check-cast p1, LN4/s;

    invoke-virtual {p1}, LN4/s;->b()Ljava/lang/String;

    move-result-object p1

    const-string v8, ""

    invoke-static {p1, v8}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const-string p1, "Error getting Firebase Installation ID. Skipping this Session Event."

    invoke-static {v5, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v2, v7}, LQ5/a;->c(Ljava/lang/Object;)V

    return-object p1

    :cond_9
    :try_start_5
    const-string v8, "X-Crashlytics-Installation-ID"

    invoke-static {v8, p1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object p1

    const-string v8, "X-Crashlytics-Device-Model"

    sget-object v9, Lw5/y;->a:Lw5/y;

    const-string v9, "%s/%s"

    sget-object v10, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    filled-new-array {v10, v11}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "format(format, *args)"

    invoke-static {v6, v9}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v6}, LP4/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v6}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v6

    const-string v8, "X-Crashlytics-OS-Build-Version"

    sget-object v9, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    const-string v10, "INCREMENTAL"

    invoke-static {v9, v10}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v9}, LP4/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v8

    const-string v9, "X-Crashlytics-OS-Display-Version"

    sget-object v10, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v11, "RELEASE"

    invoke-static {v10, v11}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v10}, LP4/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v9

    const-string v10, "X-Crashlytics-API-Client-Version"

    iget-object v11, v4, LP4/c;->c:LN4/b;

    invoke-virtual {v11}, LN4/b;->f()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v10

    filled-new-array {p1, v6, v8, v9, v10}, [Li5/l;

    move-result-object p1

    invoke-static {p1}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    move-result-object p1

    const-string v6, "Fetching settings from server."

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, v4, LP4/c;->d:LP4/a;

    new-instance v6, LP4/c$d;

    invoke-direct {v6, v4, v7}, LP4/c$d;-><init>(LP4/c;Lm5/d;)V

    new-instance v4, LP4/c$e;

    invoke-direct {v4, v7}, LP4/c$e;-><init>(Lm5/d;)V

    iput-object v2, v0, LP4/c$c;->p:Ljava/lang/Object;

    iput-object v7, v0, LP4/c$c;->q:Ljava/lang/Object;

    iput v3, v0, LP4/c$c;->t:I

    invoke-interface {v5, p1, v6, v4, v0}, LP4/a;->a(Ljava/util/Map;Lv5/p;Lv5/p;Lm5/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    move-object v0, v2

    :goto_3
    :try_start_6
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-interface {v0, v7}, LQ5/a;->c(Ljava/lang/Object;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1

    :goto_4
    invoke-interface {v0, v7}, LQ5/a;->c(Ljava/lang/Object;)V

    throw p1
.end method

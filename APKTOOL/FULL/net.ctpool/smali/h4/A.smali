.class public Lh4/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LY3/f;

.field private final c:Lh4/G;

.field private final d:Lh4/Q;

.field private final e:J

.field private f:Lh4/B;

.field private g:Lh4/B;

.field private h:Z

.field private i:Lh4/q;

.field private final j:Lh4/L;

.field private final k:Ln4/g;

.field public final l:Lg4/b;

.field private final m:Lf4/a;

.field private final n:Lh4/n;

.field private final o:Le4/a;

.field private final p:Le4/l;

.field private final q:Li4/f;


# direct methods
.method public constructor <init>(LY3/f;Lh4/L;Le4/a;Lh4/G;Lg4/b;Lf4/a;Ln4/g;Lh4/n;Le4/l;Li4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh4/A;->b:LY3/f;

    .line 5
    .line 6
    iput-object p4, p0, Lh4/A;->c:Lh4/G;

    .line 7
    .line 8
    invoke-virtual {p1}, LY3/f;->m()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lh4/A;->a:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, p0, Lh4/A;->j:Lh4/L;

    .line 15
    .line 16
    iput-object p3, p0, Lh4/A;->o:Le4/a;

    .line 17
    .line 18
    iput-object p5, p0, Lh4/A;->l:Lg4/b;

    .line 19
    .line 20
    iput-object p6, p0, Lh4/A;->m:Lf4/a;

    .line 21
    .line 22
    iput-object p7, p0, Lh4/A;->k:Ln4/g;

    .line 23
    .line 24
    iput-object p8, p0, Lh4/A;->n:Lh4/n;

    .line 25
    .line 26
    iput-object p9, p0, Lh4/A;->p:Le4/l;

    .line 27
    .line 28
    iput-object p10, p0, Lh4/A;->q:Li4/f;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    iput-wide p1, p0, Lh4/A;->e:J

    .line 35
    .line 36
    new-instance p1, Lh4/Q;

    .line 37
    .line 38
    invoke-direct {p1}, Lh4/Q;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lh4/A;->d:Lh4/Q;

    .line 42
    .line 43
    return-void
.end method

.method private synthetic A(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh4/q;->Y(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lh4/A;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh4/A;->x(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lh4/A;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0}, Lh4/A;->t()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh4/A;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->A(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lh4/A;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lh4/A;->w(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lh4/A;Lp4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->v(Lp4/j;)V

    return-void
.end method

.method public static synthetic f(Lh4/A;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh4/A;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lh4/A;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->y(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic h(Lh4/A;Lp4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->u(Lp4/j;)V

    return-void
.end method

.method private i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Li4/e;->c()Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lh4/v;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lh4/v;-><init>(Lh4/A;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    const-wide/16 v2, 0x3

    .line 21
    .line 22
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :goto_0
    iput-boolean v0, p0, Lh4/A;->h:Z

    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    const/4 v0, 0x0

    .line 38
    goto :goto_0
.end method

.method private n(Lp4/j;)V
    .locals 3

    .line 1
    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    .line 2
    .line 3
    invoke-static {}, Li4/f;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh4/A;->E()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lh4/A;->l:Lg4/b;

    .line 10
    .line 11
    new-instance v2, Lh4/y;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lh4/y;-><init>(Lh4/A;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v2}, Lg4/b;->a(Lg4/a;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lh4/A;->i:Lh4/q;

    .line 20
    .line 21
    invoke-virtual {v1}, Lh4/q;->U()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lp4/j;->b()Lp4/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Lp4/d;->b:Lp4/d$a;

    .line 29
    .line 30
    iget-boolean v1, v1, Lp4/d$a;->a:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lh4/q;->A(Lp4/j;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "Previous sessions could not be finalized."

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Le4/g;->k(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_0
    :goto_0
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 57
    .line 58
    invoke-interface {p1}, Lp4/j;->a()Lz3/l;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, Lh4/q;->Z(Lz3/l;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {p0}, Lh4/A;->D()V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_1
    :try_start_1
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v0}, Le4/g;->b(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Ljava/lang/RuntimeException;

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :goto_2
    :try_start_2
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    .line 87
    .line 88
    invoke-virtual {v0, v1, p1}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :goto_3
    return-void

    .line 93
    :goto_4
    invoke-virtual {p0}, Lh4/A;->D()V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method private p(Lp4/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Li4/e;->c()Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lh4/x;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lh4/x;-><init>(Lh4/A;Lp4/j;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Le4/g;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    const-wide/16 v1, 0x3

    .line 30
    .line 31
    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_4

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :catch_2
    move-exception p1

    .line 40
    goto :goto_3

    .line 41
    :goto_0
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "Crashlytics timed out during initialization."

    .line 46
    .line 47
    :goto_1
    invoke-virtual {v0, v1, p1}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :goto_2
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "Crashlytics encountered a problem during initialization."

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :goto_3
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "Crashlytics was interrupted during initialization."

    .line 63
    .line 64
    invoke-virtual {v0, v1, p1}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 72
    .line 73
    .line 74
    :goto_4
    return-void
.end method

.method public static q()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "19.2.1"

    .line 2
    .line 3
    return-object v0
.end method

.method static r(Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "Configured not to require a build ID."

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Le4/g;->i(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    const-string p0, "FirebaseCrashlytics"

    .line 22
    .line 23
    const-string p1, "."

    .line 24
    .line 25
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    const-string v0, ".     |  | "

    .line 29
    .line 30
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    const-string v0, ".     |  |"

    .line 34
    .line 35
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    const-string v1, ".   \\ |  | /"

    .line 42
    .line 43
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    const-string v1, ".    \\    /"

    .line 47
    .line 48
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    const-string v1, ".     \\  /"

    .line 52
    .line 53
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    const-string v1, ".      \\/"

    .line 57
    .line 58
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    const-string v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 65
    .line 66
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    const-string v1, ".      /\\"

    .line 73
    .line 74
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    const-string v1, ".     /  \\"

    .line 78
    .line 79
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    const-string v1, ".    /    \\"

    .line 83
    .line 84
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    const-string v1, ".   / |  | \\"

    .line 88
    .line 89
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    return p0
.end method

.method private synthetic t()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/q;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method private synthetic u(Lp4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->n(Lp4/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic v(Lp4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh4/A;->n(Lp4/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic w(JLjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lh4/q;->d0(JLjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic x(JLjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->b:Li4/e;

    .line 4
    .line 5
    new-instance v1, Lh4/z;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, p3}, Lh4/z;-><init>(Lh4/A;JLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private synthetic y(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1, p1}, Lh4/q;->c0(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private synthetic z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lh4/q;->W(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lh4/A;->e:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget-object v2, p0, Lh4/A;->q:Li4/f;

    .line 9
    .line 10
    iget-object v2, v2, Li4/f;->a:Li4/e;

    .line 11
    .line 12
    new-instance v3, Lh4/w;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0, v1, p1}, Lh4/w;-><init>(Lh4/A;JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v3}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public C(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    new-instance v1, Lh4/s;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lh4/s;-><init>(Lh4/A;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method D()V
    .locals 3

    .line 1
    invoke-static {}, Li4/f;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lh4/A;->f:Lh4/B;

    .line 5
    .line 6
    invoke-virtual {v0}, Lh4/B;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "Initialization marker file was not properly removed."

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Le4/g;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "Problem encountered deleting Crashlytics initialization marker."

    .line 28
    .line 29
    invoke-virtual {v1, v2, v0}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    return-void
.end method

.method E()V
    .locals 2

    .line 1
    invoke-static {}, Li4/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh4/A;->f:Lh4/B;

    .line 5
    .line 6
    invoke-virtual {v0}, Lh4/B;->a()Z

    .line 7
    .line 8
    .line 9
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "Initialization marker file was created."

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Le4/g;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public F(Lh4/b;Lp4/j;)Z
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v13, 0x0

    .line 6
    iget-object v2, v1, Lh4/A;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-string v3, "com.crashlytics.RequireBuildId"

    .line 9
    .line 10
    const/4 v14, 0x1

    .line 11
    invoke-static {v2, v3, v14}, Lh4/j;->i(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v15, p1

    .line 16
    .line 17
    iget-object v3, v15, Lh4/b;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, Lh4/A;->r(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    new-instance v2, Lh4/i;

    .line 26
    .line 27
    invoke-direct {v2}, Lh4/i;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lh4/i;->c()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    :try_start_0
    new-instance v2, Lh4/B;

    .line 35
    .line 36
    const-string v3, "crash_marker"

    .line 37
    .line 38
    iget-object v4, v1, Lh4/A;->k:Ln4/g;

    .line 39
    .line 40
    invoke-direct {v2, v3, v4}, Lh4/B;-><init>(Ljava/lang/String;Ln4/g;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v1, Lh4/A;->g:Lh4/B;

    .line 44
    .line 45
    new-instance v2, Lh4/B;

    .line 46
    .line 47
    const-string v3, "initialization_marker"

    .line 48
    .line 49
    iget-object v4, v1, Lh4/A;->k:Ln4/g;

    .line 50
    .line 51
    invoke-direct {v2, v3, v4}, Lh4/B;-><init>(Ljava/lang/String;Ln4/g;)V

    .line 52
    .line 53
    .line 54
    iput-object v2, v1, Lh4/A;->f:Lh4/B;

    .line 55
    .line 56
    new-instance v11, Lj4/n;

    .line 57
    .line 58
    iget-object v2, v1, Lh4/A;->k:Ln4/g;

    .line 59
    .line 60
    iget-object v3, v1, Lh4/A;->q:Li4/f;

    .line 61
    .line 62
    invoke-direct {v11, v12, v2, v3}, Lj4/n;-><init>(Ljava/lang/String;Ln4/g;Li4/f;)V

    .line 63
    .line 64
    .line 65
    new-instance v10, Lj4/e;

    .line 66
    .line 67
    iget-object v2, v1, Lh4/A;->k:Ln4/g;

    .line 68
    .line 69
    invoke-direct {v10, v2}, Lj4/e;-><init>(Ln4/g;)V

    .line 70
    .line 71
    .line 72
    new-instance v8, Lq4/a;

    .line 73
    .line 74
    new-instance v2, Lq4/c;

    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    invoke-direct {v2, v3}, Lq4/c;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-array v3, v14, [Lq4/d;

    .line 82
    .line 83
    aput-object v2, v3, v13

    .line 84
    .line 85
    const/16 v2, 0x400

    .line 86
    .line 87
    invoke-direct {v8, v2, v3}, Lq4/a;-><init>(I[Lq4/d;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, v1, Lh4/A;->p:Le4/l;

    .line 91
    .line 92
    invoke-virtual {v2, v11}, Le4/l;->c(Lj4/n;)V

    .line 93
    .line 94
    .line 95
    iget-object v2, v1, Lh4/A;->a:Landroid/content/Context;

    .line 96
    .line 97
    iget-object v3, v1, Lh4/A;->j:Lh4/L;

    .line 98
    .line 99
    iget-object v4, v1, Lh4/A;->k:Ln4/g;

    .line 100
    .line 101
    iget-object v9, v1, Lh4/A;->d:Lh4/Q;

    .line 102
    .line 103
    iget-object v7, v1, Lh4/A;->n:Lh4/n;

    .line 104
    .line 105
    iget-object v6, v1, Lh4/A;->q:Li4/f;

    .line 106
    .line 107
    move-object/from16 v5, p1

    .line 108
    .line 109
    move-object/from16 v16, v6

    .line 110
    .line 111
    move-object v6, v10

    .line 112
    move-object/from16 v17, v7

    .line 113
    .line 114
    move-object v7, v11

    .line 115
    move-object/from16 v18, v9

    .line 116
    .line 117
    move-object/from16 v9, p2

    .line 118
    .line 119
    move-object/from16 v23, v10

    .line 120
    .line 121
    move-object/from16 v10, v18

    .line 122
    .line 123
    move-object/from16 v22, v11

    .line 124
    .line 125
    move-object/from16 v11, v17

    .line 126
    .line 127
    move-object v14, v12

    .line 128
    move-object/from16 v12, v16

    .line 129
    .line 130
    invoke-static/range {v2 .. v12}, Lh4/c0;->i(Landroid/content/Context;Lh4/L;Ln4/g;Lh4/b;Lj4/e;Lj4/n;Lq4/d;Lp4/j;Lh4/Q;Lh4/n;Li4/f;)Lh4/c0;

    .line 131
    .line 132
    .line 133
    move-result-object v24

    .line 134
    new-instance v2, Lh4/q;

    .line 135
    .line 136
    iget-object v3, v1, Lh4/A;->a:Landroid/content/Context;

    .line 137
    .line 138
    iget-object v4, v1, Lh4/A;->j:Lh4/L;

    .line 139
    .line 140
    iget-object v5, v1, Lh4/A;->c:Lh4/G;

    .line 141
    .line 142
    iget-object v6, v1, Lh4/A;->k:Ln4/g;

    .line 143
    .line 144
    iget-object v7, v1, Lh4/A;->g:Lh4/B;

    .line 145
    .line 146
    iget-object v8, v1, Lh4/A;->o:Le4/a;

    .line 147
    .line 148
    iget-object v9, v1, Lh4/A;->m:Lf4/a;

    .line 149
    .line 150
    iget-object v10, v1, Lh4/A;->n:Lh4/n;

    .line 151
    .line 152
    iget-object v11, v1, Lh4/A;->q:Li4/f;

    .line 153
    .line 154
    move-object v15, v2

    .line 155
    move-object/from16 v16, v3

    .line 156
    .line 157
    move-object/from16 v17, v4

    .line 158
    .line 159
    move-object/from16 v18, v5

    .line 160
    .line 161
    move-object/from16 v19, v6

    .line 162
    .line 163
    move-object/from16 v20, v7

    .line 164
    .line 165
    move-object/from16 v21, p1

    .line 166
    .line 167
    move-object/from16 v25, v8

    .line 168
    .line 169
    move-object/from16 v26, v9

    .line 170
    .line 171
    move-object/from16 v27, v10

    .line 172
    .line 173
    move-object/from16 v28, v11

    .line 174
    .line 175
    invoke-direct/range {v15 .. v28}, Lh4/q;-><init>(Landroid/content/Context;Lh4/L;Lh4/G;Ln4/g;Lh4/B;Lh4/b;Lj4/n;Lj4/e;Lh4/c0;Le4/a;Lf4/a;Lh4/n;Li4/f;)V

    .line 176
    .line 177
    .line 178
    iput-object v2, v1, Lh4/A;->i:Lh4/q;

    .line 179
    .line 180
    invoke-virtual/range {p0 .. p0}, Lh4/A;->m()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-direct/range {p0 .. p0}, Lh4/A;->i()V

    .line 185
    .line 186
    .line 187
    iget-object v3, v1, Lh4/A;->i:Lh4/q;

    .line 188
    .line 189
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v3, v14, v4, v0}, Lh4/q;->y(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lp4/j;)V

    .line 194
    .line 195
    .line 196
    if-eqz v2, :cond_0

    .line 197
    .line 198
    iget-object v2, v1, Lh4/A;->a:Landroid/content/Context;

    .line 199
    .line 200
    invoke-static {v2}, Lh4/j;->d(Landroid/content/Context;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_0

    .line 205
    .line 206
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Le4/g;->b(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v1, v0}, Lh4/A;->p(Lp4/j;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    .line 217
    .line 218
    return v13

    .line 219
    :catch_0
    move-exception v0

    .line 220
    goto :goto_0

    .line 221
    :cond_0
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const-string v2, "Successfully configured exception handler."

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Le4/g;->b(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const/4 v0, 0x1

    .line 231
    return v0

    .line 232
    :goto_0
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const-string v3, "Crashlytics was not started due to an exception during initialization"

    .line 237
    .line 238
    invoke-virtual {v2, v3, v0}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    const/4 v0, 0x0

    .line 242
    iput-object v0, v1, Lh4/A;->i:Lh4/q;

    .line 243
    .line 244
    return v13

    .line 245
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    const-string v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 248
    .line 249
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v0
.end method

.method public G()Lz3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/q;->V()Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public H(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->c:Lh4/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh4/G;->h(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    new-instance v1, Lh4/u;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2}, Lh4/u;-><init>(Lh4/A;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    new-instance v1, Lh4/t;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lh4/t;-><init>(Lh4/A;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public j()Lz3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/q;->n()Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()Lz3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->i:Lh4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/q;->s()Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh4/A;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->f:Lh4/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/B;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o(Lp4/j;)Lz3/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/A;->q:Li4/f;

    .line 2
    .line 3
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 4
    .line 5
    new-instance v1, Lh4/r;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lh4/r;-><init>(Lh4/A;Lp4/j;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li4/e;->f(Ljava/lang/Runnable;)Lz3/l;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/A;->c:Lh4/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh4/G;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

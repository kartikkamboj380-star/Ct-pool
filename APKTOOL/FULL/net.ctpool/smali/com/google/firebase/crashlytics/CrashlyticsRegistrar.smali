.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# instance fields
.field private final a:Lb4/E;

.field private final b:Lb4/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LO4/b$a;->m:LO4/b$a;

    invoke-static {v0}, LO4/a;->a(LO4/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, La4/a;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Lb4/E;

    const-class v0, La4/b;

    invoke-static {v0, v1}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Lb4/E;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Lb4/d;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(Lb4/d;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p0

    return-object p0
.end method

.method private b(Lb4/d;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Li4/f;->f(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-class v2, LY3/f;

    .line 10
    .line 11
    invoke-interface {p1, v2}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    move-object v3, v2

    .line 16
    check-cast v3, LY3/f;

    .line 17
    .line 18
    const-class v2, LE4/e;

    .line 19
    .line 20
    invoke-interface {p1, v2}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v4, v2

    .line 25
    check-cast v4, LE4/e;

    .line 26
    .line 27
    const-class v2, Le4/a;

    .line 28
    .line 29
    invoke-interface {p1, v2}, Lb4/d;->i(Ljava/lang/Class;)LD4/a;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-class v2, LZ3/a;

    .line 34
    .line 35
    invoke-interface {p1, v2}, Lb4/d;->i(Ljava/lang/Class;)LD4/a;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-class v2, LM4/a;

    .line 40
    .line 41
    invoke-interface {p1, v2}, Lb4/d;->i(Ljava/lang/Class;)LD4/a;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Lb4/E;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v8, v2

    .line 52
    check-cast v8, Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Lb4/E;

    .line 55
    .line 56
    invoke-interface {p1, v2}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v9, p1

    .line 61
    check-cast v9, Ljava/util/concurrent/ExecutorService;

    .line 62
    .line 63
    invoke-static/range {v3 .. v9}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->b(LY3/f;LE4/e;LD4/a;LD4/a;LD4/a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    sub-long/2addr v2, v0

    .line 72
    const-wide/16 v0, 0x10

    .line 73
    .line 74
    cmp-long v0, v2, v0

    .line 75
    .line 76
    if-lez v0, :cond_0

    .line 77
    .line 78
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v4, "Initializing Crashlytics blocked main for "

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v2, " ms"

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Le4/g;->b(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_0
    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3

    const-class v0, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v1, "fire-cls"

    invoke-virtual {v0, v1}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    const-class v2, LY3/f;

    invoke-static {v2}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, LE4/e;

    invoke-static {v2}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Lb4/E;

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Lb4/E;

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, Le4/a;

    invoke-static {v2}, Lb4/q;->a(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, LZ3/a;

    invoke-static {v2}, Lb4/q;->a(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, LM4/a;

    invoke-static {v2}, Lb4/q;->a(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v2, Ld4/f;

    invoke-direct {v2, p0}, Ld4/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v0, v2}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->e()Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-string v2, "19.2.1"

    invoke-static {v1, v2}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

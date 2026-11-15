.class public final Lt1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt1/b;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lt1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt1/b;->a:Lt1/b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Lv1/b;Ly1/g;Lw1/n;ZZILjava/util/concurrent/ExecutorService;)Lt1/a;
    .locals 8

    .line 1
    sget-boolean v0, Lt1/b;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lv1/b;

    .line 12
    .line 13
    const-class v2, Ly1/g;

    .line 14
    .line 15
    const-class v3, Lw1/n;

    .line 16
    .line 17
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const-class v7, LM0/d;

    .line 22
    .line 23
    move-object v4, v5

    .line 24
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    move-object v1, p0

    .line 45
    move-object v2, p1

    .line 46
    move-object v3, p2

    .line 47
    move-object v7, p6

    .line 48
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string p1, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory"

    .line 57
    .line 58
    invoke-static {p0, p1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :catchall_0
    :cond_0
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

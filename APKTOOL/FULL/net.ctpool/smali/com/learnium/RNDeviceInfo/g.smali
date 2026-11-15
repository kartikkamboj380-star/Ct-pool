.class public Lcom/learnium/RNDeviceInfo/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/learnium/RNDeviceInfo/g$a;
    }
.end annotation


# static fields
.field private static f:Ljava/lang/Class;

.field private static g:Ljava/lang/Class;

.field private static h:Ljava/lang/Class;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private final e:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-class v0, Lcom/android/installreferrer/api/InstallReferrerClient;

    sput-object v0, Lcom/learnium/RNDeviceInfo/g;->f:Ljava/lang/Class;

    const-class v0, Lcom/android/installreferrer/api/InstallReferrerStateListener;

    sput-object v0, Lcom/learnium/RNDeviceInfo/g;->g:Ljava/lang/Class;

    const-class v0, Lcom/android/installreferrer/api/ReferrerDetails;

    sput-object v0, Lcom/learnium/RNDeviceInfo/g;->h:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "RNInstallReferrerClient exception. \'installreferrer\' APIs are unavailable."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/learnium/RNDeviceInfo/g;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/learnium/RNDeviceInfo/g;->e:Landroid/os/Handler;

    const-string v1, "react-native-device-info"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/learnium/RNDeviceInfo/g;->a:Landroid/content/SharedPreferences;

    sget-object v1, Lcom/learnium/RNDeviceInfo/g;->f:Ljava/lang/Class;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/learnium/RNDeviceInfo/g;->g:Ljava/lang/Class;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/learnium/RNDeviceInfo/g;->h:Ljava/lang/Class;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/learnium/RNDeviceInfo/e;

    invoke-direct {v1, p0, p1}, Lcom/learnium/RNDeviceInfo/e;-><init>(Lcom/learnium/RNDeviceInfo/g;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/learnium/RNDeviceInfo/g;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/learnium/RNDeviceInfo/g;->h(Landroid/content/Context;)V

    return-void
.end method

.method static bridge synthetic b(Lcom/learnium/RNDeviceInfo/g;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/learnium/RNDeviceInfo/g;->d:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/learnium/RNDeviceInfo/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/learnium/RNDeviceInfo/g;->b:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/learnium/RNDeviceInfo/g;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/learnium/RNDeviceInfo/g;->e:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/learnium/RNDeviceInfo/g;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/learnium/RNDeviceInfo/g;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static bridge synthetic f()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/learnium/RNDeviceInfo/g;->f:Ljava/lang/Class;

    return-object v0
.end method

.method static bridge synthetic g()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/learnium/RNDeviceInfo/g;->h:Ljava/lang/Class;

    return-object v0
.end method

.method private synthetic h(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/learnium/RNDeviceInfo/g;->f:Ljava/lang/Class;

    const-string v1, "newBuilder"

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "build"

    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/learnium/RNDeviceInfo/g;->b:Ljava/lang/Object;

    sget-object p1, Lcom/learnium/RNDeviceInfo/g;->g:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    sget-object v0, Lcom/learnium/RNDeviceInfo/g;->g:Ljava/lang/Class;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Lcom/learnium/RNDeviceInfo/g$a;

    invoke-direct {v2, p0, v1}, Lcom/learnium/RNDeviceInfo/g$a;-><init>(Lcom/learnium/RNDeviceInfo/g;Lcom/learnium/RNDeviceInfo/h;)V

    invoke-static {p1, v0, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/learnium/RNDeviceInfo/g;->c:Ljava/lang/Object;

    sget-object p1, Lcom/learnium/RNDeviceInfo/g;->f:Ljava/lang/Class;

    const-string v0, "startConnection"

    sget-object v1, Lcom/learnium/RNDeviceInfo/g;->g:Ljava/lang/Class;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iget-object v0, p0, Lcom/learnium/RNDeviceInfo/g;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/learnium/RNDeviceInfo/g;->c:Ljava/lang/Object;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RNInstallReferrerClient exception. getInstallReferrer will be unavailable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :goto_0
    return-void
.end method

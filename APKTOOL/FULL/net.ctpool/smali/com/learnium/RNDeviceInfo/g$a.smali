.class Lcom/learnium/RNDeviceInfo/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/learnium/RNDeviceInfo/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/learnium/RNDeviceInfo/g;


# direct methods
.method private constructor <init>(Lcom/learnium/RNDeviceInfo/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/learnium/RNDeviceInfo/g;Lcom/learnium/RNDeviceInfo/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/learnium/RNDeviceInfo/g$a;-><init>(Lcom/learnium/RNDeviceInfo/g;)V

    return-void
.end method

.method public static synthetic a(Lcom/learnium/RNDeviceInfo/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/learnium/RNDeviceInfo/g$a;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 4

    .line 1
    const-string v0, "getInstallReferrer"

    :try_start_0
    const-string v1, "InstallReferrerState"

    const-string v2, "OK"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/learnium/RNDeviceInfo/g;->f()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v3, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {v3}, Lcom/learnium/RNDeviceInfo/g;->c(Lcom/learnium/RNDeviceInfo/g;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/learnium/RNDeviceInfo/g;->g()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {v1}, Lcom/learnium/RNDeviceInfo/g;->e(Lcom/learnium/RNDeviceInfo/g;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "installReferrer"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lcom/learnium/RNDeviceInfo/g;->f()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "endConnection"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {v1}, Lcom/learnium/RNDeviceInfo/g;->c(Lcom/learnium/RNDeviceInfo/g;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RNInstallReferrerClient exception. getInstallReferrer will be unavailable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    const-string v0, "RNInstallReferrerClient"

    const-string v1, "InstallReferrerService disconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    const-string v1, "InstallReferrerState"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "FEATURE_NOT_SUPPORTED"

    :goto_0
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    const-string p1, "SERVICE_UNAVAILABLE"

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {p1}, Lcom/learnium/RNDeviceInfo/g;->b(Lcom/learnium/RNDeviceInfo/g;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/learnium/RNDeviceInfo/f;

    invoke-direct {v0, p0}, Lcom/learnium/RNDeviceInfo/f;-><init>(Lcom/learnium/RNDeviceInfo/g$a;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    const-string p2, "onInstallReferrerSetupFinished"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    aget-object p2, p3, p2

    instance-of p3, p2, Ljava/lang/Integer;

    if-eqz p3, :cond_0

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {p2}, Lcom/learnium/RNDeviceInfo/g;->d(Lcom/learnium/RNDeviceInfo/g;)Landroid/os/Handler;

    move-result-object p2

    new-instance p3, Lcom/learnium/RNDeviceInfo/g$a$a;

    invoke-direct {p3, p0, p1}, Lcom/learnium/RNDeviceInfo/g$a$a;-><init>(Lcom/learnium/RNDeviceInfo/g$a;I)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p2, "onInstallReferrerServiceDisconnected"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/learnium/RNDeviceInfo/g$a;->a:Lcom/learnium/RNDeviceInfo/g;

    invoke-static {p1}, Lcom/learnium/RNDeviceInfo/g;->d(Lcom/learnium/RNDeviceInfo/g;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/learnium/RNDeviceInfo/g$a$b;

    invoke-direct {p2, p0}, Lcom/learnium/RNDeviceInfo/g$a$b;-><init>(Lcom/learnium/RNDeviceInfo/g$a;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :goto_1
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unexpected invocation exception: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

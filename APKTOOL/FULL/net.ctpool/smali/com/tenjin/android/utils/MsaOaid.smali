.class public Lcom/tenjin/android/utils/MsaOaid;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/utils/MsaOaid$MsaErrorCode;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MsaOaid"


# instance fields
.field private context:Landroid/content/Context;

.field oaidHolder:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tenjin/android/utils/MsaOaid;->oaidHolder:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/utils/MsaOaid;->context:Landroid/content/Context;

    return-void
.end method

.method private MdidSdkHelper()Ljava/lang/Class;
    .locals 1

    const-string v0, "com.bun.miitmdid.core.MdidSdkHelper"

    invoke-static {v0}, Lcom/tenjin/android/utils/Reflection;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method private createOaidProxyListener(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p1, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method private getOaidListenerClass()Ljava/lang/Class;
    .locals 1

    const-string v0, "com.bun.miitmdid.interfaces.IIdentifierListener"

    invoke-static {v0}, Lcom/tenjin/android/utils/Reflection;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method private initMsaSdk(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v1, "com.bun.miitmdid.core.MdidSdkHelper"

    const-string v2, "InitSdk"

    const-class v3, Landroid/content/Context;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v4, p1}, [Ljava/lang/Class;

    move-result-object p1

    iget-object v3, p0, Lcom/tenjin/android/utils/MsaOaid;->context:Landroid/content/Context;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v3, v4, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, v2, p1, p2}, Lcom/tenjin/android/utils/Reflection;->runStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private logInitResponse(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "MsaOaid"

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "MSA Error - INIT_ERROR_BEGIN"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_1
    const-string v1, "MSA Error - INIT_ERROR_DEVICE_NOSUPPORT"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_2
    const-string v1, "MSA Error - INIT_ERROR_LOAD_CONFIGFILE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_3
    const-string v1, "MSA Error - INIT_ERROR_MANUFACTURER_NOSUPPORT"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_4
    const-string v1, "MSA Error - INIT_HELPER_CALL_ERROR"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_5
    const-string v1, "MSA Error - INIT_ERROR_RESULT_DELAY"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MSA Response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_0
    const-string p1, "MSA Response: null"

    goto :goto_1

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xf63e2
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public getOaid(J)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/tenjin/android/utils/MsaOaid;->oaidHolder:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {p0}, Lcom/tenjin/android/utils/MsaOaid;->getOaidListenerClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, v0}, Lcom/tenjin/android/utils/MsaOaid;->createOaidProxyListener(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, v0, v2}, Lcom/tenjin/android/utils/MsaOaid;->initMsaSdk(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/utils/MsaOaid;->logInitResponse(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/tenjin/android/utils/MsaOaid;->oaidHolder:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, p2, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    if-nez p3, :cond_2

    new-array p3, v0, [Ljava/lang/Object;

    :cond_2
    const-string v1, "OnSupport"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    aget-object p2, p3, v0

    instance-of p2, p2, Ljava/lang/Boolean;

    const-string v1, "MsaOaid"

    if-nez p2, :cond_3

    const-string p2, "OnSupport isSupport is not Boolean"

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1

    :cond_3
    const/4 p2, 0x1

    aget-object p2, p3, p2

    const-string p3, "getOAID"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p3, p1, v0}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/tenjin/android/utils/MsaOaid;->oaidHolder:Ljava/util/concurrent/BlockingQueue;

    const-string p3, ""

    invoke-interface {p2, p3}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MSA OAID: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p3, p0, Lcom/tenjin/android/utils/MsaOaid;->oaidHolder:Ljava/util/concurrent/BlockingQueue;

    check-cast p2, Ljava/lang/String;

    invoke-interface {p3, p2}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    :cond_5
    :goto_0
    return-object p1
.end method

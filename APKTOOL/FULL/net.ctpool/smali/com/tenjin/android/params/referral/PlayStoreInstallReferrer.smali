.class public Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;,
        Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$GooglePlayInstallReferrerResponse;
    }
.end annotation


# static fields
.field private static final REFERRER_LOG_TAG:Ljava/lang/String; = "Tenjin"

.field private static final referrerRetryLimit:I = 0x3


# instance fields
.field public callback:Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;

.field private final context:Landroid/content/Context;

.field private googleInstallReferrerClient:Ljava/lang/Object;

.field private final installReferrerLock:Ljava/lang/Object;

.field private installReferrerReceived:Z

.field private referrerRetryCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->referrerRetryCount:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->context:Landroid/content/Context;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerLock:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerReceived:Z

    return-void
.end method

.method private closeInstallReferrerClient()V
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->googleInstallReferrerClient:Ljava/lang/Object;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    const-string v2, "endConnection"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v1, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iput-object v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->googleInstallReferrerClient:Ljava/lang/Object;

    return-void
.end method

.method private createInstallReferrerClient(Landroid/content/Context;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.android.installreferrer.api.InstallReferrerClient"

    const-string v2, "newBuilder"

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, v3, p1}, Lcom/tenjin/android/utils/Reflection;->runStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "build"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v0, v2}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0
.end method

.method private createProxyInstallReferrerStateListener(Ljava/lang/Class;)Ljava/lang/Object;
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

.method private getInstallReferrerDetails()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->googleInstallReferrerClient:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "getInstallReferrer"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v1, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1
.end method

.method private getInstallReferrerStateListenerClass()Ljava/lang/Class;
    .locals 1

    :try_start_0
    const-class v0, Lcom/android/installreferrer/api/InstallReferrerStateListener;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private getReferralData(Ljava/lang/Object;)Lcom/tenjin/android/params/referral/InstallReferrerDetails;
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "getInstallReferrer"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v0, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    const-string v1, "getReferrerClickTimestampSeconds"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v0, v3}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const-string v1, "getInstallBeginTimestampSeconds"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v0, v2}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    new-instance p1, Lcom/tenjin/android/params/referral/InstallReferrerDetails;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/tenjin/android/params/referral/InstallReferrerDetails;-><init>(Ljava/lang/String;JJ)V

    return-object p1
.end method

.method private handleGooglePlayReferrerClientResponse(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installReferrer client response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Tenjin"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->closeInstallReferrerClient()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->callback:Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;->onFail()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->tryExtractReferralDetails()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->retryGoogleInstallClientConnection()V

    :cond_3
    :goto_0
    return-void
.end method

.method private retryGoogleInstallClientConnection()V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerReceived:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->referrerRetryCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->referrerRetryCount:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    return-void

    :cond_1
    const-wide/16 v0, 0x3e8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    invoke-virtual {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->startConnection()Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private startGoogleInstallReferrerConnection(Ljava/lang/Class;Ljava/lang/Object;)Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->googleInstallReferrerClient:Ljava/lang/Object;

    const-string v1, "startConnection"

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method private tryExtractReferralDetails()V
    .locals 9

    :try_start_0
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->getInstallReferrerDetails()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->getReferralData(Ljava/lang/Object;)Lcom/tenjin/android/params/referral/InstallReferrerDetails;

    move-result-object v0

    const-string v1, "Tenjin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "installReferrer: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Tenjin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "clickTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->clickTimestamp:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Tenjin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "installBeginTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->installTimestamp:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->callback:Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;

    if-eqz v3, :cond_0

    iget-object v4, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->url:Ljava/lang/String;

    iget-wide v5, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->clickTimestamp:J

    iget-wide v7, v0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->installTimestamp:J

    invoke-interface/range {v3 .. v8}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;->onComplete(Ljava/lang/String;JJ)V

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerReceived:Z

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->closeInstallReferrerClient()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->retryGoogleInstallClientConnection()V

    :goto_0
    return-void
.end method


# virtual methods
.method public getInstallReferrer(Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;)Z
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "Tenjin"

    const-string v0, "getInstallReferrer callback is null"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->callback:Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;

    invoke-virtual {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->startConnection()Z

    move-result p1

    return p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    const-string v1, "onInstallReferrerSetupFinished"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "Tenjin"

    if-eqz v1, :cond_5

    array-length p2, p3

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const-string p2, "InstallReferrer onInstallReferrerSetupFinished responseCode no result"

    :goto_0
    invoke-static {v2, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1

    :cond_3
    aget-object p2, p3, v0

    instance-of p3, p2, Ljava/lang/Integer;

    if-nez p3, :cond_4

    const-string p2, "InstallReferrer onInstallReferrerSetupFinished responseCode not int"

    goto :goto_0

    :cond_4
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p0, p2}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->handleGooglePlayReferrerClientResponse(I)V

    goto :goto_1

    :cond_5
    const-string p3, "onInstallReferrerServiceDisconnected"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "InstallReferrer onInstallReferrerServiceDisconnected"

    invoke-static {v2, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_1
    return-object p1
.end method

.method public startConnection()Z
    .locals 4

    const-string v0, "Tenjin"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to retrieve Play Store referral info, attempt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->referrerRetryCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->closeInstallReferrerClient()V

    iget-boolean v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->installReferrerReceived:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->context:Landroid/content/Context;

    if-nez v1, :cond_1

    monitor-exit v0

    return v2

    :cond_1
    invoke-direct {p0, v1}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->createInstallReferrerClient(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->googleInstallReferrerClient:Ljava/lang/Object;

    if-nez v1, :cond_2

    monitor-exit v0

    return v2

    :cond_2
    invoke-direct {p0}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->getInstallReferrerStateListenerClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_3

    monitor-exit v0

    return v2

    :cond_3
    invoke-direct {p0, v1}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->createProxyInstallReferrerStateListener(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    monitor-exit v0

    return v2

    :cond_4
    invoke-direct {p0, v1, v3}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->startGoogleInstallReferrerConnection(Ljava/lang/Class;Ljava/lang/Object;)Z

    move-result v1

    monitor-exit v0

    return v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

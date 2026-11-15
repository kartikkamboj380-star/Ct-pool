.class public Lcom/tenjin/android/utils/TenjinStartup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;,
        Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;
    }
.end annotation


# instance fields
.field private final attribution:Lcom/tenjin/android/params/AttributionParams;

.field public callback:Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;

.field private final context:Landroid/content/Context;

.field private final startupComplete:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tenjin/android/store/DataStore;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup;->startupComplete:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/tenjin/android/utils/TenjinStartup;->context:Landroid/content/Context;

    new-instance v0, Lcom/tenjin/android/params/AttributionParams;

    invoke-direct {v0, p1, p2}, Lcom/tenjin/android/params/AttributionParams;-><init>(Landroid/content/Context;Lcom/tenjin/android/store/DataStore;)V

    iput-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup;->attribution:Lcom/tenjin/android/params/AttributionParams;

    return-void
.end method

.method static synthetic access$100(Lcom/tenjin/android/utils/TenjinStartup;)Lcom/tenjin/android/params/AttributionParams;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/utils/TenjinStartup;->attribution:Lcom/tenjin/android/params/AttributionParams;

    return-object p0
.end method

.method static synthetic access$200(Lcom/tenjin/android/utils/TenjinStartup;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/tenjin/android/utils/TenjinStartup;->context:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public completed()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup;->startupComplete:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public doStartup()V
    .locals 5

    const-string v0, "TenjinStartup"

    new-instance v1, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;-><init>(Lcom/tenjin/android/utils/TenjinStartup;Lcom/tenjin/android/utils/TenjinStartup$1;)V

    new-instance v2, Lcom/tenjin/android/utils/TenjinStartup$1;

    invoke-direct {v2, p0}, Lcom/tenjin/android/utils/TenjinStartup$1;-><init>(Lcom/tenjin/android/utils/TenjinStartup;)V

    new-instance v3, Lcom/tenjin/android/utils/TenjinStartup$2;

    invoke-direct {v3, p0, v1}, Lcom/tenjin/android/utils/TenjinStartup$2;-><init>(Lcom/tenjin/android/utils/TenjinStartup;Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;)V

    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    invoke-virtual {v3}, Ljava/lang/Thread;->join()V

    invoke-virtual {v2}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error on retrieving ad id + referral "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string v2, "Set complete"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup;->startupComplete:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup;->callback:Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/tenjin/android/utils/TenjinStartup;->attribution:Lcom/tenjin/android/params/AttributionParams;

    invoke-virtual {v1}, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;->getParams()Lcom/tenjin/android/params/platform/PlatformParams;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;->onStartupComplete(Lcom/tenjin/android/params/AttributionParams;Lcom/tenjin/android/params/platform/PlatformParams;)V

    :cond_0
    return-void
.end method

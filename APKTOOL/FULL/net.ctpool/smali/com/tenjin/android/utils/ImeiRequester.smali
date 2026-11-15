.class public Lcom/tenjin/android/utils/ImeiRequester;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ImeiRequester"


# instance fields
.field private imei:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ImeiRequester"

    if-nez p1, :cond_0

    const-string p1, "invalid input param"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v1, "phone"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    :try_start_0
    invoke-static {}, Lcom/tenjin/android/TenjinSDK;->getAppStore()Lcom/tenjin/android/TenjinSDK$AppStoreType;

    move-result-object v1

    sget-object v2, Lcom/tenjin/android/TenjinSDK$AppStoreType;->googleplay:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/utils/ImeiRequester;->imei:Ljava/lang/String;

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IMEI "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tenjin/android/utils/ImeiRequester;->imei:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p1, "IMEI request failed"

    :goto_0
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    const-string p1, "IMEI request failed with SecurityException"

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/utils/ImeiRequester;->imei:Ljava/lang/String;

    return-object v0
.end method

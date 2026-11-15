.class public Lcom/tenjin/android/utils/OaidRequester;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "OaidRequester"


# instance fields
.field hasHuaweiOaid:Ljava/lang/Boolean;

.field hasMsaOaid:Ljava/lang/Boolean;

.field private isLimitAdTrackingEnabled:Z

.field private oaid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->hasMsaOaid:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->hasHuaweiOaid:Ljava/lang/Boolean;

    if-nez p1, :cond_0

    const-string p1, "OaidRequester"

    const-string v0, "invalid input param"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/tenjin/android/utils/OaidRequester;->HuaweiAdIdRequester(Landroid/content/Context;)V

    return-void
.end method

.method private HuaweiAdIdRequester(Landroid/content/Context;)V
    .locals 2

    const-string v0, "com.huawei.hms.ads.identifier.AdvertisingIdClient"

    invoke-static {v0}, Lcom/tenjin/android/utils/Reflection;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->hasHuaweiOaid:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/tenjin/android/utils/OaidRequester;->setAdIdData(Landroid/content/Context;)V

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HUAWEI AdId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OaidRequester"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lcom/tenjin/android/utils/OaidRequester;->MSAOAIDRequester(Landroid/content/Context;)V

    :cond_2
    return-void
.end method

.method private MSAOAIDRequester(Landroid/content/Context;)V
    .locals 3

    const-string v0, "com.bun.miitmdid.core.MdidSdkHelper"

    invoke-static {v0}, Lcom/tenjin/android/utils/Reflection;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->hasMsaOaid:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/tenjin/android/utils/MsaOaid;

    invoke-direct {v0, p1}, Lcom/tenjin/android/utils/MsaOaid;-><init>(Landroid/content/Context;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v1, v2}, Lcom/tenjin/android/utils/MsaOaid;->getOaid(J)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MSA OAID: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "OaidRequester"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private setAdIdData(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tenjin/android/utils/HuaweiAdId;->getAdIdWithRetry(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "OaidRequester"

    const-string v0, "Huawei AdId request failed"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/tenjin/android/utils/HuaweiAdId;->getId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    invoke-static {p1}, Lcom/tenjin/android/utils/HuaweiAdId;->isLimitAdTrackingEnabled(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/tenjin/android/utils/OaidRequester;->isLimitAdTrackingEnabled:Z

    :goto_0
    return-void
.end method


# virtual methods
.method public getIsLimitAdTrackingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tenjin/android/utils/OaidRequester;->isLimitAdTrackingEnabled:Z

    return v0
.end method

.method public getOaid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/utils/OaidRequester;->oaid:Ljava/lang/String;

    return-object v0
.end method

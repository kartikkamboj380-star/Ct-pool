.class public Lcom/tenjin/android/params/MetaReferrerParams;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# instance fields
.field private final context:Landroid/content/Context;

.field private final metaInstallReferrer:Lcom/tenjin/android/params/referral/MetaInstallReferrer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/MetaReferrerParams;->context:Landroid/content/Context;

    new-instance p1, Lcom/tenjin/android/params/referral/MetaInstallReferrer;

    invoke-direct {p1}, Lcom/tenjin/android/params/referral/MetaInstallReferrer;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/MetaReferrerParams;->metaInstallReferrer:Lcom/tenjin/android/params/referral/MetaInstallReferrer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tenjin/android/params/referral/MetaInstallReferrer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/MetaReferrerParams;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/tenjin/android/params/MetaReferrerParams;->metaInstallReferrer:Lcom/tenjin/android/params/referral/MetaInstallReferrer;

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/params/MetaReferrerParams;->metaInstallReferrer:Lcom/tenjin/android/params/referral/MetaInstallReferrer;

    iget-object v1, p0, Lcom/tenjin/android/params/MetaReferrerParams;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/tenjin/android/params/referral/MetaInstallReferrer;->getInstallReferrerInfo(Landroid/content/Context;)Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->getInstallReferrer()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->getInstallReferrer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->getInstallReferrer()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "meta_referrer"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "meta_referrer_ts"

    invoke-virtual {v0}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->getActualTimestamp()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "meta_referrer_clickthrough"

    invoke-virtual {v0}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->isClickThrough()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    return-object p1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error getting Meta Install Referrer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TenjinSDK"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method

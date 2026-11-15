.class public Lcom/tenjin/android/utils/StoreAttribution;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tenjin/android/utils/StoreAttribution$Store;,
        Lcom/tenjin/android/utils/StoreAttribution$Field;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StoreAttribution"


# instance fields
.field private final clickTimestamp:Ljava/lang/Long;

.field private encodedValue:Ljava/lang/String;

.field private final installTimestamp:Ljava/lang/Long;

.field private final referrer:Ljava/lang/String;

.field private final store:Lcom/tenjin/android/utils/StoreAttribution$Store;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/utils/StoreAttribution$Store;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->encodedValue:Ljava/lang/String;

    iput-object p1, p0, Lcom/tenjin/android/utils/StoreAttribution;->store:Lcom/tenjin/android/utils/StoreAttribution$Store;

    iput-object p2, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    iput-object p3, p0, Lcom/tenjin/android/utils/StoreAttribution;->clickTimestamp:Ljava/lang/Long;

    iput-object p4, p0, Lcom/tenjin/android/utils/StoreAttribution;->installTimestamp:Ljava/lang/Long;

    invoke-direct {p0}, Lcom/tenjin/android/utils/StoreAttribution;->encodeReferrerValue()V

    return-void
.end method

.method private static dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->Referrer:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {p0, v0}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;
    .locals 3

    .line 2
    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$1;->$SwitchMap$com$tenjin$android$utils$StoreAttribution$Store:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const-string v0, "tenjinGoogleInstallReferrer"

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "tenjinHuaweiInstallReferrer"

    :cond_1
    :goto_0
    sget-object p0, Lcom/tenjin/android/utils/StoreAttribution$1;->$SwitchMap$com$tenjin$android$utils$StoreAttribution$Field:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const-string p1, ""

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    const/4 v1, 0x3

    if-eq p0, v1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "ClickTs"

    goto :goto_1

    :cond_3
    const-string p1, "InstallTs"

    :cond_4
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private encodeReferrerValue()V
    .locals 3

    const-string v0, "UTF-8"

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    invoke-static {v1}, Lcom/tenjin/android/utils/TenjinUtils;->isNullOrEmpty(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->encodedValue:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error UTF-8 encoding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/tenjin/android/utils/StoreAttribution;->fieldName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " data "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StoreAttribution"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private fieldName()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->Referrer:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-direct {p0, v0}, Lcom/tenjin/android/utils/StoreAttribution;->fieldName(Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private fieldName(Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;
    .locals 4

    .line 2
    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$1;->$SwitchMap$com$tenjin$android$utils$StoreAttribution$Store:[I

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->store:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "referrer"

    const/4 v3, 0x2

    if-eq v0, v1, :cond_1

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "huawei_referrer"

    :cond_1
    :goto_0
    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$1;->$SwitchMap$com$tenjin$android$utils$StoreAttribution$Field:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    return-object v2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_click_ts"

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_install_ts"

    goto :goto_1
.end method

.method public static load(Lcom/tenjin/android/store/DataStore;Lcom/tenjin/android/utils/StoreAttribution$Store;)Lcom/tenjin/android/utils/StoreAttribution;
    .locals 4

    invoke-static {p1}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/tenjin/android/store/DataStore;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-interface {p0, v0, v1}, Lcom/tenjin/android/store/DataStore;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Field;->ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {p1, v1}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-interface {p0, v1, v2}, Lcom/tenjin/android/store/DataStore;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget-object v3, Lcom/tenjin/android/utils/StoreAttribution$Field;->InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {p1, v3}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3, v2}, Lcom/tenjin/android/store/DataStore;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Retrieved "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " referral from storage - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "StoreAttribution"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lcom/tenjin/android/utils/StoreAttribution;

    invoke-direct {v2, p1, v0, v1, p0}, Lcom/tenjin/android/utils/StoreAttribution;-><init>(Lcom/tenjin/android/utils/StoreAttribution$Store;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v2
.end method


# virtual methods
.method public apply(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->encodedValue:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/tenjin/android/utils/StoreAttribution;->fieldName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->encodedValue:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->clickTimestamp:Ljava/lang/Long;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-direct {p0, v0}, Lcom/tenjin/android/utils/StoreAttribution;->fieldName(Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->clickTimestamp:Ljava/lang/Long;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->installTimestamp:Ljava/lang/Long;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-direct {p0, v0}, Lcom/tenjin/android/utils/StoreAttribution;->fieldName(Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->installTimestamp:Ljava/lang/Long;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public save(Lcom/tenjin/android/store/DataStore;)V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    invoke-static {v0}, Lcom/tenjin/android/utils/TenjinUtils;->isNullOrEmpty(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->store:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {v0}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->referrer:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/tenjin/android/store/DataStore;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->store:Lcom/tenjin/android/utils/StoreAttribution$Store;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Field;->ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->clickTimestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tenjin/android/store/DataStore;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tenjin/android/utils/StoreAttribution;->store:Lcom/tenjin/android/utils/StoreAttribution$Store;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Field;->InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {v0, v1}, Lcom/tenjin/android/utils/StoreAttribution;->dataStoreKey(Lcom/tenjin/android/utils/StoreAttribution$Store;Lcom/tenjin/android/utils/StoreAttribution$Field;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/utils/StoreAttribution;->installTimestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tenjin/android/store/DataStore;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

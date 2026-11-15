.class public Lcom/tenjin/android/params/DMAParams;
.super Lcom/tenjin/android/params/base/AParamProvider;
.source "SourceFile"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/tenjin/android/params/base/AParamProvider;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/DMAParams;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/Map;)Ljava/util/Map;
    .locals 6
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

    new-instance v0, Lcom/tenjin/android/utils/GDPRHelper;

    iget-object v1, p0, Lcom/tenjin/android/params/DMAParams;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tenjin/android/utils/GDPRHelper;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/tenjin/android/utils/GDPRHelper;->isGoogleDMADisabled()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lcom/tenjin/android/utils/GDPRHelper;->getGoogleAdPersonalization()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0}, Lcom/tenjin/android/utils/GDPRHelper;->getGoogleAdUserData()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0}, Lcom/tenjin/android/utils/GDPRHelper;->getPurposeConsentsTCF()Ljava/lang/String;

    move-result-object v0

    const-string v3, "false"

    const-string v4, "true"

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v4

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    const-string v5, "ad_personalization"

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v3, v4

    :cond_3
    const-string v1, "ad_user_data"

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    if-eqz v0, :cond_5

    const-string v1, "iab_tcf"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-object p1
.end method

.class public Lcom/tenjin/android/utils/GDPRHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CONSENT_KEY:Ljava/lang/String; = "IABTCF_PurposeConsents"


# instance fields
.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method private hasConsent([ILjava/lang/String;)Z
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    invoke-direct {p0, p2, v3}, Lcom/tenjin/android/utils/GDPRHelper;->resultFromConsentIndex(Ljava/lang/String;I)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public static isValidTCFString(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "^[01]{1,12}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method

.method private resultFromConsentIndex(Ljava/lang/String;I)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, p2, :cond_0

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p2, 0x31

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getGoogleAdPersonalization()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_GOOGLE_AD_PERSONALIZATION"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "IABTCF_PurposeConsents"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lcom/tenjin/android/utils/GDPRHelper;->isValidTCFString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    const/4 v2, 0x4

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/tenjin/android/utils/GDPRHelper;->hasConsent([ILjava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public getGoogleAdUserData()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_GOOGLE_AD_USER_DATA"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "IABTCF_PurposeConsents"

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lcom/tenjin/android/utils/GDPRHelper;->isValidTCFString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/tenjin/android/utils/GDPRHelper;->hasConsent([ILjava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public getPurposeConsentsTCF()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "IABTCF_PurposeConsents"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/tenjin/android/utils/GDPRHelper;->isValidTCFString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public isGoogleDMADisabled()Z
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "TENJIN_GOOGLE_DMA_DISABLED"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public optIn()Z
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "IABTCF_PurposeConsents"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-static {v0}, Lcom/tenjin/android/utils/GDPRHelper;->isValidTCFString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    filled-new-array {v2}, [I

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/tenjin/android/utils/GDPRHelper;->hasConsent([ILjava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    return v2
.end method

.method public setGoogleDMAParameters(ZZ)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TENJIN_GOOGLE_AD_PERSONALIZATION"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string p1, "TENJIN_GOOGLE_AD_USER_DATA"

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setGoogleDMASetting(Z)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/utils/GDPRHelper;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TENJIN_GOOGLE_DMA_DISABLED"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

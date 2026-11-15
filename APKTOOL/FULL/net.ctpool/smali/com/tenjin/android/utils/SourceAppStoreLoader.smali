.class public Lcom/tenjin/android/utils/SourceAppStoreLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SourceAppStoreGetter"


# instance fields
.field private sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    if-nez p1, :cond_0

    const-string p1, "Tenjin"

    const-string v0, "invalid input param"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lcom/tenjin/android/TenjinSDK;->getAppStore()Lcom/tenjin/android/TenjinSDK$AppStoreType;

    move-result-object v0

    iput-object v0, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/tenjin/android/utils/SourceAppStoreLoader;->loadFromManifest(Landroid/content/Context;)V

    :cond_1
    iget-object p1, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    if-nez p1, :cond_2

    sget-object p1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    iput-object p1, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sourceAppStore = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SourceAppStoreGetter"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static cleanStoreName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\s"

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private loadFromManifest(Landroid/content/Context;)V
    .locals 3

    const-string v0, "SourceAppStoreGetter"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x80

    :try_start_0
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "TENJIN_APP_STORE"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "store metadata value = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lcom/tenjin/android/utils/SourceAppStoreLoader;->cleanStoreName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK$AppStoreType;->valueOf(Ljava/lang/String;)Lcom/tenjin/android/TenjinSDK$AppStoreType;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to load app store type from manifest: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    :goto_0
    return-void
.end method


# virtual methods
.method public getSourceAppStore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/utils/SourceAppStoreLoader;->sourceAppStore:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

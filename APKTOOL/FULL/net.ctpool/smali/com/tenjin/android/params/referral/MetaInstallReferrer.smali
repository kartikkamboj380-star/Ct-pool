.class public Lcom/tenjin/android/params/referral/MetaInstallReferrer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getFacebookAppId(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "string"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "facebook_app_id"

    invoke-virtual {v1, v3, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getProviderUri(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.facebook.katana.provider.InstallReferrerProvider"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "content://com.facebook.katana.provider.InstallReferrerProvider/"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "com.instagram.contentprovider.InstallReferrerProvider"

    invoke-virtual {p1, v0, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "content://com.instagram.contentprovider.InstallReferrerProvider/"

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public getInstallReferrerInfo(Landroid/content/Context;)Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;
    .locals 11

    const-string v0, "actual_timestamp"

    const-string v1, "is_ct"

    const-string v2, "install_referrer"

    const/4 v3, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/tenjin/android/params/referral/MetaInstallReferrer;->getFacebookAppId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v4}, Lcom/tenjin/android/params/referral/MetaInstallReferrer;->getProviderUri(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    if-nez v6, :cond_0

    return-object v3

    :cond_0
    filled-new-array {v2, v1, v0}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_5

    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    const/4 v4, -0x1

    if-eq v2, v4, :cond_4

    if-eq v0, v4, :cond_4

    if-ne v1, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    new-instance v0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;

    invoke-direct {v0, v2, v4, v5, v1}, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;-><init>(Ljava/lang/String;JZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v3, p1

    goto :goto_3

    :cond_4
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v3

    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_6
    return-object v3

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_0
    move-object p1, v3

    goto :goto_4

    :goto_3
    if-eqz v3, :cond_7

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_7
    throw v0

    :catch_1
    :goto_4
    if-eqz p1, :cond_8

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_8
    return-object v3
.end method

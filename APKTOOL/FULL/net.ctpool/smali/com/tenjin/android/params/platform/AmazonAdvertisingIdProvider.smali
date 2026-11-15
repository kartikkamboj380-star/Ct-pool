.class public Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;


# instance fields
.field private final contentResolver:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;->contentResolver:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;->contentResolver:Landroid/content/ContentResolver;

    const-string v1, "advertising_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Z
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/params/platform/AmazonAdvertisingIdProvider;->contentResolver:Landroid/content/ContentResolver;

    const-string v1, "limit_ad_tracking"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

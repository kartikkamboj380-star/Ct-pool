.class public Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/params/platform/IAdvertisingIdProvider;


# instance fields
.field private final adInfoObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;->adInfoObject:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;->adInfoObject:Ljava/lang/Object;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getId"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Z
    .locals 4

    iget-object v0, p0, Lcom/tenjin/android/params/platform/GoogleAdvertisingIdProvider;->adInfoObject:Ljava/lang/Object;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLimitAdTrackingEnabled"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lcom/tenjin/android/utils/Reflection;->runInstanceMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

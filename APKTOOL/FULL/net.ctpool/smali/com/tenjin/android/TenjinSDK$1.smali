.class Lcom/tenjin/android/TenjinSDK$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/utils/TenjinStartup$StartupCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/TenjinSDK;->startup()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;


# direct methods
.method constructor <init>(Lcom/tenjin/android/TenjinSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$1;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartupComplete(Lcom/tenjin/android/params/AttributionParams;Lcom/tenjin/android/params/platform/PlatformParams;)V
    .locals 2

    const-string v0, "TenjinStartup"

    const-string v1, "Startup completed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$1;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1300(Lcom/tenjin/android/TenjinSDK;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$1;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$1300(Lcom/tenjin/android/TenjinSDK;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

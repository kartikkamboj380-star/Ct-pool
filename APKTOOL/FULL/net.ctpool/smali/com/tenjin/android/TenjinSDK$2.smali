.class Lcom/tenjin/android/TenjinSDK$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$2;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$2;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1400(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$2;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$1500(Lcom/tenjin/android/TenjinSDK;)Lcom/tenjin/android/utils/TenjinStartup;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tenjin/android/utils/TenjinStartup;->doStartup()V

    const-string v1, "TenjinSDK"

    const-string v2, "Releasing startup lock"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

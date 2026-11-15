.class Lcom/tenjin/android/utils/TenjinStartup$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/utils/TenjinStartup;->doStartup()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/utils/TenjinStartup;

.field final synthetic val$wrapper:Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;


# direct methods
.method constructor <init>(Lcom/tenjin/android/utils/TenjinStartup;Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/utils/TenjinStartup$2;->this$0:Lcom/tenjin/android/utils/TenjinStartup;

    iput-object p2, p0, Lcom/tenjin/android/utils/TenjinStartup$2;->val$wrapper:Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "Starting advertising id retrieval"

    const-string v1, "TenjinStartup"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup$2;->val$wrapper:Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;

    iget-object v2, p0, Lcom/tenjin/android/utils/TenjinStartup$2;->this$0:Lcom/tenjin/android/utils/TenjinStartup;

    invoke-static {v2}, Lcom/tenjin/android/utils/TenjinStartup;->access$200(Lcom/tenjin/android/utils/TenjinStartup;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tenjin/android/params/platform/PlatformParams;->getParamsForPlatform(Landroid/content/Context;)Lcom/tenjin/android/params/platform/PlatformParams;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;->setParams(Lcom/tenjin/android/params/platform/PlatformParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const-string v0, "Completed advertising id retrieval"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

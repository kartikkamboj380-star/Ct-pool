.class Lcom/tenjin/android/utils/TenjinStartup$1;
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


# direct methods
.method constructor <init>(Lcom/tenjin/android/utils/TenjinStartup;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/utils/TenjinStartup$1;->this$0:Lcom/tenjin/android/utils/TenjinStartup;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "Starting attribution retrieval"

    const-string v1, "TenjinStartup"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup$1;->this$0:Lcom/tenjin/android/utils/TenjinStartup;

    invoke-static {v0}, Lcom/tenjin/android/utils/TenjinStartup;->access$100(Lcom/tenjin/android/utils/TenjinStartup;)Lcom/tenjin/android/params/AttributionParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tenjin/android/params/AttributionParams;->getAttribution()V

    const-string v0, "Completed attribution retrieval"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

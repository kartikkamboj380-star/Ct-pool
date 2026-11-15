.class Lcom/tenjin/android/TenjinSDK$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/TenjinSDK;->sendResultToAttributionInfoCallback(Lcom/tenjin/android/AttributionInfoCallback;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;

.field final synthetic val$callback:Lcom/tenjin/android/AttributionInfoCallback;


# direct methods
.method constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$4;->this$0:Lcom/tenjin/android/TenjinSDK;

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$4;->val$callback:Lcom/tenjin/android/AttributionInfoCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$4;->val$callback:Lcom/tenjin/android/AttributionInfoCallback;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$4;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$3100(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tenjin/android/AttributionInfoCallback;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

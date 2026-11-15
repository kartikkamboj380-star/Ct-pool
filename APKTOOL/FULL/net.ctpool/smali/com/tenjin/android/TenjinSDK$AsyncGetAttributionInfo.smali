.class Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncGetAttributionInfo"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/tenjin/android/Callback;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

    return-void
.end method

.method private fetchAndReturnUserData()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "api_key"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {v1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    const-string v2, "https://track.tenjin.com/v0/user"

    invoke-virtual {v1, v2, v0}, Lcom/tenjin/android/HttpConnection;->getUser(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

    invoke-static {v1, v2, v0}, Lcom/tenjin/android/TenjinSDK;->access$3000(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/AttributionInfoCallback;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Lcom/tenjin/android/Callback;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->doInBackground([Lcom/tenjin/android/Callback;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Lcom/tenjin/android/Callback;)Ljava/lang/String;
    .locals 10

    .line 2
    const/4 p1, 0x0

    const/4 v0, 0x0

    move-object v1, p1

    :goto_0
    const/4 v2, 0x5

    if-ge v0, v2, :cond_2

    :try_start_0
    const-string v3, "TenjinSDK"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Attempting to retrieve getAttributionInfo, attempt "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " of "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v2}, Lcom/tenjin/android/TenjinSDK;->access$1600(Lcom/tenjin/android/TenjinSDK;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->fetchAndReturnUserData()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    if-eqz v1, :cond_1

    const-string v2, "[\\s]+"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "{}"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    int-to-double v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    mul-double/2addr v6, v8

    mul-double/2addr v6, v2

    double-to-long v2, v6

    const-wide/16 v6, 0x2710

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v5

    goto :goto_0

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object p1

    :cond_2
    :goto_3
    return-object v1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->this$0:Lcom/tenjin/android/TenjinSDK;

    const-string v1, "eventGetAttributionInfo"

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetAttributionInfo;->attributionInfoCallback:Lcom/tenjin/android/AttributionInfoCallback;

    invoke-static {v0, p1, v1, v2}, Lcom/tenjin/android/TenjinSDK;->access$2700(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    return-void
.end method

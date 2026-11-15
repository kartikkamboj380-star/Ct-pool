.class Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncUpdateConversion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private conversionValue:Ljava/lang/Integer;

.field private eventId:Ljava/lang/String;

.field private postParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;


# direct methods
.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->conversionValue:Ljava/lang/Integer;

    const-string p1, "requestConversionUpdate"

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/tenjin/android/model/EventKey;->getEventKey(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->eventId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/Integer;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;-><init>(Lcom/tenjin/android/TenjinSDK;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    const-string p1, "TenjinSDK"

    const-string v0, "Starting conversion task"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string p1, "Authorization"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Basic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "conversion_value"

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->conversionValue:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0, p1}, Lcom/tenjin/android/TenjinSDK;->access$1000(Lcom/tenjin/android/TenjinSDK;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->postParams:Ljava/util/Map;

    new-instance p1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {p1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    const-string v0, "https://track.tenjin.com/v0/conversion-values"

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->postParams:Ljava/util/Map;

    invoke-virtual {p1, v0, v2, v1}, Lcom/tenjin/android/HttpConnection;->connect(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->eventId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$1100(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->eventId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$1200(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncUpdateConversion;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.class Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncGetDeeplink"
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
.field private final callback:Lcom/tenjin/android/Callback;

.field final synthetic this$0:Lcom/tenjin/android/TenjinSDK;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->callback:Lcom/tenjin/android/Callback;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Lcom/tenjin/android/Callback;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->doInBackground([Lcom/tenjin/android/Callback;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Lcom/tenjin/android/Callback;)Ljava/lang/String;
    .locals 8

    .line 2
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$1800(Lcom/tenjin/android/TenjinSDK;)Landroid/content/Context;

    move-result-object p1

    const-string v0, "tenjinInstallPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v0, 0x1

    const-string v2, "tenjinFirstLaunchKey"

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v3, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v3}, Lcom/tenjin/android/TenjinSDK;->access$1600(Lcom/tenjin/android/TenjinSDK;)Z

    move-result v3

    const-string v4, "https://track.tenjin.com/v0/user"

    const-string v5, "api_key"

    if-eqz v3, :cond_2

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {v1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    invoke-virtual {v1, v4, p1}, Lcom/tenjin/android/HttpConnection;->getUser(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->callback:Lcom/tenjin/android/Callback;

    invoke-static {v1, v2, p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$2500(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;Ljava/lang/String;Z)V

    :cond_1
    return-object p1

    :cond_2
    iget-object v3, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v6, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->callback:Lcom/tenjin/android/Callback;

    invoke-static {v3, v6}, Lcom/tenjin/android/TenjinSDK;->access$2602(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;)Lcom/tenjin/android/Callback;

    const-wide/16 v6, 0x1388

    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    if-eqz v0, :cond_3

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {v1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    invoke-virtual {v1, v4, p1}, Lcom/tenjin/android/HttpConnection;->getUser(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->callback:Lcom/tenjin/android/Callback;

    invoke-static {v1, v2, p1, v0}, Lcom/tenjin/android/TenjinSDK;->access$2500(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/Callback;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->this$0:Lcom/tenjin/android/TenjinSDK;

    const-string v1, "eventGetDeeplink"

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncGetDeeplink;->callback:Lcom/tenjin/android/Callback;

    invoke-static {v0, p1, v1, v2}, Lcom/tenjin/android/TenjinSDK;->access$2700(Lcom/tenjin/android/TenjinSDK;Ljava/lang/String;Ljava/lang/String;Lcom/tenjin/android/BasicCallback;)V

    return-void
.end method

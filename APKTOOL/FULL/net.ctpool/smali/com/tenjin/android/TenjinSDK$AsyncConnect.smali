.class Lcom/tenjin/android/TenjinSDK$AsyncConnect;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncConnect"
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
.method private constructor <init>(Lcom/tenjin/android/TenjinSDK;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;Lcom/tenjin/android/TenjinSDK$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncConnect;-><init>(Lcom/tenjin/android/TenjinSDK;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 5

    .line 1
    const-string p1, "TenjinSDK"

    const-string v0, "Starting connect task"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    :try_start_0
    const-string v0, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Basic "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v2}, Lcom/tenjin/android/TenjinSDK;->access$900(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const/16 v3, 0xa

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TenjinSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ready to connect - lock available? "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v3}, Lcom/tenjin/android/TenjinSDK;->access$1600(Lcom/tenjin/android/TenjinSDK;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1400(Lcom/tenjin/android/TenjinSDK;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v1, "TenjinSDK"

    const-string v3, "Acquired startup lock, sending connect."

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v1}, Lcom/tenjin/android/TenjinSDK;->access$1700(Lcom/tenjin/android/TenjinSDK;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->postParams:Ljava/util/Map;

    new-instance v1, Lcom/tenjin/android/HttpConnection;

    invoke-direct {v1}, Lcom/tenjin/android/HttpConnection;-><init>()V

    const-string v3, "https://track.tenjin.com/v0/event"

    iget-object v4, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->postParams:Ljava/util/Map;

    invoke-virtual {v1, v3, v4, v2}, Lcom/tenjin/android/HttpConnection;->connect(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->postParams:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "referrer"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0}, Lcom/tenjin/android/TenjinSDK;->access$1800(Lcom/tenjin/android/TenjinSDK;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "tenjinInstallPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "tenjinInstallReferrerSent"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "TenjinSDK"

    const-string v2, "Confirmed referral sent"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "tenjinInstallReferrerSent"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    invoke-static {}, Lcom/tenjin/android/TenjinSDK;->access$1900()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/tenjin/android/TenjinSDK;->access$1900()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tenjin/android/TenjinSDK;->access$2002(Lcom/tenjin/android/TenjinSDK;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->this$0:Lcom/tenjin/android/TenjinSDK;

    invoke-static {p1}, Lcom/tenjin/android/TenjinSDK;->access$2100(Lcom/tenjin/android/TenjinSDK;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/tenjin/android/TenjinSDK$AsyncConnect;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

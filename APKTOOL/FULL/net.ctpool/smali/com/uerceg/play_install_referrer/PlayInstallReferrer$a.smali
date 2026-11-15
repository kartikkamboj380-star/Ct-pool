.class Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/installreferrer/api/InstallReferrerStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->getInstallReferrerInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/android/installreferrer/api/InstallReferrerClient;

.field final synthetic b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;


# direct methods
.method constructor <init>(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;Lcom/android/installreferrer/api/InstallReferrerClient;)V
    .locals 0

    iput-object p1, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    iput-object p2, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->a:Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInstallReferrerServiceDisconnected()V
    .locals 0

    return-void
.end method

.method public onInstallReferrerSetupFinished(I)V
    .locals 14

    const/4 v0, -0x1

    const-string v1, "responseCode"

    const-string v2, "play_install_referrer_error"

    const-string v3, "message"

    if-eq p1, v0, :cond_5

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "DEVELOPER_ERROR"

    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$500(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1, v2, p1}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->a(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto/16 :goto_2

    :cond_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "FEATURE_NOT_SUPPORTED"

    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$300(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "SERVICE_UNAVAILABLE"

    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$400(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    goto :goto_0

    :cond_3
    :try_start_0
    iget-object p1, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->a:Lcom/android/installreferrer/api/InstallReferrerClient;

    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->getInstallReferrer()Lcom/android/installreferrer/api/ReferrerDetails;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampSeconds()J

    move-result-wide v4

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampSeconds()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampServerSeconds()J

    move-result-wide v8

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampServerSeconds()J

    move-result-wide v10

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getGooglePlayInstantParam()Z

    move-result p1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v12

    const-string v13, "installReferrer"

    invoke-interface {v12, v13, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "referrerClickTimestampSeconds"

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v12, v0, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "installBeginTimestampSeconds"

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v12, v0, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "referrerClickTimestampServerSeconds"

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v12, v0, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "installBeginTimestampServerSeconds"

    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v12, v0, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "installVersion"

    invoke-interface {v12, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "googlePlayInstant"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v12, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {p1}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$000(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const-string v1, "play_install_referrer_value"

    invoke-static {p1, v0, v1, v12}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->a(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "Response from install referrer library was null"

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$100(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-static {v0, v1, v2, p1}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->a(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception while reading install referrer info: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {p1}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$200(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-static {p1, v1, v2, v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->a(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_2

    :cond_5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "SERVICE_DISCONNECTED"

    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/uerceg/play_install_referrer/PlayInstallReferrer$a;->b:Lcom/uerceg/play_install_referrer/PlayInstallReferrer;

    invoke-static {v0}, Lcom/uerceg/play_install_referrer/PlayInstallReferrer;->access$600(Lcom/uerceg/play_install_referrer/PlayInstallReferrer;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    goto/16 :goto_0

    :goto_2
    return-void
.end method

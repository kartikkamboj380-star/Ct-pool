.class public Lapp/notifee/core/model/NotificationAndroidActionModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private mNotificationAndroidActionBundle:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    return-void
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidActionModel;
    .locals 1

    new-instance v0, Lapp/notifee/core/model/NotificationAndroidActionModel;

    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationAndroidActionModel;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getIcon()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    const-string v1, "icon"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPressAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;
    .locals 2

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    const-string v1, "pressAction"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    move-result-object v0

    return-object v0
.end method

.method public getRemoteInput(Landroidx/core/app/k$a$a;)Landroidx/core/app/Y;
    .locals 4

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    const-string v1, "input"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/core/app/Y$d;

    const-string v2, "app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY"

    invoke-direct {v1, v2}, Landroidx/core/app/Y$d;-><init>(Ljava/lang/String;)V

    const-string v2, "allowFreeFormInput"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/core/app/Y$d;->b(Z)Landroidx/core/app/Y$d;

    :cond_0
    const-string v2, "allowGeneratedReplies"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p1, v2}, Landroidx/core/app/k$a$a;->d(Z)Landroidx/core/app/k$a$a;

    :cond_1
    const-string p1, "placeholder"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/core/app/Y$d;->e(Ljava/lang/CharSequence;)Landroidx/core/app/Y$d;

    :cond_2
    const-string p1, "choices"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/CharSequence;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/CharSequence;

    invoke-virtual {v1, p1}, Landroidx/core/app/Y$d;->c([Ljava/lang/CharSequence;)Landroidx/core/app/Y$d;

    :cond_3
    const-string p1, "editableChoices"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    :goto_0
    invoke-virtual {v1, p1}, Landroidx/core/app/Y$d;->d(I)Landroidx/core/app/Y$d;

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Landroidx/core/app/Y$d;->a()Landroidx/core/app/Y;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidActionModel;->mNotificationAndroidActionBundle:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    return-object v0
.end method

.class public Lapp/notifee/core/model/NotificationAndroidStyleModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "NotificationAndroidStyle"


# instance fields
.field private mNotificationAndroidStyleBundle:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    return-void
.end method

.method public static synthetic a(Lapp/notifee/core/model/NotificationAndroidStyleModel;Ljava/util/concurrent/Executor;)Landroidx/core/app/k$h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->lambda$getMessagingStyleTask$2(Ljava/util/concurrent/Executor;)Landroidx/core/app/k$h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lapp/notifee/core/model/NotificationAndroidStyleModel;)Landroidx/core/app/k$h;
    .locals 0

    .line 1
    invoke-direct {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->lambda$getBigPictureStyleTask$1()Landroidx/core/app/k$h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/os/Bundle;)Landroidx/core/app/W;
    .locals 0

    .line 1
    invoke-static {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->lambda$getPerson$0(Landroid/os/Bundle;)Landroidx/core/app/W;

    move-result-object p0

    return-object p0
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lapp/notifee/core/model/NotificationAndroidStyleModel;
    .locals 1

    new-instance v0, Lapp/notifee/core/model/NotificationAndroidStyleModel;

    invoke-direct {v0, p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private getBigPictureStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lz3/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Lw0/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lw0/a;-><init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private getBigTextStyle()Landroidx/core/app/k$c;
    .locals 4

    new-instance v0, Landroidx/core/app/k$c;

    invoke-direct {v0}, Landroidx/core/app/k$c;-><init>()V

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "text"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "title"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$c;->i(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "summary"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$c;->j(Ljava/lang/CharSequence;)Landroidx/core/app/k$c;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private getInboxStyle()Landroidx/core/app/k$f;
    .locals 5

    new-instance v0, Landroidx/core/app/k$f;

    invoke-direct {v0}, Landroidx/core/app/k$f;-><init>()V

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "title"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$f;->i(Ljava/lang/CharSequence;)Landroidx/core/app/k$f;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "summary"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$f;->j(Ljava/lang/CharSequence;)Landroidx/core/app/k$f;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "lines"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    move v2, v3

    :goto_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/core/app/k$f;->h(Ljava/lang/CharSequence;)Landroidx/core/app/k$f;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private getMessagingStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lz3/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Lw0/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lw0/c;-><init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;Ljava/util/concurrent/Executor;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private static getPerson(Ljava/util/concurrent/Executor;Landroid/os/Bundle;)Lz3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroid/os/Bundle;",
            ")",
            "Lz3/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Lw0/b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw0/b;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private lambda$getBigPictureStyleTask$1()Landroidx/core/app/k$h;
    .locals 9

    new-instance v0, Landroidx/core/app/k$b;

    invoke-direct {v0}, Landroidx/core/app/k$b;-><init>()V

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "picture"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v3, 0xa

    const-string v5, "NotificationAndroidStyle"

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-static {v1}, LS5/o;->c(Ljava/lang/String;)Lz3/l;

    move-result-object v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4, v7}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2

    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "An error occurred whilst trying to retrieve a big picture style image: "

    :goto_1
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_3

    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Timeout occurred whilst trying to retrieve a big picture style image: "

    goto :goto_1

    :goto_3
    move-object v2, v6

    :goto_4
    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Landroidx/core/app/k$b;->i(Landroid/graphics/Bitmap;)Landroidx/core/app/k$b;

    :cond_0
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "largeIcon"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {v0, v6}, Landroidx/core/app/k$b;->h(Landroid/graphics/Bitmap;)Landroidx/core/app/k$b;

    goto :goto_5

    :cond_1
    move-object v1, v6

    :cond_2
    :goto_5
    if-eqz v1, :cond_3

    :try_start_1
    invoke-static {v1}, LS5/o;->c(Ljava/lang/String;)Lz3/l;

    move-result-object v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4, v7}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object v6, v2

    goto :goto_9

    :catch_2
    move-exception v2

    goto :goto_6

    :catch_3
    move-exception v2

    goto :goto_8

    :goto_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "An error occurred whilst trying to retrieve a big picture style large icon: "

    :goto_7
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_9

    :goto_8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Timeout occurred whilst trying to retrieve a big picture style large icon: "

    goto :goto_7

    :goto_9
    if-eqz v6, :cond_3

    invoke-virtual {v0, v6}, Landroidx/core/app/k$b;->h(Landroid/graphics/Bitmap;)Landroidx/core/app/k$b;

    :cond_3
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "title"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$b;->j(Ljava/lang/CharSequence;)Landroidx/core/app/k$b;

    move-result-object v0

    :cond_4
    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v2, "summary"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$b;->k(Ljava/lang/CharSequence;)Landroidx/core/app/k$b;

    move-result-object v0

    :cond_5
    return-object v0
.end method

.method private lambda$getMessagingStyleTask$2(Ljava/util/concurrent/Executor;)Landroidx/core/app/k$h;
    .locals 12

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v1, "person"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getPerson(Ljava/util/concurrent/Executor;Landroid/os/Bundle;)Lz3/l;

    move-result-object v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x14

    invoke-static {v0, v3, v4, v2}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/W;

    new-instance v2, Landroidx/core/app/k$g;

    invoke-direct {v2, v0}, Landroidx/core/app/k$g;-><init>(Landroidx/core/app/W;)V

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v5, "title"

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/core/app/k$g;->k(Ljava/lang/CharSequence;)Landroidx/core/app/k$g;

    move-result-object v2

    :cond_0
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v5, "group"

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v2, v0}, Landroidx/core/app/k$g;->l(Z)Landroidx/core/app/k$g;

    move-result-object v2

    :cond_1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    const-string v5, "messages"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    move v5, v6

    :goto_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/os/Bundle;

    const-string v8, "timestamp"

    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, LS5/m;->d(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v7, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v10}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getPerson(Ljava/util/concurrent/Executor;Landroid/os/Bundle;)Lz3/l;

    move-result-object v10

    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v10, v3, v4, v11}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/core/app/W;

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    const-string v11, "text"

    invoke-virtual {v7, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v7

    invoke-virtual {v2, v7, v8, v9, v10}, Landroidx/core/app/k$g;->i(Ljava/lang/CharSequence;JLandroidx/core/app/W;)Landroidx/core/app/k$g;

    move-result-object v2

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method private static synthetic lambda$getPerson$0(Landroid/os/Bundle;)Landroidx/core/app/W;
    .locals 7

    const-string v0, "NotificationAndroidStyle"

    new-instance v1, Landroidx/core/app/W$b;

    invoke-direct {v1}, Landroidx/core/app/W$b;-><init>()V

    const-string v2, "name"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/W$b;->f(Ljava/lang/CharSequence;)Landroidx/core/app/W$b;

    const-string v2, "id"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/W$b;->e(Ljava/lang/String;)Landroidx/core/app/W$b;

    :cond_0
    const-string v2, "bot"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/core/app/W$b;->b(Z)Landroidx/core/app/W$b;

    :cond_1
    const-string v2, "important"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/core/app/W$b;->d(Z)Landroidx/core/app/W$b;

    :cond_2
    const-string v2, "icon"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-static {v2}, LS5/o;->c(Ljava/lang/String;)Lz3/l;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0xa

    invoke-static {v3, v5, v6, v4}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v3

    goto :goto_0

    :catch_1
    move-exception v3

    goto :goto_2

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "An error occurred whilst trying to retrieve a person icon: "

    :goto_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v3}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_3

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Timeout occurred whilst trying to retrieve a person icon: "

    goto :goto_1

    :goto_3
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_3

    invoke-static {v3}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/core/app/W$b;->c(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/W$b;

    :cond_3
    const-string v0, "uri"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroidx/core/app/W$b;->g(Ljava/lang/String;)Landroidx/core/app/W$b;

    :cond_4
    invoke-virtual {v1}, Landroidx/core/app/W$b;->a()Landroidx/core/app/W;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lz3/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LS5/m;->a(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-direct {p0, p1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getMessagingStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-direct {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getInboxStyle()Landroidx/core/app/k$f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-static {p1}, Lz3/o;->f(Ljava/lang/Object;)Lz3/l;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-direct {p0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getBigTextStyle()Landroidx/core/app/k$c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-direct {p0, p1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getBigPictureStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_1
    return-object p1
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lapp/notifee/core/model/NotificationAndroidStyleModel;->mNotificationAndroidStyleBundle:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    return-object v0
.end method

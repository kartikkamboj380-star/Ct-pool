.class public final synthetic Lu0/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidModel;

.field public final synthetic b:Lapp/notifee/core/model/NotificationModel;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/B0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    iput-object p2, p0, Lu0/B0;->b:Lapp/notifee/core/model/NotificationModel;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/B0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    iget-object v1, p0, Lu0/B0;->b:Lapp/notifee/core/model/NotificationModel;

    invoke-static {v0, v1}, Lu0/R0;->a(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)Landroidx/core/app/k$e;

    move-result-object v0

    return-object v0
.end method

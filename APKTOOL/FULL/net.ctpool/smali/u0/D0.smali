.class public final synthetic Lu0/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidModel;

.field public final synthetic b:Lapp/notifee/core/model/NotificationModel;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/D0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    iput-object p2, p0, Lu0/D0;->b:Lapp/notifee/core/model/NotificationModel;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/D0;->a:Lapp/notifee/core/model/NotificationAndroidModel;

    iget-object v1, p0, Lu0/D0;->b:Lapp/notifee/core/model/NotificationModel;

    invoke-static {v0, v1, p1}, Lu0/R0;->b(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;Lz3/l;)Landroidx/core/app/k$e;

    move-result-object p1

    return-object p1
.end method

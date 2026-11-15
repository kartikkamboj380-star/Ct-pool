.class public final synthetic Lu0/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationModel;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/P0;->a:Lapp/notifee/core/model/NotificationModel;

    iput-object p2, p0, Lu0/P0;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/P0;->a:Lapp/notifee/core/model/NotificationModel;

    iget-object v1, p0, Lu0/P0;->b:Landroid/os/Bundle;

    invoke-static {v0, v1, p1}, Lu0/R0;->i(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;Lz3/l;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

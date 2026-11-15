.class public final synthetic Lu0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lapp/notifee/core/model/NotificationModel;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LS5/r;


# direct methods
.method public synthetic constructor <init>(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;LS5/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/t0;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lu0/t0;->b:Lapp/notifee/core/model/NotificationModel;

    iput-object p3, p0, Lu0/t0;->c:Ljava/lang/String;

    iput-object p4, p0, Lu0/t0;->d:LS5/r;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu0/t0;->a:Landroid/os/Bundle;

    iget-object v1, p0, Lu0/t0;->b:Lapp/notifee/core/model/NotificationModel;

    iget-object v2, p0, Lu0/t0;->c:Ljava/lang/String;

    iget-object v3, p0, Lu0/t0;->d:LS5/r;

    invoke-static {v0, v1, v2, v3, p1}, Lu0/w0;->g(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;LS5/r;Lz3/l;)V

    return-void
.end method

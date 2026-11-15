.class public final synthetic Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidStyleModel;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/a;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw0/a;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    invoke-static {v0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->b(Lapp/notifee/core/model/NotificationAndroidStyleModel;)Landroidx/core/app/k$h;

    move-result-object v0

    return-object v0
.end method

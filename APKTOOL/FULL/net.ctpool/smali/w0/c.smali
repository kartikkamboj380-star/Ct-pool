.class public final synthetic Lw0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

.field public final synthetic b:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/model/NotificationAndroidStyleModel;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/c;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    iput-object p2, p0, Lw0/c;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/c;->a:Lapp/notifee/core/model/NotificationAndroidStyleModel;

    iget-object v1, p0, Lw0/c;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->a(Lapp/notifee/core/model/NotificationAndroidStyleModel;Ljava/util/concurrent/Executor;)Landroidx/core/app/k$h;

    move-result-object v0

    return-object v0
.end method

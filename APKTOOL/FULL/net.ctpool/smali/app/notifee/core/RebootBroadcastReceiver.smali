.class public Lapp/notifee/core/RebootBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p2, "RebootReceiver"

    const-string v0, "Received reboot event"

    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, LS5/e;->a:Landroid/content/Context;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LS5/e;->a(Landroid/content/Context;)V

    :cond_0
    new-instance p1, Lu0/w0;

    invoke-direct {p1}, Lu0/w0;-><init>()V

    invoke-virtual {p1}, Lu0/w0;->j()V

    return-void
.end method

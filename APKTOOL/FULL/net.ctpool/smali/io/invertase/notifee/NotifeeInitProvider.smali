.class public Lio/invertase/notifee/NotifeeInitProvider;
.super Lapp/notifee/core/InitProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lapp/notifee/core/InitProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()Z
    .locals 2

    invoke-super {p0}, Lapp/notifee/core/InitProvider;->onCreate()Z

    move-result v0

    new-instance v1, Lio/invertase/notifee/NotifeeEventSubscriber;

    invoke-direct {v1}, Lio/invertase/notifee/NotifeeEventSubscriber;-><init>()V

    invoke-static {v1}, Lapp/notifee/core/Notifee;->initialize(Lapp/notifee/core/interfaces/EventListener;)V

    return v0
.end method

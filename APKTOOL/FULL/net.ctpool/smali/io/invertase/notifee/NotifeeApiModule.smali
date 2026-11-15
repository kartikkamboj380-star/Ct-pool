.class public Lio/invertase/notifee/NotifeeApiModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lm2/h;


# static fields
.field private static final NOTIFICATION_TYPE_ALL:I = 0x0

.field private static final NOTIFICATION_TYPE_DISPLAYED:I = 0x1

.field private static final NOTIFICATION_TYPE_TRIGGER:I = 0x2


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public static synthetic A(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$requestPermission$25(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic B(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$createChannelGroups$10(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic C(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$createChannel$7(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic D(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$createChannels$8(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic E(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getDisplayedNotifications$4(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic F(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getChannelGroups$18(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic G(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$isBatteryOptimizationEnabled$29(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$cancelAllNotifications$0(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$displayNotification$13(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$createChannelGroup$9(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$deleteChannel$11(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getTriggerNotificationIds$6(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$requestPermission$26(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$isChannelBlocked$21(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static getMainComponent(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {v0, p0}, Lapp/notifee/core/Notifee;->getMainComponent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$openBatteryOptimizationSettings$28(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$cancelDisplayedNotifications$1(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$cancelAllNotificationsWithIds$3(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic k(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$cancelTriggerNotifications$2(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getPowerManagerInfo$30(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$cancelAllNotifications$0(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$cancelAllNotificationsWithIds$3(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$cancelDisplayedNotifications$1(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$cancelTriggerNotifications$2(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$createChannel$7(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$createChannelGroup$9(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$createChannelGroups$10(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$createChannels$8(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$createTriggerNotification$15(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$deleteChannel$11(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$deleteChannelGroup$12(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$displayNotification$13(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$getChannel$17(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$getChannelGroup$19(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$getChannelGroups$18(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method private static synthetic lambda$getChannels$16(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method private static synthetic lambda$getDisplayedNotifications$4(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method private static synthetic lambda$getInitialNotification$22(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$getNotificationSettings$23(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$getPowerManagerInfo$30(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$getTriggerNotificationIds$6(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->o(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method private static synthetic lambda$getTriggerNotifications$5(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method private static synthetic lambda$isBatteryOptimizationEnabled$29(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->k(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic lambda$isChannelBlocked$21(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->k(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic lambda$isChannelCreated$20(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->k(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic lambda$openAlarmPermissionSettings$14(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$openBatteryOptimizationSettings$28(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$openNotificationSettings$27(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$openPowerManagerSettings$31(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic lambda$requestPermission$24(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$requestPermission$25(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$requestPermission$26(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/invertase/notifee/L;->m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method private static synthetic lambda$stopForegroundService$32(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/invertase/notifee/L;->l(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic m(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getTriggerNotifications$5(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic n(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$createTriggerNotification$15(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic o(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$isChannelCreated$20(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic p(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getInitialNotification$22(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic q(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$stopForegroundService$32(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic r(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$deleteChannelGroup$12(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic s(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$openPowerManagerSettings$31(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic t(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getNotificationSettings$23(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic u(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$requestPermission$24(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic v(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$openNotificationSettings$27(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic w(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getChannelGroup$19(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic x(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getChannels$16(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic y(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$openAlarmPermissionSettings$14(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic z(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/invertase/notifee/NotifeeApiModule;->lambda$getChannel$17(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public cancelAllNotifications(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/n;

    invoke-direct {v1, p1}, Lio/invertase/notifee/n;-><init>(Lcom/facebook/react/bridge/Promise;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public cancelAllNotificationsWithIds(Lcom/facebook/react/bridge/ReadableArray;ILjava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/F;

    invoke-direct {v1, p4}, Lio/invertase/notifee/F;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, p2, v0, p3, v1}, Lapp/notifee/core/Notifee;->cancelAllNotificationsWithIds(ILjava/util/List;Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public cancelDisplayedNotifications(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/G;

    invoke-direct {v1, p1}, Lio/invertase/notifee/G;-><init>(Lcom/facebook/react/bridge/Promise;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public cancelTriggerNotifications(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/u;

    invoke-direct {v1, p1}, Lio/invertase/notifee/u;-><init>(Lcom/facebook/react/bridge/Promise;)V

    const/4 p1, 0x2

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public createChannel(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/f;

    invoke-direct {v1, p2}, Lio/invertase/notifee/f;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->createChannel(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public createChannelGroup(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/b;

    invoke-direct {v1, p2}, Lio/invertase/notifee/b;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->createChannelGroup(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public createChannelGroups(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/a;

    invoke-direct {v1, p2}, Lio/invertase/notifee/a;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v1}, Lapp/notifee/core/Notifee;->createChannelGroups(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public createChannels(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/c;

    invoke-direct {v1, p2}, Lio/invertase/notifee/c;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v1}, Lapp/notifee/core/Notifee;->createChannels(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public createTriggerNotification(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p2}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p2

    new-instance v1, Lio/invertase/notifee/s;

    invoke-direct {v1, p3}, Lio/invertase/notifee/s;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, p2, v1}, Lapp/notifee/core/Notifee;->createTriggerNotification(Landroid/os/Bundle;Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public deleteChannel(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/y;

    invoke-direct {v1, p2}, Lio/invertase/notifee/y;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->deleteChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public deleteChannelGroup(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/g;

    invoke-direct {v1, p2}, Lio/invertase/notifee/g;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->deleteChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public displayNotification(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->toBundle(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v1, Lio/invertase/notifee/C;

    invoke-direct {v1, p2}, Lio/invertase/notifee/C;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->displayNotification(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getChannel(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/A;

    invoke-direct {v1, p2}, Lio/invertase/notifee/A;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getChannelGroup(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/z;

    invoke-direct {v1, p2}, Lio/invertase/notifee/z;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getChannelGroups(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/e;

    invoke-direct {v1, p1}, Lio/invertase/notifee/e;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getChannelGroups(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getChannels(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/k;

    invoke-direct {v1, p1}, Lio/invertase/notifee/k;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getChannels(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ANDROID_API_LEVEL"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getDisplayedNotifications(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/D;

    invoke-direct {v1, p1}, Lio/invertase/notifee/D;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getDisplayedNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getInitialNotification(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/invertase/notifee/d;

    invoke-direct {v2, p1}, Lio/invertase/notifee/d;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1, v2}, Lapp/notifee/core/Notifee;->getInitialNotification(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "NotifeeApiModule"

    return-object v0
.end method

.method public getNotificationSettings(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/E;

    invoke-direct {v1, p1}, Lio/invertase/notifee/E;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getPowerManagerInfo(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/B;

    invoke-direct {v1, p1}, Lio/invertase/notifee/B;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getPowerManagerInfo(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getTriggerNotificationIds(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/j;

    invoke-direct {v1, p1}, Lio/invertase/notifee/j;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getTriggerNotificationIds(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public getTriggerNotifications(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/x;

    invoke-direct {v1, p1}, Lio/invertase/notifee/x;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getTriggerNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public hideNotificationDrawer()V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lio/invertase/notifee/L;->f()V

    return-void
.end method

.method public invalidate()V
    .locals 0

    invoke-static {}, Lio/invertase/notifee/L;->d()V

    return-void
.end method

.method public isBatteryOptimizationEnabled(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/m;

    invoke-direct {v1, p1}, Lio/invertase/notifee/m;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->isBatteryOptimizationEnabled(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public isChannelBlocked(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/w;

    invoke-direct {v1, p2}, Lio/invertase/notifee/w;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->isChannelBlocked(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public isChannelCreated(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/o;

    invoke-direct {v1, p2}, Lio/invertase/notifee/o;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1}, Lapp/notifee/core/Notifee;->isChannelCreated(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public onCatalystInstanceDestroy()V
    .locals 0

    invoke-virtual {p0}, Lio/invertase/notifee/NotifeeApiModule;->invalidate()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lapp/notifee/core/Notifee;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    move-result p1

    return p1
.end method

.method public openAlarmPermissionSettings(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/invertase/notifee/i;

    invoke-direct {v2, p1}, Lio/invertase/notifee/i;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1, v2}, Lapp/notifee/core/Notifee;->openAlarmPermissionSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public openBatteryOptimizationSettings(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/invertase/notifee/h;

    invoke-direct {v2, p1}, Lio/invertase/notifee/h;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1, v2}, Lapp/notifee/core/Notifee;->openBatteryOptimizationSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public openNotificationSettings(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/invertase/notifee/v;

    invoke-direct {v2, p2}, Lio/invertase/notifee/v;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, p1, v1, v2}, Lapp/notifee/core/Notifee;->openNotificationSettings(Ljava/lang/String;Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public openPowerManagerSettings(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/invertase/notifee/t;

    invoke-direct {v2, p1}, Lio/invertase/notifee/t;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1, v2}, Lapp/notifee/core/Notifee;->openPowerManagerSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

.method public removeListeners(Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public requestPermission(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/p;

    invoke-direct {v1, p1}, Lio/invertase/notifee/p;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    check-cast v1, Lm2/g;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to get permissionAwareActivity for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "requestPermission"

    invoke-static {v1, v0}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/q;

    invoke-direct {v1, p1}, Lio/invertase/notifee/q;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void

    :cond_1
    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v2, Lio/invertase/notifee/r;

    invoke-direct {v2, p1}, Lio/invertase/notifee/r;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v2}, Lapp/notifee/core/Notifee;->setRequestPermissionCallback(Lapp/notifee/core/interfaces/MethodCallResult;)V

    const-string p1, "android.permission.POST_NOTIFICATIONS"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2b67

    invoke-interface {v1, p1, v0, p0}, Lm2/g;->p([Ljava/lang/String;ILm2/h;)V

    return-void
.end method

.method public stopForegroundService(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {}, Lapp/notifee/core/Notifee;->getInstance()Lapp/notifee/core/Notifee;

    move-result-object v0

    new-instance v1, Lio/invertase/notifee/l;

    invoke-direct {v1, p1}, Lio/invertase/notifee/l;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lapp/notifee/core/Notifee;->stopForegroundService(Lapp/notifee/core/interfaces/MethodCallResult;)V

    return-void
.end method

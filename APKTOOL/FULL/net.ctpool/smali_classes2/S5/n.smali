.class public abstract LS5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Landroid/content/Intent;


# direct methods
.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "samsung"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "coloros"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "redmi"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "nokia"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "meizu"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_5
    const-string v5, "honor"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "vivo"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_7
    const-string v5, "oppo"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_8
    const-string v5, "letv"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_9
    const-string v5, "asus"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_0

    :cond_9
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_a
    const-string v5, "htc"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_a
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_b
    const-string v5, "xiaomi"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_b
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_c
    const-string v5, "huawei"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    move v4, v0

    goto :goto_0

    :sswitch_d
    const-string v5, "oneplus"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const-string v2, "com.samsung.android.lool"

    const-string v3, "com.samsung.android.sm.ui.battery.BatteryActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.samsung.android.sm"

    const-string v4, "com.samsung.android.sm.ui.battery.BatteryActivity"

    invoke-static {v3, v4}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.samsung.android.lool"

    const-string v5, "com.samsung.android.sm.battery.ui.BatteryActivity"

    invoke-static {v4, v5}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_1
    const-string v2, "com.evenwell.powersaving.g3"

    const-string v3, "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_2
    const-string v2, "com.meizu.safe"

    const-string v3, "com.meizu.safe.security.SHOW_APPSEC"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "android.intent.category.DEFAULT"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_3
    const-string v2, "com.huawei.systemmanager"

    const-string v3, "com.huawei.systemmanager.optimize.process.ProtectActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_4
    const-string v2, "com.iqoo.secure"

    const-string v3, "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.vivo.permissionmanager"

    const-string v4, "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"

    invoke-static {v3, v4}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.iqoo.secure"

    const-string v5, "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"

    invoke-static {v4, v5}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_5
    const-string v2, "com.coloros.safecenter"

    const-string v3, "com.coloros.safecenter.permission.startup.StartupAppListActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    const-string v2, "com.oppo.safe"

    const-string v3, "com.oppo.safe.permission.startup.StartupAppListActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const-string v2, "com.coloros.safecenter"

    const-string v3, "com.coloros.safecenter.startupapp.StartupAppListActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    const-string v2, "com.coloros.oppoguardelf"

    const-string v3, "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    const-string v2, "com.coloros.oppoguardelf"

    const-string v3, "com.coloros.powermanager.fuelgaue.PowerSaverModeActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v8

    const-string v2, "com.coloros.oppoguardelf"

    const-string v3, "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v9

    filled-new-array/range {v4 .. v9}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_6
    const-string v2, "com.letv.android.letvsafe"

    const-string v3, "com.letv.android.letvsafe.AutobootManageActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "mobilemanager://function/entry/AutoStart"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_7
    const-string v2, "com.asus.mobilemanager"

    const-string v3, "com.asus.mobilemanager.powersaver.PowerSaverSettings"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.asus.mobilemanager"

    const-string v4, "com.asus.mobilemanager.autostart.AutoStartActivity"

    invoke-static {v3, v4}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.asus.mobilemanager"

    const-string v5, "com.asus.mobilemanager.entry.FunctionActivity"

    invoke-static {v4, v5}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    const-string v5, "mobilemanager://function/entry/AutoStart"

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :pswitch_8
    const-string v2, "com.htc.pitroad"

    const-string v3, "com.htc.pitroad.landingpage.activity.LandingPageActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :pswitch_9
    const-string v2, "com.miui.securitycenter"

    const-string v3, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :pswitch_a
    const-string v2, "com.huawei.systemmanager"

    const-string v3, "com.huawei.systemmanager.optimize.process.ProtectActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.huawei.systemmanager"

    const-string v4, "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"

    invoke-static {v3, v4}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.huawei.systemmanager"

    const-string v5, "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"

    invoke-static {v4, v5}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :pswitch_b
    const-string v2, "com.oneplus.security"

    const-string v3, "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"

    invoke-static {v2, v3}, LS5/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    filled-new-array {v2}, [Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_f

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-static {p0, v2}, LS5/i;->d(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v4

    if-eqz v4, :cond_e

    const-class v4, LS5/n;

    monitor-enter v4

    :try_start_0
    sput-object v2, LS5/n;->a:Landroid/content/Intent;

    monitor-exit v4

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_e
    add-int/2addr v1, v0

    goto :goto_1

    :cond_f
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x4eb36700 -> :sswitch_d
        -0x47e95e19 -> :sswitch_c
        -0x2d450b45 -> :sswitch_b
        0x194d7 -> :sswitch_a
        0x2dd650 -> :sswitch_9
        0x32a1bb -> :sswitch_8
        0x3427a0 -> :sswitch_7
        0x373cac -> :sswitch_6
        0x5edac6a -> :sswitch_5
        0x62f84cc -> :sswitch_4
        0x6422d62 -> :sswitch_3
        0x675e5ed -> :sswitch_2
        0x3898f087 -> :sswitch_1
        0x6f28bffa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_9
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/content/ComponentName;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

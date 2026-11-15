.class Lcom/facebook/react/d;
.super Lcom/facebook/react/Y;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/P;


# instance fields
.field private final a:Lcom/facebook/react/H;

.field private final b:Lm2/b;

.field private final c:Z

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/H;Lm2/b;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/d;->b:Lm2/b;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/facebook/react/d;->c:Z

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/d;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic e(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/d;->i(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/d;)Lcom/facebook/react/H;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    return-object p0
.end method

.method private g(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/UIManagerModule;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "createUIManagerModule"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/react/d;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/d$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/d$a;-><init>(Lcom/facebook/react/d;)V

    new-instance v3, Lcom/facebook/react/uimanager/UIManagerModule;

    iget v4, p0, Lcom/facebook/react/d;->d:I

    invoke-direct {v3, p1, v0, v4}, Lcom/facebook/react/uimanager/UIManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/H0;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object v3

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/facebook/react/uimanager/UIManagerModule;

    iget-object v3, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    invoke-virtual {v3, p1}, Lcom/facebook/react/H;->G(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/facebook/react/d;->d:I

    invoke-direct {v0, p1, v3, v4}, Lcom/facebook/react/uimanager/UIManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object v0

    :goto_0
    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p1
.end method

.method private h()Lj2/a;
    .locals 14

    .line 1
    const-class v8, Lcom/facebook/react/modules/core/TimingModule;

    .line 2
    .line 3
    const-class v9, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 4
    .line 5
    const-class v0, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    .line 8
    .line 9
    const-class v2, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 10
    .line 11
    const-class v3, Lcom/facebook/react/modules/debug/DevSettingsModule;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    .line 14
    .line 15
    const-class v5, Lcom/facebook/react/devsupport/LogBoxModule;

    .line 16
    .line 17
    const-class v6, Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;

    .line 18
    .line 19
    const-class v7, Lcom/facebook/react/modules/debug/SourceCodeModule;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    const/16 v3, 0xa

    .line 32
    .line 33
    if-ge v2, v3, :cond_0

    .line 34
    .line 35
    aget-object v3, v0, v2

    .line 36
    .line 37
    const-class v4, Li2/a;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Li2/a;

    .line 44
    .line 45
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    new-instance v13, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 50
    .line 51
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-interface {v4}, Li2/a;->canOverrideExistingModule()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-interface {v4}, Li2/a;->needsEagerInit()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    invoke-interface {v4}, Li2/a;->isCxxModule()Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    invoke-static {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->b(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    move-object v6, v13

    .line 76
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    new-instance v0, Lcom/facebook/react/c;

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lcom/facebook/react/c;-><init>(Ljava/util/Map;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method private static synthetic i(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->PROCESS_CORE_REACT_PACKAGE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->PROCESS_CORE_REACT_PACKAGE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-void
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "UIManager"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x9

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "HeadlessJsTaskSupport"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x8

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "SourceCode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x7

    goto :goto_0

    :sswitch_3
    const-string v1, "ExceptionsManager"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_4
    const-string v1, "PlatformConstants"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_5
    const-string v1, "DeviceEventManager"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_6
    const-string v1, "DeviceInfo"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_7
    const-string v1, "DevSettings"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_8
    const-string v1, "Timing"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_9
    const-string v1, "LogBox"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In CoreModulesPackage, could not find Native module for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    invoke-direct {p0, p2}, Lcom/facebook/react/d;->g(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/UIManagerModule;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance p1, Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/facebook/react/modules/debug/SourceCodeModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/debug/SourceCodeModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    iget-object p2, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    invoke-virtual {p2}, Lcom/facebook/react/H;->D()LX1/e;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/core/ExceptionsManagerModule;-><init>(LX1/e;)V

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    iget-object v0, p0, Lcom/facebook/react/d;->b:Lm2/b;

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/b;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_7
    new-instance p1, Lcom/facebook/react/modules/debug/DevSettingsModule;

    iget-object v0, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    invoke-virtual {v0}, Lcom/facebook/react/H;->D()LX1/e;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/debug/DevSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V

    return-object p1

    :pswitch_8
    new-instance p1, Lcom/facebook/react/modules/core/TimingModule;

    iget-object v0, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    invoke-virtual {v0}, Lcom/facebook/react/H;->D()LX1/e;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/core/TimingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V

    return-object p1

    :pswitch_9
    new-instance p1, Lcom/facebook/react/devsupport/LogBoxModule;

    iget-object v0, p0, Lcom/facebook/react/d;->a:Lcom/facebook/react/H;

    invoke-virtual {v0}, Lcom/facebook/react/H;->D()LX1/e;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/devsupport/LogBoxModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7803a7f9 -> :sswitch_9
        -0x6aae2396 -> :sswitch_8
        -0x615e98c8 -> :sswitch_7
        -0x5aa347bc -> :sswitch_6
        -0x3dd2aeb7 -> :sswitch_5
        -0x2f1fa604 -> :sswitch_4
        0x1e8b20e9 -> :sswitch_3
        0x348ae0c8 -> :sswitch_2
        0x4ae4e268 -> :sswitch_1
        0x6ef04e79 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 3

    .line 1
    const-string v0, "No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    invoke-static {}, LS1/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/d;->h()Lj2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider"

    .line 15
    .line 16
    invoke-static {v1}, LS1/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lj2/a;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :catch_0
    move-exception v1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v2

    .line 37
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2

    .line 43
    :catch_2
    invoke-direct {p0}, Lcom/facebook/react/d;->h()Lj2/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.class Lcom/facebook/react/runtime/f;
.super Lcom/facebook/react/Y;
.source "SourceFile"


# instance fields
.field private final a:LX1/e;

.field private final b:Lm2/b;


# direct methods
.method public constructor <init>(LX1/e;Lm2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/f;->a:LX1/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/runtime/f;->b:Lm2/b;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic e(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/runtime/f;->g(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private f()Lj2/a;
    .locals 14

    .line 1
    const-class v5, Lcom/facebook/react/devsupport/LogBoxModule;

    .line 2
    .line 3
    const-class v6, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    .line 4
    .line 5
    const-class v0, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 8
    .line 9
    const-class v2, Lcom/facebook/react/modules/debug/SourceCodeModule;

    .line 10
    .line 11
    const-class v3, Lcom/facebook/react/modules/debug/DevSettingsModule;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    const/4 v3, 0x7

    .line 26
    if-ge v2, v3, :cond_1

    .line 27
    .line 28
    aget-object v3, v0, v2

    .line 29
    .line 30
    const-class v4, Li2/a;

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Li2/a;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-instance v13, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 45
    .line 46
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-interface {v4}, Li2/a;->canOverrideExistingModule()Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-interface {v4}, Li2/a;->needsEagerInit()Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    invoke-interface {v4}, Li2/a;->isCxxModule()Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    invoke-static {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->b(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    move-object v6, v13

    .line 71
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    new-instance v0, Lcom/facebook/react/runtime/e;

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/e;-><init>(Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method private static synthetic g(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "SourceCode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_1
    const-string v1, "ExceptionsManager"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_2
    const-string v1, "PlatformConstants"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_3
    const-string v1, "DeviceEventManager"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_4
    const-string v1, "DeviceInfo"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_5
    const-string v1, "DevSettings"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_6
    const-string v1, "LogBox"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    new-instance p1, Lcom/facebook/react/modules/debug/SourceCodeModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/debug/SourceCodeModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    iget-object p2, p0, Lcom/facebook/react/runtime/f;->a:LX1/e;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/core/ExceptionsManagerModule;-><init>(LX1/e;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    iget-object v0, p0, Lcom/facebook/react/runtime/f;->b:Lm2/b;

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/b;)V

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    invoke-direct {p1, p2}, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/facebook/react/modules/debug/DevSettingsModule;

    iget-object v0, p0, Lcom/facebook/react/runtime/f;->a:LX1/e;

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/debug/DevSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/facebook/react/devsupport/LogBoxModule;

    iget-object v0, p0, Lcom/facebook/react/runtime/f;->a:LX1/e;

    invoke-direct {p1, p2, v0}, Lcom/facebook/react/devsupport/LogBoxModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7803a7f9 -> :sswitch_6
        -0x615e98c8 -> :sswitch_5
        -0x5aa347bc -> :sswitch_4
        -0x3dd2aeb7 -> :sswitch_3
        -0x2f1fa604 -> :sswitch_2
        0x1e8b20e9 -> :sswitch_1
        0x348ae0c8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 6

    .line 1
    const-string v0, "No ReactModuleInfoProvider for "

    .line 2
    .line 3
    const-string v1, "$$ReactModuleInfoProvider"

    .line 4
    .line 5
    const-class v2, Lcom/facebook/react/runtime/f;

    .line 6
    .line 7
    invoke-static {}, LS1/a;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/facebook/react/runtime/f;->f()Lj2/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, LS1/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lj2/a;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    return-object v3

    .line 54
    :catch_0
    move-exception v3

    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception v3

    .line 57
    goto :goto_1

    .line 58
    :goto_0
    new-instance v4, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v4

    .line 86
    :goto_1
    new-instance v4, Ljava/lang/RuntimeException;

    .line 87
    .line 88
    new-instance v5, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw v4

    .line 114
    :catch_2
    invoke-direct {p0}, Lcom/facebook/react/runtime/f;->f()Lj2/a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
.end method

.class public Lv2/s;
.super Lcom/facebook/react/Y;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/Z;


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lv2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lv2/s;->i(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private g()Lj2/a;
    .locals 23

    .line 1
    const-class v21, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 2
    .line 3
    const-class v22, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 4
    .line 5
    const-class v0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 8
    .line 9
    const-class v2, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 10
    .line 11
    const-class v3, Lcom/facebook/react/modules/blob/BlobModule;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 14
    .line 15
    const-class v5, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 16
    .line 17
    const-class v6, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 18
    .line 19
    const-class v7, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 20
    .line 21
    const-class v8, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 22
    .line 23
    const-class v9, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 24
    .line 25
    const-class v10, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 26
    .line 27
    const-class v11, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 28
    .line 29
    const-class v12, Lcom/facebook/react/modules/intent/IntentModule;

    .line 30
    .line 31
    const-class v13, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 32
    .line 33
    const-class v14, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 34
    .line 35
    const-class v15, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 36
    .line 37
    const-class v16, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;

    .line 38
    .line 39
    const-class v17, Lcom/facebook/react/modules/share/ShareModule;

    .line 40
    .line 41
    const-class v18, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 42
    .line 43
    const-class v19, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 44
    .line 45
    const-class v20, Lcom/facebook/react/modules/toast/ToastModule;

    .line 46
    .line 47
    filled-new-array/range {v0 .. v22}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    :goto_0
    const/16 v3, 0x17

    .line 58
    .line 59
    if-ge v2, v3, :cond_1

    .line 60
    .line 61
    aget-object v3, v0, v2

    .line 62
    .line 63
    const-class v4, Li2/a;

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Li2/a;

    .line 70
    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-instance v13, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 78
    .line 79
    invoke-interface {v4}, Li2/a;->name()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-interface {v4}, Li2/a;->canOverrideExistingModule()Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-interface {v4}, Li2/a;->needsEagerInit()Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-interface {v4}, Li2/a;->isCxxModule()Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-static {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->b(Ljava/lang/Class;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    move-object v6, v13

    .line 104
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    new-instance v0, Lv2/i;

    .line 114
    .line 115
    invoke-direct {v0, v1}, Lv2/i;-><init>(Ljava/util/Map;)V

    .line 116
    .line 117
    .line 118
    return-object v0
.end method

.method private static synthetic i(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv2/s;->h()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->getProvider()Ljavax/inject/Provider;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    return-object p1
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 39
    .line 40
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v0, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 55
    .line 56
    invoke-direct {v0}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 63
    .line 64
    invoke-direct {v0}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager;

    .line 71
    .line 72
    invoke-direct {v0}, Lcom/facebook/react/views/image/ReactImageManager;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    new-instance v0, Lcom/facebook/react/views/text/ReactRawTextManager;

    .line 87
    .line 88
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactRawTextManager;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 95
    .line 96
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 103
    .line 104
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    new-instance v0, Lcom/facebook/react/views/view/ReactViewManager;

    .line 111
    .line 112
    invoke-direct {v0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    new-instance v0, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;

    .line 119
    .line 120
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 127
    .line 128
    invoke-direct {v0}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, -0x1

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sparse-switch v3, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v3, "Vibration"

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x16

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v3, "NativeAnimatedModule"

    .line 31
    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v2, 0x15

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v3, "ShareModule"

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 v2, 0x14

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v3, "BlobModule"

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 v2, 0x13

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v3, "Networking"

    .line 73
    .line 74
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_4
    const/16 v2, 0x12

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v3, "AppState"

    .line 87
    .line 88
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :cond_5
    const/16 v2, 0x11

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v3, "IntentAndroid"

    .line 101
    .line 102
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_6
    const/16 v2, 0x10

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v3, "DevToolsSettingsManager"

    .line 115
    .line 116
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_7

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :cond_7
    const/16 v2, 0xf

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v3, "Clipboard"

    .line 129
    .line 130
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_8

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :cond_8
    const/16 v2, 0xe

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v3, "FrescoModule"

    .line 143
    .line 144
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_9

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_9
    const/16 v2, 0xd

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v3, "DevLoadingView"

    .line 157
    .line 158
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_a

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_a
    const/16 v2, 0xc

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v3, "WebSocketModule"

    .line 171
    .line 172
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-nez p1, :cond_b

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_b
    const/16 v2, 0xb

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v3, "StatusBarManager"

    .line 185
    .line 186
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_c

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_c
    const/16 v2, 0xa

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v3, "AccessibilityInfo"

    .line 199
    .line 200
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_d

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    const/16 v2, 0x9

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v3, "Appearance"

    .line 213
    .line 214
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_e

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_e
    const/16 v2, 0x8

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v3, "I18nManager"

    .line 227
    .line 228
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-nez p1, :cond_f

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_f
    const/4 v2, 0x7

    .line 236
    goto :goto_0

    .line 237
    :sswitch_10
    const-string v3, "ImageLoader"

    .line 238
    .line 239
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-nez p1, :cond_10

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_10
    const/4 v2, 0x6

    .line 247
    goto :goto_0

    .line 248
    :sswitch_11
    const-string v3, "PermissionsAndroid"

    .line 249
    .line 250
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-nez p1, :cond_11

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_11
    const/4 v2, 0x5

    .line 258
    goto :goto_0

    .line 259
    :sswitch_12
    const-string v3, "FileReaderModule"

    .line 260
    .line 261
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-nez p1, :cond_12

    .line 266
    .line 267
    goto :goto_0

    .line 268
    :cond_12
    const/4 v2, 0x4

    .line 269
    goto :goto_0

    .line 270
    :sswitch_13
    const-string v3, "DialogManagerAndroid"

    .line 271
    .line 272
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-nez p1, :cond_13

    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_13
    const/4 v2, 0x3

    .line 280
    goto :goto_0

    .line 281
    :sswitch_14
    const-string v3, "SoundManager"

    .line 282
    .line 283
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-nez p1, :cond_14

    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_14
    const/4 v2, 0x2

    .line 291
    goto :goto_0

    .line 292
    :sswitch_15
    const-string v3, "ImageStoreManager"

    .line 293
    .line 294
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-nez p1, :cond_15

    .line 299
    .line 300
    goto :goto_0

    .line 301
    :cond_15
    move v2, v0

    .line 302
    goto :goto_0

    .line 303
    :sswitch_16
    const-string v3, "ToastAndroid"

    .line 304
    .line 305
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    if-nez p1, :cond_16

    .line 310
    .line 311
    goto :goto_0

    .line 312
    :cond_16
    const/4 v2, 0x0

    .line 313
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 314
    .line 315
    .line 316
    return-object v1

    .line 317
    :pswitch_0
    new-instance p1, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 318
    .line 319
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/vibration/VibrationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 320
    .line 321
    .line 322
    return-object p1

    .line 323
    :pswitch_1
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 324
    .line 325
    invoke-direct {p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 326
    .line 327
    .line 328
    return-object p1

    .line 329
    :pswitch_2
    new-instance p1, Lcom/facebook/react/modules/share/ShareModule;

    .line 330
    .line 331
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/share/ShareModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 332
    .line 333
    .line 334
    return-object p1

    .line 335
    :pswitch_3
    new-instance p1, Lcom/facebook/react/modules/blob/BlobModule;

    .line 336
    .line 337
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/BlobModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 338
    .line 339
    .line 340
    return-object p1

    .line 341
    :pswitch_4
    new-instance p1, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 342
    .line 343
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 344
    .line 345
    .line 346
    return-object p1

    .line 347
    :pswitch_5
    new-instance p1, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 348
    .line 349
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appstate/AppStateModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 350
    .line 351
    .line 352
    return-object p1

    .line 353
    :pswitch_6
    new-instance p1, Lcom/facebook/react/modules/intent/IntentModule;

    .line 354
    .line 355
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/intent/IntentModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 356
    .line 357
    .line 358
    return-object p1

    .line 359
    :pswitch_7
    new-instance p1, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;

    .line 360
    .line 361
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 362
    .line 363
    .line 364
    return-object p1

    .line 365
    :pswitch_8
    new-instance p1, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 366
    .line 367
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/clipboard/ClipboardModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 368
    .line 369
    .line 370
    return-object p1

    .line 371
    :pswitch_9
    new-instance p1, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 372
    .line 373
    invoke-direct {p1, p2, v0, v1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLy1/l;)V

    .line 374
    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_a
    new-instance p1, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 378
    .line 379
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devloading/DevLoadingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 380
    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_b
    new-instance p1, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 384
    .line 385
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 386
    .line 387
    .line 388
    return-object p1

    .line 389
    :pswitch_c
    new-instance p1, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 390
    .line 391
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/statusbar/StatusBarModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 392
    .line 393
    .line 394
    return-object p1

    .line 395
    :pswitch_d
    new-instance p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 396
    .line 397
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 398
    .line 399
    .line 400
    return-object p1

    .line 401
    :pswitch_e
    new-instance p1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 402
    .line 403
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appearance/AppearanceModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 404
    .line 405
    .line 406
    return-object p1

    .line 407
    :pswitch_f
    new-instance p1, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 408
    .line 409
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 410
    .line 411
    .line 412
    return-object p1

    .line 413
    :pswitch_10
    new-instance p1, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 414
    .line 415
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/image/ImageLoaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 416
    .line 417
    .line 418
    return-object p1

    .line 419
    :pswitch_11
    new-instance p1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 420
    .line 421
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/permissions/PermissionsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 422
    .line 423
    .line 424
    return-object p1

    .line 425
    :pswitch_12
    new-instance p1, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 426
    .line 427
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/FileReaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 428
    .line 429
    .line 430
    return-object p1

    .line 431
    :pswitch_13
    new-instance p1, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 432
    .line 433
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 434
    .line 435
    .line 436
    return-object p1

    .line 437
    :pswitch_14
    new-instance p1, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 438
    .line 439
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/sound/SoundManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 440
    .line 441
    .line 442
    return-object p1

    .line 443
    :pswitch_15
    new-instance p1, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 444
    .line 445
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/camera/ImageStoreManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 446
    .line 447
    .line 448
    return-object p1

    .line 449
    :pswitch_16
    new-instance p1, Lcom/facebook/react/modules/toast/ToastModule;

    .line 450
    .line 451
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 452
    .line 453
    .line 454
    return-object p1

    .line 455
    :sswitch_data_0
    .sparse-switch
        -0x7e115d98 -> :sswitch_16
        -0x74ffd399 -> :sswitch_15
        -0x6e4e4c42 -> :sswitch_14
        -0x629eae76 -> :sswitch_13
        -0x501dbf35 -> :sswitch_12
        -0x3f4dc695 -> :sswitch_11
        -0x272d42d2 -> :sswitch_10
        -0x21ff2871 -> :sswitch_f
        -0x1e16677c -> :sswitch_e
        -0x1b4a7d04 -> :sswitch_d
        -0x16ced634 -> :sswitch_c
        -0xf2876ed -> :sswitch_b
        -0x5ea6d34 -> :sswitch_a
        0x9baee92 -> :sswitch_9
        0x180dfd76 -> :sswitch_8
        0x1a6bde44 -> :sswitch_7
        0x219d6013 -> :sswitch_6
        0x48cceb10 -> :sswitch_5
        0x5a50c314 -> :sswitch_4
        0x5c43b489 -> :sswitch_3
        0x5cb5e70b -> :sswitch_2
        0x66989206 -> :sswitch_1
        0x72911272 -> :sswitch_0
    .end sparse-switch

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
        :pswitch_0
    .end packed-switch
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 3

    .line 1
    const-string v0, "No ReactModuleInfoProvider for com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

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
    invoke-direct {p0}, Lv2/s;->g()Lj2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

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
    invoke-direct {p0}, Lv2/s;->g()Lj2/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv2/s;->h()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv2/s;->h()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public h()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, Lv2/s;->a:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lv2/b;

    .line 11
    .line 12
    invoke-direct {v1}, Lv2/b;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "AndroidDrawerLayout"

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lv2/p;

    .line 21
    .line 22
    invoke-direct {v1}, Lv2/p;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "AndroidHorizontalScrollView"

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lv2/q;

    .line 31
    .line 32
    invoke-direct {v1}, Lv2/q;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "AndroidHorizontalScrollContentView"

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lv2/r;

    .line 41
    .line 42
    invoke-direct {v1}, Lv2/r;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "AndroidProgressBar"

    .line 46
    .line 47
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lv2/c;

    .line 51
    .line 52
    invoke-direct {v1}, Lv2/c;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "RCTScrollView"

    .line 56
    .line 57
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lv2/d;

    .line 61
    .line 62
    invoke-direct {v1}, Lv2/d;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v2, "AndroidSwitch"

    .line 66
    .line 67
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lv2/e;

    .line 71
    .line 72
    invoke-direct {v1}, Lv2/e;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "AndroidSwipeRefreshLayout"

    .line 76
    .line 77
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lv2/f;

    .line 81
    .line 82
    invoke-direct {v1}, Lv2/f;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v2, "RCTTextInlineImage"

    .line 86
    .line 87
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lv2/g;

    .line 91
    .line 92
    invoke-direct {v1}, Lv2/g;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v2, "RCTImageView"

    .line 96
    .line 97
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 98
    .line 99
    .line 100
    new-instance v1, Lv2/h;

    .line 101
    .line 102
    invoke-direct {v1}, Lv2/h;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "RCTModalHostView"

    .line 106
    .line 107
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lv2/j;

    .line 111
    .line 112
    invoke-direct {v1}, Lv2/j;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v2, "RCTRawText"

    .line 116
    .line 117
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, Lv2/k;

    .line 121
    .line 122
    invoke-direct {v1}, Lv2/k;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v2, "AndroidTextInput"

    .line 126
    .line 127
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Lv2/l;

    .line 131
    .line 132
    invoke-direct {v1}, Lv2/l;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v2, "RCTText"

    .line 136
    .line 137
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Lv2/m;

    .line 141
    .line 142
    invoke-direct {v1}, Lv2/m;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v2, "RCTView"

    .line 146
    .line 147
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Lv2/n;

    .line 151
    .line 152
    invoke-direct {v1}, Lv2/n;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v2, "RCTVirtualText"

    .line 156
    .line 157
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Lv2/o;

    .line 161
    .line 162
    invoke-direct {v1}, Lv2/o;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v2, "UnimplementedNativeView"

    .line 166
    .line 167
    invoke-static {v0, v2, v1}, Lv2/s;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Lv2/s;->a:Ljava/util/Map;

    .line 171
    .line 172
    :cond_0
    iget-object v0, p0, Lv2/s;->a:Ljava/util/Map;

    .line 173
    .line 174
    return-object v0
.end method

.class final Lcom/facebook/react/runtime/ReactInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/ReactInstance$c;,
        Lcom/facebook/react/runtime/ReactInstance$b;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/String; = "ReactInstance"

.field private static volatile k:Z


# instance fields
.field private final a:Lcom/facebook/react/runtime/g;

.field private final b:Lcom/facebook/react/runtime/c;

.field private final c:Ljava/util/List;

.field private final d:Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

.field private final e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

.field private final f:Lcom/facebook/react/fabric/FabricUIManager;

.field private final g:Lcom/facebook/react/modules/core/JavaTimerManager;

.field private final h:Lcom/facebook/react/runtime/ReactInstance$b;

.field private i:Lcom/facebook/react/bridge/JavaScriptContextHolder;

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/react/runtime/ReactInstance;->y()V

    return-void
.end method

.method constructor <init>(Lcom/facebook/react/runtime/c;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;LX1/e;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V
    .locals 22

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v11, v10, Lcom/facebook/react/runtime/ReactInstance;->b:Lcom/facebook/react/runtime/c;

    .line 9
    .line 10
    move-object/from16 v12, p2

    .line 11
    .line 12
    iput-object v12, v10, Lcom/facebook/react/runtime/ReactInstance;->a:Lcom/facebook/react/runtime/g;

    .line 13
    .line 14
    const-string v0, "ReactInstance.initialize"

    .line 15
    .line 16
    const-wide/16 v13, 0x0

    .line 17
    .line 18
    invoke-static {v13, v14, v0}, LP2/a;->c(JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "v_native"

    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;->newBackgroundThreadSpec(Ljava/lang/String;)Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;->builder()Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "v_js"

    .line 32
    .line 33
    invoke-static {v2}, Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;->newBackgroundThreadSpec(Ljava/lang/String;)Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;->setJSQueueThreadSpec(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;)Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;->setNativeModulesQueueThreadSpec(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;)Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec$Builder;->build()Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object/from16 v1, p5

    .line 50
    .line 51
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;->create(Lcom/facebook/react/bridge/queue/ReactQueueConfigurationSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/ReactQueueConfigurationImpl;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, v10, Lcom/facebook/react/runtime/ReactInstance;->d:Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    .line 56
    .line 57
    sget-object v1, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    .line 58
    .line 59
    const-string v2, "Calling initializeMessageQueueThreads()"

    .line 60
    .line 61
    invoke-static {v1, v2}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v11, v0}, Lcom/facebook/react/bridge/ReactContext;->initializeMessageQueueThreads(Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;->getJSQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;->getNativeModulesQueueThread()Lcom/facebook/react/bridge/queue/MessageQueueThread;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {}, Ld2/a;->b()Ld2/a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lcom/facebook/react/modules/core/a;->i(Ld2/b;)V

    .line 80
    .line 81
    .line 82
    if-eqz p6, :cond_0

    .line 83
    .line 84
    invoke-interface/range {p4 .. p4}, LX1/e;->z()V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-static {}, Lcom/facebook/react/runtime/ReactInstance;->createJSTimerExecutor()Lcom/facebook/react/runtime/JSTimerExecutor;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    new-instance v4, Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 92
    .line 93
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object/from16 v1, p4

    .line 98
    .line 99
    invoke-direct {v4, v11, v5, v0, v1}, Lcom/facebook/react/modules/core/JavaTimerManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/c;Lcom/facebook/react/modules/core/a;LX1/e;)V

    .line 100
    .line 101
    .line 102
    iput-object v4, v10, Lcom/facebook/react/runtime/ReactInstance;->g:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 103
    .line 104
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/runtime/g;->a()Lcom/facebook/react/runtime/JSRuntimeFactory;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/runtime/g;->getBindingsInstaller()Lcom/facebook/react/runtime/BindingsInstaller;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v13, v14}, LP2/a;->h(J)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    new-instance v6, Lcom/facebook/react/runtime/ReactInstance$c;

    .line 117
    .line 118
    invoke-direct {v6, v10, v3}, Lcom/facebook/react/runtime/ReactInstance$c;-><init>(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/queue/MessageQueueThread;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v0, p0

    .line 122
    .line 123
    move-object/from16 v9, p7

    .line 124
    .line 125
    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/runtime/ReactInstance;->initHybrid(Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/runtime/JSTimerExecutor;Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;Lcom/facebook/react/runtime/BindingsInstaller;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)Lcom/facebook/jni/HybridData;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, v10, Lcom/facebook/react/runtime/ReactInstance;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 130
    .line 131
    new-instance v0, Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 132
    .line 133
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getJavaScriptContext()J

    .line 134
    .line 135
    .line 136
    move-result-wide v1

    .line 137
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/bridge/JavaScriptContextHolder;-><init>(J)V

    .line 138
    .line 139
    .line 140
    iput-object v0, v10, Lcom/facebook/react/runtime/ReactInstance;->i:Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 141
    .line 142
    const-string v0, "ReactInstance.initialize#initTurboModules"

    .line 143
    .line 144
    invoke-static {v13, v14, v0}, LP2/a;->c(JLjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v0, v10, Lcom/facebook/react/runtime/ReactInstance;->c:Ljava/util/List;

    .line 153
    .line 154
    new-instance v1, Lcom/facebook/react/runtime/f;

    .line 155
    .line 156
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/runtime/c;->c()LX1/e;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/runtime/c;->b()Lm2/b;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v1, v2, v3}, Lcom/facebook/react/runtime/f;-><init>(LX1/e;Lm2/b;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    if-eqz p6, :cond_1

    .line 171
    .line 172
    new-instance v1, Lcom/facebook/react/g;

    .line 173
    .line 174
    invoke-direct {v1}, Lcom/facebook/react/g;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_1
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/runtime/g;->c()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 185
    .line 186
    .line 187
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/runtime/g;->f()Lcom/facebook/react/T$a;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1, v0}, Lcom/facebook/react/T$a;->c(Ljava/util/List;)Lcom/facebook/react/T$a;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1, v11}, Lcom/facebook/react/T$a;->d(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/T$a;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Lcom/facebook/react/T$a;->a()Lcom/facebook/react/T;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getUnbufferedRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    new-instance v3, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    .line 208
    .line 209
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getNativeMethodCallInvokerHolder()Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-direct {v3, v2, v1, v4, v5}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;-><init>(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V

    .line 218
    .line 219
    .line 220
    iput-object v3, v10, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    .line 221
    .line 222
    invoke-static {v13, v14}, LP2/a;->g(J)V

    .line 223
    .line 224
    .line 225
    const-string v1, "ReactInstance.initialize#initFabric"

    .line 226
    .line 227
    invoke-static {v13, v14, v1}, LP2/a;->c(JLjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lcom/facebook/react/runtime/ReactInstance$b;

    .line 231
    .line 232
    invoke-direct {v1, v0, v11}, Lcom/facebook/react/runtime/ReactInstance$b;-><init>(Ljava/util/List;Lcom/facebook/react/runtime/c;)V

    .line 233
    .line 234
    .line 235
    iput-object v1, v10, Lcom/facebook/react/runtime/ReactInstance;->h:Lcom/facebook/react/runtime/ReactInstance$b;

    .line 236
    .line 237
    new-instance v0, Lcom/facebook/react/runtime/X;

    .line 238
    .line 239
    invoke-direct {v0, v10}, Lcom/facebook/react/runtime/X;-><init>(Lcom/facebook/react/runtime/ReactInstance;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v2, v0}, Lcom/facebook/react/uimanager/ComponentNameResolverBinding;->install(Lcom/facebook/react/bridge/RuntimeExecutor;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Le2/a;->f()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_2

    .line 250
    .line 251
    new-instance v0, Ljava/util/HashMap;

    .line 252
    .line 253
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 254
    .line 255
    .line 256
    new-instance v3, Lcom/facebook/react/runtime/Y;

    .line 257
    .line 258
    invoke-direct {v3}, Lcom/facebook/react/runtime/Y;-><init>()V

    .line 259
    .line 260
    .line 261
    new-instance v4, Lcom/facebook/react/runtime/Z;

    .line 262
    .line 263
    invoke-direct {v4, v10, v0}, Lcom/facebook/react/runtime/Z;-><init>(Lcom/facebook/react/runtime/ReactInstance;Ljava/util/Map;)V

    .line 264
    .line 265
    .line 266
    new-instance v5, Lcom/facebook/react/runtime/a0;

    .line 267
    .line 268
    invoke-direct {v5, v10, v0}, Lcom/facebook/react/runtime/a0;-><init>(Lcom/facebook/react/runtime/ReactInstance;Ljava/util/Map;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v2, v3, v4, v5}, Lcom/facebook/react/uimanager/UIConstantsProviderBinding;->install(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;)V

    .line 272
    .line 273
    .line 274
    :cond_2
    new-instance v0, Lcom/facebook/react/fabric/events/EventBeatManager;

    .line 275
    .line 276
    invoke-direct {v0}, Lcom/facebook/react/fabric/events/EventBeatManager;-><init>()V

    .line 277
    .line 278
    .line 279
    new-instance v2, Lcom/facebook/react/fabric/FabricUIManager;

    .line 280
    .line 281
    new-instance v3, Lcom/facebook/react/uimanager/G0;

    .line 282
    .line 283
    invoke-direct {v3, v1}, Lcom/facebook/react/uimanager/G0;-><init>(Lcom/facebook/react/uimanager/H0;)V

    .line 284
    .line 285
    .line 286
    invoke-direct {v2, v11, v3, v0}, Lcom/facebook/react/fabric/FabricUIManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/events/a;)V

    .line 287
    .line 288
    .line 289
    iput-object v2, v10, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    .line 290
    .line 291
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/runtime/g;->b()Lcom/facebook/react/fabric/ReactNativeConfig;

    .line 292
    .line 293
    .line 294
    move-result-object v21

    .line 295
    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    new-instance v15, Lcom/facebook/react/fabric/BindingImpl;

    .line 299
    .line 300
    invoke-direct {v15}, Lcom/facebook/react/fabric/BindingImpl;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getBufferedRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    .line 304
    .line 305
    .line 306
    move-result-object v16

    .line 307
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/runtime/ReactInstance;->getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;

    .line 308
    .line 309
    .line 310
    move-result-object v17

    .line 311
    move-object/from16 v18, v2

    .line 312
    .line 313
    move-object/from16 v19, v0

    .line 314
    .line 315
    move-object/from16 v20, p3

    .line 316
    .line 317
    invoke-interface/range {v15 .. v21}, Lcom/facebook/react/fabric/a;->a(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Lcom/facebook/react/fabric/FabricUIManager;->initialize()V

    .line 321
    .line 322
    .line 323
    invoke-static {v13, v14}, LP2/a;->g(J)V

    .line 324
    .line 325
    .line 326
    invoke-static {v13, v14}, LP2/a;->g(J)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/runtime/ReactInstance;Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactInstance;->w(Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/facebook/react/runtime/ReactInstance;Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeMap;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->v(Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/facebook/react/runtime/ReactInstance;)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactInstance;->t()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static native createJSTimerExecutor()Lcom/facebook/react/runtime/JSTimerExecutor;
    .annotation build LR1/a;
    .end annotation
.end method

.method public static synthetic d()Lcom/facebook/react/bridge/NativeMap;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/runtime/ReactInstance;->u()Lcom/facebook/react/bridge/NativeMap;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic e(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/runtime/ReactInstance;->b:Lcom/facebook/react/runtime/c;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/runtime/ReactInstance;Landroid/content/res/AssetManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->loadJSBundleFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    return-void
.end method

.method private native getJavaScriptContext()J
.end method

.method private native getNativeMethodCallInvokerHolder()Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;
.end method

.method private native getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;
.end method

.method private native getUnbufferedRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;
.end method

.method static bridge synthetic h(Lcom/facebook/react/runtime/ReactInstance;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->loadJSBundleFromFile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private native handleMemoryPressureJs(I)V
.end method

.method private native initHybrid(Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/runtime/JSTimerExecutor;Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;Lcom/facebook/react/runtime/BindingsInstaller;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end method

.method private native installGlobals(Z)V
    .annotation build LR1/a;
    .end annotation
.end method

.method private native loadJSBundleFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V
.end method

.method private native loadJSBundleFromFile(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native registerSegmentNative(ILjava/lang/String;)V
.end method

.method private synthetic t()[Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->h:Lcom/facebook/react/runtime/ReactInstance$b;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance$b;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v1, v2, :cond_0

    sget-object v0, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    const-string v1, "No ViewManager names found"

    invoke-static {v0, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    new-array v0, v3, [Ljava/lang/String;

    return-object v0

    :cond_0
    new-array v1, v3, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static synthetic u()Lcom/facebook/react/bridge/NativeMap;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/n0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v0

    return-object v0
.end method

.method private synthetic v(Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->h:Lcom/facebook/react/runtime/ReactInstance$b;

    invoke-virtual {v0, p2}, Lcom/facebook/react/runtime/ReactInstance$b;->b(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lcom/facebook/react/uimanager/UIManagerModule;->getConstantsForViewManager(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/NativeMap;

    return-object p1
.end method

.method private synthetic w(Ljava/util/Map;)Lcom/facebook/react/bridge/NativeMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactInstance;->h:Lcom/facebook/react/runtime/ReactInstance$b;

    invoke-virtual {v1}, Lcom/facebook/react/runtime/ReactInstance$b;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/facebook/react/uimanager/UIManagerModule;->createConstants(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->h:Lcom/facebook/react/runtime/ReactInstance$b;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance$b;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    if-lez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v0, "ViewManagerNames"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "LazyViewManagersEnabled"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p1

    return-object p1
.end method

.method private static declared-synchronized y()V
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/react/runtime/ReactInstance;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/facebook/react/runtime/ReactInstance;->k:Z

    if-nez v1, :cond_0

    const-string v1, "rninstance"

    invoke-static {v1}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/facebook/react/runtime/ReactInstance;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method


# virtual methods
.method A(Lcom/facebook/react/runtime/e0;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startSurface() is called with surface: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ReactInstance.startSurface"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v1}, LP2/a;->c(JLjava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->a()Landroid/view/ViewGroup;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    new-instance v4, Lcom/facebook/react/uimanager/s;

    const-string v6, "surfaceView\'s is NOT equal to View.NO_ID before calling startSurface."

    invoke-direct {v4, v6}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->m()Lc2/b;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/fabric/FabricUIManager;->attachRootView(Lc2/b;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->m()Lc2/b;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->h()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, v4, p1, v1}, Lcom/facebook/react/fabric/FabricUIManager;->startSurface(Lc2/b;Landroid/content/Context;Landroid/view/View;)V

    :goto_0
    invoke-static {v2, v3}, LP2/a;->g(J)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Starting surface without a view is not supported, use prerenderSurface instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method B(Lcom/facebook/react/runtime/e0;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopSurface() is called with surface: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->m()Lc2/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/fabric/FabricUIManager;->stopSurface(Lc2/b;)V

    return-void
.end method

.method native callFunctionOnModule(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V
.end method

.method native getBufferedRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;
.end method

.method native getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;
.end method

.method i()V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    const-string v1, "ReactInstance.destroy() is called."

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->d:Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    invoke-interface {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;->destroy()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->invalidate()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-virtual {v0}, Lcom/facebook/react/fabric/FabricUIManager;->invalidate()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->g:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->x()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->i:Lcom/facebook/react/bridge/JavaScriptContextHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->clear()V

    return-void
.end method

.method j()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-virtual {v0}, Lcom/facebook/react/fabric/FabricUIManager;->getEventDispatcher()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method k()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->i:Lcom/facebook/react/bridge/JavaScriptContextHolder;

    return-object v0
.end method

.method public l(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-class v0, Li2/a;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Li2/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Li2/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactInstance;->m(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-virtual {v1, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public n()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-virtual {v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModules()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public o()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->d:Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    return-object v0
.end method

.method p()Lcom/facebook/react/fabric/FabricUIManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->f:Lcom/facebook/react/fabric/FabricUIManager;

    return-object v0
.end method

.method public q(I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactInstance;->handleMemoryPressureJs(I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Lcom/facebook/react/runtime/ReactInstance;->j:Ljava/lang/String;

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public r(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-class v0, Li2/a;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Li2/a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-interface {p1}, Li2/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->hasModule(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getEagerInitModuleNames()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/runtime/ReactInstance;->e:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    invoke-virtual {v2, v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    goto :goto_0

    :cond_0
    return-void
.end method

.method native unregisterFromInspector()V
.end method

.method public x(Lcom/facebook/react/bridge/JSBundleLoader;)V
    .locals 3

    .line 1
    const-string v0, "ReactInstance.loadJSBundle"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    new-instance v0, Lcom/facebook/react/runtime/ReactInstance$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/ReactInstance$a;-><init>(Lcom/facebook/react/runtime/ReactInstance;)V

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/JSBundleLoader;->loadScript(Lcom/facebook/react/bridge/JSBundleLoaderDelegate;)Ljava/lang/String;

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void
.end method

.method public z(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->registerSegmentNative(ILjava/lang/String;)V

    return-void
.end method

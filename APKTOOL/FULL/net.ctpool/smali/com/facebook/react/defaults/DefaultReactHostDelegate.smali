.class public final Lcom/facebook/react/defaults/DefaultReactHostDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/runtime/g;


# annotations
.annotation build Lcom/facebook/jni/annotations/DoNotStrip;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/react/bridge/JSBundleLoader;

.field private final c:Ljava/util/List;

.field private final d:Lcom/facebook/react/runtime/JSRuntimeFactory;

.field private final e:Lcom/facebook/react/runtime/BindingsInstaller;

.field private final f:Lcom/facebook/react/fabric/ReactNativeConfig;

.field private final g:Lv5/l;

.field private final h:Lcom/facebook/react/T$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lv5/l;Lcom/facebook/react/T$a;)V
    .locals 1

    .line 1
    const-string v0, "jsMainModulePath"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jsBundleLoader"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactPackages"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jsRuntimeFactory"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactNativeConfig"

    invoke-static {p6, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exceptionHandler"

    invoke-static {p7, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turboModuleManagerDelegateBuilder"

    invoke-static {p8, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->b:Lcom/facebook/react/bridge/JSBundleLoader;

    iput-object p3, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->d:Lcom/facebook/react/runtime/JSRuntimeFactory;

    iput-object p5, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->e:Lcom/facebook/react/runtime/BindingsInstaller;

    iput-object p6, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->f:Lcom/facebook/react/fabric/ReactNativeConfig;

    iput-object p7, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->g:Lv5/l;

    iput-object p8, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->h:Lcom/facebook/react/T$a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lv5/l;Lcom/facebook/react/T$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p9, 0x8

    if-eqz v0, :cond_1

    new-instance v0, Lcom/facebook/react/runtime/hermes/HermesInstance;

    invoke-direct {v0}, Lcom/facebook/react/runtime/hermes/HermesInstance;-><init>()V

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_3

    sget-object v0, Lcom/facebook/react/fabric/ReactNativeConfig;->b:Lcom/facebook/react/fabric/ReactNativeConfig;

    move-object v7, v0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_4

    sget-object v0, Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;->m:Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;

    move-object v8, v0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/facebook/react/defaults/DefaultReactHostDelegate;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lv5/l;Lcom/facebook/react/T$a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/runtime/JSRuntimeFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->d:Lcom/facebook/react/runtime/JSRuntimeFactory;

    return-object v0
.end method

.method public b()Lcom/facebook/react/fabric/ReactNativeConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->f:Lcom/facebook/react/fabric/ReactNativeConfig;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->c:Ljava/util/List;

    return-object v0
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "error"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->g:Lv5/l;

    invoke-interface {v0, p1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e()Lcom/facebook/react/bridge/JSBundleLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->b:Lcom/facebook/react/bridge/JSBundleLoader;

    return-object v0
.end method

.method public f()Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->h:Lcom/facebook/react/T$a;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getBindingsInstaller()Lcom/facebook/react/runtime/BindingsInstaller;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultReactHostDelegate;->e:Lcom/facebook/react/runtime/BindingsInstaller;

    return-object v0
.end method

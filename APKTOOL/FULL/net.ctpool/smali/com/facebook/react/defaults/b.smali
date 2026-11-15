.class public final Lcom/facebook/react/defaults/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/defaults/b;

.field private static b:Lcom/facebook/react/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/defaults/b;

    invoke-direct {v0}, Lcom/facebook/react/defaults/b;-><init>()V

    sput-object v0, Lcom/facebook/react/defaults/b;->a:Lcom/facebook/react/defaults/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Lcom/facebook/react/L;)Lcom/facebook/react/y;
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactNativeHost"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/facebook/react/defaults/c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/react/defaults/c;

    invoke-virtual {p1, p0}, Lcom/facebook/react/defaults/c;->A(Landroid/content/Context;)Lcom/facebook/react/y;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You can call getDefaultReactHost only with instances of DefaultReactNativeHost"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)Lcom/facebook/react/y;
    .locals 15

    .line 1
    move-object v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p6

    const-string v3, "context"

    invoke-static {p0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "packageList"

    move-object/from16 v7, p1

    invoke-static {v7, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "jsMainModulePath"

    move-object/from16 v5, p2

    invoke-static {v5, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "jsBundleAssetPath"

    invoke-static {v0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cxxReactPackageProviders"

    invoke-static {v2, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/facebook/react/defaults/b;->b:Lcom/facebook/react/y;

    if-nez v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "assets://"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {p0, v0, v3}, Lcom/facebook/react/bridge/JSBundleLoader;->createAssetLoader(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object v6

    if-eqz p4, :cond_0

    new-instance v0, Lcom/facebook/react/runtime/hermes/HermesInstance;

    invoke-direct {v0}, Lcom/facebook/react/runtime/hermes/HermesInstance;-><init>()V

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/facebook/react/runtime/JSCInstance;

    invoke-direct {v0}, Lcom/facebook/react/runtime/JSCInstance;-><init>()V

    goto :goto_0

    :goto_1
    new-instance v12, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;

    invoke-direct {v12}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;-><init>()V

    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv5/l;

    invoke-virtual {v12, v2}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;->e(Lv5/l;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;

    goto :goto_2

    :cond_1
    new-instance v2, Lcom/facebook/react/defaults/DefaultReactHostDelegate;

    invoke-static {v6}, Lw5/k;->c(Ljava/lang/Object;)V

    const/16 v13, 0x70

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v2

    move-object/from16 v5, p2

    move-object/from16 v7, p1

    invoke-direct/range {v4 .. v14}, Lcom/facebook/react/defaults/DefaultReactHostDelegate;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lv5/l;Lcom/facebook/react/T$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/facebook/react/fabric/ComponentFactory;

    invoke-direct {v3}, Lcom/facebook/react/fabric/ComponentFactory;-><init>()V

    sget-object v0, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->a:Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;

    invoke-virtual {v0, v3}, Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;->register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/defaults/DefaultComponentsRegistry;

    new-instance v6, Lcom/facebook/react/runtime/ReactHostImpl;

    const/4 v4, 0x1

    move-object v0, v6

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/runtime/ReactHostImpl;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V

    if-eqz p4, :cond_2

    sget-object v0, Lcom/facebook/react/i;->n:Lcom/facebook/react/i;

    goto :goto_3

    :cond_2
    sget-object v0, Lcom/facebook/react/i;->m:Lcom/facebook/react/i;

    :goto_3
    invoke-virtual {v6, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->C1(Lcom/facebook/react/i;)V

    sput-object v6, Lcom/facebook/react/defaults/b;->b:Lcom/facebook/react/y;

    :cond_3
    sget-object v0, Lcom/facebook/react/defaults/b;->b:Lcom/facebook/react/y;

    const-string v1, "null cannot be cast to non-null type com.facebook.react.ReactHost"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ILjava/lang/Object;)Lcom/facebook/react/y;
    .locals 5

    .line 1
    and-int/lit8 v0, p7, 0x4

    const-string v1, "index"

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p7, 0x10

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, p4

    :goto_2
    and-int/lit8 v3, p7, 0x20

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    move v3, p5

    :goto_3
    and-int/lit8 v4, p7, 0x40

    if-eqz v4, :cond_4

    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object v4

    goto :goto_4

    :cond_4
    move-object v4, p6

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v1

    move p6, v2

    move p7, v3

    move-object p8, v4

    invoke-static/range {p2 .. p8}, Lcom/facebook/react/defaults/b;->b(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)Lcom/facebook/react/y;

    move-result-object v0

    return-object v0
.end method

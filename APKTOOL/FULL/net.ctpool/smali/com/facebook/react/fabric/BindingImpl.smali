.class public final Lcom/facebook/react/fabric/BindingImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/a;


# annotations
.annotation build LR1/a;
.end annotation

.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingNativeLoadLibrary"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/BindingImpl$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/react/fabric/BindingImpl$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/fabric/BindingImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/BindingImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/fabric/BindingImpl;->a:Lcom/facebook/react/fabric/BindingImpl$a;

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    invoke-static {}, LU1/a;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/react/fabric/BindingImpl;->a:Lcom/facebook/react/fabric/BindingImpl$a;

    invoke-static {v0}, Lcom/facebook/react/fabric/BindingImpl$a;->a(Lcom/facebook/react/fabric/BindingImpl$a;)Lcom/facebook/jni/HybridData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/fabric/BindingImpl;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public static final synthetic c()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/fabric/BindingImpl;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    return-object v0
.end method

.method private static final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private final native installFabricUIManager(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Ljava/lang/Object;)V
.end method

.method private final native uninstallFabricUIManager()V
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V
    .locals 1

    .line 1
    const-string v0, "runtimeExecutor"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runtimeScheduler"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fabricUIManager"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventBeatManager"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentFactory"

    invoke-static {p5, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactNativeConfig"

    invoke-static {p6, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/facebook/react/fabric/FabricUIManager;->setBinding(Lcom/facebook/react/fabric/a;)V

    invoke-direct/range {p0 .. p6}, Lcom/facebook/react/fabric/BindingImpl;->installFabricUIManager(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Ljava/lang/Object;)V

    invoke-static {}, Lcom/facebook/react/uimanager/G;->a()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/react/fabric/BindingImpl;->setPixelDensity(F)V

    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/fabric/BindingImpl;->uninstallFabricUIManager()V

    return-void
.end method

.method public native driveCxxAnimations()V
.end method

.method public native getInspectorDataForInstance(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)Lcom/facebook/react/bridge/ReadableNativeMap;
.end method

.method public native registerSurface(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V
.end method

.method public native reportMount(I)V
.end method

.method public native setConstraints(IFFFFFFZZ)V
.end method

.method public native setPixelDensity(F)V
.end method

.method public native startSurface(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V
.end method

.method public native startSurfaceWithConstraints(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V
.end method

.method public native stopSurface(I)V
.end method

.method public native unregisterSurface(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V
.end method

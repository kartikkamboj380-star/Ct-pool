.class public final Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;
.super Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$a;,
        Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;,
        Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;
    }
.end annotation

.annotation runtime Li2/a;
    name = "AccessibilityInfo"
.end annotation


# static fields
.field private static final ACCESSIBILITY_SERVICE_EVENT_NAME:Ljava/lang/String; = "accessibilityServiceDidChange"

.field private static final Companion:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$a;

.field private static final REDUCE_MOTION_EVENT_NAME:Ljava/lang/String; = "reduceMotionDidChange"

.field private static final TOUCH_EXPLORATION_EVENT_NAME:Ljava/lang/String; = "touchExplorationDidChange"


# instance fields
.field private final accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field private final accessibilityServiceChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;

.field private accessibilityServiceEnabled:Z

.field private final animationScaleObserver:Landroid/database/ContentObserver;

.field private final contentResolver:Landroid/content/ContentResolver;

.field private recommendedTimeout:I

.field private reduceMotionEnabled:Z

.field private touchExplorationEnabled:Z

.field private final touchExplorationStateChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->Companion:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->getUiThreadHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$d;

    invoke-direct {v1, p0, v0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$d;-><init>(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->animationScaleObserver:Landroid/database/ContentObserver;

    new-instance v0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;

    invoke-direct {v0, p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;-><init>(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)V

    iput-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationStateChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;

    new-instance v0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;

    invoke-direct {v0, p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;-><init>(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)V

    iput-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "accessibility"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "getContentResolver(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->contentResolver:Landroid/content/ContentResolver;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationEnabled:Z

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceEnabled:Z

    invoke-direct {p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->isReduceMotionEnabledValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->reduceMotionEnabled:Z

    return-void
.end method

.method public static final synthetic access$getReactApplicationContext(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateAndSendAccessibilityServiceChangeEvent(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendAccessibilityServiceChangeEvent(Z)V

    return-void
.end method

.method public static final synthetic access$updateAndSendReduceMotionChangeEvent(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendReduceMotionChangeEvent()V

    return-void
.end method

.method public static final synthetic access$updateAndSendTouchExplorationChangeEvent(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendTouchExplorationChangeEvent(Z)V

    return-void
.end method

.method private final isReduceMotionEnabledValue()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->contentResolver:Landroid/content/ContentResolver;

    const-string v1, "transition_animation_scale"

    invoke-static {v0, v1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private final updateAndSendAccessibilityServiceChangeEvent(Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceEnabled:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceEnabled:Z

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "accessibilityServiceDidChange"

    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final updateAndSendReduceMotionChangeEvent()V
    .locals 3

    invoke-direct {p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->isReduceMotionEnabledValue()Z

    move-result v0

    iget-boolean v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->reduceMotionEnabled:Z

    if-eq v1, v0, :cond_0

    iput-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->reduceMotionEnabled:Z

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->reduceMotionEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "reduceMotionDidChange"

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final updateAndSendTouchExplorationChangeEvent(Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationEnabled:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationEnabled:Z

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "touchExplorationDidChange"

    invoke-virtual {p1, v1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public announceForAccessibility(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getRecommendedTimeoutMillis(DLcom/facebook/react/bridge/Callback;)V
    .locals 2

    const-string v0, "successCallback"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    double-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_1

    double-to-int p1, p1

    const/4 p2, 0x4

    invoke-static {v0, p1, p2}, Lk2/a;->a(Landroid/view/accessibility/AccessibilityManager;II)I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->recommendedTimeout:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public initialize()V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendTouchExplorationChangeEvent(Z)V

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    invoke-direct {p0, v1}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendAccessibilityServiceChangeEvent(Z)V

    invoke-direct {p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendReduceMotionChangeEvent()V

    return-void
.end method

.method public invalidate()V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    return-void
.end method

.method public isAccessibilityServiceEnabled(Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    const-string v0, "successCallback"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public isReduceMotionEnabled(Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    const-string v0, "successCallback"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->reduceMotionEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public isTouchExplorationEnabled(Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    const-string v0, "successCallback"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    return-void
.end method

.method public onHostPause()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationStateChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->contentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->animationScaleObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    return-void
.end method

.method public onHostResume()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->touchExplorationStateChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityServiceChangeListener:Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    :cond_1
    const-string v0, "transition_animation_scale"

    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->contentResolver:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->animationScaleObserver:Landroid/database/ContentObserver;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-ne v0, v1, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v3

    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendTouchExplorationChangeEvent(Z)V

    iget-object v0, p0, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-ne v0, v1, :cond_3

    move v3, v1

    :cond_3
    invoke-direct {p0, v3}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendAccessibilityServiceChangeEvent(Z)V

    invoke-direct {p0}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;->updateAndSendReduceMotionChangeEvent()V

    return-void
.end method

.method public setAccessibilityFocus(D)V
    .locals 0

    return-void
.end method

.class public Lcom/facebook/react/uimanager/UIManagerModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/OnBatchCompleteListener;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lcom/facebook/react/bridge/UIManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/UIManagerModule$e;,
        Lcom/facebook/react/uimanager/UIManagerModule$d;
    }
.end annotation

.annotation runtime Li2/a;
    name = "UIManager"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final DEBUG:Z

.field public static final NAME:Ljava/lang/String; = "UIManager"

.field public static final TAG:Ljava/lang/String; = "UIManagerModule"


# instance fields
.field private mBatchId:I

.field private final mCustomDirectEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

.field private final mListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/o0;",
            ">;"
        }
    .end annotation
.end field

.field private final mMemoryTrimCallback:Lcom/facebook/react/uimanager/UIManagerModule$e;

.field private final mModuleConstants:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final mUIImplementation:Lcom/facebook/react/uimanager/j0;

.field private final mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/bridge/UIManagerListener;",
            ">;"
        }
    .end annotation
.end field

.field private final mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v1, Lb1/a;->f:LZ0/a;

    invoke-interface {v0, v1}, La1/b;->c(LZ0/a;)Z

    move-result v0

    sput-boolean v0, Lcom/facebook/react/uimanager/UIManagerModule;->DEBUG:Z

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/H0;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Lcom/facebook/react/uimanager/UIManagerModule$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule$e;-><init>(Lcom/facebook/react/uimanager/l0;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mMemoryTrimCallback:Lcom/facebook/react/uimanager/UIManagerModule$e;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mListeners:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mBatchId:I

    invoke-static {p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    new-instance v0, Lcom/facebook/react/uimanager/events/f;

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/f;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-static {p2}, Lcom/facebook/react/uimanager/UIManagerModule;->createConstants(Lcom/facebook/react/uimanager/H0;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mModuleConstants:Ljava/util/Map;

    invoke-static {}, Lcom/facebook/react/uimanager/m0;->c()Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mCustomDirectEvents:Ljava/util/Map;

    new-instance v1, Lcom/facebook/react/uimanager/G0;

    invoke-direct {v1, p2}, Lcom/facebook/react/uimanager/G0;-><init>(Lcom/facebook/react/uimanager/H0;)V

    iput-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    new-instance p2, Lcom/facebook/react/uimanager/j0;

    invoke-direct {p2, p1, v1, v0, p3}, Lcom/facebook/react/uimanager/j0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/events/e;I)V

    iput-object p2, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Lcom/facebook/react/uimanager/UIManagerModule$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule$e;-><init>(Lcom/facebook/react/uimanager/l0;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mMemoryTrimCallback:Lcom/facebook/react/uimanager/UIManagerModule$e;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mListeners:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mBatchId:I

    invoke-static {p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    new-instance v0, Lcom/facebook/react/uimanager/events/f;

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/f;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mCustomDirectEvents:Ljava/util/Map;

    invoke-static {p2, v1, v2}, Lcom/facebook/react/uimanager/UIManagerModule;->createConstants(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mModuleConstants:Ljava/util/Map;

    new-instance v1, Lcom/facebook/react/uimanager/G0;

    invoke-direct {v1, p2}, Lcom/facebook/react/uimanager/G0;-><init>(Ljava/util/List;)V

    iput-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    new-instance p2, Lcom/facebook/react/uimanager/j0;

    invoke-direct {p2, p1, v1, v0, p3}, Lcom/facebook/react/uimanager/j0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/events/e;I)V

    iput-object p2, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/uimanager/UIManagerModule;)Lcom/facebook/react/uimanager/j0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    return-object p0
.end method

.method private static createConstants(Lcom/facebook/react/uimanager/H0;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/H0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "CreateUIManagerConstants"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "Lazy"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    :try_start_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/n0;->a(Lcom/facebook/react/uimanager/H0;)Ljava/util/Map;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p0
.end method

.method public static createConstants(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "CreateUIManagerConstants"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v4, "Lazy"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/facebook/react/uimanager/n0;->b(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_UI_MANAGER_MODULE_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    throw p0
.end method

.method public static getConstantsForViewManager(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/ViewManager;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/facebook/react/bridge/WritableMap;"
        }
    .end annotation

    .line 1
    const-string v0, "UIManagerModule.getConstantsForViewManager"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ViewManager"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "Lazy"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, v0, v0, v0, p1}, Lcom/facebook/react/uimanager/n0;->c(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object p1

    invoke-virtual {p1}, LP2/b$a;->c()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object p0

    invoke-virtual {p0}, LP2/b$a;->c()V

    return-object v0

    :goto_0
    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object p1

    invoke-virtual {p1}, LP2/b$a;->c()V

    throw p0
.end method


# virtual methods
.method public addRootView(Landroid/view/View;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/UIManagerModule;->addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I

    move-result p1

    return p1
.end method

.method public addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Lcom/facebook/react/bridge/WritableMap;",
            ")I"
        }
    .end annotation

    .line 2
    const-string p2, "UIManagerModule.addRootView"

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p2}, LP2/a;->c(JLjava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/uimanager/T;->a()I

    move-result p2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v2

    new-instance v3, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object v5, p1

    check-cast v5, Lcom/facebook/react/uimanager/S;

    invoke-interface {v5}, Lcom/facebook/react/uimanager/S;->getSurfaceID()Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    invoke-direct {v3, v2, v4, v5, v6}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v2, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v2, p1, p2, v3}, Lcom/facebook/react/uimanager/j0;->H(Landroid/view/View;ILcom/facebook/react/uimanager/e0;)V

    invoke-static {v0, v1}, LP2/a;->g(J)V

    return p2
.end method

.method public addUIBlock(Lcom/facebook/react/uimanager/i0;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->a(Lcom/facebook/react/uimanager/i0;)V

    return-void
.end method

.method public addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addUIManagerListener(Lcom/facebook/react/uimanager/o0;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public clearJSResponder()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->f()V

    return-void
.end method

.method public configureNextLayoutAnimation(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object p3, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {p3, p1, p2}, Lcom/facebook/react/uimanager/j0;->g(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public createView(ILjava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-boolean v0, Lcom/facebook/react/uimanager/UIManagerModule;->DEBUG:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(UIManager.createView) tag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", props: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v1

    sget-object v2, Lb1/a;->f:LZ0/a;

    invoke-interface {v1, v2, v0}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/j0;->j(ILjava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public dispatchCommand(IILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->k(IILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->l(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public dispatchViewManagerCommand(ILcom/facebook/react/bridge/Dynamic;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {p1}, Ly2/a;->a(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v2, :cond_1

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result p2

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/bridge/UIManager;->dispatchCommand(IILcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v2, :cond_2

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/bridge/UIManager;->dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public findSubviewIn(ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {v0, p1, v1, p2, p3}, Lcom/facebook/react/uimanager/j0;->o(IFFLcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public getConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mModuleConstants:Ljava/util/Map;

    return-object v0
.end method

.method public getConstantsForViewManager(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->O(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mCustomDirectEvents:Ljava/util/Map;

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/UIManagerModule;->getConstantsForViewManager(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    return-object p1
.end method

.method public getDefaultEventTypes()Lcom/facebook/react/bridge/WritableMap;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-static {}, Lcom/facebook/react/uimanager/n0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v0

    return-object v0
.end method

.method public getDirectEventNamesResolver()Lcom/facebook/react/uimanager/UIManagerModule$d;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/facebook/react/uimanager/UIManagerModule$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/UIManagerModule$a;-><init>(Lcom/facebook/react/uimanager/UIManagerModule;)V

    return-object v0
.end method

.method public getEventDispatcher()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    return-object v0
.end method

.method public bridge synthetic getEventDispatcher()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/UIManagerModule;->getEventDispatcher()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "UIManager"

    return-object v0
.end method

.method public getPerformanceCounters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getUIImplementation()Lcom/facebook/react/uimanager/j0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    return-object v0
.end method

.method public getViewManagerRegistry_DO_NOT_USE()Lcom/facebook/react/uimanager/G0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    return-object v0
.end method

.method public initialize()V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mMemoryTrimCallback:Lcom/facebook/react/uimanager/UIManagerModule$e;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-class v2, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/uimanager/events/e;->a(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    return-void
.end method

.method public invalidate()V
    .locals 2

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mEventDispatcher:Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/events/e;->g()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->B()V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mMemoryTrimCallback:Lcom/facebook/react/uimanager/UIManagerModule$e;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mViewManagerRegistry:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    invoke-static {}, Lcom/facebook/react/uimanager/L0;->a()LS1/b;

    move-result-object v0

    invoke-virtual {v0}, LS1/b;->c()V

    invoke-static {}, Lcom/facebook/react/uimanager/C0;->a()V

    return-void
.end method

.method public invalidateNodeLayout(I)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->N(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Warning : attempted to dirty a non-existent react shadow node. reactTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->i()V

    iget-object p1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/j0;->m(I)V

    return-void
.end method

.method public manageChildren(ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 9
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-boolean v0, Lcom/facebook/react/uimanager/UIManagerModule;->DEBUG:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(UIManager.manageChildren) tag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", moveFrom: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", moveTo: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", addTags: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", atIndices: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", removeFrom: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ReactNative"

    invoke-static {v2, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v2

    sget-object v3, Lb1/a;->f:LZ0/a;

    invoke-interface {v2, v3, v0}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v2 .. v8}, Lcom/facebook/react/uimanager/j0;->u(ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public measure(ILcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->v(ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public measureInWindow(ILcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->w(ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public measureLayout(IILcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/j0;->x(IILcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public onBatchComplete()V
    .locals 5

    iget v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mBatchId:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mBatchId:I

    const-string v1, "onBatchCompleteUI"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v1}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v1

    const-string v4, "BatchId"

    invoke-virtual {v1, v4, v0}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v1

    invoke-virtual {v1}, LP2/b$a;->c()V

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/bridge/UIManagerListener;

    invoke-interface {v4, p0}, Lcom/facebook/react/bridge/UIManagerListener;->willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/j0;->q()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v1, v0}, Lcom/facebook/react/uimanager/j0;->m(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {v2, v3}, LP2/a;->g(J)V

    return-void

    :goto_2
    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw v0

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onHostDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->C()V

    return-void
.end method

.method public onHostPause()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->D()V

    return-void
.end method

.method public onHostResume()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->E()V

    return-void
.end method

.method public prependUIBlock(Lcom/facebook/react/uimanager/i0;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->F(Lcom/facebook/react/uimanager/i0;)V

    return-void
.end method

.method public profileNextBatch()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->G()V

    return-void
.end method

.method public receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    const-class v0, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-interface {p1, p2, p3, p4}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 2
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/facebook/react/uimanager/UIManagerModule;->receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public removeRootView(I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->J(I)V

    return-void
.end method

.method public removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIManagerListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeUIManagerListener(Lcom/facebook/react/uimanager/o0;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resolveCustomDirectEventName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mCustomDirectEvents:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string p1, "registrationName"

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public resolveRootTagFromReactTag(I)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Ly2/a;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->M(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public resolveView(I)Landroid/view/View;
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->r()Lcom/facebook/react/uimanager/p0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->S()Lcom/facebook/react/uimanager/C;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/C;->v(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public sendAccessibilityEvent(II)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-static {p1}, Ly2/a;->a(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/UIManager;->sendAccessibilityEvent(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->P(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setChildren(ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-boolean v0, Lcom/facebook/react/uimanager/UIManagerModule;->DEBUG:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(UIManager.setChildren) tag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", children: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v1

    sget-object v2, Lb1/a;->f:LZ0/a;

    invoke-interface {v1, v2, v0}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->Q(ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setJSResponder(IZ)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->R(IZ)V

    return-void
.end method

.method public setLayoutAnimationEnabledExperimental(Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->S(Z)V

    return-void
.end method

.method public setViewHierarchyUpdateDebugListener(Lz2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->T(Lz2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setViewLocalData(ILjava/lang/Object;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->assertOnUiQueueThread()V

    new-instance v1, Lcom/facebook/react/uimanager/UIManagerModule$b;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/facebook/react/uimanager/UIManagerModule$b;-><init>(Lcom/facebook/react/uimanager/UIManagerModule;Lcom/facebook/react/bridge/ReactContext;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public startSurface(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/WritableMap;",
            "II)I"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public stopSurface(I)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    new-instance v1, Lcom/facebook/react/uimanager/W;

    invoke-direct {v1, p2}, Lcom/facebook/react/uimanager/W;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/j0;->V(ILcom/facebook/react/uimanager/W;)V

    return-void
.end method

.method public updateNodeSize(III)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->assertOnNativeModulesQueueThread()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->W(III)V

    return-void
.end method

.method public updateRootLayoutSpecs(IIIII)V
    .locals 6

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p4

    new-instance p5, Lcom/facebook/react/uimanager/UIManagerModule$c;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p4

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/uimanager/UIManagerModule$c;-><init>(Lcom/facebook/react/uimanager/UIManagerModule;Lcom/facebook/react/bridge/ReactContext;III)V

    invoke-virtual {p4, p5}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public updateView(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-boolean v0, Lcom/facebook/react/uimanager/UIManagerModule;->DEBUG:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(UIManager.updateView) tag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", props: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v1

    sget-object v2, Lb1/a;->f:LZ0/a;

    invoke-interface {v1, v2, v0}, La1/b;->b(LZ0/a;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->Z(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public viewIsDescendantOf(IILcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule;->mUIImplementation:Lcom/facebook/react/uimanager/j0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->b0(IILcom/facebook/react/bridge/Callback;)V

    return-void
.end method

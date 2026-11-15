.class public final Lcom/facebook/react/modules/debug/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/f$a;,
        Lcom/facebook/react/modules/debug/f$b;
    }
.end annotation


# static fields
.field private static final n:Lcom/facebook/react/modules/debug/f$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactContext;

.field private b:Landroid/view/Choreographer;

.field private final c:Lcom/facebook/react/uimanager/UIManagerModule;

.field private final d:Lcom/facebook/react/modules/debug/c;

.field private e:J

.field private f:J

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:D

.field private m:Ljava/util/TreeMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/debug/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/debug/f;->n:Lcom/facebook/react/modules/debug/f$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/debug/f;->a:Lcom/facebook/react/bridge/ReactContext;

    const-class v0, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    iput-object p1, p0, Lcom/facebook/react/modules/debug/f;->c:Lcom/facebook/react/uimanager/UIManagerModule;

    new-instance p1, Lcom/facebook/react/modules/debug/c;

    invoke-direct {p1}, Lcom/facebook/react/modules/debug/c;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/debug/f;->d:Lcom/facebook/react/modules/debug/c;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/react/modules/debug/f;->e:J

    iput-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/facebook/react/modules/debug/f;->l:D

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/debug/f;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/f;->m(Lcom/facebook/react/modules/debug/f;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/debug/f;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/f;->o(Lcom/facebook/react/modules/debug/f;)V

    return-void
.end method

.method public static synthetic l(Lcom/facebook/react/modules/debug/f;DILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/facebook/react/modules/debug/f;->l:D

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/modules/debug/f;->k(D)V

    return-void
.end method

.method private static final m(Lcom/facebook/react/modules/debug/f;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/modules/debug/f;->b:Landroid/view/Choreographer;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method

.method private static final o(Lcom/facebook/react/modules/debug/f;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/modules/debug/f;->b:Landroid/view/Choreographer;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/f;->i:I

    return v0
.end method

.method public final d()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->i()I

    move-result v0

    int-to-double v0, v0

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->l:D

    mul-double/2addr v2, v0

    const/16 v0, 0x3e8

    int-to-double v0, v0

    div-double/2addr v2, v0

    const/4 v0, 0x1

    int-to-double v0, v0

    add-double/2addr v2, v0

    double-to-int v0, v2

    return v0
.end method

.method public doFrame(J)V
    .locals 10

    iget-wide v0, p0, Lcom/facebook/react/modules/debug/f;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p1, p0, Lcom/facebook/react/modules/debug/f;->e:J

    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iput-wide p1, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iget-object v2, p0, Lcom/facebook/react/modules/debug/f;->d:Lcom/facebook/react/modules/debug/c;

    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/facebook/react/modules/debug/c;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/facebook/react/modules/debug/f;->j:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/facebook/react/modules/debug/f;->j:I

    :cond_1
    iget p1, p0, Lcom/facebook/react/modules/debug/f;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/facebook/react/modules/debug/f;->g:I

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->d()I

    move-result p1

    iget p2, p0, Lcom/facebook/react/modules/debug/f;->h:I

    sub-int p2, p1, p2

    add-int/lit8 p2, p2, -0x1

    const/4 v0, 0x4

    if-lt p2, v0, :cond_2

    iget p2, p0, Lcom/facebook/react/modules/debug/f;->i:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/facebook/react/modules/debug/f;->i:I

    :cond_2
    iget-boolean p2, p0, Lcom/facebook/react/modules/debug/f;->k:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/facebook/react/modules/debug/f;->m:Ljava/util/TreeMap;

    invoke-static {p2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/facebook/react/modules/debug/f$b;

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->g()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->h()I

    move-result v2

    iget v4, p0, Lcom/facebook/react/modules/debug/f;->i:I

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->e()D

    move-result-wide v5

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->f()D

    move-result-wide v7

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->i()I

    move-result v9

    move-object v0, p2

    move v3, p1

    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/modules/debug/f$b;-><init>(IIIIDDI)V

    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->m:Ljava/util/TreeMap;

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/modules/debug/f$b;

    :cond_3
    iput p1, p0, Lcom/facebook/react/modules/debug/f;->h:I

    iget-object p1, p0, Lcom/facebook/react/modules/debug/f;->b:Landroid/view/Choreographer;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_4
    return-void
.end method

.method public final e()D
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->g()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iget-wide v4, p0, Lcom/facebook/react/modules/debug/f;->e:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    div-double/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public final f()D
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/f;->h()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->f:J

    iget-wide v4, p0, Lcom/facebook/react/modules/debug/f;->e:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    div-double/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/f;->g:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/f;->j:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final i()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    long-to-double v0, v0

    iget-wide v2, p0, Lcom/facebook/react/modules/debug/f;->e:J

    long-to-double v2, v2

    sub-double/2addr v0, v2

    double-to-int v0, v0

    const v1, 0xf4240

    div-int/2addr v0, v1

    return v0
.end method

.method public final j()V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/react/modules/debug/f;->e:J

    iput-wide v0, p0, Lcom/facebook/react/modules/debug/f;->f:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/modules/debug/f;->g:I

    iput v0, p0, Lcom/facebook/react/modules/debug/f;->i:I

    iput v0, p0, Lcom/facebook/react/modules/debug/f;->j:I

    iput-boolean v0, p0, Lcom/facebook/react/modules/debug/f;->k:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/modules/debug/f;->m:Ljava/util/TreeMap;

    return-void
.end method

.method public final k(D)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->a:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->a:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/debug/f;->d:Lcom/facebook/react/modules/debug/c;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/CatalystInstance;->addBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->c:Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/debug/f;->d:Lcom/facebook/react/modules/debug/c;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(Lz2/a;)V

    :cond_1
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/f;->l:D

    new-instance p1, Lcom/facebook/react/modules/debug/d;

    invoke-direct {p1, p0}, Lcom/facebook/react/modules/debug/d;-><init>(Lcom/facebook/react/modules/debug/f;)V

    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->a:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->a:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/debug/f;->d:Lcom/facebook/react/modules/debug/c;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/CatalystInstance;->removeBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/f;->c:Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(Lz2/a;)V

    :cond_1
    new-instance v0, Lcom/facebook/react/modules/debug/e;

    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/e;-><init>(Lcom/facebook/react/modules/debug/f;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

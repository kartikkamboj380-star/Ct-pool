.class public final Lcom/facebook/react/uimanager/events/q;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/q$a;,
        Lcom/facebook/react/uimanager/events/q$b;
    }
.end annotation


# static fields
.field public static final f:Lcom/facebook/react/uimanager/events/q$a;

.field private static final g:Ljava/lang/String;

.field private static final h:Landroidx/core/util/e;


# instance fields
.field private a:Landroid/view/MotionEvent;

.field private b:Lcom/facebook/react/uimanager/events/s;

.field private c:S

.field private d:F

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/uimanager/events/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/q;->f:Lcom/facebook/react/uimanager/events/q$a;

    const-class v0, Lcom/facebook/react/uimanager/events/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/events/q;->g:Ljava/lang/String;

    new-instance v0, Landroidx/core/util/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/core/util/e;-><init>(I)V

    sput-object v0, Lcom/facebook/react/uimanager/events/q;->h:Landroidx/core/util/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/q;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroidx/core/util/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/q;->h:Landroidx/core/util/e;

    return-object v0
.end method

.method public static final synthetic b(Lcom/facebook/react/uimanager/events/q;IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lcom/facebook/react/uimanager/events/q;->g(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)V

    return-void
.end method

.method private final g(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)V
    .locals 2

    .line 1
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    invoke-super {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/events/d;->init(IIJ)V

    const-wide/high16 p1, -0x8000000000000000L

    cmp-long p1, p5, p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    const-string v1, "Gesture start time must be initialized"

    invoke-static {p1, v1}, Lcom/facebook/react/bridge/SoftAssertions;->assertCondition(ZLjava/lang/String;)V

    invoke-virtual {p4}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    and-int/lit16 p1, p1, 0xff

    if-eqz p1, :cond_5

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unhandled MotionEvent action: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_1
    invoke-virtual {p9, p5, p6}, Lcom/facebook/react/uimanager/events/r;->d(J)V

    goto :goto_2

    :cond_3
    invoke-virtual {p9, p5, p6}, Lcom/facebook/react/uimanager/events/r;->e(J)V

    goto :goto_2

    :cond_4
    invoke-virtual {p9, p5, p6}, Lcom/facebook/react/uimanager/events/r;->b(J)S

    move-result p2

    goto :goto_2

    :cond_5
    invoke-virtual {p9, p5, p6}, Lcom/facebook/react/uimanager/events/r;->a(J)V

    :goto_2
    invoke-static {p4}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/q;->a:Landroid/view/MotionEvent;

    iput-object p3, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    iput-short p2, p0, Lcom/facebook/react/uimanager/events/q;->c:S

    iput p7, p0, Lcom/facebook/react/uimanager/events/q;->d:F

    iput p8, p0, Lcom/facebook/react/uimanager/events/q;->e:F

    return-void
.end method

.method public static final h(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;
    .locals 10

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/q;->f:Lcom/facebook/react/uimanager/events/q$a;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-virtual/range {v0 .. v9}, Lcom/facebook/react/uimanager/events/q$a;->a(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;

    move-result-object v0

    return-object v0
.end method

.method private final i()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->a:Landroid/view/MotionEvent;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/react/uimanager/events/q;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final c()Landroid/view/MotionEvent;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->a:Landroid/view/MotionEvent;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "assertNotNull(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/MotionEvent;

    return-object v0
.end method

.method public canCoalesce()Z
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/events/s;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/facebook/react/uimanager/events/q$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown touch event type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public final d()Lcom/facebook/react/uimanager/events/s;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "assertNotNull(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/events/s;

    return-object v0
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 1

    const-string v0, "rctEventEmitter"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/q;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p0}, Lcom/facebook/react/uimanager/events/t;->d(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/q;)V

    :cond_0
    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 1

    const-string v0, "rctEventEmitter"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/q;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveTouches(Lcom/facebook/react/uimanager/events/q;)V

    :cond_0
    return-void
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/q;->d:F

    return v0
.end method

.method public final f()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/q;->e:F

    return v0
.end method

.method public getCoalescingKey()S
    .locals 1

    iget-short v0, p0, Lcom/facebook/react/uimanager/events/q;->c:S

    return v0
.end method

.method protected getEventCategory()I
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v2, Lcom/facebook/react/uimanager/events/q$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Li5/k;

    invoke-direct {v0}, Li5/k;-><init>()V

    throw v0

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_0
    return v2
.end method

.method public getEventName()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/facebook/react/uimanager/events/s;->n:Lcom/facebook/react/uimanager/events/s$a;

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/q;->b:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "assertNotNull(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/facebook/react/uimanager/events/s;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/events/s$a;->a(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onDispose()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/q;->a:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/q;->a:Landroid/view/MotionEvent;

    :try_start_0
    sget-object v0, Lcom/facebook/react/uimanager/events/q;->h:Landroidx/core/util/e;

    invoke-virtual {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/facebook/react/uimanager/events/q;->g:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

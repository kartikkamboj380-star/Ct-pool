.class public final Lcom/facebook/react/views/scroll/g;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/g$a;
    }
.end annotation


# static fields
.field public static final k:Lcom/facebook/react/views/scroll/g$a;

.field private static final l:Ljava/lang/String;

.field private static final m:Landroidx/core/util/e;


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Lcom/facebook/react/views/scroll/h;

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/scroll/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/scroll/g;->k:Lcom/facebook/react/views/scroll/g$a;

    const-class v0, Lcom/facebook/react/views/scroll/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/g;->l:Ljava/lang/String;

    new-instance v0, Landroidx/core/util/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/core/util/e;-><init>(I)V

    sput-object v0, Lcom/facebook/react/views/scroll/g;->m:Landroidx/core/util/e;

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
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/g;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroidx/core/util/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/g;->m:Landroidx/core/util/e;

    return-object v0
.end method

.method public static final synthetic b(Lcom/facebook/react/views/scroll/g;IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/facebook/react/views/scroll/g;->c(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)V

    return-void
.end method

.method private final c(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    iput-object p3, p0, Lcom/facebook/react/views/scroll/g;->i:Lcom/facebook/react/views/scroll/h;

    iput p4, p0, Lcom/facebook/react/views/scroll/g;->a:F

    iput p5, p0, Lcom/facebook/react/views/scroll/g;->b:F

    iput p6, p0, Lcom/facebook/react/views/scroll/g;->c:F

    iput p7, p0, Lcom/facebook/react/views/scroll/g;->d:F

    iput p8, p0, Lcom/facebook/react/views/scroll/g;->e:I

    iput p9, p0, Lcom/facebook/react/views/scroll/g;->f:I

    iput p10, p0, Lcom/facebook/react/views/scroll/g;->g:I

    iput p11, p0, Lcom/facebook/react/views/scroll/g;->h:I

    iput-boolean p12, p0, Lcom/facebook/react/views/scroll/g;->j:Z

    return-void
.end method

.method public static final d(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)Lcom/facebook/react/views/scroll/g;
    .locals 13

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/g;->k:Lcom/facebook/react/views/scroll/g$a;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v0 .. v12}, Lcom/facebook/react/views/scroll/g$a;->a(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)Lcom/facebook/react/views/scroll/g;

    move-result-object v0

    return-object v0
.end method

.method public static final e(ILcom/facebook/react/views/scroll/h;FFFFIIII)Lcom/facebook/react/views/scroll/g;
    .locals 11

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/g;->k:Lcom/facebook/react/views/scroll/g$a;

    move v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v0 .. v10}, Lcom/facebook/react/views/scroll/g$a;->b(ILcom/facebook/react/views/scroll/h;FFFFIIII)Lcom/facebook/react/views/scroll/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/scroll/g;->i:Lcom/facebook/react/views/scroll/h;

    sget-object v1, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected experimental_isSynchronous()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/g;->j:Z

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 11

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "top"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "bottom"

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "left"

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "right"

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    iget v2, p0, Lcom/facebook/react/views/scroll/g;->a:F

    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v2

    float-to-double v2, v2

    const-string v4, "x"

    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v2, p0, Lcom/facebook/react/views/scroll/g;->b:F

    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v2

    float-to-double v2, v2

    const-string v5, "y"

    invoke-interface {v1, v5, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    iget v3, p0, Lcom/facebook/react/views/scroll/g;->e:I

    int-to-float v3, v3

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v6, v3

    const-string v3, "width"

    invoke-interface {v2, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v6, p0, Lcom/facebook/react/views/scroll/g;->f:I

    int-to-float v6, v6

    invoke-static {v6}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v6, v6

    const-string v8, "height"

    invoke-interface {v2, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v6

    iget v7, p0, Lcom/facebook/react/views/scroll/g;->g:I

    int-to-float v7, v7

    invoke-static {v7}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v7

    float-to-double v9, v7

    invoke-interface {v6, v3, v9, v10}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v3, p0, Lcom/facebook/react/views/scroll/g;->h:I

    int-to-float v3, v3

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v9, v3

    invoke-interface {v6, v8, v9, v10}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    iget v7, p0, Lcom/facebook/react/views/scroll/g;->c:F

    float-to-double v7, v7

    invoke-interface {v3, v4, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v4, p0, Lcom/facebook/react/views/scroll/g;->d:F

    float-to-double v7, v4

    invoke-interface {v3, v5, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v4

    const-string v5, "contentInset"

    invoke-interface {v4, v5, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "contentOffset"

    invoke-interface {v4, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "contentSize"

    invoke-interface {v4, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "layoutMeasurement"

    invoke-interface {v4, v0, v6}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "velocity"

    invoke-interface {v4, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "target"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v1

    invoke-interface {v4, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "responderIgnoreScroll"

    const/4 v1, 0x1

    invoke-interface {v4, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    return-object v4
.end method

.method public getEventName()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/facebook/react/views/scroll/h;->m:Lcom/facebook/react/views/scroll/h$a;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/g;->i:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "assertNotNull(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/facebook/react/views/scroll/h;

    invoke-virtual {v0, v1}, Lcom/facebook/react/views/scroll/h$a;->a(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onDispose()V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/facebook/react/views/scroll/g;->m:Landroidx/core/util/e;

    invoke-virtual {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/facebook/react/views/scroll/g;->l:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

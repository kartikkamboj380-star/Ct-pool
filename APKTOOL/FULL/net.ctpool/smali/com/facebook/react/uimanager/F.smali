.class public Lcom/facebook/react/uimanager/F;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# static fields
.field private static final e:Landroidx/core/util/e;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/core/util/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroidx/core/util/e;-><init>(I)V

    sput-object v0, Lcom/facebook/react/uimanager/F;->e:Landroidx/core/util/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    return-void
.end method

.method public static b(IIIII)Lcom/facebook/react/uimanager/F;
    .locals 6

    .line 1
    const/4 v0, -0x1

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/uimanager/F;->c(IIIIII)Lcom/facebook/react/uimanager/F;

    move-result-object p0

    return-object p0
.end method

.method public static c(IIIIII)Lcom/facebook/react/uimanager/F;
    .locals 8

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/F;->e:Landroidx/core/util/e;

    invoke-virtual {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/F;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/F;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/F;-><init>()V

    :cond_0
    move-object v1, v0

    move v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/facebook/react/uimanager/F;->a(IIIIII)V

    return-object v0
.end method


# virtual methods
.method protected a(IIIIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    iput p3, p0, Lcom/facebook/react/uimanager/F;->a:I

    iput p4, p0, Lcom/facebook/react/uimanager/F;->b:I

    iput p5, p0, Lcom/facebook/react/uimanager/F;->c:I

    iput p6, p0, Lcom/facebook/react/uimanager/F;->d:I

    return-void
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/F;->a:I

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v1, v1

    const-string v3, "x"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v1, p0, Lcom/facebook/react/uimanager/F;->b:I

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v1, v1

    const-string v3, "y"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v1, p0, Lcom/facebook/react/uimanager/F;->c:I

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v1, v1

    const-string v3, "width"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v1, p0, Lcom/facebook/react/uimanager/F;->d:I

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v1, v1

    const-string v3, "height"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v2, "layout"

    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string v0, "target"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    return-object v1
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topLayout"

    return-object v0
.end method

.method public onDispose()V
    .locals 1

    sget-object v0, Lcom/facebook/react/uimanager/F;->e:Landroidx/core/util/e;

    invoke-virtual {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z

    return-void
.end method

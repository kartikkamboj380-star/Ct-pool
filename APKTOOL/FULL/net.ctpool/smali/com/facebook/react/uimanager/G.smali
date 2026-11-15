.class public final Lcom/facebook/react/uimanager/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/G;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/G;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/G;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/G;->a:Lcom/facebook/react/uimanager/G;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()F
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/h;->d()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method public static final b(F)F
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/h;->d()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p0, v0

    return p0
.end method

.method public static final c(D)F
    .locals 0

    .line 1
    double-to-float p0, p0

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p0

    return p0
.end method

.method public static final d(F)F
    .locals 2

    .line 1
    const/4 v0, 0x1

    invoke-static {}, Lcom/facebook/react/uimanager/h;->d()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0
.end method

.method public static final e(D)F
    .locals 2

    .line 1
    double-to-float p0, p0

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/facebook/react/uimanager/G;->h(FFILjava/lang/Object;)F

    move-result p0

    return p0
.end method

.method public static final f(F)F
    .locals 3

    .line 1
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/facebook/react/uimanager/G;->h(FFILjava/lang/Object;)F

    move-result p0

    return p0
.end method

.method public static final g(FF)F
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/h;->d()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, p0, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v2

    if-ltz v2, :cond_0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, v0

    mul-float/2addr p0, p1

    invoke-static {v1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_0
    return v1
.end method

.method public static synthetic h(FFILjava/lang/Object;)F
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/high16 p1, 0x7fc00000    # Float.NaN

    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/G;->g(FF)F

    move-result p0

    return p0
.end method

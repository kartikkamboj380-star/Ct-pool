.class public final Lcom/facebook/react/views/modal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/views/modal/a;

.field private static final b:Landroid/graphics/Point;

.field private static final c:Landroid/graphics/Point;

.field private static final d:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/modal/a;

    invoke-direct {v0}, Lcom/facebook/react/views/modal/a;-><init>()V

    sput-object v0, Lcom/facebook/react/views/modal/a;->a:Lcom/facebook/react/views/modal/a;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    sput-object v0, Lcom/facebook/react/views/modal/a;->b:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    sput-object v0, Lcom/facebook/react/views/modal/a;->c:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    sput-object v0, Lcom/facebook/react/views/modal/a;->d:Landroid/graphics/Point;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 8

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/modal/a;->b:Landroid/graphics/Point;

    sget-object v2, Lcom/facebook/react/views/modal/a;->c:Landroid/graphics/Point;

    invoke-virtual {v0, v1, v2}, Landroid/view/Display;->getCurrentSizeRange(Landroid/graphics/Point;Landroid/graphics/Point;)V

    sget-object v3, Lcom/facebook/react/views/modal/a;->d:Landroid/graphics/Point;

    invoke-virtual {v0, v3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    const v0, 0x101020d

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const-string v4, "obtainStyledAttributes(...)"

    invoke-static {v0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string v5, "dimen"

    const-string v6, "android"

    const-string v7, "status_bar_height"

    invoke-virtual {p0, v7, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-eqz v0, :cond_0

    if-lez v5, :cond_0

    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    float-to-int v4, p0

    :cond_0
    iget p0, v3, Landroid/graphics/Point;->x:I

    iget v0, v3, Landroid/graphics/Point;->y:I

    if-ge p0, v0, :cond_1

    new-instance p0, Landroid/graphics/Point;

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v2, Landroid/graphics/Point;->y:I

    add-int/2addr v1, v4

    invoke-direct {p0, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_0

    :cond_1
    new-instance p0, Landroid/graphics/Point;

    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    add-int/2addr v1, v4

    invoke-direct {p0, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    :goto_0
    return-object p0
.end method

.class public final Lcom/facebook/react/uimanager/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/h;

.field private static b:Landroid/util/DisplayMetrics;

.field private static c:Landroid/util/DisplayMetrics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/h;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/h;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/h;->a:Lcom/facebook/react/uimanager/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(D)Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/h;->b:Landroid/util/DisplayMetrics;

    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/react/uimanager/h;->c:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    sget-object v1, Lcom/facebook/react/uimanager/h;->a:Lcom/facebook/react/uimanager/h;

    sget-object v2, Lcom/facebook/react/uimanager/h;->b:Landroid/util/DisplayMetrics;

    const-string v3, "null cannot be cast to non-null type android.util.DisplayMetrics"

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/h;->b(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    const-string v4, "windowPhysicalPixels"

    invoke-virtual {v0, v4, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    sget-object v2, Lcom/facebook/react/uimanager/h;->c:Landroid/util/DisplayMetrics;

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/h;->b(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p0

    const-string p1, "screenPhysicalPixels"

    invoke-virtual {v0, p1, p0}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final b(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    iget v1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    const-string v2, "width"

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "height"

    iget v2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    iget v1, p1, Landroid/util/DisplayMetrics;->density:F

    float-to-double v1, v1

    const-string v3, "scale"

    invoke-virtual {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "fontScale"

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-double p1, p1

    const-string p3, "densityDpi"

    invoke-virtual {v0, p3, p1, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    return-object v0
.end method

.method public static final c()Landroid/util/DisplayMetrics;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/h;->c:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d()Landroid/util/DisplayMetrics;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/h;->b:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/h;->b:Landroid/util/DisplayMetrics;

    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {v1, v0}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p0, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/view/WindowManager;

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    sput-object v1, Lcom/facebook/react/uimanager/h;->c:Landroid/util/DisplayMetrics;

    return-void
.end method

.method public static final f(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/uimanager/h;->c:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/h;->e(Landroid/content/Context;)V

    return-void
.end method

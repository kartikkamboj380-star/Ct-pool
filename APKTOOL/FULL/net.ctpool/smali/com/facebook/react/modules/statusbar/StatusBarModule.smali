.class public final Lcom/facebook/react/modules/statusbar/StatusBarModule;
.super Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/statusbar/StatusBarModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "StatusBarManager"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/modules/statusbar/StatusBarModule$a;

.field private static final DEFAULT_BACKGROUND_COLOR_KEY:Ljava/lang/String; = "DEFAULT_BACKGROUND_COLOR"

.field private static final HEIGHT_KEY:Ljava/lang/String; = "HEIGHT"

.field public static final NAME:Ljava/lang/String; = "StatusBarManager"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/statusbar/StatusBarModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/statusbar/StatusBarModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/statusbar/StatusBarModule;->Companion:Lcom/facebook/react/modules/statusbar/StatusBarModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public static synthetic a(Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/statusbar/StatusBarModule;->setHidden$lambda$1(Landroid/app/Activity;Z)V

    return-void
.end method

.method public static synthetic b(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/statusbar/StatusBarModule;->setStyle$lambda$2(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method private final getStatusBarHeightPx()F
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/core/view/H;->I(Landroid/view/View;)Landroidx/core/view/U;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/core/view/U$m;->e()I

    move-result v1

    invoke-static {}, Landroidx/core/view/U$m;->d()I

    move-result v2

    or-int/2addr v1, v2

    invoke-static {}, Landroidx/core/view/U$m;->a()I

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/core/view/U;->f(I)Landroidx/core/graphics/b;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/b;->b:I

    int-to-float v0, v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private static final setHidden$lambda$1(Landroid/app/Activity;Z)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x800

    const/16 v1, 0x400

    if-eqz p1, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p0, v1}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    return-void
.end method

.method private static final setStyle$lambda$2(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const-string v2, "dark-content"

    if-le v0, v1, :cond_3

    invoke-static {p0}, Landroidx/core/view/y0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object p0

    if-nez p0, :cond_1

    return-void

    :cond_1
    invoke-static {v2, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/16 v0, 0x8

    if-eqz p1, :cond_2

    invoke-static {p0, v0, v0}, Landroidx/core/view/z0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Landroidx/core/view/z0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    const-string v0, "getDecorView(...)"

    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    invoke-static {v2, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    or-int/lit16 p1, v0, 0x2000

    goto :goto_0

    :cond_4
    and-int/lit16 p1, v0, -0x2001

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method protected getTypedExportedConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getStatusBarColor()I

    move-result v0

    sget-object v1, Lw5/y;->a:Lw5/y;

    const v1, 0xffffff

    and-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "#%06X"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "black"

    :goto_0
    invoke-direct {p0}, Lcom/facebook/react/modules/statusbar/StatusBarModule;->getStatusBarHeightPx()F

    move-result v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "HEIGHT"

    invoke-static {v2, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v1

    const-string v2, "DEFAULT_BACKGROUND_COLOR"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {v1, v0}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public setColor(DZ)V
    .locals 2

    double-to-int p1, p1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p1, "ReactNative"

    const-string p2, "StatusBarModule: Ignored status bar change, current activity is null."

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/modules/statusbar/StatusBarModule$b;

    invoke-direct {v1, p2, p3, p1, v0}, Lcom/facebook/react/modules/statusbar/StatusBarModule$b;-><init>(Landroid/app/Activity;ZILcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setHidden(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "ReactNative"

    const-string v0, "StatusBarModule: Ignored status bar change, current activity is null."

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v1, Lcom/facebook/react/modules/statusbar/a;

    invoke-direct {v1, v0, p1}, Lcom/facebook/react/modules/statusbar/a;-><init>(Landroid/app/Activity;Z)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setStyle(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "ReactNative"

    const-string v0, "StatusBarModule: Ignored status bar change, current activity is null."

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v1, Lcom/facebook/react/modules/statusbar/b;

    invoke-direct {v1, v0, p1}, Lcom/facebook/react/modules/statusbar/b;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setTranslucent(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "ReactNative"

    const-string v0, "StatusBarModule: Ignored status bar change, current activity is null."

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;

    invoke-direct {v2, v0, p1, v1}, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;-><init>(Landroid/app/Activity;ZLcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-static {v2}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

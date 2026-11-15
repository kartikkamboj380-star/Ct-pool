.class public abstract Lcom/zoontek/rnbootsplash/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zoontek/rnbootsplash/b$e;
    }
.end annotation


# static fields
.field private static final a:Le5/k;

.field private static b:Lcom/zoontek/rnbootsplash/b$e;

.field private static c:I

.field private static d:Le5/d;

.field private static e:Le5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le5/k;

    invoke-direct {v0}, Le5/k;-><init>()V

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->a:Le5/k;

    sget-object v0, Lcom/zoontek/rnbootsplash/b$e;->m:Lcom/zoontek/rnbootsplash/b$e;

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    const/4 v0, -0x1

    sput v0, Lcom/zoontek/rnbootsplash/b;->c:I

    const/4 v0, 0x0

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->e:Le5/d;

    return-void
.end method

.method static bridge synthetic a()Le5/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->e:Le5/d;

    return-object v0
.end method

.method static bridge synthetic b()Le5/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    return-object v0
.end method

.method static bridge synthetic c()Lcom/zoontek/rnbootsplash/b$e;
    .locals 1

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    return-object v0
.end method

.method static bridge synthetic d()I
    .locals 1

    .line 1
    sget v0, Lcom/zoontek/rnbootsplash/b;->c:I

    return v0
.end method

.method static bridge synthetic e(Le5/d;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/zoontek/rnbootsplash/b;->e:Le5/d;

    return-void
.end method

.method static bridge synthetic f(Le5/d;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    return-void
.end method

.method static bridge synthetic g(Lcom/zoontek/rnbootsplash/b$e;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    return-void
.end method

.method static bridge synthetic h()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->j()V

    return-void
.end method

.method static bridge synthetic i(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zoontek/rnbootsplash/b;->m(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V

    return-void
.end method

.method private static j()V
    .locals 2

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->a:Le5/k;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Le5/k;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/Promise;

    if-eqz v0, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static k(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    const-string v3, "status_bar_height"

    const-string v4, "dimen"

    const-string v5, "android"

    invoke-virtual {v0, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    const-string v6, "navigation_bar_height"

    invoke-virtual {v0, v6, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    if-lez v3, :cond_0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    if-lez v4, :cond_1

    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    int-to-float p0, p0

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v5

    :cond_1
    const/16 p0, 0x20

    if-ne v2, p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "darkModeEnabled"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->o()Z

    move-result p0

    if-eqz p0, :cond_3

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    goto :goto_2

    :cond_3
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string v0, "logoSizeRatio"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const-string v0, "navigationBarHeight"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const-string v0, "statusBarHeight"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public static l(Lcom/facebook/react/bridge/ReactApplicationContext;ZLcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->a:Le5/k;

    invoke-virtual {v0, p2}, Le5/k;->c(Ljava/lang/Object;)V

    invoke-static {p0, p1}, Lcom/zoontek/rnbootsplash/b;->m(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V

    return-void
.end method

.method private static m(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zoontek/rnbootsplash/b$d;

    invoke-direct {v0, p0, p1}, Lcom/zoontek/rnbootsplash/b$d;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected static n(Landroid/app/Activity;I)V
    .locals 3

    .line 1
    sget v0, Lcom/zoontek/rnbootsplash/b;->c:I

    const/4 v1, -0x1

    const-string v2, "ReactNative"

    if-eq v0, v1, :cond_0

    const-string p0, "RNBootSplash: Ignored initialization, module is already initialized."

    invoke-static {v2, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sput p1, Lcom/zoontek/rnbootsplash/b;->c:I

    if-nez p0, :cond_1

    const-string p0, "RNBootSplash: Ignored initialization, current activity is null."

    invoke-static {v2, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Le5/a;->a:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    :cond_2
    const p1, 0x1020002

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    sget-object v0, Lcom/zoontek/rnbootsplash/b$e;->o:Lcom/zoontek/rnbootsplash/b$e;

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/zoontek/rnbootsplash/b$a;

    invoke-direct {v1, p1}, Lcom/zoontek/rnbootsplash/b$a;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p1, v0, :cond_3

    new-instance p1, Lcom/zoontek/rnbootsplash/b$b;

    invoke-direct {p1, p0}, Lcom/zoontek/rnbootsplash/b$b;-><init>(Landroid/app/Activity;)V

    invoke-static {p0}, Le5/e;->a(Landroid/app/Activity;)Landroid/window/SplashScreen;

    move-result-object v0

    invoke-static {v0, p1}, Le5/f;->a(Landroid/window/SplashScreen;Landroid/window/SplashScreen$OnExitAnimationListener;)V

    :cond_3
    new-instance p1, Le5/d;

    sget v0, Lcom/zoontek/rnbootsplash/b;->c:I

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Le5/d;-><init>(Landroid/app/Activity;IZ)V

    sput-object p1, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    new-instance p0, Lcom/zoontek/rnbootsplash/b$c;

    invoke-direct {p0}, Lcom/zoontek/rnbootsplash/b$c;-><init>()V

    invoke-static {p0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static o()Z
    .locals 3

    .line 1
    const-string v0, "SEM_PLATFORM_INT"

    const/4 v1, 0x0

    :try_start_0
    const-class v2, Landroid/os/Build$VERSION;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x15f90

    sub-int/2addr v0, v2

    div-int/lit16 v0, v0, 0x2710
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :catch_0
    :cond_0
    return v1
.end method

.method public static p(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    sget-object v1, Lcom/zoontek/rnbootsplash/b$e;->m:Lcom/zoontek/rnbootsplash/b$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method protected static q()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zoontek/rnbootsplash/b$e;->m:Lcom/zoontek/rnbootsplash/b$e;

    sput-object v0, Lcom/zoontek/rnbootsplash/b;->b:Lcom/zoontek/rnbootsplash/b$e;

    const/4 v0, -0x1

    sput v0, Lcom/zoontek/rnbootsplash/b;->c:I

    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->j()V

    sget-object v0, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le5/d;->dismiss()V

    sput-object v1, Lcom/zoontek/rnbootsplash/b;->d:Le5/d;

    :cond_0
    sget-object v0, Lcom/zoontek/rnbootsplash/b;->e:Le5/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Le5/d;->dismiss()V

    sput-object v1, Lcom/zoontek/rnbootsplash/b;->e:Le5/d;

    :cond_1
    return-void
.end method

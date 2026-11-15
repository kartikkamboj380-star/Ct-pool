.class Lcom/facebook/react/devsupport/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/view/WindowManager;

.field private final b:Lcom/facebook/react/bridge/ReactContext;

.field private c:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/c;->b:Lcom/facebook/react/bridge/ReactContext;

    const-string v0, "window"

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Lcom/facebook/react/devsupport/c;->a:Landroid/view/WindowManager;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/c;->c:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/devsupport/c;)Lcom/facebook/react/bridge/ReactContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/c;->b:Lcom/facebook/react/bridge/ReactContext;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/devsupport/c;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/c;->a:Landroid/view/WindowManager;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/devsupport/c;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/c;->c:Landroid/widget/FrameLayout;

    return-void
.end method

.method static bridge synthetic e(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/c;->g(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static f(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static g(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static h(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "ReactNative"

    const-string v2, "Overlay permissions needs to be granted in order for react native apps to run in dev mode"

    invoke-static {v1, v2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/facebook/react/devsupport/c;->f(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public i(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/c$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/c$a;-><init>(Lcom/facebook/react/devsupport/c;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.class public final Lcom/facebook/react/devsupport/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/a;
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/f$a;,
        Lcom/facebook/react/devsupport/f$b;
    }
.end annotation


# static fields
.field public static final e:Lcom/facebook/react/devsupport/f$a;


# instance fields
.field private final a:Lcom/facebook/react/devsupport/f$b;

.field private final b:Landroid/content/SharedPreferences;

.field private final c:Lt2/d;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/devsupport/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/devsupport/f;->e:Lcom/facebook/react/devsupport/f$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/devsupport/f$b;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/devsupport/f;->a:Lcom/facebook/react/devsupport/f$b;

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v0, "getDefaultSharedPreferences(...)"

    invoke-static {p2, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    new-instance v0, Lt2/d;

    invoke-direct {v0, p1}, Lt2/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/f;->c:Lt2/d;

    invoke-interface {p2, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "inspector_debug"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hot_module_replacement"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "inspector_debug"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "js_minify_debug"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "fps_debug"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public f(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "remote_js_debug"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public g()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "fps_debug"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "js_dev_mode_debug"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "hot_module_replacement"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public j()Lt2/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->c:Lt2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/f;->d:Z

    return v0
.end method

.method public l(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "js_dev_mode_debug"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public m()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/f;->b:Landroid/content/SharedPreferences;

    const-string v1, "remote_js_debug"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/f;->a:Lcom/facebook/react/devsupport/f$b;

    if-eqz p1, :cond_1

    const-string p1, "fps_debug"

    invoke-static {p1, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "js_dev_mode_debug"

    invoke-static {p1, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "start_sampling_profiler_on_init"

    invoke-static {p1, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "js_minify_debug"

    invoke-static {p1, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/f;->a:Lcom/facebook/react/devsupport/f$b;

    invoke-interface {p1}, Lcom/facebook/react/devsupport/f$b;->a()V

    :cond_1
    return-void
.end method

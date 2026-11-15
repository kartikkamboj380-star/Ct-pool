.class public Lcom/facebook/react/modules/fresco/FrescoModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;


# annotations
.annotation runtime Li2/a;
    name = "FrescoModule"
    needsEagerInit = true
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "FrescoModule"

.field private static sHasBeenInitialized:Z = false


# instance fields
.field private final mClearOnDestroy:Z

.field private mConfig:Ly1/l;

.field private mImagePipeline:Ly1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLy1/l;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ly1/k;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ly1/k;ZZ)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ly1/k;ZZ)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V

    iput-object p2, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mImagePipeline:Ly1/k;

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    sput-boolean p1, Lcom/facebook/react/modules/fresco/FrescoModule;->sHasBeenInitialized:Z

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLy1/l;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLy1/l;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-boolean p2, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mClearOnDestroy:Z

    iput-object p3, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    return-void
.end method

.method private static getDefaultConfig(Lcom/facebook/react/bridge/ReactContext;)Ly1/l;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/fresco/FrescoModule;->getDefaultConfigBuilder(Lcom/facebook/react/bridge/ReactContext;)Ly1/l$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ly1/l$a;->a()Ly1/l;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static getDefaultConfigBuilder(Lcom/facebook/react/bridge/ReactContext;)Ly1/l$a;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp2/b;

    .line 7
    .line 8
    invoke-direct {v1}, Lp2/b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/facebook/react/modules/network/h;->a()LT5/z;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, LT5/z;->p()LT5/n;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/facebook/react/modules/network/a;

    .line 23
    .line 24
    new-instance v3, Lcom/facebook/react/modules/network/e;

    .line 25
    .line 26
    invoke-direct {v3, p0}, Lcom/facebook/react/modules/network/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, LT5/w;

    .line 30
    .line 31
    invoke-direct {v4, v3}, LT5/w;-><init>(Ljava/net/CookieHandler;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2, v4}, Lcom/facebook/react/modules/network/a;->c(LT5/n;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v1}, Lu1/a;->a(Landroid/content/Context;LT5/z;)Ly1/l$a;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v2, Lcom/facebook/react/modules/fresco/a;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lcom/facebook/react/modules/fresco/a;-><init>(LT5/z;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ly1/l$a;->R(Lcom/facebook/imagepipeline/producers/X;)Ly1/l$a;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {p0, v1}, Ly1/l$a;->P(Z)Ly1/l$a;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v0}, Ly1/l$a;->S(Ljava/util/Set;)Ly1/l$a;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method private getImagePipeline()Ly1/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mImagePipeline:Ly1/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lc1/c;->a()Ly1/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mImagePipeline:Ly1/k;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mImagePipeline:Ly1/k;

    .line 12
    .line 13
    return-object v0
.end method

.method public static hasBeenInitialized()Z
    .locals 1

    sget-boolean v0, Lcom/facebook/react/modules/fresco/FrescoModule;->sHasBeenInitialized:Z

    return v0
.end method


# virtual methods
.method public clearSensitiveData()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/modules/fresco/FrescoModule;->getImagePipeline()Ly1/k;

    move-result-object v0

    invoke-virtual {v0}, Ly1/k;->c()V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "FrescoModule"

    return-object v0
.end method

.method public initialize()V
    .locals 2

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->initialize()V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-static {}, Lcom/facebook/react/modules/fresco/FrescoModule;->hasBeenInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/facebook/react/modules/fresco/FrescoModule;->getDefaultConfig(Lcom/facebook/react/bridge/ReactContext;)Ly1/l;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    invoke-static {v0, v1}, Lc1/c;->e(Landroid/content/Context;Ly1/l;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/react/modules/fresco/FrescoModule;->sHasBeenInitialized:Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    if-eqz v0, :cond_2

    const-string v0, "ReactNative"

    const-string v1, "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!"

    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mConfig:Ly1/l;

    return-void
.end method

.method public invalidate()V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    return-void
.end method

.method public onHostDestroy()V
    .locals 1

    invoke-static {}, Lcom/facebook/react/modules/fresco/FrescoModule;->hasBeenInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/modules/fresco/FrescoModule;->mClearOnDestroy:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/modules/fresco/FrescoModule;->getImagePipeline()Ly1/k;

    move-result-object v0

    invoke-virtual {v0}, Ly1/k;->e()V

    :cond_0
    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 0

    return-void
.end method

.class public final Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;
.super Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNCSafeAreaContext"
.end annotation


# static fields
.field public static final Companion:Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;

.field public static final NAME:Ljava/lang/String; = "RNCSafeAreaContext"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;->Companion:Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method private final getInitialWindowMetrics()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/h;->e(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/a;

    move-result-object v3

    invoke-static {v0, v2}, Lcom/th3rdwave/safeareacontext/h;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/c;

    move-result-object v0

    if-eqz v3, :cond_4

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "insets"

    invoke-static {v3}, Lcom/th3rdwave/safeareacontext/q;->a(Lcom/th3rdwave/safeareacontext/a;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v1

    const-string v2, "frame"

    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/q;->c(Lcom/th3rdwave/safeareacontext/c;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {v1, v0}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    move-result-object v1

    :cond_4
    :goto_2
    return-object v1
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNCSafeAreaContext"

    return-object v0
.end method

.method public getTypedExportedConstants()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "initialWindowMetrics"

    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;->getInitialWindowMetrics()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->e(Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

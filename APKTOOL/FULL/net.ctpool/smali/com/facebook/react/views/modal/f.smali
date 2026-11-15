.class public final Lcom/facebook/react/views/modal/f;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/modal/f$a;,
        Lcom/facebook/react/views/modal/f$b;,
        Lcom/facebook/react/views/modal/f$c;
    }
.end annotation


# static fields
.field private static final v:Lcom/facebook/react/views/modal/f$a;


# instance fields
.field private m:Landroid/app/Dialog;

.field private n:Z

.field private o:Landroid/content/DialogInterface$OnShowListener;

.field private p:Lcom/facebook/react/views/modal/f$c;

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:Lcom/facebook/react/views/modal/f$b;

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/modal/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/modal/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/modal/f;->v:Lcom/facebook/react/views/modal/f$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/e0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p0}, Lcom/facebook/react/uimanager/e0;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    new-instance v0, Lcom/facebook/react/views/modal/f$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/views/modal/f$b;-><init>(Lcom/facebook/react/views/modal/f;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Landroid/app/Activity;

    invoke-static {v1, v2}, LG2/a;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/react/views/modal/f;->u:Z

    iget-object v1, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    :cond_2
    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    :cond_3
    return-void
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v2, "checkNotNull(...)"

    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, Landroid/view/Window;->isActive()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    :cond_2
    :goto_0
    iget-boolean v1, p0, Lcom/facebook/react/views/modal/f;->n:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    goto :goto_1

    :cond_3
    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "dialog must have window when we call updateProperties"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "dialog must exist when we call updateProperties"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final f()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "checkNotNull(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    const-string v4, "Required value was null."

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-le v2, v3, :cond_2

    invoke-static {v0}, Landroidx/core/view/y0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/facebook/react/views/modal/e;->a(Landroid/view/WindowInsetsController;)I

    move-result v0

    const/16 v2, 0x8

    and-int/2addr v0, v2

    invoke-static {v1}, Landroidx/core/view/y0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1, v0, v2}, Landroidx/core/view/z0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "getDecorView(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "dialog must have window when we call updateProperties"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "dialog must exist when we call updateProperties"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getContentView()Landroid/view/View;
    .locals 2

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v1, p0, Lcom/facebook/react/views/modal/f;->q:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    :goto_0
    return-object v0
.end method

.method private final getCurrentActivity()Landroid/app/Activity;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addChildrenForAccessibility(Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "outChildren"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/e0;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->a()V

    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/views/modal/f;->u:Z

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/modal/f;->u:Z

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->r:Ljava/lang/String;

    const-string v1, "fade"

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v0, Lcom/facebook/react/r;->d:I

    goto :goto_0

    :cond_0
    const-string v1, "slide"

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/facebook/react/r;->e:I

    goto :goto_0

    :cond_1
    sget v0, Lcom/facebook/react/r;->c:I

    :goto_0
    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Landroid/app/Dialog;

    if-eqz v1, :cond_2

    move-object v3, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    :goto_1
    invoke-direct {v2, v3, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x8

    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->d()V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->o:Landroid/content/DialogInterface$OnShowListener;

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    new-instance v0, Lcom/facebook/react/views/modal/f$d;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/modal/f$d;-><init>(Lcom/facebook/react/views/modal/f;)V

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_3

    const/16 v4, 0x10

    invoke-virtual {v0, v4}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_3
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/f;->s:Z

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_4

    const/high16 v4, 0x1000000

    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->f()V

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    :cond_5
    return-void

    :cond_6
    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->d()V

    return-void
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 1

    const-string v0, "structure"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/i;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    return-void
.end method

.method public final e(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/modal/f$b;->u(II)V

    return-void
.end method

.method public final getAnimationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public final getDialog()Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->m:Landroid/app/Dialog;

    return-object v0
.end method

.method public final getEventDispatcher()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0}, Lcom/facebook/react/views/modal/f$b;->getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method public final getHardwareAccelerated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/modal/f;->s:Z

    return v0
.end method

.method public final getOnRequestCloseListener()Lcom/facebook/react/views/modal/f$c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->p:Lcom/facebook/react/views/modal/f$c;

    return-object v0
.end method

.method public final getOnShowListener()Landroid/content/DialogInterface$OnShowListener;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->o:Landroid/content/DialogInterface$OnShowListener;

    return-object v0
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/d0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0}, Lcom/facebook/react/views/modal/f$b;->getStateWrapper$ReactAndroid_release()Lcom/facebook/react/uimanager/d0;

    move-result-object v0

    return-object v0
.end method

.method public final getStatusBarTranslucent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/modal/f;->q:Z

    return v0
.end method

.method public final getTransparent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/modal/f;->n:Z

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f;->a()V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/views/modal/f;->b()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/views/modal/f;->c()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/i;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/modal/f;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/i;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final setAnimationType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f;->r:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->u:Z

    return-void
.end method

.method public final setEventDispatcher(Lcom/facebook/react/uimanager/events/e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/modal/f$b;->setEventDispatcher$ReactAndroid_release(Lcom/facebook/react/uimanager/events/e;)V

    return-void
.end method

.method public final setHardwareAccelerated(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->s:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->u:Z

    return-void
.end method

.method public final setOnRequestCloseListener(Lcom/facebook/react/views/modal/f$c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f;->p:Lcom/facebook/react/views/modal/f$c;

    return-void
.end method

.method public final setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f;->o:Landroid/content/DialogInterface$OnShowListener;

    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/d0;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f;->t:Lcom/facebook/react/views/modal/f$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/modal/f$b;->setStateWrapper$ReactAndroid_release(Lcom/facebook/react/uimanager/d0;)V

    return-void
.end method

.method public final setStatusBarTranslucent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->q:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->u:Z

    return-void
.end method

.method public final setTransparent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/modal/f;->n:Z

    return-void
.end method

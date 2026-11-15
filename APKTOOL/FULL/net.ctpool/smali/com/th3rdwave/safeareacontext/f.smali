.class public final Lcom/th3rdwave/safeareacontext/f;
.super Lcom/facebook/react/views/view/i;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private m:Lv5/q;

.field private n:Lcom/th3rdwave/safeareacontext/a;

.field private o:Lcom/th3rdwave/safeareacontext/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private final q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/f;->m:Lv5/q;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/h;->e(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/a;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p0}, Lcom/th3rdwave/safeareacontext/h;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/c;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    iget-object v3, p0, Lcom/th3rdwave/safeareacontext/f;->n:Lcom/th3rdwave/safeareacontext/a;

    invoke-static {v3, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/th3rdwave/safeareacontext/f;->o:Lcom/th3rdwave/safeareacontext/c;

    invoke-static {v3, v2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    invoke-interface {v0, p0, v1, v2}, Lv5/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, p0, Lcom/th3rdwave/safeareacontext/f;->n:Lcom/th3rdwave/safeareacontext/a;

    iput-object v2, p0, Lcom/th3rdwave/safeareacontext/f;->o:Lcom/th3rdwave/safeareacontext/c;

    :cond_4
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Lcom/facebook/react/views/view/i;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/f;->q()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public onPreDraw()Z
    .locals 1

    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/f;->q()V

    const/4 v0, 0x1

    return v0
.end method

.method public final setOnInsetsChangeHandler(Lv5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/q;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/f;->m:Lv5/q;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/f;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.class public abstract Lcom/th3rdwave/safeareacontext/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/g;->b(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V

    return-void
.end method

.method private static final b(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    invoke-static {v0, p0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/th3rdwave/safeareacontext/b;

    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/r;->b(Landroid/content/Context;)I

    move-result v0

    invoke-direct {v2, v0, p0, p1, p2}, Lcom/th3rdwave/safeareacontext/b;-><init>(IILcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

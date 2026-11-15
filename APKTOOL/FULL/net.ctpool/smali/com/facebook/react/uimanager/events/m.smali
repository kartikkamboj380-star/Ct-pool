.class public final Lcom/facebook/react/uimanager/events/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/events/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/events/m;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/m;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/events/m;->a:Lcom/facebook/react/uimanager/events/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "view"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/facebook/react/uimanager/a0;->a(Landroid/view/View;)Lcom/facebook/react/uimanager/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lcom/facebook/react/uimanager/Z;->d(Landroid/view/View;Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

.method public static final b(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "view"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/facebook/react/uimanager/a0;->a(Landroid/view/View;)Lcom/facebook/react/uimanager/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lcom/facebook/react/uimanager/Z;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

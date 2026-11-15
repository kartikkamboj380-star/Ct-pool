.class public Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;
.super Lcom/facebook/react/uimanager/BaseViewManager;
.source "SourceFile"

# interfaces
.implements LF2/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "Lcom/facebook/react/views/progressbar/a;",
        "Lcom/facebook/react/views/progressbar/b;",
        ">;",
        "LF2/d;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "AndroidProgressBar"
.end annotation


# static fields
.field static final DEFAULT_STYLE:Ljava/lang/String; = "Normal"

.field static final PROP_ANIMATING:Ljava/lang/String; = "animating"

.field static final PROP_ATTR:Ljava/lang/String; = "typeAttr"

.field static final PROP_INDETERMINATE:Ljava/lang/String; = "indeterminate"

.field static final PROP_PROGRESS:Ljava/lang/String; = "progress"

.field static final PROP_STYLE:Ljava/lang/String; = "styleAttr"

.field public static final REACT_CLASS:Ljava/lang/String; = "AndroidProgressBar"

.field private static sProgressBarCtorLock:Ljava/lang/Object;


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/A0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation
.end field

.field private final mMeasuredStyles:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Integer;",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->sProgressBarCtorLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/BaseViewManager;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->mMeasuredStyles:Ljava/util/WeakHashMap;

    new-instance v0, LF2/c;

    invoke-direct {v0, p0}, LF2/c;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->mDelegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method

.method public static createProgressBar(Landroid/content/Context;I)Landroid/widget/ProgressBar;
    .locals 3

    sget-object v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->sProgressBarCtorLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static getStyleFromString(Ljava/lang/String;)I
    .locals 4

    const-string v0, "ReactNative"

    const v1, 0x1010077

    if-nez p0, :cond_0

    const-string p0, "ProgressBar needs to have a style, null received"

    :goto_0
    invoke-static {v0, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    const-string v2, "Horizontal"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const p0, 0x1010078

    return p0

    :cond_1
    const-string v2, "Small"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const p0, 0x1010079

    return p0

    :cond_2
    const-string v2, "Large"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const p0, 0x101007a

    return p0

    :cond_3
    const-string v2, "Inverse"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const p0, 0x1010287

    return p0

    :cond_4
    const-string v2, "SmallInverse"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const p0, 0x1010288

    return p0

    :cond_5
    const-string v2, "LargeInverse"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const p0, 0x1010289

    return p0

    :cond_6
    const-string v2, "Normal"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    return v1

    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown ProgressBar style: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method


# virtual methods
.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->createShadowNodeInstance()Lcom/facebook/react/views/progressbar/b;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/views/progressbar/b;
    .locals 1

    .line 2
    new-instance v0, Lcom/facebook/react/views/progressbar/b;

    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/b;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/progressbar/a;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/progressbar/a;
    .locals 1

    .line 2
    new-instance v0, Lcom/facebook/react/views/progressbar/a;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/progressbar/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->mDelegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "AndroidProgressBar"

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/facebook/react/views/progressbar/b;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/react/views/progressbar/b;

    return-object v0
.end method

.method public measure(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J
    .locals 0

    const-string p2, "styleAttr"

    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->getStyleFromString(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object p4, p0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->mMeasuredStyles:Ljava/util/WeakHashMap;

    invoke-virtual {p4, p3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/util/Pair;

    if-nez p4, :cond_0

    invoke-static {p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->createProgressBar(Landroid/content/Context;I)Landroid/widget/ProgressBar;

    move-result-object p1

    const/4 p2, -0x2

    const/4 p4, 0x0

    invoke-static {p2, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p1, p2, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p4

    iget-object p1, p0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->mMeasuredStyles:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p3, p4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p1

    iget-object p2, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    invoke-static {p2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p2

    invoke-static {p1, p2}, Lcom/facebook/yoga/q;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/progressbar/a;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/progressbar/a;)V
    .locals 0

    .line 2
    invoke-virtual {p1}, Lcom/facebook/react/views/progressbar/a;->a()V

    return-void
.end method

.method public bridge synthetic setAnimating(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "animating"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setAnimating(Lcom/facebook/react/views/progressbar/a;Z)V

    return-void
.end method

.method public setAnimating(Lcom/facebook/react/views/progressbar/a;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "animating"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/progressbar/a;->b(Z)V

    return-void
.end method

.method public bridge synthetic setColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "color"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setColor(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public setColor(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "color"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/progressbar/a;->d(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setIndeterminate(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "indeterminate"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setIndeterminate(Lcom/facebook/react/views/progressbar/a;Z)V

    return-void
.end method

.method public setIndeterminate(Lcom/facebook/react/views/progressbar/a;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "indeterminate"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/progressbar/a;->e(Z)V

    return-void
.end method

.method public bridge synthetic setProgress(Landroid/view/View;D)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "progress"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setProgress(Lcom/facebook/react/views/progressbar/a;D)V

    return-void
.end method

.method public setProgress(Lcom/facebook/react/views/progressbar/a;D)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "progress"
    .end annotation

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/progressbar/a;->f(D)V

    return-void
.end method

.method public bridge synthetic setStyleAttr(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "styleAttr"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setStyleAttr(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V

    return-void
.end method

.method public setStyleAttr(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "styleAttr"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/progressbar/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTestID(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setTestID(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V

    return-void
.end method

.method public setTestID(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->setTestId(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTypeAttr(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "typeAttr"
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->setTypeAttr(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V

    return-void
.end method

.method public setTypeAttr(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "typeAttr"
    .end annotation

    .line 2
    return-void
.end method

.method public bridge synthetic updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/progressbar/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->updateExtraData(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V

    return-void
.end method

.method public updateExtraData(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V
    .locals 0

    .line 2
    return-void
.end method

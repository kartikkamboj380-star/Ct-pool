.class Lcom/facebook/react/views/scroll/d;
.super Landroidx/core/view/a;
.source "SourceFile"


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    const-class v0, Lcom/facebook/react/views/scroll/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/d;->d:Ljava/lang/String;

    return-void
.end method

.method private n(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 9

    .line 1
    sget v0, Lcom/facebook/react/n;->b:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v0, :cond_7

    const-string v1, "itemCount"

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    move v4, v1

    move-object v3, v2

    :goto_0
    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v4, v6, :cond_7

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, p1, Lcom/facebook/react/views/scroll/c;

    if-eqz v6, :cond_1

    move-object v6, p1

    check-cast v6, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {v6, v5}, Lcom/facebook/react/views/scroll/c;->x(Landroid/view/View;)Z

    move-result v6

    goto :goto_1

    :cond_1
    instance-of v6, p1, Lcom/facebook/react/views/scroll/b;

    if-eqz v6, :cond_7

    move-object v6, p1

    check-cast v6, Lcom/facebook/react/views/scroll/b;

    invoke-virtual {v6, v5}, Lcom/facebook/react/views/scroll/b;->A(Landroid/view/View;)Z

    move-result v6

    :goto_1
    sget v7, Lcom/facebook/react/n;->c:I

    invoke-virtual {v5, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/react/bridge/ReadableMap;

    instance-of v8, v5, Landroid/view/ViewGroup;

    if-nez v8, :cond_2

    return-void

    :cond_2
    check-cast v5, Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    if-lez v8, :cond_3

    if-nez v7, :cond_3

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_3

    sget v8, Lcom/facebook/react/n;->c:I

    invoke-virtual {v5, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v5, :cond_3

    move-object v7, v5

    :cond_3
    if-eqz v6, :cond_5

    if-eqz v7, :cond_5

    const-string v3, "itemIndex"

    if-nez v2, :cond_4

    invoke-interface {v7, v3}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_4
    invoke-interface {v7, v3}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_5
    if-eqz v2, :cond_6

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p2, v5}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p2, v5}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method private o(Landroid/view/View;Landroidx/core/view/accessibility/C;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->k(Landroid/view/View;)Lcom/facebook/react/uimanager/I$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lcom/facebook/react/uimanager/I;->l0(Landroidx/core/view/accessibility/C;Lcom/facebook/react/uimanager/I$e;Landroid/content/Context;)V

    :cond_0
    sget v0, Lcom/facebook/react/n;->b:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v0, :cond_1

    const-string v1, "rowCount"

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "columnCount"

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "hierarchical"

    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v1, v2, v0}, Landroidx/core/view/accessibility/C$b;->a(IIZ)Landroidx/core/view/accessibility/C$b;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/core/view/accessibility/C;->i0(Ljava/lang/Object;)V

    :cond_1
    instance-of v0, p1, Lcom/facebook/react/views/scroll/c;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->getScrollEnabled()Z

    move-result p1

    :goto_0
    invoke-virtual {p2, p1}, Landroidx/core/view/accessibility/C;->B0(Z)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/facebook/react/views/scroll/b;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/facebook/react/views/scroll/b;

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->getScrollEnabled()Z

    move-result p1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    instance-of v0, p1, Lcom/facebook/react/views/scroll/c;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/facebook/react/views/scroll/b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/scroll/d;->d:Ljava/lang/String;

    new-instance v0, Lcom/facebook/react/bridge/AssertionException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/AssertionException;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/d;->n(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_1
    return-void
.end method

.method public g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    instance-of v0, p1, Lcom/facebook/react/views/scroll/c;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/facebook/react/views/scroll/b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/scroll/d;->d:Ljava/lang/String;

    new-instance v0, Lcom/facebook/react/bridge/AssertionException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/AssertionException;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/d;->o(Landroid/view/View;Landroidx/core/view/accessibility/C;)V

    :goto_1
    return-void
.end method

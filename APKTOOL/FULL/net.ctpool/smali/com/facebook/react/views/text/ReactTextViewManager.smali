.class public Lcom/facebook/react/views/text/ReactTextViewManager;
.super Lcom/facebook/react/views/text/ReactTextAnchorViewManager;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/text/ReactTextAnchorViewManager<",
        "Lcom/facebook/react/views/text/m;",
        "Lcom/facebook/react/views/text/h;",
        ">;",
        "Lcom/facebook/react/uimanager/r;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RCTText"
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RCTText"

.field private static final TAG:Ljava/lang/String; = "ReactTextViewManager"

.field private static final TX_STATE_KEY_ATTRIBUTED_STRING:S = 0x0s

.field private static final TX_STATE_KEY_HASH:S = 0x2s

.field private static final TX_STATE_KEY_MOST_RECENT_EVENT_COUNT:S = 0x3s

.field private static final TX_STATE_KEY_PARAGRAPH_ATTRIBUTES:S = 0x1s


# instance fields
.field protected mReactTextViewManagerCallback:Lcom/facebook/react/views/text/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/n;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/n;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->setupViewRecycling()V

    return-void
.end method

.method private getReactTextUpdate(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p3, v2}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lcom/facebook/react/views/text/s;->f(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;

    move-result-object v5

    invoke-virtual {p1, v5}, Lcom/facebook/react/views/text/m;->setSpanned(Landroid/text/Spannable;)V

    const/4 v2, 0x6

    :try_start_0
    invoke-interface {p3, v2}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p1, v2}, Lcom/facebook/react/views/text/m;->setMinimumFontSize(F)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x2

    invoke-interface {p3, v2}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/facebook/react/views/text/q;->h(Ljava/lang/String;)I

    move-result v9

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge p3, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/views/text/l;->a(Lcom/facebook/react/views/text/m;)I

    move-result v0

    :goto_0
    new-instance p3, Lcom/facebook/react/views/text/i;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/m;->getGravityHorizontal()I

    move-result p1

    invoke-static {v1, v5, p1}, Lcom/facebook/react/views/text/s;->h(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;I)I

    move-result v8

    invoke-static {p2, v0}, Lcom/facebook/react/views/text/q;->d(Lcom/facebook/react/uimanager/W;I)I

    move-result v10

    const/4 v6, -0x1

    const/4 v7, 0x0

    move-object v4, p3

    invoke-direct/range {v4 .. v10}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZIII)V

    return-object p3

    :catch_0
    move-exception p1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    const-string p2, "<empty>"

    :goto_1
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "ReactTextViewManager"

    const-string v0, "Paragraph Attributes: %s"

    invoke-static {p3, v0, p2}, LP0/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewManager;->createShadowNodeInstance()Lcom/facebook/react/views/text/h;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/views/text/h;
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/react/views/text/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/h;-><init>(Lcom/facebook/react/views/text/n;)V

    return-object v0
.end method

.method public createShadowNodeInstance(Lcom/facebook/react/views/text/n;)Lcom/facebook/react/views/text/h;
    .locals 1

    .line 3
    new-instance v0, Lcom/facebook/react/views/text/h;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/text/h;-><init>(Lcom/facebook/react/views/text/n;)V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/text/m;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/text/m;
    .locals 1

    .line 2
    new-instance v0, Lcom/facebook/react/views/text/m;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/text/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 5

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    const-string v1, "onTextLayout"

    const-string v2, "registrationName"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "onInlineViewLayout"

    invoke-static {v2, v3}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topTextLayout"

    const-string v4, "topInlineViewLayout"

    invoke-static {v3, v1, v4, v2}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RCTText"

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/facebook/react/views/text/h;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/react/views/text/h;

    return-object v0
.end method

.method public measure(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J
    .locals 9

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p5

    move-object v4, p6

    move/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v8, p9

    invoke-static/range {v0 .. v8}, Lcom/facebook/react/views/text/s;->k(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/n;[F)J

    move-result-wide v0

    return-wide v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/text/m;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/text/m;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/text/m;->y()V

    return-void
.end method

.method protected bridge synthetic prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/ReactTextViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;

    move-result-object p1

    return-object p1
.end method

.method protected prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)Landroid/view/View;

    invoke-virtual {p2}, Lcom/facebook/react/views/text/m;->u()V

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;->setSelectionColor(Lcom/facebook/react/views/text/m;Ljava/lang/Integer;)V

    return-object p2
.end method

.method public setOverflow(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "overflow"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setOverflow(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPadding(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual/range {p0 .. p5}, Lcom/facebook/react/views/text/ReactTextViewManager;->setPadding(Lcom/facebook/react/views/text/m;IIII)V

    return-void
.end method

.method public setPadding(Lcom/facebook/react/views/text/m;IIII)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public bridge synthetic updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/ReactTextViewManager;->updateExtraData(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V

    return-void
.end method

.method public updateExtraData(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p2, Lcom/facebook/react/views/text/i;

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p1}, LM2/n;->g(Landroid/text/Spannable;Landroid/widget/TextView;)V

    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setText(Lcom/facebook/react/views/text/i;)V

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const-class v1, LM2/f;

    const/4 v2, 0x0

    invoke-interface {v0, v2, p2, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [LM2/f;

    array-length v1, p2

    if-lez v1, :cond_1

    sget v1, Lcom/facebook/react/n;->f:I

    new-instance v2, Lcom/facebook/react/uimanager/I$d;

    invoke-direct {v2, p2, v0}, Lcom/facebook/react/uimanager/I$d;-><init>([Landroid/text/style/ClickableSpan;Landroid/text/Spannable;)V

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->isFocusable()Z

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/facebook/react/uimanager/I;->i0(Landroid/view/View;ZI)V

    :cond_1
    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/text/ReactTextViewManager;->updateState(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-interface {p3}, Lcom/facebook/react/uimanager/d0;->c()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/text/ReactTextViewManager;->getReactTextUpdate(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

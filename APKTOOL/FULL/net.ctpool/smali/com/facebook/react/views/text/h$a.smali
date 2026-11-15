.class Lcom/facebook/react/views/text/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/yoga/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/views/text/h;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/text/h;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public V(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    iget-object v4, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-static {v4}, Lcom/facebook/react/views/text/h;->z1(Lcom/facebook/react/views/text/h;)Landroid/text/Spannable;

    move-result-object v4

    const-string v5, "Spannable element has not been prepared in onBeforeLayout"

    invoke-static {v4, v5}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/text/Spannable;

    iget-object v5, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/h;->B1(Lcom/facebook/react/views/text/h;Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;

    move-result-object v5

    iget-object v6, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget-boolean v7, v6, Lcom/facebook/react/views/text/c;->T:Z

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v7, :cond_3

    iget-object v6, v6, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v6}, Lcom/facebook/react/views/text/r;->c()I

    move-result v6

    iget-object v7, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget-object v7, v7, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/r;->c()I

    move-result v7

    iget-object v11, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget v11, v11, Lcom/facebook/react/views/text/c;->U:F

    int-to-float v6, v6

    mul-float/2addr v11, v6

    const/high16 v12, 0x40800000    # 4.0f

    invoke-static {v12}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v11

    float-to-int v11, v11

    :goto_0
    if-le v7, v11, :cond_3

    iget-object v12, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget v12, v12, Lcom/facebook/react/views/text/c;->H:I

    if-eq v12, v8, :cond_0

    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    move-result v12

    iget-object v13, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget v13, v13, Lcom/facebook/react/views/text/c;->H:I

    if-gt v12, v13, :cond_1

    :cond_0
    sget-object v12, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    if-eq v3, v12, :cond_3

    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    move-result v12

    int-to-float v12, v12

    cmpl-float v12, v12, p4

    if-lez v12, :cond_3

    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v7, v5

    int-to-float v5, v7

    div-float/2addr v5, v6

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v12

    const-class v13, LM2/d;

    invoke-interface {v4, v9, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [LM2/d;

    array-length v13, v12

    move v14, v9

    :goto_1
    if-ge v14, v13, :cond_2

    aget-object v15, v12, v14

    new-instance v9, LM2/d;

    invoke-virtual {v15}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v5

    int-to-float v8, v11

    invoke-static {v10, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    float-to-int v8, v8

    invoke-direct {v9, v8}, LM2/d;-><init>(I)V

    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v10

    move/from16 v16, v5

    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v5

    invoke-interface {v4, v9, v8, v10, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    invoke-interface {v4, v15}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    move/from16 v5, v16

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    iget-object v5, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/h;->B1(Lcom/facebook/react/views/text/h;Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;

    move-result-object v5

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto :goto_0

    :cond_3
    iget-object v6, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-static {v6}, Lcom/facebook/react/views/text/h;->A1(Lcom/facebook/react/views/text/h;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v6

    invoke-static {}, Lcom/facebook/react/views/text/h;->C1()Landroid/text/TextPaint;

    move-result-object v7

    invoke-static {v4, v5, v7, v6}, Lcom/facebook/react/views/text/b;->a(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v7

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v8

    const-string v9, "lines"

    invoke-interface {v8, v9, v7}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/e0;->hasActiveReactInstance()Z

    move-result v7

    if-eqz v7, :cond_4

    const-class v7, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/e0;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    iget-object v7, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    invoke-virtual {v7}, Lcom/facebook/react/uimanager/V;->r()I

    move-result v7

    const-string v9, "topTextLayout"

    invoke-interface {v6, v7, v9, v8}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_2

    :cond_4
    new-instance v6, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v7, "Cannot get RCTEventEmitter, no CatalystInstance"

    invoke-direct {v6, v7}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string v7, "ReactTextShadowNode"

    invoke-static {v7, v6}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    iget-object v6, v0, Lcom/facebook/react/views/text/h$a;->a:Lcom/facebook/react/views/text/h;

    iget v6, v6, Lcom/facebook/react/views/text/c;->H:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_6

    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    move-result v6

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_3
    sget-object v7, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    if-ne v2, v7, :cond_7

    goto :goto_6

    :cond_7
    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v6, :cond_a

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_8

    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v8

    const/4 v10, 0x1

    sub-int/2addr v8, v10

    invoke-interface {v4, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    const/16 v10, 0xa

    if-ne v8, v10, :cond_8

    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineMax(I)F

    move-result v8

    goto :goto_5

    :cond_8
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v8

    :goto_5
    cmpl-float v10, v8, v7

    if-lez v10, :cond_9

    move v7, v8

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_a
    sget-object v4, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    if-ne v2, v4, :cond_b

    cmpl-float v2, v7, v1

    if-lez v2, :cond_b

    goto :goto_6

    :cond_b
    move v1, v7

    :goto_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-le v2, v4, :cond_c

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    :cond_c
    sget-object v2, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    if-eq v3, v2, :cond_d

    const/4 v2, 0x1

    sub-int/2addr v6, v2

    invoke-virtual {v5, v6}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    int-to-float v2, v2

    sget-object v4, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    if-ne v3, v4, :cond_e

    cmpl-float v3, v2, p4

    if-lez v3, :cond_e

    :cond_d
    move/from16 v2, p4

    :cond_e
    invoke-static {v1, v2}, Lcom/facebook/yoga/q;->a(FF)J

    move-result-wide v1

    return-wide v1
.end method

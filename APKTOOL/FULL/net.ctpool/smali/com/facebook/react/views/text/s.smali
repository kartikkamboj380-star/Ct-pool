.class public abstract Lcom/facebook/react/views/text/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "s"

.field private static final b:Landroid/text/TextPaint;

.field private static final c:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    sput-object v0, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/views/text/s;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;DIZIILandroid/text/Layout$Alignment;)V
    .locals 16

    .line 1
    move-object/from16 v8, p0

    move/from16 v9, p7

    sget-object v0, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    invoke-static {v8, v0}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v10

    move-object/from16 v0, p0

    move-object v1, v10

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p8

    move/from16 v5, p9

    move/from16 v6, p10

    move-object/from16 v7, p11

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/text/s;->c(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;)Landroid/text/Layout;

    move-result-object v0

    invoke-static/range {p5 .. p6}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v1

    float-to-double v1, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p5

    :goto_0
    double-to-int v11, v1

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v12, 0x0

    const-class v13, LM2/d;

    invoke-interface {v8, v12, v1, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LM2/d;

    array-length v2, v1

    move v14, v11

    move v3, v12

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v4

    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_2
    if-le v1, v11, :cond_5

    const/4 v2, -0x1

    if-eq v9, v2, :cond_3

    if-eqz v9, :cond_3

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v2

    if-gt v2, v9, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v15, p4

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v2, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    move-object/from16 v15, p4

    if-eq v15, v2, :cond_5

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v0, p3

    if-lez v0, :cond_5

    :goto_4
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    float-to-int v0, v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int v7, v1, v0

    int-to-float v0, v7

    int-to-float v1, v14

    div-float/2addr v0, v1

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {v8, v12, v1, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LM2/d;

    array-length v2, v1

    move v3, v12

    :goto_5
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    new-instance v5, LM2/d;

    invoke-virtual {v4}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v0

    int-to-float v12, v11

    invoke-static {v6, v12}, Ljava/lang/Math;->max(FF)F

    move-result v6

    float-to-int v6, v6

    invoke-direct {v5, v6}, LM2/d;-><init>(I)V

    invoke-interface {v8, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v8, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v12

    move/from16 p6, v0

    invoke-interface {v8, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v0

    invoke-interface {v8, v5, v6, v12, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    invoke-interface {v8, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, p6

    const/4 v12, 0x0

    goto :goto_5

    :cond_4
    move-object/from16 v0, p0

    move-object v1, v10

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p8

    move/from16 v5, p9

    move/from16 v6, p10

    move v12, v7

    move-object/from16 v7, p11

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/text/s;->c(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;)Landroid/text/Layout;

    move-result-object v0

    move v1, v12

    const/4 v12, 0x0

    goto/16 :goto_2

    :cond_5
    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v0, p3

    invoke-interface/range {p1 .. p1}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_f

    move-object/from16 v4, p1

    invoke-interface {v4, v3}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/4 v7, 0x5

    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v7

    invoke-static {v7}, Lcom/facebook/react/views/text/q;->a(Lcom/facebook/react/common/mapbuffer/a;)Lcom/facebook/react/views/text/q;

    move-result-object v7

    invoke-interface {v5, v2}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v7, Lcom/facebook/react/views/text/q;->n:Lcom/facebook/react/views/text/t;

    invoke-static {v8, v9}, Lcom/facebook/react/views/text/t;->h(Ljava/lang/String;Lcom/facebook/react/views/text/t;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p2

    invoke-virtual {v9, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const/4 v10, 0x1

    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v11

    const/4 v12, -0x1

    if-eqz v11, :cond_0

    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/a;->getInt(I)I

    move-result v11

    goto :goto_1

    :cond_0
    move v11, v12

    :goto_1
    const/4 v13, 0x2

    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/a;->getBoolean(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v6, 0x3

    invoke-interface {v5, v6}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/G;->e(D)F

    move-result v6

    const/4 v7, 0x4

    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/facebook/react/uimanager/G;->e(D)F

    move-result v5

    new-instance v7, LM2/l;

    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v10

    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    new-instance v12, LM2/o;

    float-to-int v6, v6

    float-to-int v5, v5

    invoke-direct {v12, v11, v6, v5}, LM2/o;-><init>(III)V

    invoke-direct {v7, v8, v10, v12}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_1
    if-lt v8, v6, :cond_e

    iget-object v5, v7, Lcom/facebook/react/views/text/q;->w:Lcom/facebook/react/uimanager/I$f;

    if-eqz v5, :cond_2

    sget-object v10, Lcom/facebook/react/uimanager/I$f;->J:Lcom/facebook/react/uimanager/I$f;

    if-ne v5, v10, :cond_3

    goto :goto_2

    :cond_2
    iget-object v5, v7, Lcom/facebook/react/views/text/q;->v:Lcom/facebook/react/uimanager/I$e;

    sget-object v10, Lcom/facebook/react/uimanager/I$e;->q:Lcom/facebook/react/uimanager/I$e;

    if-ne v5, v10, :cond_3

    :goto_2
    new-instance v5, LM2/l;

    new-instance v10, LM2/f;

    invoke-direct {v10, v11}, LM2/f;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-boolean v5, v7, Lcom/facebook/react/views/text/q;->b:Z

    if-eqz v5, :cond_4

    new-instance v5, LM2/l;

    new-instance v10, LM2/g;

    iget v13, v7, Lcom/facebook/react/views/text/q;->d:I

    invoke-direct {v10, v13}, LM2/g;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-boolean v5, v7, Lcom/facebook/react/views/text/q;->e:Z

    if-eqz v5, :cond_5

    new-instance v5, LM2/l;

    new-instance v10, LM2/e;

    iget v13, v7, Lcom/facebook/react/views/text/q;->f:I

    invoke-direct {v10, v13}, LM2/e;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v7}, Lcom/facebook/react/views/text/q;->f()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_6

    new-instance v5, LM2/l;

    new-instance v10, LM2/a;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/q;->f()F

    move-result v13

    invoke-direct {v10, v13}, LM2/a;-><init>(F)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    new-instance v5, LM2/l;

    new-instance v10, LM2/d;

    iget v13, v7, Lcom/facebook/react/views/text/q;->h:I

    invoke-direct {v10, v13}, LM2/d;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v5, v7, Lcom/facebook/react/views/text/q;->x:I

    if-ne v5, v12, :cond_7

    iget v5, v7, Lcom/facebook/react/views/text/q;->y:I

    if-ne v5, v12, :cond_7

    iget-object v5, v7, Lcom/facebook/react/views/text/q;->z:Ljava/lang/String;

    if-eqz v5, :cond_8

    :cond_7
    new-instance v5, LM2/l;

    new-instance v10, LM2/c;

    iget v13, v7, Lcom/facebook/react/views/text/q;->x:I

    iget v14, v7, Lcom/facebook/react/views/text/q;->y:I

    iget-object v15, v7, Lcom/facebook/react/views/text/q;->A:Ljava/lang/String;

    iget-object v12, v7, Lcom/facebook/react/views/text/q;->z:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v17

    move-object/from16 v16, v12

    move-object v12, v10

    invoke-direct/range {v12 .. v17}, LM2/c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-boolean v5, v7, Lcom/facebook/react/views/text/q;->s:Z

    if-eqz v5, :cond_9

    new-instance v5, LM2/l;

    new-instance v10, LM2/k;

    invoke-direct {v10}, LM2/k;-><init>()V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-boolean v5, v7, Lcom/facebook/react/views/text/q;->t:Z

    if-eqz v5, :cond_a

    new-instance v5, LM2/l;

    new-instance v10, LM2/i;

    invoke-direct {v10}, LM2/i;-><init>()V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    iget v5, v7, Lcom/facebook/react/views/text/q;->o:F

    const/4 v10, 0x0

    cmpl-float v5, v5, v10

    if-nez v5, :cond_b

    iget v5, v7, Lcom/facebook/react/views/text/q;->p:F

    cmpl-float v5, v5, v10

    if-nez v5, :cond_b

    iget v5, v7, Lcom/facebook/react/views/text/q;->q:F

    cmpl-float v5, v5, v10

    if-eqz v5, :cond_c

    :cond_b
    iget v5, v7, Lcom/facebook/react/views/text/q;->r:I

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    if-eqz v5, :cond_c

    new-instance v5, LM2/l;

    new-instance v10, LM2/m;

    iget v12, v7, Lcom/facebook/react/views/text/q;->o:F

    iget v13, v7, Lcom/facebook/react/views/text/q;->p:F

    iget v14, v7, Lcom/facebook/react/views/text/q;->q:F

    iget v15, v7, Lcom/facebook/react/views/text/q;->r:I

    invoke-direct {v10, v12, v13, v14, v15}, LM2/m;-><init>(FFFI)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {v7}, Lcom/facebook/react/views/text/q;->b()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_d

    new-instance v5, LM2/l;

    new-instance v10, LM2/b;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/q;->b()F

    move-result v7

    invoke-direct {v10, v7}, LM2/b;-><init>(F)V

    invoke-direct {v5, v6, v8, v10}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    new-instance v5, LM2/l;

    new-instance v7, LM2/j;

    invoke-direct {v7, v11}, LM2/j;-><init>(I)V

    invoke-direct {v5, v6, v8, v7}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_f
    return-void
.end method

.method private static c(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;)Landroid/text/Layout;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v7, p4

    move/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p7

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v8

    sget-object v9, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eq v2, v9, :cond_1

    cmpg-float v9, v1, v11

    if-gez v9, :cond_0

    goto :goto_0

    :cond_0
    move v9, v12

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v9, 0x1

    :goto_1
    if-nez v6, :cond_2

    sget-object v13, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    invoke-static {v0, v13}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v13

    goto :goto_2

    :cond_2
    const/high16 v13, 0x7fc00000    # Float.NaN

    :goto_2
    sget-object v14, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-interface {v14, v0, v12, v8}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v14

    const/high16 v15, 0x3f800000    # 1.0f

    if-nez v6, :cond_7

    if-nez v9, :cond_3

    invoke-static {v13}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v16

    if-nez v16, :cond_7

    cmpg-float v16, v13, v1

    if-gtz v16, :cond_7

    :cond_3
    sget-object v6, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    if-ne v2, v6, :cond_4

    move v13, v1

    :cond_4
    float-to-double v1, v13

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    sget-object v2, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    invoke-static {v0, v12, v8, v2, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v11, v15}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    if-eqz v14, :cond_5

    sget-object v1, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_3

    :cond_5
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    :goto_3
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-virtual {v0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object v0

    goto/16 :goto_7

    :cond_7
    if-eqz v6, :cond_b

    if-nez v9, :cond_8

    iget v9, v6, Landroid/text/BoringLayout$Metrics;->width:I

    int-to-float v9, v9

    cmpg-float v9, v9, v1

    if-gtz v9, :cond_b

    :cond_8
    iget v3, v6, Landroid/text/BoringLayout$Metrics;->width:I

    sget-object v4, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    if-ne v2, v4, :cond_9

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v3, v1

    :cond_9
    iget v1, v6, Landroid/text/BoringLayout$Metrics;->width:I

    if-gez v1, :cond_a

    sget-object v1, Lcom/facebook/react/views/text/s;->a:Ljava/lang/String;

    new-instance v2, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Text width is invalid: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v6, Landroid/text/BoringLayout$Metrics;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v2, v12

    goto :goto_5

    :cond_a
    move v2, v3

    :goto_5
    sget-object v1, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p7

    move v5, v8

    move-object/from16 v6, p1

    move/from16 v7, p4

    invoke-static/range {v0 .. v7}, Landroid/text/BoringLayout;->make(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)Landroid/text/BoringLayout;

    move-result-object v0

    goto :goto_7

    :cond_b
    sget-object v2, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    float-to-double v10, v1

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v1, v10

    invoke-static {v0, v12, v8, v2, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v15}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    if-eqz v14, :cond_c

    sget-object v1, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_6

    :cond_c
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    :goto_6
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_6

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/react/views/text/g;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    goto/16 :goto_4

    :goto_7
    return-object v0
.end method

.method private static d(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;
    .locals 3

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p1

    invoke-static {p0, p1, v0, v1}, Lcom/facebook/react/views/text/s;->b(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    const/4 p0, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p0, p1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, p0

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM2/l;

    invoke-virtual {p1, v0, p0}, LM2/l;->a(Landroid/text/SpannableStringBuilder;I)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2, v0}, Lcom/facebook/react/views/text/n;->a(Landroid/text/Spannable;)V

    :cond_1
    return-object v0
.end method

.method public static e(I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/s;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static f(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;
    .locals 2

    .line 1
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/a;->getInt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object p1, Lcom/facebook/react/views/text/s;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/text/Spannable;

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/text/s;->d(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static g(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;)Landroid/text/Layout$Alignment;
    .locals 5

    .line 1
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/facebook/react/views/text/s;->i(Lcom/facebook/react/common/mapbuffer/a;)Z

    move-result v1

    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-interface {v2, p1, v4, v3}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p1

    if-eq v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    if-eqz p1, :cond_2

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_1

    :cond_2
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_1
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    invoke-interface {p0}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0, v4}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    const/4 v0, 0x5

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    const/16 v0, 0xc

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "center"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_3

    :cond_3
    const-string v0, "right"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    if-eqz p1, :cond_4

    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_2
    move-object v1, p0

    goto :goto_3

    :cond_4
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_2

    :cond_5
    :goto_3
    return-object v1
.end method

.method public static h(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;I)I
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/text/s;->g(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;)Landroid/text/Layout$Alignment;

    move-result-object p0

    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2, v1}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p1

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/4 v1, 0x3

    const/4 v2, 0x5

    if-ne p0, v0, :cond_2

    if-eqz p1, :cond_1

    :cond_0
    move p2, v2

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v1

    goto :goto_1

    :cond_2
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    if-ne p0, v0, :cond_3

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    if-ne p0, p1, :cond_4

    const/4 p2, 0x1

    :cond_4
    :goto_1
    return p2
.end method

.method public static i(Lcom/facebook/react/common/mapbuffer/a;)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    invoke-interface {p0}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-interface {p0, v2}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    const/4 v0, 0x5

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object p0

    const/16 v0, 0x17

    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/react/views/text/q;->e(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_3

    move v2, v0

    :cond_3
    return v2
.end method

.method public static j(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FF)Lcom/facebook/react/bridge/WritableArray;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3}, Lcom/facebook/react/views/text/s;->f(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;

    move-result-object v3

    sget-object v15, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    invoke-static {v3, v15}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v16

    const/4 v4, 0x2

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/react/views/text/q;->h(Ljava/lang/String;)I

    move-result v17

    const/4 v4, 0x4

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->getBoolean(I)Z

    move-result v4

    :goto_0
    move/from16 v18, v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :goto_1
    const/4 v4, 0x5

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/react/views/text/q;->h(Ljava/lang/String;)I

    move-result v19

    const/4 v4, 0x3

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->getBoolean(I)Z

    move-result v4

    goto :goto_2

    :cond_1
    move v4, v6

    :goto_2
    invoke-interface {v2, v6}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2, v6}, Lcom/facebook/react/common/mapbuffer/a;->getInt(I)I

    move-result v5

    :goto_3
    move v11, v5

    goto :goto_4

    :cond_2
    const/4 v5, -0x1

    goto :goto_3

    :goto_4
    invoke-static {v1, v3}, Lcom/facebook/react/views/text/s;->g(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;)Landroid/text/Layout$Alignment;

    move-result-object v1

    if-eqz v4, :cond_4

    const/4 v4, 0x6

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2, v4}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    move-result-wide v4

    :goto_5
    move-wide v9, v4

    goto :goto_6

    :cond_3
    const-wide/high16 v4, 0x7ff8000000000000L    # Double.NaN

    goto :goto_5

    :goto_6
    sget-object v6, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    sget-object v8, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    move-object v4, v3

    move/from16 v5, p3

    move/from16 v7, p4

    move/from16 v12, v18

    move/from16 v13, v17

    move/from16 v14, v19

    move-object v2, v15

    move-object v15, v1

    invoke-static/range {v4 .. v15}, Lcom/facebook/react/views/text/s;->a(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;DIZIILandroid/text/Layout$Alignment;)V

    goto :goto_7

    :cond_4
    move-object v2, v15

    :goto_7
    sget-object v7, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    move-object v4, v3

    move-object/from16 v5, v16

    move/from16 v6, p3

    move/from16 v8, v18

    move/from16 v9, v17

    move/from16 v10, v19

    move-object v11, v1

    invoke-static/range {v4 .. v11}, Lcom/facebook/react/views/text/s;->c(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;)Landroid/text/Layout;

    move-result-object v1

    invoke-static {v3, v1, v2, v0}, Lcom/facebook/react/views/text/b;->a(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    return-object v0
.end method

.method public static k(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/common/mapbuffer/a;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/n;[F)J
    .locals 21

    .line 1
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v12, p4

    move-object/from16 v13, p6

    move-object/from16 v2, p0

    move-object/from16 v3, p7

    invoke-static {v2, v0, v3}, Lcom/facebook/react/views/text/s;->f(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;

    move-result-object v14

    if-nez v14, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/views/text/q;->h(Ljava/lang/String;)I

    move-result v15

    const/4 v2, 0x4

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v3

    const/16 v16, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->getBoolean(I)Z

    move-result v2

    move/from16 v17, v2

    goto :goto_0

    :cond_1
    move/from16 v17, v16

    :goto_0
    const/4 v2, 0x5

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/views/text/q;->c(Ljava/lang/String;)I

    move-result v18

    const/4 v2, 0x3

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v3

    const/4 v11, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1, v2}, Lcom/facebook/react/common/mapbuffer/a;->getBoolean(I)Z

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v11

    :goto_1
    invoke-interface {v1, v11}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v3

    const/4 v10, -0x1

    if-eqz v3, :cond_3

    invoke-interface {v1, v11}, Lcom/facebook/react/common/mapbuffer/a;->getInt(I)I

    move-result v3

    move v9, v3

    goto :goto_2

    :cond_3
    move v9, v10

    :goto_2
    invoke-static {v0, v14}, Lcom/facebook/react/views/text/s;->g(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;)Landroid/text/Layout$Alignment;

    move-result-object v19

    if-eqz v2, :cond_5

    const/4 v0, 0x6

    invoke-interface {v1, v0}, Lcom/facebook/react/common/mapbuffer/a;->j0(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1, v0}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    move-result-wide v0

    :goto_3
    move-wide v5, v0

    goto :goto_4

    :cond_4
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    goto :goto_3

    :goto_4
    move-object v0, v14

    move/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p6

    move v7, v9

    move/from16 v8, v17

    move v13, v9

    move v9, v15

    move v12, v10

    move/from16 v10, v18

    move/from16 v20, v11

    move-object/from16 v11, v19

    invoke-static/range {v0 .. v11}, Lcom/facebook/react/views/text/s;->a(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;DIZIILandroid/text/Layout$Alignment;)V

    goto :goto_5

    :cond_5
    move v13, v9

    move v12, v10

    move/from16 v20, v11

    :goto_5
    sget-object v0, Lcom/facebook/react/views/text/s;->b:Landroid/text/TextPaint;

    invoke-static {v14, v0}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v1

    move-object v0, v14

    move/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, v17

    move v5, v15

    move/from16 v6, v18

    move-object/from16 v7, v19

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/text/s;->c(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;)Landroid/text/Layout;

    move-result-object v0

    if-eq v13, v12, :cond_7

    if-nez v13, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v1

    invoke-static {v13, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_7

    :cond_7
    :goto_6
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v1

    :goto_7
    sget-object v2, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    const/16 v3, 0xa

    move-object/from16 v4, p4

    move v5, v12

    if-ne v4, v2, :cond_8

    goto :goto_a

    :cond_8
    const/4 v2, 0x0

    move/from16 v11, v20

    :goto_8
    if-ge v11, v1, :cond_b

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_9

    invoke-virtual {v0, v11}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-interface {v14, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-ne v6, v3, :cond_9

    invoke-virtual {v0, v11}, Landroid/text/Layout;->getLineMax(I)F

    move-result v6

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v11}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v6

    :goto_9
    cmpl-float v7, v6, v2

    if-lez v7, :cond_a

    move v2, v6

    :cond_a
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_b
    sget-object v6, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    if-ne v4, v6, :cond_c

    cmpl-float v4, v2, p3

    if-lez v4, :cond_c

    :goto_a
    move/from16 v2, p3

    :cond_c
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-le v4, v6, :cond_d

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v2, v6

    :cond_d
    sget-object v4, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    move-object/from16 v6, p6

    if-eq v6, v4, :cond_e

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v1

    int-to-float v1, v1

    sget-object v4, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    if-ne v6, v4, :cond_f

    cmpl-float v4, v1, p5

    if-lez v4, :cond_f

    :cond_e
    move/from16 v1, p5

    :cond_f
    move/from16 v4, v20

    move v11, v4

    :goto_b
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v11, v6, :cond_1b

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const-class v7, LM2/o;

    invoke-interface {v14, v11, v6, v7}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v6

    invoke-interface {v14, v11, v6, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [LM2/o;

    array-length v8, v7

    move/from16 v11, v20

    :goto_c
    if-ge v11, v8, :cond_1a

    aget-object v9, v7, v11

    invoke-interface {v14, v9}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v12

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v13

    if-lez v13, :cond_11

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineStart(I)I

    move-result v13

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v15

    add-int/2addr v13, v15

    if-lt v10, v13, :cond_11

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v13

    if-lt v10, v13, :cond_10

    goto :goto_d

    :cond_10
    move v5, v3

    goto/16 :goto_14

    :cond_11
    :goto_d
    invoke-virtual {v9}, LM2/o;->c()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v9}, LM2/o;->a()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v0, v10}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v15

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v3

    if-ne v3, v5, :cond_12

    move/from16 v3, v16

    goto :goto_e

    :cond_12
    move/from16 v3, v20

    :goto_e
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v17

    add-int/lit8 v5, v17, -0x1

    if-ne v10, v5, :cond_16

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_13

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-interface {v14, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v10, 0xa

    if-ne v5, v10, :cond_14

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineMax(I)F

    move-result v5

    goto :goto_f

    :cond_13
    const/16 v10, 0xa

    :cond_14
    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v5

    :goto_f
    if-eqz v3, :cond_15

    sub-float v3, v2, v5

    goto :goto_10

    :cond_15
    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineRight(I)F

    move-result v3

    sub-float/2addr v3, v13

    :goto_10
    move v5, v10

    goto :goto_13

    :cond_16
    const/16 v5, 0xa

    if-ne v3, v15, :cond_17

    invoke-virtual {v0, v10}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v10

    goto :goto_11

    :cond_17
    invoke-virtual {v0, v10}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result v10

    :goto_11
    if-eqz v3, :cond_18

    if-nez v15, :cond_18

    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineRight(I)F

    move-result v3

    sub-float/2addr v3, v10

    sub-float v3, v2, v3

    goto :goto_12

    :cond_18
    move v3, v10

    :goto_12
    if-eqz v15, :cond_19

    sub-float/2addr v3, v13

    :cond_19
    :goto_13
    invoke-virtual {v0, v12}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v10, v9

    mul-int/lit8 v9, v4, 0x2

    invoke-static {v10}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v10

    aput v10, p8, v9

    add-int/lit8 v9, v9, 0x1

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    aput v3, p8, v9

    add-int/lit8 v4, v4, 0x1

    :goto_14
    add-int/lit8 v11, v11, 0x1

    move v3, v5

    const/4 v5, -0x1

    goto/16 :goto_c

    :cond_1a
    move v11, v6

    goto/16 :goto_b

    :cond_1b
    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v0

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/yoga/q;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static l(ILandroid/text/Spannable;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/s;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

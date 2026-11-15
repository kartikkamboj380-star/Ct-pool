.class Lcom/horcrux/svg/U;
.super Lcom/horcrux/svg/h0;
.source "SourceFile"


# instance fields
.field private C:Landroid/graphics/Path;

.field D:Ljava/lang/String;

.field private E:Lcom/horcrux/svg/V;

.field private final F:Ljava/util/ArrayList;

.field private final G:Ljava/util/ArrayList;

.field private final H:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/h0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/U;->F:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/U;->G:Ljava/util/ArrayList;

    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    return-void
.end method

.method private S(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-wide v1, p2, Lcom/horcrux/svg/q;->n:D

    iget-wide v3, p2, Lcom/horcrux/svg/q;->a:D

    iget v5, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v5, v5

    mul-double/2addr v3, v5

    div-double v3, v1, v3

    double-to-float v3, v3

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/horcrux/svg/q;->i:Lcom/horcrux/svg/Y;

    sget-object v2, Lcom/horcrux/svg/Y;->m:Lcom/horcrux/svg/Y;

    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p2, Lcom/horcrux/svg/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    goto :goto_0

    :goto_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'wght\' "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p2, Lcom/horcrux/svg/q;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/horcrux/svg/q;->h:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/horcrux/svg/M;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method private T(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V
    .locals 10

    .line 1
    iget-object v0, p2, Lcom/horcrux/svg/q;->e:Lcom/horcrux/svg/Z;

    sget-object v1, Lcom/horcrux/svg/Z;->o:Lcom/horcrux/svg/Z;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p2, Lcom/horcrux/svg/q;->f:I

    const/16 v1, 0x226

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/q;->c:Lcom/horcrux/svg/X;

    sget-object v4, Lcom/horcrux/svg/X;->n:Lcom/horcrux/svg/X;

    if-ne v1, v4, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    const/4 v2, 0x3

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    const/4 v2, 0x2

    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/q;->f:I

    iget-object v4, p2, Lcom/horcrux/svg/q;->b:Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "fonts/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".otf"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".ttf"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-lt v8, v9, :cond_6

    invoke-static {}, Lcom/horcrux/svg/T;->a()V

    iget-object v5, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    invoke-static {v5, v6}, Lcom/horcrux/svg/S;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\'wght\' "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v9, p2, Lcom/horcrux/svg/q;->h:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/horcrux/svg/N;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    invoke-static {v5, v0}, Lcom/horcrux/svg/O;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    invoke-static {v5, v1}, Lcom/horcrux/svg/P;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    invoke-static {v5}, Lcom/horcrux/svg/Q;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    move-result-object v5

    if-nez v5, :cond_7

    invoke-static {}, Lcom/horcrux/svg/T;->a()V

    iget-object v5, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    invoke-static {v5, v7}, Lcom/horcrux/svg/S;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v7, p2, Lcom/horcrux/svg/q;->h:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/horcrux/svg/N;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    invoke-static {v5, v0}, Lcom/horcrux/svg/O;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    invoke-static {v5, v1}, Lcom/horcrux/svg/P;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    invoke-static {v5}, Lcom/horcrux/svg/Q;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    move-result-object v5

    goto :goto_4

    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/d;->a()Lcom/facebook/react/views/text/d;

    move-result-object v6

    iget-object v7, p0, Lcom/horcrux/svg/U;->H:Landroid/content/res/AssetManager;

    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/d;->b(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v2, v4, :cond_9

    invoke-static {v5, v0, v1}, LT1/c;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object v5

    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-wide v0, p2, Lcom/horcrux/svg/q;->a:D

    iget p2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-float p2, v0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    return-void
.end method

.method private U(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/u;->u()Lcom/horcrux/svg/s;

    move-result-object v0

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->w()V

    invoke-virtual {v0}, Lcom/horcrux/svg/s;->b()Lcom/horcrux/svg/q;

    move-result-object v1

    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/U;->T(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/U;->S(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    invoke-virtual {v0}, Lcom/horcrux/svg/s;->c()D

    move-result-wide v11

    sget-object p2, Lcom/horcrux/svg/U$a;->a:[I

    iget-object v1, v1, Lcom/horcrux/svg/q;->j:Lcom/horcrux/svg/a0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p2, p2, v1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_1
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    iget-object v2, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/horcrux/svg/h0;->r:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-double v5, v2

    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v9, v2

    const-wide/16 v7, 0x0

    invoke-static/range {v4 .. v12}, Lcom/horcrux/svg/F;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v4

    double-to-int v7, v4

    const/4 v5, 0x1

    move-object v2, p0

    move-object v4, p2

    move-object v6, v1

    invoke-direct/range {v2 .. v7}, Lcom/horcrux/svg/U;->X(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/horcrux/svg/s;->l(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0}, Lcom/horcrux/svg/s;->m()D

    move-result-wide v3

    int-to-double v0, v1

    add-double/2addr v3, v0

    double-to-float v0, v3

    invoke-virtual {p0}, Lcom/horcrux/svg/u;->v()V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private V(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 10

    .line 1
    iget v0, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v6, v0

    const-wide/16 v4, 0x0

    move-object v1, p1

    move-wide v2, p2

    move-wide v8, p4

    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/F;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide p1

    return-wide p1
.end method

.method private W(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 67

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    const/4 v12, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v10

    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    iget-object v0, v6, Lcom/horcrux/svg/U;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, v6, Lcom/horcrux/svg/U;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-nez v10, :cond_0

    return-object v9

    :cond_0
    iget-object v0, v6, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    if-eqz v0, :cond_1

    const/16 v16, 0x1

    goto :goto_0

    :cond_1
    move/from16 v16, v12

    :goto_0
    const-wide/16 v17, 0x0

    if-eqz v16, :cond_3

    new-instance v0, Landroid/graphics/PathMeasure;

    iget-object v1, v6, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    invoke-virtual {v1, v15, v14}, Lcom/horcrux/svg/V;->V(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object v1

    invoke-direct {v0, v1, v12}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v3

    cmpl-double v4, v1, v17

    if-nez v4, :cond_2

    return-object v9

    :cond_2
    move-object v8, v0

    move-wide v4, v1

    move/from16 v19, v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    move-object v8, v0

    move/from16 v19, v12

    move-wide/from16 v4, v17

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/u;->u()Lcom/horcrux/svg/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/horcrux/svg/s;->b()Lcom/horcrux/svg/q;

    move-result-object v0

    invoke-direct {v6, v14, v0}, Lcom/horcrux/svg/U;->T(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    new-instance v3, Lcom/horcrux/svg/t;

    invoke-direct {v3, v14}, Lcom/horcrux/svg/t;-><init>(Landroid/graphics/Paint;)V

    new-array v1, v10, [Z

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v20

    move-object/from16 v22, v8

    iget-wide v7, v0, Lcom/horcrux/svg/q;->l:D

    iget-wide v12, v0, Lcom/horcrux/svg/q;->m:D

    move-wide/from16 v26, v12

    iget-wide v11, v0, Lcom/horcrux/svg/q;->n:D

    iget-boolean v13, v0, Lcom/horcrux/svg/q;->o:Z

    const/16 v25, 0x1

    xor-int/lit8 v28, v13, 0x1

    cmpl-double v13, v11, v17

    if-nez v13, :cond_4

    iget-object v13, v0, Lcom/horcrux/svg/q;->i:Lcom/horcrux/svg/Y;

    move-object/from16 v29, v1

    sget-object v1, Lcom/horcrux/svg/Y;->m:Lcom/horcrux/svg/Y;

    if-ne v13, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move-object/from16 v29, v1

    :cond_5
    const/4 v1, 0x0

    :goto_2
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v30, v3

    const-string v3, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    :goto_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/horcrux/svg/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    move-object/from16 v30, v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    goto :goto_3

    :goto_4
    const/16 v1, 0x1a

    if-lt v13, v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\'wght\' "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/horcrux/svg/q;->f:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/horcrux/svg/q;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Lcom/horcrux/svg/M;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    :cond_7
    iget-object v13, v0, Lcom/horcrux/svg/q;->d:Lcom/facebook/react/bridge/ReadableMap;

    new-array v3, v10, [F

    move-object/from16 v1, p1

    invoke-virtual {v14, v1, v3}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    iget-object v1, v0, Lcom/horcrux/svg/q;->j:Lcom/horcrux/svg/a0;

    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/h0;->F()Lcom/horcrux/svg/h0;

    move-result-object v0

    move-wide/from16 v31, v7

    invoke-virtual {v0, v14}, Lcom/horcrux/svg/h0;->E(Landroid/graphics/Paint;)D

    move-result-wide v7

    invoke-direct {v6, v1, v7, v8}, Lcom/horcrux/svg/U;->Y(Lcom/horcrux/svg/a0;D)D

    move-result-wide v33

    invoke-virtual {v2}, Lcom/horcrux/svg/s;->c()D

    move-result-wide v44

    const-wide/high16 v46, 0x4000000000000000L    # 2.0

    if-eqz v16, :cond_c

    iget-object v0, v6, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    invoke-virtual {v0}, Lcom/horcrux/svg/V;->S()Lcom/horcrux/svg/e0;

    move-result-object v0

    move-object/from16 v35, v1

    sget-object v1, Lcom/horcrux/svg/e0;->m:Lcom/horcrux/svg/e0;

    if-ne v0, v1, :cond_8

    const/16 v36, 0x1

    goto :goto_5

    :cond_8
    const/16 v36, 0x0

    :goto_5
    iget-object v0, v6, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    invoke-virtual {v0}, Lcom/horcrux/svg/V;->T()Lcom/horcrux/svg/f0;

    move-result-object v0

    sget-object v1, Lcom/horcrux/svg/f0;->n:Lcom/horcrux/svg/f0;

    if-ne v0, v1, :cond_9

    const/16 v37, -0x1

    goto :goto_6

    :cond_9
    const/16 v37, 0x1

    :goto_6
    iget-object v0, v6, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    invoke-virtual {v0}, Lcom/horcrux/svg/V;->U()Lcom/horcrux/svg/SVGLength;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v48, v9

    move-object/from16 v9, v35

    move-object v15, v2

    move-object/from16 v49, v30

    move-object/from16 v30, v3

    move-wide v2, v4

    move-object/from16 v50, v13

    move-wide v13, v4

    move-wide/from16 v4, v44

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/U;->V(Lcom/horcrux/svg/SVGLength;DD)D

    move-result-wide v0

    add-double v33, v33, v0

    if-eqz v19, :cond_b

    div-double v4, v13, v46

    sget-object v2, Lcom/horcrux/svg/a0;->n:Lcom/horcrux/svg/a0;

    if-ne v9, v2, :cond_a

    neg-double v2, v4

    goto :goto_7

    :cond_a
    move-wide/from16 v2, v17

    :goto_7
    add-double/2addr v0, v2

    add-double v4, v0, v13

    :goto_8
    move/from16 v3, v36

    move/from16 v2, v37

    goto :goto_9

    :cond_b
    move-wide v4, v13

    move-wide/from16 v0, v17

    goto :goto_8

    :cond_c
    move-object v15, v2

    move-object/from16 v48, v9

    move-object/from16 v50, v13

    move-object/from16 v49, v30

    move-object/from16 v30, v3

    move-wide v13, v4

    move-wide/from16 v0, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_9
    iget-object v9, v6, Lcom/horcrux/svg/h0;->s:Lcom/horcrux/svg/SVGLength;

    const-wide/high16 v51, 0x3ff0000000000000L    # 1.0

    if-eqz v9, :cond_f

    move-wide/from16 v53, v13

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-double v13, v13

    move/from16 p1, v3

    iget v3, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    move-wide/from16 v55, v0

    float-to-double v0, v3

    const-wide/16 v38, 0x0

    move-object/from16 v35, v9

    move-wide/from16 v36, v13

    move-wide/from16 v40, v0

    move-wide/from16 v42, v44

    invoke-static/range {v35 .. v43}, Lcom/horcrux/svg/F;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v0

    cmpg-double v3, v0, v17

    if-ltz v3, :cond_e

    sget-object v3, Lcom/horcrux/svg/U$a;->b:[I

    iget-object v9, v6, Lcom/horcrux/svg/h0;->u:Lcom/horcrux/svg/c0;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v3, v3, v9

    const/4 v9, 0x2

    if-eq v3, v9, :cond_d

    sub-double/2addr v0, v7

    const/4 v3, 0x1

    add-int/lit8 v7, v10, -0x1

    int-to-double v7, v7

    div-double/2addr v0, v7

    add-double/2addr v11, v0

    :goto_a
    move-wide v0, v11

    goto :goto_b

    :cond_d
    div-double v51, v0, v7

    goto :goto_a

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative textLength value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-wide/from16 v55, v0

    move/from16 p1, v3

    move-wide/from16 v53, v13

    goto :goto_a

    :goto_b
    int-to-double v13, v2

    mul-double v11, v51, v13

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    iget v7, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    float-to-double v7, v7

    iget v9, v3, Landroid/graphics/Paint$FontMetrics;->leading:F

    move-wide/from16 v42, v11

    float-to-double v11, v9

    add-double/2addr v11, v7

    move/from16 v19, v2

    iget v2, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v2, v2

    add-float/2addr v2, v9

    move-wide/from16 v57, v4

    float-to-double v4, v2

    iget v2, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v2, v2

    float-to-double v2, v2

    add-double v35, v2, v11

    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/h0;->C()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/horcrux/svg/h0;->B()Lcom/horcrux/svg/W;

    move-result-object v37

    if-eqz v37, :cond_10

    sget-object v38, Lcom/horcrux/svg/U$a;->c:[I

    invoke-virtual/range {v37 .. v37}, Ljava/lang/Enum;->ordinal()I

    move-result v39

    aget v38, v38, v39

    packed-switch v38, :pswitch_data_0

    move-object/from16 v5, p2

    move-wide/from16 v2, v17

    :goto_c
    move-wide/from16 v11, v53

    const/4 v4, 0x0

    goto :goto_f

    :pswitch_0
    move-object/from16 v5, p2

    goto :goto_c

    :pswitch_1
    div-double v11, v35, v46

    :goto_d
    :pswitch_2
    move-object/from16 v5, p2

    move-wide v2, v11

    goto :goto_c

    :pswitch_3
    move-wide v2, v4

    move-wide/from16 v11, v53

    const/4 v4, 0x0

    move-object/from16 v5, p2

    goto :goto_f

    :pswitch_4
    const-wide v2, 0x3fe999999999999aL    # 0.8

    :goto_e
    mul-double v11, v4, v2

    goto :goto_d

    :pswitch_5
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    goto :goto_e

    :pswitch_6
    sub-double/2addr v4, v7

    div-double v11, v4, v46

    goto :goto_d

    :pswitch_7
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    const-string v3, "x"

    move-object/from16 v5, p2

    move-wide/from16 v11, v53

    const/4 v4, 0x0

    const/4 v7, 0x1

    invoke-virtual {v5, v3, v4, v7, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-double v2, v2

    div-double v2, v2, v46

    goto :goto_f

    :pswitch_8
    move-object/from16 v5, p2

    move-wide/from16 v11, v53

    const/4 v4, 0x0

    neg-double v2, v7

    goto :goto_f

    :cond_10
    :pswitch_9
    move-object/from16 v5, p2

    move-wide/from16 v11, v53

    const/4 v4, 0x0

    move-wide/from16 v2, v17

    :goto_f
    if-eqz v9, :cond_15

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_15

    sget-object v7, Lcom/horcrux/svg/U$a;->c:[I

    invoke-virtual/range {v37 .. v37}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    const/16 v8, 0xe

    if-eq v7, v8, :cond_15

    const/16 v8, 0x10

    if-eq v7, v8, :cond_15

    const-string v7, "os2"

    const-string v8, "unitsPerEm"

    const-string v4, "tables"

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v35

    move-wide/from16 v53, v11

    sparse-switch v35, :sswitch_data_0

    :goto_10
    const/16 v21, -0x1

    goto :goto_12

    :sswitch_0
    const-string v11, "super"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    goto :goto_11

    :cond_11
    const/16 v21, 0x2

    goto :goto_12

    :sswitch_1
    const-string v11, "sub"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    goto :goto_11

    :cond_12
    const/16 v21, 0x1

    goto :goto_12

    :sswitch_2
    const-string v11, "baseline"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :goto_11
    goto :goto_10

    :cond_13
    const/16 v21, 0x0

    :goto_12
    packed-switch v21, :pswitch_data_1

    iget v4, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v7, v4

    mul-double v36, v7, v44

    float-to-double v7, v4

    move-object/from16 v35, v9

    move-wide/from16 v38, v7

    move-wide/from16 v40, v44

    invoke-static/range {v35 .. v41}, Lcom/horcrux/svg/F;->b(Ljava/lang/String;DDD)D

    move-result-wide v7

    sub-double/2addr v2, v7

    :cond_14
    :goto_13
    :pswitch_a
    move-wide/from16 v35, v13

    goto/16 :goto_14

    :pswitch_b
    if-eqz v50, :cond_14

    move-object/from16 v9, v50

    invoke-interface {v9, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_14

    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_14

    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v9, v4}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    const-string v7, "ySuperscriptYOffset"

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    iget v4, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    move-wide/from16 v35, v13

    float-to-double v13, v4

    mul-double v13, v13, v44

    mul-double/2addr v13, v11

    int-to-double v7, v8

    div-double/2addr v13, v7

    sub-double/2addr v2, v13

    goto :goto_14

    :pswitch_c
    move-wide/from16 v35, v13

    move-object/from16 v9, v50

    if-eqz v9, :cond_16

    invoke-interface {v9, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v9, v4}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    const-string v7, "ySubscriptYOffset"

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    iget v4, v6, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v13, v4

    mul-double v13, v13, v44

    mul-double/2addr v13, v11

    int-to-double v7, v8

    div-double/2addr v13, v7

    add-double/2addr v2, v13

    goto :goto_14

    :cond_15
    move-wide/from16 v53, v11

    goto :goto_13

    :cond_16
    :goto_14
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    new-instance v14, Landroid/graphics/Matrix;

    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    const/16 v7, 0x9

    new-array v12, v7, [F

    new-array v11, v7, [F

    move-wide/from16 v7, v31

    const/4 v9, 0x0

    :goto_15
    if-ge v9, v10, :cond_28

    move-wide/from16 v31, v7

    aget-char v7, v20, v9

    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v8

    aget-boolean v21, v29, v9

    if-eqz v21, :cond_17

    const-string v8, ""

    move-object v6, v8

    move/from16 v38, v10

    const/16 v37, 0x0

    goto :goto_18

    :cond_17
    move/from16 v25, v9

    const/16 v37, 0x0

    :goto_16
    const/16 v38, 0x1

    add-int/lit8 v6, v25, 0x1

    if-ge v6, v10, :cond_18

    aget v38, v30, v6

    const/16 v39, 0x0

    cmpl-float v38, v38, v39

    if-lez v38, :cond_19

    :cond_18
    move/from16 v38, v10

    goto :goto_17

    :cond_19
    move/from16 v38, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char v8, v20, v6

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x1

    aput-boolean v10, v29, v6

    move/from16 v25, v6

    move/from16 v10, v38

    const/16 v37, 0x1

    goto :goto_16

    :goto_17
    move-object v6, v8

    :goto_18
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    move-object/from16 v40, v6

    float-to-double v5, v8

    mul-double v5, v5, v51

    if-eqz v28, :cond_1a

    aget v8, v30, v9

    move v10, v9

    float-to-double v8, v8

    mul-double v8, v8, v51

    sub-double/2addr v8, v5

    move-wide/from16 v31, v8

    goto :goto_19

    :cond_1a
    move v10, v9

    :goto_19
    const/16 v8, 0x20

    if-ne v7, v8, :cond_1b

    const/4 v8, 0x1

    goto :goto_1a

    :cond_1b
    const/4 v8, 0x0

    :goto_1a
    if-eqz v8, :cond_1c

    move-wide/from16 v44, v26

    goto :goto_1b

    :cond_1c
    move-wide/from16 v44, v17

    :goto_1b
    add-double v44, v44, v0

    add-double v44, v5, v44

    if-eqz v21, :cond_1d

    move-wide/from16 v61, v0

    move-wide/from16 v0, v17

    goto :goto_1c

    :cond_1d
    add-double v59, v31, v44

    move-wide/from16 v61, v0

    move-wide/from16 v0, v59

    :goto_1c
    invoke-virtual {v15, v0, v1}, Lcom/horcrux/svg/s;->l(D)D

    move-result-wide v0

    move/from16 v41, v10

    invoke-virtual {v15}, Lcom/horcrux/svg/s;->m()D

    move-result-wide v9

    invoke-virtual {v15}, Lcom/horcrux/svg/s;->i()D

    move-result-wide v59

    invoke-virtual {v15}, Lcom/horcrux/svg/s;->j()D

    move-result-wide v63

    move-wide/from16 v65, v9

    invoke-virtual {v15}, Lcom/horcrux/svg/s;->k()D

    move-result-wide v9

    if-nez v21, :cond_1e

    if-eqz v8, :cond_1f

    :cond_1e
    :goto_1d
    move-object/from16 v10, p0

    move-object/from16 v9, p3

    move-wide/from16 v59, v2

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    move-object v1, v13

    move-object v11, v15

    move/from16 v5, v19

    move-object/from16 v2, v22

    move/from16 v21, v38

    move/from16 v19, v41

    move-wide/from16 v37, v42

    move-object/from16 v6, v48

    move-object/from16 v0, v49

    const/4 v15, 0x1

    const/16 v25, 0x2

    const/16 v41, 0x0

    move-object/from16 v12, p2

    move-object/from16 v22, v4

    move-wide/from16 v3, v53

    goto/16 :goto_24

    :cond_1f
    mul-double v44, v44, v35

    mul-double v5, v5, v35

    add-double v0, v0, v59

    mul-double v0, v0, v35

    add-double v0, v33, v0

    sub-double v0, v0, v44

    if-eqz v16, :cond_25

    move/from16 v21, v7

    add-double v7, v0, v5

    div-double v5, v5, v46

    move-wide/from16 v44, v9

    add-double v9, v0, v5

    cmpl-double v50, v9, v57

    if-lez v50, :cond_20

    goto :goto_1d

    :cond_20
    cmpg-double v50, v9, v55

    if-gez v50, :cond_21

    goto :goto_1d

    :cond_21
    move-object/from16 v50, v15

    const/4 v15, 0x3

    if-eqz p1, :cond_22

    double-to-float v0, v9

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v14, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    move-wide/from16 v59, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v11

    const/4 v15, 0x2

    move-object v2, v1

    goto :goto_20

    :cond_22
    move-wide/from16 v59, v2

    move-object/from16 v2, v22

    cmpg-double v3, v0, v17

    if-gez v3, :cond_23

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v4, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    double-to-float v0, v0

    invoke-virtual {v4, v0, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    const/4 v3, 0x1

    goto :goto_1e

    :cond_23
    double-to-float v0, v0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v4, v3}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_1e
    double-to-float v0, v9

    invoke-virtual {v2, v0, v14, v3}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    cmpl-double v0, v7, v53

    move-wide/from16 v9, v53

    if-lez v0, :cond_24

    double-to-float v0, v9

    invoke-virtual {v2, v0, v13, v15}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    sub-double/2addr v7, v9

    double-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v13, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto :goto_1f

    :cond_24
    double-to-float v0, v7

    invoke-virtual {v2, v0, v13, v3}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_1f
    invoke-virtual {v4, v12}, Landroid/graphics/Matrix;->getValues([F)V

    invoke-virtual {v13, v11}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v15, 0x2

    aget v0, v12, v15

    float-to-double v0, v0

    const/4 v7, 0x5

    aget v8, v12, v7

    move-object/from16 v22, v4

    float-to-double v3, v8

    aget v8, v11, v15

    move-wide/from16 v53, v9

    float-to-double v8, v8

    aget v7, v11, v7

    move-object/from16 v23, v11

    float-to-double v10, v7

    sub-double/2addr v8, v0

    sub-double/2addr v10, v3

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    const-wide v3, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v0, v3

    mul-double v0, v0, v35

    double-to-float v0, v0

    invoke-virtual {v14, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :goto_20
    neg-double v0, v5

    double-to-float v0, v0

    add-double v3, v63, v59

    double-to-float v1, v3

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    move-wide/from16 v3, v42

    double-to-float v0, v3

    move/from16 v5, v19

    int-to-float v1, v5

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    move-wide/from16 v6, v65

    double-to-float v0, v6

    const/4 v1, 0x0

    invoke-virtual {v14, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :goto_21
    move-wide/from16 v0, v44

    goto :goto_22

    :cond_25
    move-wide/from16 v59, v2

    move/from16 v21, v7

    move-wide/from16 v44, v9

    move-object/from16 v23, v11

    move-object/from16 v50, v15

    move/from16 v5, v19

    move-object/from16 v2, v22

    move-wide/from16 v6, v65

    const/4 v15, 0x2

    move-object/from16 v22, v4

    move-wide/from16 v3, v42

    double-to-float v0, v0

    add-double v9, v6, v63

    add-double v9, v9, v59

    double-to-float v1, v9

    invoke-virtual {v14, v0, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    goto :goto_21

    :goto_22
    double-to-float v0, v0

    invoke-virtual {v14, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    if-eqz v37, :cond_26

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual/range {v40 .. v40}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p2

    move-object/from16 v8, v40

    move/from16 v19, v41

    move-object/from16 v6, v48

    move-wide/from16 v41, v53

    move/from16 v21, v38

    move-wide/from16 v37, v3

    move-wide/from16 v3, v41

    const/4 v15, 0x1

    move-object/from16 v24, v12

    const/16 v41, 0x0

    move v12, v1

    move-object v1, v13

    const/16 v25, 0x2

    move-object v13, v0

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    move-object v7, v0

    move-object/from16 v0, v49

    goto :goto_23

    :cond_26
    move-object/from16 v24, v12

    move-object v1, v13

    move/from16 v25, v15

    move/from16 v7, v21

    move/from16 v21, v38

    move-object/from16 v8, v40

    move/from16 v19, v41

    move-object/from16 v6, v48

    move-object/from16 v0, v49

    const/4 v15, 0x1

    const/16 v41, 0x0

    move-wide/from16 v37, v3

    move-wide/from16 v3, v53

    invoke-virtual {v0, v7, v8}, Lcom/horcrux/svg/t;->b(CLjava/lang/String;)Landroid/graphics/Path;

    move-result-object v7

    :goto_23
    new-instance v9, Landroid/graphics/RectF;

    invoke-direct {v9}, Landroid/graphics/RectF;-><init>()V

    invoke-virtual {v7, v9, v15}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    move-result v9

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-nez v9, :cond_27

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    move-object/from16 v9, p3

    move-object/from16 v11, v50

    invoke-virtual {v9, v14}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    move v7, v10

    move-object/from16 v10, p0

    iget-object v12, v10, Lcom/horcrux/svg/U;->F:Ljava/util/ArrayList;

    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v10, Lcom/horcrux/svg/U;->G:Ljava/util/ArrayList;

    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13, v14}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v12, p2

    invoke-virtual {v9, v8, v7, v7, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    goto :goto_24

    :cond_27
    move-object/from16 v10, p0

    move-object/from16 v12, p2

    move-object/from16 v9, p3

    move-object/from16 v11, v50

    invoke-virtual {v7, v14}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v6, v7}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    :goto_24
    add-int/lit8 v7, v19, 0x1

    move-object/from16 v49, v0

    move-object v13, v1

    move-wide/from16 v53, v3

    move/from16 v19, v5

    move-object/from16 v48, v6

    move v9, v7

    move-object v6, v10

    move-object v15, v11

    move-object v5, v12

    move/from16 v10, v21

    move-object/from16 v4, v22

    move-object/from16 v11, v23

    move-object/from16 v12, v24

    move-wide/from16 v7, v31

    move-wide/from16 v42, v37

    move-wide/from16 v0, v61

    move-object/from16 v22, v2

    move-wide/from16 v2, v59

    goto/16 :goto_15

    :cond_28
    move-object v10, v6

    move-object/from16 v6, v48

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private X(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    .line 1
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p4, v1, v0, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    return-object p1
.end method

.method private Y(Lcom/horcrux/svg/a0;D)D
    .locals 2

    .line 1
    sget-object v0, Lcom/horcrux/svg/U$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    neg-double p1, p2

    return-wide p1

    :cond_1
    neg-double p1, p2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p1, v0

    return-wide p1
.end method

.method private a0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/horcrux/svg/V;

    if-ne v1, v2, :cond_0

    check-cast v0, Lcom/horcrux/svg/V;

    iput-object v0, p0, Lcom/horcrux/svg/U;->E:Lcom/horcrux/svg/V;

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/h0;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/text/Bidi;

    const/4 v1, -0x2

    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    move-result v1

    new-array v2, v1, [B

    new-array v3, v1, [Ljava/lang/Integer;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_2

    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v6

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    if-ge v4, v1, :cond_5

    aget-object v6, v3, v4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v7

    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v8

    aget-byte v6, v2, v6

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_3

    :goto_2
    add-int/lit8 v8, v8, -0x1

    if-lt v8, v7, :cond_4

    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_6
    :goto_3
    return-object p0
.end method


# virtual methods
.method E(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/h0;->B:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/horcrux/svg/h0;->B:D

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v0, v3, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Lcom/horcrux/svg/h0;

    if-eqz v4, :cond_1

    check-cast v3, Lcom/horcrux/svg/h0;

    invoke-virtual {v3, p1}, Lcom/horcrux/svg/h0;->E(Landroid/graphics/Paint;)D

    move-result-wide v3

    add-double/2addr v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/h0;->B:D

    return-wide v1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_4

    iput-wide v1, p0, Lcom/horcrux/svg/h0;->B:D

    return-wide v1

    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/u;->u()Lcom/horcrux/svg/s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/horcrux/svg/s;->b()Lcom/horcrux/svg/q;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/U;->T(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/U;->S(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-double v0, p1

    iput-wide v0, p0, Lcom/horcrux/svg/h0;->B:D

    return-wide v0
.end method

.method public Z(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/horcrux/svg/U;->invalidate()V

    return-void
.end method

.method clearCache()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    invoke-super {p0}, Lcom/horcrux/svg/h0;->clearCache()V

    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    iget-object v0, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/horcrux/svg/h0;->r:Lcom/horcrux/svg/SVGLength;

    if-eqz v0, :cond_1

    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->a:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/horcrux/svg/RenderableView;->fillOpacity:F

    mul-float/2addr v0, p3

    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/RenderableView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/U;->U(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    :cond_0
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->strokeOpacity:F

    mul-float/2addr p3, v0

    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/RenderableView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/U;->U(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/horcrux/svg/U;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/horcrux/svg/u;->u()Lcom/horcrux/svg/s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/horcrux/svg/s;->b()Lcom/horcrux/svg/q;

    move-result-object v1

    invoke-direct {p0, p2, v1}, Lcom/horcrux/svg/U;->T(Landroid/graphics/Paint;Lcom/horcrux/svg/q;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lcom/horcrux/svg/U;->F:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/horcrux/svg/U;->G:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/u;->r(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/u;->q(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    :cond_4
    :goto_1
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/h0;->D(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    return-object p1

    :cond_1
    invoke-direct {p0}, Lcom/horcrux/svg/U;->a0()V

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->w()V

    iget-object v0, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    invoke-static {v0}, Lcom/horcrux/svg/U;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/horcrux/svg/U;->W(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/horcrux/svg/u;->v()V

    iget-object p1, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    return-object p1
.end method

.method hitTest([F)I
    .locals 3

    iget-object v0, p0, Lcom/horcrux/svg/U;->D:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/horcrux/svg/u;->hitTest([F)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mInvertible:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mTransformInvertible:Z

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mInvMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mInvTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    const/4 p1, 0x0

    aget p1, v0, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 v2, 0x1

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableView;->initBounds()V

    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mRegion:Landroid/graphics/Region;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mStrokeRegion:Landroid/graphics/Region;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getClipPath()Landroid/graphics/Path;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mClipRegion:Landroid/graphics/Region;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v1
.end method

.method public invalidate()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/horcrux/svg/U;->C:Landroid/graphics/Path;

    invoke-super {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.class public abstract Lcom/facebook/react/views/text/c;
.super Lcom/facebook/react/uimanager/v;
.source "SourceFile"


# instance fields
.field protected A:Lcom/facebook/react/views/text/r;

.field protected B:Z

.field protected C:I

.field protected D:Z

.field protected E:I

.field protected F:Lcom/facebook/react/uimanager/I$e;

.field protected G:Lcom/facebook/react/uimanager/I$f;

.field protected H:I

.field protected I:I

.field protected J:I

.field protected K:I

.field protected L:I

.field protected M:F

.field protected N:F

.field protected O:F

.field protected P:I

.field protected Q:Z

.field protected R:Z

.field protected S:Z

.field protected T:Z

.field protected U:F

.field protected V:I

.field protected W:I

.field protected X:Ljava/lang/String;

.field protected Y:Ljava/lang/String;

.field protected Z:Z

.field protected a0:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/text/c;-><init>(Lcom/facebook/react/views/text/n;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/n;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/v;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->B:Z

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->D:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/text/c;->F:Lcom/facebook/react/uimanager/I$e;

    iput-object v0, p0, Lcom/facebook/react/views/text/c;->G:Lcom/facebook/react/uimanager/I$f;

    const/4 v1, -0x1

    iput v1, p0, Lcom/facebook/react/views/text/c;->H:I

    iput p1, p0, Lcom/facebook/react/views/text/c;->I:I

    const/4 v2, 0x1

    iput v2, p0, Lcom/facebook/react/views/text/c;->J:I

    iput p1, p0, Lcom/facebook/react/views/text/c;->K:I

    iput p1, p0, Lcom/facebook/react/views/text/c;->L:I

    const/4 v3, 0x0

    iput v3, p0, Lcom/facebook/react/views/text/c;->M:F

    iput v3, p0, Lcom/facebook/react/views/text/c;->N:F

    iput v3, p0, Lcom/facebook/react/views/text/c;->O:F

    const/high16 v4, 0x55000000

    iput v4, p0, Lcom/facebook/react/views/text/c;->P:I

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->Q:Z

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->R:Z

    iput-boolean v2, p0, Lcom/facebook/react/views/text/c;->S:Z

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->T:Z

    iput v3, p0, Lcom/facebook/react/views/text/c;->U:F

    iput v1, p0, Lcom/facebook/react/views/text/c;->V:I

    iput v1, p0, Lcom/facebook/react/views/text/c;->W:I

    iput-object v0, p0, Lcom/facebook/react/views/text/c;->X:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/react/views/text/c;->Y:Ljava/lang/String;

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->Z:Z

    new-instance p1, Lcom/facebook/react/views/text/r;

    invoke-direct {p1}, Lcom/facebook/react/views/text/r;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    return-void
.end method

.method private static x1(Lcom/facebook/react/views/text/c;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p6

    iget-object v1, v0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    if-eqz v10, :cond_0

    invoke-virtual {v10, v1}, Lcom/facebook/react/views/text/r;->a(Lcom/facebook/react/views/text/r;)Lcom/facebook/react/views/text/r;

    move-result-object v1

    :cond_0
    move-object v12, v1

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/uimanager/V;->b()I

    move-result v13

    const/4 v1, 0x0

    move v14, v1

    :goto_0
    if-ge v14, v13, :cond_7

    invoke-virtual {v0, v14}, Lcom/facebook/react/uimanager/V;->g0(I)Lcom/facebook/react/uimanager/V;

    move-result-object v15

    instance-of v1, v15, Lcom/facebook/react/views/text/e;

    if-eqz v1, :cond_1

    move-object v1, v15

    check-cast v1, Lcom/facebook/react/views/text/e;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/e;->w1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12}, Lcom/facebook/react/views/text/r;->l()Lcom/facebook/react/views/text/t;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/react/views/text/t;->h(Ljava/lang/String;Lcom/facebook/react/views/text/t;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_1
    move-object/from16 v2, p5

    goto/16 :goto_4

    :cond_1
    instance-of v1, v15, Lcom/facebook/react/views/text/c;

    if-eqz v1, :cond_2

    move-object v1, v15

    check-cast v1, Lcom/facebook/react/views/text/c;

    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v7

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v12

    move/from16 v5, p4

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v7}, Lcom/facebook/react/views/text/c;->x1(Lcom/facebook/react/views/text/c;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v15, LL2/a;

    const-string v2, "0"

    if-eqz v1, :cond_3

    invoke-virtual {v8, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance v1, LM2/l;

    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    move-object v4, v15

    check-cast v4, LL2/a;

    invoke-virtual {v4}, LL2/a;->x1()LM2/n;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_6

    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v1

    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->D()Lcom/facebook/yoga/YogaValue;

    move-result-object v3

    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->n()Lcom/facebook/yoga/YogaValue;

    move-result-object v4

    iget-object v5, v3, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    sget-object v6, Lcom/facebook/yoga/w;->o:Lcom/facebook/yoga/w;

    if-ne v5, v6, :cond_5

    iget-object v5, v4, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    if-eq v5, v6, :cond_4

    goto :goto_2

    :cond_4
    iget v3, v3, Lcom/facebook/yoga/YogaValue;->a:F

    iget v4, v4, Lcom/facebook/yoga/YogaValue;->a:F

    goto :goto_3

    :cond_5
    :goto_2
    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->t()V

    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->d0()F

    move-result v3

    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->l()F

    move-result v4

    :goto_3
    invoke-virtual {v8, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance v2, LM2/l;

    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    new-instance v7, LM2/o;

    float-to-int v3, v3

    float-to-int v4, v4

    invoke-direct {v7, v1, v3, v4}, LM2/o;-><init>(III)V

    invoke-direct {v2, v5, v6, v7}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p5

    invoke-interface {v2, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    invoke-interface {v15}, Lcom/facebook/react/uimanager/U;->e()V

    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :cond_6
    new-instance v0, Lcom/facebook/react/uimanager/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected view type nested under a <Text> or <TextInput> node: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    if-lt v1, v11, :cond_18

    iget-boolean v2, v0, Lcom/facebook/react/views/text/c;->B:Z

    if-eqz v2, :cond_8

    new-instance v2, LM2/l;

    new-instance v3, LM2/g;

    iget v4, v0, Lcom/facebook/react/views/text/c;->C:I

    invoke-direct {v3, v4}, LM2/g;-><init>(I)V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-boolean v2, v0, Lcom/facebook/react/views/text/c;->D:Z

    if-eqz v2, :cond_9

    new-instance v2, LM2/l;

    new-instance v3, LM2/e;

    iget v4, v0, Lcom/facebook/react/views/text/c;->E:I

    invoke-direct {v3, v4}, LM2/e;-><init>(I)V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-object v2, v0, Lcom/facebook/react/views/text/c;->G:Lcom/facebook/react/uimanager/I$f;

    if-eqz v2, :cond_a

    sget-object v3, Lcom/facebook/react/uimanager/I$f;->J:Lcom/facebook/react/uimanager/I$f;

    if-ne v2, v3, :cond_b

    goto :goto_5

    :cond_a
    iget-object v2, v0, Lcom/facebook/react/views/text/c;->F:Lcom/facebook/react/uimanager/I$e;

    sget-object v3, Lcom/facebook/react/uimanager/I$e;->q:Lcom/facebook/react/uimanager/I$e;

    if-ne v2, v3, :cond_b

    :goto_5
    new-instance v2, LM2/l;

    new-instance v3, LM2/f;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/uimanager/V;->r()I

    move-result v4

    invoke-direct {v3, v4}, LM2/f;-><init>(I)V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {v12}, Lcom/facebook/react/views/text/r;->d()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_d

    if-eqz v10, :cond_c

    invoke-virtual/range {p3 .. p3}, Lcom/facebook/react/views/text/r;->d()F

    move-result v3

    cmpl-float v3, v3, v2

    if-eqz v3, :cond_d

    :cond_c
    new-instance v3, LM2/l;

    new-instance v4, LM2/a;

    invoke-direct {v4, v2}, LM2/a;-><init>(F)V

    invoke-direct {v3, v11, v1, v4}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {v12}, Lcom/facebook/react/views/text/r;->c()I

    move-result v2

    if-eqz v10, :cond_e

    invoke-virtual/range {p3 .. p3}, Lcom/facebook/react/views/text/r;->c()I

    move-result v3

    if-eq v3, v2, :cond_f

    :cond_e
    new-instance v3, LM2/l;

    new-instance v4, LM2/d;

    invoke-direct {v4, v2}, LM2/d;-><init>(I)V

    invoke-direct {v3, v11, v1, v4}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget v2, v0, Lcom/facebook/react/views/text/c;->V:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_10

    iget v2, v0, Lcom/facebook/react/views/text/c;->W:I

    if-ne v2, v3, :cond_10

    iget-object v2, v0, Lcom/facebook/react/views/text/c;->X:Ljava/lang/String;

    if-eqz v2, :cond_11

    :cond_10
    new-instance v2, LM2/l;

    new-instance v13, LM2/c;

    iget v4, v0, Lcom/facebook/react/views/text/c;->V:I

    iget v5, v0, Lcom/facebook/react/views/text/c;->W:I

    iget-object v6, v0, Lcom/facebook/react/views/text/c;->Y:Ljava/lang/String;

    iget-object v7, v0, Lcom/facebook/react/views/text/c;->X:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v8

    move-object v3, v13

    invoke-direct/range {v3 .. v8}, LM2/c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    invoke-direct {v2, v11, v1, v13}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-boolean v2, v0, Lcom/facebook/react/views/text/c;->Q:Z

    if-eqz v2, :cond_12

    new-instance v2, LM2/l;

    new-instance v3, LM2/k;

    invoke-direct {v3}, LM2/k;-><init>()V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    iget-boolean v2, v0, Lcom/facebook/react/views/text/c;->R:Z

    if-eqz v2, :cond_13

    new-instance v2, LM2/l;

    new-instance v3, LM2/i;

    invoke-direct {v3}, LM2/i;-><init>()V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_13
    iget v2, v0, Lcom/facebook/react/views/text/c;->M:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-nez v2, :cond_14

    iget v2, v0, Lcom/facebook/react/views/text/c;->N:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_14

    iget v2, v0, Lcom/facebook/react/views/text/c;->O:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_15

    :cond_14
    iget v2, v0, Lcom/facebook/react/views/text/c;->P:I

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    if-eqz v2, :cond_15

    new-instance v2, LM2/l;

    new-instance v3, LM2/m;

    iget v4, v0, Lcom/facebook/react/views/text/c;->M:F

    iget v5, v0, Lcom/facebook/react/views/text/c;->N:F

    iget v6, v0, Lcom/facebook/react/views/text/c;->O:F

    iget v7, v0, Lcom/facebook/react/views/text/c;->P:I

    invoke-direct {v3, v4, v5, v6, v7}, LM2/m;-><init>(FFFI)V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-virtual {v12}, Lcom/facebook/react/views/text/r;->e()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_17

    if-eqz v10, :cond_16

    invoke-virtual/range {p3 .. p3}, Lcom/facebook/react/views/text/r;->e()F

    move-result v3

    cmpl-float v3, v3, v2

    if-eqz v3, :cond_17

    :cond_16
    new-instance v3, LM2/l;

    new-instance v4, LM2/b;

    invoke-direct {v4, v2}, LM2/b;-><init>(F)V

    invoke-direct {v3, v11, v1, v4}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_17
    new-instance v2, LM2/l;

    new-instance v3, LM2/j;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/uimanager/V;->r()I

    move-result v0

    invoke-direct {v3, v0}, LM2/j;-><init>(I)V

    invoke-direct {v2, v11, v1, v3}, LM2/l;-><init>(IILM2/h;)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_18
    return-void
.end method


# virtual methods
.method public setAccessibilityRole(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "accessibilityRole"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->j(Ljava/lang/String;)Lcom/facebook/react/uimanager/I$e;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/text/c;->F:Lcom/facebook/react/uimanager/I$e;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setAdjustFontSizeToFit(Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "adjustsFontSizeToFit"
    .end annotation

    iget-boolean v0, p0, Lcom/facebook/react/views/text/c;->T:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->T:Z

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setAllowFontScaling(Z)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "allowFontScaling"
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->b()Z

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->m(Z)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setBackgroundColor(Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "backgroundColor"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/c;->D:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/c;->E:I

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_2
    return-void
.end method

.method public setColor(Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "color"
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/c;->B:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/c;->C:I

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setFontFamily(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontFamily"
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/text/c;->X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setFontSize(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = NaNf
        name = "fontSize"
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->n(F)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setFontStyle(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "fontStyle"
    .end annotation

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->b(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/text/c;->V:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/c;->V:I

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setFontVariant(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "fontVariant"
    .end annotation

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->c(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->Y:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/facebook/react/views/text/c;->Y:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setFontWeight(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "fontWeight"
    .end annotation

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->d(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/text/c;->W:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/c;->W:I

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setIncludeFontPadding(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "includeFontPadding"
    .end annotation

    iput-boolean p1, p0, Lcom/facebook/react/views/text/c;->S:Z

    return-void
.end method

.method public setLetterSpacing(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "letterSpacing"
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->p(F)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setLineHeight(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = NaNf
        name = "lineHeight"
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->q(F)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setMaxFontSizeMultiplier(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = NaNf
        name = "maxFontSizeMultiplier"
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->k()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->r(F)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setMinimumFontScale(F)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "minimumFontScale"
    .end annotation

    iget v0, p0, Lcom/facebook/react/views/text/c;->U:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/c;->U:F

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setNumberOfLines(I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "numberOfLines"
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, -0x1

    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/c;->H:I

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setRole(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "role"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/I$f;->h(Ljava/lang/String;)Lcom/facebook/react/uimanager/I$f;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/text/c;->G:Lcom/facebook/react/uimanager/I$f;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setTextAlign(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lx2/a;
        name = "textAlign"
    .end annotation

    const-string v0, "justify"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/16 v3, 0x1a

    if-eqz v0, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v3, :cond_0

    iput v2, p0, Lcom/facebook/react/views/text/c;->L:I

    :cond_0
    :goto_0
    iput v1, p0, Lcom/facebook/react/views/text/c;->I:I

    goto :goto_2

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x0

    if-lt v0, v3, :cond_2

    iput v4, p0, Lcom/facebook/react/views/text/c;->L:I

    :cond_2
    if-eqz p1, :cond_7

    const-string v0, "auto"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "left"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "right"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p1, 0x5

    iput p1, p0, Lcom/facebook/react/views/text/c;->I:I

    goto :goto_2

    :cond_5
    const-string v0, "center"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iput v2, p0, Lcom/facebook/react/views/text/c;->I:I

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid textAlign: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_1
    iput v4, p0, Lcom/facebook/react/views/text/c;->I:I

    :goto_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setTextBreakStrategy(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "textBreakStrategy"
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    const-string v1, "highQuality"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "simple"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/c;->J:I

    goto :goto_2

    :cond_1
    const-string v1, "balanced"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid textBreakStrategy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ReactNative"

    invoke-static {v1, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    iput v0, p0, Lcom/facebook/react/views/text/c;->J:I

    :goto_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setTextDecorationLine(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lx2/a;
        name = "textDecorationLine"
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/text/c;->Q:Z

    iput-boolean v0, p0, Lcom/facebook/react/views/text/c;->R:Z

    if-eqz p1, :cond_2

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    const-string v3, "underline"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    iput-boolean v4, p0, Lcom/facebook/react/views/text/c;->Q:Z

    goto :goto_1

    :cond_0
    const-string v3, "line-through"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v4, p0, Lcom/facebook/react/views/text/c;->R:Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setTextShadowColor(I)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        defaultInt = 0x55000000
        name = "textShadowColor"
    .end annotation

    iget v0, p0, Lcom/facebook/react/views/text/c;->P:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/c;->P:I

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setTextShadowOffset(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "textShadowOffset"
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/views/text/c;->M:F

    iput v0, p0, Lcom/facebook/react/views/text/c;->N:F

    if-eqz p1, :cond_1

    const-string v0, "width"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/text/c;->M:F

    :cond_0
    const-string v0, "height"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/c;->N:F

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method public setTextShadowRadius(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultInt = 0x1
        name = "textShadowRadius"
    .end annotation

    iget v0, p0, Lcom/facebook/react/views/text/c;->O:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/c;->O:F

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    :cond_0
    return-void
.end method

.method public setTextTransform(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "textTransform"
    .end annotation

    if-nez p1, :cond_0

    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    sget-object v0, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    :goto_1
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/text/r;->s(Lcom/facebook/react/views/text/t;)V

    goto :goto_2

    :cond_0
    const-string v0, "none"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    sget-object v0, Lcom/facebook/react/views/text/t;->m:Lcom/facebook/react/views/text/t;

    goto :goto_1

    :cond_1
    const-string v0, "uppercase"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    sget-object v0, Lcom/facebook/react/views/text/t;->n:Lcom/facebook/react/views/text/t;

    goto :goto_1

    :cond_2
    const-string v0, "lowercase"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    sget-object v0, Lcom/facebook/react/views/text/t;->o:Lcom/facebook/react/views/text/t;

    goto :goto_1

    :cond_3
    const-string v0, "capitalize"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    sget-object v0, Lcom/facebook/react/views/text/t;->p:Lcom/facebook/react/views/text/t;

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid textTransform: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->y0()V

    return-void
.end method

.method protected y1(Lcom/facebook/react/views/text/c;Ljava/lang/String;ZLcom/facebook/react/uimanager/D;)Landroid/text/Spannable;
    .locals 14

    .line 1
    move-object v7, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p4

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz p3, :cond_1

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_0
    move v1, v9

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v10

    :goto_1
    const-string v2, "nativeViewHierarchyOptimizer is required when inline views are supported"

    invoke-static {v1, v2}, LO1/a;->b(ZLjava/lang/String;)V

    new-instance v11, Landroid/text/SpannableStringBuilder;

    invoke-direct {v11}, Landroid/text/SpannableStringBuilder;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    if-eqz p3, :cond_2

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :goto_2
    move-object v13, v1

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_3

    iget-object v1, v7, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/r;->l()Lcom/facebook/react/views/text/t;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/react/views/text/t;->h(Ljava/lang/String;Lcom/facebook/react/views/text/t;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_3
    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, v11

    move-object v2, v12

    move/from16 v4, p3

    move-object v5, v13

    invoke-static/range {v0 .. v6}, Lcom/facebook/react/views/text/c;->x1(Lcom/facebook/react/views/text/c;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V

    iput-boolean v9, v7, Lcom/facebook/react/views/text/c;->Z:Z

    iput-object v13, v7, Lcom/facebook/react/views/text/c;->a0:Ljava/util/Map;

    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_4
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_8

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v9

    sub-int/2addr v1, v10

    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM2/l;

    iget-object v2, v1, LM2/l;->c:LM2/h;

    instance-of v3, v2, LM2/n;

    if-nez v3, :cond_4

    instance-of v4, v2, LM2/o;

    if-eqz v4, :cond_7

    :cond_4
    if-eqz v3, :cond_5

    check-cast v2, LM2/n;

    invoke-virtual {v2}, LM2/n;->b()I

    move-result v2

    iput-boolean v10, v7, Lcom/facebook/react/views/text/c;->Z:Z

    goto :goto_5

    :cond_5
    check-cast v2, LM2/o;

    invoke-virtual {v2}, LM2/o;->a()I

    move-result v3

    invoke-virtual {v2}, LM2/o;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/uimanager/U;

    invoke-virtual {v8, v2}, Lcom/facebook/react/uimanager/D;->h(Lcom/facebook/react/uimanager/U;)V

    invoke-interface {v2, p1}, Lcom/facebook/react/uimanager/U;->O(Lcom/facebook/react/uimanager/U;)V

    move v2, v3

    :goto_5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_6

    int-to-float v3, v2

    cmpl-float v3, v3, v0

    if-lez v3, :cond_7

    :cond_6
    int-to-float v0, v2

    :cond_7
    invoke-virtual {v1, v11, v9}, LM2/l;->a(Landroid/text/SpannableStringBuilder;I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_8
    iget-object v1, v7, Lcom/facebook/react/views/text/c;->A:Lcom/facebook/react/views/text/r;

    invoke-virtual {v1, v0}, Lcom/facebook/react/views/text/r;->o(F)V

    return-object v11
.end method

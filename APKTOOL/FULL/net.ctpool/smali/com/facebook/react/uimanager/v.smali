.class public Lcom/facebook/react/uimanager/v;
.super Lcom/facebook/react/uimanager/V;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/v$b;
    }
.end annotation


# instance fields
.field private final y:Lcom/facebook/react/uimanager/v$b;

.field z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/facebook/react/uimanager/V;-><init>()V

    new-instance v0, Lcom/facebook/react/uimanager/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/v$b;-><init>(Lcom/facebook/react/uimanager/w;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    return-void
.end method

.method private w1(I)I
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x5

    return p1

    :cond_2
    const/4 p1, 0x4

    return p1
.end method


# virtual methods
.method public setAlignContent(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "alignContent"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    :goto_0
    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/a;->o:Lcom/facebook/yoga/a;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->D0(Lcom/facebook/yoga/a;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "space-evenly"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0x8

    goto/16 :goto_2

    :sswitch_1
    const-string v1, "space-around"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_2
    const-string v1, "flex-end"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_3
    const-string v1, "space-between"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_4
    const-string v1, "auto"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_5
    const-string v1, "flex-start"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_6
    const-string v1, "center"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_7
    const-string v1, "baseline"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_8
    const-string v1, "stretch"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v0, 0x0

    :goto_2
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for alignContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/a;->v:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/a;->u:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_3
    sget-object p1, Lcom/facebook/yoga/a;->q:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_4
    sget-object p1, Lcom/facebook/yoga/a;->t:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_5
    sget-object p1, Lcom/facebook/yoga/a;->n:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_6
    sget-object p1, Lcom/facebook/yoga/a;->p:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_7
    sget-object p1, Lcom/facebook/yoga/a;->s:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_8
    sget-object p1, Lcom/facebook/yoga/a;->r:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x702b18fb -> :sswitch_8
        -0x669119bb -> :sswitch_7
        -0x514d33ab -> :sswitch_6
        -0x2c6c672 -> :sswitch_5
        0x2dddaf -> :sswitch_4
        0x1a4dda41 -> :sswitch_3
        0x67e35907 -> :sswitch_2
        0x73762c74 -> :sswitch_1
        0x7a7d46ce -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setAlignItems(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "alignItems"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    :goto_0
    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/a;->r:Lcom/facebook/yoga/a;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->E0(Lcom/facebook/yoga/a;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "space-around"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_1
    const-string v1, "flex-end"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_2
    const-string v1, "space-between"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_3
    const-string v1, "auto"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_4
    const-string v1, "flex-start"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_5
    const-string v1, "center"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_6
    const-string v1, "baseline"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_7
    const-string v1, "stretch"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    :goto_2
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for alignItems: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/a;->u:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/a;->q:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_3
    sget-object p1, Lcom/facebook/yoga/a;->t:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_4
    sget-object p1, Lcom/facebook/yoga/a;->n:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_5
    sget-object p1, Lcom/facebook/yoga/a;->o:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_6
    sget-object p1, Lcom/facebook/yoga/a;->p:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_7
    sget-object p1, Lcom/facebook/yoga/a;->s:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x702b18fb -> :sswitch_7
        -0x669119bb -> :sswitch_6
        -0x514d33ab -> :sswitch_5
        -0x2c6c672 -> :sswitch_4
        0x2dddaf -> :sswitch_3
        0x1a4dda41 -> :sswitch_2
        0x67e35907 -> :sswitch_1
        0x73762c74 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setAlignSelf(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "alignSelf"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    :goto_0
    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/a;->n:Lcom/facebook/yoga/a;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->F0(Lcom/facebook/yoga/a;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "space-around"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_1
    const-string v1, "flex-end"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_2
    const-string v1, "space-between"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_3
    const-string v1, "auto"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_4
    const-string v1, "flex-start"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_5
    const-string v1, "center"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_6
    const-string v1, "baseline"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_7
    const-string v1, "stretch"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    :goto_2
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for alignSelf: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/a;->u:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/a;->q:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_3
    sget-object p1, Lcom/facebook/yoga/a;->t:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_4
    sget-object p1, Lcom/facebook/yoga/a;->o:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_5
    sget-object p1, Lcom/facebook/yoga/a;->p:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_6
    sget-object p1, Lcom/facebook/yoga/a;->s:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    :pswitch_7
    sget-object p1, Lcom/facebook/yoga/a;->r:Lcom/facebook/yoga/a;

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x702b18fb -> :sswitch_7
        -0x669119bb -> :sswitch_6
        -0x514d33ab -> :sswitch_5
        -0x2c6c672 -> :sswitch_4
        0x2dddaf -> :sswitch_3
        0x1a4dda41 -> :sswitch_2
        0x67e35907 -> :sswitch_1
        0x73762c74 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setAspectRatio(F)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = NaNf
        name = "aspectRatio"
    .end annotation

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->h1(F)V

    return-void
.end method

.method public setBorderWidths(IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderStartWidth",
            "borderEndWidth",
            "borderTopWidth",
            "borderBottomWidth",
            "borderLeftWidth",
            "borderRightWidth"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/K0;->b:[I

    aget p1, v0, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/v;->w1(I)I

    move-result p1

    invoke-static {p2}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/V;->H0(IF)V

    return-void
.end method

.method public setCollapsable(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "collapsable"
    .end annotation

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/v;->z:Z

    return-void
.end method

.method public setCollapsableChildren(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "collapsableChildren"
    .end annotation

    return-void
.end method

.method public setColumnGap(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "columnGap"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->J0(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->I0(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setDisplay(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "display"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/i;->n:Lcom/facebook/yoga/i;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->L0(Lcom/facebook/yoga/i;)V

    return-void

    :cond_1
    const-string v0, "flex"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for display: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object p1, Lcom/facebook/yoga/i;->n:Lcom/facebook/yoga/i;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->L0(Lcom/facebook/yoga/i;)V

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/facebook/yoga/i;->o:Lcom/facebook/yoga/i;

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setFlex(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "flex"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->setFlex(F)V

    return-void
.end method

.method public setFlexBasis(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "flexBasis"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->O0(F)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->N0()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->M0(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setFlexDirection(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "flexDirection"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/l;->n:Lcom/facebook/yoga/l;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->P0(Lcom/facebook/yoga/l;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "column-reverse"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "row"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "column"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "row-reverse"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for flexDirection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/l;->n:Lcom/facebook/yoga/l;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->P0(Lcom/facebook/yoga/l;)V

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/l;->o:Lcom/facebook/yoga/l;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/l;->p:Lcom/facebook/yoga/l;

    goto :goto_1

    :pswitch_3
    sget-object p1, Lcom/facebook/yoga/l;->q:Lcom/facebook/yoga/l;

    goto :goto_1

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x565d8a11 -> :sswitch_3
        -0x50c12caa -> :sswitch_2
        0x1b9da -> :sswitch_1
        0x4bdc536b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setFlexGrow(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "flexGrow"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->setFlexGrow(F)V

    return-void
.end method

.method public setFlexShrink(F)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "flexShrink"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->setFlexShrink(F)V

    return-void
.end method

.method public setFlexWrap(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "flexWrap"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/x;->n:Lcom/facebook/yoga/x;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->Q0(Lcom/facebook/yoga/x;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "wrap"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "wrap-reverse"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "nowrap"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for flexWrap: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/x;->n:Lcom/facebook/yoga/x;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->Q0(Lcom/facebook/yoga/x;)V

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/x;->o:Lcom/facebook/yoga/x;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/x;->p:Lcom/facebook/yoga/x;

    goto :goto_1

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3df6ea75 -> :sswitch_2
        -0x2cace3a1 -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setGap(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "gap"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->S0(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->R0(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "height"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->j1(F)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->i1()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->g(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setInset(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "inset"
    .end annotation

    return-void
.end method

.method public setInsetBlock(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "insetBlock",
            "insetBlockEnd",
            "insetBlockStart"
        }
    .end annotation

    return-void
.end method

.method public setInsetInline(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "insetInline",
            "insetInlineEnd",
            "insetInlineStart"
        }
    .end annotation

    return-void
.end method

.method public setJustifyContent(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "justifyContent"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/n;->n:Lcom/facebook/yoga/n;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->T0(Lcom/facebook/yoga/n;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "space-evenly"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_1
    const-string v1, "space-around"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_2
    const-string v1, "flex-end"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "space-between"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "flex-start"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_5
    const-string v1, "center"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for justifyContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/n;->n:Lcom/facebook/yoga/n;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->T0(Lcom/facebook/yoga/n;)V

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/n;->s:Lcom/facebook/yoga/n;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/n;->r:Lcom/facebook/yoga/n;

    goto :goto_1

    :pswitch_3
    sget-object p1, Lcom/facebook/yoga/n;->p:Lcom/facebook/yoga/n;

    goto :goto_1

    :pswitch_4
    sget-object p1, Lcom/facebook/yoga/n;->q:Lcom/facebook/yoga/n;

    goto :goto_1

    :pswitch_5
    sget-object p1, Lcom/facebook/yoga/n;->o:Lcom/facebook/yoga/n;

    goto :goto_1

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x2c6c672 -> :sswitch_4
        0x1a4dda41 -> :sswitch_3
        0x67e35907 -> :sswitch_2
        0x73762c74 -> :sswitch_1
        0x7a7d46ce -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setLayoutConformance(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "experimental_layoutConformance"
    .end annotation

    return-void
.end method

.method public setMarginBlock(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "marginBlock",
            "marginBlockEnd",
            "marginBlockStart"
        }
    .end annotation

    return-void
.end method

.method public setMarginInline(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "marginInline",
            "marginInlineEnd",
            "marginInlineStart"
        }
    .end annotation

    return-void
.end method

.method public setMargins(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/b;
        names = {
            "margin",
            "marginVertical",
            "marginHorizontal",
            "marginStart",
            "marginEnd",
            "marginTop",
            "marginBottom",
            "marginLeft",
            "marginRight"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/K0;->c:[I

    aget p1, v0, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/v;->w1(I)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->X0(IF)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->W0(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->V0(IF)V

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setMaxHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "maxHeight"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->l1(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->k1(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setMaxWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "maxWidth"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->n1(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->m1(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setMinHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "minHeight"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->p1(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->o1(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setMinWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "minWidth"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->r1(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->q1(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "overflow"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/u;->n:Lcom/facebook/yoga/u;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->Z0(Lcom/facebook/yoga/u;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "visible"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "scroll"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "hidden"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for overflow: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :pswitch_0
    sget-object p1, Lcom/facebook/yoga/u;->n:Lcom/facebook/yoga/u;

    :goto_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->Z0(Lcom/facebook/yoga/u;)V

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/facebook/yoga/u;->p:Lcom/facebook/yoga/u;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lcom/facebook/yoga/u;->o:Lcom/facebook/yoga/u;

    goto :goto_1

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x48916256 -> :sswitch_2
        -0x361a1933 -> :sswitch_1
        0x1bd1f072 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setPaddingBlock(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "paddingBlock",
            "paddingBlockEnd",
            "paddingBlockStart"
        }
    .end annotation

    return-void
.end method

.method public setPaddingInline(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/b;
        names = {
            "paddingInline",
            "paddingInlineEnd",
            "paddingInlineStart"
        }
    .end annotation

    return-void
.end method

.method public setPaddings(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/b;
        names = {
            "padding",
            "paddingVertical",
            "paddingHorizontal",
            "paddingStart",
            "paddingEnd",
            "paddingTop",
            "paddingBottom",
            "paddingLeft",
            "paddingRight"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/K0;->c:[I

    aget p1, v0, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/v;->w1(I)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->b1(IF)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->a1(IF)V

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setPosition(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "position"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/facebook/yoga/v;->o:Lcom/facebook/yoga/v;

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->e1(Lcom/facebook/yoga/v;)V

    return-void

    :cond_1
    const-string v0, "relative"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "absolute"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid value for position: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object p1, Lcom/facebook/yoga/v;->o:Lcom/facebook/yoga/v;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/V;->e1(Lcom/facebook/yoga/v;)V

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/facebook/yoga/v;->p:Lcom/facebook/yoga/v;

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setPositionValues(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 5
    .annotation runtime Lx2/b;
        names = {
            "start",
            "end",
            "left",
            "right",
            "top",
            "bottom"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x6

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    aget p1, v3, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/v;->w1(I)I

    move-result p1

    iget-object v3, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v3, p2}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v3, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v4, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v4, v4, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v2, :cond_2

    if-eq v3, v0, :cond_2

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->d1(IF)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/uimanager/V;->c1(IF)V

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x5
        0x0
        0x2
        0x1
        0x3
    .end array-data
.end method

.method public setRowGap(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "rowGap"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->g1(F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->f1(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

.method public setShouldNotifyOnLayout(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onLayout"
    .end annotation

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->setShouldNotifyOnLayout(Z)V

    return-void
.end method

.method public setShouldNotifyPointerEnter(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onPointerEnter"
    .end annotation

    return-void
.end method

.method public setShouldNotifyPointerLeave(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onPointerLeave"
    .end annotation

    return-void
.end method

.method public setShouldNotifyPointerMove(Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onPointerMove"
    .end annotation

    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "width"
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/v$b;->a(Lcom/facebook/react/bridge/Dynamic;)V

    sget-object v0, Lcom/facebook/react/uimanager/v$a;->a:[I

    iget-object v1, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget-object v1, v1, Lcom/facebook/react/uimanager/v$b;->b:Lcom/facebook/yoga/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->t1(F)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->s1()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/uimanager/v;->y:Lcom/facebook/react/uimanager/v$b;

    iget v0, v0, Lcom/facebook/react/uimanager/v$b;->a:F

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/V;->B(F)V

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->recycle()V

    return-void
.end method

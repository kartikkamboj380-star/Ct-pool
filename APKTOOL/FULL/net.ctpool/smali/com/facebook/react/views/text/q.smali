.class public Lcom/facebook/react/views/text/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final D:I


# instance fields
.field protected A:Ljava/lang/String;

.field protected B:Z

.field protected C:F

.field protected a:F

.field protected b:Z

.field protected c:Z

.field protected d:I

.field protected e:Z

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:F

.field protected j:F

.field protected k:F

.field protected l:I

.field protected m:I

.field protected n:Lcom/facebook/react/views/text/t;

.field protected o:F

.field protected p:F

.field protected q:F

.field protected r:I

.field protected s:Z

.field protected t:Z

.field protected u:Z

.field protected v:Lcom/facebook/react/uimanager/I$e;

.field protected w:Lcom/facebook/react/uimanager/I$f;

.field protected x:I

.field protected y:I

.field protected z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/facebook/react/views/text/q;->D:I

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lcom/facebook/react/views/text/q;->a:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->b:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/facebook/react/views/text/q;->c:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->e:Z

    const/4 v3, -0x1

    iput v3, p0, Lcom/facebook/react/views/text/q;->g:I

    iput v3, p0, Lcom/facebook/react/views/text/q;->h:I

    const/high16 v4, -0x40800000    # -1.0f

    iput v4, p0, Lcom/facebook/react/views/text/q;->i:F

    iput v4, p0, Lcom/facebook/react/views/text/q;->j:F

    iput v0, p0, Lcom/facebook/react/views/text/q;->k:F

    iput v1, p0, Lcom/facebook/react/views/text/q;->l:I

    iput v3, p0, Lcom/facebook/react/views/text/q;->m:I

    sget-object v4, Lcom/facebook/react/views/text/t;->m:Lcom/facebook/react/views/text/t;

    iput-object v4, p0, Lcom/facebook/react/views/text/q;->n:Lcom/facebook/react/views/text/t;

    const/4 v4, 0x0

    iput v4, p0, Lcom/facebook/react/views/text/q;->o:F

    iput v4, p0, Lcom/facebook/react/views/text/q;->p:F

    iput v4, p0, Lcom/facebook/react/views/text/q;->q:F

    const/high16 v4, 0x55000000

    iput v4, p0, Lcom/facebook/react/views/text/q;->r:I

    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->s:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->t:Z

    iput-boolean v2, p0, Lcom/facebook/react/views/text/q;->u:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/react/views/text/q;->v:Lcom/facebook/react/uimanager/I$e;

    iput-object v2, p0, Lcom/facebook/react/views/text/q;->w:Lcom/facebook/react/uimanager/I$f;

    iput v3, p0, Lcom/facebook/react/views/text/q;->x:I

    iput v3, p0, Lcom/facebook/react/views/text/q;->y:I

    iput-object v2, p0, Lcom/facebook/react/views/text/q;->z:Ljava/lang/String;

    iput-object v2, p0, Lcom/facebook/react/views/text/q;->A:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->B:Z

    iput v0, p0, Lcom/facebook/react/views/text/q;->C:F

    return-void
.end method

.method private A(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    const-string v0, "none"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "uppercase"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/facebook/react/views/text/t;->n:Lcom/facebook/react/views/text/t;

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->n:Lcom/facebook/react/views/text/t;

    goto :goto_2

    :cond_1
    const-string v0, "lowercase"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/facebook/react/views/text/t;->o:Lcom/facebook/react/views/text/t;

    goto :goto_0

    :cond_2
    const-string v0, "capitalize"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/facebook/react/views/text/t;->p:Lcom/facebook/react/views/text/t;

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid textTransform: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    sget-object p1, Lcom/facebook/react/views/text/t;->m:Lcom/facebook/react/views/text/t;

    goto :goto_0

    :goto_2
    return-void
.end method

.method public static a(Lcom/facebook/react/common/mapbuffer/a;)Lcom/facebook/react/views/text/q;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/q;

    invoke-direct {v0}, Lcom/facebook/react/views/text/q;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/common/mapbuffer/a$c;

    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->getKey()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->A(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    invoke-static {}, Lcom/facebook/react/uimanager/I$f;->values()[Lcom/facebook/react/uimanager/I$f;

    move-result-object v2

    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()I

    move-result v1

    aget-object v1, v2, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->u(Lcom/facebook/react/uimanager/I$f;)V

    goto :goto_0

    :pswitch_3
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->i(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_4
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->r(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_5
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->y(F)V

    goto :goto_0

    :pswitch_6
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->x(F)V

    goto :goto_0

    :pswitch_7
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->w(I)V

    goto :goto_0

    :pswitch_8
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->z(F)V

    goto :goto_0

    :pswitch_9
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->v(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_a
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->t(F)V

    goto :goto_0

    :pswitch_b
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->s(F)V

    goto :goto_0

    :pswitch_c
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->f()Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->j(Z)V

    goto :goto_0

    :pswitch_d
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->e()Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->p(Lcom/facebook/react/common/mapbuffer/a;)V

    goto/16 :goto_0

    :pswitch_e
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->o(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_f
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->q(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_10
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->n(F)V

    goto/16 :goto_0

    :pswitch_11
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_12
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->k(Ljava/lang/Integer;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;->l(Ljava/lang/Integer;)V

    goto/16 :goto_0

    :cond_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static c(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string v1, "normal"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "none"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public static d(Lcom/facebook/react/uimanager/W;I)I
    .locals 2

    .line 1
    const-string v0, "textAlign"

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/W;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/W;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "justify"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p1, 0x1a

    if-lt p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    sget p0, Lcom/facebook/react/views/text/q;->D:I

    return p0
.end method

.method public static e(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    if-eqz p0, :cond_3

    const-string v1, "undefined"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "rtl"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "ltr"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid layoutDirection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ReactNative"

    invoke-static {v1, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return v0
.end method

.method public static g(Lcom/facebook/react/uimanager/W;ZI)I
    .locals 3

    .line 1
    const-string v0, "textAlign"

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/W;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/W;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "justify"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x3

    if-eqz p2, :cond_1

    return v0

    :cond_1
    const/4 p2, 0x0

    if-eqz p0, :cond_8

    const-string v1, "auto"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "left"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x5

    if-eqz v1, :cond_4

    if-eqz p1, :cond_3

    move v0, v2

    :cond_3
    return v0

    :cond_4
    const-string v1, "right"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move v0, v2

    :goto_0
    return v0

    :cond_6
    const-string p1, "center"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid textAlign: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ReactNative"

    invoke-static {p1, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_1
    return p2
.end method

.method public static h(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    if-eqz p0, :cond_2

    const-string v1, "balanced"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "simple"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :cond_2
    :goto_0
    return v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->v:Lcom/facebook/react/uimanager/I$e;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/I$e;->j(Ljava/lang/String;)Lcom/facebook/react/uimanager/I$e;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method private j(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lcom/facebook/react/views/text/q;->c:Z

    iget p1, p0, Lcom/facebook/react/views/text/q;->i:F

    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->n(F)V

    iget p1, p0, Lcom/facebook/react/views/text/q;->j:F

    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->t(F)V

    iget p1, p0, Lcom/facebook/react/views/text/q;->k:F

    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->s(F)V

    :cond_0
    return-void
.end method

.method private k(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->f:I

    :cond_1
    return-void
.end method

.method private l(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->b:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->d:I

    :cond_1
    return-void
.end method

.method private m(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->z:Ljava/lang/String;

    return-void
.end method

.method private n(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->i:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->f(F)F

    move-result p1

    :goto_0
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p1, v0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    goto :goto_0

    :cond_1
    :goto_1
    float-to-int p1, p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->h:I

    return-void
.end method

.method private o(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/o;->b(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->x:I

    return-void
.end method

.method private p(Lcom/facebook/react/common/mapbuffer/a;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1c

    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/common/mapbuffer/a$c;

    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "stylistic-seventeen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v2, 0x18

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "stylistic-fourteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v2, 0x17

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "stylistic-nineteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v2, 0x16

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "small-caps"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v2, 0x15

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "stylistic-twenty"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "stylistic-twelve"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v2, 0x13

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "stylistic-sixteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v2, 0x12

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "stylistic-two"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v2, 0x11

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "stylistic-ten"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "stylistic-six"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v2, 0xf

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "stylistic-one"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v2, 0xe

    goto/16 :goto_1

    :sswitch_b
    const-string v3, "stylistic-nine"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_c
    const-string v3, "stylistic-four"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v2, 0xc

    goto/16 :goto_1

    :sswitch_d
    const-string v3, "stylistic-five"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v2, 0xb

    goto/16 :goto_1

    :sswitch_e
    const-string v3, "stylistic-eleven"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_f
    const-string v3, "stylistic-three"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v2, 0x9

    goto/16 :goto_1

    :sswitch_10
    const-string v3, "stylistic-seven"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v2, 0x8

    goto/16 :goto_1

    :sswitch_11
    const-string v3, "stylistic-eight"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_1

    :cond_13
    const/4 v2, 0x7

    goto :goto_1

    :sswitch_12
    const-string v3, "oldstyle-nums"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto :goto_1

    :cond_14
    const/4 v2, 0x6

    goto :goto_1

    :sswitch_13
    const-string v3, "tabular-nums"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_1

    :cond_15
    const/4 v2, 0x5

    goto :goto_1

    :sswitch_14
    const-string v3, "lining-nums"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto :goto_1

    :cond_16
    const/4 v2, 0x4

    goto :goto_1

    :sswitch_15
    const-string v3, "proportional-nums"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_1

    :cond_17
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_16
    const-string v3, "stylistic-eighteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_1

    :cond_18
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_17
    const-string v3, "stylistic-fifteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_1

    :cond_19
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_18
    const-string v3, "stylistic-thirteen"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v2, 0x0

    :goto_1
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const-string v1, "\'ss17\'"

    :goto_2
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1
    const-string v1, "\'ss14\'"

    goto :goto_2

    :pswitch_2
    const-string v1, "\'ss19\'"

    goto :goto_2

    :pswitch_3
    const-string v1, "\'smcp\'"

    goto :goto_2

    :pswitch_4
    const-string v1, "\'ss20\'"

    goto :goto_2

    :pswitch_5
    const-string v1, "\'ss12\'"

    goto :goto_2

    :pswitch_6
    const-string v1, "\'ss16\'"

    goto :goto_2

    :pswitch_7
    const-string v1, "\'ss02\'"

    goto :goto_2

    :pswitch_8
    const-string v1, "\'ss10\'"

    goto :goto_2

    :pswitch_9
    const-string v1, "\'ss06\'"

    goto :goto_2

    :pswitch_a
    const-string v1, "\'ss01\'"

    goto :goto_2

    :pswitch_b
    const-string v1, "\'ss09\'"

    goto :goto_2

    :pswitch_c
    const-string v1, "\'ss04\'"

    goto :goto_2

    :pswitch_d
    const-string v1, "\'ss05\'"

    goto :goto_2

    :pswitch_e
    const-string v1, "\'ss11\'"

    goto :goto_2

    :pswitch_f
    const-string v1, "\'ss03\'"

    goto :goto_2

    :pswitch_10
    const-string v1, "\'ss07\'"

    goto :goto_2

    :pswitch_11
    const-string v1, "\'ss08\'"

    goto :goto_2

    :pswitch_12
    const-string v1, "\'onum\'"

    goto :goto_2

    :pswitch_13
    const-string v1, "\'tnum\'"

    goto :goto_2

    :pswitch_14
    const-string v1, "\'lnum\'"

    goto :goto_2

    :pswitch_15
    const-string v1, "\'pnum\'"

    goto :goto_2

    :pswitch_16
    const-string v1, "\'ss18\'"

    goto :goto_2

    :pswitch_17
    const-string v1, "\'ss15\'"

    goto :goto_2

    :pswitch_18
    const-string v1, "\'ss13\'"

    goto :goto_2

    :cond_1b
    const-string p1, ", "

    invoke-static {p1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->A:Ljava/lang/String;

    return-void

    :cond_1c
    :goto_4
    const/4 p1, 0x0

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7634064c -> :sswitch_18
        -0x733f3500 -> :sswitch_17
        -0x5b760864 -> :sswitch_16
        -0x473fc7cb -> :sswitch_15
        -0x3f4391b7 -> :sswitch_14
        -0x2e038ca3 -> :sswitch_13
        -0x2751e650 -> :sswitch_12
        0x11ac52f2 -> :sswitch_11
        0x12700270 -> :sswitch_10
        0x127f6801 -> :sswitch_f
        0x24079c3e -> :sswitch_e
        0x3a60dbef -> :sswitch_d
        0x3a60f263 -> :sswitch_c
        0x3a647def -> :sswitch_b
        0x3bb0ad89 -> :sswitch_a
        0x3bb0bc05 -> :sswitch_9
        0x3bb0bf40 -> :sswitch_8
        0x3bb0c16f -> :sswitch_7
        0x3d6f745f -> :sswitch_6
        0x3e3b2c96 -> :sswitch_5
        0x3e3b33ee -> :sswitch_4
        0x468813e7 -> :sswitch_3
        0x573c3149 -> :sswitch_2
        0x62414bbd -> :sswitch_1
        0x7cff8d4a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private q(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/o;->d(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->y:I

    return-void
.end method

.method private r(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/q;->e(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->m:I

    return-void
.end method

.method private s(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->k:F

    return-void
.end method

.method private t(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->j:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const/high16 p1, 0x7fc00000    # Float.NaN

    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/q;->a:F

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->f(F)F

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method private u(Lcom/facebook/react/uimanager/I$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->w:Lcom/facebook/react/uimanager/I$f;

    return-void
.end method

.method private v(Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->s:Z

    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->t:Z

    if-eqz p1, :cond_2

    const-string v1, "-"

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

    iput-boolean v4, p0, Lcom/facebook/react/views/text/q;->s:Z

    goto :goto_1

    :cond_0
    const-string v3, "strikethrough"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v4, p0, Lcom/facebook/react/views/text/q;->t:Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private w(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->r:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/q;->r:I

    :cond_0
    return-void
.end method

.method private x(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->o:F

    return-void
.end method

.method private y(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/text/q;->p:F

    return-void
.end method

.method private z(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->q:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/text/q;->q:F

    :cond_0
    return-void
.end method


# virtual methods
.method public b()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/text/q;->C:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/text/q;->C:F

    iget v1, p0, Lcom/facebook/react/views/text/q;->a:F

    cmpl-float v1, v0, v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/facebook/react/views/text/q;->a:F

    :goto_0
    return v0
.end method

.method public f()F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/text/q;->k:F

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->f(F)F

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/facebook/react/views/text/q;->k:F

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    :goto_0
    iget v1, p0, Lcom/facebook/react/views/text/q;->h:I

    if-lez v1, :cond_1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FontSize should be a positive value. Current value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/facebook/react/views/text/q;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

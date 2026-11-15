.class public Lcom/facebook/react/views/textinput/j;
.super Landroidx/appcompat/widget/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/j$d;,
        Lcom/facebook/react/views/textinput/j$c;
    }
.end annotation


# static fields
.field private static final c0:Landroid/text/method/KeyListener;


# instance fields
.field private A:I

.field protected B:Z

.field private C:Ljava/lang/String;

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Lcom/facebook/react/views/textinput/N;

.field private G:Lcom/facebook/react/views/textinput/a;

.field private H:Lcom/facebook/react/views/textinput/M;

.field private I:Lcom/facebook/react/views/textinput/j$c;

.field private J:Z

.field private K:Z

.field private L:Lcom/facebook/react/views/text/r;

.field private M:Z

.field private N:Ljava/lang/String;

.field private O:I

.field private P:I

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Ljava/lang/String;

.field private final U:Lcom/facebook/react/views/view/g;

.field private V:Lcom/facebook/react/uimanager/d0;

.field protected W:Z

.field protected a0:Z

.field private b0:Lcom/facebook/react/uimanager/events/e;

.field private final s:Landroid/view/inputmethod/InputMethodManager;

.field private final t:Ljava/lang/String;

.field protected u:Z

.field private final v:I

.field private final w:I

.field protected x:I

.field private y:Ljava/util/ArrayList;

.field private z:Lcom/facebook/react/views/textinput/j$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/text/method/QwertyKeyListener;->getInstanceForFullKeyboard()Landroid/text/method/QwertyKeyListener;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/textinput/j;->c0:Landroid/text/method/KeyListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/l;-><init>(Landroid/content/Context;)V

    const-class v0, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->t:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->C:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->J:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->K:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    const/4 v2, -0x1

    iput v2, p0, Lcom/facebook/react/views/textinput/j;->O:I

    iput v2, p0, Lcom/facebook/react/views/textinput/j;->P:I

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->Q:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->R:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->S:Z

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->T:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->V:Lcom/facebook/react/uimanager/d0;

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->W:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->a0:Z

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    new-instance v2, Lcom/facebook/react/views/view/g;

    invoke-direct {v2, p0}, Lcom/facebook/react/views/view/g;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    const-string v2, "input_method"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->s:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result p1

    const v2, 0x800007

    and-int/2addr p1, v2

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->v:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result p1

    and-int/lit8 p1, p1, 0x70

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->w:I

    iput v1, p0, Lcom/facebook/react/views/textinput/j;->x:I

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->u:Z

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->z:Lcom/facebook/react/views/textinput/j$d;

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->A:I

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    if-nez p1, :cond_0

    new-instance p1, Lcom/facebook/react/views/textinput/j$c;

    invoke-direct {p1}, Lcom/facebook/react/views/textinput/j$c;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    :cond_0
    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->H:Lcom/facebook/react/views/textinput/M;

    new-instance p1, Lcom/facebook/react/views/text/r;

    invoke-direct {p1}, Lcom/facebook/react/views/text/r;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->s()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p1, v1, :cond_1

    const/16 v1, 0x1b

    if-gt p1, v1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_1
    new-instance p1, Lcom/facebook/react/views/textinput/j$a;

    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v1

    invoke-direct {p1, p0, p0, v0, v1}, Lcom/facebook/react/views/textinput/j$a;-><init>(Lcom/facebook/react/views/textinput/j;Landroid/view/View;ZI)V

    invoke-static {p0, p1}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    new-instance p1, Lcom/facebook/react/views/textinput/j$b;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/textinput/j$b;-><init>(Lcom/facebook/react/views/textinput/j;)V

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/l;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method private A()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    and-int/lit16 v0, v0, 0x90

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic B(LM2/d;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1
.end method

.method private synthetic C(LM2/e;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/view/g;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1
.end method

.method private synthetic D(LM2/g;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return p1
.end method

.method private synthetic E(LM2/i;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    and-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    return p1
.end method

.method private synthetic F(LM2/k;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    and-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    return p1
.end method

.method private synthetic G(LM2/a;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, LM2/a;->b()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->d()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    cmpl-float p1, p1, v0

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1
.end method

.method private synthetic H(LM2/c;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, LM2/c;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->P:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LM2/c;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, LM2/c;->d()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget v1, p0, Lcom/facebook/react/views/textinput/j;->O:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, LM2/c;->b()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    :goto_0
    return p1
.end method

.method private I(Landroid/text/SpannableStringBuilder;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v1

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move v1, v3

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_4

    aget-object v2, v0, v1

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-interface {v4, v2}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v4

    and-int/lit8 v5, v4, 0x21

    const/16 v6, 0x21

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v3

    :goto_1
    instance-of v6, v2, LM2/h;

    if-eqz v6, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-interface {v6, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-interface {v6, v2}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-interface {v7, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-static {v7, p1, v5, v6}, Lcom/facebook/react/views/textinput/j;->R(Landroid/text/Editable;Landroid/text/SpannableStringBuilder;II)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p1, v2, v5, v6, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private O()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->G:Lcom/facebook/react/views/textinput/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/views/textinput/a;->a()V

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->V()V

    return-void
.end method

.method private Q()Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    const/16 v0, 0x82

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getShowSoftInputOnFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->Y()Z

    :cond_0
    return v0
.end method

.method private static R(Landroid/text/Editable;Landroid/text/SpannableStringBuilder;II)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-gt p2, v0, :cond_3

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-le p3, v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v2

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v1
.end method

.method private V()V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/k0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->V:Lcom/facebook/react/uimanager/d0;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/react/views/textinput/r;

    invoke-direct {v1, p0}, Lcom/facebook/react/views/textinput/r;-><init>(Landroid/widget/EditText;)V

    const-class v2, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewLocalData(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0, p2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    array-length v0, p2

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    invoke-interface {p3, v2}, Landroidx/core/util/g;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a0(Landroid/text/SpannableStringBuilder;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/c;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/c;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/d;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/d;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/d;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/e;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/e;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/e;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/g;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/f;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/f;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/i;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/g;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/g;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/k;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/h;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/h;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/a;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    new-instance v0, Lcom/facebook/react/views/textinput/i;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/textinput/i;-><init>(Lcom/facebook/react/views/textinput/j;)V

    const-class v1, LM2/c;

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/views/textinput/j;->Z(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Landroidx/core/util/g;)V

    return-void
.end method

.method private b0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->V:Lcom/facebook/react/uimanager/d0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    if-eqz v2, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-interface {v0, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->t:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    if-nez v2, :cond_5

    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_3

    :cond_4
    const-string v0, "I"

    goto :goto_2

    :cond_5
    :goto_3
    invoke-direct {p0, v3}, Lcom/facebook/react/views/textinput/j;->r(Landroid/text/SpannableStringBuilder;)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0, v3}, Lcom/facebook/react/views/text/s;->l(ILandroid/text/Spannable;)V

    return-void
.end method

.method private c0()V
    .locals 9

    .line 1
    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/facebook/react/views/textinput/j;->E:Ljava/lang/String;

    const/4 v6, 0x6

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    const/4 v7, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v8, "send"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move v7, v6

    goto :goto_0

    :sswitch_1
    const-string v8, "none"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    move v7, v0

    goto :goto_0

    :sswitch_2
    const-string v8, "next"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move v7, v1

    goto :goto_0

    :sswitch_3
    const-string v8, "done"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    move v7, v2

    goto :goto_0

    :sswitch_4
    const-string v8, "go"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    move v7, v3

    goto :goto_0

    :sswitch_5
    const-string v8, "search"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    move v7, v4

    goto :goto_0

    :sswitch_6
    const-string v8, "previous"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    const/4 v7, 0x0

    :goto_0
    packed-switch v7, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v4

    goto :goto_2

    :cond_7
    :goto_1
    :pswitch_2
    move v0, v6

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :pswitch_4
    move v0, v2

    goto :goto_2

    :pswitch_5
    const/4 v0, 0x7

    :goto_2
    :pswitch_6
    iget-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    if-eqz v1, :cond_8

    const/high16 v1, 0x2000000

    or-int/2addr v0, v1

    :cond_8
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4bec4509 -> :sswitch_6
        -0x36059a58 -> :sswitch_5
        0xce8 -> :sswitch_4
        0x2f2382 -> :sswitch_3
        0x338af3 -> :sswitch_2
        0x33af38 -> :sswitch_1
        0x35cf88 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic e(Lcom/facebook/react/views/textinput/j;LM2/g;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->D(LM2/g;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lcom/facebook/react/views/textinput/j;LM2/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->C(LM2/e;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lcom/facebook/react/views/textinput/j;LM2/c;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->H(LM2/c;)Z

    move-result p0

    return p0
.end method

.method private getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$d;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->z:Lcom/facebook/react/views/textinput/j$d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/views/textinput/j$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/textinput/j$d;-><init>(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/views/textinput/k;)V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->z:Lcom/facebook/react/views/textinput/j$d;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->z:Lcom/facebook/react/views/textinput/j$d;

    return-object v0
.end method

.method public static synthetic h(Lcom/facebook/react/views/textinput/j;LM2/i;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->E(LM2/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lcom/facebook/react/views/textinput/j;LM2/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->G(LM2/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lcom/facebook/react/views/textinput/j;LM2/d;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->B(LM2/d;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lcom/facebook/react/views/textinput/j;LM2/k;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/j;->F(LM2/k;)Z

    move-result p0

    return p0
.end method

.method static bridge synthetic l(Lcom/facebook/react/views/textinput/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/textinput/j;->R:Z

    return p0
.end method

.method static bridge synthetic m(Lcom/facebook/react/views/textinput/j;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->O()V

    return-void
.end method

.method static bridge synthetic o(Lcom/facebook/react/views/textinput/j;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->Q()Z

    move-result p0

    return p0
.end method

.method static bridge synthetic p(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->b0()V

    return-void
.end method

.method static bridge synthetic q()Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/textinput/j;->c0:Landroid/text/method/KeyListener;

    return-object v0
.end method

.method private r(Landroid/text/SpannableStringBuilder;)V
    .locals 10

    .line 1
    new-instance v0, LM2/d;

    iget-object v1, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v1}, Lcom/facebook/react/views/text/r;->c()I

    move-result v1

    invoke-direct {v0, v1}, LM2/d;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/4 v2, 0x0

    const v3, 0xff0012

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    new-instance v0, LM2/g;

    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    invoke-direct {v0, v1}, LM2/g;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0}, Lcom/facebook/react/views/view/g;->b()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, LM2/e;

    invoke-direct {v1, v0}, LM2/e;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_1

    new-instance v0, LM2/i;

    invoke-direct {v0}, LM2/i;-><init>()V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    new-instance v0, LM2/k;

    invoke-direct {v0}, LM2/k;-><init>()V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, LM2/a;

    invoke-direct {v1, v0}, LM2/a;-><init>(F)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->P:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->O:I

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_4
    new-instance v0, LM2/c;

    iget v5, p0, Lcom/facebook/react/views/textinput/j;->P:I

    iget v6, p0, Lcom/facebook/react/views/textinput/j;->O:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v9

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, LM2/c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, LM2/b;

    invoke-direct {v1, v0}, LM2/b;-><init>(F)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_6
    return-void
.end method

.method private u(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method


# virtual methods
.method public J(III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/j;->t(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, -0x1

    if-eq p2, p1, :cond_1

    if-eq p3, p1, :cond_1

    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/j;->u(I)I

    move-result p1

    invoke-direct {p0, p3}, Lcom/facebook/react/views/textinput/j;->u(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/textinput/j;->setSelection(II)V

    :cond_1
    return-void
.end method

.method public K(Lcom/facebook/react/views/text/i;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/textinput/j;->t(I)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/j;->I(Landroid/text/SpannableStringBuilder;)V

    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/j;->a0(Landroid/text/SpannableStringBuilder;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->b()Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->W:Z

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v3

    invoke-interface {v1, v2, v3, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    :goto_0
    iput-boolean v2, p0, Lcom/facebook/react/views/textinput/j;->W:Z

    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->k()I

    move-result v1

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/facebook/react/views/text/i;->k()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setBreakStrategy(I)V

    :cond_3
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->b0()V

    return-void
.end method

.method public L(Lcom/facebook/react/views/text/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->u:Z

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/j;->K(Lcom/facebook/react/views/text/i;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->u:Z

    return-void
.end method

.method public M(Lcom/facebook/react/views/text/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->a0:Z

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/j;->K(Lcom/facebook/react/views/text/i;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->a0:Z

    return-void
.end method

.method public N()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/views/textinput/j;->P:I

    iget v2, p0, Lcom/facebook/react/views/textinput/j;->O:I

    iget-object v3, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/views/text/o;->a(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->P:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->O:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0x81

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    :goto_2
    return-void
.end method

.method public P()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->Q()Z

    return-void
.end method

.method public S(IFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/views/view/g;->f(IFF)V

    return-void
.end method

.method public T(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->h(FI)V

    return-void
.end method

.method public U(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->j(IF)V

    return-void
.end method

.method public W()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->getSubmitBehavior()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v1, "blurAndSubmit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0
.end method

.method public X()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->getSubmitBehavior()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    const-string v3, "submit"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "blurAndSubmit"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method protected Y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->s:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$d;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public clearFocus()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->x()V

    return-void
.end method

.method protected finalize()V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/facebook/react/views/text/s;->e(I)V

    return-void
.end method

.method public getDisableFullscreenUI()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    return v0
.end method

.method getGravityHorizontal()I
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    const v1, 0x800007

    and-int/2addr v0, v1

    return v0
.end method

.method public getReturnKeyType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->E:Ljava/lang/String;

    return-object v0
.end method

.method getStagedInputType()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->A:I

    return v0
.end method

.method public getStateWrapper()Lcom/facebook/react/uimanager/d0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->V:Lcom/facebook/react/uimanager/d0;

    return-object v0
.end method

.method public getSubmitBehavior()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->C:Ljava/lang/String;

    return-object v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public isLayoutRequested()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x1

    invoke-super {p0, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    iget-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, LM2/n;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LM2/n;

    array-length v2, v1

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v3, v1, v4

    invoke-virtual {v3}, LM2/n;->c()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->Q:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->S:Z

    if-nez v1, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->Q()Z

    :cond_1
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->S:Z

    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    invoke-static {p0}, Lcom/facebook/react/uimanager/k0;->d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v2, p0, Lcom/facebook/react/views/textinput/j;->K:Z

    if-eqz v2, :cond_0

    new-instance v2, Lcom/facebook/react/views/textinput/l;

    iget-object v3, p0, Lcom/facebook/react/views/textinput/j;->b0:Lcom/facebook/react/uimanager/events/e;

    invoke-direct {v2, v1, v0, p0, v3}, Lcom/facebook/react/views/textinput/l;-><init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/events/e;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->W()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->X()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const v2, -0x40000001    # -1.9999999f

    and-int/2addr v0, v2

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_2
    return-object v1
.end method

.method public onDetachedFromWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->d()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->d(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onFinishTemporaryDetach()V

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->e()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->F:Lcom/facebook/react/views/textinput/N;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result p3

    invoke-interface {p1, p2, p3}, Lcom/facebook/react/views/textinput/N;->a(II)V

    :cond_0
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x42

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->x()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->O()V

    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->H:Lcom/facebook/react/views/textinput/M;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/react/views/textinput/M;->a(IIII)V

    :cond_0
    return-void
.end method

.method protected onSelectionChanged(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onSelectionChanged(II)V

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->F:Lcom/facebook/react/views/textinput/N;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->F:Lcom/facebook/react/views/textinput/N;

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/views/textinput/N;->a(II)V

    :cond_0
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onStartTemporaryDetach()V

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->f()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    const v0, 0x1020022

    if-ne p1, v0, :cond_0

    const p1, 0x1020031

    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/l;->onTextContextMenuItem(I)Z

    move-result p1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->J:Z

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    iput-boolean v3, p0, Lcom/facebook/react/views/textinput/j;->J:Z

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/views/textinput/j;->J:Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->y:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->getTextWatcherDelegator()Lcom/facebook/react/views/textinput/j$d;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result p1

    return p1
.end method

.method protected s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->c()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setLetterSpacing(F)V

    :cond_0
    return-void
.end method

.method public setAllowFontScaling(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->b()Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->m(Z)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->s()V

    :cond_0
    return-void
.end method

.method public setAutoFocus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->Q:Z

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->e(I)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->g(F)V

    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public setContentSizeWatcher(Lcom/facebook/react/views/textinput/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->G:Lcom/facebook/react/views/textinput/a;

    return-void
.end method

.method public setContextMenuHidden(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->R:Z

    return-void
.end method

.method public setDisableFullscreenUI(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->D:Z

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->c0()V

    return-void
.end method

.method setEventDispatcher(Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->b0:Lcom/facebook/react/uimanager/events/e;

    return-void
.end method

.method public setFontFamily(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->N:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    return-void
.end method

.method public setFontFeatureSettings(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/TextView;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFontFeatureSettings(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    :cond_0
    return-void
.end method

.method public setFontSize(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->n(F)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->s()V

    return-void
.end method

.method public setFontStyle(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->b(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->P:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->P:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    :cond_0
    return-void
.end method

.method public setFontWeight(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->d(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/textinput/j;->O:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->O:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->M:Z

    :cond_0
    return-void
.end method

.method setGravityHorizontal(I)V
    .locals 2

    if-nez p1, :cond_0

    iget p1, p0, Lcom/facebook/react/views/textinput/j;->v:I

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    const v1, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method setGravityVertical(I)V
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Lcom/facebook/react/views/textinput/j;->w:I

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->A:I

    invoke-super {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/facebook/react/views/textinput/j$c;

    invoke-direct {v0}, Lcom/facebook/react/views/textinput/j$c;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/j$c;->a(I)V

    iget-object p1, p0, Lcom/facebook/react/views/textinput/j;->I:Lcom/facebook/react/views/textinput/j$c;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/l;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public setLetterSpacingPt(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->p(F)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->s()V

    return-void
.end method

.method public setLineHeight(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->q(F)V

    return-void
.end method

.method public setMaxFontSizeMultiplier(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0}, Lcom/facebook/react/views/text/r;->k()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->L:Lcom/facebook/react/views/text/r;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/r;->r(F)V

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->s()V

    :cond_0
    return-void
.end method

.method public setOnKeyPress(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/textinput/j;->K:Z

    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->U:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public setPlaceholder(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->T:Ljava/lang/String;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->T:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setReturnKeyType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->E:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/react/views/textinput/j;->c0()V

    return-void
.end method

.method public setScrollWatcher(Lcom/facebook/react/views/textinput/M;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->H:Lcom/facebook/react/views/textinput/M;

    return-void
.end method

.method public setSelection(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setSelection(II)V

    return-void
.end method

.method public setSelectionWatcher(Lcom/facebook/react/views/textinput/N;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->F:Lcom/facebook/react/views/textinput/N;

    return-void
.end method

.method setStagedInputType(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/textinput/j;->A:I

    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/d0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->V:Lcom/facebook/react/uimanager/d0;

    return-void
.end method

.method public setSubmitBehavior(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/j;->C:Ljava/lang/String;

    return-void
.end method

.method public t(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->x:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method v()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->clearFocus()V

    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/j;->B:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v2, LM2/n;

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM2/n;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v2, v0, v3

    invoke-virtual {v2}, LM2/n;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    return p1
.end method

.method w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    iget v1, p0, Lcom/facebook/react/views/textinput/j;->A:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v1

    iget v2, p0, Lcom/facebook/react/views/textinput/j;->A:I

    invoke-virtual {p0, v2}, Lcom/facebook/react/views/textinput/j;->setInputType(I)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/textinput/j;->setSelection(II)V

    :cond_0
    return-void
.end method

.method protected x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/j;->s:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/textinput/j;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/react/views/textinput/j;->x:I

    return v0
.end method

.method z()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.class Lcom/google/android/material/textfield/e;
.super Lcom/google/android/material/textfield/f;
.source "SourceFile"


# static fields
.field private static final t:Z


# instance fields
.field private final e:Landroid/text/TextWatcher;

.field private final f:Landroid/view/View$OnFocusChangeListener;

.field private final g:Lcom/google/android/material/textfield/TextInputLayout$e;

.field private final h:Lcom/google/android/material/textfield/TextInputLayout$f;

.field private final i:Lcom/google/android/material/textfield/TextInputLayout$g;

.field private final j:Landroid/view/View$OnAttachStateChangeListener;

.field private final k:Landroidx/core/view/accessibility/c$b;

.field private l:Z

.field private m:Z

.field private n:J

.field private o:Landroid/graphics/drawable/StateListDrawable;

.field private p:LN3/g;

.field private q:Landroid/view/accessibility/AccessibilityManager;

.field private r:Landroid/animation/ValueAnimator;

.field private s:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    return-void
.end method

.method constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/textfield/f;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    new-instance p1, Lcom/google/android/material/textfield/e$a;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$a;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->e:Landroid/text/TextWatcher;

    new-instance p1, Lcom/google/android/material/textfield/e$e;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$e;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->f:Landroid/view/View$OnFocusChangeListener;

    new-instance p1, Lcom/google/android/material/textfield/e$f;

    iget-object p2, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/textfield/e$f;-><init>(Lcom/google/android/material/textfield/e;Lcom/google/android/material/textfield/TextInputLayout;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->g:Lcom/google/android/material/textfield/TextInputLayout$e;

    new-instance p1, Lcom/google/android/material/textfield/e$g;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$g;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->h:Lcom/google/android/material/textfield/TextInputLayout$f;

    new-instance p1, Lcom/google/android/material/textfield/e$h;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$h;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->i:Lcom/google/android/material/textfield/TextInputLayout$g;

    new-instance p1, Lcom/google/android/material/textfield/e$i;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$i;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->j:Landroid/view/View$OnAttachStateChangeListener;

    new-instance p1, Lcom/google/android/material/textfield/e$j;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$j;-><init>(Lcom/google/android/material/textfield/e;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/e;->k:Landroidx/core/view/accessibility/c$b;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/e;->l:Z

    iput-boolean p1, p0, Lcom/google/android/material/textfield/e;->m:Z

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lcom/google/android/material/textfield/e;->n:J

    return-void
.end method

.method private A(Landroid/widget/AutoCompleteTextView;I[[ILN3/g;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    sget v2, LA3/a;->l:I

    .line 4
    .line 5
    invoke-static {p1, v2}, LE3/a;->d(Landroid/view/View;I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    new-instance v3, LN3/g;

    .line 10
    .line 11
    invoke-virtual {p4}, LN3/g;->C()LN3/k;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-direct {v3, v4}, LN3/g;-><init>(LN3/k;)V

    .line 16
    .line 17
    .line 18
    const v4, 0x3dcccccd    # 0.1f

    .line 19
    .line 20
    .line 21
    invoke-static {p2, v2, v4}, LE3/a;->h(IIF)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const/4 v4, 0x0

    .line 26
    filled-new-array {p2, v4}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    new-instance v6, Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    invoke-direct {v6, p3, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v6}, LN3/g;->V(Landroid/content/res/ColorStateList;)V

    .line 36
    .line 37
    .line 38
    sget-boolean v5, Lcom/google/android/material/textfield/e;->t:Z

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3, v2}, LN3/g;->setTint(I)V

    .line 43
    .line 44
    .line 45
    filled-new-array {p2, v2}, [I

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    invoke-direct {v2, p3, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 52
    .line 53
    .line 54
    new-instance p2, LN3/g;

    .line 55
    .line 56
    invoke-virtual {p4}, LN3/g;->C()LN3/k;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-direct {p2, p3}, LN3/g;-><init>(LN3/k;)V

    .line 61
    .line 62
    .line 63
    const/4 p3, -0x1

    .line 64
    invoke-virtual {p2, p3}, LN3/g;->setTint(I)V

    .line 65
    .line 66
    .line 67
    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    .line 68
    .line 69
    invoke-direct {p3, v2, v3, p2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    new-array p2, v1, [Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    aput-object p3, p2, v4

    .line 75
    .line 76
    aput-object p4, p2, v0

    .line 77
    .line 78
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    .line 79
    .line 80
    invoke-direct {p3, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    new-array p2, v1, [Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    aput-object v3, p2, v4

    .line 87
    .line 88
    aput-object p4, p2, v0

    .line 89
    .line 90
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    .line 91
    .line 92
    invoke-direct {p3, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-static {p1, p3}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method private B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/e;->q:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/view/H;->S(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/e;->q:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->k:Landroidx/core/view/accessibility/c$b;

    invoke-static {v0, v1}, Landroidx/core/view/accessibility/c;->a(Landroid/view/accessibility/AccessibilityManager;Landroidx/core/view/accessibility/c$b;)Z

    :cond_0
    return-void
.end method

.method private static C(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/AutoCompleteTextView;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private varargs D(I[F)Landroid/animation/ValueAnimator;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    sget-object v0, LB3/a;->a:Landroid/animation/TimeInterpolator;

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p1, Lcom/google/android/material/textfield/e$d;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/e$d;-><init>(Lcom/google/android/material/textfield/e;)V

    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p2
.end method

.method private E(FFFI)LN3/g;
    .locals 1

    .line 1
    invoke-static {}, LN3/k;->a()LN3/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LN3/k$b;->A(F)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LN3/k$b;->E(F)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p2}, LN3/k$b;->s(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p2}, LN3/k$b;->w(F)LN3/k$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, LN3/k$b;->m()LN3/k;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lcom/google/android/material/textfield/f;->b:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {p2, p3}, LN3/g;->m(Landroid/content/Context;F)LN3/g;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, p1}, LN3/g;->setShapeAppearanceModel(LN3/k;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p2, p1, p4, p1, p4}, LN3/g;->X(IIII)V

    .line 36
    .line 37
    .line 38
    return-object p2
.end method

.method private F()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    const/16 v2, 0x43

    invoke-direct {p0, v2, v1}, Lcom/google/android/material/textfield/e;->D(I[F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/textfield/e;->s:Landroid/animation/ValueAnimator;

    const/16 v1, 0x32

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    invoke-direct {p0, v1, v0}, Lcom/google/android/material/textfield/e;->D(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/e;->r:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/google/android/material/textfield/e$c;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/e$c;-><init>(Lcom/google/android/material/textfield/e;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private G()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/material/textfield/e;->n:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static H(Landroid/widget/EditText;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/e;->q:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->k:Landroidx/core/view/accessibility/c$b;

    invoke-static {v0, v1}, Landroidx/core/view/accessibility/c;->b(Landroid/view/accessibility/AccessibilityManager;Landroidx/core/view/accessibility/c$b;)Z

    :cond_0
    return-void
.end method

.method private J(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/e;->m:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/e;->m:Z

    iget-object p1, p0, Lcom/google/android/material/textfield/e;->s:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, Lcom/google/android/material/textfield/e;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method private K(Landroid/widget/AutoCompleteTextView;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/e;->p:LN3/g;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/e;->o:Landroid/graphics/drawable/StateListDrawable;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private L(Landroid/widget/AutoCompleteTextView;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/textfield/e$l;

    invoke-direct {v0, p0, p1}, Lcom/google/android/material/textfield/e$l;-><init>(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/e;->f:Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/material/textfield/e$b;

    invoke-direct {v0, p0}, Lcom/google/android/material/textfield/e$b;-><init>(Lcom/google/android/material/textfield/e;)V

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method private M(Landroid/widget/AutoCompleteTextView;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/google/android/material/textfield/e;->l:Z

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/e;->l:Z

    if-nez v0, :cond_4

    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/material/textfield/e;->m:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/e;->J(Z)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/material/textfield/e;->m:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/textfield/e;->m:Z

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    :goto_0
    iget-boolean v0, p0, Lcom/google/android/material/textfield/e;->m:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, Lcom/google/android/material/textfield/e;->l:Z

    :goto_1
    return-void
.end method

.method private N()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/textfield/e;->l:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/material/textfield/e;->n:J

    return-void
.end method

.method static synthetic e(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/material/textfield/e;->C(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lcom/google/android/material/textfield/e;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->q:Landroid/view/accessibility/AccessibilityManager;

    return-object p0
.end method

.method static synthetic g(Lcom/google/android/material/textfield/e;)Landroid/text/TextWatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->e:Landroid/text/TextWatcher;

    return-object p0
.end method

.method static synthetic h(Lcom/google/android/material/textfield/e;)Lcom/google/android/material/textfield/TextInputLayout$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->g:Lcom/google/android/material/textfield/TextInputLayout$e;

    return-object p0
.end method

.method static synthetic i(Lcom/google/android/material/textfield/e;)Landroid/view/View$OnFocusChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->f:Landroid/view/View$OnFocusChangeListener;

    return-object p0
.end method

.method static synthetic j()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    return v0
.end method

.method static synthetic k(Lcom/google/android/material/textfield/e;)Landroid/view/View$OnAttachStateChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->j:Landroid/view/View$OnAttachStateChangeListener;

    return-object p0
.end method

.method static synthetic l(Lcom/google/android/material/textfield/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->I()V

    return-void
.end method

.method static synthetic m(Lcom/google/android/material/textfield/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->B()V

    return-void
.end method

.method static synthetic n(Lcom/google/android/material/textfield/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->G()Z

    move-result p0

    return p0
.end method

.method static synthetic o(Lcom/google/android/material/textfield/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/material/textfield/e;->m:Z

    return p0
.end method

.method static synthetic p(Lcom/google/android/material/textfield/e;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/e;->s:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method static synthetic q(Landroid/widget/EditText;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/material/textfield/e;->H(Landroid/widget/EditText;)Z

    move-result p0

    return p0
.end method

.method static synthetic r(Lcom/google/android/material/textfield/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->J(Z)V

    return-void
.end method

.method static synthetic s(Lcom/google/android/material/textfield/e;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/e;->l:Z

    return p1
.end method

.method static synthetic t(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->M(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method static synthetic u(Lcom/google/android/material/textfield/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->N()V

    return-void
.end method

.method static synthetic v(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->K(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method static synthetic w(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->y(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method static synthetic x(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->L(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method private y(Landroid/widget/AutoCompleteTextView;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/google/android/material/textfield/e;->H(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackground()LN3/g;

    move-result-object v1

    sget v2, LA3/a;->h:I

    invoke-static {p1, v2}, LE3/a;->d(Landroid/view/View;I)I

    move-result v2

    const v3, 0x10100a7

    filled-new-array {v3}, [I

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [I

    filled-new-array {v3, v4}, [[I

    move-result-object v3

    const/4 v4, 0x2

    if-ne v0, v4, :cond_1

    invoke-direct {p0, p1, v2, v3, v1}, Lcom/google/android/material/textfield/e;->A(Landroid/widget/AutoCompleteTextView;I[[ILN3/g;)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    invoke-direct {p0, p1, v2, v3, v1}, Lcom/google/android/material/textfield/e;->z(Landroid/widget/AutoCompleteTextView;I[[ILN3/g;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private z(Landroid/widget/AutoCompleteTextView;I[[ILN3/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x3dcccccd    # 0.1f

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0, v1}, LE3/a;->h(IIF)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    filled-new-array {p2, v0}, [I

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    invoke-direct {v0, p3, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Landroid/graphics/drawable/RippleDrawable;

    .line 28
    .line 29
    invoke-direct {p2, v0, p4, p4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, LN3/g;

    .line 37
    .line 38
    invoke-virtual {p4}, LN3/g;->C()LN3/k;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, LN3/g;-><init>(LN3/k;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    invoke-direct {v1, p3, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, LN3/g;->V(Landroid/content/res/ColorStateList;)V

    .line 51
    .line 52
    .line 53
    const/4 p2, 0x2

    .line 54
    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    const/4 p3, 0x0

    .line 57
    aput-object p4, p2, p3

    .line 58
    .line 59
    const/4 p3, 0x1

    .line 60
    aput-object v0, p2, p3

    .line 61
    .line 62
    new-instance p3, Landroid/graphics/drawable/LayerDrawable;

    .line 63
    .line 64
    invoke-direct {p3, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    invoke-static {p1}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {p1, p3}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p2, p4, v0, v1}, Landroidx/core/view/H;->D0(Landroid/view/View;IIII)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-void
.end method


# virtual methods
.method O(Landroid/widget/AutoCompleteTextView;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/material/textfield/e;->H(Landroid/widget/EditText;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/e;->y(Landroid/widget/AutoCompleteTextView;)V

    :cond_1
    :goto_0
    return-void
.end method

.method a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LA3/c;->K:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/google/android/material/textfield/f;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LA3/c;->H:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/google/android/material/textfield/f;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LA3/c;->I:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-direct {p0, v0, v0, v1, v2}, Lcom/google/android/material/textfield/e;->E(FFFI)LN3/g;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {p0, v4, v0, v1, v2}, Lcom/google/android/material/textfield/e;->E(FFFI)LN3/g;

    move-result-object v0

    iput-object v3, p0, Lcom/google/android/material/textfield/e;->p:LN3/g;

    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/textfield/e;->o:Landroid/graphics/drawable/StateListDrawable;

    const v2, 0x10100aa

    filled-new-array {v2}, [I

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->o:Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x0

    new-array v2, v2, [I

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    iget v0, p0, Lcom/google/android/material/textfield/f;->d:I

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/google/android/material/textfield/e;->t:Z

    if-eqz v0, :cond_0

    sget v0, LA3/d;->d:I

    goto :goto_0

    :cond_0
    sget v0, LA3/d;->e:I

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LA3/h;->g:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance v1, Lcom/google/android/material/textfield/e$k;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/e$k;-><init>(Lcom/google/android/material/textfield/e;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->h:Lcom/google/android/material/textfield/TextInputLayout$f;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->g(Lcom/google/android/material/textfield/TextInputLayout$f;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->i:Lcom/google/android/material/textfield/TextInputLayout$g;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->h(Lcom/google/android/material/textfield/TextInputLayout$g;)V

    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->F()V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->b:Landroid/content/Context;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lcom/google/android/material/textfield/e;->q:Landroid/view/accessibility/AccessibilityManager;

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/e;->j:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-direct {p0}, Lcom/google/android/material/textfield/e;->B()V

    return-void
.end method

.method b(I)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

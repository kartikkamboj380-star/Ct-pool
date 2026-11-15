.class public final Lcom/google/android/material/datepicker/i;
.super Landroidx/fragment/app/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/fragment/app/e;"
    }
.end annotation


# static fields
.field static final H:Ljava/lang/Object;

.field static final I:Ljava/lang/Object;

.field static final J:Ljava/lang/Object;


# instance fields
.field private A:I

.field private B:Ljava/lang/CharSequence;

.field private C:Landroid/widget/TextView;

.field private D:Lcom/google/android/material/internal/CheckableImageButton;

.field private E:LN3/g;

.field private F:Landroid/widget/Button;

.field private G:Z

.field private final m:Ljava/util/LinkedHashSet;

.field private final n:Ljava/util/LinkedHashSet;

.field private final o:Ljava/util/LinkedHashSet;

.field private final p:Ljava/util/LinkedHashSet;

.field private q:I

.field private r:Lcom/google/android/material/datepicker/o;

.field private s:Lcom/google/android/material/datepicker/a;

.field private t:Lcom/google/android/material/datepicker/h;

.field private u:I

.field private v:Ljava/lang/CharSequence;

.field private w:Z

.field private x:I

.field private y:I

.field private z:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "CONFIRM_BUTTON_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->H:Ljava/lang/Object;

    const-string v0, "CANCEL_BUTTON_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->I:Ljava/lang/Object;

    const-string v0, "TOGGLE_BUTTON_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->J:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/e;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->m:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->n:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->o:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->p:Ljava/util/LinkedHashSet;

    return-void
.end method

.method private static A(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, LA3/c;->x:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    invoke-static {}, Lcom/google/android/material/datepicker/k;->k()Lcom/google/android/material/datepicker/k;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/datepicker/k;->p:I

    sget v2, LA3/c;->z:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sget v3, LA3/c;->C:I

    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p0

    mul-int/lit8 v0, v0, 0x2

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v1, p0

    add-int/2addr v0, v1

    return v0
.end method

.method private B(Landroid/content/Context;)I
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/datepicker/i;->q:I

    if-eqz p1, :cond_0

    return p1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    const/4 p1, 0x0

    throw p1
.end method

.method private C(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    sget-object v1, Lcom/google/android/material/datepicker/i;->J:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->w(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/p;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    iget v0, p0, Lcom/google/android/material/datepicker/i;->x:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-direct {p0, p1}, Lcom/google/android/material/datepicker/i;->I(Lcom/google/android/material/internal/CheckableImageButton;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    new-instance v0, Lcom/google/android/material/datepicker/i$c;

    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/i$c;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static D(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const v0, 0x101020d

    invoke-static {p0, v0}, Lcom/google/android/material/datepicker/i;->F(Landroid/content/Context;I)Z

    move-result p0

    return p0
.end method

.method static E(Landroid/content/Context;)Z
    .locals 1

    .line 1
    sget v0, LA3/a;->w:I

    invoke-static {p0, v0}, Lcom/google/android/material/datepicker/i;->F(Landroid/content/Context;I)Z

    move-result p0

    return p0
.end method

.method static F(Landroid/content/Context;I)Z
    .locals 2

    .line 1
    sget v0, LA3/a;->t:I

    const-class v1, Lcom/google/android/material/datepicker/h;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, LK3/b;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return p1
.end method

.method private G()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/material/datepicker/i;->B(Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->s:Lcom/google/android/material/datepicker/a;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/google/android/material/datepicker/h;->I(Lcom/google/android/material/datepicker/d;ILcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/h;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/datepicker/i;->t:Lcom/google/android/material/datepicker/h;

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->s:Lcom/google/android/material/datepicker/a;

    invoke-static {v2, v0, v1}, Lcom/google/android/material/datepicker/j;->u(Lcom/google/android/material/datepicker/d;ILcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->t:Lcom/google/android/material/datepicker/h;

    :goto_0
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->r:Lcom/google/android/material/datepicker/o;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->H()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/w;->p()Landroidx/fragment/app/E;

    move-result-object v0

    sget v1, LA3/e;->v:I

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->r:Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/E;->n(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    invoke-virtual {v0}, Landroidx/fragment/app/E;->i()V

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->r:Lcom/google/android/material/datepicker/o;

    new-instance v1, Lcom/google/android/material/datepicker/i$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/i$b;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/o;->s(Lcom/google/android/material/datepicker/n;)Z

    return-void
.end method

.method private H()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/i;->z()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->C:Landroid/widget/TextView;

    sget v2, LA3/h;->i:I

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->C:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private I(Lcom/google/android/material/internal/CheckableImageButton;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz v0, :cond_0

    sget v0, LA3/h;->l:I

    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget v0, LA3/h;->n:I

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic u(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic v(Lcom/google/android/material/datepicker/i;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->F:Landroid/widget/Button;

    return-object p0
.end method

.method private static w(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const v1, 0x10100a0

    filled-new-array {v1}, [I

    move-result-object v1

    sget v2, LA3/d;->b:I

    invoke-static {p0, v2}, Lf/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    new-array v1, v1, [I

    sget v2, LA3/d;->c:I

    invoke-static {p0, v2}, Lf/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method private x(Landroid/view/Window;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/i;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object v0

    sget v1, LA3/e;->f:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/internal/n;->c(Landroid/view/View;)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/material/internal/d;->a(Landroid/view/Window;ZLjava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    new-instance v2, Lcom/google/android/material/datepicker/i$a;

    invoke-direct {v2, p0, v1, v0, p1}, Lcom/google/android/material/datepicker/i$a;-><init>(Lcom/google/android/material/datepicker/i;ILandroid/view/View;I)V

    invoke-static {v0, v2}, Landroidx/core/view/H;->C0(Landroid/view/View;Landroidx/core/view/C;)V

    iput-boolean v3, p0, Lcom/google/android/material/datepicker/i;->G:Z

    return-void
.end method

.method private y()Lcom/google/android/material/datepicker/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "DATE_SELECTOR_KEY"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCancel(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->q:I

    const-string v0, "DATE_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/a;

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->s:Lcom/google/android/material/datepicker/a;

    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->u:I

    const-string v0, "TITLE_TEXT_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->v:Ljava/lang/CharSequence;

    const-string v0, "INPUT_MODE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->x:I

    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->y:I

    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->z:Ljava/lang/CharSequence;

    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->A:I

    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->B:Ljava/lang/CharSequence;

    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    new-instance p1, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/i;->B(Landroid/content/Context;)I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/datepicker/i;->D(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/material/datepicker/i;->w:Z

    sget v1, LA3/a;->l:I

    const-class v2, Lcom/google/android/material/datepicker/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, LK3/b;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v1

    new-instance v2, LN3/g;

    sget v3, LA3/a;->t:I

    sget v4, LA3/i;->o:I

    const/4 v5, 0x0

    invoke-direct {v2, v0, v5, v3, v4}, LN3/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v2, p0, Lcom/google/android/material/datepicker/i;->E:LN3/g;

    invoke-virtual {v2, v0}, LN3/g;->L(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->E:LN3/g;

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, LN3/g;->V(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->E:LN3/g;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/view/H;->w(Landroid/view/View;)F

    move-result v1

    invoke-virtual {v0, v1}, LN3/g;->U(F)V

    return-object p1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    iget-boolean p3, p0, Lcom/google/android/material/datepicker/i;->w:Z

    if-eqz p3, :cond_0

    sget p3, LA3/g;->r:I

    goto :goto_0

    :cond_0
    sget p3, LA3/g;->q:I

    :goto_0
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-boolean p3, p0, Lcom/google/android/material/datepicker/i;->w:Z

    if-eqz p3, :cond_1

    sget p3, LA3/e;->v:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p2}, Lcom/google/android/material/datepicker/i;->A(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    :goto_1
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_1
    sget p3, LA3/e;->w:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p2}, Lcom/google/android/material/datepicker/i;->A(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    goto :goto_1

    :goto_2
    sget p3, LA3/e;->z:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/google/android/material/datepicker/i;->C:Landroid/widget/TextView;

    const/4 v0, 0x1

    invoke-static {p3, v0}, Landroidx/core/view/H;->r0(Landroid/view/View;I)V

    sget p3, LA3/e;->A:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/internal/CheckableImageButton;

    iput-object p3, p0, Lcom/google/android/material/datepicker/i;->D:Lcom/google/android/material/internal/CheckableImageButton;

    sget p3, LA3/e;->B:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->v:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_2
    iget v0, p0, Lcom/google/android/material/datepicker/i;->u:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_3
    invoke-direct {p0, p2}, Lcom/google/android/material/datepicker/i;->C(Landroid/content/Context;)V

    sget p2, LA3/e;->c:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->F:Landroid/widget/Button;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    const/4 p1, 0x0

    throw p1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->p:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "OVERRIDE_THEME_RES_ID"

    iget v1, p0, Lcom/google/android/material/datepicker/i;->q:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "DATE_SELECTOR_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v0, Lcom/google/android/material/datepicker/a$b;

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->s:Lcom/google/android/material/datepicker/a;

    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/a$b;-><init>(Lcom/google/android/material/datepicker/a;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->t:Lcom/google/android/material/datepicker/h;

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/h;->D()Lcom/google/android/material/datepicker/k;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->t:Lcom/google/android/material/datepicker/h;

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/h;->D()Lcom/google/android/material/datepicker/k;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/android/material/datepicker/k;->r:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/datepicker/a$b;->b(J)Lcom/google/android/material/datepicker/a$b;

    :cond_0
    const-string v1, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a$b;->a()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    iget v1, p0, Lcom/google/android/material/datepicker/i;->u:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "TITLE_TEXT_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->v:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    iget v1, p0, Lcom/google/android/material/datepicker/i;->y:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->z:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    iget v1, p0, Lcom/google/android/material/datepicker/i;->A:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->B:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onStart()V
    .locals 9

    invoke-super {p0}, Landroidx/fragment/app/e;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/e;->requireDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/material/datepicker/i;->w:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->E:LN3/g;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0, v0}, Lcom/google/android/material/datepicker/i;->x(Landroid/view/Window;)V

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LA3/c;->B:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v8, v8, v8, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v2, Landroid/graphics/drawable/InsetDrawable;

    iget-object v4, p0, Lcom/google/android/material/datepicker/i;->E:LN3/g;

    move-object v3, v2

    move v5, v8

    move v6, v8

    move v7, v8

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, LF3/a;

    invoke-virtual {p0}, Landroidx/fragment/app/e;->requireDialog()Landroid/app/Dialog;

    move-result-object v3

    invoke-direct {v2, v3, v1}, LF3/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->G()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->r:Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/o;->t()V

    invoke-super {p0}, Landroidx/fragment/app/e;->onStop()V

    return-void
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->y()Lcom/google/android/material/datepicker/d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    const/4 v0, 0x0

    throw v0
.end method

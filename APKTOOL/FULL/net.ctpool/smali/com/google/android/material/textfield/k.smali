.class Lcom/google/android/material/textfield/k;
.super Lcom/google/android/material/textfield/f;
.source "SourceFile"


# instance fields
.field private final e:Landroid/text/TextWatcher;

.field private final f:Lcom/google/android/material/textfield/TextInputLayout$f;

.field private final g:Lcom/google/android/material/textfield/TextInputLayout$g;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/textfield/f;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    new-instance p1, Lcom/google/android/material/textfield/k$a;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$a;-><init>(Lcom/google/android/material/textfield/k;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/k;->e:Landroid/text/TextWatcher;

    new-instance p1, Lcom/google/android/material/textfield/k$b;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$b;-><init>(Lcom/google/android/material/textfield/k;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/k;->f:Lcom/google/android/material/textfield/TextInputLayout$f;

    new-instance p1, Lcom/google/android/material/textfield/k$c;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$c;-><init>(Lcom/google/android/material/textfield/k;)V

    iput-object p1, p0, Lcom/google/android/material/textfield/k;->g:Lcom/google/android/material/textfield/TextInputLayout$g;

    return-void
.end method

.method static synthetic e(Lcom/google/android/material/textfield/k;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/textfield/k;->g()Z

    move-result p0

    return p0
.end method

.method static synthetic f(Lcom/google/android/material/textfield/k;)Landroid/text/TextWatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/k;->e:Landroid/text/TextWatcher;

    return-object p0
.end method

.method private g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static h(Landroid/widget/EditText;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    const/16 v1, 0x90

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result p0

    const/16 v0, 0xe0

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget v1, p0, Lcom/google/android/material/textfield/f;->d:I

    if-nez v1, :cond_0

    sget v1, LA3/d;->a:I

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LA3/h;->p:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconCheckable(Z)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance v1, Lcom/google/android/material/textfield/k$d;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/k$d;-><init>(Lcom/google/android/material/textfield/k;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/k;->f:Lcom/google/android/material/textfield/TextInputLayout$f;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->g(Lcom/google/android/material/textfield/TextInputLayout$f;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/k;->g:Lcom/google/android/material/textfield/TextInputLayout$g;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->h(Lcom/google/android/material/textfield/TextInputLayout$g;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/textfield/k;->h(Landroid/widget/EditText;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_1
    return-void
.end method

.class public final Lcom/facebook/react/views/textinput/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/text/SpannableStringBuilder;

.field private final b:F

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/facebook/react/views/textinput/r;->a:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/textinput/r;->b:F

    invoke-virtual {p1}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/textinput/r;->e:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/views/textinput/r;->g:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/widget/TextView;->getMinLines()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/textinput/r;->c:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getMaxLines()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/views/textinput/r;->d:I

    invoke-virtual {p1}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/textinput/r;->f:I

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/r;->a:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    iget v1, p0, Lcom/facebook/react/views/textinput/r;->b:F

    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v0, p0, Lcom/facebook/react/views/textinput/r;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinLines(I)V

    iget v0, p0, Lcom/facebook/react/views/textinput/r;->d:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    iget v0, p0, Lcom/facebook/react/views/textinput/r;->e:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v0, p0, Lcom/facebook/react/views/textinput/r;->g:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget v0, p0, Lcom/facebook/react/views/textinput/r;->f:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    return-void
.end method

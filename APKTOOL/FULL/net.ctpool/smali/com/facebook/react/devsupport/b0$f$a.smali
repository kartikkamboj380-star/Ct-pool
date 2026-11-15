.class Lcom/facebook/react/devsupport/b0$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/b0$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/facebook/react/n;->t:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/react/devsupport/b0$f$a;->a:Landroid/widget/TextView;

    sget v0, Lcom/facebook/react/n;->s:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/facebook/react/devsupport/b0$f$a;->b:Landroid/widget/TextView;

    return-void
.end method

.method synthetic constructor <init>(Landroid/view/View;Lcom/facebook/react/devsupport/d0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/b0$f$a;-><init>(Landroid/view/View;)V

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/b0$f$a;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/b0$f$a;->a:Landroid/widget/TextView;

    return-object p0
.end method

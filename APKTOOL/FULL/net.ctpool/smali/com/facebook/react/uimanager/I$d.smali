.class public Lcom/facebook/react/uimanager/I$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/I$d$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>([Landroid/text/style/ClickableSpan;Landroid/text/Spannable;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget-object v2, p1, v1

    invoke-interface {p2, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    invoke-interface {p2, v2}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    if-eq v3, v2, :cond_1

    if-ltz v3, :cond_1

    if-ltz v2, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-gt v3, v4, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v2, v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Lcom/facebook/react/uimanager/I$d$a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/facebook/react/uimanager/I$d$a;-><init>(Lcom/facebook/react/uimanager/J;)V

    invoke-interface {p2, v3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/facebook/react/uimanager/I$d$a;->a:Ljava/lang/String;

    iput v3, v4, Lcom/facebook/react/uimanager/I$d$a;->b:I

    iput v2, v4, Lcom/facebook/react/uimanager/I$d$a;->c:I

    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, v1

    iput v2, v4, Lcom/facebook/react/uimanager/I$d$a;->d:I

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lcom/facebook/react/uimanager/I$d;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/react/uimanager/I$d$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/I$d$a;

    iget v2, v1, Lcom/facebook/react/uimanager/I$d$a;->d:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(II)Lcom/facebook/react/uimanager/I$d$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/I$d$a;

    iget v2, v1, Lcom/facebook/react/uimanager/I$d$a;->b:I

    if-ne v2, p1, :cond_0

    iget v2, v1, Lcom/facebook/react/uimanager/I$d$a;->c:I

    if-ne v2, p2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/I$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

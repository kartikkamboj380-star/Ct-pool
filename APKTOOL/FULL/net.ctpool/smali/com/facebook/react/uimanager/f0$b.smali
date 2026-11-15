.class public Lcom/facebook/react/uimanager/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:Landroid/view/View;


# direct methods
.method private constructor <init>(ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/uimanager/f0$b;->a:I

    iput-object p2, p0, Lcom/facebook/react/uimanager/f0$b;->b:Landroid/view/View;

    return-void
.end method

.method synthetic constructor <init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/f0$b;->b:Landroid/view/View;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/f0$b;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/facebook/react/uimanager/f0$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result p1

    iget v1, p0, Lcom/facebook/react/uimanager/f0$b;->a:I

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/uimanager/f0$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

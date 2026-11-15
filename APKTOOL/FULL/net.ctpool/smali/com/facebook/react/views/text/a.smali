.class public final Lcom/facebook/react/views/text/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/views/text/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/text/a;

    invoke-direct {v0}, Lcom/facebook/react/views/text/a;-><init>()V

    sput-object v0, Lcom/facebook/react/views/text/a;->a:Lcom/facebook/react/views/text/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    filled-new-array {p2}, [I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public static final b(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/views/text/a;->a:Lcom/facebook/react/views/text/a;

    const v1, 0x1010098

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/a;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;)I
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/views/text/a;->a:Lcom/facebook/react/views/text/a;

    const v1, 0x1010099

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/a;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/views/text/a;->a:Lcom/facebook/react/views/text/a;

    const v1, 0x101009a

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/a;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

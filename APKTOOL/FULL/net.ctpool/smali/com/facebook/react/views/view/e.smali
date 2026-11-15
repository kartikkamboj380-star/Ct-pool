.class public final Lcom/facebook/react/views/view/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/e$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/views/view/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/view/e;

    invoke-direct {v0}, Lcom/facebook/react/views/view/e;-><init>()V

    sput-object v0, Lcom/facebook/react/views/view/e;->a:Lcom/facebook/react/views/view/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(FLcom/facebook/yoga/p;)I
    .locals 1

    .line 1
    const-string v0, "mode"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/views/view/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    goto :goto_1

    :cond_0
    float-to-int p0, p0

    const/high16 p1, -0x80000000

    :goto_0
    invoke-static {p0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    goto :goto_1

    :cond_1
    float-to-int p0, p0

    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_0

    :goto_1
    return p0
.end method

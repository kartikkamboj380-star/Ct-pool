.class public final Lcom/facebook/react/devsupport/J;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/J$a;,
        Lcom/facebook/react/devsupport/J$b;
    }
.end annotation


# static fields
.field public static final p:Lcom/facebook/react/devsupport/J$a;


# instance fields
.field private final m:Landroid/widget/TextView;

.field private final n:Lcom/facebook/react/modules/debug/f;

.field private final o:Lcom/facebook/react/devsupport/J$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/devsupport/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/J$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/devsupport/J;->p:Lcom/facebook/react/devsupport/J$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 7

    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v0, Lcom/facebook/react/p;->b:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/facebook/react/n;->l:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/react/devsupport/J;->m:Landroid/widget/TextView;

    new-instance v0, Lcom/facebook/react/modules/debug/f;

    invoke-direct {v0, p1}, Lcom/facebook/react/modules/debug/f;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/J;->n:Lcom/facebook/react/modules/debug/f;

    new-instance p1, Lcom/facebook/react/devsupport/J$b;

    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/J$b;-><init>(Lcom/facebook/react/devsupport/J;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/J;->o:Lcom/facebook/react/devsupport/J$b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/devsupport/J;->c(DDII)V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/J;->n:Lcom/facebook/react/modules/debug/f;

    return-object p0
.end method

.method public static final synthetic b(Lcom/facebook/react/devsupport/J;DDII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/facebook/react/devsupport/J;->c(DDII)V

    return-void
.end method

.method private final c(DDII)V
    .locals 1

    .line 1
    sget-object v0, Lw5/y;->a:Lw5/y;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    filled-new-array {p1, p2, p5, p3}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x4

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps"

    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/facebook/react/devsupport/J;->m:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J;->n:Lcom/facebook/react/modules/debug/f;

    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/f;->j()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J;->n:Lcom/facebook/react/modules/debug/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/facebook/react/modules/debug/f;->l(Lcom/facebook/react/modules/debug/f;DILjava/lang/Object;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J;->o:Lcom/facebook/react/devsupport/J$b;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/J$b;->a()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J;->n:Lcom/facebook/react/modules/debug/f;

    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/f;->n()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J;->o:Lcom/facebook/react/devsupport/J$b;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/J$b;->b()V

    return-void
.end method

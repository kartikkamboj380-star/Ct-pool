.class Lcom/facebook/react/devsupport/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/h;


# instance fields
.field private final a:Landroidx/core/util/h;

.field private b:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroidx/core/util/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/Y;->a:Landroidx/core/util/h;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;LX1/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/Y;->f(Ljava/lang/String;LX1/e$a;)V

    return-void
.end method

.method public static synthetic b(LX1/e$a;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/Y;->e(LX1/e$a;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/Y;->d()V

    return-void
.end method

.method private synthetic d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method private static synthetic e(LX1/e$a;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LX1/e$a;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic f(Ljava/lang/String;LX1/e$a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y;->a:Landroidx/core/util/h;

    .line 9
    .line 10
    invoke-interface {v0}, Landroidx/core/util/h;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget v2, Lcom/facebook/react/p;->c:I

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Landroid/app/Dialog;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 44
    .line 45
    .line 46
    sget v0, Lcom/facebook/react/n;->o:I

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    sget p1, Lcom/facebook/react/n;->r:I

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/view/View;

    .line 74
    .line 75
    new-instance v0, Lcom/facebook/react/devsupport/X;

    .line 76
    .line 77
    invoke-direct {v0, p2}, Lcom/facebook/react/devsupport/X;-><init>(LX1/e$a;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    const/16 p2, 0x30

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/view/Window;->setGravity(I)V

    .line 94
    .line 95
    .line 96
    sget p2, Lcom/facebook/react/m;->a:I

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/devsupport/Y;->b:Landroid/app/Dialog;

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public g()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/W;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/W;-><init>(Lcom/facebook/react/devsupport/Y;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public i(Ljava/lang/String;LX1/e$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/V;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/devsupport/V;-><init>(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;LX1/e$a;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

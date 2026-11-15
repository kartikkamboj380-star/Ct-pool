.class public Lcom/facebook/react/devsupport/b0;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/b0$f;,
        Lcom/facebook/react/devsupport/b0$e;
    }
.end annotation


# instance fields
.field private m:LX1/e;

.field private n:Landroid/widget/ListView;

.field private o:Landroid/widget/Button;

.field private p:Landroid/widget/Button;

.field private q:Z

.field private r:LX1/i$a;

.field private s:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/devsupport/b0;->q:Z

    new-instance p1, Lcom/facebook/react/devsupport/b0$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/b0$a;-><init>(Lcom/facebook/react/devsupport/b0;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/b0;->r:LX1/i$a;

    new-instance p1, Lcom/facebook/react/devsupport/b0$b;

    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/b0$b;-><init>(Lcom/facebook/react/devsupport/b0;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/b0;->s:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/devsupport/b0;)LX1/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/devsupport/b0;)LX1/i;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/facebook/react/p;->f:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/facebook/react/n;->w:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/react/devsupport/b0;->n:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    sget v0, Lcom/facebook/react/n;->v:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/react/devsupport/b0;->o:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/react/devsupport/b0$c;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/b0$c;-><init>(Lcom/facebook/react/devsupport/b0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lcom/facebook/react/n;->u:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/react/devsupport/b0;->p:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/react/devsupport/b0$d;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/b0$d;-><init>(Lcom/facebook/react/devsupport/b0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-interface {v0}, LX1/e;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-interface {v1}, LX1/e;->B()[LX1/j;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-interface {v2}, LX1/e;->t()LX1/f;

    iget-object v2, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v2, v0}, LX1/e;->r(Landroid/util/Pair;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [LX1/j;

    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/devsupport/b0;->f(Ljava/lang/String;[LX1/j;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-interface {v0}, LX1/e;->y()LX1/i;

    return-void
.end method

.method public e(LX1/e;)Lcom/facebook/react/devsupport/b0;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Ljava/lang/String;[LX1/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/b0;->n:Landroid/widget/ListView;

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/devsupport/b0$f;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lcom/facebook/react/devsupport/b0$f;-><init>(Ljava/lang/String;[LX1/j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(LX1/i;)Lcom/facebook/react/devsupport/b0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    new-instance p1, Lcom/facebook/react/devsupport/b0$e;

    iget-object p2, p0, Lcom/facebook/react/devsupport/b0;->m:LX1/e;

    invoke-static {p2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LX1/e;

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4}, Lcom/facebook/react/devsupport/b0$e;-><init>(LX1/e;Lcom/facebook/react/devsupport/c0;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iget-object p4, p0, Lcom/facebook/react/devsupport/b0;->n:Landroid/widget/ListView;

    invoke-virtual {p4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p4

    invoke-interface {p4, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LX1/j;

    const/4 p4, 0x1

    new-array p4, p4, [LX1/j;

    const/4 p5, 0x0

    aput-object p3, p4, p5

    invoke-virtual {p1, p2, p4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.class public Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# static fields
.field private static final u:Landroidx/lifecycle/t;


# instance fields
.field private m:I

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Landroid/os/Handler;

.field private final r:Landroidx/lifecycle/m;

.field private s:Ljava/lang/Runnable;

.field t:Landroidx/lifecycle/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0}, Landroidx/lifecycle/t;-><init>()V

    sput-object v0, Landroidx/lifecycle/t;->u:Landroidx/lifecycle/t;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/t;->m:I

    iput v0, p0, Landroidx/lifecycle/t;->n:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->o:Z

    iput-boolean v0, p0, Landroidx/lifecycle/t;->p:Z

    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p0}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    new-instance v0, Landroidx/lifecycle/t$a;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t$a;-><init>(Landroidx/lifecycle/t;)V

    iput-object v0, p0, Landroidx/lifecycle/t;->s:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/t$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t$b;-><init>(Landroidx/lifecycle/t;)V

    iput-object v0, p0, Landroidx/lifecycle/t;->t:Landroidx/lifecycle/v$a;

    return-void
.end method

.method public static i()Landroidx/lifecycle/l;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/t;->u:Landroidx/lifecycle/t;

    return-object v0
.end method

.method static j(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/t;->u:Landroidx/lifecycle/t;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/t;->f(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/t;->n:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/t;->q:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/t;->s:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method c()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->n:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/t;->n:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/t;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_RESUME:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/t;->o:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/t;->q:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/t;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method d()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->m:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/t;->m:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/t;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_START:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/t;->p:Z

    :cond_0
    return-void
.end method

.method e()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/t;->m:I

    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    return-void
.end method

.method f(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->q:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_CREATE:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/t$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t$c;-><init>(Landroidx/lifecycle/t;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method g()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->n:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->o:Z

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_PAUSE:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    :cond_0
    return-void
.end method

.method public getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    return-object v0
.end method

.method h()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/t;->m:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/t;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/t;->r:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_STOP:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->p:Z

    :cond_0
    return-void
.end method

.class public Landroidx/lifecycle/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/D$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/m;

.field private final b:Landroid/os/Handler;

.field private c:Landroidx/lifecycle/D$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p1}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->a:Landroidx/lifecycle/m;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/D;->b:Landroid/os/Handler;

    return-void
.end method

.method private f(Landroidx/lifecycle/h$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/D;->c:Landroidx/lifecycle/D$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/D$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/D$a;

    iget-object v1, p0, Landroidx/lifecycle/D;->a:Landroidx/lifecycle/m;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/D$a;-><init>(Landroidx/lifecycle/m;Landroidx/lifecycle/h$b;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->c:Landroidx/lifecycle/D$a;

    iget-object p1, p0, Landroidx/lifecycle/D;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/D;->a:Landroidx/lifecycle/m;

    return-object v0
.end method

.method public b()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/h$b;->ON_START:Landroidx/lifecycle/h$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/D;->f(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/h$b;->ON_CREATE:Landroidx/lifecycle/h$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/D;->f(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/h$b;->ON_STOP:Landroidx/lifecycle/h$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/D;->f(Landroidx/lifecycle/h$b;)V

    sget-object v0, Landroidx/lifecycle/h$b;->ON_DESTROY:Landroidx/lifecycle/h$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/D;->f(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/h$b;->ON_START:Landroidx/lifecycle/h$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/D;->f(Landroidx/lifecycle/h$b;)V

    return-void
.end method

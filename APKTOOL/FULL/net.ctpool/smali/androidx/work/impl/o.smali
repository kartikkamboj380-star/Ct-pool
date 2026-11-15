.class public Landroidx/work/impl/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/l;


# instance fields
.field private final c:Landroidx/lifecycle/q;

.field private final d:Landroidx/work/impl/utils/futures/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/q;

    invoke-direct {v0}, Landroidx/lifecycle/q;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/o;->c:Landroidx/lifecycle/q;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->t()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/o;->d:Landroidx/work/impl/utils/futures/c;

    sget-object v0, Ll0/l;->b:Ll0/l$b$b;

    invoke-virtual {p0, v0}, Landroidx/work/impl/o;->a(Ll0/l$b;)V

    return-void
.end method


# virtual methods
.method public a(Ll0/l$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/o;->c:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/q;->l(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ll0/l$b$c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/work/impl/o;->d:Landroidx/work/impl/utils/futures/c;

    .line 11
    .line 12
    check-cast p1, Ll0/l$b$c;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->p(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, Ll0/l$b$a;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Ll0/l$b$a;

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/work/impl/o;->d:Landroidx/work/impl/utils/futures/c;

    .line 25
    .line 26
    invoke-virtual {p1}, Ll0/l$b$a;->a()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Throwable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

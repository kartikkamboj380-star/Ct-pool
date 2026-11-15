.class LR4/d$f;
.super LU4/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field private a:LR4/q;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LU4/k;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LR4/d$f;->a:LR4/q;

    .line 6
    .line 7
    return-void
.end method

.method private f()LR4/q;
    .locals 2

    .line 1
    iget-object v0, p0, LR4/d$f;->a:LR4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method


# virtual methods
.method public b(LY4/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, LR4/d$f;->f()LR4/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LR4/q;->b(LY4/a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public d(LY4/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LR4/d$f;->f()LR4/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()LR4/q;
    .locals 1

    .line 1
    invoke-direct {p0}, LR4/d$f;->f()LR4/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LR4/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR4/d$f;->a:LR4/q;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LR4/d$f;->a:LR4/q;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 9
    .line 10
    const-string v0, "Delegate is already set"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

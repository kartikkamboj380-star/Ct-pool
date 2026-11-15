.class public Li6/m;
.super Li6/D;
.source "SourceFile"


# instance fields
.field private f:Li6/D;


# direct methods
.method public constructor <init>(Li6/D;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Li6/D;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li6/m;->f:Li6/D;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->a()Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->b()Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d(J)Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Li6/D;->d(J)Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Li6/D;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/D;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final i()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/m;->f:Li6/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Li6/D;)Li6/m;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li6/m;->f:Li6/D;

    .line 7
    .line 8
    return-object p0
.end method

.class public abstract Lo5/d;
.super Lo5/a;
.source "SourceFile"


# instance fields
.field private final n:Lm5/g;

.field private transient o:Lm5/d;


# direct methods
.method public constructor <init>(Lm5/d;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lm5/d;->a()Lm5/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lo5/d;-><init>(Lm5/d;Lm5/g;)V

    return-void
.end method

.method public constructor <init>(Lm5/d;Lm5/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lo5/a;-><init>(Lm5/d;)V

    iput-object p2, p0, Lo5/d;->n:Lm5/g;

    return-void
.end method


# virtual methods
.method public a()Lm5/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lo5/d;->n:Lm5/g;

    .line 2
    .line 3
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo5/d;->o:Lm5/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lo5/d;->a()Lm5/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lm5/e;->l:Lm5/e$b;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lm5/e;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lm5/e;->z(Lm5/d;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Lo5/c;->m:Lo5/c;

    .line 26
    .line 27
    iput-object v0, p0, Lo5/d;->o:Lm5/d;

    .line 28
    .line 29
    return-void
.end method

.method public final u()Lm5/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lo5/d;->o:Lm5/d;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lo5/d;->a()Lm5/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lm5/e;->l:Lm5/e$b;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lm5/e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p0}, Lm5/e;->J(Lm5/d;)Lm5/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    move-object v0, p0

    .line 26
    :cond_1
    iput-object v0, p0, Lo5/d;->o:Lm5/d;

    .line 27
    .line 28
    :cond_2
    return-object v0
.end method

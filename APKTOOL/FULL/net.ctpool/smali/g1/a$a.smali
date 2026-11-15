.class Lg1/a$a;
.super LY0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/a;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lg1/a;


# direct methods
.method constructor <init>(Lg1/a;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg1/a$a;->c:Lg1/a;

    .line 2
    .line 3
    iput-object p2, p0, Lg1/a$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, Lg1/a$a;->b:Z

    .line 6
    .line 7
    invoke-direct {p0}, LY0/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b(LY0/c;)V
    .locals 4

    .line 1
    invoke-interface {p1}, LY0/c;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, LY0/c;->d()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lg1/a$a;->c:Lg1/a;

    .line 10
    .line 11
    iget-object v3, p0, Lg1/a$a;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v2, v3, p1, v1, v0}, Lg1/a;->i(Lg1/a;Ljava/lang/String;LY0/c;FZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(LY0/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lg1/a$a;->c:Lg1/a;

    .line 2
    .line 3
    iget-object v1, p0, Lg1/a$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1}, LY0/c;->c()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-static {v0, v1, p1, v2, v3}, Lg1/a;->h(Lg1/a;Ljava/lang/String;LY0/c;Ljava/lang/Throwable;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public f(LY0/c;)V
    .locals 8

    .line 1
    invoke-interface {p1}, LY0/c;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-interface {p1}, LY0/c;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    invoke-interface {p1}, LY0/c;->d()F

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-interface {p1}, LY0/c;->g()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lg1/a$a;->c:Lg1/a;

    .line 20
    .line 21
    iget-object v1, p0, Lg1/a$a;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v6, p0, Lg1/a$a;->b:Z

    .line 24
    .line 25
    move-object v2, p1

    .line 26
    invoke-static/range {v0 .. v7}, Lg1/a;->g(Lg1/a;Ljava/lang/String;LY0/c;Ljava/lang/Object;FZZZ)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    if-eqz v5, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lg1/a$a;->c:Lg1/a;

    .line 33
    .line 34
    iget-object v1, p0, Lg1/a$a;->a:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/NullPointerException;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-static {v0, v1, p1, v2, v3}, Lg1/a;->h(Lg1/a;Ljava/lang/String;LY0/c;Ljava/lang/Throwable;Z)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void
.end method

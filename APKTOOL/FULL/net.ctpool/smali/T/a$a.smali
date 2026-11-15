.class final LT/a$a;
.super LT/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:LU/n;


# direct methods
.method public constructor <init>(LU/n;)V
    .locals 1

    .line 1
    const-string v0, "mMeasurementManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LT/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LT/a$a;->b:LU/n;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic d(LT/a$a;)LU/n;
    .locals 0

    .line 1
    iget-object p0, p0, LT/a$a;->b:LU/n;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LX3/d;"
        }
    .end annotation

    .line 1
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v4, LT/a$a$b;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v4, p0, v0}, LT/a$a$b;-><init>(LT/a$a;Lm5/d;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v1, v0, v2, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public c(Landroid/net/Uri;)LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LX3/d;"
        }
    .end annotation

    .line 1
    const-string v0, "trigger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LT/a$a$d;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LT/a$a$d;-><init>(LT/a$a;Landroid/net/Uri;Lm5/d;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public e(LU/a;)LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/a;",
            ")",
            "LX3/d;"
        }
    .end annotation

    .line 1
    const-string v0, "deletionRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LT/a$a$a;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LT/a$a$a;-><init>(LT/a$a;LU/a;Lm5/d;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;)LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "LX3/d;"
        }
    .end annotation

    .line 1
    const-string v0, "attributionSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LT/a$a$c;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, p2, v0}, LT/a$a$c;-><init>(LT/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Lm5/d;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-static {p1, v0, p2, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public g(LU/o;)LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/o;",
            ")",
            "LX3/d;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LT/a$a$e;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LT/a$a$e;-><init>(LT/a$a;LU/o;Lm5/d;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public h(LU/p;)LX3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/p;",
            ")",
            "LX3/d;"
        }
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH5/W;->a()LH5/F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LH5/J;->a(Lm5/g;)LH5/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, LT/a$a$f;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, LT/a$a$f;-><init>(LT/a$a;LU/p;Lm5/d;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LH5/g;->b(LH5/I;Lm5/g;LH5/K;Lv5/p;ILjava/lang/Object;)LH5/P;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, v0, v1, v0}, LS/b;->c(LH5/P;Ljava/lang/Object;ILjava/lang/Object;)LX3/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

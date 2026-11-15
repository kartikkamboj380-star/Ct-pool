.class final LT5/c$a;
.super LT5/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final n:Li6/h;

.field private final o:LW5/d$d;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(LW5/d$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LT5/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LT5/c$a;->o:LW5/d$d;

    .line 10
    .line 11
    iput-object p2, p0, LT5/c$a;->p:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, LT5/c$a;->q:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, LW5/d$d;->b(I)Li6/C;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, LT5/c$a$a;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1, p1}, LT5/c$a$a;-><init>(LT5/c$a;Li6/C;Li6/C;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Li6/q;->d(Li6/C;)Li6/h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LT5/c$a;->n:Li6/h;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public e()J
    .locals 3

    .line 1
    iget-object v0, p0, LT5/c$a;->q:Ljava/lang/String;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LU5/c;->T(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    :cond_0
    return-wide v1
.end method

.method public f()LT5/x;
    .locals 2

    .line 1
    iget-object v0, p0, LT5/c$a;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LT5/x;->g:LT5/x$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LT5/x$a;->b(Ljava/lang/String;)LT5/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return-object v0
.end method

.method public j()Li6/h;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/c$a;->n:Li6/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LW5/d$d;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/c$a;->o:LW5/d$d;

    .line 2
    .line 3
    return-object v0
.end method

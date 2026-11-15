.class public Le1/b;
.super LF1/a;
.source "SourceFile"


# instance fields
.field private final a:LV0/b;

.field private final b:Lp1/i;


# direct methods
.method public constructor <init>(LV0/b;Lp1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LF1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le1/b;->a:LV0/b;

    .line 5
    .line 6
    iput-object p2, p0, Le1/b;->b:Lp1/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(LJ1/b;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 2

    .line 1
    iget-object p3, p0, Le1/b;->b:Lp1/i;

    .line 2
    .line 3
    iget-object v0, p0, Le1/b;->a:LV0/b;

    .line 4
    .line 5
    invoke-interface {v0}, LV0/b;->now()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p3, v0, v1}, Lp1/i;->p(J)V

    .line 10
    .line 11
    .line 12
    iget-object p3, p0, Le1/b;->b:Lp1/i;

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Lp1/i;->o(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lp1/i;->v(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 23
    .line 24
    invoke-virtual {p1, p4}, Lp1/i;->u(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public e(LJ1/b;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 2
    .line 3
    iget-object v1, p0, Le1/b;->a:LV0/b;

    .line 4
    .line 5
    invoke-interface {v1}, LV0/b;->now()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lp1/i;->p(J)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lp1/i;->o(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lp1/i;->v(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Lp1/i;->u(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public f(LJ1/b;Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 2
    .line 3
    iget-object v1, p0, Le1/b;->a:LV0/b;

    .line 4
    .line 5
    invoke-interface {v1}, LV0/b;->now()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lp1/i;->q(J)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lp1/i;->o(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lp1/i;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Lp1/i;->v(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Le1/b;->b:Lp1/i;

    .line 28
    .line 29
    invoke-virtual {p1, p4}, Lp1/i;->u(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 2
    .line 3
    iget-object v1, p0, Le1/b;->a:LV0/b;

    .line 4
    .line 5
    invoke-interface {v1}, LV0/b;->now()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lp1/i;->p(J)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Le1/b;->b:Lp1/i;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lp1/i;->v(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

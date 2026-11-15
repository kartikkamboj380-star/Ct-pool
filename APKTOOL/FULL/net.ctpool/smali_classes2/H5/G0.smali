.class final LH5/G0;
.super LH5/w0;
.source "SourceFile"


# instance fields
.field private final q:LH5/m;


# direct methods
.method public constructor <init>(LH5/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH5/w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH5/G0;->q:LH5/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH5/G0;->y(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LH5/w0;->z()LH5/x0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LH5/x0;->V()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, LH5/z;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LH5/G0;->q:LH5/m;

    .line 14
    .line 15
    sget-object v1, Li5/m;->m:Li5/m$a;

    .line 16
    .line 17
    check-cast p1, LH5/z;

    .line 18
    .line 19
    iget-object p1, p1, LH5/z;->a:Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-static {p1}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-static {p1}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, Lm5/d;->h(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v0, p0, LH5/G0;->q:LH5/m;

    .line 34
    .line 35
    sget-object v1, Li5/m;->m:Li5/m$a;

    .line 36
    .line 37
    invoke-static {p1}, LH5/y0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    return-void
.end method

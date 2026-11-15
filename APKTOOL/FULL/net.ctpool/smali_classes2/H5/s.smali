.class public final LH5/s;
.super LH5/s0;
.source "SourceFile"

# interfaces
.implements LH5/r;


# instance fields
.field public final q:LH5/t;


# direct methods
.method public constructor <init>(LH5/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH5/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH5/s;->q:LH5/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LH5/w0;->z()LH5/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LH5/x0;->H(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getParent()LH5/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LH5/w0;->z()LH5/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH5/s;->y(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LH5/s;->q:LH5/t;

    .line 2
    .line 3
    invoke-virtual {p0}, LH5/w0;->z()LH5/x0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, LH5/t;->n0(LH5/F0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

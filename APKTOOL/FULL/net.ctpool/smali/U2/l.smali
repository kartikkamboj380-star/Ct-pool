.class public abstract LU2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LS2/i;LS2/f;)V
    .locals 1

    .line 1
    instance-of v0, p0, LU2/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LU2/s;

    .line 6
    .line 7
    invoke-virtual {p0}, LU2/s;->d()LU2/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, LU2/p;->f(LS2/f;)LU2/p;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, LU2/u;->c()LU2/u;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, LU2/u;->e()Lb3/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p0, v0}, Lb3/r;->u(LU2/p;I)LV2/g;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "ForcedSender"

    .line 29
    .line 30
    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    .line 31
    .line 32
    invoke-static {p1, v0, p0}, LY2/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
.end method

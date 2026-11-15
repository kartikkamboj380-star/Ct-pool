.class public abstract LH5/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm5/g;)LH5/I;
    .locals 3

    .line 1
    new-instance v0, LM5/f;

    .line 2
    .line 3
    sget-object v1, LH5/q0;->b:LH5/q0$b;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1, v2}, LH5/u0;->b(LH5/q0;ILjava/lang/Object;)LH5/x;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p0, v1}, Lm5/g;->o(Lm5/g;)Lm5/g;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, LM5/f;-><init>(Lm5/g;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(LH5/I;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LH5/I;->i()Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LH5/u0;->e(Lm5/g;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.class public abstract Lw1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw1/x;Lw1/t;)Lw1/u;
    .locals 1

    .line 1
    invoke-interface {p1, p0}, Lw1/t;->e(Lw1/x;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw1/v$a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lw1/v$a;-><init>(Lw1/t;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lw1/u;

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, Lw1/u;-><init>(Lw1/x;Lw1/z;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

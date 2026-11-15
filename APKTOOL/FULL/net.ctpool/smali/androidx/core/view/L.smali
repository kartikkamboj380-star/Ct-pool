.class public abstract Landroidx/core/view/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/ViewGroup;)LE5/d;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/core/view/L$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroidx/core/view/L$a;-><init>(Landroid/view/ViewGroup;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final b(Landroid/view/ViewGroup;)Ljava/util/Iterator;
    .locals 1

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/core/view/L$b;

    invoke-direct {v0, p0}, Landroidx/core/view/L$b;-><init>(Landroid/view/ViewGroup;)V

    return-object v0
.end method

.class public abstract Ll0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/t$a;
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h(Landroid/content/Context;)Ll0/t;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/work/impl/E;->q(Landroid/content/Context;)Landroidx/work/impl/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/work/impl/E;->i(Landroid/content/Context;Landroidx/work/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ll0/l;
.end method

.method public abstract b(Ljava/lang/String;)Ll0/l;
.end method

.method public abstract c(Ljava/util/List;)Ll0/l;
.end method

.method public final d(Ll0/u;)Ll0/l;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ll0/t;->c(Ljava/util/List;)Ll0/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public abstract e(Ljava/lang/String;Ll0/c;Ll0/n;)Ll0/l;
.end method

.method public abstract f(Ljava/lang/String;Ll0/d;Ljava/util/List;)Ll0/l;
.end method

.method public g(Ljava/lang/String;Ll0/d;Ll0/k;)Ll0/l;
    .locals 0

    .line 1
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ll0/t;->f(Ljava/lang/String;Ll0/d;Ljava/util/List;)Ll0/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public abstract j()Ll0/l;
.end method

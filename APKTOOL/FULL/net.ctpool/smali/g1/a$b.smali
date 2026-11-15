.class Lg1/a$b;
.super Lg1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg1/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static f(Lg1/d;Lg1/d;)Lg1/a$b;
    .locals 1

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "AbstractDraweeController#createInternal"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lg1/a$b;

    .line 13
    .line 14
    invoke-direct {v0}, Lg1/a$b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg1/f;->b(Lg1/d;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lg1/f;->b(Lg1/d;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, LK1/b;->d()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {}, LK1/b;->b()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object v0
.end method

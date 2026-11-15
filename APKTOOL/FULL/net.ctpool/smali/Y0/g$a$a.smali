.class LY0/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LY0/g$a;


# direct methods
.method private constructor <init>(LY0/g$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY0/g$a$a;->a:LY0/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LY0/g$a;LY0/f;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LY0/g$a$a;-><init>(LY0/g$a;)V

    return-void
.end method


# virtual methods
.method public a(LY0/c;)V
    .locals 1

    .line 1
    invoke-interface {p1}, LY0/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY0/g$a$a;->a:LY0/g$a;

    .line 8
    .line 9
    invoke-static {v0, p1}, LY0/g$a;->y(LY0/g$a;LY0/c;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p1}, LY0/c;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LY0/g$a$a;->a:LY0/g$a;

    .line 20
    .line 21
    invoke-static {v0, p1}, LY0/g$a;->x(LY0/g$a;LY0/c;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public b(LY0/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY0/g$a$a;->a:LY0/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY0/a;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LY0/g$a$a;->a:LY0/g$a;

    .line 8
    .line 9
    invoke-interface {p1}, LY0/c;->d()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v1, p1}, LY0/a;->s(F)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public c(LY0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY0/g$a$a;->a:LY0/g$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, LY0/g$a;->x(LY0/g$a;LY0/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(LY0/c;)V
    .locals 0

    .line 1
    return-void
.end method

.class public final LY/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/d$a;
    }
.end annotation


# static fields
.field public static final d:LY/d$a;


# instance fields
.field private final a:LY/e;

.field private final b:LY/c;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY/d;->d:LY/d$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LY/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY/d;->a:LY/e;

    new-instance p1, LY/c;

    invoke-direct {p1}, LY/c;-><init>()V

    iput-object p1, p0, LY/d;->b:LY/c;

    return-void
.end method

.method public synthetic constructor <init>(LY/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LY/d;-><init>(LY/e;)V

    return-void
.end method

.method public static final a(LY/e;)LY/d;
    .locals 1

    .line 1
    sget-object v0, LY/d;->d:LY/d$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LY/d$a;->a(LY/e;)LY/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final b()LY/c;
    .locals 1

    .line 1
    iget-object v0, p0, LY/d;->b:LY/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LY/d;->a:LY/e;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/lifecycle/l;->getLifecycle()Landroidx/lifecycle/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "owner.lifecycle"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Landroidx/lifecycle/h$c;->n:Landroidx/lifecycle/h$c;

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    new-instance v1, Landroidx/savedstate/Recreator;

    .line 21
    .line 22
    iget-object v2, p0, LY/d;->a:LY/e;

    .line 23
    .line 24
    invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(LY/e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->a(Landroidx/lifecycle/k;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LY/d;->b:LY/c;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LY/c;->e(Landroidx/lifecycle/h;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, LY/d;->c:Z

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LY/d;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LY/d;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LY/d;->a:LY/e;

    .line 9
    .line 10
    invoke-interface {v0}, Landroidx/lifecycle/l;->getLifecycle()Landroidx/lifecycle/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "owner.lifecycle"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Landroidx/lifecycle/h$c;->p:Landroidx/lifecycle/h$c;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/lifecycle/h$c;->e(Landroidx/lifecycle/h$c;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    xor-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, LY/d;->b:LY/c;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, LY/c;->f(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, "performRestore cannot be called when owner is "

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "outBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY/d;->b:LY/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LY/c;->g(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

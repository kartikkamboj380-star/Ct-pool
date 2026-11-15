.class Lh4/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/q;->Z(Lz3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz3/l;

.field final synthetic b:Lh4/q;


# direct methods
.method constructor <init>(Lh4/q;Lz3/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh4/q$d;->b:Lh4/q;

    .line 2
    .line 3
    iput-object p2, p0, Lh4/q$d;->a:Lz3/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lz3/l;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "Deleting cached crash reports..."

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Le4/g;->i(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lh4/q$d;->b:Lh4/q;

    .line 17
    .line 18
    invoke-virtual {p1}, Lh4/q;->N()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lh4/q;->m(Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lh4/q$d;->b:Lh4/q;

    .line 26
    .line 27
    invoke-static {p1}, Lh4/q;->g(Lh4/q;)Lh4/c0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lh4/c0;->y()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lh4/q$d;->b:Lh4/q;

    .line 35
    .line 36
    iget-object p1, p1, Lh4/q;->r:Lz3/m;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Lz3/m;->e(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lz3/o;->f(Ljava/lang/Object;)Lz3/l;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_0
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "Sending cached crash reports..."

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Le4/g;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object v0, p0, Lh4/q$d;->b:Lh4/q;

    .line 61
    .line 62
    invoke-static {v0}, Lh4/q;->j(Lh4/q;)Lh4/G;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, p1}, Lh4/G;->c(Z)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lh4/q$d;->a:Lz3/l;

    .line 70
    .line 71
    iget-object v0, p0, Lh4/q$d;->b:Lh4/q;

    .line 72
    .line 73
    invoke-static {v0}, Lh4/q;->k(Lh4/q;)Li4/f;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, Li4/f;->a:Li4/e;

    .line 78
    .line 79
    new-instance v1, Lh4/q$d$a;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lh4/q$d$a;-><init>(Lh4/q$d;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Lz3/l;->q(Ljava/util/concurrent/Executor;Lz3/k;)Lz3/l;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lz3/l;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh4/q$d;->a(Ljava/lang/Boolean;)Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

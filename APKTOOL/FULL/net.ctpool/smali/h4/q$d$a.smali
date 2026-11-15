.class Lh4/q$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/q$d;->a(Ljava/lang/Boolean;)Lz3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh4/q$d;


# direct methods
.method constructor <init>(Lh4/q$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh4/q$d$a;->a:Lh4/q$d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lp4/d;)Lz3/l;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Le4/g;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Lz3/o;->f(Ljava/lang/Object;)Lz3/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lh4/q$d$a;->a:Lh4/q$d;

    .line 19
    .line 20
    iget-object p1, p1, Lh4/q$d;->b:Lh4/q;

    .line 21
    .line 22
    invoke-static {p1}, Lh4/q;->l(Lh4/q;)Lz3/l;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lh4/q$d$a;->a:Lh4/q$d;

    .line 26
    .line 27
    iget-object p1, p1, Lh4/q$d;->b:Lh4/q;

    .line 28
    .line 29
    invoke-static {p1}, Lh4/q;->g(Lh4/q;)Lh4/c0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lh4/q$d$a;->a:Lh4/q$d;

    .line 34
    .line 35
    iget-object v1, v1, Lh4/q$d;->b:Lh4/q;

    .line 36
    .line 37
    invoke-static {v1}, Lh4/q;->k(Lh4/q;)Li4/f;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, Li4/f;->a:Li4/e;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lh4/c0;->z(Ljava/util/concurrent/Executor;)Lz3/l;

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lh4/q$d$a;->a:Lh4/q$d;

    .line 47
    .line 48
    iget-object p1, p1, Lh4/q$d;->b:Lh4/q;

    .line 49
    .line 50
    iget-object p1, p1, Lh4/q;->r:Lz3/m;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lz3/m;->e(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lz3/l;
    .locals 0

    .line 1
    check-cast p1, Lp4/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh4/q$d$a;->a(Lp4/d;)Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

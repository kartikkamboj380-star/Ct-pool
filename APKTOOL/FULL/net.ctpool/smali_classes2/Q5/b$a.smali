.class final LQ5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH5/l;
.implements LH5/P0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final m:LH5/m;

.field public final n:Ljava/lang/Object;

.field final synthetic o:LQ5/b;


# direct methods
.method public constructor <init>(LQ5/b;LH5/m;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ5/b$a;->o:LQ5/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LQ5/b$a;->m:LH5/m;

    .line 7
    .line 8
    iput-object p3, p0, LQ5/b$a;->n:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lm5/g;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LH5/m;->a()Lm5/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(LM5/C;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LH5/m;->b(LM5/C;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lv5/l;)V
    .locals 0

    .line 1
    check-cast p1, Li5/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQ5/b$a;->d(Li5/u;Lv5/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Li5/u;Lv5/l;)V
    .locals 2

    .line 1
    invoke-static {}, LQ5/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, LQ5/b$a;->o:LQ5/b;

    .line 6
    .line 7
    iget-object v1, p0, LQ5/b$a;->n:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, LQ5/b$a;->m:LH5/m;

    .line 13
    .line 14
    new-instance v0, LQ5/b$a$a;

    .line 15
    .line 16
    iget-object v1, p0, LQ5/b$a;->o:LQ5/b;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, LQ5/b$a$a;-><init>(LQ5/b;LQ5/b$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v0}, LH5/m;->c(Ljava/lang/Object;Lv5/l;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public e(Li5/u;Ljava/lang/Object;Lv5/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, LQ5/b$a;->o:LQ5/b;

    .line 2
    .line 3
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 4
    .line 5
    new-instance v1, LQ5/b$a$b;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, LQ5/b$a$b;-><init>(LQ5/b;LQ5/b$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, LH5/m;->q(Ljava/lang/Object;Ljava/lang/Object;Lv5/l;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, LQ5/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, LQ5/b$a;->o:LQ5/b;

    .line 21
    .line 22
    iget-object v0, p0, LQ5/b$a;->n:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH5/m;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Lv5/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH5/m;->k(Lv5/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH5/m;->p(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;Ljava/lang/Object;Lv5/l;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li5/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LQ5/b$a;->e(Li5/u;Ljava/lang/Object;Lv5/l;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b$a;->m:LH5/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH5/m;->r(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

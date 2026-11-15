.class public Lc1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/o;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ly1/k;

.field private final c:Lc1/g;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc1/b;)V
    .locals 1

    .line 1
    invoke-static {}, Ly1/o;->n()Ly1/o;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lc1/f;-><init>(Landroid/content/Context;Ly1/o;Lc1/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly1/o;Lc1/b;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lc1/f;-><init>(Landroid/content/Context;Ly1/o;Ljava/util/Set;Ljava/util/Set;Lc1/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly1/o;Ljava/util/Set;Ljava/util/Set;Lc1/b;)V
    .locals 8

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/f;->a:Landroid/content/Context;

    invoke-virtual {p2}, Ly1/o;->l()Ly1/k;

    move-result-object p5

    iput-object p5, p0, Lc1/f;->b:Ly1/k;

    new-instance v0, Lc1/g;

    invoke-direct {v0}, Lc1/g;-><init>()V

    iput-object v0, p0, Lc1/f;->c:Lc1/g;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lf1/a;->b()Lf1/a;

    move-result-object v2

    invoke-virtual {p2, p1}, Ly1/o;->b(Landroid/content/Context;)LC1/a;

    move-result-object v3

    invoke-static {}, LM0/f;->g()LM0/f;

    move-result-object v4

    invoke-virtual {p5}, Ly1/k;->m()Lw1/x;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lc1/g;->a(Landroid/content/res/Resources;Lf1/a;LC1/a;Ljava/util/concurrent/Executor;Lw1/x;LO0/f;LO0/o;)V

    iput-object p3, p0, Lc1/f;->d:Ljava/util/Set;

    iput-object p4, p0, Lc1/f;->e:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Lc1/e;
    .locals 7

    .line 1
    new-instance v6, Lc1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lc1/f;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lc1/f;->c:Lc1/g;

    .line 6
    .line 7
    iget-object v3, p0, Lc1/f;->b:Ly1/k;

    .line 8
    .line 9
    iget-object v4, p0, Lc1/f;->d:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v5, p0, Lc1/f;->e:Ljava/util/Set;

    .line 12
    .line 13
    move-object v0, v6

    .line 14
    invoke-direct/range {v0 .. v5}, Lc1/e;-><init>(Landroid/content/Context;Lc1/g;Ly1/k;Ljava/util/Set;Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {v6, v0}, Lc1/e;->K(Lp1/g;)Lc1/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc1/f;->a()Lc1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

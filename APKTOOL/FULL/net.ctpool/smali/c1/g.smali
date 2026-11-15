.class public Lc1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/res/Resources;

.field private b:Lf1/a;

.field private c:LC1/a;

.field private d:Ljava/util/concurrent/Executor;

.field private e:Lw1/x;

.field private f:LO0/f;

.field private g:LO0/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Resources;Lf1/a;LC1/a;Ljava/util/concurrent/Executor;Lw1/x;LO0/f;LO0/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc1/g;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    iput-object p2, p0, Lc1/g;->b:Lf1/a;

    .line 4
    .line 5
    iput-object p3, p0, Lc1/g;->c:LC1/a;

    .line 6
    .line 7
    iput-object p4, p0, Lc1/g;->d:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iput-object p5, p0, Lc1/g;->e:Lw1/x;

    .line 10
    .line 11
    iput-object p6, p0, Lc1/g;->f:LO0/f;

    .line 12
    .line 13
    iput-object p7, p0, Lc1/g;->g:LO0/o;

    .line 14
    .line 15
    return-void
.end method

.method protected b(Landroid/content/res/Resources;Lf1/a;LC1/a;Ljava/util/concurrent/Executor;Lw1/x;LO0/f;)Lc1/d;
    .locals 8

    .line 1
    new-instance v7, Lc1/d;

    .line 2
    .line 3
    move-object v0, v7

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    move-object v5, p5

    .line 9
    move-object v6, p6

    .line 10
    invoke-direct/range {v0 .. v6}, Lc1/d;-><init>(Landroid/content/res/Resources;Lf1/a;LC1/a;Ljava/util/concurrent/Executor;Lw1/x;LO0/f;)V

    .line 11
    .line 12
    .line 13
    return-object v7
.end method

.method public c()Lc1/d;
    .locals 7

    .line 1
    iget-object v1, p0, Lc1/g;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    iget-object v2, p0, Lc1/g;->b:Lf1/a;

    .line 4
    .line 5
    iget-object v3, p0, Lc1/g;->c:LC1/a;

    .line 6
    .line 7
    iget-object v4, p0, Lc1/g;->d:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object v5, p0, Lc1/g;->e:Lw1/x;

    .line 10
    .line 11
    iget-object v6, p0, Lc1/g;->f:LO0/f;

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    invoke-virtual/range {v0 .. v6}, Lc1/g;->b(Landroid/content/res/Resources;Lf1/a;LC1/a;Ljava/util/concurrent/Executor;Lw1/x;LO0/f;)Lc1/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lc1/g;->g:LO0/o;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, LO0/o;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Lc1/d;->z0(Z)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v0
.end method

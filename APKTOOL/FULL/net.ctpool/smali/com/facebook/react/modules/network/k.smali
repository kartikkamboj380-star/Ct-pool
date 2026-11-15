.class public Lcom/facebook/react/modules/network/k;
.super LT5/E;
.source "SourceFile"


# instance fields
.field private final n:LT5/E;

.field private final o:Lcom/facebook/react/modules/network/i;

.field private p:Li6/h;

.field private q:J


# direct methods
.method public constructor <init>(LT5/E;Lcom/facebook/react/modules/network/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LT5/E;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/network/k;->n:LT5/E;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/network/k;->o:Lcom/facebook/react/modules/network/i;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/react/modules/network/k;->q:J

    .line 11
    .line 12
    return-void
.end method

.method private B(Li6/C;)Li6/C;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/modules/network/k$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/network/k$a;-><init>(Lcom/facebook/react/modules/network/k;Li6/C;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static bridge synthetic n(Lcom/facebook/react/modules/network/k;)Lcom/facebook/react/modules/network/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/k;->o:Lcom/facebook/react/modules/network/i;

    return-object p0
.end method

.method static bridge synthetic o(Lcom/facebook/react/modules/network/k;)LT5/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/k;->n:LT5/E;

    return-object p0
.end method

.method static bridge synthetic w(Lcom/facebook/react/modules/network/k;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/k;->q:J

    return-wide v0
.end method

.method static bridge synthetic z(Lcom/facebook/react/modules/network/k;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/modules/network/k;->q:J

    return-void
.end method


# virtual methods
.method public J()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/k;->q:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/k;->n:LT5/E;

    invoke-virtual {v0}, LT5/E;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()LT5/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/k;->n:LT5/E;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/E;->f()LT5/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()Li6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/k;->p:Li6/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/modules/network/k;->n:LT5/E;

    .line 6
    .line 7
    invoke-virtual {v0}, LT5/E;->j()Li6/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lcom/facebook/react/modules/network/k;->B(Li6/C;)Li6/C;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Li6/q;->d(Li6/C;)Li6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/facebook/react/modules/network/k;->p:Li6/h;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/k;->p:Li6/h;

    .line 22
    .line 23
    return-object v0
.end method

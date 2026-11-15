.class Lcom/facebook/react/modules/network/j;
.super LT5/C;
.source "SourceFile"


# instance fields
.field private final b:LT5/C;

.field private final c:Lcom/facebook/react/modules/network/i;

.field private d:J


# direct methods
.method public constructor <init>(LT5/C;Lcom/facebook/react/modules/network/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LT5/C;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/facebook/react/modules/network/j;->d:J

    .line 7
    .line 8
    iput-object p1, p0, Lcom/facebook/react/modules/network/j;->b:LT5/C;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/facebook/react/modules/network/j;->c:Lcom/facebook/react/modules/network/i;

    .line 11
    .line 12
    return-void
.end method

.method static bridge synthetic i(Lcom/facebook/react/modules/network/j;)Lcom/facebook/react/modules/network/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/j;->c:Lcom/facebook/react/modules/network/i;

    return-object p0
.end method

.method private j(Li6/g;)Li6/A;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/modules/network/j$a;

    .line 2
    .line 3
    invoke-interface {p1}, Li6/g;->Z0()Ljava/io/OutputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/network/j$a;-><init>(Lcom/facebook/react/modules/network/j;Ljava/io/OutputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Li6/q;->h(Ljava/io/OutputStream;)Li6/A;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/j;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/network/j;->b:LT5/C;

    invoke-virtual {v0}, LT5/C;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/modules/network/j;->d:J

    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/network/j;->d:J

    return-wide v0
.end method

.method public b()LT5/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/j;->b:LT5/C;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/C;->b()LT5/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h(Li6/g;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/j;->j(Li6/g;)Li6/A;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Li6/q;->c(Li6/A;)Li6/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/modules/network/j;->a()J

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/modules/network/j;->b:LT5/C;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LT5/C;->h(Li6/g;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Li6/g;->flush()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.class Lcom/facebook/react/modules/network/n$a;
.super LT5/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/n;->c(LT5/x;Ljava/io/InputStream;)LT5/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LT5/x;

.field final synthetic c:Ljava/io/InputStream;


# direct methods
.method constructor <init>(LT5/x;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/n$a;->b:LT5/x;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/n$a;->c:Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-direct {p0}, LT5/C;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/n$a;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public b()LT5/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/n$a;->b:LT5/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Li6/g;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/network/n$a;->c:Ljava/io/InputStream;

    .line 3
    .line 4
    invoke-static {v1}, Li6/q;->l(Ljava/io/InputStream;)Li6/C;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p1, v0}, Li6/g;->x(Li6/C;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/modules/network/n;->a(Li6/C;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {v0}, Lcom/facebook/react/modules/network/n;->a(Li6/C;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

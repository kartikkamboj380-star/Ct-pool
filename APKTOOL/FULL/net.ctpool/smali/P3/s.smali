.class abstract LP3/s;
.super LQ3/l;
.source "SourceFile"


# instance fields
.field final a:LQ3/p;

.field final b:Lz3/m;

.field final synthetic c:LP3/u;


# direct methods
.method constructor <init>(LP3/u;LQ3/p;Lz3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP3/s;->c:LP3/u;

    .line 2
    .line 3
    invoke-direct {p0}, LQ3/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LP3/s;->a:LQ3/p;

    .line 7
    .line 8
    iput-object p3, p0, LP3/s;->b:Lz3/m;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public I(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, LP3/s;->c:LP3/u;

    .line 2
    .line 3
    iget-object p1, p1, LP3/u;->a:LQ3/A;

    .line 4
    .line 5
    iget-object v0, p0, LP3/s;->b:Lz3/m;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LQ3/A;->u(Lz3/m;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LP3/s;->a:LQ3/p;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "onRequestInfo"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public O(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, LP3/s;->c:LP3/u;

    .line 2
    .line 3
    iget-object p1, p1, LP3/u;->a:LQ3/A;

    .line 4
    .line 5
    iget-object v0, p0, LP3/s;->b:Lz3/m;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LQ3/A;->u(Lz3/m;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LP3/s;->a:LQ3/p;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "onCompleteUpdate"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

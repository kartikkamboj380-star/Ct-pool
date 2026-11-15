.class final LQ3/x;
.super LQ3/q;
.source "SourceFile"


# instance fields
.field final synthetic n:LQ3/z;


# direct methods
.method constructor <init>(LQ3/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/x;->n:LQ3/z;

    .line 2
    .line 3
    invoke-direct {p0}, LQ3/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/x;->n:LQ3/z;

    .line 2
    .line 3
    iget-object v0, v0, LQ3/z;->a:LQ3/A;

    .line 4
    .line 5
    invoke-static {v0}, LQ3/A;->r(LQ3/A;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LQ3/x;->n:LQ3/z;

    .line 9
    .line 10
    iget-object v0, v0, LQ3/z;->a:LQ3/A;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v0, v1}, LQ3/A;->m(LQ3/A;Landroid/os/IInterface;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LQ3/x;->n:LQ3/z;

    .line 17
    .line 18
    iget-object v0, v0, LQ3/z;->a:LQ3/A;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1}, LQ3/A;->l(LQ3/A;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

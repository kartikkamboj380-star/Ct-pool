.class LU4/m$o;
.super LR4/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LR4/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY4/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU4/m$o;->e(LY4/a;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(LY4/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/net/InetAddress;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LU4/m$o;->f(LY4/c;Ljava/net/InetAddress;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LY4/a;)Ljava/net/InetAddress;
    .locals 2

    .line 1
    invoke-virtual {p1}, LY4/a;->R0()LY4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LY4/b;->u:LY4/b;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LY4/a;->B0()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p1}, LY4/a;->H0()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public f(LY4/c;Ljava/net/InetAddress;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :goto_0
    invoke-virtual {p1, p2}, LY4/c;->f1(Ljava/lang/String;)LY4/c;

    .line 10
    .line 11
    .line 12
    return-void
.end method

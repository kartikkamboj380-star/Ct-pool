.class public final LT5/C$a$a;
.super LT5/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/C$a;->d(Li6/i;LT5/x;)LT5/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Li6/i;

.field final synthetic c:LT5/x;


# direct methods
.method constructor <init>(Li6/i;LT5/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/C$a$a;->b:Li6/i;

    .line 2
    .line 3
    iput-object p2, p0, LT5/C$a$a;->c:LT5/x;

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
    iget-object v0, p0, LT5/C$a$a;->b:Li6/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Li6/i;->C()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public b()LT5/x;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/C$a$a;->c:LT5/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Li6/g;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT5/C$a$a;->b:Li6/i;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Li6/g;->H(Li6/i;)Li6/g;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.class LR4/q$a;
.super LR4/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR4/q;->a()LR4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LR4/q;


# direct methods
.method constructor <init>(LR4/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/q$a;->a:LR4/q;

    .line 2
    .line 3
    invoke-direct {p0}, LR4/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(LY4/a;)Ljava/lang/Object;
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
    iget-object v0, p0, LR4/q$a;->a:LR4/q;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LR4/q;->b(LY4/a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public d(LY4/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LY4/c;->J()LY4/c;

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, LR4/q$a;->a:LR4/q;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void
.end method

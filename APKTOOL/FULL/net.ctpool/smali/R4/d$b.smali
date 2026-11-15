.class LR4/d$b;
.super LR4/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR4/d;->f(Z)LR4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LR4/d;


# direct methods
.method constructor <init>(LR4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/d$b;->a:LR4/d;

    .line 2
    .line 3
    invoke-direct {p0}, LR4/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY4/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LR4/d$b;->e(LY4/a;)Ljava/lang/Float;

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
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LR4/d$b;->f(LY4/c;Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LY4/a;)Ljava/lang/Float;
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
    invoke-virtual {p1}, LY4/a;->W()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    double-to-float p1, v0

    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public f(LY4/c;Ljava/lang/Number;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LY4/c;->J()LY4/c;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    float-to-double v1, v0

    .line 12
    invoke-static {v1, v2}, LR4/d;->d(D)V

    .line 13
    .line 14
    .line 15
    instance-of v1, p2, Ljava/lang/Float;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :goto_0
    invoke-virtual {p1, p2}, LY4/c;->b1(Ljava/lang/Number;)LY4/c;

    .line 25
    .line 26
    .line 27
    return-void
.end method

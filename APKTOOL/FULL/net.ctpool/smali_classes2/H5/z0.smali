.class final LH5/z0;
.super LH5/Q;
.source "SourceFile"


# instance fields
.field private final p:Lm5/d;


# direct methods
.method public constructor <init>(Lm5/g;Lv5/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LH5/Q;-><init>(Lm5/g;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0, p0}, Ln5/b;->a(Lv5/p;Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LH5/z0;->p:Lm5/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected q0()V
    .locals 1

    .line 1
    iget-object v0, p0, LH5/z0;->p:Lm5/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, LN5/a;->b(Lm5/d;Lm5/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

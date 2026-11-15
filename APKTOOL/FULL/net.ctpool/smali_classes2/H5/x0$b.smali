.class final LH5/x0$b;
.super LH5/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH5/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final q:LH5/x0;

.field private final r:LH5/x0$c;

.field private final s:LH5/s;

.field private final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LH5/x0;LH5/x0$c;LH5/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH5/w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH5/x0$b;->q:LH5/x0;

    .line 5
    .line 6
    iput-object p2, p0, LH5/x0$b;->r:LH5/x0$c;

    .line 7
    .line 8
    iput-object p3, p0, LH5/x0$b;->s:LH5/s;

    .line 9
    .line 10
    iput-object p4, p0, LH5/x0$b;->t:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH5/x0$b;->y(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, LH5/x0$b;->q:LH5/x0;

    .line 2
    .line 3
    iget-object v0, p0, LH5/x0$b;->r:LH5/x0$c;

    .line 4
    .line 5
    iget-object v1, p0, LH5/x0$b;->s:LH5/s;

    .line 6
    .line 7
    iget-object v2, p0, LH5/x0$b;->t:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, LH5/x0;->s(LH5/x0;LH5/x0$c;LH5/s;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

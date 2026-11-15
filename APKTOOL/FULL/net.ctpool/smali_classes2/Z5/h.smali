.class public final LZ5/h;
.super LT5/E;
.source "SourceFile"


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:J

.field private final p:Li6/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLi6/h;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LT5/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LZ5/h;->n:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, LZ5/h;->o:J

    .line 12
    .line 13
    iput-object p4, p0, LZ5/h;->p:Li6/h;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, LZ5/h;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public f()LT5/x;
    .locals 2

    .line 1
    iget-object v0, p0, LZ5/h;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LT5/x;->g:LT5/x$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LT5/x$a;->b(Ljava/lang/String;)LT5/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return-object v0
.end method

.method public j()Li6/h;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/h;->p:Li6/h;

    .line 2
    .line 3
    return-object v0
.end method

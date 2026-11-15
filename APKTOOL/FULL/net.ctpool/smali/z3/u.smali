.class final Lz3/u;
.super Lz3/a;
.source "SourceFile"


# instance fields
.field private final a:Lz3/O;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz3/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz3/O;

    .line 5
    .line 6
    invoke-direct {v0}, Lz3/O;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz3/u;->a:Lz3/O;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lz3/i;)Lz3/a;
    .locals 2

    .line 1
    new-instance v0, Lz3/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lz3/p;-><init>(Lz3/u;Lz3/i;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz3/u;->a:Lz3/O;

    .line 7
    .line 8
    sget-object v1, Lz3/n;->a:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, Lz3/O;->f(Ljava/util/concurrent/Executor;Lz3/h;)Lz3/l;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz3/u;->a:Lz3/O;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lz3/O;->w(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

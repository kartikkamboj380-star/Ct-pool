.class public Lz3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz3/O;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz3/O;

    invoke-direct {v0}, Lz3/O;-><init>()V

    iput-object v0, p0, Lz3/m;->a:Lz3/O;

    return-void
.end method

.method public constructor <init>(Lz3/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz3/O;

    invoke-direct {v0}, Lz3/O;-><init>()V

    iput-object v0, p0, Lz3/m;->a:Lz3/O;

    new-instance v0, Lz3/L;

    invoke-direct {v0, p0}, Lz3/L;-><init>(Lz3/m;)V

    invoke-virtual {p1, v0}, Lz3/a;->a(Lz3/i;)Lz3/a;

    return-void
.end method

.method static bridge synthetic f(Lz3/m;)Lz3/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Lz3/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->s(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->t(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->v(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/m;->a:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->w(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

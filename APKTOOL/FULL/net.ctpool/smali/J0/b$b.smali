.class LJ0/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ0/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LH0/b;

.field private c:J

.field private d:J


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LJ0/b$b;->a:Ljava/lang/String;

    invoke-static {p2}, LH0/b;->b(Ljava/io/File;)LH0/b;

    move-result-object p1

    iput-object p1, p0, LJ0/b$b;->b:LH0/b;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LJ0/b$b;->c:J

    iput-wide p1, p0, LJ0/b$b;->d:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/io/File;LJ0/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LJ0/b$b;-><init>(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-wide v0, p0, LJ0/b$b;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LJ0/b$b;->b:LH0/b;

    .line 10
    .line 11
    invoke-virtual {v0}, LH0/b;->d()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, LJ0/b$b;->d:J

    .line 20
    .line 21
    :cond_0
    iget-wide v0, p0, LJ0/b$b;->d:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public b()LH0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/b$b;->b:LH0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/b$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()J
    .locals 4

    .line 1
    iget-wide v0, p0, LJ0/b$b;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LJ0/b$b;->b:LH0/b;

    .line 10
    .line 11
    invoke-virtual {v0}, LH0/b;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, LJ0/b$b;->c:J

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, LJ0/b$b;->c:J

    .line 18
    .line 19
    return-wide v0
.end method

.class final LP2/b$b;
.super LP2/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP2/b$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LP2/b$b;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)LP2/b$a;
    .locals 0

    .line 1
    const-string p2, "key"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "value"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public c()V
    .locals 2

    .line 1
    iget-wide v0, p0, LP2/b$b;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LP2/a;->g(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

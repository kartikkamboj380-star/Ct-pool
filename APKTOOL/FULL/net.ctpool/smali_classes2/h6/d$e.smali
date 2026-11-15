.class final Lh6/d$e;
.super LX5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lh6/d;


# direct methods
.method public constructor <init>(Lh6/d;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lh6/d$e;->e:Lh6/d;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lh6/d;->j(Lh6/d;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " writer"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x2

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {p0, p1, v2, v0, v1}, LX5/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lh6/d$e;->e:Lh6/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh6/d;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    iget-object v1, p0, Lh6/d$e;->e:Lh6/d;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v0, v2}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-wide/16 v0, -0x1

    .line 20
    .line 21
    return-wide v0
.end method

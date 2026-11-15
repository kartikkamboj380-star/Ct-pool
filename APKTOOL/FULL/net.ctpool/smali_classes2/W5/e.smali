.class public LW5/e;
.super Li6/k;
.source "SourceFile"


# instance fields
.field private n:Z

.field private final o:Lv5/l;


# direct methods
.method public constructor <init>(Li6/A;Lv5/l;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onException"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Li6/k;-><init>(Li6/A;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LW5/e;->o:Lv5/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LW5/e;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Li6/k;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, LW5/e;->n:Z

    .line 13
    .line 14
    iget-object v1, p0, LW5/e;->o:Lv5/l;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public flush()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LW5/e;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Li6/k;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, LW5/e;->n:Z

    .line 13
    .line 14
    iget-object v1, p0, LW5/e;->o:Lv5/l;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public w0(Li6/f;J)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LW5/e;->n:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Li6/f;->y0(J)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Li6/k;->w0(Li6/f;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, LW5/e;->n:Z

    .line 21
    .line 22
    iget-object p2, p0, LW5/e;->o:Lv5/l;

    .line 23
    .line 24
    invoke-interface {p2, p1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

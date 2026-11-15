.class public final LG1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/i;


# instance fields
.field private final a:Lcom/facebook/imagepipeline/memory/e;

.field private final b:LR0/l;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/memory/e;LR0/l;)V
    .locals 1

    .line 1
    const-string v0, "pool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pooledByteStreams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 15
    .line 16
    iput-object p2, p0, LG1/z;->b:LR0/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic a()LR0/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LG1/z;->j()Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic b([B)LR0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG1/z;->i([B)LG1/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Ljava/io/InputStream;)LR0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG1/z;->g(Ljava/io/InputStream;)LG1/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(Ljava/io/InputStream;I)LR0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LG1/z;->h(Ljava/io/InputStream;I)LG1/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e(I)LR0/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LG1/z;->k(I)Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/f;)LG1/y;
    .locals 1

    .line 1
    const-string v0, "inputStream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outputStream"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LG1/z;->b:LR0/l;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, LR0/l;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/memory/f;->e()LG1/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public g(Ljava/io/InputStream;)LG1/y;
    .locals 5

    .line 1
    const-string v0, "inputStream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/imagepipeline/memory/f;

    .line 7
    .line 8
    iget-object v1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {v0, v1, v4, v2, v3}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0, p1, v0}, LG1/z;->f(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/f;)LG1/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public h(Ljava/io/InputStream;I)LG1/y;
    .locals 2

    .line 1
    const-string v0, "inputStream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/imagepipeline/memory/f;

    .line 7
    .line 8
    iget-object v1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 9
    .line 10
    invoke-direct {v0, v1, p2}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;I)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0, p1, v0}, LG1/z;->f(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/f;)LG1/y;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public i([B)LG1/y;
    .locals 3

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/imagepipeline/memory/f;

    .line 7
    .line 8
    iget-object v1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 9
    .line 10
    array-length v2, p1

    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;I)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    array-length v1, p1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, p1, v2, v1}, Lcom/facebook/imagepipeline/memory/f;->write([BII)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->e()LG1/y;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    :try_start_1
    invoke-static {p1}, LO0/q;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "propagate(ioe)"

    .line 35
    .line 36
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/memory/f;->close()V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public j()Lcom/facebook/imagepipeline/memory/f;
    .locals 5

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    iget-object v1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-direct {v0, v1, v4, v2, v3}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public k(I)Lcom/facebook/imagepipeline/memory/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    iget-object v1, p0, LG1/z;->a:Lcom/facebook/imagepipeline/memory/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

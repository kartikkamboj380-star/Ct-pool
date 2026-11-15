.class final Lz4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/e;


# static fields
.field private static final f:Ljava/nio/charset/Charset;

.field private static final g:Lw4/c;

.field private static final h:Lw4/c;

.field private static final i:Lw4/d;


# instance fields
.field private a:Ljava/io/OutputStream;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Lw4/d;

.field private final e:Lz4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lz4/f;->f:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    const-string v0, "key"

    .line 10
    .line 11
    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Lz4/a;->b()Lz4/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lz4/f;->g:Lw4/c;

    .line 37
    .line 38
    const-string v0, "value"

    .line 39
    .line 40
    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {}, Lz4/a;->b()Lz4/a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lz4/f;->h:Lw4/c;

    .line 66
    .line 67
    new-instance v0, Lz4/e;

    .line 68
    .line 69
    invoke-direct {v0}, Lz4/e;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lz4/f;->i:Lw4/d;

    .line 73
    .line 74
    return-void
.end method

.method constructor <init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lw4/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz4/i;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lz4/i;-><init>(Lz4/f;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz4/f;->e:Lz4/i;

    .line 10
    .line 11
    iput-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 12
    .line 13
    iput-object p2, p0, Lz4/f;->b:Ljava/util/Map;

    .line 14
    .line 15
    iput-object p3, p0, Lz4/f;->c:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p4, p0, Lz4/f;->d:Lw4/d;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic f(Ljava/util/Map$Entry;Lw4/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz4/f;->w(Ljava/util/Map$Entry;Lw4/e;)V

    return-void
.end method

.method private static p(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private q(Lw4/d;Ljava/lang/Object;)J
    .locals 2

    .line 1
    new-instance v0, Lz4/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lz4/b;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 7
    .line 8
    iput-object v0, p0, Lz4/f;->a:Ljava/io/OutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    :try_start_1
    invoke-interface {p1, p2, p0}, Lw4/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_2
    iput-object v1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz4/b;->a()J

    .line 16
    .line 17
    .line 18
    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 20
    .line 21
    .line 22
    return-wide p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_0

    .line 25
    :catchall_1
    move-exception p1

    .line 26
    :try_start_3
    iput-object v1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 27
    .line 28
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 29
    :goto_0
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_2
    move-exception p2

    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    throw p1
.end method

.method private r(Lw4/d;Lw4/c;Ljava/lang/Object;Z)Lz4/f;
    .locals 4

    .line 1
    invoke-direct {p0, p1, p3}, Lz4/f;->q(Lw4/d;Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p4, v0, v2

    .line 10
    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p2}, Lz4/f;->v(Lw4/c;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    shl-int/lit8 p2, p2, 0x3

    .line 19
    .line 20
    or-int/lit8 p2, p2, 0x2

    .line 21
    .line 22
    invoke-direct {p0, p2}, Lz4/f;->x(I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Lz4/f;->y(J)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p3, p0}, Lw4/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method private s(Lw4/f;Lw4/c;Ljava/lang/Object;Z)Lz4/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/f;->e:Lz4/i;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p4}, Lz4/i;->b(Lw4/c;Z)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lz4/f;->e:Lz4/i;

    .line 7
    .line 8
    invoke-interface {p1, p3, p2}, Lw4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method private static u(Lw4/c;)Lz4/d;
    .locals 1

    .line 1
    const-class v0, Lz4/d;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lw4/c;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz4/d;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lw4/b;

    .line 13
    .line 14
    const-string v0, "Field has no @Protobuf config"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lw4/b;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private static v(Lw4/c;)I
    .locals 1

    .line 1
    const-class v0, Lz4/d;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lw4/c;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz4/d;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lz4/d;->tag()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    new-instance p0, Lw4/b;

    .line 17
    .line 18
    const-string v0, "Field has no @Protobuf config"

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lw4/b;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method private static synthetic w(Ljava/util/Map$Entry;Lw4/e;)V
    .locals 2

    .line 1
    sget-object v0, Lz4/f;->g:Lw4/c;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1, v0, v1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lz4/f;->h:Lw4/c;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p1, v0, p0}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private x(I)V
    .locals 4

    .line 1
    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 11
    .line 12
    and-int/lit8 v1, p1, 0x7f

    .line 13
    .line 14
    or-int/lit16 v1, v1, 0x80

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 17
    .line 18
    .line 19
    ushr-int/lit8 p1, p1, 0x7

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 23
    .line 24
    and-int/lit8 p1, p1, 0x7f

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private y(J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 11
    .line 12
    long-to-int v1, p1

    .line 13
    and-int/lit8 v1, v1, 0x7f

    .line 14
    .line 15
    or-int/lit16 v1, v1, 0x80

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    ushr-long/2addr p1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 24
    .line 25
    long-to-int p1, p1

    .line 26
    and-int/lit8 p1, p1, 0x7f

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(Lw4/c;Ljava/lang/Object;)Lw4/e;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lz4/f;->i(Lw4/c;Ljava/lang/Object;Z)Lw4/e;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public bridge synthetic b(Lw4/c;I)Lw4/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz4/f;->j(Lw4/c;I)Lz4/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lw4/c;D)Lw4/e;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lz4/f;->g(Lw4/c;DZ)Lw4/e;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public bridge synthetic d(Lw4/c;J)Lw4/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lz4/f;->l(Lw4/c;J)Lz4/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e(Lw4/c;Z)Lw4/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz4/f;->n(Lw4/c;Z)Lz4/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method g(Lw4/c;DZ)Lw4/e;
    .locals 2

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmpl-double p4, p2, v0

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p1}, Lz4/f;->v(Lw4/c;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    shl-int/lit8 p1, p1, 0x3

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 22
    .line 23
    const/16 p4, 0x8

    .line 24
    .line 25
    invoke-static {p4}, Lz4/f;->p(I)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method h(Lw4/c;FZ)Lw4/e;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    cmpl-float p3, p2, p3

    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p1}, Lz4/f;->v(Lw4/c;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    or-int/lit8 p1, p1, 0x5

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 21
    .line 22
    const/4 p3, 0x4

    .line 23
    invoke-static {p3}, Lz4/f;->p(I)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method i(Lw4/c;Ljava/lang/Object;Z)Lw4/e;
    .locals 2

    if-nez p2, :cond_0

    return-object p0

    .line 1
    :cond_0
    instance-of v0, p2, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_1

    return-object p0

    :cond_1
    invoke-static {p1}, Lz4/f;->v(Lw4/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lz4/f;->f:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    array-length p2, p1

    invoke-direct {p0, p2}, Lz4/f;->x(I)V

    iget-object p2, p0, Lz4/f;->a:Ljava/io/OutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_2
    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p3, v1}, Lz4/f;->i(Lw4/c;Ljava/lang/Object;Z)Lw4/e;

    goto :goto_0

    :cond_3
    return-object p0

    :cond_4
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_6

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    sget-object v0, Lz4/f;->i:Lw4/d;

    invoke-direct {p0, v0, p1, p3, v1}, Lz4/f;->r(Lw4/d;Lw4/c;Ljava/lang/Object;Z)Lz4/f;

    goto :goto_1

    :cond_5
    return-object p0

    :cond_6
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_7

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lz4/f;->g(Lw4/c;DZ)Lw4/e;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_8

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lz4/f;->h(Lw4/c;FZ)Lw4/e;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_9

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lz4/f;->m(Lw4/c;JZ)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lz4/f;->o(Lw4/c;ZZ)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v0, p2, [B

    if-eqz v0, :cond_c

    check-cast p2, [B

    if-eqz p3, :cond_b

    array-length p3, p2

    if-nez p3, :cond_b

    return-object p0

    :cond_b
    invoke-static {p1}, Lz4/f;->v(Lw4/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    array-length p1, p2

    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    iget-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_c
    iget-object v0, p0, Lz4/f;->b:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/d;

    if-eqz v0, :cond_d

    invoke-direct {p0, v0, p1, p2, p3}, Lz4/f;->r(Lw4/d;Lw4/c;Ljava/lang/Object;Z)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_d
    iget-object v0, p0, Lz4/f;->c:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/f;

    if-eqz v0, :cond_e

    invoke-direct {p0, v0, p1, p2, p3}, Lz4/f;->s(Lw4/f;Lw4/c;Ljava/lang/Object;Z)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_e
    instance-of v0, p2, Lz4/c;

    if-eqz v0, :cond_f

    check-cast p2, Lz4/c;

    invoke-interface {p2}, Lz4/c;->d()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz4/f;->j(Lw4/c;I)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of v0, p2, Ljava/lang/Enum;

    if-eqz v0, :cond_10

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz4/f;->j(Lw4/c;I)Lz4/f;

    move-result-object p1

    return-object p1

    :cond_10
    iget-object v0, p0, Lz4/f;->d:Lw4/d;

    invoke-direct {p0, v0, p1, p2, p3}, Lz4/f;->r(Lw4/d;Lw4/c;Ljava/lang/Object;Z)Lz4/f;

    move-result-object p1

    return-object p1
.end method

.method public j(Lw4/c;I)Lz4/f;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lz4/f;->k(Lw4/c;IZ)Lz4/f;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method k(Lw4/c;IZ)Lz4/f;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p1}, Lz4/f;->u(Lw4/c;)Lz4/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object p3, Lz4/f$a;->a:[I

    .line 11
    .line 12
    invoke-interface {p1}, Lz4/d;->intEncoding()Lz4/d$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    aget p3, p3, v0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq p3, v0, :cond_3

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-eq p3, v0, :cond_2

    .line 28
    .line 29
    if-eq p3, v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    shl-int/2addr p1, v1

    .line 37
    or-int/lit8 p1, p1, 0x5

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 43
    .line 44
    const/4 p3, 0x4

    .line 45
    invoke-static {p3}, Lz4/f;->p(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    shl-int/2addr p1, v1

    .line 66
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 67
    .line 68
    .line 69
    shl-int/lit8 p1, p2, 0x1

    .line 70
    .line 71
    shr-int/lit8 p2, p2, 0x1f

    .line 72
    .line 73
    xor-int/2addr p1, p2

    .line 74
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    shl-int/2addr p1, v1

    .line 83
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, p2}, Lz4/f;->x(I)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-object p0
.end method

.method public l(Lw4/c;J)Lz4/f;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lz4/f;->m(Lw4/c;JZ)Lz4/f;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method m(Lw4/c;JZ)Lz4/f;
    .locals 3

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long p4, p2, v0

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p1}, Lz4/f;->u(Lw4/c;)Lz4/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p4, Lz4/f$a;->a:[I

    .line 15
    .line 16
    invoke-interface {p1}, Lz4/d;->intEncoding()Lz4/d$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    aget p4, p4, v0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq p4, v0, :cond_3

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    if-eq p4, v2, :cond_2

    .line 32
    .line 33
    if-eq p4, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    shl-int/2addr p1, v1

    .line 41
    or-int/2addr p1, v0

    .line 42
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lz4/f;->a:Ljava/io/OutputStream;

    .line 46
    .line 47
    const/16 p4, 0x8

    .line 48
    .line 49
    invoke-static {p4}, Lz4/f;->p(I)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    shl-int/2addr p1, v1

    .line 70
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 71
    .line 72
    .line 73
    shl-long v0, p2, v0

    .line 74
    .line 75
    const/16 p1, 0x3f

    .line 76
    .line 77
    shr-long p1, p2, p1

    .line 78
    .line 79
    xor-long/2addr p1, v0

    .line 80
    invoke-direct {p0, p1, p2}, Lz4/f;->y(J)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-interface {p1}, Lz4/d;->tag()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    shl-int/2addr p1, v1

    .line 89
    invoke-direct {p0, p1}, Lz4/f;->x(I)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p2, p3}, Lz4/f;->y(J)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-object p0
.end method

.method public n(Lw4/c;Z)Lz4/f;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lz4/f;->o(Lw4/c;ZZ)Lz4/f;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method o(Lw4/c;ZZ)Lz4/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lz4/f;->k(Lw4/c;IZ)Lz4/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method t(Ljava/lang/Object;)Lz4/f;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget-object v0, p0, Lz4/f;->b:Ljava/util/Map;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lw4/d;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1, p0}, Lw4/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance v0, Lw4/b;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "No encoder for "

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Lw4/b;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

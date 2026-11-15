.class public final LW5/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:[J

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private d:Z

.field private e:Z

.field private f:LW5/d$b;

.field private g:I

.field private h:J

.field private final i:Ljava/lang/String;

.field final synthetic j:LW5/d;


# direct methods
.method public constructor <init>(LW5/d;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LW5/d$c;->j:LW5/d;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, LW5/d$c;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, LW5/d;->h0()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-array v0, v0, [J

    .line 18
    .line 19
    iput-object v0, p0, LW5/d$c;->a:[J

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LW5/d$c;->b:Ljava/util/List;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LW5/d$c;->c:Ljava/util/List;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 p2, 0x2e

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p1}, LW5/d;->h0()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    :goto_0
    if-ge v2, v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, LW5/d$c;->b:Ljava/util/List;

    .line 60
    .line 61
    check-cast v3, Ljava/util/Collection;

    .line 62
    .line 63
    new-instance v4, Ljava/io/File;

    .line 64
    .line 65
    invoke-virtual {p1}, LW5/d;->W()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    const-string v3, ".tmp"

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v3, p0, LW5/d$c;->c:Ljava/util/List;

    .line 85
    .line 86
    check-cast v3, Ljava/util/Collection;

    .line 87
    .line 88
    new-instance v4, Ljava/io/File;

    .line 89
    .line 90
    invoke-virtual {p1}, LW5/d;->W()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method

.method private final j(Ljava/util/List;)Ljava/lang/Void;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "unexpected journal line: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method private final k(I)Li6/C;
    .locals 2

    .line 1
    iget-object v0, p0, LW5/d$c;->j:LW5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LW5/d;->a0()Lc6/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LW5/d$c;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/io/File;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lc6/a;->a(Ljava/io/File;)Li6/C;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, LW5/d$c;->j:LW5/d;

    .line 20
    .line 21
    invoke-static {v0}, LW5/d;->a(LW5/d;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    iget v0, p0, LW5/d$c;->g:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    iput v0, p0, LW5/d$c;->g:I

    .line 33
    .line 34
    new-instance v0, LW5/d$c$a;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1, p1}, LW5/d$c$a;-><init>(LW5/d$c;Li6/C;Li6/C;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d$c;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LW5/d$b;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d$c;->f:LW5/d$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d$c;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d$c;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()[J
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d$c;->a:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LW5/d$c;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LW5/d$c;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, LW5/d$c;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LW5/d$c;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l(LW5/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW5/d$c;->f:LW5/d$b;

    .line 2
    .line 3
    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "strings"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, LW5/d$c;->j:LW5/d;

    .line 11
    .line 12
    invoke-virtual {v1}, LW5/d;->h0()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    move-object v0, p1

    .line 19
    check-cast v0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, LW5/d$c;->a:[J

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    aput-wide v3, v2, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void

    .line 46
    :catch_0
    invoke-direct {p0, p1}, LW5/d$c;->j(Ljava/util/List;)Ljava/lang/Void;

    .line 47
    .line 48
    .line 49
    new-instance p1, Li5/d;

    .line 50
    .line 51
    invoke-direct {p1}, Li5/d;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    invoke-direct {p0, p1}, LW5/d$c;->j(Ljava/util/List;)Ljava/lang/Void;

    .line 56
    .line 57
    .line 58
    new-instance p1, Li5/d;

    .line 59
    .line 60
    invoke-direct {p1}, Li5/d;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public final n(I)V
    .locals 0

    .line 1
    iput p1, p0, LW5/d$c;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LW5/d$c;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final p(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LW5/d$c;->h:J

    .line 2
    .line 3
    return-void
.end method

.method public final q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LW5/d$c;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final r()LW5/d$d;
    .locals 10

    .line 1
    iget-object v0, p0, LW5/d$c;->j:LW5/d;

    sget-boolean v1, LU5/c;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    const-string v4, "Thread.currentThread()"

    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-boolean v0, p0, LW5/d$c;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, LW5/d$c;->j:LW5/d;

    invoke-static {v0}, LW5/d;->a(LW5/d;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LW5/d$c;->f:LW5/d$b;

    if-nez v0, :cond_3

    iget-boolean v0, p0, LW5/d$c;->e:Z

    if-eqz v0, :cond_4

    :cond_3
    return-object v1

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, LW5/d$c;->a:[J

    invoke-virtual {v2}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, [J

    :try_start_0
    iget-object v2, p0, LW5/d$c;->j:LW5/d;

    invoke-virtual {v2}, LW5/d;->h0()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    invoke-direct {p0, v3}, LW5/d$c;->k(I)Li6/C;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    new-instance v9, LW5/d$d;

    iget-object v3, p0, LW5/d$c;->j:LW5/d;

    iget-object v4, p0, LW5/d$c;->i:Ljava/lang/String;

    iget-wide v5, p0, LW5/d$c;->h:J

    move-object v2, v9

    move-object v7, v0

    invoke-direct/range {v2 .. v8}, LW5/d$d;-><init>(LW5/d;Ljava/lang/String;JLjava/util/List;[J)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li6/C;

    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    goto :goto_2

    :cond_6
    :try_start_1
    iget-object v0, p0, LW5/d$c;->j:LW5/d;

    invoke-virtual {v0, p0}, LW5/d;->b1(LW5/d$c;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-object v1
.end method

.method public final s(Li6/g;)V
    .locals 6

    .line 1
    const-string v0, "writer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW5/d$c;->a:[J

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-wide v3, v0, v2

    .line 13
    .line 14
    const/16 v5, 0x20

    .line 15
    .line 16
    invoke-interface {p1, v5}, Li6/g;->P(I)Li6/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-interface {v5, v3, v4}, Li6/g;->X0(J)Li6/g;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

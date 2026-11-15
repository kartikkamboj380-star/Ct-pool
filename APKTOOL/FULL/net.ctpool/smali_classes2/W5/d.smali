.class public final LW5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW5/d$d;,
        LW5/d$b;,
        LW5/d$c;,
        LW5/d$a;
    }
.end annotation


# static fields
.field public static final H:Ljava/lang/String;

.field public static final I:Ljava/lang/String;

.field public static final J:Ljava/lang/String;

.field public static final K:Ljava/lang/String;

.field public static final L:Ljava/lang/String;

.field public static final M:J

.field public static final N:LF5/f;

.field public static final O:Ljava/lang/String;

.field public static final P:Ljava/lang/String;

.field public static final Q:Ljava/lang/String;

.field public static final R:Ljava/lang/String;

.field public static final S:LW5/d$a;


# instance fields
.field private A:J

.field private final B:LX5/d;

.field private final C:LW5/d$e;

.field private final D:Lc6/a;

.field private final E:Ljava/io/File;

.field private final F:I

.field private final G:I

.field private m:J

.field private final n:Ljava/io/File;

.field private final o:Ljava/io/File;

.field private final p:Ljava/io/File;

.field private q:J

.field private r:Li6/g;

.field private final s:Ljava/util/LinkedHashMap;

.field private t:I

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW5/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LW5/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LW5/d;->S:LW5/d$a;

    .line 8
    .line 9
    const-string v0, "journal"

    .line 10
    .line 11
    sput-object v0, LW5/d;->H:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "journal.tmp"

    .line 14
    .line 15
    sput-object v0, LW5/d;->I:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "journal.bkp"

    .line 18
    .line 19
    sput-object v0, LW5/d;->J:Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "libcore.io.DiskLruCache"

    .line 22
    .line 23
    sput-object v0, LW5/d;->K:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "1"

    .line 26
    .line 27
    sput-object v0, LW5/d;->L:Ljava/lang/String;

    .line 28
    .line 29
    const-wide/16 v0, -0x1

    .line 30
    .line 31
    sput-wide v0, LW5/d;->M:J

    .line 32
    .line 33
    new-instance v0, LF5/f;

    .line 34
    .line 35
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 36
    .line 37
    invoke-direct {v0, v1}, LF5/f;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LW5/d;->N:LF5/f;

    .line 41
    .line 42
    const-string v0, "CLEAN"

    .line 43
    .line 44
    sput-object v0, LW5/d;->O:Ljava/lang/String;

    .line 45
    .line 46
    const-string v0, "DIRTY"

    .line 47
    .line 48
    sput-object v0, LW5/d;->P:Ljava/lang/String;

    .line 49
    .line 50
    const-string v0, "REMOVE"

    .line 51
    .line 52
    sput-object v0, LW5/d;->Q:Ljava/lang/String;

    .line 53
    .line 54
    const-string v0, "READ"

    .line 55
    .line 56
    sput-object v0, LW5/d;->R:Ljava/lang/String;

    .line 57
    .line 58
    return-void
.end method

.method public constructor <init>(Lc6/a;Ljava/io/File;IIJLX5/e;)V
    .locals 4

    .line 1
    const-string v0, "fileSystem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "directory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "taskRunner"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LW5/d;->D:Lc6/a;

    .line 20
    .line 21
    iput-object p2, p0, LW5/d;->E:Ljava/io/File;

    .line 22
    .line 23
    iput p3, p0, LW5/d;->F:I

    .line 24
    .line 25
    iput p4, p0, LW5/d;->G:I

    .line 26
    .line 27
    iput-wide p5, p0, LW5/d;->m:J

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    const/4 p3, 0x0

    .line 32
    const/high16 v0, 0x3f400000    # 0.75f

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {p1, p3, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-virtual {p7}, LX5/e;->i()LX5/d;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, LW5/d;->B:LX5/d;

    .line 45
    .line 46
    new-instance p1, LW5/d$e;

    .line 47
    .line 48
    new-instance p7, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v0, LU5/c;->i:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, " Cache"

    .line 59
    .line 60
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p7

    .line 67
    invoke-direct {p1, p0, p7}, LW5/d$e;-><init>(LW5/d;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, LW5/d;->C:LW5/d$e;

    .line 71
    .line 72
    const-wide/16 v2, 0x0

    .line 73
    .line 74
    cmp-long p1, p5, v2

    .line 75
    .line 76
    if-lez p1, :cond_0

    .line 77
    .line 78
    move p1, v1

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move p1, p3

    .line 81
    :goto_0
    if-eqz p1, :cond_3

    .line 82
    .line 83
    if-lez p4, :cond_1

    .line 84
    .line 85
    move p3, v1

    .line 86
    :cond_1
    if-eqz p3, :cond_2

    .line 87
    .line 88
    new-instance p1, Ljava/io/File;

    .line 89
    .line 90
    sget-object p3, LW5/d;->H:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, LW5/d;->n:Ljava/io/File;

    .line 96
    .line 97
    new-instance p1, Ljava/io/File;

    .line 98
    .line 99
    sget-object p3, LW5/d;->I:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, LW5/d;->o:Ljava/io/File;

    .line 105
    .line 106
    new-instance p1, Ljava/io/File;

    .line 107
    .line 108
    sget-object p3, LW5/d;->J:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, LW5/d;->p:Ljava/io/File;

    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    const-string p2, "valueCount <= 0"

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    const-string p2, "maxSize <= 0"

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1
.end method

.method public static synthetic B(LW5/d;Ljava/lang/String;JILjava/lang/Object;)LW5/d$b;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-wide p2, LW5/d;->M:J

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LW5/d;->z(Ljava/lang/String;J)LW5/d$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final B0()Li6/g;
    .locals 3

    .line 1
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    .line 2
    .line 3
    iget-object v1, p0, LW5/d;->n:Ljava/io/File;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lc6/a;->g(Ljava/io/File;)Li6/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LW5/e;

    .line 10
    .line 11
    new-instance v2, LW5/d$f;

    .line 12
    .line 13
    invoke-direct {v2, p0}, LW5/d$f;-><init>(LW5/d;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0, v2}, LW5/e;-><init>(Li6/A;Lv5/l;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Li6/q;->c(Li6/A;)Li6/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method private final D0()V
    .locals 9

    .line 1
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    .line 2
    .line 3
    iget-object v1, p0, LW5/d;->o:Ljava/io/File;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lc6/a;->f(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "i.next()"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, LW5/d$c;

    .line 34
    .line 35
    invoke-virtual {v1}, LW5/d$c;->b()LW5/d$b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget v2, p0, LW5/d;->G:I

    .line 43
    .line 44
    :goto_1
    if-ge v3, v2, :cond_0

    .line 45
    .line 46
    iget-wide v4, p0, LW5/d;->q:J

    .line 47
    .line 48
    invoke-virtual {v1}, LW5/d$c;->e()[J

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    aget-wide v7, v6, v3

    .line 53
    .line 54
    add-long/2addr v4, v7

    .line 55
    iput-wide v4, p0, LW5/d;->q:J

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v1, v2}, LW5/d$c;->l(LW5/d$b;)V

    .line 62
    .line 63
    .line 64
    iget v2, p0, LW5/d;->G:I

    .line 65
    .line 66
    :goto_2
    if-ge v3, v2, :cond_2

    .line 67
    .line 68
    iget-object v4, p0, LW5/d;->D:Lc6/a;

    .line 69
    .line 70
    invoke-virtual {v1}, LW5/d$c;->a()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/io/File;

    .line 79
    .line 80
    invoke-interface {v4, v5}, Lc6/a;->f(Ljava/io/File;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, LW5/d;->D:Lc6/a;

    .line 84
    .line 85
    invoke-virtual {v1}, LW5/d$c;->c()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/io/File;

    .line 94
    .line 95
    invoke-interface {v4, v5}, Lc6/a;->f(Ljava/io/File;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    return-void
.end method

.method private final H0()V
    .locals 9

    .line 1
    const-string v0, ", "

    iget-object v1, p0, LW5/d;->D:Lc6/a;

    iget-object v2, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v1, v2}, Lc6/a;->a(Ljava/io/File;)Li6/C;

    move-result-object v1

    invoke-static {v1}, Li6/q;->d(Li6/C;)Li6/h;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v6

    sget-object v7, LW5/d;->K:Ljava/lang/String;

    invoke-static {v7, v2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_1

    sget-object v7, LW5/d;->L:Ljava/lang/String;

    invoke-static {v7, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_1

    iget v7, p0, LW5/d;->F:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_1

    iget v4, p0, LW5/d;->G:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_1

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v4, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v1}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, LW5/d;->M0(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object v2, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, LW5/d;->t:I

    invoke-interface {v1}, Li6/h;->O()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LW5/d;->R0()V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, LW5/d;->B0()Li6/g;

    move-result-object v0

    iput-object v0, p0, LW5/d;->r:Li6/g;

    :goto_1
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :try_start_3
    new-instance v4, Ljava/io/IOException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "unexpected journal header: ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private final M0(Ljava/lang/String;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    .line 1
    invoke-static/range {v1 .. v6}, LF5/g;->Q(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v10

    const-string v11, "unexpected journal line: "

    const/4 v12, -0x1

    if-eq v10, v12, :cond_9

    add-int/lit8 v13, v10, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move v3, v13

    invoke-static/range {v1 .. v6}, LF5/g;->Q(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    const-string v2, "(this as java.lang.String).substring(startIndex)"

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ne v1, v12, :cond_1

    if-eqz v7, :cond_0

    invoke-virtual {v7, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, LW5/d;->Q:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-ne v10, v14, :cond_2

    invoke-static {v7, v13, v8, v4, v5}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    iget-object v1, v0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    if-eqz v7, :cond_8

    invoke-virtual {v7, v13, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v13, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v6, v13}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iget-object v13, v0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {v13, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LW5/d$c;

    if-nez v13, :cond_3

    new-instance v13, LW5/d$c;

    invoke-direct {v13, v0, v6}, LW5/d$c;-><init>(LW5/d;Ljava/lang/String;)V

    iget-object v14, v0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-interface {v14, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eq v1, v12, :cond_5

    sget-object v6, LW5/d;->O:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    if-ne v10, v14, :cond_5

    invoke-static {v7, v6, v8, v4, v5}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    add-int/2addr v1, v9

    if-eqz v7, :cond_4

    invoke-virtual {v7, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v15, v9, [C

    const/16 v1, 0x20

    aput-char v1, v15, v8

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, LF5/g;->p0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v13, v9}, LW5/d$c;->o(Z)V

    invoke-virtual {v13, v5}, LW5/d$c;->l(LW5/d$b;)V

    invoke-virtual {v13, v1}, LW5/d$c;->m(Ljava/util/List;)V

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    if-ne v1, v12, :cond_6

    sget-object v2, LW5/d;->P:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v10, v3, :cond_6

    invoke-static {v7, v2, v8, v4, v5}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v1, LW5/d$b;

    invoke-direct {v1, v0, v13}, LW5/d$b;-><init>(LW5/d;LW5/d$c;)V

    invoke-virtual {v13, v1}, LW5/d$c;->l(LW5/d$b;)V

    goto :goto_0

    :cond_6
    if-ne v1, v12, :cond_7

    sget-object v1, LW5/d;->R:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v10, v2, :cond_7

    invoke-static {v7, v1, v8, v4, v5}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_0
    return-void

    :cond_7
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic a(LW5/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LW5/d;->v:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(LW5/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LW5/d;->w:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(LW5/d;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LW5/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic e(LW5/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LW5/d;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic f(LW5/d;Li6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW5/d;->r:Li6/g;

    .line 2
    .line 3
    return-void
.end method

.method private final f1()Z
    .locals 3

    .line 1
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LW5/d$c;

    .line 22
    .line 23
    invoke-virtual {v1}, LW5/d$c;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const-string v0, "toEvict"

    .line 30
    .line 31
    invoke-static {v1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, LW5/d;->b1(LW5/d$c;)Z

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public static final synthetic g(LW5/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LW5/d;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method private final i1(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LW5/d;->N:LF5/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF5/f;->a(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x22

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static final synthetic j(LW5/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LW5/d;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic l(LW5/d;I)V
    .locals 0

    .line 1
    iput p1, p0, LW5/d;->t:I

    .line 2
    .line 3
    return-void
.end method

.method private final declared-synchronized n()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LW5/d;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    .line 11
    .line 12
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    monitor-exit p0

    .line 24
    throw v0
.end method

.method private final n0()Z
    .locals 2

    .line 1
    iget v0, p0, LW5/d;->t:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method


# virtual methods
.method public final declared-synchronized J(Ljava/lang/String;)LW5/d$d;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LW5/d;->j0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, LW5/d;->n()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, LW5/d;->i1(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LW5/d$c;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-string v2, "lruEntries[key] ?: return null"

    .line 28
    .line 29
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, LW5/d$c;->r()LW5/d$d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v1, p0, LW5/d;->t:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iput v1, p0, LW5/d;->t:I

    .line 43
    .line 44
    iget-object v1, p0, LW5/d;->r:Li6/g;

    .line 45
    .line 46
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v2, LW5/d;->R:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v1, v2}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/16 v2, 0x20

    .line 56
    .line 57
    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v1, p1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-interface {p1, v1}, Li6/g;->P(I)Li6/g;

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, LW5/d;->n0()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    iget-object v1, p0, LW5/d;->B:LX5/d;

    .line 77
    .line 78
    iget-object v2, p0, LW5/d;->C:LW5/d$e;

    .line 79
    .line 80
    const/4 v5, 0x2

    .line 81
    const/4 v6, 0x0

    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    invoke-static/range {v1 .. v6}, LX5/d;->j(LX5/d;LX5/a;JILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_1

    .line 90
    :cond_0
    :goto_0
    monitor-exit p0

    .line 91
    return-object v0

    .line 92
    :cond_1
    monitor-exit p0

    .line 93
    return-object v1

    .line 94
    :cond_2
    monitor-exit p0

    .line 95
    return-object v1

    .line 96
    :goto_1
    monitor-exit p0

    .line 97
    throw p1
.end method

.method public final declared-synchronized R0()V
    .locals 6

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LW5/d;->r:Li6/g;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Li6/A;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->o:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->b(Ljava/io/File;)Li6/A;

    move-result-object v0

    invoke-static {v0}, Li6/q;->c(Li6/A;)Li6/g;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v1, LW5/d;->K:Ljava/lang/String;

    invoke-interface {v0, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    sget-object v1, LW5/d;->L:Ljava/lang/String;

    invoke-interface {v0, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget v1, p0, LW5/d;->F:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Li6/g;->X0(J)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    iget v1, p0, LW5/d;->G:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Li6/g;->X0(J)Li6/g;

    move-result-object v1

    invoke-interface {v1, v2}, Li6/g;->P(I)Li6/g;

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    iget-object v1, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW5/d$c;

    invoke-virtual {v3}, LW5/d$c;->b()LW5/d$b;

    move-result-object v4

    const/16 v5, 0x20

    if-eqz v4, :cond_1

    sget-object v4, LW5/d;->P:Ljava/lang/String;

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v4

    invoke-interface {v4, v5}, Li6/g;->P(I)Li6/g;

    invoke-virtual {v3}, LW5/d$c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    :goto_2
    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    sget-object v4, LW5/d;->O:Ljava/lang/String;

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    move-result-object v4

    invoke-interface {v4, v5}, Li6/g;->P(I)Li6/g;

    invoke-virtual {v3}, LW5/d$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    invoke-virtual {v3, v0}, LW5/d$c;->s(Li6/g;)V

    goto :goto_2

    :cond_2
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v1}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->n:Ljava/io/File;

    iget-object v2, p0, LW5/d;->p:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lc6/a;->e(Ljava/io/File;Ljava/io/File;)V

    :cond_3
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->o:Ljava/io/File;

    iget-object v2, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lc6/a;->e(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->p:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->f(Ljava/io/File;)V

    invoke-direct {p0}, LW5/d;->B0()Li6/g;

    move-result-object v0

    iput-object v0, p0, LW5/d;->r:Li6/g;

    const/4 v0, 0x0

    iput-boolean v0, p0, LW5/d;->u:Z

    iput-boolean v0, p0, LW5/d;->z:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {v0, v1}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized S0(Ljava/lang/String;)Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LW5/d;->j0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, LW5/d;->n()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, LW5/d;->i1(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, LW5/d$c;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const-string v1, "lruEntries[key] ?: return false"

    .line 28
    .line 29
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, LW5/d;->b1(LW5/d$c;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-wide v1, p0, LW5/d;->q:J

    .line 39
    .line 40
    iget-wide v3, p0, LW5/d;->m:J

    .line 41
    .line 42
    cmp-long v1, v1, v3

    .line 43
    .line 44
    if-gtz v1, :cond_0

    .line 45
    .line 46
    iput-boolean v0, p0, LW5/d;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    monitor-exit p0

    .line 52
    return p1

    .line 53
    :cond_1
    monitor-exit p0

    .line 54
    return v0

    .line 55
    :goto_1
    monitor-exit p0

    .line 56
    throw p1
.end method

.method public final U()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LW5/d;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public final W()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d;->E:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a0()Lc6/a;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b1(LW5/d$c;)Z
    .locals 10

    .line 1
    const-string v0, "entry"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LW5/d;->v:Z

    const/16 v1, 0xa

    const/16 v2, 0x20

    const/4 v3, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, LW5/d$c;->f()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LW5/d;->r:Li6/g;

    if-eqz v0, :cond_0

    sget-object v4, LW5/d;->P:Ljava/lang/String;

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    invoke-virtual {p1}, LW5/d$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    invoke-interface {v0, v1}, Li6/g;->P(I)Li6/g;

    invoke-interface {v0}, Li6/g;->flush()V

    :cond_0
    invoke-virtual {p1}, LW5/d$c;->f()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p1}, LW5/d$c;->b()LW5/d$b;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p1, v3}, LW5/d$c;->q(Z)V

    return v3

    :cond_2
    invoke-virtual {p1}, LW5/d$c;->b()LW5/d$b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LW5/d$b;->c()V

    :cond_3
    iget v0, p0, LW5/d;->G:I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_4

    iget-object v5, p0, LW5/d;->D:Lc6/a;

    invoke-virtual {p1}, LW5/d$c;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/File;

    invoke-interface {v5, v6}, Lc6/a;->f(Ljava/io/File;)V

    iget-wide v5, p0, LW5/d;->q:J

    invoke-virtual {p1}, LW5/d$c;->e()[J

    move-result-object v7

    aget-wide v8, v7, v4

    sub-long/2addr v5, v8

    iput-wide v5, p0, LW5/d;->q:J

    invoke-virtual {p1}, LW5/d$c;->e()[J

    move-result-object v5

    const-wide/16 v6, 0x0

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iget v0, p0, LW5/d;->t:I

    add-int/2addr v0, v3

    iput v0, p0, LW5/d;->t:I

    iget-object v0, p0, LW5/d;->r:Li6/g;

    if-eqz v0, :cond_5

    sget-object v4, LW5/d;->Q:Ljava/lang/String;

    invoke-interface {v0, v4}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    invoke-interface {v0, v2}, Li6/g;->P(I)Li6/g;

    invoke-virtual {p1}, LW5/d$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    invoke-interface {v0, v1}, Li6/g;->P(I)Li6/g;

    :cond_5
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, LW5/d$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, LW5/d;->n0()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object v4, p0, LW5/d;->B:LX5/d;

    iget-object v5, p0, LW5/d;->C:LW5/d$e;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, LX5/d;->j(LX5/d;LX5/a;JILjava/lang/Object;)V

    :cond_6
    return v3
.end method

.method public declared-synchronized close()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LW5/d;->w:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, LW5/d;->x:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "lruEntries.values"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v3, v2, [LW5/d$c;

    .line 25
    .line 26
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    check-cast v0, [LW5/d$c;

    .line 33
    .line 34
    array-length v3, v0

    .line 35
    :goto_0
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    aget-object v4, v0, v2

    .line 38
    .line 39
    invoke-virtual {v4}, LW5/d$c;->b()LW5/d$b;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4}, LW5/d$c;->b()LW5/d$b;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v4}, LW5/d$b;->c()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0}, LW5/d;->h1()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, LW5/d;->r:Li6/g;

    .line 64
    .line 65
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Li6/A;->close()V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, LW5/d;->r:Li6/g;

    .line 73
    .line 74
    iput-boolean v1, p0, LW5/d;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 79
    .line 80
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_4
    :goto_2
    iput-boolean v1, p0, LW5/d;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    monitor-exit p0

    .line 89
    return-void

    .line 90
    :goto_3
    monitor-exit p0

    .line 91
    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LW5/d;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-direct {p0}, LW5/d;->n()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LW5/d;->h1()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LW5/d;->r:Li6/g;

    .line 15
    .line 16
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Li6/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    monitor-exit p0

    .line 26
    throw v0
.end method

.method public final h0()I
    .locals 1

    .line 1
    iget v0, p0, LW5/d;->G:I

    .line 2
    .line 3
    return v0
.end method

.method public final h1()V
    .locals 4

    .line 1
    :cond_0
    iget-wide v0, p0, LW5/d;->q:J

    .line 2
    .line 3
    iget-wide v2, p0, LW5/d;->m:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, LW5/d;->f1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, LW5/d;->y:Z

    .line 18
    .line 19
    return-void
.end method

.method public final declared-synchronized j0()V
    .locals 5

    .line 1
    monitor-enter p0

    :try_start_0
    sget-boolean v0, LU5/c;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    const-string v3, "Thread.currentThread()"

    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    iget-boolean v0, p0, LW5/d;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->p:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->p:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->f(Ljava/io/File;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->p:Ljava/io/File;

    iget-object v2, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lc6/a;->e(Ljava/io/File;Ljava/io/File;)V

    :cond_4
    :goto_1
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->p:Ljava/io/File;

    invoke-static {v0, v1}, LU5/c;->C(Lc6/a;Ljava/io/File;)Z

    move-result v0

    iput-boolean v0, p0, LW5/d;->v:Z

    iget-object v0, p0, LW5/d;->D:Lc6/a;

    iget-object v1, p0, LW5/d;->n:Ljava/io/File;

    invoke-interface {v0, v1}, Lc6/a;->d(Ljava/io/File;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    :try_start_2
    invoke-direct {p0}, LW5/d;->H0()V

    invoke-direct {p0}, LW5/d;->D0()V

    iput-boolean v1, p0, LW5/d;->w:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v2, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v2}, Ld6/j$a;->g()Ld6/j;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DiskLruCache "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LW5/d;->E:Ljava/io/File;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " is corrupt: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", removing"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    invoke-virtual {v2, v3, v4, v0}, Ld6/j;->k(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0}, LW5/d;->w()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iput-boolean v0, p0, LW5/d;->x:Z

    goto :goto_2

    :catchall_1
    move-exception v1

    iput-boolean v0, p0, LW5/d;->x:Z

    throw v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, LW5/d;->R0()V

    iput-boolean v1, p0, LW5/d;->w:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized o(LW5/d$b;Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "editor"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, LW5/d$b;->d()LW5/d$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LW5/d$c;->b()LW5/d$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_c

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, LW5/d$c;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget v2, p0, LW5/d;->G:I

    .line 31
    .line 32
    move v3, v1

    .line 33
    :goto_0
    if-ge v3, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, LW5/d$b;->e()[Z

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    aget-boolean v4, v4, v3

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iget-object v4, p0, LW5/d;->D:Lc6/a;

    .line 47
    .line 48
    invoke-virtual {v0}, LW5/d$c;->c()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/io/File;

    .line 57
    .line 58
    invoke-interface {v4, v5}, Lc6/a;->d(Ljava/io/File;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1}, LW5/d$b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    :try_start_1
    invoke-virtual {p1}, LW5/d$b;->a()V

    .line 76
    .line 77
    .line 78
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    new-instance p2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v0, "Newly created entry didn\'t create value for index "

    .line 86
    .line 87
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_2
    iget p1, p0, LW5/d;->G:I

    .line 102
    .line 103
    :goto_1
    if-ge v1, p1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, LW5/d$c;->c()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/io/File;

    .line 114
    .line 115
    if-eqz p2, :cond_3

    .line 116
    .line 117
    invoke-virtual {v0}, LW5/d$c;->i()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_3

    .line 122
    .line 123
    iget-object v3, p0, LW5/d;->D:Lc6/a;

    .line 124
    .line 125
    invoke-interface {v3, v2}, Lc6/a;->d(Ljava/io/File;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0}, LW5/d$c;->a()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Ljava/io/File;

    .line 140
    .line 141
    iget-object v4, p0, LW5/d;->D:Lc6/a;

    .line 142
    .line 143
    invoke-interface {v4, v2, v3}, Lc6/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, LW5/d$c;->e()[J

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    aget-wide v4, v2, v1

    .line 151
    .line 152
    iget-object v2, p0, LW5/d;->D:Lc6/a;

    .line 153
    .line 154
    invoke-interface {v2, v3}, Lc6/a;->h(Ljava/io/File;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-virtual {v0}, LW5/d$c;->e()[J

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    aput-wide v2, v6, v1

    .line 163
    .line 164
    iget-wide v6, p0, LW5/d;->q:J

    .line 165
    .line 166
    sub-long/2addr v6, v4

    .line 167
    add-long/2addr v6, v2

    .line 168
    iput-wide v6, p0, LW5/d;->q:J

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_3
    iget-object v3, p0, LW5/d;->D:Lc6/a;

    .line 172
    .line 173
    invoke-interface {v3, v2}, Lc6/a;->f(Ljava/io/File;)V

    .line 174
    .line 175
    .line 176
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    const/4 p1, 0x0

    .line 180
    invoke-virtual {v0, p1}, LW5/d$c;->l(LW5/d$b;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, LW5/d$c;->i()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_6

    .line 188
    .line 189
    invoke-virtual {p0, v0}, LW5/d;->b1(LW5/d$c;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    .line 191
    .line 192
    monitor-exit p0

    .line 193
    return-void

    .line 194
    :cond_6
    :try_start_2
    iget p1, p0, LW5/d;->t:I

    .line 195
    .line 196
    const/4 v1, 0x1

    .line 197
    add-int/2addr p1, v1

    .line 198
    iput p1, p0, LW5/d;->t:I

    .line 199
    .line 200
    iget-object p1, p0, LW5/d;->r:Li6/g;

    .line 201
    .line 202
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, LW5/d$c;->g()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    const/16 v3, 0xa

    .line 210
    .line 211
    const/16 v4, 0x20

    .line 212
    .line 213
    if-nez v2, :cond_8

    .line 214
    .line 215
    if-eqz p2, :cond_7

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_7
    iget-object p2, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 219
    .line 220
    invoke-virtual {v0}, LW5/d$c;->d()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    sget-object p2, LW5/d;->Q:Ljava/lang/String;

    .line 228
    .line 229
    invoke-interface {p1, p2}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-interface {p2, v4}, Li6/g;->P(I)Li6/g;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, LW5/d$c;->d()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-interface {p1, p2}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 241
    .line 242
    .line 243
    invoke-interface {p1, v3}, Li6/g;->P(I)Li6/g;

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_8
    :goto_3
    invoke-virtual {v0, v1}, LW5/d$c;->o(Z)V

    .line 248
    .line 249
    .line 250
    sget-object v1, LW5/d;->O:Ljava/lang/String;

    .line 251
    .line 252
    invoke-interface {p1, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-interface {v1, v4}, Li6/g;->P(I)Li6/g;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, LW5/d$c;->d()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-interface {p1, v1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, p1}, LW5/d$c;->s(Li6/g;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {p1, v3}, Li6/g;->P(I)Li6/g;

    .line 270
    .line 271
    .line 272
    if-eqz p2, :cond_9

    .line 273
    .line 274
    iget-wide v1, p0, LW5/d;->A:J

    .line 275
    .line 276
    const-wide/16 v3, 0x1

    .line 277
    .line 278
    add-long/2addr v3, v1

    .line 279
    iput-wide v3, p0, LW5/d;->A:J

    .line 280
    .line 281
    invoke-virtual {v0, v1, v2}, LW5/d$c;->p(J)V

    .line 282
    .line 283
    .line 284
    :cond_9
    :goto_4
    invoke-interface {p1}, Li6/g;->flush()V

    .line 285
    .line 286
    .line 287
    iget-wide p1, p0, LW5/d;->q:J

    .line 288
    .line 289
    iget-wide v0, p0, LW5/d;->m:J

    .line 290
    .line 291
    cmp-long p1, p1, v0

    .line 292
    .line 293
    if-gtz p1, :cond_a

    .line 294
    .line 295
    invoke-direct {p0}, LW5/d;->n0()Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    if-eqz p1, :cond_b

    .line 300
    .line 301
    :cond_a
    iget-object v0, p0, LW5/d;->B:LX5/d;

    .line 302
    .line 303
    iget-object v1, p0, LW5/d;->C:LW5/d$e;

    .line 304
    .line 305
    const/4 v4, 0x2

    .line 306
    const/4 v5, 0x0

    .line 307
    const-wide/16 v2, 0x0

    .line 308
    .line 309
    invoke-static/range {v0 .. v5}, LX5/d;->j(LX5/d;LX5/a;JILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 310
    .line 311
    .line 312
    :cond_b
    monitor-exit p0

    .line 313
    return-void

    .line 314
    :cond_c
    :try_start_3
    const-string p1, "Check failed."

    .line 315
    .line 316
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    :goto_5
    monitor-exit p0

    .line 327
    throw p1
.end method

.method public final w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LW5/d;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LW5/d;->D:Lc6/a;

    .line 5
    .line 6
    iget-object v1, p0, LW5/d;->E:Ljava/io/File;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lc6/a;->c(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final declared-synchronized z(Ljava/lang/String;J)LW5/d$b;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LW5/d;->j0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, LW5/d;->n()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, LW5/d;->i1(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LW5/d$c;

    .line 23
    .line 24
    sget-wide v1, LW5/d;->M:J

    .line 25
    .line 26
    cmp-long v1, p2, v1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, LW5/d$c;->h()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    cmp-long p2, v3, p2

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    :goto_0
    monitor-exit p0

    .line 45
    return-object v2

    .line 46
    :cond_1
    if-eqz v0, :cond_2

    .line 47
    .line 48
    :try_start_1
    invoke-virtual {v0}, LW5/d$c;->b()LW5/d$b;

    .line 49
    .line 50
    .line 51
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object p2, v2

    .line 54
    :goto_1
    if-eqz p2, :cond_3

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object v2

    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v0}, LW5/d$c;->f()I

    .line 61
    .line 62
    .line 63
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    monitor-exit p0

    .line 67
    return-object v2

    .line 68
    :cond_4
    :try_start_3
    iget-boolean p2, p0, LW5/d;->y:Z

    .line 69
    .line 70
    if-nez p2, :cond_8

    .line 71
    .line 72
    iget-boolean p2, p0, LW5/d;->z:Z

    .line 73
    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    iget-object p2, p0, LW5/d;->r:Li6/g;

    .line 78
    .line 79
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object p3, LW5/d;->P:Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {p2, p3}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    const/16 v1, 0x20

    .line 89
    .line 90
    invoke-interface {p3, v1}, Li6/g;->P(I)Li6/g;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-interface {p3, p1}, Li6/g;->k0(Ljava/lang/String;)Li6/g;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    const/16 v1, 0xa

    .line 99
    .line 100
    invoke-interface {p3, v1}, Li6/g;->P(I)Li6/g;

    .line 101
    .line 102
    .line 103
    invoke-interface {p2}, Li6/g;->flush()V

    .line 104
    .line 105
    .line 106
    iget-boolean p2, p0, LW5/d;->u:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    .line 108
    if-eqz p2, :cond_6

    .line 109
    .line 110
    monitor-exit p0

    .line 111
    return-object v2

    .line 112
    :cond_6
    if-nez v0, :cond_7

    .line 113
    .line 114
    :try_start_4
    new-instance v0, LW5/d$c;

    .line 115
    .line 116
    invoke-direct {v0, p0, p1}, LW5/d$c;-><init>(LW5/d;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p2, p0, LW5/d;->s:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_7
    new-instance p1, LW5/d$b;

    .line 125
    .line 126
    invoke-direct {p1, p0, v0}, LW5/d$b;-><init>(LW5/d;LW5/d$c;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1}, LW5/d$c;->l(LW5/d$b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    .line 131
    .line 132
    monitor-exit p0

    .line 133
    return-object p1

    .line 134
    :cond_8
    :goto_2
    :try_start_5
    iget-object v3, p0, LW5/d;->B:LX5/d;

    .line 135
    .line 136
    iget-object v4, p0, LW5/d;->C:LW5/d$e;

    .line 137
    .line 138
    const/4 v7, 0x2

    .line 139
    const/4 v8, 0x0

    .line 140
    const-wide/16 v5, 0x0

    .line 141
    .line 142
    invoke-static/range {v3 .. v8}, LX5/d;->j(LX5/d;LX5/a;JILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 143
    .line 144
    .line 145
    monitor-exit p0

    .line 146
    return-object v2

    .line 147
    :goto_3
    monitor-exit p0

    .line 148
    throw p1
.end method

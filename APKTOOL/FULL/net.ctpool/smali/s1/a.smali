.class public final Ls1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/c$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/a$a;
    }
.end annotation


# static fields
.field public static final b:Ls1/a$a;

.field private static final c:[B

.field private static final d:I

.field private static final e:[B

.field private static final f:I

.field private static final g:[B

.field private static final h:[B

.field private static final i:[B

.field private static final j:I

.field private static final k:[B

.field private static final l:I

.field private static final m:[B

.field private static final n:[[B

.field private static final o:[B

.field private static final p:[B

.field private static final q:I


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ls1/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls1/a;->b:Ls1/a$a;

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Ls1/a;->c:[B

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    sput v0, Ls1/a;->d:I

    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Ls1/a;->e:[B

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    sput v0, Ls1/a;->f:I

    .line 31
    .line 32
    const-string v0, "GIF87a"

    .line 33
    .line 34
    invoke-static {v0}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Ls1/a;->g:[B

    .line 39
    .line 40
    const-string v0, "GIF89a"

    .line 41
    .line 42
    invoke-static {v0}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ls1/a;->h:[B

    .line 47
    .line 48
    const-string v0, "BM"

    .line 49
    .line 50
    invoke-static {v0}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Ls1/a;->i:[B

    .line 55
    .line 56
    array-length v0, v0

    .line 57
    sput v0, Ls1/a;->j:I

    .line 58
    .line 59
    const/4 v0, 0x4

    .line 60
    new-array v1, v0, [B

    .line 61
    .line 62
    fill-array-data v1, :array_2

    .line 63
    .line 64
    .line 65
    sput-object v1, Ls1/a;->k:[B

    .line 66
    .line 67
    array-length v1, v1

    .line 68
    sput v1, Ls1/a;->l:I

    .line 69
    .line 70
    const-string v1, "ftyp"

    .line 71
    .line 72
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sput-object v1, Ls1/a;->m:[B

    .line 77
    .line 78
    const-string v1, "heic"

    .line 79
    .line 80
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v1, "heix"

    .line 85
    .line 86
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v1, "hevc"

    .line 91
    .line 92
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string v1, "hevx"

    .line 97
    .line 98
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-string v1, "mif1"

    .line 103
    .line 104
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-string v1, "msf1"

    .line 109
    .line 110
    invoke-static {v1}, Ls1/e;->a(Ljava/lang/String;)[B

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    filled-new-array/range {v2 .. v7}, [[B

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sput-object v1, Ls1/a;->n:[[B

    .line 119
    .line 120
    new-array v1, v0, [B

    .line 121
    .line 122
    fill-array-data v1, :array_3

    .line 123
    .line 124
    .line 125
    sput-object v1, Ls1/a;->o:[B

    .line 126
    .line 127
    new-array v0, v0, [B

    .line 128
    .line 129
    fill-array-data v0, :array_4

    .line 130
    .line 131
    .line 132
    sput-object v0, Ls1/a;->p:[B

    .line 133
    .line 134
    array-length v0, v1

    .line 135
    sput v0, Ls1/a;->q:I

    .line 136
    .line 137
    return-void

    .line 138
    nop

    .line 139
    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :array_1
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    :array_2
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x0t
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :array_3
    .array-data 1
        0x49t
        0x49t
        0x2at
        0x0t
    .end array-data

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    :array_4
    .array-data 1
        0x4dt
        0x4dt
        0x0t
        0x2at
    .end array-data
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x15

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/16 v0, 0x14

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget v0, Ls1/a;->d:I

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget v0, Ls1/a;->f:I

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v0, 0x6

    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    sget v0, Ls1/a;->j:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    sget v0, Ls1/a;->l:I

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const/16 v0, 0xc

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, [Ljava/lang/Comparable;

    .line 56
    .line 57
    invoke-static {v0}, Lj5/h;->B([Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    check-cast v0, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, Ls1/a;->a:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "Required value was null."

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public static final synthetic c()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->i:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->o:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()I
    .locals 1

    .line 1
    sget v0, Ls1/a;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic f()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->p:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic g()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->g:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->h:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->m:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j()[[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->n:[[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic k()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->k:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic l()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->c:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic m()[B
    .locals 1

    .line 1
    sget-object v0, Ls1/a;->e:[B

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Ls1/a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public b([BI)Ls1/c;
    .locals 2

    .line 1
    const-string v0, "headerBytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, v0, p2}, LX0/b;->h([BII)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ls1/a;->b:Ls1/a$a;

    .line 14
    .line 15
    invoke-static {v0, p1, p2}, Ls1/a$a;->a(Ls1/a$a;[BI)Ls1/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object v0, Ls1/a;->b:Ls1/a$a;

    .line 21
    .line 22
    invoke-static {v0, p1, p2}, Ls1/a$a;->g(Ls1/a$a;[BI)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object p1, Ls1/b;->b:Ls1/c;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    invoke-static {v0, p1, p2}, Ls1/a$a;->h(Ls1/a$a;[BI)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    sget-object p1, Ls1/b;->c:Ls1/c;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    invoke-static {v0, p1, p2}, Ls1/a$a;->d(Ls1/a$a;[BI)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    sget-object p1, Ls1/b;->d:Ls1/c;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_3
    invoke-static {v0, p1, p2}, Ls1/a$a;->b(Ls1/a$a;[BI)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    sget-object p1, Ls1/b;->e:Ls1/c;

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_4
    invoke-static {v0, p1, p2}, Ls1/a$a;->f(Ls1/a$a;[BI)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    sget-object p1, Ls1/b;->f:Ls1/c;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_5
    invoke-static {v0, p1, p2}, Ls1/a$a;->e(Ls1/a$a;[BI)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    sget-object p1, Ls1/b;->l:Ls1/c;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_6
    invoke-static {v0, p1, p2}, Ls1/a$a;->c(Ls1/a$a;[BI)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    sget-object p1, Ls1/b;->m:Ls1/c;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_7
    sget-object p1, Ls1/c;->d:Ls1/c;

    .line 86
    .line 87
    :goto_0
    return-object p1
.end method

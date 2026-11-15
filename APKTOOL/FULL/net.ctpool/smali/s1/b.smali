.class public final Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls1/b;

.field public static final b:Ls1/c;

.field public static final c:Ls1/c;

.field public static final d:Ls1/c;

.field public static final e:Ls1/c;

.field public static final f:Ls1/c;

.field public static final g:Ls1/c;

.field public static final h:Ls1/c;

.field public static final i:Ls1/c;

.field public static final j:Ls1/c;

.field public static final k:Ls1/c;

.field public static final l:Ls1/c;

.field public static final m:Ls1/c;

.field public static final n:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ls1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ls1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls1/b;->a:Ls1/b;

    .line 7
    .line 8
    new-instance v1, Ls1/c;

    .line 9
    .line 10
    const-string v0, "JPEG"

    .line 11
    .line 12
    const-string v2, "jpeg"

    .line 13
    .line 14
    invoke-direct {v1, v0, v2}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ls1/b;->b:Ls1/c;

    .line 18
    .line 19
    new-instance v2, Ls1/c;

    .line 20
    .line 21
    const-string v0, "PNG"

    .line 22
    .line 23
    const-string v3, "png"

    .line 24
    .line 25
    invoke-direct {v2, v0, v3}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Ls1/b;->c:Ls1/c;

    .line 29
    .line 30
    new-instance v3, Ls1/c;

    .line 31
    .line 32
    const-string v0, "GIF"

    .line 33
    .line 34
    const-string v4, "gif"

    .line 35
    .line 36
    invoke-direct {v3, v0, v4}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Ls1/b;->d:Ls1/c;

    .line 40
    .line 41
    new-instance v4, Ls1/c;

    .line 42
    .line 43
    const-string v0, "BMP"

    .line 44
    .line 45
    const-string v5, "bmp"

    .line 46
    .line 47
    invoke-direct {v4, v0, v5}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Ls1/b;->e:Ls1/c;

    .line 51
    .line 52
    new-instance v5, Ls1/c;

    .line 53
    .line 54
    const-string v0, "ICO"

    .line 55
    .line 56
    const-string v6, "ico"

    .line 57
    .line 58
    invoke-direct {v5, v0, v6}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v5, Ls1/b;->f:Ls1/c;

    .line 62
    .line 63
    new-instance v6, Ls1/c;

    .line 64
    .line 65
    const-string v0, "WEBP_SIMPLE"

    .line 66
    .line 67
    const-string v7, "webp"

    .line 68
    .line 69
    invoke-direct {v6, v0, v7}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    sput-object v6, Ls1/b;->g:Ls1/c;

    .line 73
    .line 74
    new-instance v0, Ls1/c;

    .line 75
    .line 76
    const-string v8, "WEBP_LOSSLESS"

    .line 77
    .line 78
    invoke-direct {v0, v8, v7}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Ls1/b;->h:Ls1/c;

    .line 82
    .line 83
    new-instance v8, Ls1/c;

    .line 84
    .line 85
    const-string v9, "WEBP_EXTENDED"

    .line 86
    .line 87
    invoke-direct {v8, v9, v7}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v8, Ls1/b;->i:Ls1/c;

    .line 91
    .line 92
    new-instance v9, Ls1/c;

    .line 93
    .line 94
    const-string v10, "WEBP_EXTENDED_WITH_ALPHA"

    .line 95
    .line 96
    invoke-direct {v9, v10, v7}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v9, Ls1/b;->j:Ls1/c;

    .line 100
    .line 101
    new-instance v10, Ls1/c;

    .line 102
    .line 103
    const-string v11, "WEBP_ANIMATED"

    .line 104
    .line 105
    invoke-direct {v10, v11, v7}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v10, Ls1/b;->k:Ls1/c;

    .line 109
    .line 110
    new-instance v11, Ls1/c;

    .line 111
    .line 112
    const-string v7, "HEIF"

    .line 113
    .line 114
    const-string v12, "heif"

    .line 115
    .line 116
    invoke-direct {v11, v7, v12}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sput-object v11, Ls1/b;->l:Ls1/c;

    .line 120
    .line 121
    new-instance v7, Ls1/c;

    .line 122
    .line 123
    const-string v12, "DNG"

    .line 124
    .line 125
    const-string v13, "dng"

    .line 126
    .line 127
    invoke-direct {v7, v12, v13}, Ls1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sput-object v7, Ls1/b;->m:Ls1/c;

    .line 131
    .line 132
    move-object v7, v0

    .line 133
    filled-new-array/range {v1 .. v11}, [Ls1/c;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lj5/n;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sput-object v0, Ls1/b;->n:Ljava/util/List;

    .line 142
    .line 143
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Ls1/c;)Z
    .locals 1

    .line 1
    const-string v0, "imageFormat"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ls1/b;->g:Ls1/c;

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ls1/b;->h:Ls1/c;

    .line 11
    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Ls1/b;->i:Ls1/c;

    .line 15
    .line 16
    if-eq p0, v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Ls1/b;->j:Ls1/c;

    .line 19
    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    :goto_1
    return p0
.end method

.method public static final b(Ls1/c;)Z
    .locals 1

    .line 1
    const-string v0, "imageFormat"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ls1/b;->a(Ls1/c;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Ls1/b;->k:Ls1/c;

    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 20
    :goto_1
    return p0
.end method

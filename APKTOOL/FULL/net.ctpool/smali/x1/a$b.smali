.class public final Lx1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lx1/a$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lx1/a$b;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx1/a$b;->f(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d()Ljava/util/regex/Pattern;
    .locals 2

    .line 1
    invoke-static {}, Lx1/a;->a()Lkotlin/Lazy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "<get-headerParsingRegEx>(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Ljava/util/regex/Pattern;

    .line 15
    .line 16
    return-object v0
.end method

.method private final f(I)Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    return-object p1
.end method


# virtual methods
.method public final b(I)Lx1/a;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lx1/a;

    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lx1/a;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lx1/a;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-direct {p0}, Lx1/a$b;->d()Ljava/util/regex/Pattern;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    array-length v3, v2

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    move v3, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v3, v5

    .line 22
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 27
    .line 28
    .line 29
    aget-object v3, v2, v5

    .line 30
    .line 31
    const-string v4, "bytes"

    .line 32
    .line 33
    invoke-static {v3, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 42
    .line 43
    .line 44
    aget-object v3, v2, v1

    .line 45
    .line 46
    const-string v4, "headerParts[1]"

    .line 47
    .line 48
    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x2

    .line 56
    aget-object v4, v2, v4

    .line 57
    .line 58
    const-string v6, "headerParts[2]"

    .line 59
    .line 60
    invoke-static {v4, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v6, 0x3

    .line 68
    aget-object v2, v2, v6

    .line 69
    .line 70
    const-string v6, "headerParts[3]"

    .line 71
    .line 72
    invoke-static {v2, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-le v4, v3, :cond_2

    .line 80
    .line 81
    move v6, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v6, v5

    .line 84
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v6}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 89
    .line 90
    .line 91
    if-le v2, v4, :cond_3

    .line 92
    .line 93
    move v5, v1

    .line 94
    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 99
    .line 100
    .line 101
    sub-int/2addr v2, v1

    .line 102
    if-ge v4, v2, :cond_4

    .line 103
    .line 104
    new-instance v2, Lx1/a;

    .line 105
    .line 106
    invoke-direct {v2, v3, v4}, Lx1/a;-><init>(II)V

    .line 107
    .line 108
    .line 109
    return-object v2

    .line 110
    :catch_0
    move-exception v2

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    new-instance v2, Lx1/a;

    .line 113
    .line 114
    const v4, 0x7fffffff

    .line 115
    .line 116
    .line 117
    invoke-direct {v2, v3, v4}, Lx1/a;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :goto_2
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    sget-object v4, Lw5/y;->a:Lw5/y;

    .line 124
    .line 125
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const-string v1, "Invalid Content-Range header value: \"%s\""

    .line 134
    .line 135
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string v0, "format(locale, format, *args)"

    .line 140
    .line 141
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v3, p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw v3
.end method

.method public final e(I)Lx1/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lx1/a;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Lx1/a;-><init>(II)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method

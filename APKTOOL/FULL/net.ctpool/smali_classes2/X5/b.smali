.class public abstract LX5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LX5/a;LX5/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LX5/b;->c(LX5/a;LX5/d;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b(J)Ljava/lang/String;
    .locals 12

    .line 1
    const v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    cmp-long v0, p0, v0

    .line 6
    .line 7
    const-string v1, " s "

    .line 8
    .line 9
    const v2, 0x3b9aca00

    .line 10
    .line 11
    .line 12
    const v3, 0x1dcd6500

    .line 13
    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    int-to-long v3, v3

    .line 23
    sub-long/2addr p0, v3

    .line 24
    :goto_0
    int-to-long v2, v2

    .line 25
    div-long/2addr p0, v2

    .line 26
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_4

    .line 37
    :cond_0
    const v0, -0xf404c

    .line 38
    .line 39
    .line 40
    int-to-long v4, v0

    .line 41
    cmp-long v0, p0, v4

    .line 42
    .line 43
    const-string v4, " ms"

    .line 44
    .line 45
    const v5, 0xf4240

    .line 46
    .line 47
    .line 48
    const v6, 0x7a120

    .line 49
    .line 50
    .line 51
    if-gtz v0, :cond_1

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    int-to-long v1, v6

    .line 59
    sub-long/2addr p0, v1

    .line 60
    :goto_2
    int-to-long v1, v5

    .line 61
    div-long/2addr p0, v1

    .line 62
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    cmp-long v0, p0, v7

    .line 72
    .line 73
    const-string v7, " \u00b5s"

    .line 74
    .line 75
    const/16 v8, 0x3e8

    .line 76
    .line 77
    const/16 v9, 0x1f4

    .line 78
    .line 79
    if-gtz v0, :cond_2

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    int-to-long v1, v9

    .line 87
    sub-long/2addr p0, v1

    .line 88
    :goto_3
    int-to-long v1, v8

    .line 89
    div-long/2addr p0, v1

    .line 90
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const v0, 0xf404c

    .line 98
    .line 99
    .line 100
    int-to-long v10, v0

    .line 101
    cmp-long v0, p0, v10

    .line 102
    .line 103
    if-gez v0, :cond_3

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    int-to-long v1, v9

    .line 111
    add-long/2addr p0, v1

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    const v0, 0x3b9328e0

    .line 114
    .line 115
    .line 116
    int-to-long v7, v0

    .line 117
    cmp-long v0, p0, v7

    .line 118
    .line 119
    if-gez v0, :cond_4

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    int-to-long v1, v6

    .line 127
    add-long/2addr p0, v1

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    int-to-long v3, v3

    .line 135
    add-long/2addr p0, v3

    .line 136
    goto :goto_0

    .line 137
    :goto_4
    sget-object p1, Lw5/y;->a:Lw5/y;

    .line 138
    .line 139
    const/4 p1, 0x1

    .line 140
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string p1, "%6s"

    .line 149
    .line 150
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    const-string p1, "java.lang.String.format(format, *args)"

    .line 155
    .line 156
    invoke-static {p0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object p0
.end method

.method private static final c(LX5/a;LX5/d;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LX5/e;->j:LX5/e$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LX5/e$b;->a()Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, LX5/d;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x20

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    sget-object p1, Lw5/y;->a:Lw5/y;

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "%-22s"

    .line 36
    .line 37
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "java.lang.String.format(format, *args)"

    .line 42
    .line 43
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, ": "

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, LX5/a;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

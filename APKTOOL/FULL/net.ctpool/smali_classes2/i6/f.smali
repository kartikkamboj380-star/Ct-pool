.class public final Li6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/h;
.implements Li6/g;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li6/f$a;
    }
.end annotation


# instance fields
.field public m:Li6/x;

.field private n:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b1(Li6/f;Li6/f$a;ILjava/lang/Object;)Li6/f$a;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Li6/f$a;

    .line 6
    .line 7
    invoke-direct {p1}, Li6/f$a;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Li6/f;->R0(Li6/f$a;)Li6/f$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method


# virtual methods
.method public bridge synthetic A()Li6/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->j()Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public A1(Ljava/lang/String;)Li6/f;
    .locals 2

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, p1, v1, v0}, Li6/f;->B1(Ljava/lang/String;II)Li6/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public B(BJJ)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, v0, p2

    .line 4
    .line 5
    if-lez v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    cmp-long v2, p4, p2

    .line 9
    .line 10
    if-ltz v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 15
    :goto_1
    if-eqz v2, :cond_c

    .line 16
    .line 17
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmp-long v2, p4, v2

    .line 22
    .line 23
    if-lez v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 26
    .line 27
    .line 28
    move-result-wide p4

    .line 29
    :cond_2
    cmp-long v2, p2, p4

    .line 30
    .line 31
    const-wide/16 v3, -0x1

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    goto/16 :goto_9

    .line 36
    .line 37
    :cond_3
    iget-object v2, p0, Li6/f;->m:Li6/x;

    .line 38
    .line 39
    if-eqz v2, :cond_b

    .line 40
    .line 41
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    sub-long/2addr v5, p2

    .line 46
    cmp-long v5, v5, p2

    .line 47
    .line 48
    if-gez v5, :cond_7

    .line 49
    .line 50
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    :goto_2
    cmp-long v5, v0, p2

    .line 55
    .line 56
    if-lez v5, :cond_4

    .line 57
    .line 58
    iget-object v2, v2, Li6/x;->g:Li6/x;

    .line 59
    .line 60
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget v5, v2, Li6/x;->c:I

    .line 64
    .line 65
    iget v6, v2, Li6/x;->b:I

    .line 66
    .line 67
    sub-int/2addr v5, v6

    .line 68
    int-to-long v5, v5

    .line 69
    sub-long/2addr v0, v5

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_3
    cmp-long v5, v0, p4

    .line 72
    .line 73
    if-gez v5, :cond_b

    .line 74
    .line 75
    iget-object v5, v2, Li6/x;->a:[B

    .line 76
    .line 77
    iget v6, v2, Li6/x;->c:I

    .line 78
    .line 79
    int-to-long v6, v6

    .line 80
    iget v8, v2, Li6/x;->b:I

    .line 81
    .line 82
    int-to-long v8, v8

    .line 83
    add-long/2addr v8, p4

    .line 84
    sub-long/2addr v8, v0

    .line 85
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    long-to-int v6, v6

    .line 90
    iget v7, v2, Li6/x;->b:I

    .line 91
    .line 92
    int-to-long v7, v7

    .line 93
    add-long/2addr v7, p2

    .line 94
    sub-long/2addr v7, v0

    .line 95
    long-to-int p2, v7

    .line 96
    :goto_4
    if-ge p2, v6, :cond_6

    .line 97
    .line 98
    aget-byte p3, v5, p2

    .line 99
    .line 100
    if-ne p3, p1, :cond_5

    .line 101
    .line 102
    :goto_5
    iget p1, v2, Li6/x;->b:I

    .line 103
    .line 104
    sub-int/2addr p2, p1

    .line 105
    int-to-long p1, p2

    .line 106
    add-long v3, p1, v0

    .line 107
    .line 108
    goto :goto_9

    .line 109
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    iget p2, v2, Li6/x;->c:I

    .line 113
    .line 114
    iget p3, v2, Li6/x;->b:I

    .line 115
    .line 116
    sub-int/2addr p2, p3

    .line 117
    int-to-long p2, p2

    .line 118
    add-long/2addr v0, p2

    .line 119
    iget-object v2, v2, Li6/x;->f:Li6/x;

    .line 120
    .line 121
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-wide p2, v0

    .line 125
    goto :goto_3

    .line 126
    :cond_7
    :goto_6
    iget v5, v2, Li6/x;->c:I

    .line 127
    .line 128
    iget v6, v2, Li6/x;->b:I

    .line 129
    .line 130
    sub-int/2addr v5, v6

    .line 131
    int-to-long v5, v5

    .line 132
    add-long/2addr v5, v0

    .line 133
    cmp-long v7, v5, p2

    .line 134
    .line 135
    if-lez v7, :cond_a

    .line 136
    .line 137
    :goto_7
    cmp-long v5, v0, p4

    .line 138
    .line 139
    if-gez v5, :cond_b

    .line 140
    .line 141
    iget-object v5, v2, Li6/x;->a:[B

    .line 142
    .line 143
    iget v6, v2, Li6/x;->c:I

    .line 144
    .line 145
    int-to-long v6, v6

    .line 146
    iget v8, v2, Li6/x;->b:I

    .line 147
    .line 148
    int-to-long v8, v8

    .line 149
    add-long/2addr v8, p4

    .line 150
    sub-long/2addr v8, v0

    .line 151
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    long-to-int v6, v6

    .line 156
    iget v7, v2, Li6/x;->b:I

    .line 157
    .line 158
    int-to-long v7, v7

    .line 159
    add-long/2addr v7, p2

    .line 160
    sub-long/2addr v7, v0

    .line 161
    long-to-int p2, v7

    .line 162
    :goto_8
    if-ge p2, v6, :cond_9

    .line 163
    .line 164
    aget-byte p3, v5, p2

    .line 165
    .line 166
    if-ne p3, p1, :cond_8

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    iget p2, v2, Li6/x;->c:I

    .line 173
    .line 174
    iget p3, v2, Li6/x;->b:I

    .line 175
    .line 176
    sub-int/2addr p2, p3

    .line 177
    int-to-long p2, p2

    .line 178
    add-long/2addr v0, p2

    .line 179
    iget-object v2, v2, Li6/x;->f:Li6/x;

    .line 180
    .line 181
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move-wide p2, v0

    .line 185
    goto :goto_7

    .line 186
    :cond_a
    iget-object v2, v2, Li6/x;->f:Li6/x;

    .line 187
    .line 188
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-wide v0, v5

    .line 192
    goto :goto_6

    .line 193
    :cond_b
    :goto_9
    return-wide v3

    .line 194
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v0, "size="

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 205
    .line 206
    .line 207
    move-result-wide v0

    .line 208
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v0, " fromIndex="

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string p2, " toIndex="

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p2
.end method

.method public B1(Ljava/lang/String;II)Li6/f;
    .locals 11

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ltz p2, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    if-eqz v2, :cond_f

    .line 14
    .line 15
    if-lt p3, p2, :cond_1

    .line 16
    .line 17
    move v2, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v2, v0

    .line 20
    :goto_1
    if-eqz v2, :cond_e

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-gt p3, v2, :cond_2

    .line 27
    .line 28
    move v2, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move v2, v0

    .line 31
    :goto_2
    if-eqz v2, :cond_d

    .line 32
    .line 33
    :goto_3
    if-ge p2, p3, :cond_c

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/16 v3, 0x80

    .line 40
    .line 41
    if-ge v2, v3, :cond_5

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Li6/f;->p1(I)Li6/x;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v5, v4, Li6/x;->a:[B

    .line 48
    .line 49
    iget v6, v4, Li6/x;->c:I

    .line 50
    .line 51
    sub-int/2addr v6, p2

    .line 52
    rsub-int v7, v6, 0x2000

    .line 53
    .line 54
    invoke-static {p3, v7}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    add-int/lit8 v8, p2, 0x1

    .line 59
    .line 60
    add-int/2addr p2, v6

    .line 61
    int-to-byte v2, v2

    .line 62
    aput-byte v2, v5, p2

    .line 63
    .line 64
    :goto_4
    if-ge v8, v7, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-lt p2, v3, :cond_3

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_3
    add-int/lit8 v2, v8, 0x1

    .line 74
    .line 75
    add-int/2addr v8, v6

    .line 76
    int-to-byte p2, p2

    .line 77
    aput-byte p2, v5, v8

    .line 78
    .line 79
    move v8, v2

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_5
    add-int/2addr v6, v8

    .line 82
    iget p2, v4, Li6/x;->c:I

    .line 83
    .line 84
    sub-int/2addr v6, p2

    .line 85
    add-int/2addr p2, v6

    .line 86
    iput p2, v4, Li6/x;->c:I

    .line 87
    .line 88
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    int-to-long v4, v6

    .line 93
    add-long/2addr v2, v4

    .line 94
    invoke-virtual {p0, v2, v3}, Li6/f;->l1(J)V

    .line 95
    .line 96
    .line 97
    move p2, v8

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const/16 v4, 0x800

    .line 100
    .line 101
    if-ge v2, v4, :cond_6

    .line 102
    .line 103
    const/4 v4, 0x2

    .line 104
    invoke-virtual {p0, v4}, Li6/f;->p1(I)Li6/x;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget-object v6, v5, Li6/x;->a:[B

    .line 109
    .line 110
    iget v7, v5, Li6/x;->c:I

    .line 111
    .line 112
    shr-int/lit8 v8, v2, 0x6

    .line 113
    .line 114
    or-int/lit16 v8, v8, 0xc0

    .line 115
    .line 116
    int-to-byte v8, v8

    .line 117
    aput-byte v8, v6, v7

    .line 118
    .line 119
    add-int/lit8 v8, v7, 0x1

    .line 120
    .line 121
    and-int/lit8 v2, v2, 0x3f

    .line 122
    .line 123
    or-int/2addr v2, v3

    .line 124
    int-to-byte v2, v2

    .line 125
    aput-byte v2, v6, v8

    .line 126
    .line 127
    add-int/2addr v7, v4

    .line 128
    iput v7, v5, Li6/x;->c:I

    .line 129
    .line 130
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    const-wide/16 v4, 0x2

    .line 135
    .line 136
    :goto_6
    add-long/2addr v2, v4

    .line 137
    invoke-virtual {p0, v2, v3}, Li6/f;->l1(J)V

    .line 138
    .line 139
    .line 140
    add-int/lit8 p2, p2, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    const v4, 0xd800

    .line 144
    .line 145
    .line 146
    const/16 v5, 0x3f

    .line 147
    .line 148
    if-lt v2, v4, :cond_b

    .line 149
    .line 150
    const v4, 0xdfff

    .line 151
    .line 152
    .line 153
    if-le v2, v4, :cond_7

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_7
    add-int/lit8 v6, p2, 0x1

    .line 157
    .line 158
    if-ge v6, p3, :cond_8

    .line 159
    .line 160
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    goto :goto_7

    .line 165
    :cond_8
    move v7, v0

    .line 166
    :goto_7
    const v8, 0xdbff

    .line 167
    .line 168
    .line 169
    if-gt v2, v8, :cond_a

    .line 170
    .line 171
    const v8, 0xdc00

    .line 172
    .line 173
    .line 174
    if-gt v8, v7, :cond_a

    .line 175
    .line 176
    if-ge v4, v7, :cond_9

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_9
    and-int/lit16 v2, v2, 0x3ff

    .line 180
    .line 181
    shl-int/lit8 v2, v2, 0xa

    .line 182
    .line 183
    and-int/lit16 v4, v7, 0x3ff

    .line 184
    .line 185
    or-int/2addr v2, v4

    .line 186
    const/high16 v4, 0x10000

    .line 187
    .line 188
    add-int/2addr v2, v4

    .line 189
    const/4 v4, 0x4

    .line 190
    invoke-virtual {p0, v4}, Li6/f;->p1(I)Li6/x;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    iget-object v7, v6, Li6/x;->a:[B

    .line 195
    .line 196
    iget v8, v6, Li6/x;->c:I

    .line 197
    .line 198
    shr-int/lit8 v9, v2, 0x12

    .line 199
    .line 200
    or-int/lit16 v9, v9, 0xf0

    .line 201
    .line 202
    int-to-byte v9, v9

    .line 203
    aput-byte v9, v7, v8

    .line 204
    .line 205
    add-int/lit8 v9, v8, 0x1

    .line 206
    .line 207
    shr-int/lit8 v10, v2, 0xc

    .line 208
    .line 209
    and-int/2addr v10, v5

    .line 210
    or-int/2addr v10, v3

    .line 211
    int-to-byte v10, v10

    .line 212
    aput-byte v10, v7, v9

    .line 213
    .line 214
    add-int/lit8 v9, v8, 0x2

    .line 215
    .line 216
    shr-int/lit8 v10, v2, 0x6

    .line 217
    .line 218
    and-int/2addr v10, v5

    .line 219
    or-int/2addr v10, v3

    .line 220
    int-to-byte v10, v10

    .line 221
    aput-byte v10, v7, v9

    .line 222
    .line 223
    add-int/lit8 v9, v8, 0x3

    .line 224
    .line 225
    and-int/2addr v2, v5

    .line 226
    or-int/2addr v2, v3

    .line 227
    int-to-byte v2, v2

    .line 228
    aput-byte v2, v7, v9

    .line 229
    .line 230
    add-int/2addr v8, v4

    .line 231
    iput v8, v6, Li6/x;->c:I

    .line 232
    .line 233
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 234
    .line 235
    .line 236
    move-result-wide v2

    .line 237
    const-wide/16 v4, 0x4

    .line 238
    .line 239
    add-long/2addr v2, v4

    .line 240
    invoke-virtual {p0, v2, v3}, Li6/f;->l1(J)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 p2, p2, 0x2

    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :cond_a
    :goto_8
    invoke-virtual {p0, v5}, Li6/f;->t1(I)Li6/f;

    .line 248
    .line 249
    .line 250
    move p2, v6

    .line 251
    goto/16 :goto_3

    .line 252
    .line 253
    :cond_b
    :goto_9
    const/4 v4, 0x3

    .line 254
    invoke-virtual {p0, v4}, Li6/f;->p1(I)Li6/x;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    iget-object v7, v6, Li6/x;->a:[B

    .line 259
    .line 260
    iget v8, v6, Li6/x;->c:I

    .line 261
    .line 262
    shr-int/lit8 v9, v2, 0xc

    .line 263
    .line 264
    or-int/lit16 v9, v9, 0xe0

    .line 265
    .line 266
    int-to-byte v9, v9

    .line 267
    aput-byte v9, v7, v8

    .line 268
    .line 269
    add-int/lit8 v9, v8, 0x1

    .line 270
    .line 271
    shr-int/lit8 v10, v2, 0x6

    .line 272
    .line 273
    and-int/2addr v5, v10

    .line 274
    or-int/2addr v5, v3

    .line 275
    int-to-byte v5, v5

    .line 276
    aput-byte v5, v7, v9

    .line 277
    .line 278
    add-int/lit8 v5, v8, 0x2

    .line 279
    .line 280
    and-int/lit8 v2, v2, 0x3f

    .line 281
    .line 282
    or-int/2addr v2, v3

    .line 283
    int-to-byte v2, v2

    .line 284
    aput-byte v2, v7, v5

    .line 285
    .line 286
    add-int/2addr v8, v4

    .line 287
    iput v8, v6, Li6/x;->c:I

    .line 288
    .line 289
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 290
    .line 291
    .line 292
    move-result-wide v2

    .line 293
    const-wide/16 v4, 0x3

    .line 294
    .line 295
    goto/16 :goto_6

    .line 296
    .line 297
    :cond_c
    return-object p0

    .line 298
    :cond_d
    new-instance p2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    const-string v0, "endIndex > string.length: "

    .line 304
    .line 305
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p3, " > "

    .line 312
    .line 313
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p2

    .line 337
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const-string v0, "endIndex < beginIndex: "

    .line 343
    .line 344
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string p3, " < "

    .line 351
    .line 352
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw p2

    .line 372
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const-string p3, "beginIndex < 0: "

    .line 378
    .line 379
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw p2
.end method

.method public bridge synthetic C(I)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->y1(I)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public C0()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Li6/f;->Z(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public C1(I)Li6/f;
    .locals 8

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->t1(I)Li6/f;

    goto/16 :goto_2

    :cond_0
    const/16 v1, 0x800

    const/16 v2, 0x3f

    if-ge p1, v1, :cond_1

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Li6/f;->p1(I)Li6/x;

    move-result-object v3

    iget-object v4, v3, Li6/x;->a:[B

    iget v5, v3, Li6/x;->c:I

    shr-int/lit8 v6, p1, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Li6/x;->c:I

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    :goto_0
    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Li6/f;->l1(J)V

    goto/16 :goto_2

    :cond_1
    const v1, 0xd800

    if-le v1, p1, :cond_2

    goto :goto_1

    :cond_2
    const v1, 0xdfff

    if-lt v1, p1, :cond_3

    invoke-virtual {p0, v2}, Li6/f;->t1(I)Li6/f;

    goto :goto_2

    :cond_3
    :goto_1
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_4

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Li6/f;->p1(I)Li6/x;

    move-result-object v3

    iget-object v4, v3, Li6/x;->a:[B

    iget v5, v3, Li6/x;->c:I

    shr-int/lit8 v6, p1, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Li6/x;->c:I

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    goto :goto_0

    :cond_4
    const v1, 0x10ffff

    if-gt p1, v1, :cond_5

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Li6/f;->p1(I)Li6/x;

    move-result-object v3

    iget-object v4, v3, Li6/x;->a:[B

    iget v5, v3, Li6/x;->c:I

    shr-int/lit8 v6, p1, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0xc

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x3

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Li6/x;->c:I

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    goto :goto_0

    :goto_2
    return-object p0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected code point: 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Li6/c;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public D0(JLi6/i;II)Z
    .locals 6

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-ltz v0, :cond_3

    .line 12
    .line 13
    if-ltz p4, :cond_3

    .line 14
    .line 15
    if-ltz p5, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v2, p1

    .line 22
    int-to-long v4, p5

    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-ltz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3}, Li6/i;->C()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int/2addr v0, p4

    .line 32
    if-ge v0, p5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v0, v1

    .line 36
    :goto_0
    if-ge v0, p5, :cond_2

    .line 37
    .line 38
    int-to-long v2, v0

    .line 39
    add-long/2addr v2, p1

    .line 40
    invoke-virtual {p0, v2, v3}, Li6/f;->z(J)B

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int v3, p4, v0

    .line 45
    .line 46
    invoke-virtual {p3, v3}, Li6/i;->m(I)B

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eq v2, v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v1, 0x1

    .line 57
    :cond_3
    :goto_1
    return v1
.end method

.method public F()I
    .locals 9

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Li6/f;->m:Li6/x;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v1, v0, Li6/x;->b:I

    iget v4, v0, Li6/x;->c:I

    sub-int v5, v4, v1

    int-to-long v5, v5

    cmp-long v5, v5, v2

    if-gez v5, :cond_0

    invoke-virtual {p0}, Li6/f;->q0()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Li6/f;->q0()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Li6/f;->q0()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Li6/f;->q0()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    goto :goto_1

    :cond_0
    iget-object v5, v0, Li6/x;->a:[B

    add-int/lit8 v6, v1, 0x1

    aget-byte v7, v5, v1

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x18

    add-int/lit8 v8, v1, 0x2

    aget-byte v6, v5, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v6, v7

    add-int/lit8 v7, v1, 0x3

    aget-byte v8, v5, v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v6, v8

    add-int/lit8 v1, v1, 0x4

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v6

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {p0, v6, v7}, Li6/f;->l1(J)V

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    move-result-object v1

    iput-object v1, p0, Li6/f;->m:Li6/x;

    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    goto :goto_0

    :cond_1
    iput v1, v0, Li6/x;->b:I

    :goto_0
    move v0, v5

    :goto_1
    return v0

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public bridge synthetic G(I)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->w1(I)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public G0(J)[B
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    int-to-long v0, v0

    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-gtz v0, :cond_0

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
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    cmp-long v0, v0, p1

    .line 25
    .line 26
    if-ltz v0, :cond_1

    .line 27
    .line 28
    long-to-int p1, p1

    .line 29
    new-array p1, p1, [B

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Li6/f;->u0([B)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "byteCount: "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p2
.end method

.method public bridge synthetic H(Li6/i;)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->q1(Li6/i;)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public J(Li6/i;)J
    .locals 2

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Li6/f;->U(Li6/i;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public J0()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Li6/f;->n:J

    .line 2
    .line 3
    sget-object v2, LF5/d;->b:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, v2}, Li6/f;->j1(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public K()J
    .locals 15

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Li6/f;->m:Li6/x;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v1, v0, Li6/x;->b:I

    iget v4, v0, Li6/x;->c:I

    sub-int v5, v4, v1

    int-to-long v5, v5

    cmp-long v5, v5, v2

    const/16 v6, 0x20

    if-gez v5, :cond_0

    invoke-virtual {p0}, Li6/f;->F()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    shl-long/2addr v0, v6

    invoke-virtual {p0}, Li6/f;->F()I

    move-result v4

    int-to-long v4, v4

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    goto :goto_1

    :cond_0
    iget-object v5, v0, Li6/x;->a:[B

    add-int/lit8 v7, v1, 0x1

    aget-byte v8, v5, v1

    int-to-long v8, v8

    const-wide/16 v10, 0xff

    and-long/2addr v8, v10

    const/16 v12, 0x38

    shl-long/2addr v8, v12

    add-int/lit8 v12, v1, 0x2

    aget-byte v7, v5, v7

    int-to-long v13, v7

    and-long/2addr v13, v10

    const/16 v7, 0x30

    shl-long/2addr v13, v7

    or-long v7, v8, v13

    add-int/lit8 v9, v1, 0x3

    aget-byte v12, v5, v12

    int-to-long v12, v12

    and-long/2addr v12, v10

    const/16 v14, 0x28

    shl-long/2addr v12, v14

    or-long/2addr v7, v12

    add-int/lit8 v12, v1, 0x4

    aget-byte v9, v5, v9

    int-to-long v13, v9

    and-long/2addr v13, v10

    shl-long/2addr v13, v6

    or-long v6, v7, v13

    add-int/lit8 v8, v1, 0x5

    aget-byte v9, v5, v12

    int-to-long v12, v9

    and-long/2addr v12, v10

    const/16 v9, 0x18

    shl-long/2addr v12, v9

    or-long/2addr v6, v12

    add-int/lit8 v9, v1, 0x6

    aget-byte v8, v5, v8

    int-to-long v12, v8

    and-long/2addr v12, v10

    const/16 v8, 0x10

    shl-long/2addr v12, v8

    or-long/2addr v6, v12

    add-int/lit8 v8, v1, 0x7

    aget-byte v9, v5, v9

    int-to-long v12, v9

    and-long/2addr v12, v10

    const/16 v9, 0x8

    shl-long/2addr v12, v9

    or-long/2addr v6, v12

    add-int/2addr v1, v9

    aget-byte v5, v5, v8

    int-to-long v8, v5

    and-long/2addr v8, v10

    or-long v5, v6, v8

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    sub-long/2addr v7, v2

    invoke-virtual {p0, v7, v8}, Li6/f;->l1(J)V

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    move-result-object v1

    iput-object v1, p0, Li6/f;->m:Li6/x;

    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    goto :goto_0

    :cond_1
    iput v1, v0, Li6/x;->b:I

    :goto_0
    move-wide v0, v5

    :goto_1
    return-wide v0

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public bridge synthetic K0([B)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->r1([B)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public L0(Li6/f;J)J
    .locals 4

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    if-ltz v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmp-long v0, v2, v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-wide/16 p1, -0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    cmp-long v0, p2, v0

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    :cond_2
    invoke-virtual {p1, p0, p2, p3}, Li6/f;->w0(Li6/f;J)V

    .line 41
    .line 42
    .line 43
    move-wide p1, p2

    .line 44
    :goto_1
    return-wide p1

    .line 45
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v0, "byteCount < 0: "

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p2
.end method

.method public M()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Li6/f;->G0(J)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public M0([BII)I
    .locals 7

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    int-to-long v1, v0

    .line 8
    int-to-long v3, p2

    .line 9
    int-to-long v5, p3

    .line 10
    invoke-static/range {v1 .. v6}, Li6/c;->b(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v1, v0, Li6/x;->c:I

    .line 18
    .line 19
    iget v2, v0, Li6/x;->b:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    iget-object v1, v0, Li6/x;->a:[B

    .line 27
    .line 28
    iget v2, v0, Li6/x;->b:I

    .line 29
    .line 30
    add-int v3, v2, p3

    .line 31
    .line 32
    invoke-static {v1, p1, p2, v2, v3}, Lj5/h;->d([B[BIII)[B

    .line 33
    .line 34
    .line 35
    iget p1, v0, Li6/x;->b:I

    .line 36
    .line 37
    add-int/2addr p1, p3

    .line 38
    iput p1, v0, Li6/x;->b:I

    .line 39
    .line 40
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    int-to-long v1, p3

    .line 45
    sub-long/2addr p1, v1

    .line 46
    invoke-virtual {p0, p1, p2}, Li6/f;->l1(J)V

    .line 47
    .line 48
    .line 49
    iget p1, v0, Li6/x;->b:I

    .line 50
    .line 51
    iget p2, v0, Li6/x;->c:I

    .line 52
    .line 53
    if-ne p1, p2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Li6/f;->m:Li6/x;

    .line 60
    .line 61
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p3, -0x1

    .line 66
    :cond_1
    :goto_0
    return p3
.end method

.method public O()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Li6/f;->n:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method

.method public O0()S
    .locals 9

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x2

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 12
    .line 13
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget v1, v0, Li6/x;->b:I

    .line 17
    .line 18
    iget v4, v0, Li6/x;->c:I

    .line 19
    .line 20
    sub-int v5, v4, v1

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    if-ge v5, v6, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Li6/f;->q0()B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x8

    .line 32
    .line 33
    invoke-virtual {p0}, Li6/f;->q0()B

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit16 v1, v1, 0xff

    .line 38
    .line 39
    or-int/2addr v0, v1

    .line 40
    int-to-short v0, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    iget-object v5, v0, Li6/x;->a:[B

    .line 43
    .line 44
    add-int/lit8 v7, v1, 0x1

    .line 45
    .line 46
    aget-byte v8, v5, v1

    .line 47
    .line 48
    and-int/lit16 v8, v8, 0xff

    .line 49
    .line 50
    shl-int/lit8 v8, v8, 0x8

    .line 51
    .line 52
    add-int/2addr v1, v6

    .line 53
    aget-byte v5, v5, v7

    .line 54
    .line 55
    and-int/lit16 v5, v5, 0xff

    .line 56
    .line 57
    or-int/2addr v5, v8

    .line 58
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    sub-long/2addr v6, v2

    .line 63
    invoke-virtual {p0, v6, v7}, Li6/f;->l1(J)V

    .line 64
    .line 65
    .line 66
    if-ne v1, v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, p0, Li6/f;->m:Li6/x;

    .line 73
    .line 74
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iput v1, v0, Li6/x;->b:I

    .line 79
    .line 80
    :goto_0
    int-to-short v0, v5

    .line 81
    :goto_1
    return v0

    .line 82
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw v0
.end method

.method public bridge synthetic P(I)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->t1(I)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R(Li6/t;)I
    .locals 3

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, p1, v2, v0, v1}, Lj6/a;->e(Li6/f;Li6/t;ZILjava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Li6/t;->k()[Li6/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    aget-object p1, p1, v0

    .line 23
    .line 24
    invoke-virtual {p1}, Li6/i;->C()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-long v1, p1

    .line 29
    invoke-virtual {p0, v1, v2}, Li6/f;->y0(J)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return v0
.end method

.method public final R0(Li6/f$a;)Li6/f$a;
    .locals 2

    .line 1
    const-string v0, "unsafeCursor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Li6/f$a;->m:Li6/f;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iput-object p0, p1, Li6/f$a;->m:Li6/f;

    .line 17
    .line 18
    iput-boolean v1, p1, Li6/f$a;->n:Z

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "already attached to a buffer"

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public U(Li6/i;J)J
    .locals 18

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    const-string v2, "bytes"

    .line 4
    .line 5
    move-object/from16 v3, p1

    .line 6
    .line 7
    invoke-static {v3, v2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Li6/i;->C()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v4, 0x0

    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    if-eqz v2, :cond_c

    .line 21
    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    cmp-long v2, v0, v6

    .line 25
    .line 26
    if-ltz v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v4

    .line 31
    :goto_1
    if-eqz v2, :cond_b

    .line 32
    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    iget-object v8, v2, Li6/f;->m:Li6/x;

    .line 36
    .line 37
    if-eqz v8, :cond_5

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 40
    .line 41
    .line 42
    move-result-wide v11

    .line 43
    sub-long/2addr v11, v0

    .line 44
    cmp-long v11, v11, v0

    .line 45
    .line 46
    const-wide/16 v12, 0x1

    .line 47
    .line 48
    if-gez v11, :cond_6

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    :goto_2
    cmp-long v11, v6, v0

    .line 55
    .line 56
    if-lez v11, :cond_2

    .line 57
    .line 58
    iget-object v8, v8, Li6/x;->g:Li6/x;

    .line 59
    .line 60
    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget v11, v8, Li6/x;->c:I

    .line 64
    .line 65
    iget v14, v8, Li6/x;->b:I

    .line 66
    .line 67
    sub-int/2addr v11, v14

    .line 68
    int-to-long v14, v11

    .line 69
    sub-long/2addr v6, v14

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual/range {p1 .. p1}, Li6/i;->s()[B

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    aget-byte v4, v11, v4

    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Li6/i;->C()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    int-to-long v9, v3

    .line 86
    sub-long/2addr v14, v9

    .line 87
    add-long/2addr v14, v12

    .line 88
    :goto_3
    cmp-long v9, v6, v14

    .line 89
    .line 90
    if-gez v9, :cond_5

    .line 91
    .line 92
    iget-object v9, v8, Li6/x;->a:[B

    .line 93
    .line 94
    iget v10, v8, Li6/x;->c:I

    .line 95
    .line 96
    iget v12, v8, Li6/x;->b:I

    .line 97
    .line 98
    int-to-long v12, v12

    .line 99
    add-long/2addr v12, v14

    .line 100
    sub-long/2addr v12, v6

    .line 101
    move-wide/from16 p1, v6

    .line 102
    .line 103
    int-to-long v5, v10

    .line 104
    invoke-static {v5, v6, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    long-to-int v5, v5

    .line 109
    iget v6, v8, Li6/x;->b:I

    .line 110
    .line 111
    int-to-long v6, v6

    .line 112
    add-long/2addr v6, v0

    .line 113
    move-wide/from16 v0, p1

    .line 114
    .line 115
    sub-long/2addr v6, v0

    .line 116
    long-to-int v6, v6

    .line 117
    :goto_4
    if-ge v6, v5, :cond_4

    .line 118
    .line 119
    aget-byte v7, v9, v6

    .line 120
    .line 121
    if-ne v7, v4, :cond_3

    .line 122
    .line 123
    add-int/lit8 v7, v6, 0x1

    .line 124
    .line 125
    const/4 v10, 0x1

    .line 126
    invoke-static {v8, v7, v11, v10, v3}, Lj6/a;->b(Li6/x;I[BII)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_3

    .line 131
    .line 132
    iget v3, v8, Li6/x;->b:I

    .line 133
    .line 134
    sub-int/2addr v6, v3

    .line 135
    int-to-long v3, v6

    .line 136
    add-long v9, v3, v0

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    iget v5, v8, Li6/x;->c:I

    .line 144
    .line 145
    iget v6, v8, Li6/x;->b:I

    .line 146
    .line 147
    sub-int/2addr v5, v6

    .line 148
    int-to-long v5, v5

    .line 149
    add-long v6, v0, v5

    .line 150
    .line 151
    iget-object v8, v8, Li6/x;->f:Li6/x;

    .line 152
    .line 153
    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-wide v0, v6

    .line 157
    goto :goto_3

    .line 158
    :cond_5
    const-wide/16 v9, -0x1

    .line 159
    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :cond_6
    :goto_5
    iget v5, v8, Li6/x;->c:I

    .line 163
    .line 164
    iget v9, v8, Li6/x;->b:I

    .line 165
    .line 166
    sub-int/2addr v5, v9

    .line 167
    int-to-long v9, v5

    .line 168
    add-long/2addr v9, v6

    .line 169
    cmp-long v5, v9, v0

    .line 170
    .line 171
    if-lez v5, :cond_a

    .line 172
    .line 173
    invoke-virtual/range {p1 .. p1}, Li6/i;->s()[B

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    aget-byte v4, v5, v4

    .line 178
    .line 179
    invoke-virtual/range {p1 .. p1}, Li6/i;->C()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 184
    .line 185
    .line 186
    move-result-wide v9

    .line 187
    int-to-long v14, v3

    .line 188
    sub-long/2addr v9, v14

    .line 189
    add-long/2addr v9, v12

    .line 190
    :goto_6
    cmp-long v11, v6, v9

    .line 191
    .line 192
    if-gez v11, :cond_5

    .line 193
    .line 194
    iget-object v11, v8, Li6/x;->a:[B

    .line 195
    .line 196
    iget v12, v8, Li6/x;->c:I

    .line 197
    .line 198
    iget v13, v8, Li6/x;->b:I

    .line 199
    .line 200
    int-to-long v13, v13

    .line 201
    add-long/2addr v13, v9

    .line 202
    sub-long/2addr v13, v6

    .line 203
    move-wide/from16 v16, v9

    .line 204
    .line 205
    int-to-long v9, v12

    .line 206
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 207
    .line 208
    .line 209
    move-result-wide v9

    .line 210
    long-to-int v9, v9

    .line 211
    iget v10, v8, Li6/x;->b:I

    .line 212
    .line 213
    int-to-long v12, v10

    .line 214
    add-long/2addr v12, v0

    .line 215
    sub-long/2addr v12, v6

    .line 216
    long-to-int v0, v12

    .line 217
    :goto_7
    if-ge v0, v9, :cond_9

    .line 218
    .line 219
    aget-byte v1, v11, v0

    .line 220
    .line 221
    if-ne v1, v4, :cond_7

    .line 222
    .line 223
    add-int/lit8 v1, v0, 0x1

    .line 224
    .line 225
    const/4 v14, 0x1

    .line 226
    invoke-static {v8, v1, v5, v14, v3}, Lj6/a;->b(Li6/x;I[BII)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_8

    .line 231
    .line 232
    iget v1, v8, Li6/x;->b:I

    .line 233
    .line 234
    sub-int/2addr v0, v1

    .line 235
    int-to-long v0, v0

    .line 236
    add-long v9, v0, v6

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_7
    const/4 v14, 0x1

    .line 240
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_9
    const/4 v14, 0x1

    .line 244
    iget v0, v8, Li6/x;->c:I

    .line 245
    .line 246
    iget v1, v8, Li6/x;->b:I

    .line 247
    .line 248
    sub-int/2addr v0, v1

    .line 249
    int-to-long v0, v0

    .line 250
    add-long/2addr v6, v0

    .line 251
    iget-object v8, v8, Li6/x;->f:Li6/x;

    .line 252
    .line 253
    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-wide v0, v6

    .line 257
    move-wide/from16 v9, v16

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_a
    const/4 v14, 0x1

    .line 261
    iget-object v8, v8, Li6/x;->f:Li6/x;

    .line 262
    .line 263
    invoke-static {v8}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    move-wide v6, v9

    .line 267
    goto :goto_5

    .line 268
    :goto_8
    return-wide v9

    .line 269
    :cond_b
    move-object/from16 v2, p0

    .line 270
    .line 271
    new-instance v3, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v4, "fromIndex < 0: "

    .line 277
    .line 278
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v1

    .line 298
    :cond_c
    move-object/from16 v2, p0

    .line 299
    .line 300
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    const-string v1, "bytes is empty"

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public W(Li6/i;)J
    .locals 2

    .line 1
    const-string v0, "targetBytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Li6/f;->h0(Li6/i;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public W0(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Li6/f;->n:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public bridge synthetic X()Li6/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->l()Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic X0(J)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Li6/f;->u1(J)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public Y()J
    .locals 15

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    const-wide/16 v4, -0x7

    move v1, v0

    move-wide v5, v4

    move-wide v3, v2

    move v2, v1

    :cond_0
    iget-object v7, p0, Li6/f;->m:Li6/x;

    invoke-static {v7}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v8, v7, Li6/x;->a:[B

    iget v9, v7, Li6/x;->b:I

    iget v10, v7, Li6/x;->c:I

    :goto_0
    if-ge v9, v10, :cond_7

    aget-byte v11, v8, v9

    const/16 v12, 0x30

    int-to-byte v12, v12

    if-lt v11, v12, :cond_4

    const/16 v13, 0x39

    int-to-byte v13, v13

    if-gt v11, v13, :cond_4

    sub-int/2addr v12, v11

    const-wide v13, -0xcccccccccccccccL

    cmp-long v13, v3, v13

    if-ltz v13, :cond_2

    if-nez v13, :cond_1

    int-to-long v13, v12

    cmp-long v13, v13, v5

    if-gez v13, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v13, 0xa

    mul-long/2addr v3, v13

    int-to-long v11, v12

    add-long/2addr v3, v11

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v0, Li6/f;

    invoke-direct {v0}, Li6/f;-><init>()V

    invoke-virtual {v0, v3, v4}, Li6/f;->u1(J)Li6/f;

    move-result-object v0

    invoke-virtual {v0, v11}, Li6/f;->t1(I)Li6/f;

    move-result-object v0

    if-nez v1, :cond_3

    invoke-virtual {v0}, Li6/f;->q0()B

    :cond_3
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Number too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Li6/f;->J0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const/16 v12, 0x2d

    int-to-byte v12, v12

    const/4 v13, 0x1

    if-ne v11, v12, :cond_5

    if-nez v0, :cond_5

    const-wide/16 v11, 0x1

    sub-long/2addr v5, v11

    move v1, v13

    :goto_2
    add-int/lit8 v9, v9, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_6

    move v2, v13

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected leading [0-9] or \'-\' character but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Li6/c;->e(B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    if-ne v9, v10, :cond_8

    invoke-virtual {v7}, Li6/x;->b()Li6/x;

    move-result-object v8

    iput-object v8, p0, Li6/f;->m:Li6/x;

    invoke-static {v7}, Li6/y;->b(Li6/x;)V

    goto :goto_4

    :cond_8
    iput v9, v7, Li6/x;->b:I

    :goto_4
    if-nez v2, :cond_9

    iget-object v7, p0, Li6/f;->m:Li6/x;

    if-nez v7, :cond_0

    :cond_9
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v5

    int-to-long v7, v0

    sub-long/2addr v5, v7

    invoke-virtual {p0, v5, v6}, Li6/f;->l1(J)V

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    neg-long v3, v3

    :goto_5
    return-wide v3

    :cond_b
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public Z(J)Ljava/lang/String;
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    add-long v0, p1, v3

    :goto_1
    const/16 v2, 0xa

    int-to-byte v2, v2

    const-wide/16 v7, 0x0

    move-object v5, p0

    move v6, v2

    move-wide v9, v0

    .line 1
    invoke-virtual/range {v5 .. v10}, Li6/f;->B(BJJ)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v7, v5, v7

    if-eqz v7, :cond_2

    invoke-static {p0, v5, v6}, Lj6/a;->c(Li6/f;J)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v5

    cmp-long v5, v0, v5

    if-gez v5, :cond_3

    sub-long v3, v0, v3

    invoke-virtual {p0, v3, v4}, Li6/f;->z(J)B

    move-result v3

    const/16 v4, 0xd

    int-to-byte v4, v4

    if-ne v3, v4, :cond_3

    invoke-virtual {p0, v0, v1}, Li6/f;->z(J)B

    move-result v3

    if-ne v3, v2, :cond_3

    invoke-static {p0, v0, v1}, Lj6/a;->c(Li6/f;J)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    new-instance v6, Li6/f;

    invoke-direct {v6}, Li6/f;-><init>()V

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const/16 v2, 0x20

    int-to-long v2, v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Li6/f;->g(Li6/f;JJ)Li6/f;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: limit="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Li6/f;->f1()Li6/i;

    move-result-object p1

    invoke-virtual {p1}, Li6/i;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public Z0()Ljava/io/OutputStream;
    .locals 1

    .line 1
    new-instance v0, Li6/f$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li6/f$c;-><init>(Li6/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Li6/f;->y0(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b()Li6/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->e()Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c1()J
    .locals 14

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    move v1, v0

    move-wide v4, v2

    :cond_0
    iget-object v6, p0, Li6/f;->m:Li6/x;

    invoke-static {v6}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v7, v6, Li6/x;->a:[B

    iget v8, v6, Li6/x;->b:I

    iget v9, v6, Li6/x;->c:I

    :goto_0
    if-ge v8, v9, :cond_6

    aget-byte v10, v7, v8

    const/16 v11, 0x30

    int-to-byte v11, v11

    if-lt v10, v11, :cond_1

    const/16 v12, 0x39

    int-to-byte v12, v12

    if-gt v10, v12, :cond_1

    sub-int v11, v10, v11

    goto :goto_2

    :cond_1
    const/16 v11, 0x61

    int-to-byte v11, v11

    if-lt v10, v11, :cond_2

    const/16 v12, 0x66

    int-to-byte v12, v12

    if-gt v10, v12, :cond_2

    :goto_1
    sub-int v11, v10, v11

    add-int/lit8 v11, v11, 0xa

    goto :goto_2

    :cond_2
    const/16 v11, 0x41

    int-to-byte v11, v11

    if-lt v10, v11, :cond_4

    const/16 v12, 0x46

    int-to-byte v12, v12

    if-gt v10, v12, :cond_4

    goto :goto_1

    :goto_2
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v12, v4

    cmp-long v12, v12, v2

    if-nez v12, :cond_3

    const/4 v10, 0x4

    shl-long/2addr v4, v10

    int-to-long v10, v11

    or-long/2addr v4, v10

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    new-instance v0, Li6/f;

    invoke-direct {v0}, Li6/f;-><init>()V

    invoke-virtual {v0, v4, v5}, Li6/f;->v1(J)Li6/f;

    move-result-object v0

    invoke-virtual {v0, v10}, Li6/f;->t1(I)Li6/f;

    move-result-object v0

    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Number too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Li6/f;->J0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    if-eqz v0, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Li6/c;->e(B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_3
    if-ne v8, v9, :cond_7

    invoke-virtual {v6}, Li6/x;->b()Li6/x;

    move-result-object v7

    iput-object v7, p0, Li6/f;->m:Li6/x;

    invoke-static {v6}, Li6/y;->b(Li6/x;)V

    goto :goto_4

    :cond_7
    iput v8, v6, Li6/x;->b:I

    :goto_4
    if-nez v1, :cond_8

    iget-object v6, p0, Li6/f;->m:Li6/x;

    if-nez v6, :cond_0

    :cond_8
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v1

    int-to-long v6, v0

    sub-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Li6/f;->l1(J)V

    return-wide v4

    :cond_9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->b()Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p0, Li6/f;->m:Li6/x;

    .line 13
    .line 14
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Li6/x;->g:Li6/x;

    .line 18
    .line 19
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget v3, v2, Li6/x;->c:I

    .line 23
    .line 24
    const/16 v4, 0x2000

    .line 25
    .line 26
    if-ge v3, v4, :cond_1

    .line 27
    .line 28
    iget-boolean v4, v2, Li6/x;->e:Z

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget v2, v2, Li6/x;->b:I

    .line 33
    .line 34
    sub-int/2addr v3, v2

    .line 35
    int-to-long v2, v3

    .line 36
    sub-long/2addr v0, v2

    .line 37
    :cond_1
    move-wide v2, v0

    .line 38
    :goto_0
    return-wide v2
.end method

.method public d1(Li6/A;)J
    .locals 4

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-lez v2, :cond_0

    .line 15
    .line 16
    invoke-interface {p1, p0, v0, v1}, Li6/A;->w0(Li6/f;J)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-wide v0
.end method

.method public final e()Li6/f;
    .locals 6

    .line 1
    new-instance v0, Li6/f;

    .line 2
    .line 3
    invoke-direct {v0}, Li6/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v1, p0, Li6/f;->m:Li6/x;

    .line 18
    .line 19
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Li6/x;->d()Li6/x;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v0, Li6/f;->m:Li6/x;

    .line 27
    .line 28
    iput-object v2, v2, Li6/x;->g:Li6/x;

    .line 29
    .line 30
    iput-object v2, v2, Li6/x;->f:Li6/x;

    .line 31
    .line 32
    iget-object v3, v1, Li6/x;->f:Li6/x;

    .line 33
    .line 34
    :goto_0
    if-eq v3, v1, :cond_1

    .line 35
    .line 36
    iget-object v4, v2, Li6/x;->g:Li6/x;

    .line 37
    .line 38
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Li6/x;->d()Li6/x;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v4, v5}, Li6/x;->c(Li6/x;)Li6/x;

    .line 49
    .line 50
    .line 51
    iget-object v3, v3, Li6/x;->f:Li6/x;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    invoke-virtual {v0, v1, v2}, Li6/f;->l1(J)V

    .line 59
    .line 60
    .line 61
    :goto_1
    return-object v0
.end method

.method public e1()Ljava/io/InputStream;
    .locals 1

    .line 1
    new-instance v0, Li6/f$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li6/f$b;-><init>(Li6/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    instance-of v3, v1, Li6/f;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    :goto_0
    move v2, v4

    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    check-cast v1, Li6/f;

    .line 23
    .line 24
    invoke-virtual {v1}, Li6/f;->m1()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    cmp-long v3, v5, v7

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    cmp-long v3, v5, v7

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    iget-object v3, v0, Li6/f;->m:Li6/x;

    .line 45
    .line 46
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, Li6/f;->m:Li6/x;

    .line 50
    .line 51
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget v5, v3, Li6/x;->b:I

    .line 55
    .line 56
    iget v6, v1, Li6/x;->b:I

    .line 57
    .line 58
    move-wide v9, v7

    .line 59
    :goto_1
    invoke-virtual/range {p0 .. p0}, Li6/f;->m1()J

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    cmp-long v11, v9, v11

    .line 64
    .line 65
    if-gez v11, :cond_8

    .line 66
    .line 67
    iget v11, v3, Li6/x;->c:I

    .line 68
    .line 69
    sub-int/2addr v11, v5

    .line 70
    iget v12, v1, Li6/x;->c:I

    .line 71
    .line 72
    sub-int/2addr v12, v6

    .line 73
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    int-to-long v11, v11

    .line 78
    move-wide v13, v7

    .line 79
    :goto_2
    cmp-long v15, v13, v11

    .line 80
    .line 81
    if-gez v15, :cond_5

    .line 82
    .line 83
    iget-object v15, v3, Li6/x;->a:[B

    .line 84
    .line 85
    add-int/lit8 v16, v5, 0x1

    .line 86
    .line 87
    aget-byte v5, v15, v5

    .line 88
    .line 89
    iget-object v15, v1, Li6/x;->a:[B

    .line 90
    .line 91
    add-int/lit8 v17, v6, 0x1

    .line 92
    .line 93
    aget-byte v6, v15, v6

    .line 94
    .line 95
    if-eq v5, v6, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    const-wide/16 v5, 0x1

    .line 99
    .line 100
    add-long/2addr v13, v5

    .line 101
    move/from16 v5, v16

    .line 102
    .line 103
    move/from16 v6, v17

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    iget v13, v3, Li6/x;->c:I

    .line 107
    .line 108
    if-ne v5, v13, :cond_6

    .line 109
    .line 110
    iget-object v3, v3, Li6/x;->f:Li6/x;

    .line 111
    .line 112
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget v5, v3, Li6/x;->b:I

    .line 116
    .line 117
    :cond_6
    iget v13, v1, Li6/x;->c:I

    .line 118
    .line 119
    if-ne v6, v13, :cond_7

    .line 120
    .line 121
    iget-object v1, v1, Li6/x;->f:Li6/x;

    .line 122
    .line 123
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget v6, v1, Li6/x;->b:I

    .line 127
    .line 128
    :cond_7
    add-long/2addr v9, v11

    .line 129
    goto :goto_1

    .line 130
    :cond_8
    :goto_3
    return v2
.end method

.method public f1()Li6/i;
    .locals 2

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Li6/f;->t(J)Li6/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Li6/f;JJ)Li6/f;
    .locals 7

    .line 1
    const-string v0, "out"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    move-wide v3, p2

    .line 11
    move-wide v5, p4

    .line 12
    invoke-static/range {v1 .. v6}, Li6/c;->b(JJJ)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long v2, p4, v0

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    add-long/2addr v2, p4

    .line 27
    invoke-virtual {p1, v2, v3}, Li6/f;->l1(J)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Li6/f;->m:Li6/x;

    .line 31
    .line 32
    :goto_0
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget v3, v2, Li6/x;->c:I

    .line 36
    .line 37
    iget v4, v2, Li6/x;->b:I

    .line 38
    .line 39
    sub-int v5, v3, v4

    .line 40
    .line 41
    int-to-long v5, v5

    .line 42
    cmp-long v5, p2, v5

    .line 43
    .line 44
    if-ltz v5, :cond_1

    .line 45
    .line 46
    sub-int/2addr v3, v4

    .line 47
    int-to-long v3, v3

    .line 48
    sub-long/2addr p2, v3

    .line 49
    iget-object v2, v2, Li6/x;->f:Li6/x;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    cmp-long v3, p4, v0

    .line 53
    .line 54
    if-lez v3, :cond_3

    .line 55
    .line 56
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Li6/x;->d()Li6/x;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v4, v3, Li6/x;->b:I

    .line 64
    .line 65
    long-to-int p2, p2

    .line 66
    add-int/2addr v4, p2

    .line 67
    iput v4, v3, Li6/x;->b:I

    .line 68
    .line 69
    long-to-int p2, p4

    .line 70
    add-int/2addr v4, p2

    .line 71
    iget p2, v3, Li6/x;->c:I

    .line 72
    .line 73
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iput p2, v3, Li6/x;->c:I

    .line 78
    .line 79
    iget-object p2, p1, Li6/f;->m:Li6/x;

    .line 80
    .line 81
    if-nez p2, :cond_2

    .line 82
    .line 83
    iput-object v3, v3, Li6/x;->g:Li6/x;

    .line 84
    .line 85
    iput-object v3, v3, Li6/x;->f:Li6/x;

    .line 86
    .line 87
    iput-object v3, p1, Li6/f;->m:Li6/x;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p2, Li6/x;->g:Li6/x;

    .line 94
    .line 95
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v3}, Li6/x;->c(Li6/x;)Li6/x;

    .line 99
    .line 100
    .line 101
    :goto_2
    iget p2, v3, Li6/x;->c:I

    .line 102
    .line 103
    iget p3, v3, Li6/x;->b:I

    .line 104
    .line 105
    sub-int/2addr p2, p3

    .line 106
    int-to-long p2, p2

    .line 107
    sub-long/2addr p4, p2

    .line 108
    iget-object v2, v2, Li6/x;->f:Li6/x;

    .line 109
    .line 110
    move-wide p2, v0

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    :goto_3
    return-object p0
.end method

.method public h()Li6/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public h0(Li6/i;J)J
    .locals 11

    .line 1
    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_12

    iget-object v2, p0, Li6/f;->m:Li6/x;

    const-wide/16 v5, -0x1

    if-eqz v2, :cond_11

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    sub-long/2addr v7, p2

    cmp-long v7, v7, p2

    const/4 v8, 0x2

    if-gez v7, :cond_9

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v0

    :goto_1
    cmp-long v7, v0, p2

    if-lez v7, :cond_1

    iget-object v2, v2, Li6/x;->g:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    iget v7, v2, Li6/x;->c:I

    iget v9, v2, Li6/x;->b:I

    sub-int/2addr v7, v9

    int-to-long v9, v7

    sub-long/2addr v0, v9

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Li6/i;->C()I

    move-result v7

    if-ne v7, v8, :cond_5

    invoke-virtual {p1, v3}, Li6/i;->m(I)B

    move-result v3

    invoke-virtual {p1, v4}, Li6/i;->m(I)B

    move-result p1

    :goto_2
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    cmp-long v4, v0, v7

    if-gez v4, :cond_11

    iget-object v4, v2, Li6/x;->a:[B

    iget v7, v2, Li6/x;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Li6/x;->c:I

    :goto_3
    if-ge p2, p3, :cond_4

    aget-byte v7, v4, p2

    if-eq v7, v3, :cond_3

    if-ne v7, p1, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    iget p1, v2, Li6/x;->b:I

    sub-int/2addr p2, p1

    int-to-long p1, p2

    add-long v5, p1, v0

    goto/16 :goto_e

    :cond_4
    iget p2, v2, Li6/x;->c:I

    iget p3, v2, Li6/x;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Li6/x;->f:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Li6/i;->s()[B

    move-result-object p1

    :goto_5
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    cmp-long v4, v0, v7

    if-gez v4, :cond_11

    iget-object v4, v2, Li6/x;->a:[B

    iget v7, v2, Li6/x;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Li6/x;->c:I

    :goto_6
    if-ge p2, p3, :cond_8

    aget-byte v7, v4, p2

    array-length v8, p1

    move v9, v3

    :goto_7
    if-ge v9, v8, :cond_7

    aget-byte v10, p1, v9

    if-ne v7, v10, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_8
    iget p2, v2, Li6/x;->c:I

    iget p3, v2, Li6/x;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Li6/x;->f:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_5

    :cond_9
    :goto_8
    iget v7, v2, Li6/x;->c:I

    iget v9, v2, Li6/x;->b:I

    sub-int/2addr v7, v9

    int-to-long v9, v7

    add-long/2addr v9, v0

    cmp-long v7, v9, p2

    if-lez v7, :cond_10

    invoke-virtual {p1}, Li6/i;->C()I

    move-result v7

    if-ne v7, v8, :cond_c

    invoke-virtual {p1, v3}, Li6/i;->m(I)B

    move-result v3

    invoke-virtual {p1, v4}, Li6/i;->m(I)B

    move-result p1

    :goto_9
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    cmp-long v4, v0, v7

    if-gez v4, :cond_11

    iget-object v4, v2, Li6/x;->a:[B

    iget v7, v2, Li6/x;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Li6/x;->c:I

    :goto_a
    if-ge p2, p3, :cond_b

    aget-byte v7, v4, p2

    if-eq v7, v3, :cond_3

    if-ne v7, p1, :cond_a

    goto/16 :goto_4

    :cond_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_a

    :cond_b
    iget p2, v2, Li6/x;->c:I

    iget p3, v2, Li6/x;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Li6/x;->f:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_9

    :cond_c
    invoke-virtual {p1}, Li6/i;->s()[B

    move-result-object p1

    :goto_b
    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide v7

    cmp-long v4, v0, v7

    if-gez v4, :cond_11

    iget-object v4, v2, Li6/x;->a:[B

    iget v7, v2, Li6/x;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Li6/x;->c:I

    :goto_c
    if-ge p2, p3, :cond_f

    aget-byte v7, v4, p2

    array-length v8, p1

    move v9, v3

    :goto_d
    if-ge v9, v8, :cond_e

    aget-byte v10, p1, v9

    if-ne v7, v10, :cond_d

    goto/16 :goto_4

    :cond_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_d

    :cond_e
    add-int/lit8 p2, p2, 0x1

    goto :goto_c

    :cond_f
    iget p2, v2, Li6/x;->c:I

    iget p3, v2, Li6/x;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Li6/x;->f:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_b

    :cond_10
    iget-object v2, v2, Li6/x;->f:Li6/x;

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    move-wide v0, v9

    goto/16 :goto_8

    :cond_11
    :goto_e
    return-wide v5

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "fromIndex < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public h1()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->F()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Li6/c;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :cond_0
    iget v2, v0, Li6/x;->b:I

    .line 7
    .line 8
    iget v3, v0, Li6/x;->c:I

    .line 9
    .line 10
    :goto_0
    if-ge v2, v3, :cond_1

    .line 11
    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v4, v0, Li6/x;->a:[B

    .line 15
    .line 16
    aget-byte v4, v4, v2

    .line 17
    .line 18
    add-int/2addr v1, v4

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, v0, Li6/x;->f:Li6/x;

    .line 23
    .line 24
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Li6/f;->m:Li6/x;

    .line 28
    .line 29
    if-ne v0, v2, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    :goto_1
    return v1
.end method

.method public i()Li6/D;
    .locals 1

    .line 1
    sget-object v0, Li6/D;->d:Li6/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public i1()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->O0()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Li6/c;->d(S)S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public j()Li6/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public j0(JLi6/i;)Z
    .locals 7

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Li6/i;->C()I

    .line 7
    .line 8
    .line 9
    move-result v6

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-wide v2, p1

    .line 13
    move-object v4, p3

    .line 14
    invoke-virtual/range {v1 .. v6}, Li6/f;->D0(JLi6/i;II)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public j1(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "charset"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    const v1, 0x7fffffff

    .line 13
    .line 14
    .line 15
    int-to-long v1, v1

    .line 16
    cmp-long v1, p1, v1

    .line 17
    .line 18
    if-gtz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_5

    .line 24
    .line 25
    iget-wide v1, p0, Li6/f;->n:J

    .line 26
    .line 27
    cmp-long v1, v1, p1

    .line 28
    .line 29
    if-ltz v1, :cond_4

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string p1, ""

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 37
    .line 38
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget v1, v0, Li6/x;->b:I

    .line 42
    .line 43
    int-to-long v2, v1

    .line 44
    add-long/2addr v2, p1

    .line 45
    iget v4, v0, Li6/x;->c:I

    .line 46
    .line 47
    int-to-long v4, v4

    .line 48
    cmp-long v2, v2, v4

    .line 49
    .line 50
    if-lez v2, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Li6/f;->G0(J)[B

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {p2, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 59
    .line 60
    .line 61
    return-object p2

    .line 62
    :cond_2
    iget-object v2, v0, Li6/x;->a:[B

    .line 63
    .line 64
    long-to-int v3, p1

    .line 65
    new-instance v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {v4, v2, v1, v3, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 68
    .line 69
    .line 70
    iget p3, v0, Li6/x;->b:I

    .line 71
    .line 72
    add-int/2addr p3, v3

    .line 73
    iput p3, v0, Li6/x;->b:I

    .line 74
    .line 75
    iget-wide v1, p0, Li6/f;->n:J

    .line 76
    .line 77
    sub-long/2addr v1, p1

    .line 78
    iput-wide v1, p0, Li6/f;->n:J

    .line 79
    .line 80
    iget p1, v0, Li6/x;->c:I

    .line 81
    .line 82
    if-ne p3, p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Li6/f;->m:Li6/x;

    .line 89
    .line 90
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-object v4

    .line 94
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_5
    new-instance p3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v0, "byteCount: "

    .line 106
    .line 107
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p2
.end method

.method public bridge synthetic k0(Ljava/lang/String;)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->A1(Ljava/lang/String;)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k1(J)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LF5/d;->b:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Li6/f;->j1(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public l()Li6/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final l1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Li6/f;->n:J

    .line 2
    .line 3
    return-void
.end method

.method public m0(Li6/f;J)V
    .locals 2

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    cmp-long v0, v0, p2

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0, p2, p3}, Li6/f;->w0(Li6/f;J)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    invoke-virtual {p1, p0, p2, p3}, Li6/f;->w0(Li6/f;J)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/io/EOFException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public final m1()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li6/f;->n:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final n1()Li6/i;
    .locals 4

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    int-to-long v2, v2

    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int v0, v0

    .line 23
    invoke-virtual {p0, v0}, Li6/f;->o1(I)Li6/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "size > Int.MAX_VALUE: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1
.end method

.method public final o1(I)Li6/i;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Li6/i;->p:Li6/i;

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    int-to-long v4, p1

    .line 13
    invoke-static/range {v0 .. v5}, Li6/c;->b(JJJ)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    move v3, v2

    .line 21
    :goto_0
    if-ge v2, p1, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget v4, v0, Li6/x;->c:I

    .line 27
    .line 28
    iget v5, v0, Li6/x;->b:I

    .line 29
    .line 30
    if-eq v4, v5, :cond_1

    .line 31
    .line 32
    sub-int/2addr v4, v5

    .line 33
    add-int/2addr v2, v4

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    iget-object v0, v0, Li6/x;->f:Li6/x;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 40
    .line 41
    const-string v0, "s.limit == s.pos"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2
    new-array v0, v3, [[B

    .line 48
    .line 49
    mul-int/lit8 v2, v3, 0x2

    .line 50
    .line 51
    new-array v2, v2, [I

    .line 52
    .line 53
    iget-object v4, p0, Li6/f;->m:Li6/x;

    .line 54
    .line 55
    move-object v5, v4

    .line 56
    move v4, v1

    .line 57
    :goto_1
    if-ge v1, p1, :cond_3

    .line 58
    .line 59
    invoke-static {v5}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v6, v5, Li6/x;->a:[B

    .line 63
    .line 64
    aput-object v6, v0, v4

    .line 65
    .line 66
    iget v6, v5, Li6/x;->c:I

    .line 67
    .line 68
    iget v7, v5, Li6/x;->b:I

    .line 69
    .line 70
    sub-int/2addr v6, v7

    .line 71
    add-int/2addr v1, v6

    .line 72
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    aput v6, v2, v4

    .line 77
    .line 78
    add-int v6, v4, v3

    .line 79
    .line 80
    iget v7, v5, Li6/x;->b:I

    .line 81
    .line 82
    aput v7, v2, v6

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    iput-boolean v6, v5, Li6/x;->d:Z

    .line 86
    .line 87
    add-int/2addr v4, v6

    .line 88
    iget-object v5, v5, Li6/x;->f:Li6/x;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    new-instance p1, Li6/z;

    .line 92
    .line 93
    invoke-direct {p1, v0, v2}, Li6/z;-><init>([[B[I)V

    .line 94
    .line 95
    .line 96
    :goto_2
    return-object p1
.end method

.method public p0(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "charset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Li6/f;->n:J

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, Li6/f;->j1(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final p1(I)Li6/x;
    .locals 3

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_4

    .line 11
    .line 12
    iget-object v1, p0, Li6/f;->m:Li6/x;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {}, Li6/y;->c()Li6/x;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Li6/f;->m:Li6/x;

    .line 21
    .line 22
    iput-object p1, p1, Li6/x;->g:Li6/x;

    .line 23
    .line 24
    iput-object p1, p1, Li6/x;->f:Li6/x;

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Li6/x;->g:Li6/x;

    .line 31
    .line 32
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget v2, v1, Li6/x;->c:I

    .line 36
    .line 37
    add-int/2addr v2, p1

    .line 38
    if-gt v2, v0, :cond_3

    .line 39
    .line 40
    iget-boolean p1, v1, Li6/x;->e:Z

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object p1, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    :goto_1
    invoke-static {}, Li6/y;->c()Li6/x;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p1}, Li6/x;->c(Li6/x;)Li6/x;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_2
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string v0, "unexpected capacity"

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public q0()B
    .locals 9

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 12
    .line 13
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget v1, v0, Li6/x;->b:I

    .line 17
    .line 18
    iget v2, v0, Li6/x;->c:I

    .line 19
    .line 20
    iget-object v3, v0, Li6/x;->a:[B

    .line 21
    .line 22
    add-int/lit8 v4, v1, 0x1

    .line 23
    .line 24
    aget-byte v1, v3, v1

    .line 25
    .line 26
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    const-wide/16 v7, 0x1

    .line 31
    .line 32
    sub-long/2addr v5, v7

    .line 33
    invoke-virtual {p0, v5, v6}, Li6/f;->l1(J)V

    .line 34
    .line 35
    .line 36
    if-ne v4, v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, p0, Li6/f;->m:Li6/x;

    .line 43
    .line 44
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v4, v0, Li6/x;->b:I

    .line 49
    .line 50
    :goto_0
    return v1

    .line 51
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public q1(Li6/i;)Li6/f;
    .locals 2

    .line 1
    const-string v0, "byteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li6/i;->C()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, p0, v1, v0}, Li6/i;->H(Li6/f;II)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public bridge synthetic r0([BII)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Li6/f;->s1([BII)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public r1([B)Li6/f;
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, p1, v1, v0}, Li6/f;->s1([BII)Li6/f;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, v0, Li6/x;->c:I

    .line 15
    .line 16
    iget v3, v0, Li6/x;->b:I

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, v0, Li6/x;->a:[B

    .line 24
    .line 25
    iget v3, v0, Li6/x;->b:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    iget p1, v0, Li6/x;->b:I

    .line 31
    .line 32
    add-int/2addr p1, v1

    .line 33
    iput p1, v0, Li6/x;->b:I

    .line 34
    .line 35
    iget-wide v2, p0, Li6/f;->n:J

    .line 36
    .line 37
    int-to-long v4, v1

    .line 38
    sub-long/2addr v2, v4

    .line 39
    iput-wide v2, p0, Li6/f;->n:J

    .line 40
    .line 41
    iget v2, v0, Li6/x;->c:I

    .line 42
    .line 43
    if-ne p1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Li6/f;->m:Li6/x;

    .line 50
    .line 51
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return v1

    .line 55
    :cond_1
    const/4 p1, -0x1

    .line 56
    return p1
.end method

.method public s1([BII)Li6/f;
    .locals 9

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    int-to-long v1, v0

    .line 8
    int-to-long v3, p2

    .line 9
    int-to-long v7, p3

    .line 10
    move-wide v5, v7

    .line 11
    invoke-static/range {v1 .. v6}, Li6/c;->b(JJJ)V

    .line 12
    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Li6/f;->p1(I)Li6/x;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sub-int v1, p3, p2

    .line 23
    .line 24
    iget v2, v0, Li6/x;->c:I

    .line 25
    .line 26
    rsub-int v2, v2, 0x2000

    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, v0, Li6/x;->a:[B

    .line 33
    .line 34
    iget v3, v0, Li6/x;->c:I

    .line 35
    .line 36
    add-int v4, p2, v1

    .line 37
    .line 38
    invoke-static {p1, v2, v3, p2, v4}, Lj5/h;->d([B[BIII)[B

    .line 39
    .line 40
    .line 41
    iget p2, v0, Li6/x;->c:I

    .line 42
    .line 43
    add-int/2addr p2, v1

    .line 44
    iput p2, v0, Li6/x;->c:I

    .line 45
    .line 46
    move p2, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    add-long/2addr p1, v7

    .line 53
    invoke-virtual {p0, p1, p2}, Li6/f;->l1(J)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public t(J)Li6/i;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    int-to-long v0, v0

    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-gtz v0, :cond_0

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
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    cmp-long v0, v0, p1

    .line 25
    .line 26
    if-ltz v0, :cond_2

    .line 27
    .line 28
    const/16 v0, 0x1000

    .line 29
    .line 30
    int-to-long v0, v0

    .line 31
    cmp-long v0, p1, v0

    .line 32
    .line 33
    if-ltz v0, :cond_1

    .line 34
    .line 35
    long-to-int v0, p1

    .line 36
    invoke-virtual {p0, v0}, Li6/f;->o1(I)Li6/i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, p1, p2}, Li6/f;->y0(J)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance v0, Li6/i;

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Li6/f;->G0(J)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Li6/i;-><init>([B)V

    .line 51
    .line 52
    .line 53
    :goto_1
    return-object v0

    .line 54
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "byteCount: "

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p2
.end method

.method public t1(I)Li6/f;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Li6/f;->p1(I)Li6/x;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, v0, Li6/x;->a:[B

    .line 7
    .line 8
    iget v2, v0, Li6/x;->c:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    iput v3, v0, Li6/x;->c:I

    .line 13
    .line 14
    int-to-byte p1, p1

    .line 15
    aput-byte p1, v1, v2

    .line 16
    .line 17
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, 0x1

    .line 22
    .line 23
    add-long/2addr v0, v2

    .line 24
    invoke-virtual {p0, v0, v1}, Li6/f;->l1(J)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li6/f;->n1()Li6/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li6/i;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public u0([B)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    array-length v1, p1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    array-length v1, p1

    .line 11
    sub-int/2addr v1, v0

    .line 12
    invoke-virtual {p0, p1, v0, v1}, Li6/f;->M0([BII)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    return-void
.end method

.method public u1(J)Li6/f;
    .locals 12

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/16 p1, 0x30

    .line 1
    invoke-virtual {p0, p1}, Li6/f;->t1(I)Li6/f;

    move-result-object p1

    goto/16 :goto_3

    :cond_0
    const/4 v3, 0x1

    if-gez v2, :cond_2

    neg-long p1, p1

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    const-string p1, "-9223372036854775808"

    invoke-virtual {p0, p1}, Li6/f;->A1(Ljava/lang/String;)Li6/f;

    move-result-object p1

    goto/16 :goto_3

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const-wide/32 v4, 0x5f5e100

    cmp-long v4, p1, v4

    const/16 v5, 0xa

    if-gez v4, :cond_a

    const-wide/16 v6, 0x2710

    cmp-long v4, p1, v6

    if-gez v4, :cond_6

    const-wide/16 v6, 0x64

    cmp-long v4, p1, v6

    if-gez v4, :cond_4

    const-wide/16 v6, 0xa

    cmp-long v4, p1, v6

    if-gez v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const/4 v3, 0x2

    goto/16 :goto_1

    :cond_4
    const-wide/16 v3, 0x3e8

    cmp-long v3, p1, v3

    if-gez v3, :cond_5

    const/4 v3, 0x3

    goto/16 :goto_1

    :cond_5
    const/4 v3, 0x4

    goto/16 :goto_1

    :cond_6
    const-wide/32 v3, 0xf4240

    cmp-long v3, p1, v3

    if-gez v3, :cond_8

    const-wide/32 v3, 0x186a0

    cmp-long v3, p1, v3

    if-gez v3, :cond_7

    const/4 v3, 0x5

    goto/16 :goto_1

    :cond_7
    const/4 v3, 0x6

    goto/16 :goto_1

    :cond_8
    const-wide/32 v3, 0x989680

    cmp-long v3, p1, v3

    if-gez v3, :cond_9

    const/4 v3, 0x7

    goto/16 :goto_1

    :cond_9
    const/16 v3, 0x8

    goto/16 :goto_1

    :cond_a
    const-wide v3, 0xe8d4a51000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_e

    const-wide v3, 0x2540be400L

    cmp-long v3, p1, v3

    if-gez v3, :cond_c

    const-wide/32 v3, 0x3b9aca00

    cmp-long v3, p1, v3

    if-gez v3, :cond_b

    const/16 v3, 0x9

    goto :goto_1

    :cond_b
    move v3, v5

    goto :goto_1

    :cond_c
    const-wide v3, 0x174876e800L

    cmp-long v3, p1, v3

    if-gez v3, :cond_d

    const/16 v3, 0xb

    goto :goto_1

    :cond_d
    const/16 v3, 0xc

    goto :goto_1

    :cond_e
    const-wide v3, 0x38d7ea4c68000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_11

    const-wide v3, 0x9184e72a000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_f

    const/16 v3, 0xd

    goto :goto_1

    :cond_f
    const-wide v3, 0x5af3107a4000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_10

    const/16 v3, 0xe

    goto :goto_1

    :cond_10
    const/16 v3, 0xf

    goto :goto_1

    :cond_11
    const-wide v3, 0x16345785d8a0000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_13

    const-wide v3, 0x2386f26fc10000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_12

    const/16 v3, 0x10

    goto :goto_1

    :cond_12
    const/16 v3, 0x11

    goto :goto_1

    :cond_13
    const-wide v3, 0xde0b6b3a7640000L

    cmp-long v3, p1, v3

    if-gez v3, :cond_14

    const/16 v3, 0x12

    goto :goto_1

    :cond_14
    const/16 v3, 0x13

    :goto_1
    if-eqz v2, :cond_15

    add-int/lit8 v3, v3, 0x1

    :cond_15
    invoke-virtual {p0, v3}, Li6/f;->p1(I)Li6/x;

    move-result-object v4

    iget-object v6, v4, Li6/x;->a:[B

    iget v7, v4, Li6/x;->c:I

    add-int/2addr v7, v3

    :goto_2
    cmp-long v8, p1, v0

    if-eqz v8, :cond_16

    int-to-long v8, v5

    rem-long v10, p1, v8

    long-to-int v10, v10

    add-int/lit8 v7, v7, -0x1

    invoke-static {}, Lj6/a;->a()[B

    move-result-object v11

    aget-byte v10, v11, v10

    aput-byte v10, v6, v7

    div-long/2addr p1, v8

    goto :goto_2

    :cond_16
    if-eqz v2, :cond_17

    add-int/lit8 v7, v7, -0x1

    const/16 p1, 0x2d

    int-to-byte p1, p1

    aput-byte p1, v6, v7

    :cond_17
    iget p1, v4, Li6/x;->c:I

    add-int/2addr p1, v3

    iput p1, v4, Li6/x;->c:I

    invoke-virtual {p0}, Li6/f;->m1()J

    move-result-wide p1

    int-to-long v0, v3

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Li6/f;->l1(J)V

    move-object p1, p0

    :goto_3
    return-object p1
.end method

.method public bridge synthetic v0(J)Li6/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Li6/f;->v1(J)Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public v1(J)Li6/f;
    .locals 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x30

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Li6/f;->t1(I)Li6/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    ushr-long v1, p1, v0

    .line 16
    .line 17
    or-long/2addr v1, p1

    .line 18
    const/4 v3, 0x2

    .line 19
    ushr-long v4, v1, v3

    .line 20
    .line 21
    or-long/2addr v1, v4

    .line 22
    const/4 v4, 0x4

    .line 23
    ushr-long v5, v1, v4

    .line 24
    .line 25
    or-long/2addr v1, v5

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    ushr-long v6, v1, v5

    .line 29
    .line 30
    or-long/2addr v1, v6

    .line 31
    const/16 v6, 0x10

    .line 32
    .line 33
    ushr-long v7, v1, v6

    .line 34
    .line 35
    or-long/2addr v1, v7

    .line 36
    const/16 v7, 0x20

    .line 37
    .line 38
    ushr-long v8, v1, v7

    .line 39
    .line 40
    or-long/2addr v1, v8

    .line 41
    ushr-long v8, v1, v0

    .line 42
    .line 43
    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v8, v10

    .line 49
    sub-long/2addr v1, v8

    .line 50
    ushr-long v8, v1, v3

    .line 51
    .line 52
    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v8, v10

    .line 58
    and-long/2addr v1, v10

    .line 59
    add-long/2addr v8, v1

    .line 60
    ushr-long v1, v8, v4

    .line 61
    .line 62
    add-long/2addr v1, v8

    .line 63
    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr v1, v8

    .line 69
    ushr-long v8, v1, v5

    .line 70
    .line 71
    add-long/2addr v1, v8

    .line 72
    ushr-long v5, v1, v6

    .line 73
    .line 74
    add-long/2addr v1, v5

    .line 75
    const-wide/16 v5, 0x3f

    .line 76
    .line 77
    and-long v8, v1, v5

    .line 78
    .line 79
    ushr-long/2addr v1, v7

    .line 80
    and-long/2addr v1, v5

    .line 81
    add-long/2addr v8, v1

    .line 82
    const/4 v1, 0x3

    .line 83
    int-to-long v1, v1

    .line 84
    add-long/2addr v8, v1

    .line 85
    int-to-long v1, v4

    .line 86
    div-long/2addr v8, v1

    .line 87
    long-to-int v1, v8

    .line 88
    invoke-virtual {p0, v1}, Li6/f;->p1(I)Li6/x;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, v2, Li6/x;->a:[B

    .line 93
    .line 94
    iget v5, v2, Li6/x;->c:I

    .line 95
    .line 96
    add-int v6, v5, v1

    .line 97
    .line 98
    sub-int/2addr v6, v0

    .line 99
    :goto_0
    if-lt v6, v5, :cond_1

    .line 100
    .line 101
    invoke-static {}, Lj6/a;->a()[B

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-wide/16 v7, 0xf

    .line 106
    .line 107
    and-long/2addr v7, p1

    .line 108
    long-to-int v7, v7

    .line 109
    aget-byte v0, v0, v7

    .line 110
    .line 111
    aput-byte v0, v3, v6

    .line 112
    .line 113
    ushr-long/2addr p1, v4

    .line 114
    add-int/lit8 v6, v6, -0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    iget p1, v2, Li6/x;->c:I

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, v2, Li6/x;->c:I

    .line 121
    .line 122
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 123
    .line 124
    .line 125
    move-result-wide p1

    .line 126
    int-to-long v0, v1

    .line 127
    add-long/2addr p1, v0

    .line 128
    invoke-virtual {p0, p1, p2}, Li6/f;->l1(J)V

    .line 129
    .line 130
    .line 131
    move-object p1, p0

    .line 132
    :goto_1
    return-object p1
.end method

.method public w0(Li6/f;J)V
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eq p1, p0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_7

    .line 13
    .line 14
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    move-wide v6, p2

    .line 21
    invoke-static/range {v2 .. v7}, Li6/c;->b(JJJ)V

    .line 22
    .line 23
    .line 24
    :goto_1
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    cmp-long v1, p2, v1

    .line 27
    .line 28
    if-lez v1, :cond_6

    .line 29
    .line 30
    iget-object v1, p1, Li6/f;->m:Li6/x;

    .line 31
    .line 32
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget v1, v1, Li6/x;->c:I

    .line 36
    .line 37
    iget-object v2, p1, Li6/f;->m:Li6/x;

    .line 38
    .line 39
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget v2, v2, Li6/x;->b:I

    .line 43
    .line 44
    sub-int/2addr v1, v2

    .line 45
    int-to-long v1, v1

    .line 46
    cmp-long v1, p2, v1

    .line 47
    .line 48
    if-gez v1, :cond_4

    .line 49
    .line 50
    iget-object v1, p0, Li6/f;->m:Li6/x;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v1, Li6/x;->g:Li6/x;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const/4 v1, 0x0

    .line 61
    :goto_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iget-boolean v2, v1, Li6/x;->e:Z

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget v2, v1, Li6/x;->c:I

    .line 68
    .line 69
    int-to-long v2, v2

    .line 70
    add-long/2addr v2, p2

    .line 71
    iget-boolean v4, v1, Li6/x;->d:Z

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    move v4, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    iget v4, v1, Li6/x;->b:I

    .line 78
    .line 79
    :goto_3
    int-to-long v4, v4

    .line 80
    sub-long/2addr v2, v4

    .line 81
    const/16 v4, 0x2000

    .line 82
    .line 83
    int-to-long v4, v4

    .line 84
    cmp-long v2, v2, v4

    .line 85
    .line 86
    if-gtz v2, :cond_3

    .line 87
    .line 88
    iget-object v0, p1, Li6/f;->m:Li6/x;

    .line 89
    .line 90
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    long-to-int v2, p2

    .line 94
    invoke-virtual {v0, v1, v2}, Li6/x;->g(Li6/x;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    sub-long/2addr v0, p2

    .line 102
    invoke-virtual {p1, v0, v1}, Li6/f;->l1(J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    add-long/2addr v0, p2

    .line 110
    invoke-virtual {p0, v0, v1}, Li6/f;->l1(J)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_3
    iget-object v1, p1, Li6/f;->m:Li6/x;

    .line 115
    .line 116
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    long-to-int v2, p2

    .line 120
    invoke-virtual {v1, v2}, Li6/x;->e(I)Li6/x;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iput-object v1, p1, Li6/f;->m:Li6/x;

    .line 125
    .line 126
    :cond_4
    iget-object v1, p1, Li6/f;->m:Li6/x;

    .line 127
    .line 128
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget v2, v1, Li6/x;->c:I

    .line 132
    .line 133
    iget v3, v1, Li6/x;->b:I

    .line 134
    .line 135
    sub-int/2addr v2, v3

    .line 136
    int-to-long v2, v2

    .line 137
    invoke-virtual {v1}, Li6/x;->b()Li6/x;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iput-object v4, p1, Li6/f;->m:Li6/x;

    .line 142
    .line 143
    iget-object v4, p0, Li6/f;->m:Li6/x;

    .line 144
    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    iput-object v1, p0, Li6/f;->m:Li6/x;

    .line 148
    .line 149
    iput-object v1, v1, Li6/x;->g:Li6/x;

    .line 150
    .line 151
    iput-object v1, v1, Li6/x;->f:Li6/x;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v4, v4, Li6/x;->g:Li6/x;

    .line 158
    .line 159
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v1}, Li6/x;->c(Li6/x;)Li6/x;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Li6/x;->a()V

    .line 167
    .line 168
    .line 169
    :goto_4
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 170
    .line 171
    .line 172
    move-result-wide v4

    .line 173
    sub-long/2addr v4, v2

    .line 174
    invoke-virtual {p1, v4, v5}, Li6/f;->l1(J)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    add-long/2addr v4, v2

    .line 182
    invoke-virtual {p0, v4, v5}, Li6/f;->l1(J)V

    .line 183
    .line 184
    .line 185
    sub-long/2addr p2, v2

    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    :cond_6
    :goto_5
    return-void

    .line 189
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 190
    .line 191
    const-string p2, "source == this"

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1
.end method

.method public w1(I)Li6/f;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Li6/f;->p1(I)Li6/x;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Li6/x;->a:[B

    .line 7
    .line 8
    iget v3, v1, Li6/x;->c:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x18

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/lit8 v5, v3, 0x2

    .line 20
    .line 21
    ushr-int/lit8 v6, p1, 0x10

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    aput-byte v6, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x3

    .line 29
    .line 30
    ushr-int/lit8 v6, p1, 0x8

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    int-to-byte v6, v6

    .line 35
    aput-byte v6, v2, v5

    .line 36
    .line 37
    add-int/2addr v3, v0

    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    int-to-byte p1, p1

    .line 41
    aput-byte p1, v2, v4

    .line 42
    .line 43
    iput v3, v1, Li6/x;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    const-wide/16 v2, 0x4

    .line 50
    .line 51
    add-long/2addr v0, v2

    .line 52
    invoke-virtual {p0, v0, v1}, Li6/f;->l1(J)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-lez v1, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {p0, v2}, Li6/f;->p1(I)Li6/x;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget v3, v2, Li6/x;->c:I

    .line 19
    .line 20
    rsub-int v3, v3, 0x2000

    .line 21
    .line 22
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v4, v2, Li6/x;->a:[B

    .line 27
    .line 28
    iget v5, v2, Li6/x;->c:I

    .line 29
    .line 30
    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    sub-int/2addr v1, v3

    .line 34
    iget v4, v2, Li6/x;->c:I

    .line 35
    .line 36
    add-int/2addr v4, v3

    .line 37
    iput v4, v2, Li6/x;->c:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-wide v1, p0, Li6/f;->n:J

    .line 41
    .line 42
    int-to-long v3, v0

    .line 43
    add-long/2addr v1, v3

    .line 44
    iput-wide v1, p0, Li6/f;->n:J

    .line 45
    .line 46
    return v0
.end method

.method public x(Li6/C;)J
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    const/16 v2, 0x2000

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    invoke-interface {p1, p0, v2, v3}, Li6/C;->L0(Li6/f;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    add-long/2addr v0, v2

    .line 23
    goto :goto_0
.end method

.method public x1(J)Li6/f;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li6/f;->p1(I)Li6/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Li6/x;->a:[B

    .line 8
    .line 9
    iget v3, v1, Li6/x;->c:I

    .line 10
    .line 11
    add-int/lit8 v4, v3, 0x1

    .line 12
    .line 13
    const/16 v5, 0x38

    .line 14
    .line 15
    ushr-long v5, p1, v5

    .line 16
    .line 17
    const-wide/16 v7, 0xff

    .line 18
    .line 19
    and-long/2addr v5, v7

    .line 20
    long-to-int v5, v5

    .line 21
    int-to-byte v5, v5

    .line 22
    aput-byte v5, v2, v3

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x2

    .line 25
    .line 26
    const/16 v6, 0x30

    .line 27
    .line 28
    ushr-long v9, p1, v6

    .line 29
    .line 30
    and-long/2addr v9, v7

    .line 31
    long-to-int v6, v9

    .line 32
    int-to-byte v6, v6

    .line 33
    aput-byte v6, v2, v4

    .line 34
    .line 35
    add-int/lit8 v4, v3, 0x3

    .line 36
    .line 37
    const/16 v6, 0x28

    .line 38
    .line 39
    ushr-long v9, p1, v6

    .line 40
    .line 41
    and-long/2addr v9, v7

    .line 42
    long-to-int v6, v9

    .line 43
    int-to-byte v6, v6

    .line 44
    aput-byte v6, v2, v5

    .line 45
    .line 46
    add-int/lit8 v5, v3, 0x4

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    ushr-long v9, p1, v6

    .line 51
    .line 52
    and-long/2addr v9, v7

    .line 53
    long-to-int v6, v9

    .line 54
    int-to-byte v6, v6

    .line 55
    aput-byte v6, v2, v4

    .line 56
    .line 57
    add-int/lit8 v4, v3, 0x5

    .line 58
    .line 59
    const/16 v6, 0x18

    .line 60
    .line 61
    ushr-long v9, p1, v6

    .line 62
    .line 63
    and-long/2addr v9, v7

    .line 64
    long-to-int v6, v9

    .line 65
    int-to-byte v6, v6

    .line 66
    aput-byte v6, v2, v5

    .line 67
    .line 68
    add-int/lit8 v5, v3, 0x6

    .line 69
    .line 70
    const/16 v6, 0x10

    .line 71
    .line 72
    ushr-long v9, p1, v6

    .line 73
    .line 74
    and-long/2addr v9, v7

    .line 75
    long-to-int v6, v9

    .line 76
    int-to-byte v6, v6

    .line 77
    aput-byte v6, v2, v4

    .line 78
    .line 79
    add-int/lit8 v4, v3, 0x7

    .line 80
    .line 81
    ushr-long v9, p1, v0

    .line 82
    .line 83
    and-long/2addr v9, v7

    .line 84
    long-to-int v6, v9

    .line 85
    int-to-byte v6, v6

    .line 86
    aput-byte v6, v2, v5

    .line 87
    .line 88
    add-int/2addr v3, v0

    .line 89
    and-long/2addr p1, v7

    .line 90
    long-to-int p1, p1

    .line 91
    int-to-byte p1, p1

    .line 92
    aput-byte p1, v2, v4

    .line 93
    .line 94
    iput v3, v1, Li6/x;->c:I

    .line 95
    .line 96
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    const-wide/16 v0, 0x8

    .line 101
    .line 102
    add-long/2addr p1, v0

    .line 103
    invoke-virtual {p0, p1, p2}, Li6/f;->l1(J)V

    .line 104
    .line 105
    .line 106
    return-object p0
.end method

.method public y0(J)V
    .locals 6

    .line 1
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Li6/x;->c:I

    .line 12
    .line 13
    iget v2, v0, Li6/x;->b:I

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    int-to-long v1, v1

    .line 17
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    long-to-int v1, v1

    .line 22
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    int-to-long v4, v1

    .line 27
    sub-long/2addr v2, v4

    .line 28
    invoke-virtual {p0, v2, v3}, Li6/f;->l1(J)V

    .line 29
    .line 30
    .line 31
    sub-long/2addr p1, v4

    .line 32
    iget v2, v0, Li6/x;->b:I

    .line 33
    .line 34
    add-int/2addr v2, v1

    .line 35
    iput v2, v0, Li6/x;->b:I

    .line 36
    .line 37
    iget v1, v0, Li6/x;->c:I

    .line 38
    .line 39
    if-ne v2, v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Li6/x;->b()Li6/x;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Li6/f;->m:Li6/x;

    .line 46
    .line 47
    invoke-static {v0}, Li6/y;->b(Li6/x;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    return-void
.end method

.method public y1(I)Li6/f;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Li6/f;->p1(I)Li6/x;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Li6/x;->a:[B

    .line 7
    .line 8
    iget v3, v1, Li6/x;->c:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x8

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    and-int/lit16 p1, p1, 0xff

    .line 21
    .line 22
    int-to-byte p1, p1

    .line 23
    aput-byte p1, v2, v4

    .line 24
    .line 25
    iput v3, v1, Li6/x;->c:I

    .line 26
    .line 27
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-wide/16 v2, 0x2

    .line 32
    .line 33
    add-long/2addr v0, v2

    .line 34
    invoke-virtual {p0, v0, v1}, Li6/f;->l1(J)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public final z(J)B
    .locals 6

    .line 1
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v4, 0x1

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    invoke-static/range {v0 .. v5}, Li6/c;->b(JJJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li6/f;->m:Li6/x;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sub-long/2addr v1, p1

    .line 20
    cmp-long v1, v1, p1

    .line 21
    .line 22
    if-gez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Li6/f;->m1()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    :goto_0
    cmp-long v3, v1, p1

    .line 29
    .line 30
    if-lez v3, :cond_0

    .line 31
    .line 32
    iget-object v0, v0, Li6/x;->g:Li6/x;

    .line 33
    .line 34
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget v3, v0, Li6/x;->c:I

    .line 38
    .line 39
    iget v4, v0, Li6/x;->b:I

    .line 40
    .line 41
    sub-int/2addr v3, v4

    .line 42
    int-to-long v3, v3

    .line 43
    sub-long/2addr v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, v0, Li6/x;->a:[B

    .line 49
    .line 50
    iget v0, v0, Li6/x;->b:I

    .line 51
    .line 52
    int-to-long v4, v0

    .line 53
    add-long/2addr v4, p1

    .line 54
    sub-long/2addr v4, v1

    .line 55
    long-to-int p1, v4

    .line 56
    aget-byte p1, v3, p1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    const-wide/16 v1, 0x0

    .line 60
    .line 61
    :goto_1
    iget v3, v0, Li6/x;->c:I

    .line 62
    .line 63
    iget v4, v0, Li6/x;->b:I

    .line 64
    .line 65
    sub-int/2addr v3, v4

    .line 66
    int-to-long v3, v3

    .line 67
    add-long/2addr v3, v1

    .line 68
    cmp-long v5, v3, p1

    .line 69
    .line 70
    if-lez v5, :cond_2

    .line 71
    .line 72
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, v0, Li6/x;->a:[B

    .line 76
    .line 77
    iget v0, v0, Li6/x;->b:I

    .line 78
    .line 79
    int-to-long v4, v0

    .line 80
    add-long/2addr v4, p1

    .line 81
    sub-long/2addr v4, v1

    .line 82
    long-to-int p1, v4

    .line 83
    aget-byte p1, v3, p1

    .line 84
    .line 85
    :goto_2
    return p1

    .line 86
    :cond_2
    iget-object v0, v0, Li6/x;->f:Li6/x;

    .line 87
    .line 88
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-wide v1, v3

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/4 p1, 0x0

    .line 94
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method

.method public z1(Ljava/lang/String;IILjava/nio/charset/Charset;)Li6/f;
    .locals 3

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "charset"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v1, 0x0

    .line 13
    if-ltz p2, :cond_0

    .line 14
    .line 15
    move v2, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v1

    .line 18
    :goto_0
    if-eqz v2, :cond_7

    .line 19
    .line 20
    if-lt p3, p2, :cond_1

    .line 21
    .line 22
    move v2, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v2, v1

    .line 25
    :goto_1
    if-eqz v2, :cond_6

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-gt p3, v2, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v0, v1

    .line 35
    :goto_2
    if-eqz v0, :cond_5

    .line 36
    .line 37
    sget-object v0, LF5/d;->b:Ljava/nio/charset/Charset;

    .line 38
    .line 39
    invoke-static {p4, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2, p3}, Li6/f;->B1(Ljava/lang/String;II)Li6/f;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string p2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 55
    .line 56
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "(this as java.lang.String).getBytes(charset)"

    .line 66
    .line 67
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    array-length p2, p1

    .line 71
    invoke-virtual {p0, p1, v1, p2}, Li6/f;->s1([BII)Li6/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 77
    .line 78
    const-string p2, "null cannot be cast to non-null type java.lang.String"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string p4, "endIndex > string.length: "

    .line 90
    .line 91
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p3, " > "

    .line 98
    .line 99
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p2

    .line 123
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string p4, "endIndex < beginIndex: "

    .line 129
    .line 130
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p3, " < "

    .line 137
    .line 138
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p2

    .line 158
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string p3, "beginIndex < 0: "

    .line 164
    .line 165
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p2
.end method

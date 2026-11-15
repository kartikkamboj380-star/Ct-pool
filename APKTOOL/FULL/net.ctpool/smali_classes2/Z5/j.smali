.class public final LZ5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ5/j$a;
    }
.end annotation


# static fields
.field public static final b:LZ5/j$a;


# instance fields
.field private final a:LT5/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ5/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LZ5/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LZ5/j;->b:LZ5/j$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LT5/z;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LZ5/j;->a:LT5/z;

    .line 10
    .line 11
    return-void
.end method

.method private final b(LT5/D;Ljava/lang/String;)LT5/B;
    .locals 8

    .line 1
    iget-object v0, p0, LZ5/j;->a:LT5/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/z;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    const-string v0, "Location"

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-static {p1, v0, v1, v2, v1}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_8

    .line 19
    .line 20
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, LT5/B;->l()LT5/u;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, v0}, LT5/u;->o(Ljava/lang/String;)LT5/u;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_8

    .line 33
    .line 34
    invoke-virtual {v0}, LT5/u;->p()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, LT5/B;->l()LT5/u;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, LT5/u;->p()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    iget-object v2, p0, LZ5/j;->a:LT5/z;

    .line 57
    .line 58
    invoke-virtual {v2}, LT5/z;->u()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, LT5/B;->i()LT5/B$a;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {p2}, LZ5/f;->b(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, LT5/D;->f()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    sget-object v4, LZ5/f;->a:LZ5/f;

    .line 84
    .line 85
    invoke-virtual {v4, p2}, LZ5/f;->d(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const/16 v6, 0x133

    .line 90
    .line 91
    const/16 v7, 0x134

    .line 92
    .line 93
    if-nez v5, :cond_3

    .line 94
    .line 95
    if-eq v3, v7, :cond_3

    .line 96
    .line 97
    if-ne v3, v6, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    const/4 v5, 0x0

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_0
    const/4 v5, 0x1

    .line 103
    :goto_1
    invoke-virtual {v4, p2}, LZ5/f;->c(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    if-eq v3, v7, :cond_5

    .line 110
    .line 111
    if-eq v3, v6, :cond_5

    .line 112
    .line 113
    const-string p2, "GET"

    .line 114
    .line 115
    :cond_4
    :goto_2
    invoke-virtual {v2, p2, v1}, LT5/B$a;->g(Ljava/lang/String;LT5/C;)LT5/B$a;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, LT5/B;->a()LT5/C;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_2

    .line 130
    :goto_3
    if-nez v5, :cond_6

    .line 131
    .line 132
    const-string p2, "Transfer-Encoding"

    .line 133
    .line 134
    invoke-virtual {v2, p2}, LT5/B$a;->i(Ljava/lang/String;)LT5/B$a;

    .line 135
    .line 136
    .line 137
    const-string p2, "Content-Length"

    .line 138
    .line 139
    invoke-virtual {v2, p2}, LT5/B$a;->i(Ljava/lang/String;)LT5/B$a;

    .line 140
    .line 141
    .line 142
    const-string p2, "Content-Type"

    .line 143
    .line 144
    invoke-virtual {v2, p2}, LT5/B$a;->i(Ljava/lang/String;)LT5/B$a;

    .line 145
    .line 146
    .line 147
    :cond_6
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p1, v0}, LU5/c;->g(LT5/u;LT5/u;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-nez p1, :cond_7

    .line 160
    .line 161
    const-string p1, "Authorization"

    .line 162
    .line 163
    invoke-virtual {v2, p1}, LT5/B$a;->i(Ljava/lang/String;)LT5/B$a;

    .line 164
    .line 165
    .line 166
    :cond_7
    invoke-virtual {v2, v0}, LT5/B$a;->l(LT5/u;)LT5/B$a;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1}, LT5/B$a;->b()LT5/B;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    return-object p1

    .line 175
    :cond_8
    return-object v1
.end method

.method private final c(LT5/D;LY5/c;)LT5/B;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, LY5/c;->h()LY5/f;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, LY5/f;->A()LT5/F;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    :goto_0
    invoke-virtual {p1}, LT5/D;->f()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LT5/B;->h()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/16 v4, 0x133

    .line 29
    .line 30
    if-eq v2, v4, :cond_10

    .line 31
    .line 32
    const/16 v4, 0x134

    .line 33
    .line 34
    if-eq v2, v4, :cond_10

    .line 35
    .line 36
    const/16 v4, 0x191

    .line 37
    .line 38
    if-eq v2, v4, :cond_f

    .line 39
    .line 40
    const/16 v4, 0x1a5

    .line 41
    .line 42
    if-eq v2, v4, :cond_b

    .line 43
    .line 44
    const/16 p2, 0x1f7

    .line 45
    .line 46
    if-eq v2, p2, :cond_8

    .line 47
    .line 48
    const/16 p2, 0x197

    .line 49
    .line 50
    if-eq v2, p2, :cond_6

    .line 51
    .line 52
    const/16 p2, 0x198

    .line 53
    .line 54
    if-eq v2, p2, :cond_1

    .line 55
    .line 56
    packed-switch v2, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    iget-object v1, p0, LZ5/j;->a:LT5/z;

    .line 61
    .line 62
    invoke-virtual {v1}, LT5/z;->J()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, LT5/B;->a()LT5/C;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1}, LT5/C;->g()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    invoke-virtual {p1}, LT5/D;->W()LT5/D;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, LT5/D;->f()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ne v1, p2, :cond_4

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_4
    const/4 p2, 0x0

    .line 100
    invoke-direct {p0, p1, p2}, LZ5/j;->g(LT5/D;I)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-lez p2, :cond_5

    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_5
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_6
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, LT5/F;->b()Ljava/net/Proxy;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 124
    .line 125
    if-ne p2, v0, :cond_7

    .line 126
    .line 127
    iget-object p2, p0, LZ5/j;->a:LT5/z;

    .line 128
    .line 129
    invoke-virtual {p2}, LT5/z;->G()LT5/b;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {p2, v1, p1}, LT5/b;->a(LT5/F;LT5/D;)LT5/B;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    .line 139
    .line 140
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 141
    .line 142
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_8
    invoke-virtual {p1}, LT5/D;->W()LT5/D;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-eqz v1, :cond_9

    .line 151
    .line 152
    invoke-virtual {v1}, LT5/D;->f()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-ne v1, p2, :cond_9

    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_9
    const p2, 0x7fffffff

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, p1, p2}, LZ5/j;->g(LT5/D;I)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-nez p2, :cond_a

    .line 167
    .line 168
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :cond_a
    return-object v0

    .line 174
    :cond_b
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, LT5/B;->a()LT5/C;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-eqz v1, :cond_c

    .line 183
    .line 184
    invoke-virtual {v1}, LT5/C;->g()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_c

    .line 189
    .line 190
    return-object v0

    .line 191
    :cond_c
    if-eqz p2, :cond_e

    .line 192
    .line 193
    invoke-virtual {p2}, LY5/c;->k()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_d

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_d
    invoke-virtual {p2}, LY5/c;->h()LY5/f;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p2}, LY5/f;->y()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    return-object p1

    .line 212
    :cond_e
    :goto_1
    return-object v0

    .line 213
    :cond_f
    iget-object p2, p0, LZ5/j;->a:LT5/z;

    .line 214
    .line 215
    invoke-virtual {p2}, LT5/z;->e()LT5/b;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-interface {p2, v1, p1}, LT5/b;->a(LT5/F;LT5/D;)LT5/B;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    return-object p1

    .line 224
    :cond_10
    :pswitch_0
    invoke-direct {p0, p1, v3}, LZ5/j;->b(LT5/D;Ljava/lang/String;)LT5/B;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final d(Ljava/io/IOException;Z)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/net/ProtocolException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    instance-of p2, p2, Ljava/security/cert/CertificateException;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    return v1

    .line 38
    :cond_4
    return v2
.end method

.method private final e(Ljava/io/IOException;LY5/e;LT5/B;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ5/j;->a:LT5/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/z;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    if-eqz p4, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p1, p3}, LZ5/j;->f(Ljava/io/IOException;LT5/B;)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0, p1, p4}, LZ5/j;->d(Ljava/io/IOException;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    invoke-virtual {p2}, LY5/e;->z()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    const/4 p1, 0x1

    .line 35
    return p1
.end method

.method private final f(Ljava/io/IOException;LT5/B;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, LT5/B;->a()LT5/C;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LT5/C;->g()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :cond_1
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_2
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
.end method

.method private final g(LT5/D;I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const-string v2, "Retry-After"

    .line 4
    .line 5
    invoke-static {p1, v2, v0, v1, v0}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    new-instance p2, LF5/f;

    .line 12
    .line 13
    const-string v0, "\\d+"

    .line 14
    .line 15
    invoke-direct {p2, v0}, LF5/f;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, LF5/f;->a(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p2, "Integer.valueOf(header)"

    .line 29
    .line 30
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_0
    const p1, 0x7fffffff

    .line 39
    .line 40
    .line 41
    return p1

    .line 42
    :cond_1
    return p2
.end method


# virtual methods
.method public a(LT5/v$a;)LT5/D;
    .locals 10

    .line 1
    const-string v0, "chain"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LZ5/g;

    invoke-virtual {p1}, LZ5/g;->h()LT5/B;

    move-result-object v0

    invoke-virtual {p1}, LZ5/g;->d()LY5/e;

    move-result-object v1

    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v8, v3

    move-object v7, v4

    :goto_0
    move v6, v5

    :goto_1
    invoke-virtual {v1, v0, v6}, LY5/e;->i(LT5/B;Z)V

    :try_start_0
    invoke-virtual {v1}, LY5/e;->n0()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_8

    :try_start_1
    invoke-virtual {p1, v0}, LZ5/g;->a(LT5/B;)LT5/D;

    move-result-object v0
    :try_end_1
    .catch LY5/j; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_0

    :try_start_2
    invoke-virtual {v0}, LT5/D;->U()LT5/D$a;

    move-result-object v0

    invoke-virtual {v7}, LT5/D;->U()LT5/D$a;

    move-result-object v6

    invoke-virtual {v6, v4}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    move-result-object v6

    invoke-virtual {v6}, LT5/D$a;->c()LT5/D;

    move-result-object v6

    invoke-virtual {v0, v6}, LT5/D$a;->o(LT5/D;)LT5/D$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/D$a;->c()LT5/D;

    move-result-object v0

    :cond_0
    move-object v7, v0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :goto_2
    invoke-virtual {v1}, LY5/e;->q()LY5/c;

    move-result-object v0

    invoke-direct {p0, v7, v0}, LZ5/j;->c(LT5/D;LY5/c;)LT5/B;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LY5/c;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, LY5/e;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    invoke-virtual {v1, v3}, LY5/e;->j(Z)V

    return-object v7

    :cond_2
    :try_start_3
    invoke-virtual {v6}, LT5/B;->a()LT5/C;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LT5/C;->g()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    invoke-virtual {v1, v3}, LY5/e;->j(Z)V

    return-object v7

    :cond_3
    :try_start_4
    invoke-virtual {v7}, LT5/D;->a()LT5/E;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_4
    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_5

    invoke-virtual {v1, v5}, LY5/e;->j(Z)V

    move-object v0, v6

    goto :goto_0

    :cond_5
    :try_start_5
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many follow-up requests: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v6

    instance-of v9, v6, Lb6/a;

    xor-int/2addr v9, v5

    invoke-direct {p0, v6, v1, v0, v9}, LZ5/j;->e(Ljava/io/IOException;LY5/e;LT5/B;Z)Z

    move-result v9

    if-eqz v9, :cond_6

    check-cast v2, Ljava/util/Collection;

    :goto_3
    invoke-static {v2, v6}, Lj5/n;->S(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v1, v5}, LY5/e;->j(Z)V

    move v6, v3

    goto/16 :goto_1

    :cond_6
    :try_start_6
    invoke-static {v6, v2}, LU5/c;->X(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :catch_1
    move-exception v6

    invoke-virtual {v6}, LY5/j;->c()Ljava/io/IOException;

    move-result-object v9

    invoke-direct {p0, v9, v1, v0, v3}, LZ5/j;->e(Ljava/io/IOException;LY5/e;LT5/B;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v6}, LY5/j;->b()Ljava/io/IOException;

    move-result-object v6

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, LY5/j;->b()Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1, v2}, LU5/c;->X(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_4
    invoke-virtual {v1, v5}, LY5/e;->j(Z)V

    throw p1
.end method

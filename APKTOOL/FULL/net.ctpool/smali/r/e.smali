.class public Lr/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/e$b;
    }
.end annotation


# static fields
.field public static v0:F = 0.5f


# instance fields
.field private A:Z

.field public B:Lr/d;

.field public C:Lr/d;

.field public D:Lr/d;

.field public E:Lr/d;

.field F:Lr/d;

.field G:Lr/d;

.field H:Lr/d;

.field I:Lr/d;

.field public J:[Lr/d;

.field protected K:Ljava/util/ArrayList;

.field private L:[Z

.field public M:[Lr/e$b;

.field public N:Lr/e;

.field O:I

.field P:I

.field public Q:F

.field protected R:I

.field protected S:I

.field protected T:I

.field U:I

.field V:I

.field protected W:I

.field protected X:I

.field Y:I

.field protected Z:I

.field public a:Z

.field protected a0:I

.field public b:[Ls/m;

.field b0:F

.field public c:Ls/c;

.field c0:F

.field public d:Ls/c;

.field private d0:Ljava/lang/Object;

.field public e:Ls/j;

.field private e0:I

.field public f:Ls/l;

.field private f0:I

.field public g:[Z

.field private g0:Ljava/lang/String;

.field public h:[I

.field private h0:Ljava/lang/String;

.field i:Z

.field i0:Z

.field public j:I

.field j0:Z

.field public k:I

.field k0:Z

.field public l:I

.field l0:Z

.field public m:I

.field m0:I

.field public n:[I

.field n0:I

.field public o:I

.field o0:Z

.field public p:I

.field p0:Z

.field public q:F

.field public q0:[F

.field public r:I

.field protected r0:[Lr/e;

.field public s:I

.field protected s0:[Lr/e;

.field public t:F

.field t0:Lr/e;

.field u:I

.field u0:Lr/e;

.field v:F

.field private w:[I

.field private x:F

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lr/e;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v2, v1, [Ls/m;

    .line 9
    .line 10
    iput-object v2, p0, Lr/e;->b:[Ls/m;

    .line 11
    .line 12
    new-instance v2, Ls/j;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Ls/j;-><init>(Lr/e;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lr/e;->e:Ls/j;

    .line 18
    .line 19
    new-instance v2, Ls/l;

    .line 20
    .line 21
    invoke-direct {v2, p0}, Ls/l;-><init>(Lr/e;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lr/e;->f:Ls/l;

    .line 25
    .line 26
    new-array v2, v1, [Z

    .line 27
    .line 28
    fill-array-data v2, :array_0

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lr/e;->g:[Z

    .line 32
    .line 33
    filled-new-array {v0, v0, v0, v0}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lr/e;->h:[I

    .line 38
    .line 39
    iput-boolean v0, p0, Lr/e;->i:Z

    .line 40
    .line 41
    const/4 v2, -0x1

    .line 42
    iput v2, p0, Lr/e;->j:I

    .line 43
    .line 44
    iput v2, p0, Lr/e;->k:I

    .line 45
    .line 46
    iput v0, p0, Lr/e;->l:I

    .line 47
    .line 48
    iput v0, p0, Lr/e;->m:I

    .line 49
    .line 50
    new-array v3, v1, [I

    .line 51
    .line 52
    iput-object v3, p0, Lr/e;->n:[I

    .line 53
    .line 54
    iput v0, p0, Lr/e;->o:I

    .line 55
    .line 56
    iput v0, p0, Lr/e;->p:I

    .line 57
    .line 58
    const/high16 v3, 0x3f800000    # 1.0f

    .line 59
    .line 60
    iput v3, p0, Lr/e;->q:F

    .line 61
    .line 62
    iput v0, p0, Lr/e;->r:I

    .line 63
    .line 64
    iput v0, p0, Lr/e;->s:I

    .line 65
    .line 66
    iput v3, p0, Lr/e;->t:F

    .line 67
    .line 68
    iput v2, p0, Lr/e;->u:I

    .line 69
    .line 70
    iput v3, p0, Lr/e;->v:F

    .line 71
    .line 72
    const v3, 0x7fffffff

    .line 73
    .line 74
    .line 75
    filled-new-array {v3, v3}, [I

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput-object v3, p0, Lr/e;->w:[I

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    iput v3, p0, Lr/e;->x:F

    .line 83
    .line 84
    iput-boolean v0, p0, Lr/e;->y:Z

    .line 85
    .line 86
    iput-boolean v0, p0, Lr/e;->A:Z

    .line 87
    .line 88
    new-instance v4, Lr/d;

    .line 89
    .line 90
    sget-object v5, Lr/d$b;->n:Lr/d$b;

    .line 91
    .line 92
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 93
    .line 94
    .line 95
    iput-object v4, p0, Lr/e;->B:Lr/d;

    .line 96
    .line 97
    new-instance v4, Lr/d;

    .line 98
    .line 99
    sget-object v5, Lr/d$b;->o:Lr/d$b;

    .line 100
    .line 101
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 102
    .line 103
    .line 104
    iput-object v4, p0, Lr/e;->C:Lr/d;

    .line 105
    .line 106
    new-instance v4, Lr/d;

    .line 107
    .line 108
    sget-object v5, Lr/d$b;->p:Lr/d$b;

    .line 109
    .line 110
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 111
    .line 112
    .line 113
    iput-object v4, p0, Lr/e;->D:Lr/d;

    .line 114
    .line 115
    new-instance v4, Lr/d;

    .line 116
    .line 117
    sget-object v5, Lr/d$b;->q:Lr/d$b;

    .line 118
    .line 119
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 120
    .line 121
    .line 122
    iput-object v4, p0, Lr/e;->E:Lr/d;

    .line 123
    .line 124
    new-instance v4, Lr/d;

    .line 125
    .line 126
    sget-object v5, Lr/d$b;->r:Lr/d$b;

    .line 127
    .line 128
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 129
    .line 130
    .line 131
    iput-object v4, p0, Lr/e;->F:Lr/d;

    .line 132
    .line 133
    new-instance v4, Lr/d;

    .line 134
    .line 135
    sget-object v5, Lr/d$b;->t:Lr/d$b;

    .line 136
    .line 137
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 138
    .line 139
    .line 140
    iput-object v4, p0, Lr/e;->G:Lr/d;

    .line 141
    .line 142
    new-instance v4, Lr/d;

    .line 143
    .line 144
    sget-object v5, Lr/d$b;->u:Lr/d$b;

    .line 145
    .line 146
    invoke-direct {v4, p0, v5}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 147
    .line 148
    .line 149
    iput-object v4, p0, Lr/e;->H:Lr/d;

    .line 150
    .line 151
    new-instance v11, Lr/d;

    .line 152
    .line 153
    sget-object v4, Lr/d$b;->s:Lr/d$b;

    .line 154
    .line 155
    invoke-direct {v11, p0, v4}, Lr/d;-><init>(Lr/e;Lr/d$b;)V

    .line 156
    .line 157
    .line 158
    iput-object v11, p0, Lr/e;->I:Lr/d;

    .line 159
    .line 160
    iget-object v6, p0, Lr/e;->B:Lr/d;

    .line 161
    .line 162
    iget-object v7, p0, Lr/e;->D:Lr/d;

    .line 163
    .line 164
    iget-object v8, p0, Lr/e;->C:Lr/d;

    .line 165
    .line 166
    iget-object v9, p0, Lr/e;->E:Lr/d;

    .line 167
    .line 168
    iget-object v10, p0, Lr/e;->F:Lr/d;

    .line 169
    .line 170
    filled-new-array/range {v6 .. v11}, [Lr/d;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    iput-object v4, p0, Lr/e;->J:[Lr/d;

    .line 175
    .line 176
    new-instance v4, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 179
    .line 180
    .line 181
    iput-object v4, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 182
    .line 183
    new-array v4, v1, [Z

    .line 184
    .line 185
    iput-object v4, p0, Lr/e;->L:[Z

    .line 186
    .line 187
    sget-object v4, Lr/e$b;->m:Lr/e$b;

    .line 188
    .line 189
    filled-new-array {v4, v4}, [Lr/e$b;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    iput-object v4, p0, Lr/e;->M:[Lr/e$b;

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    iput-object v4, p0, Lr/e;->N:Lr/e;

    .line 197
    .line 198
    iput v0, p0, Lr/e;->O:I

    .line 199
    .line 200
    iput v0, p0, Lr/e;->P:I

    .line 201
    .line 202
    iput v3, p0, Lr/e;->Q:F

    .line 203
    .line 204
    iput v2, p0, Lr/e;->R:I

    .line 205
    .line 206
    iput v0, p0, Lr/e;->S:I

    .line 207
    .line 208
    iput v0, p0, Lr/e;->T:I

    .line 209
    .line 210
    iput v0, p0, Lr/e;->U:I

    .line 211
    .line 212
    iput v0, p0, Lr/e;->V:I

    .line 213
    .line 214
    iput v0, p0, Lr/e;->W:I

    .line 215
    .line 216
    iput v0, p0, Lr/e;->X:I

    .line 217
    .line 218
    iput v0, p0, Lr/e;->Y:I

    .line 219
    .line 220
    sget v2, Lr/e;->v0:F

    .line 221
    .line 222
    iput v2, p0, Lr/e;->b0:F

    .line 223
    .line 224
    iput v2, p0, Lr/e;->c0:F

    .line 225
    .line 226
    iput v0, p0, Lr/e;->e0:I

    .line 227
    .line 228
    iput v0, p0, Lr/e;->f0:I

    .line 229
    .line 230
    iput-object v4, p0, Lr/e;->g0:Ljava/lang/String;

    .line 231
    .line 232
    iput-object v4, p0, Lr/e;->h0:Ljava/lang/String;

    .line 233
    .line 234
    iput-boolean v0, p0, Lr/e;->k0:Z

    .line 235
    .line 236
    iput-boolean v0, p0, Lr/e;->l0:Z

    .line 237
    .line 238
    iput v0, p0, Lr/e;->m0:I

    .line 239
    .line 240
    iput v0, p0, Lr/e;->n0:I

    .line 241
    .line 242
    new-array v0, v1, [F

    .line 243
    .line 244
    fill-array-data v0, :array_1

    .line 245
    .line 246
    .line 247
    iput-object v0, p0, Lr/e;->q0:[F

    .line 248
    .line 249
    filled-new-array {v4, v4}, [Lr/e;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iput-object v0, p0, Lr/e;->r0:[Lr/e;

    .line 254
    .line 255
    filled-new-array {v4, v4}, [Lr/e;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, p0, Lr/e;->s0:[Lr/e;

    .line 260
    .line 261
    iput-object v4, p0, Lr/e;->t0:Lr/e;

    .line 262
    .line 263
    iput-object v4, p0, Lr/e;->u0:Lr/e;

    .line 264
    .line 265
    invoke-direct {p0}, Lr/e;->d()V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    nop

    .line 275
    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private S(I)Z
    .locals 3

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lr/e;->J:[Lr/d;

    .line 4
    .line 5
    aget-object v1, v0, p1

    .line 6
    .line 7
    iget-object v2, v1, Lr/d;->d:Lr/d;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v2, Lr/d;->d:Lr/d;

    .line 12
    .line 13
    if-eq v2, v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    add-int/2addr p1, v1

    .line 17
    aget-object p1, v0, p1

    .line 18
    .line 19
    iget-object v0, p1, Lr/d;->d:Lr/d;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lr/d;->d:Lr/d;

    .line 24
    .line 25
    if-ne v0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    return v1
.end method

.method private d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lr/e;->B:Lr/d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v1, p0, Lr/e;->C:Lr/d;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v1, p0, Lr/e;->D:Lr/d;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v1, p0, Lr/e;->E:Lr/d;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v1, p0, Lr/e;->G:Lr/d;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v1, p0, Lr/e;->H:Lr/d;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v1, p0, Lr/e;->I:Lr/d;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lr/e;->K:Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v1, p0, Lr/e;->F:Lr/d;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private h(Lq/d;ZZZZLq/i;Lq/i;Lr/e$b;ZLr/d;Lr/d;IIIIFZZZZIIIIFZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p22

    move/from16 v3, p23

    move/from16 v4, p24

    .line 1
    invoke-virtual {v10, v13}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v9

    invoke-virtual {v10, v14}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, Lr/d;->f()Lr/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, Lr/d;->f()Lr/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v6

    invoke-static {}, Lq/d;->w()Lq/e;

    invoke-virtual/range {p10 .. p10}, Lr/d;->i()Z

    move-result v16

    invoke-virtual/range {p11 .. p11}, Lr/d;->i()Z

    move-result v17

    iget-object v5, v0, Lr/e;->I:Lr/d;

    invoke-virtual {v5}, Lr/d;->i()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v5, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v5, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-eqz p17, :cond_2

    const/16 v19, 0x3

    goto :goto_1

    :cond_2
    move/from16 v19, p21

    :goto_1
    sget-object v20, Lr/e$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    aget v12, v20, v21

    const/4 v2, 0x1

    if-eq v12, v2, :cond_3

    const/4 v2, 0x2

    if-eq v12, v2, :cond_3

    const/4 v2, 0x3

    if-eq v12, v2, :cond_3

    const/4 v2, 0x4

    if-eq v12, v2, :cond_4

    :cond_3
    move/from16 v12, v19

    :goto_2
    const/16 v19, 0x0

    goto :goto_3

    :cond_4
    move/from16 v12, v19

    if-ne v12, v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v19, 0x1

    :goto_3
    iget v2, v0, Lr/e;->f0:I

    const/16 v14, 0x8

    if-ne v2, v14, :cond_6

    const/4 v2, 0x0

    const/16 v19, 0x0

    goto :goto_4

    :cond_6
    move/from16 v2, p13

    :goto_4
    if-eqz p26, :cond_9

    if-nez v16, :cond_8

    if-nez v17, :cond_8

    if-nez v18, :cond_8

    move/from16 v14, p12

    invoke-virtual {v10, v9, v14}, Lq/d;->f(Lq/i;I)V

    :cond_7
    move-object/from16 v23, v6

    const/16 v6, 0x8

    goto :goto_5

    :cond_8
    if-eqz v16, :cond_7

    if-nez v17, :cond_7

    invoke-virtual/range {p10 .. p10}, Lr/d;->b()I

    move-result v14

    move-object/from16 v23, v6

    const/16 v6, 0x8

    invoke-virtual {v10, v9, v7, v14, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    goto :goto_5

    :cond_9
    move-object/from16 v23, v6

    move v6, v14

    :goto_5
    if-nez v19, :cond_d

    if-eqz p9, :cond_b

    const/4 v6, 0x0

    const/4 v14, 0x3

    invoke-virtual {v10, v8, v9, v6, v14}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    const/16 v6, 0x8

    if-lez v15, :cond_a

    invoke-virtual {v10, v8, v9, v15, v6}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_a
    const v2, 0x7fffffff

    if-ge v1, v2, :cond_c

    invoke-virtual {v10, v8, v9, v1, v6}, Lq/d;->j(Lq/i;Lq/i;II)V

    goto :goto_6

    :cond_b
    invoke-virtual {v10, v8, v9, v2, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    :cond_c
    :goto_6
    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    :goto_7
    move/from16 v25, v19

    move-object/from16 v14, v23

    move/from16 v19, p5

    :goto_8
    move/from16 v23, v5

    goto/16 :goto_10

    :cond_d
    const/4 v1, 0x2

    if-eq v5, v1, :cond_10

    if-nez p17, :cond_10

    const/4 v1, 0x1

    if-eq v12, v1, :cond_e

    if-nez v12, :cond_10

    :cond_e
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_f

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_f
    const/16 v2, 0x8

    invoke-virtual {v10, v8, v9, v1, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    move/from16 v19, p5

    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    move-object/from16 v14, v23

    const/16 v25, 0x0

    goto :goto_8

    :cond_10
    const/4 v1, -0x2

    if-ne v3, v1, :cond_11

    move v14, v2

    goto :goto_9

    :cond_11
    move v14, v3

    :goto_9
    if-ne v4, v1, :cond_12

    move v1, v2

    goto :goto_a

    :cond_12
    move v1, v4

    :goto_a
    if-lez v2, :cond_13

    const/4 v3, 0x1

    if-eq v12, v3, :cond_13

    const/4 v2, 0x0

    :cond_13
    const/16 v3, 0x8

    if-lez v14, :cond_14

    invoke-virtual {v10, v8, v9, v14, v3}, Lq/d;->h(Lq/i;Lq/i;II)V

    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_14
    const/4 v4, 0x1

    if-lez v1, :cond_16

    if-eqz p3, :cond_15

    if-ne v12, v4, :cond_15

    goto :goto_b

    :cond_15
    invoke-virtual {v10, v8, v9, v1, v3}, Lq/d;->j(Lq/i;Lq/i;II)V

    :goto_b
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_16
    if-ne v12, v4, :cond_18

    if-eqz p3, :cond_17

    invoke-virtual {v10, v8, v9, v2, v3}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    goto :goto_c

    :cond_17
    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v2, v4}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    invoke-virtual {v10, v8, v9, v2, v3}, Lq/d;->j(Lq/i;Lq/i;II)V

    :goto_c
    move-object v15, v7

    move-object v2, v8

    move/from16 v24, v14

    goto :goto_7

    :cond_18
    const/4 v2, 0x2

    if-ne v12, v2, :cond_1b

    invoke-virtual/range {p10 .. p10}, Lr/d;->g()Lr/d$b;

    move-result-object v3

    sget-object v4, Lr/d$b;->o:Lr/d$b;

    if-eq v3, v4, :cond_1a

    invoke-virtual/range {p10 .. p10}, Lr/d;->g()Lr/d$b;

    move-result-object v3

    sget-object v6, Lr/d$b;->q:Lr/d$b;

    if-ne v3, v6, :cond_19

    goto :goto_e

    :cond_19
    iget-object v3, v0, Lr/e;->N:Lr/e;

    sget-object v4, Lr/d$b;->n:Lr/d$b;

    invoke-virtual {v3, v4}, Lr/e;->k(Lr/d$b;)Lr/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v3

    iget-object v4, v0, Lr/e;->N:Lr/e;

    sget-object v6, Lr/d$b;->p:Lr/d$b;

    :goto_d
    invoke-virtual {v4, v6}, Lr/e;->k(Lr/d$b;)Lr/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v4

    move-object/from16 v19, v3

    move-object v6, v4

    goto :goto_f

    :cond_1a
    :goto_e
    iget-object v3, v0, Lr/e;->N:Lr/e;

    invoke-virtual {v3, v4}, Lr/e;->k(Lr/d$b;)Lr/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v3

    iget-object v4, v0, Lr/e;->N:Lr/e;

    sget-object v6, Lr/d$b;->q:Lr/d$b;

    goto :goto_d

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lq/d;->r()Lq/b;

    move-result-object v3

    move-object v4, v8

    move v2, v5

    move-object v5, v9

    move/from16 p9, v14

    move-object/from16 v14, v23

    move-object v15, v7

    move-object/from16 v7, v19

    move/from16 v23, v2

    move-object v2, v8

    move/from16 v8, p25

    invoke-virtual/range {v3 .. v8}, Lq/b;->k(Lq/i;Lq/i;Lq/i;Lq/i;F)Lq/b;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq/d;->d(Lq/b;)V

    move/from16 v19, p5

    move/from16 v24, p9

    const/16 v25, 0x0

    goto :goto_10

    :cond_1b
    move-object v15, v7

    move-object v2, v8

    move/from16 p9, v14

    move-object/from16 v14, v23

    move/from16 v23, v5

    move/from16 v24, p9

    move/from16 v25, v19

    const/16 v19, 0x1

    :goto_10
    if-eqz p26, :cond_4e

    if-eqz p18, :cond_1c

    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    move/from16 v6, v23

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    goto/16 :goto_29

    :cond_1c
    if-nez v16, :cond_1e

    if-nez v17, :cond_1e

    if-nez v18, :cond_1e

    :cond_1d
    :goto_11
    move-object v5, v2

    goto/16 :goto_27

    :cond_1e
    if-eqz v16, :cond_1f

    if-nez v17, :cond_1f

    goto :goto_11

    :cond_1f
    if-nez v16, :cond_20

    if-eqz v17, :cond_20

    invoke-virtual/range {p11 .. p11}, Lr/d;->b()I

    move-result v1

    neg-int v1, v1

    const/16 v3, 0x8

    invoke-virtual {v10, v2, v14, v1, v3}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    if-eqz p3, :cond_1d

    const/4 v1, 0x5

    const/4 v6, 0x0

    invoke-virtual {v10, v9, v11, v6, v1}, Lq/d;->h(Lq/i;Lq/i;II)V

    goto :goto_11

    :cond_20
    const/16 v3, 0x8

    const/4 v6, 0x0

    if-eqz v16, :cond_1d

    if-eqz v17, :cond_1d

    iget-object v4, v13, Lr/d;->d:Lr/d;

    iget-object v8, v4, Lr/d;->b:Lr/e;

    move-object/from16 v5, p11

    move v7, v3

    iget-object v3, v5, Lr/d;->d:Lr/d;

    iget-object v4, v3, Lr/d;->b:Lr/e;

    invoke-virtual/range {p0 .. p0}, Lr/e;->E()Lr/e;

    move-result-object v3

    const/16 v16, 0x6

    if-eqz v25, :cond_31

    if-nez v12, :cond_24

    if-nez v1, :cond_21

    if-nez v24, :cond_21

    move/from16 v18, v6

    move v1, v7

    move/from16 v17, v1

    const/16 v20, 0x1

    goto :goto_12

    :cond_21
    move/from16 v20, v6

    const/4 v1, 0x5

    const/16 v17, 0x5

    const/16 v18, 0x1

    :goto_12
    instance-of v6, v8, Lr/a;

    if-nez v6, :cond_23

    instance-of v6, v4, Lr/a;

    if-eqz v6, :cond_22

    goto :goto_13

    :cond_22
    move/from16 v23, v1

    move/from16 v1, v16

    move/from16 v21, v18

    const/4 v6, 0x0

    const/4 v7, 0x1

    move/from16 v18, v17

    goto/16 :goto_1a

    :cond_23
    :goto_13
    move/from16 v23, v1

    move/from16 v1, v16

    move/from16 v21, v18

    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_14
    const/16 v18, 0x4

    goto/16 :goto_1a

    :cond_24
    const/4 v6, 0x1

    if-ne v12, v6, :cond_25

    move/from16 v23, v7

    move/from16 v1, v16

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x1

    goto/16 :goto_1a

    :cond_25
    const/4 v6, 0x3

    if-ne v12, v6, :cond_30

    iget v6, v0, Lr/e;->u:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_28

    if-eqz p19, :cond_27

    if-eqz p3, :cond_26

    const/4 v1, 0x5

    :goto_15
    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x5

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v23, 0x8

    goto/16 :goto_1a

    :cond_26
    const/4 v1, 0x4

    goto :goto_15

    :cond_27
    const/16 v1, 0x8

    goto :goto_15

    :cond_28
    if-eqz p17, :cond_2b

    move/from16 v6, p22

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2a

    const/4 v7, 0x1

    if-ne v6, v7, :cond_29

    goto :goto_16

    :cond_29
    const/16 v1, 0x8

    const/4 v6, 0x5

    goto :goto_17

    :cond_2a
    const/4 v7, 0x1

    :goto_16
    const/4 v1, 0x5

    const/4 v6, 0x4

    :goto_17
    move/from16 v23, v1

    move/from16 v18, v6

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    goto/16 :goto_1a

    :cond_2b
    const/4 v7, 0x1

    if-lez v1, :cond_2c

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x5

    :goto_18
    const/16 v23, 0x5

    goto :goto_1a

    :cond_2c
    if-nez v1, :cond_2f

    if-nez v24, :cond_2f

    if-nez p19, :cond_2d

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x8

    goto :goto_18

    :cond_2d
    if-eq v8, v3, :cond_2e

    if-eq v4, v3, :cond_2e

    const/4 v1, 0x4

    goto :goto_19

    :cond_2e
    const/4 v1, 0x5

    :goto_19
    move/from16 v23, v1

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    goto/16 :goto_14

    :cond_2f
    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x4

    goto :goto_18

    :cond_30
    const/4 v7, 0x1

    move/from16 v1, v16

    const/4 v6, 0x0

    const/16 v18, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    goto :goto_18

    :cond_31
    const/4 v7, 0x1

    move v6, v7

    move/from16 v21, v6

    move/from16 v1, v16

    const/16 v18, 0x4

    const/16 v20, 0x0

    goto :goto_18

    :goto_1a
    if-eqz v6, :cond_32

    if-ne v15, v14, :cond_32

    if-eq v8, v3, :cond_32

    const/16 v26, 0x0

    const/16 v27, 0x0

    goto :goto_1b

    :cond_32
    move/from16 v26, v6

    move/from16 v27, v7

    :goto_1b
    if-eqz v21, :cond_34

    iget v6, v0, Lr/e;->f0:I

    const/16 v7, 0x8

    if-ne v6, v7, :cond_33

    const/16 v17, 0x4

    goto :goto_1c

    :cond_33
    move/from16 v17, v1

    :goto_1c
    invoke-virtual/range {p10 .. p10}, Lr/d;->b()I

    move-result v6

    invoke-virtual/range {p11 .. p11}, Lr/d;->b()I

    move-result v28

    move-object/from16 v1, p1

    move-object/from16 p5, v2

    const/4 v13, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x1

    move-object v2, v9

    move-object v13, v3

    move-object v3, v15

    move/from16 p21, v12

    move-object v12, v4

    move v4, v6

    move-object v6, v5

    move/from16 v5, p16

    move-object v6, v14

    move v11, v7

    move-object/from16 v7, p5

    move-object/from16 v29, v8

    move/from16 v8, v28

    move-object/from16 v30, v9

    move/from16 v9, v17

    invoke-virtual/range {v1 .. v9}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    goto :goto_1d

    :cond_34
    move-object/from16 p5, v2

    move-object v13, v3

    move/from16 v22, v7

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move/from16 p21, v12

    const/16 v11, 0x8

    const/16 v21, 0x4

    move-object v12, v4

    :goto_1d
    iget v1, v0, Lr/e;->f0:I

    if-ne v1, v11, :cond_35

    return-void

    :cond_35
    if-eqz v26, :cond_39

    if-eqz p3, :cond_37

    if-eq v15, v14, :cond_37

    if-nez v25, :cond_37

    move-object/from16 v1, v29

    instance-of v2, v1, Lr/a;

    if-nez v2, :cond_36

    instance-of v2, v12, Lr/a;

    if-eqz v2, :cond_38

    :cond_36
    move/from16 v2, v16

    goto :goto_1e

    :cond_37
    move-object/from16 v1, v29

    :cond_38
    move/from16 v2, v23

    :goto_1e
    invoke-virtual/range {p10 .. p10}, Lr/d;->b()I

    move-result v3

    move-object/from16 v4, v30

    invoke-virtual {v10, v4, v15, v3, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    invoke-virtual/range {p11 .. p11}, Lr/d;->b()I

    move-result v3

    neg-int v3, v3

    move-object/from16 v5, p5

    invoke-virtual {v10, v5, v14, v3, v2}, Lq/d;->j(Lq/i;Lq/i;II)V

    move/from16 v23, v2

    goto :goto_1f

    :cond_39
    move-object/from16 v5, p5

    move-object/from16 v1, v29

    move-object/from16 v4, v30

    :goto_1f
    if-eqz p3, :cond_3a

    if-eqz p20, :cond_3a

    instance-of v2, v1, Lr/a;

    if-nez v2, :cond_3a

    instance-of v2, v12, Lr/a;

    if-nez v2, :cond_3a

    move/from16 v3, v16

    move v6, v3

    move/from16 v2, v22

    goto :goto_20

    :cond_3a
    move/from16 v3, v18

    move/from16 v6, v23

    move/from16 v2, v27

    :goto_20
    if-eqz v2, :cond_46

    if-eqz v20, :cond_43

    if-eqz p19, :cond_3b

    if-eqz p4, :cond_43

    :cond_3b
    if-eq v1, v13, :cond_3d

    if-ne v12, v13, :cond_3c

    goto :goto_21

    :cond_3c
    move/from16 v16, v3

    :cond_3d
    :goto_21
    instance-of v2, v1, Lr/g;

    if-nez v2, :cond_3e

    instance-of v2, v12, Lr/g;

    if-eqz v2, :cond_3f

    :cond_3e
    const/16 v16, 0x5

    :cond_3f
    instance-of v2, v1, Lr/a;

    if-nez v2, :cond_40

    instance-of v2, v12, Lr/a;

    if-eqz v2, :cond_41

    :cond_40
    const/16 v16, 0x5

    :cond_41
    if-eqz p19, :cond_42

    const/4 v2, 0x5

    goto :goto_22

    :cond_42
    move/from16 v2, v16

    :goto_22
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_23

    :cond_43
    move v2, v3

    :goto_23
    if-eqz p3, :cond_45

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz p17, :cond_45

    if-nez p19, :cond_45

    if-eq v1, v13, :cond_44

    if-ne v12, v13, :cond_45

    :cond_44
    move/from16 v2, v21

    :cond_45
    invoke-virtual/range {p10 .. p10}, Lr/d;->b()I

    move-result v1

    invoke-virtual {v10, v4, v15, v1, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    invoke-virtual/range {p11 .. p11}, Lr/d;->b()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v5, v14, v1, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    :cond_46
    if-eqz p3, :cond_48

    move-object/from16 v1, p6

    move v2, v11

    if-ne v1, v15, :cond_47

    invoke-virtual/range {p10 .. p10}, Lr/d;->b()I

    move-result v3

    goto :goto_24

    :cond_47
    const/4 v3, 0x0

    :goto_24
    if-eq v15, v1, :cond_49

    const/4 v6, 0x5

    invoke-virtual {v10, v4, v1, v3, v6}, Lq/d;->h(Lq/i;Lq/i;II)V

    goto :goto_25

    :cond_48
    move v2, v11

    :cond_49
    :goto_25
    if-eqz p3, :cond_4b

    if-eqz v25, :cond_4b

    if-nez p14, :cond_4b

    if-nez v24, :cond_4b

    if-eqz v25, :cond_4a

    move/from16 v12, p21

    const/4 v1, 0x3

    if-ne v12, v1, :cond_4a

    const/4 v1, 0x0

    :goto_26
    invoke-virtual {v10, v5, v4, v1, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    goto :goto_27

    :cond_4a
    const/4 v1, 0x0

    const/4 v2, 0x5

    goto :goto_26

    :cond_4b
    :goto_27
    if-eqz p3, :cond_4d

    if-eqz v19, :cond_4d

    move-object/from16 v1, p11

    iget-object v2, v1, Lr/d;->d:Lr/d;

    if-eqz v2, :cond_4c

    invoke-virtual/range {p11 .. p11}, Lr/d;->b()I

    move-result v2

    move-object/from16 v3, p7

    goto :goto_28

    :cond_4c
    move-object/from16 v3, p7

    const/4 v2, 0x0

    :goto_28
    if-eq v14, v3, :cond_4d

    const/4 v1, 0x5

    invoke-virtual {v10, v3, v5, v2, v1}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_4d
    return-void

    :cond_4e
    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    move/from16 v6, v23

    :goto_29
    if-ge v6, v7, :cond_53

    if-eqz p3, :cond_53

    if-eqz v19, :cond_53

    const/4 v6, 0x0

    invoke-virtual {v10, v4, v1, v6, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    if-nez p2, :cond_50

    iget-object v1, v0, Lr/e;->F:Lr/d;

    iget-object v1, v1, Lr/d;->d:Lr/d;

    if-nez v1, :cond_4f

    goto :goto_2a

    :cond_4f
    const/4 v1, 0x0

    goto :goto_2b

    :cond_50
    :goto_2a
    move/from16 v1, v22

    :goto_2b
    if-nez p2, :cond_52

    iget-object v4, v0, Lr/e;->F:Lr/d;

    iget-object v4, v4, Lr/d;->d:Lr/d;

    if-eqz v4, :cond_52

    iget-object v1, v4, Lr/d;->b:Lr/e;

    iget v4, v1, Lr/e;->Q:F

    const/4 v6, 0x0

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_51

    iget-object v1, v1, Lr/e;->M:[Lr/e$b;

    const/4 v4, 0x0

    aget-object v6, v1, v4

    sget-object v4, Lr/e$b;->o:Lr/e$b;

    if-ne v6, v4, :cond_51

    aget-object v1, v1, v22

    if-ne v1, v4, :cond_51

    goto :goto_2c

    :cond_51
    const/16 v22, 0x0

    goto :goto_2c

    :cond_52
    move/from16 v22, v1

    :goto_2c
    if-eqz v22, :cond_53

    const/4 v1, 0x0

    invoke-virtual {v10, v3, v5, v1, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_53
    return-void
.end method


# virtual methods
.method public A()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->w:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public A0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr/e;->O:I

    .line 2
    .line 3
    iget v0, p0, Lr/e;->Z:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lr/e;->O:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->a0:I

    .line 2
    .line 3
    return v0
.end method

.method public B0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->S:I

    .line 2
    .line 3
    return-void
.end method

.method public C()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->Z:I

    .line 2
    .line 3
    return v0
.end method

.method public C0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->T:I

    .line 2
    .line 3
    return-void
.end method

.method public D(I)Lr/e;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lr/e;->D:Lr/d;

    .line 4
    .line 5
    iget-object v0, p1, Lr/d;->d:Lr/d;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, Lr/d;->b:Lr/e;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lr/e;->E:Lr/d;

    .line 20
    .line 21
    iget-object v0, p1, Lr/d;->d:Lr/d;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, Lr/d;->b:Lr/e;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public D0(ZZZZ)V
    .locals 3

    .line 1
    iget p1, p0, Lr/e;->u:I

    .line 2
    .line 3
    const/high16 p2, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne p1, v2, :cond_1

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lr/e;->u:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-nez p3, :cond_1

    .line 18
    .line 19
    if-eqz p4, :cond_1

    .line 20
    .line 21
    iput v1, p0, Lr/e;->u:I

    .line 22
    .line 23
    iget p1, p0, Lr/e;->R:I

    .line 24
    .line 25
    if-ne p1, v2, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lr/e;->v:F

    .line 28
    .line 29
    div-float p1, p2, p1

    .line 30
    .line 31
    iput p1, p0, Lr/e;->v:F

    .line 32
    .line 33
    :cond_1
    :goto_0
    iget p1, p0, Lr/e;->u:I

    .line 34
    .line 35
    if-nez p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, Lr/e;->C:Lr/d;

    .line 38
    .line 39
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lr/e;->E:Lr/d;

    .line 46
    .line 47
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    :cond_2
    iput v1, p0, Lr/e;->u:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget p1, p0, Lr/e;->u:I

    .line 57
    .line 58
    if-ne p1, v1, :cond_5

    .line 59
    .line 60
    iget-object p1, p0, Lr/e;->B:Lr/d;

    .line 61
    .line 62
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    iget-object p1, p0, Lr/e;->D:Lr/d;

    .line 69
    .line 70
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    :cond_4
    iput v0, p0, Lr/e;->u:I

    .line 77
    .line 78
    :cond_5
    :goto_1
    iget p1, p0, Lr/e;->u:I

    .line 79
    .line 80
    if-ne p1, v2, :cond_8

    .line 81
    .line 82
    iget-object p1, p0, Lr/e;->C:Lr/d;

    .line 83
    .line 84
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    iget-object p1, p0, Lr/e;->E:Lr/d;

    .line 91
    .line 92
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    iget-object p1, p0, Lr/e;->B:Lr/d;

    .line 99
    .line 100
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, Lr/e;->D:Lr/d;

    .line 107
    .line 108
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_8

    .line 113
    .line 114
    :cond_6
    iget-object p1, p0, Lr/e;->C:Lr/d;

    .line 115
    .line 116
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    iget-object p1, p0, Lr/e;->E:Lr/d;

    .line 123
    .line 124
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    iput v0, p0, Lr/e;->u:I

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    iget-object p1, p0, Lr/e;->B:Lr/d;

    .line 134
    .line 135
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    iget-object p1, p0, Lr/e;->D:Lr/d;

    .line 142
    .line 143
    invoke-virtual {p1}, Lr/d;->i()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    iget p1, p0, Lr/e;->v:F

    .line 150
    .line 151
    div-float p1, p2, p1

    .line 152
    .line 153
    iput p1, p0, Lr/e;->v:F

    .line 154
    .line 155
    iput v1, p0, Lr/e;->u:I

    .line 156
    .line 157
    :cond_8
    :goto_2
    iget p1, p0, Lr/e;->u:I

    .line 158
    .line 159
    if-ne p1, v2, :cond_a

    .line 160
    .line 161
    iget p1, p0, Lr/e;->o:I

    .line 162
    .line 163
    if-lez p1, :cond_9

    .line 164
    .line 165
    iget p3, p0, Lr/e;->r:I

    .line 166
    .line 167
    if-nez p3, :cond_9

    .line 168
    .line 169
    iput v0, p0, Lr/e;->u:I

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_9
    if-nez p1, :cond_a

    .line 173
    .line 174
    iget p1, p0, Lr/e;->r:I

    .line 175
    .line 176
    if-lez p1, :cond_a

    .line 177
    .line 178
    iget p1, p0, Lr/e;->v:F

    .line 179
    .line 180
    div-float/2addr p2, p1

    .line 181
    iput p2, p0, Lr/e;->v:F

    .line 182
    .line 183
    iput v1, p0, Lr/e;->u:I

    .line 184
    .line 185
    :cond_a
    :goto_3
    return-void
.end method

.method public E()Lr/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->N:Lr/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public E0(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lr/e;->e:Ls/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls/m;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/2addr p1, v0

    .line 8
    iget-object v0, p0, Lr/e;->f:Ls/l;

    .line 9
    .line 10
    invoke-virtual {v0}, Ls/m;->k()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    and-int/2addr p2, v0

    .line 15
    iget-object v0, p0, Lr/e;->e:Ls/j;

    .line 16
    .line 17
    iget-object v1, v0, Ls/m;->h:Ls/f;

    .line 18
    .line 19
    iget v1, v1, Ls/f;->g:I

    .line 20
    .line 21
    iget-object v2, p0, Lr/e;->f:Ls/l;

    .line 22
    .line 23
    iget-object v3, v2, Ls/m;->h:Ls/f;

    .line 24
    .line 25
    iget v3, v3, Ls/f;->g:I

    .line 26
    .line 27
    iget-object v0, v0, Ls/m;->i:Ls/f;

    .line 28
    .line 29
    iget v0, v0, Ls/f;->g:I

    .line 30
    .line 31
    iget-object v2, v2, Ls/m;->i:Ls/f;

    .line 32
    .line 33
    iget v2, v2, Ls/f;->g:I

    .line 34
    .line 35
    sub-int v4, v0, v1

    .line 36
    .line 37
    sub-int v5, v2, v3

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    if-ltz v4, :cond_0

    .line 41
    .line 42
    if-ltz v5, :cond_0

    .line 43
    .line 44
    const/high16 v4, -0x80000000

    .line 45
    .line 46
    if-eq v1, v4, :cond_0

    .line 47
    .line 48
    const v5, 0x7fffffff

    .line 49
    .line 50
    .line 51
    if-eq v1, v5, :cond_0

    .line 52
    .line 53
    if-eq v3, v4, :cond_0

    .line 54
    .line 55
    if-eq v3, v5, :cond_0

    .line 56
    .line 57
    if-eq v0, v4, :cond_0

    .line 58
    .line 59
    if-eq v0, v5, :cond_0

    .line 60
    .line 61
    if-eq v2, v4, :cond_0

    .line 62
    .line 63
    if-ne v2, v5, :cond_1

    .line 64
    .line 65
    :cond_0
    move v0, v6

    .line 66
    move v1, v0

    .line 67
    move v2, v1

    .line 68
    move v3, v2

    .line 69
    :cond_1
    sub-int/2addr v0, v1

    .line 70
    sub-int/2addr v2, v3

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iput v1, p0, Lr/e;->S:I

    .line 74
    .line 75
    :cond_2
    if-eqz p2, :cond_3

    .line 76
    .line 77
    iput v3, p0, Lr/e;->T:I

    .line 78
    .line 79
    :cond_3
    iget v1, p0, Lr/e;->f0:I

    .line 80
    .line 81
    const/16 v3, 0x8

    .line 82
    .line 83
    if-ne v1, v3, :cond_4

    .line 84
    .line 85
    iput v6, p0, Lr/e;->O:I

    .line 86
    .line 87
    iput v6, p0, Lr/e;->P:I

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iget-object p1, p0, Lr/e;->M:[Lr/e$b;

    .line 93
    .line 94
    aget-object p1, p1, v6

    .line 95
    .line 96
    sget-object v1, Lr/e$b;->m:Lr/e$b;

    .line 97
    .line 98
    if-ne p1, v1, :cond_5

    .line 99
    .line 100
    iget p1, p0, Lr/e;->O:I

    .line 101
    .line 102
    if-ge v0, p1, :cond_5

    .line 103
    .line 104
    move v0, p1

    .line 105
    :cond_5
    iput v0, p0, Lr/e;->O:I

    .line 106
    .line 107
    iget p1, p0, Lr/e;->Z:I

    .line 108
    .line 109
    if-ge v0, p1, :cond_6

    .line 110
    .line 111
    iput p1, p0, Lr/e;->O:I

    .line 112
    .line 113
    :cond_6
    if-eqz p2, :cond_8

    .line 114
    .line 115
    iget-object p1, p0, Lr/e;->M:[Lr/e$b;

    .line 116
    .line 117
    const/4 p2, 0x1

    .line 118
    aget-object p1, p1, p2

    .line 119
    .line 120
    sget-object p2, Lr/e$b;->m:Lr/e$b;

    .line 121
    .line 122
    if-ne p1, p2, :cond_7

    .line 123
    .line 124
    iget p1, p0, Lr/e;->P:I

    .line 125
    .line 126
    if-ge v2, p1, :cond_7

    .line 127
    .line 128
    move v2, p1

    .line 129
    :cond_7
    iput v2, p0, Lr/e;->P:I

    .line 130
    .line 131
    iget p1, p0, Lr/e;->a0:I

    .line 132
    .line 133
    if-ge v2, p1, :cond_8

    .line 134
    .line 135
    iput p1, p0, Lr/e;->P:I

    .line 136
    .line 137
    :cond_8
    return-void
.end method

.method public F(I)Lr/e;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lr/e;->B:Lr/d;

    .line 4
    .line 5
    iget-object v0, p1, Lr/d;->d:Lr/d;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, Lr/d;->b:Lr/e;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lr/e;->C:Lr/d;

    .line 20
    .line 21
    iget-object v0, p1, Lr/d;->d:Lr/d;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, Lr/d;->b:Lr/e;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public F0(Lq/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq/d;->x(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lr/e;->C:Lr/d;

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lq/d;->x(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lr/e;->D:Lr/d;

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Lq/d;->x(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lr/e;->E:Lr/d;

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Lq/d;->x(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v3, p0, Lr/e;->e:Ls/j;

    .line 26
    .line 27
    iget-object v4, v3, Ls/m;->h:Ls/f;

    .line 28
    .line 29
    iget-boolean v5, v4, Ls/f;->j:Z

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    iget-object v3, v3, Ls/m;->i:Ls/f;

    .line 34
    .line 35
    iget-boolean v5, v3, Ls/f;->j:Z

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    iget v0, v4, Ls/f;->g:I

    .line 40
    .line 41
    iget v2, v3, Ls/f;->g:I

    .line 42
    .line 43
    :cond_0
    iget-object v3, p0, Lr/e;->f:Ls/l;

    .line 44
    .line 45
    iget-object v4, v3, Ls/m;->h:Ls/f;

    .line 46
    .line 47
    iget-boolean v5, v4, Ls/f;->j:Z

    .line 48
    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    iget-object v3, v3, Ls/m;->i:Ls/f;

    .line 52
    .line 53
    iget-boolean v5, v3, Ls/f;->j:Z

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    iget v1, v4, Ls/f;->g:I

    .line 58
    .line 59
    iget p1, v3, Ls/f;->g:I

    .line 60
    .line 61
    :cond_1
    sub-int v3, v2, v0

    .line 62
    .line 63
    sub-int v4, p1, v1

    .line 64
    .line 65
    if-ltz v3, :cond_2

    .line 66
    .line 67
    if-ltz v4, :cond_2

    .line 68
    .line 69
    const/high16 v3, -0x80000000

    .line 70
    .line 71
    if-eq v0, v3, :cond_2

    .line 72
    .line 73
    const v4, 0x7fffffff

    .line 74
    .line 75
    .line 76
    if-eq v0, v4, :cond_2

    .line 77
    .line 78
    if-eq v1, v3, :cond_2

    .line 79
    .line 80
    if-eq v1, v4, :cond_2

    .line 81
    .line 82
    if-eq v2, v3, :cond_2

    .line 83
    .line 84
    if-eq v2, v4, :cond_2

    .line 85
    .line 86
    if-eq p1, v3, :cond_2

    .line 87
    .line 88
    if-ne p1, v4, :cond_3

    .line 89
    .line 90
    :cond_2
    const/4 v0, 0x0

    .line 91
    move p1, v0

    .line 92
    move v1, p1

    .line 93
    move v2, v1

    .line 94
    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lr/e;->c0(IIII)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public G()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr/e;->O()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lr/e;->O:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public H(I)Ls/m;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lr/e;->e:Ls/j;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lr/e;->f:Ls/l;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public I()F
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->c0:F

    .line 2
    .line 3
    return v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->n0:I

    .line 2
    .line 3
    return v0
.end method

.method public K()Lr/e$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->M:[Lr/e$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    return-object v0
.end method

.method public L()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/e;->C:Lr/d;

    .line 6
    .line 7
    iget v0, v0, Lr/d;->e:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lr/e;->D:Lr/d;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lr/e;->E:Lr/d;

    .line 16
    .line 17
    iget v1, v1, Lr/d;->e:I

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    :cond_1
    return v0
.end method

.method public M()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->f0:I

    .line 2
    .line 3
    return v0
.end method

.method public N()I
    .locals 2

    .line 1
    iget v0, p0, Lr/e;->f0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, Lr/e;->O:I

    .line 10
    .line 11
    return v0
.end method

.method public O()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->N:Lr/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lr/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lr/f;

    .line 10
    .line 11
    iget v0, v0, Lr/f;->C0:I

    .line 12
    .line 13
    iget v1, p0, Lr/e;->S:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, Lr/e;->S:I

    .line 18
    .line 19
    return v0
.end method

.method public P()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->N:Lr/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lr/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lr/f;

    .line 10
    .line 11
    iget v0, v0, Lr/f;->D0:I

    .line 12
    .line 13
    iget v1, p0, Lr/e;->T:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, Lr/e;->T:I

    .line 18
    .line 19
    return v0
.end method

.method public Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/e;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public R(Lr/d$b;Lr/e;Lr/d$b;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/e;->k(Lr/d$b;)Lr/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2, p3}, Lr/e;->k(Lr/d$b;)Lr/d;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x1

    .line 10
    invoke-virtual {p1, p2, p4, p5, p3}, Lr/d;->a(Lr/d;IIZ)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lr/d;->d:Lr/d;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lr/e;->D:Lr/d;

    .line 12
    .line 13
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, Lr/d;->d:Lr/d;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public U()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/e;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public V()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->C:Lr/d;

    .line 2
    .line 3
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lr/d;->d:Lr/d;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lr/e;->E:Lr/d;

    .line 12
    .line 13
    iget-object v1, v0, Lr/d;->d:Lr/d;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, Lr/d;->d:Lr/d;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public W()V
    .locals 6

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/d;->k()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/e;->C:Lr/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr/d;->k()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr/e;->D:Lr/d;

    .line 12
    .line 13
    invoke-virtual {v0}, Lr/d;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lr/e;->E:Lr/d;

    .line 17
    .line 18
    invoke-virtual {v0}, Lr/d;->k()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lr/e;->F:Lr/d;

    .line 22
    .line 23
    invoke-virtual {v0}, Lr/d;->k()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lr/e;->G:Lr/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lr/d;->k()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lr/e;->H:Lr/d;

    .line 32
    .line 33
    invoke-virtual {v0}, Lr/d;->k()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lr/e;->I:Lr/d;

    .line 37
    .line 38
    invoke-virtual {v0}, Lr/d;->k()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lr/e;->N:Lr/e;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput v1, p0, Lr/e;->x:F

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iput v2, p0, Lr/e;->O:I

    .line 49
    .line 50
    iput v2, p0, Lr/e;->P:I

    .line 51
    .line 52
    iput v1, p0, Lr/e;->Q:F

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    iput v1, p0, Lr/e;->R:I

    .line 56
    .line 57
    iput v2, p0, Lr/e;->S:I

    .line 58
    .line 59
    iput v2, p0, Lr/e;->T:I

    .line 60
    .line 61
    iput v2, p0, Lr/e;->W:I

    .line 62
    .line 63
    iput v2, p0, Lr/e;->X:I

    .line 64
    .line 65
    iput v2, p0, Lr/e;->Y:I

    .line 66
    .line 67
    iput v2, p0, Lr/e;->Z:I

    .line 68
    .line 69
    iput v2, p0, Lr/e;->a0:I

    .line 70
    .line 71
    sget v3, Lr/e;->v0:F

    .line 72
    .line 73
    iput v3, p0, Lr/e;->b0:F

    .line 74
    .line 75
    iput v3, p0, Lr/e;->c0:F

    .line 76
    .line 77
    iget-object v3, p0, Lr/e;->M:[Lr/e$b;

    .line 78
    .line 79
    sget-object v4, Lr/e$b;->m:Lr/e$b;

    .line 80
    .line 81
    aput-object v4, v3, v2

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    aput-object v4, v3, v5

    .line 85
    .line 86
    iput-object v0, p0, Lr/e;->d0:Ljava/lang/Object;

    .line 87
    .line 88
    iput v2, p0, Lr/e;->e0:I

    .line 89
    .line 90
    iput v2, p0, Lr/e;->f0:I

    .line 91
    .line 92
    iput-object v0, p0, Lr/e;->h0:Ljava/lang/String;

    .line 93
    .line 94
    iput-boolean v2, p0, Lr/e;->i0:Z

    .line 95
    .line 96
    iput-boolean v2, p0, Lr/e;->j0:Z

    .line 97
    .line 98
    iput v2, p0, Lr/e;->m0:I

    .line 99
    .line 100
    iput v2, p0, Lr/e;->n0:I

    .line 101
    .line 102
    iput-boolean v2, p0, Lr/e;->o0:Z

    .line 103
    .line 104
    iput-boolean v2, p0, Lr/e;->p0:Z

    .line 105
    .line 106
    iget-object v0, p0, Lr/e;->q0:[F

    .line 107
    .line 108
    const/high16 v3, -0x40800000    # -1.0f

    .line 109
    .line 110
    aput v3, v0, v2

    .line 111
    .line 112
    aput v3, v0, v5

    .line 113
    .line 114
    iput v1, p0, Lr/e;->j:I

    .line 115
    .line 116
    iput v1, p0, Lr/e;->k:I

    .line 117
    .line 118
    iget-object v0, p0, Lr/e;->w:[I

    .line 119
    .line 120
    const v3, 0x7fffffff

    .line 121
    .line 122
    .line 123
    aput v3, v0, v2

    .line 124
    .line 125
    aput v3, v0, v5

    .line 126
    .line 127
    iput v2, p0, Lr/e;->l:I

    .line 128
    .line 129
    iput v2, p0, Lr/e;->m:I

    .line 130
    .line 131
    const/high16 v0, 0x3f800000    # 1.0f

    .line 132
    .line 133
    iput v0, p0, Lr/e;->q:F

    .line 134
    .line 135
    iput v0, p0, Lr/e;->t:F

    .line 136
    .line 137
    iput v3, p0, Lr/e;->p:I

    .line 138
    .line 139
    iput v3, p0, Lr/e;->s:I

    .line 140
    .line 141
    iput v2, p0, Lr/e;->o:I

    .line 142
    .line 143
    iput v2, p0, Lr/e;->r:I

    .line 144
    .line 145
    iput-boolean v2, p0, Lr/e;->i:Z

    .line 146
    .line 147
    iput v1, p0, Lr/e;->u:I

    .line 148
    .line 149
    iput v0, p0, Lr/e;->v:F

    .line 150
    .line 151
    iput-boolean v2, p0, Lr/e;->k0:Z

    .line 152
    .line 153
    iput-boolean v2, p0, Lr/e;->l0:Z

    .line 154
    .line 155
    iget-object v0, p0, Lr/e;->g:[Z

    .line 156
    .line 157
    aput-boolean v5, v0, v2

    .line 158
    .line 159
    aput-boolean v5, v0, v5

    .line 160
    .line 161
    iput-boolean v2, p0, Lr/e;->A:Z

    .line 162
    .line 163
    iget-object v0, p0, Lr/e;->L:[Z

    .line 164
    .line 165
    aput-boolean v2, v0, v2

    .line 166
    .line 167
    aput-boolean v2, v0, v5

    .line 168
    .line 169
    return-void
.end method

.method public X(Lq/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/e;->C:Lr/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr/e;->D:Lr/d;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lr/e;->E:Lr/d;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lr/e;->F:Lr/d;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lr/e;->I:Lr/d;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lr/e;->G:Lr/d;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lr/e;->H:Lr/d;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lr/d;->l(Lq/c;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public Y(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->Y:I

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    iput-boolean p1, p0, Lr/e;->y:Z

    .line 9
    .line 10
    return-void
.end method

.method public Z(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/e;->d0:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/e;->g0:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public b0(Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x2c

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, -0x1

    .line 25
    if-lez v2, :cond_3

    .line 26
    .line 27
    add-int/lit8 v6, v1, -0x1

    .line 28
    .line 29
    if-ge v2, v6, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "W"

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v3, "H"

    .line 45
    .line 46
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    move v3, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v3, v5

    .line 55
    :goto_0
    add-int/2addr v2, v4

    .line 56
    move v5, v3

    .line 57
    move v3, v2

    .line 58
    :cond_3
    const/16 v2, 0x3a

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ltz v2, :cond_5

    .line 65
    .line 66
    sub-int/2addr v1, v4

    .line 67
    if-ge v2, v1, :cond_5

    .line 68
    .line 69
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    add-int/2addr v2, v4

    .line 74
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-lez v2, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-lez v2, :cond_6

    .line 89
    .line 90
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    cmpl-float v2, v1, v0

    .line 99
    .line 100
    if-lez v2, :cond_6

    .line 101
    .line 102
    cmpl-float v2, p1, v0

    .line 103
    .line 104
    if-lez v2, :cond_6

    .line 105
    .line 106
    if-ne v5, v4, :cond_4

    .line 107
    .line 108
    div-float/2addr p1, v1

    .line 109
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    goto :goto_1

    .line 114
    :cond_4
    div-float/2addr v1, p1

    .line 115
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 116
    .line 117
    .line 118
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-lez v1, :cond_6

    .line 129
    .line 130
    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 131
    .line 132
    .line 133
    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 134
    goto :goto_1

    .line 135
    :catch_0
    :cond_6
    move p1, v0

    .line 136
    :goto_1
    cmpl-float v0, p1, v0

    .line 137
    .line 138
    if-lez v0, :cond_7

    .line 139
    .line 140
    iput p1, p0, Lr/e;->Q:F

    .line 141
    .line 142
    iput v5, p0, Lr/e;->R:I

    .line 143
    .line 144
    :cond_7
    return-void

    .line 145
    :cond_8
    :goto_2
    iput v0, p0, Lr/e;->Q:F

    .line 146
    .line 147
    return-void
.end method

.method public c0(IIII)V
    .locals 1

    .line 1
    sub-int/2addr p3, p1

    .line 2
    sub-int/2addr p4, p2

    .line 3
    iput p1, p0, Lr/e;->S:I

    .line 4
    .line 5
    iput p2, p0, Lr/e;->T:I

    .line 6
    .line 7
    iget p1, p0, Lr/e;->f0:I

    .line 8
    .line 9
    const/16 p2, 0x8

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p1, p2, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lr/e;->O:I

    .line 15
    .line 16
    iput v0, p0, Lr/e;->P:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, p0, Lr/e;->M:[Lr/e$b;

    .line 20
    .line 21
    aget-object p2, p1, v0

    .line 22
    .line 23
    sget-object v0, Lr/e$b;->m:Lr/e$b;

    .line 24
    .line 25
    if-ne p2, v0, :cond_1

    .line 26
    .line 27
    iget p2, p0, Lr/e;->O:I

    .line 28
    .line 29
    if-ge p3, p2, :cond_1

    .line 30
    .line 31
    move p3, p2

    .line 32
    :cond_1
    const/4 p2, 0x1

    .line 33
    aget-object p1, p1, p2

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    iget p1, p0, Lr/e;->P:I

    .line 38
    .line 39
    if-ge p4, p1, :cond_2

    .line 40
    .line 41
    move p4, p1

    .line 42
    :cond_2
    iput p3, p0, Lr/e;->O:I

    .line 43
    .line 44
    iput p4, p0, Lr/e;->P:I

    .line 45
    .line 46
    iget p1, p0, Lr/e;->a0:I

    .line 47
    .line 48
    if-ge p4, p1, :cond_3

    .line 49
    .line 50
    iput p1, p0, Lr/e;->P:I

    .line 51
    .line 52
    :cond_3
    iget p1, p0, Lr/e;->Z:I

    .line 53
    .line 54
    if-ge p3, p1, :cond_4

    .line 55
    .line 56
    iput p1, p0, Lr/e;->O:I

    .line 57
    .line 58
    :cond_4
    return-void
.end method

.method public d0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/e;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method e()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lr/g;

    .line 2
    .line 3
    return v0
.end method

.method public e0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr/e;->P:I

    .line 2
    .line 3
    iget v0, p0, Lr/e;->a0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lr/e;->P:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public f(Lq/d;)V
    .locals 47

    move-object/from16 v13, p0

    move-object/from16 v9, p1

    .line 1
    iget-object v0, v13, Lr/e;->B:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v7

    iget-object v0, v13, Lr/e;->D:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v6

    iget-object v0, v13, Lr/e;->C:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v4

    iget-object v0, v13, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v3

    iget-object v0, v13, Lr/e;->F:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    sget-boolean v0, Lq/d;->r:Z

    iget-object v0, v13, Lr/e;->e:Ls/j;

    iget-object v2, v0, Ls/m;->h:Ls/f;

    iget-boolean v5, v2, Ls/f;->j:Z

    const/16 v15, 0x8

    const/4 v14, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget-boolean v0, v0, Ls/f;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v5, v0, Ls/m;->h:Ls/f;

    iget-boolean v5, v5, Ls/f;->j:Z

    if-eqz v5, :cond_4

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget-boolean v0, v0, Ls/f;->j:Z

    if-eqz v0, :cond_4

    iget v0, v2, Ls/f;->g:I

    invoke-virtual {v9, v7, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->e:Ls/j;

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget v0, v0, Ls/f;->g:I

    invoke-virtual {v9, v6, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v0, v0, Ls/m;->h:Ls/f;

    iget v0, v0, Ls/f;->g:I

    invoke-virtual {v9, v4, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget v0, v0, Ls/f;->g:I

    invoke-virtual {v9, v3, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v0, v0, Ls/l;->k:Ls/f;

    iget v0, v0, Ls/f;->g:I

    invoke-virtual {v9, v1, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->N:Lr/e;

    if-eqz v0, :cond_3

    if-eqz v0, :cond_0

    iget-object v1, v0, Lr/e;->M:[Lr/e$b;

    aget-object v1, v1, v12

    sget-object v2, Lr/e$b;->n:Lr/e$b;

    if-ne v1, v2, :cond_0

    move v1, v14

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lr/e;->M:[Lr/e$b;

    aget-object v0, v0, v14

    sget-object v2, Lr/e$b;->n:Lr/e$b;

    if-ne v0, v2, :cond_1

    move v0, v14

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, v13, Lr/e;->g:[Z

    aget-boolean v1, v1, v12

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lr/e;->T()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v13, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->D:Lr/d;

    invoke-virtual {v9, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    invoke-virtual {v9, v1, v6, v12, v15}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, v13, Lr/e;->g:[Z

    aget-boolean v0, v0, v14

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lr/e;->V()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v13, Lr/e;->N:Lr/e;

    iget-object v0, v0, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v0

    invoke-virtual {v9, v0, v3, v12, v15}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, v13, Lr/e;->N:Lr/e;

    if-eqz v0, :cond_b

    if-eqz v0, :cond_5

    iget-object v2, v0, Lr/e;->M:[Lr/e$b;

    aget-object v2, v2, v12

    sget-object v5, Lr/e$b;->n:Lr/e$b;

    if-ne v2, v5, :cond_5

    move v2, v14

    goto :goto_2

    :cond_5
    move v2, v12

    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, v0, Lr/e;->M:[Lr/e$b;

    aget-object v0, v0, v14

    sget-object v5, Lr/e$b;->n:Lr/e$b;

    if-ne v0, v5, :cond_6

    move v0, v14

    goto :goto_3

    :cond_6
    move v0, v12

    :goto_3
    invoke-direct {v13, v12}, Lr/e;->S(I)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v13, Lr/e;->N:Lr/e;

    check-cast v5, Lr/f;

    invoke-virtual {v5, v13, v12}, Lr/f;->J0(Lr/e;I)V

    move v5, v14

    goto :goto_4

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lr/e;->T()Z

    move-result v5

    :goto_4
    invoke-direct {v13, v14}, Lr/e;->S(I)Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v8, v13, Lr/e;->N:Lr/e;

    check-cast v8, Lr/f;

    invoke-virtual {v8, v13, v14}, Lr/f;->J0(Lr/e;I)V

    move v8, v14

    goto :goto_5

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lr/e;->V()Z

    move-result v8

    :goto_5
    if-nez v5, :cond_9

    if-eqz v2, :cond_9

    iget v10, v13, Lr/e;->f0:I

    if-eq v10, v15, :cond_9

    iget-object v10, v13, Lr/e;->B:Lr/d;

    iget-object v10, v10, Lr/d;->d:Lr/d;

    if-nez v10, :cond_9

    iget-object v10, v13, Lr/e;->D:Lr/d;

    iget-object v10, v10, Lr/d;->d:Lr/d;

    if-nez v10, :cond_9

    iget-object v10, v13, Lr/e;->N:Lr/e;

    iget-object v10, v10, Lr/e;->D:Lr/d;

    invoke-virtual {v9, v10}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v10

    invoke-virtual {v9, v10, v6, v12, v14}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_9
    if-nez v8, :cond_a

    if-eqz v0, :cond_a

    iget v10, v13, Lr/e;->f0:I

    if-eq v10, v15, :cond_a

    iget-object v10, v13, Lr/e;->C:Lr/d;

    iget-object v10, v10, Lr/d;->d:Lr/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr/e;->E:Lr/d;

    iget-object v10, v10, Lr/d;->d:Lr/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr/e;->F:Lr/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr/e;->N:Lr/e;

    iget-object v10, v10, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v10}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v10

    invoke-virtual {v9, v10, v3, v12, v14}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_a
    move/from16 v28, v5

    move/from16 v27, v8

    goto :goto_6

    :cond_b
    move v0, v12

    move v2, v0

    move/from16 v27, v2

    move/from16 v28, v27

    :goto_6
    iget v5, v13, Lr/e;->O:I

    iget v8, v13, Lr/e;->Z:I

    if-ge v5, v8, :cond_c

    goto :goto_7

    :cond_c
    move v8, v5

    :goto_7
    iget v10, v13, Lr/e;->P:I

    iget v11, v13, Lr/e;->a0:I

    if-ge v10, v11, :cond_d

    goto :goto_8

    :cond_d
    move v11, v10

    :goto_8
    iget-object v15, v13, Lr/e;->M:[Lr/e$b;

    aget-object v14, v15, v12

    sget-object v12, Lr/e$b;->o:Lr/e$b;

    move-object/from16 v19, v1

    if-eq v14, v12, :cond_e

    const/4 v1, 0x1

    :goto_9
    const/16 v17, 0x1

    goto :goto_a

    :cond_e
    const/4 v1, 0x0

    goto :goto_9

    :goto_a
    aget-object v15, v15, v17

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    if-eq v15, v12, :cond_f

    const/4 v3, 0x1

    goto :goto_b

    :cond_f
    const/4 v3, 0x0

    :goto_b
    iget v4, v13, Lr/e;->R:I

    iput v4, v13, Lr/e;->u:I

    move/from16 v22, v8

    iget v8, v13, Lr/e;->Q:F

    iput v8, v13, Lr/e;->v:F

    move/from16 v23, v11

    iget v11, v13, Lr/e;->l:I

    move-object/from16 v26, v6

    iget v6, v13, Lr/e;->m:I

    const/16 v24, 0x0

    cmpl-float v24, v8, v24

    move-object/from16 v29, v7

    if-lez v24, :cond_18

    iget v7, v13, Lr/e;->f0:I

    const/16 v9, 0x8

    if-eq v7, v9, :cond_18

    const/4 v7, 0x3

    if-ne v14, v12, :cond_10

    if-nez v11, :cond_10

    move v11, v7

    :cond_10
    if-ne v15, v12, :cond_11

    if-nez v6, :cond_11

    move v6, v7

    :cond_11
    if-ne v14, v12, :cond_12

    if-ne v15, v12, :cond_12

    if-ne v11, v7, :cond_12

    if-ne v6, v7, :cond_12

    invoke-virtual {v13, v2, v0, v1, v3}, Lr/e;->D0(ZZZZ)V

    goto :goto_10

    :cond_12
    const/4 v1, 0x4

    if-ne v14, v12, :cond_14

    if-ne v11, v7, :cond_14

    const/4 v3, 0x0

    iput v3, v13, Lr/e;->u:I

    int-to-float v3, v10

    mul-float/2addr v8, v3

    float-to-int v8, v8

    if-eq v15, v12, :cond_13

    move/from16 v33, v1

    move/from16 v32, v6

    :goto_c
    move/from16 v31, v23

    :goto_d
    const/4 v9, 0x0

    goto :goto_11

    :cond_13
    move/from16 v32, v6

    move/from16 v33, v11

    :goto_e
    move/from16 v31, v23

    :goto_f
    const/4 v9, 0x1

    goto :goto_11

    :cond_14
    if-ne v15, v12, :cond_17

    if-ne v6, v7, :cond_17

    const/4 v3, 0x1

    iput v3, v13, Lr/e;->u:I

    const/4 v3, -0x1

    if-ne v4, v3, :cond_15

    const/high16 v3, 0x3f800000    # 1.0f

    div-float/2addr v3, v8

    iput v3, v13, Lr/e;->v:F

    :cond_15
    iget v3, v13, Lr/e;->v:F

    int-to-float v4, v5

    mul-float/2addr v3, v4

    float-to-int v3, v3

    if-eq v14, v12, :cond_16

    move/from16 v32, v1

    move/from16 v31, v3

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_d

    :cond_16
    move/from16 v31, v3

    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_f

    :cond_17
    :goto_10
    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_e

    :cond_18
    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_c

    :goto_11
    iget-object v1, v13, Lr/e;->n:[I

    const/4 v3, 0x0

    aput v33, v1, v3

    const/4 v3, 0x1

    aput v32, v1, v3

    iput-boolean v9, v13, Lr/e;->i:Z

    if-eqz v9, :cond_1a

    iget v1, v13, Lr/e;->u:I

    const/4 v7, -0x1

    if-eqz v1, :cond_19

    if-ne v1, v7, :cond_1b

    :cond_19
    const/16 v22, 0x1

    goto :goto_12

    :cond_1a
    const/4 v7, -0x1

    :cond_1b
    const/16 v22, 0x0

    :goto_12
    iget-object v1, v13, Lr/e;->M:[Lr/e$b;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    sget-object v6, Lr/e$b;->n:Lr/e$b;

    if-ne v1, v6, :cond_1c

    instance-of v1, v13, Lr/f;

    if-eqz v1, :cond_1c

    const/16 v30, 0x1

    goto :goto_13

    :cond_1c
    const/16 v30, 0x0

    :goto_13
    if-eqz v30, :cond_1d

    const/16 v34, 0x0

    goto :goto_14

    :cond_1d
    move/from16 v34, v8

    :goto_14
    iget-object v1, v13, Lr/e;->I:Lr/d;

    invoke-virtual {v1}, Lr/d;->i()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/lit8 v35, v1, 0x1

    iget-object v1, v13, Lr/e;->L:[Z

    const/4 v4, 0x0

    aget-boolean v36, v1, v4

    aget-boolean v37, v1, v3

    iget v1, v13, Lr/e;->j:I

    const/4 v4, 0x2

    const/16 v38, 0x0

    if-eq v1, v4, :cond_23

    iget-object v1, v13, Lr/e;->e:Ls/j;

    iget-object v5, v1, Ls/m;->h:Ls/f;

    iget-boolean v8, v5, Ls/f;->j:Z

    if-eqz v8, :cond_1e

    iget-object v1, v1, Ls/m;->i:Ls/f;

    iget-boolean v1, v1, Ls/f;->j:Z

    if-nez v1, :cond_1f

    :cond_1e
    move-object/from16 v15, p1

    move-object/from16 v12, v26

    move-object/from16 v14, v29

    const/16 v11, 0x8

    goto :goto_15

    :cond_1f
    iget v1, v5, Ls/f;->g:I

    move-object/from16 v15, p1

    move-object/from16 v14, v29

    invoke-virtual {v15, v14, v1}, Lq/d;->f(Lq/i;I)V

    iget-object v1, v13, Lr/e;->e:Ls/j;

    iget-object v1, v1, Ls/m;->i:Ls/f;

    iget v1, v1, Ls/f;->g:I

    move-object/from16 v12, v26

    invoke-virtual {v15, v12, v1}, Lq/d;->f(Lq/i;I)V

    iget-object v1, v13, Lr/e;->N:Lr/e;

    if-eqz v1, :cond_20

    if-eqz v2, :cond_20

    iget-object v1, v13, Lr/e;->g:[Z

    const/4 v5, 0x0

    aget-boolean v1, v1, v5

    if-eqz v1, :cond_20

    invoke-virtual/range {p0 .. p0}, Lr/e;->T()Z

    move-result v1

    if-nez v1, :cond_20

    iget-object v1, v13, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->D:Lr/d;

    invoke-virtual {v15, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    const/16 v11, 0x8

    invoke-virtual {v15, v1, v12, v5, v11}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_20
    move/from16 v41, v0

    move/from16 v29, v2

    move-object/from16 v45, v6

    move/from16 v46, v9

    move-object/from16 v39, v12

    move-object/from16 v40, v14

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    goto/16 :goto_19

    :goto_15
    iget-object v1, v13, Lr/e;->N:Lr/e;

    if-eqz v1, :cond_21

    iget-object v1, v1, Lr/e;->D:Lr/d;

    invoke-virtual {v15, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_16

    :cond_21
    move-object/from16 v17, v38

    :goto_16
    iget-object v1, v13, Lr/e;->N:Lr/e;

    if-eqz v1, :cond_22

    iget-object v1, v1, Lr/e;->B:Lr/d;

    invoke-virtual {v15, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    move-object/from16 v26, v1

    goto :goto_17

    :cond_22
    move-object/from16 v26, v38

    :goto_17
    iget-object v1, v13, Lr/e;->g:[Z

    const/16 v16, 0x0

    aget-boolean v5, v1, v16

    iget-object v1, v13, Lr/e;->M:[Lr/e$b;

    aget-object v8, v1, v16

    iget-object v10, v13, Lr/e;->B:Lr/d;

    iget-object v1, v13, Lr/e;->D:Lr/d;

    move/from16 v18, v11

    move-object v11, v1

    iget v1, v13, Lr/e;->S:I

    move/from16 v29, v2

    move-object/from16 v39, v12

    move/from16 v2, v16

    move v12, v1

    iget v1, v13, Lr/e;->Z:I

    move-object/from16 v40, v14

    move v14, v1

    iget-object v1, v13, Lr/e;->w:[I

    aget v1, v1, v2

    move v15, v1

    iget v1, v13, Lr/e;->b0:F

    move/from16 v16, v1

    iget v1, v13, Lr/e;->o:I

    move/from16 v23, v1

    iget v1, v13, Lr/e;->p:I

    move/from16 v24, v1

    iget v1, v13, Lr/e;->q:F

    move/from16 v25, v1

    const/4 v1, 0x1

    move v2, v1

    move/from16 v41, v0

    move-object/from16 v0, p0

    move-object/from16 v42, v19

    move-object/from16 v1, p1

    move-object/from16 v43, v20

    move/from16 v3, v29

    move-object/from16 v44, v21

    move/from16 v4, v41

    move-object/from16 v45, v6

    move-object/from16 v6, v26

    move-object/from16 v7, v17

    move/from16 v46, v9

    move/from16 v9, v30

    move/from16 v13, v34

    move/from16 v17, v22

    move/from16 v18, v28

    move/from16 v19, v27

    move/from16 v20, v36

    move/from16 v21, v33

    move/from16 v22, v32

    move/from16 v26, v35

    invoke-direct/range {v0 .. v26}, Lr/e;->h(Lq/d;ZZZZLq/i;Lq/i;Lr/e$b;ZLr/d;Lr/d;IIIIFZZZZIIIIFZ)V

    :goto_18
    move-object/from16 v13, p0

    goto :goto_19

    :cond_23
    move/from16 v41, v0

    move-object/from16 v45, v6

    move/from16 v46, v9

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    move-object/from16 v39, v26

    move-object/from16 v40, v29

    move/from16 v29, v2

    goto :goto_18

    :goto_19
    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v1, v0, Ls/m;->h:Ls/f;

    iget-boolean v2, v1, Ls/f;->j:Z

    if-eqz v2, :cond_26

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget-boolean v0, v0, Ls/f;->j:Z

    if-eqz v0, :cond_26

    iget v0, v1, Ls/f;->g:I

    move-object/from16 v9, p1

    move-object/from16 v7, v44

    invoke-virtual {v9, v7, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v0, v0, Ls/m;->i:Ls/f;

    iget v0, v0, Ls/f;->g:I

    move-object/from16 v6, v43

    invoke-virtual {v9, v6, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->f:Ls/l;

    iget-object v0, v0, Ls/l;->k:Ls/f;

    iget v0, v0, Ls/f;->g:I

    move-object/from16 v1, v42

    invoke-virtual {v9, v1, v0}, Lq/d;->f(Lq/i;I)V

    iget-object v0, v13, Lr/e;->N:Lr/e;

    if-eqz v0, :cond_25

    if-nez v27, :cond_25

    if-eqz v41, :cond_25

    iget-object v2, v13, Lr/e;->g:[Z

    const/4 v4, 0x1

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_24

    iget-object v0, v0, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v6, v3, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    goto :goto_1a

    :cond_24
    const/16 v2, 0x8

    const/4 v3, 0x0

    goto :goto_1a

    :cond_25
    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_1a
    move v14, v3

    goto :goto_1b

    :cond_26
    move-object/from16 v9, p1

    move-object/from16 v1, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v14, v4

    :goto_1b
    iget v0, v13, Lr/e;->k:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_27

    move v12, v3

    goto :goto_1c

    :cond_27
    move v12, v14

    :goto_1c
    if-eqz v12, :cond_32

    iget-object v0, v13, Lr/e;->M:[Lr/e$b;

    aget-object v0, v0, v4

    move-object/from16 v5, v45

    if-ne v0, v5, :cond_28

    instance-of v0, v13, Lr/f;

    if-eqz v0, :cond_28

    move/from16 v17, v4

    goto :goto_1d

    :cond_28
    move/from16 v17, v3

    :goto_1d
    if-eqz v17, :cond_29

    move/from16 v31, v3

    :cond_29
    if-eqz v46, :cond_2b

    iget v0, v13, Lr/e;->u:I

    if-eq v0, v4, :cond_2a

    const/4 v5, -0x1

    if-ne v0, v5, :cond_2b

    :cond_2a
    move/from16 v18, v4

    goto :goto_1e

    :cond_2b
    move/from16 v18, v3

    :goto_1e
    iget-object v0, v13, Lr/e;->N:Lr/e;

    if-eqz v0, :cond_2c

    iget-object v0, v0, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v0

    goto :goto_1f

    :cond_2c
    move-object/from16 v0, v38

    :goto_1f
    iget-object v5, v13, Lr/e;->N:Lr/e;

    if-eqz v5, :cond_2d

    iget-object v5, v5, Lr/e;->C:Lr/d;

    invoke-virtual {v9, v5}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v5

    move-object/from16 v38, v5

    :cond_2d
    iget v5, v13, Lr/e;->Y:I

    if-gtz v5, :cond_2e

    iget v5, v13, Lr/e;->f0:I

    if-ne v5, v2, :cond_31

    :cond_2e
    invoke-virtual/range {p0 .. p0}, Lr/e;->l()I

    move-result v5

    invoke-virtual {v9, v1, v7, v5, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v5, v13, Lr/e;->F:Lr/d;

    iget-object v5, v5, Lr/d;->d:Lr/d;

    if-eqz v5, :cond_30

    invoke-virtual {v9, v5}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v5

    invoke-virtual {v9, v1, v5, v3, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    if-eqz v41, :cond_2f

    iget-object v1, v13, Lr/e;->E:Lr/d;

    invoke-virtual {v9, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v9, v0, v1, v3, v2}, Lq/d;->h(Lq/i;Lq/i;II)V

    :cond_2f
    move/from16 v26, v3

    goto :goto_20

    :cond_30
    iget v5, v13, Lr/e;->f0:I

    if-ne v5, v2, :cond_31

    invoke-virtual {v9, v1, v7, v3, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    :cond_31
    move/from16 v26, v35

    :goto_20
    iget-object v1, v13, Lr/e;->g:[Z

    aget-boolean v5, v1, v4

    iget-object v1, v13, Lr/e;->M:[Lr/e$b;

    aget-object v8, v1, v4

    iget-object v10, v13, Lr/e;->C:Lr/d;

    iget-object v11, v13, Lr/e;->E:Lr/d;

    iget v12, v13, Lr/e;->T:I

    iget v14, v13, Lr/e;->a0:I

    iget-object v1, v13, Lr/e;->w:[I

    aget v15, v1, v4

    iget v1, v13, Lr/e;->c0:F

    move/from16 v16, v1

    iget v1, v13, Lr/e;->r:I

    move/from16 v23, v1

    iget v1, v13, Lr/e;->s:I

    move/from16 v24, v1

    iget v1, v13, Lr/e;->t:F

    move/from16 v25, v1

    const/4 v2, 0x0

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, v41

    move/from16 v4, v29

    move-object/from16 v29, v6

    move-object/from16 v6, v38

    move-object/from16 v30, v7

    move-object/from16 v7, v19

    move/from16 v9, v17

    move/from16 v13, v31

    move/from16 v17, v18

    move/from16 v18, v27

    move/from16 v19, v28

    move/from16 v20, v37

    move/from16 v21, v32

    move/from16 v22, v33

    invoke-direct/range {v0 .. v26}, Lr/e;->h(Lq/d;ZZZZLq/i;Lq/i;Lr/e$b;ZLr/d;Lr/d;IIIIFZZZZIIIIFZ)V

    goto :goto_21

    :cond_32
    move-object/from16 v29, v6

    move-object/from16 v30, v7

    :goto_21
    move-object/from16 v7, p0

    if-eqz v46, :cond_34

    iget v0, v7, Lr/e;->u:I

    const/16 v6, 0x8

    const/4 v1, 0x1

    iget v5, v7, Lr/e;->v:F

    if-ne v0, v1, :cond_33

    move-object/from16 v0, p1

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    move-object/from16 v3, v39

    move-object/from16 v4, v40

    :goto_22
    invoke-virtual/range {v0 .. v6}, Lq/d;->k(Lq/i;Lq/i;Lq/i;Lq/i;FI)V

    goto :goto_23

    :cond_33
    move-object/from16 v0, p1

    move-object/from16 v1, v39

    move-object/from16 v2, v40

    move-object/from16 v3, v29

    move-object/from16 v4, v30

    goto :goto_22

    :cond_34
    :goto_23
    iget-object v0, v7, Lr/e;->I:Lr/d;

    invoke-virtual {v0}, Lr/d;->i()Z

    move-result v0

    if-eqz v0, :cond_35

    iget-object v0, v7, Lr/e;->I:Lr/d;

    invoke-virtual {v0}, Lr/d;->f()Lr/d;

    move-result-object v0

    invoke-virtual {v0}, Lr/d;->d()Lr/e;

    move-result-object v0

    iget v1, v7, Lr/e;->x:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Lr/e;->I:Lr/d;

    invoke-virtual {v2}, Lr/d;->b()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lq/d;->b(Lr/e;Lr/e;FI)V

    :cond_35
    return-void
.end method

.method public f0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->b0:F

    .line 2
    .line 3
    return-void
.end method

.method public g()Z
    .locals 2

    .line 1
    iget v0, p0, Lr/e;->f0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method

.method public g0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->m0:I

    .line 2
    .line 3
    return-void
.end method

.method public h0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->S:I

    .line 2
    .line 3
    sub-int/2addr p2, p1

    .line 4
    iput p2, p0, Lr/e;->O:I

    .line 5
    .line 6
    iget p1, p0, Lr/e;->Z:I

    .line 7
    .line 8
    if-ge p2, p1, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lr/e;->O:I

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public i(Lr/e;FI)V
    .locals 6

    .line 1
    sget-object v3, Lr/d$b;->s:Lr/d$b;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, v3

    .line 6
    move-object v2, p1

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Lr/e;->R(Lr/d$b;Lr/e;Lr/d$b;II)V

    .line 9
    .line 10
    .line 11
    iput p2, p0, Lr/e;->x:F

    .line 12
    .line 13
    return-void
.end method

.method public i0(Lr/e$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->M:[Lr/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput-object p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public j(Lq/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/e;->C:Lr/d;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr/e;->D:Lr/d;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lr/e;->E:Lr/d;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lr/e;->Y:I

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lr/e;->F:Lr/d;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public j0(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->l:I

    .line 2
    .line 3
    iput p2, p0, Lr/e;->o:I

    .line 4
    .line 5
    const p2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    if-ne p3, p2, :cond_0

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_0
    iput p3, p0, Lr/e;->p:I

    .line 12
    .line 13
    iput p4, p0, Lr/e;->q:F

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    cmpl-float p2, p4, p2

    .line 17
    .line 18
    if-lez p2, :cond_1

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpg-float p2, p4, p2

    .line 23
    .line 24
    if-gez p2, :cond_1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    iput p1, p0, Lr/e;->l:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public k(Lr/d$b;)Lr/d;
    .locals 2

    .line 1
    sget-object v0, Lr/e$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_0
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :pswitch_1
    iget-object p1, p0, Lr/e;->H:Lr/d;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_2
    iget-object p1, p0, Lr/e;->G:Lr/d;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_3
    iget-object p1, p0, Lr/e;->I:Lr/d;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_4
    iget-object p1, p0, Lr/e;->F:Lr/d;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_5
    iget-object p1, p0, Lr/e;->E:Lr/d;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_6
    iget-object p1, p0, Lr/e;->D:Lr/d;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_7
    iget-object p1, p0, Lr/e;->C:Lr/d;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_8
    iget-object p1, p0, Lr/e;->B:Lr/d;

    .line 46
    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->q0:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->Y:I

    .line 2
    .line 3
    return v0
.end method

.method protected l0(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->L:[Z

    .line 2
    .line 3
    aput-boolean p2, v0, p1

    .line 4
    .line 5
    return-void
.end method

.method public m(I)F
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget p1, p0, Lr/e;->b0:F

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget p1, p0, Lr/e;->c0:F

    .line 10
    .line 11
    return p1

    .line 12
    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    .line 13
    .line 14
    return p1
.end method

.method public m0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/e;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public n()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr/e;->P()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lr/e;->P:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public n0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->w:[I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->d0:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public o0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->w:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/e;->g0:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public p0(I)V
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    iput p1, p0, Lr/e;->a0:I

    .line 5
    .line 6
    return-void
.end method

.method public q(I)Lr/e$b;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lr/e;->w()Lr/e$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lr/e;->K()Lr/e$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public q0(I)V
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    iput p1, p0, Lr/e;->Z:I

    .line 5
    .line 6
    return-void
.end method

.method public r()F
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->Q:F

    .line 2
    .line 3
    return v0
.end method

.method public r0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->S:I

    .line 2
    .line 3
    iput p2, p0, Lr/e;->T:I

    .line 4
    .line 5
    return-void
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->R:I

    .line 2
    .line 3
    return v0
.end method

.method public s0(Lr/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/e;->N:Lr/e;

    .line 2
    .line 3
    return-void
.end method

.method public t()I
    .locals 2

    .line 1
    iget v0, p0, Lr/e;->f0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, Lr/e;->P:I

    .line 10
    .line 11
    return v0
.end method

.method public t0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->c0:F

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr/e;->h0:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    const-string v3, " "

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v4, "type: "

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Lr/e;->h0:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v1, v2

    .line 38
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lr/e;->g0:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "id: "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lr/e;->g0:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, "("

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget v1, p0, Lr/e;->S:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget v1, p0, Lr/e;->T:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ") - ("

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v1, p0, Lr/e;->O:I

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, " x "

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget v1, p0, Lr/e;->P:I

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ")"

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0
.end method

.method public u()F
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->b0:F

    .line 2
    .line 3
    return v0
.end method

.method public u0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->n0:I

    .line 2
    .line 3
    return-void
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, Lr/e;->m0:I

    .line 2
    .line 3
    return v0
.end method

.method public v0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->T:I

    .line 2
    .line 3
    sub-int/2addr p2, p1

    .line 4
    iput p2, p0, Lr/e;->P:I

    .line 5
    .line 6
    iget p1, p0, Lr/e;->a0:I

    .line 7
    .line 8
    if-ge p2, p1, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lr/e;->P:I

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public w()Lr/e$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->M:[Lr/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    return-object v0
.end method

.method public w0(Lr/e$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->M:[Lr/e$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aput-object p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public x()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->B:Lr/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lr/d;->e:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lr/e;->D:Lr/d;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v1, v1, Lr/d;->e:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    :cond_1
    return v0
.end method

.method public x0(IIIF)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->m:I

    .line 2
    .line 3
    iput p2, p0, Lr/e;->r:I

    .line 4
    .line 5
    const p2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    if-ne p3, p2, :cond_0

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_0
    iput p3, p0, Lr/e;->s:I

    .line 12
    .line 13
    iput p4, p0, Lr/e;->t:F

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    cmpl-float p2, p4, p2

    .line 17
    .line 18
    if-lez p2, :cond_1

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpg-float p2, p4, p2

    .line 23
    .line 24
    if-gez p2, :cond_1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    iput p1, p0, Lr/e;->m:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public y(I)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lr/e;->N()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lr/e;->t()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public y0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->q0:[F

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public z()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/e;->w:[I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public z0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/e;->f0:I

    .line 2
    .line 3
    return-void
.end method

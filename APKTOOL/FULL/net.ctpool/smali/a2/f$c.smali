.class La2/f$c;
.super Lcom/facebook/react/fabric/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:La2/f;


# direct methods
.method private constructor <init>(La2/f;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/f$c;->b:La2/f;

    invoke-direct {p0, p2}, Lcom/facebook/react/fabric/i;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method synthetic constructor <init>(La2/f;Lcom/facebook/react/bridge/ReactContext;La2/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, La2/f$c;-><init>(La2/f;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method private b(J)Z
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p1

    .line 6
    const-wide/32 p1, 0xf4240

    .line 7
    .line 8
    .line 9
    div-long/2addr v0, p1

    .line 10
    const-wide/16 p1, 0x10

    .line 11
    .line 12
    sub-long/2addr p1, v0

    .line 13
    const-wide/16 v0, 0x9

    .line 14
    .line 15
    cmp-long p1, p1, v0

    .line 16
    .line 17
    if-gez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
.end method


# virtual methods
.method public a(J)V
    .locals 12

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :cond_0
    :goto_0
    :try_start_0
    iget-object v3, p0, La2/f$c;->b:La2/f;

    .line 9
    .line 10
    invoke-static {v3}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/util/Stack;->empty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_7

    .line 19
    .line 20
    iget-object v3, p0, La2/f$c;->b:La2/f;

    .line 21
    .line 22
    invoke-static {v3}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x1

    .line 37
    add-int/2addr v2, v5

    .line 38
    iget-object v6, p0, La2/f$c;->b:La2/f;

    .line 39
    .line 40
    invoke-static {v6}, La2/f;->c(La2/f;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    sget-object v3, La2/f;->o:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v5, Lcom/facebook/react/uimanager/s;

    .line 53
    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v7, "RemoveDeleteTree recursively tried to remove a React View that was actually reused. This indicates a bug in the Differ. ["

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v4, "]"

    .line 68
    .line 69
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-direct {v5, v4}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v5}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 87
    .line 88
    .line 89
    iget-object v6, p0, La2/f$c;->b:La2/f;

    .line 90
    .line 91
    invoke-static {v6, v4}, La2/f;->f(La2/f;I)La2/f$d;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-eqz v4, :cond_0

    .line 96
    .line 97
    iget-object v6, v4, La2/f$d;->a:Landroid/view/View;

    .line 98
    .line 99
    iget-object v7, v4, La2/f$d;->d:Lcom/facebook/react/uimanager/ViewManager;

    .line 100
    .line 101
    instance-of v8, v7, Lcom/facebook/react/uimanager/q;

    .line 102
    .line 103
    if-eqz v8, :cond_6

    .line 104
    .line 105
    check-cast v7, Lcom/facebook/react/uimanager/q;

    .line 106
    .line 107
    move v8, v1

    .line 108
    move v9, v8

    .line 109
    :goto_1
    invoke-interface {v7, v6, v8}, Lcom/facebook/react/uimanager/q;->getChildAt(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    if-eqz v10, :cond_4

    .line 114
    .line 115
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-nez v9, :cond_3

    .line 120
    .line 121
    iget-object v9, p0, La2/f$c;->b:La2/f;

    .line 122
    .line 123
    invoke-static {v9, v11}, La2/f;->f(La2/f;I)La2/f$d;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    if-eqz v9, :cond_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    move v9, v1

    .line 131
    goto :goto_3

    .line 132
    :cond_3
    :goto_2
    move v9, v5

    .line 133
    :goto_3
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-virtual {v0, v10}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-eqz v9, :cond_5

    .line 148
    .line 149
    :try_start_1
    invoke-interface {v7, v6}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catch_0
    move-exception v5

    .line 154
    :try_start_2
    sget-object v6, La2/f;->o:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v6, v5}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    move v9, v1

    .line 160
    :cond_5
    :goto_4
    if-eqz v9, :cond_6

    .line 161
    .line 162
    iget-object v5, p0, La2/f$c;->b:La2/f;

    .line 163
    .line 164
    invoke-static {v5}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v5, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    :cond_6
    iget-object v5, p0, La2/f$c;->b:La2/f;

    .line 172
    .line 173
    invoke-static {v5}, La2/f;->e(La2/f;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    iget-object v3, p0, La2/f$c;->b:La2/f;

    .line 181
    .line 182
    invoke-static {v3, v4}, La2/f;->g(La2/f;La2/f$d;)V

    .line 183
    .line 184
    .line 185
    rem-int/lit8 v3, v2, 0x14

    .line 186
    .line 187
    if-nez v3, :cond_0

    .line 188
    .line 189
    invoke-direct {p0, p1, p2}, La2/f$c;->b(J)Z

    .line 190
    .line 191
    .line 192
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    if-eqz v3, :cond_0

    .line 194
    .line 195
    :cond_7
    iget-object p1, p0, La2/f$c;->b:La2/f;

    .line 196
    .line 197
    invoke-static {p1}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Ljava/util/Stack;->empty()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_8

    .line 206
    .line 207
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    sget-object p2, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    .line 212
    .line 213
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_8
    iget-object p1, p0, La2/f$c;->b:La2/f;

    .line 218
    .line 219
    invoke-static {p1}, La2/f;->c(La2/f;)Ljava/util/Set;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, La2/f$c;->b:La2/f;

    .line 227
    .line 228
    invoke-static {p1}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 233
    .line 234
    .line 235
    :goto_5
    return-void

    .line 236
    :goto_6
    iget-object p2, p0, La2/f$c;->b:La2/f;

    .line 237
    .line 238
    invoke-static {p2}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p2}, Ljava/util/Stack;->empty()Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-nez p2, :cond_9

    .line 247
    .line 248
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    sget-object v0, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    .line 253
    .line 254
    invoke-virtual {p2, v0, p0}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    .line 255
    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_9
    iget-object p2, p0, La2/f$c;->b:La2/f;

    .line 259
    .line 260
    invoke-static {p2}, La2/f;->c(La2/f;)Ljava/util/Set;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    .line 265
    .line 266
    .line 267
    iget-object p2, p0, La2/f$c;->b:La2/f;

    .line 268
    .line 269
    invoke-static {p2}, La2/f;->d(La2/f;)Ljava/util/Stack;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->clear()V

    .line 274
    .line 275
    .line 276
    :goto_7
    throw p1
.end method

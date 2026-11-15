.class public La2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/b$a;
    }
.end annotation


# instance fields
.field private final a:La2/c;

.field private final b:La2/b$a;

.field private final c:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private final d:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private final e:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private f:Z

.field private g:I

.field private h:J

.field private i:J


# direct methods
.method public constructor <init>(La2/c;La2/b$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La2/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La2/b;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La2/b;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, La2/b;->f:Z

    .line 27
    .line 28
    iput v0, p0, La2/b;->g:I

    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    iput-wide v0, p0, La2/b;->h:J

    .line 33
    .line 34
    iput-wide v0, p0, La2/b;->i:J

    .line 35
    .line 36
    iput-object p1, p0, La2/b;->a:La2/c;

    .line 37
    .line 38
    iput-object p2, p0, La2/b;->b:La2/b$a;

    .line 39
    .line 40
    return-void
.end method

.method private e()Z
    .locals 12

    .line 1
    const-string v0, "Caught exception executing ViewCommand: "

    .line 2
    .line 3
    iget v1, p0, La2/b;->g:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iput-wide v2, p0, La2/b;->h:J

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    iput-wide v4, p0, La2/b;->i:J

    .line 16
    .line 17
    invoke-direct {p0}, La2/b;->k()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0}, La2/b;->i()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return v0

    .line 31
    :cond_1
    iget-object v5, p0, La2/b;->b:La2/b$a;

    .line 32
    .line 33
    invoke-interface {v5, v4}, La2/b$a;->a(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    const-string v5, "MountItemDispatcher"

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    const-string v6, "MountItemDispatcher::mountViews viewCommandMountItems"

    .line 41
    .line 42
    invoke-static {v2, v3, v6}, LP2/a;->c(JLjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lcom/facebook/react/fabric/mounting/mountitems/b;

    .line 60
    .line 61
    sget-boolean v7, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 62
    .line 63
    if-eqz v7, :cond_2

    .line 64
    .line 65
    const-string v7, "dispatchMountItems: Executing viewCommandMountItem"

    .line 66
    .line 67
    invoke-static {v6, v7}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :try_start_0
    invoke-direct {p0, v6}, La2/b;->h(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    :try_end_0
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v7

    .line 75
    new-instance v8, Ljava/lang/RuntimeException;

    .line 76
    .line 77
    new-instance v9, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-direct {v8, v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_0
    move-exception v7

    .line 101
    invoke-virtual {v6}, Lcom/facebook/react/fabric/mounting/mountitems/b;->b()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-nez v8, :cond_3

    .line 106
    .line 107
    invoke-virtual {v6}, Lcom/facebook/react/fabric/mounting/mountitems/b;->c()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v6}, La2/b;->c(Lcom/facebook/react/fabric/mounting/mountitems/b;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    new-instance v8, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 115
    .line 116
    new-instance v9, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-direct {v8, v6, v7}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-static {v5, v8}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    invoke-static {v2, v3}, LP2/a;->g(J)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-direct {p0}, La2/b;->j()Ljava/util/Collection;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    const-string v1, "MountItemDispatcher::mountViews preMountItems"

    .line 152
    .line 153
    invoke-static {v2, v3, v1}, LP2/a;->c(JLjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    .line 171
    .line 172
    sget-boolean v6, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 173
    .line 174
    if-eqz v6, :cond_6

    .line 175
    .line 176
    const-string v6, "dispatchMountItems: Executing preMountItem"

    .line 177
    .line 178
    invoke-static {v1, v6}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-direct {p0, v1}, La2/b;->h(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_7
    invoke-static {v2, v3}, LP2/a;->g(J)V

    .line 186
    .line 187
    .line 188
    :cond_8
    if-eqz v4, :cond_f

    .line 189
    .line 190
    const-string v0, "MountItemDispatcher::mountViews mountItems to execute"

    .line 191
    .line 192
    invoke-static {v2, v3, v0}, LP2/a;->c(JLjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_e

    .line 208
    .line 209
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    check-cast v7, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    .line 214
    .line 215
    sget-boolean v8, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 216
    .line 217
    if-eqz v8, :cond_9

    .line 218
    .line 219
    const-string v8, "dispatchMountItems: Executing mountItem"

    .line 220
    .line 221
    invoke-static {v7, v8}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    :try_start_1
    invoke-direct {p0, v7}, La2/b;->h(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :catchall_1
    move-exception v8

    .line 229
    const-string v9, "dispatchMountItems: caught exception, displaying mount state"

    .line 230
    .line 231
    invoke-static {v5, v9, v8}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-eqz v10, :cond_b

    .line 243
    .line 244
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    check-cast v10, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    .line 249
    .line 250
    if-ne v10, v7, :cond_a

    .line 251
    .line 252
    const-string v11, "dispatchMountItems: mountItem: next mountItem triggered exception!"

    .line 253
    .line 254
    invoke-static {v5, v11}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_a
    const-string v11, "dispatchMountItems: mountItem"

    .line 258
    .line 259
    invoke-static {v10, v11}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_b
    invoke-interface {v7}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    const/4 v10, -0x1

    .line 268
    if-eq v9, v10, :cond_c

    .line 269
    .line 270
    iget-object v9, p0, La2/b;->a:La2/c;

    .line 271
    .line 272
    invoke-interface {v7}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-virtual {v9, v7}, La2/c;->e(I)La2/f;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    if-eqz v7, :cond_c

    .line 281
    .line 282
    invoke-virtual {v7}, La2/f;->E()V

    .line 283
    .line 284
    .line 285
    :cond_c
    invoke-static {v8}, Lcom/facebook/react/bridge/ReactIgnorableMountingException;->isIgnorable(Ljava/lang/Throwable;)Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_d

    .line 290
    .line 291
    invoke-static {v5, v8}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_d
    throw v8

    .line 296
    :cond_e
    iget-wide v5, p0, La2/b;->h:J

    .line 297
    .line 298
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 299
    .line 300
    .line 301
    move-result-wide v7

    .line 302
    sub-long/2addr v7, v0

    .line 303
    add-long/2addr v5, v7

    .line 304
    iput-wide v5, p0, La2/b;->h:J

    .line 305
    .line 306
    invoke-static {v2, v3}, LP2/a;->g(J)V

    .line 307
    .line 308
    .line 309
    :cond_f
    iget-object v0, p0, La2/b;->b:La2/b$a;

    .line 310
    .line 311
    invoke-interface {v0, v4}, La2/b$a;->c(Ljava/util/List;)V

    .line 312
    .line 313
    .line 314
    const/4 v0, 0x1

    .line 315
    return v0
.end method

.method private static g(Ljava/util/concurrent/ConcurrentLinkedQueue;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_3
    return-object v0
.end method

.method private h(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    .locals 3

    .line 1
    iget-object v0, p0, La2/b;->a:La2/c;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, La2/c;->j(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-boolean v0, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "MountItemDispatcher"

    .line 30
    .line 31
    const-string v2, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet"

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, LP0/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, La2/b;->a:La2/c;

    .line 37
    .line 38
    invoke-interface {p1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, La2/c;->e(I)La2/f;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, La2/f;->J(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, La2/b;->a:La2/c;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->execute(La2/c;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
.end method

.method private i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-static {v0}, La2/b;->g(Ljava/util/concurrent/ConcurrentLinkedQueue;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private j()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-static {v0}, La2/b;->g(Ljava/util/concurrent/ConcurrentLinkedQueue;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-static {v0}, La2/b;->g(Ljava/util/concurrent/ConcurrentLinkedQueue;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static n(J)Z
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p0

    .line 6
    const-wide/32 p0, 0xf4240

    .line 7
    .line 8
    .line 9
    div-long/2addr v0, p0

    .line 10
    const-wide/16 p0, 0x10

    .line 11
    .line 12
    sub-long/2addr p0, v0

    .line 13
    const-wide/16 v0, 0x8

    .line 14
    .line 15
    cmp-long p0, p0, v0

    .line 16
    .line 17
    if-gez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    return p0
.end method

.method private static o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "\n"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v0, p0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    aget-object v2, p0, v1

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v4, ": "

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "MountItemDispatcher"

    .line 38
    .line 39
    invoke-static {v3, v2}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/b;->a:La2/c;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->getSurfaceId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, La2/c;->r(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, La2/b;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c(Lcom/facebook/react/fabric/mounting/mountitems/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/util/Queue;)V
    .locals 4

    .line 1
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;

    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, La2/b;->a:La2/c;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;->execute(La2/c;)V
    :try_end_0
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v1

    .line 20
    instance-of v2, v0, Lcom/facebook/react/fabric/mounting/mountitems/b;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    check-cast v0, Lcom/facebook/react/fabric/mounting/mountitems/b;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/facebook/react/fabric/mounting/mountitems/b;->b()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/fabric/mounting/mountitems/b;->c()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, La2/b;->c(Lcom/facebook/react/fabric/mounting/mountitems/b;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "dispatchExternalMountItems: mounting failed with "

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, v1}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void
.end method

.method public f(J)V
    .locals 5

    .line 1
    iget-object v0, p0, La2/b;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

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
    const-string v0, "MountItemDispatcher::premountViews"

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, La2/b;->f:Z

    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    :try_start_0
    invoke-static {p1, p2}, La2/b;->n(J)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v3, p0, La2/b;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    :goto_1
    iput-boolean v0, p0, La2/b;->f:Z

    .line 39
    .line 40
    invoke-static {v1, v2}, LP2/a;->g(J)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    :try_start_1
    sget-boolean v4, Lcom/facebook/react/fabric/FabricUIManager;->ENABLE_FABRIC_LOGS:Z

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    const-string v4, "dispatchPreMountItems"

    .line 49
    .line 50
    invoke-static {v3, v4}, La2/b;->o(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    :goto_2
    invoke-direct {p0, v3}, La2/b;->h(Lcom/facebook/react/fabric/mounting/mountitems/MountItem;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_3
    iput-boolean v0, p0, La2/b;->f:Z

    .line 61
    .line 62
    throw p1
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, La2/b;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public m()J
    .locals 2

    .line 1
    iget-wide v0, p0, La2/b;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public p()V
    .locals 5

    .line 1
    iget-boolean v0, p0, La2/b;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Le2/a;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iput-boolean v1, p0, La2/b;->f:Z

    .line 15
    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    invoke-direct {p0}, La2/b;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    iput-boolean v2, p0, La2/b;->f:Z

    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    iput-boolean v2, p0, La2/b;->f:Z

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :try_start_1
    invoke-direct {p0}, La2/b;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    iput-boolean v2, p0, La2/b;->f:Z

    .line 35
    .line 36
    iget-object v3, p0, La2/b;->b:La2/b$a;

    .line 37
    .line 38
    invoke-interface {v3}, La2/b$a;->b()V

    .line 39
    .line 40
    .line 41
    iget v3, p0, La2/b;->g:I

    .line 42
    .line 43
    const/16 v4, 0xa

    .line 44
    .line 45
    if-ge v3, v4, :cond_4

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    if-le v3, v0, :cond_3

    .line 51
    .line 52
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 53
    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v4, "Re-dispatched "

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v4, p0, La2/b;->g:I

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v4, " times. This indicates setState (?) is likely being called too many times during mounting."

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-direct {v0, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v3, "MountItemDispatcher"

    .line 82
    .line 83
    invoke-static {v3, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget v0, p0, La2/b;->g:I

    .line 87
    .line 88
    add-int/2addr v0, v1

    .line 89
    iput v0, p0, La2/b;->g:I

    .line 90
    .line 91
    invoke-virtual {p0}, La2/b;->p()V

    .line 92
    .line 93
    .line 94
    :cond_4
    iput v2, p0, La2/b;->g:I

    .line 95
    .line 96
    :goto_1
    return-void

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    :try_start_2
    iput v2, p0, La2/b;->g:I

    .line 99
    .line 100
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 101
    :catchall_2
    move-exception v0

    .line 102
    iput-boolean v2, p0, La2/b;->f:Z

    .line 103
    .line 104
    throw v0
.end method

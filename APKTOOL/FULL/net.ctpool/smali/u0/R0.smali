.class public abstract Lu0/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic A(Lz3/l;)V
    .locals 1

    .line 1
    new-instance v0, Lu0/G0;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/G0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lz3/l;->i(Lz3/c;)Lz3/l;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static a(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)Landroidx/core/app/k$e;
    .locals 8

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v1, Landroidx/core/app/k$e;

    .line 4
    .line 5
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getChannelId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v1, v2, v3}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 15
    .line 16
    const-string v3, "data"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/os/Bundle;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v1, v2}, Landroidx/core/app/k$e;->t(Landroid/os/Bundle;)Landroidx/core/app/k$e;

    .line 37
    .line 38
    .line 39
    const-string v2, "notification"

    .line 40
    .line 41
    filled-new-array {v2}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    filled-new-array {v4}, [Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v5, "app.notifee.core.ReceiverService.DELETE_INTENT"

    .line 54
    .line 55
    invoke-static {v5, v3, v4}, Lapp/notifee/core/ReceiverService;->a(Ljava/lang/String;[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v1, v3}, Landroidx/core/app/k$e;->s(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 60
    .line 61
    .line 62
    sget-object v3, LS5/e;->a:Landroid/content/Context;

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    const-string v5, "pressAction"

    .line 72
    .line 73
    const/16 v6, 0x1f

    .line 74
    .line 75
    if-lt v3, v6, :cond_1

    .line 76
    .line 77
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    if-lt v3, v6, :cond_1

    .line 80
    .line 81
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getPressAction()Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getPressAction()Landroid/os/Bundle;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    filled-new-array {v5, v7}, [Landroid/os/Bundle;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v3, v6, v4, v2, v5}, LS5/k;->a(ILandroid/os/Bundle;I[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :goto_1
    invoke-virtual {v1, v2}, Landroidx/core/app/k$e;->o(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_1
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getPressAction()Landroid/os/Bundle;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    filled-new-array {v3, v5}, [Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v5, "app.notifee.core.ReceiverService.PRESS_INTENT"

    .line 134
    .line 135
    invoke-static {v5, v2, v3}, Lapp/notifee/core/ReceiverService;->a(Ljava/lang/String;[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto :goto_1

    .line 140
    :goto_2
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 141
    .line 142
    const-string v3, "title"

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/4 v5, 0x0

    .line 149
    if-eqz v2, :cond_2

    .line 150
    .line 151
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 152
    .line 153
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2, v5}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Landroidx/core/app/k$e;->q(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 162
    .line 163
    .line 164
    :cond_2
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 165
    .line 166
    const-string v3, "subtitle"

    .line 167
    .line 168
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_3

    .line 173
    .line 174
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 175
    .line 176
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v2, v5}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1, v2}, Landroidx/core/app/k$e;->P(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 185
    .line 186
    .line 187
    :cond_3
    iget-object v2, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 188
    .line 189
    const-string v3, "body"

    .line 190
    .line 191
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-eqz v2, :cond_4

    .line 196
    .line 197
    iget-object p1, p1, Lapp/notifee/core/model/NotificationModel;->a:Landroid/os/Bundle;

    .line 198
    .line 199
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {p1, v5}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->p(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 208
    .line 209
    .line 210
    :cond_4
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getBadgeIconType()Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-eqz p1, :cond_5

    .line 215
    .line 216
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getBadgeIconType()Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->i(I)Landroidx/core/app/k$e;

    .line 225
    .line 226
    .line 227
    :cond_5
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getCategory()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-eqz p1, :cond_6

    .line 232
    .line 233
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getCategory()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->j(Ljava/lang/String;)Landroidx/core/app/k$e;

    .line 238
    .line 239
    .line 240
    :cond_6
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getColor()Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-eqz p1, :cond_7

    .line 245
    .line 246
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getColor()Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->m(I)Landroidx/core/app/k$e;

    .line 255
    .line 256
    .line 257
    :cond_7
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getColorized()Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->n(Z)Landroidx/core/app/k$e;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getChronometerCountDown()Ljava/lang/Boolean;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->l(Z)Landroidx/core/app/k$e;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getGroup()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-eqz p1, :cond_8

    .line 284
    .line 285
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getGroup()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->w(Ljava/lang/String;)Landroidx/core/app/k$e;

    .line 290
    .line 291
    .line 292
    :cond_8
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getGroupAlertBehaviour()I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->x(I)Landroidx/core/app/k$e;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getGroupSummary()Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->y(Z)Landroidx/core/app/k$e;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getInputHistory()[Ljava/lang/CharSequence;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    if-eqz p1, :cond_9

    .line 315
    .line 316
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getInputHistory()[Ljava/lang/CharSequence;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->H([Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 321
    .line 322
    .line 323
    :cond_9
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getLights()Ljava/util/ArrayList;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    if-eqz p1, :cond_a

    .line 328
    .line 329
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getLights()Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    const/4 v4, 0x2

    .line 354
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    check-cast p1, Ljava/lang/Integer;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    invoke-virtual {v1, v2, v3, p1}, Landroidx/core/app/k$e;->A(III)Landroidx/core/app/k$e;

    .line 365
    .line 366
    .line 367
    :cond_a
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getLocalOnly()Ljava/lang/Boolean;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->B(Z)Landroidx/core/app/k$e;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getNumber()Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    if-eqz p1, :cond_b

    .line 383
    .line 384
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getNumber()Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->C(I)Landroidx/core/app/k$e;

    .line 393
    .line 394
    .line 395
    :cond_b
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSound()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    if-eqz p1, :cond_d

    .line 400
    .line 401
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSound()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-static {p1}, LS5/o;->e(Ljava/lang/String;)Landroid/net/Uri;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    if-eqz p1, :cond_c

    .line 410
    .line 411
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->N(Landroid/net/Uri;)Landroidx/core/app/k$e;

    .line 414
    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const-string v2, "Unable to retrieve sound for notification, sound was specified as: "

    .line 423
    .line 424
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSound()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    const-string v2, "NotificationManager"

    .line 439
    .line 440
    invoke-static {v2, p1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_d
    :goto_3
    invoke-virtual {p0, v0}, Lapp/notifee/core/model/NotificationAndroidModel;->getDefaults(Ljava/lang/Boolean;)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->r(I)Landroidx/core/app/k$e;

    .line 452
    .line 453
    .line 454
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getOngoing()Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->D(Z)Landroidx/core/app/k$e;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getOnlyAlertOnce()Ljava/lang/Boolean;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->E(Z)Landroidx/core/app/k$e;

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getPriority()I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->F(I)Landroidx/core/app/k$e;

    .line 481
    .line 482
    .line 483
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getProgress()Lapp/notifee/core/model/NotificationAndroidModel$a;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    if-eqz p1, :cond_e

    .line 488
    .line 489
    iget v0, p1, Lapp/notifee/core/model/NotificationAndroidModel$a;->a:I

    .line 490
    .line 491
    iget v2, p1, Lapp/notifee/core/model/NotificationAndroidModel$a;->b:I

    .line 492
    .line 493
    iget-boolean p1, p1, Lapp/notifee/core/model/NotificationAndroidModel$a;->c:Z

    .line 494
    .line 495
    invoke-virtual {v1, v0, v2, p1}, Landroidx/core/app/k$e;->G(IIZ)Landroidx/core/app/k$e;

    .line 496
    .line 497
    .line 498
    :cond_e
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getShortcutId()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    if-eqz p1, :cond_f

    .line 503
    .line 504
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getShortcutId()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->I(Ljava/lang/String;)Landroidx/core/app/k$e;

    .line 509
    .line 510
    .line 511
    :cond_f
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getShowTimestamp()Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 516
    .line 517
    .line 518
    move-result p1

    .line 519
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->J(Z)Landroidx/core/app/k$e;

    .line 520
    .line 521
    .line 522
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSmallIcon()Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    if-eqz p1, :cond_11

    .line 527
    .line 528
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSmallIconLevel()Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 533
    .line 534
    .line 535
    move-result p1

    .line 536
    if-eqz v0, :cond_10

    .line 537
    .line 538
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    invoke-virtual {v1, p1, v0}, Landroidx/core/app/k$e;->L(II)Landroidx/core/app/k$e;

    .line 543
    .line 544
    .line 545
    goto :goto_4

    .line 546
    :cond_10
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->K(I)Landroidx/core/app/k$e;

    .line 547
    .line 548
    .line 549
    :cond_11
    :goto_4
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSortKey()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    if-eqz p1, :cond_12

    .line 554
    .line 555
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getSortKey()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->M(Ljava/lang/String;)Landroidx/core/app/k$e;

    .line 560
    .line 561
    .line 562
    :cond_12
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getTicker()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    if-eqz p1, :cond_13

    .line 567
    .line 568
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getTicker()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->Q(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    .line 573
    .line 574
    .line 575
    :cond_13
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getTimeoutAfter()Ljava/lang/Long;

    .line 576
    .line 577
    .line 578
    move-result-object p1

    .line 579
    if-eqz p1, :cond_14

    .line 580
    .line 581
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getTimeoutAfter()Ljava/lang/Long;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v2

    .line 589
    invoke-virtual {v1, v2, v3}, Landroidx/core/app/k$e;->R(J)Landroidx/core/app/k$e;

    .line 590
    .line 591
    .line 592
    :cond_14
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getShowChronometer()Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->S(Z)Landroidx/core/app/k$e;

    .line 601
    .line 602
    .line 603
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getVibrationPattern()[J

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    array-length v0, p1

    .line 608
    if-lez v0, :cond_15

    .line 609
    .line 610
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->T([J)Landroidx/core/app/k$e;

    .line 611
    .line 612
    .line 613
    :cond_15
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getVisibility()I

    .line 614
    .line 615
    .line 616
    move-result p1

    .line 617
    invoke-virtual {v1, p1}, Landroidx/core/app/k$e;->U(I)Landroidx/core/app/k$e;

    .line 618
    .line 619
    .line 620
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getTimestamp()J

    .line 621
    .line 622
    .line 623
    move-result-wide v2

    .line 624
    const-wide/16 v4, -0x1

    .line 625
    .line 626
    cmp-long p1, v2, v4

    .line 627
    .line 628
    if-lez p1, :cond_16

    .line 629
    .line 630
    invoke-virtual {v1, v2, v3}, Landroidx/core/app/k$e;->V(J)Landroidx/core/app/k$e;

    .line 631
    .line 632
    .line 633
    :cond_16
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getAutoCancel()Ljava/lang/Boolean;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 638
    .line 639
    .line 640
    move-result p0

    .line 641
    invoke-virtual {v1, p0}, Landroidx/core/app/k$e;->h(Z)Landroidx/core/app/k$e;

    .line 642
    .line 643
    .line 644
    return-object v1
.end method

.method public static b(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;Lz3/l;)Landroidx/core/app/k$e;
    .locals 3

    .line 1
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Landroidx/core/app/k$e;

    .line 6
    .line 7
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->hasFullScreenAction()Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getFullScreenAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivity()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, LS5/i;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "Launch Activity for full-screen action does not exist (\'%s\')."

    .line 36
    .line 37
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "NotificationManager"

    .line 42
    .line 43
    invoke-static {p1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 48
    .line 49
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, -0x1

    .line 59
    if-eq v1, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getLaunchActivityFlags()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "mainComponent"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "notification"

    .line 88
    .line 89
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    new-instance v1, LS5/j;

    .line 93
    .line 94
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->getMainComponent()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-direct {v1, p0}, LS5/j;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, LS5/f;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 105
    .line 106
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/high16 v1, 0xa000000

    .line 115
    .line 116
    invoke-static {p0, p1, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const/4 p1, 0x1

    .line 121
    invoke-virtual {p2, p0, p1}, Landroidx/core/app/k$e;->v(Landroid/app/PendingIntent;Z)Landroidx/core/app/k$e;

    .line 122
    .line 123
    .line 124
    :cond_3
    return-object p2
.end method

.method public static c(Lapp/notifee/core/model/NotificationAndroidModel;Lz3/l;)Landroidx/core/app/k$e;
    .locals 9

    .line 1
    const-string v0, "NotificationManager"

    .line 2
    .line 3
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/core/app/k$e;

    .line 8
    .line 9
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->hasLargeIcon()Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getLargeIcon()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :try_start_0
    invoke-static {v1}, LS5/o;->c(Ljava/lang/String;)Lz3/l;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    const-wide/16 v4, 0xa

    .line 30
    .line 31
    invoke-static {v2, v4, v5, v3}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    goto :goto_4

    .line 38
    :catch_0
    move-exception v2

    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception v2

    .line 41
    goto :goto_2

    .line 42
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v4, "An error occurred whilst trying to retrieve a largeIcon image: "

    .line 48
    .line 49
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0, v1, v2}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v4, "Timeout occurred whilst trying to retrieve a largeIcon image: "

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :goto_3
    const/4 v2, 0x0

    .line 72
    :goto_4
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getCircularLargeIcon()Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/4 v1, 0x0

    .line 93
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 94
    .line 95
    if-le p0, v0, :cond_0

    .line 96
    .line 97
    invoke-static {v0, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sub-int/2addr p0, v0

    .line 102
    div-int/lit8 p0, p0, 0x2

    .line 103
    .line 104
    add-int v4, p0, v0

    .line 105
    .line 106
    new-instance v5, Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-direct {v5, p0, v1, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Landroid/graphics/Rect;

    .line 112
    .line 113
    invoke-direct {p0, v1, v1, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 114
    .line 115
    .line 116
    div-int/lit8 v0, v0, 0x2

    .line 117
    .line 118
    int-to-float v0, v0

    .line 119
    goto :goto_5

    .line 120
    :cond_0
    invoke-static {p0, p0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    sub-int/2addr v0, p0

    .line 125
    div-int/lit8 v0, v0, 0x2

    .line 126
    .line 127
    add-int v4, v0, p0

    .line 128
    .line 129
    new-instance v5, Landroid/graphics/Rect;

    .line 130
    .line 131
    invoke-direct {v5, v1, v0, p0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroid/graphics/Rect;

    .line 135
    .line 136
    invoke-direct {v0, v1, v1, p0, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 137
    .line 138
    .line 139
    div-int/lit8 p0, p0, 0x2

    .line 140
    .line 141
    int-to-float p0, p0

    .line 142
    move-object v8, v0

    .line 143
    move v0, p0

    .line 144
    move-object p0, v8

    .line 145
    :goto_5
    new-instance v4, Landroid/graphics/Canvas;

    .line 146
    .line 147
    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 148
    .line 149
    .line 150
    new-instance v6, Landroid/graphics/Paint;

    .line 151
    .line 152
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 153
    .line 154
    .line 155
    const/4 v7, 0x1

    .line 156
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v1, v1, v1, v1}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 160
    .line 161
    .line 162
    const/high16 v1, -0x10000

    .line 163
    .line 164
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v0, v0, v0, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 171
    .line 172
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 173
    .line 174
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v2, v5, p0, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    move-object v2, v3

    .line 184
    :cond_1
    invoke-virtual {p1, v2}, Landroidx/core/app/k$e;->z(Landroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    .line 185
    .line 186
    .line 187
    :cond_2
    return-object p1
.end method

.method public static d(Ljava/util/List;ILjava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ll0/t;->h(Landroid/content/Context;)Ll0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v5, "Removing notification with id "

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v6, "NotificationManager"

    .line 48
    .line 49
    invoke-static {v6, v4}, Lapp/notifee/core/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    if-eq p1, v4, :cond_2

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    const-string v4, "0"

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_1

    .line 74
    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v7, "cancelAllNotificationsWithIds -> Failed to parse id as integer  "

    .line 80
    .line 81
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v6, v4}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    if-eqz v3, :cond_1

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v1, p2, v3}, Landroidx/core/app/T;->c(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {v1, p2, v3}, Landroidx/core/app/T;->c(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    :cond_2
    const/4 v3, 0x1

    .line 111
    if-eq p1, v3, :cond_0

    .line 112
    .line 113
    new-instance v3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v6, v3}, Lapp/notifee/core/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v4, "trigger:"

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v0, v3}, Ll0/t;->b(Ljava/lang/String;)Ll0/l;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ll0/t;->j()Ll0/l;

    .line 152
    .line 153
    .line 154
    invoke-static {v2}, Lu0/w0;->b(Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {}, LS5/a;->a()Landroid/app/AlarmManager;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-eqz v2, :cond_0

    .line 163
    .line 164
    invoke-virtual {v3, v2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_3
    return-object v3
.end method

.method public static e(Lz3/l;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lv0/i;->k()V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public static f(ILjava/util/List;Lz3/l;)Ljava/lang/Void;
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    if-eq p0, p2, :cond_0

    .line 3
    .line 4
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lv0/i;->n(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static synthetic g(ILz3/l;)Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    if-nez p0, :cond_1

    .line 5
    .line 6
    :cond_0
    invoke-static {}, Lu0/w0;->d()Lz3/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Lz3/l;->i(Lz3/c;)Lz3/l;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, Lu0/A0;

    .line 15
    .line 16
    invoke-direct {p1}, Lu0/A0;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lz3/l;->g(Lz3/h;)Lz3/l;

    .line 20
    .line 21
    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static h(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;)Ljava/lang/Void;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "type"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LS5/m;->a(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v4, "id"

    .line 16
    .line 17
    const-string v5, "Periodic"

    .line 18
    .line 19
    const-string v6, "workType"

    .line 20
    .line 21
    const-string v7, "trigger:"

    .line 22
    .line 23
    const-class v8, Lapp/notifee/core/Worker;

    .line 24
    .line 25
    const-string v9, "workRequestType"

    .line 26
    .line 27
    const-string v10, "app.notifee.core.NotificationManager.TRIGGER"

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    const/4 v11, 0x1

    .line 32
    if-eq v0, v11, :cond_0

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 56
    .line 57
    invoke-static {v0}, Ll0/t;->h(Landroid/content/Context;)Ll0/t;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    new-instance v0, Landroidx/work/b$a;

    .line 62
    .line 63
    invoke-direct {v0}, Landroidx/work/b$a;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v6, v10}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, v9, v5}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v0, v4, v5}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 83
    .line 84
    invoke-static {v0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 85
    .line 86
    .line 87
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    new-instance v5, LS5/r;

    .line 90
    .line 91
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-static {v9}, LS5/m;->c(Landroid/os/Bundle;)[B

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-static/range {p0 .. p0}, LS5/m;->c(Landroid/os/Bundle;)[B

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-direct {v5, v6, v9, v12, v0}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lv0/i;->b:Lv0/i;

    .line 111
    .line 112
    invoke-virtual {v0, v5}, Lv0/i;->l(LS5/r;)V

    .line 113
    .line 114
    .line 115
    const-string v0, "interval"

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_1

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, LS5/m;->a(Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    goto :goto_0

    .line 132
    :cond_1
    const/4 v3, -0x1

    .line 133
    :goto_0
    int-to-long v5, v3

    .line 134
    new-instance v3, Ll0/n$a;

    .line 135
    .line 136
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 137
    .line 138
    const-string v12, "timeUnit"

    .line 139
    .line 140
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const-string v13, "IntervalTriggerModel"

    .line 145
    .line 146
    const-string v14, "An error occurred whilst trying to convert interval time unit: "

    .line 147
    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    :try_start_0
    invoke-static {v15}, Ljava/util/concurrent/TimeUnit;->valueOf(Ljava/lang/String;)Ljava/util/concurrent/TimeUnit;

    .line 155
    .line 156
    .line 157
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    goto :goto_2

    .line 159
    :catch_0
    move-exception v0

    .line 160
    move-object/from16 v16, v9

    .line 161
    .line 162
    move-object v9, v0

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v13, v0, v9}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_2
    move-object/from16 v16, v9

    .line 183
    .line 184
    :goto_1
    move-object/from16 v9, v16

    .line 185
    .line 186
    :goto_2
    invoke-direct {v3, v8, v5, v6, v9}, Ll0/n$a;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    .line 187
    .line 188
    .line 189
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 190
    .line 191
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_3

    .line 196
    .line 197
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :try_start_1
    invoke-static {v1}, Ljava/util/concurrent/TimeUnit;->valueOf(Ljava/lang/String;)Ljava/util/concurrent/TimeUnit;

    .line 202
    .line 203
    .line 204
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 205
    goto :goto_3

    .line 206
    :catch_1
    move-exception v0

    .line 207
    move-object v9, v0

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v13, v0, v9}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 224
    .line 225
    .line 226
    :cond_3
    :goto_3
    invoke-virtual {v3, v5, v6, v8}, Ll0/u$a;->j(JLjava/util/concurrent/TimeUnit;)Ll0/u$a;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Ll0/n$a;

    .line 231
    .line 232
    invoke-virtual {v0, v10}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v7}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Landroidx/work/b$a;->a()Landroidx/work/b;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v1}, Ll0/u$a;->k(Landroidx/work/b;)Ll0/u$a;

    .line 243
    .line 244
    .line 245
    sget-object v1, Ll0/c;->o:Ll0/c;

    .line 246
    .line 247
    invoke-virtual {v0}, Ll0/u$a;->b()Ll0/u;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Ll0/n;

    .line 252
    .line 253
    invoke-virtual {v11, v7, v1, v0}, Ll0/t;->e(Ljava/lang/String;Ll0/c;Ll0/n;)Ll0/l;

    .line 254
    .line 255
    .line 256
    goto/16 :goto_4

    .line 257
    .line 258
    :cond_4
    new-instance v0, Lw0/d;

    .line 259
    .line 260
    invoke-direct {v0, v1}, Lw0/d;-><init>(Landroid/os/Bundle;)V

    .line 261
    .line 262
    .line 263
    new-instance v11, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    iget-object v11, v0, Lw0/d;->a:Landroid/os/Bundle;

    .line 283
    .line 284
    const-string v12, "timestamp"

    .line 285
    .line 286
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    const-wide/16 v13, 0x0

    .line 291
    .line 292
    if-eqz v11, :cond_5

    .line 293
    .line 294
    iget-object v11, v0, Lw0/d;->a:Landroid/os/Bundle;

    .line 295
    .line 296
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    invoke-static {v11}, LS5/m;->d(Ljava/lang/Object;)J

    .line 301
    .line 302
    .line 303
    move-result-wide v11

    .line 304
    cmp-long v15, v11, v13

    .line 305
    .line 306
    if-lez v15, :cond_5

    .line 307
    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 309
    .line 310
    .line 311
    move-result-wide v13

    .line 312
    sub-long/2addr v11, v13

    .line 313
    const-wide/16 v13, 0x3e8

    .line 314
    .line 315
    div-long/2addr v11, v13

    .line 316
    long-to-float v11, v11

    .line 317
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    int-to-long v13, v11

    .line 322
    :cond_5
    iget v11, v0, Lw0/d;->b:I

    .line 323
    .line 324
    new-instance v12, Landroidx/work/b$a;

    .line 325
    .line 326
    invoke-direct {v12}, Landroidx/work/b$a;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v6, v10}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v12

    .line 337
    invoke-virtual {v6, v4, v12}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iget-object v6, v0, Lw0/d;->d:Ljava/lang/Boolean;

    .line 342
    .line 343
    sget-object v12, LS5/e;->a:Landroid/content/Context;

    .line 344
    .line 345
    invoke-static {v12}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 346
    .line 347
    .line 348
    new-instance v12, LS5/r;

    .line 349
    .line 350
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    invoke-virtual/range {p1 .. p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 355
    .line 356
    .line 357
    move-result-object v16

    .line 358
    invoke-static/range {v16 .. v16}, LS5/m;->c(Landroid/os/Bundle;)[B

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static/range {p0 .. p0}, LS5/m;->c(Landroid/os/Bundle;)[B

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-direct {v12, v15, v3, v1, v6}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 367
    .line 368
    .line 369
    sget-object v1, Lv0/i;->b:Lv0/i;

    .line 370
    .line 371
    invoke-virtual {v1, v12}, Lv0/i;->l(LS5/r;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_6

    .line 379
    .line 380
    invoke-static {v2, v0}, Lu0/w0;->h(Lapp/notifee/core/model/NotificationModel;Lw0/d;)V

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_6
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 385
    .line 386
    invoke-static {v1}, Ll0/t;->h(Landroid/content/Context;)Ll0/t;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    const/4 v3, -0x1

    .line 391
    if-ne v11, v3, :cond_7

    .line 392
    .line 393
    new-instance v0, Ll0/k$a;

    .line 394
    .line 395
    invoke-direct {v0, v8}, Ll0/k$a;-><init>(Ljava/lang/Class;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v10}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v7}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 402
    .line 403
    .line 404
    const-string v3, "OneTime"

    .line 405
    .line 406
    invoke-virtual {v4, v9, v3}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4}, Landroidx/work/b$a;->a()Landroidx/work/b;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v0, v3}, Ll0/u$a;->k(Landroidx/work/b;)Ll0/u$a;

    .line 414
    .line 415
    .line 416
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 417
    .line 418
    invoke-virtual {v0, v13, v14, v3}, Ll0/u$a;->j(JLjava/util/concurrent/TimeUnit;)Ll0/u$a;

    .line 419
    .line 420
    .line 421
    sget-object v3, Ll0/d;->m:Ll0/d;

    .line 422
    .line 423
    invoke-virtual {v0}, Ll0/u$a;->b()Ll0/u;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, Ll0/k;

    .line 428
    .line 429
    invoke-virtual {v1, v7, v3, v0}, Ll0/t;->g(Ljava/lang/String;Ll0/d;Ll0/k;)Ll0/l;

    .line 430
    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_7
    new-instance v3, Ll0/n$a;

    .line 434
    .line 435
    iget v6, v0, Lw0/d;->b:I

    .line 436
    .line 437
    int-to-long v11, v6

    .line 438
    iget-object v0, v0, Lw0/d;->c:Ljava/util/concurrent/TimeUnit;

    .line 439
    .line 440
    invoke-direct {v3, v8, v11, v12, v0}, Ll0/n$a;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3, v10}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v7}, Ll0/u$a;->a(Ljava/lang/String;)Ll0/u$a;

    .line 447
    .line 448
    .line 449
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 450
    .line 451
    invoke-virtual {v3, v13, v14, v0}, Ll0/u$a;->j(JLjava/util/concurrent/TimeUnit;)Ll0/u$a;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v9, v5}, Landroidx/work/b$a;->g(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4}, Landroidx/work/b$a;->a()Landroidx/work/b;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v3, v0}, Ll0/u$a;->k(Landroidx/work/b;)Ll0/u$a;

    .line 462
    .line 463
    .line 464
    sget-object v0, Ll0/c;->o:Ll0/c;

    .line 465
    .line 466
    invoke-virtual {v3}, Ll0/u$a;->b()Ll0/u;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Ll0/n;

    .line 471
    .line 472
    invoke-virtual {v1, v7, v0, v3}, Ll0/t;->e(Ljava/lang/String;Ll0/c;Ll0/n;)Ll0/l;

    .line 473
    .line 474
    .line 475
    :goto_4
    new-instance v0, Lapp/notifee/core/event/NotificationEvent;

    .line 476
    .line 477
    const/4 v1, 0x7

    .line 478
    invoke-direct {v0, v1, v2}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;)V

    .line 479
    .line 480
    .line 481
    invoke-static {v0}, LS5/f;->a(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    const/4 v0, 0x0

    .line 485
    return-object v0
.end method

.method public static i(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;Lz3/l;)Ljava/lang/Void;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Landroidx/core/app/k$e;

    .line 7
    .line 8
    new-instance v1, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "notifee.notification"

    .line 18
    .line 19
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-string v2, "notifee.trigger"

    .line 25
    .line 26
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p2, v1}, Landroidx/core/app/k$e;->c(Landroid/os/Bundle;)Landroidx/core/app/k$e;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Landroidx/core/app/k$e;->d()Landroid/app/Notification;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getLoopSound()Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget v2, p1, Landroid/app/Notification;->flags:I

    .line 59
    .line 60
    or-int/lit8 v2, v2, 0x4

    .line 61
    .line 62
    iput v2, p1, Landroid/app/Notification;->flags:I

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getFlags()[I

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getFlags()[I

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    array-length v2, v2

    .line 75
    if-lez v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getFlags()[I

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    array-length v3, v2

    .line 82
    const/4 v4, 0x0

    .line 83
    :goto_0
    if-ge v4, v3, :cond_2

    .line 84
    .line 85
    aget v5, v2, v4

    .line 86
    .line 87
    iget v6, p1, Landroid/app/Notification;->flags:I

    .line 88
    .line 89
    or-int/2addr v5, v6

    .line 90
    iput v5, p1, Landroid/app/Notification;->flags:I

    .line 91
    .line 92
    add-int/2addr v4, v0

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getLightUpScreen()Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 105
    .line 106
    const-string v3, "power"

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Landroid/os/PowerManager;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/os/PowerManager;->isInteractive()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_3

    .line 119
    .line 120
    const v3, 0x3000001a

    .line 121
    .line 122
    .line 123
    const-string v4, "Notifee:lock"

    .line 124
    .line 125
    invoke-virtual {v2, v3, v4}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 130
    .line 131
    .line 132
    const-string v3, "Notifee:cpuLock"

    .line 133
    .line 134
    invoke-virtual {v2, v0, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getAsForegroundService()Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v1, Lapp/notifee/core/ForegroundService;->m:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v1, Landroid/content/Intent;

    .line 158
    .line 159
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 160
    .line 161
    const-class v3, Lapp/notifee/core/ForegroundService;

    .line 162
    .line 163
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 164
    .line 165
    .line 166
    const-string v2, "app.notifee.core.ForegroundService.START"

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    const-string v2, "hashCode"

    .line 172
    .line 173
    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 174
    .line 175
    .line 176
    const-string p2, "notification"

    .line 177
    .line 178
    invoke-virtual {v1, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    const-string p1, "notificationBundle"

    .line 182
    .line 183
    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 184
    .line 185
    .line 186
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 187
    .line 188
    const/16 p2, 0x1a

    .line 189
    .line 190
    if-lt p1, p2, :cond_4

    .line 191
    .line 192
    sget-object p1, LS5/e;->a:Landroid/content/Context;

    .line 193
    .line 194
    invoke-static {p1, v1}, Lu0/x0;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_4
    sget-object p1, LS5/e;->a:Landroid/content/Context;

    .line 199
    .line 200
    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_5
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 205
    .line 206
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidModel;->getTag()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v0, v1, p2, p1}, Landroidx/core/app/T;->p(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 215
    .line 216
    .line 217
    :goto_1
    new-instance p1, Lapp/notifee/core/event/NotificationEvent;

    .line 218
    .line 219
    const/4 p2, 0x3

    .line 220
    invoke-direct {p1, p2, p0}, Lapp/notifee/core/event/NotificationEvent;-><init>(ILapp/notifee/core/model/NotificationModel;)V

    .line 221
    .line 222
    .line 223
    invoke-static {p1}, LS5/f;->a(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    const/4 p0, 0x0

    .line 227
    return-object p0
.end method

.method public static j()Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lu0/N0;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/N0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static k(I)Lz3/l;
    .locals 3

    .line 1
    new-instance v0, Lu0/Q0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lu0/Q0;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    new-instance v2, Lu0/z0;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lu0/z0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static l(ILjava/util/List;Ljava/lang/String;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lu0/L0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0, p2}, Lu0/L0;-><init>(Ljava/util/List;ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, Lu0/M0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lu0/M0;-><init>(ILjava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lz3/l;->i(Lz3/c;)Lz3/l;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static m(Landroidx/work/b;Landroidx/concurrent/futures/c$a;Lz3/l;)Lz3/l;
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, LS5/r;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object v1, p2, LS5/r;->b:[B

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    :cond_0
    const-string v1, "notification"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/work/b;->j(Ljava/lang/String;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string p0, "NotificationManager"

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    const-string p1, "The trigger notification was created using an older version, please consider recreating the notification."

    .line 25
    .line 26
    invoke-static {p0, p1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {v1}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, Lapp/notifee/core/model/NotificationModel;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p2, LS5/r;->c:[B

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-static {p0}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    invoke-static {p1, v0}, Lu0/R0;->x(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    const-string p2, "Attempted to handle doScheduledWork but no notification data was found."

    .line 52
    .line 53
    invoke-static {p0, p2}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

.method public static n(Lapp/notifee/core/model/NotificationModel;)Lz3/l;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->a()Lapp/notifee/core/model/NotificationAndroidModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lu0/B0;

    .line 6
    .line 7
    invoke-direct {v1, v0, p0}, Lu0/B0;-><init>(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lu0/C0;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lu0/C0;-><init>(Lapp/notifee/core/model/NotificationAndroidModel;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Lu0/D0;

    .line 16
    .line 17
    invoke-direct {v3, v0, p0}, Lu0/D0;-><init>(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lu0/E0;

    .line 21
    .line 22
    invoke-direct {v4, v0, p0}, Lu0/E0;-><init>(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lu0/F0;

    .line 26
    .line 27
    invoke-direct {p0, v0}, Lu0/F0;-><init>(Lapp/notifee/core/model/NotificationAndroidModel;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, v0, v2}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v0, v4}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1, v0, p0}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, v0, v3}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static o(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/O0;

    .line 4
    .line 5
    invoke-direct {v1, p1, p0}, Lu0/O0;-><init>(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static p(Landroidx/concurrent/futures/c$a;Landroidx/work/b;Ljava/lang/String;Lz3/l;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lz3/l;->p()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p3}, Lz3/l;->k()Ljava/lang/Exception;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "NotificationManager"

    .line 19
    .line 20
    const-string p2, "Failed to display notification"

    .line 21
    .line 22
    invoke-static {p1, p2, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "workRequestType"

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroidx/work/b;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    const-string p1, "OneTime"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {p0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, p2}, Lv0/i;->m(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method public static q(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V
    .locals 4

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/work/b;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lv0/i;

    .line 8
    .line 9
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lu0/H0;

    .line 15
    .line 16
    invoke-direct {v2, p0, p1}, Lu0/H0;-><init>(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lv0/i;->q(Ljava/lang/String;)Lz3/l;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    invoke-virtual {v1, v3, v2}, Lz3/l;->j(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lu0/I0;

    .line 30
    .line 31
    invoke-direct {v2, p1, p0, v0}, Lu0/I0;-><init>(Landroidx/concurrent/futures/c$a;Landroidx/work/b;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static r(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2

    .line 1
    new-instance v0, Lv0/i;

    .line 2
    .line 3
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lv0/i;->p()Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lu0/K0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lu0/K0;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static s(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LS5/r;

    .line 34
    .line 35
    iget-object v1, v1, LS5/r;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {p0, v2, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p0, p1, v2}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    return-void
.end method

.method public static t(Lapp/notifee/core/model/NotificationAndroidModel;Lapp/notifee/core/model/NotificationModel;Lz3/l;)Landroidx/core/app/k$e;
    .locals 9

    .line 1
    const-string v0, "NotificationManager"

    .line 2
    .line 3
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroidx/core/app/k$e;

    .line 8
    .line 9
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getActions()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lapp/notifee/core/model/NotificationAndroidActionModel;

    .line 31
    .line 32
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 39
    .line 40
    const-string v3, "pressAction"

    .line 41
    .line 42
    const-string v4, "notification"

    .line 43
    .line 44
    const/16 v5, 0x1f

    .line 45
    .line 46
    if-lt v2, v5, :cond_1

    .line 47
    .line 48
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    if-lt v2, v5, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->b()Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getPressAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getPressAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    filled-new-array {v4, v6}, [Landroid/os/Bundle;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const/4 v6, 0x2

    .line 89
    invoke-static {v2, v5, v6, v3, v4}, LS5/k;->a(ILandroid/os/Bundle;I[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getPressAction()Lapp/notifee/core/model/NotificationAndroidPressActionModel;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Lapp/notifee/core/model/NotificationAndroidPressActionModel;->toBundle()Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    filled-new-array {v3, v4}, [Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const-string v4, "app.notifee.core.ReceiverService.ACTION_PRESS_INTENT"

    .line 115
    .line 116
    invoke-static {v4, v2, v3}, Lapp/notifee/core/ReceiverService;->a(Ljava/lang/String;[Ljava/lang/String;[Landroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :goto_1
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getIcon()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const/4 v4, 0x0

    .line 125
    if-eqz v3, :cond_2

    .line 126
    .line 127
    :try_start_0
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getIcon()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, LS5/o;->c(Ljava/lang/String;)Lz3/l;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 136
    .line 137
    const-wide/16 v7, 0xa

    .line 138
    .line 139
    invoke-static {v5, v7, v8, v6}, Lz3/o;->b(Lz3/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :catch_0
    move-exception v5

    .line 147
    goto :goto_2

    .line 148
    :catch_1
    move-exception v5

    .line 149
    goto :goto_4

    .line 150
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v7, "An error occurred whilst trying to retrieve an action icon: "

    .line 156
    .line 157
    :goto_3
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v0, v3, v5}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v7, "Timeout occurred whilst trying to retrieve an action icon: "

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_2
    :goto_5
    move-object v5, v4

    .line 180
    :goto_6
    if-eqz v5, :cond_3

    .line 181
    .line 182
    invoke-static {v5}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    :cond_3
    new-instance v3, Landroidx/core/app/k$a$a;

    .line 187
    .line 188
    invoke-virtual {v1}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getTitle()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    const/4 v6, 0x0

    .line 193
    invoke-static {v5, v6}, Landroidx/core/text/b;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-direct {v3, v4, v5, v2}, Landroidx/core/app/k$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v3}, Lapp/notifee/core/model/NotificationAndroidActionModel;->getRemoteInput(Landroidx/core/app/k$a$a;)Landroidx/core/app/Y;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eqz v1, :cond_4

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Landroidx/core/app/k$a$a;->a(Landroidx/core/app/Y;)Landroidx/core/app/k$a$a;

    .line 207
    .line 208
    .line 209
    :cond_4
    invoke-virtual {v3}, Landroidx/core/app/k$a$a;->b()Landroidx/core/app/k$a;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p2, v1}, Landroidx/core/app/k$e;->b(Landroidx/core/app/k$a;)Landroidx/core/app/k$e;

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_5
    return-object p2
.end method

.method public static synthetic u(Lapp/notifee/core/model/NotificationAndroidModel;Lz3/l;)Landroidx/core/app/k$e;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/core/app/k$e;

    .line 6
    .line 7
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationAndroidModel;->getStyle()Lapp/notifee/core/model/NotificationAndroidStyleModel;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lapp/notifee/core/model/NotificationAndroidStyleModel;->getStyleTask(Ljava/util/concurrent/Executor;)Lz3/l;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-static {p0}, Lz3/o;->a(Lz3/l;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroidx/core/app/k$h;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroidx/core/app/k$e;->O(Landroidx/core/app/k$h;)Landroidx/core/app/k$e;

    .line 32
    .line 33
    .line 34
    :cond_2
    return-object p1
.end method

.method public static v(I)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p0, v1, :cond_0

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroidx/core/app/T;->d()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x2

    .line 16
    if-eq p0, v0, :cond_2

    .line 17
    .line 18
    if-nez p0, :cond_3

    .line 19
    .line 20
    :cond_2
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0}, Ll0/t;->h(Landroid/content/Context;)Ll0/t;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "app.notifee.core.NotificationManager.TRIGGER"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ll0/t;->a(Ljava/lang/String;)Ll0/l;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ll0/t;->j()Ll0/l;

    .line 32
    .line 33
    .line 34
    :cond_3
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static w()Ljava/util/List;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-string v2, "notification"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/app/NotificationManager;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    array-length v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    if-ge v4, v3, :cond_6

    .line 23
    .line 24
    aget-object v5, v1, v4

    .line 25
    .line 26
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iget-object v7, v6, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 31
    .line 32
    new-instance v8, Landroid/os/Bundle;

    .line 33
    .line 34
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v9, "notifee.notification"

    .line 38
    .line 39
    invoke-virtual {v7, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    const-string v10, "notifee.trigger"

    .line 44
    .line 45
    invoke-virtual {v7, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    const-string v11, "id"

    .line 50
    .line 51
    const-string v12, ""

    .line 52
    .line 53
    if-nez v9, :cond_4

    .line 54
    .line 55
    new-instance v9, Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v13, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    invoke-virtual {v9, v11, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v13, "android.title"

    .line 83
    .line 84
    invoke-virtual {v7, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    if-eqz v13, :cond_0

    .line 89
    .line 90
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    const-string v14, "title"

    .line 95
    .line 96
    invoke-virtual {v9, v14, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    const-string v13, "android.text"

    .line 100
    .line 101
    invoke-virtual {v7, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    if-eqz v13, :cond_1

    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    const-string v14, "body"

    .line 112
    .line 113
    invoke-virtual {v9, v14, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    const-string v13, "android.subText"

    .line 117
    .line 118
    invoke-virtual {v7, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-eqz v7, :cond_2

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    const-string v13, "subtitle"

    .line 129
    .line 130
    invoke-virtual {v9, v13, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    new-instance v7, Landroid/os/Bundle;

    .line 134
    .line 135
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 136
    .line 137
    .line 138
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 139
    .line 140
    const/16 v14, 0x1a

    .line 141
    .line 142
    if-lt v13, v14, :cond_3

    .line 143
    .line 144
    invoke-static {v6}, Lu0/y0;->a(Landroid/app/Notification;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    const-string v14, "channelId"

    .line 149
    .line 150
    invoke-virtual {v7, v14, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_3
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    const-string v14, "tag"

    .line 158
    .line 159
    invoke-virtual {v7, v14, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    const-string v13, "group"

    .line 167
    .line 168
    invoke-virtual {v7, v13, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v6, "android"

    .line 172
    .line 173
    invoke-virtual {v9, v6, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    :goto_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v8, v11, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, v11}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :goto_2
    if-eqz v10, :cond_5

    .line 216
    .line 217
    const-string v6, "trigger"

    .line 218
    .line 219
    invoke-virtual {v8, v6, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    invoke-virtual {v8, v2, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 223
    .line 224
    .line 225
    new-instance v6, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    .line 234
    .line 235
    .line 236
    move-result-wide v9

    .line 237
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    const-string v6, "date"

    .line 245
    .line 246
    invoke-virtual {v8, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    add-int/lit8 v4, v4, 0x1

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_6
    return-object v0
.end method

.method public static x(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;
    .locals 3

    .line 1
    invoke-static {p0}, Lu0/R0;->n(Lapp/notifee/core/model/NotificationModel;)Lz3/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lu0/R0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance v2, Lu0/P0;

    .line 8
    .line 9
    invoke-direct {v2, p0, p1}, Lu0/P0;-><init>(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lz3/l;->h(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static y(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2

    .line 1
    new-instance v0, Lv0/i;

    .line 2
    .line 3
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lv0/i;->p()Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lu0/J0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lu0/J0;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static z(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LS5/r;

    .line 33
    .line 34
    new-instance v2, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, LS5/r;->b:[B

    .line 40
    .line 41
    invoke-static {v3}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "notification"

    .line 46
    .line 47
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, LS5/r;->c:[B

    .line 51
    .line 52
    invoke-static {v1}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v3, "trigger"

    .line 57
    .line 58
    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p1, 0x0

    .line 66
    :goto_1
    invoke-interface {p0, p1, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_1

    .line 75
    :goto_2
    return-void
.end method

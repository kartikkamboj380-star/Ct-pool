.class abstract Lr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lr/f;Lq/d;I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    iget v1, p0, Lr/f;->G0:I

    .line 5
    .line 6
    iget-object v2, p0, Lr/f;->J0:[Lr/c;

    .line 7
    .line 8
    move v3, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v1, p0, Lr/f;->H0:I

    .line 11
    .line 12
    iget-object v2, p0, Lr/f;->I0:[Lr/c;

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    :goto_0
    if-ge v0, v1, :cond_1

    .line 16
    .line 17
    aget-object v4, v2, v0

    .line 18
    .line 19
    invoke-virtual {v4}, Lr/c;->a()V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1, p2, v3, v4}, Lr/b;->b(Lr/f;Lq/d;IILr/c;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method

.method static b(Lr/f;Lq/d;IILr/c;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v1, p4

    .line 6
    .line 7
    iget-object v10, v1, Lr/c;->a:Lr/e;

    .line 8
    .line 9
    iget-object v11, v1, Lr/c;->c:Lr/e;

    .line 10
    .line 11
    iget-object v12, v1, Lr/c;->b:Lr/e;

    .line 12
    .line 13
    iget-object v13, v1, Lr/c;->d:Lr/e;

    .line 14
    .line 15
    iget-object v2, v1, Lr/c;->e:Lr/e;

    .line 16
    .line 17
    iget v3, v1, Lr/c;->k:F

    .line 18
    .line 19
    iget-object v4, v0, Lr/e;->M:[Lr/e$b;

    .line 20
    .line 21
    aget-object v4, v4, p2

    .line 22
    .line 23
    sget-object v5, Lr/e$b;->n:Lr/e$b;

    .line 24
    .line 25
    const/4 v14, 0x1

    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    move v4, v14

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v4, 0x0

    .line 31
    :goto_0
    const/4 v5, 0x2

    .line 32
    if-nez p2, :cond_4

    .line 33
    .line 34
    iget v7, v2, Lr/e;->m0:I

    .line 35
    .line 36
    if-nez v7, :cond_1

    .line 37
    .line 38
    move v8, v14

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v8, 0x0

    .line 41
    :goto_1
    if-ne v7, v14, :cond_2

    .line 42
    .line 43
    move v15, v14

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 v15, 0x0

    .line 46
    :goto_2
    if-ne v7, v5, :cond_3

    .line 47
    .line 48
    :goto_3
    move v5, v14

    .line 49
    goto :goto_4

    .line 50
    :cond_3
    const/4 v5, 0x0

    .line 51
    :goto_4
    move/from16 v16, v15

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    move v15, v8

    .line 55
    move-object v8, v10

    .line 56
    goto :goto_7

    .line 57
    :cond_4
    iget v7, v2, Lr/e;->n0:I

    .line 58
    .line 59
    if-nez v7, :cond_5

    .line 60
    .line 61
    move v8, v14

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    const/4 v8, 0x0

    .line 64
    :goto_5
    if-ne v7, v14, :cond_6

    .line 65
    .line 66
    move v15, v14

    .line 67
    goto :goto_6

    .line 68
    :cond_6
    const/4 v15, 0x0

    .line 69
    :goto_6
    if-ne v7, v5, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :goto_7
    const/16 v20, 0x0

    .line 73
    .line 74
    if-nez v7, :cond_13

    .line 75
    .line 76
    iget-object v6, v8, Lr/e;->J:[Lr/d;

    .line 77
    .line 78
    aget-object v6, v6, p3

    .line 79
    .line 80
    if-eqz v5, :cond_7

    .line 81
    .line 82
    const/16 v18, 0x1

    .line 83
    .line 84
    goto :goto_8

    .line 85
    :cond_7
    const/16 v18, 0x4

    .line 86
    .line 87
    :goto_8
    invoke-virtual {v6}, Lr/d;->b()I

    .line 88
    .line 89
    .line 90
    move-result v22

    .line 91
    iget-object v14, v8, Lr/e;->M:[Lr/e$b;

    .line 92
    .line 93
    aget-object v14, v14, p2

    .line 94
    .line 95
    move/from16 v24, v3

    .line 96
    .line 97
    sget-object v3, Lr/e$b;->o:Lr/e$b;

    .line 98
    .line 99
    if-ne v14, v3, :cond_8

    .line 100
    .line 101
    iget-object v14, v8, Lr/e;->n:[I

    .line 102
    .line 103
    aget v14, v14, p2

    .line 104
    .line 105
    if-nez v14, :cond_8

    .line 106
    .line 107
    move/from16 v25, v7

    .line 108
    .line 109
    const/4 v14, 0x1

    .line 110
    goto :goto_9

    .line 111
    :cond_8
    move/from16 v25, v7

    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    :goto_9
    iget-object v7, v6, Lr/d;->d:Lr/d;

    .line 115
    .line 116
    if-eqz v7, :cond_9

    .line 117
    .line 118
    if-eq v8, v10, :cond_9

    .line 119
    .line 120
    invoke-virtual {v7}, Lr/d;->b()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    add-int v22, v22, v7

    .line 125
    .line 126
    :cond_9
    move/from16 v7, v22

    .line 127
    .line 128
    if-eqz v5, :cond_a

    .line 129
    .line 130
    if-eq v8, v10, :cond_a

    .line 131
    .line 132
    if-eq v8, v12, :cond_a

    .line 133
    .line 134
    move/from16 v22, v15

    .line 135
    .line 136
    const/16 v18, 0x5

    .line 137
    .line 138
    goto :goto_a

    .line 139
    :cond_a
    move/from16 v22, v15

    .line 140
    .line 141
    :goto_a
    iget-object v15, v6, Lr/d;->d:Lr/d;

    .line 142
    .line 143
    move-object/from16 v26, v2

    .line 144
    .line 145
    if-eqz v15, :cond_d

    .line 146
    .line 147
    if-ne v8, v12, :cond_b

    .line 148
    .line 149
    iget-object v2, v6, Lr/d;->g:Lq/i;

    .line 150
    .line 151
    iget-object v15, v15, Lr/d;->g:Lq/i;

    .line 152
    .line 153
    move-object/from16 v27, v10

    .line 154
    .line 155
    const/4 v10, 0x6

    .line 156
    invoke-virtual {v9, v2, v15, v7, v10}, Lq/d;->h(Lq/i;Lq/i;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_b
    move-object/from16 v27, v10

    .line 161
    .line 162
    iget-object v2, v6, Lr/d;->g:Lq/i;

    .line 163
    .line 164
    iget-object v10, v15, Lr/d;->g:Lq/i;

    .line 165
    .line 166
    const/16 v15, 0x8

    .line 167
    .line 168
    invoke-virtual {v9, v2, v10, v7, v15}, Lq/d;->h(Lq/i;Lq/i;II)V

    .line 169
    .line 170
    .line 171
    :goto_b
    if-eqz v14, :cond_c

    .line 172
    .line 173
    if-nez v5, :cond_c

    .line 174
    .line 175
    const/4 v2, 0x5

    .line 176
    goto :goto_c

    .line 177
    :cond_c
    move/from16 v2, v18

    .line 178
    .line 179
    :goto_c
    iget-object v10, v6, Lr/d;->g:Lq/i;

    .line 180
    .line 181
    iget-object v6, v6, Lr/d;->d:Lr/d;

    .line 182
    .line 183
    iget-object v6, v6, Lr/d;->g:Lq/i;

    .line 184
    .line 185
    invoke-virtual {v9, v10, v6, v7, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 186
    .line 187
    .line 188
    goto :goto_d

    .line 189
    :cond_d
    move-object/from16 v27, v10

    .line 190
    .line 191
    :goto_d
    if-eqz v4, :cond_f

    .line 192
    .line 193
    invoke-virtual {v8}, Lr/e;->M()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    const/16 v6, 0x8

    .line 198
    .line 199
    if-eq v2, v6, :cond_e

    .line 200
    .line 201
    iget-object v2, v8, Lr/e;->M:[Lr/e$b;

    .line 202
    .line 203
    aget-object v2, v2, p2

    .line 204
    .line 205
    if-ne v2, v3, :cond_e

    .line 206
    .line 207
    iget-object v2, v8, Lr/e;->J:[Lr/d;

    .line 208
    .line 209
    add-int/lit8 v3, p3, 0x1

    .line 210
    .line 211
    aget-object v3, v2, v3

    .line 212
    .line 213
    iget-object v3, v3, Lr/d;->g:Lq/i;

    .line 214
    .line 215
    aget-object v2, v2, p3

    .line 216
    .line 217
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 218
    .line 219
    const/4 v6, 0x0

    .line 220
    const/4 v7, 0x5

    .line 221
    invoke-virtual {v9, v3, v2, v6, v7}, Lq/d;->h(Lq/i;Lq/i;II)V

    .line 222
    .line 223
    .line 224
    goto :goto_e

    .line 225
    :cond_e
    const/4 v6, 0x0

    .line 226
    :goto_e
    iget-object v2, v8, Lr/e;->J:[Lr/d;

    .line 227
    .line 228
    aget-object v2, v2, p3

    .line 229
    .line 230
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 231
    .line 232
    iget-object v3, v0, Lr/e;->J:[Lr/d;

    .line 233
    .line 234
    aget-object v3, v3, p3

    .line 235
    .line 236
    iget-object v3, v3, Lr/d;->g:Lq/i;

    .line 237
    .line 238
    const/16 v7, 0x8

    .line 239
    .line 240
    invoke-virtual {v9, v2, v3, v6, v7}, Lq/d;->h(Lq/i;Lq/i;II)V

    .line 241
    .line 242
    .line 243
    :cond_f
    iget-object v2, v8, Lr/e;->J:[Lr/d;

    .line 244
    .line 245
    add-int/lit8 v3, p3, 0x1

    .line 246
    .line 247
    aget-object v2, v2, v3

    .line 248
    .line 249
    iget-object v2, v2, Lr/d;->d:Lr/d;

    .line 250
    .line 251
    if-eqz v2, :cond_11

    .line 252
    .line 253
    iget-object v2, v2, Lr/d;->b:Lr/e;

    .line 254
    .line 255
    iget-object v3, v2, Lr/e;->J:[Lr/d;

    .line 256
    .line 257
    aget-object v3, v3, p3

    .line 258
    .line 259
    iget-object v3, v3, Lr/d;->d:Lr/d;

    .line 260
    .line 261
    if-eqz v3, :cond_11

    .line 262
    .line 263
    iget-object v3, v3, Lr/d;->b:Lr/e;

    .line 264
    .line 265
    if-eq v3, v8, :cond_10

    .line 266
    .line 267
    goto :goto_f

    .line 268
    :cond_10
    move-object/from16 v20, v2

    .line 269
    .line 270
    :cond_11
    :goto_f
    if-eqz v20, :cond_12

    .line 271
    .line 272
    move-object/from16 v8, v20

    .line 273
    .line 274
    move/from16 v7, v25

    .line 275
    .line 276
    goto :goto_10

    .line 277
    :cond_12
    const/4 v7, 0x1

    .line 278
    :goto_10
    move/from16 v15, v22

    .line 279
    .line 280
    move/from16 v3, v24

    .line 281
    .line 282
    move-object/from16 v2, v26

    .line 283
    .line 284
    move-object/from16 v10, v27

    .line 285
    .line 286
    goto/16 :goto_7

    .line 287
    .line 288
    :cond_13
    move-object/from16 v26, v2

    .line 289
    .line 290
    move/from16 v24, v3

    .line 291
    .line 292
    move-object/from16 v27, v10

    .line 293
    .line 294
    move/from16 v22, v15

    .line 295
    .line 296
    if-eqz v13, :cond_16

    .line 297
    .line 298
    iget-object v2, v11, Lr/e;->J:[Lr/d;

    .line 299
    .line 300
    add-int/lit8 v3, p3, 0x1

    .line 301
    .line 302
    aget-object v2, v2, v3

    .line 303
    .line 304
    iget-object v2, v2, Lr/d;->d:Lr/d;

    .line 305
    .line 306
    if-eqz v2, :cond_16

    .line 307
    .line 308
    iget-object v2, v13, Lr/e;->J:[Lr/d;

    .line 309
    .line 310
    aget-object v2, v2, v3

    .line 311
    .line 312
    iget-object v6, v13, Lr/e;->M:[Lr/e$b;

    .line 313
    .line 314
    aget-object v6, v6, p2

    .line 315
    .line 316
    sget-object v7, Lr/e$b;->o:Lr/e$b;

    .line 317
    .line 318
    if-ne v6, v7, :cond_14

    .line 319
    .line 320
    iget-object v6, v13, Lr/e;->n:[I

    .line 321
    .line 322
    aget v6, v6, p2

    .line 323
    .line 324
    if-nez v6, :cond_14

    .line 325
    .line 326
    if-nez v5, :cond_14

    .line 327
    .line 328
    iget-object v6, v2, Lr/d;->d:Lr/d;

    .line 329
    .line 330
    iget-object v7, v6, Lr/d;->b:Lr/e;

    .line 331
    .line 332
    if-ne v7, v0, :cond_14

    .line 333
    .line 334
    iget-object v7, v2, Lr/d;->g:Lq/i;

    .line 335
    .line 336
    iget-object v6, v6, Lr/d;->g:Lq/i;

    .line 337
    .line 338
    invoke-virtual {v2}, Lr/d;->b()I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    neg-int v8, v8

    .line 343
    const/4 v10, 0x5

    .line 344
    invoke-virtual {v9, v7, v6, v8, v10}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 345
    .line 346
    .line 347
    goto :goto_11

    .line 348
    :cond_14
    const/4 v10, 0x5

    .line 349
    if-eqz v5, :cond_15

    .line 350
    .line 351
    iget-object v6, v2, Lr/d;->d:Lr/d;

    .line 352
    .line 353
    iget-object v7, v6, Lr/d;->b:Lr/e;

    .line 354
    .line 355
    if-ne v7, v0, :cond_15

    .line 356
    .line 357
    iget-object v7, v2, Lr/d;->g:Lq/i;

    .line 358
    .line 359
    iget-object v6, v6, Lr/d;->g:Lq/i;

    .line 360
    .line 361
    invoke-virtual {v2}, Lr/d;->b()I

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    neg-int v8, v8

    .line 366
    const/4 v14, 0x4

    .line 367
    invoke-virtual {v9, v7, v6, v8, v14}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 368
    .line 369
    .line 370
    :cond_15
    :goto_11
    iget-object v6, v2, Lr/d;->g:Lq/i;

    .line 371
    .line 372
    iget-object v7, v11, Lr/e;->J:[Lr/d;

    .line 373
    .line 374
    aget-object v3, v7, v3

    .line 375
    .line 376
    iget-object v3, v3, Lr/d;->d:Lr/d;

    .line 377
    .line 378
    iget-object v3, v3, Lr/d;->g:Lq/i;

    .line 379
    .line 380
    invoke-virtual {v2}, Lr/d;->b()I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    neg-int v2, v2

    .line 385
    const/4 v7, 0x6

    .line 386
    invoke-virtual {v9, v6, v3, v2, v7}, Lq/d;->j(Lq/i;Lq/i;II)V

    .line 387
    .line 388
    .line 389
    goto :goto_12

    .line 390
    :cond_16
    const/4 v10, 0x5

    .line 391
    :goto_12
    if-eqz v4, :cond_17

    .line 392
    .line 393
    iget-object v0, v0, Lr/e;->J:[Lr/d;

    .line 394
    .line 395
    add-int/lit8 v2, p3, 0x1

    .line 396
    .line 397
    aget-object v0, v0, v2

    .line 398
    .line 399
    iget-object v0, v0, Lr/d;->g:Lq/i;

    .line 400
    .line 401
    iget-object v3, v11, Lr/e;->J:[Lr/d;

    .line 402
    .line 403
    aget-object v2, v3, v2

    .line 404
    .line 405
    iget-object v3, v2, Lr/d;->g:Lq/i;

    .line 406
    .line 407
    invoke-virtual {v2}, Lr/d;->b()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    const/16 v4, 0x8

    .line 412
    .line 413
    invoke-virtual {v9, v0, v3, v2, v4}, Lq/d;->h(Lq/i;Lq/i;II)V

    .line 414
    .line 415
    .line 416
    :cond_17
    iget-object v0, v1, Lr/c;->h:Ljava/util/ArrayList;

    .line 417
    .line 418
    if-eqz v0, :cond_1d

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    const/4 v3, 0x1

    .line 425
    if-le v2, v3, :cond_1d

    .line 426
    .line 427
    iget-boolean v3, v1, Lr/c;->r:Z

    .line 428
    .line 429
    if-eqz v3, :cond_18

    .line 430
    .line 431
    iget-boolean v3, v1, Lr/c;->t:Z

    .line 432
    .line 433
    if-nez v3, :cond_18

    .line 434
    .line 435
    iget v3, v1, Lr/c;->j:I

    .line 436
    .line 437
    int-to-float v3, v3

    .line 438
    goto :goto_13

    .line 439
    :cond_18
    move/from16 v3, v24

    .line 440
    .line 441
    :goto_13
    const/4 v4, 0x0

    .line 442
    move/from16 v29, v4

    .line 443
    .line 444
    move-object/from16 v7, v20

    .line 445
    .line 446
    const/4 v6, 0x0

    .line 447
    :goto_14
    if-ge v6, v2, :cond_1d

    .line 448
    .line 449
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    check-cast v8, Lr/e;

    .line 454
    .line 455
    iget-object v14, v8, Lr/e;->q0:[F

    .line 456
    .line 457
    aget v14, v14, p2

    .line 458
    .line 459
    cmpg-float v15, v14, v4

    .line 460
    .line 461
    if-gez v15, :cond_1a

    .line 462
    .line 463
    iget-boolean v14, v1, Lr/c;->t:Z

    .line 464
    .line 465
    if-eqz v14, :cond_19

    .line 466
    .line 467
    iget-object v8, v8, Lr/e;->J:[Lr/d;

    .line 468
    .line 469
    add-int/lit8 v14, p3, 0x1

    .line 470
    .line 471
    aget-object v14, v8, v14

    .line 472
    .line 473
    iget-object v14, v14, Lr/d;->g:Lq/i;

    .line 474
    .line 475
    aget-object v8, v8, p3

    .line 476
    .line 477
    iget-object v8, v8, Lr/d;->g:Lq/i;

    .line 478
    .line 479
    const/4 v10, 0x4

    .line 480
    const/4 v15, 0x0

    .line 481
    invoke-virtual {v9, v14, v8, v15, v10}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 482
    .line 483
    .line 484
    goto :goto_16

    .line 485
    :cond_19
    const/4 v10, 0x4

    .line 486
    const/high16 v14, 0x3f800000    # 1.0f

    .line 487
    .line 488
    goto :goto_15

    .line 489
    :cond_1a
    const/4 v10, 0x4

    .line 490
    :goto_15
    cmpl-float v15, v14, v4

    .line 491
    .line 492
    if-nez v15, :cond_1b

    .line 493
    .line 494
    iget-object v8, v8, Lr/e;->J:[Lr/d;

    .line 495
    .line 496
    add-int/lit8 v14, p3, 0x1

    .line 497
    .line 498
    aget-object v14, v8, v14

    .line 499
    .line 500
    iget-object v14, v14, Lr/d;->g:Lq/i;

    .line 501
    .line 502
    aget-object v8, v8, p3

    .line 503
    .line 504
    iget-object v8, v8, Lr/d;->g:Lq/i;

    .line 505
    .line 506
    const/16 v4, 0x8

    .line 507
    .line 508
    const/4 v15, 0x0

    .line 509
    invoke-virtual {v9, v14, v8, v15, v4}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 510
    .line 511
    .line 512
    :goto_16
    move-object/from16 v17, v0

    .line 513
    .line 514
    goto :goto_18

    .line 515
    :cond_1b
    const/4 v15, 0x0

    .line 516
    if-eqz v7, :cond_1c

    .line 517
    .line 518
    iget-object v4, v7, Lr/e;->J:[Lr/d;

    .line 519
    .line 520
    aget-object v7, v4, p3

    .line 521
    .line 522
    iget-object v7, v7, Lr/d;->g:Lq/i;

    .line 523
    .line 524
    add-int/lit8 v17, p3, 0x1

    .line 525
    .line 526
    aget-object v4, v4, v17

    .line 527
    .line 528
    iget-object v4, v4, Lr/d;->g:Lq/i;

    .line 529
    .line 530
    iget-object v10, v8, Lr/e;->J:[Lr/d;

    .line 531
    .line 532
    aget-object v15, v10, p3

    .line 533
    .line 534
    iget-object v15, v15, Lr/d;->g:Lq/i;

    .line 535
    .line 536
    aget-object v10, v10, v17

    .line 537
    .line 538
    iget-object v10, v10, Lr/d;->g:Lq/i;

    .line 539
    .line 540
    move-object/from16 v17, v0

    .line 541
    .line 542
    invoke-virtual/range {p1 .. p1}, Lq/d;->r()Lq/b;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    move-object/from16 v28, v0

    .line 547
    .line 548
    move/from16 v30, v3

    .line 549
    .line 550
    move/from16 v31, v14

    .line 551
    .line 552
    move-object/from16 v32, v7

    .line 553
    .line 554
    move-object/from16 v33, v4

    .line 555
    .line 556
    move-object/from16 v34, v15

    .line 557
    .line 558
    move-object/from16 v35, v10

    .line 559
    .line 560
    invoke-virtual/range {v28 .. v35}, Lq/b;->l(FFFLq/i;Lq/i;Lq/i;Lq/i;)Lq/b;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9, v0}, Lq/d;->d(Lq/b;)V

    .line 564
    .line 565
    .line 566
    goto :goto_17

    .line 567
    :cond_1c
    move-object/from16 v17, v0

    .line 568
    .line 569
    :goto_17
    move-object v7, v8

    .line 570
    move/from16 v29, v14

    .line 571
    .line 572
    :goto_18
    add-int/lit8 v6, v6, 0x1

    .line 573
    .line 574
    move-object/from16 v0, v17

    .line 575
    .line 576
    const/4 v4, 0x0

    .line 577
    const/4 v10, 0x5

    .line 578
    goto/16 :goto_14

    .line 579
    .line 580
    :cond_1d
    if-eqz v12, :cond_1f

    .line 581
    .line 582
    if-eq v12, v13, :cond_1e

    .line 583
    .line 584
    if-eqz v5, :cond_1f

    .line 585
    .line 586
    :cond_1e
    move-object/from16 v10, v27

    .line 587
    .line 588
    goto :goto_19

    .line 589
    :cond_1f
    move-object/from16 v10, v27

    .line 590
    .line 591
    goto :goto_1e

    .line 592
    :goto_19
    iget-object v0, v10, Lr/e;->J:[Lr/d;

    .line 593
    .line 594
    aget-object v0, v0, p3

    .line 595
    .line 596
    iget-object v1, v11, Lr/e;->J:[Lr/d;

    .line 597
    .line 598
    add-int/lit8 v2, p3, 0x1

    .line 599
    .line 600
    aget-object v1, v1, v2

    .line 601
    .line 602
    iget-object v0, v0, Lr/d;->d:Lr/d;

    .line 603
    .line 604
    if-eqz v0, :cond_20

    .line 605
    .line 606
    iget-object v0, v0, Lr/d;->g:Lq/i;

    .line 607
    .line 608
    move-object v3, v0

    .line 609
    goto :goto_1a

    .line 610
    :cond_20
    move-object/from16 v3, v20

    .line 611
    .line 612
    :goto_1a
    iget-object v0, v1, Lr/d;->d:Lr/d;

    .line 613
    .line 614
    if-eqz v0, :cond_21

    .line 615
    .line 616
    iget-object v0, v0, Lr/d;->g:Lq/i;

    .line 617
    .line 618
    move-object v5, v0

    .line 619
    goto :goto_1b

    .line 620
    :cond_21
    move-object/from16 v5, v20

    .line 621
    .line 622
    :goto_1b
    iget-object v0, v12, Lr/e;->J:[Lr/d;

    .line 623
    .line 624
    aget-object v0, v0, p3

    .line 625
    .line 626
    iget-object v1, v13, Lr/e;->J:[Lr/d;

    .line 627
    .line 628
    aget-object v1, v1, v2

    .line 629
    .line 630
    if-eqz v3, :cond_44

    .line 631
    .line 632
    if-eqz v5, :cond_44

    .line 633
    .line 634
    move-object/from16 v2, v26

    .line 635
    .line 636
    if-nez p2, :cond_22

    .line 637
    .line 638
    iget v2, v2, Lr/e;->b0:F

    .line 639
    .line 640
    :goto_1c
    move v4, v2

    .line 641
    goto :goto_1d

    .line 642
    :cond_22
    iget v2, v2, Lr/e;->c0:F

    .line 643
    .line 644
    goto :goto_1c

    .line 645
    :goto_1d
    invoke-virtual {v0}, Lr/d;->b()I

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    invoke-virtual {v1}, Lr/d;->b()I

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    iget-object v2, v0, Lr/d;->g:Lq/i;

    .line 654
    .line 655
    iget-object v8, v1, Lr/d;->g:Lq/i;

    .line 656
    .line 657
    const/4 v10, 0x7

    .line 658
    move-object/from16 v0, p1

    .line 659
    .line 660
    move-object v1, v2

    .line 661
    move-object v2, v3

    .line 662
    move v3, v6

    .line 663
    move-object v6, v8

    .line 664
    move v8, v10

    .line 665
    invoke-virtual/range {v0 .. v8}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    .line 666
    .line 667
    .line 668
    goto/16 :goto_37

    .line 669
    .line 670
    :goto_1e
    if-eqz v22, :cond_34

    .line 671
    .line 672
    if-eqz v12, :cond_34

    .line 673
    .line 674
    iget v0, v1, Lr/c;->j:I

    .line 675
    .line 676
    if-lez v0, :cond_23

    .line 677
    .line 678
    iget v1, v1, Lr/c;->i:I

    .line 679
    .line 680
    if-ne v1, v0, :cond_23

    .line 681
    .line 682
    const/16 v23, 0x1

    .line 683
    .line 684
    goto :goto_1f

    .line 685
    :cond_23
    const/16 v23, 0x0

    .line 686
    .line 687
    :goto_1f
    move-object v14, v12

    .line 688
    move-object v15, v14

    .line 689
    :goto_20
    if-eqz v14, :cond_44

    .line 690
    .line 691
    iget-object v0, v14, Lr/e;->s0:[Lr/e;

    .line 692
    .line 693
    aget-object v0, v0, p2

    .line 694
    .line 695
    move-object v8, v0

    .line 696
    :goto_21
    if-eqz v8, :cond_24

    .line 697
    .line 698
    invoke-virtual {v8}, Lr/e;->M()I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    const/16 v6, 0x8

    .line 703
    .line 704
    if-ne v0, v6, :cond_25

    .line 705
    .line 706
    iget-object v0, v8, Lr/e;->s0:[Lr/e;

    .line 707
    .line 708
    aget-object v8, v0, p2

    .line 709
    .line 710
    goto :goto_21

    .line 711
    :cond_24
    const/16 v6, 0x8

    .line 712
    .line 713
    :cond_25
    if-nez v8, :cond_27

    .line 714
    .line 715
    if-ne v14, v13, :cond_26

    .line 716
    .line 717
    goto :goto_22

    .line 718
    :cond_26
    move-object/from16 v17, v8

    .line 719
    .line 720
    const/16 v19, 0x5

    .line 721
    .line 722
    goto/16 :goto_2a

    .line 723
    .line 724
    :cond_27
    :goto_22
    iget-object v0, v14, Lr/e;->J:[Lr/d;

    .line 725
    .line 726
    aget-object v0, v0, p3

    .line 727
    .line 728
    iget-object v1, v0, Lr/d;->g:Lq/i;

    .line 729
    .line 730
    iget-object v2, v0, Lr/d;->d:Lr/d;

    .line 731
    .line 732
    if-eqz v2, :cond_28

    .line 733
    .line 734
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 735
    .line 736
    goto :goto_23

    .line 737
    :cond_28
    move-object/from16 v2, v20

    .line 738
    .line 739
    :goto_23
    if-eq v15, v14, :cond_29

    .line 740
    .line 741
    iget-object v2, v15, Lr/e;->J:[Lr/d;

    .line 742
    .line 743
    add-int/lit8 v3, p3, 0x1

    .line 744
    .line 745
    aget-object v2, v2, v3

    .line 746
    .line 747
    :goto_24
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 748
    .line 749
    goto :goto_25

    .line 750
    :cond_29
    if-ne v14, v12, :cond_2b

    .line 751
    .line 752
    if-ne v15, v14, :cond_2b

    .line 753
    .line 754
    iget-object v2, v10, Lr/e;->J:[Lr/d;

    .line 755
    .line 756
    aget-object v2, v2, p3

    .line 757
    .line 758
    iget-object v2, v2, Lr/d;->d:Lr/d;

    .line 759
    .line 760
    if-eqz v2, :cond_2a

    .line 761
    .line 762
    goto :goto_24

    .line 763
    :cond_2a
    move-object/from16 v2, v20

    .line 764
    .line 765
    :cond_2b
    :goto_25
    invoke-virtual {v0}, Lr/d;->b()I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    iget-object v3, v14, Lr/e;->J:[Lr/d;

    .line 770
    .line 771
    add-int/lit8 v4, p3, 0x1

    .line 772
    .line 773
    aget-object v3, v3, v4

    .line 774
    .line 775
    invoke-virtual {v3}, Lr/d;->b()I

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    if-eqz v8, :cond_2c

    .line 780
    .line 781
    iget-object v5, v8, Lr/e;->J:[Lr/d;

    .line 782
    .line 783
    aget-object v5, v5, p3

    .line 784
    .line 785
    iget-object v7, v5, Lr/d;->g:Lq/i;

    .line 786
    .line 787
    iget-object v6, v14, Lr/e;->J:[Lr/d;

    .line 788
    .line 789
    aget-object v6, v6, v4

    .line 790
    .line 791
    iget-object v6, v6, Lr/d;->g:Lq/i;

    .line 792
    .line 793
    move-object/from16 v36, v7

    .line 794
    .line 795
    move-object v7, v6

    .line 796
    move-object/from16 v6, v36

    .line 797
    .line 798
    goto :goto_27

    .line 799
    :cond_2c
    iget-object v5, v11, Lr/e;->J:[Lr/d;

    .line 800
    .line 801
    aget-object v5, v5, v4

    .line 802
    .line 803
    iget-object v5, v5, Lr/d;->d:Lr/d;

    .line 804
    .line 805
    if-eqz v5, :cond_2d

    .line 806
    .line 807
    iget-object v6, v5, Lr/d;->g:Lq/i;

    .line 808
    .line 809
    goto :goto_26

    .line 810
    :cond_2d
    move-object/from16 v6, v20

    .line 811
    .line 812
    :goto_26
    iget-object v7, v14, Lr/e;->J:[Lr/d;

    .line 813
    .line 814
    aget-object v7, v7, v4

    .line 815
    .line 816
    iget-object v7, v7, Lr/d;->g:Lq/i;

    .line 817
    .line 818
    :goto_27
    if-eqz v5, :cond_2e

    .line 819
    .line 820
    invoke-virtual {v5}, Lr/d;->b()I

    .line 821
    .line 822
    .line 823
    move-result v5

    .line 824
    add-int/2addr v3, v5

    .line 825
    :cond_2e
    if-eqz v15, :cond_2f

    .line 826
    .line 827
    iget-object v5, v15, Lr/e;->J:[Lr/d;

    .line 828
    .line 829
    aget-object v5, v5, v4

    .line 830
    .line 831
    invoke-virtual {v5}, Lr/d;->b()I

    .line 832
    .line 833
    .line 834
    move-result v5

    .line 835
    add-int/2addr v0, v5

    .line 836
    :cond_2f
    if-eqz v1, :cond_26

    .line 837
    .line 838
    if-eqz v2, :cond_26

    .line 839
    .line 840
    if-eqz v6, :cond_26

    .line 841
    .line 842
    if-eqz v7, :cond_26

    .line 843
    .line 844
    if-ne v14, v12, :cond_30

    .line 845
    .line 846
    iget-object v0, v12, Lr/e;->J:[Lr/d;

    .line 847
    .line 848
    aget-object v0, v0, p3

    .line 849
    .line 850
    invoke-virtual {v0}, Lr/d;->b()I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    :cond_30
    move v5, v0

    .line 855
    if-ne v14, v13, :cond_31

    .line 856
    .line 857
    iget-object v0, v13, Lr/e;->J:[Lr/d;

    .line 858
    .line 859
    aget-object v0, v0, v4

    .line 860
    .line 861
    invoke-virtual {v0}, Lr/d;->b()I

    .line 862
    .line 863
    .line 864
    move-result v0

    .line 865
    move/from16 v17, v0

    .line 866
    .line 867
    goto :goto_28

    .line 868
    :cond_31
    move/from16 v17, v3

    .line 869
    .line 870
    :goto_28
    if-eqz v23, :cond_32

    .line 871
    .line 872
    const/16 v18, 0x8

    .line 873
    .line 874
    goto :goto_29

    .line 875
    :cond_32
    const/16 v18, 0x5

    .line 876
    .line 877
    :goto_29
    const/high16 v4, 0x3f000000    # 0.5f

    .line 878
    .line 879
    move-object/from16 v0, p1

    .line 880
    .line 881
    move v3, v5

    .line 882
    move-object v5, v6

    .line 883
    const/16 v19, 0x5

    .line 884
    .line 885
    move-object v6, v7

    .line 886
    move/from16 v7, v17

    .line 887
    .line 888
    move-object/from16 v17, v8

    .line 889
    .line 890
    move/from16 v8, v18

    .line 891
    .line 892
    invoke-virtual/range {v0 .. v8}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    .line 893
    .line 894
    .line 895
    :goto_2a
    invoke-virtual {v14}, Lr/e;->M()I

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    const/16 v8, 0x8

    .line 900
    .line 901
    if-eq v0, v8, :cond_33

    .line 902
    .line 903
    move-object v15, v14

    .line 904
    :cond_33
    move-object/from16 v14, v17

    .line 905
    .line 906
    goto/16 :goto_20

    .line 907
    .line 908
    :cond_34
    const/16 v8, 0x8

    .line 909
    .line 910
    if-eqz v16, :cond_44

    .line 911
    .line 912
    if-eqz v12, :cond_44

    .line 913
    .line 914
    iget v0, v1, Lr/c;->j:I

    .line 915
    .line 916
    if-lez v0, :cond_35

    .line 917
    .line 918
    iget v1, v1, Lr/c;->i:I

    .line 919
    .line 920
    if-ne v1, v0, :cond_35

    .line 921
    .line 922
    const/16 v23, 0x1

    .line 923
    .line 924
    goto :goto_2b

    .line 925
    :cond_35
    const/16 v23, 0x0

    .line 926
    .line 927
    :goto_2b
    move-object v14, v12

    .line 928
    move-object v15, v14

    .line 929
    :goto_2c
    if-eqz v14, :cond_41

    .line 930
    .line 931
    iget-object v0, v14, Lr/e;->s0:[Lr/e;

    .line 932
    .line 933
    aget-object v0, v0, p2

    .line 934
    .line 935
    :goto_2d
    if-eqz v0, :cond_36

    .line 936
    .line 937
    invoke-virtual {v0}, Lr/e;->M()I

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-ne v1, v8, :cond_36

    .line 942
    .line 943
    iget-object v0, v0, Lr/e;->s0:[Lr/e;

    .line 944
    .line 945
    aget-object v0, v0, p2

    .line 946
    .line 947
    goto :goto_2d

    .line 948
    :cond_36
    if-eq v14, v12, :cond_3f

    .line 949
    .line 950
    if-eq v14, v13, :cond_3f

    .line 951
    .line 952
    if-eqz v0, :cond_3f

    .line 953
    .line 954
    if-ne v0, v13, :cond_37

    .line 955
    .line 956
    move-object/from16 v7, v20

    .line 957
    .line 958
    goto :goto_2e

    .line 959
    :cond_37
    move-object v7, v0

    .line 960
    :goto_2e
    iget-object v0, v14, Lr/e;->J:[Lr/d;

    .line 961
    .line 962
    aget-object v0, v0, p3

    .line 963
    .line 964
    iget-object v1, v0, Lr/d;->g:Lq/i;

    .line 965
    .line 966
    iget-object v2, v0, Lr/d;->d:Lr/d;

    .line 967
    .line 968
    if-eqz v2, :cond_38

    .line 969
    .line 970
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 971
    .line 972
    :cond_38
    iget-object v2, v15, Lr/e;->J:[Lr/d;

    .line 973
    .line 974
    add-int/lit8 v3, p3, 0x1

    .line 975
    .line 976
    aget-object v2, v2, v3

    .line 977
    .line 978
    iget-object v2, v2, Lr/d;->g:Lq/i;

    .line 979
    .line 980
    invoke-virtual {v0}, Lr/d;->b()I

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    iget-object v4, v14, Lr/e;->J:[Lr/d;

    .line 985
    .line 986
    aget-object v4, v4, v3

    .line 987
    .line 988
    invoke-virtual {v4}, Lr/d;->b()I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    if-eqz v7, :cond_3a

    .line 993
    .line 994
    iget-object v5, v7, Lr/e;->J:[Lr/d;

    .line 995
    .line 996
    aget-object v5, v5, p3

    .line 997
    .line 998
    iget-object v6, v5, Lr/d;->g:Lq/i;

    .line 999
    .line 1000
    iget-object v8, v5, Lr/d;->d:Lr/d;

    .line 1001
    .line 1002
    if-eqz v8, :cond_39

    .line 1003
    .line 1004
    goto :goto_30

    .line 1005
    :cond_39
    move-object/from16 v8, v20

    .line 1006
    .line 1007
    goto :goto_31

    .line 1008
    :cond_3a
    iget-object v5, v13, Lr/e;->J:[Lr/d;

    .line 1009
    .line 1010
    aget-object v5, v5, p3

    .line 1011
    .line 1012
    if-eqz v5, :cond_3b

    .line 1013
    .line 1014
    iget-object v6, v5, Lr/d;->g:Lq/i;

    .line 1015
    .line 1016
    goto :goto_2f

    .line 1017
    :cond_3b
    move-object/from16 v6, v20

    .line 1018
    .line 1019
    :goto_2f
    iget-object v8, v14, Lr/e;->J:[Lr/d;

    .line 1020
    .line 1021
    aget-object v8, v8, v3

    .line 1022
    .line 1023
    :goto_30
    iget-object v8, v8, Lr/d;->g:Lq/i;

    .line 1024
    .line 1025
    :goto_31
    if-eqz v5, :cond_3c

    .line 1026
    .line 1027
    invoke-virtual {v5}, Lr/d;->b()I

    .line 1028
    .line 1029
    .line 1030
    move-result v5

    .line 1031
    add-int/2addr v4, v5

    .line 1032
    :cond_3c
    move/from16 v17, v4

    .line 1033
    .line 1034
    iget-object v4, v15, Lr/e;->J:[Lr/d;

    .line 1035
    .line 1036
    aget-object v3, v4, v3

    .line 1037
    .line 1038
    invoke-virtual {v3}, Lr/d;->b()I

    .line 1039
    .line 1040
    .line 1041
    move-result v3

    .line 1042
    add-int/2addr v3, v0

    .line 1043
    if-eqz v23, :cond_3d

    .line 1044
    .line 1045
    const/16 v19, 0x8

    .line 1046
    .line 1047
    goto :goto_32

    .line 1048
    :cond_3d
    const/16 v19, 0x4

    .line 1049
    .line 1050
    :goto_32
    if-eqz v1, :cond_3e

    .line 1051
    .line 1052
    if-eqz v2, :cond_3e

    .line 1053
    .line 1054
    if-eqz v6, :cond_3e

    .line 1055
    .line 1056
    if-eqz v8, :cond_3e

    .line 1057
    .line 1058
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1059
    .line 1060
    move-object/from16 v0, p1

    .line 1061
    .line 1062
    move-object v5, v6

    .line 1063
    const/16 v18, 0x4

    .line 1064
    .line 1065
    move-object v6, v8

    .line 1066
    move-object/from16 v21, v7

    .line 1067
    .line 1068
    move/from16 v7, v17

    .line 1069
    .line 1070
    move-object/from16 v17, v15

    .line 1071
    .line 1072
    const/16 v15, 0x8

    .line 1073
    .line 1074
    move/from16 v8, v19

    .line 1075
    .line 1076
    invoke-virtual/range {v0 .. v8}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_33

    .line 1080
    :cond_3e
    move-object/from16 v21, v7

    .line 1081
    .line 1082
    move-object/from16 v17, v15

    .line 1083
    .line 1084
    const/16 v15, 0x8

    .line 1085
    .line 1086
    const/16 v18, 0x4

    .line 1087
    .line 1088
    :goto_33
    move-object/from16 v0, v21

    .line 1089
    .line 1090
    goto :goto_34

    .line 1091
    :cond_3f
    move-object/from16 v17, v15

    .line 1092
    .line 1093
    const/16 v18, 0x4

    .line 1094
    .line 1095
    move v15, v8

    .line 1096
    :goto_34
    invoke-virtual {v14}, Lr/e;->M()I

    .line 1097
    .line 1098
    .line 1099
    move-result v1

    .line 1100
    if-eq v1, v15, :cond_40

    .line 1101
    .line 1102
    goto :goto_35

    .line 1103
    :cond_40
    move-object/from16 v14, v17

    .line 1104
    .line 1105
    :goto_35
    move v8, v15

    .line 1106
    move-object v15, v14

    .line 1107
    move-object v14, v0

    .line 1108
    goto/16 :goto_2c

    .line 1109
    .line 1110
    :cond_41
    iget-object v0, v12, Lr/e;->J:[Lr/d;

    .line 1111
    .line 1112
    aget-object v0, v0, p3

    .line 1113
    .line 1114
    iget-object v1, v10, Lr/e;->J:[Lr/d;

    .line 1115
    .line 1116
    aget-object v1, v1, p3

    .line 1117
    .line 1118
    iget-object v1, v1, Lr/d;->d:Lr/d;

    .line 1119
    .line 1120
    iget-object v2, v13, Lr/e;->J:[Lr/d;

    .line 1121
    .line 1122
    add-int/lit8 v3, p3, 0x1

    .line 1123
    .line 1124
    aget-object v10, v2, v3

    .line 1125
    .line 1126
    iget-object v2, v11, Lr/e;->J:[Lr/d;

    .line 1127
    .line 1128
    aget-object v2, v2, v3

    .line 1129
    .line 1130
    iget-object v14, v2, Lr/d;->d:Lr/d;

    .line 1131
    .line 1132
    const/4 v15, 0x5

    .line 1133
    if-eqz v1, :cond_43

    .line 1134
    .line 1135
    if-eq v12, v13, :cond_42

    .line 1136
    .line 1137
    iget-object v2, v0, Lr/d;->g:Lq/i;

    .line 1138
    .line 1139
    iget-object v1, v1, Lr/d;->g:Lq/i;

    .line 1140
    .line 1141
    invoke-virtual {v0}, Lr/d;->b()I

    .line 1142
    .line 1143
    .line 1144
    move-result v0

    .line 1145
    invoke-virtual {v9, v2, v1, v0, v15}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 1146
    .line 1147
    .line 1148
    goto :goto_36

    .line 1149
    :cond_42
    if-eqz v14, :cond_43

    .line 1150
    .line 1151
    iget-object v2, v0, Lr/d;->g:Lq/i;

    .line 1152
    .line 1153
    iget-object v3, v1, Lr/d;->g:Lq/i;

    .line 1154
    .line 1155
    invoke-virtual {v0}, Lr/d;->b()I

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    iget-object v5, v10, Lr/d;->g:Lq/i;

    .line 1160
    .line 1161
    iget-object v6, v14, Lr/d;->g:Lq/i;

    .line 1162
    .line 1163
    invoke-virtual {v10}, Lr/d;->b()I

    .line 1164
    .line 1165
    .line 1166
    move-result v7

    .line 1167
    const/high16 v8, 0x3f000000    # 0.5f

    .line 1168
    .line 1169
    move-object/from16 v0, p1

    .line 1170
    .line 1171
    move-object v1, v2

    .line 1172
    move-object v2, v3

    .line 1173
    move v3, v4

    .line 1174
    move v4, v8

    .line 1175
    move v8, v15

    .line 1176
    invoke-virtual/range {v0 .. v8}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    .line 1177
    .line 1178
    .line 1179
    :cond_43
    :goto_36
    if-eqz v14, :cond_44

    .line 1180
    .line 1181
    if-eq v12, v13, :cond_44

    .line 1182
    .line 1183
    iget-object v0, v10, Lr/d;->g:Lq/i;

    .line 1184
    .line 1185
    iget-object v1, v14, Lr/d;->g:Lq/i;

    .line 1186
    .line 1187
    invoke-virtual {v10}, Lr/d;->b()I

    .line 1188
    .line 1189
    .line 1190
    move-result v2

    .line 1191
    neg-int v2, v2

    .line 1192
    invoke-virtual {v9, v0, v1, v2, v15}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    .line 1193
    .line 1194
    .line 1195
    :cond_44
    :goto_37
    if-nez v22, :cond_45

    .line 1196
    .line 1197
    if-eqz v16, :cond_4b

    .line 1198
    .line 1199
    :cond_45
    if-eqz v12, :cond_4b

    .line 1200
    .line 1201
    if-eq v12, v13, :cond_4b

    .line 1202
    .line 1203
    iget-object v0, v12, Lr/e;->J:[Lr/d;

    .line 1204
    .line 1205
    aget-object v1, v0, p3

    .line 1206
    .line 1207
    iget-object v2, v13, Lr/e;->J:[Lr/d;

    .line 1208
    .line 1209
    const/4 v3, 0x1

    .line 1210
    add-int/lit8 v3, p3, 0x1

    .line 1211
    .line 1212
    aget-object v2, v2, v3

    .line 1213
    .line 1214
    iget-object v4, v1, Lr/d;->d:Lr/d;

    .line 1215
    .line 1216
    if-eqz v4, :cond_46

    .line 1217
    .line 1218
    iget-object v4, v4, Lr/d;->g:Lq/i;

    .line 1219
    .line 1220
    goto :goto_38

    .line 1221
    :cond_46
    move-object/from16 v4, v20

    .line 1222
    .line 1223
    :goto_38
    iget-object v5, v2, Lr/d;->d:Lr/d;

    .line 1224
    .line 1225
    if-eqz v5, :cond_47

    .line 1226
    .line 1227
    iget-object v5, v5, Lr/d;->g:Lq/i;

    .line 1228
    .line 1229
    goto :goto_39

    .line 1230
    :cond_47
    move-object/from16 v5, v20

    .line 1231
    .line 1232
    :goto_39
    if-eq v11, v13, :cond_49

    .line 1233
    .line 1234
    iget-object v5, v11, Lr/e;->J:[Lr/d;

    .line 1235
    .line 1236
    aget-object v5, v5, v3

    .line 1237
    .line 1238
    iget-object v5, v5, Lr/d;->d:Lr/d;

    .line 1239
    .line 1240
    if-eqz v5, :cond_48

    .line 1241
    .line 1242
    iget-object v5, v5, Lr/d;->g:Lq/i;

    .line 1243
    .line 1244
    move-object/from16 v20, v5

    .line 1245
    .line 1246
    :cond_48
    move-object/from16 v5, v20

    .line 1247
    .line 1248
    :cond_49
    if-ne v12, v13, :cond_4a

    .line 1249
    .line 1250
    aget-object v2, v0, v3

    .line 1251
    .line 1252
    :cond_4a
    if-eqz v4, :cond_4b

    .line 1253
    .line 1254
    if-eqz v5, :cond_4b

    .line 1255
    .line 1256
    invoke-virtual {v1}, Lr/d;->b()I

    .line 1257
    .line 1258
    .line 1259
    move-result v6

    .line 1260
    iget-object v0, v13, Lr/e;->J:[Lr/d;

    .line 1261
    .line 1262
    aget-object v0, v0, v3

    .line 1263
    .line 1264
    invoke-virtual {v0}, Lr/d;->b()I

    .line 1265
    .line 1266
    .line 1267
    move-result v7

    .line 1268
    iget-object v1, v1, Lr/d;->g:Lq/i;

    .line 1269
    .line 1270
    iget-object v8, v2, Lr/d;->g:Lq/i;

    .line 1271
    .line 1272
    const/4 v10, 0x5

    .line 1273
    const/high16 v11, 0x3f000000    # 0.5f

    .line 1274
    .line 1275
    move-object/from16 v0, p1

    .line 1276
    .line 1277
    move-object v2, v4

    .line 1278
    move v3, v6

    .line 1279
    move v4, v11

    .line 1280
    move-object v6, v8

    .line 1281
    move v8, v10

    .line 1282
    invoke-virtual/range {v0 .. v8}, Lq/d;->c(Lq/i;Lq/i;IFLq/i;Lq/i;II)V

    .line 1283
    .line 1284
    .line 1285
    :cond_4b
    return-void
.end method

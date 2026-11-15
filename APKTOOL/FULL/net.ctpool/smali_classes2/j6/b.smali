.class public abstract Lj6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lj6/b;->a:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static final synthetic a([BI)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj6/b;->c([BI)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic b(C)I
    .locals 0

    .line 1
    invoke-static {p0}, Lj6/b;->g(C)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final c([BI)I
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x1

    .line 1
    array-length v4, v0

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    :cond_0
    :goto_0
    if-ge v5, v4, :cond_49

    aget-byte v8, v0, v5

    const v9, 0xfffd

    const/16 v10, 0x7f

    const/16 v11, 0x9f

    const/16 v12, 0x1f

    const/16 v13, 0xd

    const/16 v14, 0xa

    const/high16 v15, 0x10000

    const/16 v16, -0x1

    if-ltz v8, :cond_f

    add-int/lit8 v17, v7, 0x1

    if-ne v7, v1, :cond_1

    return v6

    :cond_1
    if-eq v8, v14, :cond_4

    if-eq v8, v13, :cond_4

    if-ltz v8, :cond_2

    if-ge v12, v8, :cond_5

    :cond_2
    if-le v10, v8, :cond_3

    goto :goto_1

    :cond_3
    if-lt v11, v8, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    if-ne v8, v9, :cond_6

    :cond_5
    :goto_2
    return v16

    :cond_6
    if-ge v8, v15, :cond_7

    move v7, v3

    goto :goto_3

    :cond_7
    const/4 v7, 0x2

    :goto_3
    add-int/2addr v6, v7

    add-int/2addr v5, v3

    :goto_4
    move/from16 v7, v17

    if-ge v5, v4, :cond_0

    aget-byte v8, v0, v5

    if-ltz v8, :cond_0

    add-int/2addr v5, v3

    add-int/lit8 v17, v7, 0x1

    if-ne v7, v1, :cond_8

    return v6

    :cond_8
    if-eq v8, v14, :cond_b

    if-eq v8, v13, :cond_b

    if-ltz v8, :cond_9

    if-ge v12, v8, :cond_c

    :cond_9
    if-le v10, v8, :cond_a

    goto :goto_5

    :cond_a
    if-lt v11, v8, :cond_b

    goto :goto_6

    :cond_b
    :goto_5
    if-ne v8, v9, :cond_d

    :cond_c
    :goto_6
    return v16

    :cond_d
    if-ge v8, v15, :cond_e

    move v7, v3

    goto :goto_7

    :cond_e
    const/4 v7, 0x2

    :goto_7
    add-int/2addr v6, v7

    goto :goto_4

    :cond_f
    shr-int/lit8 v2, v8, 0x5

    const/4 v15, -0x2

    const/16 v9, 0x80

    if-ne v2, v15, :cond_1d

    add-int/lit8 v2, v5, 0x1

    if-gt v4, v2, :cond_11

    if-ne v7, v1, :cond_10

    return v6

    :cond_10
    return v16

    :cond_11
    aget-byte v2, v0, v2

    and-int/lit16 v15, v2, 0xc0

    if-ne v15, v9, :cond_1b

    xor-int/lit16 v2, v2, 0xf80

    shl-int/lit8 v8, v8, 0x6

    xor-int/2addr v2, v8

    if-ge v2, v9, :cond_13

    if-ne v7, v1, :cond_12

    return v6

    :cond_12
    return v16

    :cond_13
    add-int/lit8 v8, v7, 0x1

    if-ne v7, v1, :cond_14

    return v6

    :cond_14
    if-eq v2, v14, :cond_17

    if-eq v2, v13, :cond_17

    if-ltz v2, :cond_15

    if-ge v12, v2, :cond_18

    :cond_15
    if-le v10, v2, :cond_16

    goto :goto_8

    :cond_16
    if-lt v11, v2, :cond_17

    goto :goto_9

    :cond_17
    :goto_8
    const v7, 0xfffd

    if-ne v2, v7, :cond_19

    :cond_18
    :goto_9
    return v16

    :cond_19
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_1a

    move v2, v3

    goto :goto_a

    :cond_1a
    const/4 v2, 0x2

    :goto_a
    add-int/2addr v6, v2

    sget-object v2, Li5/u;->a:Li5/u;

    const/4 v2, 0x2

    add-int/2addr v5, v2

    :goto_b
    move v7, v8

    goto/16 :goto_0

    :cond_1b
    if-ne v7, v1, :cond_1c

    return v6

    :cond_1c
    return v16

    :cond_1d
    const/4 v2, 0x2

    shr-int/lit8 v11, v8, 0x4

    const v10, 0xd800

    const v12, 0xdfff

    if-ne v11, v15, :cond_30

    add-int/lit8 v11, v5, 0x2

    if-gt v4, v11, :cond_1f

    if-ne v7, v1, :cond_1e

    return v6

    :cond_1e
    return v16

    :cond_1f
    add-int/lit8 v2, v5, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v15, v2, 0xc0

    if-ne v15, v9, :cond_2e

    aget-byte v11, v0, v11

    and-int/lit16 v15, v11, 0xc0

    if-ne v15, v9, :cond_2c

    const v9, -0x1e080

    xor-int/2addr v9, v11

    shl-int/lit8 v2, v2, 0x6

    xor-int/2addr v2, v9

    shl-int/lit8 v8, v8, 0xc

    xor-int/2addr v2, v8

    const/16 v8, 0x800

    if-ge v2, v8, :cond_21

    if-ne v7, v1, :cond_20

    return v6

    :cond_20
    return v16

    :cond_21
    if-le v10, v2, :cond_22

    goto :goto_c

    :cond_22
    if-lt v12, v2, :cond_24

    if-ne v7, v1, :cond_23

    return v6

    :cond_23
    return v16

    :cond_24
    :goto_c
    add-int/lit8 v8, v7, 0x1

    if-ne v7, v1, :cond_25

    return v6

    :cond_25
    if-eq v2, v14, :cond_28

    if-eq v2, v13, :cond_28

    if-ltz v2, :cond_26

    const/16 v7, 0x1f

    if-ge v7, v2, :cond_29

    :cond_26
    const/16 v7, 0x7f

    if-le v7, v2, :cond_27

    goto :goto_d

    :cond_27
    const/16 v7, 0x9f

    if-lt v7, v2, :cond_28

    goto :goto_e

    :cond_28
    :goto_d
    const v7, 0xfffd

    if-ne v2, v7, :cond_2a

    :cond_29
    :goto_e
    return v16

    :cond_2a
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_2b

    move v2, v3

    goto :goto_f

    :cond_2b
    const/4 v2, 0x2

    :goto_f
    add-int/2addr v6, v2

    sget-object v2, Li5/u;->a:Li5/u;

    add-int/lit8 v5, v5, 0x3

    goto :goto_b

    :cond_2c
    if-ne v7, v1, :cond_2d

    return v6

    :cond_2d
    return v16

    :cond_2e
    if-ne v7, v1, :cond_2f

    return v6

    :cond_2f
    return v16

    :cond_30
    shr-int/lit8 v2, v8, 0x3

    if-ne v2, v15, :cond_47

    add-int/lit8 v2, v5, 0x3

    if-gt v4, v2, :cond_32

    if-ne v7, v1, :cond_31

    return v6

    :cond_31
    return v16

    :cond_32
    add-int/lit8 v11, v5, 0x1

    aget-byte v11, v0, v11

    and-int/lit16 v15, v11, 0xc0

    if-ne v15, v9, :cond_45

    const/4 v15, 0x2

    add-int/lit8 v17, v5, 0x2

    aget-byte v15, v0, v17

    and-int/lit16 v13, v15, 0xc0

    if-ne v13, v9, :cond_43

    aget-byte v2, v0, v2

    and-int/lit16 v13, v2, 0xc0

    if-ne v13, v9, :cond_41

    const v9, 0x381f80

    xor-int/2addr v2, v9

    shl-int/lit8 v9, v15, 0x6

    xor-int/2addr v2, v9

    shl-int/lit8 v9, v11, 0xc

    xor-int/2addr v2, v9

    shl-int/lit8 v8, v8, 0x12

    xor-int/2addr v2, v8

    const v8, 0x10ffff

    if-le v2, v8, :cond_34

    if-ne v7, v1, :cond_33

    return v6

    :cond_33
    return v16

    :cond_34
    if-le v10, v2, :cond_36

    :cond_35
    const/high16 v8, 0x10000

    goto :goto_10

    :cond_36
    if-lt v12, v2, :cond_35

    if-ne v7, v1, :cond_37

    return v6

    :cond_37
    return v16

    :goto_10
    if-ge v2, v8, :cond_39

    if-ne v7, v1, :cond_38

    return v6

    :cond_38
    return v16

    :cond_39
    add-int/lit8 v8, v7, 0x1

    if-ne v7, v1, :cond_3a

    return v6

    :cond_3a
    if-eq v2, v14, :cond_3d

    const/16 v7, 0xd

    if-eq v2, v7, :cond_3d

    if-ltz v2, :cond_3b

    const/16 v7, 0x1f

    if-ge v7, v2, :cond_3e

    :cond_3b
    const/16 v7, 0x7f

    if-le v7, v2, :cond_3c

    goto :goto_11

    :cond_3c
    const/16 v7, 0x9f

    if-lt v7, v2, :cond_3d

    goto :goto_12

    :cond_3d
    :goto_11
    const v7, 0xfffd

    if-ne v2, v7, :cond_3f

    :cond_3e
    :goto_12
    return v16

    :cond_3f
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_40

    move v2, v3

    goto :goto_13

    :cond_40
    const/4 v2, 0x2

    :goto_13
    add-int/2addr v6, v2

    sget-object v2, Li5/u;->a:Li5/u;

    add-int/lit8 v5, v5, 0x4

    goto/16 :goto_b

    :cond_41
    if-ne v7, v1, :cond_42

    return v6

    :cond_42
    return v16

    :cond_43
    if-ne v7, v1, :cond_44

    return v6

    :cond_44
    return v16

    :cond_45
    if-ne v7, v1, :cond_46

    return v6

    :cond_46
    return v16

    :cond_47
    if-ne v7, v1, :cond_48

    return v6

    :cond_48
    return v16

    :cond_49
    return v6
.end method

.method public static final d(Li6/i;Ljava/lang/String;)Li6/i;
    .locals 2

    .line 1
    const-string v0, "$this$commonDigest"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "algorithm"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lj6/d;->a(Ljava/lang/String;)Lj6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Li6/i;->n()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0}, Li6/i;->C()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {p1, v0, v1, p0}, Lj6/c;->b([BII)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lj6/c;->a()[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Li6/i;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Li6/i;-><init>([B)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public static final e(Li6/z;Ljava/lang/String;)Li6/i;
    .locals 6

    .line 1
    const-string v0, "$this$commonSegmentDigest"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "algorithm"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lj6/d;->a(Ljava/lang/String;)Lj6/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Li6/z;->J()[[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    array-length v0, v0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Li6/z;->I()[I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    add-int v4, v0, v1

    .line 29
    .line 30
    aget v3, v3, v4

    .line 31
    .line 32
    invoke-virtual {p0}, Li6/z;->I()[I

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    aget v4, v4, v1

    .line 37
    .line 38
    invoke-virtual {p0}, Li6/z;->J()[[B

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    aget-object v5, v5, v1

    .line 43
    .line 44
    sub-int v2, v4, v2

    .line 45
    .line 46
    invoke-interface {p1, v5, v3, v2}, Lj6/c;->b([BII)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    move v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-interface {p1}, Lj6/c;->a()[B

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Li6/i;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Li6/i;-><init>([B)V

    .line 60
    .line 61
    .line 62
    return-object p1
.end method

.method public static final f(Li6/i;Li6/f;II)V
    .locals 1

    .line 1
    const-string v0, "$this$commonWrite"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "buffer"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li6/i;->n()[B

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0, p2, p3}, Li6/f;->s1([BII)Li6/f;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static final g(C)I
    .locals 3

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-le v0, p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 v1, 0x39

    .line 7
    .line 8
    if-lt v1, p0, :cond_1

    .line 9
    .line 10
    sub-int/2addr p0, v0

    .line 11
    goto :goto_2

    .line 12
    :cond_1
    :goto_0
    const/16 v0, 0x61

    .line 13
    .line 14
    if-le v0, p0, :cond_2

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_2
    const/16 v0, 0x66

    .line 18
    .line 19
    if-lt v0, p0, :cond_3

    .line 20
    .line 21
    add-int/lit8 p0, p0, -0x57

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_3
    :goto_1
    const/16 v0, 0x41

    .line 25
    .line 26
    if-gt v0, p0, :cond_4

    .line 27
    .line 28
    const/16 v0, 0x46

    .line 29
    .line 30
    if-lt v0, p0, :cond_4

    .line 31
    .line 32
    add-int/lit8 p0, p0, -0x37

    .line 33
    .line 34
    :goto_2
    return p0

    .line 35
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "Unexpected hex digit: "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public static final h()[C
    .locals 1

    .line 1
    sget-object v0, Lj6/b;->a:[C

    .line 2
    .line 3
    return-object v0
.end method

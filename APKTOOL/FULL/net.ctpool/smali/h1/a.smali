.class public Lh1/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Li1/b;


# instance fields
.field private final A:Landroid/graphics/RectF;

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:J

.field private H:Ljava/lang/String;

.field private I:I

.field private J:I

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:I

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Lj1/p$b;

.field private t:Ljava/util/HashMap;

.field private u:I

.field private v:I

.field private w:I

.field private final x:Landroid/graphics/Paint;

.field private final y:Landroid/graphics/Matrix;

.field private final z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh1/a;->t:Ljava/util/HashMap;

    .line 10
    .line 11
    const/16 v0, 0x50

    .line 12
    .line 13
    iput v0, p0, Lh1/a;->w:I

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Paint;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lh1/a;->y:Landroid/graphics/Matrix;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lh1/a;->z:Landroid/graphics/Rect;

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lh1/a;->A:Landroid/graphics/RectF;

    .line 43
    .line 44
    const/4 v0, -0x1

    .line 45
    iput v0, p0, Lh1/a;->I:I

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput v0, p0, Lh1/a;->J:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lh1/a;->i()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private c(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lh1/a;->e(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lh1/a;->e(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private e(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p2, ": "

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v0, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 31
    .line 32
    const/high16 v3, 0x66000000

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget v2, p0, Lh1/a;->E:I

    .line 38
    .line 39
    add-int/lit8 v3, v2, -0x4

    .line 40
    .line 41
    int-to-float v5, v3

    .line 42
    iget v3, p0, Lh1/a;->F:I

    .line 43
    .line 44
    add-int/lit8 v4, v3, 0x8

    .line 45
    .line 46
    int-to-float v6, v4

    .line 47
    int-to-float v2, v2

    .line 48
    add-float/2addr v2, v0

    .line 49
    add-float/2addr v2, v1

    .line 50
    const/high16 v1, 0x40800000    # 4.0f

    .line 51
    .line 52
    add-float v7, v2, v1

    .line 53
    .line 54
    iget v1, p0, Lh1/a;->D:I

    .line 55
    .line 56
    add-int/2addr v3, v1

    .line 57
    add-int/lit8 v3, v3, 0x8

    .line 58
    .line 59
    int-to-float v8, v3

    .line 60
    iget-object v9, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 61
    .line 62
    move-object v4, p1

    .line 63
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 67
    .line 68
    const/4 v2, -0x1

    .line 69
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    .line 71
    .line 72
    iget v1, p0, Lh1/a;->E:I

    .line 73
    .line 74
    int-to-float v1, v1

    .line 75
    iget v2, p0, Lh1/a;->F:I

    .line 76
    .line 77
    int-to-float v2, v2

    .line 78
    iget-object v3, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 79
    .line 80
    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    .line 88
    iget p2, p0, Lh1/a;->E:I

    .line 89
    .line 90
    int-to-float p2, p2

    .line 91
    add-float/2addr p2, v0

    .line 92
    iget p4, p0, Lh1/a;->F:I

    .line 93
    .line 94
    int-to-float p4, p4

    .line 95
    iget-object v0, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    iget p1, p0, Lh1/a;->F:I

    .line 101
    .line 102
    iget p2, p0, Lh1/a;->D:I

    .line 103
    .line 104
    add-int/2addr p1, p2

    .line 105
    iput p1, p0, Lh1/a;->F:I

    .line 106
    .line 107
    return-void
.end method

.method private static varargs g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    return-object p0
.end method

.method private h(Landroid/graphics/Rect;II)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/2addr v0, p3

    .line 6
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    div-int/2addr p3, p2

    .line 11
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/16 p3, 0xa

    .line 16
    .line 17
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/16 v0, 0x28

    .line 22
    .line 23
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget-object v0, p0, Lh1/a;->x:Landroid/graphics/Paint;

    .line 28
    .line 29
    int-to-float v1, p2

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 p2, p2, 0x8

    .line 34
    .line 35
    iput p2, p0, Lh1/a;->D:I

    .line 36
    .line 37
    iget v0, p0, Lh1/a;->w:I

    .line 38
    .line 39
    const/16 v1, 0x50

    .line 40
    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    mul-int/lit8 p2, p2, -0x1

    .line 44
    .line 45
    iput p2, p0, Lh1/a;->D:I

    .line 46
    .line 47
    :cond_0
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    add-int/2addr p2, p3

    .line 50
    iput p2, p0, Lh1/a;->B:I

    .line 51
    .line 52
    if-ne v0, v1, :cond_1

    .line 53
    .line 54
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 55
    .line 56
    sub-int/2addr p1, p3

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x14

    .line 61
    .line 62
    :goto_0
    iput p1, p0, Lh1/a;->C:I

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh1/a;->G:J

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh1/a;->t:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    const/16 v2, -0x6800

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v4, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    int-to-float v5, v1

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v1

    iget-object v7, p0, Lh1/a;->x:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    iget v3, p0, Lh1/a;->J:I

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v5, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    int-to-float v6, v1

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v1

    iget-object v8, p0, Lh1/a;->x:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lh1/a;->x:Landroid/graphics/Paint;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lh1/a;->B:I

    iput v1, p0, Lh1/a;->E:I

    iget v1, p0, Lh1/a;->C:I

    iput v1, p0, Lh1/a;->F:I

    iget-object v1, p0, Lh1/a;->n:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lh1/a;->m:Ljava/lang/String;

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%s, %s"

    invoke-static {v2, v1}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IDs"

    invoke-direct {p0, p1, v2, v1}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "ID"

    iget-object v2, p0, Lh1/a;->m:Ljava/lang/String;

    invoke-direct {p0, p1, v1, v2}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%dx%d"

    invoke-static {v2, v1}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "D"

    invoke-direct {p0, p1, v3, v1}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "DAR"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->c(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lh1/a;->o:I

    iget v1, p0, Lh1/a;->p:I

    iget-object v3, p0, Lh1/a;->s:Lj1/p$b;

    invoke-virtual {p0, v0, v1, v3}, Lh1/a;->f(IILj1/p$b;)I

    move-result v0

    iget v1, p0, Lh1/a;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p0, Lh1/a;->p:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "I"

    invoke-direct {p0, p1, v2, v1, v0}, Lh1/a;->e(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;I)V

    iget v0, p0, Lh1/a;->p:I

    if-lez v0, :cond_2

    iget v1, p0, Lh1/a;->o:I

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "IAR"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->c(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    iget v0, p0, Lh1/a;->q:I

    div-int/lit16 v0, v0, 0x400

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%d KiB"

    invoke-static {v1, v0}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v2, v0}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh1/a;->r:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "i format"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget v0, p0, Lh1/a;->u:I

    if-lez v0, :cond_4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lh1/a;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "f %d, l %d"

    invoke-static {v1, v0}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "anim"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lh1/a;->s:Lj1/p$b;

    if-eqz v0, :cond_5

    const-string v1, "scale"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->c(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    iget-wide v0, p0, Lh1/a;->G:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_6

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%d ms"

    invoke-static {v1, v0}, Lh1/a;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "t"

    invoke-direct {p0, p1, v1, v0}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lh1/a;->H:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v1, "origin"

    iget v2, p0, Lh1/a;->I:I

    invoke-direct {p0, p1, v1, v0, v2}, Lh1/a;->e(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_7
    iget-object v0, p0, Lh1/a;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, p1, v2, v1}, Lh1/a;->d(Landroid/graphics/Canvas;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    return-void
.end method

.method f(IILj1/p$b;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/high16 v2, -0x10000

    .line 18
    .line 19
    if-lez v0, :cond_3

    .line 20
    .line 21
    if-lez v1, :cond_3

    .line 22
    .line 23
    if-lez p1, :cond_3

    .line 24
    .line 25
    if-gtz p2, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    if-eqz p3, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lh1/a;->z:Landroid/graphics/Rect;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput v4, v3, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    iput v0, v3, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 41
    .line 42
    iget-object v3, p0, Lh1/a;->y:Landroid/graphics/Matrix;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 45
    .line 46
    .line 47
    iget-object v5, p0, Lh1/a;->y:Landroid/graphics/Matrix;

    .line 48
    .line 49
    iget-object v6, p0, Lh1/a;->z:Landroid/graphics/Rect;

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    move-object v4, p3

    .line 54
    move v7, p1

    .line 55
    move v8, p2

    .line 56
    invoke-interface/range {v4 .. v10}, Lj1/p$b;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFF)Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    iget-object p3, p0, Lh1/a;->A:Landroid/graphics/RectF;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    iput v3, p3, Landroid/graphics/RectF;->top:F

    .line 63
    .line 64
    iput v3, p3, Landroid/graphics/RectF;->left:F

    .line 65
    .line 66
    int-to-float v3, p1

    .line 67
    iput v3, p3, Landroid/graphics/RectF;->right:F

    .line 68
    .line 69
    int-to-float v3, p2

    .line 70
    iput v3, p3, Landroid/graphics/RectF;->bottom:F

    .line 71
    .line 72
    iget-object v3, p0, Lh1/a;->y:Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-virtual {v3, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, Lh1/a;->A:Landroid/graphics/RectF;

    .line 78
    .line 79
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    float-to-int p3, p3

    .line 84
    iget-object v3, p0, Lh1/a;->A:Landroid/graphics/RectF;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    float-to-int v3, v3

    .line 91
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    :cond_1
    int-to-float p3, v0

    .line 100
    const v3, 0x3dcccccd    # 0.1f

    .line 101
    .line 102
    .line 103
    mul-float v4, p3, v3

    .line 104
    .line 105
    const/high16 v5, 0x3f000000    # 0.5f

    .line 106
    .line 107
    mul-float/2addr p3, v5

    .line 108
    int-to-float v6, v1

    .line 109
    mul-float/2addr v3, v6

    .line 110
    mul-float/2addr v6, v5

    .line 111
    sub-int/2addr p1, v0

    .line 112
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    sub-int/2addr p2, v1

    .line 117
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    int-to-float p1, p1

    .line 122
    cmpg-float v0, p1, v4

    .line 123
    .line 124
    if-gez v0, :cond_2

    .line 125
    .line 126
    int-to-float v0, p2

    .line 127
    cmpg-float v0, v0, v3

    .line 128
    .line 129
    if-gez v0, :cond_2

    .line 130
    .line 131
    const p1, -0xff0100

    .line 132
    .line 133
    .line 134
    return p1

    .line 135
    :cond_2
    cmpg-float p1, p1, p3

    .line 136
    .line 137
    if-gez p1, :cond_3

    .line 138
    .line 139
    int-to-float p1, p2

    .line 140
    cmpg-float p1, p1, v6

    .line 141
    .line 142
    if-gez p1, :cond_3

    .line 143
    .line 144
    const/16 p1, -0x100

    .line 145
    .line 146
    return p1

    .line 147
    :cond_3
    :goto_0
    return v2
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public i()V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lh1/a;->o:I

    .line 3
    .line 4
    iput v0, p0, Lh1/a;->p:I

    .line 5
    .line 6
    iput v0, p0, Lh1/a;->q:I

    .line 7
    .line 8
    new-instance v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lh1/a;->t:Ljava/util/HashMap;

    .line 14
    .line 15
    iput v0, p0, Lh1/a;->u:I

    .line 16
    .line 17
    iput v0, p0, Lh1/a;->v:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lh1/a;->r:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lh1/a;->j(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v2, -0x1

    .line 26
    .line 27
    iput-wide v2, p0, Lh1/a;->G:J

    .line 28
    .line 29
    iput-object v1, p0, Lh1/a;->H:Ljava/lang/String;

    .line 30
    .line 31
    iput v0, p0, Lh1/a;->I:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string p1, "none"

    .line 5
    .line 6
    :goto_0
    iput-object p1, p0, Lh1/a;->m:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public k(II)V
    .locals 0

    .line 1
    iput p1, p0, Lh1/a;->o:I

    .line 2
    .line 3
    iput p2, p0, Lh1/a;->p:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh1/a;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public m(Lj1/p$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh1/a;->s:Lj1/p$b;

    .line 2
    .line 3
    return-void
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {p0, p1, v0, v1}, Lh1/a;->h(Landroid/graphics/Rect;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setAlpha(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method

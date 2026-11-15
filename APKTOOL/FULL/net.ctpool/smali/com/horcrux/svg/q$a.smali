.class abstract Lcom/horcrux/svg/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:[Lcom/horcrux/svg/Z;

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v1, Lcom/horcrux/svg/Z;->p:Lcom/horcrux/svg/Z;

    sget-object v2, Lcom/horcrux/svg/Z;->q:Lcom/horcrux/svg/Z;

    sget-object v3, Lcom/horcrux/svg/Z;->r:Lcom/horcrux/svg/Z;

    sget-object v4, Lcom/horcrux/svg/Z;->n:Lcom/horcrux/svg/Z;

    sget-object v5, Lcom/horcrux/svg/Z;->t:Lcom/horcrux/svg/Z;

    sget-object v6, Lcom/horcrux/svg/Z;->u:Lcom/horcrux/svg/Z;

    sget-object v7, Lcom/horcrux/svg/Z;->o:Lcom/horcrux/svg/Z;

    sget-object v8, Lcom/horcrux/svg/Z;->w:Lcom/horcrux/svg/Z;

    sget-object v10, Lcom/horcrux/svg/Z;->x:Lcom/horcrux/svg/Z;

    move-object v0, v1

    move-object v9, v10

    filled-new-array/range {v0 .. v10}, [Lcom/horcrux/svg/Z;

    move-result-object v0

    sput-object v0, Lcom/horcrux/svg/q$a;->a:[Lcom/horcrux/svg/Z;

    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/horcrux/svg/q$a;->b:[I

    return-void

    :array_0
    .array-data 4
        0x190
        0x2bc
        0x64
        0xc8
        0x12c
        0x190
        0x1f4
        0x258
        0x2bc
        0x320
        0x384
    .end array-data
.end method

.method private static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x15e

    if-ge p0, v0, :cond_0

    const/16 p0, 0x190

    return p0

    :cond_0
    const/16 v0, 0x226

    if-ge p0, v0, :cond_1

    const/16 p0, 0x2bc

    return p0

    :cond_1
    const/16 v0, 0x384

    if-ge p0, v0, :cond_2

    return v0

    :cond_2
    return p0
.end method

.method static b(Lcom/horcrux/svg/Z;Lcom/horcrux/svg/q;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/Z;->y:Lcom/horcrux/svg/Z;

    if-ne p0, v0, :cond_0

    iget p0, p1, Lcom/horcrux/svg/q;->f:I

    invoke-static {p0}, Lcom/horcrux/svg/q$a;->a(I)I

    move-result p0

    return p0

    :cond_0
    sget-object v0, Lcom/horcrux/svg/Z;->z:Lcom/horcrux/svg/Z;

    if-ne p0, v0, :cond_1

    iget p0, p1, Lcom/horcrux/svg/q;->f:I

    invoke-static {p0}, Lcom/horcrux/svg/q$a;->c(I)I

    move-result p0

    return p0

    :cond_1
    sget-object p1, Lcom/horcrux/svg/q$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    return p0
.end method

.method private static c(I)I
    .locals 2

    .line 1
    const/16 v0, 0x64

    if-ge p0, v0, :cond_0

    return p0

    :cond_0
    const/16 v1, 0x226

    if-ge p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v0, 0x2ee

    if-ge p0, v0, :cond_2

    const/16 p0, 0x190

    return p0

    :cond_2
    const/16 p0, 0x2bc

    return p0
.end method

.method static d(I)Lcom/horcrux/svg/Z;
    .locals 2

    .line 1
    sget-object v0, Lcom/horcrux/svg/q$a;->a:[Lcom/horcrux/svg/Z;

    int-to-float p0, p0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    aget-object p0, v0, p0

    return-object p0
.end method

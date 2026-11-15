.class final enum LA2/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field public static final enum m:LA2/a$b;

.field public static final enum n:LA2/a$b;

.field public static final enum o:LA2/a$b;

.field private static final synthetic p:[LA2/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LA2/a$b;

    .line 2
    .line 3
    const-string v1, "SOLID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LA2/a$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LA2/a$b;->m:LA2/a$b;

    .line 10
    .line 11
    new-instance v0, LA2/a$b;

    .line 12
    .line 13
    const-string v1, "DASHED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LA2/a$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LA2/a$b;->n:LA2/a$b;

    .line 20
    .line 21
    new-instance v0, LA2/a$b;

    .line 22
    .line 23
    const-string v1, "DOTTED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LA2/a$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LA2/a$b;->o:LA2/a$b;

    .line 30
    .line 31
    invoke-static {}, LA2/a$b;->e()[LA2/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LA2/a$b;->p:[LA2/a$b;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic e()[LA2/a$b;
    .locals 3

    .line 1
    sget-object v0, LA2/a$b;->m:LA2/a$b;

    .line 2
    .line 3
    sget-object v1, LA2/a$b;->n:LA2/a$b;

    .line 4
    .line 5
    sget-object v2, LA2/a$b;->o:LA2/a$b;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LA2/a$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static h(LA2/a$b;F)Landroid/graphics/PathEffect;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x2

    .line 6
    sget-object v5, LA2/a$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v5, p0

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eq p0, v4, :cond_1

    .line 16
    .line 17
    if-eq p0, v3, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p0, Landroid/graphics/DashPathEffect;

    .line 22
    .line 23
    new-array v2, v2, [F

    .line 24
    .line 25
    aput p1, v2, v1

    .line 26
    .line 27
    aput p1, v2, v0

    .line 28
    .line 29
    aput p1, v2, v4

    .line 30
    .line 31
    aput p1, v2, v3

    .line 32
    .line 33
    invoke-direct {p0, v2, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance p0, Landroid/graphics/DashPathEffect;

    .line 38
    .line 39
    const/high16 v6, 0x40400000    # 3.0f

    .line 40
    .line 41
    mul-float/2addr p1, v6

    .line 42
    new-array v2, v2, [F

    .line 43
    .line 44
    aput p1, v2, v1

    .line 45
    .line 46
    aput p1, v2, v0

    .line 47
    .line 48
    aput p1, v2, v4

    .line 49
    .line 50
    aput p1, v2, v3

    .line 51
    .line 52
    invoke-direct {p0, v2, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LA2/a$b;
    .locals 1

    .line 1
    const-class v0, LA2/a$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LA2/a$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LA2/a$b;
    .locals 1

    .line 1
    sget-object v0, LA2/a$b;->p:[LA2/a$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [LA2/a$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LA2/a$b;

    .line 8
    .line 9
    return-object v0
.end method

.class final enum Lcom/horcrux/svg/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/horcrux/svg/f;

.field public static final enum n:Lcom/horcrux/svg/f;

.field public static final enum o:Lcom/horcrux/svg/f;

.field public static final enum p:Lcom/horcrux/svg/f;

.field public static final enum q:Lcom/horcrux/svg/f;

.field private static final synthetic r:[Lcom/horcrux/svg/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/horcrux/svg/f;

    const-string v1, "kCGPathElementAddCurveToPoint"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/f;->m:Lcom/horcrux/svg/f;

    new-instance v0, Lcom/horcrux/svg/f;

    const-string v1, "kCGPathElementAddQuadCurveToPoint"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/f;->n:Lcom/horcrux/svg/f;

    new-instance v0, Lcom/horcrux/svg/f;

    const-string v1, "kCGPathElementMoveToPoint"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/f;->o:Lcom/horcrux/svg/f;

    new-instance v0, Lcom/horcrux/svg/f;

    const-string v1, "kCGPathElementAddLineToPoint"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/f;->p:Lcom/horcrux/svg/f;

    new-instance v0, Lcom/horcrux/svg/f;

    const-string v1, "kCGPathElementCloseSubpath"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/f;->q:Lcom/horcrux/svg/f;

    invoke-static {}, Lcom/horcrux/svg/f;->e()[Lcom/horcrux/svg/f;

    move-result-object v0

    sput-object v0, Lcom/horcrux/svg/f;->r:[Lcom/horcrux/svg/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/horcrux/svg/f;
    .locals 5

    .line 1
    sget-object v0, Lcom/horcrux/svg/f;->m:Lcom/horcrux/svg/f;

    sget-object v1, Lcom/horcrux/svg/f;->n:Lcom/horcrux/svg/f;

    sget-object v2, Lcom/horcrux/svg/f;->o:Lcom/horcrux/svg/f;

    sget-object v3, Lcom/horcrux/svg/f;->p:Lcom/horcrux/svg/f;

    sget-object v4, Lcom/horcrux/svg/f;->q:Lcom/horcrux/svg/f;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/horcrux/svg/f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/f;
    .locals 1

    const-class v0, Lcom/horcrux/svg/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/f;

    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/f;
    .locals 1

    sget-object v0, Lcom/horcrux/svg/f;->r:[Lcom/horcrux/svg/f;

    invoke-virtual {v0}, [Lcom/horcrux/svg/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/horcrux/svg/f;

    return-object v0
.end method

.class final enum Lcom/horcrux/svg/H;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/horcrux/svg/H;

.field public static final enum n:Lcom/horcrux/svg/H;

.field public static final enum o:Lcom/horcrux/svg/H;

.field private static final synthetic p:[Lcom/horcrux/svg/H;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/horcrux/svg/H;

    const-string v1, "kStartMarker"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/H;->m:Lcom/horcrux/svg/H;

    new-instance v0, Lcom/horcrux/svg/H;

    const-string v1, "kMidMarker"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/H;->n:Lcom/horcrux/svg/H;

    new-instance v0, Lcom/horcrux/svg/H;

    const-string v1, "kEndMarker"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/horcrux/svg/H;->o:Lcom/horcrux/svg/H;

    invoke-static {}, Lcom/horcrux/svg/H;->e()[Lcom/horcrux/svg/H;

    move-result-object v0

    sput-object v0, Lcom/horcrux/svg/H;->p:[Lcom/horcrux/svg/H;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/horcrux/svg/H;
    .locals 3

    .line 1
    sget-object v0, Lcom/horcrux/svg/H;->m:Lcom/horcrux/svg/H;

    sget-object v1, Lcom/horcrux/svg/H;->n:Lcom/horcrux/svg/H;

    sget-object v2, Lcom/horcrux/svg/H;->o:Lcom/horcrux/svg/H;

    filled-new-array {v0, v1, v2}, [Lcom/horcrux/svg/H;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/H;
    .locals 1

    const-class v0, Lcom/horcrux/svg/H;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/H;

    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/H;
    .locals 1

    sget-object v0, Lcom/horcrux/svg/H;->p:[Lcom/horcrux/svg/H;

    invoke-virtual {v0}, [Lcom/horcrux/svg/H;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/horcrux/svg/H;

    return-object v0
.end method

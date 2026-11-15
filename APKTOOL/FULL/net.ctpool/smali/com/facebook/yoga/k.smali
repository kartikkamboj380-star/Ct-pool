.class public final enum Lcom/facebook/yoga/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/k;

.field public static final enum o:Lcom/facebook/yoga/k;

.field public static final enum p:Lcom/facebook/yoga/k;

.field public static final enum q:Lcom/facebook/yoga/k;

.field public static final enum r:Lcom/facebook/yoga/k;

.field public static final enum s:Lcom/facebook/yoga/k;

.field private static final synthetic t:[Lcom/facebook/yoga/k;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/yoga/k;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->n:Lcom/facebook/yoga/k;

    new-instance v0, Lcom/facebook/yoga/k;

    const-string v1, "STRETCH_FLEX_BASIS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->o:Lcom/facebook/yoga/k;

    new-instance v0, Lcom/facebook/yoga/k;

    const-string v1, "ABSOLUTE_POSITIONING_INCORRECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->p:Lcom/facebook/yoga/k;

    new-instance v0, Lcom/facebook/yoga/k;

    const-string v1, "ABSOLUTE_PERCENT_AGAINST_INNER_SIZE"

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->q:Lcom/facebook/yoga/k;

    new-instance v0, Lcom/facebook/yoga/k;

    const-string v1, "ALL"

    const v2, 0x7fffffff

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->r:Lcom/facebook/yoga/k;

    new-instance v0, Lcom/facebook/yoga/k;

    const/4 v1, 0x5

    const v2, 0x7ffffffe

    const-string v3, "CLASSIC"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/yoga/k;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/k;->s:Lcom/facebook/yoga/k;

    invoke-static {}, Lcom/facebook/yoga/k;->e()[Lcom/facebook/yoga/k;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/k;->t:[Lcom/facebook/yoga/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/k;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/k;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/yoga/k;->n:Lcom/facebook/yoga/k;

    sget-object v1, Lcom/facebook/yoga/k;->o:Lcom/facebook/yoga/k;

    sget-object v2, Lcom/facebook/yoga/k;->p:Lcom/facebook/yoga/k;

    sget-object v3, Lcom/facebook/yoga/k;->q:Lcom/facebook/yoga/k;

    sget-object v4, Lcom/facebook/yoga/k;->r:Lcom/facebook/yoga/k;

    sget-object v5, Lcom/facebook/yoga/k;->s:Lcom/facebook/yoga/k;

    filled-new-array/range {v0 .. v5}, [Lcom/facebook/yoga/k;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/k;
    .locals 1

    const-class v0, Lcom/facebook/yoga/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/k;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/k;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/k;->t:[Lcom/facebook/yoga/k;

    invoke-virtual {v0}, [Lcom/facebook/yoga/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/k;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/k;->m:I

    return v0
.end method

.class public final enum Lcom/facebook/yoga/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/n;

.field public static final enum o:Lcom/facebook/yoga/n;

.field public static final enum p:Lcom/facebook/yoga/n;

.field public static final enum q:Lcom/facebook/yoga/n;

.field public static final enum r:Lcom/facebook/yoga/n;

.field public static final enum s:Lcom/facebook/yoga/n;

.field private static final synthetic t:[Lcom/facebook/yoga/n;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "FLEX_START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->n:Lcom/facebook/yoga/n;

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "CENTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->o:Lcom/facebook/yoga/n;

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "FLEX_END"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->p:Lcom/facebook/yoga/n;

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "SPACE_BETWEEN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->q:Lcom/facebook/yoga/n;

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "SPACE_AROUND"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->r:Lcom/facebook/yoga/n;

    new-instance v0, Lcom/facebook/yoga/n;

    const-string v1, "SPACE_EVENLY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/n;->s:Lcom/facebook/yoga/n;

    invoke-static {}, Lcom/facebook/yoga/n;->e()[Lcom/facebook/yoga/n;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/n;->t:[Lcom/facebook/yoga/n;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/n;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/n;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/yoga/n;->n:Lcom/facebook/yoga/n;

    sget-object v1, Lcom/facebook/yoga/n;->o:Lcom/facebook/yoga/n;

    sget-object v2, Lcom/facebook/yoga/n;->p:Lcom/facebook/yoga/n;

    sget-object v3, Lcom/facebook/yoga/n;->q:Lcom/facebook/yoga/n;

    sget-object v4, Lcom/facebook/yoga/n;->r:Lcom/facebook/yoga/n;

    sget-object v5, Lcom/facebook/yoga/n;->s:Lcom/facebook/yoga/n;

    filled-new-array/range {v0 .. v5}, [Lcom/facebook/yoga/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/n;
    .locals 1

    const-class v0, Lcom/facebook/yoga/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/n;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/n;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/n;->t:[Lcom/facebook/yoga/n;

    invoke-virtual {v0}, [Lcom/facebook/yoga/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/n;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/n;->m:I

    return v0
.end method

.class public final enum Lcom/facebook/yoga/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/i;

.field public static final enum o:Lcom/facebook/yoga/i;

.field private static final synthetic p:[Lcom/facebook/yoga/i;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/i;

    const-string v1, "FLEX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/i;->n:Lcom/facebook/yoga/i;

    new-instance v0, Lcom/facebook/yoga/i;

    const-string v1, "NONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/i;->o:Lcom/facebook/yoga/i;

    invoke-static {}, Lcom/facebook/yoga/i;->e()[Lcom/facebook/yoga/i;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/i;->p:[Lcom/facebook/yoga/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/i;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/i;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/yoga/i;->n:Lcom/facebook/yoga/i;

    sget-object v1, Lcom/facebook/yoga/i;->o:Lcom/facebook/yoga/i;

    filled-new-array {v0, v1}, [Lcom/facebook/yoga/i;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/i;
    .locals 1

    const-class v0, Lcom/facebook/yoga/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/i;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/i;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/i;->p:[Lcom/facebook/yoga/i;

    invoke-virtual {v0}, [Lcom/facebook/yoga/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/i;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/i;->m:I

    return v0
.end method

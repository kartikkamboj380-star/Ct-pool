.class public final enum Lcom/facebook/yoga/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/l;

.field public static final enum o:Lcom/facebook/yoga/l;

.field public static final enum p:Lcom/facebook/yoga/l;

.field public static final enum q:Lcom/facebook/yoga/l;

.field private static final synthetic r:[Lcom/facebook/yoga/l;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/l;

    const-string v1, "COLUMN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/l;->n:Lcom/facebook/yoga/l;

    new-instance v0, Lcom/facebook/yoga/l;

    const-string v1, "COLUMN_REVERSE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/l;->o:Lcom/facebook/yoga/l;

    new-instance v0, Lcom/facebook/yoga/l;

    const-string v1, "ROW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/l;->p:Lcom/facebook/yoga/l;

    new-instance v0, Lcom/facebook/yoga/l;

    const-string v1, "ROW_REVERSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/l;->q:Lcom/facebook/yoga/l;

    invoke-static {}, Lcom/facebook/yoga/l;->e()[Lcom/facebook/yoga/l;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/l;->r:[Lcom/facebook/yoga/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/l;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/l;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/yoga/l;->n:Lcom/facebook/yoga/l;

    sget-object v1, Lcom/facebook/yoga/l;->o:Lcom/facebook/yoga/l;

    sget-object v2, Lcom/facebook/yoga/l;->p:Lcom/facebook/yoga/l;

    sget-object v3, Lcom/facebook/yoga/l;->q:Lcom/facebook/yoga/l;

    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/yoga/l;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/l;
    .locals 1

    const-class v0, Lcom/facebook/yoga/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/l;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/l;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/l;->r:[Lcom/facebook/yoga/l;

    invoke-virtual {v0}, [Lcom/facebook/yoga/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/l;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/l;->m:I

    return v0
.end method

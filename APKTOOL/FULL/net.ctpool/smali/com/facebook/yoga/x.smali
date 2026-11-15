.class public final enum Lcom/facebook/yoga/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/x;

.field public static final enum o:Lcom/facebook/yoga/x;

.field public static final enum p:Lcom/facebook/yoga/x;

.field private static final synthetic q:[Lcom/facebook/yoga/x;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/x;

    const-string v1, "NO_WRAP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/x;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/x;->n:Lcom/facebook/yoga/x;

    new-instance v0, Lcom/facebook/yoga/x;

    const-string v1, "WRAP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/x;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/x;->o:Lcom/facebook/yoga/x;

    new-instance v0, Lcom/facebook/yoga/x;

    const-string v1, "WRAP_REVERSE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/x;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/x;->p:Lcom/facebook/yoga/x;

    invoke-static {}, Lcom/facebook/yoga/x;->e()[Lcom/facebook/yoga/x;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/x;->q:[Lcom/facebook/yoga/x;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/x;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/x;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/yoga/x;->n:Lcom/facebook/yoga/x;

    sget-object v1, Lcom/facebook/yoga/x;->o:Lcom/facebook/yoga/x;

    sget-object v2, Lcom/facebook/yoga/x;->p:Lcom/facebook/yoga/x;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/yoga/x;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/x;
    .locals 1

    const-class v0, Lcom/facebook/yoga/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/x;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/x;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/x;->q:[Lcom/facebook/yoga/x;

    invoke-virtual {v0}, [Lcom/facebook/yoga/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/x;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/x;->m:I

    return v0
.end method

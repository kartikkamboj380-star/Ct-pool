.class public final enum Lcom/facebook/yoga/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/u;

.field public static final enum o:Lcom/facebook/yoga/u;

.field public static final enum p:Lcom/facebook/yoga/u;

.field private static final synthetic q:[Lcom/facebook/yoga/u;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/u;

    const-string v1, "VISIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/u;->n:Lcom/facebook/yoga/u;

    new-instance v0, Lcom/facebook/yoga/u;

    const-string v1, "HIDDEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/u;->o:Lcom/facebook/yoga/u;

    new-instance v0, Lcom/facebook/yoga/u;

    const-string v1, "SCROLL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/u;->p:Lcom/facebook/yoga/u;

    invoke-static {}, Lcom/facebook/yoga/u;->e()[Lcom/facebook/yoga/u;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/u;->q:[Lcom/facebook/yoga/u;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/u;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/u;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/yoga/u;->n:Lcom/facebook/yoga/u;

    sget-object v1, Lcom/facebook/yoga/u;->o:Lcom/facebook/yoga/u;

    sget-object v2, Lcom/facebook/yoga/u;->p:Lcom/facebook/yoga/u;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/yoga/u;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/u;
    .locals 1

    const-class v0, Lcom/facebook/yoga/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/u;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/u;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/u;->q:[Lcom/facebook/yoga/u;

    invoke-virtual {v0}, [Lcom/facebook/yoga/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/u;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/u;->m:I

    return v0
.end method

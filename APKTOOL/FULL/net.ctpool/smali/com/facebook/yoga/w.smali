.class public final enum Lcom/facebook/yoga/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/w;

.field public static final enum o:Lcom/facebook/yoga/w;

.field public static final enum p:Lcom/facebook/yoga/w;

.field public static final enum q:Lcom/facebook/yoga/w;

.field private static final synthetic r:[Lcom/facebook/yoga/w;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/w;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/w;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/w;->n:Lcom/facebook/yoga/w;

    new-instance v0, Lcom/facebook/yoga/w;

    const-string v1, "POINT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/w;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/w;->o:Lcom/facebook/yoga/w;

    new-instance v0, Lcom/facebook/yoga/w;

    const-string v1, "PERCENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/w;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/w;->p:Lcom/facebook/yoga/w;

    new-instance v0, Lcom/facebook/yoga/w;

    const-string v1, "AUTO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/w;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/w;->q:Lcom/facebook/yoga/w;

    invoke-static {}, Lcom/facebook/yoga/w;->e()[Lcom/facebook/yoga/w;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/w;->r:[Lcom/facebook/yoga/w;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/w;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/w;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/yoga/w;->n:Lcom/facebook/yoga/w;

    sget-object v1, Lcom/facebook/yoga/w;->o:Lcom/facebook/yoga/w;

    sget-object v2, Lcom/facebook/yoga/w;->p:Lcom/facebook/yoga/w;

    sget-object v3, Lcom/facebook/yoga/w;->q:Lcom/facebook/yoga/w;

    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/yoga/w;

    move-result-object v0

    return-object v0
.end method

.method public static h(I)Lcom/facebook/yoga/w;
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/facebook/yoga/w;->q:Lcom/facebook/yoga/w;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/facebook/yoga/w;->p:Lcom/facebook/yoga/w;

    return-object p0

    :cond_2
    sget-object p0, Lcom/facebook/yoga/w;->o:Lcom/facebook/yoga/w;

    return-object p0

    :cond_3
    sget-object p0, Lcom/facebook/yoga/w;->n:Lcom/facebook/yoga/w;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/w;
    .locals 1

    const-class v0, Lcom/facebook/yoga/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/w;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/w;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/w;->r:[Lcom/facebook/yoga/w;

    invoke-virtual {v0}, [Lcom/facebook/yoga/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/w;

    return-object v0
.end method


# virtual methods
.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/yoga/w;->m:I

    return v0
.end method

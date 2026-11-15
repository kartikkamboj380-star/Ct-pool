.class public final enum Lcom/facebook/yoga/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/facebook/yoga/p;

.field public static final enum o:Lcom/facebook/yoga/p;

.field public static final enum p:Lcom/facebook/yoga/p;

.field private static final synthetic q:[Lcom/facebook/yoga/p;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/yoga/p;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    new-instance v0, Lcom/facebook/yoga/p;

    const-string v1, "EXACTLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    new-instance v0, Lcom/facebook/yoga/p;

    const-string v1, "AT_MOST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/yoga/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    invoke-static {}, Lcom/facebook/yoga/p;->e()[Lcom/facebook/yoga/p;

    move-result-object v0

    sput-object v0, Lcom/facebook/yoga/p;->q:[Lcom/facebook/yoga/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/yoga/p;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/yoga/p;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    sget-object v1, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    sget-object v2, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/yoga/p;

    move-result-object v0

    return-object v0
.end method

.method public static h(I)Lcom/facebook/yoga/p;
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/facebook/yoga/p;->p:Lcom/facebook/yoga/p;

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
    sget-object p0, Lcom/facebook/yoga/p;->o:Lcom/facebook/yoga/p;

    return-object p0

    :cond_2
    sget-object p0, Lcom/facebook/yoga/p;->n:Lcom/facebook/yoga/p;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/yoga/p;
    .locals 1

    const-class v0, Lcom/facebook/yoga/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/yoga/p;

    return-object p0
.end method

.method public static values()[Lcom/facebook/yoga/p;
    .locals 1

    sget-object v0, Lcom/facebook/yoga/p;->q:[Lcom/facebook/yoga/p;

    invoke-virtual {v0}, [Lcom/facebook/yoga/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/yoga/p;

    return-object v0
.end method

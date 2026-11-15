.class final enum Lcom/horcrux/svg/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/horcrux/svg/m;

.field public static final enum o:Lcom/horcrux/svg/m;

.field public static final enum p:Lcom/horcrux/svg/m;

.field public static final enum q:Lcom/horcrux/svg/m;

.field private static final r:Ljava/util/Map;

.field private static final synthetic s:[Lcom/horcrux/svg/m;


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/horcrux/svg/m;

    const-string v1, "unknown"

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/horcrux/svg/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/horcrux/svg/m;->n:Lcom/horcrux/svg/m;

    new-instance v0, Lcom/horcrux/svg/m;

    const/4 v1, 0x1

    const-string v2, "duplicate"

    const-string v4, "DUPLICATE"

    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/horcrux/svg/m;->o:Lcom/horcrux/svg/m;

    new-instance v0, Lcom/horcrux/svg/m;

    const/4 v1, 0x2

    const-string v2, "wrap"

    const-string v4, "WRAP"

    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/horcrux/svg/m;->p:Lcom/horcrux/svg/m;

    new-instance v0, Lcom/horcrux/svg/m;

    const/4 v1, 0x3

    const-string v2, "none"

    const-string v4, "NONE"

    invoke-direct {v0, v4, v1, v2}, Lcom/horcrux/svg/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/horcrux/svg/m;->q:Lcom/horcrux/svg/m;

    invoke-static {}, Lcom/horcrux/svg/m;->e()[Lcom/horcrux/svg/m;

    move-result-object v0

    sput-object v0, Lcom/horcrux/svg/m;->s:[Lcom/horcrux/svg/m;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/horcrux/svg/m;->r:Ljava/util/Map;

    invoke-static {}, Lcom/horcrux/svg/m;->values()[Lcom/horcrux/svg/m;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    sget-object v4, Lcom/horcrux/svg/m;->r:Ljava/util/Map;

    iget-object v5, v2, Lcom/horcrux/svg/m;->m:Ljava/lang/String;

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/horcrux/svg/m;->m:Ljava/lang/String;

    return-void
.end method

.method private static synthetic e()[Lcom/horcrux/svg/m;
    .locals 4

    .line 1
    sget-object v0, Lcom/horcrux/svg/m;->n:Lcom/horcrux/svg/m;

    sget-object v1, Lcom/horcrux/svg/m;->o:Lcom/horcrux/svg/m;

    sget-object v2, Lcom/horcrux/svg/m;->p:Lcom/horcrux/svg/m;

    sget-object v3, Lcom/horcrux/svg/m;->q:Lcom/horcrux/svg/m;

    filled-new-array {v0, v1, v2, v3}, [Lcom/horcrux/svg/m;

    move-result-object v0

    return-object v0
.end method

.method static h(Ljava/lang/String;)Lcom/horcrux/svg/m;
    .locals 3

    .line 1
    sget-object v0, Lcom/horcrux/svg/m;->r:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/m;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown \'edgeMode\' Value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/horcrux/svg/m;
    .locals 1

    const-class v0, Lcom/horcrux/svg/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/m;

    return-object p0
.end method

.method public static values()[Lcom/horcrux/svg/m;
    .locals 1

    sget-object v0, Lcom/horcrux/svg/m;->s:[Lcom/horcrux/svg/m;

    invoke-virtual {v0}, [Lcom/horcrux/svg/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/horcrux/svg/m;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/m;->m:Ljava/lang/String;

    return-object v0
.end method

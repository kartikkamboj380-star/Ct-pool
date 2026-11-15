.class public final enum Lcom/learnium/RNDeviceInfo/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum n:Lcom/learnium/RNDeviceInfo/a;

.field public static final enum o:Lcom/learnium/RNDeviceInfo/a;

.field public static final enum p:Lcom/learnium/RNDeviceInfo/a;

.field public static final enum q:Lcom/learnium/RNDeviceInfo/a;

.field private static final synthetic r:[Lcom/learnium/RNDeviceInfo/a;


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/learnium/RNDeviceInfo/a;

    const/4 v1, 0x0

    const-string v2, "Handset"

    const-string v3, "HANDSET"

    invoke-direct {v0, v3, v1, v2}, Lcom/learnium/RNDeviceInfo/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/learnium/RNDeviceInfo/a;->n:Lcom/learnium/RNDeviceInfo/a;

    new-instance v0, Lcom/learnium/RNDeviceInfo/a;

    const/4 v1, 0x1

    const-string v2, "Tablet"

    const-string v3, "TABLET"

    invoke-direct {v0, v3, v1, v2}, Lcom/learnium/RNDeviceInfo/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/learnium/RNDeviceInfo/a;->o:Lcom/learnium/RNDeviceInfo/a;

    new-instance v0, Lcom/learnium/RNDeviceInfo/a;

    const/4 v1, 0x2

    const-string v2, "Tv"

    const-string v3, "TV"

    invoke-direct {v0, v3, v1, v2}, Lcom/learnium/RNDeviceInfo/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/learnium/RNDeviceInfo/a;->p:Lcom/learnium/RNDeviceInfo/a;

    new-instance v0, Lcom/learnium/RNDeviceInfo/a;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/learnium/RNDeviceInfo/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/learnium/RNDeviceInfo/a;->q:Lcom/learnium/RNDeviceInfo/a;

    invoke-static {}, Lcom/learnium/RNDeviceInfo/a;->e()[Lcom/learnium/RNDeviceInfo/a;

    move-result-object v0

    sput-object v0, Lcom/learnium/RNDeviceInfo/a;->r:[Lcom/learnium/RNDeviceInfo/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/learnium/RNDeviceInfo/a;->m:Ljava/lang/String;

    return-void
.end method

.method private static synthetic e()[Lcom/learnium/RNDeviceInfo/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/learnium/RNDeviceInfo/a;->n:Lcom/learnium/RNDeviceInfo/a;

    sget-object v1, Lcom/learnium/RNDeviceInfo/a;->o:Lcom/learnium/RNDeviceInfo/a;

    sget-object v2, Lcom/learnium/RNDeviceInfo/a;->p:Lcom/learnium/RNDeviceInfo/a;

    sget-object v3, Lcom/learnium/RNDeviceInfo/a;->q:Lcom/learnium/RNDeviceInfo/a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/learnium/RNDeviceInfo/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/learnium/RNDeviceInfo/a;
    .locals 1

    const-class v0, Lcom/learnium/RNDeviceInfo/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/learnium/RNDeviceInfo/a;

    return-object p0
.end method

.method public static values()[Lcom/learnium/RNDeviceInfo/a;
    .locals 1

    sget-object v0, Lcom/learnium/RNDeviceInfo/a;->r:[Lcom/learnium/RNDeviceInfo/a;

    invoke-virtual {v0}, [Lcom/learnium/RNDeviceInfo/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/learnium/RNDeviceInfo/a;

    return-object v0
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/learnium/RNDeviceInfo/a;->m:Ljava/lang/String;

    return-object v0
.end method

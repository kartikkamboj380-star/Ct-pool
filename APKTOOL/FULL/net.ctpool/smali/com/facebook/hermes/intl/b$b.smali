.class public final enum Lcom/facebook/hermes/intl/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum m:Lcom/facebook/hermes/intl/b$b;

.field public static final enum n:Lcom/facebook/hermes/intl/b$b;

.field public static final enum o:Lcom/facebook/hermes/intl/b$b;

.field public static final enum p:Lcom/facebook/hermes/intl/b$b;

.field public static final enum q:Lcom/facebook/hermes/intl/b$b;

.field private static final synthetic r:[Lcom/facebook/hermes/intl/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/hermes/intl/b$b;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->m:Lcom/facebook/hermes/intl/b$b;

    new-instance v0, Lcom/facebook/hermes/intl/b$b;

    const-string v1, "LONG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->n:Lcom/facebook/hermes/intl/b$b;

    new-instance v0, Lcom/facebook/hermes/intl/b$b;

    const-string v1, "MEDIUM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->o:Lcom/facebook/hermes/intl/b$b;

    new-instance v0, Lcom/facebook/hermes/intl/b$b;

    const-string v1, "SHORT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->p:Lcom/facebook/hermes/intl/b$b;

    new-instance v0, Lcom/facebook/hermes/intl/b$b;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->q:Lcom/facebook/hermes/intl/b$b;

    invoke-static {}, Lcom/facebook/hermes/intl/b$b;->e()[Lcom/facebook/hermes/intl/b$b;

    move-result-object v0

    sput-object v0, Lcom/facebook/hermes/intl/b$b;->r:[Lcom/facebook/hermes/intl/b$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/hermes/intl/b$b;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/b$b;->m:Lcom/facebook/hermes/intl/b$b;

    sget-object v1, Lcom/facebook/hermes/intl/b$b;->n:Lcom/facebook/hermes/intl/b$b;

    sget-object v2, Lcom/facebook/hermes/intl/b$b;->o:Lcom/facebook/hermes/intl/b$b;

    sget-object v3, Lcom/facebook/hermes/intl/b$b;->p:Lcom/facebook/hermes/intl/b$b;

    sget-object v4, Lcom/facebook/hermes/intl/b$b;->q:Lcom/facebook/hermes/intl/b$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/facebook/hermes/intl/b$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/b$b;
    .locals 1

    const-class v0, Lcom/facebook/hermes/intl/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/hermes/intl/b$b;

    return-object p0
.end method

.method public static values()[Lcom/facebook/hermes/intl/b$b;
    .locals 1

    sget-object v0, Lcom/facebook/hermes/intl/b$b;->r:[Lcom/facebook/hermes/intl/b$b;

    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/hermes/intl/b$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/facebook/hermes/intl/b$a;->l:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "short"

    return-object v0

    :cond_2
    const-string v0, "medium"

    return-object v0

    :cond_3
    const-string v0, "long"

    return-object v0

    :cond_4
    const-string v0, "full"

    return-object v0
.end method

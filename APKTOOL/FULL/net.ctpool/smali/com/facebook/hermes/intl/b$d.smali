.class public final enum Lcom/facebook/hermes/intl/b$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum m:Lcom/facebook/hermes/intl/b$d;

.field public static final enum n:Lcom/facebook/hermes/intl/b$d;

.field public static final enum o:Lcom/facebook/hermes/intl/b$d;

.field public static final enum p:Lcom/facebook/hermes/intl/b$d;

.field private static final synthetic q:[Lcom/facebook/hermes/intl/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/hermes/intl/b$d;

    const-string v1, "LONG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$d;->m:Lcom/facebook/hermes/intl/b$d;

    new-instance v0, Lcom/facebook/hermes/intl/b$d;

    const-string v1, "SHORT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$d;->n:Lcom/facebook/hermes/intl/b$d;

    new-instance v0, Lcom/facebook/hermes/intl/b$d;

    const-string v1, "NARROW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$d;->o:Lcom/facebook/hermes/intl/b$d;

    new-instance v0, Lcom/facebook/hermes/intl/b$d;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/hermes/intl/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/hermes/intl/b$d;->p:Lcom/facebook/hermes/intl/b$d;

    invoke-static {}, Lcom/facebook/hermes/intl/b$d;->e()[Lcom/facebook/hermes/intl/b$d;

    move-result-object v0

    sput-object v0, Lcom/facebook/hermes/intl/b$d;->q:[Lcom/facebook/hermes/intl/b$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/hermes/intl/b$d;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/b$d;->m:Lcom/facebook/hermes/intl/b$d;

    sget-object v1, Lcom/facebook/hermes/intl/b$d;->n:Lcom/facebook/hermes/intl/b$d;

    sget-object v2, Lcom/facebook/hermes/intl/b$d;->o:Lcom/facebook/hermes/intl/b$d;

    sget-object v3, Lcom/facebook/hermes/intl/b$d;->p:Lcom/facebook/hermes/intl/b$d;

    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/hermes/intl/b$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/hermes/intl/b$d;
    .locals 1

    const-class v0, Lcom/facebook/hermes/intl/b$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/hermes/intl/b$d;

    return-object p0
.end method

.method public static values()[Lcom/facebook/hermes/intl/b$d;
    .locals 1

    sget-object v0, Lcom/facebook/hermes/intl/b$d;->q:[Lcom/facebook/hermes/intl/b$d;

    invoke-virtual {v0}, [Lcom/facebook/hermes/intl/b$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/hermes/intl/b$d;

    return-object v0
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/b$a;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "G5"

    return-object v0

    :cond_2
    const-string v0, "GGG"

    return-object v0

    :cond_3
    const-string v0, "GGGG"

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/facebook/hermes/intl/b$a;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "narrow"

    return-object v0

    :cond_2
    const-string v0, "short"

    return-object v0

    :cond_3
    const-string v0, "long"

    return-object v0
.end method

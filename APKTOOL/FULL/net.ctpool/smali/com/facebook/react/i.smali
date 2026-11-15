.class public final enum Lcom/facebook/react/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/facebook/react/i;

.field public static final enum n:Lcom/facebook/react/i;

.field private static final synthetic o:[Lcom/facebook/react/i;

.field private static final synthetic p:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/i;

    const-string v1, "JSC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/i;->m:Lcom/facebook/react/i;

    new-instance v0, Lcom/facebook/react/i;

    const-string v1, "HERMES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/i;->n:Lcom/facebook/react/i;

    invoke-static {}, Lcom/facebook/react/i;->e()[Lcom/facebook/react/i;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/i;->o:[Lcom/facebook/react/i;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/i;->p:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/facebook/react/i;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/i;->m:Lcom/facebook/react/i;

    sget-object v1, Lcom/facebook/react/i;->n:Lcom/facebook/react/i;

    filled-new-array {v0, v1}, [Lcom/facebook/react/i;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/i;
    .locals 1

    const-class v0, Lcom/facebook/react/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/i;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/i;
    .locals 1

    sget-object v0, Lcom/facebook/react/i;->o:[Lcom/facebook/react/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/i;

    return-object v0
.end method

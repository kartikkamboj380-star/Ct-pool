.class public final enum Lcom/swmansion/rnscreens/y$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum m:Lcom/swmansion/rnscreens/y$a;

.field public static final enum n:Lcom/swmansion/rnscreens/y$a;

.field public static final enum o:Lcom/swmansion/rnscreens/y$a;

.field public static final enum p:Lcom/swmansion/rnscreens/y$a;

.field public static final enum q:Lcom/swmansion/rnscreens/y$a;

.field private static final synthetic r:[Lcom/swmansion/rnscreens/y$a;

.field private static final synthetic s:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/swmansion/rnscreens/y$a;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->m:Lcom/swmansion/rnscreens/y$a;

    new-instance v0, Lcom/swmansion/rnscreens/y$a;

    const-string v1, "CENTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->n:Lcom/swmansion/rnscreens/y$a;

    new-instance v0, Lcom/swmansion/rnscreens/y$a;

    const-string v1, "RIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->o:Lcom/swmansion/rnscreens/y$a;

    new-instance v0, Lcom/swmansion/rnscreens/y$a;

    const-string v1, "BACK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->p:Lcom/swmansion/rnscreens/y$a;

    new-instance v0, Lcom/swmansion/rnscreens/y$a;

    const-string v1, "SEARCH_BAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->q:Lcom/swmansion/rnscreens/y$a;

    invoke-static {}, Lcom/swmansion/rnscreens/y$a;->e()[Lcom/swmansion/rnscreens/y$a;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->r:[Lcom/swmansion/rnscreens/y$a;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/y$a;->s:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/swmansion/rnscreens/y$a;
    .locals 5

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/y$a;->m:Lcom/swmansion/rnscreens/y$a;

    sget-object v1, Lcom/swmansion/rnscreens/y$a;->n:Lcom/swmansion/rnscreens/y$a;

    sget-object v2, Lcom/swmansion/rnscreens/y$a;->o:Lcom/swmansion/rnscreens/y$a;

    sget-object v3, Lcom/swmansion/rnscreens/y$a;->p:Lcom/swmansion/rnscreens/y$a;

    sget-object v4, Lcom/swmansion/rnscreens/y$a;->q:Lcom/swmansion/rnscreens/y$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/swmansion/rnscreens/y$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/rnscreens/y$a;
    .locals 1

    const-class v0, Lcom/swmansion/rnscreens/y$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/rnscreens/y$a;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/rnscreens/y$a;
    .locals 1

    sget-object v0, Lcom/swmansion/rnscreens/y$a;->r:[Lcom/swmansion/rnscreens/y$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/rnscreens/y$a;

    return-object v0
.end method

.class public final enum Lcom/swmansion/rnscreens/l$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum m:Lcom/swmansion/rnscreens/l$a;

.field public static final enum n:Lcom/swmansion/rnscreens/l$a;

.field public static final enum o:Lcom/swmansion/rnscreens/l$a;

.field private static final synthetic p:[Lcom/swmansion/rnscreens/l$a;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/swmansion/rnscreens/l$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$a;->m:Lcom/swmansion/rnscreens/l$a;

    new-instance v0, Lcom/swmansion/rnscreens/l$a;

    const-string v1, "TRANSITIONING_OR_BELOW_TOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$a;->n:Lcom/swmansion/rnscreens/l$a;

    new-instance v0, Lcom/swmansion/rnscreens/l$a;

    const-string v1, "ON_TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$a;->o:Lcom/swmansion/rnscreens/l$a;

    invoke-static {}, Lcom/swmansion/rnscreens/l$a;->e()[Lcom/swmansion/rnscreens/l$a;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/l$a;->p:[Lcom/swmansion/rnscreens/l$a;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/l$a;->q:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/swmansion/rnscreens/l$a;
    .locals 3

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/l$a;->m:Lcom/swmansion/rnscreens/l$a;

    sget-object v1, Lcom/swmansion/rnscreens/l$a;->n:Lcom/swmansion/rnscreens/l$a;

    sget-object v2, Lcom/swmansion/rnscreens/l$a;->o:Lcom/swmansion/rnscreens/l$a;

    filled-new-array {v0, v1, v2}, [Lcom/swmansion/rnscreens/l$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/rnscreens/l$a;
    .locals 1

    const-class v0, Lcom/swmansion/rnscreens/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/rnscreens/l$a;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/rnscreens/l$a;
    .locals 1

    sget-object v0, Lcom/swmansion/rnscreens/l$a;->p:[Lcom/swmansion/rnscreens/l$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/rnscreens/l$a;

    return-object v0
.end method

.class public final enum Lcom/swmansion/rnscreens/l$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum m:Lcom/swmansion/rnscreens/l$d;

.field public static final enum n:Lcom/swmansion/rnscreens/l$d;

.field public static final enum o:Lcom/swmansion/rnscreens/l$d;

.field private static final synthetic p:[Lcom/swmansion/rnscreens/l$d;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/swmansion/rnscreens/l$d;

    const-string v1, "PUSH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$d;->m:Lcom/swmansion/rnscreens/l$d;

    new-instance v0, Lcom/swmansion/rnscreens/l$d;

    const-string v1, "MODAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$d;->n:Lcom/swmansion/rnscreens/l$d;

    new-instance v0, Lcom/swmansion/rnscreens/l$d;

    const-string v1, "TRANSPARENT_MODAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/l$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/l$d;->o:Lcom/swmansion/rnscreens/l$d;

    invoke-static {}, Lcom/swmansion/rnscreens/l$d;->e()[Lcom/swmansion/rnscreens/l$d;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/l$d;->p:[Lcom/swmansion/rnscreens/l$d;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/l$d;->q:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/swmansion/rnscreens/l$d;
    .locals 3

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/l$d;->m:Lcom/swmansion/rnscreens/l$d;

    sget-object v1, Lcom/swmansion/rnscreens/l$d;->n:Lcom/swmansion/rnscreens/l$d;

    sget-object v2, Lcom/swmansion/rnscreens/l$d;->o:Lcom/swmansion/rnscreens/l$d;

    filled-new-array {v0, v1, v2}, [Lcom/swmansion/rnscreens/l$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/rnscreens/l$d;
    .locals 1

    const-class v0, Lcom/swmansion/rnscreens/l$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/rnscreens/l$d;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/rnscreens/l$d;
    .locals 1

    sget-object v0, Lcom/swmansion/rnscreens/l$d;->p:[Lcom/swmansion/rnscreens/l$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/rnscreens/l$d;

    return-object v0
.end method

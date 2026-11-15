.class public abstract enum Lcom/swmansion/rnscreens/K$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/K$b$a;,
        Lcom/swmansion/rnscreens/K$b$b;,
        Lcom/swmansion/rnscreens/K$b$c;,
        Lcom/swmansion/rnscreens/K$b$d;
    }
.end annotation


# static fields
.field public static final enum m:Lcom/swmansion/rnscreens/K$b;

.field public static final enum n:Lcom/swmansion/rnscreens/K$b;

.field public static final enum o:Lcom/swmansion/rnscreens/K$b;

.field public static final enum p:Lcom/swmansion/rnscreens/K$b;

.field private static final synthetic q:[Lcom/swmansion/rnscreens/K$b;

.field private static final synthetic r:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/swmansion/rnscreens/K$b$d;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/K$b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->m:Lcom/swmansion/rnscreens/K$b;

    new-instance v0, Lcom/swmansion/rnscreens/K$b$c;

    const-string v1, "PHONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/K$b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->n:Lcom/swmansion/rnscreens/K$b;

    new-instance v0, Lcom/swmansion/rnscreens/K$b$b;

    const-string v1, "NUMBER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/K$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->o:Lcom/swmansion/rnscreens/K$b;

    new-instance v0, Lcom/swmansion/rnscreens/K$b$a;

    const-string v1, "EMAIL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/K$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->p:Lcom/swmansion/rnscreens/K$b;

    invoke-static {}, Lcom/swmansion/rnscreens/K$b;->e()[Lcom/swmansion/rnscreens/K$b;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->q:[Lcom/swmansion/rnscreens/K$b;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/swmansion/rnscreens/K$b;->r:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/K$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/swmansion/rnscreens/K$b;
    .locals 4

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/K$b;->m:Lcom/swmansion/rnscreens/K$b;

    sget-object v1, Lcom/swmansion/rnscreens/K$b;->n:Lcom/swmansion/rnscreens/K$b;

    sget-object v2, Lcom/swmansion/rnscreens/K$b;->o:Lcom/swmansion/rnscreens/K$b;

    sget-object v3, Lcom/swmansion/rnscreens/K$b;->p:Lcom/swmansion/rnscreens/K$b;

    filled-new-array {v0, v1, v2, v3}, [Lcom/swmansion/rnscreens/K$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/rnscreens/K$b;
    .locals 1

    const-class v0, Lcom/swmansion/rnscreens/K$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/rnscreens/K$b;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/rnscreens/K$b;
    .locals 1

    sget-object v0, Lcom/swmansion/rnscreens/K$b;->q:[Lcom/swmansion/rnscreens/K$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/rnscreens/K$b;

    return-object v0
.end method


# virtual methods
.method public abstract h(Lcom/swmansion/rnscreens/K$a;)I
.end method

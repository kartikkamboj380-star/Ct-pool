.class public final enum Lcom/facebook/react/common/LifecycleState;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/facebook/react/common/LifecycleState;

.field public static final enum n:Lcom/facebook/react/common/LifecycleState;

.field public static final enum o:Lcom/facebook/react/common/LifecycleState;

.field private static final synthetic p:[Lcom/facebook/react/common/LifecycleState;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/common/LifecycleState;

    const-string v1, "BEFORE_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/LifecycleState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    new-instance v0, Lcom/facebook/react/common/LifecycleState;

    const-string v1, "BEFORE_RESUME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/LifecycleState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    new-instance v0, Lcom/facebook/react/common/LifecycleState;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/LifecycleState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    invoke-static {}, Lcom/facebook/react/common/LifecycleState;->e()[Lcom/facebook/react/common/LifecycleState;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/common/LifecycleState;->p:[Lcom/facebook/react/common/LifecycleState;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/common/LifecycleState;->q:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/facebook/react/common/LifecycleState;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    sget-object v2, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/react/common/LifecycleState;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/common/LifecycleState;
    .locals 1

    const-class v0, Lcom/facebook/react/common/LifecycleState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/common/LifecycleState;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/common/LifecycleState;
    .locals 1

    sget-object v0, Lcom/facebook/react/common/LifecycleState;->p:[Lcom/facebook/react/common/LifecycleState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/common/LifecycleState;

    return-object v0
.end method

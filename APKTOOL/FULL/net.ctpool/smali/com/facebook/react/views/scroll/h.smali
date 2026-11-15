.class public final enum Lcom/facebook/react/views/scroll/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/h$a;
    }
.end annotation


# static fields
.field public static final m:Lcom/facebook/react/views/scroll/h$a;

.field public static final enum n:Lcom/facebook/react/views/scroll/h;

.field public static final enum o:Lcom/facebook/react/views/scroll/h;

.field public static final enum p:Lcom/facebook/react/views/scroll/h;

.field public static final enum q:Lcom/facebook/react/views/scroll/h;

.field public static final enum r:Lcom/facebook/react/views/scroll/h;

.field private static final synthetic s:[Lcom/facebook/react/views/scroll/h;

.field private static final synthetic t:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/views/scroll/h;

    const-string v1, "BEGIN_DRAG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/scroll/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->n:Lcom/facebook/react/views/scroll/h;

    new-instance v0, Lcom/facebook/react/views/scroll/h;

    const-string v1, "END_DRAG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/scroll/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->o:Lcom/facebook/react/views/scroll/h;

    new-instance v0, Lcom/facebook/react/views/scroll/h;

    const-string v1, "SCROLL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/scroll/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    new-instance v0, Lcom/facebook/react/views/scroll/h;

    const-string v1, "MOMENTUM_BEGIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/scroll/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->q:Lcom/facebook/react/views/scroll/h;

    new-instance v0, Lcom/facebook/react/views/scroll/h;

    const-string v1, "MOMENTUM_END"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/scroll/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->r:Lcom/facebook/react/views/scroll/h;

    invoke-static {}, Lcom/facebook/react/views/scroll/h;->e()[Lcom/facebook/react/views/scroll/h;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/h;->s:[Lcom/facebook/react/views/scroll/h;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/h;->t:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/facebook/react/views/scroll/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/scroll/h;->m:Lcom/facebook/react/views/scroll/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/facebook/react/views/scroll/h;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/h;->n:Lcom/facebook/react/views/scroll/h;

    sget-object v1, Lcom/facebook/react/views/scroll/h;->o:Lcom/facebook/react/views/scroll/h;

    sget-object v2, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    sget-object v3, Lcom/facebook/react/views/scroll/h;->q:Lcom/facebook/react/views/scroll/h;

    sget-object v4, Lcom/facebook/react/views/scroll/h;->r:Lcom/facebook/react/views/scroll/h;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/facebook/react/views/scroll/h;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/h;->m:Lcom/facebook/react/views/scroll/h$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/h$a;->a(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/views/scroll/h;
    .locals 1

    const-class v0, Lcom/facebook/react/views/scroll/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/views/scroll/h;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/views/scroll/h;
    .locals 1

    sget-object v0, Lcom/facebook/react/views/scroll/h;->s:[Lcom/facebook/react/views/scroll/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/scroll/h;

    return-object v0
.end method

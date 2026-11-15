.class public final enum Lcom/facebook/react/uimanager/events/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/s$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/facebook/react/uimanager/events/s$a;

.field public static final enum o:Lcom/facebook/react/uimanager/events/s;

.field public static final enum p:Lcom/facebook/react/uimanager/events/s;

.field public static final enum q:Lcom/facebook/react/uimanager/events/s;

.field public static final enum r:Lcom/facebook/react/uimanager/events/s;

.field private static final synthetic s:[Lcom/facebook/react/uimanager/events/s;

.field private static final synthetic t:Lkotlin/enums/EnumEntries;


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/react/uimanager/events/s;

    const/4 v1, 0x0

    const-string v2, "topTouchStart"

    const-string v3, "START"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/events/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    new-instance v0, Lcom/facebook/react/uimanager/events/s;

    const/4 v1, 0x1

    const-string v2, "topTouchEnd"

    const-string v3, "END"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/events/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    new-instance v0, Lcom/facebook/react/uimanager/events/s;

    const/4 v1, 0x2

    const-string v2, "topTouchMove"

    const-string v3, "MOVE"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/events/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->q:Lcom/facebook/react/uimanager/events/s;

    new-instance v0, Lcom/facebook/react/uimanager/events/s;

    const/4 v1, 0x3

    const-string v2, "topTouchCancel"

    const-string v3, "CANCEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/events/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->r:Lcom/facebook/react/uimanager/events/s;

    invoke-static {}, Lcom/facebook/react/uimanager/events/s;->e()[Lcom/facebook/react/uimanager/events/s;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->s:[Lcom/facebook/react/uimanager/events/s;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->t:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/facebook/react/uimanager/events/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/uimanager/events/s;->n:Lcom/facebook/react/uimanager/events/s$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/facebook/react/uimanager/events/s;->m:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[Lcom/facebook/react/uimanager/events/s;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    sget-object v1, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    sget-object v2, Lcom/facebook/react/uimanager/events/s;->q:Lcom/facebook/react/uimanager/events/s;

    sget-object v3, Lcom/facebook/react/uimanager/events/s;->r:Lcom/facebook/react/uimanager/events/s;

    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/react/uimanager/events/s;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/s;->n:Lcom/facebook/react/uimanager/events/s$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/events/s$a;->a(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/events/s;
    .locals 1

    const-class v0, Lcom/facebook/react/uimanager/events/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/uimanager/events/s;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/uimanager/events/s;
    .locals 1

    sget-object v0, Lcom/facebook/react/uimanager/events/s;->s:[Lcom/facebook/react/uimanager/events/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/uimanager/events/s;

    return-object v0
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s;->m:Ljava/lang/String;

    return-object v0
.end method

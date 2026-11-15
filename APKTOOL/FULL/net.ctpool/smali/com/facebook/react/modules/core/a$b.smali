.class public final enum Lcom/facebook/react/modules/core/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum n:Lcom/facebook/react/modules/core/a$b;

.field public static final enum o:Lcom/facebook/react/modules/core/a$b;

.field public static final enum p:Lcom/facebook/react/modules/core/a$b;

.field public static final enum q:Lcom/facebook/react/modules/core/a$b;

.field public static final enum r:Lcom/facebook/react/modules/core/a$b;

.field private static final synthetic s:[Lcom/facebook/react/modules/core/a$b;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/modules/core/a$b;

    const-string v1, "PERF_MARKERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/react/modules/core/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->n:Lcom/facebook/react/modules/core/a$b;

    new-instance v0, Lcom/facebook/react/modules/core/a$b;

    const-string v1, "DISPATCH_UI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/react/modules/core/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    new-instance v0, Lcom/facebook/react/modules/core/a$b;

    const-string v1, "NATIVE_ANIMATED_MODULE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/react/modules/core/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->p:Lcom/facebook/react/modules/core/a$b;

    new-instance v0, Lcom/facebook/react/modules/core/a$b;

    const-string v1, "TIMERS_EVENTS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/react/modules/core/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    new-instance v0, Lcom/facebook/react/modules/core/a$b;

    const-string v1, "IDLE_EVENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/react/modules/core/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    invoke-static {}, Lcom/facebook/react/modules/core/a$b;->e()[Lcom/facebook/react/modules/core/a$b;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/modules/core/a$b;->s:[Lcom/facebook/react/modules/core/a$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/react/modules/core/a$b;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/modules/core/a$b;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/a$b;->n:Lcom/facebook/react/modules/core/a$b;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->o:Lcom/facebook/react/modules/core/a$b;

    sget-object v2, Lcom/facebook/react/modules/core/a$b;->p:Lcom/facebook/react/modules/core/a$b;

    sget-object v3, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    sget-object v4, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/facebook/react/modules/core/a$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/modules/core/a$b;
    .locals 1

    const-class v0, Lcom/facebook/react/modules/core/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/modules/core/a$b;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/modules/core/a$b;
    .locals 1

    sget-object v0, Lcom/facebook/react/modules/core/a$b;->s:[Lcom/facebook/react/modules/core/a$b;

    invoke-virtual {v0}, [Lcom/facebook/react/modules/core/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/modules/core/a$b;

    return-object v0
.end method


# virtual methods
.method h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/core/a$b;->m:I

    return v0
.end method

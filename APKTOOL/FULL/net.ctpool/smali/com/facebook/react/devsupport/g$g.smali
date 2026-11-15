.class final enum Lcom/facebook/react/devsupport/g$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "g"
.end annotation


# static fields
.field public static final enum n:Lcom/facebook/react/devsupport/g$g;

.field public static final enum o:Lcom/facebook/react/devsupport/g$g;

.field private static final synthetic p:[Lcom/facebook/react/devsupport/g$g;


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/react/devsupport/g$g;

    const/4 v1, 0x0

    const-string v2, "bundle"

    const-string v3, "BUNDLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/devsupport/g$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/devsupport/g$g;->n:Lcom/facebook/react/devsupport/g$g;

    new-instance v0, Lcom/facebook/react/devsupport/g$g;

    const/4 v1, 0x1

    const-string v2, "map"

    const-string v3, "MAP"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/devsupport/g$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/react/devsupport/g$g;->o:Lcom/facebook/react/devsupport/g$g;

    invoke-static {}, Lcom/facebook/react/devsupport/g$g;->e()[Lcom/facebook/react/devsupport/g$g;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/devsupport/g$g;->p:[Lcom/facebook/react/devsupport/g$g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/g$g;->m:Ljava/lang/String;

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/devsupport/g$g;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/g$g;->n:Lcom/facebook/react/devsupport/g$g;

    sget-object v1, Lcom/facebook/react/devsupport/g$g;->o:Lcom/facebook/react/devsupport/g$g;

    filled-new-array {v0, v1}, [Lcom/facebook/react/devsupport/g$g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/devsupport/g$g;
    .locals 1

    const-class v0, Lcom/facebook/react/devsupport/g$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/devsupport/g$g;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/devsupport/g$g;
    .locals 1

    sget-object v0, Lcom/facebook/react/devsupport/g$g;->p:[Lcom/facebook/react/devsupport/g$g;

    invoke-virtual {v0}, [Lcom/facebook/react/devsupport/g$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/devsupport/g$g;

    return-object v0
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g$g;->m:Ljava/lang/String;

    return-object v0
.end method

.class final enum Lcom/facebook/react/views/view/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/view/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum m:Lcom/facebook/react/views/view/g$a;

.field public static final enum n:Lcom/facebook/react/views/view/g$a;

.field public static final enum o:Lcom/facebook/react/views/view/g$a;

.field private static final synthetic p:[Lcom/facebook/react/views/view/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/views/view/g$a;

    const-string v1, "VISIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/view/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/view/g$a;->m:Lcom/facebook/react/views/view/g$a;

    new-instance v0, Lcom/facebook/react/views/view/g$a;

    const-string v1, "HIDDEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/view/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/view/g$a;->n:Lcom/facebook/react/views/view/g$a;

    new-instance v0, Lcom/facebook/react/views/view/g$a;

    const-string v1, "SCROLL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/view/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/views/view/g$a;->o:Lcom/facebook/react/views/view/g$a;

    invoke-static {}, Lcom/facebook/react/views/view/g$a;->e()[Lcom/facebook/react/views/view/g$a;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/view/g$a;->p:[Lcom/facebook/react/views/view/g$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/views/view/g$a;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/views/view/g$a;->m:Lcom/facebook/react/views/view/g$a;

    sget-object v1, Lcom/facebook/react/views/view/g$a;->n:Lcom/facebook/react/views/view/g$a;

    sget-object v2, Lcom/facebook/react/views/view/g$a;->o:Lcom/facebook/react/views/view/g$a;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/react/views/view/g$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/views/view/g$a;
    .locals 1

    const-class v0, Lcom/facebook/react/views/view/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/views/view/g$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/views/view/g$a;
    .locals 1

    sget-object v0, Lcom/facebook/react/views/view/g$a;->p:[Lcom/facebook/react/views/view/g$a;

    invoke-virtual {v0}, [Lcom/facebook/react/views/view/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/views/view/g$a;

    return-object v0
.end method

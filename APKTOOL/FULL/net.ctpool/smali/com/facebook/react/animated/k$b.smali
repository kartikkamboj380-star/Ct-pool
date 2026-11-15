.class final enum Lcom/facebook/react/animated/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field public static final enum m:Lcom/facebook/react/animated/k$b;

.field public static final enum n:Lcom/facebook/react/animated/k$b;

.field public static final enum o:Lcom/facebook/react/animated/k$b;

.field private static final synthetic p:[Lcom/facebook/react/animated/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/animated/k$b;

    const-string v1, "Number"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/animated/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/animated/k$b;->m:Lcom/facebook/react/animated/k$b;

    new-instance v0, Lcom/facebook/react/animated/k$b;

    const-string v1, "Color"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/animated/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/animated/k$b;->n:Lcom/facebook/react/animated/k$b;

    new-instance v0, Lcom/facebook/react/animated/k$b;

    const-string v1, "String"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/animated/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/animated/k$b;->o:Lcom/facebook/react/animated/k$b;

    invoke-static {}, Lcom/facebook/react/animated/k$b;->e()[Lcom/facebook/react/animated/k$b;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/animated/k$b;->p:[Lcom/facebook/react/animated/k$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/animated/k$b;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/animated/k$b;->m:Lcom/facebook/react/animated/k$b;

    sget-object v1, Lcom/facebook/react/animated/k$b;->n:Lcom/facebook/react/animated/k$b;

    sget-object v2, Lcom/facebook/react/animated/k$b;->o:Lcom/facebook/react/animated/k$b;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/react/animated/k$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/animated/k$b;
    .locals 1

    const-class v0, Lcom/facebook/react/animated/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/animated/k$b;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/animated/k$b;
    .locals 1

    sget-object v0, Lcom/facebook/react/animated/k$b;->p:[Lcom/facebook/react/animated/k$b;

    invoke-virtual {v0}, [Lcom/facebook/react/animated/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/animated/k$b;

    return-object v0
.end method

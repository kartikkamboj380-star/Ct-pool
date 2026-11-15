.class final enum Lcom/facebook/react/uimanager/f0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum m:Lcom/facebook/react/uimanager/f0$a;

.field public static final enum n:Lcom/facebook/react/uimanager/f0$a;

.field private static final synthetic o:[Lcom/facebook/react/uimanager/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/uimanager/f0$a;

    const-string v1, "SELF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/uimanager/f0$a;->m:Lcom/facebook/react/uimanager/f0$a;

    new-instance v0, Lcom/facebook/react/uimanager/f0$a;

    const-string v1, "CHILD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/f0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/react/uimanager/f0$a;->n:Lcom/facebook/react/uimanager/f0$a;

    invoke-static {}, Lcom/facebook/react/uimanager/f0$a;->e()[Lcom/facebook/react/uimanager/f0$a;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/f0$a;->o:[Lcom/facebook/react/uimanager/f0$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/uimanager/f0$a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->m:Lcom/facebook/react/uimanager/f0$a;

    sget-object v1, Lcom/facebook/react/uimanager/f0$a;->n:Lcom/facebook/react/uimanager/f0$a;

    filled-new-array {v0, v1}, [Lcom/facebook/react/uimanager/f0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/f0$a;
    .locals 1

    const-class v0, Lcom/facebook/react/uimanager/f0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/uimanager/f0$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/uimanager/f0$a;
    .locals 1

    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->o:[Lcom/facebook/react/uimanager/f0$a;

    invoke-virtual {v0}, [Lcom/facebook/react/uimanager/f0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/uimanager/f0$a;

    return-object v0
.end method

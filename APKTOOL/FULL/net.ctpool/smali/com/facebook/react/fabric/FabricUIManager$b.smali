.class Lcom/facebook/react/fabric/FabricUIManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/fabric/FabricUIManager;->synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic c:Lcom/facebook/react/fabric/FabricUIManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/FabricUIManager;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->c:Lcom/facebook/react/fabric/FabricUIManager;

    iput p2, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->a:I

    iput-object p3, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->b:Lcom/facebook/react/bridge/ReadableMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(La2/c;)V
    .locals 2

    .line 1
    :try_start_0
    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->b:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, La2/c;->s(ILcom/facebook/react/bridge/ReadableMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/facebook/react/fabric/FabricUIManager$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "<hidden>"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "SYNC UPDATE PROPS [%d]: %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/react/fabric/FabricUIManager$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/fabric/FabricUIManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/fabric/FabricUIManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/FabricUIManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$a;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Queue;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$a;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->g(Lcom/facebook/react/fabric/FabricUIManager;)La2/b;

    move-result-object v0

    invoke-virtual {v0, p1}, La2/b;->d(Ljava/util/Queue;)V

    return-void
.end method

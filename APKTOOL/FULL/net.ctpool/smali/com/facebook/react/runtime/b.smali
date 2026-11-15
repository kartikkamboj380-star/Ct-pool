.class Lcom/facebook/react/runtime/b;
.super Lcom/facebook/react/devsupport/B;
.source "SourceFile"


# instance fields
.field private final F:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method public constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/react/runtime/b;->T0(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/devsupport/a0;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v11}, Lcom/facebook/react/devsupport/B;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/a0;Ljava/lang/String;ZLX1/i;LX1/b;ILjava/util/Map;LS1/j;LX1/c;LX1/h;)V

    iput-object p1, p0, Lcom/facebook/react/runtime/b;->F:Lcom/facebook/react/runtime/ReactHostImpl;

    return-void
.end method

.method private static T0(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/devsupport/a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/b$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/b$a;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    return-object v0
.end method


# virtual methods
.method protected p0()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Bridgeless"

    return-object v0
.end method

.method public q()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/B;->o()V

    iget-object v0, p0, Lcom/facebook/react/runtime/b;->F:Lcom/facebook/react/runtime/ReactHostImpl;

    const-string v1, "BridgelessDevSupportManager.handleReloadJS()"

    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->A1(Ljava/lang/String;)Lb2/a;

    return-void
.end method

.class Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/DeviceEventManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lm2/b;

.field final synthetic n:Lcom/facebook/react/modules/core/DeviceEventManagerModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/core/DeviceEventManagerModule;Lm2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;->n:Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;->m:Lm2/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;->m:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()V

    return-void
.end method

.class Lcom/facebook/react/runtime/ReactInstance$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/ReactInstance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/bridge/queue/MessageQueueThread;

.field final synthetic b:Lcom/facebook/react/runtime/ReactInstance;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/queue/MessageQueueThread;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactInstance$c;->b:Lcom/facebook/react/runtime/ReactInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/runtime/ReactInstance$c;->a:Lcom/facebook/react/bridge/queue/MessageQueueThread;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/runtime/ReactInstance$c;Lcom/facebook/react/bridge/JavaOnlyMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactInstance$c;->b(Lcom/facebook/react/bridge/JavaOnlyMap;)V

    return-void
.end method

.method private synthetic b(Lcom/facebook/react/bridge/JavaOnlyMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$c;->b:Lcom/facebook/react/runtime/ReactInstance;

    invoke-static {v0}, Lcom/facebook/react/runtime/ReactInstance;->f(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;

    move-result-object v0

    const-string v1, "ExceptionsManager"

    invoke-virtual {v0, v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;

    invoke-virtual {v0, p1}, Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;->reportException(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method


# virtual methods
.method public reportJsException(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;)V
    .locals 2

    invoke-static {p1}, Lcom/facebook/react/devsupport/h0;->c(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;)Lcom/facebook/react/bridge/JavaOnlyMap;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$c;->a:Lcom/facebook/react/bridge/queue/MessageQueueThread;

    new-instance v1, Lcom/facebook/react/runtime/b0;

    invoke-direct {v1, p0, p1}, Lcom/facebook/react/runtime/b0;-><init>(Lcom/facebook/react/runtime/ReactInstance$c;Lcom/facebook/react/bridge/JavaOnlyMap;)V

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/queue/MessageQueueThread;->runOnQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

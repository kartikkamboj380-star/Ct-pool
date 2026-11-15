.class public Lcom/facebook/hermes/reactexecutor/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/JavaScriptExecutorFactory;


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/hermes/reactexecutor/a;-><init>(Lr1/a;)V

    return-void
.end method

.method public constructor <init>(Lr1/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/hermes/reactexecutor/a;->a:Z

    const-string p1, ""

    iput-object p1, p0, Lcom/facebook/hermes/reactexecutor/a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Lcom/facebook/react/bridge/JavaScriptExecutor;
    .locals 4

    new-instance v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;

    iget-boolean v1, p0, Lcom/facebook/hermes/reactexecutor/a;->a:Z

    iget-object v2, p0, Lcom/facebook/hermes/reactexecutor/a;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;-><init>(Lr1/a;ZLjava/lang/String;)V

    return-object v0
.end method

.method public startSamplingProfiler()V
    .locals 0

    invoke-static {}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->enable()V

    return-void
.end method

.method public stopSamplingProfiler(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->dumpSampledTraceToFile(Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;->disable()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JSIExecutor+HermesRuntime"

    return-object v0
.end method

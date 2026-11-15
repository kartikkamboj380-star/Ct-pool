.class public Lcom/facebook/hermes/reactexecutor/HermesExecutor;
.super Lcom/facebook/react/bridge/JavaScriptExecutor;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a()V

    return-void
.end method

.method constructor <init>(Lr1/a;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->initHybridDefaultConfig(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/JavaScriptExecutor;-><init>(Lcom/facebook/jni/HybridData;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "hermes"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    const-string v0, "hermes_executor"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    const-string v0, "Release"

    sput-object v0, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private static native initHybrid(ZLjava/lang/String;J)Lcom/facebook/jni/HybridData;
.end method

.method private static native initHybridDefaultConfig(ZLjava/lang/String;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HermesExecutor"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

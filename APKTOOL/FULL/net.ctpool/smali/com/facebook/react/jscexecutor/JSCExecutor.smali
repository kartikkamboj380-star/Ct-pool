.class public final Lcom/facebook/react/jscexecutor/JSCExecutor;
.super Lcom/facebook/react/bridge/JavaScriptExecutor;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/jscexecutor/JSCExecutor$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/react/jscexecutor/JSCExecutor$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/jscexecutor/JSCExecutor$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/jscexecutor/JSCExecutor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/jscexecutor/JSCExecutor;->a:Lcom/facebook/react/jscexecutor/JSCExecutor$a;

    invoke-virtual {v0}, Lcom/facebook/react/jscexecutor/JSCExecutor$a;->c()V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableNativeMap;)V
    .locals 1

    const-string v0, "jscConfig"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/jscexecutor/JSCExecutor;->a:Lcom/facebook/react/jscexecutor/JSCExecutor$a;

    invoke-static {v0, p1}, Lcom/facebook/react/jscexecutor/JSCExecutor$a;->a(Lcom/facebook/react/jscexecutor/JSCExecutor$a;Lcom/facebook/react/bridge/ReadableNativeMap;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/JavaScriptExecutor;-><init>(Lcom/facebook/jni/HybridData;)V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/bridge/ReadableNativeMap;)Lcom/facebook/jni/HybridData;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/jscexecutor/JSCExecutor;->initHybrid(Lcom/facebook/react/bridge/ReadableNativeMap;)Lcom/facebook/jni/HybridData;

    move-result-object p0

    return-object p0
.end method

.method public static final b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/jscexecutor/JSCExecutor;->a:Lcom/facebook/react/jscexecutor/JSCExecutor$a;

    invoke-virtual {v0}, Lcom/facebook/react/jscexecutor/JSCExecutor$a;->c()V

    return-void
.end method

.method private static final native initHybrid(Lcom/facebook/react/bridge/ReadableNativeMap;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "JSCExecutor"

    return-object v0
.end method

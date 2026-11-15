.class public final Lcom/facebook/react/runtime/ReactHostInspectorTarget;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/ReactHostInspectorTarget$a;,
        Lcom/facebook/react/runtime/ReactHostInspectorTarget$b;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/runtime/ReactHostInspectorTarget$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;

.field private final reactHostImpl:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/ReactHostInspectorTarget$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/ReactHostInspectorTarget$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->Companion:Lcom/facebook/react/runtime/ReactHostInspectorTarget$a;

    const-string v0, "rninstance"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 1

    const-string v0, "reactHostImpl"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->reactHostImpl:Lcom/facebook/react/runtime/ReactHostImpl;

    new-instance v0, Lcom/facebook/react/runtime/ReactHostInspectorTarget$b;

    invoke-direct {v0}, Lcom/facebook/react/runtime/ReactHostInspectorTarget$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->initHybrid(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/util/concurrent/Executor;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method private static synthetic getMHybridData$annotations()V
    .locals 0

    return-void
.end method

.method private final native initHybrid(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/util/concurrent/Executor;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    return-void
.end method

.method public final isValid()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    move-result v0

    return v0
.end method

.method public final native sendDebuggerResumeCommand()V
.end method

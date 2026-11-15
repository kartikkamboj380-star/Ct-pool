.class public final Lcom/facebook/react/runtime/hermes/HermesInstance;
.super Lcom/facebook/react/runtime/JSRuntimeFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/hermes/HermesInstance$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/runtime/hermes/HermesInstance$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/hermes/HermesInstance$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/hermes/HermesInstance$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/hermes/HermesInstance;->a:Lcom/facebook/react/runtime/hermes/HermesInstance$a;

    const-string v0, "hermesinstancejni"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/hermes/HermesInstance;-><init>(Lcom/facebook/react/fabric/ReactNativeConfig;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/fabric/ReactNativeConfig;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/facebook/react/runtime/hermes/HermesInstance;->initHybrid(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/JSRuntimeFactory;-><init>(Lcom/facebook/jni/HybridData;)V

    return-void
.end method

.method protected static final native initHybrid(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;
    .annotation build Lcom/facebook/jni/annotations/DoNotStrip;
    .end annotation
.end method

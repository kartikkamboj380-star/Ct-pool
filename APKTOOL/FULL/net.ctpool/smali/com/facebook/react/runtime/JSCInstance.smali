.class public final Lcom/facebook/react/runtime/JSCInstance;
.super Lcom/facebook/react/runtime/JSRuntimeFactory;
.source "SourceFile"


# annotations
.annotation build Lcom/facebook/jni/annotations/DoNotStripAny;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/JSCInstance$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/runtime/JSCInstance$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/JSCInstance$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/JSCInstance$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/JSCInstance;->Companion:Lcom/facebook/react/runtime/JSCInstance$a;

    const-string v0, "jscinstance"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/facebook/react/runtime/JSCInstance;->Companion:Lcom/facebook/react/runtime/JSCInstance$a;

    invoke-static {v0}, Lcom/facebook/react/runtime/JSCInstance$a;->a(Lcom/facebook/react/runtime/JSCInstance$a;)Lcom/facebook/jni/HybridData;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/JSRuntimeFactory;-><init>(Lcom/facebook/jni/HybridData;)V

    return-void
.end method

.method public static final synthetic access$initHybrid()Lcom/facebook/jni/HybridData;
    .locals 1

    invoke-static {}, Lcom/facebook/react/runtime/JSCInstance;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    return-object v0
.end method

.method private static final native initHybrid()Lcom/facebook/jni/HybridData;
    .annotation build Lcom/facebook/jni/annotations/DoNotStrip;
    .end annotation
.end method

.class public final Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;
.super Lcom/facebook/react/T;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;,
        Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;
    }
.end annotation


# static fields
.field private static final f:Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;->f:Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;

    sget-object v0, Lcom/facebook/react/defaults/d;->a:Lcom/facebook/react/defaults/d$a;

    invoke-virtual {v0}, Lcom/facebook/react/defaults/d$a;->a()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;->f:Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;

    invoke-virtual {v0, p3}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;->initHybrid(Ljava/util/List;)Lcom/facebook/jni/HybridData;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/T;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/jni/HybridData;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final native initHybrid(Ljava/util/List;)Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/facebook/jni/HybridData;"
        }
    .end annotation
.end method


# virtual methods
.method protected initHybrid()Lcom/facebook/jni/HybridData;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "DefaultTurboModuleManagerDelegate.initHybrid() must never be called!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

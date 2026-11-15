.class public final Lcom/facebook/react/bridge/WritableNativeMap;
.super Lcom/facebook/react/bridge/ReadableNativeMap;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/WritableMap;


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/WritableNativeMap$Companion;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/bridge/WritableNativeMap$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/WritableNativeMap$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/bridge/WritableNativeMap;->Companion:Lcom/facebook/react/bridge/WritableNativeMap$Companion;

    invoke-static {}, Lcom/facebook/react/bridge/ReactBridge;->staticInit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/facebook/react/bridge/WritableNativeMap;->Companion:Lcom/facebook/react/bridge/WritableNativeMap$Companion;

    invoke-static {v0}, Lcom/facebook/react/bridge/WritableNativeMap$Companion;->access$initHybrid(Lcom/facebook/react/bridge/WritableNativeMap$Companion;)Lcom/facebook/jni/HybridData;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/bridge/ReadableNativeMap;-><init>(Lcom/facebook/jni/HybridData;)V

    return-void
.end method

.method public static final synthetic access$initHybrid()Lcom/facebook/jni/HybridData;
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/WritableNativeMap;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    return-object v0
.end method

.method private static final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private final native mergeNativeMap(Lcom/facebook/react/bridge/ReadableNativeMap;)V
.end method

.method private final native putNativeArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeArray;)V
.end method

.method private final native putNativeMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeMap;)V
.end method


# virtual methods
.method public copy()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/WritableNativeMap;->merge(Lcom/facebook/react/bridge/ReadableMap;)V

    return-object v0
.end method

.method public merge(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableNativeMap;

    const-string v1, "Illegal type provided"

    invoke-static {v0, v1}, LO1/a;->b(ZLjava/lang/String;)V

    check-cast p1, Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->mergeNativeMap(Lcom/facebook/react/bridge/ReadableNativeMap;)V

    return-void
.end method

.method public putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    instance-of v0, p2, Lcom/facebook/react/bridge/ReadableNativeArray;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "Illegal type provided"

    invoke-static {v0, v1}, LO1/a;->b(ZLjava/lang/String;)V

    check-cast p2, Lcom/facebook/react/bridge/ReadableNativeArray;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putNativeArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeArray;)V

    return-void
.end method

.method public native putBoolean(Ljava/lang/String;Z)V
.end method

.method public native putDouble(Ljava/lang/String;D)V
.end method

.method public native putInt(Ljava/lang/String;I)V
.end method

.method public native putLong(Ljava/lang/String;J)V
.end method

.method public putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    instance-of v0, p2, Lcom/facebook/react/bridge/ReadableNativeMap;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "Illegal type provided"

    invoke-static {v0, v1}, LO1/a;->b(ZLjava/lang/String;)V

    check-cast p2, Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putNativeMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeMap;)V

    return-void
.end method

.method public native putNull(Ljava/lang/String;)V
.end method

.method public native putString(Ljava/lang/String;Ljava/lang/String;)V
.end method

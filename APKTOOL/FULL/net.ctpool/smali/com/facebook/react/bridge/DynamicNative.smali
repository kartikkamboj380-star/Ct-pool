.class final Lcom/facebook/react/bridge/DynamicNative;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Dynamic;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/bridge/DynamicNative;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method private final native getTypeNative()Lcom/facebook/react/bridge/ReadableType;
.end method

.method private final native isNullNative()Z
.end method


# virtual methods
.method public native asArray()Lcom/facebook/react/bridge/ReadableArray;
.end method

.method public native asBoolean()Z
.end method

.method public native asDouble()D
.end method

.method public asInt()I
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/DynamicNative;->asDouble()D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method public native asMap()Lcom/facebook/react/bridge/ReadableMap;
.end method

.method public native asString()Ljava/lang/String;
.end method

.method public getType()Lcom/facebook/react/bridge/ReadableType;
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/bridge/DynamicNative;->getTypeNative()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    return-object v0
.end method

.method public isNull()Z
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/bridge/DynamicNative;->isNullNative()Z

    move-result v0

    return v0
.end method

.method public recycle()V
    .locals 0

    return-void
.end method

.class public final Lcom/facebook/react/fabric/EmptyReactNativeConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/ReactNativeConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/EmptyReactNativeConfig$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/fabric/EmptyReactNativeConfig$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/fabric/EmptyReactNativeConfig$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/EmptyReactNativeConfig$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/fabric/EmptyReactNativeConfig;->Companion:Lcom/facebook/react/fabric/EmptyReactNativeConfig$a;

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Lcom/facebook/react/fabric/EmptyReactNativeConfig;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/fabric/EmptyReactNativeConfig;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method private final native initHybrid()Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public native getBool(Ljava/lang/String;)Z
.end method

.method public native getDouble(Ljava/lang/String;)D
.end method

.method public native getInt64(Ljava/lang/String;)J
.end method

.method public native getString(Ljava/lang/String;)Ljava/lang/String;
.end method

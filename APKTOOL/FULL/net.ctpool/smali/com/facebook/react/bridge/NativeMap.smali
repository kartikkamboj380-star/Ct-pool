.class public abstract Lcom/facebook/react/bridge/NativeMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/NativeMap$Companion;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/bridge/NativeMap$Companion;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/bridge/NativeMap$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/NativeMap$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/bridge/NativeMap;->Companion:Lcom/facebook/react/bridge/NativeMap$Companion;

    invoke-static {}, Lcom/facebook/react/bridge/ReactBridge;->staticInit()V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/bridge/NativeMap;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method


# virtual methods
.method public native toString()Ljava/lang/String;
.end method

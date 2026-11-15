.class public final Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl$Companion;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl$Companion;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;->Companion:Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl$Companion;

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;->Companion:Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader$Companion;

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader$Companion;->maybeLoadSoLibrary()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

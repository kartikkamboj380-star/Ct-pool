.class public final Lcom/facebook/react/fabric/CoreComponentsRegistry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/CoreComponentsRegistry$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/fabric/CoreComponentsRegistry$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/fabric/CoreComponentsRegistry$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/CoreComponentsRegistry$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/fabric/CoreComponentsRegistry;->Companion:Lcom/facebook/react/fabric/CoreComponentsRegistry$a;

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/CoreComponentsRegistry;->initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/fabric/CoreComponentsRegistry;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/CoreComponentsRegistry;-><init>(Lcom/facebook/react/fabric/ComponentFactory;)V

    return-void
.end method

.method private static synthetic getMHybridData$annotations()V
    .locals 0

    return-void
.end method

.method private final native initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;
.end method

.method public static final register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/fabric/CoreComponentsRegistry;
    .locals 1

    sget-object v0, Lcom/facebook/react/fabric/CoreComponentsRegistry;->Companion:Lcom/facebook/react/fabric/CoreComponentsRegistry$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/fabric/CoreComponentsRegistry$a;->a(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/fabric/CoreComponentsRegistry;

    move-result-object p0

    return-object p0
.end method

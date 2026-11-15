.class public final Lcom/facebook/react/fabric/ComponentFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/ComponentFactory$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/fabric/ComponentFactory$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/fabric/ComponentFactory$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/fabric/ComponentFactory$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/fabric/ComponentFactory;->Companion:Lcom/facebook/react/fabric/ComponentFactory$a;

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/react/fabric/ComponentFactory;->Companion:Lcom/facebook/react/fabric/ComponentFactory$a;

    invoke-static {v0}, Lcom/facebook/react/fabric/ComponentFactory$a;->a(Lcom/facebook/react/fabric/ComponentFactory$a;)Lcom/facebook/jni/HybridData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/fabric/ComponentFactory;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public static final synthetic access$initHybrid()Lcom/facebook/jni/HybridData;
    .locals 1

    invoke-static {}, Lcom/facebook/react/fabric/ComponentFactory;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic getMHybridData$annotations()V
    .locals 0

    return-void
.end method

.method private static final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

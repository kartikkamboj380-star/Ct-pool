.class public final Lcom/facebook/react/defaults/DefaultComponentsRegistry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->a:Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;

    sget-object v0, Lcom/facebook/react/defaults/d;->a:Lcom/facebook/react/defaults/d$a;

    invoke-virtual {v0}, Lcom/facebook/react/defaults/d$a;->a()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;)V
    .locals 0
    .annotation build LR1/a;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/defaults/DefaultComponentsRegistry;-><init>(Lcom/facebook/react/fabric/ComponentFactory;)V

    return-void
.end method

.method private final native initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end method

.method public static final register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/defaults/DefaultComponentsRegistry;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->a:Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;->register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/defaults/DefaultComponentsRegistry;

    move-result-object p0

    return-object p0
.end method

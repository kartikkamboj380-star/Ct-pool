.class public final Lcom/facebook/react/fabric/CoreComponentsRegistry$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/fabric/CoreComponentsRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/fabric/CoreComponentsRegistry$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/fabric/CoreComponentsRegistry;
    .locals 2

    .line 1
    const-string v0, "componentFactory"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/fabric/CoreComponentsRegistry;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/fabric/CoreComponentsRegistry;-><init>(Lcom/facebook/react/fabric/ComponentFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

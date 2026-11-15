.class public abstract Lcom/facebook/react/T$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/T;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/T$a;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v1, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate"

    invoke-static {v0, v1}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/T$a;->a:Ljava/util/List;

    const-string v1, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate"

    invoke-static {v0, v1}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/T$a;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v1, p0, Lcom/facebook/react/T$a;->a:Ljava/util/List;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/T$a;->b(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/T;

    move-result-object v0

    return-object v0
.end method

.method protected abstract b(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/T;
.end method

.method public c(Ljava/util/List;)Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/react/T$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public d(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/T$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/T$a;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

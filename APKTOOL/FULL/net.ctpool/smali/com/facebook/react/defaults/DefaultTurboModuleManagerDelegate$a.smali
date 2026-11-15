.class public final Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;
.super Lcom/facebook/react/T$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/T$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/T;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;->f(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lv5/l;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method protected f(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;
    .locals 3

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packages"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv5/l;

    invoke-interface {v2, p1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v0, v2}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

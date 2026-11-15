.class public Lcom/facebook/react/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    iput-object p1, p0, Lcom/facebook/react/k;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/bridge/NativeModuleRegistry;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/NativeModuleRegistry;

    iget-object v1, p0, Lcom/facebook/react/k;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v2, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/bridge/NativeModuleRegistry;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/Map;)V

    return-object v0
.end method

.method public b(Lcom/facebook/react/M;)V
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/facebook/react/b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/react/b;

    iget-object v0, p0, Lcom/facebook/react/k;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1, v0}, Lcom/facebook/react/b;->getNativeModuleIterator(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/k;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {p1, v0}, Lcom/facebook/react/O;->b(Lcom/facebook/react/M;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ModuleHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ModuleHolder;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/bridge/ModuleHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ModuleHolder;->getCanOverrideExistingModule()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Native module "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " tried to override "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/facebook/react/bridge/ModuleHolder;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_2
    iget-object v2, p0, Lcom/facebook/react/k;->b:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

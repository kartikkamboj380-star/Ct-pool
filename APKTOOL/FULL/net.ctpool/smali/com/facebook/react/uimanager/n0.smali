.class public abstract Lcom/facebook/react/uimanager/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lcom/facebook/react/uimanager/H0;)Ljava/util/Map;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/m0;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Lcom/facebook/react/uimanager/H0;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "ViewManagerNames"

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "LazyViewManagersEnabled"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static b(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 6

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/m0;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/facebook/react/uimanager/m0;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {}, Lcom/facebook/react/uimanager/m0;->c()Ljava/util/Map;

    move-result-object v2

    if-eqz p1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/uimanager/ViewManager;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v5, v5, p1, p2}, Lcom/facebook/react/uimanager/n0;->c(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const-string p0, "genericBubblingEventTypes"

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "genericDirectEventTypes"

    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static c(Lcom/facebook/react/uimanager/ViewManager;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 4

    .line 1
    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;

    move-result-object v1

    const-string v2, "bubblingEventTypes"

    if-eqz v1, :cond_1

    sget-boolean v3, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricRenderer:Z

    if-eqz v3, :cond_0

    sget-boolean v3, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    if-eqz v3, :cond_0

    invoke-static {v1}, Lcom/facebook/react/uimanager/n0;->e(Ljava/util/Map;)V

    :cond_0
    invoke-static {p3, v1}, Lcom/facebook/react/uimanager/n0;->f(Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {v1, p1}, Lcom/facebook/react/uimanager/n0;->f(Ljava/util/Map;Ljava/util/Map;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p1}, Lcom/facebook/react/uimanager/n0;->g(Ljava/lang/String;Ljava/util/Map;)V

    const-string p3, "directEventTypes"

    if-eqz p1, :cond_4

    sget-boolean v1, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricRenderer:Z

    if-eqz v1, :cond_3

    sget-boolean v1, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    if-eqz v1, :cond_3

    invoke-static {p1}, Lcom/facebook/react/uimanager/n0;->e(Ljava/util/Map;)V

    :cond_3
    invoke-static {p4, p1}, Lcom/facebook/react/uimanager/n0;->f(Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/n0;->f(Ljava/util/Map;Ljava/util/Map;)V

    invoke-interface {v0, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    if-eqz p2, :cond_5

    invoke-interface {v0, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getExportedViewConstants()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_6

    const-string p2, "Constants"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getCommandsMap()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string p2, "Commands"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->getNativeProps()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "NativeProps"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/m0;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "directEventTypes"

    invoke-static {}, Lcom/facebook/react/uimanager/m0;->c()Ljava/util/Map;

    move-result-object v2

    const-string v3, "bubblingEventTypes"

    invoke-static {v3, v0, v1, v2}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static e(Ljava/util/Map;)V
    .locals 7

    .line 1
    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "top"

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v1, p0, Ljava/util/HashMap;

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p0, v1

    :cond_3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "on"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    return-void
.end method

.method private static f(Ljava/util/Map;Ljava/util/Map;)V
    .locals 5

    .line 1
    if-eqz p0, :cond_3

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    instance-of v4, v2, Ljava/util/Map;

    if-eqz v4, :cond_2

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_2

    instance-of v4, v3, Ljava/util/HashMap;

    if-nez v4, :cond_1

    new-instance v4, Ljava/util/HashMap;

    check-cast v3, Ljava/util/Map;

    invoke-direct {v4, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {p0, v1, v4}, Ljava/util/Map;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v4

    :cond_1
    check-cast v3, Ljava/util/Map;

    check-cast v2, Ljava/util/Map;

    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/n0;->f(Ljava/util/Map;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private static g(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 1
    return-void
.end method

.class public abstract Lcom/facebook/react/uimanager/C0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/C0$e;,
        Lcom/facebook/react/uimanager/C0$d;,
        Lcom/facebook/react/uimanager/C0$b;,
        Lcom/facebook/react/uimanager/C0$a;,
        Lcom/facebook/react/uimanager/C0$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/C0;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/C0;->b:Ljava/util/Map;

    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/I0;->b()V

    sget-object v0, Lcom/facebook/react/uimanager/C0;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Lcom/facebook/react/uimanager/C0;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private static b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "$$PropsSetter"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate methods getter for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find generated setter for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ViewManagerPropertyUpdater"

    invoke-static {v0, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static c(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$e;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/C0;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/C0$e;

    if-nez v1, :cond_1

    invoke-static {p0}, Lcom/facebook/react/uimanager/C0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/C0$e;

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/react/uimanager/C0$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/react/uimanager/C0$b;-><init>(Ljava/lang/Class;Lcom/facebook/react/uimanager/D0;)V

    :cond_0
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method private static d(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$d;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/C0;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/C0$d;

    if-nez v1, :cond_1

    invoke-static {p0}, Lcom/facebook/react/uimanager/C0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/C0$d;

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/react/uimanager/C0$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/react/uimanager/C0$a;-><init>(Ljava/lang/Class;Lcom/facebook/react/uimanager/B0;)V

    :cond_0
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Map;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, Lcom/facebook/react/uimanager/C0;->c(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$e;

    move-result-object p0

    invoke-interface {p0, v0}, Lcom/facebook/react/uimanager/C0$c;->a(Ljava/util/Map;)V

    invoke-static {p1}, Lcom/facebook/react/uimanager/C0;->d(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$d;

    move-result-object p0

    invoke-interface {p0, v0}, Lcom/facebook/react/uimanager/C0$c;->a(Ljava/util/Map;)V

    return-object v0
.end method

.method public static f(Lcom/facebook/react/uimanager/U;Lcom/facebook/react/uimanager/W;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/C0;->d(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$d;

    move-result-object v0

    iget-object p1, p1, Lcom/facebook/react/uimanager/W;->a:Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->getEntryIterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p0, v2, v1}, Lcom/facebook/react/uimanager/C0$d;->c(Lcom/facebook/react/uimanager/U;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static g(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Lcom/facebook/react/uimanager/W;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/C0;->c(Ljava/lang/Class;)Lcom/facebook/react/uimanager/C0$e;

    move-result-object v0

    iget-object p2, p2, Lcom/facebook/react/uimanager/W;->a:Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMap;->getEntryIterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p0, p1, v2, v1}, Lcom/facebook/react/uimanager/C0$e;->b(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static h(Lcom/facebook/react/uimanager/A0;Landroid/view/View;Lcom/facebook/react/uimanager/W;)V
    .locals 2

    .line 1
    iget-object p2, p2, Lcom/facebook/react/uimanager/W;->a:Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMap;->getEntryIterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, p1, v1, v0}, Lcom/facebook/react/uimanager/A0;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

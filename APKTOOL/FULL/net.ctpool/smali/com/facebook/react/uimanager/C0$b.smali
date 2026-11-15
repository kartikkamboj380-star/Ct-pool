.class Lcom/facebook/react/uimanager/C0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/C0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/C0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/facebook/react/uimanager/I0;->i(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/uimanager/C0$b;->a:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lcom/facebook/react/uimanager/D0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/C0$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/C0$b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/I0$m;

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/I0$m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/I0$m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/C0$b;->a:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/facebook/react/uimanager/I0$m;

    if-eqz p3, :cond_0

    invoke-virtual {p3, p1, p2, p4}, Lcom/facebook/react/uimanager/I0$m;->e(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.class Lcom/facebook/react/uimanager/events/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/events/n;->getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/uimanager/events/n;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/events/n;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/n$a;->a:Lcom/facebook/react/uimanager/events/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$a;->a:Lcom/facebook/react/uimanager/events/n;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/n;->a(Lcom/facebook/react/uimanager/events/n;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p2}, Lcom/facebook/react/uimanager/events/o;->f(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/facebook/react/uimanager/events/n$a;->a:Lcom/facebook/react/uimanager/events/n;

    invoke-static {p2}, Lcom/facebook/react/uimanager/events/n;->b(Lcom/facebook/react/uimanager/events/n;)Lcom/facebook/react/uimanager/events/n$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->e()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v2}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v2

    if-ne v2, p1, :cond_1

    return v0

    :cond_2
    return v1

    :cond_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/events/n$a;->a:Lcom/facebook/react/uimanager/events/n;

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result p2

    if-ne p2, p1, :cond_4

    move v1, v0

    :cond_4
    return v1
.end method

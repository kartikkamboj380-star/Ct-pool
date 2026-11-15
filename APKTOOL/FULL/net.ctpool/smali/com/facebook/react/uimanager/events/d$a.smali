.class Lcom/facebook/react/uimanager/events/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/events/d;->getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/uimanager/events/d;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/events/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/d$a;->a:Lcom/facebook/react/uimanager/events/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/d$a;->a:Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/facebook/react/uimanager/events/d$a;->a:Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.class Lcom/facebook/react/uimanager/I0$d;
.super Lcom/facebook/react/uimanager/I0$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/I0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(Lx2/a;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    const-string v0, "boolean"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/react/uimanager/I0$m;-><init>(Lx2/a;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/facebook/react/uimanager/J0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

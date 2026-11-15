.class Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;
.super LT5/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->connectWebSocket(Ljava/lang/String;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

.field final synthetic b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    iput-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    invoke-direct {p0}, LT5/I;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LT5/H;ILjava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didClose()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(LT5/H;Ljava/lang/Throwable;LT5/D;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p1, "<Unknown error>"

    .line 11
    .line 12
    :goto_0
    const/4 p3, 0x0

    .line 13
    invoke-virtual {p2, p3, p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didFailWithError(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->close()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e(LT5/H;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didReceiveMessage(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

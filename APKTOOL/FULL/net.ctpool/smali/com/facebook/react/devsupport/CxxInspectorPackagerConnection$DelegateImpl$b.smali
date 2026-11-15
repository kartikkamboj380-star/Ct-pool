.class Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->connectWebSocket(Ljava/lang/String;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:LT5/H;

.field final synthetic n:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;LT5/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->n:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->m:LT5/H;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->m:LT5/H;

    const/16 v1, 0x3e8

    const-string v2, "End of session"

    invoke-interface {v0, v1, v2}, LT5/H;->f(ILjava/lang/String;)Z

    return-void
.end method

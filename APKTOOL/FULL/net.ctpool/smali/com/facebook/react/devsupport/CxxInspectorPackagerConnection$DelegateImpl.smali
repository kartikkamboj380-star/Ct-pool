.class Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DelegateImpl"
.end annotation


# instance fields
.field private final a:LT5/z;

.field private final b:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LT5/z$a;

    invoke-direct {v0}, LT5/z$a;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, LT5/z$a;->e(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, LT5/z$a;->N(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, LT5/z$a;->M(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/z$a;->b()LT5/z;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->a:LT5/z;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->b:Landroid/os/Handler;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/devsupport/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public connectWebSocket(Ljava/lang/String;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$a;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    new-instance v0, LT5/B$a;

    invoke-direct {v0}, LT5/B$a;-><init>()V

    invoke-virtual {v0, p1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/B$a;->b()LT5/B;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->a:LT5/z;

    new-instance v1, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;

    invoke-direct {v1, p0, p2}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$a;-><init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    invoke-virtual {v0, p1, v1}, LT5/z;->C(LT5/B;LT5/I;)LT5/H;

    move-result-object p1

    new-instance p2, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;-><init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;LT5/H;)V

    return-object p2
.end method

.method public scheduleCallback(Ljava/lang/Runnable;J)V
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

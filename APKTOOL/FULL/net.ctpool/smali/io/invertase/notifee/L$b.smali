.class Lio/invertase/notifee/L$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/invertase/notifee/L;->g(Lio/invertase/notifee/L$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;

.field final synthetic b:Lio/invertase/notifee/L$c;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;Lio/invertase/notifee/L$c;)V
    .locals 0

    iput-object p1, p0, Lio/invertase/notifee/L$b;->a:Lcom/facebook/react/H;

    iput-object p2, p0, Lio/invertase/notifee/L$b;->b:Lio/invertase/notifee/L$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lio/invertase/notifee/L$b;->a:Lcom/facebook/react/H;

    invoke-virtual {p1, p0}, Lcom/facebook/react/H;->p0(Lcom/facebook/react/z;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v0, p0, Lio/invertase/notifee/L$b;->b:Lio/invertase/notifee/L$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/invertase/notifee/M;

    invoke-direct {v1, v0}, Lio/invertase/notifee/M;-><init>(Lio/invertase/notifee/L$c;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.class public final synthetic Lu0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lapp/notifee/core/interfaces/MethodCallResult;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;

.field public final synthetic b:LS5/m$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;LS5/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/b;->a:Landroidx/concurrent/futures/c$a;

    iput-object p2, p0, Lu0/b;->b:LS5/m$a;

    return-void
.end method


# virtual methods
.method public final onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/b;->a:Landroidx/concurrent/futures/c$a;

    iget-object v1, p0, Lu0/b;->b:LS5/m$a;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, v1, p1, p2}, Lapp/notifee/core/BlockStateBroadcastReceiver;->b(Landroidx/concurrent/futures/c$a;LS5/m$a;Ljava/lang/Exception;Landroid/os/Bundle;)V

    return-void
.end method

.class public final synthetic Lu0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lapp/notifee/core/interfaces/MethodCallResult;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/c;->a:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/c;->a:Landroidx/concurrent/futures/c$a;

    check-cast p2, Ljava/lang/Void;

    invoke-static {v0, p1, p2}, Lapp/notifee/core/BlockStateBroadcastReceiver;->c(Landroidx/concurrent/futures/c$a;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

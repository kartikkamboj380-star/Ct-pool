.class public final synthetic Lu0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lapp/notifee/core/interfaces/MethodCallResult;


# instance fields
.field public final synthetic a:Lapp/notifee/core/ForegroundService;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/ForegroundService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/e;->a:Lapp/notifee/core/ForegroundService;

    return-void
.end method


# virtual methods
.method public final onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/e;->a:Lapp/notifee/core/ForegroundService;

    check-cast p2, Ljava/lang/Void;

    invoke-static {v0, p1, p2}, Lapp/notifee/core/ForegroundService;->a(Lapp/notifee/core/ForegroundService;Ljava/lang/Exception;Ljava/lang/Void;)V

    return-void
.end method

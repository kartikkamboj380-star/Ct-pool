.class public final synthetic Lio/invertase/notifee/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/invertase/notifee/L$c;


# instance fields
.field public final synthetic a:Lapp/notifee/core/event/ForegroundServiceEvent;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/event/ForegroundServiceEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/notifee/I;->a:Lapp/notifee/core/event/ForegroundServiceEvent;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/I;->a:Lapp/notifee/core/event/ForegroundServiceEvent;

    invoke-virtual {v0}, Lapp/notifee/core/event/ForegroundServiceEvent;->setCompletionResult()V

    return-void
.end method

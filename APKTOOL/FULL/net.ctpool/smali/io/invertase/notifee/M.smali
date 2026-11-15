.class public final synthetic Lio/invertase/notifee/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lio/invertase/notifee/L$c;


# direct methods
.method public synthetic constructor <init>(Lio/invertase/notifee/L$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/notifee/M;->m:Lio/invertase/notifee/L$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/M;->m:Lio/invertase/notifee/L$c;

    invoke-interface {v0}, Lio/invertase/notifee/L$c;->call()V

    return-void
.end method

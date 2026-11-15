.class public final synthetic Lio/invertase/notifee/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/invertase/notifee/L$c;


# instance fields
.field public final synthetic a:Lh2/c;

.field public final synthetic b:Lio/invertase/notifee/L$c;


# direct methods
.method public synthetic constructor <init>(Lh2/c;Lio/invertase/notifee/L$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/notifee/K;->a:Lh2/c;

    iput-object p2, p0, Lio/invertase/notifee/K;->b:Lio/invertase/notifee/L$c;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/K;->a:Lh2/c;

    iget-object v1, p0, Lio/invertase/notifee/K;->b:Lio/invertase/notifee/L$c;

    invoke-static {v0, v1}, Lio/invertase/notifee/L;->b(Lh2/c;Lio/invertase/notifee/L$c;)V

    return-void
.end method

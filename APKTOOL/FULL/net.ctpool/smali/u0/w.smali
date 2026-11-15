.class public final synthetic Lu0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lapp/notifee/core/Worker;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/Worker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/w;->a:Lapp/notifee/core/Worker;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/w;->a:Lapp/notifee/core/Worker;

    invoke-static {v0, p1}, Lapp/notifee/core/Worker;->o(Lapp/notifee/core/Worker;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

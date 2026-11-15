.class public final synthetic Lu0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS5/m$a;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/a;->a:Landroidx/concurrent/futures/c$a;

    iput p2, p0, Lu0/a;->b:I

    iput-boolean p3, p0, Lu0/a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/a;->a:Landroidx/concurrent/futures/c$a;

    iget v1, p0, Lu0/a;->b:I

    iget-boolean v2, p0, Lu0/a;->c:Z

    check-cast p1, Landroid/os/Bundle;

    invoke-static {v0, v1, v2, p1}, Lapp/notifee/core/BlockStateBroadcastReceiver;->a(Landroidx/concurrent/futures/c$a;IZLandroid/os/Bundle;)V

    return-void
.end method

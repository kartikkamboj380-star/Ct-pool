.class public Lcom/tenjin/android/utils/threading/TenjinHandlerThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/utils/threading/IThreading;


# instance fields
.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public post(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/tenjin/android/utils/threading/TenjinHandlerThread;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tenjin/android/utils/threading/TenjinHandlerThread;->handler:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/tenjin/android/utils/threading/TenjinHandlerThread;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

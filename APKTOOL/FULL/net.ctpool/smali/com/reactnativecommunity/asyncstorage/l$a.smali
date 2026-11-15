.class Lcom/reactnativecommunity/asyncstorage/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/asyncstorage/l;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/Runnable;

.field final synthetic n:Lcom/reactnativecommunity/asyncstorage/l;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/asyncstorage/l;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/asyncstorage/l$a;->n:Lcom/reactnativecommunity/asyncstorage/l;

    iput-object p2, p0, Lcom/reactnativecommunity/asyncstorage/l$a;->m:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/reactnativecommunity/asyncstorage/l$a;->m:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/reactnativecommunity/asyncstorage/l$a;->n:Lcom/reactnativecommunity/asyncstorage/l;

    invoke-virtual {v0}, Lcom/reactnativecommunity/asyncstorage/l;->a()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/reactnativecommunity/asyncstorage/l$a;->n:Lcom/reactnativecommunity/asyncstorage/l;

    invoke-virtual {v1}, Lcom/reactnativecommunity/asyncstorage/l;->a()V

    throw v0
.end method

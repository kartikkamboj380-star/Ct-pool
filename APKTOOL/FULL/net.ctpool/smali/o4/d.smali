.class public final synthetic Lo4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lo4/e;

.field public final synthetic n:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lo4/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/d;->m:Lo4/e;

    iput-object p2, p0, Lo4/d;->n:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo4/d;->m:Lo4/e;

    iget-object v1, p0, Lo4/d;->n:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lo4/e;->b(Lo4/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

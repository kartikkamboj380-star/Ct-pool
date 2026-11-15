.class Lcom/tenjin/android/params/AttributionParams$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/params/AttributionParams;->getReferralData(Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/params/AttributionParams;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lcom/tenjin/android/params/AttributionParams;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/tenjin/android/params/AttributionParams$2;->this$0:Lcom/tenjin/android/params/AttributionParams;

    iput-object p2, p0, Lcom/tenjin/android/params/AttributionParams$2;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "AttributionParams"

    const-string v1, "Request PlayStore install referrer"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;

    iget-object v1, p0, Lcom/tenjin/android/params/AttributionParams$2;->this$0:Lcom/tenjin/android/params/AttributionParams;

    invoke-static {v1}, Lcom/tenjin/android/params/AttributionParams;->access$000(Lcom/tenjin/android/params/AttributionParams;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/tenjin/android/params/AttributionParams$2$1;

    invoke-direct {v1, p0}, Lcom/tenjin/android/params/AttributionParams$2$1;-><init>(Lcom/tenjin/android/params/AttributionParams$2;)V

    invoke-virtual {v0, v1}, Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer;->getInstallReferrer(Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams$2;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return-void
.end method

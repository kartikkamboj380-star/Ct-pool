.class Lcom/tenjin/android/params/AttributionParams$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/params/referral/PlayStoreInstallReferrer$PlayStoreAttributionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/params/AttributionParams$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tenjin/android/params/AttributionParams$2;


# direct methods
.method constructor <init>(Lcom/tenjin/android/params/AttributionParams$2;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/params/AttributionParams$2$1;->this$1:Lcom/tenjin/android/params/AttributionParams$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;JJ)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Retrieved referral from Play Store - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AttributionParams"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams$2$1;->this$1:Lcom/tenjin/android/params/AttributionParams$2;

    iget-object v1, v0, Lcom/tenjin/android/params/AttributionParams$2;->this$0:Lcom/tenjin/android/params/AttributionParams;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v1 .. v6}, Lcom/tenjin/android/params/AttributionParams;->access$200(Lcom/tenjin/android/params/AttributionParams;Ljava/lang/String;JJ)V

    iget-object p1, p0, Lcom/tenjin/android/params/AttributionParams$2$1;->this$1:Lcom/tenjin/android/params/AttributionParams$2;

    iget-object p1, p1, Lcom/tenjin/android/params/AttributionParams$2;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public onFail()V
    .locals 2

    const-string v0, "AttributionParams"

    const-string v1, "No play store referral"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tenjin/android/params/AttributionParams$2$1;->this$1:Lcom/tenjin/android/params/AttributionParams$2;

    iget-object v0, v0, Lcom/tenjin/android/params/AttributionParams$2;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

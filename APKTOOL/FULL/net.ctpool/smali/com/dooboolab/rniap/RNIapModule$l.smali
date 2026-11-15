.class public final Lcom/dooboolab/rniap/RNIapModule$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dooboolab/rniap/RNIapModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/b$a;Lcom/google/android/gms/common/GoogleApiAvailability;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/dooboolab/rniap/RNIapModule;


# direct methods
.method constructor <init>(Lcom/dooboolab/rniap/RNIapModule;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule$l;->m:Lcom/dooboolab/rniap/RNIapModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onHostDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule$l;->m:Lcom/dooboolab/rniap/RNIapModule;

    invoke-static {v0}, Lcom/dooboolab/rniap/RNIapModule;->access$getBillingClientCache$p(Lcom/dooboolab/rniap/RNIapModule;)Lcom/android/billingclient/api/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/b;->c()V

    :cond_0
    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule$l;->m:Lcom/dooboolab/rniap/RNIapModule;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/dooboolab/rniap/RNIapModule;->access$setBillingClientCache$p(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/b;)V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 0

    return-void
.end method

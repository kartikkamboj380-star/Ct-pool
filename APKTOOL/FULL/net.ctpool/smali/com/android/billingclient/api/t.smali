.class public final synthetic Lcom/android/billingclient/api/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/android/billingclient/api/u;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/t;->m:Lcom/android/billingclient/api/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/t;->m:Lcom/android/billingclient/api/u;

    invoke-virtual {v0}, Lcom/android/billingclient/api/u;->b()V

    return-void
.end method

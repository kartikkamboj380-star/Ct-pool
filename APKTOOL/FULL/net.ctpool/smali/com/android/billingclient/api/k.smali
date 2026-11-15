.class public final synthetic Lcom/android/billingclient/api/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/android/billingclient/api/c;

.field public final synthetic n:LC0/e;

.field public final synthetic o:LC0/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/c;LC0/e;LC0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/k;->m:Lcom/android/billingclient/api/c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/k;->n:LC0/e;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/k;->o:LC0/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/k;->m:Lcom/android/billingclient/api/c;

    iget-object v1, p0, Lcom/android/billingclient/api/k;->n:LC0/e;

    iget-object v2, p0, Lcom/android/billingclient/api/k;->o:LC0/d;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/c;->F(LC0/e;LC0/d;)V

    return-void
.end method

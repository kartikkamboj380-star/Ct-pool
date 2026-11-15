.class final Lcom/android/billingclient/api/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LC0/h;

.field final synthetic c:Lcom/android/billingclient/api/c;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/c;Ljava/lang/String;LC0/h;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/android/billingclient/api/q;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/billingclient/api/q;->b:LC0/h;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/billingclient/api/q;->c:Lcom/android/billingclient/api/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/q;->c:Lcom/android/billingclient/api/c;

    iget-object v1, p0, Lcom/android/billingclient/api/q;->a:Ljava/lang/String;

    const/16 v2, 0x9

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/c;->L(Lcom/android/billingclient/api/c;Ljava/lang/String;I)LC0/D;

    move-result-object v0

    invoke-virtual {v0}, LC0/D;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/q;->b:LC0/h;

    invoke-virtual {v0}, LC0/D;->a()Lcom/android/billingclient/api/e;

    move-result-object v2

    invoke-virtual {v0}, LC0/D;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0}, LC0/h;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/android/billingclient/api/q;->b:LC0/h;

    invoke-virtual {v0}, LC0/D;->a()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j;->q()Lcom/google/android/gms/internal/play_billing/j;

    move-result-object v2

    invoke-interface {v1, v0, v2}, LC0/h;->a(Lcom/android/billingclient/api/e;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.class final Lcom/android/billingclient/api/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/x;


# instance fields
.field private b:Lcom/google/android/gms/internal/play_billing/m2;

.field private final c:Lcom/android/billingclient/api/A;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/m2;)V
    .locals 1

    new-instance v0, Lcom/android/billingclient/api/A;

    invoke-direct {v0, p1}, Lcom/android/billingclient/api/A;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/A;

    iput-object p2, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/D2;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->E()Lcom/google/android/gms/internal/play_billing/v2;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v2;->q(Lcom/google/android/gms/internal/play_billing/m2;)Lcom/google/android/gms/internal/play_billing/v2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v2;->r(Lcom/google/android/gms/internal/play_billing/D2;)Lcom/google/android/gms/internal/play_billing/v2;

    iget-object p1, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/A;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/A;->a(Lcom/google/android/gms/internal/play_billing/w2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/W1;I)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->i()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/l2;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/l2;->m(I)Lcom/google/android/gms/internal/play_billing/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/m2;

    iput-object p2, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/z;->c(Lcom/google/android/gms/internal/play_billing/W1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/W1;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->E()Lcom/google/android/gms/internal/play_billing/v2;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v2;->q(Lcom/google/android/gms/internal/play_billing/m2;)Lcom/google/android/gms/internal/play_billing/v2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v2;->p(Lcom/google/android/gms/internal/play_billing/W1;)Lcom/google/android/gms/internal/play_billing/v2;

    iget-object p1, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/A;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/A;->a(Lcom/google/android/gms/internal/play_billing/w2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/play_billing/S1;I)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->i()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/l2;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/l2;->m(I)Lcom/google/android/gms/internal/play_billing/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/m2;

    iput-object p2, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {p0, p1}, Lcom/android/billingclient/api/z;->e(Lcom/google/android/gms/internal/play_billing/S1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/play_billing/S1;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->E()Lcom/google/android/gms/internal/play_billing/v2;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/z;->b:Lcom/google/android/gms/internal/play_billing/m2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v2;->q(Lcom/google/android/gms/internal/play_billing/m2;)Lcom/google/android/gms/internal/play_billing/v2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v2;->m(Lcom/google/android/gms/internal/play_billing/S1;)Lcom/google/android/gms/internal/play_billing/v2;

    iget-object p1, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/A;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/A;->a(Lcom/google/android/gms/internal/play_billing/w2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.class public abstract synthetic Lcom/android/billingclient/api/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/android/billingclient/api/x;->a:Lcom/google/android/gms/internal/play_billing/m;

    return-void
.end method

.method public static a(IILcom/android/billingclient/api/e;)Lcom/google/android/gms/internal/play_billing/S1;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S1;->E()Lcom/google/android/gms/internal/play_billing/R1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/c2;->E()Lcom/google/android/gms/internal/play_billing/Y1;

    move-result-object v1

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/Y1;->q(I)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/play_billing/Y1;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/Y1;->r(I)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/R1;->m(Lcom/google/android/gms/internal/play_billing/Y1;)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/R1;->q(I)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/S1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "BillingLogger"

    const-string p2, "Unable to create logging payload"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(IILcom/android/billingclient/api/e;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/S1;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/c2;->E()Lcom/google/android/gms/internal/play_billing/Y1;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/Y1;->q(I)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/Y1;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/Y1;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/Y1;->r(I)Lcom/google/android/gms/internal/play_billing/Y1;

    if-eqz p3, :cond_0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/play_billing/Y1;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/Y1;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S1;->E()Lcom/google/android/gms/internal/play_billing/R1;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/R1;->m(Lcom/google/android/gms/internal/play_billing/Y1;)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/R1;->q(I)Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/S1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :goto_1
    const-string p1, "BillingLogger"

    const-string p2, "Unable to create logging payload"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(I)Lcom/google/android/gms/internal/play_billing/W1;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/W1;->C()Lcom/google/android/gms/internal/play_billing/V1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/V1;->p(I)Lcom/google/android/gms/internal/play_billing/V1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p0;->h()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/W1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "BillingLogger"

    const-string v1, "Unable to create logging payload"

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/play_billing/A;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

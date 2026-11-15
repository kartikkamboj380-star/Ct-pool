.class interface abstract Lcom/android/billingclient/api/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/play_billing/m;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v1, Lcom/google/android/gms/internal/play_billing/g2;->o:Lcom/google/android/gms/internal/play_billing/g2;

    sget-object v3, Lcom/google/android/gms/internal/play_billing/g2;->p:Lcom/google/android/gms/internal/play_billing/g2;

    const-string v4, "com.android.vending.billing.ALTERNATIVE_BILLING"

    sget-object v5, Lcom/google/android/gms/internal/play_billing/g2;->q:Lcom/google/android/gms/internal/play_billing/g2;

    const-string v0, "com.android.vending.billing.PURCHASES_UPDATED"

    const-string v2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/m;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/m;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/x;->a:Lcom/google/android/gms/internal/play_billing/m;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/play_billing/D2;)V
.end method

.method public abstract b(Lcom/google/android/gms/internal/play_billing/W1;I)V
.end method

.method public abstract c(Lcom/google/android/gms/internal/play_billing/W1;)V
.end method

.method public abstract d(Lcom/google/android/gms/internal/play_billing/S1;I)V
.end method

.method public abstract e(Lcom/google/android/gms/internal/play_billing/S1;)V
.end method

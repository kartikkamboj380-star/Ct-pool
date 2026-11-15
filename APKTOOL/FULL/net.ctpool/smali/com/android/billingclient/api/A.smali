.class final Lcom/android/billingclient/api/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:LS2/i;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {p1}, LU2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LU2/u;->c()LU2/u;

    move-result-object p1

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p1, v0}, LU2/u;->g(LU2/f;)LS2/j;

    move-result-object p1

    const-string v0, "PLAY_BILLING_LIBRARY"

    const-class v1, Lcom/google/android/gms/internal/play_billing/w2;

    const-string v2, "proto"

    invoke-static {v2}, LS2/c;->b(Ljava/lang/String;)LS2/c;

    move-result-object v2

    new-instance v3, LC0/z;

    invoke-direct {v3}, LC0/z;-><init>()V

    invoke-interface {p1, v0, v1, v2, v3}, LS2/j;->a(Ljava/lang/String;Ljava/lang/Class;LS2/c;LS2/h;)LS2/i;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/A;->b:LS2/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/android/billingclient/api/A;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/w2;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/A;->a:Z

    const-string v1, "BillingLogger"

    if-eqz v0, :cond_0

    const-string p1, "Skipping logging since initialization failed."

    :goto_0
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/A;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/A;->b:LS2/i;

    invoke-static {p1}, LS2/d;->f(Ljava/lang/Object;)LS2/d;

    move-result-object p1

    invoke-interface {v0, p1}, LS2/i;->a(LS2/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "logging failed."

    goto :goto_0
.end method

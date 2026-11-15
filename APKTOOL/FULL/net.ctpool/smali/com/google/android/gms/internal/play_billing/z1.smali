.class final Lcom/google/android/gms/internal/play_billing/z1;
.super Lcom/google/android/gms/internal/play_billing/x1;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/x1;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/y1;->a()I

    move-result p1

    return p1
.end method

.method final synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/y1;->b()I

    move-result p1

    return p1
.end method

.method final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/r0;

    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->c()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->f()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    :cond_0
    return-object v0
.end method

.method final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/r0;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    return-object p1
.end method

.method final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->c()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/y1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->c()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y1;->equals(Ljava/lang/Object;)Z

    move-result v0

    check-cast p2, Lcom/google/android/gms/internal/play_billing/y1;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/y1;->e(Lcom/google/android/gms/internal/play_billing/y1;Lcom/google/android/gms/internal/play_billing/y1;)Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/y1;->d(Lcom/google/android/gms/internal/play_billing/y1;)Lcom/google/android/gms/internal/play_billing/y1;

    :cond_1
    :goto_0
    return-object p1
.end method

.method final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    .line 1
    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/y1;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/r0;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/y1;->h()V

    return-void
.end method

.method final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/r0;

    check-cast p2, Lcom/google/android/gms/internal/play_billing/y1;

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    return-void
.end method

.method final synthetic i(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/P1;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/y1;->k(Lcom/google/android/gms/internal/play_billing/P1;)V

    return-void
.end method

.method final synthetic j(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/P1;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/y1;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/y1;->l(Lcom/google/android/gms/internal/play_billing/P1;)V

    return-void
.end method

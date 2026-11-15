.class final Lcom/google/android/gms/internal/auth/t1;
.super Lcom/google/android/gms/internal/auth/q1;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/q1;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/auth/C0;

    iget-object p1, p1, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    return-object p1
.end method

.method final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->a()Lcom/google/android/gms/internal/auth/s1;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/s1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->a()Lcom/google/android/gms/internal/auth/s1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/s1;->equals(Ljava/lang/Object;)Z

    move-result v0

    check-cast p2, Lcom/google/android/gms/internal/auth/s1;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/auth/s1;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/auth/s1;->c(Lcom/google/android/gms/internal/auth/s1;Lcom/google/android/gms/internal/auth/s1;)Lcom/google/android/gms/internal/auth/s1;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/auth/s1;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/s1;->b(Lcom/google/android/gms/internal/auth/s1;)Lcom/google/android/gms/internal/auth/s1;

    :cond_1
    :goto_0
    return-object p1
.end method

.method final c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/auth/C0;

    iget-object p1, p1, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/s1;->f()V

    return-void
.end method

.method final synthetic d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/auth/C0;

    check-cast p2, Lcom/google/android/gms/internal/auth/s1;

    iput-object p2, p1, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    return-void
.end method

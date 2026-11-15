.class final Lcom/google/firebase/analytics/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/z;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/e1;->B(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/e1;->l(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e1;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e1;->Q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e1;->O()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/e1;->a(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/e1;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/e1;->H(Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/e1;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/e1;->h(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/e1;->D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e1;->N()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/analytics/d;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/e1;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

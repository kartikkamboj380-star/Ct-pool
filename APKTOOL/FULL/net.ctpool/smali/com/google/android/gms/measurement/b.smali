.class final Lcom/google/android/gms/measurement/b;
.super Lcom/google/android/gms/measurement/AppMeasurement$a;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/S2;

.field private final b:Lcom/google/android/gms/measurement/internal/F3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/S2;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/AppMeasurement$a;-><init>(Lcom/google/android/gms/measurement/c;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->w()Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/measurement/internal/y;->x(Ljava/lang/String;J)V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/F3;->L0(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d6;->P0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->t0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->u0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/F3;->C(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->d0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->w()Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/b;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/measurement/internal/y;->B(Ljava/lang/String;J)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/F3;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->F(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->R0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->t0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/b;->b:Lcom/google/android/gms/measurement/internal/F3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->v0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

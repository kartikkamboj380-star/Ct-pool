.class abstract Lcom/google/android/gms/measurement/internal/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/y3;


# instance fields
.field protected final a:Lcom/google/android/gms/measurement/internal/S2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/S2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->x()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/measurement/internal/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->y()Lcom/google/android/gms/measurement/internal/x;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/measurement/internal/n2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/google/android/gms/measurement/internal/h2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->B()Lcom/google/android/gms/measurement/internal/h2;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/measurement/internal/P2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/google/android/gms/measurement/internal/z2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->D()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/google/android/gms/measurement/internal/d6;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v0

    return-object v0
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w3;->j()V

    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->O()V

    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    return-void
.end method

.method public zzb()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method public zzd()Lcom/google/android/gms/measurement/internal/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->zzd()Lcom/google/android/gms/measurement/internal/c;

    move-result-object v0

    return-object v0
.end method

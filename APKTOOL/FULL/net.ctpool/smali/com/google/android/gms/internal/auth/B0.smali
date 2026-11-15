.class public abstract Lcom/google/android/gms/internal/auth/B0;
.super Lcom/google/android/gms/internal/auth/a0;
.source "SourceFile"


# instance fields
.field private final m:Lcom/google/android/gms/internal/auth/C0;

.field protected n:Lcom/google/android/gms/internal/auth/C0;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/auth/C0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/a0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/B0;->m:Lcom/google/android/gms/internal/auth/C0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/C0;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/C0;->d()Lcom/google/android/gms/internal/auth/C0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/auth/B0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->m:Lcom/google/android/gms/internal/auth/C0;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/B0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->c()Lcom/google/android/gms/internal/auth/C0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/auth/C0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->n:Lcom/google/android/gms/internal/auth/C0;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->a()Lcom/google/android/gms/internal/auth/B0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic zzd()Lcom/google/android/gms/internal/auth/Z0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->c()Lcom/google/android/gms/internal/auth/C0;

    move-result-object v0

    return-object v0
.end method

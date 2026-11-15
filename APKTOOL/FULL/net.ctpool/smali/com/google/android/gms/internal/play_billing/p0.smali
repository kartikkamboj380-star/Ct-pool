.class public abstract Lcom/google/android/gms/internal/play_billing/p0;
.super Lcom/google/android/gms/internal/play_billing/y;
.source "SourceFile"


# instance fields
.field private final m:Lcom/google/android/gms/internal/play_billing/r0;

.field protected n:Lcom/google/android/gms/internal/play_billing/r0;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/play_billing/r0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/y;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p0;->m:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/r0;->l()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static l(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/h1;->h(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->d()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/play_billing/p0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->m:Lcom/google/android/gms/internal/play_billing/r0;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/p0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->i()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    return-object v0
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/r0;)Lcom/google/android/gms/internal/play_billing/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->m:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/r0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->k()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/p0;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final h()Lcom/google/android/gms/internal/play_billing/r0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->i()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/play_billing/w1;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/w1;-><init>(Lcom/google/android/gms/internal/play_billing/W0;)V

    throw v1
.end method

.method public i()Lcom/google/android/gms/internal/play_billing/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    return-object v0
.end method

.method protected final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->k()V

    :cond_0
    return-void
.end method

.method protected k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->m:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->l()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/p0;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/p0;->n:Lcom/google/android/gms/internal/play_billing/r0;

    return-void
.end method

.method public bridge synthetic zzg()Lcom/google/android/gms/internal/play_billing/W0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p0;->i()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    return-object v0
.end method

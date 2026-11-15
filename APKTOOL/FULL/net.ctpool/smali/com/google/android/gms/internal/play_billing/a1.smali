.class final Lcom/google/android/gms/internal/play_billing/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/h1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/play_billing/W0;

.field private final b:Lcom/google/android/gms/internal/play_billing/x1;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/play_billing/g0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/play_billing/x1;Lcom/google/android/gms/internal/play_billing/g0;Lcom/google/android/gms/internal/play_billing/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/g0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/a1;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    iput-object p3, p0, Lcom/google/android/gms/internal/play_billing/a1;->a:Lcom/google/android/gms/internal/play_billing/W0;

    return-void
.end method

.method static j(Lcom/google/android/gms/internal/play_billing/x1;Lcom/google/android/gms/internal/play_billing/g0;Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/a1;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/a1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a1;-><init>(Lcom/google/android/gms/internal/play_billing/x1;Lcom/google/android/gms/internal/play_billing/g0;Lcom/google/android/gms/internal/play_billing/W0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/P1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/k0;->d()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/x1;->i(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/P1;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->a:Lcom/google/android/gms/internal/play_billing/W0;

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/r0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->l()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/W0;->a()Lcom/google/android/gms/internal/play_billing/V0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/V0;->zzg()Lcom/google/android/gms/internal/play_billing/W0;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/x1;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/a1;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/k0;->c()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/D;)V
    .locals 0

    .line 1
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/play_billing/r0;

    iget-object p3, p2, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->c()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->f()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    :goto_0
    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/a1;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/k0;->a:Lcom/google/android/gms/internal/play_billing/u1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/u1;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/g0;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/k0;->h()Z

    move-result p1

    return p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/j1;->x(Lcom/google/android/gms/internal/play_billing/x1;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/j1;->w(Lcom/google/android/gms/internal/play_billing/g0;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a1;->d:Lcom/google/android/gms/internal/play_billing/g0;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/k0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

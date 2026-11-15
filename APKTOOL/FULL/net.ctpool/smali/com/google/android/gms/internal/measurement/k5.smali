.class final Lcom/google/android/gms/internal/measurement/k5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/g5;

.field private final b:Lcom/google/android/gms/internal/measurement/L5;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/measurement/o4;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/L5;Lcom/google/android/gms/internal/measurement/o4;Lcom/google/android/gms/internal/measurement/g5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/o4;->d(Lcom/google/android/gms/internal/measurement/g5;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/k5;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/k5;->a:Lcom/google/android/gms/internal/measurement/g5;

    return-void
.end method

.method static j(Lcom/google/android/gms/internal/measurement/L5;Lcom/google/android/gms/internal/measurement/o4;Lcom/google/android/gms/internal/measurement/g5;)Lcom/google/android/gms/internal/measurement/k5;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/k5;-><init>(Lcom/google/android/gms/internal/measurement/L5;Lcom/google/android/gms/internal/measurement/o4;Lcom/google/android/gms/internal/measurement/g5;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->a:Lcom/google/android/gms/internal/measurement/g5;

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/z4;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z4;->x()Lcom/google/android/gms/internal/measurement/z4;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/g5;->c()Lcom/google/android/gms/internal/measurement/f5;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/f5;->n()Lcom/google/android/gms/internal/measurement/g5;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/d6;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->l()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/L5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/L5;->d(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/d6;)V

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

.method public final c(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/L5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/L5;->e(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/k5;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/s4;->a()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/s4;->n()Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/L5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/k5;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/s4;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final f(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/Q3;)V
    .locals 0

    .line 1
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/measurement/z4;

    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/z4;->zzb:Lcom/google/android/gms/internal/measurement/K5;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/K5;->k()Lcom/google/android/gms/internal/measurement/K5;

    move-result-object p4

    if-ne p3, p4, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/K5;->l()Lcom/google/android/gms/internal/measurement/K5;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/measurement/z4;->zzb:Lcom/google/android/gms/internal/measurement/K5;

    :cond_0
    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/L5;->l(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o4;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/x5;->n(Lcom/google/android/gms/internal/measurement/L5;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/k5;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/x5;->l(Lcom/google/android/gms/internal/measurement/o4;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/L5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/k5;->b:Lcom/google/android/gms/internal/measurement/L5;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/measurement/L5;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/k5;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->d:Lcom/google/android/gms/internal/measurement/o4;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/o4;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

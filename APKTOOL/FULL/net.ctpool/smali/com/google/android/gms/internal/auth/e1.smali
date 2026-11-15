.class final Lcom/google/android/gms/internal/auth/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/l1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/auth/Z0;

.field private final b:Lcom/google/android/gms/internal/auth/q1;

.field private final c:Lcom/google/android/gms/internal/auth/w0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/Z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/e1;->c:Lcom/google/android/gms/internal/auth/w0;

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/e1;->a:Lcom/google/android/gms/internal/auth/Z0;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/e1;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/auth/e1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/e1;-><init>(Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/Z0;)V

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->c:Lcom/google/android/gms/internal/auth/w0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/w0;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/e0;)V
    .locals 0

    .line 1
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/auth/C0;

    iget-object p3, p2, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->a()Lcom/google/android/gms/internal/auth/s1;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->d()Lcom/google/android/gms/internal/auth/s1;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    :goto_0
    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/auth/n1;->c(Lcom/google/android/gms/internal/auth/q1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->c:Lcom/google/android/gms/internal/auth/w0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/w0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/z0;

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->b:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e1;->a:Lcom/google/android/gms/internal/auth/Z0;

    instance-of v1, v0, Lcom/google/android/gms/internal/auth/C0;

    check-cast v0, Lcom/google/android/gms/internal/auth/C0;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->d()Lcom/google/android/gms/internal/auth/C0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/B0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/Y0;->zzd()Lcom/google/android/gms/internal/auth/Z0;

    move-result-object v0

    return-object v0
.end method

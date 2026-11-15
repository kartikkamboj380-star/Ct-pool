.class public abstract Lcom/google/android/gms/internal/auth/C0;
.super Lcom/google/android/gms/internal/auth/b0;
.source "SourceFile"


# static fields
.field private static final zzb:Ljava/util/Map;


# instance fields
.field protected zzc:Lcom/google/android/gms/internal/auth/s1;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/C0;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/b0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->a()Lcom/google/android/gms/internal/auth/s1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    return-void
.end method

.method static c(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/C0;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/C0;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/C0;

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/C0;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/internal/auth/B1;->e(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/C0;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/C0;

    if-eqz v1, :cond_1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v1
.end method

.method protected static e(Lcom/google/android/gms/internal/auth/C0;[B)Lcom/google/android/gms/internal/auth/C0;
    .locals 3

    .line 1
    array-length v0, p1

    sget-object v1, Lcom/google/android/gms/internal/auth/v0;->b:Lcom/google/android/gms/internal/auth/v0;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/android/gms/internal/auth/C0;->o(Lcom/google/android/gms/internal/auth/C0;[BIILcom/google/android/gms/internal/auth/v0;)Lcom/google/android/gms/internal/auth/C0;

    move-result-object p0

    if-eqz p0, :cond_3

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-ne v1, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/auth/l1;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eq p1, v1, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    move-object p1, p0

    :goto_0
    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1, v0}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/auth/p1;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/auth/p1;-><init>(Lcom/google/android/gms/internal/auth/Z0;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/p1;->a()Lcom/google/android/gms/internal/auth/H0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/H0;->e(Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/H0;

    throw p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method protected static f()Lcom/google/android/gms/internal/auth/E0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/auth/j1;->f()Lcom/google/android/gms/internal/auth/j1;

    move-result-object v0

    return-object v0
.end method

.method static varargs g(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static h(Lcom/google/android/gms/internal/auth/Z0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/auth/k1;

    const-string v0, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    invoke-direct {p1, p0, v0, p2}, Lcom/google/android/gms/internal/auth/k1;-><init>(Lcom/google/android/gms/internal/auth/Z0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method protected static k(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/C0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/C0;->j()V

    sget-object v0, Lcom/google/android/gms/internal/auth/C0;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static o(Lcom/google/android/gms/internal/auth/C0;[BIILcom/google/android/gms/internal/auth/v0;)Lcom/google/android/gms/internal/auth/C0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->d()Lcom/google/android/gms/internal/auth/C0;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object p2

    new-instance v5, Lcom/google/android/gms/internal/auth/e0;

    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/auth/e0;-><init>(Lcom/google/android/gms/internal/auth/v0;)V

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/l1;->e(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/e0;)V

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/auth/l1;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/auth/H0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/internal/auth/p1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_3

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/H0;->e(Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/H0;

    throw p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/auth/H0;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/auth/H0;

    throw p0

    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/auth/H0;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/auth/H0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/auth/H0;->e(Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/H0;

    throw p2

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/p1;->a()Lcom/google/android/gms/internal/auth/H0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/H0;->e(Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/H0;

    throw p1

    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/H0;->e(Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/H0;

    throw p1
.end method


# virtual methods
.method final a()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/auth/l1;->c(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final synthetic b()Lcom/google/android/gms/internal/auth/Z0;
    .locals 2

    .line 1
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/C0;

    return-object v0
.end method

.method final d()Lcom/google/android/gms/internal/auth/C0;
    .locals 2

    .line 1
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/auth/C0;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/C0;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/auth/C0;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/auth/l1;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/auth/b0;->zza:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->a()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/auth/b0;->zza:I

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->a()I

    move-result v0

    return v0
.end method

.method protected final i()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/auth/l1;->d(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->j()V

    return-void
.end method

.method final j()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    return-void
.end method

.method final l(I)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    const v0, 0x7fffffff

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    return-void
.end method

.method final m()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/auth/b1;->a(Lcom/google/android/gms/internal/auth/Z0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

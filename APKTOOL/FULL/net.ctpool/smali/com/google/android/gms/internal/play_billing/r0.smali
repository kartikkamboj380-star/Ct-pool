.class public abstract Lcom/google/android/gms/internal/play_billing/r0;
.super Lcom/google/android/gms/internal/play_billing/z;
.source "SourceFile"


# static fields
.field private static final zzb:Ljava/util/Map;


# instance fields
.field protected zzc:Lcom/google/android/gms/internal/play_billing/y1;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/r0;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/z;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y1;->c()Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzc:Lcom/google/android/gms/internal/play_billing/y1;

    return-void
.end method

.method static j(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/r0;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/r0;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/r0;

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

    check-cast v1, Lcom/google/android/gms/internal/play_billing/r0;

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

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/H1;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/r0;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/r0;

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

.method protected static m(Lcom/google/android/gms/internal/play_billing/r0;[BLcom/google/android/gms/internal/play_billing/f0;)Lcom/google/android/gms/internal/play_billing/r0;
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Lcom/google/android/gms/internal/play_billing/r0;->z(Lcom/google/android/gms/internal/play_billing/r0;[BIILcom/google/android/gms/internal/play_billing/f0;)Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/play_billing/w1;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/play_billing/w1;-><init>(Lcom/google/android/gms/internal/play_billing/W0;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/w1;->a()Lcom/google/android/gms/internal/play_billing/B0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/B0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/B0;

    throw p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method protected static n()Lcom/google/android/gms/internal/play_billing/w0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/s0;->h()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object v0

    return-object v0
.end method

.method protected static o()Lcom/google/android/gms/internal/play_billing/y0;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/f1;->f()Lcom/google/android/gms/internal/play_billing/f1;

    move-result-object v0

    return-object v0
.end method

.method static varargs p(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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

.method protected static q(Lcom/google/android/gms/internal/play_billing/W0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/g1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/g1;-><init>(Lcom/google/android/gms/internal/play_billing/W0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static t(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/r0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/r0;->s()V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/r0;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected static final v(Lcom/google/android/gms/internal/play_billing/r0;Z)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_0

    return v0

    :cond_0
    if-nez v2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v2

    invoke-interface {v2, p0}, Lcom/google/android/gms/internal/play_billing/h1;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz p1, :cond_3

    if-eq v0, v2, :cond_2

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p0

    :goto_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v2
.end method

.method private final y(Lcom/google/android/gms/internal/play_billing/h1;)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/play_billing/h1;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private static z(Lcom/google/android/gms/internal/play_billing/r0;[BIILcom/google/android/gms/internal/play_billing/f0;)Lcom/google/android/gms/internal/play_billing/r0;
    .locals 6

    .line 1
    if-nez p3, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->l()Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object p2

    new-instance v5, Lcom/google/android/gms/internal/play_billing/D;

    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/play_billing/D;-><init>(Lcom/google/android/gms/internal/play_billing/f0;)V

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/h1;->d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/D;)V

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/play_billing/h1;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/play_billing/B0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/internal/play_billing/w1; {:try_start_0 .. :try_end_0} :catch_1
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
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/B0;->g()Lcom/google/android/gms/internal/play_billing/B0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/B0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/B0;

    throw p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/play_billing/B0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/B0;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/play_billing/B0;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/play_billing/B0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/play_billing/B0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/B0;

    throw p2

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/w1;->a()Lcom/google/android/gms/internal/play_billing/B0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/B0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/B0;

    throw p1

    :goto_2
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/B0;->f(Lcom/google/android/gms/internal/play_billing/W0;)Lcom/google/android/gms/internal/play_billing/B0;

    throw p1
.end method


# virtual methods
.method public final synthetic a()Lcom/google/android/gms/internal/play_billing/V0;
    .locals 2

    .line 1
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/p0;

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/a0;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/b0;->L(Lcom/google/android/gms/internal/play_billing/a0;)Lcom/google/android/gms/internal/play_billing/b0;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/h1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/P1;)V

    return-void
.end method

.method public final c()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/r0;->y(Lcom/google/android/gms/internal/play_billing/h1;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const v3, 0x7fffffff

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/r0;->y(Lcom/google/android/gms/internal/play_billing/h1;)I

    move-result v0

    if-ltz v0, :cond_3

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    :goto_0
    return v0

    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method final d(Lcom/google/android/gms/internal/play_billing/h1;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    if-eqz v0, :cond_1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/play_billing/h1;->c(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/play_billing/h1;->c(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    or-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    return p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return v0
.end method

.method public final synthetic e()Lcom/google/android/gms/internal/play_billing/W0;
    .locals 2

    .line 1
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/r0;

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

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/play_billing/r0;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/h1;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method final g()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/play_billing/h1;->e(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final h()Lcom/google/android/gms/internal/play_billing/p0;
    .locals 2

    .line 1
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/p0;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->w()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/z;->zza:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/z;->zza:I

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->g()I

    move-result v0

    return v0
.end method

.method public final i()Lcom/google/android/gms/internal/play_billing/p0;
    .locals 2

    .line 1
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/p0;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/p0;->g(Lcom/google/android/gms/internal/play_billing/r0;)Lcom/google/android/gms/internal/play_billing/p0;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/play_billing/r0;->v(Lcom/google/android/gms/internal/play_billing/r0;Z)Z

    move-result v0

    return v0
.end method

.method final l()Lcom/google/android/gms/internal/play_billing/r0;
    .locals 2

    .line 1
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/play_billing/r0;->x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/r0;

    return-object v0
.end method

.method protected final r()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e1;->a()Lcom/google/android/gms/internal/play_billing/e1;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/play_billing/h1;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/r0;->s()V

    return-void
.end method

.method final s()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/play_billing/Y0;->a(Lcom/google/android/gms/internal/play_billing/W0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final u(I)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    const v0, 0x7fffffff

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    return-void
.end method

.method final w()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r0;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

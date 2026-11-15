.class final Lcom/google/android/gms/internal/auth/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/l1;


# static fields
.field private static final n:[I

.field private static final o:Lsun/misc/Unsafe;


# instance fields
.field private final a:[I

.field private final b:[Ljava/lang/Object;

.field private final c:I

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/auth/Z0;

.field private final f:[I

.field private final g:I

.field private final h:I

.field private final i:Lcom/google/android/gms/internal/auth/P0;

.field private final j:Lcom/google/android/gms/internal/auth/q1;

.field private final k:Lcom/google/android/gms/internal/auth/w0;

.field private final l:Lcom/google/android/gms/internal/auth/f1;

.field private final m:Lcom/google/android/gms/internal/auth/U0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/auth/d1;->n:[I

    invoke-static {}, Lcom/google/android/gms/internal/auth/B1;->g()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/auth/Z0;IZ[IIILcom/google/android/gms/internal/auth/f1;Lcom/google/android/gms/internal/auth/P0;Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/U0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/auth/d1;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/auth/d1;->d:I

    iput-object p8, p0, Lcom/google/android/gms/internal/auth/d1;->f:[I

    iput p9, p0, Lcom/google/android/gms/internal/auth/d1;->g:I

    iput p10, p0, Lcom/google/android/gms/internal/auth/d1;->h:I

    iput-object p11, p0, Lcom/google/android/gms/internal/auth/d1;->l:Lcom/google/android/gms/internal/auth/f1;

    iput-object p12, p0, Lcom/google/android/gms/internal/auth/d1;->i:Lcom/google/android/gms/internal/auth/P0;

    iput-object p13, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    iput-object p14, p0, Lcom/google/android/gms/internal/auth/d1;->k:Lcom/google/android/gms/internal/auth/w0;

    iput-object p5, p0, Lcom/google/android/gms/internal/auth/d1;->e:Lcom/google/android/gms/internal/auth/Z0;

    iput-object p15, p0, Lcom/google/android/gms/internal/auth/d1;->m:Lcom/google/android/gms/internal/auth/U0;

    return-void
.end method

.method private final A(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final B(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-long v1, v1

    sget-object p2, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private final C(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private static D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static E(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Mutating immutable message: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final F(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    sget-object v1, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    int-to-long v2, v0

    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object p2

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/d1;->H(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final G(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v0, v0, p3

    invoke-direct {p0, p2, v0, p3}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    sget-object v2, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    int-to-long v3, v1

    invoke-virtual {v2, p2, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object p2

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2, p1, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v1}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/auth/d1;->a(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/auth/l1;->zzd()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v1}, Lcom/google/android/gms/internal/auth/l1;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final H(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->t(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/B1;->n(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final a(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->t(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/B1;->n(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final b(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/auth/d1;->H(Ljava/lang/Object;I)V

    return-void
.end method

.method private final i(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/d1;->a(Ljava/lang/Object;II)V

    return-void
.end method

.method private final j(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result p1

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final k(Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->t(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result p2

    and-int v0, p2, v1

    invoke-static {p2}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result p2

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/auth/q0;->n:Lcom/google/android/gms/internal/auth/q0;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/auth/q0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/auth/q0;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/auth/q0;->n:Lcom/google/android/gms/internal/auth/q0;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/auth/q0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->t(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->b(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->a(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final l(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static m(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/l1;)Z
    .locals 2

    .line 1
    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/auth/l1;->g(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static n(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/auth/C0;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/auth/C0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/C0;->m()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private final o(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/d1;->t(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method static q(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/s1;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/auth/C0;

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->a()Lcom/google/android/gms/internal/auth/s1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/auth/s1;->d()Lcom/google/android/gms/internal/auth/s1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/C0;->zzc:Lcom/google/android/gms/internal/auth/s1;

    :cond_0
    return-object v0
.end method

.method static r(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/W0;Lcom/google/android/gms/internal/auth/f1;Lcom/google/android/gms/internal/auth/P0;Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/U0;)Lcom/google/android/gms/internal/auth/d1;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/auth/k1;

    if-eqz v1, :cond_36

    check-cast v0, Lcom/google/android/gms/internal/auth/k1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_0

    const/4 v4, 0x1

    :goto_0
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_1

    move v4, v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x1

    :cond_1
    add-int/lit8 v4, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    add-int/lit8 v9, v9, 0xd

    move v4, v10

    goto :goto_1

    :cond_2
    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    move v4, v10

    :cond_3
    if-nez v7, :cond_4

    sget-object v7, Lcom/google/android/gms/internal/auth/d1;->n:[I

    move v11, v3

    move v12, v11

    move v13, v12

    move v14, v13

    move/from16 v16, v14

    move/from16 v18, v16

    move-object/from16 v17, v7

    move/from16 v7, v18

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_6

    and-int/lit16 v4, v4, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_5

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v10

    goto :goto_2

    :cond_5
    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    move v7, v10

    :cond_6
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_8

    and-int/lit16 v7, v7, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_7

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_3

    :cond_7
    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    move v9, v11

    :cond_8
    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_9

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_4

    :cond_9
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_a
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_c

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_b

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_b
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_c
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_e

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_d
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_e
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_10

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_f
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_10
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_12

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_11
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_12
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_13
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_14
    add-int v16, v14, v12

    add-int v13, v16, v13

    add-int v16, v4, v4

    add-int v16, v16, v7

    new-array v7, v13, [I

    move-object/from16 v17, v7

    move v13, v9

    move/from16 v18, v14

    move v7, v4

    move v14, v10

    move v4, v15

    :goto_a
    sget-object v9, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->c()[Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->a()Lcom/google/android/gms/internal/auth/Z0;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    add-int v19, v18, v12

    add-int v12, v11, v11

    mul-int/lit8 v11, v11, 0x3

    new-array v11, v11, [I

    new-array v12, v12, [Ljava/lang/Object;

    move/from16 v20, v3

    move/from16 v21, v20

    move/from16 v22, v18

    move/from16 v23, v19

    :goto_b
    if-ge v4, v2, :cond_35

    add-int/lit8 v24, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_16

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v3, v24

    const/16 v24, 0xd

    :goto_c
    add-int/lit8 v25, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_15

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v24

    or-int/2addr v4, v3

    add-int/lit8 v24, v24, 0xd

    move/from16 v3, v25

    goto :goto_c

    :cond_15
    shl-int v3, v3, v24

    or-int/2addr v4, v3

    move/from16 v3, v25

    goto :goto_d

    :cond_16
    move/from16 v3, v24

    :goto_d
    add-int/lit8 v24, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v5, :cond_18

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v8, v24

    const/16 v24, 0xd

    :goto_e
    add-int/lit8 v25, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_17

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v24

    or-int/2addr v3, v8

    add-int/lit8 v24, v24, 0xd

    move/from16 v8, v25

    goto :goto_e

    :cond_17
    shl-int v8, v8, v24

    or-int/2addr v3, v8

    move/from16 v8, v25

    goto :goto_f

    :cond_18
    move/from16 v8, v24

    :goto_f
    and-int/lit16 v6, v3, 0x400

    if-eqz v6, :cond_19

    add-int/lit8 v6, v20, 0x1

    aput v21, v17, v20

    move/from16 v20, v6

    :cond_19
    and-int/lit16 v6, v3, 0xff

    const/16 v5, 0x33

    if-lt v6, v5, :cond_22

    add-int/lit8 v5, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    move/from16 v26, v2

    const v2, 0xd800

    if-lt v8, v2, :cond_1b

    and-int/lit16 v8, v8, 0x1fff

    const/16 v29, 0xd

    :goto_10
    add-int/lit8 v30, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v2, :cond_1a

    and-int/lit16 v2, v5, 0x1fff

    shl-int v2, v2, v29

    or-int/2addr v8, v2

    add-int/lit8 v29, v29, 0xd

    move/from16 v5, v30

    const v2, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v2, v5, v29

    or-int/2addr v8, v2

    move/from16 v5, v30

    :cond_1b
    add-int/lit8 v2, v6, -0x33

    move/from16 v29, v5

    const/16 v5, 0x9

    if-eq v2, v5, :cond_1e

    const/16 v5, 0x11

    if-ne v2, v5, :cond_1c

    goto :goto_12

    :cond_1c
    const/16 v5, 0xc

    if-ne v2, v5, :cond_1f

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->zzc()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1d

    and-int/lit16 v2, v3, 0x800

    if-eqz v2, :cond_1f

    :cond_1d
    div-int/lit8 v2, v21, 0x3

    add-int/2addr v2, v2

    add-int/2addr v2, v5

    add-int/lit8 v5, v16, 0x1

    aget-object v16, v10, v16

    aput-object v16, v12, v2

    :goto_11
    move/from16 v16, v5

    goto :goto_13

    :cond_1e
    :goto_12
    div-int/lit8 v2, v21, 0x3

    add-int/2addr v2, v2

    const/4 v5, 0x1

    add-int/2addr v2, v5

    add-int/lit8 v5, v16, 0x1

    aget-object v16, v10, v16

    aput-object v16, v12, v2

    goto :goto_11

    :cond_1f
    :goto_13
    add-int/2addr v8, v8

    aget-object v2, v10, v8

    instance-of v5, v2, Ljava/lang/reflect/Field;

    if-eqz v5, :cond_20

    check-cast v2, Ljava/lang/reflect/Field;

    :goto_14
    move v5, v13

    move/from16 v30, v14

    goto :goto_15

    :cond_20
    check-cast v2, Ljava/lang/String;

    invoke-static {v15, v2}, Lcom/google/android/gms/internal/auth/d1;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    aput-object v2, v10, v8

    goto :goto_14

    :goto_15
    invoke-virtual {v9, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v2, v13

    add-int/lit8 v8, v8, 0x1

    aget-object v13, v10, v8

    instance-of v14, v13, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_21

    check-cast v13, Ljava/lang/reflect/Field;

    goto :goto_16

    :cond_21
    check-cast v13, Ljava/lang/String;

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/auth/d1;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    aput-object v13, v10, v8

    :goto_16
    invoke-virtual {v9, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v8, v13

    move-object/from16 v28, v1

    move/from16 v27, v5

    move/from16 v14, v16

    move/from16 v25, v29

    move/from16 v16, v8

    const/4 v8, 0x0

    goto/16 :goto_22

    :cond_22
    move/from16 v26, v2

    move v5, v13

    move/from16 v30, v14

    add-int/lit8 v2, v16, 0x1

    aget-object v13, v10, v16

    check-cast v13, Ljava/lang/String;

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/auth/d1;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/16 v14, 0x9

    if-eq v6, v14, :cond_23

    const/16 v14, 0x11

    if-ne v6, v14, :cond_24

    :cond_23
    move/from16 v27, v5

    const/4 v5, 0x1

    goto/16 :goto_1b

    :cond_24
    const/16 v14, 0x1b

    if-eq v6, v14, :cond_25

    const/16 v14, 0x31

    if-ne v6, v14, :cond_26

    :cond_25
    move/from16 v27, v5

    const/4 v5, 0x1

    goto :goto_1a

    :cond_26
    const/16 v14, 0xc

    if-eq v6, v14, :cond_2a

    const/16 v14, 0x1e

    if-eq v6, v14, :cond_2a

    const/16 v14, 0x2c

    if-ne v6, v14, :cond_27

    goto :goto_18

    :cond_27
    const/16 v14, 0x32

    if-ne v6, v14, :cond_29

    add-int/lit8 v14, v22, 0x1

    aput v21, v17, v22

    div-int/lit8 v22, v21, 0x3

    add-int/lit8 v27, v16, 0x2

    aget-object v2, v10, v2

    add-int v22, v22, v22

    aput-object v2, v12, v22

    and-int/lit16 v2, v3, 0x800

    if-eqz v2, :cond_28

    add-int/lit8 v22, v22, 0x1

    add-int/lit8 v2, v16, 0x3

    aget-object v16, v10, v27

    aput-object v16, v12, v22

    move/from16 v27, v5

    move/from16 v22, v14

    :goto_17
    const/4 v5, 0x1

    goto :goto_1c

    :cond_28
    move/from16 v22, v14

    move/from16 v2, v27

    :cond_29
    move/from16 v27, v5

    goto :goto_17

    :cond_2a
    :goto_18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->zzc()I

    move-result v14

    move/from16 v27, v5

    const/4 v5, 0x1

    if-eq v14, v5, :cond_2b

    and-int/lit16 v14, v3, 0x800

    if-eqz v14, :cond_2c

    :cond_2b
    div-int/lit8 v14, v21, 0x3

    add-int/2addr v14, v14

    add-int/2addr v14, v5

    add-int/lit8 v16, v16, 0x2

    aget-object v2, v10, v2

    aput-object v2, v12, v14

    :goto_19
    move/from16 v2, v16

    goto :goto_1c

    :goto_1a
    div-int/lit8 v14, v21, 0x3

    add-int/2addr v14, v14

    add-int/2addr v14, v5

    add-int/lit8 v16, v16, 0x2

    aget-object v2, v10, v2

    aput-object v2, v12, v14

    goto :goto_19

    :goto_1b
    div-int/lit8 v14, v21, 0x3

    add-int/2addr v14, v14

    add-int/2addr v14, v5

    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v16

    aput-object v16, v12, v14

    :cond_2c
    :goto_1c
    invoke-virtual {v9, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v13, v13

    and-int/lit16 v14, v3, 0x1000

    const v16, 0xfffff

    if-eqz v14, :cond_30

    const/16 v14, 0x11

    if-gt v6, v14, :cond_30

    add-int/lit8 v14, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const v5, 0xd800

    if-lt v8, v5, :cond_2e

    and-int/lit16 v8, v8, 0x1fff

    const/16 v16, 0xd

    :goto_1d
    add-int/lit8 v25, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_2d

    and-int/lit16 v14, v14, 0x1fff

    shl-int v14, v14, v16

    or-int/2addr v8, v14

    add-int/lit8 v16, v16, 0xd

    move/from16 v14, v25

    goto :goto_1d

    :cond_2d
    shl-int v14, v14, v16

    or-int/2addr v8, v14

    goto :goto_1e

    :cond_2e
    move/from16 v25, v14

    :goto_1e
    add-int v14, v7, v7

    div-int/lit8 v16, v8, 0x20

    add-int v14, v14, v16

    aget-object v5, v10, v14

    move-object/from16 v28, v1

    instance-of v1, v5, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_2f

    check-cast v5, Ljava/lang/reflect/Field;

    :goto_1f
    move v14, v2

    goto :goto_20

    :cond_2f
    check-cast v5, Ljava/lang/String;

    invoke-static {v15, v5}, Lcom/google/android/gms/internal/auth/d1;->D(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    aput-object v5, v10, v14

    goto :goto_1f

    :goto_20
    invoke-virtual {v9, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    rem-int/lit8 v8, v8, 0x20

    move/from16 v16, v1

    goto :goto_21

    :cond_30
    move-object/from16 v28, v1

    move v14, v2

    move/from16 v25, v8

    const/4 v8, 0x0

    :goto_21
    const/16 v1, 0x12

    if-lt v6, v1, :cond_31

    const/16 v1, 0x31

    if-gt v6, v1, :cond_31

    add-int/lit8 v1, v23, 0x1

    aput v13, v17, v23

    move/from16 v23, v1

    :cond_31
    move v2, v13

    :goto_22
    add-int/lit8 v1, v21, 0x1

    aput v4, v11, v21

    add-int/lit8 v4, v21, 0x2

    and-int/lit16 v5, v3, 0x200

    if-eqz v5, :cond_32

    const/high16 v5, 0x20000000

    goto :goto_23

    :cond_32
    const/4 v5, 0x0

    :goto_23
    and-int/lit16 v13, v3, 0x100

    if-eqz v13, :cond_33

    const/high16 v13, 0x10000000

    goto :goto_24

    :cond_33
    const/4 v13, 0x0

    :goto_24
    and-int/lit16 v3, v3, 0x800

    if-eqz v3, :cond_34

    const/high16 v3, -0x80000000

    goto :goto_25

    :cond_34
    const/4 v3, 0x0

    :goto_25
    shl-int/lit8 v6, v6, 0x14

    or-int/2addr v5, v13

    or-int/2addr v3, v5

    or-int/2addr v3, v6

    or-int/2addr v2, v3

    aput v2, v11, v1

    add-int/lit8 v21, v21, 0x3

    shl-int/lit8 v1, v8, 0x14

    or-int v1, v1, v16

    aput v1, v11, v4

    move/from16 v16, v14

    move/from16 v4, v25

    move/from16 v2, v26

    move/from16 v13, v27

    move-object/from16 v1, v28

    move/from16 v14, v30

    const/4 v3, 0x0

    const v5, 0xd800

    goto/16 :goto_b

    :cond_35
    move/from16 v27, v13

    move/from16 v30, v14

    new-instance v1, Lcom/google/android/gms/internal/auth/d1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->a()Lcom/google/android/gms/internal/auth/Z0;

    move-result-object v14

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/k1;->zzc()I

    move-result v15

    const/16 v16, 0x0

    move-object v9, v1

    move-object v10, v11

    move-object v11, v12

    move/from16 v12, v27

    move/from16 v13, v30

    move-object/from16 v20, p2

    move-object/from16 v21, p3

    move-object/from16 v22, p4

    move-object/from16 v23, p5

    move-object/from16 v24, p6

    invoke-direct/range {v9 .. v24}, Lcom/google/android/gms/internal/auth/d1;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/auth/Z0;IZ[IIILcom/google/android/gms/internal/auth/f1;Lcom/google/android/gms/internal/auth/P0;Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/U0;)V

    return-object v1

    :cond_36
    invoke-static/range {p1 .. p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static s(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private final t(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method private final u(II)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v4, v4, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private static v(I)I
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private final w(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method private static x(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private final y(I)Lcom/google/android/gms/internal/auth/D0;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final z(I)Lcom/google/android/gms/internal/auth/l1;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    aget-object v0, v0, p1

    check-cast v0, Lcom/google/android/gms/internal/auth/l1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/i1;->a()Lcom/google/android/gms/internal/auth/i1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/i1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/d1;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v3

    int-to-long v5, v5

    const/16 v7, 0x25

    const/16 v8, 0x20

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_b

    :pswitch_0
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    goto/16 :goto_b

    :pswitch_1
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/d1;->x(Ljava/lang/Object;J)J

    move-result-wide v3

    :goto_5
    sget-object v5, Lcom/google/android/gms/internal/auth/G0;->d:[B

    ushr-long v5, v3, v8

    xor-long/2addr v3, v5

    long-to-int v3, v3

    goto :goto_3

    :pswitch_2
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_6
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/d1;->s(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_3

    :pswitch_3
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_4
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_5
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_6
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_7
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_8
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :pswitch_9
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_a
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :pswitch_b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_3

    :pswitch_c
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_7
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/G0;->a(Z)I

    move-result v3

    goto :goto_3

    :pswitch_d
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_e
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_f
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_6

    :pswitch_10
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_11
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_12
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_3

    :pswitch_13
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_b

    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_5

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_17
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_a

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->t(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_7

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->b(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_8

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->a(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_9

    :cond_1
    :goto_b
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_15
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_18
        :pswitch_b
        :pswitch_17
        :pswitch_8
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/auth/d1;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/auth/C0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/auth/C0;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/auth/C0;->l(I)V

    iput v1, v0, Lcom/google/android/gms/internal/auth/b0;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->j()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v2

    int-to-long v3, v3

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v6, v5

    check-cast v6, Lcom/google/android/gms/internal/auth/T0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/auth/T0;->d()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/d1;->i:Lcom/google/android/gms/internal/auth/P0;

    invoke-virtual {v2, p1, v3, v4}, Lcom/google/android/gms/internal/auth/P0;->a(Ljava/lang/Object;J)V

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v2, v2, v1

    invoke-direct {p0, p1, v2, v1}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/auth/l1;->d(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->c(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/e0;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/auth/d1;->p(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/auth/e0;)I

    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/auth/d1;->E(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    iget-object v3, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v3, v3, v0

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v1

    int-to-long v4, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->G(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_1
    invoke-direct {p0, p2, v3, v0}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/auth/d1;->a(Ljava/lang/Object;II)V

    goto/16 :goto_6

    :pswitch_2
    invoke-direct {p0, p2, v3, v0}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :pswitch_3
    sget v1, Lcom/google/android/gms/internal/auth/n1;->d:I

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/auth/U0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/d1;->i:Lcom/google/android/gms/internal/auth/P0;

    invoke-virtual {v1, p1, p2, v4, v5}, Lcom/google/android/gms/internal/auth/P0;->b(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_6

    :pswitch_5
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->F(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_6
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lcom/google/android/gms/internal/auth/B1;->o(Ljava/lang/Object;JJ)V

    :goto_3
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/d1;->H(Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_4
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->n(Ljava/lang/Object;JI)V

    goto :goto_3

    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_5
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_e
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->t(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->k(Ljava/lang/Object;JZ)V

    goto :goto_3

    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->b(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/auth/B1;->m(Ljava/lang/Object;JF)V

    goto/16 :goto_3

    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/d1;->k(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->a(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lcom/google/android/gms/internal/auth/B1;->l(Ljava/lang/Object;JD)V

    goto/16 :goto_3

    :cond_0
    :goto_6
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/auth/n1;->c(Lcom/google/android/gms/internal/auth/q1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_5
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const/4 v8, 0x0

    const v9, 0xfffff

    move v1, v8

    move v10, v1

    move v0, v9

    :goto_0
    iget v2, v6, Lcom/google/android/gms/internal/auth/d1;->g:I

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    iget-object v2, v6, Lcom/google/android/gms/internal/auth/d1;->f:[I

    aget v11, v2, v10

    iget-object v2, v6, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v12, v2, v11

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v13

    iget-object v2, v6, Lcom/google/android/gms/internal/auth/d1;->a:[I

    add-int/lit8 v4, v11, 0x2

    aget v2, v2, v4

    and-int v4, v2, v9

    ushr-int/lit8 v2, v2, 0x14

    shl-int v14, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v9, :cond_0

    int-to-long v0, v4

    sget-object v2, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v2, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v16, v1

    move v15, v4

    goto :goto_1

    :cond_1
    move v15, v0

    move/from16 v16, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v13

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/d1;->l(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v8

    :cond_3
    :goto_2
    invoke-static {v13}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_9

    const/16 v1, 0x11

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_7

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x44

    if-eq v0, v1, :cond_6

    const/16 v1, 0x31

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v0, v13, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/T0;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/d1;->A(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_6
    invoke-direct {v6, v7, v12, v11}, Lcom/google/android/gms/internal/auth/d1;->o(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/auth/d1;->m(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/l1;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_7
    and-int v0, v13, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v1

    move v2, v8

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/auth/l1;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    return v8

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v15

    move/from16 v4, v16

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/d1;->l(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v0

    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/auth/d1;->m(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/l1;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_a
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move v0, v15

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_b
    return v3
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v3

    int-to-long v5, v5

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/auth/d1;->t(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :pswitch_2
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :pswitch_3
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_4
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_5
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_6
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_7
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_8
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_9
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :pswitch_a
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :pswitch_b
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/n1;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :pswitch_c
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->t(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->t(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_d
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_1

    :pswitch_e
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_1

    :pswitch_f
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->c(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto :goto_1

    :pswitch_10
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_1

    :pswitch_11
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->d(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_1

    :pswitch_12
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->b(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->b(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_1

    goto :goto_1

    :pswitch_13
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/d1;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->a(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/B1;->a(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_1
    :goto_2
    return v1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->j:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/q1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method final p(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/auth/e0;)I
    .locals 38

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v15, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v3, p6

    const/4 v4, 0x3

    const/4 v1, 0x1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/d1;->E(Ljava/lang/Object;)V

    sget-object v14, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    const/4 v13, 0x0

    const/4 v12, -0x1

    move/from16 v8, p3

    move v9, v12

    move v10, v13

    move/from16 v17, v10

    move/from16 v18, v17

    const v16, 0xfffff

    :goto_0
    if-ge v8, v5, :cond_74

    add-int/lit8 v2, v8, 0x1

    aget-byte v8, v15, v8

    if-gez v8, :cond_0

    invoke-static {v8, v15, v2, v3}, Lcom/google/android/gms/internal/auth/f0;->i(I[BILcom/google/android/gms/internal/auth/e0;)I

    move-result v2

    iget v8, v3, Lcom/google/android/gms/internal/auth/e0;->a:I

    :cond_0
    ushr-int/lit8 v11, v8, 0x3

    if-le v11, v9, :cond_2

    div-int/2addr v10, v4

    iget v9, v0, Lcom/google/android/gms/internal/auth/d1;->c:I

    if-lt v11, v9, :cond_1

    iget v9, v0, Lcom/google/android/gms/internal/auth/d1;->d:I

    if-gt v11, v9, :cond_1

    invoke-direct {v0, v11, v10}, Lcom/google/android/gms/internal/auth/d1;->u(II)I

    move-result v9

    goto :goto_1

    :cond_1
    move v9, v12

    :goto_1
    move v10, v9

    goto :goto_2

    :cond_2
    iget v9, v0, Lcom/google/android/gms/internal/auth/d1;->c:I

    if-lt v11, v9, :cond_3

    iget v9, v0, Lcom/google/android/gms/internal/auth/d1;->d:I

    if-gt v11, v9, :cond_3

    invoke-direct {v0, v11, v13}, Lcom/google/android/gms/internal/auth/d1;->u(II)I

    move-result v9

    goto :goto_1

    :cond_3
    move v10, v12

    :goto_2
    if-ne v10, v12, :cond_4

    move/from16 v23, v4

    move v9, v6

    move-object v10, v7

    move/from16 v21, v12

    move v12, v13

    move/from16 v20, v12

    move-object/from16 v35, v14

    move-object v4, v15

    move-object v7, v3

    move v13, v8

    move v8, v1

    move v3, v2

    goto/16 :goto_43

    :cond_4
    and-int/lit8 v9, v8, 0x7

    iget-object v12, v0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    add-int/lit8 v18, v10, 0x1

    aget v13, v12, v18

    invoke-static {v13}, Lcom/google/android/gms/internal/auth/d1;->v(I)I

    move-result v4

    const v18, 0xfffff

    and-int v1, v13, v18

    int-to-long v5, v1

    const/16 v1, 0x11

    const/high16 v18, 0x20000000

    const-wide/16 v25, 0x0

    move/from16 p3, v8

    const-string v8, ""

    if-gt v4, v1, :cond_21

    const/16 v19, 0x2

    add-int/lit8 v1, v10, 0x2

    aget v1, v12, v1

    ushr-int/lit8 v12, v1, 0x14

    const/16 v24, 0x1

    shl-int v27, v24, v12

    const v12, 0xfffff

    and-int/2addr v1, v12

    move-object/from16 v20, v8

    move/from16 v8, v16

    move/from16 v16, v13

    if-eq v1, v8, :cond_7

    if-eq v8, v12, :cond_5

    int-to-long v12, v8

    move/from16 v8, v17

    invoke-virtual {v14, v7, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v12, 0xfffff

    :cond_5
    if-ne v1, v12, :cond_6

    const/16 v17, 0x0

    goto :goto_3

    :cond_6
    int-to-long v12, v1

    invoke-virtual {v14, v7, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move/from16 v17, v8

    :goto_3
    move/from16 v28, v17

    move/from16 v17, v1

    goto :goto_4

    :cond_7
    move/from16 v28, v17

    move/from16 v17, v8

    :goto_4
    packed-switch v4, :pswitch_data_0

    const/4 v4, 0x3

    if-ne v9, v4, :cond_8

    invoke-direct {v0, v7, v10}, Lcom/google/android/gms/internal/auth/d1;->B(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 v5, v11, 0x3

    or-int/lit8 v13, v5, 0x4

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v9

    move/from16 v5, p3

    move-object v8, v1

    move v6, v10

    move-object/from16 v10, p2

    move v12, v11

    move v11, v2

    move v2, v12

    const/16 v21, -0x1

    move/from16 v12, p4

    move-object/from16 p3, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/auth/f0;->l(Ljava/lang/Object;Lcom/google/android/gms/internal/auth/l1;[BIIILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    invoke-direct {v0, v7, v6, v1}, Lcom/google/android/gms/internal/auth/d1;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v1, v28, v27

    move-object/from16 v14, p3

    move v9, v2

    move/from16 v18, v5

    move v10, v6

    move/from16 v16, v17

    move/from16 v12, v21

    const/4 v13, 0x0

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v17, v1

    move/from16 v1, v24

    goto/16 :goto_0

    :cond_8
    move/from16 v5, p3

    move-object/from16 p3, v14

    const/16 v21, -0x1

    move v14, v2

    move-object v12, v3

    move/from16 v20, v4

    move v13, v5

    move/from16 v22, v11

    move/from16 v1, v24

    move v11, v10

    move-object/from16 v10, p3

    goto/16 :goto_15

    :pswitch_0
    move/from16 v13, p3

    move-object/from16 p3, v14

    const/4 v4, 0x3

    const/16 v21, -0x1

    move v14, v11

    move v11, v10

    if-nez v9, :cond_9

    invoke-static {v15, v2, v3}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget-wide v1, v3, Lcom/google/android/gms/internal/auth/e0;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/auth/u0;->b(J)J

    move-result-wide v9

    move/from16 v12, v24

    move-object/from16 v1, p3

    move/from16 v12, v19

    move-object/from16 v2, p1

    move-object v12, v3

    move/from16 v22, v14

    move v14, v4

    move-wide v3, v5

    move-wide v5, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v1, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    move v10, v11

    move-object v3, v12

    move/from16 v18, v13

    move v4, v14

    move/from16 v16, v17

    move/from16 v12, v21

    move/from16 v9, v22

    const/4 v13, 0x0

    move-object/from16 v14, p3

    :goto_5
    move/from16 v17, v1

    :goto_6
    const/4 v1, 0x1

    goto/16 :goto_0

    :cond_9
    move-object v12, v3

    move/from16 v22, v14

    move-object/from16 v10, p3

    move v14, v2

    move/from16 v20, v4

    :cond_a
    :goto_7
    const/4 v1, 0x1

    goto/16 :goto_15

    :pswitch_1
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    move-object/from16 p3, v14

    const/4 v14, 0x3

    const/16 v21, -0x1

    move v11, v10

    if-nez v9, :cond_b

    invoke-static {v15, v2, v12}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget v1, v12, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/u0;->a(I)I

    move-result v1

    move-object/from16 v10, p3

    :goto_8
    invoke-virtual {v10, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v1, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v3, v12

    move/from16 v18, v13

    move v4, v14

    move/from16 v16, v17

    move/from16 v12, v21

    move/from16 v9, v22

    const/4 v13, 0x0

    :goto_9
    move/from16 v17, v1

    move-object v14, v10

    move v10, v11

    goto :goto_6

    :cond_b
    move-object/from16 v10, p3

    :cond_c
    move/from16 v20, v14

    const/4 v1, 0x1

    move v14, v2

    goto/16 :goto_15

    :pswitch_2
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x3

    if-nez v9, :cond_c

    invoke-static {v15, v2, v12}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget v1, v12, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/auth/d1;->y(I)Lcom/google/android/gms/internal/auth/D0;

    goto :goto_8

    :pswitch_3
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    move/from16 v1, v19

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x3

    if-ne v9, v1, :cond_c

    invoke-static {v15, v2, v12}, Lcom/google/android/gms/internal/auth/f0;->a([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget-object v2, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    invoke-virtual {v10, v7, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    or-int v2, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    :goto_a
    move-object v3, v12

    move/from16 v18, v13

    move v4, v14

    move/from16 v16, v17

    move/from16 v12, v21

    move/from16 v9, v22

    const/4 v1, 0x1

    const/4 v13, 0x0

    move/from16 v17, v2

    move-object v14, v10

    move v10, v11

    goto/16 :goto_0

    :pswitch_4
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    move/from16 v1, v19

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x3

    if-ne v9, v1, :cond_c

    invoke-direct {v0, v7, v11}, Lcom/google/android/gms/internal/auth/d1;->B(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v3

    move-object v1, v8

    move v4, v2

    move-object v2, v3

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/auth/l1;[BIILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    invoke-direct {v0, v7, v11, v8}, Lcom/google/android/gms/internal/auth/d1;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v2, v28, v27

    move/from16 v6, p5

    move v8, v1

    goto :goto_a

    :pswitch_5
    move/from16 v13, p3

    move v4, v2

    move-object v12, v3

    move/from16 v22, v11

    move/from16 v1, v19

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x3

    if-ne v9, v1, :cond_1c

    and-int v1, v16, v18

    if-eqz v1, :cond_19

    invoke-static {v15, v4, v12}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v12, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_18

    if-nez v2, :cond_d

    move-object/from16 v3, v20

    iput-object v3, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    move v8, v1

    move/from16 v20, v14

    const/4 v14, 0x0

    goto/16 :goto_11

    :cond_d
    sget v3, Lcom/google/android/gms/internal/auth/F1;->b:I

    array-length v3, v15

    sub-int v4, v3, v1

    or-int v8, v1, v2

    sub-int/2addr v4, v2

    or-int/2addr v4, v8

    if-ltz v4, :cond_17

    add-int v3, v1, v2

    new-array v2, v2, [C

    const/4 v4, 0x0

    :goto_b
    if-ge v1, v3, :cond_14

    aget-byte v8, v15, v1

    invoke-static {v8}, Lcom/google/android/gms/internal/auth/C1;->d(B)Z

    move-result v9

    if-eqz v9, :cond_14

    const/4 v9, 0x1

    add-int/2addr v1, v9

    add-int/lit8 v16, v4, 0x1

    int-to-char v8, v8

    aput-char v8, v2, v4

    move/from16 v4, v16

    goto :goto_b

    :goto_c
    if-ge v1, v3, :cond_16

    add-int/lit8 v8, v1, 0x1

    aget-byte v14, v15, v1

    invoke-static {v14}, Lcom/google/android/gms/internal/auth/C1;->d(B)Z

    move-result v16

    if-eqz v16, :cond_f

    add-int/lit8 v1, v4, 0x1

    int-to-char v14, v14

    aput-char v14, v2, v4

    move v4, v1

    move v1, v8

    :goto_d
    if-ge v1, v3, :cond_e

    aget-byte v8, v15, v1

    invoke-static {v8}, Lcom/google/android/gms/internal/auth/C1;->d(B)Z

    move-result v14

    if-eqz v14, :cond_e

    add-int/2addr v1, v9

    add-int/lit8 v14, v4, 0x1

    int-to-char v8, v8

    aput-char v8, v2, v4

    move v4, v14

    const/4 v9, 0x1

    goto :goto_d

    :cond_e
    :goto_e
    const/4 v9, 0x1

    const/4 v14, 0x3

    goto :goto_c

    :cond_f
    const/16 v9, -0x20

    if-ge v14, v9, :cond_11

    if-ge v8, v3, :cond_10

    const/4 v9, 0x2

    add-int/2addr v1, v9

    aget-byte v8, v15, v8

    const/16 v16, 0x1

    add-int/lit8 v18, v4, 0x1

    invoke-static {v14, v8, v2, v4}, Lcom/google/android/gms/internal/auth/C1;->c(BB[CI)V

    :goto_f
    move/from16 v4, v18

    goto :goto_e

    :cond_10
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_11
    const/16 v9, -0x10

    if-ge v14, v9, :cond_13

    add-int/lit8 v9, v3, -0x1

    if-ge v8, v9, :cond_12

    const/4 v9, 0x2

    add-int/lit8 v16, v1, 0x2

    aget-byte v8, v15, v8

    const/4 v9, 0x3

    add-int/2addr v1, v9

    aget-byte v9, v15, v16

    const/16 v16, 0x1

    add-int/lit8 v18, v4, 0x1

    invoke-static {v14, v8, v9, v2, v4}, Lcom/google/android/gms/internal/auth/C1;->b(BBB[CI)V

    goto :goto_f

    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_13
    add-int/lit8 v9, v3, -0x2

    if-ge v8, v9, :cond_15

    const/4 v9, 0x2

    add-int/lit8 v16, v1, 0x2

    aget-byte v30, v15, v8

    const/16 v20, 0x3

    add-int/lit8 v8, v1, 0x3

    aget-byte v31, v15, v16

    add-int/lit8 v1, v1, 0x4

    aget-byte v32, v15, v8

    move/from16 v29, v14

    move-object/from16 v33, v2

    move/from16 v34, v4

    invoke-static/range {v29 .. v34}, Lcom/google/android/gms/internal/auth/C1;->a(BBBB[CI)V

    const/4 v8, 0x2

    add-int/2addr v4, v8

    move/from16 v14, v20

    :cond_14
    const/4 v9, 0x1

    goto/16 :goto_c

    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_16
    move/from16 v20, v14

    new-instance v1, Ljava/lang/String;

    const/4 v14, 0x0

    invoke-direct {v1, v2, v14, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v1, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    move v8, v3

    goto :goto_11

    :cond_17
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "buffer length=%d, index=%d, size=%d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_18
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_19
    move-object/from16 v3, v20

    move/from16 v20, v14

    const/4 v14, 0x0

    invoke-static {v15, v4, v12}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v12, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_1b

    if-nez v2, :cond_1a

    iput-object v3, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    :goto_10
    move v8, v1

    goto :goto_11

    :cond_1a
    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, v15, v1, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v3, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    add-int/2addr v1, v2

    goto :goto_10

    :goto_11
    iget-object v1, v12, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    invoke-virtual {v10, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_12
    or-int v1, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v3, v12

    move/from16 v18, v13

    move v13, v14

    move/from16 v16, v17

    move/from16 v4, v20

    move/from16 v12, v21

    move/from16 v9, v22

    goto/16 :goto_9

    :cond_1b
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_1c
    move/from16 v20, v14

    :cond_1d
    move v14, v4

    goto/16 :goto_7

    :pswitch_6
    move/from16 v13, p3

    move v4, v2

    move-object v12, v3

    move/from16 v22, v11

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x0

    if-nez v9, :cond_1d

    invoke-static {v15, v4, v12}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget-wide v1, v12, Lcom/google/android/gms/internal/auth/e0;->b:J

    cmp-long v1, v1, v25

    if-eqz v1, :cond_1e

    const/4 v1, 0x1

    goto :goto_13

    :cond_1e
    move v1, v14

    :goto_13
    invoke-static {v7, v5, v6, v1}, Lcom/google/android/gms/internal/auth/B1;->k(Ljava/lang/Object;JZ)V

    goto :goto_12

    :pswitch_7
    move/from16 v13, p3

    move v4, v2

    move-object v12, v3

    move/from16 v22, v11

    const/4 v1, 0x5

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x0

    if-ne v9, v1, :cond_1d

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-virtual {v10, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v8, v4, 0x4

    goto :goto_12

    :pswitch_8
    move/from16 v13, p3

    move v4, v2

    move-object v12, v3

    move/from16 v22, v11

    move/from16 v1, v24

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    const/4 v14, 0x0

    if-ne v9, v1, :cond_1f

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v8

    move-object v1, v10

    move-object/from16 v2, p1

    move v14, v4

    move-wide v3, v5

    move-wide v5, v8

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v8, v14, 0x8

    :goto_14
    or-int v1, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v14, v10

    move v10, v11

    move-object v3, v12

    move/from16 v18, v13

    move/from16 v16, v17

    move/from16 v4, v20

    move/from16 v12, v21

    move/from16 v9, v22

    const/4 v13, 0x0

    goto/16 :goto_5

    :cond_1f
    move v14, v4

    goto/16 :goto_15

    :pswitch_9
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    move v14, v2

    if-nez v9, :cond_a

    invoke-static {v15, v14, v12}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget v1, v12, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-virtual {v10, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_a
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    move v14, v2

    if-nez v9, :cond_a

    invoke-static {v15, v14, v12}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget-wide v3, v12, Lcom/google/android/gms/internal/auth/e0;->b:J

    move-object v1, v10

    move-object/from16 v2, p1

    move-wide/from16 v25, v3

    move-wide v3, v5

    move-wide/from16 v5, v25

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto :goto_14

    :pswitch_b
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    const/4 v1, 0x5

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    move v14, v2

    if-ne v9, v1, :cond_a

    invoke-static {v15, v14}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v7, v5, v6, v1}, Lcom/google/android/gms/internal/auth/B1;->m(Ljava/lang/Object;JF)V

    add-int/lit8 v8, v14, 0x4

    goto :goto_14

    :pswitch_c
    move/from16 v13, p3

    move-object v12, v3

    move/from16 v22, v11

    move/from16 v1, v24

    const/16 v20, 0x3

    const/16 v21, -0x1

    move v11, v10

    move-object v10, v14

    move v14, v2

    if-ne v9, v1, :cond_20

    invoke-static {v15, v14}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v7, v5, v6, v2, v3}, Lcom/google/android/gms/internal/auth/B1;->l(Ljava/lang/Object;JD)V

    add-int/lit8 v8, v14, 0x8

    or-int v2, v28, v27

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v14, v10

    move v10, v11

    move-object v3, v12

    move/from16 v18, v13

    move/from16 v16, v17

    move/from16 v4, v20

    move/from16 v12, v21

    move/from16 v9, v22

    const/4 v13, 0x0

    move/from16 v17, v2

    goto/16 :goto_0

    :cond_20
    :goto_15
    move/from16 v9, p5

    move v8, v1

    move-object/from16 v35, v10

    move v3, v14

    move-object v4, v15

    move/from16 v16, v17

    move/from16 v23, v20

    move/from16 v17, v28

    const/16 v20, 0x0

    move-object v10, v7

    move-object v7, v12

    move v12, v11

    move/from16 v11, v22

    goto/16 :goto_43

    :cond_21
    move/from16 v22, v11

    move-object v1, v12

    const/16 v20, 0x3

    const/16 v21, -0x1

    move-object v12, v3

    move-object v3, v8

    move v11, v10

    move-object v10, v14

    move/from16 v8, v16

    move v14, v2

    move/from16 v16, v13

    move/from16 v13, p3

    const/16 v2, 0x1b

    const/16 v23, 0xa

    if-ne v4, v2, :cond_25

    const/4 v2, 0x2

    if-ne v9, v2, :cond_24

    invoke-virtual {v10, v7, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/E0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/auth/E0;->zzc()Z

    move-result v3

    if-nez v3, :cond_23

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_22

    :goto_16
    move/from16 v3, v23

    goto :goto_17

    :cond_22
    add-int v23, v3, v3

    goto :goto_16

    :goto_17
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/auth/E0;->g(I)Lcom/google/android/gms/internal/auth/E0;

    move-result-object v1

    invoke-virtual {v10, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_23
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v3

    move/from16 v19, v8

    move-object v8, v3

    move v9, v13

    move-object v3, v10

    move-object/from16 v10, p2

    move v4, v11

    move v11, v14

    move v5, v2

    move-object v2, v12

    move/from16 v12, p4

    move v6, v13

    move-object v13, v1

    move/from16 v15, v20

    move/from16 v1, v22

    const/16 v20, 0x0

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/auth/f0;->e(Lcom/google/android/gms/internal/auth/l1;I[BIILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    move/from16 v5, p4

    move v9, v1

    move-object v14, v3

    move v10, v4

    move/from16 v18, v6

    move v4, v15

    move/from16 v16, v19

    move/from16 v13, v20

    move/from16 v12, v21

    const/4 v1, 0x1

    move-object/from16 v15, p2

    move/from16 v6, p5

    move-object v3, v2

    goto/16 :goto_0

    :cond_24
    move/from16 v19, v8

    move/from16 v15, v20

    const/16 v20, 0x0

    move v15, v2

    move-object/from16 v35, v10

    move v10, v11

    move/from16 v11, v22

    const/4 v1, 0x1

    move-object/from16 v2, p2

    move/from16 v37, v14

    move-object v14, v7

    move-object v7, v12

    move/from16 v12, v37

    goto/16 :goto_32

    :cond_25
    move/from16 v19, v8

    move-object v2, v12

    move v12, v13

    move/from16 v15, v20

    const/16 v20, 0x0

    move-object v13, v10

    move v10, v11

    move/from16 v11, v22

    const/16 v8, 0x31

    const/16 v27, 0x0

    if-gt v4, v8, :cond_64

    move/from16 v8, v16

    int-to-long v1, v8

    sget-object v8, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v8, v7, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v15, v16

    check-cast v15, Lcom/google/android/gms/internal/auth/E0;

    invoke-interface {v15}, Lcom/google/android/gms/internal/auth/E0;->zzc()Z

    move-result v16

    if-nez v16, :cond_27

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v16

    if-nez v16, :cond_26

    :goto_18
    move/from16 p3, v11

    move/from16 v11, v23

    goto :goto_19

    :cond_26
    add-int v23, v16, v16

    goto :goto_18

    :goto_19
    invoke-interface {v15, v11}, Lcom/google/android/gms/internal/auth/E0;->g(I)Lcom/google/android/gms/internal/auth/E0;

    move-result-object v11

    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v15, v11

    goto :goto_1a

    :cond_27
    move/from16 p3, v11

    :goto_1a
    packed-switch v4, :pswitch_data_1

    const/4 v8, 0x3

    if-ne v9, v8, :cond_2b

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v9

    and-int/lit8 v1, v12, -0x8

    or-int/lit8 v11, v1, 0x4

    move-object v1, v9

    move-object/from16 v6, p6

    const/4 v5, 0x1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move v7, v5

    move v5, v11

    move-object v7, v6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->c(Lcom/google/android/gms/internal/auth/l1;[BIIILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget-object v2, v7, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v6, p4

    :goto_1b
    if-ge v1, v6, :cond_29

    move v5, v8

    move-object/from16 v8, p2

    invoke-static {v8, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v3

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ne v12, v2, :cond_28

    move-object v1, v9

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v5, v11

    move-object/from16 v16, v13

    move v13, v6

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->c(Lcom/google/android/gms/internal/auth/l1;[BIIILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget-object v2, v7, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v6, v13

    move-object/from16 v13, v16

    const/4 v8, 0x3

    goto :goto_1b

    :cond_28
    :goto_1c
    move-object/from16 v16, v13

    move v13, v6

    goto :goto_1d

    :cond_29
    move-object/from16 v8, p2

    goto :goto_1c

    :cond_2a
    :goto_1d
    move/from16 v11, p3

    move v3, v1

    move-object v2, v8

    move-object/from16 v35, v16

    const/4 v1, 0x1

    const/4 v8, 0x2

    move/from16 v37, v13

    move v13, v12

    move v12, v14

    move/from16 v14, v37

    goto/16 :goto_31

    :cond_2b
    move-object/from16 v7, p6

    move-object/from16 v2, p2

    move/from16 v11, p3

    move-object/from16 v35, v13

    const/4 v1, 0x1

    const/4 v8, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    goto/16 :goto_30

    :pswitch_d
    move-object/from16 v8, p2

    move-object/from16 v7, p6

    move-object/from16 v16, v13

    const/4 v1, 0x2

    move/from16 v13, p4

    if-ne v9, v1, :cond_2e

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_2d

    if-ne v1, v2, :cond_2c

    goto :goto_1d

    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_2d
    invoke-static {v8, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    iget-wide v1, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/auth/u0;->b(J)J

    throw v27

    :cond_2e
    if-eqz v9, :cond_30

    :cond_2f
    :goto_1e
    move/from16 v11, p3

    move-object v2, v8

    move-object/from16 v35, v16

    const/4 v1, 0x1

    const/4 v8, 0x2

    :goto_1f
    move/from16 v37, v13

    move v13, v12

    move v12, v14

    move/from16 v14, v37

    goto/16 :goto_30

    :cond_30
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    iget-wide v1, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/auth/u0;->b(J)J

    throw v27

    :pswitch_e
    move-object/from16 v8, p2

    move-object/from16 v7, p6

    move-object/from16 v16, v13

    const/4 v1, 0x2

    move/from16 v13, p4

    if-ne v9, v1, :cond_33

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_32

    if-ne v1, v2, :cond_31

    goto :goto_1d

    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_32
    invoke-static {v8, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    iget v1, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/u0;->a(I)I

    throw v27

    :cond_33
    if-eqz v9, :cond_34

    goto :goto_1e

    :cond_34
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    iget v1, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/u0;->a(I)I

    throw v27

    :pswitch_f
    move-object/from16 v8, p2

    move-object/from16 v7, p6

    move-object/from16 v16, v13

    const/4 v1, 0x2

    move/from16 v13, p4

    if-ne v9, v1, :cond_35

    invoke-static {v8, v14, v15, v7}, Lcom/google/android/gms/internal/auth/f0;->f([BILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    goto :goto_20

    :cond_35
    if-nez v9, :cond_2f

    move v1, v12

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move-object v5, v15

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->j(I[BIILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    :goto_20
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->y(I)Lcom/google/android/gms/internal/auth/D0;

    sget v2, Lcom/google/android/gms/internal/auth/n1;->d:I

    goto/16 :goto_1d

    :pswitch_10
    move-object/from16 v8, p2

    move-object/from16 v7, p6

    move-object/from16 v16, v13

    const/4 v1, 0x2

    move/from16 v13, p4

    if-ne v9, v1, :cond_3b

    invoke-static {v8, v14, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_3a

    array-length v3, v8

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_39

    if-nez v2, :cond_36

    :goto_21
    sget-object v2, Lcom/google/android/gms/internal/auth/q0;->n:Lcom/google/android/gms/internal/auth/q0;

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_36
    invoke-static {v8, v1, v2}, Lcom/google/android/gms/internal/auth/q0;->q([BII)Lcom/google/android/gms/internal/auth/q0;

    move-result-object v3

    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v2

    :goto_22
    if-ge v1, v13, :cond_2a

    invoke-static {v8, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v2

    iget v3, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ne v12, v3, :cond_2a

    invoke-static {v8, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_38

    array-length v3, v8

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_37

    if-nez v2, :cond_36

    goto :goto_21

    :cond_37
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_39
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_3b
    move/from16 v11, p3

    move-object v2, v8

    move-object/from16 v35, v16

    :goto_23
    move v8, v1

    const/4 v1, 0x1

    goto/16 :goto_1f

    :pswitch_11
    move-object/from16 v8, p2

    move-object/from16 v7, p6

    move-object/from16 v16, v13

    const/4 v1, 0x2

    move/from16 v13, p4

    if-ne v9, v1, :cond_3c

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v2

    move v5, v1

    move-object v6, v8

    move-object v8, v2

    move v9, v12

    move v4, v10

    move-object/from16 v10, p2

    move/from16 v1, p3

    move v11, v14

    move v2, v12

    move/from16 v12, p4

    move v3, v13

    move-object/from16 v35, v16

    move-object v13, v15

    move v15, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/auth/f0;->e(Lcom/google/android/gms/internal/auth/l1;I[BIILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    move v11, v1

    move v13, v2

    move v14, v3

    move v10, v4

    move-object v2, v6

    move v3, v8

    move v12, v15

    const/4 v1, 0x1

    move v8, v5

    goto/16 :goto_31

    :cond_3c
    move-object/from16 v35, v16

    move/from16 v11, p3

    move-object v2, v8

    goto :goto_23

    :pswitch_12
    move-object/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move v4, v10

    move-object/from16 v35, v13

    const/4 v5, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v5, :cond_49

    const-wide/32 v8, 0x20000000

    and-long/2addr v1, v8

    cmp-long v1, v1, v25

    if-nez v1, :cond_42

    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_41

    if-nez v2, :cond_3d

    :goto_24
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_3d
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v6, v1, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_25
    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v2

    :goto_26
    if-ge v1, v14, :cond_40

    invoke-static {v6, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v2

    iget v8, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ne v13, v8, :cond_40

    invoke-static {v6, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_3f

    if-nez v2, :cond_3e

    goto :goto_24

    :cond_3e
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v6, v1, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_25

    :cond_3f
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_40
    :goto_27
    move v3, v1

    move v10, v4

    move v8, v5

    move-object v2, v6

    :goto_28
    const/4 v1, 0x1

    goto/16 :goto_31

    :cond_41
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_42
    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_48

    if-nez v2, :cond_43

    :goto_29
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_43
    add-int v8, v1, v2

    invoke-static {v6, v1, v8}, Lcom/google/android/gms/internal/auth/F1;->c([BII)Z

    move-result v9

    if-eqz v9, :cond_47

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v6, v1, v2, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_2a
    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v8

    :goto_2b
    if-ge v1, v14, :cond_40

    invoke-static {v6, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v2

    iget v8, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ne v13, v8, :cond_40

    invoke-static {v6, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-ltz v2, :cond_46

    if-nez v2, :cond_44

    goto :goto_29

    :cond_44
    add-int v8, v1, v2

    invoke-static {v6, v1, v8}, Lcom/google/android/gms/internal/auth/F1;->c([BII)Z

    move-result v9

    if-eqz v9, :cond_45

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v6, v1, v2, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_2a

    :cond_45
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_46
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_47
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_48
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->c()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_49
    :goto_2c
    move v10, v4

    move v8, v5

    move-object v2, v6

    :goto_2d
    const/4 v1, 0x1

    goto/16 :goto_30

    :pswitch_13
    move-object/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move v4, v10

    move-object/from16 v35, v13

    const/4 v5, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v5, :cond_4c

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_4b

    if-ne v1, v2, :cond_4a

    goto/16 :goto_27

    :cond_4a
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_4b
    invoke-static {v6, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    throw v27

    :cond_4c
    if-eqz v9, :cond_4d

    goto :goto_2c

    :cond_4d
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    iget-wide v1, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    throw v27

    :pswitch_14
    move-object/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move v4, v10

    move-object/from16 v35, v13

    const/4 v5, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v5, :cond_50

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_4f

    if-ne v1, v2, :cond_4e

    goto/16 :goto_27

    :cond_4e
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_4f
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    throw v27

    :cond_50
    const/4 v1, 0x5

    if-eq v9, v1, :cond_51

    goto :goto_2c

    :cond_51
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    throw v27

    :pswitch_15
    move-object/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move v4, v10

    move-object/from16 v35, v13

    const/4 v5, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v5, :cond_54

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_53

    if-ne v1, v2, :cond_52

    goto/16 :goto_27

    :cond_52
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_53
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    throw v27

    :cond_54
    const/4 v1, 0x1

    if-eq v9, v1, :cond_55

    move v10, v4

    move v8, v5

    move-object v2, v6

    goto/16 :goto_30

    :cond_55
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v6, v12}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    throw v27

    :pswitch_16
    move-object/from16 v6, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move v4, v10

    move-object/from16 v35, v13

    const/4 v5, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v5, :cond_56

    invoke-static {v6, v12, v15, v7}, Lcom/google/android/gms/internal/auth/f0;->f([BILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    goto/16 :goto_27

    :cond_56
    if-nez v9, :cond_49

    move v1, v13

    move-object/from16 v2, p2

    move v3, v12

    move v10, v4

    move/from16 v4, p4

    move v8, v5

    move-object v5, v15

    move-object v9, v6

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->j(I[BIILcom/google/android/gms/internal/auth/E0;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    move v3, v1

    move-object v2, v9

    goto/16 :goto_28

    :pswitch_17
    move-object/from16 v2, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move-object/from16 v35, v13

    const/4 v8, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v8, :cond_59

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v3, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v3, v1

    if-lt v1, v3, :cond_58

    if-ne v1, v3, :cond_57

    :goto_2e
    move v3, v1

    goto/16 :goto_28

    :cond_57
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_58
    invoke-static {v2, v1, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    throw v27

    :cond_59
    if-eqz v9, :cond_5a

    :goto_2f
    goto/16 :goto_2d

    :cond_5a
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    iget-wide v1, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    throw v27

    :pswitch_18
    move-object/from16 v2, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move-object/from16 v35, v13

    const/4 v8, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v8, :cond_5d

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v3, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v3, v1

    if-lt v1, v3, :cond_5c

    if-ne v1, v3, :cond_5b

    goto :goto_2e

    :cond_5b
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_5c
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    throw v27

    :cond_5d
    const/4 v1, 0x5

    if-eq v9, v1, :cond_5e

    goto :goto_2f

    :cond_5e
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    throw v27

    :pswitch_19
    move-object/from16 v2, p2

    move/from16 v11, p3

    move-object/from16 v7, p6

    move-object/from16 v35, v13

    const/4 v8, 0x2

    move v13, v12

    move v12, v14

    move/from16 v14, p4

    if-ne v9, v8, :cond_61

    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v3, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    add-int/2addr v3, v1

    if-lt v1, v3, :cond_60

    if-ne v1, v3, :cond_5f

    goto :goto_2e

    :cond_5f
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->f()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_60
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    throw v27

    :cond_61
    const/4 v1, 0x1

    if-eq v9, v1, :cond_63

    :goto_30
    move v3, v12

    :goto_31
    if-eq v3, v12, :cond_62

    move/from16 v6, p5

    move-object v15, v2

    move v8, v3

    move-object v3, v7

    move v9, v11

    move/from16 v18, v13

    move v5, v14

    move/from16 v16, v19

    move/from16 v13, v20

    move/from16 v12, v21

    move-object/from16 v14, v35

    const/4 v4, 0x3

    move-object/from16 v7, p1

    goto/16 :goto_0

    :cond_62
    move/from16 v9, p5

    move v8, v1

    move-object v4, v2

    move v12, v10

    move/from16 v16, v19

    const/16 v23, 0x3

    move-object/from16 v10, p1

    goto/16 :goto_43

    :cond_63
    invoke-static {v15}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    invoke-static {v2, v12}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    throw v27

    :cond_64
    move-object v7, v2

    move-object/from16 v35, v13

    move/from16 v8, v16

    const/4 v15, 0x2

    move-object/from16 v2, p2

    move v13, v12

    move v12, v14

    const/16 v14, 0x32

    if-ne v4, v14, :cond_67

    if-ne v9, v15, :cond_66

    sget-object v1, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->A(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v14, p1

    invoke-virtual {v1, v14, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/google/android/gms/internal/auth/T0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/auth/T0;->g()Z

    move-result v4

    if-nez v4, :cond_65

    invoke-static {}, Lcom/google/android/gms/internal/auth/T0;->a()Lcom/google/android/gms/internal/auth/T0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/auth/T0;->b()Lcom/google/android/gms/internal/auth/T0;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/auth/U0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v14, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_65
    invoke-static {v2}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v27

    :cond_66
    move-object/from16 v14, p1

    const/4 v1, 0x1

    :goto_32
    move/from16 v9, p5

    move v8, v1

    move-object v4, v2

    move v3, v12

    move/from16 v16, v19

    const/16 v23, 0x3

    move v12, v10

    move-object v10, v14

    goto/16 :goto_43

    :cond_67
    move-object/from16 v14, p1

    add-int/lit8 v16, v10, 0x2

    sget-object v15, Lcom/google/android/gms/internal/auth/d1;->o:Lsun/misc/Unsafe;

    aget v1, v1, v16

    move-object/from16 v16, v3

    const v3, 0xfffff

    and-int/2addr v1, v3

    move-wide/from16 v23, v5

    int-to-long v5, v1

    packed-switch v4, :pswitch_data_2

    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    :goto_33
    const/4 v8, 0x1

    const/16 v23, 0x3

    move v12, v10

    move-object v10, v14

    goto/16 :goto_40

    :pswitch_1a
    const/4 v4, 0x3

    if-ne v9, v4, :cond_68

    invoke-direct {v0, v14, v11, v10}, Lcom/google/android/gms/internal/auth/d1;->C(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    and-int/lit8 v5, v13, -0x8

    or-int/lit8 v5, v5, 0x4

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v9

    move-object v8, v1

    move v6, v10

    move-object/from16 v10, p2

    move v15, v11

    move v11, v12

    move v4, v12

    move/from16 v12, p4

    move/from16 v36, v13

    move v13, v5

    move-object v5, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/auth/f0;->l(Ljava/lang/Object;Lcom/google/android/gms/internal/auth/l1;[BIIILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    invoke-direct {v0, v5, v15, v6, v1}, Lcom/google/android/gms/internal/auth/d1;->i(Ljava/lang/Object;IILjava/lang/Object;)V

    move-object v10, v5

    move v12, v6

    move v1, v8

    move v11, v15

    :goto_34
    const/4 v8, 0x1

    const/16 v23, 0x3

    move/from16 v37, v4

    move-object v4, v2

    move/from16 v2, v37

    goto/16 :goto_41

    :cond_68
    move/from16 v36, v13

    move-object v4, v2

    move v2, v12

    goto :goto_33

    :pswitch_1b
    move v4, v12

    move/from16 v36, v13

    move v12, v10

    move-object v10, v14

    if-nez v9, :cond_69

    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/auth/u0;->b(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    move-wide/from16 v13, v23

    :goto_35
    invoke-virtual {v15, v10, v13, v14, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v10, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_34

    :cond_69
    const/4 v8, 0x1

    const/16 v23, 0x3

    :goto_36
    move/from16 v37, v4

    move-object v4, v2

    move/from16 v2, v37

    goto/16 :goto_40

    :pswitch_1c
    move v4, v12

    move/from16 v36, v13

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    if-nez v9, :cond_69

    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v8, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-static {v8}, Lcom/google/android/gms/internal/auth/u0;->a(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_35

    :pswitch_1d
    move v4, v12

    move/from16 v36, v13

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    if-nez v9, :cond_69

    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v8, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/auth/d1;->y(I)Lcom/google/android/gms/internal/auth/D0;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_35

    :pswitch_1e
    move v4, v12

    move/from16 v36, v13

    const/4 v1, 0x2

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    if-ne v9, v1, :cond_69

    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/auth/f0;->a([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v8

    iget-object v9, v7, Lcom/google/android/gms/internal/auth/e0;->c:Ljava/lang/Object;

    invoke-virtual {v15, v10, v13, v14, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v10, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v1, v8

    goto :goto_34

    :pswitch_1f
    move v4, v12

    move/from16 v36, v13

    const/4 v1, 0x2

    move v12, v10

    move-object v10, v14

    if-ne v9, v1, :cond_6a

    invoke-direct {v0, v10, v11, v12}, Lcom/google/android/gms/internal/auth/d1;->C(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/auth/d1;->z(I)Lcom/google/android/gms/internal/auth/l1;

    move-result-object v5

    move-object v1, v8

    move-object v9, v2

    move-object v2, v5

    move v13, v3

    move-object/from16 v3, p2

    move v14, v4

    const/16 v23, 0x3

    move/from16 v5, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/auth/l1;[BIILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    invoke-direct {v0, v10, v11, v12, v8}, Lcom/google/android/gms/internal/auth/d1;->i(Ljava/lang/Object;IILjava/lang/Object;)V

    move-object v4, v9

    move v2, v14

    :goto_37
    const/4 v8, 0x1

    goto/16 :goto_41

    :cond_6a
    const/16 v23, 0x3

    const/4 v8, 0x1

    goto :goto_36

    :pswitch_20
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v1, 0x2

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-ne v9, v1, :cond_6e

    invoke-static {v4, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v9

    iget v1, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    if-nez v1, :cond_6b

    move-object/from16 v3, v16

    invoke-virtual {v15, v10, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_39

    :cond_6b
    and-int v3, v8, v18

    if-eqz v3, :cond_6d

    add-int v3, v9, v1

    invoke-static {v4, v9, v3}, Lcom/google/android/gms/internal/auth/F1;->c([BII)Z

    move-result v3

    if-eqz v3, :cond_6c

    goto :goto_38

    :cond_6c
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->b()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_6d
    :goto_38
    new-instance v3, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/auth/G0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v9, v1, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v15, v10, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v9, v1

    :goto_39
    invoke-virtual {v15, v10, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v1, v9

    goto :goto_37

    :cond_6e
    const/4 v8, 0x1

    goto/16 :goto_40

    :pswitch_21
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-nez v9, :cond_6e

    invoke-static {v4, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    cmp-long v3, v8, v25

    if-eqz v3, :cond_6f

    const/4 v3, 0x1

    goto :goto_3a

    :cond_6f
    move/from16 v3, v20

    :goto_3a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_3b
    invoke-virtual {v15, v10, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_3c
    invoke-virtual {v15, v10, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_37

    :pswitch_22
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v1, 0x5

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-ne v9, v1, :cond_6e

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_3d
    invoke-virtual {v15, v10, v13, v14, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v1, v2, 0x4

    goto :goto_3c

    :pswitch_23
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v8, 0x1

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-ne v9, v8, :cond_70

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_3e
    invoke-virtual {v15, v10, v13, v14, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v1, v2, 0x8

    :goto_3f
    invoke-virtual {v15, v10, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_41

    :pswitch_24
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v8, 0x1

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-nez v9, :cond_70

    invoke-static {v4, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->h([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget v3, v7, Lcom/google/android/gms/internal/auth/e0;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v10, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3f

    :pswitch_25
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v8, 0x1

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-nez v9, :cond_70

    invoke-static {v4, v2, v7}, Lcom/google/android/gms/internal/auth/f0;->k([BILcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/e0;->b:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_3b

    :pswitch_26
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v1, 0x5

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-ne v9, v1, :cond_6e

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/auth/f0;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_3d

    :pswitch_27
    move-object v4, v2

    move v2, v12

    move/from16 v36, v13

    const/4 v8, 0x1

    move v12, v10

    move-object v10, v14

    move-wide/from16 v13, v23

    const/16 v23, 0x3

    if-ne v9, v8, :cond_70

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/auth/f0;->n([BI)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_3e

    :cond_70
    :goto_40
    move v1, v2

    :goto_41
    if-eq v1, v2, :cond_71

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v15, v4

    move-object v3, v7

    move-object v7, v10

    move v9, v11

    move v10, v12

    move/from16 v16, v19

    move/from16 v13, v20

    move/from16 v12, v21

    move/from16 v4, v23

    move-object/from16 v14, v35

    move/from16 v18, v36

    :goto_42
    move/from16 v37, v8

    move v8, v1

    move/from16 v1, v37

    goto/16 :goto_0

    :cond_71
    move/from16 v9, p5

    move v3, v1

    move/from16 v16, v19

    move/from16 v13, v36

    :goto_43
    if-ne v13, v9, :cond_73

    if-nez v9, :cond_72

    goto :goto_44

    :cond_72
    move v1, v8

    move/from16 v2, v16

    const v15, 0xfffff

    move v8, v3

    move/from16 v3, v17

    goto :goto_45

    :cond_73
    :goto_44
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/d1;->q(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/s1;

    move-result-object v5

    const/4 v14, 0x2

    move v1, v13

    move-object/from16 v2, p2

    const v15, 0xfffff

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/auth/f0;->g(I[BIILcom/google/android/gms/internal/auth/s1;Lcom/google/android/gms/internal/auth/e0;)I

    move-result v1

    move-object/from16 v15, p2

    move/from16 v5, p4

    move-object v3, v7

    move v6, v9

    move-object v7, v10

    move v9, v11

    move v10, v12

    move/from16 v18, v13

    move/from16 v13, v20

    move/from16 v12, v21

    move/from16 v4, v23

    move-object/from16 v14, v35

    goto :goto_42

    :cond_74
    move v9, v6

    move-object v10, v7

    move-object/from16 v35, v14

    move/from16 v19, v16

    const v15, 0xfffff

    move/from16 v3, v17

    move/from16 v13, v18

    move/from16 v2, v19

    :goto_45
    if-eq v2, v15, :cond_75

    int-to-long v4, v2

    move-object/from16 v2, v35

    invoke-virtual {v2, v10, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_75
    iget v2, v0, Lcom/google/android/gms/internal/auth/d1;->g:I

    :goto_46
    iget v3, v0, Lcom/google/android/gms/internal/auth/d1;->h:I

    if-ge v2, v3, :cond_77

    iget-object v3, v0, Lcom/google/android/gms/internal/auth/d1;->f:[I

    aget v3, v3, v2

    iget-object v4, v0, Lcom/google/android/gms/internal/auth/d1;->a:[I

    aget v4, v4, v3

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/auth/d1;->w(I)I

    move-result v4

    and-int/2addr v4, v15

    int-to-long v4, v4

    invoke-static {v10, v4, v5}, Lcom/google/android/gms/internal/auth/B1;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_76

    goto :goto_47

    :cond_76
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/auth/d1;->y(I)Lcom/google/android/gms/internal/auth/D0;

    :goto_47
    add-int/2addr v2, v1

    goto :goto_46

    :cond_77
    move/from16 v1, p4

    if-nez v9, :cond_79

    if-ne v8, v1, :cond_78

    goto :goto_48

    :cond_78
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->d()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :cond_79
    if-gt v8, v1, :cond_7a

    if-ne v13, v9, :cond_7a

    :goto_48
    return v8

    :cond_7a
    invoke-static {}, Lcom/google/android/gms/internal/auth/H0;->d()Lcom/google/android/gms/internal/auth/H0;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d1;->e:Lcom/google/android/gms/internal/auth/Z0;

    check-cast v0, Lcom/google/android/gms/internal/auth/C0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->d()Lcom/google/android/gms/internal/auth/C0;

    move-result-object v0

    return-object v0
.end method

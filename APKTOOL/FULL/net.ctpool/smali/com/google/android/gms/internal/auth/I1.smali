.class public final Lcom/google/android/gms/internal/auth/I1;
.super Lcom/google/android/gms/internal/auth/C0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/a1;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/auth/I1;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/auth/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/I1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/I1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/I1;->zzb:Lcom/google/android/gms/internal/auth/I1;

    const-class v1, Lcom/google/android/gms/internal/auth/I1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/C0;->k(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/C0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/C0;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/auth/C0;->f()Lcom/google/android/gms/internal/auth/E0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/I1;->zzd:Lcom/google/android/gms/internal/auth/E0;

    return-void
.end method

.method static synthetic p()Lcom/google/android/gms/internal/auth/I1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/I1;->zzb:Lcom/google/android/gms/internal/auth/I1;

    return-object v0
.end method

.method public static q([B)Lcom/google/android/gms/internal/auth/I1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/I1;->zzb:Lcom/google/android/gms/internal/auth/I1;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/auth/C0;->e(Lcom/google/android/gms/internal/auth/C0;[B)Lcom/google/android/gms/internal/auth/C0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/auth/I1;

    return-object p0
.end method


# virtual methods
.method protected final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/auth/I1;->zzb:Lcom/google/android/gms/internal/auth/I1;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/auth/H1;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/auth/H1;-><init>(Lcom/google/android/gms/internal/auth/G1;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/auth/I1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/auth/I1;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzd"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/auth/I1;->zzb:Lcom/google/android/gms/internal/auth/I1;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/auth/C0;->h(Lcom/google/android/gms/internal/auth/Z0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/I1;->zzd:Lcom/google/android/gms/internal/auth/E0;

    return-object v0
.end method

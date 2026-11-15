.class public final Lcom/google/android/gms/internal/play_billing/w2;
.super Lcom/google/android/gms/internal/play_billing/r0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/X0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/w2;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:Lcom/google/android/gms/internal/play_billing/m2;

.field private zzh:Lcom/google/android/gms/internal/play_billing/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/w2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/w2;->zzb:Lcom/google/android/gms/internal/play_billing/w2;

    const-class v1, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/r0;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/r0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/r0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/w2;->zze:I

    return-void
.end method

.method static synthetic A(Lcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/D2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzf:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zze:I

    return-void
.end method

.method static synthetic B(Lcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/m2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzg:Lcom/google/android/gms/internal/play_billing/m2;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzd:I

    return-void
.end method

.method static synthetic C(Lcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/S1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzf:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zze:I

    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/W1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zzf:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/w2;->zze:I

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/play_billing/v2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/w2;->zzb:Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->h()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/v2;

    return-object v0
.end method

.method static synthetic F()Lcom/google/android/gms/internal/play_billing/w2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/w2;->zzb:Lcom/google/android/gms/internal/play_billing/w2;

    return-object v0
.end method


# virtual methods
.method protected final x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    sget-object p1, Lcom/google/android/gms/internal/play_billing/w2;->zzb:Lcom/google/android/gms/internal/play_billing/w2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/v2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/v2;-><init>(Lcom/google/android/gms/internal/play_billing/u2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/w2;-><init>()V

    return-object p1

    :cond_3
    const-class v7, Lcom/google/android/gms/internal/play_billing/j2;

    const-string v8, "zzh"

    const-string v0, "zzf"

    const-string v1, "zze"

    const-string v2, "zzd"

    const-string v3, "zzg"

    const-class v4, Lcom/google/android/gms/internal/play_billing/S1;

    const-class v5, Lcom/google/android/gms/internal/play_billing/W1;

    const-class v6, Lcom/google/android/gms/internal/play_billing/D2;

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/w2;->zzb:Lcom/google/android/gms/internal/play_billing/w2;

    const-string p3, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u1009\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/r0;->q(Lcom/google/android/gms/internal/play_billing/W0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

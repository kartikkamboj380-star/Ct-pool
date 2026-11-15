.class public final Lcom/google/android/gms/internal/play_billing/S1;
.super Lcom/google/android/gms/internal/play_billing/r0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/X0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/S1;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/play_billing/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/S1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/S1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    const-class v1, Lcom/google/android/gms/internal/play_billing/S1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/r0;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/r0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/r0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/S1;->zze:I

    return-void
.end method

.method public static A([BLcom/google/android/gms/internal/play_billing/f0;)Lcom/google/android/gms/internal/play_billing/S1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/r0;->m(Lcom/google/android/gms/internal/play_billing/r0;[BLcom/google/android/gms/internal/play_billing/f0;)Lcom/google/android/gms/internal/play_billing/r0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/S1;

    return-object p0
.end method

.method static synthetic B(Lcom/google/android/gms/internal/play_billing/S1;Lcom/google/android/gms/internal/play_billing/c2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzh:Lcom/google/android/gms/internal/play_billing/c2;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzd:I

    return-void
.end method

.method static synthetic C(Lcom/google/android/gms/internal/play_billing/S1;Lcom/google/android/gms/internal/play_billing/t2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzf:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zze:I

    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/play_billing/S1;I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/S1;->zzd:I

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/play_billing/R1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/r0;->h()Lcom/google/android/gms/internal/play_billing/p0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/R1;

    return-object v0
.end method

.method static synthetic F()Lcom/google/android/gms/internal/play_billing/S1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    return-object v0
.end method


# virtual methods
.method protected final x(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    sget-object p1, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/R1;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Lcom/google/android/gms/internal/play_billing/Q1;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/S1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/S1;-><init>()V

    return-object p1

    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/play_billing/T1;->a:Lcom/google/android/gms/internal/play_billing/v0;

    const-string v5, "zzh"

    const-class v6, Lcom/google/android/gms/internal/play_billing/t2;

    const-string v0, "zzf"

    const-string v1, "zze"

    const-string v2, "zzd"

    const-string v3, "zzg"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/S1;->zzb:Lcom/google/android/gms/internal/play_billing/S1;

    const-string p3, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/r0;->q(Lcom/google/android/gms/internal/play_billing/W0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

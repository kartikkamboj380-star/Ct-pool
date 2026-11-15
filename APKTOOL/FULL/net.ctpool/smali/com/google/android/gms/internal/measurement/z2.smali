.class public final Lcom/google/android/gms/internal/measurement/z2;
.super Lcom/google/android/gms/internal/measurement/z4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/i5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/z2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/z2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/n5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/n5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:Lcom/google/android/gms/internal/measurement/F4;

.field private zzf:Lcom/google/android/gms/internal/measurement/F4;

.field private zzg:Lcom/google/android/gms/internal/measurement/J4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/J4;"
        }
    .end annotation
.end field

.field private zzh:Lcom/google/android/gms/internal/measurement/J4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/J4;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/z2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    const-class v1, Lcom/google/android/gms/internal/measurement/z2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/z4;->s(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/z4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/z4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->z()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->z()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->A()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->A()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method static synthetic E(Lcom/google/android/gms/internal/measurement/z2;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->A()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/internal/measurement/z2;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/J4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/z4;->o(Lcom/google/android/gms/internal/measurement/J4;)Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/J3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/z2;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->z()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    return-void
.end method

.method static synthetic I(Lcom/google/android/gms/internal/measurement/z2;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/J4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/z4;->m(Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/J3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/z2;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->A()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/z2;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/J4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/z4;->o(Lcom/google/android/gms/internal/measurement/J4;)Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/J3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic N(Lcom/google/android/gms/internal/measurement/z2;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z4;->z()Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    return-void
.end method

.method static synthetic O(Lcom/google/android/gms/internal/measurement/z2;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/J4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/z4;->m(Lcom/google/android/gms/internal/measurement/F4;)Lcom/google/android/gms/internal/measurement/F4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/J3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static P()Lcom/google/android/gms/internal/measurement/z2$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z4;->v()Lcom/google/android/gms/internal/measurement/z4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z2$a;

    return-object v0
.end method

.method static bridge synthetic Q()Lcom/google/android/gms/internal/measurement/z2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    return-object v0
.end method

.method public static R()Lcom/google/android/gms/internal/measurement/z2;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    return-object v0
.end method


# virtual methods
.method public final G()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final J()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final M()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final S()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    return-object v0
.end method

.method public final T()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzf:Lcom/google/android/gms/internal/measurement/F4;

    return-object v0
.end method

.method public final U()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzh:Lcom/google/android/gms/internal/measurement/J4;

    return-object v0
.end method

.method public final V()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zze:Lcom/google/android/gms/internal/measurement/F4;

    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/measurement/m2;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/z2;->zzd:Lcom/google/android/gms/internal/measurement/n5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/z2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/z2;->zzd:Lcom/google/android/gms/internal/measurement/n5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/z4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/z4$a;-><init>(Lcom/google/android/gms/internal/measurement/z4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/z2;->zzd:Lcom/google/android/gms/internal/measurement/n5;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    return-object p1

    :pswitch_4
    const-string v0, "zze"

    const-string v1, "zzf"

    const-string v2, "zzg"

    const-class v3, Lcom/google/android/gms/internal/measurement/r2;

    const-string v4, "zzh"

    const-class v5, Lcom/google/android/gms/internal/measurement/A2;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

    sget-object p3, Lcom/google/android/gms/internal/measurement/z2;->zzc:Lcom/google/android/gms/internal/measurement/z2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/z4;->q(Lcom/google/android/gms/internal/measurement/g5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/z2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/z2$a;-><init>(Lcom/google/android/gms/internal/measurement/L2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/z2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/z2;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lcom/google/android/gms/internal/auth/w1;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/auth/J0;


# instance fields
.field private final m:Lcom/google/android/gms/internal/auth/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/auth/J0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/w1;->m:Lcom/google/android/gms/internal/auth/J0;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/auth/w1;)Lcom/google/android/gms/internal/auth/J0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/auth/w1;->m:Lcom/google/android/gms/internal/auth/J0;

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/auth/J0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/w1;->m:Lcom/google/android/gms/internal/auth/J0;

    check-cast v0, Lcom/google/android/gms/internal/auth/I0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/I0;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/v1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/v1;-><init>(Lcom/google/android/gms/internal/auth/w1;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/u1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth/u1;-><init>(Lcom/google/android/gms/internal/auth/w1;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/w1;->m:Lcom/google/android/gms/internal/auth/J0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/w1;->m:Lcom/google/android/gms/internal/auth/J0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/J0;->zzg()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

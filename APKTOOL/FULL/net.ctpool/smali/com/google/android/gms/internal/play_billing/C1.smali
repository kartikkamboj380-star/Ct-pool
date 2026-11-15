.class public final Lcom/google/android/gms/internal/play_billing/C1;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/play_billing/F0;


# instance fields
.field private final m:Lcom/google/android/gms/internal/play_billing/F0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/F0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/play_billing/C1;)Lcom/google/android/gms/internal/play_billing/F0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    return-object p0
.end method


# virtual methods
.method public final U(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/play_billing/F0;->U(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/google/android/gms/internal/play_billing/F0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/F0;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/E0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/E0;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/B1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/B1;-><init>(Lcom/google/android/gms/internal/play_billing/C1;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/A1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/A1;-><init>(Lcom/google/android/gms/internal/play_billing/C1;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/C1;->m:Lcom/google/android/gms/internal/play_billing/F0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.class final Lcom/google/android/gms/internal/play_billing/r;
.super Lcom/google/android/gms/internal/play_billing/n;
.source "SourceFile"


# instance fields
.field private final transient o:Lcom/google/android/gms/internal/play_billing/m;

.field private final transient p:[Ljava/lang/Object;

.field private final transient q:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/m;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/n;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/r;->o:Lcom/google/android/gms/internal/play_billing/m;

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/r;->p:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/play_billing/r;->q:I

    return-void
.end method

.method static bridge synthetic o(Lcom/google/android/gms/internal/play_billing/r;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/play_billing/r;->q:I

    return p0
.end method

.method static bridge synthetic p(Lcom/google/android/gms/internal/play_billing/r;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/r;->p:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final c([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/g;->i()Lcom/google/android/gms/internal/play_billing/j;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/play_billing/g;->c([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/r;->o:Lcom/google/android/gms/internal/play_billing/m;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/play_billing/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/g;->i()Lcom/google/android/gms/internal/play_billing/j;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/j;->r(I)Lcom/google/android/gms/internal/play_billing/x;

    move-result-object v0

    return-object v0
.end method

.method final n()Lcom/google/android/gms/internal/play_billing/j;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/q;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/q;-><init>(Lcom/google/android/gms/internal/play_billing/r;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/r;->q:I

    return v0
.end method

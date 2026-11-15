.class final Lcom/google/android/gms/internal/play_billing/i;
.super Lcom/google/android/gms/internal/play_billing/j;
.source "SourceFile"


# instance fields
.field final transient p:I

.field final transient q:I

.field final synthetic r:Lcom/google/android/gms/internal/play_billing/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/j;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/j;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/i;->p:I

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/i;->q:I

    return-void
.end method


# virtual methods
.method final f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g;->h()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/i;->p:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/i;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/i;->q:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/b;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/i;->p:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final h()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g;->h()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/i;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method final m()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g;->m()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(II)Lcom/google/android/gms/internal/play_billing/j;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/i;->q:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/b;->d(III)V

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/i;->p:I

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/i;->r:Lcom/google/android/gms/internal/play_billing/j;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/play_billing/j;->n(II)Lcom/google/android/gms/internal/play_billing/j;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/i;->q:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/j;->n(II)Lcom/google/android/gms/internal/play_billing/j;

    move-result-object p1

    return-object p1
.end method

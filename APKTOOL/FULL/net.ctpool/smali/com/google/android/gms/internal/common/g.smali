.class final Lcom/google/android/gms/internal/common/g;
.super Lcom/google/android/gms/internal/common/h;
.source "SourceFile"


# instance fields
.field final transient o:I

.field final transient p:I

.field final synthetic q:Lcom/google/android/gms/internal/common/h;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/common/h;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    invoke-direct {p0}, Lcom/google/android/gms/internal/common/h;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/common/g;->o:I

    iput p3, p0, Lcom/google/android/gms/internal/common/g;->p:I

    return-void
.end method


# virtual methods
.method final f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/common/d;->h()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/common/g;->o:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/common/g;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/common/g;->p:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/common/D;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    iget v1, p0, Lcom/google/android/gms/internal/common/g;->o:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final h()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/common/d;->h()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/common/g;->o:I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/common/d;->m()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(II)Lcom/google/android/gms/internal/common/h;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/common/g;->p:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/common/D;->c(III)V

    iget v0, p0, Lcom/google/android/gms/internal/common/g;->o:I

    iget-object v1, p0, Lcom/google/android/gms/internal/common/g;->q:Lcom/google/android/gms/internal/common/h;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/common/h;->n(II)Lcom/google/android/gms/internal/common/h;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/common/g;->p:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/common/h;->n(II)Lcom/google/android/gms/internal/common/h;

    move-result-object p1

    return-object p1
.end method

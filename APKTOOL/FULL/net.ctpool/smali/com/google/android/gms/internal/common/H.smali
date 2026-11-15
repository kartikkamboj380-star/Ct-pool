.class abstract Lcom/google/android/gms/internal/common/H;
.super Lcom/google/android/gms/internal/common/u;
.source "SourceFile"


# instance fields
.field final o:Ljava/lang/CharSequence;

.field final p:Lcom/google/android/gms/internal/common/z;

.field final q:Z

.field r:I

.field s:I


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/common/I;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/common/u;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/common/H;->r:I

    invoke-static {p1}, Lcom/google/android/gms/internal/common/I;->a(Lcom/google/android/gms/internal/common/I;)Lcom/google/android/gms/internal/common/z;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/common/H;->p:Lcom/google/android/gms/internal/common/z;

    invoke-static {p1}, Lcom/google/android/gms/internal/common/I;->g(Lcom/google/android/gms/internal/common/I;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/common/H;->q:Z

    const p1, 0x7fffffff

    iput p1, p0, Lcom/google/android/gms/internal/common/H;->s:I

    iput-object p2, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic c()Ljava/lang/Object;
    .locals 5

    .line 1
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/common/H;->r:I

    :cond_0
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/common/H;->r:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_8

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/common/H;->f(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lcom/google/android/gms/internal/common/H;->r:I

    move v3, v2

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/common/H;->e(I)I

    move-result v3

    iput v3, p0, Lcom/google/android/gms/internal/common/H;->r:I

    :goto_2
    if-ne v3, v0, :cond_2

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/google/android/gms/internal/common/H;->r:I

    iget-object v1, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v3, v1, :cond_0

    iput v2, p0, Lcom/google/android/gms/internal/common/H;->r:I

    goto :goto_1

    :cond_2
    if-ge v0, v1, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_3
    if-ge v0, v1, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_4
    iget-boolean v3, p0, Lcom/google/android/gms/internal/common/H;->q:Z

    if-eqz v3, :cond_5

    if-ne v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v3, p0, Lcom/google/android/gms/internal/common/H;->s:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lcom/google/android/gms/internal/common/H;->r:I

    if-le v1, v0, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    goto :goto_3

    :cond_6
    add-int/2addr v3, v2

    iput v3, p0, Lcom/google/android/gms/internal/common/H;->s:I

    :cond_7
    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/common/H;->o:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/common/u;->d()Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_4
    return-object v0
.end method

.method abstract e(I)I
.end method

.method abstract f(I)I
.end method

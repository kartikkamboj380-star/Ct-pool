.class public final Lcom/google/android/gms/internal/measurement/w2$a;
.super Lcom/google/android/gms/internal/measurement/z4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/i5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/w2;->M()Lcom/google/android/gms/internal/measurement/w2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/z4$b;-><init>(Lcom/google/android/gms/internal/measurement/z4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/L2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/w2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->L(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->N()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->P()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->j()I

    move-result v0

    return v0
.end method

.method public final u(Lcom/google/android/gms/internal/measurement/x2$a;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/z4$b;->p()Lcom/google/android/gms/internal/measurement/g5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/z4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/x2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->G(Lcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/x2;)V

    return-object p0
.end method

.method public final v(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->H(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->I(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;)V

    return-object p0
.end method

.method public final y(I)Lcom/google/android/gms/internal/measurement/x2;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/w2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/w2;->F(I)Lcom/google/android/gms/internal/measurement/x2;

    move-result-object p1

    return-object p1
.end method

.method public final z()Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/w2;->K(Lcom/google/android/gms/internal/measurement/w2;)V

    return-object p0
.end method

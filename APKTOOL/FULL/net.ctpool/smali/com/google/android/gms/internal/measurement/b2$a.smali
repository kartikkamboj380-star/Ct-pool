.class public final Lcom/google/android/gms/internal/measurement/b2$a;
.super Lcom/google/android/gms/internal/measurement/z4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/i5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/b2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/b2;->L()Lcom/google/android/gms/internal/measurement/b2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/z4$b;-><init>(Lcom/google/android/gms/internal/measurement/z4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/l2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/b2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b2;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b2;->H()I

    move-result v0

    return v0
.end method

.method public final u(I)Lcom/google/android/gms/internal/measurement/a2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/b2;->E(I)Lcom/google/android/gms/internal/measurement/a2;

    move-result-object p1

    return-object p1
.end method

.method public final v(ILcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/b2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z4$b;->p()Lcom/google/android/gms/internal/measurement/g5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/z4;

    check-cast p2, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/b2;->G(Lcom/google/android/gms/internal/measurement/b2;ILcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method

.method public final x()Lcom/google/android/gms/internal/measurement/b2$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/b2;->F(Lcom/google/android/gms/internal/measurement/b2;)V

    return-object p0
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b2;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/b2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b2;->Q()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

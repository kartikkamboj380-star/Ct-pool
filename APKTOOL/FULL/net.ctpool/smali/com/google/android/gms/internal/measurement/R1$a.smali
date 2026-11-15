.class public final Lcom/google/android/gms/internal/measurement/R1$a;
.super Lcom/google/android/gms/internal/measurement/z4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/i5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/R1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/R1;->J()Lcom/google/android/gms/internal/measurement/R1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/z4$b;-><init>(Lcom/google/android/gms/internal/measurement/z4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/h2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/R1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/R1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/R1;->j()I

    move-result v0

    return v0
.end method

.method public final u(ILcom/google/android/gms/internal/measurement/S1;)Lcom/google/android/gms/internal/measurement/R1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/R1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/R1;->F(Lcom/google/android/gms/internal/measurement/R1;ILcom/google/android/gms/internal/measurement/S1;)V

    return-object p0
.end method

.method public final v(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/R1$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/z4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/R1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/R1;->G(Lcom/google/android/gms/internal/measurement/R1;Ljava/lang/String;)V

    return-object p0
.end method

.method public final x(I)Lcom/google/android/gms/internal/measurement/S1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/R1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/R1;->E(I)Lcom/google/android/gms/internal/measurement/S1;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z4$b;->n:Lcom/google/android/gms/internal/measurement/z4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/R1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/R1;->L()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

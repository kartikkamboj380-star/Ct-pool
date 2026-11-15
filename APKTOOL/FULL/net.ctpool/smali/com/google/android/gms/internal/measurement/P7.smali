.class final Lcom/google/android/gms/internal/measurement/P7;
.super Lcom/google/android/gms/internal/measurement/n;
.source "SourceFile"


# instance fields
.field private o:Z

.field private p:Z

.field private final synthetic q:Lcom/google/android/gms/internal/measurement/M7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/M7;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/M7;

    const-string p1, "log"

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/n;-><init>(Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/P7;->o:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/P7;->p:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/g3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    .locals 9

    .line 1
    const-string v0, "log"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/D2;->k(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/M7;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/M7;->g(Lcom/google/android/gms/internal/measurement/M7;)Lcom/google/android/gms/internal/measurement/Q7;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/N7;->o:Lcom/google/android/gms/internal/measurement/N7;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/g3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/s;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/P7;->o:Z

    iget-boolean v8, p0, Lcom/google/android/gms/internal/measurement/P7;->p:Z

    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/measurement/Q7;->a(Lcom/google/android/gms/internal/measurement/N7;Ljava/lang/String;Ljava/util/List;ZZ)V

    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/s;->d:Lcom/google/android/gms/internal/measurement/s;

    return-object p1

    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/g3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->b()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/D2;->i(D)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/N7;->e(I)Lcom/google/android/gms/internal/measurement/N7;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/g3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/M7;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M7;->g(Lcom/google/android/gms/internal/measurement/M7;)Lcom/google/android/gms/internal/measurement/Q7;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    :goto_1
    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/P7;->o:Z

    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/P7;->p:Z

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/Q7;->a(Lcom/google/android/gms/internal/measurement/N7;Ljava/lang/String;Ljava/util/List;ZZ)V

    goto :goto_0

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x5

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/g3;->b(Lcom/google/android/gms/internal/measurement/s;)Lcom/google/android/gms/internal/measurement/s;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/s;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/P7;->q:Lcom/google/android/gms/internal/measurement/M7;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/M7;->g(Lcom/google/android/gms/internal/measurement/M7;)Lcom/google/android/gms/internal/measurement/Q7;

    move-result-object v2

    goto :goto_1
.end method

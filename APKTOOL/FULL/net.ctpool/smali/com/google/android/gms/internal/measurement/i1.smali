.class final Lcom/google/android/gms/internal/measurement/i1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic q:Ljava/lang/String;

.field private final synthetic r:Ljava/lang/String;

.field private final synthetic s:Lcom/google/android/gms/internal/measurement/Q0;

.field private final synthetic t:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/Q0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/i1;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/i1;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/i1;->s:Lcom/google/android/gms/internal/measurement/Q0;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/i1;->t:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/i1;->t:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->d(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/i1;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/i1;->r:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/i1;->s:Lcom/google/android/gms/internal/measurement/Q0;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/U0;)V

    return-void
.end method

.method protected final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/i1;->s:Lcom/google/android/gms/internal/measurement/Q0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/Q0;->b(Landroid/os/Bundle;)V

    return-void
.end method

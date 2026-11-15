.class final Lcom/google/android/gms/internal/measurement/j1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic q:Ljava/lang/String;

.field private final synthetic r:Ljava/lang/String;

.field private final synthetic s:Landroid/os/Bundle;

.field private final synthetic t:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/j1;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/j1;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/j1;->s:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/j1;->t:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j1;->t:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->d(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/j1;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/j1;->r:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/j1;->s:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

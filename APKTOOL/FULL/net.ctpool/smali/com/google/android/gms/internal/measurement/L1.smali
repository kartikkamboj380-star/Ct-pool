.class final Lcom/google/android/gms/internal/measurement/L1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic q:Landroid/app/Activity;

.field private final synthetic r:Lcom/google/android/gms/internal/measurement/e1$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/L1;->q:Landroid/app/Activity;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/L1;->r:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/e1$c;->m:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L1;->r:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/e1$c;->m:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->d(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/L1;->q:Landroid/app/Activity;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/b;->k0(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/e1$a;->n:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->onActivityStopped(Lcom/google/android/gms/dynamic/a;J)V

    return-void
.end method

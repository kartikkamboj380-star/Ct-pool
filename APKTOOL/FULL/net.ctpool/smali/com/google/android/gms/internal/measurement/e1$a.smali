.class abstract Lcom/google/android/gms/internal/measurement/e1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation


# instance fields
.field final m:J

.field final n:J

.field private final o:Z

.field private final synthetic p:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;Z)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Z)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/e1$a;->p:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/e1;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->m:J

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/e1;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->n:J

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/e1$a;->o:Z

    return-void
.end method


# virtual methods
.method abstract a()V
.end method

.method protected b()V
    .locals 0

    .line 1
    return-void
.end method

.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->p:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->I(Lcom/google/android/gms/internal/measurement/e1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/e1$a;->p:Lcom/google/android/gms/internal/measurement/e1;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/e1$a;->o:Z

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/e1;->p(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->b()V

    return-void
.end method

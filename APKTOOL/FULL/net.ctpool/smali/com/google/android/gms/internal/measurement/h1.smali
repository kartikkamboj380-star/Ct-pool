.class final Lcom/google/android/gms/internal/measurement/h1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic q:Ljava/lang/String;

.field private final synthetic r:Ljava/lang/String;

.field private final synthetic s:Ljava/lang/Object;

.field private final synthetic t:Z

.field private final synthetic u:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/h1;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/h1;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/h1;->s:Ljava/lang/Object;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/h1;->t:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/h1;->u:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/h1;->u:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->d(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/h1;->q:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/h1;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/h1;->s:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/b;->k0(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;

    move-result-object v4

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/h1;->t:Z

    iget-wide v6, p0, Lcom/google/android/gms/internal/measurement/e1$a;->m:J

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/P0;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/dynamic/a;ZJ)V

    return-void
.end method

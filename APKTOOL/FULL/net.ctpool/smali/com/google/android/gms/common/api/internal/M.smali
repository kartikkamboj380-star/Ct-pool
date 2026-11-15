.class final Lcom/google/android/gms/common/api/internal/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic m:Lcom/google/android/gms/signin/internal/l;

.field final synthetic n:Lcom/google/android/gms/common/api/internal/zact;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zact;Lcom/google/android/gms/signin/internal/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/M;->n:Lcom/google/android/gms/common/api/internal/zact;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/M;->m:Lcom/google/android/gms/signin/internal/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/M;->n:Lcom/google/android/gms/common/api/internal/zact;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/M;->m:Lcom/google/android/gms/signin/internal/l;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/zact;->zad(Lcom/google/android/gms/common/api/internal/zact;Lcom/google/android/gms/signin/internal/l;)V

    return-void
.end method

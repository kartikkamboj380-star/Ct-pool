.class final Lcom/google/android/gms/common/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/PendingResult$StatusListener;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/PendingResult;

.field final synthetic b:Lz3/m;

.field final synthetic c:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

.field final synthetic d:Lcom/google/android/gms/common/internal/zas;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/PendingResult;Lz3/m;Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;Lcom/google/android/gms/common/internal/zas;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/g;->a:Lcom/google/android/gms/common/api/PendingResult;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/common/internal/g;->b:Lz3/m;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/gms/common/internal/g;->c:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/google/android/gms/common/internal/g;->d:Lcom/google/android/gms/common/internal/zas;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/common/internal/g;->a:Lcom/google/android/gms/common/api/PendingResult;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/g;->b:Lz3/m;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/g;->c:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;->convert(Lcom/google/android/gms/common/api/Result;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz3/m;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/g;->b:Lz3/m;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/ApiExceptionUtil;->fromStatus(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz3/m;->b(Ljava/lang/Exception;)V

    return-void
.end method

.class public final Lcom/google/android/gms/common/api/internal/zag;
.super Lcom/google/android/gms/common/api/internal/zac;
.source "SourceFile"


# instance fields
.field private final zaa:Lcom/google/android/gms/common/api/internal/TaskApiCall;

.field private final zab:Lz3/m;

.field private final zad:Lcom/google/android/gms/common/api/internal/StatusExceptionMapper;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/common/api/internal/TaskApiCall;Lz3/m;Lcom/google/android/gms/common/api/internal/StatusExceptionMapper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/zac;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/zag;->zaa:Lcom/google/android/gms/common/api/internal/TaskApiCall;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/zag;->zad:Lcom/google/android/gms/common/api/internal/StatusExceptionMapper;

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/TaskApiCall;->shouldAutoResolveMissingFeatures()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final zaa(Lcom/google/android/gms/common/api/internal/zabq;)Z
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zag;->zaa:Lcom/google/android/gms/common/api/internal/TaskApiCall;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;->shouldAutoResolveMissingFeatures()Z

    move-result p1

    return p1
.end method

.method public final zab(Lcom/google/android/gms/common/api/internal/zabq;)[Lcom/google/android/gms/common/Feature;
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zag;->zaa:Lcom/google/android/gms/common/api/internal/TaskApiCall;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;->zab()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method

.method public final zad(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zag;->zad:Lcom/google/android/gms/common/api/internal/StatusExceptionMapper;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/StatusExceptionMapper;->getException(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v1, p1}, Lz3/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final zae(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    invoke-virtual {v0, p1}, Lz3/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final zaf(Lcom/google/android/gms/common/api/internal/zabq;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zag;->zaa:Lcom/google/android/gms/common/api/internal/TaskApiCall;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/zabq;->zaf()Lcom/google/android/gms/common/api/Api$Client;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;->doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;Lz3/m;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    invoke-virtual {v0, p1}, Lz3/m;->d(Ljava/lang/Exception;)Z

    return-void

    :goto_1
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/zai;->zah(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/zag;->zad(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :goto_2
    throw p1
.end method

.method public final zag(Lcom/google/android/gms/common/api/internal/zaad;Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zag;->zab:Lz3/m;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/common/api/internal/zaad;->zad(Lz3/m;Z)V

    return-void
.end method

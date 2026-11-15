.class final Lcom/google/android/gms/common/moduleinstall/internal/j;
.super Lcom/google/android/gms/common/api/internal/IStatusCallback$Stub;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz3/m;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/moduleinstall/internal/zay;Lz3/m;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/common/moduleinstall/internal/j;->a:Lz3/m;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/IStatusCallback$Stub;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onResult(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/common/moduleinstall/internal/j;->a:Lz3/m;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/TaskUtil;->trySetResultOrApiException(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lz3/m;)Z

    return-void
.end method

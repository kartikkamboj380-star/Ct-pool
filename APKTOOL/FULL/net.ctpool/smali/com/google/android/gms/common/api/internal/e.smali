.class final Lcom/google/android/gms/common/api/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/ApiKey;

.field private final b:Lz3/m;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/ApiKey;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz3/m;

    invoke-direct {v0}, Lz3/m;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/e;->b:Lz3/m;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/e;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/common/api/internal/ApiKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e;->a:Lcom/google/android/gms/common/api/internal/ApiKey;

    return-object v0
.end method

.method public final b()Lz3/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e;->b:Lz3/m;

    .line 2
    .line 3
    return-object v0
.end method

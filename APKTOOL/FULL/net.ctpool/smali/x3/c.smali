.class final Lx3/c;
.super Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final bridge synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$Client;
    .locals 0

    .line 1
    invoke-static {p4}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lcom/google/android/gms/signin/internal/a;->e:I

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

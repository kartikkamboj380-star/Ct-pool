.class public final Ll3/i;
.super Lcom/google/android/gms/common/internal/GmsClient;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    .line 1
    const/16 v3, 0x5b

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/GmsClient;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    invoke-direct {p1, p4}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {}, Lr3/b;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->i(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAllRequestedScopes()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAllRequestedScopes()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eqz p3, :cond_1

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lcom/google/android/gms/common/api/Scope;

    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    new-array p4, p4, [Lcom/google/android/gms/common/api/Scope;

    .line 62
    .line 63
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->e(Lcom/google/android/gms/common/api/Scope;[Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Ll3/i;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/i;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Ll3/w;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    move-object p1, v0

    .line 16
    check-cast p1, Ll3/w;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Ll3/w;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Ll3/w;-><init>(Landroid/os/IBinder;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    return-object p1
.end method

.method public final getMinApkVersion()I
    .locals 1

    .line 1
    const v0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method protected final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSignInIntent()Landroid/content/Intent;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ll3/i;->a:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ll3/q;->c(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method protected final getStartServiceAction()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.auth.api.signin.service.START"

    .line 2
    .line 3
    return-object v0
.end method

.method public final providesSignIn()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

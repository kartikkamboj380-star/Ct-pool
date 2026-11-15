.class public Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.super Lcom/reactnativegooglesignin/NativeGoogleSigninSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;,
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;,
        Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;
    }
.end annotation


# static fields
.field public static final PLAY_SERVICES_NOT_AVAILABLE:Ljava/lang/String; = "PLAY_SERVICES_NOT_AVAILABLE"

.field public static final RC_SIGN_IN:I = 0x2329

.field public static final REQUEST_CODE_ADD_SCOPES:I = 0xd02f

.field public static final REQUEST_CODE_RECOVER_AUTH:I = 0xd02e

.field private static final SHOULD_RECOVER:Ljava/lang/String; = "SHOULD_RECOVER"


# instance fields
.field private _apiClient:Lcom/google/android/gms/auth/api/signin/b;

.field private pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

.field private final signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

.field private final tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/NativeGoogleSigninSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Lcom/reactnativegooglesignin/c;

    const-string v1, "RNGoogleSignin"

    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    new-instance v0, Lcom/reactnativegooglesignin/c;

    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    new-instance v0, Lcom/reactnativegooglesignin/c;

    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    new-instance v0, Lcom/reactnativegooglesignin/c;

    invoke-direct {v0, v1}, Lcom/reactnativegooglesignin/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    new-instance v0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/k;)V

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signIn$2(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$000(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signOut$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signInSilently$0(Lz3/l;)V

    return-void
.end method

.method public static synthetic d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$revokeAccess$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic e(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->lambda$signInSilently$1()V

    return-void
.end method

.method static bridge synthetic f(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

    return-void
.end method

.method private handleSignInTaskResult(Lz3/l;Lcom/reactnativegooglesignin/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/l;",
            "Lcom/reactnativegooglesignin/c;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, Lcom/google/android/gms/common/api/ApiException;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lz3/l;->m(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "GoogleSignInAccount instance was null"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :goto_0
    invoke-virtual {p2, p1}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    return-void
.end method

.method private handleSignOutOrRevokeAccessTask(Lz3/l;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/l;",
            "Lcom/facebook/react/bridge/Promise;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->b(Lz3/l;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Lk3/c;->getStatusCodeString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method static bridge synthetic i(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lz3/l;Lcom/reactnativegooglesignin/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Lz3/l;Lcom/reactnativegooglesignin/c;)V

    return-void
.end method

.method static bridge synthetic j(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rerunFailedAuthTokenTask()V

    return-void
.end method

.method private synthetic lambda$revokeAccess$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignOutOrRevokeAccessTask(Lz3/l;Lcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$signIn$2(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->c()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x2329

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private synthetic lambda$signInSilently$0(Lz3/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Lz3/l;Lcom/reactnativegooglesignin/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic lambda$signInSilently$1()V
    .locals 2

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->f()Lz3/l;

    move-result-object v0

    invoke-virtual {v0}, Lz3/l;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    invoke-direct {p0, v0, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignInTaskResult(Lz3/l;Lcom/reactnativegooglesignin/c;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/reactnativegooglesignin/f;

    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/f;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    :goto_0
    return-void
.end method

.method private synthetic lambda$signOut$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->handleSignOutOrRevokeAccessTask(Lz3/l;Lcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    const-string v0, "RNGoogleSignin"

    const-string v1, "activity is null"

    invoke-interface {p0, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    const-string v0, "RNGoogleSignin"

    const-string v1, "apiClient is null - call configure() first"

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private rerunFailedAuthTokenTask()V
    .locals 4

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->pendingAuthRecovery:Lcom/reactnativegooglesignin/b;

    invoke-virtual {v0}, Lcom/reactnativegooglesignin/b;->a()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;

    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/facebook/react/bridge/WritableMap;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    const-string v1, "rerunFailedAuthTokenTask: recovery failed"

    invoke-virtual {v0, v1}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private startTokenRetrievalTaskWithRecovery(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 5

    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "SHOULD_RECOVER"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    new-instance v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;

    invoke-direct {v1, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/facebook/react/bridge/WritableMap;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    aput-object v0, v3, v2

    invoke-virtual {v1, v3}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method


# virtual methods
.method public addScopes(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    const-string v3, "addScopes"

    invoke-virtual {v2, p2, v3}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    const-string p2, "scopes"

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p1

    invoke-static {p1}, Lcom/reactnativegooglesignin/o;->a(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/google/android/gms/common/api/Scope;

    move-result-object p1

    const p2, 0xd02f

    invoke-static {v0, p2, v1, p1}, Lcom/google/android/gms/auth/api/signin/a;->d(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V

    return-void
.end method

.method public clearCachedAccessToken(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    const-string v1, "clearCachedAccessToken"

    invoke-virtual {v0, p2, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    new-instance p2, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;

    invoke-direct {p2, p0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$c;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public configure(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 10
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "scopes"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    :goto_0
    const-string v1, "webClientId"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    const-string v1, "offlineAccess"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v6

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    const-string v2, "forceCodeForRefreshToken"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v7, v6

    goto :goto_3

    :cond_3
    move v7, v4

    :goto_3
    const-string v2, "accountName"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object v8, v3

    :goto_4
    const-string v2, "hostedDomain"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v9, p1

    goto :goto_5

    :cond_5
    move-object v9, v3

    :goto_5
    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->a(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/google/android/gms/common/api/Scope;

    move-result-object v4

    move v6, v1

    invoke-static/range {v4 .. v9}, Lcom/reactnativegooglesignin/o;->c([Lcom/google/android/gms/common/api/Scope;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/auth/api/signin/a;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/b;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public getCurrentUser()Lcom/facebook/react/bridge/WritableMap;
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getTokenClearingPromiseWrapper()Lcom/reactnativegooglesignin/c;
    .locals 1

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenClearingPromiseWrapper:Lcom/reactnativegooglesignin/c;

    return-object v0
.end method

.method public getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;
    .locals 1

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    return-object v0
.end method

.method public getTokens(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    const-string v1, "getTokens"

    if-nez v0, :cond_0

    const-string v0, "getTokens requires a user to be signed in"

    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->tokenRetrievalPromiseWrapper:Lcom/reactnativegooglesignin/c;

    invoke-virtual {v2, p1, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->startTokenRetrievalTaskWithRecovery(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-void
.end method

.method protected getTypedExportedConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "BUTTON_SIZE_ICON"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "BUTTON_SIZE_STANDARD"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "BUTTON_SIZE_WIDE"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x30d5

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SIGN_IN_CANCELLED"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SIGN_IN_REQUIRED"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "SCOPES_ALREADY_GRANTED"

    const-string v2, "NEVER_HAPPENS_ON_ANDROID"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ONE_TAP_START_FAILED"

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "NO_SAVED_CREDENTIAL_FOUND"

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "IN_PROGRESS"

    const-string v2, "ASYNC_OP_IN_PROGRESS"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "PLAY_SERVICES_NOT_AVAILABLE"

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public hasPreviousSignIn()Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public playServicesAvailable(ZLcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "RNGoogleSignin"

    const-string v0, "could not determine playServicesAvailable, activity is null"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isUserResolvableError(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x964

    invoke-virtual {v1, v0, v2, p1}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorDialog(Landroid/app/Activity;II)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_1
    const-string p1, "PLAY_SERVICES_NOT_AVAILABLE"

    const-string v0, "Play services not available"

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public revokeAccess(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->d()Lz3/l;

    move-result-object v0

    new-instance v1, Lcom/reactnativegooglesignin/i;

    invoke-direct {v1, p0, p1}, Lcom/reactnativegooglesignin/i;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public signIn(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullActivity(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->signInOrAddScopesPromiseWrapper:Lcom/reactnativegooglesignin/c;

    const-string v1, "signIn"

    invoke-virtual {v0, p2, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    new-instance p2, Lcom/reactnativegooglesignin/h;

    invoke-direct {p2, p0, p1}, Lcom/reactnativegooglesignin/h;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Landroid/app/Activity;)V

    invoke-static {p2}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public signInSilently(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->silentSignInPromiseWrapper:Lcom/reactnativegooglesignin/c;

    const-string v1, "signInSilently"

    invoke-virtual {v0, p1, v1}, Lcom/reactnativegooglesignin/c;->h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    new-instance p1, Lcom/reactnativegooglesignin/j;

    invoke-direct {p1, p0}, Lcom/reactnativegooglesignin/j;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public signOut(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->_apiClient:Lcom/google/android/gms/auth/api/signin/b;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->rejectWithNullClientError(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/b;->e()Lz3/l;

    move-result-object v0

    new-instance v1, Lcom/reactnativegooglesignin/g;

    invoke-direct {v1, p0, p1}, Lcom/reactnativegooglesignin/g;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

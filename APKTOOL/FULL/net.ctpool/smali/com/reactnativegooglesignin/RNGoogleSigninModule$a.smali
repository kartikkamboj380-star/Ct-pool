.class Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->access$100(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p3, 0x0

    invoke-static {p1, p3}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V

    invoke-virtual {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot attempt recovery auth because app is not in foreground. "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/reactnativegooglesignin/b;

    invoke-direct {v1, p3}, Lcom/reactnativegooglesignin/b;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {p1, v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->h(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/b;)V

    check-cast p2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    invoke-virtual {p2}, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a()Landroid/content/Intent;

    move-result-object p1

    const p2, 0xd02e

    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    return-void
.end method

.method private c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    instance-of v0, p2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    if-eqz v0, :cond_0

    if-eqz p4, :cond_0

    const-string v0, "SHOULD_RECOVER"

    invoke-interface {p4, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p4, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 3

    .line 1
    const-string v0, "user"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->access$000(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    new-instance v1, Landroid/accounts/Account;

    const-string v2, "com.google"

    invoke-direct {v1, v0, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "scopes"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    invoke-static {v0}, Lcom/reactnativegooglesignin/o;->e(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lh3/b;->b(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "accessToken"

    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected varargs b([Lcom/facebook/react/bridge/WritableMap;)Ljava/lang/Void;
    .locals 6

    .line 1
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    invoke-direct {p0, v1, v0}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->d(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-virtual {v1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->getTokenRetrievalPromiseWrapper()Lcom/reactnativegooglesignin/c;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    array-length v4, p1

    const/4 v5, 0x2

    if-lt v4, v5, :cond_1

    const/4 v4, 0x1

    aget-object p1, p1, v4

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    invoke-direct {p0, v1, v3, v0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->c(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ljava/lang/Exception;Lcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)V

    :goto_1
    return-object v2
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lcom/facebook/react/bridge/WritableMap;

    invoke-virtual {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$a;->b([Lcom/facebook/react/bridge/WritableMap;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

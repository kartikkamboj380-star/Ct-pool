.class public Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# static fields
.field private static final E_NOT_CONFIGURED_ERROR:Ljava/lang/String; = "E_NOT_CONFIGURED_ERROR"

.field private static final E_SIGNIN_CANCELLED_ERROR:Ljava/lang/String; = "E_SIGNIN_CANCELLED_ERROR"

.field private static final E_SIGNIN_FAILED_ERROR:Ljava/lang/String; = "E_SIGNIN_FAILED_ERROR"


# instance fields
.field private configuration:Lcom/RNAppleAuthentication/a;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method static bridge synthetic a(Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;)Lcom/RNAppleAuthentication/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->configuration:Lcom/RNAppleAuthentication/a;

    return-object p0
.end method

.method private static bytesToHex([B)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    shr-int/lit8 v2, v2, 0x4

    and-int/lit8 v2, v2, 0xf

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    aget-byte v2, p0, v1

    and-int/lit8 v2, v2, 0xf

    invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private getFragmentManagerHelper()Landroidx/fragment/app/w;
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroidx/fragment/app/j;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/fragment/app/j;->O()Landroidx/fragment/app/w;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public configure(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    sget-object v0, Lcom/RNAppleAuthentication/a$c;->m:Lcom/RNAppleAuthentication/a$c;

    sget-object v0, Lcom/RNAppleAuthentication/a$b;->m:Lcom/RNAppleAuthentication/a$b;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nonceEnabled"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    const-string v2, "clientId"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    const-string v4, ""

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    const-string v3, "redirectUri"

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v4

    :goto_2
    const-string v5, "scope"

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Lcom/RNAppleAuthentication/a$c;->valueOf(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$c;

    :cond_3
    const-string v5, "responseType"

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v5}, Lcom/RNAppleAuthentication/a$b;->valueOf(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$b;

    :cond_4
    const-string v5, "state"

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_5
    if-eqz v1, :cond_7

    const-string v1, "nonce"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    move-object v4, p1

    goto :goto_4

    :cond_6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :goto_4
    :try_start_0
    const-string p1, "SHA-256"

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->bytesToHex([B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    :cond_7
    move-object p1, v4

    :goto_5
    new-instance v1, Lcom/RNAppleAuthentication/a$a;

    invoke-direct {v1}, Lcom/RNAppleAuthentication/a$a;-><init>()V

    invoke-virtual {v1, v2}, Lcom/RNAppleAuthentication/a$a;->b(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/RNAppleAuthentication/a$a;->e(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v1

    sget-object v2, Lcom/RNAppleAuthentication/a$b;->o:Lcom/RNAppleAuthentication/a$b;

    invoke-virtual {v1, v2}, Lcom/RNAppleAuthentication/a$a;->f(Lcom/RNAppleAuthentication/a$b;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v1

    sget-object v2, Lcom/RNAppleAuthentication/a$c;->o:Lcom/RNAppleAuthentication/a$c;

    invoke-virtual {v1, v2}, Lcom/RNAppleAuthentication/a$a;->g(Lcom/RNAppleAuthentication/a$c;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/RNAppleAuthentication/a$a;->h(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/RNAppleAuthentication/a$a;->d(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/RNAppleAuthentication/a$a;->c(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/RNAppleAuthentication/a$a;->a()Lcom/RNAppleAuthentication/a;

    move-result-object p1

    iput-object p1, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->configuration:Lcom/RNAppleAuthentication/a;

    return-void
.end method

.method public getConstants()Ljava/util/Map;
    .locals 4
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

    sget-object v1, Lcom/RNAppleAuthentication/a$b;->o:Lcom/RNAppleAuthentication/a$b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ALL"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/RNAppleAuthentication/a$b;->m:Lcom/RNAppleAuthentication/a$b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "CODE"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/RNAppleAuthentication/a$b;->n:Lcom/RNAppleAuthentication/a$b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ID_TOKEN"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v3, Lcom/RNAppleAuthentication/a$c;->o:Lcom/RNAppleAuthentication/a$c;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lcom/RNAppleAuthentication/a$c;->n:Lcom/RNAppleAuthentication/a$c;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EMAIL"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lcom/RNAppleAuthentication/a$c;->m:Lcom/RNAppleAuthentication/a$c;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "NAME"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "E_NOT_CONFIGURED_ERROR"

    invoke-interface {v2, v3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "E_SIGNIN_FAILED_ERROR"

    invoke-interface {v2, v3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "E_SIGNIN_CANCELLED_ERROR"

    invoke-interface {v2, v3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "ResponseType"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Scope"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "isSupported"

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNAppleAuthModuleAndroid"

    return-object v0
.end method

.method public signIn(Lcom/facebook/react/bridge/Promise;)V
    .locals 5
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->configuration:Lcom/RNAppleAuthentication/a;

    const-string v1, "E_NOT_CONFIGURED_ERROR"

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->getFragmentManagerHelper()Landroidx/fragment/app/w;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v1, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$a;

    invoke-direct {v1, p0, p1}, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$a;-><init>(Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;Lcom/facebook/react/bridge/Promise;)V

    new-instance v2, LA0/g;

    iget-object v3, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->configuration:Lcom/RNAppleAuthentication/a;

    const-string v4, "SignInWithAppleButton-$id-SignInWebViewDialogFragment"

    invoke-direct {v2, v0, v4, v3, v1}, LA0/g;-><init>(Landroidx/fragment/app/w;Ljava/lang/String;Lcom/RNAppleAuthentication/a;LA0/d;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Activity is not found"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;

    invoke-direct {p1, p0, v2}, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;-><init>(Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;LA0/g;)V

    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

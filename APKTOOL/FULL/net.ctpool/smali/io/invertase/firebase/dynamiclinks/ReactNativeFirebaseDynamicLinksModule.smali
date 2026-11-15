.class public Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;
.super Lio/invertase/firebase/common/ReactNativeFirebaseModule;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ActivityEventListener;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# static fields
.field private static final SHORT_LINK_TYPE_SHORT:Ljava/lang/String; = "SHORT"

.field private static final SHORT_LINK_TYPE_UNGUESSABLE:Ljava/lang/String; = "UNGUESSABLE"

.field private static final TAG:Ljava/lang/String; = "DynamicLinks"


# instance fields
.field private gotInitialLink:Z

.field private hostResumed:Z

.field private initialLinkMinimumVersion:I

.field private initialLinkUrl:Ljava/lang/String;

.field private initialPromise:Lcom/facebook/react/bridge/Promise;

.field private launchedFromHistory:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "DynamicLinks"

    invoke-direct {p0, p1, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkUrl:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkMinimumVersion:I

    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->gotInitialLink:Z

    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->hostResumed:Z

    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->launchedFromHistory:Z

    iput-object p1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialPromise:Lcom/facebook/react/bridge/Promise;

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public static synthetic a(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$resolveLink$5(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic b(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$onNewIntent$6(Lz3/l;)V

    return-void
.end method

.method private buildAnalyticsParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$d$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt4/a$d$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "campaign"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lt4/a$d$a;->b(Ljava/lang/String;)Lt4/a$d$a;

    .line 22
    .line 23
    .line 24
    :cond_1
    const-string v1, "content"

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lt4/a$d$a;->c(Ljava/lang/String;)Lt4/a$d$a;

    .line 37
    .line 38
    .line 39
    :cond_2
    const-string v1, "medium"

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Lt4/a$d$a;->d(Ljava/lang/String;)Lt4/a$d$a;

    .line 52
    .line 53
    .line 54
    :cond_3
    const-string v1, "source"

    .line 55
    .line 56
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lt4/a$d$a;->e(Ljava/lang/String;)Lt4/a$d$a;

    .line 67
    .line 68
    .line 69
    :cond_4
    const-string v1, "term"

    .line 70
    .line 71
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1}, Lt4/a$d$a;->f(Ljava/lang/String;)Lt4/a$d$a;

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-virtual {v0}, Lt4/a$d$a;->a()Lt4/a$d;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p2, p1}, Lt4/a$c;->f(Lt4/a$d;)Lt4/a$c;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private buildAndroidParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$b$a;

    .line 5
    .line 6
    const-string v1, "packageName"

    .line 7
    .line 8
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lt4/a$b$a;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "fallbackUrl"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lt4/a$b$a;->b(Landroid/net/Uri;)Lt4/a$b$a;

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v1, "minimumVersion"

    .line 38
    .line 39
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {v0, p1}, Lt4/a$b$a;->c(I)Lt4/a$b$a;

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0}, Lt4/a$b$a;->a()Lt4/a$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p2, p1}, Lt4/a$c;->d(Lt4/a$b;)Lt4/a$c;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private buildIosParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$e$a;

    .line 5
    .line 6
    const-string v1, "bundleId"

    .line 7
    .line 8
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lt4/a$e$a;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "appStoreId"

    .line 19
    .line 20
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lt4/a$e$a;->b(Ljava/lang/String;)Lt4/a$e$a;

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string v1, "customScheme"

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Lt4/a$e$a;->c(Ljava/lang/String;)Lt4/a$e$a;

    .line 46
    .line 47
    .line 48
    :cond_2
    const-string v1, "fallbackUrl"

    .line 49
    .line 50
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Lt4/a$e$a;->d(Landroid/net/Uri;)Lt4/a$e$a;

    .line 65
    .line 66
    .line 67
    :cond_3
    const-string v1, "iPadBundleId"

    .line 68
    .line 69
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lt4/a$e$a;->e(Ljava/lang/String;)Lt4/a$e$a;

    .line 80
    .line 81
    .line 82
    :cond_4
    const-string v1, "iPadFallbackUrl"

    .line 83
    .line 84
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Lt4/a$e$a;->f(Landroid/net/Uri;)Lt4/a$e$a;

    .line 99
    .line 100
    .line 101
    :cond_5
    const-string v1, "minimumVersion"

    .line 102
    .line 103
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, p1}, Lt4/a$e$a;->g(Ljava/lang/String;)Lt4/a$e$a;

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {v0}, Lt4/a$e$a;->a()Lt4/a$e;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p2, p1}, Lt4/a$c;->g(Lt4/a$e;)Lt4/a$c;

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method private buildItunesParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$f$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt4/a$f$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "affiliateToken"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lt4/a$f$a;->b(Ljava/lang/String;)Lt4/a$f$a;

    .line 22
    .line 23
    .line 24
    :cond_1
    const-string v1, "campaignToken"

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lt4/a$f$a;->c(Ljava/lang/String;)Lt4/a$f$a;

    .line 37
    .line 38
    .line 39
    :cond_2
    const-string v1, "providerToken"

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Lt4/a$f$a;->d(Ljava/lang/String;)Lt4/a$f$a;

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {v0}, Lt4/a$f$a;->a()Lt4/a$f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p2, p1}, Lt4/a$c;->h(Lt4/a$f;)Lt4/a$c;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private buildNavigationParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$g$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt4/a$g$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "forcedRedirectEnabled"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p1}, Lt4/a$g$a;->b(Z)Lt4/a$g$a;

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0}, Lt4/a$g$a;->a()Lt4/a$g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Lt4/a$c;->k(Lt4/a$g;)Lt4/a$c;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private buildSocialParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lt4/a$h$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt4/a$h$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "descriptionText"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lt4/a$h$a;->b(Ljava/lang/String;)Lt4/a$h$a;

    .line 22
    .line 23
    .line 24
    :cond_1
    const-string v1, "imageUrl"

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Lt4/a$h$a;->c(Landroid/net/Uri;)Lt4/a$h$a;

    .line 41
    .line 42
    .line 43
    :cond_2
    const-string v1, "title"

    .line 44
    .line 45
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lt4/a$h$a;->d(Ljava/lang/String;)Lt4/a$h$a;

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, Lt4/a$h$a;->a()Lt4/a$h;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p2, p1}, Lt4/a$c;->l(Lt4/a$h;)Lt4/a$c;

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static synthetic c(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lt4/d;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$buildShortLink$2(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lt4/d;

    move-result-object p0

    return-object p0
.end method

.method private createDynamicLinkBuilder(Lcom/facebook/react/bridge/ReadableMap;)Lt4/a$c;
    .locals 5

    .line 1
    invoke-static {}, Lt4/b;->d()Lt4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt4/b;->a()Lt4/a$c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "link"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lt4/a$c;->i(Landroid/net/Uri;)Lt4/a$c;

    .line 20
    .line 21
    .line 22
    const-string v1, "domainUriPrefix"

    .line 23
    .line 24
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lt4/a$c;->e(Ljava/lang/String;)Lt4/a$c;

    .line 32
    .line 33
    .line 34
    const-string v1, "ios"

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildIosParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    const-string v1, "itunes"

    .line 50
    .line 51
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildItunesParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    const-string v1, "social"

    .line 65
    .line 66
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildSocialParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    const-string v1, "android"

    .line 80
    .line 81
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildAndroidParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    const-string v1, "analytics"

    .line 95
    .line 96
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildAnalyticsParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    const-string v1, "navigation"

    .line 110
    .line 111
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {p0, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->buildNavigationParameters(Lcom/facebook/react/bridge/ReadableMap;Lt4/a$c;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    const-string v1, "otherPlatform"

    .line 125
    .line 126
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-string v3, "fallbackUrl"

    .line 137
    .line 138
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_6

    .line 143
    .line 144
    invoke-virtual {v0}, Lt4/a$c;->a()Lt4/a;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Lt4/a;->a()Landroid/net/Uri;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    new-instance v4, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const/16 v2, 0x26

    .line 165
    .line 166
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v2, "ofl"

    .line 170
    .line 171
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const/16 v2, 0x3d

    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v0, p1}, Lt4/a$c;->j(Landroid/net/Uri;)Lt4/a$c;

    .line 199
    .line 200
    .line 201
    :cond_6
    return-object v0
.end method

.method public static synthetic d(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$buildLink$1(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method private dynamicLinkToWritableMap(Ljava/lang/String;ILcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "url"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "minimumAppVersion"

    if-nez p2, :cond_0

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putNull(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    :goto_0
    const-string p1, "utmParameters"

    invoke-interface {v0, p1, p3}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    return-object v0
.end method

.method public static synthetic e(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$buildLink$0(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$getInitialLink$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->lambda$buildShortLink$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method

.method private synthetic lambda$buildLink$0(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->createDynamicLinkBuilder(Lcom/facebook/react/bridge/ReadableMap;)Lt4/a$c;

    move-result-object p1

    invoke-virtual {p1}, Lt4/a$c;->a()Lt4/a;

    move-result-object p1

    invoke-virtual {p1}, Lt4/a;->a()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$buildLink$1(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 3

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
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "RNFB: Unknown error while building Dynamic Link "

    .line 16
    .line 17
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "DynamicLinks"

    .line 22
    .line 23
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "build-failed"

    .line 35
    .line 36
    invoke-static {p0, v0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void
.end method

.method private synthetic lambda$buildShortLink$2(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lt4/d;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->createDynamicLinkBuilder(Lcom/facebook/react/bridge/ReadableMap;)Lt4/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "SHORT"

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    :goto_0
    invoke-virtual {p1, p2}, Lt4/a$c;->c(I)Lz3/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_1
    invoke-static {p1}, Lz3/o;->a(Lz3/l;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lt4/d;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v0, "UNGUESSABLE"

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1}, Lt4/a$c;->b()Lz3/l;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_1
.end method

.method private static synthetic lambda$buildShortLink$3(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 2

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
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lt4/d;

    .line 12
    .line 13
    invoke-interface {p1}, Lt4/d;->f()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "RNFB: Unknown error while building Dynamic Link "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "DynamicLinks"

    .line 51
    .line 52
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "build-failed"

    .line 64
    .line 65
    invoke-static {p0, v0, p1}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    return-void
.end method

.method private synthetic lambda$getInitialLink$4(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->gotInitialLink:Z

    .line 9
    .line 10
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lt4/c;

    .line 15
    .line 16
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 19
    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Lt4/c;->a()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkUrl:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p2}, Lt4/c;->b()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkMinimumVersion:I

    .line 38
    .line 39
    invoke-virtual {p2}, Lt4/c;->c()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_0
    iget-object p2, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkUrl:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    iget-boolean v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->launchedFromHistory:Z

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    iget v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkMinimumVersion:I

    .line 56
    .line 57
    invoke-direct {p0, p2, v1, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->dynamicLinkToWritableMap(Ljava/lang/String;ILcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :goto_0
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 p2, 0x0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p2}, Lz3/l;->k()Ljava/lang/Exception;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string v0, "initial-link-error"

    .line 76
    .line 77
    invoke-static {p1, v0, p2}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void
.end method

.method private synthetic lambda$onNewIntent$6(Lz3/l;)V
    .locals 4

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
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lt4/c;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lg5/g;->i()Lg5/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lg5/b;

    .line 20
    .line 21
    invoke-virtual {p1}, Lt4/c;->a()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p1}, Lt4/c;->b()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {p1}, Lt4/c;->c()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, v2, v3, p1}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->dynamicLinkToWritableMap(Ljava/lang/String;ILcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "dynamic_links_link_received"

    .line 46
    .line 47
    invoke-direct {v1, v2, p1}, Lg5/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lg5/g;->o(Lh5/a;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v0, "RNFB: An unknown exception occurred calling getDynamicLink"

    .line 55
    .line 56
    invoke-virtual {p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v1, "DynamicLinks"

    .line 61
    .line 62
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic lambda$resolveLink$5(Lcom/facebook/react/bridge/Promise;Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lt4/c;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Lt4/c;->a()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lt4/c;->a()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Lt4/c;->a()Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p2}, Lt4/c;->b()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p2}, Lt4/c;->c()Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-direct {p0, v0, v1, p2}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->dynamicLinkToWritableMap(Ljava/lang/String;ILcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const-string p2, "not-found"

    .line 60
    .line 61
    const-string v0, "Dynamic link not found"

    .line 62
    .line 63
    invoke-static {p1, p2, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p2}, Lz3/l;->k()Ljava/lang/Exception;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string v0, "resolve-link-error"

    .line 76
    .line 77
    invoke-static {p1, v0, p2}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void
.end method


# virtual methods
.method public buildLink(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/dynamiclinks/c;

    invoke-direct {v1, p0, p1}, Lio/invertase/firebase/dynamiclinks/c;-><init>(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    move-result-object p1

    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/dynamiclinks/d;

    invoke-direct {v1, p2}, Lio/invertase/firebase/dynamiclinks/d;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0, v1}, Lz3/l;->b(Ljava/util/concurrent/Executor;Lz3/f;)Lz3/l;

    return-void
.end method

.method public buildShortLink(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/dynamiclinks/f;

    invoke-direct {v1, p0, p1, p2}, Lio/invertase/firebase/dynamiclinks/f;-><init>(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    move-result-object p1

    invoke-virtual {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    new-instance v0, Lio/invertase/firebase/dynamiclinks/g;

    invoke-direct {v0, p3}, Lio/invertase/firebase/dynamiclinks/g;-><init>(Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, p2, v0}, Lz3/l;->b(Ljava/util/concurrent/Executor;Lz3/f;)Lz3/l;

    return-void
.end method

.method public getInitialLink(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->gotInitialLink:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->hostResumed:Z

    if-nez v0, :cond_1

    iput-object p1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialPromise:Lcom/facebook/react/bridge/Promise;

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v1

    const/high16 v2, 0x100000

    and-int/2addr v1, v2

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->launchedFromHistory:Z

    invoke-static {}, Lt4/b;->d()Lt4/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt4/b;->b(Landroid/content/Intent;)Lz3/l;

    move-result-object v0

    new-instance v1, Lio/invertase/firebase/dynamiclinks/b;

    invoke-direct {v1, p0, p1}, Lio/invertase/firebase/dynamiclinks/b;-><init>(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public invalidate()V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-super {p0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->invalidate()V

    return-void
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onHostDestroy()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkUrl:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->gotInitialLink:Z

    iput v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialLinkMinimumVersion:I

    iput-boolean v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->launchedFromHistory:Z

    iput-object v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialPromise:Lcom/facebook/react/bridge/Promise;

    iput-boolean v1, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->hostResumed:Z

    return-void
.end method

.method public onHostPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->hostResumed:Z

    return-void
.end method

.method public onHostResume()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->hostResumed:Z

    iget-object v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialPromise:Lcom/facebook/react/bridge/Promise;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->getInitialLink(Lcom/facebook/react/bridge/Promise;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;->initialPromise:Lcom/facebook/react/bridge/Promise;

    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-static {}, Lt4/b;->d()Lt4/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt4/b;->b(Landroid/content/Intent;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/dynamiclinks/a;

    invoke-direct {v0, p0}, Lio/invertase/firebase/dynamiclinks/a;-><init>(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    return-void
.end method

.method public resolveLink(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    :try_start_0
    invoke-static {}, Lt4/b;->d()Lt4/b;

    move-result-object v0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt4/b;->c(Landroid/net/Uri;)Lz3/l;

    move-result-object p1

    new-instance v0, Lio/invertase/firebase/dynamiclinks/e;

    invoke-direct {v0, p0, p2}, Lio/invertase/firebase/dynamiclinks/e;-><init>(Lio/invertase/firebase/dynamiclinks/ReactNativeFirebaseDynamicLinksModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p1, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "resolve-link-error"

    const-string v0, "Unknown resolve failure"

    invoke-static {p2, p1, v0}, Lio/invertase/firebase/common/ReactNativeFirebaseModule;->rejectPromiseWithCodeAndMessage(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

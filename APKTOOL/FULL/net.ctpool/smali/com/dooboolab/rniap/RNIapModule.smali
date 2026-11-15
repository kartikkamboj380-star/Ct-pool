.class public final Lcom/dooboolab/rniap/RNIapModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements LC0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dooboolab/rniap/RNIapModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNIapModule"
.end annotation


# static fields
.field public static final Companion:Lcom/dooboolab/rniap/RNIapModule$a;

.field private static final PROMISE_BUY_ITEM:Ljava/lang/String; = "PROMISE_BUY_ITEM"

.field public static final TAG:Ljava/lang/String; = "RNIapModule"


# instance fields
.field private billingClientCache:Lcom/android/billingclient/api/b;

.field private final builder:Lcom/android/billingclient/api/b$a;

.field private final googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final skus:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/dooboolab/rniap/RNIapModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/dooboolab/rniap/RNIapModule;->Companion:Lcom/dooboolab/rniap/RNIapModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/b$a;Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleApiAvailability"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule;->builder:Lcom/android/billingclient/api/b$a;

    iput-object p3, p0, Lcom/dooboolab/rniap/RNIapModule;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/dooboolab/rniap/RNIapModule;->skus:Ljava/util/Map;

    new-instance p2, Lcom/dooboolab/rniap/RNIapModule$l;

    invoke-direct {p2, p0}, Lcom/dooboolab/rniap/RNIapModule$l;-><init>(Lcom/dooboolab/rniap/RNIapModule;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/b$a;Lcom/google/android/gms/common/GoogleApiAvailability;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {p1}, Lcom/android/billingclient/api/b;->g(Landroid/content/Context;)Lcom/android/billingclient/api/b$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/billingclient/api/b$a;->b()Lcom/android/billingclient/api/b$a;

    move-result-object p2

    const-string p5, "enablePendingPurchases(...)"

    invoke-static {p2, p5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object p3

    const-string p4, "getInstance(...)"

    invoke-static {p3, p4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/b$a;Lcom/google/android/gms/common/GoogleApiAvailability;)V

    return-void
.end method

.method public static synthetic a(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection$lambda$0(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$consumeItems(Lcom/dooboolab/rniap/RNIapModule;Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule;->consumeItems(Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V

    return-void
.end method

.method public static final synthetic access$getBillingClientCache$p(Lcom/dooboolab/rniap/RNIapModule;)Lcom/android/billingclient/api/b;
    .locals 0

    iget-object p0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    return-object p0
.end method

.method public static final synthetic access$getReactContext$p(Lcom/dooboolab/rniap/RNIapModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    iget-object p0, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getSkus$p(Lcom/dooboolab/rniap/RNIapModule;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/dooboolab/rniap/RNIapModule;->skus:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$isValidResult(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/dooboolab/rniap/RNIapModule;->isValidResult(Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$sendEvent(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public static final synthetic access$setBillingClientCache$p(Lcom/dooboolab/rniap/RNIapModule;Lcom/android/billingclient/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection$lambda$1(Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V

    return-void
.end method

.method private final consumeItems(Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lcom/facebook/react/bridge/Promise;",
            "I)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    new-instance v1, Lcom/dooboolab/rniap/RNIapModule$d;

    invoke-direct {v1, v0, p3, p2}, Lcom/dooboolab/rniap/RNIapModule$d;-><init>(Lcom/android/billingclient/api/Purchase;ILcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p2, v1}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic consumeItems$default(Lcom/dooboolab/rniap/RNIapModule;Ljava/util/List;Lcom/facebook/react/bridge/Promise;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/dooboolab/rniap/RNIapModule;->consumeItems(Ljava/util/List;Lcom/facebook/react/bridge/Promise;I)V

    return-void
.end method

.method private static final ensureConnection$lambda$0(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$promise"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "it"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    array-length v0, p3

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v1

    .line 29
    :goto_0
    xor-int/2addr v0, v2

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    aget-object p3, p3, v1

    .line 33
    .line 34
    instance-of v0, p3, Ljava/lang/Boolean;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    .line 39
    .line 40
    invoke-static {p3, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast p3, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    iget-object p0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->e()Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-ne p3, v2, :cond_1

    .line 60
    .line 61
    invoke-interface {p1, p0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const-string p0, "E_NOT_PREPARED"

    .line 66
    .line 67
    const-string p1, "Unable to auto-initialize connection"

    .line 68
    .line 69
    invoke-static {p2, p0, p1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const-string p0, "E_UNKNOWN"

    .line 74
    .line 75
    const-string p1, "ensureConnection - incorrect parameter in resolve"

    .line 76
    .line 77
    invoke-static {p2, p0, p1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string p0, "RNIapModule"

    .line 81
    .line 82
    const-string p1, "Incorrect parameter in resolve"

    .line 83
    .line 84
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :goto_1
    return-void
.end method

.method private static final ensureConnection$lambda$1(Lcom/facebook/react/bridge/Promise;[Ljava/lang/Object;)V
    .locals 4

    const-string v0, "$promise"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    aget-object v0, p1, v1

    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_0

    aget-object v3, p1, v2

    instance-of v3, v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    aget-object p1, p1, v2

    invoke-static {p1, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    aget-object p1, p1, v1

    instance-of v0, p1, Lcom/facebook/react/bridge/WritableNativeMap;

    if-eqz v0, :cond_2

    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeMap"

    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/facebook/react/bridge/WritableNativeMap;

    const-string v0, "code"

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    move-object p1, v0

    :goto_1
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    invoke-static {p0, v0, p1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const-string p1, "E_UNKNOWN"

    const-string v0, "ensureConnection - incorrect parameter in reject"

    invoke-static {p0, p1, v0}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "RNIapModule"

    const-string p1, "Incorrect parameters in reject"

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method private final isValidResult(Lcom/android/billingclient/api/e;Lcom/facebook/react/bridge/Promise;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RNIapModule"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lcom/dooboolab/rniap/b;->b(Lcom/facebook/react/bridge/Promise;I)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private final sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    const-class v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    invoke-interface {p1, p2, p3}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final sendUnconsumedPurchases(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$m;

    invoke-direct {v0, p1, p0}, Lcom/dooboolab/rniap/RNIapModule$m;-><init>(Lcom/facebook/react/bridge/Promise;Lcom/dooboolab/rniap/RNIapModule;)V

    invoke-virtual {p0, p1, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method


# virtual methods
.method public final acknowledgePurchase(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p2, "token"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/dooboolab/rniap/RNIapModule$b;

    invoke-direct {p2, p1, p0, p3}, Lcom/dooboolab/rniap/RNIapModule$b;-><init>(Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p3, p2}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final addListener(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final buyItemByType(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;ZLcom/facebook/react/bridge/Promise;)V
    .locals 14
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    move-object/from16 v12, p9

    const-string v0, "type"

    move-object v2, p1

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skuArr"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerTokenArr"

    move-object/from16 v4, p7

    invoke-static {v4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {v12, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v11

    if-nez v11, :cond_0

    const-string v0, "E_UNKNOWN"

    const-string v1, "getCurrentActivity returned null"

    invoke-static {v12, v0, v1}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v13, Lcom/dooboolab/rniap/RNIapModule$c;

    move-object v0, v13

    move-object/from16 v1, p9

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p7

    move-object v5, p0

    move/from16 v6, p8

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v0 .. v11}, Lcom/dooboolab/rniap/RNIapModule$c;-><init>(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/dooboolab/rniap/RNIapModule;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    move-object v0, p0

    invoke-virtual {p0, v12, v13}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final consumeProduct(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p2, "token"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LC0/d;->b()LC0/d$a;

    move-result-object p2

    invoke-virtual {p2, p1}, LC0/d$a;->b(Ljava/lang/String;)LC0/d$a;

    move-result-object p1

    invoke-virtual {p1}, LC0/d$a;->a()LC0/d;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/dooboolab/rniap/RNIapModule$e;

    invoke-direct {p2, p1, p0, p3}, Lcom/dooboolab/rniap/RNIapModule$e;-><init>(LC0/d;Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p3, p2}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final endConnection(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/b;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->skus:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Lcom/dooboolab/rniap/c;->a:Lcom/dooboolab/rniap/c;

    invoke-virtual {v0}, Lcom/dooboolab/rniap/c;->b()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void
.end method

.method public final ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/Promise;",
            "Lv5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/android/billingclient/api/b;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/PromiseImpl;

    .line 27
    .line 28
    new-instance v1, Lcom/dooboolab/rniap/e;

    .line 29
    .line 30
    invoke-direct {v1, p0, p2, p1}, Lcom/dooboolab/rniap/e;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lv5/l;Lcom/facebook/react/bridge/Promise;)V

    .line 31
    .line 32
    .line 33
    new-instance p2, Lcom/dooboolab/rniap/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lcom/dooboolab/rniap/f;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, p2}, Lcom/facebook/react/bridge/PromiseImpl;-><init>(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/dooboolab/rniap/RNIapModule;->initConnection(Lcom/facebook/react/bridge/Promise;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final flushFailedPurchasesCachedAsPending(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$f;

    invoke-direct {v0, p0, p1}, Lcom/dooboolab/rniap/RNIapModule$f;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p1, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final getAvailableItemsByType(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$g;

    invoke-direct {v0, p1, p0, p2}, Lcom/dooboolab/rniap/RNIapModule$g;-><init>(Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p2, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final getItemsByType(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skuArr"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$h;

    invoke-direct {v0, p2, p3, p1, p0}, Lcom/dooboolab/rniap/RNIapModule$h;-><init>(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;)V

    invoke-virtual {p0, p3, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNIapModule"

    return-object v0
.end method

.method public final getPackageName(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public final getPurchaseHistoryByType(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$i;

    invoke-direct {v0, p1, p0, p2}, Lcom/dooboolab/rniap/RNIapModule$i;-><init>(Ljava/lang/String;Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p2, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public final initConnection(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    const-string v1, "RNIapModule"

    if-eqz v0, :cond_0

    const-string v0, "Google Play Services are not available on this device"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "E_NOT_PREPARED"

    invoke-static {p1, v1, v0}, Lcom/dooboolab/rniap/d;->b(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/b;->e()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const-string v0, "Already initialized, you should only call initConnection() once when your app starts"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lcom/dooboolab/rniap/d;->d(Lcom/facebook/react/bridge/Promise;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->builder:Lcom/android/billingclient/api/b$a;

    invoke-virtual {v0, p0}, Lcom/android/billingclient/api/b$a;->d(LC0/i;)Lcom/android/billingclient/api/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/b$a;->a()Lcom/android/billingclient/api/b;

    move-result-object v0

    iput-object v0, p0, Lcom/dooboolab/rniap/RNIapModule;->billingClientCache:Lcom/android/billingclient/api/b;

    new-instance v1, Lcom/dooboolab/rniap/RNIapModule$j;

    invoke-direct {v1, p0, p1}, Lcom/dooboolab/rniap/RNIapModule$j;-><init>(Lcom/dooboolab/rniap/RNIapModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/b;->k(LC0/c;)V

    return-void
.end method

.method public final isFeatureSupported(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "feature"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/dooboolab/rniap/RNIapModule$k;

    invoke-direct {v0, p1, p2}, Lcom/dooboolab/rniap/RNIapModule$k;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {p0, p2, v0}, Lcom/dooboolab/rniap/RNIapModule;->ensureConnection(Lcom/facebook/react/bridge/Promise;Lv5/l;)V

    return-void
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/e;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/e;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v0

    const-string v1, "debugMessage"

    const-string v2, "responseCode"

    const-string v3, "PROMISE_BUY_ITEM"

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    invoke-interface {p2, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/dooboolab/rniap/b;->a:Lcom/dooboolab/rniap/b;

    invoke-virtual {p1, v0}, Lcom/dooboolab/rniap/b;->a(I)Lcom/dooboolab/rniap/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/dooboolab/rniap/a;->a()Ljava/lang/String;

    move-result-object v2

    const-string v4, "code"

    invoke-interface {p2, v4, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "message"

    invoke-virtual {v1}, Lcom/dooboolab/rniap/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-string v2, "purchase-error"

    invoke-direct {p0, v1, v2, p2}, Lcom/dooboolab/rniap/RNIapModule;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-virtual {p1, v3, v0}, Lcom/dooboolab/rniap/b;->c(Ljava/lang/String;I)V

    return-void

    :cond_0
    const-string v0, "purchase-updated"

    if-eqz p2, :cond_4

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object p1

    const-string v1, "createArray(...)"

    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->f()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "productId"

    invoke-interface {v2, v5, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v4

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->f()Ljava/util/List;

    move-result-object v5

    const-string v6, "getProducts(...)"

    invoke-static {v5, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v5, "productIds"

    invoke-interface {v2, v5, v4}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v4, "transactionId"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->c()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->h()J

    move-result-wide v4

    long-to-double v4, v4

    const-string v6, "transactionDate"

    invoke-interface {v2, v6, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v4, "transactionReceipt"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "purchaseToken"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->i()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "dataAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "signatureAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->j()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "autoRenewingAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->l()Z

    move-result v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "isAcknowledgedAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->k()Z

    move-result v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "purchaseStateAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->g()I

    move-result v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v4, "packageNameAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "developerPayloadAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->a()Lcom/android/billingclient/api/a;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v4, "obfuscatedAccountIdAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "obfuscatedProfileIdAndroid"

    invoke-virtual {v1}, Lcom/android/billingclient/api/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v4, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-interface {v2}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    iget-object v1, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {p0, v1, v0, v2}, Lcom/dooboolab/rniap/RNIapModule;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto/16 :goto_0

    :cond_3
    sget-object p2, Lcom/dooboolab/rniap/c;->a:Lcom/dooboolab/rniap/c;

    invoke-virtual {p2, v3, p1}, Lcom/dooboolab/rniap/c;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()I

    move-result v4

    invoke-interface {p2, v2, v4}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "extraMessage"

    const-string v1, "The purchases are null. This is a normal behavior if you have requested DEFERRED proration. If not please report an issue."

    invoke-interface {p2, p1, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dooboolab/rniap/RNIapModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {p0, p1, v0, p2}, Lcom/dooboolab/rniap/RNIapModule;->sendEvent(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    sget-object p1, Lcom/dooboolab/rniap/c;->a:Lcom/dooboolab/rniap/c;

    const/4 p2, 0x0

    invoke-virtual {p1, v3, p2}, Lcom/dooboolab/rniap/c;->d(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public final removeListeners(D)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public final startListening(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/dooboolab/rniap/RNIapModule;->sendUnconsumedPurchases(Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.class abstract Lcom/facebook/react/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/util/List;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/O;->c(Ljava/util/List;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method static b(Lcom/facebook/react/M;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not a LazyReactPackage, falling back to old version."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/facebook/react/M;->createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Lcom/facebook/react/N;

    invoke-direct {p1, p0}, Lcom/facebook/react/N;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method private static synthetic c(Ljava/util/List;)Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/O$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/O$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

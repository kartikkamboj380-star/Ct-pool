.class public Lcom/facebook/react/bridge/ReadableNativeMap;
.super Lcom/facebook/react/bridge/NativeMap;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReadableMap;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/ReadableNativeMap$Companion;,
        Lcom/facebook/react/bridge/ReadableNativeMap$WhenMappings;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

.field private static jniPassCounter:I


# instance fields
.field private final keys$delegate:Lkotlin/Lazy;

.field private final localMap$delegate:Lkotlin/Lazy;

.field private final localTypeMap$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReadableNativeMap$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/bridge/ReadableNativeMap;->Companion:Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    invoke-static {}, Lcom/facebook/react/bridge/ReactBridge;->staticInit()V

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/NativeMap;-><init>(Lcom/facebook/jni/HybridData;)V

    sget-object p1, Li5/j;->m:Li5/j;

    new-instance v0, Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;

    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;-><init>(Lcom/facebook/react/bridge/ReadableNativeMap;)V

    invoke-static {p1, v0}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->keys$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/facebook/react/bridge/ReadableNativeMap$localMap$2;

    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/ReadableNativeMap$localMap$2;-><init>(Lcom/facebook/react/bridge/ReadableNativeMap;)V

    invoke-static {p1, v0}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->localMap$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;

    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;-><init>(Lcom/facebook/react/bridge/ReadableNativeMap;)V

    invoke-static {p1, v0}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->localTypeMap$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getCompanion$p()Lcom/facebook/react/bridge/ReadableNativeMap$Companion;
    .locals 1

    sget-object v0, Lcom/facebook/react/bridge/ReadableNativeMap;->Companion:Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    return-object v0
.end method

.method public static final synthetic access$getJniPassCounter$cp()I
    .locals 1

    sget v0, Lcom/facebook/react/bridge/ReadableNativeMap;->jniPassCounter:I

    return v0
.end method

.method public static final synthetic access$getKeys(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getKeys()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$importKeys(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->importKeys()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$importTypes(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->importTypes()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$importValues(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->importValues()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setJniPassCounter$cp(I)V
    .locals 0

    sput p0, Lcom/facebook/react/bridge/ReadableNativeMap;->jniPassCounter:I

    return-void
.end method

.method private final synthetic checkInstance(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ReflectionMethodUse"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    const-string v1, "T"

    invoke-static {v0, v1}, Lw5/k;->j(ILjava/lang/String;)V

    if-nez p2, :cond_2

    new-instance v0, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    const-string p2, "NULL"

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Value for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-object p2
.end method

.method public static final getJNIPassCounter()I
    .locals 1

    sget-object v0, Lcom/facebook/react/bridge/ReadableNativeMap;->Companion:Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReadableNativeMap$Companion;->getJNIPassCounter()I

    move-result v0

    return v0
.end method

.method private final getKeys()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->keys$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private final getLocalMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->localMap$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method private final getLocalTypeMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap;->localTypeMap$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method private final getNullableValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final synthetic getNullableValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getNullableValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 p2, 0x2

    const-string v0, "T"

    invoke-static {p2, v0}, Lw5/k;->j(ILjava/lang/String;)V

    return-object p1
.end method

.method private final getValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "assertNotNull(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/NoSuchKeyException;

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/NoSuchKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final synthetic getValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "T"

    invoke-static {v1, v2}, Lw5/k;->j(ILjava/lang/String;)V

    if-nez v0, :cond_2

    new-instance v1, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "NULL"

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Value for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-object v0
.end method

.method private final native importKeys()[Ljava/lang/String;
.end method

.method private final native importTypes()[Ljava/lang/Object;
.end method

.method private final native importValues()[Ljava/lang/Object;
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/facebook/react/bridge/ReadableNativeMap;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    check-cast p1, Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object p1

    invoke-static {v0, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getNullableValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v0, Lcom/facebook/react/bridge/ReadableArray;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/facebook/react/bridge/ReadableArray;

    if-eqz v1, :cond_2

    :goto_1
    return-object v1

    :cond_2
    new-instance v1, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    const-class v2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_3

    new-instance v2, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    const-string v3, "NULL"

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public getDouble(Ljava/lang/String;)D
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_3

    new-instance v2, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    const-string v3, "NULL"

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/facebook/react/bridge/DynamicFromMap;->create(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/DynamicFromMap;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getEntryIterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getKeys()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->importValues()[Ljava/lang/Object;

    move-result-object v1

    sget v2, Lcom/facebook/react/bridge/ReadableNativeMap;->jniPassCounter:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/facebook/react/bridge/ReadableNativeMap;->jniPassCounter:I

    new-instance v2, Lcom/facebook/react/bridge/ReadableNativeMap$entryIterator$1$1;

    invoke-direct {v2, v0, v1}, Lcom/facebook/react/bridge/ReadableNativeMap$entryIterator$1$1;-><init>([Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Double;

    if-nez v2, :cond_3

    new-instance v2, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    const-string v3, "NULL"

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Long;

    if-nez v2, :cond_3

    new-instance v2, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    const-string v3, "NULL"

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableNativeMap;

    move-result-object p1

    return-object p1
.end method

.method public getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableNativeMap;
    .locals 5

    .line 2
    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getNullableValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v0, Lcom/facebook/react/bridge/ReadableNativeMap;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/facebook/react/bridge/ReadableNativeMap;

    if-eqz v1, :cond_2

    :goto_1
    return-object v1

    :cond_2
    new-instance v1, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    const-class v2, Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getNullableValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v0, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    :goto_1
    return-object v1

    :cond_2
    new-instance v1, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    const-class v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Value for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast from "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalTypeMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReadableType;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/NoSuchKeyException;

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/NoSuchKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hasKey(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isNull(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Lcom/facebook/react/bridge/NoSuchKeyException;

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/NoSuchKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
    .locals 2

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getKeys()[Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;

    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;-><init>([Ljava/lang/String;)V

    return-object v1
.end method

.method public toHashMap()Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getLocalMap()Ljava/util/HashMap;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    :pswitch_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/facebook/react/bridge/ReadableNativeMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v3

    sget-object v4, Lcom/facebook/react/bridge/ReadableNativeMap$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, v2}, Lcom/facebook/react/bridge/ReadableNativeMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v3

    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v2}, Lcom/facebook/react/bridge/ReadableNativeMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableNativeMap;

    move-result-object v3

    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-virtual {v3}, Lcom/facebook/react/bridge/ReadableNativeMap;->toHashMap()Ljava/util/HashMap;

    move-result-object v3

    :goto_1
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

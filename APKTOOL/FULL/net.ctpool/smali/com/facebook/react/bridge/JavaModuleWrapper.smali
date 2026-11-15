.class Lcom/facebook/react/bridge/JavaModuleWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;,
        Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;
    }
.end annotation


# instance fields
.field private final mDescs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private final mJSInstance:Lcom/facebook/react/bridge/JSInstance;

.field private final mMethods:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final mModuleHolder:Lcom/facebook/react/bridge/ModuleHolder;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ModuleHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mJSInstance:Lcom/facebook/react/bridge/JSInstance;

    iput-object p2, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mModuleHolder:Lcom/facebook/react/bridge/ModuleHolder;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mMethods:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mDescs:Ljava/util/ArrayList;

    return-void
.end method

.method private findMethods()V
    .locals 10
    .annotation build LR1/a;
    .end annotation

    const-string v0, "findMethods"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mModuleHolder:Lcom/facebook/react/bridge/ModuleHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v0, v3

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v0, v4

    const-class v6, Lcom/facebook/react/bridge/ReactMethod;

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/bridge/ReactMethod;

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;

    invoke-direct {v8}, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;-><init>()V

    new-instance v9, Lcom/facebook/react/bridge/JavaMethodWrapper;

    invoke-interface {v6}, Lcom/facebook/react/bridge/ReactMethod;->isBlockingSynchronousMethod()Z

    move-result v6

    invoke-direct {v9, p0, v5, v6}, Lcom/facebook/react/bridge/JavaMethodWrapper;-><init>(Lcom/facebook/react/bridge/JavaModuleWrapper;Ljava/lang/reflect/Method;Z)V

    iput-object v7, v8, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;->name:Ljava/lang/String;

    invoke-virtual {v9}, Lcom/facebook/react/bridge/JavaMethodWrapper;->getType()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v8, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;->type:Ljava/lang/String;

    const-string v7, "sync"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v9}, Lcom/facebook/react/bridge/JavaMethodWrapper;->getSignature()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v8, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;->signature:Ljava/lang/String;

    iput-object v5, v8, Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;->method:Ljava/lang/reflect/Method;

    :cond_1
    iget-object v5, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mMethods:Ljava/util/ArrayList;

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mDescs:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void
.end method


# virtual methods
.method public getConstants()Lcom/facebook/react/bridge/NativeMap;
    .locals 5
    .annotation build LR1/a;
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/bridge/JavaModuleWrapper;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaModuleWrapper.getConstants"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v1}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v1

    const-string v4, "moduleName"

    invoke-virtual {v1, v4, v0}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v1

    invoke-virtual {v1}, LP2/b$a;->c()V

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_CONSTANTS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/JavaModuleWrapper;->getModule()Lcom/facebook/react/bridge/BaseJavaModule;

    move-result-object v1

    const-string v4, "module.getConstants"

    invoke-static {v2, v3, v4}, LP2/a;->c(JLjava/lang/String;)V

    invoke-virtual {v1}, Lcom/facebook/react/bridge/BaseJavaModule;->getConstants()Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v3}, LP2/a;->g(J)V

    const-string v4, "create WritableNativeMap"

    invoke-static {v2, v3, v4}, LP2/a;->c(JLjava/lang/String;)V

    sget-object v4, Lcom/facebook/react/bridge/ReactMarkerConstants;->CONVERT_CONSTANTS_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v4, Lcom/facebook/react/bridge/ReactMarkerConstants;->CONVERT_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    invoke-static {v2, v3}, LP2/a;->g(J)V

    sget-object v4, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    invoke-static {v2, v3}, LP2/b;->b(J)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    return-object v1

    :catchall_0
    move-exception v1

    sget-object v4, Lcom/facebook/react/bridge/ReactMarkerConstants;->CONVERT_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    invoke-static {v2, v3}, LP2/a;->g(J)V

    sget-object v4, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_CONSTANTS_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v4, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    invoke-static {v2, v3}, LP2/b;->b(J)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    throw v1
.end method

.method public getMethodDescriptors()Ljava/util/List;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mDescs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/bridge/JavaModuleWrapper;->findMethods()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mDescs:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getModule()Lcom/facebook/react/bridge/BaseJavaModule;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mModuleHolder:Lcom/facebook/react/bridge/ModuleHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/BaseJavaModule;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mModuleHolder:Lcom/facebook/react/bridge/ModuleHolder;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ModuleHolder;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public invoke(ILcom/facebook/react/bridge/ReadableNativeArray;)V
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mMethods:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mMethods:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;

    iget-object v0, p0, Lcom/facebook/react/bridge/JavaModuleWrapper;->mJSInstance:Lcom/facebook/react/bridge/JSInstance;

    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;->invoke(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

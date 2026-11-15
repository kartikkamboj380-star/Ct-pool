.class public Lcom/facebook/react/modules/core/ExceptionsManagerModule;
.super Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;
.source "SourceFile"


# annotations
.annotation runtime Li2/a;
    name = "ExceptionsManager"
.end annotation


# instance fields
.field private final mDevSupportManager:LX1/e;


# direct methods
.method public constructor <init>(LX1/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->mDevSupportManager:LX1/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public dismissRedbox()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->mDevSupportManager:LX1/e;

    invoke-interface {v0}, LX1/e;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->mDevSupportManager:LX1/e;

    invoke-interface {v0}, LX1/e;->o()V

    :cond_0
    return-void
.end method

.method public reportException(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 4

    const-string v0, "message"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const-string v1, "stack"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v1

    :goto_1
    const-string v2, "isFatal"

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {p1}, LE2/a;->a(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    move-result-object p1

    if-nez v2, :cond_4

    invoke-static {v0, v1}, LE2/b;->a(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    const-string v0, "extraData: %s"

    invoke-static {v1, v0, p1}, LP0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void

    :cond_4
    new-instance v2, Lcom/facebook/react/common/JavascriptException;

    invoke-static {v0, v1}, LE2/b;->a(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/react/common/JavascriptException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/facebook/react/common/JavascriptException;->a(Ljava/lang/String;)Lcom/facebook/react/common/JavascriptException;

    move-result-object p1

    throw p1
.end method

.method public reportFatalException(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V
    .locals 1

    double-to-int p3, p3

    new-instance p4, Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-direct {p4}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    const-string v0, "message"

    invoke-virtual {p4, v0, p1}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "stack"

    invoke-virtual {p4, p1, p2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string p1, "id"

    invoke-virtual {p4, p1, p3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    const-string p1, "isFatal"

    const/4 p2, 0x1

    invoke-virtual {p4, p1, p2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p0, p4}, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->reportException(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public reportSoftException(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V
    .locals 1

    double-to-int p3, p3

    new-instance p4, Lcom/facebook/react/bridge/JavaOnlyMap;

    invoke-direct {p4}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    const-string v0, "message"

    invoke-virtual {p4, v0, p1}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "stack"

    invoke-virtual {p4, p1, p2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string p1, "id"

    invoke-virtual {p4, p1, p3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    const-string p1, "isFatal"

    const/4 p2, 0x0

    invoke-virtual {p4, p1, p2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p0, p4}, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->reportException(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public updateExceptionMessage(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V
    .locals 0

    double-to-int p3, p3

    iget-object p4, p0, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->mDevSupportManager:LX1/e;

    invoke-interface {p4}, LX1/e;->n()Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/facebook/react/modules/core/ExceptionsManagerModule;->mDevSupportManager:LX1/e;

    invoke-interface {p4, p1, p2, p3}, LX1/e;->F(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V

    :cond_0
    return-void
.end method

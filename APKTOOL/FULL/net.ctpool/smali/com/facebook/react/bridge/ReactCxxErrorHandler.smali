.class public Lcom/facebook/react/bridge/ReactCxxErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field private static mHandleErrorFunc:Ljava/lang/reflect/Method;

.field private static mObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static handleError(Ljava/lang/String;)V
    .locals 2
    .annotation build LR1/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    sget-object v1, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mObject:Ljava/lang/Object;

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "ReactCxxErrorHandler"

    const-string v1, "Failed to invoke error handler function"

    invoke-static {v0, v1, p0}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public static setHandleErrorFunc(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation build LR1/a;
    .end annotation

    sput-object p0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mObject:Ljava/lang/Object;

    sput-object p1, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    return-void
.end method

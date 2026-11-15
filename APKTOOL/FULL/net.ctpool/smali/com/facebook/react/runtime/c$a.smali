.class Lcom/facebook/react/runtime/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/runtime/ReactHostImpl;

.field private final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/c$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iput-object p2, p0, Lcom/facebook/react/runtime/c$a;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p3, :cond_0

    invoke-static {p3}, Lcom/facebook/react/bridge/Arguments;->fromJavaArgs([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeArray;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    :goto_0
    iget-object p3, p0, Lcom/facebook/react/runtime/c$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    iget-object v0, p0, Lcom/facebook/react/runtime/c$a;->b:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/react/bridge/JavaScriptModuleRegistry;->getJSModuleName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, v0, p2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->Z(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Lu2/f;

    const/4 p1, 0x0

    return-object p1
.end method

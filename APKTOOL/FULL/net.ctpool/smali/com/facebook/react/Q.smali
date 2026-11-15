.class public final synthetic Lcom/facebook/react/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/T$b;


# instance fields
.field public final synthetic a:Lcom/facebook/react/b;

.field public final synthetic b:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/b;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/Q;->a:Lcom/facebook/react/b;

    iput-object p2, p0, Lcom/facebook/react/Q;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public final getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/Q;->a:Lcom/facebook/react/b;

    iget-object v1, p0, Lcom/facebook/react/Q;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0, v1, p1}, Lcom/facebook/react/T;->a(Lcom/facebook/react/b;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

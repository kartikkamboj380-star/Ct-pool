.class Lcom/facebook/react/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic c:Lcom/facebook/react/b;


# direct methods
.method public constructor <init>(Lcom/facebook/react/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/b$b;->c:Lcom/facebook/react/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/b$b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/b$b;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/b$b;->c:Lcom/facebook/react/b;

    iget-object v1, p0, Lcom/facebook/react/b$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/b$b;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/b;->getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/b$b;->a()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    return-object v0
.end method

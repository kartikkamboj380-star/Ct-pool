.class public final synthetic Lcom/facebook/react/modules/network/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/v;


# instance fields
.field public final synthetic a:Lcom/facebook/react/modules/network/NetworkingModule;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/facebook/react/bridge/ReactApplicationContext;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    iput-object p2, p0, Lcom/facebook/react/modules/network/g;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/modules/network/g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    iput p4, p0, Lcom/facebook/react/modules/network/g;->d:I

    return-void
.end method


# virtual methods
.method public final a(LT5/v$a;)LT5/D;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/g;->a:Lcom/facebook/react/modules/network/NetworkingModule;

    iget-object v1, p0, Lcom/facebook/react/modules/network/g;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/modules/network/g;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget v3, p0, Lcom/facebook/react/modules/network/g;->d:I

    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->a(Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;ILT5/v$a;)LT5/D;

    move-result-object p1

    return-object p1
.end method

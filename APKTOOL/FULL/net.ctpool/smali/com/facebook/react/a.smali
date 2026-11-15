.class public final synthetic Lcom/facebook/react/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/b;

.field public final synthetic n:Ljava/util/Iterator;

.field public final synthetic o:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/b;Ljava/util/Iterator;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/a;->m:Lcom/facebook/react/b;

    iput-object p2, p0, Lcom/facebook/react/a;->n:Ljava/util/Iterator;

    iput-object p3, p0, Lcom/facebook/react/a;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/a;->m:Lcom/facebook/react/b;

    iget-object v1, p0, Lcom/facebook/react/a;->n:Ljava/util/Iterator;

    iget-object v2, p0, Lcom/facebook/react/a;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/b;->c(Lcom/facebook/react/b;Ljava/util/Iterator;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

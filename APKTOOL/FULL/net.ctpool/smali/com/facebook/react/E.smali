.class public final synthetic Lcom/facebook/react/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/H;

.field public final synthetic n:[Lcom/facebook/react/z;

.field public final synthetic o:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/E;->m:Lcom/facebook/react/H;

    iput-object p2, p0, Lcom/facebook/react/E;->n:[Lcom/facebook/react/z;

    iput-object p3, p0, Lcom/facebook/react/E;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/E;->m:Lcom/facebook/react/H;

    iget-object v1, p0, Lcom/facebook/react/E;->n:[Lcom/facebook/react/z;

    iget-object v2, p0, Lcom/facebook/react/E;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/H;->f(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

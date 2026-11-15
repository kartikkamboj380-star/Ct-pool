.class Lcom/facebook/react/animated/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/p;->a(Lcom/facebook/react/uimanager/events/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/uimanager/events/d;

.field final synthetic n:Lcom/facebook/react/animated/p;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/p;Lcom/facebook/react/uimanager/events/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/p$a;->n:Lcom/facebook/react/animated/p;

    iput-object p2, p0, Lcom/facebook/react/animated/p$a;->m:Lcom/facebook/react/uimanager/events/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/animated/p$a;->n:Lcom/facebook/react/animated/p;

    iget-object v1, p0, Lcom/facebook/react/animated/p$a;->m:Lcom/facebook/react/uimanager/events/d;

    invoke-static {v0, v1}, Lcom/facebook/react/animated/p;->b(Lcom/facebook/react/animated/p;Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.class Lcom/facebook/react/devsupport/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/d;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lcom/facebook/react/devsupport/d;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/d$a;->n:Lcom/facebook/react/devsupport/d;

    iput-object p2, p0, Lcom/facebook/react/devsupport/d$a;->m:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/d$a;->n:Lcom/facebook/react/devsupport/d;

    iget-object v1, p0, Lcom/facebook/react/devsupport/d$a;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/d;->f(Lcom/facebook/react/devsupport/d;Ljava/lang/String;)V

    return-void
.end method

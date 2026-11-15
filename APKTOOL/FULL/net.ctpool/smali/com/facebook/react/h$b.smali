.class Lcom/facebook/react/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/h;->h(Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lh2/c;

.field final synthetic n:Lh2/a;

.field final synthetic o:Lcom/facebook/react/h;


# direct methods
.method constructor <init>(Lcom/facebook/react/h;Lh2/c;Lh2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/h$b;->o:Lcom/facebook/react/h;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/h$b;->m:Lh2/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/h$b;->n:Lh2/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/h$b;->m:Lh2/c;

    iget-object v1, p0, Lcom/facebook/react/h$b;->n:Lh2/a;

    invoke-virtual {v0, v1}, Lh2/c;->n(Lh2/a;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/h$b;->o:Lcom/facebook/react/h;

    invoke-static {v1}, Lcom/facebook/react/h;->c(Lcom/facebook/react/h;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

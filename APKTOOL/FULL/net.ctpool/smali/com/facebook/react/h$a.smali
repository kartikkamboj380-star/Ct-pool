.class Lcom/facebook/react/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/h;->i(Lh2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh2/a;

.field final synthetic b:Lcom/facebook/react/H;

.field final synthetic c:Lcom/facebook/react/h;


# direct methods
.method constructor <init>(Lcom/facebook/react/h;Lh2/a;Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/h$a;->c:Lcom/facebook/react/h;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/h$a;->a:Lh2/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/h$a;->b:Lcom/facebook/react/H;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/h$a;->c:Lcom/facebook/react/h;

    iget-object v1, p0, Lcom/facebook/react/h$a;->a:Lh2/a;

    invoke-static {v0, p1, v1}, Lcom/facebook/react/h;->d(Lcom/facebook/react/h;Lcom/facebook/react/bridge/ReactContext;Lh2/a;)V

    iget-object p1, p0, Lcom/facebook/react/h$a;->b:Lcom/facebook/react/H;

    invoke-virtual {p1, p0}, Lcom/facebook/react/H;->p0(Lcom/facebook/react/z;)V

    return-void
.end method

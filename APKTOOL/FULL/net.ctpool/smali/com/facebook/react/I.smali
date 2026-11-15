.class public final synthetic Lcom/facebook/react/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/H$c;

.field public final synthetic n:Z

.field public final synthetic o:Ln2/a;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H$c;ZLn2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/I;->m:Lcom/facebook/react/H$c;

    iput-boolean p2, p0, Lcom/facebook/react/I;->n:Z

    iput-object p3, p0, Lcom/facebook/react/I;->o:Ln2/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/I;->m:Lcom/facebook/react/H$c;

    iget-boolean v1, p0, Lcom/facebook/react/I;->n:Z

    iget-object v2, p0, Lcom/facebook/react/I;->o:Ln2/a;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/H$c;->b(Lcom/facebook/react/H$c;ZLn2/a;)V

    return-void
.end method

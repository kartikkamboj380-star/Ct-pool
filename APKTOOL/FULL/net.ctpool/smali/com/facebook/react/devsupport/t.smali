.class public final synthetic Lcom/facebook/react/devsupport/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/devsupport/B;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:[LX1/j;

.field public final synthetic p:I

.field public final synthetic q:LX1/f;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;Ljava/lang/String;[LX1/j;ILX1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/t;->m:Lcom/facebook/react/devsupport/B;

    iput-object p2, p0, Lcom/facebook/react/devsupport/t;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/devsupport/t;->o:[LX1/j;

    iput p4, p0, Lcom/facebook/react/devsupport/t;->p:I

    iput-object p5, p0, Lcom/facebook/react/devsupport/t;->q:LX1/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/t;->m:Lcom/facebook/react/devsupport/B;

    iget-object v1, p0, Lcom/facebook/react/devsupport/t;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/react/devsupport/t;->o:[LX1/j;

    iget v3, p0, Lcom/facebook/react/devsupport/t;->p:I

    iget-object v4, p0, Lcom/facebook/react/devsupport/t;->q:LX1/f;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/devsupport/B;->H(Lcom/facebook/react/devsupport/B;Ljava/lang/String;[LX1/j;ILX1/f;)V

    return-void
.end method

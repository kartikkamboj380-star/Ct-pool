.class public final synthetic Lm2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/modules/core/a;

.field public final synthetic n:Ld2/b;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/core/a;Ld2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/j;->m:Lcom/facebook/react/modules/core/a;

    iput-object p2, p0, Lm2/j;->n:Ld2/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/j;->m:Lcom/facebook/react/modules/core/a;

    iget-object v1, p0, Lm2/j;->n:Ld2/b;

    invoke-static {v0, v1}, Lcom/facebook/react/modules/core/a;->a(Lcom/facebook/react/modules/core/a;Ld2/b;)V

    return-void
.end method

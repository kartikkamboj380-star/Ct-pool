.class public final synthetic Lcom/swmansion/rnscreens/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Z

.field public final synthetic n:Lcom/swmansion/rnscreens/q;


# direct methods
.method public synthetic constructor <init>(ZLcom/swmansion/rnscreens/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/p;->m:Z

    iput-object p2, p0, Lcom/swmansion/rnscreens/p;->n:Lcom/swmansion/rnscreens/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/p;->m:Z

    iget-object v1, p0, Lcom/swmansion/rnscreens/p;->n:Lcom/swmansion/rnscreens/q;

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/q;->s(ZLcom/swmansion/rnscreens/q;)V

    return-void
.end method

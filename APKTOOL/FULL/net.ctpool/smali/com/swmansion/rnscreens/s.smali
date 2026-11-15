.class public final synthetic Lcom/swmansion/rnscreens/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/swmansion/rnscreens/r;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/s;->m:Lcom/swmansion/rnscreens/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/s;->m:Lcom/swmansion/rnscreens/r;

    invoke-static {v0}, Lcom/swmansion/rnscreens/t;->A(Lcom/swmansion/rnscreens/r;)V

    return-void
.end method

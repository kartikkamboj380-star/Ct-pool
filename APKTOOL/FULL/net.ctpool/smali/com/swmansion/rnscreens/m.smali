.class public final synthetic Lcom/swmansion/rnscreens/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/swmansion/rnscreens/n;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/m;->m:Lcom/swmansion/rnscreens/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/m;->m:Lcom/swmansion/rnscreens/n;

    invoke-static {v0}, Lcom/swmansion/rnscreens/n;->a(Lcom/swmansion/rnscreens/n;)V

    return-void
.end method

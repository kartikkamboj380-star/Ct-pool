.class public final synthetic Lcom/swmansion/rnscreens/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic m:Lcom/swmansion/rnscreens/K;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/J;->m:Lcom/swmansion/rnscreens/K;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/J;->m:Lcom/swmansion/rnscreens/K;

    invoke-static {v0, p1}, Lcom/swmansion/rnscreens/K;->s(Lcom/swmansion/rnscreens/K;Landroid/view/View;)V

    return-void
.end method

.class public final synthetic Lcom/swmansion/rnscreens/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/view/Window;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/B;->m:Landroid/view/Window;

    iput p2, p0, Lcom/swmansion/rnscreens/B;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/B;->m:Landroid/view/Window;

    iget v1, p0, Lcom/swmansion/rnscreens/B;->n:I

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/C;->c(Landroid/view/Window;I)V

    return-void
.end method

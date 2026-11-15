.class final Lcom/swmansion/rnscreens/K$c;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/K;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/swmansion/rnscreens/K;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/swmansion/rnscreens/c;)V
    .locals 2

    .line 1
    const-string v0, "newSearchView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    invoke-static {v0}, Lcom/swmansion/rnscreens/K;->u(Lcom/swmansion/rnscreens/K;)Lcom/swmansion/rnscreens/L;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    new-instance v1, Lcom/swmansion/rnscreens/L;

    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/L;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/K;->x(Lcom/swmansion/rnscreens/K;Lcom/swmansion/rnscreens/L;)V

    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    invoke-static {p1}, Lcom/swmansion/rnscreens/K;->y(Lcom/swmansion/rnscreens/K;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->getAutoFocus()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/swmansion/rnscreens/K$c;->m:Lcom/swmansion/rnscreens/K;

    invoke-static {p1}, Lcom/swmansion/rnscreens/K;->t(Lcom/swmansion/rnscreens/K;)Lcom/swmansion/rnscreens/u;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/c;->r0()V

    :cond_1
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/c;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/K$c;->a(Lcom/swmansion/rnscreens/c;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method

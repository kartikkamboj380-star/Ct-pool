.class public Lcom/swmansion/rnscreens/d;
.super Landroidx/appcompat/widget/Toolbar;
.source "SourceFile"


# instance fields
.field private final j0:Lcom/swmansion/rnscreens/x;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/swmansion/rnscreens/x;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/swmansion/rnscreens/d;->j0:Lcom/swmansion/rnscreens/x;

    return-void
.end method


# virtual methods
.method public final getConfig()Lcom/swmansion/rnscreens/x;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/d;->j0:Lcom/swmansion/rnscreens/x;

    return-object v0
.end method

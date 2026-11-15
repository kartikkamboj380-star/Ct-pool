.class public final Lcom/swmansion/rnscreens/c$a;
.super Landroidx/activity/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/c;-><init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/swmansion/rnscreens/c;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/c;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/c$a;->d:Lcom/swmansion/rnscreens/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/activity/h;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/c$a;->d:Lcom/swmansion/rnscreens/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    return-void
.end method

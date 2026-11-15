.class Landroidx/appcompat/app/C$b;
.super Landroidx/core/view/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/C;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/C;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/C$b;->a:Landroidx/appcompat/app/C;

    invoke-direct {p0}, Landroidx/core/view/Q;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/appcompat/app/C$b;->a:Landroidx/appcompat/app/C;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/C;->x:Landroidx/appcompat/view/h;

    iget-object p1, p1, Landroidx/appcompat/app/C;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

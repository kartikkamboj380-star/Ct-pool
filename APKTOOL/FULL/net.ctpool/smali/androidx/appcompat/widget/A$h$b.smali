.class Landroidx/appcompat/widget/A$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/A$h;->n(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroidx/appcompat/widget/A$h;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/A$h;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/A$h$b;->m:Landroidx/appcompat/widget/A$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/A$h$b;->m:Landroidx/appcompat/widget/A$h;

    iget-object v1, v0, Landroidx/appcompat/widget/A$h;->Y:Landroidx/appcompat/widget/A;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/A$h;->U(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/A$h$b;->m:Landroidx/appcompat/widget/A$h;

    invoke-virtual {v0}, Landroidx/appcompat/widget/U;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/A$h$b;->m:Landroidx/appcompat/widget/A$h;

    invoke-virtual {v0}, Landroidx/appcompat/widget/A$h;->S()V

    iget-object v0, p0, Landroidx/appcompat/widget/A$h$b;->m:Landroidx/appcompat/widget/A$h;

    invoke-static {v0}, Landroidx/appcompat/widget/A$h;->R(Landroidx/appcompat/widget/A$h;)V

    :goto_0
    return-void
.end method

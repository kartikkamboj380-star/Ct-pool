.class Landroidx/core/view/U$e;
.super Landroidx/core/view/U$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/core/view/U$d;-><init>()V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/U;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/core/view/U$d;-><init>(Landroidx/core/view/U;)V

    return-void
.end method


# virtual methods
.method c(ILandroidx/core/graphics/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/U$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, Landroidx/core/view/U$n;->a(I)I

    move-result p1

    invoke-virtual {p2}, Landroidx/core/graphics/b;->e()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, Landroidx/core/view/d0;->a(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

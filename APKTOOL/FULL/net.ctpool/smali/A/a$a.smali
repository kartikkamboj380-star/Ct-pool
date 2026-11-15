.class LA/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/core/view/accessibility/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LA/a$a;->b(Landroidx/core/view/accessibility/C;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroidx/core/view/accessibility/C;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/core/view/accessibility/C;->m(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

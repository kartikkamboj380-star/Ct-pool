.class public final Landroidx/core/view/U$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroidx/core/view/U$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/view/U$e;

    invoke-direct {v0}, Landroidx/core/view/U$e;-><init>()V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/view/U$d;

    invoke-direct {v0}, Landroidx/core/view/U$d;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/core/view/U$c;

    invoke-direct {v0}, Landroidx/core/view/U$c;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/core/view/U;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/view/U$e;

    invoke-direct {v0, p1}, Landroidx/core/view/U$e;-><init>(Landroidx/core/view/U;)V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/view/U$d;

    invoke-direct {v0, p1}, Landroidx/core/view/U$d;-><init>(Landroidx/core/view/U;)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/core/view/U$c;

    invoke-direct {v0, p1}, Landroidx/core/view/U$c;-><init>(Landroidx/core/view/U;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()Landroidx/core/view/U;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    invoke-virtual {v0}, Landroidx/core/view/U$f;->b()Landroidx/core/view/U;

    move-result-object v0

    return-object v0
.end method

.method public b(ILandroidx/core/graphics/b;)Landroidx/core/view/U$b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/U$f;->c(ILandroidx/core/graphics/b;)V

    return-object p0
.end method

.method public c(Landroidx/core/graphics/b;)Landroidx/core/view/U$b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    invoke-virtual {v0, p1}, Landroidx/core/view/U$f;->e(Landroidx/core/graphics/b;)V

    return-object p0
.end method

.method public d(Landroidx/core/graphics/b;)Landroidx/core/view/U$b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/U$b;->a:Landroidx/core/view/U$f;

    invoke-virtual {v0, p1}, Landroidx/core/view/U$f;->g(Landroidx/core/graphics/b;)V

    return-object p0
.end method

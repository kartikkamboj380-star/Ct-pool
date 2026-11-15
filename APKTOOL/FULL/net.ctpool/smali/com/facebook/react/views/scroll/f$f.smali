.class final Lcom/facebook/react/views/scroll/f$f;
.super Landroid/widget/OverScroller;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    const/16 p1, 0xfa

    iput p1, p0, Lcom/facebook/react/views/scroll/f$f;->a:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-super {p0, v0, v0, v0, v0}, Landroid/widget/OverScroller;->startScroll(IIII)V

    iget v0, p0, Lcom/facebook/react/views/scroll/f$f;->a:I

    return v0
.end method

.method public startScroll(IIIII)V
    .locals 0

    iput p5, p0, Lcom/facebook/react/views/scroll/f$f;->a:I

    return-void
.end method

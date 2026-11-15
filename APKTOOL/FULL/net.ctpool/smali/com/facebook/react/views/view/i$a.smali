.class final Lcom/facebook/react/views/view/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/view/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final m:Lcom/facebook/react/views/view/i;


# direct methods
.method private constructor <init>(Lcom/facebook/react/views/view/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/view/i$a;->m:Lcom/facebook/react/views/view/i;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/views/view/i;Lcom/facebook/react/views/view/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i$a;-><init>(Lcom/facebook/react/views/view/i;)V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p2, p0, Lcom/facebook/react/views/view/i$a;->m:Lcom/facebook/react/views/view/i;

    invoke-virtual {p2}, Lcom/facebook/react/views/view/i;->getRemoveClippedSubviews()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/facebook/react/views/view/i$a;->m:Lcom/facebook/react/views/view/i;

    invoke-static {p2, p1}, Lcom/facebook/react/views/view/i;->c(Lcom/facebook/react/views/view/i;Landroid/view/View;)V

    :cond_0
    return-void
.end method

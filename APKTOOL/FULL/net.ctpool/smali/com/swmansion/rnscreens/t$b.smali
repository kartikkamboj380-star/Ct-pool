.class final Lcom/swmansion/rnscreens/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/graphics/Canvas;

.field private b:Landroid/view/View;

.field private c:J

.field final synthetic d:Lcom/swmansion/rnscreens/t;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/t;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/t$b;->d:Lcom/swmansion/rnscreens/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t$b;->d:Lcom/swmansion/rnscreens/t;

    invoke-static {v0, p0}, Lcom/swmansion/rnscreens/t;->B(Lcom/swmansion/rnscreens/t;Lcom/swmansion/rnscreens/t$b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/swmansion/rnscreens/t$b;->a:Landroid/graphics/Canvas;

    iput-object v0, p0, Lcom/swmansion/rnscreens/t$b;->b:Landroid/view/View;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/swmansion/rnscreens/t$b;->c:J

    return-void
.end method

.method public final b()Landroid/graphics/Canvas;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t$b;->a:Landroid/graphics/Canvas;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t$b;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/swmansion/rnscreens/t$b;->c:J

    return-wide v0
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/t$b;->a:Landroid/graphics/Canvas;

    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/t$b;->b:Landroid/view/View;

    return-void
.end method

.method public final g(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/swmansion/rnscreens/t$b;->c:J

    return-void
.end method

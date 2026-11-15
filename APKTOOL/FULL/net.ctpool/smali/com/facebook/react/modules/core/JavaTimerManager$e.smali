.class Lcom/facebook/react/modules/core/JavaTimerManager$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:I

.field private d:J


# direct methods
.method private constructor <init>(IJIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->a:I

    iput-wide p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->d:J

    iput p4, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->c:I

    iput-boolean p5, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->b:Z

    return-void
.end method

.method synthetic constructor <init>(IJIZLm2/e;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/modules/core/JavaTimerManager$e;-><init>(IJIZ)V

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->a:I

    return p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->c:I

    return p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/modules/core/JavaTimerManager$e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->b:Z

    return p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/modules/core/JavaTimerManager$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->d:J

    return-wide v0
.end method

.method static bridge synthetic e(Lcom/facebook/react/modules/core/JavaTimerManager$e;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$e;->d:J

    return-void
.end method

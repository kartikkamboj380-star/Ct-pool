.class final Lcom/facebook/react/uimanager/p0$o;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "o"
.end annotation


# instance fields
.field private final c:I

.field final synthetic d:Lcom/facebook/react/uimanager/p0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/p0;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$o;->d:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput p3, p0, Lcom/facebook/react/uimanager/p0$o;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/p0;IILcom/facebook/react/uimanager/v0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/p0$o;-><init>(Lcom/facebook/react/uimanager/p0;II)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$o;->d:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget v2, p0, Lcom/facebook/react/uimanager/p0$o;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/C;->x(II)V
    :try_end_0
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/facebook/react/uimanager/p0;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

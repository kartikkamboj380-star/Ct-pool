.class final Lcom/facebook/react/uimanager/p0$t;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "t"
.end annotation


# instance fields
.field private final c:Lcom/facebook/react/uimanager/W;

.field final synthetic d:Lcom/facebook/react/uimanager/p0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/p0;ILcom/facebook/react/uimanager/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$t;->d:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput-object p3, p0, Lcom/facebook/react/uimanager/p0$t;->c:Lcom/facebook/react/uimanager/W;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/p0;ILcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/x0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/p0$t;-><init>(Lcom/facebook/react/uimanager/p0;ILcom/facebook/react/uimanager/W;)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$t;->d:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget-object v2, p0, Lcom/facebook/react/uimanager/p0$t;->c:Lcom/facebook/react/uimanager/W;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/C;->C(ILcom/facebook/react/uimanager/W;)V

    return-void
.end method

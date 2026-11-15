.class final Lcom/facebook/react/uimanager/p0$k;
.super Lcom/facebook/react/uimanager/p0$v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "k"
.end annotation


# instance fields
.field private final c:[I

.field private final d:[Lcom/facebook/react/uimanager/y0;

.field private final e:[I

.field final synthetic f:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;I[I[Lcom/facebook/react/uimanager/y0;[I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$k;->f:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$v;-><init>(Lcom/facebook/react/uimanager/p0;I)V

    iput-object p3, p0, Lcom/facebook/react/uimanager/p0$k;->c:[I

    iput-object p4, p0, Lcom/facebook/react/uimanager/p0$k;->d:[Lcom/facebook/react/uimanager/y0;

    iput-object p5, p0, Lcom/facebook/react/uimanager/p0$k;->e:[I

    return-void
.end method


# virtual methods
.method public f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$k;->f:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/p0$v;->a:I

    iget-object v2, p0, Lcom/facebook/react/uimanager/p0$k;->c:[I

    iget-object v3, p0, Lcom/facebook/react/uimanager/p0$k;->d:[Lcom/facebook/react/uimanager/y0;

    iget-object v4, p0, Lcom/facebook/react/uimanager/p0$k;->e:[I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/react/uimanager/C;->q(I[I[Lcom/facebook/react/uimanager/y0;[I)V

    return-void
.end method

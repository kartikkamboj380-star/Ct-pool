.class Lcom/facebook/react/uimanager/p0$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/p0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "q"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/uimanager/i0;

.field final synthetic b:Lcom/facebook/react/uimanager/p0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/i0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$q;->b:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/react/uimanager/p0$q;->a:Lcom/facebook/react/uimanager/i0;

    return-void
.end method


# virtual methods
.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$q;->a:Lcom/facebook/react/uimanager/i0;

    iget-object v1, p0, Lcom/facebook/react/uimanager/p0$q;->b:Lcom/facebook/react/uimanager/p0;

    invoke-static {v1}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/i0;->a(Lcom/facebook/react/uimanager/C;)V

    return-void
.end method

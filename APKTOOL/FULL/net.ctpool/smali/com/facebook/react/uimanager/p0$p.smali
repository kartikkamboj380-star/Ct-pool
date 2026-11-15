.class Lcom/facebook/react/uimanager/p0$p;
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
    name = "p"
.end annotation


# instance fields
.field private final a:Z

.field final synthetic b:Lcom/facebook/react/uimanager/p0;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/p0;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/p0$p;->b:Lcom/facebook/react/uimanager/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/facebook/react/uimanager/p0$p;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/uimanager/p0;ZLcom/facebook/react/uimanager/w0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/p0$p;-><init>(Lcom/facebook/react/uimanager/p0;Z)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/p0$p;->b:Lcom/facebook/react/uimanager/p0;

    invoke-static {v0}, Lcom/facebook/react/uimanager/p0;->d(Lcom/facebook/react/uimanager/p0;)Lcom/facebook/react/uimanager/C;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/react/uimanager/p0$p;->a:Z

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/C;->z(Z)V

    return-void
.end method

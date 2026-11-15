.class public final synthetic Lcom/facebook/react/views/modal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/views/modal/f$c;


# instance fields
.field public final synthetic a:Lcom/facebook/react/uimanager/events/e;

.field public final synthetic b:Lcom/facebook/react/uimanager/e0;

.field public final synthetic c:Lcom/facebook/react/views/modal/f;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/modal/c;->a:Lcom/facebook/react/uimanager/events/e;

    iput-object p2, p0, Lcom/facebook/react/views/modal/c;->b:Lcom/facebook/react/uimanager/e0;

    iput-object p3, p0, Lcom/facebook/react/views/modal/c;->c:Lcom/facebook/react/views/modal/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/c;->a:Lcom/facebook/react/uimanager/events/e;

    iget-object v1, p0, Lcom/facebook/react/views/modal/c;->b:Lcom/facebook/react/uimanager/e0;

    iget-object v2, p0, Lcom/facebook/react/views/modal/c;->c:Lcom/facebook/react/views/modal/f;

    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/views/modal/ReactModalHostManager;->b(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V

    return-void
.end method

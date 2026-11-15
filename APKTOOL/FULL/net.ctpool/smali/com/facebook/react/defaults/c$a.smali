.class public final Lcom/facebook/react/defaults/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/H0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/defaults/c;->t()Lcom/facebook/react/bridge/UIManagerProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/defaults/c;


# direct methods
.method constructor <init>(Lcom/facebook/react/defaults/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/defaults/c$a;->a:Lcom/facebook/react/defaults/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/c$a;->a:Lcom/facebook/react/defaults/c;

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/H;->H()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1

    .line 1
    const-string v0, "viewManagerName"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/defaults/c$a;->a:Lcom/facebook/react/defaults/c;

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/H;->y(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p1

    return-object p1
.end method

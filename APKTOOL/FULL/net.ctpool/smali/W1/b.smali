.class public final synthetic LW1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerProvider;


# instance fields
.field public final synthetic a:Lcom/facebook/react/defaults/c;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/defaults/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/b;->a:Lcom/facebook/react/defaults/c;

    return-void
.end method


# virtual methods
.method public final createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/b;->a:Lcom/facebook/react/defaults/c;

    invoke-static {v0, p1}, Lcom/facebook/react/defaults/c;->w(Lcom/facebook/react/defaults/c;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;

    move-result-object p1

    return-object p1
.end method

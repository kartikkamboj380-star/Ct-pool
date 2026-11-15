.class public final synthetic Lcom/facebook/react/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/facebook/react/H$e;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/J;->m:Lcom/facebook/react/H$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/J;->m:Lcom/facebook/react/H$e;

    invoke-static {v0}, Lcom/facebook/react/H$e;->a(Lcom/facebook/react/H$e;)V

    return-void
.end method

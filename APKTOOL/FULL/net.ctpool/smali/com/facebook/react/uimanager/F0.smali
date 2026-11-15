.class public final synthetic Lcom/facebook/react/uimanager/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/uimanager/F0;->m:Ljava/util/List;

    iput p2, p0, Lcom/facebook/react/uimanager/F0;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/F0;->m:Ljava/util/List;

    iget v1, p0, Lcom/facebook/react/uimanager/F0;->n:I

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G0;->a(Ljava/util/List;I)V

    return-void
.end method

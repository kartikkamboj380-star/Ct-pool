.class public final synthetic Lcom/facebook/react/devsupport/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/h;


# instance fields
.field public final synthetic a:Lcom/facebook/react/devsupport/B;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/o;->a:Lcom/facebook/react/devsupport/B;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/o;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->O(Lcom/facebook/react/devsupport/B;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
